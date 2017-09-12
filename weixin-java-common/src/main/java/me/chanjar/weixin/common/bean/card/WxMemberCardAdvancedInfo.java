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


    @SerializedName("use_condition")
    private UseCondition useCondition;

    @SerializedName("abstract")
    private AbstractObj abstractObj;


    @SerializedName("text_image_list")
    private List<TextImage> textImageList;


    @SerializedName("business_service")
    private List<String> businessService;


    @SerializedName("time_limit")
    private List<TimeLimit> timeLimitList;


    public UseCondition getUseCondition() {
        return useCondition;
    }

    public void setUseCondition(UseCondition useCondition) {
        this.useCondition = useCondition;
    }

    public AbstractObj getAbstractObj() {
        return abstractObj;
    }

    public void setAbstractObj(AbstractObj abstractObj) {
        this.abstractObj = abstractObj;
    }

    public List<TextImage> getTextImageList() {
        return textImageList;
    }

    public void setTextImageList(List<TextImage> textImageList) {
        this.textImageList = textImageList;
    }

    public List<String> getBusinessService() {
        return businessService;
    }

    public void setBusinessService(List<String> businessService) {
        this.businessService = businessService;
    }

    public List<TimeLimit> getTimeLimitList() {
        return timeLimitList;
    }

    public void setTimeLimitList(List<TimeLimit> timeLimitList) {
        this.timeLimitList = timeLimitList;
    }

    public static class UseCondition {

        @SerializedName("accept_category")
        private String acceptCategory;

        @SerializedName("reject_category")
        private String rejectCategory;

        @SerializedName("least_cost")
        private String leastCost;

        @SerializedName("object_use_for")
        private String objectUseFor;

        @SerializedName("can_use_with_other_discount")
        private String canUseWithOtherDiscount;

        public String getAcceptCategory() {
            return acceptCategory;
        }

        public void setAcceptCategory(String acceptCategory) {
            this.acceptCategory = acceptCategory;
        }

        public String getRejectCategory() {
            return rejectCategory;
        }

        public void setRejectCategory(String rejectCategory) {
            this.rejectCategory = rejectCategory;
        }

        public String getLeastCost() {
            return leastCost;
        }

        public void setLeastCost(String leastCost) {
            this.leastCost = leastCost;
        }

        public String getObjectUseFor() {
            return objectUseFor;
        }

        public void setObjectUseFor(String objectUseFor) {
            this.objectUseFor = objectUseFor;
        }

        public String getCanUseWithOtherDiscount() {
            return canUseWithOtherDiscount;
        }

        public void setCanUseWithOtherDiscount(String canUseWithOtherDiscount) {
            this.canUseWithOtherDiscount = canUseWithOtherDiscount;
        }
    }

    public static class AbstractObj {

        @SerializedName("abstract")
        private String abstractStr;

        @SerializedName("icon_url_list")
        private String iconUrlList;

        public String getAbstractStr() {
            return abstractStr;
        }

        public void setAbstractStr(String abstractStr) {
            this.abstractStr = abstractStr;
        }

        public String getIconUrlList() {
            return iconUrlList;
        }

        public void setIconUrlList(String iconUrlList) {
            this.iconUrlList = iconUrlList;
        }
    }

    public static class TextImage {

        @SerializedName("image_url")
        private String imageUrl;

        @SerializedName("text")
        private String text;

        public String getImageUrl() {
            return imageUrl;
        }

        public void setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }
    }

    public static class TimeLimit {

        @SerializedName("type")
        private String type;

        @SerializedName("begin_hour")
        private Integer beginHour;

        @SerializedName("end_hour")
        private Integer endHour;

        @SerializedName("begin_minute")
        private Integer beginMinute;

        @SerializedName("end_minute")
        private Integer endMinute;


        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public Integer getBeginHour() {
            return beginHour;
        }

        public void setBeginHour(Integer beginHour) {
            this.beginHour = beginHour;
        }

        public Integer getEndHour() {
            return endHour;
        }

        public void setEndHour(Integer endHour) {
            this.endHour = endHour;
        }

        public Integer getBeginMinute() {
            return beginMinute;
        }

        public void setBeginMinute(Integer beginMinute) {
            this.beginMinute = beginMinute;
        }

        public Integer getEndMinute() {
            return endMinute;
        }

        public void setEndMinute(Integer endMinute) {
            this.endMinute = endMinute;
        }
    }
}
