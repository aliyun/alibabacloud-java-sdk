// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeLinktProjectcreatedstatusesResponseBody extends TeaModel {
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
    public java.util.List<GetLinkeLinktProjectcreatedstatusesResponseBodyData> data;

    public static GetLinkeLinktProjectcreatedstatusesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeLinktProjectcreatedstatusesResponseBody self = new GetLinkeLinktProjectcreatedstatusesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeLinktProjectcreatedstatusesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeLinktProjectcreatedstatusesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeLinktProjectcreatedstatusesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeLinktProjectcreatedstatusesResponseBody setErrorCode(Long errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Long getErrorCode() {
        return this.errorCode;
    }

    public GetLinkeLinktProjectcreatedstatusesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetLinkeLinktProjectcreatedstatusesResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkeLinktProjectcreatedstatusesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkeLinktProjectcreatedstatusesResponseBody setData(java.util.List<GetLinkeLinktProjectcreatedstatusesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetLinkeLinktProjectcreatedstatusesResponseBodyData> getData() {
        return this.data;
    }

    public static class GetLinkeLinktProjectcreatedstatusesResponseBodyData extends TeaModel {
        @NameInMap("CreatedAt")
        public Long createdAt;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("ProjectSign")
        public String projectSign;

        @NameInMap("Region")
        public String region;

        @NameInMap("Stage")
        public Long stage;

        @NameInMap("StageName")
        public String stageName;

        @NameInMap("UpdatedAt")
        public Long updatedAt;

        public static GetLinkeLinktProjectcreatedstatusesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeLinktProjectcreatedstatusesResponseBodyData self = new GetLinkeLinktProjectcreatedstatusesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetLinkeLinktProjectcreatedstatusesResponseBodyData setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Long getCreatedAt() {
            return this.createdAt;
        }

        public GetLinkeLinktProjectcreatedstatusesResponseBodyData setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public GetLinkeLinktProjectcreatedstatusesResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetLinkeLinktProjectcreatedstatusesResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetLinkeLinktProjectcreatedstatusesResponseBodyData setProjectSign(String projectSign) {
            this.projectSign = projectSign;
            return this;
        }
        public String getProjectSign() {
            return this.projectSign;
        }

        public GetLinkeLinktProjectcreatedstatusesResponseBodyData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetLinkeLinktProjectcreatedstatusesResponseBodyData setStage(Long stage) {
            this.stage = stage;
            return this;
        }
        public Long getStage() {
            return this.stage;
        }

        public GetLinkeLinktProjectcreatedstatusesResponseBodyData setStageName(String stageName) {
            this.stageName = stageName;
            return this;
        }
        public String getStageName() {
            return this.stageName;
        }

        public GetLinkeLinktProjectcreatedstatusesResponseBodyData setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

    }

}
