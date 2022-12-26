// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeStrategyDetailResponseBody extends TeaModel {
    // The ID of the request, which is used to locate and troubleshoot issues.
    @NameInMap("RequestId")
    public String requestId;

    // The information about the baseline check policy.
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
        // If the value of paramType is 2, this parameter provides the options that can be selected for the rule parameter.
        @NameInMap("EnumValue")
        public String enumValue;

        // The maximum value of the rule parameter.
        @NameInMap("MaxValue")
        public Integer maxValue;

        // The minimum value of the rule parameter.
        @NameInMap("MinValue")
        public Integer minValue;

        // The default value of the rule parameter.
        @NameInMap("ParamDefaultValue")
        public String paramDefaultValue;

        // The description of the rule parameter.
        @NameInMap("ParamDesc")
        public String paramDesc;

        // The name of the rule parameter.
        @NameInMap("ParamName")
        public String paramName;

        // The type of the rule parameter. Valid values:
        // 
        // *   **1**: input
        // *   **2**: selection
        @NameInMap("ParamType")
        public Integer paramType;

        // The specified value of the rule parameter.
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
        // The default value of the rule.
        @NameInMap("DefaultValue")
        public Integer defaultValue;

        // Indicates whether the rule is included in the policy. Valid values:
        // 
        // *   **1**: yes
        // *   **0**: no
        @NameInMap("Optional")
        public Integer optional;

        // An array that consists of the rule parameters.
        @NameInMap("ParamList")
        public java.util.List<DescribeStrategyDetailResponseBodyStrategyRiskTypeWhiteListQueryResultListSubTypesCheckDetailsRulesParamList> paramList;

        // The description of the rule.
        @NameInMap("RuleDesc")
        public String ruleDesc;

        // The ID of the rule.
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
        // The description of the check item.
        @NameInMap("CheckDesc")
        public String checkDesc;

        // The ID of the check item.
        @NameInMap("CheckId")
        public Long checkId;

        // The check item.
        @NameInMap("CheckItem")
        public String checkItem;

        // An array that consists of the details of rules.
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
        // The alias of the sub-check item.
        @NameInMap("Alias")
        public String alias;

        // An array that consists of the details of custom check items.
        @NameInMap("CheckDetails")
        public java.util.List<DescribeStrategyDetailResponseBodyStrategyRiskTypeWhiteListQueryResultListSubTypesCheckDetails> checkDetails;

        // Indicates whether the sub-risk item is selected. Valid values:
        // 
        // *   **true**: yes
        // *   **false**: no
        @NameInMap("On")
        public Boolean on;

        // The type of the sub-check item.
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
        // The alias of the check item.
        @NameInMap("Alias")
        public String alias;

        // Indicates whether the risk item is selected. Valid values:
        // 
        // *   **true**: yes
        // *   **false**: no
        @NameInMap("On")
        public Boolean on;

        // An array that consists of sub-risk items.
        @NameInMap("SubTypes")
        public java.util.List<DescribeStrategyDetailResponseBodyStrategyRiskTypeWhiteListQueryResultListSubTypes> subTypes;

        // The check item.
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
        // The type of the baseline check policy. Valid values:
        // 
        // *   **common**: standard baseline check policy
        // *   **custom**: custom baseline check policy
        @NameInMap("CustomType")
        public String customType;

        // The check interval of the policy.
        @NameInMap("CycleDays")
        public Integer cycleDays;

        // The time period during which the check starts. Valid values:
        // 
        // *   **0**: 00:00 to 06:00
        // *   **6**: 06:00 to 12:00
        // *   **12**: 12:00 to 18:00
        // *   **18**: 18:00 to 24:00
        @NameInMap("CycleStartTime")
        public Integer cycleStartTime;

        // The time when the baseline check based on the baseline check policy ends.
        @NameInMap("EndTime")
        public String endTime;

        // The ID of the baseline check policy.
        @NameInMap("Id")
        public Integer id;

        // The name of the baseline check policy.
        @NameInMap("Name")
        public String name;

        // The subtype of the baselines.
        @NameInMap("RiskSubTypeName")
        public String riskSubTypeName;

        // An array that consists of the whitelist of risk items.
        @NameInMap("RiskTypeWhiteListQueryResultList")
        public java.util.List<DescribeStrategyDetailResponseBodyStrategyRiskTypeWhiteListQueryResultList> riskTypeWhiteListQueryResultList;

        // The time when the baseline check based on the baseline check policy starts.
        @NameInMap("StartTime")
        public String startTime;

        // The condition by which the baseline check policy is applied to the asset. Valid values:
        // 
        // *   **groupId**: the ID of the asset group
        // *   **uuid**: the UUID of the asset
        @NameInMap("TargetType")
        public String targetType;

        // The type of the baseline check policy. Valid values:
        // 
        // *   **1**: standard baseline check policy
        // *   **2**: custom baseline check policy
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
