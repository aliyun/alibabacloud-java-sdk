// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeLinktRiskResponseBody extends TeaModel {
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
    public GetLinkeLinktRiskResponseBodyData data;

    public static GetLinkeLinktRiskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeLinktRiskResponseBody self = new GetLinkeLinktRiskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeLinktRiskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeLinktRiskResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeLinktRiskResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeLinktRiskResponseBody setErrorCode(Long errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Long getErrorCode() {
        return this.errorCode;
    }

    public GetLinkeLinktRiskResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetLinkeLinktRiskResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkeLinktRiskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkeLinktRiskResponseBody setData(GetLinkeLinktRiskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetLinkeLinktRiskResponseBodyData getData() {
        return this.data;
    }

    public static class GetLinkeLinktRiskResponseBodyData extends TeaModel {
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

        public static GetLinkeLinktRiskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeLinktRiskResponseBodyData self = new GetLinkeLinktRiskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetLinkeLinktRiskResponseBodyData setAssignedTo(String assignedTo) {
            this.assignedTo = assignedTo;
            return this;
        }
        public String getAssignedTo() {
            return this.assignedTo;
        }

        public GetLinkeLinktRiskResponseBodyData setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Long getCreatedAt() {
            return this.createdAt;
        }

        public GetLinkeLinktRiskResponseBodyData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public GetLinkeLinktRiskResponseBodyData setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public GetLinkeLinktRiskResponseBodyData setExpectedCompletionDate(Long expectedCompletionDate) {
            this.expectedCompletionDate = expectedCompletionDate;
            return this;
        }
        public Long getExpectedCompletionDate() {
            return this.expectedCompletionDate;
        }

        public GetLinkeLinktRiskResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetLinkeLinktRiskResponseBodyData setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public GetLinkeLinktRiskResponseBodyData setPriority(Long priority) {
            this.priority = priority;
            return this;
        }
        public Long getPriority() {
            return this.priority;
        }

        public GetLinkeLinktRiskResponseBodyData setProjectSign(String projectSign) {
            this.projectSign = projectSign;
            return this;
        }
        public String getProjectSign() {
            return this.projectSign;
        }

        public GetLinkeLinktRiskResponseBodyData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetLinkeLinktRiskResponseBodyData setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public GetLinkeLinktRiskResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetLinkeLinktRiskResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetLinkeLinktRiskResponseBodyData setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

        public GetLinkeLinktRiskResponseBodyData setCc(java.util.List<String> cc) {
            this.cc = cc;
            return this;
        }
        public java.util.List<String> getCc() {
            return this.cc;
        }

    }

}
