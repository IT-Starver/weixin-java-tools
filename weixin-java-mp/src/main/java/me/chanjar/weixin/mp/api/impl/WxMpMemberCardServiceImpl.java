package me.chanjar.weixin.mp.api.impl;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import me.chanjar.weixin.common.bean.result.WxError;
import me.chanjar.weixin.common.exception.WxErrorException;
import me.chanjar.weixin.mp.api.WxMpMemberCardService;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.membercard.WxMpMemberCardActivatedMessage;
import me.chanjar.weixin.mp.bean.membercard.WxMpMemberCardUpdateMessage;
import me.chanjar.weixin.mp.bean.membercard.WxMpMemberCardUpdateResult;
import me.chanjar.weixin.mp.bean.membercard.WxMpMemberCardUserInfoResult;
import me.chanjar.weixin.mp.bean.result.WxMpQrCodeTicket;
import me.chanjar.weixin.mp.util.json.WxMpGsonBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 会员卡相关接口的实现类
 *
 * @author YuJian(mgcnrx11@gmail.com)
 * @version 2017/7/8
 */
public class WxMpMemberCardServiceImpl implements WxMpMemberCardService {

  private final Logger log = LoggerFactory.getLogger(WxMpMemberCardServiceImpl.class);

  private static final String MEMBER_CARD_ACTIVATE = "https://api.weixin.qq.com/card/membercard/activate";
  private static final String MEMBER_CARD_USER_INFO_GET = "https://api.weixin.qq.com/card/membercard/userinfo/get";
  private static final String MEMBER_CARD_UPDATE_USER = "https://api.weixin.qq.com/card/membercard/updateuser";
  private static final String MEMBER_CARD_QRCODE_CREATE = "https://api.weixin.qq.com/card/qrcode/create";


  private WxMpService wxMpService;

  private static final Gson GSON = new Gson();

  WxMpMemberCardServiceImpl(WxMpService wxMpService) {
    this.wxMpService = wxMpService;
  }

  /**
   * 得到WxMpService
   */
  @Override
  public WxMpService getWxMpService() {
    return this.wxMpService;
  }

  /**
   * 会员卡激活接口
   *
   * @param activatedMessage 激活所需参数
   * @return 调用返回的JSON字符串。
   * @throws WxErrorException 接口调用失败抛出的异常
   */
  @Override
  public String activateMemberCard(WxMpMemberCardActivatedMessage activatedMessage) throws WxErrorException {
    return this.wxMpService.post(MEMBER_CARD_ACTIVATE, GSON.toJson(activatedMessage));
  }

  /**
   * 拉取会员信息接口
   *
   * @param cardId 会员卡的CardId，微信分配
   * @param code   领取会员的会员卡Code
   * @return 会员信息的结果对象
   * @throws WxErrorException 接口调用失败抛出的异常
   */
  @Override
  public WxMpMemberCardUserInfoResult getUserInfo(String cardId, String code) throws WxErrorException {
    JsonObject jsonObject = new JsonObject();
    jsonObject.addProperty("card_id", cardId);
    jsonObject.addProperty("code",code);

    String responseContent = this.getWxMpService().post(MEMBER_CARD_USER_INFO_GET, jsonObject.toString());
    JsonElement tmpJsonElement = new JsonParser().parse(responseContent);
    return WxMpGsonBuilder.INSTANCE.create().fromJson(tmpJsonElement,
      new TypeToken<WxMpMemberCardUserInfoResult>() {
      }.getType());
  }

  /**
   * 当会员持卡消费后，支持开发者调用该接口更新会员信息。会员卡交易后的每次信息变更需通过该接口通知微信，便于后续消息通知及其他扩展功能。
   *
   * 1.开发者可以同时传入add_bonus和bonus解决由于同步失败带来的幂等性问题。同时传入add_bonus和bonus时
   * add_bonus作为积分变动消息中的变量值，而bonus作为卡面上的总积分额度显示。余额变动同理。
   * 2.开发者可以传入is_notify_bonus控制特殊的积分对账变动不发送消息，余额变动同理。
   *
   * @param updateUserMessage 更新会员信息所需字段消息
   * @return 调用返回的JSON字符串。
   * @throws WxErrorException 接口调用失败抛出的异常
   */
  @Override
  public WxMpMemberCardUpdateResult updateUserMemberCard(WxMpMemberCardUpdateMessage updateUserMessage)
    throws WxErrorException {

    String responseContent = this.getWxMpService().post(MEMBER_CARD_UPDATE_USER, GSON.toJson(updateUserMessage));

    JsonElement tmpJsonElement = new JsonParser().parse(responseContent);
    return WxMpGsonBuilder.INSTANCE.create().fromJson(tmpJsonElement,
      new TypeToken<WxMpMemberCardUpdateResult>() {
      }.getType());
  }

  @Override
  public WxMpQrCodeTicket qrCodeCreateMemberTicket(String cardId, String code, String openId) throws WxErrorException {
    if (cardId == null || code == null || openId == null) {
      throw new WxErrorException(WxError.newBuilder().setErrorCode(-1).setErrorMsg("创建会员卡关键信息为空。").build());
    }

    JsonObject json = new JsonObject();
    json.addProperty("action_name", "QR_CARD");
    json.addProperty("expire_seconds", 1800);
    JsonObject actionInfo = new JsonObject();
    json.add("action_info", actionInfo);
    JsonObject card = new JsonObject();
    actionInfo.add("card", card);
    card.addProperty("card_id", cardId);
    card.addProperty("code", code);
    card.addProperty("openid", openId);
    card.addProperty("is_unique_code", false);
    card.addProperty("outer_str", code);
    String responseContent = this.wxMpService.post(MEMBER_CARD_QRCODE_CREATE, json.toString());
    return WxMpQrCodeTicket.fromJson(responseContent);
  }

//  public static void main(String[] args) {
//    JsonObject json = new JsonObject();
//    json.addProperty("action_name", "QR_CARD");
//    json.addProperty("expire_seconds", 1800);
//    JsonObject actionInfo = new JsonObject();
//    json.add("action_info", actionInfo);
//    JsonObject card = new JsonObject();
//    actionInfo.add("card", card);
//    card.addProperty("card_id", "pFS7Fjg8kV1IdDz01r4SQwMkuCKc");
//    card.addProperty("code", "198374613512");
//    card.addProperty("openid", "oFS7Fjl0WsZ9AMZqrI80nbIq8xrA");
//    card.addProperty("is_unique_code", false);
//    System.out.println(json.toString());
//  }
}
