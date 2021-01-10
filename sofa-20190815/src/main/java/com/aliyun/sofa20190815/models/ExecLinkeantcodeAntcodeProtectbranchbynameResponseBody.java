// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeantcodeAntcodeProtectbranchbynameResponseBody extends TeaModel {
    @NameInMap("Ref")
    public String ref;

    @NameInMap("Protected")
    public Boolean _protected;

    @NameInMap("ProtectRuleExactMatched")
    public Boolean protectRuleExactMatched;

    @NameInMap("Commit")
    public ExecLinkeantcodeAntcodeProtectbranchbynameResponseBodyCommit commit;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ProtectRule")
    public String protectRule;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("PushAccessLevel")
    public String pushAccessLevel;

    @NameInMap("MergeAccessLevel")
    public String mergeAccessLevel;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("Name")
    public String name;

    public static ExecLinkeantcodeAntcodeProtectbranchbynameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeantcodeAntcodeProtectbranchbynameResponseBody self = new ExecLinkeantcodeAntcodeProtectbranchbynameResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecLinkeantcodeAntcodeProtectbranchbynameResponseBody setRef(String ref) {
        this.ref = ref;
        return this;
    }
    public String getRef() {
        return this.ref;
    }

    public ExecLinkeantcodeAntcodeProtectbranchbynameResponseBody set_protected(Boolean _protected) {
        this._protected = _protected;
        return this;
    }
    public Boolean get_protected() {
        return this._protected;
    }

    public ExecLinkeantcodeAntcodeProtectbranchbynameResponseBody setProtectRuleExactMatched(Boolean protectRuleExactMatched) {
        this.protectRuleExactMatched = protectRuleExactMatched;
        return this;
    }
    public Boolean getProtectRuleExactMatched() {
        return this.protectRuleExactMatched;
    }

    public ExecLinkeantcodeAntcodeProtectbranchbynameResponseBody setCommit(ExecLinkeantcodeAntcodeProtectbranchbynameResponseBodyCommit commit) {
        this.commit = commit;
        return this;
    }
    public ExecLinkeantcodeAntcodeProtectbranchbynameResponseBodyCommit getCommit() {
        return this.commit;
    }

    public ExecLinkeantcodeAntcodeProtectbranchbynameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecLinkeantcodeAntcodeProtectbranchbynameResponseBody setProtectRule(String protectRule) {
        this.protectRule = protectRule;
        return this;
    }
    public String getProtectRule() {
        return this.protectRule;
    }

    public ExecLinkeantcodeAntcodeProtectbranchbynameResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public ExecLinkeantcodeAntcodeProtectbranchbynameResponseBody setPushAccessLevel(String pushAccessLevel) {
        this.pushAccessLevel = pushAccessLevel;
        return this;
    }
    public String getPushAccessLevel() {
        return this.pushAccessLevel;
    }

    public ExecLinkeantcodeAntcodeProtectbranchbynameResponseBody setMergeAccessLevel(String mergeAccessLevel) {
        this.mergeAccessLevel = mergeAccessLevel;
        return this;
    }
    public String getMergeAccessLevel() {
        return this.mergeAccessLevel;
    }

    public ExecLinkeantcodeAntcodeProtectbranchbynameResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ExecLinkeantcodeAntcodeProtectbranchbynameResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ExecLinkeantcodeAntcodeProtectbranchbynameResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public static class ExecLinkeantcodeAntcodeProtectbranchbynameResponseBodyCommit extends TeaModel {
        @NameInMap("ShortId")
        public String shortId;

        @NameInMap("Committer")
        public String committer;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("Message")
        public String message;

        @NameInMap("Author")
        public String author;

        @NameInMap("AuthoredDate")
        public String authoredDate;

        @NameInMap("Signature")
        public String signature;

        @NameInMap("ParentIds")
        public java.util.List<String> parentIds;

        @NameInMap("AuthorName")
        public String authorName;

        @NameInMap("CheckSuites")
        public java.util.List<String> checkSuites;

        @NameInMap("CommitterName")
        public String committerName;

        @NameInMap("Title")
        public String title;

        @NameInMap("AuthorEmail")
        public String authorEmail;

        @NameInMap("CommitterEmail")
        public String committerEmail;

        @NameInMap("Id")
        public String id;

        @NameInMap("CommittedDate")
        public String committedDate;

        public static ExecLinkeantcodeAntcodeProtectbranchbynameResponseBodyCommit build(java.util.Map<String, ?> map) throws Exception {
            ExecLinkeantcodeAntcodeProtectbranchbynameResponseBodyCommit self = new ExecLinkeantcodeAntcodeProtectbranchbynameResponseBodyCommit();
            return TeaModel.build(map, self);
        }

        public ExecLinkeantcodeAntcodeProtectbranchbynameResponseBodyCommit setShortId(String shortId) {
            this.shortId = shortId;
            return this;
        }
        public String getShortId() {
            return this.shortId;
        }

        public ExecLinkeantcodeAntcodeProtectbranchbynameResponseBodyCommit setCommitter(String committer) {
            this.committer = committer;
            return this;
        }
        public String getCommitter() {
            return this.committer;
        }

        public ExecLinkeantcodeAntcodeProtectbranchbynameResponseBodyCommit setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ExecLinkeantcodeAntcodeProtectbranchbynameResponseBodyCommit setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ExecLinkeantcodeAntcodeProtectbranchbynameResponseBodyCommit setAuthor(String author) {
            this.author = author;
            return this;
        }
        public String getAuthor() {
            return this.author;
        }

        public ExecLinkeantcodeAntcodeProtectbranchbynameResponseBodyCommit setAuthoredDate(String authoredDate) {
            this.authoredDate = authoredDate;
            return this;
        }
        public String getAuthoredDate() {
            return this.authoredDate;
        }

        public ExecLinkeantcodeAntcodeProtectbranchbynameResponseBodyCommit setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

        public ExecLinkeantcodeAntcodeProtectbranchbynameResponseBodyCommit setParentIds(java.util.List<String> parentIds) {
            this.parentIds = parentIds;
            return this;
        }
        public java.util.List<String> getParentIds() {
            return this.parentIds;
        }

        public ExecLinkeantcodeAntcodeProtectbranchbynameResponseBodyCommit setAuthorName(String authorName) {
            this.authorName = authorName;
            return this;
        }
        public String getAuthorName() {
            return this.authorName;
        }

        public ExecLinkeantcodeAntcodeProtectbranchbynameResponseBodyCommit setCheckSuites(java.util.List<String> checkSuites) {
            this.checkSuites = checkSuites;
            return this;
        }
        public java.util.List<String> getCheckSuites() {
            return this.checkSuites;
        }

        public ExecLinkeantcodeAntcodeProtectbranchbynameResponseBodyCommit setCommitterName(String committerName) {
            this.committerName = committerName;
            return this;
        }
        public String getCommitterName() {
            return this.committerName;
        }

        public ExecLinkeantcodeAntcodeProtectbranchbynameResponseBodyCommit setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ExecLinkeantcodeAntcodeProtectbranchbynameResponseBodyCommit setAuthorEmail(String authorEmail) {
            this.authorEmail = authorEmail;
            return this;
        }
        public String getAuthorEmail() {
            return this.authorEmail;
        }

        public ExecLinkeantcodeAntcodeProtectbranchbynameResponseBodyCommit setCommitterEmail(String committerEmail) {
            this.committerEmail = committerEmail;
            return this;
        }
        public String getCommitterEmail() {
            return this.committerEmail;
        }

        public ExecLinkeantcodeAntcodeProtectbranchbynameResponseBodyCommit setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ExecLinkeantcodeAntcodeProtectbranchbynameResponseBodyCommit setCommittedDate(String committedDate) {
            this.committedDate = committedDate;
            return this;
        }
        public String getCommittedDate() {
            return this.committedDate;
        }

    }

}
