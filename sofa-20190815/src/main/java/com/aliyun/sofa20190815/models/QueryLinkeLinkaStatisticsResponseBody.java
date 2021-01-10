// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinkaStatisticsResponseBody extends TeaModel {
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
    public java.util.List<QueryLinkeLinkaStatisticsResponseBodyResult> result;

    public static QueryLinkeLinkaStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinkaStatisticsResponseBody self = new QueryLinkeLinkaStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinkaStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkeLinkaStatisticsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkeLinkaStatisticsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkeLinkaStatisticsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public QueryLinkeLinkaStatisticsResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public QueryLinkeLinkaStatisticsResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkeLinkaStatisticsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkeLinkaStatisticsResponseBody setResult(java.util.List<QueryLinkeLinkaStatisticsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<QueryLinkeLinkaStatisticsResponseBodyResult> getResult() {
        return this.result;
    }

    public static class QueryLinkeLinkaStatisticsResponseBodyResult extends TeaModel {
        @NameInMap("CodeLines")
        public Long codeLines;

        @NameInMap("ContentLines")
        public Long contentLines;

        @NameInMap("Filename")
        public String filename;

        @NameInMap("PublicApis")
        public Long publicApis;

        @NameInMap("PublicCommentedApis")
        public Long publicCommentedApis;

        public static QueryLinkeLinkaStatisticsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeLinkaStatisticsResponseBodyResult self = new QueryLinkeLinkaStatisticsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryLinkeLinkaStatisticsResponseBodyResult setCodeLines(Long codeLines) {
            this.codeLines = codeLines;
            return this;
        }
        public Long getCodeLines() {
            return this.codeLines;
        }

        public QueryLinkeLinkaStatisticsResponseBodyResult setContentLines(Long contentLines) {
            this.contentLines = contentLines;
            return this;
        }
        public Long getContentLines() {
            return this.contentLines;
        }

        public QueryLinkeLinkaStatisticsResponseBodyResult setFilename(String filename) {
            this.filename = filename;
            return this;
        }
        public String getFilename() {
            return this.filename;
        }

        public QueryLinkeLinkaStatisticsResponseBodyResult setPublicApis(Long publicApis) {
            this.publicApis = publicApis;
            return this;
        }
        public Long getPublicApis() {
            return this.publicApis;
        }

        public QueryLinkeLinkaStatisticsResponseBodyResult setPublicCommentedApis(Long publicCommentedApis) {
            this.publicCommentedApis = publicCommentedApis;
            return this;
        }
        public Long getPublicCommentedApis() {
            return this.publicCommentedApis;
        }

    }

}
