// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeStrategyDetailResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>C5B28F65-9245-5DC1-B3CF-5F2756A756A8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the baseline check policy.</p>
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
        /**
         * <p>The options that can be selected for the rule parameter if the value of ParamType is set to 2.</p>
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
         * <p>999</p>
         */
        @NameInMap("MaxValue")
        public Integer maxValue;

        /**
         * <p>The minimum value of the rule parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MinValue")
        public Integer minValue;

        /**
         * <p>The default value of the rule parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
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
         * <p>The configured value of the rule parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
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
         * <p>The default value of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("DefaultValue")
        public Integer defaultValue;

        /**
         * <p>Indicates whether the rule can be selected. Valid values:</p>
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
         * <p>The rule parameters.</p>
         */
        @NameInMap("ParamList")
        public java.util.List<DescribeStrategyDetailResponseBodyStrategyRiskTypeWhiteListQueryResultListSubTypesCheckDetailsRulesParamList> paramList;

        /**
         * <p>The description of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>Please customize the password expiration time detection standard as</p>
         */
        @NameInMap("RuleDesc")
        public String ruleDesc;

        /**
         * <p>The rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>login_unlock_deny_pam_faillock.must.cus</p>
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
         * <p>The description of the check item.</p>
         * 
         * <strong>example:</strong>
         * <p>Set password expiration time, force regular modification of password, reduce password leakage and guess risk.Use non-password login (e.g. key pair) please ignore this item.</p>
         */
        @NameInMap("CheckDesc")
        public String checkDesc;

        /**
         * <p>The ID of the check item.</p>
         * 
         * <strong>example:</strong>
         * <p>206</p>
         */
        @NameInMap("CheckId")
        public Long checkId;

        /**
         * <p>The check item.</p>
         * 
         * <strong>example:</strong>
         * <p>Ensure password expiration period is set.</p>
         */
        @NameInMap("CheckItem")
        public String checkItem;

        /**
         * <p>The details of rules.</p>
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
         * <p>The alias of the check item.</p>
         * 
         * <strong>example:</strong>
         * <p>Redis unauthorized access high exploit vulnerability risk</p>
         */
        @NameInMap("Alias")
        public String alias;

        /**
         * <p>The details of custom check items.</p>
         */
        @NameInMap("CheckDetails")
        public java.util.List<DescribeStrategyDetailResponseBodyStrategyRiskTypeWhiteListQueryResultListSubTypesCheckDetails> checkDetails;

        /**
         * <p>Indicates whether the sub-check item is selected. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("On")
        public Boolean on;

        /**
         * <p>The operating system type of the server. Valid values:</p>
         * <ul>
         * <li><strong>windows</strong></li>
         * <li><strong>linux</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>windows</p>
         */
        @NameInMap("SupportedOs")
        public String supportedOs;

        /**
         * <p>The type of the sub-check item.</p>
         * 
         * <strong>example:</strong>
         * <p>hc_exploit_redis</p>
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

        public DescribeStrategyDetailResponseBodyStrategyRiskTypeWhiteListQueryResultListSubTypes setSupportedOs(String supportedOs) {
            this.supportedOs = supportedOs;
            return this;
        }
        public String getSupportedOs() {
            return this.supportedOs;
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
         * <p>The alias of the check item.</p>
         * 
         * <strong>example:</strong>
         * <p>Unauthorized Access</p>
         */
        @NameInMap("Alias")
        public String alias;

        /**
         * <p>Indicates whether the check item is selected. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("On")
        public Boolean on;

        /**
         * <p>The information about sub-check items.</p>
         */
        @NameInMap("SubTypes")
        public java.util.List<DescribeStrategyDetailResponseBodyStrategyRiskTypeWhiteListQueryResultListSubTypes> subTypes;

        /**
         * <p>The name of the check item.</p>
         * 
         * <strong>example:</strong>
         * <p>hc_exploit</p>
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
        /**
         * <p>The type of the baseline check policy that you want to query. Valid values:</p>
         * <ul>
         * <li><strong>common</strong>: standard baseline check policy</li>
         * <li><strong>custom</strong>: custom baseline check policy</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>common</p>
         */
        @NameInMap("CustomType")
        public String customType;

        /**
         * <p>The check interval of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("CycleDays")
        public Integer cycleDays;

        /**
         * <p>The time period during which the check starts. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: 00:00 to 06:00</li>
         * <li><strong>6</strong>: 06:00 to 12:00</li>
         * <li><strong>12</strong>: 12:00 to 18:00</li>
         * <li><strong>18</strong>: 18:00 to 24:00</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CycleStartTime")
        public Integer cycleStartTime;

        /**
         * <p>The end time of the check. Specify the time in the HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>03:00:00</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The ID of the baseline check policy.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("Id")
        public Integer id;

        /**
         * <p>The name of the baseline check policy.</p>
         * 
         * <strong>example:</strong>
         * <p>TestStrategy</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The subtype of the baselines. </p>
         * <blockquote>
         * <p>You can call the <a href="~~DescribeRiskType~~">DescribeRiskType</a> operation to query the subtypes of baselines.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>hc_nginx_linux,tomcat7,hc_mysql_ali,hc_docker</p>
         */
        @NameInMap("RiskSubTypeName")
        public String riskSubTypeName;

        /**
         * <p>The information about the whitelist of risk items.</p>
         */
        @NameInMap("RiskTypeWhiteListQueryResultList")
        public java.util.List<DescribeStrategyDetailResponseBodyStrategyRiskTypeWhiteListQueryResultList> riskTypeWhiteListQueryResultList;

        /**
         * <p>The start time of the check. Specify the time in the HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>02:00:00</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The method that is used to apply the baseline check policy. Valid values:</p>
         * <ul>
         * <li><strong>groupId</strong>: asset groups</li>
         * <li><strong>uuid</strong>: assets</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>groupId</p>
         */
        @NameInMap("TargetType")
        public String targetType;

        /**
         * <p>The type of the baseline check policy. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: standard policies</li>
         * <li><strong>2</strong>: custom policies</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
