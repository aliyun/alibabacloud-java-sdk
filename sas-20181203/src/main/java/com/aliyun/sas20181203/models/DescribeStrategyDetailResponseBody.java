// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeStrategyDetailResponseBody extends TeaModel {
    /**
     * <p>An array that consists of the whitelist of risk items.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The source IP address of the request.</p>
     */
    @NameInMap("Strategy")
    public DescribeStrategyDetailResponseBodyStrategy strategy;

    public static DescribeStrategyDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeStrategyDetailResponseBody self = new DescribeStrategyDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeStrategyDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeStrategyDetailResponseBody setStrategy(DescribeStrategyDetailResponseBodyStrategy strategy) {
        this.strategy = strategy;
        return this;
    }
    public DescribeStrategyDetailResponseBodyStrategy getStrategy() {
        return this.strategy;
    }

    public static class DescribeStrategyDetailResponseBodyStrategyRiskTypeWhiteListQueryResultListSubTypesCheckDetailsRulesParamList extends TeaModel {
        @NameInMap("EnumValue")
        public String enumValue;

        /**
         * <p>Queries the details of a baseline check policy.</p>
         */
        @NameInMap("MaxValue")
        public Integer maxValue;

        @NameInMap("MinValue")
        public Integer minValue;

        /**
         * <p>Indicates whether the rule is included in the policy. Valid values:</p>
         * <br>
         * <p>*   **1**: yes</p>
         * <p>*   **0**: no</p>
         */
        @NameInMap("ParamDefaultValue")
        public String paramDefaultValue;

        @NameInMap("ParamDesc")
        public String paramDesc;

        /**
         * <p>The time when the baseline check based on the baseline check policy ends.</p>
         */
        @NameInMap("ParamName")
        public String paramName;

        /**
         * <p>WB01224678</p>
         */
        @NameInMap("ParamType")
        public Integer paramType;

        /**
         * <p>An array that consists of sub-risk items.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeStrategyDetailResponseBodyStrategyRiskTypeWhiteListQueryResultListSubTypesCheckDetailsRulesParamList build(java.util.Map<String, ?> map) throws Exception {
            DescribeStrategyDetailResponseBodyStrategyRiskTypeWhiteListQueryResultListSubTypesCheckDetailsRulesParamList self = new DescribeStrategyDetailResponseBodyStrategyRiskTypeWhiteListQueryResultListSubTypesCheckDetailsRulesParamList();
            return TeaModel.build(map, self);
        }

        public DescribeStrategyDetailResponseBodyStrategyRiskTypeWhiteListQueryResultListSubTypesCheckDetailsRulesParamList setEnumValue(String enumValue) {
            this.enumValue = enumValue;
            return this;
        }
        public String getEnumValue() {
            return this.enumValue;
        }

        public DescribeStrategyDetailResponseBodyStrategyRiskTypeWhiteListQueryResultListSubTypesCheckDetailsRulesParamList setMaxValue(Integer maxValue) {
            this.maxValue = maxValue;
            return this;
        }
        public Integer getMaxValue() {
            return this.maxValue;
        }

        public DescribeStrategyDetailResponseBodyStrategyRiskTypeWhiteListQueryResultListSubTypesCheckDetailsRulesParamList setMinValue(Integer minValue) {
            this.minValue = minValue;
            return this;
        }
        public Integer getMinValue() {
            return this.minValue;
        }

        public DescribeStrategyDetailResponseBodyStrategyRiskTypeWhiteListQueryResultListSubTypesCheckDetailsRulesParamList setParamDefaultValue(String paramDefaultValue) {
            this.paramDefaultValue = paramDefaultValue;
            return this;
        }
        public String getParamDefaultValue() {
            return this.paramDefaultValue;
        }

        public DescribeStrategyDetailResponseBodyStrategyRiskTypeWhiteListQueryResultListSubTypesCheckDetailsRulesParamList setParamDesc(String paramDesc) {
            this.paramDesc = paramDesc;
            return this;
        }
        public String getParamDesc() {
            return this.paramDesc;
        }

        public DescribeStrategyDetailResponseBodyStrategyRiskTypeWhiteListQueryResultListSubTypesCheckDetailsRulesParamList setParamName(String paramName) {
            this.paramName = paramName;
            return this;
        }
        public String getParamName() {
            return this.paramName;
        }

        public DescribeStrategyDetailResponseBodyStrategyRiskTypeWhiteListQueryResultListSubTypesCheckDetailsRulesParamList setParamType(Integer paramType) {
            this.paramType = paramType;
            return this;
        }
        public Integer getParamType() {
            return this.paramType;
        }

        public DescribeStrategyDetailResponseBodyStrategyRiskTypeWhiteListQueryResultListSubTypesCheckDetailsRulesParamList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeStrategyDetailResponseBodyStrategyRiskTypeWhiteListQueryResultListSubTypesCheckDetailsRules extends TeaModel {
        /**
         * <p>The description of the check item.</p>
         */
        @NameInMap("DefaultValue")
        public Integer defaultValue;

        /**
         * <p>Indicates whether the sub-risk item is selected. Valid values:</p>
         * <br>
         * <p>*   **true**: yes</p>
         * <p>*   **false**: no</p>
         */
        @NameInMap("Optional")
        public Integer optional;

        /**
         * <p>The specified value of the rule parameter.</p>
         */
        @NameInMap("ParamList")
        public java.util.List<DescribeStrategyDetailResponseBodyStrategyRiskTypeWhiteListQueryResultListSubTypesCheckDetailsRulesParamList> paramList;

        /**
         * <p>The check item.</p>
         */
        @NameInMap("RuleDesc")
        public String ruleDesc;

        /**
         * <p>Indicates whether the risk item is selected. Valid values:</p>
         * <br>
         * <p>*   **true**: yes</p>
         * <p>*   **false**: no</p>
         */
        @NameInMap("RuleId")
        public String ruleId;

        public static DescribeStrategyDetailResponseBodyStrategyRiskTypeWhiteListQueryResultListSubTypesCheckDetailsRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeStrategyDetailResponseBodyStrategyRiskTypeWhiteListQueryResultListSubTypesCheckDetailsRules self = new DescribeStrategyDetailResponseBodyStrategyRiskTypeWhiteListQueryResultListSubTypesCheckDetailsRules();
            return TeaModel.build(map, self);
        }

        public DescribeStrategyDetailResponseBodyStrategyRiskTypeWhiteListQueryResultListSubTypesCheckDetailsRules setDefaultValue(Integer defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public Integer getDefaultValue() {
            return this.defaultValue;
        }

        public DescribeStrategyDetailResponseBodyStrategyRiskTypeWhiteListQueryResultListSubTypesCheckDetailsRules setOptional(Integer optional) {
            this.optional = optional;
            return this;
        }
        public Integer getOptional() {
            return this.optional;
        }

        public DescribeStrategyDetailResponseBodyStrategyRiskTypeWhiteListQueryResultListSubTypesCheckDetailsRules setParamList(java.util.List<DescribeStrategyDetailResponseBodyStrategyRiskTypeWhiteListQueryResultListSubTypesCheckDetailsRulesParamList> paramList) {
            this.paramList = paramList;
            return this;
        }
        public java.util.List<DescribeStrategyDetailResponseBodyStrategyRiskTypeWhiteListQueryResultListSubTypesCheckDetailsRulesParamList> getParamList() {
            return this.paramList;
        }

        public DescribeStrategyDetailResponseBodyStrategyRiskTypeWhiteListQueryResultListSubTypesCheckDetailsRules setRuleDesc(String ruleDesc) {
            this.ruleDesc = ruleDesc;
            return this;
        }
        public String getRuleDesc() {
            return this.ruleDesc;
        }

        public DescribeStrategyDetailResponseBodyStrategyRiskTypeWhiteListQueryResultListSubTypesCheckDetailsRules setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

    }

    public static class DescribeStrategyDetailResponseBodyStrategyRiskTypeWhiteListQueryResultListSubTypesCheckDetails extends TeaModel {
        /**
         * <p>The name of the baseline check policy.</p>
         */
        @NameInMap("CheckDesc")
        public String checkDesc;

        /**
         * <p>The language of the content within the request and response. Default value: **zh**. Valid values:</p>
         * <br>
         * <p>*   **zh**: Chinese</p>
         * <p>*   **en**: English</p>
         */
        @NameInMap("CheckId")
        public Long checkId;

        /**
         * <p>The maximum value of the rule parameter.</p>
         */
        @NameInMap("CheckItem")
        public String checkItem;

        /**
         * <p>The ID of the baseline check policy.</p>
         */
        @NameInMap("Rules")
        public java.util.List<DescribeStrategyDetailResponseBodyStrategyRiskTypeWhiteListQueryResultListSubTypesCheckDetailsRules> rules;

        public static DescribeStrategyDetailResponseBodyStrategyRiskTypeWhiteListQueryResultListSubTypesCheckDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeStrategyDetailResponseBodyStrategyRiskTypeWhiteListQueryResultListSubTypesCheckDetails self = new DescribeStrategyDetailResponseBodyStrategyRiskTypeWhiteListQueryResultListSubTypesCheckDetails();
            return TeaModel.build(map, self);
        }

        public DescribeStrategyDetailResponseBodyStrategyRiskTypeWhiteListQueryResultListSubTypesCheckDetails setCheckDesc(String checkDesc) {
            this.checkDesc = checkDesc;
            return this;
        }
        public String getCheckDesc() {
            return this.checkDesc;
        }

        public DescribeStrategyDetailResponseBodyStrategyRiskTypeWhiteListQueryResultListSubTypesCheckDetails setCheckId(Long checkId) {
            this.checkId = checkId;
            return this;
        }
        public Long getCheckId() {
            return this.checkId;
        }

        public DescribeStrategyDetailResponseBodyStrategyRiskTypeWhiteListQueryResultListSubTypesCheckDetails setCheckItem(String checkItem) {
            this.checkItem = checkItem;
            return this;
        }
        public String getCheckItem() {
            return this.checkItem;
        }

        public DescribeStrategyDetailResponseBodyStrategyRiskTypeWhiteListQueryResultListSubTypesCheckDetails setRules(java.util.List<DescribeStrategyDetailResponseBodyStrategyRiskTypeWhiteListQueryResultListSubTypesCheckDetailsRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<DescribeStrategyDetailResponseBodyStrategyRiskTypeWhiteListQueryResultListSubTypesCheckDetailsRules> getRules() {
            return this.rules;
        }

    }

    public static class DescribeStrategyDetailResponseBodyStrategyRiskTypeWhiteListQueryResultListSubTypes extends TeaModel {
        /**
         * <p>The type of the baseline check policy. Valid values:</p>
         * <br>
         * <p>*   **common**: standard baseline check policy</p>
         * <p>*   **custom**: custom baseline check policy</p>
         */
        @NameInMap("Alias")
        public String alias;

        /**
         * <p>The data returned.</p>
         */
        @NameInMap("CheckDetails")
        public java.util.List<DescribeStrategyDetailResponseBodyStrategyRiskTypeWhiteListQueryResultListSubTypesCheckDetails> checkDetails;

        /**
         * <p>If the value of paramType is 2, this parameter provides the options that can be selected for the rule parameter.</p>
         */
        @NameInMap("On")
        public Boolean on;

        /**
         * <p>The description of the rule.</p>
         */
        @NameInMap("TypeName")
        public String typeName;

        public static DescribeStrategyDetailResponseBodyStrategyRiskTypeWhiteListQueryResultListSubTypes build(java.util.Map<String, ?> map) throws Exception {
            DescribeStrategyDetailResponseBodyStrategyRiskTypeWhiteListQueryResultListSubTypes self = new DescribeStrategyDetailResponseBodyStrategyRiskTypeWhiteListQueryResultListSubTypes();
            return TeaModel.build(map, self);
        }

        public DescribeStrategyDetailResponseBodyStrategyRiskTypeWhiteListQueryResultListSubTypes setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public DescribeStrategyDetailResponseBodyStrategyRiskTypeWhiteListQueryResultListSubTypes setCheckDetails(java.util.List<DescribeStrategyDetailResponseBodyStrategyRiskTypeWhiteListQueryResultListSubTypesCheckDetails> checkDetails) {
            this.checkDetails = checkDetails;
            return this;
        }
        public java.util.List<DescribeStrategyDetailResponseBodyStrategyRiskTypeWhiteListQueryResultListSubTypesCheckDetails> getCheckDetails() {
            return this.checkDetails;
        }

        public DescribeStrategyDetailResponseBodyStrategyRiskTypeWhiteListQueryResultListSubTypes setOn(Boolean on) {
            this.on = on;
            return this;
        }
        public Boolean getOn() {
            return this.on;
        }

        public DescribeStrategyDetailResponseBodyStrategyRiskTypeWhiteListQueryResultListSubTypes setTypeName(String typeName) {
            this.typeName = typeName;
            return this;
        }
        public String getTypeName() {
            return this.typeName;
        }

    }

    public static class DescribeStrategyDetailResponseBodyStrategyRiskTypeWhiteListQueryResultList extends TeaModel {
        /**
         * <p>The condition by which the baseline check policy is applied to the asset. Valid values:</p>
         * <br>
         * <p>*   **groupId**: the ID of the asset group</p>
         * <p>*   **uuid**: the UUID of the asset</p>
         */
        @NameInMap("Alias")
        public String alias;

        /**
         * <p>The ID of the check item.</p>
         */
        @NameInMap("On")
        public Boolean on;

        /**
         * <p>The information about the rule parameter.</p>
         */
        @NameInMap("SubTypes")
        public java.util.List<DescribeStrategyDetailResponseBodyStrategyRiskTypeWhiteListQueryResultListSubTypes> subTypes;

        /**
         * <p>An array that consists of the details of custom check items.</p>
         */
        @NameInMap("TypeName")
        public String typeName;

        public static DescribeStrategyDetailResponseBodyStrategyRiskTypeWhiteListQueryResultList build(java.util.Map<String, ?> map) throws Exception {
            DescribeStrategyDetailResponseBodyStrategyRiskTypeWhiteListQueryResultList self = new DescribeStrategyDetailResponseBodyStrategyRiskTypeWhiteListQueryResultList();
            return TeaModel.build(map, self);
        }

        public DescribeStrategyDetailResponseBodyStrategyRiskTypeWhiteListQueryResultList setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public DescribeStrategyDetailResponseBodyStrategyRiskTypeWhiteListQueryResultList setOn(Boolean on) {
            this.on = on;
            return this;
        }
        public Boolean getOn() {
            return this.on;
        }

        public DescribeStrategyDetailResponseBodyStrategyRiskTypeWhiteListQueryResultList setSubTypes(java.util.List<DescribeStrategyDetailResponseBodyStrategyRiskTypeWhiteListQueryResultListSubTypes> subTypes) {
            this.subTypes = subTypes;
            return this;
        }
        public java.util.List<DescribeStrategyDetailResponseBodyStrategyRiskTypeWhiteListQueryResultListSubTypes> getSubTypes() {
            return this.subTypes;
        }

        public DescribeStrategyDetailResponseBodyStrategyRiskTypeWhiteListQueryResultList setTypeName(String typeName) {
            this.typeName = typeName;
            return this;
        }
        public String getTypeName() {
            return this.typeName;
        }

    }

    public static class DescribeStrategyDetailResponseBodyStrategy extends TeaModel {
        @NameInMap("CustomType")
        public String customType;

        /**
         * <p>The alias of the sub-check item.</p>
         */
        @NameInMap("CycleDays")
        public Integer cycleDays;

        /**
         * <p>The details of the rule.</p>
         */
        @NameInMap("CycleStartTime")
        public Integer cycleStartTime;

        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The time period during which the check starts. Valid values:</p>
         * <br>
         * <p>*   **0**: 00:00 to 06:00</p>
         * <p>*   **6**: 06:00 to 12:00</p>
         * <p>*   **12**: 12:00 to 18:00</p>
         * <p>*   **18**: 18:00 to 24:00</p>
         */
        @NameInMap("Id")
        public Integer id;

        /**
         * <p>The ID of the rule.</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("RiskSubTypeName")
        public String riskSubTypeName;

        /**
         * <p>The check item.</p>
         */
        @NameInMap("RiskTypeWhiteListQueryResultList")
        public java.util.List<DescribeStrategyDetailResponseBodyStrategyRiskTypeWhiteListQueryResultList> riskTypeWhiteListQueryResultList;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("TargetType")
        public String targetType;

        /**
         * <p>The name of the rule parameter.</p>
         */
        @NameInMap("Type")
        public Integer type;

        public static DescribeStrategyDetailResponseBodyStrategy build(java.util.Map<String, ?> map) throws Exception {
            DescribeStrategyDetailResponseBodyStrategy self = new DescribeStrategyDetailResponseBodyStrategy();
            return TeaModel.build(map, self);
        }

        public DescribeStrategyDetailResponseBodyStrategy setCustomType(String customType) {
            this.customType = customType;
            return this;
        }
        public String getCustomType() {
            return this.customType;
        }

        public DescribeStrategyDetailResponseBodyStrategy setCycleDays(Integer cycleDays) {
            this.cycleDays = cycleDays;
            return this;
        }
        public Integer getCycleDays() {
            return this.cycleDays;
        }

        public DescribeStrategyDetailResponseBodyStrategy setCycleStartTime(Integer cycleStartTime) {
            this.cycleStartTime = cycleStartTime;
            return this;
        }
        public Integer getCycleStartTime() {
            return this.cycleStartTime;
        }

        public DescribeStrategyDetailResponseBodyStrategy setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeStrategyDetailResponseBodyStrategy setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public DescribeStrategyDetailResponseBodyStrategy setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeStrategyDetailResponseBodyStrategy setRiskSubTypeName(String riskSubTypeName) {
            this.riskSubTypeName = riskSubTypeName;
            return this;
        }
        public String getRiskSubTypeName() {
            return this.riskSubTypeName;
        }

        public DescribeStrategyDetailResponseBodyStrategy setRiskTypeWhiteListQueryResultList(java.util.List<DescribeStrategyDetailResponseBodyStrategyRiskTypeWhiteListQueryResultList> riskTypeWhiteListQueryResultList) {
            this.riskTypeWhiteListQueryResultList = riskTypeWhiteListQueryResultList;
            return this;
        }
        public java.util.List<DescribeStrategyDetailResponseBodyStrategyRiskTypeWhiteListQueryResultList> getRiskTypeWhiteListQueryResultList() {
            return this.riskTypeWhiteListQueryResultList;
        }

        public DescribeStrategyDetailResponseBodyStrategy setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeStrategyDetailResponseBodyStrategy setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

        public DescribeStrategyDetailResponseBodyStrategy setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

}
