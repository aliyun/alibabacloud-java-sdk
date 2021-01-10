// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLinkeBahamutBuildconfigregistryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ErrorMsgParamsMap")
    public String errorMsgParamsMap;

    @NameInMap("Message")
    public String message;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public java.util.List<ListLinkeBahamutBuildconfigregistryResponseBodyResult> result;

    public static ListLinkeBahamutBuildconfigregistryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLinkeBahamutBuildconfigregistryResponseBody self = new ListLinkeBahamutBuildconfigregistryResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLinkeBahamutBuildconfigregistryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLinkeBahamutBuildconfigregistryResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListLinkeBahamutBuildconfigregistryResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListLinkeBahamutBuildconfigregistryResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListLinkeBahamutBuildconfigregistryResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public ListLinkeBahamutBuildconfigregistryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListLinkeBahamutBuildconfigregistryResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public ListLinkeBahamutBuildconfigregistryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListLinkeBahamutBuildconfigregistryResponseBody setResult(java.util.List<ListLinkeBahamutBuildconfigregistryResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListLinkeBahamutBuildconfigregistryResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListLinkeBahamutBuildconfigregistryResponseBodyResult extends TeaModel {
        @NameInMap("Host")
        public String host;

        @NameInMap("Token")
        public String token;

        @NameInMap("User")
        public String user;

        @NameInMap("SecretKeys")
        public java.util.List<String> secretKeys;

        public static ListLinkeBahamutBuildconfigregistryResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListLinkeBahamutBuildconfigregistryResponseBodyResult self = new ListLinkeBahamutBuildconfigregistryResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListLinkeBahamutBuildconfigregistryResponseBodyResult setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public ListLinkeBahamutBuildconfigregistryResponseBodyResult setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

        public ListLinkeBahamutBuildconfigregistryResponseBodyResult setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

        public ListLinkeBahamutBuildconfigregistryResponseBodyResult setSecretKeys(java.util.List<String> secretKeys) {
            this.secretKeys = secretKeys;
            return this;
        }
        public java.util.List<String> getSecretKeys() {
            return this.secretKeys;
        }

    }

}
