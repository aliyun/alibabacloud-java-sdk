// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeLinktReqchangesResponseBody extends TeaModel {
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
    public java.util.List<GetLinkeLinktReqchangesResponseBodyData> data;

    public static GetLinkeLinktReqchangesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeLinktReqchangesResponseBody self = new GetLinkeLinktReqchangesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeLinktReqchangesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeLinktReqchangesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeLinktReqchangesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeLinktReqchangesResponseBody setErrorCode(Long errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Long getErrorCode() {
        return this.errorCode;
    }

    public GetLinkeLinktReqchangesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetLinkeLinktReqchangesResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkeLinktReqchangesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkeLinktReqchangesResponseBody setData(java.util.List<GetLinkeLinktReqchangesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetLinkeLinktReqchangesResponseBodyData> getData() {
        return this.data;
    }

    public static class GetLinkeLinktReqchangesResponseBodyData extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("UpdatedAt")
        public Long updatedAt;

        @NameInMap("User")
        public String user;

        @NameInMap("Version")
        public String version;

        public static GetLinkeLinktReqchangesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeLinktReqchangesResponseBodyData self = new GetLinkeLinktReqchangesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetLinkeLinktReqchangesResponseBodyData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetLinkeLinktReqchangesResponseBodyData setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

        public GetLinkeLinktReqchangesResponseBodyData setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

        public GetLinkeLinktReqchangesResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
