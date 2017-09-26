package me.chanjar.weixin.common.bean.card;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by Joe on 2017/9/8.
 */
public class WxMemberCard implements Serializable {

    /**
     *
     */
    @SerializedName("background_pic_url")
    private String backgroundPicUrl;

    @SerializedName("base_info")
    private WxMemberCardBaseInfo baseInfo;

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
     * 显示积分，填写true或false，如填写true，积分相关字段均为必填。若设置为true则后续不可以被关闭。
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

    public Boolean getSupplyBalance() {
        return supplyBalance;
    }

    public void setSupplyBalance(Boolean supplyBalance) {
        this.supplyBalance = supplyBalance;
    }

    public String getBackgroundPicUrl() {
        return backgroundPicUrl;
    }

    public void setBackgroundPicUrl(String backgroundPicUrl) {
        this.backgroundPicUrl = backgroundPicUrl;
    }

    public WxMemberCardBaseInfo getBaseInfo() {
        return baseInfo;
    }

    public void setBaseInfo(WxMemberCardBaseInfo baseInfo) {
        this.baseInfo = baseInfo;
    }

    public WxMemberCardAdvancedInfo getAdvancedInfo() {
        return advancedInfo;
    }

    public void setAdvancedInfo(WxMemberCardAdvancedInfo advancedInfo) {
        this.advancedInfo = advancedInfo;
    }

    public Boolean getSupplyBonus() {
        return supplyBonus;
    }

    public void setSupplyBonus(Boolean supplyBonus) {
        this.supplyBonus = supplyBonus;
    }

    public String getPrerogative() {
        return prerogative;
    }

    public void setPrerogative(String prerogative) {
        this.prerogative = prerogative;
    }

    public Boolean getAutoActivate() {
        return autoActivate;
    }

    public void setAutoActivate(Boolean autoActivate) {
        this.autoActivate = autoActivate;
    }

    public Boolean getWxActivate() {
        return wxActivate;
    }

    public void setWxActivate(Boolean wxActivate) {
        this.wxActivate = wxActivate;
    }

    public CustomField getCustomField1() {
        return customField1;
    }

    public void setCustomField1(CustomField customField1) {
        this.customField1 = customField1;
    }

    public CustomField getCustomField2() {
        return customField2;
    }

    public void setCustomField2(CustomField customField2) {
        this.customField2 = customField2;
    }

    public CustomField getCustomField3() {
        return customField3;
    }

    public void setCustomField3(CustomField customField3) {
        this.customField3 = customField3;
    }

    public String getNameType() {
        return nameType;
    }

    public void setNameType(String nameType) {
        this.nameType = nameType;
    }

    public String getBonusCleared() {
        return bonusCleared;
    }

    public void setBonusCleared(String bonusCleared) {
        this.bonusCleared = bonusCleared;
    }

    public String getBonusRules() {
        return bonusRules;
    }

    public void setBonusRules(String bonusRules) {
        this.bonusRules = bonusRules;
    }

    public String getBalanceRules() {
        return balanceRules;
    }

    public void setBalanceRules(String balanceRules) {
        this.balanceRules = balanceRules;
    }

    public String getActivateUrl() {
        return activateUrl;
    }

    public void setActivateUrl(String activateUrl) {
        this.activateUrl = activateUrl;
    }

    public BonusRule getBonusRule() {
        return bonusRule;
    }

    public void setBonusRule(BonusRule bonusRule) {
        this.bonusRule = bonusRule;
    }

    public static class CustomField {

        @SerializedName("name_type")
        private String nameType;

        @SerializedName("url")
        private String url;

        public String getNameType() {
            return nameType;
        }

        public void setNameType(String nameType) {
            this.nameType = nameType;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }

    public static class BonusRule {

        @SerializedName("cost_money_unit")
        private Integer costMoneyUnit;

        @SerializedName("increase_bonus")
        private Integer increaseBonus;

        @SerializedName("max_increase_bonus")
        private Integer maxIncreaseBonus;

        @SerializedName("init_increase_bonus")
        private Integer initIncreaseBonus;

        @SerializedName("cost_bonus_unit")
        private Integer costBonusUnit;

        @SerializedName("reduce_money")
        private Integer reduceMoney;

        @SerializedName("least_money_to_use_bonus")
        private Integer leastMoneyToUseBonus;

        @SerializedName("max_reduce_bonus")
        private Integer maxReduceBonus;

        public Integer getCostMoneyUnit() {
            return costMoneyUnit;
        }

        public void setCostMoneyUnit(Integer costMoneyUnit) {
            this.costMoneyUnit = costMoneyUnit;
        }

        public Integer getIncreaseBonus() {
            return increaseBonus;
        }

        public void setIncreaseBonus(Integer increaseBonus) {
            this.increaseBonus = increaseBonus;
        }

        public Integer getMaxIncreaseBonus() {
            return maxIncreaseBonus;
        }

        public void setMaxIncreaseBonus(Integer maxIncreaseBonus) {
            this.maxIncreaseBonus = maxIncreaseBonus;
        }

        public Integer getInitIncreaseBonus() {
            return initIncreaseBonus;
        }

        public void setInitIncreaseBonus(Integer initIncreaseBonus) {
            this.initIncreaseBonus = initIncreaseBonus;
        }

        public Integer getCostBonusUnit() {
            return costBonusUnit;
        }

        public void setCostBonusUnit(Integer costBonusUnit) {
            this.costBonusUnit = costBonusUnit;
        }

        public Integer getReduceMoney() {
            return reduceMoney;
        }

        public void setReduceMoney(Integer reduceMoney) {
            this.reduceMoney = reduceMoney;
        }

        public Integer getLeastMoneyToUseBonus() {
            return leastMoneyToUseBonus;
        }

        public void setLeastMoneyToUseBonus(Integer leastMoneyToUseBonus) {
            this.leastMoneyToUseBonus = leastMoneyToUseBonus;
        }

        public Integer getMaxReduceBonus() {
            return maxReduceBonus;
        }

        public void setMaxReduceBonus(Integer maxReduceBonus) {
            this.maxReduceBonus = maxReduceBonus;
        }
    }

}
