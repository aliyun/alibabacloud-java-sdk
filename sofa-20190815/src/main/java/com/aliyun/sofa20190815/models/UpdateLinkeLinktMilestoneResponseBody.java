// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeLinktMilestoneResponseBody extends TeaModel {
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
    public UpdateLinkeLinktMilestoneResponseBodyData data;

    public static UpdateLinkeLinktMilestoneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeLinktMilestoneResponseBody self = new UpdateLinkeLinktMilestoneResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeLinktMilestoneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateLinkeLinktMilestoneResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateLinkeLinktMilestoneResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public UpdateLinkeLinktMilestoneResponseBody setErrorCode(Long errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Long getErrorCode() {
        return this.errorCode;
    }

    public UpdateLinkeLinktMilestoneResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public UpdateLinkeLinktMilestoneResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public UpdateLinkeLinktMilestoneResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public UpdateLinkeLinktMilestoneResponseBody setData(UpdateLinkeLinktMilestoneResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateLinkeLinktMilestoneResponseBodyData getData() {
        return this.data;
    }

    public static class UpdateLinkeLinktMilestoneResponseBodyData extends TeaModel {
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

        public static UpdateLinkeLinktMilestoneResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateLinkeLinktMilestoneResponseBodyData self = new UpdateLinkeLinktMilestoneResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateLinkeLinktMilestoneResponseBodyData setActualEndDate(Long actualEndDate) {
            this.actualEndDate = actualEndDate;
            return this;
        }
        public Long getActualEndDate() {
            return this.actualEndDate;
        }

        public UpdateLinkeLinktMilestoneResponseBodyData setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Long getCreatedAt() {
            return this.createdAt;
        }

        public UpdateLinkeLinktMilestoneResponseBodyData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public UpdateLinkeLinktMilestoneResponseBodyData setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public UpdateLinkeLinktMilestoneResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateLinkeLinktMilestoneResponseBodyData setExpectEndDate(Long expectEndDate) {
            this.expectEndDate = expectEndDate;
            return this;
        }
        public Long getExpectEndDate() {
            return this.expectEndDate;
        }

        public UpdateLinkeLinktMilestoneResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateLinkeLinktMilestoneResponseBodyData setManager(String manager) {
            this.manager = manager;
            return this;
        }
        public String getManager() {
            return this.manager;
        }

        public UpdateLinkeLinktMilestoneResponseBodyData setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public UpdateLinkeLinktMilestoneResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateLinkeLinktMilestoneResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public UpdateLinkeLinktMilestoneResponseBodyData setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

        public UpdateLinkeLinktMilestoneResponseBodyData setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

        public UpdateLinkeLinktMilestoneResponseBodyData setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

    }

}
