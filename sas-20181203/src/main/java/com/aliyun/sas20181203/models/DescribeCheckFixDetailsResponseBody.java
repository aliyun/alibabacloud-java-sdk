// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCheckFixDetailsResponseBody extends TeaModel {
    /**
     * <p>An array that consists of the parameters.</p>
     */
    @NameInMap("CheckFixDetails")
    public java.util.List<DescribeCheckFixDetailsResponseBodyCheckFixDetails> checkFixDetails;

    /**
     * <p>The number of risk items that can be fixed.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>0DBF1E27-98D8-5EC2-9CF3-4A2E26F6****</p>
     */
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
        /**
         * <p>The options that can be selected for the rule parameter if the value of the ParamType parameter is 2.</p>
         * 
         * <strong>example:</strong>
         * <p>0,1,2,3</p>
         */
        @NameInMap("EnumValue")
        public String enumValue;

        /**
         * <p>The maximum value of the rule parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>24</p>
         */
        @NameInMap("MaxValue")
        public Integer maxValue;

        /**
         * <p>The minimum value of the rule parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("MinValue")
        public Integer minValue;

        /**
         * <p>The default value of the rule parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("ParamDefaultValue")
        public String paramDefaultValue;

        /**
         * <p>The description of the rule parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>The setting value is 0 means no definition, 1 means success, 2 means failure, 3 means success and failure</p>
         */
        @NameInMap("ParamDesc")
        public String paramDesc;

        /**
         * <p>The name of the rule parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>range_val</p>
         */
        @NameInMap("ParamName")
        public String paramName;

        /**
         * <p>The type of the rule parameter. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: input</li>
         * <li><strong>2</strong>: selection</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ParamType")
        public Integer paramType;

        /**
         * <p>The ID of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>pwd_reuse.system_auth</p>
         */
        @NameInMap("RuleId")
        public String ruleId;

        /**
         * <p>The specified value of the rule parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>18</p>
         */
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
        /**
         * <p>The ID of the risk item.</p>
         * 
         * <strong>example:</strong>
         * <p>58</p>
         */
        @NameInMap("CheckId")
        public Long checkId;

        /**
         * <p>The default value of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DefaultValue")
        public Integer defaultValue;

        /**
         * <p>Indicates whether the rule is optional. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: yes</li>
         * <li><strong>0</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Optional")
        public Integer optional;

        /**
         * <p>An array that consists of the rule parameters.</p>
         */
        @NameInMap("ParamList")
        public java.util.List<DescribeCheckFixDetailsResponseBodyCheckFixDetailsRulesParamList> paramList;

        /**
         * <p>The description of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>(/etc/system-auth)Force users not to reuse the number of recently used passwords between 5 and 24</p>
         */
        @NameInMap("RuleDesc")
        public String ruleDesc;

        /**
         * <p>The ID of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>pwd_reuse.system_auth</p>
         */
        @NameInMap("RuleId")
        public String ruleId;

        /**
         * <p>The specified value of the rule parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Value")
        public Integer value;

        /**
         * <p>The name of the variable.</p>
         * 
         * <strong>example:</strong>
         * <p>open</p>
         */
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
        /**
         * <p>The detailed description of the risk item.</p>
         * 
         * <strong>example:</strong>
         * <p>Force users not to reuse recently used passwords to reduce the risk of password guessing attacks</p>
         */
        @NameInMap("CheckDesc")
        public String checkDesc;

        /**
         * <p>The ID of the risk item.</p>
         * 
         * <strong>example:</strong>
         * <p>58</p>
         */
        @NameInMap("CheckId")
        public Long checkId;

        /**
         * <p>The description of the risk item.</p>
         * 
         * <strong>example:</strong>
         * <p>Ensure password reuse is limited</p>
         */
        @NameInMap("CheckItem")
        public String checkItem;

        /**
         * <p>An array consisting of the rules that are supported by the risk item.</p>
         */
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
