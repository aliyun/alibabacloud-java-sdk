// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinkaTaskreportsummaryResponseBody extends TeaModel {
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
    public QueryLinkeLinkaTaskreportsummaryResponseBodyResult result;

    public static QueryLinkeLinkaTaskreportsummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinkaTaskreportsummaryResponseBody self = new QueryLinkeLinkaTaskreportsummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinkaTaskreportsummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkeLinkaTaskreportsummaryResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkeLinkaTaskreportsummaryResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkeLinkaTaskreportsummaryResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public QueryLinkeLinkaTaskreportsummaryResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public QueryLinkeLinkaTaskreportsummaryResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkeLinkaTaskreportsummaryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkeLinkaTaskreportsummaryResponseBody setResult(QueryLinkeLinkaTaskreportsummaryResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public QueryLinkeLinkaTaskreportsummaryResponseBodyResult getResult() {
        return this.result;
    }

    public static class QueryLinkeLinkaTaskreportsummaryResponseBodyResult extends TeaModel {
        @NameInMap("Branch")
        public String branch;

        @NameInMap("CommitId")
        public String commitId;

        @NameInMap("Costs")
        public Long costs;

        @NameInMap("CreatedAt")
        public Long createdAt;

        @NameInMap("Diff")
        public Boolean diff;

        @NameInMap("DiffOverflow")
        public Boolean diffOverflow;

        @NameInMap("Message")
        public String message;

        @NameInMap("Source")
        public String source;

        @NameInMap("StartCommitId")
        public String startCommitId;

        @NameInMap("Status")
        public String status;

        @NameInMap("Summary")
        public String summary;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("Url")
        public String url;

        @NameInMap("TooLargeFiles")
        public java.util.List<String> tooLargeFiles;

        public static QueryLinkeLinkaTaskreportsummaryResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeLinkaTaskreportsummaryResponseBodyResult self = new QueryLinkeLinkaTaskreportsummaryResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryLinkeLinkaTaskreportsummaryResponseBodyResult setBranch(String branch) {
            this.branch = branch;
            return this;
        }
        public String getBranch() {
            return this.branch;
        }

        public QueryLinkeLinkaTaskreportsummaryResponseBodyResult setCommitId(String commitId) {
            this.commitId = commitId;
            return this;
        }
        public String getCommitId() {
            return this.commitId;
        }

        public QueryLinkeLinkaTaskreportsummaryResponseBodyResult setCosts(Long costs) {
            this.costs = costs;
            return this;
        }
        public Long getCosts() {
            return this.costs;
        }

        public QueryLinkeLinkaTaskreportsummaryResponseBodyResult setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Long getCreatedAt() {
            return this.createdAt;
        }

        public QueryLinkeLinkaTaskreportsummaryResponseBodyResult setDiff(Boolean diff) {
            this.diff = diff;
            return this;
        }
        public Boolean getDiff() {
            return this.diff;
        }

        public QueryLinkeLinkaTaskreportsummaryResponseBodyResult setDiffOverflow(Boolean diffOverflow) {
            this.diffOverflow = diffOverflow;
            return this;
        }
        public Boolean getDiffOverflow() {
            return this.diffOverflow;
        }

        public QueryLinkeLinkaTaskreportsummaryResponseBodyResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryLinkeLinkaTaskreportsummaryResponseBodyResult setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public QueryLinkeLinkaTaskreportsummaryResponseBodyResult setStartCommitId(String startCommitId) {
            this.startCommitId = startCommitId;
            return this;
        }
        public String getStartCommitId() {
            return this.startCommitId;
        }

        public QueryLinkeLinkaTaskreportsummaryResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryLinkeLinkaTaskreportsummaryResponseBodyResult setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public QueryLinkeLinkaTaskreportsummaryResponseBodyResult setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public QueryLinkeLinkaTaskreportsummaryResponseBodyResult setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public QueryLinkeLinkaTaskreportsummaryResponseBodyResult setTooLargeFiles(java.util.List<String> tooLargeFiles) {
            this.tooLargeFiles = tooLargeFiles;
            return this;
        }
        public java.util.List<String> getTooLargeFiles() {
            return this.tooLargeFiles;
        }

    }

}
