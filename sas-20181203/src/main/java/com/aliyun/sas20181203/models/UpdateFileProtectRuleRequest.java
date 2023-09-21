// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateFileProtectRuleRequest extends TeaModel {
    @NameInMap("AlertLevel")
    public Integer alertLevel;

    @NameInMap("FileOps")
    public java.util.List<String> fileOps;

    @NameInMap("FilePaths")
    public java.util.List<String> filePaths;

    @NameInMap("Id")
    public Long id;

    @NameInMap("ProcPaths")
    public java.util.List<String> procPaths;

    @NameInMap("RuleAction")
    public String ruleAction;

    @NameInMap("RuleName")
    public String ruleName;

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
