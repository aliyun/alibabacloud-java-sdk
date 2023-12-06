// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeRiskTypeResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>An array that consists of the information about baseline types.</p>
     */
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
        /**
         * <p>If the value of paramType is 1, this parameter is empty. If the value of paramType is 2, this parameter provides the options that can be selected for paramType.</p>
         */
        @NameInMap("EnumValue")
        public String enumValue;

        /**
         * <p>The maximum value of the parameter.</p>
         */
        @NameInMap("MaxValue")
        public Integer maxValue;

        /**
         * <p>The minimum value of the parameter.</p>
         */
        @NameInMap("MinValue")
        public Integer minValue;

        /**
         * <p>The default value of the parameter.</p>
         */
        @NameInMap("ParamDefaultValue")
        public String paramDefaultValue;

        /**
         * <p>The description of the parameter.</p>
         */
        @NameInMap("ParamDesc")
        public String paramDesc;

        /**
         * <p>The name of the parameter.</p>
         */
        @NameInMap("ParamName")
        public String paramName;

        /**
         * <p>The configuration type of the parameter. Valid values:</p>
         * <br>
         * <p>*   **1**: input</p>
         * <p>*   **2**: selection</p>
         */
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
        /**
         * <p>Indicates whether the baseline can be edited. Valid values:</p>
         * <br>
         * <p>*   **0**: no</p>
         * <p>*   **1**: yes</p>
         */
        @NameInMap("Optional")
        public Integer optional;

        /**
         * <p>An array that consists of the parameters in the rule for the baseline.</p>
         */
        @NameInMap("ParamList")
        public java.util.List<DescribeRiskTypeResponseBodyRiskTypesSubTypesCheckDetailsRulesParamList> paramList;

        /**
         * <p>The description of the rule for the baseline.</p>
         */
        @NameInMap("RuleDesc")
        public String ruleDesc;

        /**
         * <p>The ID of the rule for the baseline.</p>
         */
        @NameInMap("RuleId")
        public String ruleId;

        public static DescribeRiskTypeResponseBodyRiskTypesSubTypesCheckDetailsRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeRiskTypeResponseBodyRiskTypesSubTypesCheckDetailsRules self = new DescribeRiskTypeResponseBodyRiskTypesSubTypesCheckDetailsRules();
            return TeaModel.build(map, self);
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
        /**
         * <p>The description of the baseline.</p>
         */
        @NameInMap("CheckDesc")
        public String checkDesc;

        /**
         * <p>The ID of the baseline.</p>
         */
        @NameInMap("CheckId")
        public Long checkId;

        /**
         * <p>The baseline.</p>
         */
        @NameInMap("CheckItem")
        public String checkItem;

        /**
         * <p>An array that consists of the rule details about the baseline.</p>
         */
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
        /**
         * <p>The alias of the baseline subtype.</p>
         */
        @NameInMap("Alias")
        public String alias;

        /**
         * <p>The baseline subtype permission flag of the current user version. Valid values:</p>
         * <br>
         * <p>- **true**: Have access</p>
         * <p>- **false**: No permissions</p>
         */
        @NameInMap("AuthFlag")
        public Boolean authFlag;

        /**
         * <p>An array that consists of the check details about the baseline subtype.</p>
         */
        @NameInMap("CheckDetails")
        public java.util.List<DescribeRiskTypeResponseBodyRiskTypesSubTypesCheckDetails> checkDetails;

        /**
         * <p>The operating system type of the server. Valid values:</p>
         * <br>
         * <p>- **windows**</p>
         * <p>- **linux**</p>
         */
        @NameInMap("SupportedOs")
        public String supportedOs;

        /**
         * <p>The name of the baseline subtype.</p>
         */
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

        public DescribeRiskTypeResponseBodyRiskTypesSubTypes setAuthFlag(Boolean authFlag) {
            this.authFlag = authFlag;
            return this;
        }
        public Boolean getAuthFlag() {
            return this.authFlag;
        }

        public DescribeRiskTypeResponseBodyRiskTypesSubTypes setCheckDetails(java.util.List<DescribeRiskTypeResponseBodyRiskTypesSubTypesCheckDetails> checkDetails) {
            this.checkDetails = checkDetails;
            return this;
        }
        public java.util.List<DescribeRiskTypeResponseBodyRiskTypesSubTypesCheckDetails> getCheckDetails() {
            return this.checkDetails;
        }

        public DescribeRiskTypeResponseBodyRiskTypesSubTypes setSupportedOs(String supportedOs) {
            this.supportedOs = supportedOs;
            return this;
        }
        public String getSupportedOs() {
            return this.supportedOs;
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
        /**
         * <p>The alias of the baseline type.</p>
         */
        @NameInMap("Alias")
        public String alias;

        /**
         * <p>The baseline type flag of the current user version. Valid values:</p>
         * <br>
         * <p>- **true**: Have access</p>
         * <p>- **false**: No permissions</p>
         */
        @NameInMap("AuthFlag")
        public Boolean authFlag;

        /**
         * <p>An array that consists of the information about baseline subtypes.</p>
         */
        @NameInMap("SubTypes")
        public java.util.List<DescribeRiskTypeResponseBodyRiskTypesSubTypes> subTypes;

        /**
         * <p>The name of the baseline type.</p>
         */
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

        public DescribeRiskTypeResponseBodyRiskTypes setAuthFlag(Boolean authFlag) {
            this.authFlag = authFlag;
            return this;
        }
        public Boolean getAuthFlag() {
            return this.authFlag;
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
