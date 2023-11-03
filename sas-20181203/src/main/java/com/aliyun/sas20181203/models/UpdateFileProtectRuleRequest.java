// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateFileProtectRuleRequest extends TeaModel {
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
     * <p>The operations performed on the files.</p>
     */
    @NameInMap("FileOps")
    public java.util.List<String> fileOps;

    /**
     * <p>The paths to the monitored files. Wildcard characters are supported.</p>
     */
    @NameInMap("FilePaths")
    public java.util.List<String> filePaths;

    /**
     * <p>The ID of the rule.</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The paths to the monitored processes.</p>
     */
    @NameInMap("ProcPaths")
    public java.util.List<String> procPaths;

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

    /**
     * <p>The status of the rule. Valid values:</p>
     * <br>
     * <p>*   **0**: disabled</p>
     * <p>*   **1**: enabled</p>
     */
    @NameInMap("Status")
    public Integer status;

    public static UpdateFileProtectRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFileProtectRuleRequest self = new UpdateFileProtectRuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFileProtectRuleRequest setAlertLevel(Integer alertLevel) {
        this.alertLevel = alertLevel;
        return this;
    }
    public Integer getAlertLevel() {
        return this.alertLevel;
    }

    public UpdateFileProtectRuleRequest setFileOps(java.util.List<String> fileOps) {
        this.fileOps = fileOps;
        return this;
    }
    public java.util.List<String> getFileOps() {
        return this.fileOps;
    }

    public UpdateFileProtectRuleRequest setFilePaths(java.util.List<String> filePaths) {
        this.filePaths = filePaths;
        return this;
    }
    public java.util.List<String> getFilePaths() {
        return this.filePaths;
    }

    public UpdateFileProtectRuleRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateFileProtectRuleRequest setProcPaths(java.util.List<String> procPaths) {
        this.procPaths = procPaths;
        return this;
    }
    public java.util.List<String> getProcPaths() {
        return this.procPaths;
    }

    public UpdateFileProtectRuleRequest setRuleAction(String ruleAction) {
        this.ruleAction = ruleAction;
        return this;
    }
    public String getRuleAction() {
        return this.ruleAction;
    }

    public UpdateFileProtectRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public UpdateFileProtectRuleRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
