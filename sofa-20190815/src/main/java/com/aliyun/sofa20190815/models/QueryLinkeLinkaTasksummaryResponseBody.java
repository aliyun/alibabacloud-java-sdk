// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinkaTasksummaryResponseBody extends TeaModel {
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
    public QueryLinkeLinkaTasksummaryResponseBodyResult result;

    public static QueryLinkeLinkaTasksummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinkaTasksummaryResponseBody self = new QueryLinkeLinkaTasksummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinkaTasksummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkeLinkaTasksummaryResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkeLinkaTasksummaryResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkeLinkaTasksummaryResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public QueryLinkeLinkaTasksummaryResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public QueryLinkeLinkaTasksummaryResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkeLinkaTasksummaryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkeLinkaTasksummaryResponseBody setResult(QueryLinkeLinkaTasksummaryResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public QueryLinkeLinkaTasksummaryResponseBodyResult getResult() {
        return this.result;
    }

    public static class QueryLinkeLinkaTasksummaryResponseBodyResult extends TeaModel {
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

        public static QueryLinkeLinkaTasksummaryResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeLinkaTasksummaryResponseBodyResult self = new QueryLinkeLinkaTasksummaryResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryLinkeLinkaTasksummaryResponseBodyResult setBranch(String branch) {
            this.branch = branch;
            return this;
        }
        public String getBranch() {
            return this.branch;
        }

        public QueryLinkeLinkaTasksummaryResponseBodyResult setCommitId(String commitId) {
            this.commitId = commitId;
            return this;
        }
        public String getCommitId() {
            return this.commitId;
        }

        public QueryLinkeLinkaTasksummaryResponseBodyResult setCosts(Long costs) {
            this.costs = costs;
            return this;
        }
        public Long getCosts() {
            return this.costs;
        }

        public QueryLinkeLinkaTasksummaryResponseBodyResult setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Long getCreatedAt() {
            return this.createdAt;
        }

        public QueryLinkeLinkaTasksummaryResponseBodyResult setDiff(Boolean diff) {
            this.diff = diff;
            return this;
        }
        public Boolean getDiff() {
            return this.diff;
        }

        public QueryLinkeLinkaTasksummaryResponseBodyResult setDiffOverflow(Boolean diffOverflow) {
            this.diffOverflow = diffOverflow;
            return this;
        }
        public Boolean getDiffOverflow() {
            return this.diffOverflow;
        }

        public QueryLinkeLinkaTasksummaryResponseBodyResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryLinkeLinkaTasksummaryResponseBodyResult setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public QueryLinkeLinkaTasksummaryResponseBodyResult setStartCommitId(String startCommitId) {
            this.startCommitId = startCommitId;
            return this;
        }
        public String getStartCommitId() {
            return this.startCommitId;
        }

        public QueryLinkeLinkaTasksummaryResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryLinkeLinkaTasksummaryResponseBodyResult setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public QueryLinkeLinkaTasksummaryResponseBodyResult setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public QueryLinkeLinkaTasksummaryResponseBodyResult setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public QueryLinkeLinkaTasksummaryResponseBodyResult setTooLargeFiles(java.util.List<String> tooLargeFiles) {
            this.tooLargeFiles = tooLargeFiles;
            return this;
        }
        public java.util.List<String> getTooLargeFiles() {
            return this.tooLargeFiles;
        }

    }

}
