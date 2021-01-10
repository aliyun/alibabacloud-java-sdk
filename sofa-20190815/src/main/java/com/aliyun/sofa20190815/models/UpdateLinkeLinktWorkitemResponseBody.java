// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeLinktWorkitemResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ErrorCode")
    public Long errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public UpdateLinkeLinktWorkitemResponseBodyData data;

    public static UpdateLinkeLinktWorkitemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeLinktWorkitemResponseBody self = new UpdateLinkeLinktWorkitemResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeLinktWorkitemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateLinkeLinktWorkitemResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateLinkeLinktWorkitemResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public UpdateLinkeLinktWorkitemResponseBody setErrorCode(Long errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Long getErrorCode() {
        return this.errorCode;
    }

    public UpdateLinkeLinktWorkitemResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public UpdateLinkeLinktWorkitemResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public UpdateLinkeLinktWorkitemResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public UpdateLinkeLinktWorkitemResponseBody setData(UpdateLinkeLinktWorkitemResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateLinkeLinktWorkitemResponseBodyData getData() {
        return this.data;
    }

    public static class UpdateLinkeLinktWorkitemResponseBodyData extends TeaModel {
        @NameInMap("AssignedToIds")
        public String assignedToIds;

        @NameInMap("AsRootLevel")
        public Boolean asRootLevel;

        @NameInMap("ChildrenCount")
        public Long childrenCount;

        @NameInMap("CreatedAt")
        public Long createdAt;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("Description")
        public String description;

        @NameInMap("ExpectedAt")
        public Long expectedAt;

        @NameInMap("FilteredChildrenCount")
        public Long filteredChildrenCount;

        @NameInMap("FinishedChildrenCount")
        public Long finishedChildrenCount;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Iteration")
        public String iteration;

        @NameInMap("IterationSign")
        public String iterationSign;

        @NameInMap("Link")
        public String link;

        @NameInMap("Modifier")
        public String modifier;

        @NameInMap("ParentSign")
        public String parentSign;

        @NameInMap("ParentWorkItem")
        public String parentWorkItem;

        @NameInMap("Priority")
        public Long priority;

        @NameInMap("PriorityEntity")
        public String priorityEntity;

        @NameInMap("Project")
        public String project;

        @NameInMap("ProjectName")
        public String projectName;

        @NameInMap("ProjectSign")
        public String projectSign;

        @NameInMap("Region")
        public String region;

        @NameInMap("Sign")
        public String sign;

        @NameInMap("SignPath")
        public String signPath;

        @NameInMap("Stamp")
        public String stamp;

        @NameInMap("Status")
        public String status;

        @NameInMap("StatusId")
        public Long statusId;

        @NameInMap("StatusStage")
        public Long statusStage;

        @NameInMap("Subject")
        public String subject;

        @NameInMap("Template")
        public String template;

        @NameInMap("TemplateId")
        public Long templateId;

        @NameInMap("UpdatedAt")
        public Long updatedAt;

        @NameInMap("AttachmentVOs")
        public java.util.List<String> attachmentVOs;

        @NameInMap("Ccs")
        public java.util.List<String> ccs;

        @NameInMap("CustomFields")
        public java.util.List<String> customFields;

        @NameInMap("CustomFieldsValues")
        public java.util.List<String> customFieldsValues;

        @NameInMap("Modules")
        public java.util.List<String> modules;

        @NameInMap("RelatedProjects")
        public java.util.List<String> relatedProjects;

        @NameInMap("Tags")
        public java.util.List<String> tags;

        @NameInMap("TemplateList")
        public java.util.List<String> templateList;

        public static UpdateLinkeLinktWorkitemResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateLinkeLinktWorkitemResponseBodyData self = new UpdateLinkeLinktWorkitemResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateLinkeLinktWorkitemResponseBodyData setAssignedToIds(String assignedToIds) {
            this.assignedToIds = assignedToIds;
            return this;
        }
        public String getAssignedToIds() {
            return this.assignedToIds;
        }

        public UpdateLinkeLinktWorkitemResponseBodyData setAsRootLevel(Boolean asRootLevel) {
            this.asRootLevel = asRootLevel;
            return this;
        }
        public Boolean getAsRootLevel() {
            return this.asRootLevel;
        }

        public UpdateLinkeLinktWorkitemResponseBodyData setChildrenCount(Long childrenCount) {
            this.childrenCount = childrenCount;
            return this;
        }
        public Long getChildrenCount() {
            return this.childrenCount;
        }

        public UpdateLinkeLinktWorkitemResponseBodyData setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Long getCreatedAt() {
            return this.createdAt;
        }

        public UpdateLinkeLinktWorkitemResponseBodyData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public UpdateLinkeLinktWorkitemResponseBodyData setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public UpdateLinkeLinktWorkitemResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateLinkeLinktWorkitemResponseBodyData setExpectedAt(Long expectedAt) {
            this.expectedAt = expectedAt;
            return this;
        }
        public Long getExpectedAt() {
            return this.expectedAt;
        }

        public UpdateLinkeLinktWorkitemResponseBodyData setFilteredChildrenCount(Long filteredChildrenCount) {
            this.filteredChildrenCount = filteredChildrenCount;
            return this;
        }
        public Long getFilteredChildrenCount() {
            return this.filteredChildrenCount;
        }

        public UpdateLinkeLinktWorkitemResponseBodyData setFinishedChildrenCount(Long finishedChildrenCount) {
            this.finishedChildrenCount = finishedChildrenCount;
            return this;
        }
        public Long getFinishedChildrenCount() {
            return this.finishedChildrenCount;
        }

        public UpdateLinkeLinktWorkitemResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateLinkeLinktWorkitemResponseBodyData setIteration(String iteration) {
            this.iteration = iteration;
            return this;
        }
        public String getIteration() {
            return this.iteration;
        }

        public UpdateLinkeLinktWorkitemResponseBodyData setIterationSign(String iterationSign) {
            this.iterationSign = iterationSign;
            return this;
        }
        public String getIterationSign() {
            return this.iterationSign;
        }

        public UpdateLinkeLinktWorkitemResponseBodyData setLink(String link) {
            this.link = link;
            return this;
        }
        public String getLink() {
            return this.link;
        }

        public UpdateLinkeLinktWorkitemResponseBodyData setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public UpdateLinkeLinktWorkitemResponseBodyData setParentSign(String parentSign) {
            this.parentSign = parentSign;
            return this;
        }
        public String getParentSign() {
            return this.parentSign;
        }

        public UpdateLinkeLinktWorkitemResponseBodyData setParentWorkItem(String parentWorkItem) {
            this.parentWorkItem = parentWorkItem;
            return this;
        }
        public String getParentWorkItem() {
            return this.parentWorkItem;
        }

        public UpdateLinkeLinktWorkitemResponseBodyData setPriority(Long priority) {
            this.priority = priority;
            return this;
        }
        public Long getPriority() {
            return this.priority;
        }

        public UpdateLinkeLinktWorkitemResponseBodyData setPriorityEntity(String priorityEntity) {
            this.priorityEntity = priorityEntity;
            return this;
        }
        public String getPriorityEntity() {
            return this.priorityEntity;
        }

        public UpdateLinkeLinktWorkitemResponseBodyData setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public UpdateLinkeLinktWorkitemResponseBodyData setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public UpdateLinkeLinktWorkitemResponseBodyData setProjectSign(String projectSign) {
            this.projectSign = projectSign;
            return this;
        }
        public String getProjectSign() {
            return this.projectSign;
        }

        public UpdateLinkeLinktWorkitemResponseBodyData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public UpdateLinkeLinktWorkitemResponseBodyData setSign(String sign) {
            this.sign = sign;
            return this;
        }
        public String getSign() {
            return this.sign;
        }

        public UpdateLinkeLinktWorkitemResponseBodyData setSignPath(String signPath) {
            this.signPath = signPath;
            return this;
        }
        public String getSignPath() {
            return this.signPath;
        }

        public UpdateLinkeLinktWorkitemResponseBodyData setStamp(String stamp) {
            this.stamp = stamp;
            return this;
        }
        public String getStamp() {
            return this.stamp;
        }

        public UpdateLinkeLinktWorkitemResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public UpdateLinkeLinktWorkitemResponseBodyData setStatusId(Long statusId) {
            this.statusId = statusId;
            return this;
        }
        public Long getStatusId() {
            return this.statusId;
        }

        public UpdateLinkeLinktWorkitemResponseBodyData setStatusStage(Long statusStage) {
            this.statusStage = statusStage;
            return this;
        }
        public Long getStatusStage() {
            return this.statusStage;
        }

        public UpdateLinkeLinktWorkitemResponseBodyData setSubject(String subject) {
            this.subject = subject;
            return this;
        }
        public String getSubject() {
            return this.subject;
        }

        public UpdateLinkeLinktWorkitemResponseBodyData setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public UpdateLinkeLinktWorkitemResponseBodyData setTemplateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }
        public Long getTemplateId() {
            return this.templateId;
        }

        public UpdateLinkeLinktWorkitemResponseBodyData setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

        public UpdateLinkeLinktWorkitemResponseBodyData setAttachmentVOs(java.util.List<String> attachmentVOs) {
            this.attachmentVOs = attachmentVOs;
            return this;
        }
        public java.util.List<String> getAttachmentVOs() {
            return this.attachmentVOs;
        }

        public UpdateLinkeLinktWorkitemResponseBodyData setCcs(java.util.List<String> ccs) {
            this.ccs = ccs;
            return this;
        }
        public java.util.List<String> getCcs() {
            return this.ccs;
        }

        public UpdateLinkeLinktWorkitemResponseBodyData setCustomFields(java.util.List<String> customFields) {
            this.customFields = customFields;
            return this;
        }
        public java.util.List<String> getCustomFields() {
            return this.customFields;
        }

        public UpdateLinkeLinktWorkitemResponseBodyData setCustomFieldsValues(java.util.List<String> customFieldsValues) {
            this.customFieldsValues = customFieldsValues;
            return this;
        }
        public java.util.List<String> getCustomFieldsValues() {
            return this.customFieldsValues;
        }

        public UpdateLinkeLinktWorkitemResponseBodyData setModules(java.util.List<String> modules) {
            this.modules = modules;
            return this;
        }
        public java.util.List<String> getModules() {
            return this.modules;
        }

        public UpdateLinkeLinktWorkitemResponseBodyData setRelatedProjects(java.util.List<String> relatedProjects) {
            this.relatedProjects = relatedProjects;
            return this;
        }
        public java.util.List<String> getRelatedProjects() {
            return this.relatedProjects;
        }

        public UpdateLinkeLinktWorkitemResponseBodyData setTags(java.util.List<String> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<String> getTags() {
            return this.tags;
        }

        public UpdateLinkeLinktWorkitemResponseBodyData setTemplateList(java.util.List<String> templateList) {
            this.templateList = templateList;
            return this;
        }
        public java.util.List<String> getTemplateList() {
            return this.templateList;
        }

    }

}
