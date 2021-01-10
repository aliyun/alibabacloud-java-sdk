// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinktImportresultResponseBody extends TeaModel {
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
    public QueryLinkeLinktImportresultResponseBodyData data;

    public static QueryLinkeLinktImportresultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinktImportresultResponseBody self = new QueryLinkeLinktImportresultResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinktImportresultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkeLinktImportresultResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkeLinktImportresultResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkeLinktImportresultResponseBody setErrorCode(Long errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Long getErrorCode() {
        return this.errorCode;
    }

    public QueryLinkeLinktImportresultResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryLinkeLinktImportresultResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkeLinktImportresultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkeLinktImportresultResponseBody setData(QueryLinkeLinktImportresultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryLinkeLinktImportresultResponseBodyData getData() {
        return this.data;
    }

    public static class QueryLinkeLinktImportresultResponseBodyData extends TeaModel {
        @NameInMap("Resolving")
        public Boolean resolving;

        @NameInMap("Result")
        public String result;

        public static QueryLinkeLinktImportresultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeLinktImportresultResponseBodyData self = new QueryLinkeLinktImportresultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryLinkeLinktImportresultResponseBodyData setResolving(Boolean resolving) {
            this.resolving = resolving;
            return this;
        }
        public Boolean getResolving() {
            return this.resolving;
        }

        public QueryLinkeLinktImportresultResponseBodyData setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

    }

}
