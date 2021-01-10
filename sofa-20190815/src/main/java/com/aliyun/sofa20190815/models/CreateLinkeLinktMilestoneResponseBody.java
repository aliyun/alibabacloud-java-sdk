// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeLinktMilestoneResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Data")
    public CreateLinkeLinktMilestoneResponseBodyData data;

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

    public static CreateLinkeLinktMilestoneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeLinktMilestoneResponseBody self = new CreateLinkeLinktMilestoneResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLinkeLinktMilestoneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateLinkeLinktMilestoneResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public CreateLinkeLinktMilestoneResponseBody setData(CreateLinkeLinktMilestoneResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateLinkeLinktMilestoneResponseBodyData getData() {
        return this.data;
    }

    public CreateLinkeLinktMilestoneResponseBody setErrorCode(Long errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Long getErrorCode() {
        return this.errorCode;
    }

    public CreateLinkeLinktMilestoneResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateLinkeLinktMilestoneResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CreateLinkeLinktMilestoneResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateLinkeLinktMilestoneResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class CreateLinkeLinktMilestoneResponseBodyData extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Manager")
        public String manager;

        @NameInMap("ActualEndDate")
        public Long actualEndDate;

        @NameInMap("CreatedAt")
        public Long createdAt;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("Modifier")
        public String modifier;

        @NameInMap("Description")
        public String description;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("ExpectEndDate")
        public Long expectEndDate;

        @NameInMap("UpdatedAt")
        public Long updatedAt;

        @NameInMap("Name")
        public String name;

        @NameInMap("Target")
        public String target;

        @NameInMap("Id")
        public Long id;

        @NameInMap("TargetType")
        public String targetType;

        public static CreateLinkeLinktMilestoneResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateLinkeLinktMilestoneResponseBodyData self = new CreateLinkeLinktMilestoneResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateLinkeLinktMilestoneResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateLinkeLinktMilestoneResponseBodyData setManager(String manager) {
            this.manager = manager;
            return this;
        }
        public String getManager() {
            return this.manager;
        }

        public CreateLinkeLinktMilestoneResponseBodyData setActualEndDate(Long actualEndDate) {
            this.actualEndDate = actualEndDate;
            return this;
        }
        public Long getActualEndDate() {
            return this.actualEndDate;
        }

        public CreateLinkeLinktMilestoneResponseBodyData setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Long getCreatedAt() {
            return this.createdAt;
        }

        public CreateLinkeLinktMilestoneResponseBodyData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public CreateLinkeLinktMilestoneResponseBodyData setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public CreateLinkeLinktMilestoneResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateLinkeLinktMilestoneResponseBodyData setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public CreateLinkeLinktMilestoneResponseBodyData setExpectEndDate(Long expectEndDate) {
            this.expectEndDate = expectEndDate;
            return this;
        }
        public Long getExpectEndDate() {
            return this.expectEndDate;
        }

        public CreateLinkeLinktMilestoneResponseBodyData setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

        public CreateLinkeLinktMilestoneResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateLinkeLinktMilestoneResponseBodyData setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

        public CreateLinkeLinktMilestoneResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CreateLinkeLinktMilestoneResponseBodyData setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

    }

}
