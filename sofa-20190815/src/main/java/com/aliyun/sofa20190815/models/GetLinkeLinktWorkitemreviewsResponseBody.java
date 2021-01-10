// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeLinktWorkitemreviewsResponseBody extends TeaModel {
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
    public java.util.List<GetLinkeLinktWorkitemreviewsResponseBodyData> data;

    public static GetLinkeLinktWorkitemreviewsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeLinktWorkitemreviewsResponseBody self = new GetLinkeLinktWorkitemreviewsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeLinktWorkitemreviewsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeLinktWorkitemreviewsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeLinktWorkitemreviewsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeLinktWorkitemreviewsResponseBody setErrorCode(Long errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Long getErrorCode() {
        return this.errorCode;
    }

    public GetLinkeLinktWorkitemreviewsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetLinkeLinktWorkitemreviewsResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkeLinktWorkitemreviewsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkeLinktWorkitemreviewsResponseBody setData(java.util.List<GetLinkeLinktWorkitemreviewsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetLinkeLinktWorkitemreviewsResponseBodyData> getData() {
        return this.data;
    }

    public static class GetLinkeLinktWorkitemreviewsResponseBodyData extends TeaModel {
        @NameInMap("CreatedAt")
        public Long createdAt;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("Description")
        public String description;

        @NameInMap("EndDate")
        public Long endDate;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Status")
        public String status;

        @NameInMap("Theme")
        public String theme;

        @NameInMap("UpdatedAt")
        public Long updatedAt;

        @NameInMap("Version")
        public String version;

        @NameInMap("WorkItemReviewRecordVOS")
        public java.util.List<String> workItemReviewRecordVOS;

        public static GetLinkeLinktWorkitemreviewsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeLinktWorkitemreviewsResponseBodyData self = new GetLinkeLinktWorkitemreviewsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetLinkeLinktWorkitemreviewsResponseBodyData setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Long getCreatedAt() {
            return this.createdAt;
        }

        public GetLinkeLinktWorkitemreviewsResponseBodyData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public GetLinkeLinktWorkitemreviewsResponseBodyData setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public GetLinkeLinktWorkitemreviewsResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetLinkeLinktWorkitemreviewsResponseBodyData setEndDate(Long endDate) {
            this.endDate = endDate;
            return this;
        }
        public Long getEndDate() {
            return this.endDate;
        }

        public GetLinkeLinktWorkitemreviewsResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetLinkeLinktWorkitemreviewsResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetLinkeLinktWorkitemreviewsResponseBodyData setTheme(String theme) {
            this.theme = theme;
            return this;
        }
        public String getTheme() {
            return this.theme;
        }

        public GetLinkeLinktWorkitemreviewsResponseBodyData setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

        public GetLinkeLinktWorkitemreviewsResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public GetLinkeLinktWorkitemreviewsResponseBodyData setWorkItemReviewRecordVOS(java.util.List<String> workItemReviewRecordVOS) {
            this.workItemReviewRecordVOS = workItemReviewRecordVOS;
            return this;
        }
        public java.util.List<String> getWorkItemReviewRecordVOS() {
            return this.workItemReviewRecordVOS;
        }

    }

}
