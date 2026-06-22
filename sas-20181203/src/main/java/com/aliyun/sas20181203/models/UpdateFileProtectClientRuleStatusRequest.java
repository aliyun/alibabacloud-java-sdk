// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateFileProtectClientRuleStatusRequest extends TeaModel {
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
     * <p>The list of excluded rule IDs.</p>
     */
    @NameInMap("ExcludeIdList")
    public java.util.List<Long> excludeIdList;

    /**
     * <p>The list of rule IDs.</p>
     */
    @NameInMap("IdList")
    public java.util.List<Long> idList;

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
     * <li><p><strong>block</strong>: Block.</p>
     * </li>
     * <li><p><strong>monitor</strong>: Monitor.</p>
     * </li>
     * <li><p><strong>pass</strong>: Allow.</p>
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
     * <p>test</p>
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

    /**
     * <p>The policy status. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: disabled.</li>
     * <li><strong>1</strong>: enabled.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Status")
    public Integer status;

    public static UpdateFileProtectClientRuleStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFileProtectClientRuleStatusRequest self = new UpdateFileProtectClientRuleStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFileProtectClientRuleStatusRequest setAlertLevel(Integer alertLevel) {
        this.alertLevel = alertLevel;
        return this;
    }
    public Integer getAlertLevel() {
        return this.alertLevel;
    }

    public UpdateFileProtectClientRuleStatusRequest setExcludeIdList(java.util.List<Long> excludeIdList) {
        this.excludeIdList = excludeIdList;
        return this;
    }
    public java.util.List<Long> getExcludeIdList() {
        return this.excludeIdList;
    }

    public UpdateFileProtectClientRuleStatusRequest setIdList(java.util.List<Long> idList) {
        this.idList = idList;
        return this;
    }
    public java.util.List<Long> getIdList() {
        return this.idList;
    }

    public UpdateFileProtectClientRuleStatusRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public UpdateFileProtectClientRuleStatusRequest setRuleAction(String ruleAction) {
        this.ruleAction = ruleAction;
        return this;
    }
    public String getRuleAction() {
        return this.ruleAction;
    }

    public UpdateFileProtectClientRuleStatusRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public UpdateFileProtectClientRuleStatusRequest setSelectAll(Boolean selectAll) {
        this.selectAll = selectAll;
        return this;
    }
    public Boolean getSelectAll() {
        return this.selectAll;
    }

    public UpdateFileProtectClientRuleStatusRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
