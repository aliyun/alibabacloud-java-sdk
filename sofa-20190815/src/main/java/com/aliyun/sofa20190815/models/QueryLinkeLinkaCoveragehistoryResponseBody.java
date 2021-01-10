// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinkaCoveragehistoryResponseBody extends TeaModel {
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
    public java.util.List<QueryLinkeLinkaCoveragehistoryResponseBodyResult> result;

    public static QueryLinkeLinkaCoveragehistoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinkaCoveragehistoryResponseBody self = new QueryLinkeLinkaCoveragehistoryResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinkaCoveragehistoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkeLinkaCoveragehistoryResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkeLinkaCoveragehistoryResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkeLinkaCoveragehistoryResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public QueryLinkeLinkaCoveragehistoryResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public QueryLinkeLinkaCoveragehistoryResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkeLinkaCoveragehistoryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkeLinkaCoveragehistoryResponseBody setResult(java.util.List<QueryLinkeLinkaCoveragehistoryResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<QueryLinkeLinkaCoveragehistoryResponseBodyResult> getResult() {
        return this.result;
    }

    public static class QueryLinkeLinkaCoveragehistoryResponseBodyResult extends TeaModel {
        @NameInMap("CreatedAt")
        public Long createdAt;

        @NameInMap("Group")
        public String group;

        @NameInMap("Id")
        public String id;

        @NameInMap("OnlySummary")
        public Boolean onlySummary;

        @NameInMap("TaskId")
        public String taskId;

        public static QueryLinkeLinkaCoveragehistoryResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeLinkaCoveragehistoryResponseBodyResult self = new QueryLinkeLinkaCoveragehistoryResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryLinkeLinkaCoveragehistoryResponseBodyResult setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Long getCreatedAt() {
            return this.createdAt;
        }

        public QueryLinkeLinkaCoveragehistoryResponseBodyResult setGroup(String group) {
            this.group = group;
            return this;
        }
        public String getGroup() {
            return this.group;
        }

        public QueryLinkeLinkaCoveragehistoryResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryLinkeLinkaCoveragehistoryResponseBodyResult setOnlySummary(Boolean onlySummary) {
            this.onlySummary = onlySummary;
            return this;
        }
        public Boolean getOnlySummary() {
            return this.onlySummary;
        }

        public QueryLinkeLinkaCoveragehistoryResponseBodyResult setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
