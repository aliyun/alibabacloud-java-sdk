// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeantcodeAntcodeProjecttagResponseBody extends TeaModel {
    @NameInMap("Commit")
    public CreateLinkeantcodeAntcodeProjecttagResponseBodyCommit commit;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public String message;

    @NameInMap("Tagger")
    public CreateLinkeantcodeAntcodeProjecttagResponseBodyTagger tagger;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("CheckSuites")
    public java.util.List<CreateLinkeantcodeAntcodeProjecttagResponseBodyCheckSuites> checkSuites;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("Release")
    public CreateLinkeantcodeAntcodeProjecttagResponseBodyRelease release;

    @NameInMap("Name")
    public String name;

    public static CreateLinkeantcodeAntcodeProjecttagResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeantcodeAntcodeProjecttagResponseBody self = new CreateLinkeantcodeAntcodeProjecttagResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLinkeantcodeAntcodeProjecttagResponseBody setCommit(CreateLinkeantcodeAntcodeProjecttagResponseBodyCommit commit) {
        this.commit = commit;
        return this;
    }
    public CreateLinkeantcodeAntcodeProjecttagResponseBodyCommit getCommit() {
        return this.commit;
    }

    public CreateLinkeantcodeAntcodeProjecttagResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateLinkeantcodeAntcodeProjecttagResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateLinkeantcodeAntcodeProjecttagResponseBody setTagger(CreateLinkeantcodeAntcodeProjecttagResponseBodyTagger tagger) {
        this.tagger = tagger;
        return this;
    }
    public CreateLinkeantcodeAntcodeProjecttagResponseBodyTagger getTagger() {
        return this.tagger;
    }

    public CreateLinkeantcodeAntcodeProjecttagResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public CreateLinkeantcodeAntcodeProjecttagResponseBody setCheckSuites(java.util.List<CreateLinkeantcodeAntcodeProjecttagResponseBodyCheckSuites> checkSuites) {
        this.checkSuites = checkSuites;
        return this;
    }
    public java.util.List<CreateLinkeantcodeAntcodeProjecttagResponseBodyCheckSuites> getCheckSuites() {
        return this.checkSuites;
    }

    public CreateLinkeantcodeAntcodeProjecttagResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CreateLinkeantcodeAntcodeProjecttagResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateLinkeantcodeAntcodeProjecttagResponseBody setRelease(CreateLinkeantcodeAntcodeProjecttagResponseBodyRelease release) {
        this.release = release;
        return this;
    }
    public CreateLinkeantcodeAntcodeProjecttagResponseBodyRelease getRelease() {
        return this.release;
    }

    public CreateLinkeantcodeAntcodeProjecttagResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public static class CreateLinkeantcodeAntcodeProjecttagResponseBodyCommit extends TeaModel {
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

        public static CreateLinkeantcodeAntcodeProjecttagResponseBodyCommit build(java.util.Map<String, ?> map) throws Exception {
            CreateLinkeantcodeAntcodeProjecttagResponseBodyCommit self = new CreateLinkeantcodeAntcodeProjecttagResponseBodyCommit();
            return TeaModel.build(map, self);
        }

        public CreateLinkeantcodeAntcodeProjecttagResponseBodyCommit setShortId(String shortId) {
            this.shortId = shortId;
            return this;
        }
        public String getShortId() {
            return this.shortId;
        }

        public CreateLinkeantcodeAntcodeProjecttagResponseBodyCommit setCommitter(String committer) {
            this.committer = committer;
            return this;
        }
        public String getCommitter() {
            return this.committer;
        }

        public CreateLinkeantcodeAntcodeProjecttagResponseBodyCommit setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public CreateLinkeantcodeAntcodeProjecttagResponseBodyCommit setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public CreateLinkeantcodeAntcodeProjecttagResponseBodyCommit setAuthor(String author) {
            this.author = author;
            return this;
        }
        public String getAuthor() {
            return this.author;
        }

        public CreateLinkeantcodeAntcodeProjecttagResponseBodyCommit setAuthoredDate(String authoredDate) {
            this.authoredDate = authoredDate;
            return this;
        }
        public String getAuthoredDate() {
            return this.authoredDate;
        }

        public CreateLinkeantcodeAntcodeProjecttagResponseBodyCommit setSignature(String signature) {
            this.signature = signature;
            return this;
        }
        public String getSignature() {
            return this.signature;
        }

        public CreateLinkeantcodeAntcodeProjecttagResponseBodyCommit setParentIds(java.util.List<String> parentIds) {
            this.parentIds = parentIds;
            return this;
        }
        public java.util.List<String> getParentIds() {
            return this.parentIds;
        }

        public CreateLinkeantcodeAntcodeProjecttagResponseBodyCommit setAuthorName(String authorName) {
            this.authorName = authorName;
            return this;
        }
        public String getAuthorName() {
            return this.authorName;
        }

        public CreateLinkeantcodeAntcodeProjecttagResponseBodyCommit setCheckSuites(java.util.List<String> checkSuites) {
            this.checkSuites = checkSuites;
            return this;
        }
        public java.util.List<String> getCheckSuites() {
            return this.checkSuites;
        }

        public CreateLinkeantcodeAntcodeProjecttagResponseBodyCommit setCommitterName(String committerName) {
            this.committerName = committerName;
            return this;
        }
        public String getCommitterName() {
            return this.committerName;
        }

        public CreateLinkeantcodeAntcodeProjecttagResponseBodyCommit setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public CreateLinkeantcodeAntcodeProjecttagResponseBodyCommit setAuthorEmail(String authorEmail) {
            this.authorEmail = authorEmail;
            return this;
        }
        public String getAuthorEmail() {
            return this.authorEmail;
        }

        public CreateLinkeantcodeAntcodeProjecttagResponseBodyCommit setCommitterEmail(String committerEmail) {
            this.committerEmail = committerEmail;
            return this;
        }
        public String getCommitterEmail() {
            return this.committerEmail;
        }

        public CreateLinkeantcodeAntcodeProjecttagResponseBodyCommit setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateLinkeantcodeAntcodeProjecttagResponseBodyCommit setCommittedDate(String committedDate) {
            this.committedDate = committedDate;
            return this;
        }
        public String getCommittedDate() {
            return this.committedDate;
        }

    }

    public static class CreateLinkeantcodeAntcodeProjecttagResponseBodyTagger extends TeaModel {
        @NameInMap("Email")
        public String email;

        @NameInMap("When")
        public String when;

        @NameInMap("Name")
        public String name;

        public static CreateLinkeantcodeAntcodeProjecttagResponseBodyTagger build(java.util.Map<String, ?> map) throws Exception {
            CreateLinkeantcodeAntcodeProjecttagResponseBodyTagger self = new CreateLinkeantcodeAntcodeProjecttagResponseBodyTagger();
            return TeaModel.build(map, self);
        }

        public CreateLinkeantcodeAntcodeProjecttagResponseBodyTagger setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public CreateLinkeantcodeAntcodeProjecttagResponseBodyTagger setWhen(String when) {
            this.when = when;
            return this;
        }
        public String getWhen() {
            return this.when;
        }

        public CreateLinkeantcodeAntcodeProjecttagResponseBodyTagger setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class CreateLinkeantcodeAntcodeProjecttagResponseBodyCheckSuites extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("BeforeSha")
        public String beforeSha;

        @NameInMap("HeadBranch")
        public String headBranch;

        @NameInMap("ServiceId")
        public Long serviceId;

        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("AfterSha")
        public String afterSha;

        @NameInMap("Conclusion")
        public String conclusion;

        @NameInMap("Service")
        public String service;

        @NameInMap("PullRequestId")
        public Long pullRequestId;

        @NameInMap("EventType")
        public String eventType;

        @NameInMap("CheckRuns")
        public java.util.List<String> checkRuns;

        @NameInMap("UpdatedAt")
        public String updatedAt;

        @NameInMap("HeadSha")
        public String headSha;

        @NameInMap("Id")
        public Long id;

        public static CreateLinkeantcodeAntcodeProjecttagResponseBodyCheckSuites build(java.util.Map<String, ?> map) throws Exception {
            CreateLinkeantcodeAntcodeProjecttagResponseBodyCheckSuites self = new CreateLinkeantcodeAntcodeProjecttagResponseBodyCheckSuites();
            return TeaModel.build(map, self);
        }

        public CreateLinkeantcodeAntcodeProjecttagResponseBodyCheckSuites setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateLinkeantcodeAntcodeProjecttagResponseBodyCheckSuites setBeforeSha(String beforeSha) {
            this.beforeSha = beforeSha;
            return this;
        }
        public String getBeforeSha() {
            return this.beforeSha;
        }

        public CreateLinkeantcodeAntcodeProjecttagResponseBodyCheckSuites setHeadBranch(String headBranch) {
            this.headBranch = headBranch;
            return this;
        }
        public String getHeadBranch() {
            return this.headBranch;
        }

        public CreateLinkeantcodeAntcodeProjecttagResponseBodyCheckSuites setServiceId(Long serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public Long getServiceId() {
            return this.serviceId;
        }

        public CreateLinkeantcodeAntcodeProjecttagResponseBodyCheckSuites setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public CreateLinkeantcodeAntcodeProjecttagResponseBodyCheckSuites setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public CreateLinkeantcodeAntcodeProjecttagResponseBodyCheckSuites setAfterSha(String afterSha) {
            this.afterSha = afterSha;
            return this;
        }
        public String getAfterSha() {
            return this.afterSha;
        }

        public CreateLinkeantcodeAntcodeProjecttagResponseBodyCheckSuites setConclusion(String conclusion) {
            this.conclusion = conclusion;
            return this;
        }
        public String getConclusion() {
            return this.conclusion;
        }

        public CreateLinkeantcodeAntcodeProjecttagResponseBodyCheckSuites setService(String service) {
            this.service = service;
            return this;
        }
        public String getService() {
            return this.service;
        }

        public CreateLinkeantcodeAntcodeProjecttagResponseBodyCheckSuites setPullRequestId(Long pullRequestId) {
            this.pullRequestId = pullRequestId;
            return this;
        }
        public Long getPullRequestId() {
            return this.pullRequestId;
        }

        public CreateLinkeantcodeAntcodeProjecttagResponseBodyCheckSuites setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

        public CreateLinkeantcodeAntcodeProjecttagResponseBodyCheckSuites setCheckRuns(java.util.List<String> checkRuns) {
            this.checkRuns = checkRuns;
            return this;
        }
        public java.util.List<String> getCheckRuns() {
            return this.checkRuns;
        }

        public CreateLinkeantcodeAntcodeProjecttagResponseBodyCheckSuites setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public CreateLinkeantcodeAntcodeProjecttagResponseBodyCheckSuites setHeadSha(String headSha) {
            this.headSha = headSha;
            return this;
        }
        public String getHeadSha() {
            return this.headSha;
        }

        public CreateLinkeantcodeAntcodeProjecttagResponseBodyCheckSuites setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class CreateLinkeantcodeAntcodeProjecttagResponseBodyRelease extends TeaModel {
        @NameInMap("TagName")
        public String tagName;

        @NameInMap("Description")
        public String description;

        public static CreateLinkeantcodeAntcodeProjecttagResponseBodyRelease build(java.util.Map<String, ?> map) throws Exception {
            CreateLinkeantcodeAntcodeProjecttagResponseBodyRelease self = new CreateLinkeantcodeAntcodeProjecttagResponseBodyRelease();
            return TeaModel.build(map, self);
        }

        public CreateLinkeantcodeAntcodeProjecttagResponseBodyRelease setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

        public CreateLinkeantcodeAntcodeProjecttagResponseBodyRelease setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

}
