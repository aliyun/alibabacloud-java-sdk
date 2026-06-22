// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListFileProtectClientRuleRequest extends TeaModel {
    /**
     * <p>The alert notification level. Valid values:</p>
     * <ul>
     * <li><p>0: no alert</p>
     * </li>
     * <li><p>1: reminder</p>
     * </li>
     * <li><p>2: suspicious</p>
     * </li>
     * <li><p>3: high-risk.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("AlertLevel")
    public Integer alertLevel;

    /**
     * <p>The page number of the current page in a paged query.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The maximum number of entries per page for a paged query.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The operating system type. Valid values:</p>
     * <ul>
     * <li><strong>windows</strong>: Windows</li>
     * <li><strong>linux</strong>: Linux.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>linux</p>
     */
    @NameInMap("Platform")
    public String platform;

    /**
     * <p>The rule action. Valid values:</p>
     * <ul>
     * <li><p><strong>block</strong>: blocks the request.</p>
     * </li>
     * <li><p><strong>monitor</strong>: monitors the request.</p>
     * </li>
     * <li><p><strong>pass</strong>: allows the request.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>pass</p>
     */
    @NameInMap("RuleAction")
    public String ruleAction;

    /**
     * <p>The rule name.</p>
     * 
     * <strong>example:</strong>
     * <p>tetsRule</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    public static ListFileProtectClientRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFileProtectClientRuleRequest self = new ListFileProtectClientRuleRequest();
        return TeaModel.build(map, self);
    }

    public ListFileProtectClientRuleRequest setAlertLevel(Integer alertLevel) {
        this.alertLevel = alertLevel;
        return this;
    }
    public Integer getAlertLevel() {
        return this.alertLevel;
    }

    public ListFileProtectClientRuleRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListFileProtectClientRuleRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListFileProtectClientRuleRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public ListFileProtectClientRuleRequest setRuleAction(String ruleAction) {
        this.ruleAction = ruleAction;
        return this;
    }
    public String getRuleAction() {
        return this.ruleAction;
    }

    public ListFileProtectClientRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

}
