// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class ModifyRuleStatusRequest extends TeaModel {
    /**
     * <p>Set the language type for requests and received messages, default value is <strong>zh</strong>. Values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>UID of the applicant.</p>
     * 
     * <strong>example:</strong>
     * <p>1519714049632764</p>
     */
    @NameInMap("applyUserId")
    public String applyUserId;

    /**
     * <p>Name of the applicant.</p>
     * 
     * <strong>example:</strong>
     * <p>root</p>
     */
    @NameInMap("applyUserName")
    public String applyUserName;

    /**
     * <p>Approval remarks.</p>
     * 
     * <strong>example:</strong>
     * <p>申请发布上线</p>
     */
    @NameInMap("auditRemark")
    public String auditRemark;

    /**
     * <p>UID of the auditor.</p>
     * 
     * <strong>example:</strong>
     * <p>1519714049632764</p>
     */
    @NameInMap("auditUserId")
    public String auditUserId;

    /**
     * <p>Name of the auditor.</p>
     * 
     * <strong>example:</strong>
     * <p>root</p>
     */
    @NameInMap("auditUserName")
    public String auditUserName;

    /**
     * <p>Primary key ID of the policy.</p>
     * 
     * <strong>example:</strong>
     * <p>6843</p>
     */
    @NameInMap("consoleRuleId")
    public Long consoleRuleId;

    /**
     * <p>Event type.</p>
     * 
     * <strong>example:</strong>
     * <p>MAIN</p>
     */
    @NameInMap("eventType")
    public String eventType;

    /**
     * <p>Region code.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regId")
    public String regId;

    /**
     * <p>Audit status.</p>
     * 
     * <strong>example:</strong>
     * <p>DRAFT_TO_RUNNING</p>
     */
    @NameInMap("ruleAuditType")
    public String ruleAuditType;

    /**
     * <p>Policy ID.</p>
     * 
     * <strong>example:</strong>
     * <p>101544</p>
     */
    @NameInMap("ruleId")
    public String ruleId;

    /**
     * <p>Primary key ID of the policy version.</p>
     * 
     * <strong>example:</strong>
     * <p>11519</p>
     */
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
