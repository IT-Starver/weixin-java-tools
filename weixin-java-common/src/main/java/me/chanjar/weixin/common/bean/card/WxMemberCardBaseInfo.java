package me.chanjar.weixin.common.bean.card;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Joe on 2017/9/8.
 */
public class WxMemberCardBaseInfo implements Serializable {


    /**
     * 文本
     */
    public static final String CODE_TYPE_TEXT = "CODE_TYPE_TEXT";
    /**
     * 一维码
     */
    public static final String CODE_TYPE_BARCODE = "CODE_TYPE_BARCODE";
    /**
     * 二维码
     */
    public static final String CODE_TYPE_QRCODE = "CODE_TYPE_QRCODE";
    /**
     * 仅显示二维码
     */
    public static final String CODE_TYPE_ONLY_QRCODE = "CODE_TYPE_ONLY_QRCODE";
    /**
     * 仅显示一维码
     */
    public static final String CODE_TYPE_ONLY_BARCODE = "CODE_TYPE_ONLY_BARCODE";
    /**
     * 不显示任何码型
     */
    public static final String CODE_TYPE_NONE = "CODE_TYPE_NONE";

    /**
     * <pre>
     * 是
     * string(128)
     * 卡券的商户logo，建议像素为300*300。
     * </pre>
     */
    @SerializedName("logo_url")
    private String logoUrl;

    /**
     * <pre>
     * 是
     * string(16)
     * Code展示类型:
     * "CODE_TYPE_TEXT":文本
     * "CODE_TYPE_BARCODE":一维码
     * "CODE_TYPE_QRCODE":二维码
     * "CODE_TYPE_ONLY_QRCODE":仅显示二维码
     * "CODE_TYPE_ONLY_BARCODE":仅显示一维码
     * "CODE_TYPE_NONE":不显示任何码型
     * </pre>
     */
    @SerializedName("code_type")
    private String codeType;

    /**
     * 否
     * JSON 支付功能结构体，swipe_card结构
     */
    @SerializedName("pay_info")
    private String payInfo;

    /**
     * <pre>
     * 否
     * JSON
     * 刷卡功能结构体，包含is_swipe_card字段
     * </pre>
     */
    @SerializedName("swipe_card")
    private SwipeCard swipeCard;


    /**
     * <pre>
     * 是
     * string
     * 商户名字,字数上限为12个汉字。
     * </pre>
     */
    @SerializedName("brand_name")
    private String brandName;

    /**
     * <pre>
     * 是
     * string
     * 卡券名，字数上限为9个汉字(建议涵盖卡券属性、服务及金额)。
     * </pre>
     */
    @SerializedName("title")
    private String title;

    /**
     * <pre>
     * 是
     * string
     * 券颜色。按色彩规范标注填写Color010-Color100
     * </pre>
     */
    @SerializedName("color")
    private String color;

    /**
     * <pre>
     * 是
     * string
     * 卡券使用提醒，字数上限为16个汉字。
     * </pre>
     */
    @SerializedName("notice")
    private String notice;

    /**
     * <pre>
     * 是
     * string
     * 卡券使用说明，字数上限为1024个汉字。
     * </pre>
     */
    @SerializedName("description")
    private String description;
    /**
     * <pre>
     * 是
     * JSON
     * 商品信息。
     * </pre>
     */
    @SerializedName("sku")
    private Sku sku;

    /**
     * <pre>
     * 否
     * bool
     * 是否自定义Code码。填写true或false，默认为false 通常自有优惠码系统的开发者选择自定义Code码，详情见 是否自定义code
     * </pre>
     */
    @SerializedName("use_custom_code")
    private String useCustomCode;


