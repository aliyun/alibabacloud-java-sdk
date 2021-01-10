// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinktTemplateworkflowResponseBody extends TeaModel {
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
    public QueryLinkeLinktTemplateworkflowResponseBodyData data;

    public static QueryLinkeLinktTemplateworkflowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinktTemplateworkflowResponseBody self = new QueryLinkeLinktTemplateworkflowResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinktTemplateworkflowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkeLinktTemplateworkflowResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkeLinktTemplateworkflowResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkeLinktTemplateworkflowResponseBody setErrorCode(Long errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Long getErrorCode() {
        return this.errorCode;
    }

    public QueryLinkeLinktTemplateworkflowResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryLinkeLinktTemplateworkflowResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkeLinktTemplateworkflowResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkeLinktTemplateworkflowResponseBody setData(QueryLinkeLinktTemplateworkflowResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryLinkeLinktTemplateworkflowResponseBodyData getData() {
        return this.data;
    }

    public static class QueryLinkeLinktTemplateworkflowResponseBodyData extends TeaModel {
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

        public static QueryLinkeLinktTemplateworkflowResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeLinktTemplateworkflowResponseBodyData self = new QueryLinkeLinktTemplateworkflowResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryLinkeLinktTemplateworkflowResponseBodyData setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Long getCreatedAt() {
            return this.createdAt;
        }

        public QueryLinkeLinktTemplateworkflowResponseBodyData setDefaultStatus(String defaultStatus) {
            this.defaultStatus = defaultStatus;
            return this;
        }
        public String getDefaultStatus() {
            return this.defaultStatus;
        }

        public QueryLinkeLinktTemplateworkflowResponseBodyData setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public QueryLinkeLinktTemplateworkflowResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryLinkeLinktTemplateworkflowResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryLinkeLinktTemplateworkflowResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryLinkeLinktTemplateworkflowResponseBodyData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public QueryLinkeLinktTemplateworkflowResponseBodyData setStatusesMap(String statusesMap) {
            this.statusesMap = statusesMap;
            return this;
        }
        public String getStatusesMap() {
            return this.statusesMap;
        }

        public QueryLinkeLinktTemplateworkflowResponseBodyData setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

        public QueryLinkeLinktTemplateworkflowResponseBodyData setStatuses(java.util.List<String> statuses) {
            this.statuses = statuses;
            return this;
        }
        public java.util.List<String> getStatuses() {
            return this.statuses;
        }

        public QueryLinkeLinktTemplateworkflowResponseBodyData setWorkflowStatuses(java.util.List<String> workflowStatuses) {
            this.workflowStatuses = workflowStatuses;
            return this;
        }
        public java.util.List<String> getWorkflowStatuses() {
            return this.workflowStatuses;
        }

    }

}
