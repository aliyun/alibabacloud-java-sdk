// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCheckFixDetailsResponseBody extends TeaModel {
    @NameInMap("CheckFixDetails")
    public java.util.List<DescribeCheckFixDetailsResponseBodyCheckFixDetails> checkFixDetails;

    @NameInMap("Count")
    public Integer count;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCheckFixDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCheckFixDetailsResponseBody self = new DescribeCheckFixDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCheckFixDetailsResponseBody setCheckFixDetails(java.util.List<DescribeCheckFixDetailsResponseBodyCheckFixDetails> checkFixDetails) {
        this.checkFixDetails = checkFixDetails;
        return this;
    }
    public java.util.List<DescribeCheckFixDetailsResponseBodyCheckFixDetails> getCheckFixDetails() {
        return this.checkFixDetails;
    }

    public DescribeCheckFixDetailsResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public DescribeCheckFixDetailsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeCheckFixDetailsResponseBodyCheckFixDetailsRulesParamList extends TeaModel {
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

        @NameInMap("RuleId")
        public String ruleId;

        @NameInMap("Value")
        public String value;

        public static DescribeCheckFixDetailsResponseBodyCheckFixDetailsRulesParamList build(java.util.Map<String, ?> map) throws Exception {
            DescribeCheckFixDetailsResponseBodyCheckFixDetailsRulesParamList self = new DescribeCheckFixDetailsResponseBodyCheckFixDetailsRulesParamList();
            return TeaModel.build(map, self);
        }

        public DescribeCheckFixDetailsResponseBodyCheckFixDetailsRulesParamList setEnumValue(String enumValue) {
            this.enumValue = enumValue;
            return this;
        }
        public String getEnumValue() {
            return this.enumValue;
        }

        public DescribeCheckFixDetailsResponseBodyCheckFixDetailsRulesParamList setMaxValue(Integer maxValue) {
            this.maxValue = maxValue;
            return this;
        }
        public Integer getMaxValue() {
            return this.maxValue;
        }

        public DescribeCheckFixDetailsResponseBodyCheckFixDetailsRulesParamList setMinValue(Integer minValue) {
            this.minValue = minValue;
            return this;
        }
        public Integer getMinValue() {
            return this.minValue;
        }

        public DescribeCheckFixDetailsResponseBodyCheckFixDetailsRulesParamList setParamDefaultValue(String paramDefaultValue) {
            this.paramDefaultValue = paramDefaultValue;
            return this;
        }
        public String getParamDefaultValue() {
            return this.paramDefaultValue;
        }

        public DescribeCheckFixDetailsResponseBodyCheckFixDetailsRulesParamList setParamDesc(String paramDesc) {
            this.paramDesc = paramDesc;
            return this;
        }
        public String getParamDesc() {
            return this.paramDesc;
        }

        public DescribeCheckFixDetailsResponseBodyCheckFixDetailsRulesParamList setParamName(String paramName) {
            this.paramName = paramName;
            return this;
        }
        public String getParamName() {
            return this.paramName;
        }

        public DescribeCheckFixDetailsResponseBodyCheckFixDetailsRulesParamList setParamType(Integer paramType) {
            this.paramType = paramType;
            return this;
        }
        public Integer getParamType() {
            return this.paramType;
        }

        public DescribeCheckFixDetailsResponseBodyCheckFixDetailsRulesParamList setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public DescribeCheckFixDetailsResponseBodyCheckFixDetailsRulesParamList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeCheckFixDetailsResponseBodyCheckFixDetailsRules extends TeaModel {
        @NameInMap("CheckId")
        public Long checkId;

        @NameInMap("DefaultValue")
        public Integer defaultValue;

        @NameInMap("Optional")
        public Integer optional;

        @NameInMap("ParamList")
        public java.util.List<DescribeCheckFixDetailsResponseBodyCheckFixDetailsRulesParamList> paramList;

        @NameInMap("RuleDesc")
        public String ruleDesc;

        @NameInMap("RuleId")
        public String ruleId;

        @NameInMap("Value")
        public Integer value;

        @NameInMap("VarName")
        public String varName;

        public static DescribeCheckFixDetailsResponseBodyCheckFixDetailsRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeCheckFixDetailsResponseBodyCheckFixDetailsRules self = new DescribeCheckFixDetailsResponseBodyCheckFixDetailsRules();
            return TeaModel.build(map, self);
        }

        public DescribeCheckFixDetailsResponseBodyCheckFixDetailsRules setCheckId(Long checkId) {
            this.checkId = checkId;
            return this;
        }
        public Long getCheckId() {
            return this.checkId;
        }

        public DescribeCheckFixDetailsResponseBodyCheckFixDetailsRules setDefaultValue(Integer defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public Integer getDefaultValue() {
            return this.defaultValue;
        }

        public DescribeCheckFixDetailsResponseBodyCheckFixDetailsRules setOptional(Integer optional) {
            this.optional = optional;
            return this;
        }
        public Integer getOptional() {
            return this.optional;
        }

        public DescribeCheckFixDetailsResponseBodyCheckFixDetailsRules setParamList(java.util.List<DescribeCheckFixDetailsResponseBodyCheckFixDetailsRulesParamList> paramList) {
            this.paramList = paramList;
            return this;
        }
        public java.util.List<DescribeCheckFixDetailsResponseBodyCheckFixDetailsRulesParamList> getParamList() {
            return this.paramList;
        }

        public DescribeCheckFixDetailsResponseBodyCheckFixDetailsRules setRuleDesc(String ruleDesc) {
            this.ruleDesc = ruleDesc;
            return this;
        }
        public String getRuleDesc() {
            return this.ruleDesc;
        }

        public DescribeCheckFixDetailsResponseBodyCheckFixDetailsRules setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public DescribeCheckFixDetailsResponseBodyCheckFixDetailsRules setValue(Integer value) {
            this.value = value;
            return this;
        }
        public Integer getValue() {
            return this.value;
        }

        public DescribeCheckFixDetailsResponseBodyCheckFixDetailsRules setVarName(String varName) {
            this.varName = varName;
            return this;
        }
        public String getVarName() {
            return this.varName;
        }

    }

    public static class DescribeCheckFixDetailsResponseBodyCheckFixDetails extends TeaModel {
        @NameInMap("CheckDesc")
        public String checkDesc;

        @NameInMap("CheckId")
        public Long checkId;

        @NameInMap("CheckItem")
        public String checkItem;

        @NameInMap("Rules")
        public java.util.List<DescribeCheckFixDetailsResponseBodyCheckFixDetailsRules> rules;

        public static DescribeCheckFixDetailsResponseBodyCheckFixDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeCheckFixDetailsResponseBodyCheckFixDetails self = new DescribeCheckFixDetailsResponseBodyCheckFixDetails();
            return TeaModel.build(map, self);
        }

        public DescribeCheckFixDetailsResponseBodyCheckFixDetails setCheckDesc(String checkDesc) {
            this.checkDesc = checkDesc;
            return this;
        }
        public String getCheckDesc() {
            return this.checkDesc;
        }

        public DescribeCheckFixDetailsResponseBodyCheckFixDetails setCheckId(Long checkId) {
            this.checkId = checkId;
            return this;
        }
        public Long getCheckId() {
            return this.checkId;
        }

        public DescribeCheckFixDetailsResponseBodyCheckFixDetails setCheckItem(String checkItem) {
            this.checkItem = checkItem;
            return this;
        }
        public String getCheckItem() {
            return this.checkItem;
        }

        public DescribeCheckFixDetailsResponseBodyCheckFixDetails setRules(java.util.List<DescribeCheckFixDetailsResponseBodyCheckFixDetailsRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<DescribeCheckFixDetailsResponseBodyCheckFixDetailsRules> getRules() {
            return this.rules;
        }

    }

}
