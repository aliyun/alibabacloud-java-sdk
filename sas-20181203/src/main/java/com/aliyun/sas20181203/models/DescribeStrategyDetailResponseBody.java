// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeStrategyDetailResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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

        @NameInMap("MaxValue")
        public Integer maxValue;

        @NameInMap("MinValue")
        public Integer minValue;

        @NameInMap("ParamDefaultValue")
        public String paramDefaultValue;

        @NameInMap("ParamDesc")
        public String paramDesc;

        @NameInMap("ParamName")
        public String paramName;

        @NameInMap("ParamType")
        public Integer paramType;

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
        @NameInMap("DefaultValue")
        public Integer defaultValue;

        @NameInMap("Optional")
        public Integer optional;

        @NameInMap("ParamList")
        public java.util.List<DescribeStrategyDetailResponseBodyStrategyRiskTypeWhiteListQueryResultListSubTypesCheckDetailsRulesParamList> paramList;

        @NameInMap("RuleDesc")
        public String ruleDesc;

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
        @NameInMap("CheckDesc")
        public String checkDesc;

        @NameInMap("CheckId")
        public Long checkId;

        @NameInMap("CheckItem")
        public String checkItem;

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
        @NameInMap("Alias")
        public String alias;

        @NameInMap("CheckDetails")
        public java.util.List<DescribeStrategyDetailResponseBodyStrategyRiskTypeWhiteListQueryResultListSubTypesCheckDetails> checkDetails;

        @NameInMap("On")
        public Boolean on;

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
        @NameInMap("Alias")
        public String alias;

        @NameInMap("On")
        public Boolean on;

        @NameInMap("SubTypes")
        public java.util.List<DescribeStrategyDetailResponseBodyStrategyRiskTypeWhiteListQueryResultListSubTypes> subTypes;

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

        @NameInMap("CycleDays")
        public Integer cycleDays;

        @NameInMap("CycleStartTime")
        public Integer cycleStartTime;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("Id")
        public Integer id;

        @NameInMap("Name")
        public String name;

        @NameInMap("RiskSubTypeName")
        public String riskSubTypeName;

        @NameInMap("RiskTypeWhiteListQueryResultList")
        public java.util.List<DescribeStrategyDetailResponseBodyStrategyRiskTypeWhiteListQueryResultList> riskTypeWhiteListQueryResultList;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("TargetType")
        public String targetType;

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
