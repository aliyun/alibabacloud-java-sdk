// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateFileProtectClientRuleRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("AlertLevel")
    public Integer alertLevel;

    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("ExcludeUsers")
    public java.util.List<String> excludeUsers;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("FileOps")
    public java.util.List<String> fileOps;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("FilePaths")
    public java.util.List<String> filePaths;

    @NameInMap("FileTypes")
    public java.util.List<String> fileTypes;

    /**
     * <strong>example:</strong>
     * <p>linux</p>
     */
    @NameInMap("Platform")
    public String platform;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProcPaths")
    public java.util.List<String> procPaths;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pass</p>
     */
    @NameInMap("RuleAction")
    public String ruleAction;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <strong>example:</strong>
     * <p>FILE_PROTECT_RULE_SWITCH_TYPE_0000</p>
     */
    @NameInMap("SwitchId")
    public String switchId;

    public static CreateFileProtectClientRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFileProtectClientRuleRequest self = new CreateFileProtectClientRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateFileProtectClientRuleRequest setAlertLevel(Integer alertLevel) {
        this.alertLevel = alertLevel;
        return this;
    }
    public Integer getAlertLevel() {
        return this.alertLevel;
    }

    public CreateFileProtectClientRuleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateFileProtectClientRuleRequest setExcludeUsers(java.util.List<String> excludeUsers) {
        this.excludeUsers = excludeUsers;
        return this;
    }
    public java.util.List<String> getExcludeUsers() {
        return this.excludeUsers;
    }

    public CreateFileProtectClientRuleRequest setFileOps(java.util.List<String> fileOps) {
        this.fileOps = fileOps;
        return this;
    }
    public java.util.List<String> getFileOps() {
        return this.fileOps;
    }

    public CreateFileProtectClientRuleRequest setFilePaths(java.util.List<String> filePaths) {
        this.filePaths = filePaths;
        return this;
    }
    public java.util.List<String> getFilePaths() {
        return this.filePaths;
    }

    public CreateFileProtectClientRuleRequest setFileTypes(java.util.List<String> fileTypes) {
        this.fileTypes = fileTypes;
        return this;
    }
    public java.util.List<String> getFileTypes() {
        return this.fileTypes;
    }

    public CreateFileProtectClientRuleRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public CreateFileProtectClientRuleRequest setProcPaths(java.util.List<String> procPaths) {
        this.procPaths = procPaths;
        return this;
    }
    public java.util.List<String> getProcPaths() {
        return this.procPaths;
    }

    public CreateFileProtectClientRuleRequest setRuleAction(String ruleAction) {
        this.ruleAction = ruleAction;
        return this;
    }
    public String getRuleAction() {
        return this.ruleAction;
    }

    public CreateFileProtectClientRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public CreateFileProtectClientRuleRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public CreateFileProtectClientRuleRequest setSwitchId(String switchId) {
        this.switchId = switchId;
        return this;
    }
    public String getSwitchId() {
        return this.switchId;
    }

}
