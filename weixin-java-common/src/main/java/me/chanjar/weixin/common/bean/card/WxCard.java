package me.chanjar.weixin.common.bean.card;

import com.google.gson.annotations.SerializedName;
import me.chanjar.weixin.common.util.json.WxGsonBuilder;

import java.io.Serializable;

/**
 * Created by Joe on 2017/9/8.
 */
public class WxCard implements Serializable {

    public static final String CART_TYPE_MEMBER_CARD="MEMBER_CARD";

    @SerializedName("card_type")
    private String cardType;

    @SerializedName("member_card")
    private WxMemberCard wxMemberCard;

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public WxMemberCard getWxMemberCard() {
        return wxMemberCard;
    }

    public void setWxMemberCard(WxMemberCard wxMemberCard) {
        this.wxMemberCard = wxMemberCard;
    }


    public String toJson() {
        return WxGsonBuilder.create().toJson(this);
    }

//    public static void main(String[] args) {
//        WxCard wxCard = new WxCard();
//        WxMemberCard wxMemberCard = new WxMemberCard();
//        wxCard.setWxMemberCard(wxMemberCard);
//        Gson gson = new Gson();
//        System.out.println(gson.toJson(wxCard));
//    }

}
