// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CheckLinkeBahamutReleasestablestablerollbackdeploycheckResponseBody extends TeaModel {
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
    public java.util.List<CheckLinkeBahamutReleasestablestablerollbackdeploycheckResponseBodyResult> result;

    public static CheckLinkeBahamutReleasestablestablerollbackdeploycheckResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckLinkeBahamutReleasestablestablerollbackdeploycheckResponseBody self = new CheckLinkeBahamutReleasestablestablerollbackdeploycheckResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckLinkeBahamutReleasestablestablerollbackdeploycheckResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckLinkeBahamutReleasestablestablerollbackdeploycheckResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CheckLinkeBahamutReleasestablestablerollbackdeploycheckResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public CheckLinkeBahamutReleasestablestablerollbackdeploycheckResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public CheckLinkeBahamutReleasestablestablerollbackdeploycheckResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CheckLinkeBahamutReleasestablestablerollbackdeploycheckResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CheckLinkeBahamutReleasestablestablerollbackdeploycheckResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CheckLinkeBahamutReleasestablestablerollbackdeploycheckResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CheckLinkeBahamutReleasestablestablerollbackdeploycheckResponseBody setResult(java.util.List<CheckLinkeBahamutReleasestablestablerollbackdeploycheckResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<CheckLinkeBahamutReleasestablestablerollbackdeploycheckResponseBodyResult> getResult() {
        return this.result;
    }

    public static class CheckLinkeBahamutReleasestablestablerollbackdeploycheckResponseBodyResult extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("App")
        public String app;

        @NameInMap("Url")
        public String url;

        public static CheckLinkeBahamutReleasestablestablerollbackdeploycheckResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CheckLinkeBahamutReleasestablestablerollbackdeploycheckResponseBodyResult self = new CheckLinkeBahamutReleasestablestablerollbackdeploycheckResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CheckLinkeBahamutReleasestablestablerollbackdeploycheckResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CheckLinkeBahamutReleasestablestablerollbackdeploycheckResponseBodyResult setApp(String app) {
            this.app = app;
            return this;
        }
        public String getApp() {
            return this.app;
        }

        public CheckLinkeBahamutReleasestablestablerollbackdeploycheckResponseBodyResult setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
