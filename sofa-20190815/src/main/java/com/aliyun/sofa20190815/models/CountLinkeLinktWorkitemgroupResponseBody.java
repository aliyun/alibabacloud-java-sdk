// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CountLinkeLinktWorkitemgroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Data")
    public java.util.List<CountLinkeLinktWorkitemgroupResponseBodyData> data;

    @NameInMap("ErrorCode")
    public Long errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ResultCode")
    public String resultCode;

    public static CountLinkeLinktWorkitemgroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CountLinkeLinktWorkitemgroupResponseBody self = new CountLinkeLinktWorkitemgroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CountLinkeLinktWorkitemgroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CountLinkeLinktWorkitemgroupResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public CountLinkeLinktWorkitemgroupResponseBody setData(java.util.List<CountLinkeLinktWorkitemgroupResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<CountLinkeLinktWorkitemgroupResponseBodyData> getData() {
        return this.data;
    }

    public CountLinkeLinktWorkitemgroupResponseBody setErrorCode(Long errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Long getErrorCode() {
        return this.errorCode;
    }

    public CountLinkeLinktWorkitemgroupResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CountLinkeLinktWorkitemgroupResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CountLinkeLinktWorkitemgroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CountLinkeLinktWorkitemgroupResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class CountLinkeLinktWorkitemgroupResponseBodyData extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Key")
        public String key;

        @NameInMap("Template")
        public String template;

        @NameInMap("CreatedAt")
        public Long createdAt;

        @NameInMap("Tags")
        public java.util.List<String> tags;

        @NameInMap("Priority")
        public Long priority;

        @NameInMap("RelatedProjects")
        public java.util.List<String> relatedProjects;

        @NameInMap("StatusStage")
        public Long statusStage;

        @NameInMap("Count")
        public Long count;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("Modifier")
        public String modifier;

        @NameInMap("ParentWorkItem")
        public String parentWorkItem;

        @NameInMap("Description")
        public String description;

        @NameInMap("TemplateList")
        public java.util.List<String> templateList;

        @NameInMap("Region")
        public String region;

        @NameInMap("Sign")
        public String sign;

        @NameInMap("Subject")
        public String subject;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("FinishedChildrenCount")
        public Long finishedChildrenCount;

        @NameInMap("Link")
        public String link;

        @NameInMap("Modules")
        public java.util.List<String> modules;

        @NameInMap("StatusId")
        public Long statusId;

        @NameInMap("Stamp")
        public String stamp;

        @NameInMap("PriorityEntity")
        public String priorityEntity;

        @NameInMap("CustomFieldsValues")
        public java.util.List<String> customFieldsValues;

        @NameInMap("ProjectName")
        public String projectName;

        @NameInMap("Ccs")
        public java.util.List<String> ccs;

        @NameInMap("Project")
        public String project;

        @NameInMap("Iteration")
        public String iteration;

        @NameInMap("ParentSign")
        public String parentSign;

        @NameInMap("SignPath")
        public String signPath;

        @NameInMap("ChildrenCount")
        public Long childrenCount;

        @NameInMap("IterationSign")
        public String iterationSign;

        @NameInMap("AssignedToIds")
        public String assignedToIds;

        @NameInMap("AttachmentVOs")
        public java.util.List<String> attachmentVOs;

        @NameInMap("ExpectedAt")
        public Long expectedAt;

        @NameInMap("ProjectSign")
        public String projectSign;

        @NameInMap("CustomFields")
        public java.util.List<String> customFields;

        @NameInMap("UpdatedAt")
        public Long updatedAt;

        @NameInMap("FilteredChildrenCount")
        public Long filteredChildrenCount;

        @NameInMap("TemplateId")
        public Long templateId;

        @NameInMap("AsRootLevel")
        public Boolean asRootLevel;

        @NameInMap("Id")
        public Long id;

        public static CountLinkeLinktWorkitemgroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CountLinkeLinktWorkitemgroupResponseBodyData self = new CountLinkeLinktWorkitemgroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CountLinkeLinktWorkitemgroupResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CountLinkeLinktWorkitemgroupResponseBodyData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CountLinkeLinktWorkitemgroupResponseBodyData setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public CountLinkeLinktWorkitemgroupResponseBodyData setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Long getCreatedAt() {
            return this.createdAt;
        }

        public CountLinkeLinktWorkitemgroupResponseBodyData setTags(java.util.List<String> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<String> getTags() {
            return this.tags;
        }

        public CountLinkeLinktWorkitemgroupResponseBodyData setPriority(Long priority) {
            this.priority = priority;
            return this;
        }
        public Long getPriority() {
            return this.priority;
        }

        public CountLinkeLinktWorkitemgroupResponseBodyData setRelatedProjects(java.util.List<String> relatedProjects) {
            this.relatedProjects = relatedProjects;
            return this;
        }
        public java.util.List<String> getRelatedProjects() {
            return this.relatedProjects;
        }

        public CountLinkeLinktWorkitemgroupResponseBodyData setStatusStage(Long statusStage) {
            this.statusStage = statusStage;
            return this;
        }
        public Long getStatusStage() {
            return this.statusStage;
        }

        public CountLinkeLinktWorkitemgroupResponseBodyData setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public CountLinkeLinktWorkitemgroupResponseBodyData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public CountLinkeLinktWorkitemgroupResponseBodyData setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public CountLinkeLinktWorkitemgroupResponseBodyData setParentWorkItem(String parentWorkItem) {
            this.parentWorkItem = parentWorkItem;
            return this;
        }
        public String getParentWorkItem() {
            return this.parentWorkItem;
        }

        public CountLinkeLinktWorkitemgroupResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CountLinkeLinktWorkitemgroupResponseBodyData setTemplateList(java.util.List<String> templateList) {
            this.templateList = templateList;
            return this;
        }
        public java.util.List<String> getTemplateList() {
            return this.templateList;
        }

        public CountLinkeLinktWorkitemgroupResponseBodyData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public CountLinkeLinktWorkitemgroupResponseBodyData setSign(String sign) {
            this.sign = sign;
            return this;
        }
        public String getSign() {
            return this.sign;
        }

        public CountLinkeLinktWorkitemgroupResponseBodyData setSubject(String subject) {
            this.subject = subject;
            return this;
        }
        public String getSubject() {
            return this.subject;
        }

        public CountLinkeLinktWorkitemgroupResponseBodyData setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public CountLinkeLinktWorkitemgroupResponseBodyData setFinishedChildrenCount(Long finishedChildrenCount) {
            this.finishedChildrenCount = finishedChildrenCount;
            return this;
        }
        public Long getFinishedChildrenCount() {
            return this.finishedChildrenCount;
        }

        public CountLinkeLinktWorkitemgroupResponseBodyData setLink(String link) {
            this.link = link;
            return this;
        }
        public String getLink() {
            return this.link;
        }

        public CountLinkeLinktWorkitemgroupResponseBodyData setModules(java.util.List<String> modules) {
            this.modules = modules;
            return this;
        }
        public java.util.List<String> getModules() {
            return this.modules;
        }

        public CountLinkeLinktWorkitemgroupResponseBodyData setStatusId(Long statusId) {
            this.statusId = statusId;
            return this;
        }
        public Long getStatusId() {
            return this.statusId;
        }

        public CountLinkeLinktWorkitemgroupResponseBodyData setStamp(String stamp) {
            this.stamp = stamp;
            return this;
        }
        public String getStamp() {
            return this.stamp;
        }

        public CountLinkeLinktWorkitemgroupResponseBodyData setPriorityEntity(String priorityEntity) {
            this.priorityEntity = priorityEntity;
            return this;
        }
        public String getPriorityEntity() {
            return this.priorityEntity;
        }

        public CountLinkeLinktWorkitemgroupResponseBodyData setCustomFieldsValues(java.util.List<String> customFieldsValues) {
            this.customFieldsValues = customFieldsValues;
            return this;
        }
        public java.util.List<String> getCustomFieldsValues() {
            return this.customFieldsValues;
        }

        public CountLinkeLinktWorkitemgroupResponseBodyData setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public CountLinkeLinktWorkitemgroupResponseBodyData setCcs(java.util.List<String> ccs) {
            this.ccs = ccs;
            return this;
        }
        public java.util.List<String> getCcs() {
            return this.ccs;
        }

        public CountLinkeLinktWorkitemgroupResponseBodyData setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public CountLinkeLinktWorkitemgroupResponseBodyData setIteration(String iteration) {
            this.iteration = iteration;
            return this;
        }
        public String getIteration() {
            return this.iteration;
        }

        public CountLinkeLinktWorkitemgroupResponseBodyData setParentSign(String parentSign) {
            this.parentSign = parentSign;
            return this;
        }
        public String getParentSign() {
            return this.parentSign;
        }

        public CountLinkeLinktWorkitemgroupResponseBodyData setSignPath(String signPath) {
            this.signPath = signPath;
            return this;
        }
        public String getSignPath() {
            return this.signPath;
        }

        public CountLinkeLinktWorkitemgroupResponseBodyData setChildrenCount(Long childrenCount) {
            this.childrenCount = childrenCount;
            return this;
        }
        public Long getChildrenCount() {
            return this.childrenCount;
        }

        public CountLinkeLinktWorkitemgroupResponseBodyData setIterationSign(String iterationSign) {
            this.iterationSign = iterationSign;
            return this;
        }
        public String getIterationSign() {
            return this.iterationSign;
        }

        public CountLinkeLinktWorkitemgroupResponseBodyData setAssignedToIds(String assignedToIds) {
            this.assignedToIds = assignedToIds;
            return this;
        }
        public String getAssignedToIds() {
            return this.assignedToIds;
        }

        public CountLinkeLinktWorkitemgroupResponseBodyData setAttachmentVOs(java.util.List<String> attachmentVOs) {
            this.attachmentVOs = attachmentVOs;
            return this;
        }
        public java.util.List<String> getAttachmentVOs() {
            return this.attachmentVOs;
        }

        public CountLinkeLinktWorkitemgroupResponseBodyData setExpectedAt(Long expectedAt) {
            this.expectedAt = expectedAt;
            return this;
        }
        public Long getExpectedAt() {
            return this.expectedAt;
        }

        public CountLinkeLinktWorkitemgroupResponseBodyData setProjectSign(String projectSign) {
            this.projectSign = projectSign;
            return this;
        }
        public String getProjectSign() {
            return this.projectSign;
        }

        public CountLinkeLinktWorkitemgroupResponseBodyData setCustomFields(java.util.List<String> customFields) {
            this.customFields = customFields;
            return this;
        }
        public java.util.List<String> getCustomFields() {
            return this.customFields;
        }

        public CountLinkeLinktWorkitemgroupResponseBodyData setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

        public CountLinkeLinktWorkitemgroupResponseBodyData setFilteredChildrenCount(Long filteredChildrenCount) {
            this.filteredChildrenCount = filteredChildrenCount;
            return this;
        }
        public Long getFilteredChildrenCount() {
            return this.filteredChildrenCount;
        }

        public CountLinkeLinktWorkitemgroupResponseBodyData setTemplateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }
        public Long getTemplateId() {
            return this.templateId;
        }

        public CountLinkeLinktWorkitemgroupResponseBodyData setAsRootLevel(Boolean asRootLevel) {
            this.asRootLevel = asRootLevel;
            return this;
        }
        public Boolean getAsRootLevel() {
            return this.asRootLevel;
        }

        public CountLinkeLinktWorkitemgroupResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
