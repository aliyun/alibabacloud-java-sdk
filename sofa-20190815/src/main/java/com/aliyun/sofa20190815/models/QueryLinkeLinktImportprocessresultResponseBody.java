// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinktImportprocessresultResponseBody extends TeaModel {
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
    public QueryLinkeLinktImportprocessresultResponseBodyData data;

    public static QueryLinkeLinktImportprocessresultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinktImportprocessresultResponseBody self = new QueryLinkeLinktImportprocessresultResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinktImportprocessresultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkeLinktImportprocessresultResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkeLinktImportprocessresultResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkeLinktImportprocessresultResponseBody setErrorCode(Long errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Long getErrorCode() {
        return this.errorCode;
    }

    public QueryLinkeLinktImportprocessresultResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryLinkeLinktImportprocessresultResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkeLinktImportprocessresultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkeLinktImportprocessresultResponseBody setData(QueryLinkeLinktImportprocessresultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryLinkeLinktImportprocessresultResponseBodyData getData() {
        return this.data;
    }

    public static class QueryLinkeLinktImportprocessresultResponseBodyData extends TeaModel {
        @NameInMap("Finished")
        public Boolean finished;

        @NameInMap("FinishedCount")
        public Long finishedCount;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Total")
        public Long total;

        public static QueryLinkeLinktImportprocessresultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeLinktImportprocessresultResponseBodyData self = new QueryLinkeLinktImportprocessresultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryLinkeLinktImportprocessresultResponseBodyData setFinished(Boolean finished) {
            this.finished = finished;
            return this;
        }
        public Boolean getFinished() {
            return this.finished;
        }

        public QueryLinkeLinktImportprocessresultResponseBodyData setFinishedCount(Long finishedCount) {
            this.finishedCount = finishedCount;
            return this;
        }
        public Long getFinishedCount() {
            return this.finishedCount;
        }

        public QueryLinkeLinktImportprocessresultResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public QueryLinkeLinktImportprocessresultResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
