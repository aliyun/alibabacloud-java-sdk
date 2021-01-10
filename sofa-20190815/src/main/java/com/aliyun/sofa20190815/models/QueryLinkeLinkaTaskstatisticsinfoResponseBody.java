// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinkaTaskstatisticsinfoResponseBody extends TeaModel {
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
    public QueryLinkeLinkaTaskstatisticsinfoResponseBodyResult result;

    public static QueryLinkeLinkaTaskstatisticsinfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinkaTaskstatisticsinfoResponseBody self = new QueryLinkeLinkaTaskstatisticsinfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinkaTaskstatisticsinfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkeLinkaTaskstatisticsinfoResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkeLinkaTaskstatisticsinfoResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkeLinkaTaskstatisticsinfoResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public QueryLinkeLinkaTaskstatisticsinfoResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public QueryLinkeLinkaTaskstatisticsinfoResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkeLinkaTaskstatisticsinfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkeLinkaTaskstatisticsinfoResponseBody setResult(QueryLinkeLinkaTaskstatisticsinfoResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public QueryLinkeLinkaTaskstatisticsinfoResponseBodyResult getResult() {
        return this.result;
    }

    public static class QueryLinkeLinkaTaskstatisticsinfoResponseBodyResult extends TeaModel {
        @NameInMap("CodeLines")
        public Long codeLines;

        @NameInMap("ContentLines")
        public Long contentLines;

        @NameInMap("Costs")
        public Long costs;

        @NameInMap("DuplicateCodeLines")
        public Long duplicateCodeLines;

        @NameInMap("Message")
        public String message;

        @NameInMap("PublicApis")
        public Long publicApis;

        @NameInMap("PublicCommentedApis")
        public Long publicCommentedApis;

        @NameInMap("Status")
        public String status;

        @NameInMap("TaskId")
        public String taskId;

        public static QueryLinkeLinkaTaskstatisticsinfoResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeLinkaTaskstatisticsinfoResponseBodyResult self = new QueryLinkeLinkaTaskstatisticsinfoResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryLinkeLinkaTaskstatisticsinfoResponseBodyResult setCodeLines(Long codeLines) {
            this.codeLines = codeLines;
            return this;
        }
        public Long getCodeLines() {
            return this.codeLines;
        }

        public QueryLinkeLinkaTaskstatisticsinfoResponseBodyResult setContentLines(Long contentLines) {
            this.contentLines = contentLines;
            return this;
        }
        public Long getContentLines() {
            return this.contentLines;
        }

        public QueryLinkeLinkaTaskstatisticsinfoResponseBodyResult setCosts(Long costs) {
            this.costs = costs;
            return this;
        }
        public Long getCosts() {
            return this.costs;
        }

        public QueryLinkeLinkaTaskstatisticsinfoResponseBodyResult setDuplicateCodeLines(Long duplicateCodeLines) {
            this.duplicateCodeLines = duplicateCodeLines;
            return this;
        }
        public Long getDuplicateCodeLines() {
            return this.duplicateCodeLines;
        }

        public QueryLinkeLinkaTaskstatisticsinfoResponseBodyResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryLinkeLinkaTaskstatisticsinfoResponseBodyResult setPublicApis(Long publicApis) {
            this.publicApis = publicApis;
            return this;
        }
        public Long getPublicApis() {
            return this.publicApis;
        }

        public QueryLinkeLinkaTaskstatisticsinfoResponseBodyResult setPublicCommentedApis(Long publicCommentedApis) {
            this.publicCommentedApis = publicCommentedApis;
            return this;
        }
        public Long getPublicCommentedApis() {
            return this.publicCommentedApis;
        }

        public QueryLinkeLinkaTaskstatisticsinfoResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryLinkeLinkaTaskstatisticsinfoResponseBodyResult setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
