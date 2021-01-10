// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinktMilestoneResponseBody extends TeaModel {
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
    public QueryLinkeLinktMilestoneResponseBodyData data;

    public static QueryLinkeLinktMilestoneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinktMilestoneResponseBody self = new QueryLinkeLinktMilestoneResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinktMilestoneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkeLinktMilestoneResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkeLinktMilestoneResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkeLinktMilestoneResponseBody setErrorCode(Long errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Long getErrorCode() {
        return this.errorCode;
    }

    public QueryLinkeLinktMilestoneResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryLinkeLinktMilestoneResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkeLinktMilestoneResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkeLinktMilestoneResponseBody setData(QueryLinkeLinktMilestoneResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryLinkeLinktMilestoneResponseBodyData getData() {
        return this.data;
    }

    public static class QueryLinkeLinktMilestoneResponseBodyData extends TeaModel {
        @NameInMap("ActualEndDate")
        public Long actualEndDate;

        @NameInMap("CreatedAt")
        public Long createdAt;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("Description")
        public String description;

        @NameInMap("ExpectEndDate")
        public Long expectEndDate;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Manager")
        public String manager;

        @NameInMap("Modifier")
        public String modifier;

        @NameInMap("Name")
        public String name;

        @NameInMap("Status")
        public String status;

        @NameInMap("Target")
        public String target;

        @NameInMap("TargetType")
        public String targetType;

        @NameInMap("UpdatedAt")
        public Long updatedAt;

        public static QueryLinkeLinktMilestoneResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeLinktMilestoneResponseBodyData self = new QueryLinkeLinktMilestoneResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryLinkeLinktMilestoneResponseBodyData setActualEndDate(Long actualEndDate) {
            this.actualEndDate = actualEndDate;
            return this;
        }
        public Long getActualEndDate() {
            return this.actualEndDate;
        }

        public QueryLinkeLinktMilestoneResponseBodyData setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Long getCreatedAt() {
            return this.createdAt;
        }

        public QueryLinkeLinktMilestoneResponseBodyData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public QueryLinkeLinktMilestoneResponseBodyData setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public QueryLinkeLinktMilestoneResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryLinkeLinktMilestoneResponseBodyData setExpectEndDate(Long expectEndDate) {
            this.expectEndDate = expectEndDate;
            return this;
        }
        public Long getExpectEndDate() {
            return this.expectEndDate;
        }

        public QueryLinkeLinktMilestoneResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryLinkeLinktMilestoneResponseBodyData setManager(String manager) {
            this.manager = manager;
            return this;
        }
        public String getManager() {
            return this.manager;
        }

        public QueryLinkeLinktMilestoneResponseBodyData setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public QueryLinkeLinktMilestoneResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryLinkeLinktMilestoneResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryLinkeLinktMilestoneResponseBodyData setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

        public QueryLinkeLinktMilestoneResponseBodyData setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

        public QueryLinkeLinktMilestoneResponseBodyData setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

    }

}
