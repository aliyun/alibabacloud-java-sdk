// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class ConfigDataSetResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ConfigDataSetResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ConfigDataSetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConfigDataSetResponseBody self = new ConfigDataSetResponseBody();
        return TeaModel.build(map, self);
    }

    public ConfigDataSetResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ConfigDataSetResponseBody setData(ConfigDataSetResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ConfigDataSetResponseBodyData getData() {
        return this.data;
    }

    public ConfigDataSetResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ConfigDataSetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ConfigDataSetResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ConfigDataSetResponseBodyDataRuleInfoConditionsConditionBasicInfoCheckRangeAnchor extends TeaModel {
        @NameInMap("Cid")
        public String cid;

        @NameInMap("HitTime")
        public Integer hitTime;

        @NameInMap("Location")
        public String location;

        public static ConfigDataSetResponseBodyDataRuleInfoConditionsConditionBasicInfoCheckRangeAnchor build(java.util.Map<String, ?> map) throws Exception {
            ConfigDataSetResponseBodyDataRuleInfoConditionsConditionBasicInfoCheckRangeAnchor self = new ConfigDataSetResponseBodyDataRuleInfoConditionsConditionBasicInfoCheckRangeAnchor();
            return TeaModel.build(map, self);
        }

        public ConfigDataSetResponseBodyDataRuleInfoConditionsConditionBasicInfoCheckRangeAnchor setCid(String cid) {
            this.cid = cid;
            return this;
        }
        public String getCid() {
            return this.cid;
        }

        public ConfigDataSetResponseBodyDataRuleInfoConditionsConditionBasicInfoCheckRangeAnchor setHitTime(Integer hitTime) {
            this.hitTime = hitTime;
            return this;
        }
        public Integer getHitTime() {
            return this.hitTime;
        }

        public ConfigDataSetResponseBodyDataRuleInfoConditionsConditionBasicInfoCheckRangeAnchor setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

    }

    public static class ConfigDataSetResponseBodyDataRuleInfoConditionsConditionBasicInfoCheckRangeRange extends TeaModel {
        @NameInMap("From")
        public Integer from;

        @NameInMap("To")
        public Integer to;

        public static ConfigDataSetResponseBodyDataRuleInfoConditionsConditionBasicInfoCheckRangeRange build(java.util.Map<String, ?> map) throws Exception {
            ConfigDataSetResponseBodyDataRuleInfoConditionsConditionBasicInfoCheckRangeRange self = new ConfigDataSetResponseBodyDataRuleInfoConditionsConditionBasicInfoCheckRangeRange();
            return TeaModel.build(map, self);
        }

        public ConfigDataSetResponseBodyDataRuleInfoConditionsConditionBasicInfoCheckRangeRange setFrom(Integer from) {
            this.from = from;
            return this;
        }
        public Integer getFrom() {
            return this.from;
        }

        public ConfigDataSetResponseBodyDataRuleInfoConditionsConditionBasicInfoCheckRangeRange setTo(Integer to) {
            this.to = to;
            return this;
        }
        public Integer getTo() {
            return this.to;
        }

    }

    public static class ConfigDataSetResponseBodyDataRuleInfoConditionsConditionBasicInfoCheckRange extends TeaModel {
        @NameInMap("Anchor")
        public ConfigDataSetResponseBodyDataRuleInfoConditionsConditionBasicInfoCheckRangeAnchor anchor;

        @NameInMap("Range")
        public ConfigDataSetResponseBodyDataRuleInfoConditionsConditionBasicInfoCheckRangeRange range;

        @NameInMap("Role")
        public String role;

        @NameInMap("RoleId")
        public Integer roleId;

        public static ConfigDataSetResponseBodyDataRuleInfoConditionsConditionBasicInfoCheckRange build(java.util.Map<String, ?> map) throws Exception {
            ConfigDataSetResponseBodyDataRuleInfoConditionsConditionBasicInfoCheckRange self = new ConfigDataSetResponseBodyDataRuleInfoConditionsConditionBasicInfoCheckRange();
            return TeaModel.build(map, self);
        }

        public ConfigDataSetResponseBodyDataRuleInfoConditionsConditionBasicInfoCheckRange setAnchor(ConfigDataSetResponseBodyDataRuleInfoConditionsConditionBasicInfoCheckRangeAnchor anchor) {
            this.anchor = anchor;
            return this;
        }
        public ConfigDataSetResponseBodyDataRuleInfoConditionsConditionBasicInfoCheckRangeAnchor getAnchor() {
            return this.anchor;
        }

        public ConfigDataSetResponseBodyDataRuleInfoConditionsConditionBasicInfoCheckRange setRange(ConfigDataSetResponseBodyDataRuleInfoConditionsConditionBasicInfoCheckRangeRange range) {
            this.range = range;
            return this;
        }
        public ConfigDataSetResponseBodyDataRuleInfoConditionsConditionBasicInfoCheckRangeRange getRange() {
            return this.range;
        }

        public ConfigDataSetResponseBodyDataRuleInfoConditionsConditionBasicInfoCheckRange setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public ConfigDataSetResponseBodyDataRuleInfoConditionsConditionBasicInfoCheckRange setRoleId(Integer roleId) {
            this.roleId = roleId;
            return this;
        }
        public Integer getRoleId() {
            return this.roleId;
        }

    }

    public static class ConfigDataSetResponseBodyDataRuleInfoConditionsConditionBasicInfoOperatorsOperatorBasicInfoParamKeywords extends TeaModel {
        @NameInMap("Keywords")
        public java.util.List<String> keywords;

        public static ConfigDataSetResponseBodyDataRuleInfoConditionsConditionBasicInfoOperatorsOperatorBasicInfoParamKeywords build(java.util.Map<String, ?> map) throws Exception {
            ConfigDataSetResponseBodyDataRuleInfoConditionsConditionBasicInfoOperatorsOperatorBasicInfoParamKeywords self = new ConfigDataSetResponseBodyDataRuleInfoConditionsConditionBasicInfoOperatorsOperatorBasicInfoParamKeywords();
            return TeaModel.build(map, self);
        }

        public ConfigDataSetResponseBodyDataRuleInfoConditionsConditionBasicInfoOperatorsOperatorBasicInfoParamKeywords setKeywords(java.util.List<String> keywords) {
            this.keywords = keywords;
            return this;
        }
        public java.util.List<String> getKeywords() {
            return this.keywords;
        }

    }

    public static class ConfigDataSetResponseBodyDataRuleInfoConditionsConditionBasicInfoOperatorsOperatorBasicInfoParam extends TeaModel {
        @NameInMap("InSentence")
        public Boolean inSentence;

        @NameInMap("Keywords")
        public ConfigDataSetResponseBodyDataRuleInfoConditionsConditionBasicInfoOperatorsOperatorBasicInfoParamKeywords keywords;

        public static ConfigDataSetResponseBodyDataRuleInfoConditionsConditionBasicInfoOperatorsOperatorBasicInfoParam build(java.util.Map<String, ?> map) throws Exception {
            ConfigDataSetResponseBodyDataRuleInfoConditionsConditionBasicInfoOperatorsOperatorBasicInfoParam self = new ConfigDataSetResponseBodyDataRuleInfoConditionsConditionBasicInfoOperatorsOperatorBasicInfoParam();
            return TeaModel.build(map, self);
        }

        public ConfigDataSetResponseBodyDataRuleInfoConditionsConditionBasicInfoOperatorsOperatorBasicInfoParam setInSentence(Boolean inSentence) {
            this.inSentence = inSentence;
            return this;
        }
        public Boolean getInSentence() {
            return this.inSentence;
        }

        public ConfigDataSetResponseBodyDataRuleInfoConditionsConditionBasicInfoOperatorsOperatorBasicInfoParam setKeywords(ConfigDataSetResponseBodyDataRuleInfoConditionsConditionBasicInfoOperatorsOperatorBasicInfoParamKeywords keywords) {
            this.keywords = keywords;
            return this;
        }
        public ConfigDataSetResponseBodyDataRuleInfoConditionsConditionBasicInfoOperatorsOperatorBasicInfoParamKeywords getKeywords() {
            return this.keywords;
        }

    }

    public static class ConfigDataSetResponseBodyDataRuleInfoConditionsConditionBasicInfoOperatorsOperatorBasicInfo extends TeaModel {
        @NameInMap("Oid")
        public String oid;

        @NameInMap("Param")
        public ConfigDataSetResponseBodyDataRuleInfoConditionsConditionBasicInfoOperatorsOperatorBasicInfoParam param;

        @NameInMap("Type")
        public String type;

        public static ConfigDataSetResponseBodyDataRuleInfoConditionsConditionBasicInfoOperatorsOperatorBasicInfo build(java.util.Map<String, ?> map) throws Exception {
            ConfigDataSetResponseBodyDataRuleInfoConditionsConditionBasicInfoOperatorsOperatorBasicInfo self = new ConfigDataSetResponseBodyDataRuleInfoConditionsConditionBasicInfoOperatorsOperatorBasicInfo();
            return TeaModel.build(map, self);
        }

        public ConfigDataSetResponseBodyDataRuleInfoConditionsConditionBasicInfoOperatorsOperatorBasicInfo setOid(String oid) {
            this.oid = oid;
            return this;
        }
        public String getOid() {
            return this.oid;
        }

        public ConfigDataSetResponseBodyDataRuleInfoConditionsConditionBasicInfoOperatorsOperatorBasicInfo setParam(ConfigDataSetResponseBodyDataRuleInfoConditionsConditionBasicInfoOperatorsOperatorBasicInfoParam param) {
            this.param = param;
            return this;
        }
        public ConfigDataSetResponseBodyDataRuleInfoConditionsConditionBasicInfoOperatorsOperatorBasicInfoParam getParam() {
            return this.param;
        }

        public ConfigDataSetResponseBodyDataRuleInfoConditionsConditionBasicInfoOperatorsOperatorBasicInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ConfigDataSetResponseBodyDataRuleInfoConditionsConditionBasicInfoOperators extends TeaModel {
        @NameInMap("OperatorBasicInfo")
        public java.util.List<ConfigDataSetResponseBodyDataRuleInfoConditionsConditionBasicInfoOperatorsOperatorBasicInfo> operatorBasicInfo;

        public static ConfigDataSetResponseBodyDataRuleInfoConditionsConditionBasicInfoOperators build(java.util.Map<String, ?> map) throws Exception {
            ConfigDataSetResponseBodyDataRuleInfoConditionsConditionBasicInfoOperators self = new ConfigDataSetResponseBodyDataRuleInfoConditionsConditionBasicInfoOperators();
            return TeaModel.build(map, self);
        }

        public ConfigDataSetResponseBodyDataRuleInfoConditionsConditionBasicInfoOperators setOperatorBasicInfo(java.util.List<ConfigDataSetResponseBodyDataRuleInfoConditionsConditionBasicInfoOperatorsOperatorBasicInfo> operatorBasicInfo) {
            this.operatorBasicInfo = operatorBasicInfo;
            return this;
        }
        public java.util.List<ConfigDataSetResponseBodyDataRuleInfoConditionsConditionBasicInfoOperatorsOperatorBasicInfo> getOperatorBasicInfo() {
            return this.operatorBasicInfo;
        }

    }

    public static class ConfigDataSetResponseBodyDataRuleInfoConditionsConditionBasicInfo extends TeaModel {
        @NameInMap("CheckRange")
        public ConfigDataSetResponseBodyDataRuleInfoConditionsConditionBasicInfoCheckRange checkRange;

        @NameInMap("Cid")
        public String cid;

        @NameInMap("Lambda")
        public String lambda;

        @NameInMap("Operators")
        public ConfigDataSetResponseBodyDataRuleInfoConditionsConditionBasicInfoOperators operators;

        public static ConfigDataSetResponseBodyDataRuleInfoConditionsConditionBasicInfo build(java.util.Map<String, ?> map) throws Exception {
            ConfigDataSetResponseBodyDataRuleInfoConditionsConditionBasicInfo self = new ConfigDataSetResponseBodyDataRuleInfoConditionsConditionBasicInfo();
            return TeaModel.build(map, self);
        }

        public ConfigDataSetResponseBodyDataRuleInfoConditionsConditionBasicInfo setCheckRange(ConfigDataSetResponseBodyDataRuleInfoConditionsConditionBasicInfoCheckRange checkRange) {
            this.checkRange = checkRange;
            return this;
        }
        public ConfigDataSetResponseBodyDataRuleInfoConditionsConditionBasicInfoCheckRange getCheckRange() {
            return this.checkRange;
        }

        public ConfigDataSetResponseBodyDataRuleInfoConditionsConditionBasicInfo setCid(String cid) {
            this.cid = cid;
            return this;
        }
        public String getCid() {
            return this.cid;
        }

        public ConfigDataSetResponseBodyDataRuleInfoConditionsConditionBasicInfo setLambda(String lambda) {
            this.lambda = lambda;
            return this;
        }
        public String getLambda() {
            return this.lambda;
        }

        public ConfigDataSetResponseBodyDataRuleInfoConditionsConditionBasicInfo setOperators(ConfigDataSetResponseBodyDataRuleInfoConditionsConditionBasicInfoOperators operators) {
            this.operators = operators;
            return this;
        }
        public ConfigDataSetResponseBodyDataRuleInfoConditionsConditionBasicInfoOperators getOperators() {
            return this.operators;
        }

    }

    public static class ConfigDataSetResponseBodyDataRuleInfoConditions extends TeaModel {
        @NameInMap("ConditionBasicInfo")
        public java.util.List<ConfigDataSetResponseBodyDataRuleInfoConditionsConditionBasicInfo> conditionBasicInfo;

        public static ConfigDataSetResponseBodyDataRuleInfoConditions build(java.util.Map<String, ?> map) throws Exception {
            ConfigDataSetResponseBodyDataRuleInfoConditions self = new ConfigDataSetResponseBodyDataRuleInfoConditions();
            return TeaModel.build(map, self);
        }

        public ConfigDataSetResponseBodyDataRuleInfoConditions setConditionBasicInfo(java.util.List<ConfigDataSetResponseBodyDataRuleInfoConditionsConditionBasicInfo> conditionBasicInfo) {
            this.conditionBasicInfo = conditionBasicInfo;
            return this;
        }
        public java.util.List<ConfigDataSetResponseBodyDataRuleInfoConditionsConditionBasicInfo> getConditionBasicInfo() {
            return this.conditionBasicInfo;
        }

    }

    public static class ConfigDataSetResponseBodyDataRuleInfoRulesRuleBasicInfo extends TeaModel {
        @NameInMap("ExternalProperty")
        public Integer externalProperty;

        @NameInMap("Lambda")
        public String lambda;

        @NameInMap("Rid")
        public String rid;

        public static ConfigDataSetResponseBodyDataRuleInfoRulesRuleBasicInfo build(java.util.Map<String, ?> map) throws Exception {
            ConfigDataSetResponseBodyDataRuleInfoRulesRuleBasicInfo self = new ConfigDataSetResponseBodyDataRuleInfoRulesRuleBasicInfo();
            return TeaModel.build(map, self);
        }

        public ConfigDataSetResponseBodyDataRuleInfoRulesRuleBasicInfo setExternalProperty(Integer externalProperty) {
            this.externalProperty = externalProperty;
            return this;
        }
        public Integer getExternalProperty() {
            return this.externalProperty;
        }

        public ConfigDataSetResponseBodyDataRuleInfoRulesRuleBasicInfo setLambda(String lambda) {
            this.lambda = lambda;
            return this;
        }
        public String getLambda() {
            return this.lambda;
        }

        public ConfigDataSetResponseBodyDataRuleInfoRulesRuleBasicInfo setRid(String rid) {
            this.rid = rid;
            return this;
        }
        public String getRid() {
            return this.rid;
        }

    }

    public static class ConfigDataSetResponseBodyDataRuleInfoRules extends TeaModel {
        @NameInMap("RuleBasicInfo")
        public java.util.List<ConfigDataSetResponseBodyDataRuleInfoRulesRuleBasicInfo> ruleBasicInfo;

        public static ConfigDataSetResponseBodyDataRuleInfoRules build(java.util.Map<String, ?> map) throws Exception {
            ConfigDataSetResponseBodyDataRuleInfoRules self = new ConfigDataSetResponseBodyDataRuleInfoRules();
            return TeaModel.build(map, self);
        }

        public ConfigDataSetResponseBodyDataRuleInfoRules setRuleBasicInfo(java.util.List<ConfigDataSetResponseBodyDataRuleInfoRulesRuleBasicInfo> ruleBasicInfo) {
            this.ruleBasicInfo = ruleBasicInfo;
            return this;
        }
        public java.util.List<ConfigDataSetResponseBodyDataRuleInfoRulesRuleBasicInfo> getRuleBasicInfo() {
            return this.ruleBasicInfo;
        }

    }

    public static class ConfigDataSetResponseBodyDataRuleInfo extends TeaModel {
        @NameInMap("Conditions")
        public ConfigDataSetResponseBodyDataRuleInfoConditions conditions;

        @NameInMap("Rules")
        public ConfigDataSetResponseBodyDataRuleInfoRules rules;

        public static ConfigDataSetResponseBodyDataRuleInfo build(java.util.Map<String, ?> map) throws Exception {
            ConfigDataSetResponseBodyDataRuleInfo self = new ConfigDataSetResponseBodyDataRuleInfo();
            return TeaModel.build(map, self);
        }

        public ConfigDataSetResponseBodyDataRuleInfo setConditions(ConfigDataSetResponseBodyDataRuleInfoConditions conditions) {
            this.conditions = conditions;
            return this;
        }
        public ConfigDataSetResponseBodyDataRuleInfoConditions getConditions() {
            return this.conditions;
        }

        public ConfigDataSetResponseBodyDataRuleInfo setRules(ConfigDataSetResponseBodyDataRuleInfoRules rules) {
            this.rules = rules;
            return this;
        }
        public ConfigDataSetResponseBodyDataRuleInfoRules getRules() {
            return this.rules;
        }

    }

    public static class ConfigDataSetResponseBodyData extends TeaModel {
        @NameInMap("ChannelType")
        public Integer channelType;

        @NameInMap("JudgeType")
        public Integer judgeType;

        @NameInMap("RoleConfigStatus")
        public Integer roleConfigStatus;

        @NameInMap("RuleInfo")
        public ConfigDataSetResponseBodyDataRuleInfo ruleInfo;

        @NameInMap("SetId")
        public Long setId;

        public static ConfigDataSetResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ConfigDataSetResponseBodyData self = new ConfigDataSetResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ConfigDataSetResponseBodyData setChannelType(Integer channelType) {
            this.channelType = channelType;
            return this;
        }
        public Integer getChannelType() {
            return this.channelType;
        }

        public ConfigDataSetResponseBodyData setJudgeType(Integer judgeType) {
            this.judgeType = judgeType;
            return this;
        }
        public Integer getJudgeType() {
            return this.judgeType;
        }

        public ConfigDataSetResponseBodyData setRoleConfigStatus(Integer roleConfigStatus) {
            this.roleConfigStatus = roleConfigStatus;
            return this;
        }
        public Integer getRoleConfigStatus() {
            return this.roleConfigStatus;
        }

        public ConfigDataSetResponseBodyData setRuleInfo(ConfigDataSetResponseBodyDataRuleInfo ruleInfo) {
            this.ruleInfo = ruleInfo;
            return this;
        }
        public ConfigDataSetResponseBodyDataRuleInfo getRuleInfo() {
            return this.ruleInfo;
        }

        public ConfigDataSetResponseBodyData setSetId(Long setId) {
            this.setId = setId;
            return this;
        }
        public Long getSetId() {
            return this.setId;
        }

    }

}
