// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdc20180821.models;

import com.aliyun.tea.*;

public class UpdateWorkitemShrinkRequest extends TeaModel {
    @NameInMap("AKProjectId")
    public Integer AKProjectId;

    @NameInMap("CorpIdentifier")
    public String corpIdentifier;

    @NameInMap("Modifier")
    public String modifier;

    @NameInMap("AssignedTo")
    public String assignedTo;

    @NameInMap("TemplateId")
    public Integer templateId;

    @NameInMap("Subject")
    public String subject;

    @NameInMap("Description")
    public String description;

    @NameInMap("Stamp")
    public String stamp;

    @NameInMap("CfList")
    public String cfListShrink;

    @NameInMap("IssueId")
    public Integer issueId;

    @NameInMap("Status")
    public String status;

    @NameInMap("Priority")
    public String priority;

    @NameInMap("SeriousLevel")
    public String seriousLevel;

    @NameInMap("Verifier")
    public String verifier;

    @NameInMap("SprintId")
    public Integer sprintId;

    @NameInMap("IgnoreCheck")
    public Boolean ignoreCheck;

    @NameInMap("Cfs")
    public String cfsShrink;

    public static UpdateWorkitemShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkitemShrinkRequest self = new UpdateWorkitemShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateWorkitemShrinkRequest setAKProjectId(Integer AKProjectId) {
        this.AKProjectId = AKProjectId;
        return this;
    }
    public Integer getAKProjectId() {
        return this.AKProjectId;
    }

    public UpdateWorkitemShrinkRequest setCorpIdentifier(String corpIdentifier) {
        this.corpIdentifier = corpIdentifier;
        return this;
    }
    public String getCorpIdentifier() {
        return this.corpIdentifier;
    }

    public UpdateWorkitemShrinkRequest setModifier(String modifier) {
        this.modifier = modifier;
        return this;
    }
    public String getModifier() {
        return this.modifier;
    }

    public UpdateWorkitemShrinkRequest setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
        return this;
    }
    public String getAssignedTo() {
        return this.assignedTo;
    }

    public UpdateWorkitemShrinkRequest setTemplateId(Integer templateId) {
        this.templateId = templateId;
        return this;
    }
    public Integer getTemplateId() {
        return this.templateId;
    }

    public UpdateWorkitemShrinkRequest setSubject(String subject) {
        this.subject = subject;
        return this;
    }
    public String getSubject() {
        return this.subject;
    }

    public UpdateWorkitemShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateWorkitemShrinkRequest setStamp(String stamp) {
        this.stamp = stamp;
        return this;
    }
    public String getStamp() {
        return this.stamp;
    }

    public UpdateWorkitemShrinkRequest setCfListShrink(String cfListShrink) {
        this.cfListShrink = cfListShrink;
        return this;
    }
    public String getCfListShrink() {
        return this.cfListShrink;
    }

    public UpdateWorkitemShrinkRequest setIssueId(Integer issueId) {
        this.issueId = issueId;
        return this;
    }
    public Integer getIssueId() {
        return this.issueId;
    }

    public UpdateWorkitemShrinkRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateWorkitemShrinkRequest setPriority(String priority) {
        this.priority = priority;
        return this;
    }
    public String getPriority() {
        return this.priority;
    }

    public UpdateWorkitemShrinkRequest setSeriousLevel(String seriousLevel) {
        this.seriousLevel = seriousLevel;
        return this;
    }
    public String getSeriousLevel() {
        return this.seriousLevel;
    }

    public UpdateWorkitemShrinkRequest setVerifier(String verifier) {
        this.verifier = verifier;
        return this;
    }
    public String getVerifier() {
        return this.verifier;
    }

    public UpdateWorkitemShrinkRequest setSprintId(Integer sprintId) {
        this.sprintId = sprintId;
        return this;
    }
    public Integer getSprintId() {
        return this.sprintId;
    }

    public UpdateWorkitemShrinkRequest setIgnoreCheck(Boolean ignoreCheck) {
        this.ignoreCheck = ignoreCheck;
        return this;
    }
    public Boolean getIgnoreCheck() {
        return this.ignoreCheck;
    }

    public UpdateWorkitemShrinkRequest setCfsShrink(String cfsShrink) {
        this.cfsShrink = cfsShrink;
        return this;
    }
    public String getCfsShrink() {
        return this.cfsShrink;
    }

}
