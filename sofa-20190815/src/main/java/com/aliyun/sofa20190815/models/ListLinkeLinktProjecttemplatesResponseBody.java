// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLinkeLinktProjecttemplatesResponseBody extends TeaModel {
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
    public java.util.List<ListLinkeLinktProjecttemplatesResponseBodyData> data;

    public static ListLinkeLinktProjecttemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLinkeLinktProjecttemplatesResponseBody self = new ListLinkeLinktProjecttemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLinkeLinktProjecttemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLinkeLinktProjecttemplatesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListLinkeLinktProjecttemplatesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListLinkeLinktProjecttemplatesResponseBody setErrorCode(Long errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Long getErrorCode() {
        return this.errorCode;
    }

    public ListLinkeLinktProjecttemplatesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListLinkeLinktProjecttemplatesResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public ListLinkeLinktProjecttemplatesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListLinkeLinktProjecttemplatesResponseBody setData(java.util.List<ListLinkeLinktProjecttemplatesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListLinkeLinktProjecttemplatesResponseBodyData> getData() {
        return this.data;
    }

    public static class ListLinkeLinktProjecttemplatesResponseBodyData extends TeaModel {
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

        @NameInMap("WorkflowId")
        public Long workflowId;

        public static ListLinkeLinktProjecttemplatesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListLinkeLinktProjecttemplatesResponseBodyData self = new ListLinkeLinktProjecttemplatesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListLinkeLinktProjecttemplatesResponseBodyData setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Long getCreatedAt() {
            return this.createdAt;
        }

        public ListLinkeLinktProjecttemplatesResponseBodyData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListLinkeLinktProjecttemplatesResponseBodyData setDefaultContent(String defaultContent) {
            this.defaultContent = defaultContent;
            return this;
        }
        public String getDefaultContent() {
            return this.defaultContent;
        }

        public ListLinkeLinktProjecttemplatesResponseBodyData setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public ListLinkeLinktProjecttemplatesResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListLinkeLinktProjecttemplatesResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListLinkeLinktProjecttemplatesResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListLinkeLinktProjecttemplatesResponseBodyData setPriority(Long priority) {
            this.priority = priority;
            return this;
        }
        public Long getPriority() {
            return this.priority;
        }

        public ListLinkeLinktProjecttemplatesResponseBodyData setProjectSign(String projectSign) {
            this.projectSign = projectSign;
            return this;
        }
        public String getProjectSign() {
            return this.projectSign;
        }

        public ListLinkeLinktProjecttemplatesResponseBodyData setStamp(String stamp) {
            this.stamp = stamp;
            return this;
        }
        public String getStamp() {
            return this.stamp;
        }

        public ListLinkeLinktProjecttemplatesResponseBodyData setTemplateLabel(String templateLabel) {
            this.templateLabel = templateLabel;
            return this;
        }
        public String getTemplateLabel() {
            return this.templateLabel;
        }

        public ListLinkeLinktProjecttemplatesResponseBodyData setType(Long type) {
            this.type = type;
            return this;
        }
        public Long getType() {
            return this.type;
        }

        public ListLinkeLinktProjecttemplatesResponseBodyData setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

        public ListLinkeLinktProjecttemplatesResponseBodyData setWorkflowId(Long workflowId) {
            this.workflowId = workflowId;
            return this;
        }
        public Long getWorkflowId() {
            return this.workflowId;
        }

    }

}
