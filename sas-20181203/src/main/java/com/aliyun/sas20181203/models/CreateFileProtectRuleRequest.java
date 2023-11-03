// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateFileProtectRuleRequest extends TeaModel {
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
     * <p>The operations that you want to perform on the files.</p>
     */
    @NameInMap("FileOps")
    public java.util.List<String> fileOps;

    /**
     * <p>The paths to the files that you want to monitor. Wildcard characters are supported.</p>
     */
    @NameInMap("FilePaths")
    public java.util.List<String> filePaths;

    /**
     * <p>The paths to the processes that you want to monitor. Wildcard characters are supported.</p>
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
     * <p>Specifies whether to enable the rule. Valid values:</p>
     * <br>
     * <p>*   **1**: yes</p>
     * <p>*   **0**: no</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>The switch ID of the rule.</p>
     */
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
