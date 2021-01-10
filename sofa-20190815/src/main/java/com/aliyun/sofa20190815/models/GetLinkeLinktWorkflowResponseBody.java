// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeLinktWorkflowResponseBody extends TeaModel {
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
    public GetLinkeLinktWorkflowResponseBodyData data;

    public static GetLinkeLinktWorkflowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeLinktWorkflowResponseBody self = new GetLinkeLinktWorkflowResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeLinktWorkflowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeLinktWorkflowResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeLinktWorkflowResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeLinktWorkflowResponseBody setErrorCode(Long errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Long getErrorCode() {
        return this.errorCode;
    }

    public GetLinkeLinktWorkflowResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetLinkeLinktWorkflowResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkeLinktWorkflowResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkeLinktWorkflowResponseBody setData(GetLinkeLinktWorkflowResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetLinkeLinktWorkflowResponseBodyData getData() {
        return this.data;
    }

    public static class GetLinkeLinktWorkflowResponseBodyData extends TeaModel {
        @NameInMap("CreatedAt")
        public Long createdAt;

        @NameInMap("DefaultStatus")
        public String defaultStatus;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("Description")
        public String description;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Region")
        public String region;

        @NameInMap("StatusesMap")
        public String statusesMap;

        @NameInMap("UpdatedAt")
        public Long updatedAt;

        @NameInMap("Statuses")
        public java.util.List<String> statuses;

        @NameInMap("WorkflowStatuses")
        public java.util.List<String> workflowStatuses;

        public static GetLinkeLinktWorkflowResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeLinktWorkflowResponseBodyData self = new GetLinkeLinktWorkflowResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetLinkeLinktWorkflowResponseBodyData setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Long getCreatedAt() {
            return this.createdAt;
        }

        public GetLinkeLinktWorkflowResponseBodyData setDefaultStatus(String defaultStatus) {
            this.defaultStatus = defaultStatus;
            return this;
        }
        public String getDefaultStatus() {
            return this.defaultStatus;
        }

        public GetLinkeLinktWorkflowResponseBodyData setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public GetLinkeLinktWorkflowResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetLinkeLinktWorkflowResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetLinkeLinktWorkflowResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetLinkeLinktWorkflowResponseBodyData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetLinkeLinktWorkflowResponseBodyData setStatusesMap(String statusesMap) {
            this.statusesMap = statusesMap;
            return this;
        }
        public String getStatusesMap() {
            return this.statusesMap;
        }

        public GetLinkeLinktWorkflowResponseBodyData setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

        public GetLinkeLinktWorkflowResponseBodyData setStatuses(java.util.List<String> statuses) {
            this.statuses = statuses;
            return this;
        }
        public java.util.List<String> getStatuses() {
            return this.statuses;
        }

        public GetLinkeLinktWorkflowResponseBodyData setWorkflowStatuses(java.util.List<String> workflowStatuses) {
            this.workflowStatuses = workflowStatuses;
            return this;
        }
        public java.util.List<String> getWorkflowStatuses() {
            return this.workflowStatuses;
        }

    }

}
