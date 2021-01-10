// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CheckLinkeBahamutReleasestabledeploycheckResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public String message;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("ErrorMsgParamsMap")
    public String errorMsgParamsMap;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("Result")
    public java.util.List<CheckLinkeBahamutReleasestabledeploycheckResponseBodyResult> result;

    public static CheckLinkeBahamutReleasestabledeploycheckResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckLinkeBahamutReleasestabledeploycheckResponseBody self = new CheckLinkeBahamutReleasestabledeploycheckResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckLinkeBahamutReleasestabledeploycheckResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckLinkeBahamutReleasestabledeploycheckResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CheckLinkeBahamutReleasestabledeploycheckResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public CheckLinkeBahamutReleasestabledeploycheckResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public CheckLinkeBahamutReleasestabledeploycheckResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CheckLinkeBahamutReleasestabledeploycheckResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CheckLinkeBahamutReleasestabledeploycheckResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CheckLinkeBahamutReleasestabledeploycheckResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CheckLinkeBahamutReleasestabledeploycheckResponseBody setResult(java.util.List<CheckLinkeBahamutReleasestabledeploycheckResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<CheckLinkeBahamutReleasestabledeploycheckResponseBodyResult> getResult() {
        return this.result;
    }

    public static class CheckLinkeBahamutReleasestabledeploycheckResponseBodyResult extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("App")
        public String app;

        @NameInMap("Url")
        public String url;

        public static CheckLinkeBahamutReleasestabledeploycheckResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CheckLinkeBahamutReleasestabledeploycheckResponseBodyResult self = new CheckLinkeBahamutReleasestabledeploycheckResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CheckLinkeBahamutReleasestabledeploycheckResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CheckLinkeBahamutReleasestabledeploycheckResponseBodyResult setApp(String app) {
            this.app = app;
            return this;
        }
        public String getApp() {
            return this.app;
        }

        public CheckLinkeBahamutReleasestabledeploycheckResponseBodyResult setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
