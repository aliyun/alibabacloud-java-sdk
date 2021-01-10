// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutPaasqueryserversResponseBody extends TeaModel {
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
    public QueryLinkeBahamutPaasqueryserversResponseBodyResult result;

    public static QueryLinkeBahamutPaasqueryserversResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutPaasqueryserversResponseBody self = new QueryLinkeBahamutPaasqueryserversResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutPaasqueryserversResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkeBahamutPaasqueryserversResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkeBahamutPaasqueryserversResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkeBahamutPaasqueryserversResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryLinkeBahamutPaasqueryserversResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public QueryLinkeBahamutPaasqueryserversResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryLinkeBahamutPaasqueryserversResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkeBahamutPaasqueryserversResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkeBahamutPaasqueryserversResponseBody setResult(QueryLinkeBahamutPaasqueryserversResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public QueryLinkeBahamutPaasqueryserversResponseBodyResult getResult() {
        return this.result;
    }

    public static class QueryLinkeBahamutPaasqueryserversResponseBodyResult extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Servers")
        public java.util.List<String> servers;

        public static QueryLinkeBahamutPaasqueryserversResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeBahamutPaasqueryserversResponseBodyResult self = new QueryLinkeBahamutPaasqueryserversResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryLinkeBahamutPaasqueryserversResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryLinkeBahamutPaasqueryserversResponseBodyResult setServers(java.util.List<String> servers) {
            this.servers = servers;
            return this;
        }
        public java.util.List<String> getServers() {
            return this.servers;
        }

    }

}
