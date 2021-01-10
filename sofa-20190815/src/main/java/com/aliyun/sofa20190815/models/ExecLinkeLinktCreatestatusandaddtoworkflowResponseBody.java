// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeLinktCreatestatusandaddtoworkflowResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Data")
    public ExecLinkeLinktCreatestatusandaddtoworkflowResponseBodyData data;

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

    public static ExecLinkeLinktCreatestatusandaddtoworkflowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeLinktCreatestatusandaddtoworkflowResponseBody self = new ExecLinkeLinktCreatestatusandaddtoworkflowResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecLinkeLinktCreatestatusandaddtoworkflowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecLinkeLinktCreatestatusandaddtoworkflowResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public ExecLinkeLinktCreatestatusandaddtoworkflowResponseBody setData(ExecLinkeLinktCreatestatusandaddtoworkflowResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ExecLinkeLinktCreatestatusandaddtoworkflowResponseBodyData getData() {
        return this.data;
    }

    public ExecLinkeLinktCreatestatusandaddtoworkflowResponseBody setErrorCode(Long errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Long getErrorCode() {
        return this.errorCode;
    }

    public ExecLinkeLinktCreatestatusandaddtoworkflowResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ExecLinkeLinktCreatestatusandaddtoworkflowResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ExecLinkeLinktCreatestatusandaddtoworkflowResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ExecLinkeLinktCreatestatusandaddtoworkflowResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class ExecLinkeLinktCreatestatusandaddtoworkflowResponseBodyData extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("StatusId")
        public Long statusId;

        @NameInMap("Region")
        public String region;

        @NameInMap("Position")
        public Long position;

        @NameInMap("CreatedAt")
        public Long createdAt;

        @NameInMap("WorkflowId")
        public Long workflowId;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("AsDefault")
        public Boolean asDefault;

        @NameInMap("UpdatedAt")
        public Long updatedAt;

        @NameInMap("Id")
        public Long id;

        public static ExecLinkeLinktCreatestatusandaddtoworkflowResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ExecLinkeLinktCreatestatusandaddtoworkflowResponseBodyData self = new ExecLinkeLinktCreatestatusandaddtoworkflowResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ExecLinkeLinktCreatestatusandaddtoworkflowResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ExecLinkeLinktCreatestatusandaddtoworkflowResponseBodyData setStatusId(Long statusId) {
            this.statusId = statusId;
            return this;
        }
        public Long getStatusId() {
            return this.statusId;
        }

        public ExecLinkeLinktCreatestatusandaddtoworkflowResponseBodyData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public ExecLinkeLinktCreatestatusandaddtoworkflowResponseBodyData setPosition(Long position) {
            this.position = position;
            return this;
        }
        public Long getPosition() {
            return this.position;
        }

        public ExecLinkeLinktCreatestatusandaddtoworkflowResponseBodyData setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Long getCreatedAt() {
            return this.createdAt;
        }

        public ExecLinkeLinktCreatestatusandaddtoworkflowResponseBodyData setWorkflowId(Long workflowId) {
            this.workflowId = workflowId;
            return this;
        }
        public Long getWorkflowId() {
            return this.workflowId;
        }

        public ExecLinkeLinktCreatestatusandaddtoworkflowResponseBodyData setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public ExecLinkeLinktCreatestatusandaddtoworkflowResponseBodyData setAsDefault(Boolean asDefault) {
            this.asDefault = asDefault;
            return this;
        }
        public Boolean getAsDefault() {
            return this.asDefault;
        }

        public ExecLinkeLinktCreatestatusandaddtoworkflowResponseBodyData setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

        public ExecLinkeLinktCreatestatusandaddtoworkflowResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
