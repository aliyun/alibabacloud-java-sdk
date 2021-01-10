// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeLinktRiskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Data")
    public CreateLinkeLinktRiskResponseBodyData data;

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

    public static CreateLinkeLinktRiskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeLinktRiskResponseBody self = new CreateLinkeLinktRiskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLinkeLinktRiskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateLinkeLinktRiskResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public CreateLinkeLinktRiskResponseBody setData(CreateLinkeLinktRiskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateLinkeLinktRiskResponseBodyData getData() {
        return this.data;
    }

    public CreateLinkeLinktRiskResponseBody setErrorCode(Long errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Long getErrorCode() {
        return this.errorCode;
    }

    public CreateLinkeLinktRiskResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateLinkeLinktRiskResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CreateLinkeLinktRiskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateLinkeLinktRiskResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class CreateLinkeLinktRiskResponseBodyData extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("CreatedAt")
        public Long createdAt;

        @NameInMap("Priority")
        public Long priority;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("Cc")
        public java.util.List<String> cc;

        @NameInMap("ExpectedCompletionDate")
        public Long expectedCompletionDate;

        @NameInMap("AssignedTo")
        public String assignedTo;

        @NameInMap("Region")
        public String region;

        @NameInMap("ProjectSign")
        public String projectSign;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("UpdatedAt")
        public Long updatedAt;

        @NameInMap("Title")
        public String title;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Level")
        public String level;

        public static CreateLinkeLinktRiskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateLinkeLinktRiskResponseBodyData self = new CreateLinkeLinktRiskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateLinkeLinktRiskResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateLinkeLinktRiskResponseBodyData setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public CreateLinkeLinktRiskResponseBodyData setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Long getCreatedAt() {
            return this.createdAt;
        }

        public CreateLinkeLinktRiskResponseBodyData setPriority(Long priority) {
            this.priority = priority;
            return this;
        }
        public Long getPriority() {
            return this.priority;
        }

        public CreateLinkeLinktRiskResponseBodyData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public CreateLinkeLinktRiskResponseBodyData setCc(java.util.List<String> cc) {
            this.cc = cc;
            return this;
        }
        public java.util.List<String> getCc() {
            return this.cc;
        }

        public CreateLinkeLinktRiskResponseBodyData setExpectedCompletionDate(Long expectedCompletionDate) {
            this.expectedCompletionDate = expectedCompletionDate;
            return this;
        }
        public Long getExpectedCompletionDate() {
            return this.expectedCompletionDate;
        }

        public CreateLinkeLinktRiskResponseBodyData setAssignedTo(String assignedTo) {
            this.assignedTo = assignedTo;
            return this;
        }
        public String getAssignedTo() {
            return this.assignedTo;
        }

        public CreateLinkeLinktRiskResponseBodyData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public CreateLinkeLinktRiskResponseBodyData setProjectSign(String projectSign) {
            this.projectSign = projectSign;
            return this;
        }
        public String getProjectSign() {
            return this.projectSign;
        }

        public CreateLinkeLinktRiskResponseBodyData setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public CreateLinkeLinktRiskResponseBodyData setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

        public CreateLinkeLinktRiskResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public CreateLinkeLinktRiskResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CreateLinkeLinktRiskResponseBodyData setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

    }

}
