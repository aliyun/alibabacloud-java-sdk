// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeRiskTypeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RiskTypes")
    public java.util.List<DescribeRiskTypeResponseBodyRiskTypes> riskTypes;

    public static DescribeRiskTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRiskTypeResponseBody self = new DescribeRiskTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRiskTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRiskTypeResponseBody setRiskTypes(java.util.List<DescribeRiskTypeResponseBodyRiskTypes> riskTypes) {
        this.riskTypes = riskTypes;
        return this;
    }
    public java.util.List<DescribeRiskTypeResponseBodyRiskTypes> getRiskTypes() {
        return this.riskTypes;
    }

    public static class DescribeRiskTypeResponseBodyRiskTypesSubTypesCheckDetailsRulesParamList extends TeaModel {
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

        public static DescribeRiskTypeResponseBodyRiskTypesSubTypesCheckDetailsRulesParamList build(java.util.Map<String, ?> map) throws Exception {
            DescribeRiskTypeResponseBodyRiskTypesSubTypesCheckDetailsRulesParamList self = new DescribeRiskTypeResponseBodyRiskTypesSubTypesCheckDetailsRulesParamList();
            return TeaModel.build(map, self);
        }

        public DescribeRiskTypeResponseBodyRiskTypesSubTypesCheckDetailsRulesParamList setEnumValue(String enumValue) {
            this.enumValue = enumValue;
            return this;
        }
        public String getEnumValue() {
            return this.enumValue;
        }

        public DescribeRiskTypeResponseBodyRiskTypesSubTypesCheckDetailsRulesParamList setMaxValue(Integer maxValue) {
            this.maxValue = maxValue;
            return this;
        }
        public Integer getMaxValue() {
            return this.maxValue;
        }

        public DescribeRiskTypeResponseBodyRiskTypesSubTypesCheckDetailsRulesParamList setMinValue(Integer minValue) {
            this.minValue = minValue;
            return this;
        }
        public Integer getMinValue() {
            return this.minValue;
        }

        public DescribeRiskTypeResponseBodyRiskTypesSubTypesCheckDetailsRulesParamList setParamDefaultValue(String paramDefaultValue) {
            this.paramDefaultValue = paramDefaultValue;
            return this;
        }
        public String getParamDefaultValue() {
            return this.paramDefaultValue;
        }

        public DescribeRiskTypeResponseBodyRiskTypesSubTypesCheckDetailsRulesParamList setParamDesc(String paramDesc) {
            this.paramDesc = paramDesc;
            return this;
        }
        public String getParamDesc() {
            return this.paramDesc;
        }

        public DescribeRiskTypeResponseBodyRiskTypesSubTypesCheckDetailsRulesParamList setParamName(String paramName) {
            this.paramName = paramName;
            return this;
        }
        public String getParamName() {
            return this.paramName;
        }

        public DescribeRiskTypeResponseBodyRiskTypesSubTypesCheckDetailsRulesParamList setParamType(Integer paramType) {
            this.paramType = paramType;
            return this;
        }
        public Integer getParamType() {
            return this.paramType;
        }

    }

    public static class DescribeRiskTypeResponseBodyRiskTypesSubTypesCheckDetailsRules extends TeaModel {
        @NameInMap("DefaultValue")
        public Integer defaultValue;

        @NameInMap("Optional")
        public Integer optional;

        @NameInMap("ParamList")
        public java.util.List<DescribeRiskTypeResponseBodyRiskTypesSubTypesCheckDetailsRulesParamList> paramList;

        @NameInMap("RuleDesc")
        public String ruleDesc;

        @NameInMap("RuleId")
        public String ruleId;

        public static DescribeRiskTypeResponseBodyRiskTypesSubTypesCheckDetailsRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeRiskTypeResponseBodyRiskTypesSubTypesCheckDetailsRules self = new DescribeRiskTypeResponseBodyRiskTypesSubTypesCheckDetailsRules();
            return TeaModel.build(map, self);
        }

        public DescribeRiskTypeResponseBodyRiskTypesSubTypesCheckDetailsRules setDefaultValue(Integer defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public Integer getDefaultValue() {
            return this.defaultValue;
        }

        public DescribeRiskTypeResponseBodyRiskTypesSubTypesCheckDetailsRules setOptional(Integer optional) {
            this.optional = optional;
            return this;
        }
        public Integer getOptional() {
            return this.optional;
        }

        public DescribeRiskTypeResponseBodyRiskTypesSubTypesCheckDetailsRules setParamList(java.util.List<DescribeRiskTypeResponseBodyRiskTypesSubTypesCheckDetailsRulesParamList> paramList) {
            this.paramList = paramList;
            return this;
        }
        public java.util.List<DescribeRiskTypeResponseBodyRiskTypesSubTypesCheckDetailsRulesParamList> getParamList() {
            return this.paramList;
        }

        public DescribeRiskTypeResponseBodyRiskTypesSubTypesCheckDetailsRules setRuleDesc(String ruleDesc) {
            this.ruleDesc = ruleDesc;
            return this;
        }
        public String getRuleDesc() {
            return this.ruleDesc;
        }

        public DescribeRiskTypeResponseBodyRiskTypesSubTypesCheckDetailsRules setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

    }

    public static class DescribeRiskTypeResponseBodyRiskTypesSubTypesCheckDetails extends TeaModel {
        @NameInMap("CheckDesc")
        public String checkDesc;

        @NameInMap("CheckId")
        public Long checkId;

        @NameInMap("CheckItem")
        public String checkItem;

        @NameInMap("Rules")
        public java.util.List<DescribeRiskTypeResponseBodyRiskTypesSubTypesCheckDetailsRules> rules;

        public static DescribeRiskTypeResponseBodyRiskTypesSubTypesCheckDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeRiskTypeResponseBodyRiskTypesSubTypesCheckDetails self = new DescribeRiskTypeResponseBodyRiskTypesSubTypesCheckDetails();
            return TeaModel.build(map, self);
        }

        public DescribeRiskTypeResponseBodyRiskTypesSubTypesCheckDetails setCheckDesc(String checkDesc) {
            this.checkDesc = checkDesc;
            return this;
        }
        public String getCheckDesc() {
            return this.checkDesc;
        }

        public DescribeRiskTypeResponseBodyRiskTypesSubTypesCheckDetails setCheckId(Long checkId) {
            this.checkId = checkId;
            return this;
        }
        public Long getCheckId() {
            return this.checkId;
        }

        public DescribeRiskTypeResponseBodyRiskTypesSubTypesCheckDetails setCheckItem(String checkItem) {
            this.checkItem = checkItem;
            return this;
        }
        public String getCheckItem() {
            return this.checkItem;
        }

        public DescribeRiskTypeResponseBodyRiskTypesSubTypesCheckDetails setRules(java.util.List<DescribeRiskTypeResponseBodyRiskTypesSubTypesCheckDetailsRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<DescribeRiskTypeResponseBodyRiskTypesSubTypesCheckDetailsRules> getRules() {
            return this.rules;
        }

    }

    public static class DescribeRiskTypeResponseBodyRiskTypesSubTypes extends TeaModel {
        @NameInMap("Alias")
        public String alias;

        @NameInMap("CheckDetails")
        public java.util.List<DescribeRiskTypeResponseBodyRiskTypesSubTypesCheckDetails> checkDetails;

        @NameInMap("TypeName")
        public String typeName;

        public static DescribeRiskTypeResponseBodyRiskTypesSubTypes build(java.util.Map<String, ?> map) throws Exception {
            DescribeRiskTypeResponseBodyRiskTypesSubTypes self = new DescribeRiskTypeResponseBodyRiskTypesSubTypes();
            return TeaModel.build(map, self);
        }

        public DescribeRiskTypeResponseBodyRiskTypesSubTypes setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public DescribeRiskTypeResponseBodyRiskTypesSubTypes setCheckDetails(java.util.List<DescribeRiskTypeResponseBodyRiskTypesSubTypesCheckDetails> checkDetails) {
            this.checkDetails = checkDetails;
            return this;
        }
        public java.util.List<DescribeRiskTypeResponseBodyRiskTypesSubTypesCheckDetails> getCheckDetails() {
            return this.checkDetails;
        }

        public DescribeRiskTypeResponseBodyRiskTypesSubTypes setTypeName(String typeName) {
            this.typeName = typeName;
            return this;
        }
        public String getTypeName() {
            return this.typeName;
        }

    }

    public static class DescribeRiskTypeResponseBodyRiskTypes extends TeaModel {
        @NameInMap("Alias")
        public String alias;

        @NameInMap("SubTypes")
        public java.util.List<DescribeRiskTypeResponseBodyRiskTypesSubTypes> subTypes;

        @NameInMap("TypeName")
        public String typeName;

        public static DescribeRiskTypeResponseBodyRiskTypes build(java.util.Map<String, ?> map) throws Exception {
            DescribeRiskTypeResponseBodyRiskTypes self = new DescribeRiskTypeResponseBodyRiskTypes();
            return TeaModel.build(map, self);
        }

        public DescribeRiskTypeResponseBodyRiskTypes setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public DescribeRiskTypeResponseBodyRiskTypes setSubTypes(java.util.List<DescribeRiskTypeResponseBodyRiskTypesSubTypes> subTypes) {
            this.subTypes = subTypes;
            return this;
        }
        public java.util.List<DescribeRiskTypeResponseBodyRiskTypesSubTypes> getSubTypes() {
            return this.subTypes;
        }

        public DescribeRiskTypeResponseBodyRiskTypes setTypeName(String typeName) {
            this.typeName = typeName;
            return this;
        }
        public String getTypeName() {
            return this.typeName;
        }

    }

}
