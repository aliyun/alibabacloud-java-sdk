// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinkaCpdResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public java.util.List<QueryLinkeLinkaCpdResponseBodyResult> result;

    public static QueryLinkeLinkaCpdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinkaCpdResponseBody self = new QueryLinkeLinkaCpdResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinkaCpdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkeLinkaCpdResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkeLinkaCpdResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkeLinkaCpdResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public QueryLinkeLinkaCpdResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public QueryLinkeLinkaCpdResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkeLinkaCpdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkeLinkaCpdResponseBody setResult(java.util.List<QueryLinkeLinkaCpdResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<QueryLinkeLinkaCpdResponseBodyResult> getResult() {
        return this.result;
    }

    public static class QueryLinkeLinkaCpdResponseBodyResult extends TeaModel {
        @NameInMap("TokenCount")
        public Long tokenCount;

        @NameInMap("Statistics")
        public java.util.List<String> statistics;

        public static QueryLinkeLinkaCpdResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeLinkaCpdResponseBodyResult self = new QueryLinkeLinkaCpdResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryLinkeLinkaCpdResponseBodyResult setTokenCount(Long tokenCount) {
            this.tokenCount = tokenCount;
            return this;
        }
        public Long getTokenCount() {
            return this.tokenCount;
        }

        public QueryLinkeLinkaCpdResponseBodyResult setStatistics(java.util.List<String> statistics) {
            this.statistics = statistics;
            return this;
        }
        public java.util.List<String> getStatistics() {
            return this.statistics;
        }

    }

}
