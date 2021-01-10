// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBody extends TeaModel {
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
    public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyAssignee assignee;

    @NameInMap("Author")
    public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyAuthor author;

    @NameInMap("Review")
    public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyReview review;

    @NameInMap("Source")
    public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodySource source;

    @NameInMap("Target")
    public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyTarget target;

    @NameInMap("UpdatedBy")
    public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyUpdatedBy updatedBy;

    public static QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBody self = new QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBody setActiveTime(String activeTime) {
        this.activeTime = activeTime;
        return this;
    }
    public String getActiveTime() {
        return this.activeTime;
    }

    public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBody setAutoMerge(Boolean autoMerge) {
        this.autoMerge = autoMerge;
        return this;
    }
    public Boolean getAutoMerge() {
        return this.autoMerge;
    }

    public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBody setCompareId(Long compareId) {
        this.compareId = compareId;
        return this;
    }
    public Long getCompareId() {
        return this.compareId;
    }

    public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBody setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBody setFfOnlyEnabled(Boolean ffOnlyEnabled) {
        this.ffOnlyEnabled = ffOnlyEnabled;
        return this;
    }
    public Boolean getFfOnlyEnabled() {
        return this.ffOnlyEnabled;
    }

    public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBody setIid(Long iid) {
        this.iid = iid;
        return this;
    }
    public Long getIid() {
        return this.iid;
    }

    public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBody setMergeable(Boolean mergeable) {
        this.mergeable = mergeable;
        return this;
    }
    public Boolean getMergeable() {
        return this.mergeable;
    }

    public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBody setMergeCommitMessage(String mergeCommitMessage) {
        this.mergeCommitMessage = mergeCommitMessage;
        return this;
    }
    public String getMergeCommitMessage() {
        return this.mergeCommitMessage;
    }

    public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBody setMergeCommitSha(String mergeCommitSha) {
        this.mergeCommitSha = mergeCommitSha;
        return this;
    }
    public String getMergeCommitSha() {
        return this.mergeCommitSha;
    }

    public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBody setMergeError(String mergeError) {
        this.mergeError = mergeError;
        return this;
    }
    public String getMergeError() {
        return this.mergeError;
    }

    public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBody setMergeStatus(String mergeStatus) {
        this.mergeStatus = mergeStatus;
        return this;
    }
    public String getMergeStatus() {
        return this.mergeStatus;
    }

    public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBody setReviewed(Boolean reviewed) {
        this.reviewed = reviewed;
        return this;
    }
    public Boolean getReviewed() {
        return this.reviewed;
    }

    public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBody setShouldBeRebased(Boolean shouldBeRebased) {
        this.shouldBeRebased = shouldBeRebased;
        return this;
    }
    public Boolean getShouldBeRebased() {
        return this.shouldBeRebased;
    }

    public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBody setShouldRemoveSourceBranch(Boolean shouldRemoveSourceBranch) {
        this.shouldRemoveSourceBranch = shouldRemoveSourceBranch;
        return this;
    }
    public Boolean getShouldRemoveSourceBranch() {
        return this.shouldRemoveSourceBranch;
    }

    public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBody setSourceBranch(String sourceBranch) {
        this.sourceBranch = sourceBranch;
        return this;
    }
    public String getSourceBranch() {
        return this.sourceBranch;
    }

    public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBody setSourceProjectId(Long sourceProjectId) {
        this.sourceProjectId = sourceProjectId;
        return this;
    }
    public Long getSourceProjectId() {
        return this.sourceProjectId;
    }

    public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBody setSquashMerge(Boolean squashMerge) {
        this.squashMerge = squashMerge;
        return this;
    }
    public Boolean getSquashMerge() {
        return this.squashMerge;
    }

    public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBody setTargetBranch(String targetBranch) {
        this.targetBranch = targetBranch;
        return this;
    }
    public String getTargetBranch() {
        return this.targetBranch;
    }

    public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBody setTargetProjectId(Long targetProjectId) {
        this.targetProjectId = targetProjectId;
        return this;
    }
    public Long getTargetProjectId() {
        return this.targetProjectId;
    }

    public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBody setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBody setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBody setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBody setWebUrl(String webUrl) {
        this.webUrl = webUrl;
        return this;
    }
    public String getWebUrl() {
        return this.webUrl;
    }

    public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBody setWorkInProgress(Boolean workInProgress) {
        this.workInProgress = workInProgress;
        return this;
    }
    public Boolean getWorkInProgress() {
        return this.workInProgress;
    }

    public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBody setLabels(java.util.List<String> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<String> getLabels() {
        return this.labels;
    }

    public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBody setAssignee(QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyAssignee assignee) {
        this.assignee = assignee;
        return this;
    }
    public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyAssignee getAssignee() {
        return this.assignee;
    }

    public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBody setAuthor(QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyAuthor author) {
        this.author = author;
        return this;
    }
    public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyAuthor getAuthor() {
        return this.author;
    }

    public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBody setReview(QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyReview review) {
        this.review = review;
        return this;
    }
    public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyReview getReview() {
        return this.review;
    }

    public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBody setSource(QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodySource source) {
        this.source = source;
        return this;
    }
    public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodySource getSource() {
        return this.source;
    }

    public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBody setTarget(QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyTarget target) {
        this.target = target;
        return this;
    }
    public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyTarget getTarget() {
        return this.target;
    }

    public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBody setUpdatedBy(QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyUpdatedBy updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }
    public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyUpdatedBy getUpdatedBy() {
        return this.updatedBy;
    }

    public static class QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyAssignee extends TeaModel {
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

        public static QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyAssignee build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyAssignee self = new QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyAssignee();
            return TeaModel.build(map, self);
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyAssignee setAccessLevel(Long accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }
        public Long getAccessLevel() {
            return this.accessLevel;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyAssignee setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyAssignee setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyAssignee setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyAssignee setExpiresAt(String expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }
        public String getExpiresAt() {
            return this.expiresAt;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyAssignee setExternUid(String externUid) {
            this.externUid = externUid;
            return this;
        }
        public String getExternUid() {
            return this.externUid;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyAssignee setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyAssignee setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyAssignee setNotificationLevel(Long notificationLevel) {
            this.notificationLevel = notificationLevel;
            return this;
        }
        public Long getNotificationLevel() {
            return this.notificationLevel;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyAssignee setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyAssignee setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyAssignee setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyAssignee setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

    }

    public static class QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyAuthor extends TeaModel {
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

        public static QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyAuthor build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyAuthor self = new QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyAuthor();
            return TeaModel.build(map, self);
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyAuthor setAccessLevel(Long accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }
        public Long getAccessLevel() {
            return this.accessLevel;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyAuthor setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyAuthor setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyAuthor setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyAuthor setExpiresAt(String expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }
        public String getExpiresAt() {
            return this.expiresAt;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyAuthor setExternUid(String externUid) {
            this.externUid = externUid;
            return this;
        }
        public String getExternUid() {
            return this.externUid;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyAuthor setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyAuthor setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyAuthor setNotificationLevel(Long notificationLevel) {
            this.notificationLevel = notificationLevel;
            return this;
        }
        public Long getNotificationLevel() {
            return this.notificationLevel;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyAuthor setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyAuthor setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyAuthor setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyAuthor setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

    }

    public static class QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyReview extends TeaModel {
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

        public static QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyReview build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyReview self = new QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyReview();
            return TeaModel.build(map, self);
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyReview setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyReview setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyReview setIid(Long iid) {
            this.iid = iid;
            return this;
        }
        public Long getIid() {
            return this.iid;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyReview setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyReview setRulesType(String rulesType) {
            this.rulesType = rulesType;
            return this;
        }
        public String getRulesType() {
            return this.rulesType;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyReview setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyReview setStateDetail(String stateDetail) {
            this.stateDetail = stateDetail;
            return this;
        }
        public String getStateDetail() {
            return this.stateDetail;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyReview setThresholdClear(Boolean thresholdClear) {
            this.thresholdClear = thresholdClear;
            return this;
        }
        public Boolean getThresholdClear() {
            return this.thresholdClear;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyReview setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyReview setReviewers(java.util.List<String> reviewers) {
            this.reviewers = reviewers;
            return this;
        }
        public java.util.List<String> getReviewers() {
            return this.reviewers;
        }

    }

    public static class QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodySource extends TeaModel {
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

        public static QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodySource build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodySource self = new QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodySource();
            return TeaModel.build(map, self);
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodySource setArchived(Boolean archived) {
            this.archived = archived;
            return this;
        }
        public Boolean getArchived() {
            return this.archived;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodySource setArtifacts(Boolean artifacts) {
            this.artifacts = artifacts;
            return this;
        }
        public Boolean getArtifacts() {
            return this.artifacts;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodySource setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodySource setCheckEmail(Boolean checkEmail) {
            this.checkEmail = checkEmail;
            return this;
        }
        public Boolean getCheckEmail() {
            return this.checkEmail;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodySource setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodySource setCreatorId(Long creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public Long getCreatorId() {
            return this.creatorId;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodySource setDefaultBranch(String defaultBranch) {
            this.defaultBranch = defaultBranch;
            return this;
        }
        public String getDefaultBranch() {
            return this.defaultBranch;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodySource setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodySource setEncoding(String encoding) {
            this.encoding = encoding;
            return this;
        }
        public String getEncoding() {
            return this.encoding;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodySource setExceptBranch(String exceptBranch) {
            this.exceptBranch = exceptBranch;
            return this;
        }
        public String getExceptBranch() {
            return this.exceptBranch;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodySource setHomepage(String homepage) {
            this.homepage = homepage;
            return this;
        }
        public String getHomepage() {
            return this.homepage;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodySource setHttpUrlToRepo(String httpUrlToRepo) {
            this.httpUrlToRepo = httpUrlToRepo;
            return this;
        }
        public String getHttpUrlToRepo() {
            return this.httpUrlToRepo;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodySource setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodySource setImportStatus(String importStatus) {
            this.importStatus = importStatus;
            return this;
        }
        public String getImportStatus() {
            return this.importStatus;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodySource setIsGray(Boolean isGray) {
            this.isGray = isGray;
            return this;
        }
        public Boolean getIsGray() {
            return this.isGray;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodySource setIsReview(Boolean isReview) {
            this.isReview = isReview;
            return this;
        }
        public Boolean getIsReview() {
            return this.isReview;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodySource setLastActivityAt(String lastActivityAt) {
            this.lastActivityAt = lastActivityAt;
            return this;
        }
        public String getLastActivityAt() {
            return this.lastActivityAt;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodySource setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodySource setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodySource setNameWithNamespace(String nameWithNamespace) {
            this.nameWithNamespace = nameWithNamespace;
            return this;
        }
        public String getNameWithNamespace() {
            return this.nameWithNamespace;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodySource setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodySource setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodySource setPathWithNamespace(String pathWithNamespace) {
            this.pathWithNamespace = pathWithNamespace;
            return this;
        }
        public String getPathWithNamespace() {
            return this.pathWithNamespace;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodySource setPermission(String permission) {
            this.permission = permission;
            return this;
        }
        public String getPermission() {
            return this.permission;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodySource set_public(Boolean _public) {
            this._public = _public;
            return this;
        }
        public Boolean get_public() {
            return this._public;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodySource setRepositorySize(String repositorySize) {
            this.repositorySize = repositorySize;
            return this;
        }
        public String getRepositorySize() {
            return this.repositorySize;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodySource setRepositorySizeLimit(Long repositorySizeLimit) {
            this.repositorySizeLimit = repositorySizeLimit;
            return this;
        }
        public Long getRepositorySizeLimit() {
            return this.repositorySizeLimit;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodySource setRunnersToken(String runnersToken) {
            this.runnersToken = runnersToken;
            return this;
        }
        public String getRunnersToken() {
            return this.runnersToken;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodySource setSshUrlToRepo(String sshUrlToRepo) {
            this.sshUrlToRepo = sshUrlToRepo;
            return this;
        }
        public String getSshUrlToRepo() {
            return this.sshUrlToRepo;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodySource setVisibility(String visibility) {
            this.visibility = visibility;
            return this;
        }
        public String getVisibility() {
            return this.visibility;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodySource setVisibilityLevel(Long visibilityLevel) {
            this.visibilityLevel = visibilityLevel;
            return this;
        }
        public Long getVisibilityLevel() {
            return this.visibilityLevel;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodySource setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodySource setTagList(java.util.List<String> tagList) {
            this.tagList = tagList;
            return this;
        }
        public java.util.List<String> getTagList() {
            return this.tagList;
        }

    }

    public static class QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyTarget extends TeaModel {
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

        public static QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyTarget build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyTarget self = new QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyTarget();
            return TeaModel.build(map, self);
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyTarget setArchived(Boolean archived) {
            this.archived = archived;
            return this;
        }
        public Boolean getArchived() {
            return this.archived;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyTarget setArtifacts(Boolean artifacts) {
            this.artifacts = artifacts;
            return this;
        }
        public Boolean getArtifacts() {
            return this.artifacts;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyTarget setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyTarget setCheckEmail(Boolean checkEmail) {
            this.checkEmail = checkEmail;
            return this;
        }
        public Boolean getCheckEmail() {
            return this.checkEmail;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyTarget setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyTarget setCreatorId(Long creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public Long getCreatorId() {
            return this.creatorId;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyTarget setDefaultBranch(String defaultBranch) {
            this.defaultBranch = defaultBranch;
            return this;
        }
        public String getDefaultBranch() {
            return this.defaultBranch;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyTarget setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyTarget setEncoding(String encoding) {
            this.encoding = encoding;
            return this;
        }
        public String getEncoding() {
            return this.encoding;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyTarget setExceptBranch(String exceptBranch) {
            this.exceptBranch = exceptBranch;
            return this;
        }
        public String getExceptBranch() {
            return this.exceptBranch;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyTarget setHomepage(String homepage) {
            this.homepage = homepage;
            return this;
        }
        public String getHomepage() {
            return this.homepage;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyTarget setHttpUrlToRepo(String httpUrlToRepo) {
            this.httpUrlToRepo = httpUrlToRepo;
            return this;
        }
        public String getHttpUrlToRepo() {
            return this.httpUrlToRepo;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyTarget setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyTarget setImportStatus(String importStatus) {
            this.importStatus = importStatus;
            return this;
        }
        public String getImportStatus() {
            return this.importStatus;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyTarget setIsGray(Boolean isGray) {
            this.isGray = isGray;
            return this;
        }
        public Boolean getIsGray() {
            return this.isGray;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyTarget setIsReview(Boolean isReview) {
            this.isReview = isReview;
            return this;
        }
        public Boolean getIsReview() {
            return this.isReview;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyTarget setLastActivityAt(String lastActivityAt) {
            this.lastActivityAt = lastActivityAt;
            return this;
        }
        public String getLastActivityAt() {
            return this.lastActivityAt;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyTarget setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyTarget setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyTarget setNameWithNamespace(String nameWithNamespace) {
            this.nameWithNamespace = nameWithNamespace;
            return this;
        }
        public String getNameWithNamespace() {
            return this.nameWithNamespace;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyTarget setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyTarget setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyTarget setPathWithNamespace(String pathWithNamespace) {
            this.pathWithNamespace = pathWithNamespace;
            return this;
        }
        public String getPathWithNamespace() {
            return this.pathWithNamespace;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyTarget setPermission(String permission) {
            this.permission = permission;
            return this;
        }
        public String getPermission() {
            return this.permission;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyTarget set_public(Boolean _public) {
            this._public = _public;
            return this;
        }
        public Boolean get_public() {
            return this._public;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyTarget setRepositorySize(String repositorySize) {
            this.repositorySize = repositorySize;
            return this;
        }
        public String getRepositorySize() {
            return this.repositorySize;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyTarget setRepositorySizeLimit(Long repositorySizeLimit) {
            this.repositorySizeLimit = repositorySizeLimit;
            return this;
        }
        public Long getRepositorySizeLimit() {
            return this.repositorySizeLimit;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyTarget setRunnersToken(String runnersToken) {
            this.runnersToken = runnersToken;
            return this;
        }
        public String getRunnersToken() {
            return this.runnersToken;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyTarget setSshUrlToRepo(String sshUrlToRepo) {
            this.sshUrlToRepo = sshUrlToRepo;
            return this;
        }
        public String getSshUrlToRepo() {
            return this.sshUrlToRepo;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyTarget setVisibility(String visibility) {
            this.visibility = visibility;
            return this;
        }
        public String getVisibility() {
            return this.visibility;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyTarget setVisibilityLevel(Long visibilityLevel) {
            this.visibilityLevel = visibilityLevel;
            return this;
        }
        public Long getVisibilityLevel() {
            return this.visibilityLevel;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyTarget setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyTarget setTagList(java.util.List<String> tagList) {
            this.tagList = tagList;
            return this;
        }
        public java.util.List<String> getTagList() {
            return this.tagList;
        }

    }

    public static class QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyUpdatedBy extends TeaModel {
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

        public static QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyUpdatedBy build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyUpdatedBy self = new QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyUpdatedBy();
            return TeaModel.build(map, self);
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyUpdatedBy setAccessLevel(Long accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }
        public Long getAccessLevel() {
            return this.accessLevel;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyUpdatedBy setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyUpdatedBy setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyUpdatedBy setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyUpdatedBy setExpiresAt(String expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }
        public String getExpiresAt() {
            return this.expiresAt;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyUpdatedBy setExternUid(String externUid) {
            this.externUid = externUid;
            return this;
        }
        public String getExternUid() {
            return this.externUid;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyUpdatedBy setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyUpdatedBy setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyUpdatedBy setNotificationLevel(Long notificationLevel) {
            this.notificationLevel = notificationLevel;
            return this;
        }
        public Long getNotificationLevel() {
            return this.notificationLevel;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyUpdatedBy setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyUpdatedBy setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyUpdatedBy setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public QueryLinkeantcodeAntcodeMergeprojectpullrequestResponseBodyUpdatedBy setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

    }

}
