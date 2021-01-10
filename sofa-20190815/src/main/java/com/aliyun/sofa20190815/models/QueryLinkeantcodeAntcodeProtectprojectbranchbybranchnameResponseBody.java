// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeantcodeAntcodeProtectprojectbranchbybranchnameResponseBody extends TeaModel {
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

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Commit")
    public QueryLinkeantcodeAntcodeProtectprojectbranchbybranchnameResponseBodyCommit commit;

    public static QueryLinkeantcodeAntcodeProtectprojectbranchbybranchnameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeantcodeAntcodeProtectprojectbranchbybranchnameResponseBody self = new QueryLinkeantcodeAntcodeProtectprojectbranchbybranchnameResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkeantcodeAntcodeProtectprojectbranchbybranchnameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkeantcodeAntcodeProtectprojectbranchbybranchnameResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkeantcodeAntcodeProtectprojectbranchbybranchnameResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkeantcodeAntcodeProtectprojectbranchbybranchnameResponseBody setMergeAccessLevel(String mergeAccessLevel) {
        this.mergeAccessLevel = mergeAccessLevel;
        return this;
    }
    public String getMergeAccessLevel() {
        return this.mergeAccessLevel;
    }

    public QueryLinkeantcodeAntcodeProtectprojectbranchbybranchnameResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryLinkeantcodeAntcodeProtectprojectbranchbybranchnameResponseBody set_protected(Boolean _protected) {
        this._protected = _protected;
        return this;
    }
    public Boolean get_protected() {
        return this._protected;
    }

    public QueryLinkeantcodeAntcodeProtectprojectbranchbybranchnameResponseBody setProtectRule(String protectRule) {
        this.protectRule = protectRule;
        return this;
    }
    public String getProtectRule() {
        return this.protectRule;
    }

    public QueryLinkeantcodeAntcodeProtectprojectbranchbybranchnameResponseBody setProtectRuleExactMatched(Boolean protectRuleExactMatched) {
        this.protectRuleExactMatched = protectRuleExactMatched;
        return this;
    }
    public Boolean getProtectRuleExactMatched() {
        return this.protectRuleExactMatched;
    }

    public QueryLinkeantcodeAntcodeProtectprojectbranchbybranchnameResponseBody setPushAccessLevel(String pushAccessLevel) {
        this.pushAccessLevel = pushAccessLevel;
        return this;
    }
    public String getPushAccessLevel() {
        return this.pushAccessLevel;
    }

    public QueryLinkeantcodeAntcodeProtectprojectbranchbybranchnameResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkeantcodeAntcodeProtectprojectbranchbybranchnameResponseBody setCommit(QueryLinkeantcodeAntcodeProtectprojectbranchbybranchnameResponseBodyCommit commit) {
        this.commit = commit;
        return this;
    }
    public QueryLinkeantcodeAntcodeProtectprojectbranchbybranchnameResponseBodyCommit getCommit() {
        return this.commit;
    }

    public static class QueryLinkeantcodeAntcodeProtectprojectbranchbybranchnameResponseBodyCommit extends TeaModel {
        @NameInMap("AuthoredDate")
        public String authoredDate;

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
        public String createdAt;

        @NameInMap("Id")
        public String id;

        @NameInMap("Message")
        public String message;

        @NameInMap("ShortId")
        public String shortId;

        @NameInMap("Title")
        public String title;

        @NameInMap("ParentIds")
        public java.util.List<String> parentIds;

        public static QueryLinkeantcodeAntcodeProtectprojectbranchbybranchnameResponseBodyCommit build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeantcodeAntcodeProtectprojectbranchbybranchnameResponseBodyCommit self = new QueryLinkeantcodeAntcodeProtectprojectbranchbybranchnameResponseBodyCommit();
            return TeaModel.build(map, self);
        }

        public QueryLinkeantcodeAntcodeProtectprojectbranchbybranchnameResponseBodyCommit setAuthoredDate(String authoredDate) {
            this.authoredDate = authoredDate;
            return this;
        }
        public String getAuthoredDate() {
            return this.authoredDate;
        }

        public QueryLinkeantcodeAntcodeProtectprojectbranchbybranchnameResponseBodyCommit setAuthorEmail(String authorEmail) {
            this.authorEmail = authorEmail;
            return this;
        }
        public String getAuthorEmail() {
            return this.authorEmail;
        }

        public QueryLinkeantcodeAntcodeProtectprojectbranchbybranchnameResponseBodyCommit setAuthorName(String authorName) {
            this.authorName = authorName;
            return this;
        }
        public String getAuthorName() {
            return this.authorName;
        }

        public QueryLinkeantcodeAntcodeProtectprojectbranchbybranchnameResponseBodyCommit setCommittedDate(String committedDate) {
            this.committedDate = committedDate;
            return this;
        }
        public String getCommittedDate() {
            return this.committedDate;
        }

        public QueryLinkeantcodeAntcodeProtectprojectbranchbybranchnameResponseBodyCommit setCommitterEmail(String committerEmail) {
            this.committerEmail = committerEmail;
            return this;
        }
        public String getCommitterEmail() {
            return this.committerEmail;
        }

        public QueryLinkeantcodeAntcodeProtectprojectbranchbybranchnameResponseBodyCommit setCommitterName(String committerName) {
            this.committerName = committerName;
            return this;
        }
        public String getCommitterName() {
            return this.committerName;
        }

        public QueryLinkeantcodeAntcodeProtectprojectbranchbybranchnameResponseBodyCommit setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public QueryLinkeantcodeAntcodeProtectprojectbranchbybranchnameResponseBodyCommit setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryLinkeantcodeAntcodeProtectprojectbranchbybranchnameResponseBodyCommit setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryLinkeantcodeAntcodeProtectprojectbranchbybranchnameResponseBodyCommit setShortId(String shortId) {
            this.shortId = shortId;
            return this;
        }
        public String getShortId() {
            return this.shortId;
        }

        public QueryLinkeantcodeAntcodeProtectprojectbranchbybranchnameResponseBodyCommit setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public QueryLinkeantcodeAntcodeProtectprojectbranchbybranchnameResponseBodyCommit setParentIds(java.util.List<String> parentIds) {
            this.parentIds = parentIds;
            return this;
        }
        public java.util.List<String> getParentIds() {
            return this.parentIds;
        }

    }

}
