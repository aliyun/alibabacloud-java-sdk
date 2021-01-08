// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdc20180821.models;

import com.aliyun.tea.*;

public class UpdateWorkitemRequest extends TeaModel {
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
    public java.util.Map<String, ?> cfList;

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
    public java.util.Map<String, ?> cfs;

    public static UpdateWorkitemRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkitemRequest self = new UpdateWorkitemRequest();
        return TeaModel.build(map, self);
    }

    public UpdateWorkitemRequest setAKProjectId(Integer AKProjectId) {
        this.AKProjectId = AKProjectId;
        return this;
    }
    public Integer getAKProjectId() {
        return this.AKProjectId;
    }

    public UpdateWorkitemRequest setCorpIdentifier(String corpIdentifier) {
        this.corpIdentifier = corpIdentifier;
        return this;
    }
    public String getCorpIdentifier() {
        return this.corpIdentifier;
    }

    public UpdateWorkitemRequest setModifier(String modifier) {
        this.modifier = modifier;
        return this;
    }
    public String getModifier() {
        return this.modifier;
    }

    public UpdateWorkitemRequest setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
        return this;
    }
    public String getAssignedTo() {
        return this.assignedTo;
    }

    public UpdateWorkitemRequest setTemplateId(Integer templateId) {
        this.templateId = templateId;
        return this;
    }
    public Integer getTemplateId() {
        return this.templateId;
    }

    public UpdateWorkitemRequest setSubject(String subject) {
        this.subject = subject;
        return this;
    }
    public String getSubject() {
        return this.subject;
    }

    public UpdateWorkitemRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateWorkitemRequest setStamp(String stamp) {
        this.stamp = stamp;
        return this;
    }
    public String getStamp() {
        return this.stamp;
    }

    public UpdateWorkitemRequest setCfList(java.util.Map<String, ?> cfList) {
        this.cfList = cfList;
        return this;
    }
    public java.util.Map<String, ?> getCfList() {
        return this.cfList;
    }

    public UpdateWorkitemRequest setIssueId(Integer issueId) {
        this.issueId = issueId;
        return this;
    }
    public Integer getIssueId() {
        return this.issueId;
    }

    public UpdateWorkitemRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateWorkitemRequest setPriority(String priority) {
        this.priority = priority;
        return this;
    }
    public String getPriority() {
        return this.priority;
    }

    public UpdateWorkitemRequest setSeriousLevel(String seriousLevel) {
        this.seriousLevel = seriousLevel;
        return this;
    }
    public String getSeriousLevel() {
        return this.seriousLevel;
    }

    public UpdateWorkitemRequest setVerifier(String verifier) {
        this.verifier = verifier;
        return this;
    }
    public String getVerifier() {
        return this.verifier;
    }

    public UpdateWorkitemRequest setSprintId(Integer sprintId) {
        this.sprintId = sprintId;
        return this;
    }
    public Integer getSprintId() {
        return this.sprintId;
    }

    public UpdateWorkitemRequest setIgnoreCheck(Boolean ignoreCheck) {
        this.ignoreCheck = ignoreCheck;
        return this;
    }
    public Boolean getIgnoreCheck() {
        return this.ignoreCheck;
    }

    public UpdateWorkitemRequest setCfs(java.util.Map<String, ?> cfs) {
        this.cfs = cfs;
        return this;
    }
    public java.util.Map<String, ?> getCfs() {
        return this.cfs;
    }

}
