// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateFileProtectClientRuleRequest extends TeaModel {
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
     * <p>The list of users excluded from file protection.</p>
     */
    @NameInMap("ExcludeUsers")
    public java.util.List<String> excludeUsers;

    /**
     * <p>The list of operations performed on the file.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("FileOps")
    public java.util.List<String> fileOps;

    /**
     * <p>The list of monitored file paths. Wildcards are supported.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("FilePaths")
    public java.util.List<String> filePaths;

    /**
     * <p>The list of protected file types.</p>
     */
    @NameInMap("FileTypes")
    public java.util.List<String> fileTypes;

    /**
     * <p>The unique ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>245</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The list of process listening paths. Wildcards are supported.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProcPaths")
    public java.util.List<String> procPaths;

    /**
     * <p>The action of the rule. Valid values:</p>
     * <ul>
     * <li><p><strong>block</strong>: Block.</p>
     * </li>
     * <li><p><strong>monitor</strong>: Monitor.</p>
     * </li>
     * <li><p><strong>pass</strong>: Allow.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pass</p>
     */
    @NameInMap("RuleAction")
    public String ruleAction;

    /**
     * <p>The name of the rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>text-001</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The status of the rule. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: disabled</li>
     * <li><strong>1</strong>: enabled.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Status")
    public Integer status;

    public static UpdateFileProtectClientRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFileProtectClientRuleRequest self = new UpdateFileProtectClientRuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFileProtectClientRuleRequest setAlertLevel(Integer alertLevel) {
        this.alertLevel = alertLevel;
        return this;
    }
    public Integer getAlertLevel() {
        return this.alertLevel;
    }

    public UpdateFileProtectClientRuleRequest setExcludeUsers(java.util.List<String> excludeUsers) {
        this.excludeUsers = excludeUsers;
        return this;
    }
    public java.util.List<String> getExcludeUsers() {
        return this.excludeUsers;
    }

    public UpdateFileProtectClientRuleRequest setFileOps(java.util.List<String> fileOps) {
        this.fileOps = fileOps;
        return this;
    }
    public java.util.List<String> getFileOps() {
        return this.fileOps;
    }

    public UpdateFileProtectClientRuleRequest setFilePaths(java.util.List<String> filePaths) {
        this.filePaths = filePaths;
        return this;
    }
    public java.util.List<String> getFilePaths() {
        return this.filePaths;
    }

    public UpdateFileProtectClientRuleRequest setFileTypes(java.util.List<String> fileTypes) {
        this.fileTypes = fileTypes;
        return this;
    }
    public java.util.List<String> getFileTypes() {
        return this.fileTypes;
    }

    public UpdateFileProtectClientRuleRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateFileProtectClientRuleRequest setProcPaths(java.util.List<String> procPaths) {
        this.procPaths = procPaths;
        return this;
    }
    public java.util.List<String> getProcPaths() {
        return this.procPaths;
    }

    public UpdateFileProtectClientRuleRequest setRuleAction(String ruleAction) {
        this.ruleAction = ruleAction;
        return this;
    }
    public String getRuleAction() {
        return this.ruleAction;
    }

    public UpdateFileProtectClientRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public UpdateFileProtectClientRuleRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
