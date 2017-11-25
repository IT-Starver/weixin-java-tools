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
    private Boolean useCustomCode = false;


    /**
     * <pre>
     * 填入该字段后，自定义code卡券方可进行导入code并投放的动作。
     * </pre>
     */
    @SerializedName("get_custom_code_mode")
    private String getCustomCodeMode;
    /**
     * <pre>
     * 否
     * bool
     * 是否指定用户领取，填写true或false。默认为false
     * </pre>
     */
    @SerializedName("bind_openid")
    private Boolean bindOpenid;
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
    private Boolean useAllLocations;
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
    private Integer getLimit;
    /**
     * <pre>
     * 否
     * bool
     * 卡券领取页面是否可分享，默认为true
     * </pre>
     */
    @SerializedName("can_share")
    private Boolean canShare;
    /**
     * <pre>
     * 否
     * bool
     * 卡券是否可转赠,默认为true
     * </pre>
     */
    @SerializedName("can_give_friend")
    private Boolean canGiveFriend;

    /**
     * <pre>
     * 否
     * bool
     * 填写true为用户点击进入会员卡时推送事件，默认为false。详情见进入会员卡事件推送
     * </pre>
     */
    @SerializedName("need_push_on_view")
    private Boolean needPushOnView;

    /**
     * <pre>
     * 是
     * JSON
     * 使用日期，有效期的信息。
     * </pre>
     */
    @SerializedName("date_info")
    private DateInfo dateInfo;

    /**
     * <pre>
     * 是
     * string(128)
     * 卡券的商户logo，建议像素为300*300。
     * </pre>
     */
    public String getLogoUrl() {
        return this.logoUrl;
    }

    /**
     * <pre>
     * 是
     * string(128)
     * 卡券的商户logo，建议像素为300*300。
     * </pre>
     */
    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

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
    public String getCodeType() {
        return this.codeType;
    }

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
    public void setCodeType(String codeType) {
        this.codeType = codeType;
    }

    /**
     * 否
     * JSON 支付功能结构体，swipe_card结构
     */
    public String getPayInfo() {
        return this.payInfo;
    }

    /**
     * 否
     * JSON 支付功能结构体，swipe_card结构
     */
    public void setPayInfo(String payInfo) {
        this.payInfo = payInfo;
    }

    /**
     * <pre>
     * 否
     * JSON
     * 刷卡功能结构体，包含is_swipe_card字段
     * </pre>
     */
    public SwipeCard getSwipeCard() {
        return this.swipeCard;
    }

    /**
     * <pre>
     * 否
     * JSON
     * 刷卡功能结构体，包含is_swipe_card字段
     * </pre>
     */
    public void setSwipeCard(SwipeCard swipeCard) {
        this.swipeCard = swipeCard;
    }

    /**
     * <pre>
     * 是
     * string
     * 商户名字,字数上限为12个汉字。
     * </pre>
     */
    public String getBrandName() {
        return this.brandName;
    }

    /**
     * <pre>
     * 是
     * string
     * 商户名字,字数上限为12个汉字。
     * </pre>
     */
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    /**
     * <pre>
     * 是
     * string
     * 卡券名，字数上限为9个汉字(建议涵盖卡券属性、服务及金额)。
     * </pre>
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * <pre>
     * 是
     * string
     * 卡券名，字数上限为9个汉字(建议涵盖卡券属性、服务及金额)。
     * </pre>
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <pre>
     * 是
     * string
     * 券颜色。按色彩规范标注填写Color010-Color100
     * </pre>
     */
    public String getColor() {
        return this.color;
    }

    /**
     * <pre>
     * 是
     * string
     * 券颜色。按色彩规范标注填写Color010-Color100
     * </pre>
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * <pre>
     * 是
     * string
     * 卡券使用提醒，字数上限为16个汉字。
     * </pre>
     */
    public String getNotice() {
        return this.notice;
    }

    /**
     * <pre>
     * 是
     * string
     * 卡券使用提醒，字数上限为16个汉字。
     * </pre>
     */
    public void setNotice(String notice) {
        this.notice = notice;
    }

    /**
     * <pre>
     * 是
     * string
     * 卡券使用说明，字数上限为1024个汉字。
     * </pre>
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * <pre>
     * 是
     * string
     * 卡券使用说明，字数上限为1024个汉字。
     * </pre>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <pre>
     * 是
     * JSON
     * 商品信息。
     * </pre>
     */
    public Sku getSku() {
        return this.sku;
    }

    /**
     * <pre>
     * 是
     * JSON
     * 商品信息。
     * </pre>
     */
    public void setSku(Sku sku) {
        this.sku = sku;
    }

    /**
     * <pre>
     * 否
     * bool
     * 是否自定义Code码。填写true或false，默认为false 通常自有优惠码系统的开发者选择自定义Code码，详情见 是否自定义code
     * </pre>
     */
    public Boolean getUseCustomCode() {
        return this.useCustomCode;
    }

    /**
     * <pre>
     * 否
     * bool
     * 是否自定义Code码。填写true或false，默认为false 通常自有优惠码系统的开发者选择自定义Code码，详情见 是否自定义code
     * </pre>
     */
    public void setUseCustomCode(Boolean useCustomCode) {
        this.useCustomCode = useCustomCode;
    }

    /**
     * <pre>
     * 填入该字段后，自定义code卡券方可进行导入code并投放的动作。
     * </pre>
     */
    public String getGetCustomCodeMode() {
        return this.getCustomCodeMode;
    }

    /**
     * <pre>
     * 填入该字段后，自定义code卡券方可进行导入code并投放的动作。
     * </pre>
     */
    public void setGetCustomCodeMode(String getCustomCodeMode) {
        this.getCustomCodeMode = getCustomCodeMode;
    }

    /**
     * <pre>
     * 否
     * bool
     * 是否指定用户领取，填写true或false。默认为false
     * </pre>
     */
    public Boolean getBindOpenid() {
        return this.bindOpenid;
    }

    /**
     * <pre>
     * 否
     * bool
     * 是否指定用户领取，填写true或false。默认为false
     * </pre>
     */
    public void setBindOpenid(Boolean bindOpenid) {
        this.bindOpenid = bindOpenid;
    }

    /**
     * <pre>
     * 否
     * string（24）
     * 客服电话
     * </pre>
     */
    public String getServicePhone() {
        return this.servicePhone;
    }

    /**
     * <pre>
     * 否
     * string（24）
     * 客服电话
     * </pre>
     */
    public void setServicePhone(String servicePhone) {
        this.servicePhone = servicePhone;
    }

    /**
     * <pre>
     * 否
     * array
     * 门店位置ID。调用POI门店管理接口获取门店位置ID。
     * </pre>
     */
    public List<Integer> getLocationIdList() {
        return this.locationIdList;
    }

    /**
     * <pre>
     * 否
     * array
     * 门店位置ID。调用POI门店管理接口获取门店位置ID。
     * </pre>
     */
    public void setLocationIdList(List<Integer> locationIdList) {
        this.locationIdList = locationIdList;
    }

    /**
     * <pre>
     * 否
     * bool
     * 会员卡是否支持全部门店，填写后商户门店更新时会自动同步至卡券
     * </pre>
     */
    public Boolean getUseAllLocations() {
        return this.useAllLocations;
    }

    /**
     * <pre>
     * 否
     * bool
     * 会员卡是否支持全部门店，填写后商户门店更新时会自动同步至卡券
     * </pre>
     */
    public void setUseAllLocations(Boolean useAllLocations) {
        this.useAllLocations = useAllLocations;
    }

    /**
     * <pre>
     * 否
     * string（18）
     * 卡券中部居中的按钮，仅在卡券激活后且可用状态时显示
     * </pre>
     */
    public String getCenterTitle() {
        return this.centerTitle;
    }

    /**
     * <pre>
     * 否
     * string（18）
     * 卡券中部居中的按钮，仅在卡券激活后且可用状态时显示
     * </pre>
     */
    public void setCenterTitle(String centerTitle) {
        this.centerTitle = centerTitle;
    }

    /**
     * <pre>
     * 否
     * string（24）
     * 显示在入口下方的提示语，仅在卡券激活后且可用状态时显示
     * </pre>
     */
    public String getCenterSubTitle() {
        return this.centerSubTitle;
    }

    /**
     * <pre>
     * 否
     * string（24）
     * 显示在入口下方的提示语，仅在卡券激活后且可用状态时显示
     * </pre>
     */
    public void setCenterSubTitle(String centerSubTitle) {
        this.centerSubTitle = centerSubTitle;
    }

    /**
     * <pre>
     * 否
     * string（128）
     * 顶部居中的url，仅在卡券激活后且可用状态时显示
     * </pre>
     */
    public String getCenterUrl() {
        return this.centerUrl;
    }

    /**
     * <pre>
     * 否
     * string（128）
     * 顶部居中的url，仅在卡券激活后且可用状态时显示
     * </pre>
     */
    public void setCenterUrl(String centerUrl) {
        this.centerUrl = centerUrl;
    }

    /**
     * <pre>
     * 否
     * string（15）
     * 自定义跳转外链的入口名字。
     * </pre>
     */
    public String getCustomUrlName() {
        return this.customUrlName;
    }

    /**
     * <pre>
     * 否
     * string（15）
     * 自定义跳转外链的入口名字。
     * </pre>
     */
    public void setCustomUrlName(String customUrlName) {
        this.customUrlName = customUrlName;
    }

    /**
     * <pre>
     * 否
     * string（128）
     * 自定义跳转的URL。
     * </pre>
     */
    public String getCustomUrl() {
        return this.customUrl;
    }

    /**
     * <pre>
     * 否
     * string（128）
     * 自定义跳转的URL。
     * </pre>
     */
    public void setCustomUrl(String customUrl) {
        this.customUrl = customUrl;
    }

    /**
     * <pre>
     * 否
     * string（18）
     * 显示在入口右侧的提示语。
     * </pre>
     */
    public String getCustomUrlSubTitle() {
        return this.customUrlSubTitle;
    }

    /**
     * <pre>
     * 否
     * string（18）
     * 显示在入口右侧的提示语。
     * </pre>
     */
    public void setCustomUrlSubTitle(String customUrlSubTitle) {
        this.customUrlSubTitle = customUrlSubTitle;
    }

    /**
     * <pre>
     * 否
     * string（15）
     * 营销场景的自定义入口名称。
     * </pre>
     */
    public String getPromotionUrlName() {
        return this.promotionUrlName;
    }

    /**
     * <pre>
     * 否
     * string（15）
     * 营销场景的自定义入口名称。
     * </pre>
     */
    public void setPromotionUrlName(String promotionUrlName) {
        this.promotionUrlName = promotionUrlName;
    }

    /**
     * <pre>
     * 否
     * string（128）
     * 入口跳转外链的地址链接。
     * </pre>
     */
    public String getPromotionUrl() {
        return this.promotionUrl;
    }

    /**
     * <pre>
     * 否
     * string（128）
     * 入口跳转外链的地址链接。
     * </pre>
     */
    public void setPromotionUrl(String promotionUrl) {
        this.promotionUrl = promotionUrl;
    }

    /**
     * <pre>
     * 否
     * string（18）
     * 显示在营销入口右侧的提示语。
     * </pre>
     */
    public String getPromotionUrlSubTitle() {
        return this.promotionUrlSubTitle;
    }

    /**
     * <pre>
     * 否
     * string（18）
     * 显示在营销入口右侧的提示语。
     * </pre>
     */
    public void setPromotionUrlSubTitle(String promotionUrlSubTitle) {
        this.promotionUrlSubTitle = promotionUrlSubTitle;
    }

    /**
     * <pre>
     * 否
     * int
     * 每人可领券的数量限制，建议会员卡每人限领一张
     * </pre>
     */
    public Integer getGetLimit() {
        return this.getLimit;
    }

    /**
     * <pre>
     * 否
     * int
     * 每人可领券的数量限制，建议会员卡每人限领一张
     * </pre>
     */
    public void setGetLimit(Integer getLimit) {
        this.getLimit = getLimit;
    }

    /**
     * <pre>
     * 否
     * bool
     * 卡券领取页面是否可分享，默认为true
     * </pre>
     */
    public Boolean getCanShare() {
        return this.canShare;
    }

    /**
     * <pre>
     * 否
     * bool
     * 卡券领取页面是否可分享，默认为true
     * </pre>
     */
    public void setCanShare(Boolean canShare) {
        this.canShare = canShare;
    }

    /**
     * <pre>
     * 否
     * bool
     * 卡券是否可转赠,默认为true
     * </pre>
     */
    public Boolean getCanGiveFriend() {
        return this.canGiveFriend;
    }

    /**
     * <pre>
     * 否
     * bool
     * 卡券是否可转赠,默认为true
     * </pre>
     */
    public void setCanGiveFriend(Boolean canGiveFriend) {
        this.canGiveFriend = canGiveFriend;
    }

    /**
     * <pre>
     * 否
     * bool
     * 填写true为用户点击进入会员卡时推送事件，默认为false。详情见进入会员卡事件推送
     * </pre>
     */
    public Boolean getNeedPushOnView() {
        return this.needPushOnView;
    }

    /**
     * <pre>
     * 否
     * bool
     * 填写true为用户点击进入会员卡时推送事件，默认为false。详情见进入会员卡事件推送
     * </pre>
     */
    public void setNeedPushOnView(Boolean needPushOnView) {
        this.needPushOnView = needPushOnView;
    }

    /**
     * <pre>
     * 是
     * JSON
     * 使用日期，有效期的信息。
     * </pre>
     */
    public DateInfo getDateInfo() {
        return this.dateInfo;
    }

    /**
     * <pre>
     * 是
     * JSON
     * 使用日期，有效期的信息。
     * </pre>
     */
    public void setDateInfo(DateInfo dateInfo) {
        this.dateInfo = dateInfo;
    }


    public static class SwipeCard implements Serializable {


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


        /**
         * <pre>
         * 否
         * bool
         * 是否设置该会员卡支持拉出微信支付刷卡界面
         * </pre>
         */
        public String getIsSwipeCard() {
            return this.isSwipeCard;
        }

        /**
         * <pre>
         * 否
         * bool
         * 是否设置该会员卡支持拉出微信支付刷卡界面
         * </pre>
         */
        public void setIsSwipeCard(String isSwipeCard) {
            this.isSwipeCard = isSwipeCard;
        }

        /**
         * <pre>
         * 否
         * bool
         * 是否设置该会员卡中部的按钮同时支持微信支付刷卡和会员卡二维码
         * </pre>
         */
        public String getIsPayAndQrcode() {
            return this.isPayAndQrcode;
        }

        /**
         * <pre>
         * 否
         * bool
         * 是否设置该会员卡中部的按钮同时支持微信支付刷卡和会员卡二维码
         * </pre>
         */
        public void setIsPayAndQrcode(String isPayAndQrcode) {
            this.isPayAndQrcode = isPayAndQrcode;
        }
    }

    public static class DateInfo implements Serializable {

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


        /**
         * <pre>
         * 是
         * string
         * 使用时间的类型 支持固定时长有效类型 固定日期有效类型 永久有效类型(DATE_TYPE_PERMANENT)
         * </pre>
         */
        public String getType() {
            return this.type;
        }

        /**
         * <pre>
         * 是
         * string
         * 使用时间的类型 支持固定时长有效类型 固定日期有效类型 永久有效类型(DATE_TYPE_PERMANENT)
         * </pre>
         */
        public void setType(String type) {
            this.type = type;
        }

        /**
         * <pre>
         * 否
         * int
         * type为DATE_TYPE_FIX_TIME_RANGE时专用，表示起用时间。从1970年1月1日00:00:00至起用时间的秒数（东八区时间,UTC+8，单位为秒）
         * </pre>
         */
        public Integer getBeginTimestamp() {
            return this.beginTimestamp;
        }

        /**
         * <pre>
         * 否
         * int
         * type为DATE_TYPE_FIX_TIME_RANGE时专用，表示起用时间。从1970年1月1日00:00:00至起用时间的秒数（东八区时间,UTC+8，单位为秒）
         * </pre>
         */
        public void setBeginTimestamp(Integer beginTimestamp) {
            this.beginTimestamp = beginTimestamp;
        }

        /**
         * <pre>
         * 否
         * int
         * type为DATE_TYPE_FIX_TERM_RANGE时专用，表示结束时间（东八区时间,UTC+8，单位为秒）
         * </pre>
         */
        public Integer getEndTimestamp() {
            return this.endTimestamp;
        }

        /**
         * <pre>
         * 否
         * int
         * type为DATE_TYPE_FIX_TERM_RANGE时专用，表示结束时间（东八区时间,UTC+8，单位为秒）
         * </pre>
         */
        public void setEndTimestamp(Integer endTimestamp) {
            this.endTimestamp = endTimestamp;
        }

        /**
         * <pre>
         * 否
         * int
         * type为DATE_TYPE_FIX_TERM时专用，表示自领取后多少天内有效，领取后当天有效填写0（单位为天）
         * </pre>
         */
        public Integer getFixedTerm() {
            return this.fixedTerm;
        }

        /**
         * <pre>
         * 否
         * int
         * type为DATE_TYPE_FIX_TERM时专用，表示自领取后多少天内有效，领取后当天有效填写0（单位为天）
         * </pre>
         */
        public void setFixedTerm(Integer fixedTerm) {
            this.fixedTerm = fixedTerm;
        }

        /**
         * <pre>
         * 否
         * int
         * type为DATE_TYPE_FIX_TERM时专用，表示自领取后多少天开始生效。（单位为天）
         * </pre>
         */
        public Integer getFixedBeginTerm() {
            return this.fixedBeginTerm;
        }

        /**
         * <pre>
         * 否
         * int
         * type为DATE_TYPE_FIX_TERM时专用，表示自领取后多少天开始生效。（单位为天）
         * </pre>
         */
        public void setFixedBeginTerm(Integer fixedBeginTerm) {
            this.fixedBeginTerm = fixedBeginTerm;
        }
    }

    public static class Sku implements Serializable {

        /**
         * <pre>
         * 是
         * int
         * 卡券库存的数量，不支持填写0，上限为100000000。
         * </pre>
         */
        @SerializedName("quantity")
        private Integer quantity;


        /**
         * <pre>
         * 是
         * int
         * 卡券库存的数量，不支持填写0，上限为100000000。
         * </pre>
         */
        public Integer getQuantity() {
            return this.quantity;
        }

        /**
         * <pre>
         * 是
         * int
         * 卡券库存的数量，不支持填写0，上限为100000000。
         * </pre>
         */
        public void setQuantity(Integer quantity) {
            this.quantity = quantity;
        }
    }
}
