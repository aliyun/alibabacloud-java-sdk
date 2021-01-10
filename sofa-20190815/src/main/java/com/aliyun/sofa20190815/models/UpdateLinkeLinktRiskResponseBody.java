// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeLinktRiskResponseBody extends TeaModel {
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
    public UpdateLinkeLinktRiskResponseBodyData data;

    public static UpdateLinkeLinktRiskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeLinktRiskResponseBody self = new UpdateLinkeLinktRiskResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeLinktRiskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateLinkeLinktRiskResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateLinkeLinktRiskResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public UpdateLinkeLinktRiskResponseBody setErrorCode(Long errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Long getErrorCode() {
        return this.errorCode;
    }

    public UpdateLinkeLinktRiskResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public UpdateLinkeLinktRiskResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public UpdateLinkeLinktRiskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public UpdateLinkeLinktRiskResponseBody setData(UpdateLinkeLinktRiskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateLinkeLinktRiskResponseBodyData getData() {
        return this.data;
    }

    public static class UpdateLinkeLinktRiskResponseBodyData extends TeaModel {
        @NameInMap("AssignedTo")
        public String assignedTo;

        @NameInMap("CreatedAt")
        public Long createdAt;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("ExpectedCompletionDate")
        public Long expectedCompletionDate;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Level")
        public String level;

        @NameInMap("Priority")
        public Long priority;

        @NameInMap("ProjectSign")
        public String projectSign;

        @NameInMap("Region")
        public String region;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("Status")
        public String status;

        @NameInMap("Title")
        public String title;

        @NameInMap("UpdatedAt")
        public Long updatedAt;

        @NameInMap("Cc")
        public java.util.List<String> cc;

        public static UpdateLinkeLinktRiskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateLinkeLinktRiskResponseBodyData self = new UpdateLinkeLinktRiskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateLinkeLinktRiskResponseBodyData setAssignedTo(String assignedTo) {
            this.assignedTo = assignedTo;
            return this;
        }
        public String getAssignedTo() {
            return this.assignedTo;
        }

        public UpdateLinkeLinktRiskResponseBodyData setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Long getCreatedAt() {
            return this.createdAt;
        }

        public UpdateLinkeLinktRiskResponseBodyData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public UpdateLinkeLinktRiskResponseBodyData setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public UpdateLinkeLinktRiskResponseBodyData setExpectedCompletionDate(Long expectedCompletionDate) {
            this.expectedCompletionDate = expectedCompletionDate;
            return this;
        }
        public Long getExpectedCompletionDate() {
            return this.expectedCompletionDate;
        }

        public UpdateLinkeLinktRiskResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateLinkeLinktRiskResponseBodyData setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public UpdateLinkeLinktRiskResponseBodyData setPriority(Long priority) {
            this.priority = priority;
            return this;
        }
        public Long getPriority() {
            return this.priority;
        }

        public UpdateLinkeLinktRiskResponseBodyData setProjectSign(String projectSign) {
            this.projectSign = projectSign;
            return this;
        }
        public String getProjectSign() {
            return this.projectSign;
        }

        public UpdateLinkeLinktRiskResponseBodyData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public UpdateLinkeLinktRiskResponseBodyData setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public UpdateLinkeLinktRiskResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public UpdateLinkeLinktRiskResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public UpdateLinkeLinktRiskResponseBodyData setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

        public UpdateLinkeLinktRiskResponseBodyData setCc(java.util.List<String> cc) {
            this.cc = cc;
            return this;
        }
        public java.util.List<String> getCc() {
            return this.cc;
        }

    }

}
