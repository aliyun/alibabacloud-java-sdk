// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkedeploycoreDeploycoreAppquerybranchcommitResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Message")
    public String message;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public QueryLinkedeploycoreDeploycoreAppquerybranchcommitResponseBodyData data;

    public static QueryLinkedeploycoreDeploycoreAppquerybranchcommitResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkedeploycoreDeploycoreAppquerybranchcommitResponseBody self = new QueryLinkedeploycoreDeploycoreAppquerybranchcommitResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkedeploycoreDeploycoreAppquerybranchcommitResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkedeploycoreDeploycoreAppquerybranchcommitResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkedeploycoreDeploycoreAppquerybranchcommitResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkedeploycoreDeploycoreAppquerybranchcommitResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryLinkedeploycoreDeploycoreAppquerybranchcommitResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkedeploycoreDeploycoreAppquerybranchcommitResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkedeploycoreDeploycoreAppquerybranchcommitResponseBody setData(QueryLinkedeploycoreDeploycoreAppquerybranchcommitResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryLinkedeploycoreDeploycoreAppquerybranchcommitResponseBodyData getData() {
        return this.data;
    }

    public static class QueryLinkedeploycoreDeploycoreAppquerybranchcommitResponseBodyData extends TeaModel {
        @NameInMap("AuthorName")
        public String authorName;

        @NameInMap("CommittedDate")
        public Long committedDate;

        @NameInMap("CommitterName")
        public String committerName;

        @NameInMap("CommitId")
        public String commitId;

        @NameInMap("CreatedDate")
        public Long createdDate;

        @NameInMap("Message")
        public String message;

        @NameInMap("Title")
        public String title;

        public static QueryLinkedeploycoreDeploycoreAppquerybranchcommitResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkedeploycoreDeploycoreAppquerybranchcommitResponseBodyData self = new QueryLinkedeploycoreDeploycoreAppquerybranchcommitResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryLinkedeploycoreDeploycoreAppquerybranchcommitResponseBodyData setAuthorName(String authorName) {
            this.authorName = authorName;
            return this;
        }
        public String getAuthorName() {
            return this.authorName;
        }

        public QueryLinkedeploycoreDeploycoreAppquerybranchcommitResponseBodyData setCommittedDate(Long committedDate) {
            this.committedDate = committedDate;
            return this;
        }
        public Long getCommittedDate() {
            return this.committedDate;
        }

        public QueryLinkedeploycoreDeploycoreAppquerybranchcommitResponseBodyData setCommitterName(String committerName) {
            this.committerName = committerName;
            return this;
        }
        public String getCommitterName() {
            return this.committerName;
        }

        public QueryLinkedeploycoreDeploycoreAppquerybranchcommitResponseBodyData setCommitId(String commitId) {
            this.commitId = commitId;
            return this;
        }
        public String getCommitId() {
            return this.commitId;
        }

        public QueryLinkedeploycoreDeploycoreAppquerybranchcommitResponseBodyData setCreatedDate(Long createdDate) {
            this.createdDate = createdDate;
            return this;
        }
        public Long getCreatedDate() {
            return this.createdDate;
        }

        public QueryLinkedeploycoreDeploycoreAppquerybranchcommitResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryLinkedeploycoreDeploycoreAppquerybranchcommitResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
