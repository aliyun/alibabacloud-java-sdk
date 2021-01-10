// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLinkeBahamutAppbranchsResponseBody extends TeaModel {
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
    public java.util.List<ListLinkeBahamutAppbranchsResponseBodyResult> result;

    public static ListLinkeBahamutAppbranchsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLinkeBahamutAppbranchsResponseBody self = new ListLinkeBahamutAppbranchsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLinkeBahamutAppbranchsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLinkeBahamutAppbranchsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListLinkeBahamutAppbranchsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListLinkeBahamutAppbranchsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListLinkeBahamutAppbranchsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListLinkeBahamutAppbranchsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListLinkeBahamutAppbranchsResponseBody setResult(java.util.List<ListLinkeBahamutAppbranchsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListLinkeBahamutAppbranchsResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListLinkeBahamutAppbranchsResponseBodyResultCommit extends TeaModel {
        @NameInMap("AuthoredData")
        public Long authoredData;

        @NameInMap("AuthorEmail")
        public String authorEmail;

        @NameInMap("AuthorName")
        public String authorName;

        @NameInMap("CommittedDate")
        public String committedDate;

        @NameInMap("CommitterEmail")
        public String committerEmail;

        @NameInMap("CommitterName")
        public String committerName;

        @NameInMap("CreatedAt")
        public Long createdAt;

        @NameInMap("Id")
        public String id;

        @NameInMap("Message")
        public String message;

        @NameInMap("ShortId")
        public String shortId;

        @NameInMap("ParentIds")
        public java.util.List<String> parentIds;

        public static ListLinkeBahamutAppbranchsResponseBodyResultCommit build(java.util.Map<String, ?> map) throws Exception {
            ListLinkeBahamutAppbranchsResponseBodyResultCommit self = new ListLinkeBahamutAppbranchsResponseBodyResultCommit();
            return TeaModel.build(map, self);
        }

        public ListLinkeBahamutAppbranchsResponseBodyResultCommit setAuthoredData(Long authoredData) {
            this.authoredData = authoredData;
            return this;
        }
        public Long getAuthoredData() {
            return this.authoredData;
        }

        public ListLinkeBahamutAppbranchsResponseBodyResultCommit setAuthorEmail(String authorEmail) {
            this.authorEmail = authorEmail;
            return this;
        }
        public String getAuthorEmail() {
            return this.authorEmail;
        }

        public ListLinkeBahamutAppbranchsResponseBodyResultCommit setAuthorName(String authorName) {
            this.authorName = authorName;
            return this;
        }
        public String getAuthorName() {
            return this.authorName;
        }

        public ListLinkeBahamutAppbranchsResponseBodyResultCommit setCommittedDate(String committedDate) {
            this.committedDate = committedDate;
            return this;
        }
        public String getCommittedDate() {
            return this.committedDate;
        }

        public ListLinkeBahamutAppbranchsResponseBodyResultCommit setCommitterEmail(String committerEmail) {
            this.committerEmail = committerEmail;
            return this;
        }
        public String getCommitterEmail() {
            return this.committerEmail;
        }

        public ListLinkeBahamutAppbranchsResponseBodyResultCommit setCommitterName(String committerName) {
            this.committerName = committerName;
            return this;
        }
        public String getCommitterName() {
            return this.committerName;
        }

        public ListLinkeBahamutAppbranchsResponseBodyResultCommit setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Long getCreatedAt() {
            return this.createdAt;
        }

        public ListLinkeBahamutAppbranchsResponseBodyResultCommit setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListLinkeBahamutAppbranchsResponseBodyResultCommit setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListLinkeBahamutAppbranchsResponseBodyResultCommit setShortId(String shortId) {
            this.shortId = shortId;
            return this;
        }
        public String getShortId() {
            return this.shortId;
        }

        public ListLinkeBahamutAppbranchsResponseBodyResultCommit setParentIds(java.util.List<String> parentIds) {
            this.parentIds = parentIds;
            return this;
        }
        public java.util.List<String> getParentIds() {
            return this.parentIds;
        }

    }

    public static class ListLinkeBahamutAppbranchsResponseBodyResult extends TeaModel {
        @NameInMap("Locked")
        public Boolean locked;

        @NameInMap("Name")
        public String name;

        @NameInMap("Commit")
        public ListLinkeBahamutAppbranchsResponseBodyResultCommit commit;

        public static ListLinkeBahamutAppbranchsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListLinkeBahamutAppbranchsResponseBodyResult self = new ListLinkeBahamutAppbranchsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListLinkeBahamutAppbranchsResponseBodyResult setLocked(Boolean locked) {
            this.locked = locked;
            return this;
        }
        public Boolean getLocked() {
            return this.locked;
        }

        public ListLinkeBahamutAppbranchsResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListLinkeBahamutAppbranchsResponseBodyResult setCommit(ListLinkeBahamutAppbranchsResponseBodyResultCommit commit) {
            this.commit = commit;
            return this;
        }
        public ListLinkeBahamutAppbranchsResponseBodyResultCommit getCommit() {
            return this.commit;
        }

    }

}
