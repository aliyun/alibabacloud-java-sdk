// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeLinktCreatestatusandupdatetoworkflowResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Data")
    public ExecLinkeLinktCreatestatusandupdatetoworkflowResponseBodyData data;

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

    public static ExecLinkeLinktCreatestatusandupdatetoworkflowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeLinktCreatestatusandupdatetoworkflowResponseBody self = new ExecLinkeLinktCreatestatusandupdatetoworkflowResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecLinkeLinktCreatestatusandupdatetoworkflowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecLinkeLinktCreatestatusandupdatetoworkflowResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public ExecLinkeLinktCreatestatusandupdatetoworkflowResponseBody setData(ExecLinkeLinktCreatestatusandupdatetoworkflowResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ExecLinkeLinktCreatestatusandupdatetoworkflowResponseBodyData getData() {
        return this.data;
    }

    public ExecLinkeLinktCreatestatusandupdatetoworkflowResponseBody setErrorCode(Long errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Long getErrorCode() {
        return this.errorCode;
    }

    public ExecLinkeLinktCreatestatusandupdatetoworkflowResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ExecLinkeLinktCreatestatusandupdatetoworkflowResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ExecLinkeLinktCreatestatusandupdatetoworkflowResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ExecLinkeLinktCreatestatusandupdatetoworkflowResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class ExecLinkeLinktCreatestatusandupdatetoworkflowResponseBodyData extends TeaModel {
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

        public static ExecLinkeLinktCreatestatusandupdatetoworkflowResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ExecLinkeLinktCreatestatusandupdatetoworkflowResponseBodyData self = new ExecLinkeLinktCreatestatusandupdatetoworkflowResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ExecLinkeLinktCreatestatusandupdatetoworkflowResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ExecLinkeLinktCreatestatusandupdatetoworkflowResponseBodyData setStatusId(Long statusId) {
            this.statusId = statusId;
            return this;
        }
        public Long getStatusId() {
            return this.statusId;
        }

        public ExecLinkeLinktCreatestatusandupdatetoworkflowResponseBodyData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public ExecLinkeLinktCreatestatusandupdatetoworkflowResponseBodyData setPosition(Long position) {
            this.position = position;
            return this;
        }
        public Long getPosition() {
            return this.position;
        }

        public ExecLinkeLinktCreatestatusandupdatetoworkflowResponseBodyData setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Long getCreatedAt() {
            return this.createdAt;
        }

        public ExecLinkeLinktCreatestatusandupdatetoworkflowResponseBodyData setWorkflowId(Long workflowId) {
            this.workflowId = workflowId;
            return this;
        }
        public Long getWorkflowId() {
            return this.workflowId;
        }

        public ExecLinkeLinktCreatestatusandupdatetoworkflowResponseBodyData setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public ExecLinkeLinktCreatestatusandupdatetoworkflowResponseBodyData setAsDefault(Boolean asDefault) {
            this.asDefault = asDefault;
            return this;
        }
        public Boolean getAsDefault() {
            return this.asDefault;
        }

        public ExecLinkeLinktCreatestatusandupdatetoworkflowResponseBodyData setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

        public ExecLinkeLinktCreatestatusandupdatetoworkflowResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
