// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeLinktTemplatecopyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Data")
    public ExecLinkeLinktTemplatecopyResponseBodyData data;

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

    public static ExecLinkeLinktTemplatecopyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeLinktTemplatecopyResponseBody self = new ExecLinkeLinktTemplatecopyResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecLinkeLinktTemplatecopyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecLinkeLinktTemplatecopyResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public ExecLinkeLinktTemplatecopyResponseBody setData(ExecLinkeLinktTemplatecopyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ExecLinkeLinktTemplatecopyResponseBodyData getData() {
        return this.data;
    }

    public ExecLinkeLinktTemplatecopyResponseBody setErrorCode(Long errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Long getErrorCode() {
        return this.errorCode;
    }

    public ExecLinkeLinktTemplatecopyResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ExecLinkeLinktTemplatecopyResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ExecLinkeLinktTemplatecopyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ExecLinkeLinktTemplatecopyResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class ExecLinkeLinktTemplatecopyResponseBodyData extends TeaModel {
        @NameInMap("Type")
        public Long type;

        @NameInMap("DefaultContent")
        public String defaultContent;

        @NameInMap("TemplateLabel")
        public String templateLabel;

        @NameInMap("Stamp")
        public String stamp;

        @NameInMap("CreatedAt")
        public Long createdAt;

        @NameInMap("Priority")
        public Long priority;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("Description")
        public String description;

        @NameInMap("ProjectSign")
        public String projectSign;

        @NameInMap("WorkflowId")
        public Long workflowId;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("UpdatedAt")
        public Long updatedAt;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public Long id;

        public static ExecLinkeLinktTemplatecopyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ExecLinkeLinktTemplatecopyResponseBodyData self = new ExecLinkeLinktTemplatecopyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ExecLinkeLinktTemplatecopyResponseBodyData setType(Long type) {
            this.type = type;
            return this;
        }
        public Long getType() {
            return this.type;
        }

        public ExecLinkeLinktTemplatecopyResponseBodyData setDefaultContent(String defaultContent) {
            this.defaultContent = defaultContent;
            return this;
        }
        public String getDefaultContent() {
            return this.defaultContent;
        }

        public ExecLinkeLinktTemplatecopyResponseBodyData setTemplateLabel(String templateLabel) {
            this.templateLabel = templateLabel;
            return this;
        }
        public String getTemplateLabel() {
            return this.templateLabel;
        }

        public ExecLinkeLinktTemplatecopyResponseBodyData setStamp(String stamp) {
            this.stamp = stamp;
            return this;
        }
        public String getStamp() {
            return this.stamp;
        }

        public ExecLinkeLinktTemplatecopyResponseBodyData setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Long getCreatedAt() {
            return this.createdAt;
        }

        public ExecLinkeLinktTemplatecopyResponseBodyData setPriority(Long priority) {
            this.priority = priority;
            return this;
        }
        public Long getPriority() {
            return this.priority;
        }

        public ExecLinkeLinktTemplatecopyResponseBodyData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ExecLinkeLinktTemplatecopyResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ExecLinkeLinktTemplatecopyResponseBodyData setProjectSign(String projectSign) {
            this.projectSign = projectSign;
            return this;
        }
        public String getProjectSign() {
            return this.projectSign;
        }

        public ExecLinkeLinktTemplatecopyResponseBodyData setWorkflowId(Long workflowId) {
            this.workflowId = workflowId;
            return this;
        }
        public Long getWorkflowId() {
            return this.workflowId;
        }

        public ExecLinkeLinktTemplatecopyResponseBodyData setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public ExecLinkeLinktTemplatecopyResponseBodyData setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

        public ExecLinkeLinktTemplatecopyResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ExecLinkeLinktTemplatecopyResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
