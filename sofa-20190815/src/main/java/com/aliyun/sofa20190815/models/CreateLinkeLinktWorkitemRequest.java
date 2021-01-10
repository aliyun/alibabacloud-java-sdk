// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeLinktWorkitemRequest extends TeaModel {
    @NameInMap("AssignedToIds")
    public String assignedToIds;

    @NameInMap("Creator")
    public String creator;

    @NameInMap("Description")
    public String description;

    @NameInMap("ExpectedAt")
    public Long expectedAt;

    @NameInMap("IterationSign")
    public String iterationSign;

    @NameInMap("ParentSign")
    public String parentSign;

    @NameInMap("Priority")
    public Long priority;

    @NameInMap("ProjectSign")
    public String projectSign;

    @NameInMap("Stamp")
    public String stamp;

    @NameInMap("StatusId")
    public Long statusId;

    @NameInMap("Subject")
    public String subject;

    @NameInMap("TemplateId")
    public Long templateId;

    @NameInMap("AttachmentVOsRepeatList")
    public java.util.List<String> attachmentVOsRepeatList;

    @NameInMap("CcsRepeatList")
    public java.util.List<String> ccsRepeatList;

    @NameInMap("CreatedDependentWorkItemsRepeatList")
    public java.util.List<String> createdDependentWorkItemsRepeatList;

    @NameInMap("CreatedRelevantWorkItemsRepeatList")
    public java.util.List<String> createdRelevantWorkItemsRepeatList;

    @NameInMap("CreatedSubWorkItemsRepeatList")
    public java.util.List<String> createdSubWorkItemsRepeatList;

    @NameInMap("CustomFieldsValuesRepeatList")
    public java.util.List<String> customFieldsValuesRepeatList;

    @NameInMap("ModulesRepeatList")
    public java.util.List<Integer> modulesRepeatList;

    @NameInMap("RelatedDependentWorkItemsRepeatList")
    public java.util.List<String> relatedDependentWorkItemsRepeatList;

    @NameInMap("RelatedProjectsRepeatList")
    public java.util.List<String> relatedProjectsRepeatList;

    @NameInMap("RelatedRelevantWorkItemsRepeatList")
    public java.util.List<String> relatedRelevantWorkItemsRepeatList;

    @NameInMap("RelatedSubWorkItemsRepeatList")
    public java.util.List<String> relatedSubWorkItemsRepeatList;

    @NameInMap("TagsRepeatList")
    public java.util.List<Integer> tagsRepeatList;

    public static CreateLinkeLinktWorkitemRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeLinktWorkitemRequest self = new CreateLinkeLinktWorkitemRequest();
        return TeaModel.build(map, self);
    }

    public CreateLinkeLinktWorkitemRequest setAssignedToIds(String assignedToIds) {
        this.assignedToIds = assignedToIds;
        return this;
    }
    public String getAssignedToIds() {
        return this.assignedToIds;
    }

    public CreateLinkeLinktWorkitemRequest setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public CreateLinkeLinktWorkitemRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateLinkeLinktWorkitemRequest setExpectedAt(Long expectedAt) {
        this.expectedAt = expectedAt;
        return this;
    }
    public Long getExpectedAt() {
        return this.expectedAt;
    }

    public CreateLinkeLinktWorkitemRequest setIterationSign(String iterationSign) {
        this.iterationSign = iterationSign;
        return this;
    }
    public String getIterationSign() {
        return this.iterationSign;
    }

    public CreateLinkeLinktWorkitemRequest setParentSign(String parentSign) {
        this.parentSign = parentSign;
        return this;
    }
    public String getParentSign() {
        return this.parentSign;
    }

    public CreateLinkeLinktWorkitemRequest setPriority(Long priority) {
        this.priority = priority;
        return this;
    }
    public Long getPriority() {
        return this.priority;
    }

    public CreateLinkeLinktWorkitemRequest setProjectSign(String projectSign) {
        this.projectSign = projectSign;
        return this;
    }
    public String getProjectSign() {
        return this.projectSign;
    }

    public CreateLinkeLinktWorkitemRequest setStamp(String stamp) {
        this.stamp = stamp;
        return this;
    }
    public String getStamp() {
        return this.stamp;
    }

    public CreateLinkeLinktWorkitemRequest setStatusId(Long statusId) {
        this.statusId = statusId;
        return this;
    }
    public Long getStatusId() {
        return this.statusId;
    }

    public CreateLinkeLinktWorkitemRequest setSubject(String subject) {
        this.subject = subject;
        return this;
    }
    public String getSubject() {
        return this.subject;
    }

    public CreateLinkeLinktWorkitemRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

    public CreateLinkeLinktWorkitemRequest setAttachmentVOsRepeatList(java.util.List<String> attachmentVOsRepeatList) {
        this.attachmentVOsRepeatList = attachmentVOsRepeatList;
        return this;
    }
    public java.util.List<String> getAttachmentVOsRepeatList() {
        return this.attachmentVOsRepeatList;
    }

    public CreateLinkeLinktWorkitemRequest setCcsRepeatList(java.util.List<String> ccsRepeatList) {
        this.ccsRepeatList = ccsRepeatList;
        return this;
    }
    public java.util.List<String> getCcsRepeatList() {
        return this.ccsRepeatList;
    }

    public CreateLinkeLinktWorkitemRequest setCreatedDependentWorkItemsRepeatList(java.util.List<String> createdDependentWorkItemsRepeatList) {
        this.createdDependentWorkItemsRepeatList = createdDependentWorkItemsRepeatList;
        return this;
    }
    public java.util.List<String> getCreatedDependentWorkItemsRepeatList() {
        return this.createdDependentWorkItemsRepeatList;
    }

    public CreateLinkeLinktWorkitemRequest setCreatedRelevantWorkItemsRepeatList(java.util.List<String> createdRelevantWorkItemsRepeatList) {
        this.createdRelevantWorkItemsRepeatList = createdRelevantWorkItemsRepeatList;
        return this;
    }
    public java.util.List<String> getCreatedRelevantWorkItemsRepeatList() {
        return this.createdRelevantWorkItemsRepeatList;
    }

    public CreateLinkeLinktWorkitemRequest setCreatedSubWorkItemsRepeatList(java.util.List<String> createdSubWorkItemsRepeatList) {
        this.createdSubWorkItemsRepeatList = createdSubWorkItemsRepeatList;
        return this;
    }
    public java.util.List<String> getCreatedSubWorkItemsRepeatList() {
        return this.createdSubWorkItemsRepeatList;
    }

    public CreateLinkeLinktWorkitemRequest setCustomFieldsValuesRepeatList(java.util.List<String> customFieldsValuesRepeatList) {
        this.customFieldsValuesRepeatList = customFieldsValuesRepeatList;
        return this;
    }
    public java.util.List<String> getCustomFieldsValuesRepeatList() {
        return this.customFieldsValuesRepeatList;
    }

    public CreateLinkeLinktWorkitemRequest setModulesRepeatList(java.util.List<Integer> modulesRepeatList) {
        this.modulesRepeatList = modulesRepeatList;
        return this;
    }
    public java.util.List<Integer> getModulesRepeatList() {
        return this.modulesRepeatList;
    }

    public CreateLinkeLinktWorkitemRequest setRelatedDependentWorkItemsRepeatList(java.util.List<String> relatedDependentWorkItemsRepeatList) {
        this.relatedDependentWorkItemsRepeatList = relatedDependentWorkItemsRepeatList;
        return this;
    }
    public java.util.List<String> getRelatedDependentWorkItemsRepeatList() {
        return this.relatedDependentWorkItemsRepeatList;
    }

    public CreateLinkeLinktWorkitemRequest setRelatedProjectsRepeatList(java.util.List<String> relatedProjectsRepeatList) {
        this.relatedProjectsRepeatList = relatedProjectsRepeatList;
        return this;
    }
    public java.util.List<String> getRelatedProjectsRepeatList() {
        return this.relatedProjectsRepeatList;
    }

    public CreateLinkeLinktWorkitemRequest setRelatedRelevantWorkItemsRepeatList(java.util.List<String> relatedRelevantWorkItemsRepeatList) {
        this.relatedRelevantWorkItemsRepeatList = relatedRelevantWorkItemsRepeatList;
        return this;
    }
    public java.util.List<String> getRelatedRelevantWorkItemsRepeatList() {
        return this.relatedRelevantWorkItemsRepeatList;
    }

    public CreateLinkeLinktWorkitemRequest setRelatedSubWorkItemsRepeatList(java.util.List<String> relatedSubWorkItemsRepeatList) {
        this.relatedSubWorkItemsRepeatList = relatedSubWorkItemsRepeatList;
        return this;
    }
    public java.util.List<String> getRelatedSubWorkItemsRepeatList() {
        return this.relatedSubWorkItemsRepeatList;
    }

    public CreateLinkeLinktWorkitemRequest setTagsRepeatList(java.util.List<Integer> tagsRepeatList) {
        this.tagsRepeatList = tagsRepeatList;
        return this;
    }
    public java.util.List<Integer> getTagsRepeatList() {
        return this.tagsRepeatList;
    }

}
