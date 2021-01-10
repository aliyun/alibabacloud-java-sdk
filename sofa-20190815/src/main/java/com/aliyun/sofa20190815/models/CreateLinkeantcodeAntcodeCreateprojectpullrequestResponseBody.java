// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBody extends TeaModel {
    @NameInMap("Mergeable")
    public Boolean mergeable;

    @NameInMap("Action")
    public String action;

    @NameInMap("Description")
    public String description;

    @NameInMap("ShouldBeRebased")
    public Boolean shouldBeRebased;

    @NameInMap("Issues")
    public java.util.List<CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyIssues> issues;

    @NameInMap("CreatedAt")
    public String createdAt;

    @NameInMap("MergeError")
    public String mergeError;

    @NameInMap("SourceProjectId")
    public Long sourceProjectId;

    @NameInMap("Review")
    public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyReview review;

    @NameInMap("MergeCommitMessage")
    public String mergeCommitMessage;

    @NameInMap("Url")
    public String url;

    @NameInMap("Source")
    public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodySource source;

    @NameInMap("UpdatedBy")
    public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyUpdatedBy updatedBy;

    @NameInMap("Target")
    public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyTarget target;

    @NameInMap("LastCommit")
    public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyLastCommit lastCommit;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("AutoMerge")
    public Boolean autoMerge;

    @NameInMap("TargetProjectId")
    public Long targetProjectId;

    @NameInMap("TargetBranch")
    public String targetBranch;

    @NameInMap("Reviewed")
    public Boolean reviewed;

    @NameInMap("ShouldRemoveSourceBranch")
    public Boolean shouldRemoveSourceBranch;

    @NameInMap("Assignee")
    public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyAssignee assignee;

    @NameInMap("SquashMerge")
    public Boolean squashMerge;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Iid")
    public Long iid;

    @NameInMap("FfOnlyEnabled")
    public Boolean ffOnlyEnabled;

    @NameInMap("WebUrl")
    public String webUrl;

    @NameInMap("Title")
    public String title;

    @NameInMap("WorkInProgress")
    public Boolean workInProgress;

    @NameInMap("Labels")
    public java.util.List<String> labels;

    @NameInMap("MergeCommitSha")
    public String mergeCommitSha;

    @NameInMap("MergedAt")
    public String mergedAt;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("UpdatedAt")
    public String updatedAt;

    @NameInMap("MergedBy")
    public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyMergedBy mergedBy;

    @NameInMap("ReviewAction")
    public String reviewAction;

    @NameInMap("ActiveTime")
    public String activeTime;

    @NameInMap("State")
    public String state;

    @NameInMap("SourceBranch")
    public String sourceBranch;

    @NameInMap("MergeStatus")
    public String mergeStatus;

    @NameInMap("Author")
    public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyAuthor author;

    @NameInMap("Id")
    public Long id;

    @NameInMap("CompareId")
    public Long compareId;

    @NameInMap("ResultCode")
    public String resultCode;

    public static CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBody self = new CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBody setMergeable(Boolean mergeable) {
        this.mergeable = mergeable;
        return this;
    }
    public Boolean getMergeable() {
        return this.mergeable;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBody setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBody setShouldBeRebased(Boolean shouldBeRebased) {
        this.shouldBeRebased = shouldBeRebased;
        return this;
    }
    public Boolean getShouldBeRebased() {
        return this.shouldBeRebased;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBody setIssues(java.util.List<CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyIssues> issues) {
        this.issues = issues;
        return this;
    }
    public java.util.List<CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyIssues> getIssues() {
        return this.issues;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBody setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBody setMergeError(String mergeError) {
        this.mergeError = mergeError;
        return this;
    }
    public String getMergeError() {
        return this.mergeError;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBody setSourceProjectId(Long sourceProjectId) {
        this.sourceProjectId = sourceProjectId;
        return this;
    }
    public Long getSourceProjectId() {
        return this.sourceProjectId;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBody setReview(CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyReview review) {
        this.review = review;
        return this;
    }
    public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyReview getReview() {
        return this.review;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBody setMergeCommitMessage(String mergeCommitMessage) {
        this.mergeCommitMessage = mergeCommitMessage;
        return this;
    }
    public String getMergeCommitMessage() {
        return this.mergeCommitMessage;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBody setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBody setSource(CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodySource source) {
        this.source = source;
        return this;
    }
    public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodySource getSource() {
        return this.source;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBody setUpdatedBy(CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyUpdatedBy updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }
    public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyUpdatedBy getUpdatedBy() {
        return this.updatedBy;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBody setTarget(CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyTarget target) {
        this.target = target;
        return this;
    }
    public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyTarget getTarget() {
        return this.target;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBody setLastCommit(CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyLastCommit lastCommit) {
        this.lastCommit = lastCommit;
        return this;
    }
    public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyLastCommit getLastCommit() {
        return this.lastCommit;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBody setAutoMerge(Boolean autoMerge) {
        this.autoMerge = autoMerge;
        return this;
    }
    public Boolean getAutoMerge() {
        return this.autoMerge;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBody setTargetProjectId(Long targetProjectId) {
        this.targetProjectId = targetProjectId;
        return this;
    }
    public Long getTargetProjectId() {
        return this.targetProjectId;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBody setTargetBranch(String targetBranch) {
        this.targetBranch = targetBranch;
        return this;
    }
    public String getTargetBranch() {
        return this.targetBranch;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBody setReviewed(Boolean reviewed) {
        this.reviewed = reviewed;
        return this;
    }
    public Boolean getReviewed() {
        return this.reviewed;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBody setShouldRemoveSourceBranch(Boolean shouldRemoveSourceBranch) {
        this.shouldRemoveSourceBranch = shouldRemoveSourceBranch;
        return this;
    }
    public Boolean getShouldRemoveSourceBranch() {
        return this.shouldRemoveSourceBranch;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBody setAssignee(CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyAssignee assignee) {
        this.assignee = assignee;
        return this;
    }
    public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyAssignee getAssignee() {
        return this.assignee;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBody setSquashMerge(Boolean squashMerge) {
        this.squashMerge = squashMerge;
        return this;
    }
    public Boolean getSquashMerge() {
        return this.squashMerge;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBody setIid(Long iid) {
        this.iid = iid;
        return this;
    }
    public Long getIid() {
        return this.iid;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBody setFfOnlyEnabled(Boolean ffOnlyEnabled) {
        this.ffOnlyEnabled = ffOnlyEnabled;
        return this;
    }
    public Boolean getFfOnlyEnabled() {
        return this.ffOnlyEnabled;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBody setWebUrl(String webUrl) {
        this.webUrl = webUrl;
        return this;
    }
    public String getWebUrl() {
        return this.webUrl;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBody setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBody setWorkInProgress(Boolean workInProgress) {
        this.workInProgress = workInProgress;
        return this;
    }
    public Boolean getWorkInProgress() {
        return this.workInProgress;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBody setLabels(java.util.List<String> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<String> getLabels() {
        return this.labels;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBody setMergeCommitSha(String mergeCommitSha) {
        this.mergeCommitSha = mergeCommitSha;
        return this;
    }
    public String getMergeCommitSha() {
        return this.mergeCommitSha;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBody setMergedAt(String mergedAt) {
        this.mergedAt = mergedAt;
        return this;
    }
    public String getMergedAt() {
        return this.mergedAt;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBody setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBody setMergedBy(CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyMergedBy mergedBy) {
        this.mergedBy = mergedBy;
        return this;
    }
    public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyMergedBy getMergedBy() {
        return this.mergedBy;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBody setReviewAction(String reviewAction) {
        this.reviewAction = reviewAction;
        return this;
    }
    public String getReviewAction() {
        return this.reviewAction;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBody setActiveTime(String activeTime) {
        this.activeTime = activeTime;
        return this;
    }
    public String getActiveTime() {
        return this.activeTime;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBody setSourceBranch(String sourceBranch) {
        this.sourceBranch = sourceBranch;
        return this;
    }
    public String getSourceBranch() {
        return this.sourceBranch;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBody setMergeStatus(String mergeStatus) {
        this.mergeStatus = mergeStatus;
        return this;
    }
    public String getMergeStatus() {
        return this.mergeStatus;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBody setAuthor(CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyAuthor author) {
        this.author = author;
        return this;
    }
    public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyAuthor getAuthor() {
        return this.author;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBody setCompareId(Long compareId) {
        this.compareId = compareId;
        return this;
    }
    public Long getCompareId() {
        return this.compareId;
    }

    public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyIssues extends TeaModel {
        @NameInMap("PullRequestId")
        public Long pullRequestId;

        @NameInMap("IssueUrl")
        public String issueUrl;

        @NameInMap("IssueId")
        public String issueId;

        @NameInMap("IssueProvider")
        public String issueProvider;

        @NameInMap("IssueSite")
        public String issueSite;

        @NameInMap("IssueTitle")
        public String issueTitle;

        @NameInMap("Id")
        public Long id;

        @NameInMap("IssueType")
        public String issueType;

        public static CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyIssues build(java.util.Map<String, ?> map) throws Exception {
            CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyIssues self = new CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyIssues();
            return TeaModel.build(map, self);
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyIssues setPullRequestId(Long pullRequestId) {
            this.pullRequestId = pullRequestId;
            return this;
        }
        public Long getPullRequestId() {
            return this.pullRequestId;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyIssues setIssueUrl(String issueUrl) {
            this.issueUrl = issueUrl;
            return this;
        }
        public String getIssueUrl() {
            return this.issueUrl;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyIssues setIssueId(String issueId) {
            this.issueId = issueId;
            return this;
        }
        public String getIssueId() {
            return this.issueId;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyIssues setIssueProvider(String issueProvider) {
            this.issueProvider = issueProvider;
            return this;
        }
        public String getIssueProvider() {
            return this.issueProvider;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyIssues setIssueSite(String issueSite) {
            this.issueSite = issueSite;
            return this;
        }
        public String getIssueSite() {
            return this.issueSite;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyIssues setIssueTitle(String issueTitle) {
            this.issueTitle = issueTitle;
            return this;
        }
        public String getIssueTitle() {
            return this.issueTitle;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyIssues setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyIssues setIssueType(String issueType) {
            this.issueType = issueType;
            return this;
        }
        public String getIssueType() {
            return this.issueType;
        }

    }

    public static class CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyReview extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("TargetProject")
        public String targetProject;

        @NameInMap("State")
        public String state;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("Author")
        public String author;

        @NameInMap("SourceBranch")
        public String sourceBranch;

        @NameInMap("StateDetail")
        public String stateDetail;

        @NameInMap("Tasks")
        public java.util.List<String> tasks;

        @NameInMap("Rule")
        public String rule;

        @NameInMap("Description")
        public String description;

        @NameInMap("RulesType")
        public String rulesType;

        @NameInMap("TargetBranch")
        public String targetBranch;

        @NameInMap("SourceProject")
        public String sourceProject;

        @NameInMap("ThresholdClear")
        public Boolean thresholdClear;

        @NameInMap("UpdatedAt")
        public String updatedAt;

        @NameInMap("Title")
        public String title;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Iid")
        public Long iid;

        @NameInMap("Reviewers")
        public java.util.List<String> reviewers;

        public static CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyReview build(java.util.Map<String, ?> map) throws Exception {
            CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyReview self = new CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyReview();
            return TeaModel.build(map, self);
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyReview setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyReview setTargetProject(String targetProject) {
            this.targetProject = targetProject;
            return this;
        }
        public String getTargetProject() {
            return this.targetProject;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyReview setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyReview setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyReview setAuthor(String author) {
            this.author = author;
            return this;
        }
        public String getAuthor() {
            return this.author;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyReview setSourceBranch(String sourceBranch) {
            this.sourceBranch = sourceBranch;
            return this;
        }
        public String getSourceBranch() {
            return this.sourceBranch;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyReview setStateDetail(String stateDetail) {
            this.stateDetail = stateDetail;
            return this;
        }
        public String getStateDetail() {
            return this.stateDetail;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyReview setTasks(java.util.List<String> tasks) {
            this.tasks = tasks;
            return this;
        }
        public java.util.List<String> getTasks() {
            return this.tasks;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyReview setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyReview setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyReview setRulesType(String rulesType) {
            this.rulesType = rulesType;
            return this;
        }
        public String getRulesType() {
            return this.rulesType;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyReview setTargetBranch(String targetBranch) {
            this.targetBranch = targetBranch;
            return this;
        }
        public String getTargetBranch() {
            return this.targetBranch;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyReview setSourceProject(String sourceProject) {
            this.sourceProject = sourceProject;
            return this;
        }
        public String getSourceProject() {
            return this.sourceProject;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyReview setThresholdClear(Boolean thresholdClear) {
            this.thresholdClear = thresholdClear;
            return this;
        }
        public Boolean getThresholdClear() {
            return this.thresholdClear;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyReview setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyReview setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyReview setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyReview setIid(Long iid) {
            this.iid = iid;
            return this;
        }
        public Long getIid() {
            return this.iid;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyReview setReviewers(java.util.List<String> reviewers) {
            this.reviewers = reviewers;
            return this;
        }
        public java.util.List<String> getReviewers() {
            return this.reviewers;
        }

    }

    public static class CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodySource extends TeaModel {
        @NameInMap("WebUrl")
        public String webUrl;

        @NameInMap("NameWithNamespace")
        public String nameWithNamespace;

        @NameInMap("PathWithNamespace")
        public String pathWithNamespace;

        @NameInMap("VisibilityLevel")
        public Long visibilityLevel;

        @NameInMap("Path")
        public String path;

        @NameInMap("HttpUrl")
        public String httpUrl;

        @NameInMap("SshUrl")
        public String sshUrl;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public Long id;

        public static CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodySource build(java.util.Map<String, ?> map) throws Exception {
            CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodySource self = new CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodySource();
            return TeaModel.build(map, self);
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodySource setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodySource setNameWithNamespace(String nameWithNamespace) {
            this.nameWithNamespace = nameWithNamespace;
            return this;
        }
        public String getNameWithNamespace() {
            return this.nameWithNamespace;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodySource setPathWithNamespace(String pathWithNamespace) {
            this.pathWithNamespace = pathWithNamespace;
            return this;
        }
        public String getPathWithNamespace() {
            return this.pathWithNamespace;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodySource setVisibilityLevel(Long visibilityLevel) {
            this.visibilityLevel = visibilityLevel;
            return this;
        }
        public Long getVisibilityLevel() {
            return this.visibilityLevel;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodySource setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodySource setHttpUrl(String httpUrl) {
            this.httpUrl = httpUrl;
            return this;
        }
        public String getHttpUrl() {
            return this.httpUrl;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodySource setSshUrl(String sshUrl) {
            this.sshUrl = sshUrl;
            return this;
        }
        public String getSshUrl() {
            return this.sshUrl;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodySource setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodySource setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyUpdatedBy extends TeaModel {
        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("CurrentSignInAt")
        public String currentSignInAt;

        @NameInMap("WebUrl")
        public String webUrl;

        @NameInMap("Name")
        public String name;

        @NameInMap("Department")
        public String department;

        @NameInMap("AvatarUrl")
        public String avatarUrl;

        @NameInMap("ExternUid")
        public String externUid;

        @NameInMap("State")
        public String state;

        @NameInMap("ThemeId")
        public Long themeId;

        @NameInMap("Bio")
        public String bio;

        @NameInMap("CanCreateProject")
        public Boolean canCreateProject;

        @NameInMap("IsAdmin")
        public Boolean isAdmin;

        @NameInMap("CanCreateGroup")
        public Boolean canCreateGroup;

        @NameInMap("ExpiresAt")
        public String expiresAt;

        @NameInMap("ProjectsLimit")
        public Long projectsLimit;

        @NameInMap("Email")
        public String email;

        @NameInMap("WebsiteUrl")
        public String websiteUrl;

        @NameInMap("Identities")
        public java.util.List<String> identities;

        @NameInMap("AccessLevel")
        public Long accessLevel;

        @NameInMap("UpdatedAt")
        public String updatedAt;

        @NameInMap("Role")
        public Long role;

        @NameInMap("PrivateToken")
        public String privateToken;

        @NameInMap("Registered")
        public Boolean registered;

        @NameInMap("ColorSchemeId")
        public Long colorSchemeId;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Username")
        public String username;

        public static CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyUpdatedBy build(java.util.Map<String, ?> map) throws Exception {
            CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyUpdatedBy self = new CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyUpdatedBy();
            return TeaModel.build(map, self);
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyUpdatedBy setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyUpdatedBy setCurrentSignInAt(String currentSignInAt) {
            this.currentSignInAt = currentSignInAt;
            return this;
        }
        public String getCurrentSignInAt() {
            return this.currentSignInAt;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyUpdatedBy setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyUpdatedBy setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyUpdatedBy setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyUpdatedBy setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyUpdatedBy setExternUid(String externUid) {
            this.externUid = externUid;
            return this;
        }
        public String getExternUid() {
            return this.externUid;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyUpdatedBy setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyUpdatedBy setThemeId(Long themeId) {
            this.themeId = themeId;
            return this;
        }
        public Long getThemeId() {
            return this.themeId;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyUpdatedBy setBio(String bio) {
            this.bio = bio;
            return this;
        }
        public String getBio() {
            return this.bio;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyUpdatedBy setCanCreateProject(Boolean canCreateProject) {
            this.canCreateProject = canCreateProject;
            return this;
        }
        public Boolean getCanCreateProject() {
            return this.canCreateProject;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyUpdatedBy setIsAdmin(Boolean isAdmin) {
            this.isAdmin = isAdmin;
            return this;
        }
        public Boolean getIsAdmin() {
            return this.isAdmin;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyUpdatedBy setCanCreateGroup(Boolean canCreateGroup) {
            this.canCreateGroup = canCreateGroup;
            return this;
        }
        public Boolean getCanCreateGroup() {
            return this.canCreateGroup;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyUpdatedBy setExpiresAt(String expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }
        public String getExpiresAt() {
            return this.expiresAt;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyUpdatedBy setProjectsLimit(Long projectsLimit) {
            this.projectsLimit = projectsLimit;
            return this;
        }
        public Long getProjectsLimit() {
            return this.projectsLimit;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyUpdatedBy setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyUpdatedBy setWebsiteUrl(String websiteUrl) {
            this.websiteUrl = websiteUrl;
            return this;
        }
        public String getWebsiteUrl() {
            return this.websiteUrl;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyUpdatedBy setIdentities(java.util.List<String> identities) {
            this.identities = identities;
            return this;
        }
        public java.util.List<String> getIdentities() {
            return this.identities;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyUpdatedBy setAccessLevel(Long accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }
        public Long getAccessLevel() {
            return this.accessLevel;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyUpdatedBy setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyUpdatedBy setRole(Long role) {
            this.role = role;
            return this;
        }
        public Long getRole() {
            return this.role;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyUpdatedBy setPrivateToken(String privateToken) {
            this.privateToken = privateToken;
            return this;
        }
        public String getPrivateToken() {
            return this.privateToken;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyUpdatedBy setRegistered(Boolean registered) {
            this.registered = registered;
            return this;
        }
        public Boolean getRegistered() {
            return this.registered;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyUpdatedBy setColorSchemeId(Long colorSchemeId) {
            this.colorSchemeId = colorSchemeId;
            return this;
        }
        public Long getColorSchemeId() {
            return this.colorSchemeId;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyUpdatedBy setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyUpdatedBy setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyTarget extends TeaModel {
        @NameInMap("WebUrl")
        public String webUrl;

        @NameInMap("NameWithNamespace")
        public String nameWithNamespace;

        @NameInMap("PathWithNamespace")
        public String pathWithNamespace;

        @NameInMap("VisibilityLevel")
        public Long visibilityLevel;

        @NameInMap("Path")
        public String path;

        @NameInMap("HttpUrl")
        public String httpUrl;

        @NameInMap("SshUrl")
        public String sshUrl;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public Long id;

        public static CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyTarget build(java.util.Map<String, ?> map) throws Exception {
            CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyTarget self = new CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyTarget();
            return TeaModel.build(map, self);
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyTarget setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyTarget setNameWithNamespace(String nameWithNamespace) {
            this.nameWithNamespace = nameWithNamespace;
            return this;
        }
        public String getNameWithNamespace() {
            return this.nameWithNamespace;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyTarget setPathWithNamespace(String pathWithNamespace) {
            this.pathWithNamespace = pathWithNamespace;
            return this;
        }
        public String getPathWithNamespace() {
            return this.pathWithNamespace;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyTarget setVisibilityLevel(Long visibilityLevel) {
            this.visibilityLevel = visibilityLevel;
            return this;
        }
        public Long getVisibilityLevel() {
            return this.visibilityLevel;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyTarget setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyTarget setHttpUrl(String httpUrl) {
            this.httpUrl = httpUrl;
            return this;
        }
        public String getHttpUrl() {
            return this.httpUrl;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyTarget setSshUrl(String sshUrl) {
            this.sshUrl = sshUrl;
            return this;
        }
        public String getSshUrl() {
            return this.sshUrl;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyTarget setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyTarget setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyLastCommit extends TeaModel {
        @NameInMap("Url")
        public String url;

        @NameInMap("Message")
        public String message;

        @NameInMap("Author")
        public String author;

        @NameInMap("Timestamp")
        public String timestamp;

        @NameInMap("Id")
        public String id;

        public static CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyLastCommit build(java.util.Map<String, ?> map) throws Exception {
            CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyLastCommit self = new CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyLastCommit();
            return TeaModel.build(map, self);
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyLastCommit setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyLastCommit setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyLastCommit setAuthor(String author) {
            this.author = author;
            return this;
        }
        public String getAuthor() {
            return this.author;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyLastCommit setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyLastCommit setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyAssignee extends TeaModel {
        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("CurrentSignInAt")
        public String currentSignInAt;

        @NameInMap("WebUrl")
        public String webUrl;

        @NameInMap("Name")
        public String name;

        @NameInMap("Department")
        public String department;

        @NameInMap("AvatarUrl")
        public String avatarUrl;

        @NameInMap("ExternUid")
        public String externUid;

        @NameInMap("State")
        public String state;

        @NameInMap("ThemeId")
        public Long themeId;

        @NameInMap("Bio")
        public String bio;

        @NameInMap("CanCreateProject")
        public Boolean canCreateProject;

        @NameInMap("IsAdmin")
        public Boolean isAdmin;

        @NameInMap("CanCreateGroup")
        public Boolean canCreateGroup;

        @NameInMap("ExpiresAt")
        public String expiresAt;

        @NameInMap("ProjectsLimit")
        public Long projectsLimit;

        @NameInMap("Email")
        public String email;

        @NameInMap("WebsiteUrl")
        public String websiteUrl;

        @NameInMap("Identities")
        public java.util.List<String> identities;

        @NameInMap("AccessLevel")
        public Long accessLevel;

        @NameInMap("UpdatedAt")
        public String updatedAt;

        @NameInMap("Role")
        public Long role;

        @NameInMap("PrivateToken")
        public String privateToken;

        @NameInMap("Registered")
        public Boolean registered;

        @NameInMap("ColorSchemeId")
        public Long colorSchemeId;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Username")
        public String username;

        public static CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyAssignee build(java.util.Map<String, ?> map) throws Exception {
            CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyAssignee self = new CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyAssignee();
            return TeaModel.build(map, self);
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyAssignee setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyAssignee setCurrentSignInAt(String currentSignInAt) {
            this.currentSignInAt = currentSignInAt;
            return this;
        }
        public String getCurrentSignInAt() {
            return this.currentSignInAt;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyAssignee setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyAssignee setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyAssignee setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyAssignee setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyAssignee setExternUid(String externUid) {
            this.externUid = externUid;
            return this;
        }
        public String getExternUid() {
            return this.externUid;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyAssignee setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyAssignee setThemeId(Long themeId) {
            this.themeId = themeId;
            return this;
        }
        public Long getThemeId() {
            return this.themeId;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyAssignee setBio(String bio) {
            this.bio = bio;
            return this;
        }
        public String getBio() {
            return this.bio;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyAssignee setCanCreateProject(Boolean canCreateProject) {
            this.canCreateProject = canCreateProject;
            return this;
        }
        public Boolean getCanCreateProject() {
            return this.canCreateProject;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyAssignee setIsAdmin(Boolean isAdmin) {
            this.isAdmin = isAdmin;
            return this;
        }
        public Boolean getIsAdmin() {
            return this.isAdmin;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyAssignee setCanCreateGroup(Boolean canCreateGroup) {
            this.canCreateGroup = canCreateGroup;
            return this;
        }
        public Boolean getCanCreateGroup() {
            return this.canCreateGroup;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyAssignee setExpiresAt(String expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }
        public String getExpiresAt() {
            return this.expiresAt;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyAssignee setProjectsLimit(Long projectsLimit) {
            this.projectsLimit = projectsLimit;
            return this;
        }
        public Long getProjectsLimit() {
            return this.projectsLimit;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyAssignee setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyAssignee setWebsiteUrl(String websiteUrl) {
            this.websiteUrl = websiteUrl;
            return this;
        }
        public String getWebsiteUrl() {
            return this.websiteUrl;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyAssignee setIdentities(java.util.List<String> identities) {
            this.identities = identities;
            return this;
        }
        public java.util.List<String> getIdentities() {
            return this.identities;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyAssignee setAccessLevel(Long accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }
        public Long getAccessLevel() {
            return this.accessLevel;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyAssignee setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyAssignee setRole(Long role) {
            this.role = role;
            return this;
        }
        public Long getRole() {
            return this.role;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyAssignee setPrivateToken(String privateToken) {
            this.privateToken = privateToken;
            return this;
        }
        public String getPrivateToken() {
            return this.privateToken;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyAssignee setRegistered(Boolean registered) {
            this.registered = registered;
            return this;
        }
        public Boolean getRegistered() {
            return this.registered;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyAssignee setColorSchemeId(Long colorSchemeId) {
            this.colorSchemeId = colorSchemeId;
            return this;
        }
        public Long getColorSchemeId() {
            return this.colorSchemeId;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyAssignee setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyAssignee setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyMergedBy extends TeaModel {
        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("CurrentSignInAt")
        public String currentSignInAt;

        @NameInMap("WebUrl")
        public String webUrl;

        @NameInMap("Name")
        public String name;

        @NameInMap("Department")
        public String department;

        @NameInMap("AvatarUrl")
        public String avatarUrl;

        @NameInMap("ExternUid")
        public String externUid;

        @NameInMap("State")
        public String state;

        @NameInMap("ThemeId")
        public Long themeId;

        @NameInMap("Bio")
        public String bio;

        @NameInMap("CanCreateProject")
        public Boolean canCreateProject;

        @NameInMap("IsAdmin")
        public Boolean isAdmin;

        @NameInMap("CanCreateGroup")
        public Boolean canCreateGroup;

        @NameInMap("ExpiresAt")
        public String expiresAt;

        @NameInMap("ProjectsLimit")
        public Long projectsLimit;

        @NameInMap("Email")
        public String email;

        @NameInMap("WebsiteUrl")
        public String websiteUrl;

        @NameInMap("Identities")
        public java.util.List<String> identities;

        @NameInMap("AccessLevel")
        public Long accessLevel;

        @NameInMap("UpdatedAt")
        public String updatedAt;

        @NameInMap("Role")
        public Long role;

        @NameInMap("PrivateToken")
        public String privateToken;

        @NameInMap("Registered")
        public Boolean registered;

        @NameInMap("ColorSchemeId")
        public Long colorSchemeId;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Username")
        public String username;

        public static CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyMergedBy build(java.util.Map<String, ?> map) throws Exception {
            CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyMergedBy self = new CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyMergedBy();
            return TeaModel.build(map, self);
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyMergedBy setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyMergedBy setCurrentSignInAt(String currentSignInAt) {
            this.currentSignInAt = currentSignInAt;
            return this;
        }
        public String getCurrentSignInAt() {
            return this.currentSignInAt;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyMergedBy setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyMergedBy setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyMergedBy setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyMergedBy setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyMergedBy setExternUid(String externUid) {
            this.externUid = externUid;
            return this;
        }
        public String getExternUid() {
            return this.externUid;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyMergedBy setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyMergedBy setThemeId(Long themeId) {
            this.themeId = themeId;
            return this;
        }
        public Long getThemeId() {
            return this.themeId;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyMergedBy setBio(String bio) {
            this.bio = bio;
            return this;
        }
        public String getBio() {
            return this.bio;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyMergedBy setCanCreateProject(Boolean canCreateProject) {
            this.canCreateProject = canCreateProject;
            return this;
        }
        public Boolean getCanCreateProject() {
            return this.canCreateProject;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyMergedBy setIsAdmin(Boolean isAdmin) {
            this.isAdmin = isAdmin;
            return this;
        }
        public Boolean getIsAdmin() {
            return this.isAdmin;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyMergedBy setCanCreateGroup(Boolean canCreateGroup) {
            this.canCreateGroup = canCreateGroup;
            return this;
        }
        public Boolean getCanCreateGroup() {
            return this.canCreateGroup;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyMergedBy setExpiresAt(String expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }
        public String getExpiresAt() {
            return this.expiresAt;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyMergedBy setProjectsLimit(Long projectsLimit) {
            this.projectsLimit = projectsLimit;
            return this;
        }
        public Long getProjectsLimit() {
            return this.projectsLimit;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyMergedBy setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyMergedBy setWebsiteUrl(String websiteUrl) {
            this.websiteUrl = websiteUrl;
            return this;
        }
        public String getWebsiteUrl() {
            return this.websiteUrl;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyMergedBy setIdentities(java.util.List<String> identities) {
            this.identities = identities;
            return this;
        }
        public java.util.List<String> getIdentities() {
            return this.identities;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyMergedBy setAccessLevel(Long accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }
        public Long getAccessLevel() {
            return this.accessLevel;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyMergedBy setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyMergedBy setRole(Long role) {
            this.role = role;
            return this;
        }
        public Long getRole() {
            return this.role;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyMergedBy setPrivateToken(String privateToken) {
            this.privateToken = privateToken;
            return this;
        }
        public String getPrivateToken() {
            return this.privateToken;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyMergedBy setRegistered(Boolean registered) {
            this.registered = registered;
            return this;
        }
        public Boolean getRegistered() {
            return this.registered;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyMergedBy setColorSchemeId(Long colorSchemeId) {
            this.colorSchemeId = colorSchemeId;
            return this;
        }
        public Long getColorSchemeId() {
            return this.colorSchemeId;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyMergedBy setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyMergedBy setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyAuthor extends TeaModel {
        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("CurrentSignInAt")
        public String currentSignInAt;

        @NameInMap("WebUrl")
        public String webUrl;

        @NameInMap("Name")
        public String name;

        @NameInMap("Department")
        public String department;

        @NameInMap("AvatarUrl")
        public String avatarUrl;

        @NameInMap("ExternUid")
        public String externUid;

        @NameInMap("State")
        public String state;

        @NameInMap("ThemeId")
        public Long themeId;

        @NameInMap("Bio")
        public String bio;

        @NameInMap("CanCreateProject")
        public Boolean canCreateProject;

        @NameInMap("IsAdmin")
        public Boolean isAdmin;

        @NameInMap("CanCreateGroup")
        public Boolean canCreateGroup;

        @NameInMap("ExpiresAt")
        public String expiresAt;

        @NameInMap("ProjectsLimit")
        public Long projectsLimit;

        @NameInMap("Email")
        public String email;

        @NameInMap("WebsiteUrl")
        public String websiteUrl;

        @NameInMap("Identities")
        public java.util.List<String> identities;

        @NameInMap("AccessLevel")
        public Long accessLevel;

        @NameInMap("UpdatedAt")
        public String updatedAt;

        @NameInMap("Role")
        public Long role;

        @NameInMap("PrivateToken")
        public String privateToken;

        @NameInMap("Registered")
        public Boolean registered;

        @NameInMap("ColorSchemeId")
        public Long colorSchemeId;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Username")
        public String username;

        public static CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyAuthor build(java.util.Map<String, ?> map) throws Exception {
            CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyAuthor self = new CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyAuthor();
            return TeaModel.build(map, self);
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyAuthor setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyAuthor setCurrentSignInAt(String currentSignInAt) {
            this.currentSignInAt = currentSignInAt;
            return this;
        }
        public String getCurrentSignInAt() {
            return this.currentSignInAt;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyAuthor setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyAuthor setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyAuthor setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyAuthor setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyAuthor setExternUid(String externUid) {
            this.externUid = externUid;
            return this;
        }
        public String getExternUid() {
            return this.externUid;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyAuthor setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyAuthor setThemeId(Long themeId) {
            this.themeId = themeId;
            return this;
        }
        public Long getThemeId() {
            return this.themeId;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyAuthor setBio(String bio) {
            this.bio = bio;
            return this;
        }
        public String getBio() {
            return this.bio;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyAuthor setCanCreateProject(Boolean canCreateProject) {
            this.canCreateProject = canCreateProject;
            return this;
        }
        public Boolean getCanCreateProject() {
            return this.canCreateProject;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyAuthor setIsAdmin(Boolean isAdmin) {
            this.isAdmin = isAdmin;
            return this;
        }
        public Boolean getIsAdmin() {
            return this.isAdmin;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyAuthor setCanCreateGroup(Boolean canCreateGroup) {
            this.canCreateGroup = canCreateGroup;
            return this;
        }
        public Boolean getCanCreateGroup() {
            return this.canCreateGroup;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyAuthor setExpiresAt(String expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }
        public String getExpiresAt() {
            return this.expiresAt;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyAuthor setProjectsLimit(Long projectsLimit) {
            this.projectsLimit = projectsLimit;
            return this;
        }
        public Long getProjectsLimit() {
            return this.projectsLimit;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyAuthor setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyAuthor setWebsiteUrl(String websiteUrl) {
            this.websiteUrl = websiteUrl;
            return this;
        }
        public String getWebsiteUrl() {
            return this.websiteUrl;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyAuthor setIdentities(java.util.List<String> identities) {
            this.identities = identities;
            return this;
        }
        public java.util.List<String> getIdentities() {
            return this.identities;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyAuthor setAccessLevel(Long accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }
        public Long getAccessLevel() {
            return this.accessLevel;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyAuthor setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyAuthor setRole(Long role) {
            this.role = role;
            return this;
        }
        public Long getRole() {
            return this.role;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyAuthor setPrivateToken(String privateToken) {
            this.privateToken = privateToken;
            return this;
        }
        public String getPrivateToken() {
            return this.privateToken;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyAuthor setRegistered(Boolean registered) {
            this.registered = registered;
            return this;
        }
        public Boolean getRegistered() {
            return this.registered;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyAuthor setColorSchemeId(Long colorSchemeId) {
            this.colorSchemeId = colorSchemeId;
            return this;
        }
        public Long getColorSchemeId() {
            return this.colorSchemeId;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyAuthor setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CreateLinkeantcodeAntcodeCreateprojectpullrequestResponseBodyAuthor setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

}
