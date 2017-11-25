package me.chanjar.weixin.common.bean.card;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Joe on 2017/9/8.
 */
public class WxMemberCardAdvancedInfo implements Serializable {


    public static final String BIZ_SERVICE_DELIVER = "BIZ_SERVICE_DELIVER";
    public static final String BIZ_SERVICE_FREE_PARK = "BIZ_SERVICE_FREE_PARK";
    public static final String BIZ_SERVICE_WITH_PET = "BIZ_SERVICE_WITH_PET";
    public static final String BIZ_SERVICE_FREE_WIFI = "BIZ_SERVICE_FREE_WIFI";


    /**
     * 否	JSON结构
     * 使用门槛（条件）字段，若不填写使用条件则在券面拼写 ：无最低消费限制，全场通用，不限品类；并在使用说明显示： 可与其他优惠共享
     */
    @SerializedName("use_condition")
    private UseCondition useCondition;

    /**
     * 否	JSON结构
     * 封面摘要结构体名称
     */
    @SerializedName("abstract")
    private AbstractObj abstractObj;

    /**
     * 否	JSON结构
     * 图文列表，显示在详情内页 ，优惠券券开发者须至少传入一组图文列表
     */
    @SerializedName("text_image_list")
    private List<TextImage> textImageList;


    /**
     * 否	arry
     * 商家服务类型：
     * BIZ_SERVICE_DELIVER 外卖服务；
     * BIZ_SERVICE_FREE_PARK 停车位；
     * BIZ_SERVICE_WITH_PET 可带宠物；
     * BIZ_SERVICE_FREE_WIFI 免费wifi，
     * 可多选
     */
    @SerializedName("business_service")
    private List<String> businessService;

    /**
     * 否	JSON结构	使用时段限制，包含以下字段
     */
    @SerializedName("time_limit")
    private List<TimeLimit> timeLimitList;

    /**
     * 获取 使用门槛（条件）字段，若不填写使用条件则在券面拼写 ：无最低消费限制，全场通用，不限品类；并在使用说明显示： 可与其他优惠共享
     */
    public UseCondition getUseCondition() {
        return this.useCondition;
    }

    /**
     * 设置 使用门槛（条件）字段，若不填写使用条件则在券面拼写 ：无最低消费限制，全场通用，不限品类；并在使用说明显示： 可与其他优惠共享
     */
    public void setUseCondition(UseCondition useCondition) {
        this.useCondition = useCondition;
    }

    /**
     * 获取 封面摘要结构体名称
     */
    public AbstractObj getAbstractObj() {
        return this.abstractObj;
    }

    /**
     * 设置 封面摘要结构体名称
     */
    public void setAbstractObj(AbstractObj abstractObj) {
        this.abstractObj = abstractObj;
    }

    /**
     * 获取 图文列表，显示在详情内页 ，优惠券券开发者须至少传入一组图文列表
     */
    public List<TextImage> getTextImageList() {
        return this.textImageList;
    }

    /**
     * 设置 图文列表，显示在详情内页 ，优惠券券开发者须至少传入一组图文列表
     */
    public void setTextImageList(List<TextImage> textImageList) {
        this.textImageList = textImageList;
    }

    /**
     * 否	arry
     * 商家服务类型：
     * BIZ_SERVICE_DELIVER 外卖服务；
     * BIZ_SERVICE_FREE_PARK 停车位；
     * BIZ_SERVICE_WITH_PET 可带宠物；
     * BIZ_SERVICE_FREE_WIFI 免费wifi，
     * 可多选
     */
    public List<String> getBusinessService() {
        return this.businessService;
    }

    /**
     * 否	arry
     * 商家服务类型：
     * BIZ_SERVICE_DELIVER 外卖服务；
     * BIZ_SERVICE_FREE_PARK 停车位；
     * BIZ_SERVICE_WITH_PET 可带宠物；
     * BIZ_SERVICE_FREE_WIFI 免费wifi，
     * 可多选
     */
    public void setBusinessService(List<String> businessService) {
        this.businessService = businessService;
    }

    /**
     * 获取 否	JSON结构	使用时段限制，包含以下字段
     */
    public List<TimeLimit> getTimeLimitList() {
        return this.timeLimitList;
    }

    /**
     * 设置 否	JSON结构	使用时段限制，包含以下字段
     */
    public void setTimeLimitList(List<TimeLimit> timeLimitList) {
        this.timeLimitList = timeLimitList;
    }


    /**
     * 使用门槛（条件）字段，若不填写使用条件则在券面拼写：无最低消费限制，全场通用，不限品类；并在使用说明显示：
     * 可与其他优惠共享
     */
    public static class UseCondition {

        /**
         * 指定可用的商品类目，仅用于代金券类型 ，填入后将在券面拼写适用于xxx
         */
        @SerializedName("accept_category")
        private String acceptCategory;

        /**
         * 指定不可用的商品类目，仅用于代金券类型 ，填入后将在券面拼写不适用于xxxx
         */
        @SerializedName("reject_category")
        private String rejectCategory;

