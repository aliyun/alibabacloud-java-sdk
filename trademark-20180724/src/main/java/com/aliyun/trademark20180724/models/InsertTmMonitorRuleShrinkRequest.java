// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class InsertTmMonitorRuleShrinkRequest extends TeaModel {
    @NameInMap("RuleSource")
    public String ruleSource;

    @NameInMap("RuleName")
    public String ruleName;

    @NameInMap("RuleType")
    public Integer ruleType;

    @NameInMap("RuleKeyword")
    public String ruleKeyword;

    @NameInMap("StartApplyDate")
    public String startApplyDate;

    @NameInMap("EndApplyDate")
    public String endApplyDate;

    @NameInMap("Classification")
    public String classificationShrink;

    @NameInMap("NotifyStatus")
    public String notifyStatusShrink;

    public static InsertTmMonitorRuleShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        InsertTmMonitorRuleShrinkRequest self = new InsertTmMonitorRuleShrinkRequest();
        return TeaModel.build(map, self);
    }

    public InsertTmMonitorRuleShrinkRequest setRuleSource(String ruleSource) {
        this.ruleSource = ruleSource;
        return this;
    }
    public String getRuleSource() {
        return this.ruleSource;
    }

    public InsertTmMonitorRuleShrinkRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public InsertTmMonitorRuleShrinkRequest setRuleType(Integer ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public Integer getRuleType() {
        return this.ruleType;
    }

    public InsertTmMonitorRuleShrinkRequest setRuleKeyword(String ruleKeyword) {
        this.ruleKeyword = ruleKeyword;
        return this;
    }
    public String getRuleKeyword() {
        return this.ruleKeyword;
    }

    public InsertTmMonitorRuleShrinkRequest setStartApplyDate(String startApplyDate) {
        this.startApplyDate = startApplyDate;
        return this;
    }
    public String getStartApplyDate() {
        return this.startApplyDate;
    }

    public InsertTmMonitorRuleShrinkRequest setEndApplyDate(String endApplyDate) {
        this.endApplyDate = endApplyDate;
        return this;
    }
    public String getEndApplyDate() {
        return this.endApplyDate;
    }

    public InsertTmMonitorRuleShrinkRequest setClassificationShrink(String classificationShrink) {
        this.classificationShrink = classificationShrink;
        return this;
    }
    public String getClassificationShrink() {
        return this.classificationShrink;
    }

    public InsertTmMonitorRuleShrinkRequest setNotifyStatusShrink(String notifyStatusShrink) {
        this.notifyStatusShrink = notifyStatusShrink;
        return this;
    }
    public String getNotifyStatusShrink() {
        return this.notifyStatusShrink;
    }

}
