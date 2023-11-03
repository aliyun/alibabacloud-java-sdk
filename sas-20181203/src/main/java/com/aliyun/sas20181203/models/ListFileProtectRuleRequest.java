// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListFileProtectRuleRequest extends TeaModel {
    /**
     * <p>The severity of alerts. Valid values:</p>
     * <br>
     * <p>*   0: does not generate alerts</p>
     * <p>*   1: sends notifications</p>
     * <p>*   2: suspicious</p>
     * <p>*   3: high-risk</p>
     */
    @NameInMap("AlertLevel")
    public Integer alertLevel;

    /**
     * <p>The page number.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The handling method of the rule. Valid values:</p>
     * <br>
     * <p>*   pass: allow</p>
     * <p>*   alert</p>
     */
    @NameInMap("RuleAction")
    public String ruleAction;

    /**
     * <p>The name of the rule.</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    public static ListFileProtectRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFileProtectRuleRequest self = new ListFileProtectRuleRequest();
        return TeaModel.build(map, self);
    }

    public ListFileProtectRuleRequest setAlertLevel(Integer alertLevel) {
        this.alertLevel = alertLevel;
        return this;
    }
    public Integer getAlertLevel() {
        return this.alertLevel;
    }

    public ListFileProtectRuleRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListFileProtectRuleRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListFileProtectRuleRequest setRuleAction(String ruleAction) {
        this.ruleAction = ruleAction;
        return this;
    }
    public String getRuleAction() {
        return this.ruleAction;
    }

    public ListFileProtectRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

}
