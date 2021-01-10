// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeLinktStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Data")
    public CreateLinkeLinktStatusResponseBodyData data;

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

    public static CreateLinkeLinktStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeLinktStatusResponseBody self = new CreateLinkeLinktStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLinkeLinktStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateLinkeLinktStatusResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public CreateLinkeLinktStatusResponseBody setData(CreateLinkeLinktStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateLinkeLinktStatusResponseBodyData getData() {
        return this.data;
    }

    public CreateLinkeLinktStatusResponseBody setErrorCode(Long errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Long getErrorCode() {
        return this.errorCode;
    }

    public CreateLinkeLinktStatusResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateLinkeLinktStatusResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CreateLinkeLinktStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateLinkeLinktStatusResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class CreateLinkeLinktStatusResponseBodyData extends TeaModel {
        @NameInMap("Stage")
        public Long stage;

        @NameInMap("Region")
        public String region;

        @NameInMap("ProjectSign")
        public String projectSign;

        @NameInMap("CreatedAt")
        public Long createdAt;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("UpdatedAt")
        public Long updatedAt;

        @NameInMap("StageName")
        public String stageName;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public Long id;

        public static CreateLinkeLinktStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateLinkeLinktStatusResponseBodyData self = new CreateLinkeLinktStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateLinkeLinktStatusResponseBodyData setStage(Long stage) {
            this.stage = stage;
            return this;
        }
        public Long getStage() {
            return this.stage;
        }

        public CreateLinkeLinktStatusResponseBodyData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public CreateLinkeLinktStatusResponseBodyData setProjectSign(String projectSign) {
            this.projectSign = projectSign;
            return this;
        }
        public String getProjectSign() {
            return this.projectSign;
        }

        public CreateLinkeLinktStatusResponseBodyData setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Long getCreatedAt() {
            return this.createdAt;
        }

        public CreateLinkeLinktStatusResponseBodyData setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public CreateLinkeLinktStatusResponseBodyData setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

        public CreateLinkeLinktStatusResponseBodyData setStageName(String stageName) {
            this.stageName = stageName;
            return this;
        }
        public String getStageName() {
            return this.stageName;
        }

        public CreateLinkeLinktStatusResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateLinkeLinktStatusResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
