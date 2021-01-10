// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ActiveTime")
    public String activeTime;

    @NameInMap("AutoMerge")
    public Boolean autoMerge;

    @NameInMap("CompareId")
    public Long compareId;

    @NameInMap("CreatedAt")
    public String createdAt;

    @NameInMap("Description")
    public String description;

    @NameInMap("FfOnlyEnabled")
    public Boolean ffOnlyEnabled;

    @NameInMap("Id")
    public Long id;

    @NameInMap("Iid")
    public Long iid;

    @NameInMap("Mergeable")
    public Boolean mergeable;

    @NameInMap("MergeCommitMessage")
    public String mergeCommitMessage;

    @NameInMap("MergeCommitSha")
    public String mergeCommitSha;

    @NameInMap("MergeError")
    public String mergeError;

    @NameInMap("MergeStatus")
    public String mergeStatus;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Reviewed")
    public Boolean reviewed;

    @NameInMap("ShouldBeRebased")
    public Boolean shouldBeRebased;

    @NameInMap("ShouldRemoveSourceBranch")
    public Boolean shouldRemoveSourceBranch;

    @NameInMap("SourceBranch")
    public String sourceBranch;

    @NameInMap("SourceProjectId")
    public Long sourceProjectId;

    @NameInMap("SquashMerge")
    public Boolean squashMerge;

    @NameInMap("State")
    public String state;

    @NameInMap("TargetBranch")
    public String targetBranch;

    @NameInMap("TargetProjectId")
    public Long targetProjectId;

    @NameInMap("Title")
    public String title;

    @NameInMap("UpdatedAt")
    public String updatedAt;

    @NameInMap("Url")
    public String url;

    @NameInMap("WebUrl")
    public String webUrl;

    @NameInMap("WorkInProgress")
    public Boolean workInProgress;

    @NameInMap("Labels")
    public java.util.List<String> labels;

    @NameInMap("Assignee")
    public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyAssignee assignee;

    @NameInMap("Author")
    public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyAuthor author;

    @NameInMap("Review")
    public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyReview review;

    @NameInMap("Source")
    public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodySource source;

    @NameInMap("Target")
    public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyTarget target;

    @NameInMap("UpdatedBy")
    public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyUpdatedBy updatedBy;

    public static QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBody self = new QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBody setActiveTime(String activeTime) {
        this.activeTime = activeTime;
        return this;
    }
    public String getActiveTime() {
        return this.activeTime;
    }

    public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBody setAutoMerge(Boolean autoMerge) {
        this.autoMerge = autoMerge;
        return this;
    }
    public Boolean getAutoMerge() {
        return this.autoMerge;
    }

    public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBody setCompareId(Long compareId) {
        this.compareId = compareId;
        return this;
    }
    public Long getCompareId() {
        return this.compareId;
    }

    public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBody setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBody setFfOnlyEnabled(Boolean ffOnlyEnabled) {
        this.ffOnlyEnabled = ffOnlyEnabled;
        return this;
    }
    public Boolean getFfOnlyEnabled() {
        return this.ffOnlyEnabled;
    }

    public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBody setIid(Long iid) {
        this.iid = iid;
        return this;
    }
    public Long getIid() {
        return this.iid;
    }

    public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBody setMergeable(Boolean mergeable) {
        this.mergeable = mergeable;
        return this;
    }
    public Boolean getMergeable() {
        return this.mergeable;
    }

    public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBody setMergeCommitMessage(String mergeCommitMessage) {
        this.mergeCommitMessage = mergeCommitMessage;
        return this;
    }
    public String getMergeCommitMessage() {
        return this.mergeCommitMessage;
    }

    public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBody setMergeCommitSha(String mergeCommitSha) {
        this.mergeCommitSha = mergeCommitSha;
        return this;
    }
    public String getMergeCommitSha() {
        return this.mergeCommitSha;
    }

    public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBody setMergeError(String mergeError) {
        this.mergeError = mergeError;
        return this;
    }
    public String getMergeError() {
        return this.mergeError;
    }

    public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBody setMergeStatus(String mergeStatus) {
        this.mergeStatus = mergeStatus;
        return this;
    }
    public String getMergeStatus() {
        return this.mergeStatus;
    }

    public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBody setReviewed(Boolean reviewed) {
        this.reviewed = reviewed;
        return this;
    }
    public Boolean getReviewed() {
        return this.reviewed;
    }

    public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBody setShouldBeRebased(Boolean shouldBeRebased) {
        this.shouldBeRebased = shouldBeRebased;
        return this;
    }
    public Boolean getShouldBeRebased() {
        return this.shouldBeRebased;
    }

    public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBody setShouldRemoveSourceBranch(Boolean shouldRemoveSourceBranch) {
        this.shouldRemoveSourceBranch = shouldRemoveSourceBranch;
        return this;
    }
    public Boolean getShouldRemoveSourceBranch() {
        return this.shouldRemoveSourceBranch;
    }

    public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBody setSourceBranch(String sourceBranch) {
        this.sourceBranch = sourceBranch;
        return this;
    }
    public String getSourceBranch() {
        return this.sourceBranch;
    }

    public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBody setSourceProjectId(Long sourceProjectId) {
        this.sourceProjectId = sourceProjectId;
        return this;
    }
    public Long getSourceProjectId() {
        return this.sourceProjectId;
    }

    public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBody setSquashMerge(Boolean squashMerge) {
        this.squashMerge = squashMerge;
        return this;
    }
    public Boolean getSquashMerge() {
        return this.squashMerge;
    }

    public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBody setTargetBranch(String targetBranch) {
        this.targetBranch = targetBranch;
        return this;
    }
    public String getTargetBranch() {
        return this.targetBranch;
    }

    public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBody setTargetProjectId(Long targetProjectId) {
        this.targetProjectId = targetProjectId;
        return this;
    }
    public Long getTargetProjectId() {
        return this.targetProjectId;
    }

    public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBody setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBody setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBody setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBody setWebUrl(String webUrl) {
        this.webUrl = webUrl;
        return this;
    }
    public String getWebUrl() {
        return this.webUrl;
    }

    public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBody setWorkInProgress(Boolean workInProgress) {
        this.workInProgress = workInProgress;
        return this;
    }
    public Boolean getWorkInProgress() {
        return this.workInProgress;
    }

    public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBody setLabels(java.util.List<String> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<String> getLabels() {
        return this.labels;
    }

    public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBody setAssignee(QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyAssignee assignee) {
        this.assignee = assignee;
        return this;
    }
    public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyAssignee getAssignee() {
        return this.assignee;
    }

    public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBody setAuthor(QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyAuthor author) {
        this.author = author;
        return this;
    }
    public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyAuthor getAuthor() {
        return this.author;
    }

    public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBody setReview(QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyReview review) {
        this.review = review;
        return this;
    }
    public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyReview getReview() {
        return this.review;
    }

    public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBody setSource(QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodySource source) {
        this.source = source;
        return this;
    }
    public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodySource getSource() {
        return this.source;
    }

    public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBody setTarget(QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyTarget target) {
        this.target = target;
        return this;
    }
    public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyTarget getTarget() {
        return this.target;
    }

    public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBody setUpdatedBy(QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyUpdatedBy updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }
    public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyUpdatedBy getUpdatedBy() {
        return this.updatedBy;
    }

    public static class QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyAssignee extends TeaModel {
        @NameInMap("AccessLevel")
        public Long accessLevel;

        @NameInMap("AvatarUrl")
        public String avatarUrl;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("Email")
        public String email;

        @NameInMap("ExpiresAt")
        public String expiresAt;

        @NameInMap("ExternUid")
        public String externUid;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("NotificationLevel")
        public Long notificationLevel;

        @NameInMap("State")
        public String state;

        @NameInMap("UpdatedAt")
        public String updatedAt;

        @NameInMap("Username")
        public String username;

        @NameInMap("WebUrl")
        public String webUrl;

        public static QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyAssignee build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyAssignee self = new QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyAssignee();
            return TeaModel.build(map, self);
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyAssignee setAccessLevel(Long accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }
        public Long getAccessLevel() {
            return this.accessLevel;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyAssignee setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyAssignee setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyAssignee setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyAssignee setExpiresAt(String expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }
        public String getExpiresAt() {
            return this.expiresAt;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyAssignee setExternUid(String externUid) {
            this.externUid = externUid;
            return this;
        }
        public String getExternUid() {
            return this.externUid;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyAssignee setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyAssignee setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyAssignee setNotificationLevel(Long notificationLevel) {
            this.notificationLevel = notificationLevel;
            return this;
        }
        public Long getNotificationLevel() {
            return this.notificationLevel;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyAssignee setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyAssignee setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyAssignee setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyAssignee setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

    }

    public static class QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyAuthor extends TeaModel {
        @NameInMap("AccessLevel")
        public Long accessLevel;

        @NameInMap("AvatarUrl")
        public String avatarUrl;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("Email")
        public String email;

        @NameInMap("ExpiresAt")
        public String expiresAt;

        @NameInMap("ExternUid")
        public String externUid;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("NotificationLevel")
        public Long notificationLevel;

        @NameInMap("State")
        public String state;

        @NameInMap("UpdatedAt")
        public String updatedAt;

        @NameInMap("Username")
        public String username;

        @NameInMap("WebUrl")
        public String webUrl;

        public static QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyAuthor build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyAuthor self = new QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyAuthor();
            return TeaModel.build(map, self);
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyAuthor setAccessLevel(Long accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }
        public Long getAccessLevel() {
            return this.accessLevel;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyAuthor setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyAuthor setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyAuthor setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyAuthor setExpiresAt(String expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }
        public String getExpiresAt() {
            return this.expiresAt;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyAuthor setExternUid(String externUid) {
            this.externUid = externUid;
            return this;
        }
        public String getExternUid() {
            return this.externUid;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyAuthor setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyAuthor setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyAuthor setNotificationLevel(Long notificationLevel) {
            this.notificationLevel = notificationLevel;
            return this;
        }
        public Long getNotificationLevel() {
            return this.notificationLevel;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyAuthor setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyAuthor setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyAuthor setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyAuthor setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

    }

    public static class QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyReview extends TeaModel {
        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Iid")
        public Long iid;

        @NameInMap("Rule")
        public String rule;

        @NameInMap("RulesType")
        public String rulesType;

        @NameInMap("State")
        public String state;

        @NameInMap("StateDetail")
        public String stateDetail;

        @NameInMap("ThresholdClear")
        public Boolean thresholdClear;

        @NameInMap("UpdatedAt")
        public String updatedAt;

        @NameInMap("Reviewers")
        public java.util.List<String> reviewers;

        public static QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyReview build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyReview self = new QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyReview();
            return TeaModel.build(map, self);
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyReview setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyReview setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyReview setIid(Long iid) {
            this.iid = iid;
            return this;
        }
        public Long getIid() {
            return this.iid;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyReview setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyReview setRulesType(String rulesType) {
            this.rulesType = rulesType;
            return this;
        }
        public String getRulesType() {
            return this.rulesType;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyReview setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyReview setStateDetail(String stateDetail) {
            this.stateDetail = stateDetail;
            return this;
        }
        public String getStateDetail() {
            return this.stateDetail;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyReview setThresholdClear(Boolean thresholdClear) {
            this.thresholdClear = thresholdClear;
            return this;
        }
        public Boolean getThresholdClear() {
            return this.thresholdClear;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyReview setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyReview setReviewers(java.util.List<String> reviewers) {
            this.reviewers = reviewers;
            return this;
        }
        public java.util.List<String> getReviewers() {
            return this.reviewers;
        }

    }

    public static class QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodySource extends TeaModel {
        @NameInMap("Archived")
        public Boolean archived;

        @NameInMap("Artifacts")
        public Boolean artifacts;

        @NameInMap("AvatarUrl")
        public String avatarUrl;

        @NameInMap("CheckEmail")
        public Boolean checkEmail;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("CreatorId")
        public Long creatorId;

        @NameInMap("DefaultBranch")
        public String defaultBranch;

        @NameInMap("Description")
        public String description;

        @NameInMap("Encoding")
        public String encoding;

        @NameInMap("ExceptBranch")
        public String exceptBranch;

        @NameInMap("Homepage")
        public String homepage;

        @NameInMap("HttpUrlToRepo")
        public String httpUrlToRepo;

        @NameInMap("Id")
        public Long id;

        @NameInMap("ImportStatus")
        public String importStatus;

        @NameInMap("IsGray")
        public Boolean isGray;

        @NameInMap("IsReview")
        public Boolean isReview;

        @NameInMap("LastActivityAt")
        public String lastActivityAt;

        @NameInMap("Name")
        public String name;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("NameWithNamespace")
        public String nameWithNamespace;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("Path")
        public String path;

        @NameInMap("PathWithNamespace")
        public String pathWithNamespace;

        @NameInMap("Permission")
        public String permission;

        @NameInMap("Public")
        public Boolean _public;

        @NameInMap("RepositorySize")
        public String repositorySize;

        @NameInMap("RepositorySizeLimit")
        public Long repositorySizeLimit;

        @NameInMap("RunnersToken")
        public String runnersToken;

        @NameInMap("SshUrlToRepo")
        public String sshUrlToRepo;

        @NameInMap("Visibility")
        public String visibility;

        @NameInMap("VisibilityLevel")
        public Long visibilityLevel;

        @NameInMap("WebUrl")
        public String webUrl;

        @NameInMap("TagList")
        public java.util.List<String> tagList;

        public static QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodySource build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodySource self = new QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodySource();
            return TeaModel.build(map, self);
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodySource setArchived(Boolean archived) {
            this.archived = archived;
            return this;
        }
        public Boolean getArchived() {
            return this.archived;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodySource setArtifacts(Boolean artifacts) {
            this.artifacts = artifacts;
            return this;
        }
        public Boolean getArtifacts() {
            return this.artifacts;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodySource setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodySource setCheckEmail(Boolean checkEmail) {
            this.checkEmail = checkEmail;
            return this;
        }
        public Boolean getCheckEmail() {
            return this.checkEmail;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodySource setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodySource setCreatorId(Long creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public Long getCreatorId() {
            return this.creatorId;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodySource setDefaultBranch(String defaultBranch) {
            this.defaultBranch = defaultBranch;
            return this;
        }
        public String getDefaultBranch() {
            return this.defaultBranch;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodySource setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodySource setEncoding(String encoding) {
            this.encoding = encoding;
            return this;
        }
        public String getEncoding() {
            return this.encoding;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodySource setExceptBranch(String exceptBranch) {
            this.exceptBranch = exceptBranch;
            return this;
        }
        public String getExceptBranch() {
            return this.exceptBranch;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodySource setHomepage(String homepage) {
            this.homepage = homepage;
            return this;
        }
        public String getHomepage() {
            return this.homepage;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodySource setHttpUrlToRepo(String httpUrlToRepo) {
            this.httpUrlToRepo = httpUrlToRepo;
            return this;
        }
        public String getHttpUrlToRepo() {
            return this.httpUrlToRepo;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodySource setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodySource setImportStatus(String importStatus) {
            this.importStatus = importStatus;
            return this;
        }
        public String getImportStatus() {
            return this.importStatus;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodySource setIsGray(Boolean isGray) {
            this.isGray = isGray;
            return this;
        }
        public Boolean getIsGray() {
            return this.isGray;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodySource setIsReview(Boolean isReview) {
            this.isReview = isReview;
            return this;
        }
        public Boolean getIsReview() {
            return this.isReview;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodySource setLastActivityAt(String lastActivityAt) {
            this.lastActivityAt = lastActivityAt;
            return this;
        }
        public String getLastActivityAt() {
            return this.lastActivityAt;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodySource setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodySource setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodySource setNameWithNamespace(String nameWithNamespace) {
            this.nameWithNamespace = nameWithNamespace;
            return this;
        }
        public String getNameWithNamespace() {
            return this.nameWithNamespace;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodySource setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodySource setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodySource setPathWithNamespace(String pathWithNamespace) {
            this.pathWithNamespace = pathWithNamespace;
            return this;
        }
        public String getPathWithNamespace() {
            return this.pathWithNamespace;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodySource setPermission(String permission) {
            this.permission = permission;
            return this;
        }
        public String getPermission() {
            return this.permission;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodySource set_public(Boolean _public) {
            this._public = _public;
            return this;
        }
        public Boolean get_public() {
            return this._public;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodySource setRepositorySize(String repositorySize) {
            this.repositorySize = repositorySize;
            return this;
        }
        public String getRepositorySize() {
            return this.repositorySize;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodySource setRepositorySizeLimit(Long repositorySizeLimit) {
            this.repositorySizeLimit = repositorySizeLimit;
            return this;
        }
        public Long getRepositorySizeLimit() {
            return this.repositorySizeLimit;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodySource setRunnersToken(String runnersToken) {
            this.runnersToken = runnersToken;
            return this;
        }
        public String getRunnersToken() {
            return this.runnersToken;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodySource setSshUrlToRepo(String sshUrlToRepo) {
            this.sshUrlToRepo = sshUrlToRepo;
            return this;
        }
        public String getSshUrlToRepo() {
            return this.sshUrlToRepo;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodySource setVisibility(String visibility) {
            this.visibility = visibility;
            return this;
        }
        public String getVisibility() {
            return this.visibility;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodySource setVisibilityLevel(Long visibilityLevel) {
            this.visibilityLevel = visibilityLevel;
            return this;
        }
        public Long getVisibilityLevel() {
            return this.visibilityLevel;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodySource setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodySource setTagList(java.util.List<String> tagList) {
            this.tagList = tagList;
            return this;
        }
        public java.util.List<String> getTagList() {
            return this.tagList;
        }

    }

    public static class QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyTarget extends TeaModel {
        @NameInMap("Archived")
        public Boolean archived;

        @NameInMap("Artifacts")
        public Boolean artifacts;

        @NameInMap("AvatarUrl")
        public String avatarUrl;

        @NameInMap("CheckEmail")
        public Boolean checkEmail;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("CreatorId")
        public Long creatorId;

        @NameInMap("DefaultBranch")
        public String defaultBranch;

        @NameInMap("Description")
        public String description;

        @NameInMap("Encoding")
        public String encoding;

        @NameInMap("ExceptBranch")
        public String exceptBranch;

        @NameInMap("Homepage")
        public String homepage;

        @NameInMap("HttpUrlToRepo")
        public String httpUrlToRepo;

        @NameInMap("Id")
        public Long id;

        @NameInMap("ImportStatus")
        public String importStatus;

        @NameInMap("IsGray")
        public Boolean isGray;

        @NameInMap("IsReview")
        public Boolean isReview;

        @NameInMap("LastActivityAt")
        public String lastActivityAt;

        @NameInMap("Name")
        public String name;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("NameWithNamespace")
        public String nameWithNamespace;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("Path")
        public String path;

        @NameInMap("PathWithNamespace")
        public String pathWithNamespace;

        @NameInMap("Permission")
        public String permission;

        @NameInMap("Public")
        public Boolean _public;

        @NameInMap("RepositorySize")
        public String repositorySize;

        @NameInMap("RepositorySizeLimit")
        public Long repositorySizeLimit;

        @NameInMap("RunnersToken")
        public String runnersToken;

        @NameInMap("SshUrlToRepo")
        public String sshUrlToRepo;

        @NameInMap("Visibility")
        public String visibility;

        @NameInMap("VisibilityLevel")
        public Long visibilityLevel;

        @NameInMap("WebUrl")
        public String webUrl;

        @NameInMap("TagList")
        public java.util.List<String> tagList;

        public static QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyTarget build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyTarget self = new QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyTarget();
            return TeaModel.build(map, self);
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyTarget setArchived(Boolean archived) {
            this.archived = archived;
            return this;
        }
        public Boolean getArchived() {
            return this.archived;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyTarget setArtifacts(Boolean artifacts) {
            this.artifacts = artifacts;
            return this;
        }
        public Boolean getArtifacts() {
            return this.artifacts;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyTarget setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyTarget setCheckEmail(Boolean checkEmail) {
            this.checkEmail = checkEmail;
            return this;
        }
        public Boolean getCheckEmail() {
            return this.checkEmail;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyTarget setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyTarget setCreatorId(Long creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public Long getCreatorId() {
            return this.creatorId;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyTarget setDefaultBranch(String defaultBranch) {
            this.defaultBranch = defaultBranch;
            return this;
        }
        public String getDefaultBranch() {
            return this.defaultBranch;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyTarget setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyTarget setEncoding(String encoding) {
            this.encoding = encoding;
            return this;
        }
        public String getEncoding() {
            return this.encoding;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyTarget setExceptBranch(String exceptBranch) {
            this.exceptBranch = exceptBranch;
            return this;
        }
        public String getExceptBranch() {
            return this.exceptBranch;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyTarget setHomepage(String homepage) {
            this.homepage = homepage;
            return this;
        }
        public String getHomepage() {
            return this.homepage;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyTarget setHttpUrlToRepo(String httpUrlToRepo) {
            this.httpUrlToRepo = httpUrlToRepo;
            return this;
        }
        public String getHttpUrlToRepo() {
            return this.httpUrlToRepo;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyTarget setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyTarget setImportStatus(String importStatus) {
            this.importStatus = importStatus;
            return this;
        }
        public String getImportStatus() {
            return this.importStatus;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyTarget setIsGray(Boolean isGray) {
            this.isGray = isGray;
            return this;
        }
        public Boolean getIsGray() {
            return this.isGray;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyTarget setIsReview(Boolean isReview) {
            this.isReview = isReview;
            return this;
        }
        public Boolean getIsReview() {
            return this.isReview;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyTarget setLastActivityAt(String lastActivityAt) {
            this.lastActivityAt = lastActivityAt;
            return this;
        }
        public String getLastActivityAt() {
            return this.lastActivityAt;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyTarget setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyTarget setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyTarget setNameWithNamespace(String nameWithNamespace) {
            this.nameWithNamespace = nameWithNamespace;
            return this;
        }
        public String getNameWithNamespace() {
            return this.nameWithNamespace;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyTarget setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyTarget setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyTarget setPathWithNamespace(String pathWithNamespace) {
            this.pathWithNamespace = pathWithNamespace;
            return this;
        }
        public String getPathWithNamespace() {
            return this.pathWithNamespace;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyTarget setPermission(String permission) {
            this.permission = permission;
            return this;
        }
        public String getPermission() {
            return this.permission;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyTarget set_public(Boolean _public) {
            this._public = _public;
            return this;
        }
        public Boolean get_public() {
            return this._public;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyTarget setRepositorySize(String repositorySize) {
            this.repositorySize = repositorySize;
            return this;
        }
        public String getRepositorySize() {
            return this.repositorySize;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyTarget setRepositorySizeLimit(Long repositorySizeLimit) {
            this.repositorySizeLimit = repositorySizeLimit;
            return this;
        }
        public Long getRepositorySizeLimit() {
            return this.repositorySizeLimit;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyTarget setRunnersToken(String runnersToken) {
            this.runnersToken = runnersToken;
            return this;
        }
        public String getRunnersToken() {
            return this.runnersToken;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyTarget setSshUrlToRepo(String sshUrlToRepo) {
            this.sshUrlToRepo = sshUrlToRepo;
            return this;
        }
        public String getSshUrlToRepo() {
            return this.sshUrlToRepo;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyTarget setVisibility(String visibility) {
            this.visibility = visibility;
            return this;
        }
        public String getVisibility() {
            return this.visibility;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyTarget setVisibilityLevel(Long visibilityLevel) {
            this.visibilityLevel = visibilityLevel;
            return this;
        }
        public Long getVisibilityLevel() {
            return this.visibilityLevel;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyTarget setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyTarget setTagList(java.util.List<String> tagList) {
            this.tagList = tagList;
            return this;
        }
        public java.util.List<String> getTagList() {
            return this.tagList;
        }

    }

    public static class QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyUpdatedBy extends TeaModel {
        @NameInMap("AccessLevel")
        public Long accessLevel;

        @NameInMap("AvatarUrl")
        public String avatarUrl;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("Email")
        public String email;

        @NameInMap("ExpiresAt")
        public String expiresAt;

        @NameInMap("ExternUid")
        public String externUid;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("NotificationLevel")
        public Long notificationLevel;

        @NameInMap("State")
        public String state;

        @NameInMap("UpdatedAt")
        public String updatedAt;

        @NameInMap("Username")
        public String username;

        @NameInMap("WebUrl")
        public String webUrl;

        public static QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyUpdatedBy build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyUpdatedBy self = new QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyUpdatedBy();
            return TeaModel.build(map, self);
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyUpdatedBy setAccessLevel(Long accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }
        public Long getAccessLevel() {
            return this.accessLevel;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyUpdatedBy setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyUpdatedBy setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyUpdatedBy setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyUpdatedBy setExpiresAt(String expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }
        public String getExpiresAt() {
            return this.expiresAt;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyUpdatedBy setExternUid(String externUid) {
            this.externUid = externUid;
            return this;
        }
        public String getExternUid() {
            return this.externUid;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyUpdatedBy setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyUpdatedBy setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyUpdatedBy setNotificationLevel(Long notificationLevel) {
            this.notificationLevel = notificationLevel;
            return this;
        }
        public Long getNotificationLevel() {
            return this.notificationLevel;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyUpdatedBy setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyUpdatedBy setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyUpdatedBy setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public QueryLinkeantcodeAntcodeRebaseprojectpullrequestResponseBodyUpdatedBy setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

    }

}
