// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLinkeLinktGlobaltemplatedetailResponseBody extends TeaModel {
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
    public java.util.List<ListLinkeLinktGlobaltemplatedetailResponseBodyData> data;

    public static ListLinkeLinktGlobaltemplatedetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLinkeLinktGlobaltemplatedetailResponseBody self = new ListLinkeLinktGlobaltemplatedetailResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLinkeLinktGlobaltemplatedetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLinkeLinktGlobaltemplatedetailResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListLinkeLinktGlobaltemplatedetailResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListLinkeLinktGlobaltemplatedetailResponseBody setErrorCode(Long errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Long getErrorCode() {
        return this.errorCode;
    }

    public ListLinkeLinktGlobaltemplatedetailResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListLinkeLinktGlobaltemplatedetailResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public ListLinkeLinktGlobaltemplatedetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListLinkeLinktGlobaltemplatedetailResponseBody setData(java.util.List<ListLinkeLinktGlobaltemplatedetailResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListLinkeLinktGlobaltemplatedetailResponseBodyData> getData() {
        return this.data;
    }

    public static class ListLinkeLinktGlobaltemplatedetailResponseBodyData extends TeaModel {
        @NameInMap("CreatedAt")
        public Long createdAt;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("DefaultContent")
        public String defaultContent;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("Description")
        public String description;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Priority")
        public Long priority;

        @NameInMap("ProjectSign")
        public String projectSign;

        @NameInMap("Stamp")
        public String stamp;

        @NameInMap("TemplateLabel")
        public String templateLabel;

        @NameInMap("Type")
        public Long type;

        @NameInMap("UpdatedAt")
        public Long updatedAt;

        @NameInMap("Workflow")
        public String workflow;

        @NameInMap("WorkflowId")
        public Long workflowId;

        @NameInMap("CustomFieldsList")
        public java.util.List<String> customFieldsList;

        public static ListLinkeLinktGlobaltemplatedetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListLinkeLinktGlobaltemplatedetailResponseBodyData self = new ListLinkeLinktGlobaltemplatedetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListLinkeLinktGlobaltemplatedetailResponseBodyData setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Long getCreatedAt() {
            return this.createdAt;
        }

        public ListLinkeLinktGlobaltemplatedetailResponseBodyData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListLinkeLinktGlobaltemplatedetailResponseBodyData setDefaultContent(String defaultContent) {
            this.defaultContent = defaultContent;
            return this;
        }
        public String getDefaultContent() {
            return this.defaultContent;
        }

        public ListLinkeLinktGlobaltemplatedetailResponseBodyData setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public ListLinkeLinktGlobaltemplatedetailResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListLinkeLinktGlobaltemplatedetailResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListLinkeLinktGlobaltemplatedetailResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListLinkeLinktGlobaltemplatedetailResponseBodyData setPriority(Long priority) {
            this.priority = priority;
            return this;
        }
        public Long getPriority() {
            return this.priority;
        }

        public ListLinkeLinktGlobaltemplatedetailResponseBodyData setProjectSign(String projectSign) {
            this.projectSign = projectSign;
            return this;
        }
        public String getProjectSign() {
            return this.projectSign;
        }

        public ListLinkeLinktGlobaltemplatedetailResponseBodyData setStamp(String stamp) {
            this.stamp = stamp;
            return this;
        }
        public String getStamp() {
            return this.stamp;
        }

        public ListLinkeLinktGlobaltemplatedetailResponseBodyData setTemplateLabel(String templateLabel) {
            this.templateLabel = templateLabel;
            return this;
        }
        public String getTemplateLabel() {
            return this.templateLabel;
        }

        public ListLinkeLinktGlobaltemplatedetailResponseBodyData setType(Long type) {
            this.type = type;
            return this;
        }
        public Long getType() {
            return this.type;
        }

        public ListLinkeLinktGlobaltemplatedetailResponseBodyData setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

        public ListLinkeLinktGlobaltemplatedetailResponseBodyData setWorkflow(String workflow) {
            this.workflow = workflow;
            return this;
        }
        public String getWorkflow() {
            return this.workflow;
        }

        public ListLinkeLinktGlobaltemplatedetailResponseBodyData setWorkflowId(Long workflowId) {
            this.workflowId = workflowId;
            return this;
        }
        public Long getWorkflowId() {
            return this.workflowId;
        }

        public ListLinkeLinktGlobaltemplatedetailResponseBodyData setCustomFieldsList(java.util.List<String> customFieldsList) {
            this.customFieldsList = customFieldsList;
            return this;
        }
        public java.util.List<String> getCustomFieldsList() {
            return this.customFieldsList;
        }

    }

}
