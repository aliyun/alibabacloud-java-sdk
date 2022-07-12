// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class InsertTmMonitorRuleRequest extends TeaModel {
    @NameInMap("Classification")
    public java.util.Map<String, ?> classification;

    @NameInMap("EndApplyDate")
    public String endApplyDate;

    @NameInMap("NotifyStatus")
    public java.util.Map<String, ?> notifyStatus;

    @NameInMap("RuleKeyword")
    public String ruleKeyword;

    @NameInMap("RuleName")
    public String ruleName;

    @NameInMap("RuleSource")
    public String ruleSource;

    @NameInMap("RuleType")
    public Integer ruleType;

    @NameInMap("StartApplyDate")
    public String startApplyDate;

    public static InsertTmMonitorRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        InsertTmMonitorRuleRequest self = new InsertTmMonitorRuleRequest();
        return TeaModel.build(map, self);
    }

    public InsertTmMonitorRuleRequest setClassification(java.util.Map<String, ?> classification) {
        this.classification = classification;
        return this;
    }
    public java.util.Map<String, ?> getClassification() {
        return this.classification;
    }

    public InsertTmMonitorRuleRequest setEndApplyDate(String endApplyDate) {
        this.endApplyDate = endApplyDate;
        return this;
    }
    public String getEndApplyDate() {
        return this.endApplyDate;
    }

    public InsertTmMonitorRuleRequest setNotifyStatus(java.util.Map<String, ?> notifyStatus) {
        this.notifyStatus = notifyStatus;
        return this;
    }
    public java.util.Map<String, ?> getNotifyStatus() {
        return this.notifyStatus;
    }

    public InsertTmMonitorRuleRequest setRuleKeyword(String ruleKeyword) {
        this.ruleKeyword = ruleKeyword;
        return this;
    }
    public String getRuleKeyword() {
        return this.ruleKeyword;
    }

    public InsertTmMonitorRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public InsertTmMonitorRuleRequest setRuleSource(String ruleSource) {
        this.ruleSource = ruleSource;
        return this;
    }
    public String getRuleSource() {
        return this.ruleSource;
    }

    public InsertTmMonitorRuleRequest setRuleType(Integer ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public Integer getRuleType() {
        return this.ruleType;
    }

    public InsertTmMonitorRuleRequest setStartApplyDate(String startApplyDate) {
        this.startApplyDate = startApplyDate;
        return this;
    }
    public String getStartApplyDate() {
        return this.startApplyDate;
    }

}
