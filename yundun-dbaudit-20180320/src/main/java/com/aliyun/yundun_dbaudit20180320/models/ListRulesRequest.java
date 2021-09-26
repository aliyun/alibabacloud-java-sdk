// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class ListRulesRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("DbId")
    public String dbId;

    @NameInMap("ForegroundType")
    public String foregroundType;

    @NameInMap("RuleName")
    public String ruleName;

    @NameInMap("RuleType")
    public String ruleType;

    @NameInMap("RuleGroupId")
    public String ruleGroupId;

    @NameInMap("RiskLevel")
    public String riskLevel;

    @NameInMap("RuleQuote")
    public Integer ruleQuote;

    @NameInMap("RuleState")
    public Integer ruleState;

    public static ListRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRulesRequest self = new ListRulesRequest();
        return TeaModel.build(map, self);
    }

    public ListRulesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListRulesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListRulesRequest setDbId(String dbId) {
        this.dbId = dbId;
        return this;
    }
    public String getDbId() {
        return this.dbId;
    }

    public ListRulesRequest setForegroundType(String foregroundType) {
        this.foregroundType = foregroundType;
        return this;
    }
    public String getForegroundType() {
        return this.foregroundType;
    }

    public ListRulesRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public ListRulesRequest setRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public String getRuleType() {
        return this.ruleType;
    }

    public ListRulesRequest setRuleGroupId(String ruleGroupId) {
        this.ruleGroupId = ruleGroupId;
        return this;
    }
    public String getRuleGroupId() {
        return this.ruleGroupId;
    }

    public ListRulesRequest setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }
    public String getRiskLevel() {
        return this.riskLevel;
    }

    public ListRulesRequest setRuleQuote(Integer ruleQuote) {
        this.ruleQuote = ruleQuote;
        return this;
    }
    public Integer getRuleQuote() {
        return this.ruleQuote;
    }

    public ListRulesRequest setRuleState(Integer ruleState) {
        this.ruleState = ruleState;
        return this;
    }
    public Integer getRuleState() {
        return this.ruleState;
    }

}
