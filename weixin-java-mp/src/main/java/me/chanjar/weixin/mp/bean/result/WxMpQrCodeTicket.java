package me.chanjar.weixin.mp.bean.result;

import com.google.gson.annotations.SerializedName;
import me.chanjar.weixin.mp.util.json.WxMpGsonBuilder;

import java.io.Serializable;

/**
 * 换取二维码的Ticket
 *
 * @author chanjarster
 */
public class WxMpQrCodeTicket implements Serializable {
  private static final long serialVersionUID = 5777119669111011584L;

  protected String ticket;

  @SerializedName("expire_seconds")
  protected int expireSeconds = 1;

  protected String url;

  @SerializedName("errcode")
  private String errCode;

  @SerializedName("errmsg")
  private String errMsg;

  @SerializedName("show_qrcode_url")
  private String showQrcodeUrl;

  public static WxMpQrCodeTicket fromJson(String json) {
    return WxMpGsonBuilder.INSTANCE.create().fromJson(json, WxMpQrCodeTicket.class);
  }

  public String getTicket() {
    return this.ticket;
  }

  public void setTicket(String ticket) {
    this.ticket = ticket;
  }

  /**
   * 如果返回1说明是永久
   */
  public int getExpireSeconds() {
    return this.expireSeconds;
  }

  public void setExpireSeconds(int expireSeconds) {
    this.expireSeconds = expireSeconds;
  }

  public String getUrl() {
    return this.url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public static long getSerialVersionUID() {
    return serialVersionUID;
  }

  public String getErrCode() {
    return errCode;
  }

  public void setErrCode(String errCode) {
    this.errCode = errCode;
  }

  public String getErrMsg() {
    return errMsg;
  }

  public void setErrMsg(String errMsg) {
    this.errMsg = errMsg;
  }

  public String getShowQrcodeUrl() {
    return showQrcodeUrl;
  }

  public void setShowQrcodeUrl(String showQrcodeUrl) {
    this.showQrcodeUrl = showQrcodeUrl;
  }

  @Override
  public String toString() {
    return WxMpGsonBuilder.INSTANCE.create().toJson(this);
  }
}
