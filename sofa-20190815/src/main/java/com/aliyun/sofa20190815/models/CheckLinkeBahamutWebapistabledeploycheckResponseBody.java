// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CheckLinkeBahamutWebapistabledeploycheckResponseBody extends TeaModel {
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
    public java.util.List<CheckLinkeBahamutWebapistabledeploycheckResponseBodyResult> result;

    public static CheckLinkeBahamutWebapistabledeploycheckResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckLinkeBahamutWebapistabledeploycheckResponseBody self = new CheckLinkeBahamutWebapistabledeploycheckResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckLinkeBahamutWebapistabledeploycheckResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckLinkeBahamutWebapistabledeploycheckResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CheckLinkeBahamutWebapistabledeploycheckResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public CheckLinkeBahamutWebapistabledeploycheckResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public CheckLinkeBahamutWebapistabledeploycheckResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CheckLinkeBahamutWebapistabledeploycheckResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CheckLinkeBahamutWebapistabledeploycheckResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CheckLinkeBahamutWebapistabledeploycheckResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CheckLinkeBahamutWebapistabledeploycheckResponseBody setResult(java.util.List<CheckLinkeBahamutWebapistabledeploycheckResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<CheckLinkeBahamutWebapistabledeploycheckResponseBodyResult> getResult() {
        return this.result;
    }

    public static class CheckLinkeBahamutWebapistabledeploycheckResponseBodyResult extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("App")
        public String app;

        @NameInMap("Url")
        public String url;

        public static CheckLinkeBahamutWebapistabledeploycheckResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CheckLinkeBahamutWebapistabledeploycheckResponseBodyResult self = new CheckLinkeBahamutWebapistabledeploycheckResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CheckLinkeBahamutWebapistabledeploycheckResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CheckLinkeBahamutWebapistabledeploycheckResponseBodyResult setApp(String app) {
            this.app = app;
            return this;
        }
        public String getApp() {
            return this.app;
        }

        public CheckLinkeBahamutWebapistabledeploycheckResponseBodyResult setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