        /**
         * 满减门槛字段，可用于兑换券和代金券 ，填入后将在全面拼写消费满xx元可用
         */
        @SerializedName("least_cost")
        private String leastCost;

        /**
         * 购买xx可用类型门槛，仅用于兑换 ，填入后自动拼写购买xxx可用
         */
        @SerializedName("object_use_for")
        private String objectUseFor;

        /**
         * 不可以与其他类型共享门槛，填写false时系统将在使用须知里拼写“不可与其他优惠共享”， 填写true时系统将在使用须知里拼写“可与其他优惠共享”，
         * 默认为true
         */
        @SerializedName("can_use_with_other_discount")
        private String canUseWithOtherDiscount;


        /**
         * 获取 指定可用的商品类目，仅用于代金券类型 ，填入后将在券面拼写适用于xxx
         */
        public String getAcceptCategory() {
            return this.acceptCategory;
        }

        /**
         * 设置 指定可用的商品类目，仅用于代金券类型 ，填入后将在券面拼写适用于xxx
         */
        public void setAcceptCategory(String acceptCategory) {
            this.acceptCategory = acceptCategory;
        }

        /**
         * 获取 指定不可用的商品类目，仅用于代金券类型 ，填入后将在券面拼写不适用于xxxx
         */
        public String getRejectCategory() {
            return this.rejectCategory;
        }

        /**
         * 设置 指定不可用的商品类目，仅用于代金券类型 ，填入后将在券面拼写不适用于xxxx
         */
        public void setRejectCategory(String rejectCategory) {
            this.rejectCategory = rejectCategory;
        }

        /**
         * 获取 满减门槛字段，可用于兑换券和代金券 ，填入后将在全面拼写消费满xx元可用
         */
        public String getLeastCost() {
            return this.leastCost;
        }

        /**
         * 设置 满减门槛字段，可用于兑换券和代金券 ，填入后将在全面拼写消费满xx元可用
         */
        public void setLeastCost(String leastCost) {
            this.leastCost = leastCost;
        }

        /**
         * 获取 购买xx可用类型门槛，仅用于兑换 ，填入后自动拼写购买xxx可用
         */
        public String getObjectUseFor() {
            return this.objectUseFor;
        }

        /**
         * 设置 购买xx可用类型门槛，仅用于兑换 ，填入后自动拼写购买xxx可用
         */
        public void setObjectUseFor(String objectUseFor) {
            this.objectUseFor = objectUseFor;
        }

        /**
         * 不可以与其他类型共享门槛，填写false时系统将在使用须知里拼写“不可与其他优惠共享”， 填写true时系统将在使用须知里拼写“可与其他优惠共享”，
         * 默认为true
         */
        public String getCanUseWithOtherDiscount() {
            return this.canUseWithOtherDiscount;
        }

        /**
         * 不可以与其他类型共享门槛，填写false时系统将在使用须知里拼写“不可与其他优惠共享”， 填写true时系统将在使用须知里拼写“可与其他优惠共享”，
         * 默认为true
         */
        public void setCanUseWithOtherDiscount(String canUseWithOtherDiscount) {
            this.canUseWithOtherDiscount = canUseWithOtherDiscount;
        }
    }

    /**
     * 封面摘要结构体名称
     */
    public static class AbstractObj {

        /**
         * 封面摘要简介。
         */
        @SerializedName("abstract")
        private String abstractStr;

        /**
         * 封面图片列表，仅支持填入一个封面图片链接，上传图片接口上传获取图片获得链接，填写非CDN链接会报错，并在此填入。建议图片尺寸像素850*350
         */
        @SerializedName("icon_url_list")
        private String iconUrlList;

        /**
         * 获取 封面摘要简介。
         */
        public String getAbstractStr() {
            return this.abstractStr;
        }

        /**
         * 设置 封面摘要简介。
         */
        public void setAbstractStr(String abstractStr) {
            this.abstractStr = abstractStr;
        }

        /**
         * 获取 封面图片列表，仅支持填入一个封面图片链接，上传图片接口上传获取图片获得链接，填写非CDN链接会报错，并在此填入。建议图片尺寸像素850*350
         */
        public String getIconUrlList() {
            return this.iconUrlList;
        }

        /**
         * 设置 封面图片列表，仅支持填入一个封面图片链接，上传图片接口上传获取图片获得链接，填写非CDN链接会报错，并在此填入。建议图片尺寸像素850*350
         */
        public void setIconUrlList(String iconUrlList) {
            this.iconUrlList = iconUrlList;
        }
    }

    /**
     * 图文列表，显示在详情内页，优惠券券开发者须至少传入一组图文列表
     */
    public static class TextImage {

        /**
         * 否	string（128）
         * 图片链接，必须调用上传图片接口上传图片获得链接，并在此填入，否则报错
         */
        @SerializedName("image_url")
        private String imageUrl;

        /**
         * 否	string（512）	图文描述
         */
        @SerializedName("text")
        private String text;

        /**
         * 否	string（128）
         * 图片链接，必须调用上传图片接口上传图片获得链接，并在此填入，否则报错
         */
        public String getImageUrl() {
            return this.imageUrl;
        }

