// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteFileProtectClientRuleRequest extends TeaModel {
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
     * <p>The list of excluded policy IDs.</p>
     */
    @NameInMap("ExcludeIdList")
    public java.util.List<Long> excludeIdList;

    /**
     * <p>The list of policy IDs.</p>
     */
    @NameInMap("IdList")
    public java.util.List<Long> idList;

    /**
     * <p>The type of the operating system. Valid values:</p>
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
     * <p>The action to take when the rule is triggered. Valid values:</p>
     * <ul>
     * <li><strong>monitor</strong>: Alert.</li>
     * <li><strong>block</strong>: Block.</li>
     * <li><strong>pass</strong>: Allow.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>pass</p>
     */
    @NameInMap("RuleAction")
    public String ruleAction;

    /**
     * <p>The name of the rule.</p>
     * 
     * <strong>example:</strong>
     * <p>text-001</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>Specifies whether to select all rules.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SelectAll")
    public Boolean selectAll;

    public static DeleteFileProtectClientRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteFileProtectClientRuleRequest self = new DeleteFileProtectClientRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteFileProtectClientRuleRequest setAlertLevel(Integer alertLevel) {
        this.alertLevel = alertLevel;
        return this;
    }
    public Integer getAlertLevel() {
        return this.alertLevel;
    }

    public DeleteFileProtectClientRuleRequest setExcludeIdList(java.util.List<Long> excludeIdList) {
        this.excludeIdList = excludeIdList;
        return this;
    }
    public java.util.List<Long> getExcludeIdList() {
        return this.excludeIdList;
    }

    public DeleteFileProtectClientRuleRequest setIdList(java.util.List<Long> idList) {
        this.idList = idList;
        return this;
    }
    public java.util.List<Long> getIdList() {
        return this.idList;
    }

    public DeleteFileProtectClientRuleRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public DeleteFileProtectClientRuleRequest setRuleAction(String ruleAction) {
        this.ruleAction = ruleAction;
        return this;
    }
    public String getRuleAction() {
        return this.ruleAction;
    }

    public DeleteFileProtectClientRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public DeleteFileProtectClientRuleRequest setSelectAll(Boolean selectAll) {
        this.selectAll = selectAll;
        return this;
    }
    public Boolean getSelectAll() {
        return this.selectAll;
    }

}
