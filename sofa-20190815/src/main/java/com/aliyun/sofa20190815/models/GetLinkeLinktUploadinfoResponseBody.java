// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeLinktUploadinfoResponseBody extends TeaModel {
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
    public GetLinkeLinktUploadinfoResponseBodyData data;

    public static GetLinkeLinktUploadinfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeLinktUploadinfoResponseBody self = new GetLinkeLinktUploadinfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeLinktUploadinfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeLinktUploadinfoResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeLinktUploadinfoResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeLinktUploadinfoResponseBody setErrorCode(Long errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Long getErrorCode() {
        return this.errorCode;
    }

    public GetLinkeLinktUploadinfoResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetLinkeLinktUploadinfoResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkeLinktUploadinfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkeLinktUploadinfoResponseBody setData(GetLinkeLinktUploadinfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetLinkeLinktUploadinfoResponseBodyData getData() {
        return this.data;
    }

    public static class GetLinkeLinktUploadinfoResponseBodyData extends TeaModel {
        @NameInMap("DownloadUrl")
        public String downloadUrl;

        @NameInMap("SignedUploadUrl")
        public String signedUploadUrl;

        @NameInMap("StoredFilename")
        public String storedFilename;

        public static GetLinkeLinktUploadinfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeLinktUploadinfoResponseBodyData self = new GetLinkeLinktUploadinfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetLinkeLinktUploadinfoResponseBodyData setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        public GetLinkeLinktUploadinfoResponseBodyData setSignedUploadUrl(String signedUploadUrl) {
            this.signedUploadUrl = signedUploadUrl;
            return this;
        }
        public String getSignedUploadUrl() {
            return this.signedUploadUrl;
        }

        public GetLinkeLinktUploadinfoResponseBodyData setStoredFilename(String storedFilename) {
            this.storedFilename = storedFilename;
            return this;
        }
        public String getStoredFilename() {
            return this.storedFilename;
        }

    }

}
