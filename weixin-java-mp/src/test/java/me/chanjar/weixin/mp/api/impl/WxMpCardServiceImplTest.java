package me.chanjar.weixin.mp.api.impl;

import com.google.gson.JsonObject;
import com.google.inject.Inject;
import me.chanjar.weixin.common.bean.WxCardApiSignature;
import me.chanjar.weixin.common.bean.card.WxCard;
import me.chanjar.weixin.common.bean.card.WxMemberCard;
import me.chanjar.weixin.common.bean.card.WxMemberCardBaseInfo;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.api.test.ApiTestModule;
import me.chanjar.weixin.mp.bean.result.WxMpCardResult;
import me.chanjar.weixin.mp.bean.result.WxMpQrCodeTicket;
import org.testng.annotations.Guice;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertNotNull;

/**
 * 测试代码仅供参考，未做严格测试，因原接口作者并未提供单元测试代码
 * Created by Binary Wang on 2016/7/27.
 *
 * @author binarywang (https://github.com/binarywang)
 */
@Test
@Guice(modules = ApiTestModule.class)
public class WxMpCardServiceImplTest {

    @Inject
    protected WxMpService wxService;
    private String cardId = "pbjp9v69BALAHJqvLTBRIDpqPmJk";
    private String code = "good";
    private String openid = "abc";

    @Test
    public void testGetCardApiTicket() throws Exception {
        String cardApiTicket = this.wxService.getCardService().getCardApiTicket();
        assertNotNull(cardApiTicket);
        System.out.println(cardApiTicket);
    }

    @Test
    public void testGetCardApiTicketWithParam() throws Exception {
        String cardApiTicket = this.wxService.getCardService().getCardApiTicket(true);
        assertNotNull(cardApiTicket);
        System.out.println(cardApiTicket);
    }

    @Test
    public void testCreateCardApiSignature() throws Exception {
        //app_id, card_id, card_type, code, openid, location_id

        String[] param = {"123", this.cardId, "", this.code, this.openid, ""};
        WxCardApiSignature cardApiSignature = this.wxService.getCardService().createCardApiSignature(param);
        assertNotNull(cardApiSignature);
        System.out.println(cardApiSignature);
    }

    @Test
    public void testDecryptCardCode() throws Exception {
        String encryptCode = "pd0vTUHSHc9tMUCL2gXABcUmINm6yxqJh0y9Phsy63E=";
        String cardCode = this.wxService.getCardService().decryptCardCode(encryptCode);
        assertNotNull(cardCode);
        System.out.println(cardCode);
    }

    @Test
    public void testQueryCardCode() throws Exception {
        WxMpCardResult wxMpCardResult = this.wxService.getCardService().queryCardCode(this.cardId, this.code, false);
        assertNotNull(wxMpCardResult);
        System.out.println(wxMpCardResult);
    }

    @Test
    public void testConsumeCardCode() throws Exception {
        String result = this.wxService.getCardService().consumeCardCode(this.code);
        assertNotNull(result);
        System.out.println(result);
    }

    @Test
    public void testConsumeCardCodeWithCardId() throws Exception {
        String result = this.wxService.getCardService().consumeCardCode(this.code, this.cardId);
        assertNotNull(result);
        System.out.println(result);
    }

    @Test
    public void testMarkCardCode() throws Exception {
        this.wxService.getCardService().markCardCode(this.code, this.cardId, this.openid, true);
        System.out.println("done");
    }

    @Test
    public void testGetCardDetail() throws Exception {
        JsonObject result = this.wxService.getCardService().getCardDetail(this.cardId);
        assertNotNull(result);
        System.out.println(result);
    }

    @Test
    public void testDeleteCard() throws Exception {
        JsonObject result = this.wxService.getCardService().deleteCard("pbjp9vx51iKBPt7rYb0qOnBtPHgY");
        assertNotNull(result);
        result.get("errcode");
        System.out.println(result.toString());
    }