        /**
         * 否	string（128）
         * 图片链接，必须调用上传图片接口上传图片获得链接，并在此填入，否则报错
         */
        public void setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
        }

        /**
         * 获取 否	string（512）	图文描述
         */
        public String getText() {
            return this.text;
        }

        /**
         * 设置 否	string（512）	图文描述
         */
        public void setText(String text) {
            this.text = text;
        }
    }

    public static class TimeLimit {

        /**
         * 否	string（24）
         * 限制类型枚举值：支持填入
         * MONDAY 周一
         * TUESDAY 周二
         * WEDNESDAY 周三
         * THURSDAY 周四
         * FRIDAY 周五
         * SATURDAY 周六
         * SUNDAY 周日
         * 此处只控制显示，
         * 不控制实际使用逻辑，不填默认不显示
         */
        @SerializedName("type")
        private String type;

        /**
         * 否	int
         * 当前type类型下的起始时间（小时），如当前结构体内填写了MONDAY，此处填写了10，则此处表示周一 10:00可用
         */
        @SerializedName("begin_hour")
        private Integer beginHour;


        /**
         * 否	int
         * 当前type类型下的结束时间（小时） ，如当前结构体内填写了MONDAY， 此处填写了20，则此处表示周一 10:00-20:00可用
         */
        @SerializedName("end_hour")
        private Integer endHour;

        /**
         * 否	int
         * 当前type类型下的起始时间（分钟） ，如当前结构体内填写了MONDAY， begin_hour填写10，此处填写了59， 则此处表示周一 10:59可用
         */
        @SerializedName("begin_minute")
        private Integer beginMinute;

        /**
         * 否	int
         * 当前type类型下的结束时间（分钟） ，如当前结构体内填写了MONDAY， begin_hour填写10，此处填写了59， 则此处表示周一 10:59-00:59可用
         */
        @SerializedName("end_minute")
        private Integer endMinute;


        /**
         * 否	string（24）
         * 限制类型枚举值：支持填入
         * MONDAY 周一
         * TUESDAY 周二
         * WEDNESDAY 周三
         * THURSDAY 周四
         * FRIDAY 周五
         * SATURDAY 周六
         * SUNDAY 周日
         * 此处只控制显示，
         * 不控制实际使用逻辑，不填默认不显示
         */
        public String getType() {
            return this.type;
        }

        /**
         * 否	string（24）
         * 限制类型枚举值：支持填入
         * MONDAY 周一
         * TUESDAY 周二
         * WEDNESDAY 周三
         * THURSDAY 周四
         * FRIDAY 周五
         * SATURDAY 周六
         * SUNDAY 周日
         * 此处只控制显示，
         * 不控制实际使用逻辑，不填默认不显示
         */
        public void setType(String type) {
            this.type = type;
        }

        /**
         * 否	int
         * 当前type类型下的起始时间（小时），如当前结构体内填写了MONDAY，此处填写了10，则此处表示周一 10:00可用
         */
        public Integer getBeginHour() {
            return this.beginHour;
        }

        /**
         * 否	int
         * 当前type类型下的起始时间（小时），如当前结构体内填写了MONDAY，此处填写了10，则此处表示周一 10:00可用
         */
        public void setBeginHour(Integer beginHour) {
            this.beginHour = beginHour;
        }

        /**
         * 否	int
         * 当前type类型下的结束时间（小时） ，如当前结构体内填写了MONDAY， 此处填写了20，则此处表示周一 10:00-20:00可用
         */
        public Integer getEndHour() {
            return this.endHour;
        }

        /**
         * 否	int
         * 当前type类型下的结束时间（小时） ，如当前结构体内填写了MONDAY， 此处填写了20，则此处表示周一 10:00-20:00可用
         */
        public void setEndHour(Integer endHour) {
            this.endHour = endHour;
        }

        /**
         * 否	int
         * 当前type类型下的起始时间（分钟） ，如当前结构体内填写了MONDAY， begin_hour填写10，此处填写了59， 则此处表示周一 10:59可用
         */
        public Integer getBeginMinute() {
            return this.beginMinute;
        }

        /**
         * 否	int
         * 当前type类型下的起始时间（分钟） ，如当前结构体内填写了MONDAY， begin_hour填写10，此处填写了59， 则此处表示周一 10:59可用
         */
        public void setBeginMinute(Integer beginMinute) {
            this.beginMinute = beginMinute;
        }

        /**
         * 否	int
         * 当前type类型下的结束时间（分钟） ，如当前结构体内填写了MONDAY， begin_hour填写10，此处填写了59， 则此处表示周一 10:59-00:59可用
         */
        public Integer getEndMinute() {
            return this.endMinute;
        }

        /**
         * 否	int
         * 当前type类型下的结束时间（分钟） ，如当前结构体内填写了MONDAY， begin_hour填写10，此处填写了59， 则此处表示周一 10:59-00:59可用
         */
        public void setEndMinute(Integer endMinute) {
            this.endMinute = endMinute;
        }
    }
}
