// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeLinkaGrouphistoryResponseBody extends TeaModel {
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
    public java.util.List<QueryLinkeLinkaGrouphistoryResponseBodyResult> result;

    public static QueryLinkeLinkaGrouphistoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeLinkaGrouphistoryResponseBody self = new QueryLinkeLinkaGrouphistoryResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkeLinkaGrouphistoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkeLinkaGrouphistoryResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkeLinkaGrouphistoryResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkeLinkaGrouphistoryResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public QueryLinkeLinkaGrouphistoryResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public QueryLinkeLinkaGrouphistoryResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkeLinkaGrouphistoryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkeLinkaGrouphistoryResponseBody setResult(java.util.List<QueryLinkeLinkaGrouphistoryResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<QueryLinkeLinkaGrouphistoryResponseBodyResult> getResult() {
        return this.result;
    }

    public static class QueryLinkeLinkaGrouphistoryResponseBodyResult extends TeaModel {
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

        @NameInMap("SubCoverages")
        public java.util.List<String> subCoverages;

        public static QueryLinkeLinkaGrouphistoryResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeLinkaGrouphistoryResponseBodyResult self = new QueryLinkeLinkaGrouphistoryResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryLinkeLinkaGrouphistoryResponseBodyResult setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Long getCreatedAt() {
            return this.createdAt;
        }

        public QueryLinkeLinkaGrouphistoryResponseBodyResult setGroup(String group) {
            this.group = group;
            return this;
        }
        public String getGroup() {
            return this.group;
        }

        public QueryLinkeLinkaGrouphistoryResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryLinkeLinkaGrouphistoryResponseBodyResult setOnlySummary(Boolean onlySummary) {
            this.onlySummary = onlySummary;
            return this;
        }
        public Boolean getOnlySummary() {
            return this.onlySummary;
        }

        public QueryLinkeLinkaGrouphistoryResponseBodyResult setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public QueryLinkeLinkaGrouphistoryResponseBodyResult setSubCoverages(java.util.List<String> subCoverages) {
            this.subCoverages = subCoverages;
            return this;
        }
        public java.util.List<String> getSubCoverages() {
            return this.subCoverages;
        }

    }

}