    public void testDeleteUserCard() throws Exception {
        JsonObject result = this.wxService.getCardService().unavailableCard("pbjp9v8_8dsGNgFY9JadRyoFkqdQ", "759968978017");
        assertNotNull(result);
        System.out.println(result.toString());

    }

    public void testScanUserCard()throws Exception{
        WxMpQrCodeTicket ticket = this.wxService.getMemberCardService().qrCodeCreateMemberTicket("pbjp9vxDbqwb034rZyd-CByMWx88", "201701090231", "objp9v-KNVzZTAE-7tCy0H7Yb9A4");
        System.out.println(ticket);
    }

    @Test
    public void testGetCardCreate() throws Exception {
        WxCard wxCard = new WxCard();
        wxCard.setCardType(WxCard.CART_TYPE_MEMBER_CARD);
        WxMemberCard wxMemberCard = new WxMemberCard();
        wxMemberCard.setSupplyBonus(true);
        WxMemberCard.BonusRule bonusRule = new WxMemberCard.BonusRule();

        bonusRule.setCostMoneyUnit(10000);
        bonusRule.setIncreaseBonus(1);
        bonusRule.setMaxIncreaseBonus(100);
        bonusRule.setCostBonusUnit(10);
        bonusRule.setReduceMoney(1);
        wxMemberCard.setBonusRule(bonusRule);
        wxMemberCard.setSupplyBalance(false);
        wxMemberCard.setPrerogative("螳螂科技——用心测试");
        wxMemberCard.setActivateUrl("https://open.weixin.qq.com/connect/oauth2/authorize?appid=wxa1b7724d974ee24d&redirect_uri=http%3A%2F%2Fwx.bjmantis.net&response_type=code&scope=snsapi_base&state=123#wechat_redirect");

//    wxMemberCard.setBackgroundPicUrl("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1504870988510&di=457feeed7b01512cea141dedc49568eb&imgtype=0&src=http%3A%2F%2Fpic33.nipic.com%2F20130918%2F5978971_202903890000_2.jpg");
        WxMemberCardBaseInfo baseInfo = new WxMemberCardBaseInfo();
        baseInfo.setLogoUrl("http://mmbiz.qpic.cn/mmbiz_jpg/zicNf5XQ1YqBtn7mj77vS3HKib3UEkhMQaaTa49VvDaAcvybPHiaAjGjgLTcLg04oM1R3UoBSvZMh9lf56Fj20CQA/0?wx_fmt=jpeg");
        baseInfo.setBrandName("牙医管家");
        baseInfo.setCodeType(WxMemberCardBaseInfo.CODE_TYPE_TEXT);
        baseInfo.setTitle("牙医管家会员卡网页版");
        baseInfo.setColor("Color090");
        baseInfo.setNotice("使用时请向服务员出示此券。");
        baseInfo.setServicePhone("020-88881111");
        baseInfo.setDescription("如遇到其他优惠,不可与其他优惠同享。");
        baseInfo.setUseCustomCode(false);
        WxMemberCardBaseInfo.DateInfo dateInfo = new WxMemberCardBaseInfo.DateInfo();
        dateInfo.setType("DATE_TYPE_PERMANENT");
        baseInfo.setDateInfo(dateInfo);
        baseInfo.setGetLimit(1);
        baseInfo.setPromotionUrl("营销入口1");
        baseInfo.setPromotionUrl("http://www.qq.com");
        baseInfo.setNeedPushOnView(true);
        baseInfo.setCodeType("CODE_TYPE_QRCODE");
        baseInfo.setUseAllLocations(true);
        baseInfo.setCustomUrlName("专属客服");
        baseInfo.setCustomUrl("www.qq.com");
        WxMemberCardBaseInfo.Sku sku = new WxMemberCardBaseInfo.Sku();
        sku.setQuantity(10);
        baseInfo.setSku(sku);
        wxMemberCard.setBaseInfo(baseInfo);

        wxCard.setWxMemberCard(wxMemberCard);

        String result = this.wxService.getCardService().createCard(wxCard);
        assertNotNull(result);
        System.out.println(result);
    }



}
