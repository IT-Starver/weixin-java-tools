package me.chanjar.weixin.common.bean.card;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by Joe on 2017/9/8.
 */
public class WxMemberCard implements Serializable {

    /**
     * 背景图片url
     */
    @SerializedName("background_pic_url")
    private String backgroundPicUrl;

    /**
     * 基本的卡券数据，见下表，所有卡券类型通用。
     */
    @SerializedName("base_info")
    private WxMemberCardBaseInfo baseInfo;

    /**
     * 卡券高级信息
     */
    @SerializedName("advanced_info")
    private WxMemberCardAdvancedInfo advancedInfo;

    /**
     * <pre>
     * 是
     * bool
     * 显示积分，填写true或false，如填写true，积分相关字段均为必填
     * </pre>
     */
    @SerializedName("supply_bonus")
    private Boolean supplyBonus;

    /**
     * <pre>
     * 是
     * bool
     * 是否支持储值，填写true或false。如填写true，储值相关字段均为必填
     * 若设置为true则后续不可以被关闭。该字段须开通储值功能后方可使用，
     * 详情见：获取特殊权限<url>https://mp.weixin.qq.com/cgi-bin/readtemplate?t=cardticket/faq_tmpl&type=info&token=1494071418&lang=zh_CN#3dot2<url/>
     * </pre>
     */
    @SerializedName("supply_balance")
    private Boolean supplyBalance;

    /**
     * <pre>
     * 是
     * string(3072)
     * 会员卡特权说明,限制1024汉字。
     * </pre>
     */
    @SerializedName("prerogative")
    private String prerogative;

    /**
     * <pre>
     * 否
     * bool
     * 设置为true时用户领取会员卡后系统自动将其激活，无需调用激活接口，详情见自动激活。
     * </pre>
     */
    @SerializedName("auto_activate")
    private Boolean autoActivate;

    /**
     * 否
     * 设置为true时，该卡将支持一键开卡详情见一键开卡。
     * 该选项与activate_url互斥。
     */
    @SerializedName("wx_activate")
    private Boolean wxActivate;

    /**
     * 否
     * string（128）激活会员卡的url。
     */
    @SerializedName("activate_url")
    private String activateUrl;


    @SerializedName("custom_field1")
    private CustomField customField1;

    @SerializedName("custom_field2")
    private CustomField customField2;

    @SerializedName("custom_field3")
    private CustomField customField3;

    @SerializedName("name_type")
    private String nameType;

    /**
     * 否 	string（128）	积分清零规则。
     */
    @SerializedName("bonus_cleared")
    private String bonusCleared;

    /**
     * 否
     * string（128）积分规则。
     */
    @SerializedName("bonus_rules")
    private String bonusRules;

    /**
     * 否
     * string（128）储值说明。
     */
    @SerializedName("balance_rules")
    private String balanceRules;


    /**
     * 积分规则
     */
    @SerializedName("bonus_rule")
    private BonusRule bonusRule;

    /**
     * 获取 背景图片url
     */
    public String getBackgroundPicUrl() {
        return this.backgroundPicUrl;
    }

    /**
     * 设置 背景图片url
     */
    public void setBackgroundPicUrl(String backgroundPicUrl) {
        this.backgroundPicUrl = backgroundPicUrl;
    }

    /**
     * 获取 基本的卡券数据，见下表，所有卡券类型通用。
     */
    public WxMemberCardBaseInfo getBaseInfo() {
        return this.baseInfo;
    }

    /**
     * 设置 基本的卡券数据，见下表，所有卡券类型通用。
     */
    public void setBaseInfo(WxMemberCardBaseInfo baseInfo) {
        this.baseInfo = baseInfo;
    }

    /**
     * 获取 卡券高级信息
     */
    public WxMemberCardAdvancedInfo getAdvancedInfo() {
        return this.advancedInfo;
    }

    /**
     * 设置 卡券高级信息
     */
    public void setAdvancedInfo(WxMemberCardAdvancedInfo advancedInfo) {
        this.advancedInfo = advancedInfo;
    }

    /**
     * <pre>
     * 是
     * bool
     * 显示积分，填写true或false，如填写true，积分相关字段均为必填
     * </pre>
     */
    public Boolean getSupplyBonus() {
        return this.supplyBonus;
    }

    /**
     * <pre>
     * 是
     * bool
     * 显示积分，填写true或false，如填写true，积分相关字段均为必填
     * </pre>
     */
    public void setSupplyBonus(Boolean supplyBonus) {
        this.supplyBonus = supplyBonus;
    }


