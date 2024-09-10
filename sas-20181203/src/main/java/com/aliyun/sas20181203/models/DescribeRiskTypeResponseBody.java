// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeRiskTypeResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>F22037B5-FCE4-5178-A9E7-71798E1F9270</p>
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
         * 
         * <strong>example:</strong>
         * <p>0,1,2,3</p>
         */
        @NameInMap("EnumValue")
        public String enumValue;

        /**
         * <p>The maximum value of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>999</p>
         */
        @NameInMap("MaxValue")
        public Integer maxValue;

        /**
         * <p>The minimum value of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MinValue")
        public Integer minValue;

        /**
         * <p>The default value of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("ParamDefaultValue")
        public String paramDefaultValue;

        /**
         * <p>The description of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>The setting value is 0 means no definition, 1 means success, 2 means failure, 3 means success and failure</p>
         */
        @NameInMap("ParamDesc")
        public String paramDesc;

        /**
         * <p>The name of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>range_val</p>
         */
        @NameInMap("ParamName")
        public String paramName;

        /**
         * <p>The configuration type of the parameter. Valid values:</p>
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
         * <ul>
         * <li><strong>0</strong>: no</li>
         * <li><strong>1</strong>: yes</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
         * 
         * <strong>example:</strong>
         * <p>Please customize the password expiration time detection standard as</p>
         */
        @NameInMap("RuleDesc")
        public String ruleDesc;

        /**
         * <p>The ID of the rule for the baseline.</p>
         * 
         * <strong>example:</strong>
         * <p>audit.audit_policy.auditpolicychange.cus</p>
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
         * 
         * <strong>example:</strong>
         * <p>Set password expiration time, force regular modification of password, reduce password leakage and guess risk.Use non-password login (e.g. key pair) please ignore this item.</p>
         */
        @NameInMap("CheckDesc")
        public String checkDesc;

        /**
         * <p>The ID of the baseline.</p>
         * 
         * <strong>example:</strong>
         * <p>1299</p>
         */
        @NameInMap("CheckId")
        public Long checkId;

        /**
         * <p>The baseline.</p>
         * 
         * <strong>example:</strong>
         * <p>Ensure password expiration period is set.</p>
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
         * 
         * <strong>example:</strong>
         * <p>Redis unauthorized access high exploit vulnerability risk</p>
         */
        @NameInMap("Alias")
        public String alias;

        /**
         * <p>The baseline subtype permission flag of the current user version. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Have access</li>
         * <li><strong>false</strong>: No permissions</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
         * <ul>
         * <li><strong>windows</strong></li>
         * <li><strong>linux</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>linux</p>
         */
        @NameInMap("SupportedOs")
        public String supportedOs;

        /**
         * <p>The name of the baseline subtype.</p>
         * 
         * <strong>example:</strong>
         * <p>hc_exploit_redis</p>
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
         * 
         * <strong>example:</strong>
         * <p>Redis unauthorized access high exploit vulnerability risk</p>
         */
        @NameInMap("Alias")
        public String alias;

        /**
         * <p>The baseline type flag of the current user version. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Have access</li>
         * <li><strong>false</strong>: No permissions</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
         * 
         * <strong>example:</strong>
         * <p>hc_exploit</p>
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
