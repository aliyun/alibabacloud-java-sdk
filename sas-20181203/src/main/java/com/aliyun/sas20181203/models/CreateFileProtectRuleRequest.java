// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateFileProtectRuleRequest extends TeaModel {
    @NameInMap("AlertLevel")
    public Integer alertLevel;

    @NameInMap("FileOps")
    public java.util.List<String> fileOps;

    @NameInMap("FilePaths")
    public java.util.List<String> filePaths;

    @NameInMap("ProcPaths")
    public java.util.List<String> procPaths;

    @NameInMap("RuleAction")
    public String ruleAction;

    @NameInMap("RuleName")
    public String ruleName;

    @NameInMap("Status")
    public Integer status;

    @NameInMap("SwitchId")
    public String switchId;

    public static CreateFileProtectRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFileProtectRuleRequest self = new CreateFileProtectRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateFileProtectRuleRequest setAlertLevel(Integer alertLevel) {
        this.alertLevel = alertLevel;
        return this;
    }
    public Integer getAlertLevel() {
        return this.alertLevel;
    }

    public CreateFileProtectRuleRequest setFileOps(java.util.List<String> fileOps) {
        this.fileOps = fileOps;
        return this;
    }
    public java.util.List<String> getFileOps() {
        return this.fileOps;
    }

    public CreateFileProtectRuleRequest setFilePaths(java.util.List<String> filePaths) {
        this.filePaths = filePaths;
        return this;
    }
    public java.util.List<String> getFilePaths() {
        return this.filePaths;
    }

    public CreateFileProtectRuleRequest setProcPaths(java.util.List<String> procPaths) {
        this.procPaths = procPaths;
        return this;
    }
    public java.util.List<String> getProcPaths() {
        return this.procPaths;
    }

    public CreateFileProtectRuleRequest setRuleAction(String ruleAction) {
        this.ruleAction = ruleAction;
        return this;
    }
    public String getRuleAction() {
        return this.ruleAction;
    }

    public CreateFileProtectRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public CreateFileProtectRuleRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public CreateFileProtectRuleRequest setSwitchId(String switchId) {
        this.switchId = switchId;
        return this;
    }
    public String getSwitchId() {
        return this.switchId;
    }

}
