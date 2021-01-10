// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CheckLinkeBahamutStablerollbackdeploycheckResponseBody extends TeaModel {
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
    public java.util.List<CheckLinkeBahamutStablerollbackdeploycheckResponseBodyResult> result;

    public static CheckLinkeBahamutStablerollbackdeploycheckResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckLinkeBahamutStablerollbackdeploycheckResponseBody self = new CheckLinkeBahamutStablerollbackdeploycheckResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckLinkeBahamutStablerollbackdeploycheckResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckLinkeBahamutStablerollbackdeploycheckResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CheckLinkeBahamutStablerollbackdeploycheckResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public CheckLinkeBahamutStablerollbackdeploycheckResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public CheckLinkeBahamutStablerollbackdeploycheckResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CheckLinkeBahamutStablerollbackdeploycheckResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CheckLinkeBahamutStablerollbackdeploycheckResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CheckLinkeBahamutStablerollbackdeploycheckResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CheckLinkeBahamutStablerollbackdeploycheckResponseBody setResult(java.util.List<CheckLinkeBahamutStablerollbackdeploycheckResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<CheckLinkeBahamutStablerollbackdeploycheckResponseBodyResult> getResult() {
        return this.result;
    }

    public static class CheckLinkeBahamutStablerollbackdeploycheckResponseBodyResult extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("App")
        public String app;

        @NameInMap("Url")
        public String url;

        public static CheckLinkeBahamutStablerollbackdeploycheckResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CheckLinkeBahamutStablerollbackdeploycheckResponseBodyResult self = new CheckLinkeBahamutStablerollbackdeploycheckResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CheckLinkeBahamutStablerollbackdeploycheckResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CheckLinkeBahamutStablerollbackdeploycheckResponseBodyResult setApp(String app) {
            this.app = app;
            return this;
        }
        public String getApp() {
            return this.app;
        }

        public CheckLinkeBahamutStablerollbackdeploycheckResponseBodyResult setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
