// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeantcodeAntcodeGetprojectbranchbybranchnameResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("MergeAccessLevel")
    public String mergeAccessLevel;

    @NameInMap("Name")
    public String name;

    @NameInMap("Protected")
    public Boolean _protected;

    @NameInMap("ProtectRule")
    public String protectRule;

    @NameInMap("ProtectRuleExactMatched")
    public Boolean protectRuleExactMatched;

    @NameInMap("PushAccessLevel")
    public String pushAccessLevel;

    @NameInMap("Ref")
    public String ref;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Commit")
    public QueryLinkeantcodeAntcodeGetprojectbranchbybranchnameResponseBodyCommit commit;

    public static QueryLinkeantcodeAntcodeGetprojectbranchbybranchnameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeantcodeAntcodeGetprojectbranchbybranchnameResponseBody self = new QueryLinkeantcodeAntcodeGetprojectbranchbybranchnameResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkeantcodeAntcodeGetprojectbranchbybranchnameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkeantcodeAntcodeGetprojectbranchbybranchnameResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkeantcodeAntcodeGetprojectbranchbybranchnameResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkeantcodeAntcodeGetprojectbranchbybranchnameResponseBody setMergeAccessLevel(String mergeAccessLevel) {
        this.mergeAccessLevel = mergeAccessLevel;
        return this;
    }
    public String getMergeAccessLevel() {
        return this.mergeAccessLevel;
    }

    public QueryLinkeantcodeAntcodeGetprojectbranchbybranchnameResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryLinkeantcodeAntcodeGetprojectbranchbybranchnameResponseBody set_protected(Boolean _protected) {
        this._protected = _protected;
        return this;
    }
    public Boolean get_protected() {
        return this._protected;
    }

    public QueryLinkeantcodeAntcodeGetprojectbranchbybranchnameResponseBody setProtectRule(String protectRule) {
        this.protectRule = protectRule;
        return this;
    }
    public String getProtectRule() {
        return this.protectRule;
    }

    public QueryLinkeantcodeAntcodeGetprojectbranchbybranchnameResponseBody setProtectRuleExactMatched(Boolean protectRuleExactMatched) {
        this.protectRuleExactMatched = protectRuleExactMatched;
        return this;
    }
    public Boolean getProtectRuleExactMatched() {
        return this.protectRuleExactMatched;
    }

    public QueryLinkeantcodeAntcodeGetprojectbranchbybranchnameResponseBody setPushAccessLevel(String pushAccessLevel) {
        this.pushAccessLevel = pushAccessLevel;
        return this;
    }
    public String getPushAccessLevel() {
        return this.pushAccessLevel;
    }

    public QueryLinkeantcodeAntcodeGetprojectbranchbybranchnameResponseBody setRef(String ref) {
        this.ref = ref;
        return this;
    }
    public String getRef() {
        return this.ref;
    }

    public QueryLinkeantcodeAntcodeGetprojectbranchbybranchnameResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkeantcodeAntcodeGetprojectbranchbybranchnameResponseBody setCommit(QueryLinkeantcodeAntcodeGetprojectbranchbybranchnameResponseBodyCommit commit) {
        this.commit = commit;
        return this;
    }
    public QueryLinkeantcodeAntcodeGetprojectbranchbybranchnameResponseBodyCommit getCommit() {
        return this.commit;
    }

    public static class QueryLinkeantcodeAntcodeGetprojectbranchbybranchnameResponseBodyCommit extends TeaModel {
        @NameInMap("Author")
        public String author;

        @NameInMap("AuthoredDate")
        public String authoredDate;

        @NameInMap("AuthorEmail")
        public String authorEmail;

        @NameInMap("AuthorName")
        public String authorName;

        @NameInMap("CommittedDate")
        public String committedDate;

        @NameInMap("Committer")
        public String committer;

        @NameInMap("CommitterEmail")
        public String committerEmail;

        @NameInMap("CommitterName")
        public String committerName;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("Id")
        public String id;

        @NameInMap("Message")
        public String message;

        @NameInMap("ShortId")
        public String shortId;

        @NameInMap("Signature")
        public String signature;

        @NameInMap("Title")
        public String title;

        @NameInMap("CheckSuites")
        public java.util.List<String> checkSuites;

        @NameInMap("ParentIds")
        public java.util.List<String> parentIds;

        public static QueryLinkeantcodeAntcodeGetprojectbranchbybranchnameResponseBodyCommit build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeantcodeAntcodeGetprojectbranchbybranchnameResponseBodyCommit self = new QueryLinkeantcodeAntcodeGetprojectbranchbybranchnameResponseBodyCommit();
            return TeaModel.build(map, self);
        }

        public QueryLinkeantcodeAntcodeGetprojectbranchbybranchnameResponseBodyCommit setAuthor(String author) {
            this.author = author;
            return this;
        }
        public String getAuthor() {
            return this.author;
        }

        public QueryLinkeantcodeAntcodeGetprojectbranchbybranchnameResponseBodyCommit setAuthoredDate(String authoredDate) {
            this.authoredDate = authoredDate;
            return this;
        }
        public String getAuthoredDate() {
            return this.authoredDate;
        }

        public QueryLinkeantcodeAntcodeGetprojectbranchbybranchnameResponseBodyCommit setAuthorEmail(String authorEmail) {
            this.authorEmail = authorEmail;
            return this;
        }
        public String getAuthorEmail() {
            return this.authorEmail;
        }

        public QueryLinkeantcodeAntcodeGetprojectbranchbybranchnameResponseBodyCommit setAuthorName(String authorName) {
            this.authorName = authorName;
            return this;
        }
        public String getAuthorName() {
            return this.authorName;
        }

        public QueryLinkeantcodeAntcodeGetprojectbranchbybranchnameResponseBodyCommit setCommittedDate(String committedDate) {
            this.committedDate = committedDate;
            return this;
        }
        public String getCommittedDate() {
            return this.committedDate;
        }

        public QueryLinkeantcodeAntcodeGetprojectbranchbybranchnameResponseBodyCommit setCommitter(String committer) {
            this.committer = committer;
            return this;
        }
        public String getCommitter() {
            return this.committer;
        }

        public QueryLinkeantcodeAntcodeGetprojectbranchbybranchnameResponseBodyCommit setCommitterEmail(String committerEmail) {
            this.committerEmail = committerEmail;
            return this;
        }
        public String getCommitterEmail() {
            return this.committerEmail;
        }

        public QueryLinkeantcodeAntcodeGetprojectbranchbybranchnameResponseBodyCommit setCommitterName(String committerName) {
            this.committerName = committerName;
            return this;
        }
        public String getCommitterName() {
            return this.committerName;
        }

        public QueryLinkeantcodeAntcodeGetprojectbranchbybranchnameResponseBodyCommit setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public QueryLinkeantcodeAntcodeGetprojectbranchbybranchnameResponseBodyCommit setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryLinkeantcodeAntcodeGetprojectbranchbybranchnameResponseBodyCommit setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryLinkeantcodeAntcodeGetprojectbranchbybranchnameResponseBodyCommit setShortId(String shortId) {
            this.shortId = shortId;
            return this;
        }
        public String getShortId() {
            return this.shortId;
        }

        public QueryLinkeantcodeAntcodeGetprojectbranchbybranchnameResponseBodyCommit setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

        public QueryLinkeantcodeAntcodeGetprojectbranchbybranchnameResponseBodyCommit setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public QueryLinkeantcodeAntcodeGetprojectbranchbybranchnameResponseBodyCommit setCheckSuites(java.util.List<String> checkSuites) {
            this.checkSuites = checkSuites;
            return this;
        }
        public java.util.List<String> getCheckSuites() {
            return this.checkSuites;
        }

        public QueryLinkeantcodeAntcodeGetprojectbranchbybranchnameResponseBodyCommit setParentIds(java.util.List<String> parentIds) {
            this.parentIds = parentIds;
            return this;
        }
        public java.util.List<String> getParentIds() {
            return this.parentIds;
        }

    }

}
