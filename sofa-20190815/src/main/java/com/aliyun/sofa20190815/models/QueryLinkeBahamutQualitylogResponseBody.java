// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutQualitylogResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Message")
    public String message;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public QueryLinkeBahamutQualitylogResponseBodyResult result;

    public static QueryLinkeBahamutQualitylogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutQualitylogResponseBody self = new QueryLinkeBahamutQualitylogResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutQualitylogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkeBahamutQualitylogResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkeBahamutQualitylogResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkeBahamutQualitylogResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryLinkeBahamutQualitylogResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryLinkeBahamutQualitylogResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkeBahamutQualitylogResponseBody setResult(QueryLinkeBahamutQualitylogResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public QueryLinkeBahamutQualitylogResponseBodyResult getResult() {
        return this.result;
    }

    public static class QueryLinkeBahamutQualitylogResponseBodyResultData extends TeaModel {
        @NameInMap("CommitId")
        public String commitId;

        @NameInMap("Content")
        public String content;

        @NameInMap("IsCommitUpToDate")
        public Boolean isCommitUpToDate;

        @NameInMap("Item")
        public String item;

        @NameInMap("Reason")
        public String reason;

        @NameInMap("UpdateAt")
        public Long updateAt;

        public static QueryLinkeBahamutQualitylogResponseBodyResultData build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeBahamutQualitylogResponseBodyResultData self = new QueryLinkeBahamutQualitylogResponseBodyResultData();
            return TeaModel.build(map, self);
        }

        public QueryLinkeBahamutQualitylogResponseBodyResultData setCommitId(String commitId) {
            this.commitId = commitId;
            return this;
        }
        public String getCommitId() {
            return this.commitId;
        }

        public QueryLinkeBahamutQualitylogResponseBodyResultData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public QueryLinkeBahamutQualitylogResponseBodyResultData setIsCommitUpToDate(Boolean isCommitUpToDate) {
            this.isCommitUpToDate = isCommitUpToDate;
            return this;
        }
        public Boolean getIsCommitUpToDate() {
            return this.isCommitUpToDate;
        }

        public QueryLinkeBahamutQualitylogResponseBodyResultData setItem(String item) {
            this.item = item;
            return this;
        }
        public String getItem() {
            return this.item;
        }

        public QueryLinkeBahamutQualitylogResponseBodyResultData setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public QueryLinkeBahamutQualitylogResponseBodyResultData setUpdateAt(Long updateAt) {
            this.updateAt = updateAt;
            return this;
        }
        public Long getUpdateAt() {
            return this.updateAt;
        }

    }

    public static class QueryLinkeBahamutQualitylogResponseBodyResult extends TeaModel {
        @NameInMap("Count")
        public Long count;

        @NameInMap("Page")
        public Long page;

        @NameInMap("PageCount")
        public Long pageCount;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Data")
        public java.util.List<QueryLinkeBahamutQualitylogResponseBodyResultData> data;

        public static QueryLinkeBahamutQualitylogResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeBahamutQualitylogResponseBodyResult self = new QueryLinkeBahamutQualitylogResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryLinkeBahamutQualitylogResponseBodyResult setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public QueryLinkeBahamutQualitylogResponseBodyResult setPage(Long page) {
            this.page = page;
            return this;
        }
        public Long getPage() {
            return this.page;
        }

        public QueryLinkeBahamutQualitylogResponseBodyResult setPageCount(Long pageCount) {
            this.pageCount = pageCount;
            return this;
        }
        public Long getPageCount() {
            return this.pageCount;
        }

        public QueryLinkeBahamutQualitylogResponseBodyResult setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public QueryLinkeBahamutQualitylogResponseBodyResult setData(java.util.List<QueryLinkeBahamutQualitylogResponseBodyResultData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryLinkeBahamutQualitylogResponseBodyResultData> getData() {
            return this.data;
        }

    }

}
