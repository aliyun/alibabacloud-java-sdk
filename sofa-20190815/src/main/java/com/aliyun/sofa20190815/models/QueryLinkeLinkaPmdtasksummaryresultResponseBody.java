// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinkaPmdtasksummaryresultResponseBody extends TeaModel {
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
    public QueryLinkeLinkaPmdtasksummaryresultResponseBodyResult result;

    public static QueryLinkeLinkaPmdtasksummaryresultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinkaPmdtasksummaryresultResponseBody self = new QueryLinkeLinkaPmdtasksummaryresultResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinkaPmdtasksummaryresultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkeLinkaPmdtasksummaryresultResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkeLinkaPmdtasksummaryresultResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkeLinkaPmdtasksummaryresultResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public QueryLinkeLinkaPmdtasksummaryresultResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public QueryLinkeLinkaPmdtasksummaryresultResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkeLinkaPmdtasksummaryresultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkeLinkaPmdtasksummaryresultResponseBody setResult(QueryLinkeLinkaPmdtasksummaryresultResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public QueryLinkeLinkaPmdtasksummaryresultResponseBodyResult getResult() {
        return this.result;
    }

    public static class QueryLinkeLinkaPmdtasksummaryresultResponseBodyResult extends TeaModel {
        @NameInMap("Costs")
        public Long costs;

        @NameInMap("Message")
        public String message;

        @NameInMap("Status")
        public String status;

        @NameInMap("Summary")
        public String summary;

        @NameInMap("TaskId")
        public String taskId;

        public static QueryLinkeLinkaPmdtasksummaryresultResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeLinkaPmdtasksummaryresultResponseBodyResult self = new QueryLinkeLinkaPmdtasksummaryresultResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryLinkeLinkaPmdtasksummaryresultResponseBodyResult setCosts(Long costs) {
            this.costs = costs;
            return this;
        }
        public Long getCosts() {
            return this.costs;
        }

        public QueryLinkeLinkaPmdtasksummaryresultResponseBodyResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryLinkeLinkaPmdtasksummaryresultResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryLinkeLinkaPmdtasksummaryresultResponseBodyResult setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public QueryLinkeLinkaPmdtasksummaryresultResponseBodyResult setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