    /**
     * <pre>
     * 是
     * string(3072)
     * 会员卡特权说明,限制1024汉字。
     * </pre>
     */
    public String getPrerogative() {
        return this.prerogative;
    }

    /**
     * <pre>
     * 是
     * string(3072)
     * 会员卡特权说明,限制1024汉字。
     * </pre>
     */
    public void setPrerogative(String prerogative) {
        this.prerogative = prerogative;
    }

    /**
     * <pre>
     * 否
     * bool
     * 设置为true时用户领取会员卡后系统自动将其激活，无需调用激活接口，详情见自动激活。
     * </pre>
     */
    public Boolean getAutoActivate() {
        return this.autoActivate;
    }

    /**
     * <pre>
     * 否
     * bool
     * 设置为true时用户领取会员卡后系统自动将其激活，无需调用激活接口，详情见自动激活。
     * </pre>
     */
    public void setAutoActivate(Boolean autoActivate) {
        this.autoActivate = autoActivate;
    }

    /**
     * 否
     * 设置为true时，该卡将支持一键开卡详情见一键开卡。
     * 该选项与activate_url互斥。
     */
    public Boolean getWxActivate() {
        return this.wxActivate;
    }

    /**
     * 否
     * 设置为true时，该卡将支持一键开卡详情见一键开卡。
     * 该选项与activate_url互斥。
     */
    public void setWxActivate(Boolean wxActivate) {
        this.wxActivate = wxActivate;
    }

    /**
     * 否
     * string（128）激活会员卡的url。
     */
    public String getActivateUrl() {
        return this.activateUrl;
    }

    /**
     * 否
     * string（128）激活会员卡的url。
     */
    public void setActivateUrl(String activateUrl) {
        this.activateUrl = activateUrl;
    }

    @SerializedName("custom_field1")
    public CustomField getCustomField1() {
        return this.customField1;
    }

    @SerializedName("custom_field1")
    public void setCustomField1(CustomField customField1) {
        this.customField1 = customField1;
    }

    @SerializedName("custom_field2")
    public CustomField getCustomField2() {
        return this.customField2;
    }

    @SerializedName("custom_field2")
    public void setCustomField2(CustomField customField2) {
        this.customField2 = customField2;
    }

    @SerializedName("custom_field3")
    public CustomField getCustomField3() {
        return this.customField3;
    }

    @SerializedName("custom_field3")
    public void setCustomField3(CustomField customField3) {
        this.customField3 = customField3;
    }

    @SerializedName("name_type")
    public String getNameType() {
        return this.nameType;
    }

    @SerializedName("name_type")
    public void setNameType(String nameType) {
        this.nameType = nameType;
    }

    /**
     * 获取 否 	string（128）	积分清零规则。
     */
    public String getBonusCleared() {
        return this.bonusCleared;
    }

    /**
     * 设置 否 	string（128）	积分清零规则。
     */
    public void setBonusCleared(String bonusCleared) {
        this.bonusCleared = bonusCleared;
    }

    /**
     * 否
     * string（128）积分规则。
     */
    public String getBonusRules() {
        return this.bonusRules;
    }

    /**
     * 否
     * string（128）积分规则。
     */
    public void setBonusRules(String bonusRules) {
        this.bonusRules = bonusRules;
    }

    /**
     * 否
     * string（128）储值说明。
     */
    public String getBalanceRules() {
        return this.balanceRules;
    }

    /**
     * 否
     * string（128）储值说明。
     */
    public void setBalanceRules(String balanceRules) {
        this.balanceRules = balanceRules;
    }

    /**
     * 获取 积分规则
     */
    public BonusRule getBonusRule() {
        return this.bonusRule;
    }

    /**
     * 设置 积分规则
     */
    public void setBonusRule(BonusRule bonusRule) {
        this.bonusRule = bonusRule;
    }

    /**
     * <pre>
     * 是
     * bool
     * 是否支持储值，填写true或false。如填写true，储值相关字段均为必填
     * 若设置为true则后续不可以被关闭。该字段须开通储值功能后方可使用，
     * 详情见：获取特殊权限<url>https://mp.weixin.qq.com/cgi-bin/readtemplate?t=cardticket/faq_tmpl&type=info&token=1494071418&lang=zh_CN#3dot2<url/>
     * </pre>
     */
    public Boolean getSupplyBalance() {
        return this.supplyBalance;
    }

    /**
     * <pre>
     * 是
     * bool
     * 是否支持储值，填写true或false。如填写true，储值相关字段均为必填
     * 若设置为true则后续不可以被关闭。该字段须开通储值功能后方可使用，
     * 详情见：获取特殊权限<url>https://mp.weixin.qq.com/cgi-bin/readtemplate?t=cardticket/faq_tmpl&type=info&token=1494071418&lang=zh_CN#3dot2<url/>
     * </pre>
     */
    public void setSupplyBalance(Boolean supplyBalance) {
        this.supplyBalance = supplyBalance;
    }