    /**
     * <pre>
     * 填入该字段后，自定义code卡券方可进行导入code并投放的动作。
     * </pre>
     */
    @SerializedName("get_custom_code_mode")
    private String getCustomCodeMode = "GET_CUSTOM_CODE_MODE_DEPOSIT";
    /**
     * <pre>
     * 否
     * bool
     * 是否指定用户领取，填写true或false。默认为false
     * </pre>
     */
    @SerializedName("bind_openid")
    private String bindOpenid;
    /**
     * <pre>
     * 否
     * string（24）
     * 客服电话
     * </pre>
     */
    @SerializedName("service_phone")
    private String servicePhone;
    /**
     * <pre>
     * 否
     * array
     * 门店位置ID。调用POI门店管理接口获取门店位置ID。
     * </pre>
     */
    @SerializedName("location_id_list")
    private List<Integer> locationIdList;
    /**
     * <pre>
     * 否
     * bool
     * 会员卡是否支持全部门店，填写后商户门店更新时会自动同步至卡券
     * </pre>
     */
    @SerializedName("use_all_locations")
    private String useAllLocations;
    /**
     * <pre>
     * 否
     * string（18）
     * 卡券中部居中的按钮，仅在卡券激活后且可用状态时显示
     * </pre>
     */
    @SerializedName("center_title")
    private String centerTitle;
    /**
     * <pre>
     * 否
     * string（24）
     * 显示在入口下方的提示语，仅在卡券激活后且可用状态时显示
     * </pre>
     */
    @SerializedName("center_sub_title")
    private String centerSubTitle;
    /**
     * <pre>
     * 否
     * string（128）
     * 顶部居中的url，仅在卡券激活后且可用状态时显示
     * </pre>
     */
    @SerializedName("center_url")
    private String centerUrl;
    /**
     * <pre>
     * 否
     * string（15）
     * 自定义跳转外链的入口名字。
     * </pre>
     */
    @SerializedName("custom_url_name")
    private String customUrlName;
    /**
     * <pre>
     * 否
     * string（128）
     * 自定义跳转的URL。
     * </pre>
     */
    @SerializedName("custom_url")
    private String customUrl;
    /**
     * <pre>
     * 否
     * string（18）
     * 显示在入口右侧的提示语。
     * </pre>
     */
    @SerializedName("custom_url_sub_title")
    private String customUrlSubTitle;
    /**
     * <pre>
     * 否
     * string（15）
     * 营销场景的自定义入口名称。
     * </pre>
     */
    @SerializedName("promotion_url_name")
    private String promotionUrlName;
    /**
     * <pre>
     * 否
     * string（128）
     * 入口跳转外链的地址链接。
     * </pre>
     */
    @SerializedName("promotion_url")
    private String promotionUrl;
    /**
     * <pre>
     * 否
     * string（18）
     * 显示在营销入口右侧的提示语。
     * </pre>
     */
    @SerializedName("promotion_url_sub_title")
    private String promotionUrlSubTitle;
    /**
     * <pre>
     * 否
     * int
     * 每人可领券的数量限制，建议会员卡每人限领一张
     * </pre>
     */
    @SerializedName("get_limit")
    private String getLimit;
    /**
     * <pre>
     * 否
     * bool
     * 卡券领取页面是否可分享，默认为true
     * </pre>
     */
    @SerializedName("can_share")
    private String canShare;
    /**
     * <pre>
     * 否
     * bool
     * 卡券是否可转赠,默认为true
     * </pre>
     */
    @SerializedName("can_give_friend")
    private String canGiveFriend;

    /**
     * <pre>
     * 否
     * bool
     * 填写true为用户点击进入会员卡时推送事件，默认为false。详情见进入会员卡事件推送
     * </pre>
     */
    @SerializedName("need_push_on_view")
    private String needPushOnView;

    /**
     * <pre>
     * 是
     * JSON
     * 使用日期，有效期的信息。
     * </pre>
     */
    @SerializedName("date_info")
    private DateInfo dateInfo;


    public DateInfo getDateInfo() {
        return dateInfo;
    }

