// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class ModifyRuleStatusRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("applyUserId")
    public String applyUserId;

    @NameInMap("applyUserName")
    public String applyUserName;

    @NameInMap("auditRemark")
    public String auditRemark;

    @NameInMap("auditUserId")
    public String auditUserId;

    @NameInMap("auditUserName")
    public String auditUserName;

    @NameInMap("consoleRuleId")
    public Long consoleRuleId;

    @NameInMap("eventType")
    public String eventType;

    @NameInMap("regId")
    public String regId;

    @NameInMap("ruleAuditType")
    public String ruleAuditType;

    @NameInMap("ruleId")
    public String ruleId;

    @NameInMap("ruleVersionId")
    public Long ruleVersionId;

    public static ModifyRuleStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyRuleStatusRequest self = new ModifyRuleStatusRequest();
        return TeaModel.build(map, self);
    }

    public ModifyRuleStatusRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifyRuleStatusRequest setApplyUserId(String applyUserId) {
        this.applyUserId = applyUserId;
        return this;
    }
    public String getApplyUserId() {
        return this.applyUserId;
    }

    public ModifyRuleStatusRequest setApplyUserName(String applyUserName) {
        this.applyUserName = applyUserName;
        return this;
    }
    public String getApplyUserName() {
        return this.applyUserName;
    }

    public ModifyRuleStatusRequest setAuditRemark(String auditRemark) {
        this.auditRemark = auditRemark;
        return this;
    }
    public String getAuditRemark() {
        return this.auditRemark;
    }

    public ModifyRuleStatusRequest setAuditUserId(String auditUserId) {
        this.auditUserId = auditUserId;
        return this;
    }
    public String getAuditUserId() {
        return this.auditUserId;
    }

    public ModifyRuleStatusRequest setAuditUserName(String auditUserName) {
        this.auditUserName = auditUserName;
        return this;
    }
    public String getAuditUserName() {
        return this.auditUserName;
    }

    public ModifyRuleStatusRequest setConsoleRuleId(Long consoleRuleId) {
        this.consoleRuleId = consoleRuleId;
        return this;
    }
    public Long getConsoleRuleId() {
        return this.consoleRuleId;
    }

    public ModifyRuleStatusRequest setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    public String getEventType() {
        return this.eventType;
    }

    public ModifyRuleStatusRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public ModifyRuleStatusRequest setRuleAuditType(String ruleAuditType) {
        this.ruleAuditType = ruleAuditType;
        return this;
    }
    public String getRuleAuditType() {
        return this.ruleAuditType;
    }

    public ModifyRuleStatusRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public ModifyRuleStatusRequest setRuleVersionId(Long ruleVersionId) {
        this.ruleVersionId = ruleVersionId;
        return this;
    }
    public Long getRuleVersionId() {
        return this.ruleVersionId;
    }

}