    public static class CustomField implements Serializable {

        @SerializedName("name_type")
        private String nameType;

        @SerializedName("url")
        private String url;

        @SerializedName("name")
        private String name;

        public String getNameType() {
            return nameType;
        }

        public void setNameType(String nameType) {
            this.nameType = nameType;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }

    public static class BonusRule implements Serializable {

        /**
         * 消费金额。以分为单位。
         */
        @SerializedName("cost_money_unit")
        private Integer costMoneyUnit;

        /**
         * 对应增加的积分。
         */
        @SerializedName("increase_bonus")
        private Integer increaseBonus;

        /**
         * 用户单次可获取的积分上限。
         */
        @SerializedName("max_increase_bonus")
        private Integer maxIncreaseBonus;

        /**
         * 初始设置积分。
         */
        @SerializedName("init_increase_bonus")
        private Integer initIncreaseBonus;

        /**
         * 每使用5积分。
         */
        @SerializedName("cost_bonus_unit")
        private Integer costBonusUnit;

        /**
         * 抵扣xx元，（这里以分为单位）
         */
        @SerializedName("reduce_money")
        private Integer reduceMoney;

        /**
         * 抵扣条件，满xx元（这里以分为单位）可用。
         */
        @SerializedName("least_money_to_use_bonus")
        private Integer leastMoneyToUseBonus;

        /**
         * 抵扣条件，单笔最多使用xx积分
         */
        @SerializedName("max_reduce_bonus")
        private Integer maxReduceBonus;


        /**
         * 获取 消费金额。以分为单位。
         */
        public Integer getCostMoneyUnit() {
            return this.costMoneyUnit;
        }

        /**
         * 设置 消费金额。以分为单位。
         */
        public void setCostMoneyUnit(Integer costMoneyUnit) {
            this.costMoneyUnit = costMoneyUnit;
        }

        /**
         * 获取 对应增加的积分。
         */
        public Integer getIncreaseBonus() {
            return this.increaseBonus;
        }

        /**
         * 设置 对应增加的积分。
         */
        public void setIncreaseBonus(Integer increaseBonus) {
            this.increaseBonus = increaseBonus;
        }

        /**
         * 获取 用户单次可获取的积分上限。
         */
        public Integer getMaxIncreaseBonus() {
            return this.maxIncreaseBonus;
        }

        /**
         * 设置 用户单次可获取的积分上限。
         */
        public void setMaxIncreaseBonus(Integer maxIncreaseBonus) {
            this.maxIncreaseBonus = maxIncreaseBonus;
        }

        /**
         * 获取 初始设置积分。
         */
        public Integer getInitIncreaseBonus() {
            return this.initIncreaseBonus;
        }

        /**
         * 设置 初始设置积分。
         */
        public void setInitIncreaseBonus(Integer initIncreaseBonus) {
            this.initIncreaseBonus = initIncreaseBonus;
        }

        /**
         * 获取 每使用5积分。
         */
        public Integer getCostBonusUnit() {
            return this.costBonusUnit;
        }

        /**
         * 设置 每使用5积分。
         */
        public void setCostBonusUnit(Integer costBonusUnit) {
            this.costBonusUnit = costBonusUnit;
        }

        /**
         * 获取 抵扣xx元，（这里以分为单位）
         */
        public Integer getReduceMoney() {
            return this.reduceMoney;
        }

        /**
         * 设置 抵扣xx元，（这里以分为单位）
         */
        public void setReduceMoney(Integer reduceMoney) {
            this.reduceMoney = reduceMoney;
        }

        /**
         * 获取 抵扣条件，满xx元（这里以分为单位）可用。
         */
        public Integer getLeastMoneyToUseBonus() {
            return this.leastMoneyToUseBonus;
        }

        /**
         * 设置 抵扣条件，满xx元（这里以分为单位）可用。
         */
        public void setLeastMoneyToUseBonus(Integer leastMoneyToUseBonus) {
            this.leastMoneyToUseBonus = leastMoneyToUseBonus;
        }

        /**
         * 获取 抵扣条件，单笔最多使用xx积分
         */
        public Integer getMaxReduceBonus() {
            return this.maxReduceBonus;
        }

        /**
         * 设置 抵扣条件，单笔最多使用xx积分
         */
        public void setMaxReduceBonus(Integer maxReduceBonus) {
            this.maxReduceBonus = maxReduceBonus;
        }
    }

}