    public void setDateInfo(DateInfo dateInfo) {
        this.dateInfo = dateInfo;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public String getCodeType() {
        return codeType;
    }

    public void setCodeType(String codeType) {
        this.codeType = codeType;
    }

    public String getPayInfo() {
        return payInfo;
    }

    public void setPayInfo(String payInfo) {
        this.payInfo = payInfo;
    }

    public SwipeCard getSwipeCard() {
        return swipeCard;
    }

    public void setSwipeCard(SwipeCard swipeCard) {
        this.swipeCard = swipeCard;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNotice() {
        return notice;
    }

    public void setNotice(String notice) {
        this.notice = notice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public String getUseCustomCode() {
        return useCustomCode;
    }

    public void setUseCustomCode(String useCustomCode) {
        this.useCustomCode = useCustomCode;
    }

    public String getGetCustomCodeMode() {
        return getCustomCodeMode;
    }

    public void setGetCustomCodeMode(String getCustomCodeMode) {
        this.getCustomCodeMode = getCustomCodeMode;
    }

    public String getBindOpenid() {
        return bindOpenid;
    }

    public void setBindOpenid(String bindOpenid) {
        this.bindOpenid = bindOpenid;
    }

    public String getServicePhone() {
        return servicePhone;
    }

    public void setServicePhone(String servicePhone) {
        this.servicePhone = servicePhone;
    }

    public Sku getSku() {
        return sku;
    }

    public void setSku(Sku sku) {
        this.sku = sku;
    }

    public List<Integer> getLocationIdList() {
        return locationIdList;
    }

    public void setLocationIdList(List<Integer> locationIdList) {
        this.locationIdList = locationIdList;
    }

    public String getUseAllLocations() {
        return useAllLocations;
    }

    public void setUseAllLocations(String useAllLocations) {
        this.useAllLocations = useAllLocations;
    }

    public String getCenterTitle() {
        return centerTitle;
    }

    public void setCenterTitle(String centerTitle) {
        this.centerTitle = centerTitle;
    }

    public String getCenterSubTitle() {
        return centerSubTitle;
    }

    public void setCenterSubTitle(String centerSubTitle) {
        this.centerSubTitle = centerSubTitle;
    }

    public String getCenterUrl() {
        return centerUrl;
    }

    public void setCenterUrl(String centerUrl) {
        this.centerUrl = centerUrl;
    }

    public String getCustomUrlName() {
        return customUrlName;
    }

    public void setCustomUrlName(String customUrlName) {
        this.customUrlName = customUrlName;
    }

    public String getCustomUrl() {
        return customUrl;
    }

    public void setCustomUrl(String customUrl) {
        this.customUrl = customUrl;
    }

    public String getCustomUrlSubTitle() {
        return customUrlSubTitle;
    }

    public void setCustomUrlSubTitle(String customUrlSubTitle) {
        this.customUrlSubTitle = customUrlSubTitle;
    }

    public String getPromotionUrlName() {
        return promotionUrlName;
    }

    public void setPromotionUrlName(String promotionUrlName) {
        this.promotionUrlName = promotionUrlName;
    }

    public String getPromotionUrl() {
        return promotionUrl;
    }

    public void setPromotionUrl(String promotionUrl) {
        this.promotionUrl = promotionUrl;
    }

    public String getPromotionUrlSubTitle() {
        return promotionUrlSubTitle;
    }

    public void setPromotionUrlSubTitle(String promotionUrlSubTitle) {
        this.promotionUrlSubTitle = promotionUrlSubTitle;
    }

    public String getGetLimit() {
        return getLimit;
    }

    public void setGetLimit(String getLimit) {
        this.getLimit = getLimit;
    }

    public String getCanShare() {
        return canShare;
    }

    public void setCanShare(String canShare) {
        this.canShare = canShare;
    }

    public String getCanGiveFriend() {
        return canGiveFriend;
    }

    public void setCanGiveFriend(String canGiveFriend) {
        this.canGiveFriend = canGiveFriend;
    }

    public String getNeedPushOnView() {
        return needPushOnView;
    }

    public void setNeedPushOnView(String needPushOnView) {
        this.needPushOnView = needPushOnView;
    }

    public static class SwipeCard {


        /**
         * <pre>
         * 否
         * bool
         * 是否设置该会员卡支持拉出微信支付刷卡界面
         * </pre>
         */
        @SerializedName("is_swipe_card")
        private String isSwipeCard;

        /**
         * <pre>
         * 否
         * bool
         * 是否设置该会员卡中部的按钮同时支持微信支付刷卡和会员卡二维码
         * </pre>
         */
        @SerializedName("is_pay_and_qrcode")
        private String isPayAndQrcode;

        public String getIsSwipeCard() {
            return isSwipeCard;
        }

        public void setIsSwipeCard(String isSwipeCard) {
            this.isSwipeCard = isSwipeCard;
        }

        public String getIsPayAndQrcode() {
            return isPayAndQrcode;
        }

        public void setIsPayAndQrcode(String isPayAndQrcode) {
            this.isPayAndQrcode = isPayAndQrcode;
        }
    }

    public static class DateInfo {

        /**
         * <pre>
         * 是
         * string
         * 使用时间的类型 支持固定时长有效类型 固定日期有效类型 永久有效类型(DATE_TYPE_PERMANENT)
         * </pre>
         */
        @SerializedName("type")
        private String type;
        /**
         * <pre>
         * 否
         * int
         * type为DATE_TYPE_FIX_TIME_RANGE时专用，表示起用时间。从1970年1月1日00:00:00至起用时间的秒数（东八区时间,UTC+8，单位为秒）
         * </pre>
         */
        @SerializedName("begin_timestamp")
        private Integer beginTimestamp;
        /**
         * <pre>
         * 否
         * int
         * type为DATE_TYPE_FIX_TERM_RANGE时专用，表示结束时间（东八区时间,UTC+8，单位为秒）
         * </pre>
         */
        @SerializedName("end_timestamp")
        private Integer endTimestamp;
        /**
         * <pre>
         * 否
         * int
         * type为DATE_TYPE_FIX_TERM时专用，表示自领取后多少天内有效，领取后当天有效填写0（单位为天）
         * </pre>
         */
        @SerializedName("fixed_term")
        private Integer fixedTerm;
        /**
         * <pre>
         * 否
         * int
         * type为DATE_TYPE_FIX_TERM时专用，表示自领取后多少天开始生效。（单位为天）
         * </pre>
         */
        @SerializedName("fixed_begin_term")
        private Integer fixedBeginTerm;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public Integer getBeginTimestamp() {
            return beginTimestamp;
        }

        public void setBeginTimestamp(Integer beginTimestamp) {
            this.beginTimestamp = beginTimestamp;
        }

        public Integer getEndTimestamp() {
            return endTimestamp;
        }

        public void setEndTimestamp(Integer endTimestamp) {
            this.endTimestamp = endTimestamp;
        }

        public Integer getFixedTerm() {
            return fixedTerm;
        }

        public void setFixedTerm(Integer fixedTerm) {
            this.fixedTerm = fixedTerm;
        }

        public Integer getFixedBeginTerm() {
            return fixedBeginTerm;
        }

        public void setFixedBeginTerm(Integer fixedBeginTerm) {
            this.fixedBeginTerm = fixedBeginTerm;
        }
    }

    public static class Sku {

        /**
         * <pre>
         * 是
         * int
         * 卡券库存的数量，不支持填写0，上限为100000000。
         * </pre>
         */
        @SerializedName("quantity")
        private Integer quantity;

        public Integer getQuantity() {
            return quantity;
        }

        public void setQuantity(Integer quantity) {
            this.quantity = quantity;
        }


    }
}
