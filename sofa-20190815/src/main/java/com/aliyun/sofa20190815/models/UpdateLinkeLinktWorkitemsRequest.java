// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeLinktWorkitemsRequest extends TeaModel {
    @NameInMap("AssignedToIds")
    public String assignedToIds;

    @NameInMap("AttachmentVOs")
    public String attachmentVOs;

    @NameInMap("Ccs")
    public String ccs;

    @NameInMap("CustomFieldsRepeatList")
    public java.util.List<String> customFieldsRepeatList;

    @NameInMap("Deleted")
    public Boolean deleted;

    @NameInMap("Description")
    public String description;

    @NameInMap("ExpectedAt")
    public String expectedAt;

    @NameInMap("IterationSign")
    public String iterationSign;

    @NameInMap("Modules")
    public String modules;

    @NameInMap("ParentSign")
    public String parentSign;

    @NameInMap("Priority")
    public String priority;

    @NameInMap("ProjectSign")
    public String projectSign;

    @NameInMap("RelatedProjects")
    public String relatedProjects;

    @NameInMap("SignListRepeatList")
    public java.util.List<String> signListRepeatList;

    @NameInMap("StatusId")
    public String statusId;

    @NameInMap("Subject")
    public String subject;

    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("TemplateLabel")
    public String templateLabel;

    @NameInMap("WorkitemSign")
    public String workitemSign;

    public static UpdateLinkeLinktWorkitemsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeLinktWorkitemsRequest self = new UpdateLinkeLinktWorkitemsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeLinktWorkitemsRequest setAssignedToIds(String assignedToIds) {
        this.assignedToIds = assignedToIds;
        return this;
    }
    public String getAssignedToIds() {
        return this.assignedToIds;
    }

    public UpdateLinkeLinktWorkitemsRequest setAttachmentVOs(String attachmentVOs) {
        this.attachmentVOs = attachmentVOs;
        return this;
    }
    public String getAttachmentVOs() {
        return this.attachmentVOs;
    }

    public UpdateLinkeLinktWorkitemsRequest setCcs(String ccs) {
        this.ccs = ccs;
        return this;
    }
    public String getCcs() {
        return this.ccs;
    }

    public UpdateLinkeLinktWorkitemsRequest setCustomFieldsRepeatList(java.util.List<String> customFieldsRepeatList) {
        this.customFieldsRepeatList = customFieldsRepeatList;
        return this;
    }
    public java.util.List<String> getCustomFieldsRepeatList() {
        return this.customFieldsRepeatList;
    }

    public UpdateLinkeLinktWorkitemsRequest setDeleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
    }
    public Boolean getDeleted() {
        return this.deleted;
    }

    public UpdateLinkeLinktWorkitemsRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateLinkeLinktWorkitemsRequest setExpectedAt(String expectedAt) {
        this.expectedAt = expectedAt;
        return this;
    }
    public String getExpectedAt() {
        return this.expectedAt;
    }

    public UpdateLinkeLinktWorkitemsRequest setIterationSign(String iterationSign) {
        this.iterationSign = iterationSign;
        return this;
    }
    public String getIterationSign() {
        return this.iterationSign;
    }

    public UpdateLinkeLinktWorkitemsRequest setModules(String modules) {
        this.modules = modules;
        return this;
    }
    public String getModules() {
        return this.modules;
    }

    public UpdateLinkeLinktWorkitemsRequest setParentSign(String parentSign) {
        this.parentSign = parentSign;
        return this;
    }
    public String getParentSign() {
        return this.parentSign;
    }

    public UpdateLinkeLinktWorkitemsRequest setPriority(String priority) {
        this.priority = priority;
        return this;
    }
    public String getPriority() {
        return this.priority;
    }

    public UpdateLinkeLinktWorkitemsRequest setProjectSign(String projectSign) {
        this.projectSign = projectSign;
        return this;
    }
    public String getProjectSign() {
        return this.projectSign;
    }

    public UpdateLinkeLinktWorkitemsRequest setRelatedProjects(String relatedProjects) {
        this.relatedProjects = relatedProjects;
        return this;
    }
    public String getRelatedProjects() {
        return this.relatedProjects;
    }

    public UpdateLinkeLinktWorkitemsRequest setSignListRepeatList(java.util.List<String> signListRepeatList) {
        this.signListRepeatList = signListRepeatList;
        return this;
    }
    public java.util.List<String> getSignListRepeatList() {
        return this.signListRepeatList;
    }

    public UpdateLinkeLinktWorkitemsRequest setStatusId(String statusId) {
        this.statusId = statusId;
        return this;
    }
    public String getStatusId() {
        return this.statusId;
    }

    public UpdateLinkeLinktWorkitemsRequest setSubject(String subject) {
        this.subject = subject;
        return this;
    }
    public String getSubject() {
        return this.subject;
    }

    public UpdateLinkeLinktWorkitemsRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public UpdateLinkeLinktWorkitemsRequest setTemplateLabel(String templateLabel) {
        this.templateLabel = templateLabel;
        return this;
    }
    public String getTemplateLabel() {
        return this.templateLabel;
    }

    public UpdateLinkeLinktWorkitemsRequest setWorkitemSign(String workitemSign) {
        this.workitemSign = workitemSign;
        return this;
    }
    public String getWorkitemSign() {
        return this.workitemSign;
    }

}
