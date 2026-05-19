// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateFileProtectClientRuleStatusRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("AlertLevel")
    public Integer alertLevel;

    @NameInMap("ExcludeIdList")
    public java.util.List<Long> excludeIdList;

    @NameInMap("IdList")
    public java.util.List<Long> idList;

    /**
     * <strong>example:</strong>
     * <p>linux</p>
     */
    @NameInMap("Platform")
    public String platform;

    /**
     * <strong>example:</strong>
     * <p>pass</p>
     */
    @NameInMap("RuleAction")
    public String ruleAction;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SelectAll")
    public Boolean selectAll;

    /**
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
