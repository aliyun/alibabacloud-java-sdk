// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeantcodeAntcodeRebasepullrequestResponseBody extends TeaModel {
    @NameInMap("Mergeable")
    public Boolean mergeable;

    @NameInMap("Action")
    public String action;

    @NameInMap("Description")
    public String description;

    @NameInMap("ShouldBeRebased")
    public Boolean shouldBeRebased;

    @NameInMap("Issues")
    public java.util.List<ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyIssues> issues;

    @NameInMap("CreatedAt")
    public String createdAt;

    @NameInMap("MergeError")
    public String mergeError;

    @NameInMap("SourceProjectId")
    public Long sourceProjectId;

    @NameInMap("Review")
    public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyReview review;

    @NameInMap("MergeCommitMessage")
    public String mergeCommitMessage;

    @NameInMap("Url")
    public String url;

    @NameInMap("Source")
    public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodySource source;

    @NameInMap("UpdatedBy")
    public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyUpdatedBy updatedBy;

    @NameInMap("Target")
    public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyTarget target;

    @NameInMap("LastCommit")
    public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyLastCommit lastCommit;

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
    public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyAssignee assignee;

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
    public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyMergedBy mergedBy;

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
    public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyAuthor author;

    @NameInMap("Id")
    public Long id;

    @NameInMap("CompareId")
    public Long compareId;

    @NameInMap("ResultCode")
    public String resultCode;

    public static ExecLinkeantcodeAntcodeRebasepullrequestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeantcodeAntcodeRebasepullrequestResponseBody self = new ExecLinkeantcodeAntcodeRebasepullrequestResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecLinkeantcodeAntcodeRebasepullrequestResponseBody setMergeable(Boolean mergeable) {
        this.mergeable = mergeable;
        return this;
    }
    public Boolean getMergeable() {
        return this.mergeable;
    }

    public ExecLinkeantcodeAntcodeRebasepullrequestResponseBody setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public ExecLinkeantcodeAntcodeRebasepullrequestResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ExecLinkeantcodeAntcodeRebasepullrequestResponseBody setShouldBeRebased(Boolean shouldBeRebased) {
        this.shouldBeRebased = shouldBeRebased;
        return this;
    }
    public Boolean getShouldBeRebased() {
        return this.shouldBeRebased;
    }

    public ExecLinkeantcodeAntcodeRebasepullrequestResponseBody setIssues(java.util.List<ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyIssues> issues) {
        this.issues = issues;
        return this;
    }
    public java.util.List<ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyIssues> getIssues() {
        return this.issues;
    }

    public ExecLinkeantcodeAntcodeRebasepullrequestResponseBody setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public ExecLinkeantcodeAntcodeRebasepullrequestResponseBody setMergeError(String mergeError) {
        this.mergeError = mergeError;
        return this;
    }
    public String getMergeError() {
        return this.mergeError;
    }

    public ExecLinkeantcodeAntcodeRebasepullrequestResponseBody setSourceProjectId(Long sourceProjectId) {
        this.sourceProjectId = sourceProjectId;
        return this;
    }
    public Long getSourceProjectId() {
        return this.sourceProjectId;
    }

    public ExecLinkeantcodeAntcodeRebasepullrequestResponseBody setReview(ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyReview review) {
        this.review = review;
        return this;
    }
    public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyReview getReview() {
        return this.review;
    }

    public ExecLinkeantcodeAntcodeRebasepullrequestResponseBody setMergeCommitMessage(String mergeCommitMessage) {
        this.mergeCommitMessage = mergeCommitMessage;
        return this;
    }
    public String getMergeCommitMessage() {
        return this.mergeCommitMessage;
    }

    public ExecLinkeantcodeAntcodeRebasepullrequestResponseBody setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public ExecLinkeantcodeAntcodeRebasepullrequestResponseBody setSource(ExecLinkeantcodeAntcodeRebasepullrequestResponseBodySource source) {
        this.source = source;
        return this;
    }
    public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodySource getSource() {
        return this.source;
    }

    public ExecLinkeantcodeAntcodeRebasepullrequestResponseBody setUpdatedBy(ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyUpdatedBy updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }
    public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyUpdatedBy getUpdatedBy() {
        return this.updatedBy;
    }

    public ExecLinkeantcodeAntcodeRebasepullrequestResponseBody setTarget(ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyTarget target) {
        this.target = target;
        return this;
    }
    public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyTarget getTarget() {
        return this.target;
    }

    public ExecLinkeantcodeAntcodeRebasepullrequestResponseBody setLastCommit(ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyLastCommit lastCommit) {
        this.lastCommit = lastCommit;
        return this;
    }
    public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyLastCommit getLastCommit() {
        return this.lastCommit;
    }

    public ExecLinkeantcodeAntcodeRebasepullrequestResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public ExecLinkeantcodeAntcodeRebasepullrequestResponseBody setAutoMerge(Boolean autoMerge) {
        this.autoMerge = autoMerge;
        return this;
    }
    public Boolean getAutoMerge() {
        return this.autoMerge;
    }

    public ExecLinkeantcodeAntcodeRebasepullrequestResponseBody setTargetProjectId(Long targetProjectId) {
        this.targetProjectId = targetProjectId;
        return this;
    }
    public Long getTargetProjectId() {
        return this.targetProjectId;
    }

    public ExecLinkeantcodeAntcodeRebasepullrequestResponseBody setTargetBranch(String targetBranch) {
        this.targetBranch = targetBranch;
        return this;
    }
    public String getTargetBranch() {
        return this.targetBranch;
    }

    public ExecLinkeantcodeAntcodeRebasepullrequestResponseBody setReviewed(Boolean reviewed) {
        this.reviewed = reviewed;
        return this;
    }
    public Boolean getReviewed() {
        return this.reviewed;
    }

    public ExecLinkeantcodeAntcodeRebasepullrequestResponseBody setShouldRemoveSourceBranch(Boolean shouldRemoveSourceBranch) {
        this.shouldRemoveSourceBranch = shouldRemoveSourceBranch;
        return this;
    }
    public Boolean getShouldRemoveSourceBranch() {
        return this.shouldRemoveSourceBranch;
    }

    public ExecLinkeantcodeAntcodeRebasepullrequestResponseBody setAssignee(ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyAssignee assignee) {
        this.assignee = assignee;
        return this;
    }
    public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyAssignee getAssignee() {
        return this.assignee;
    }

    public ExecLinkeantcodeAntcodeRebasepullrequestResponseBody setSquashMerge(Boolean squashMerge) {
        this.squashMerge = squashMerge;
        return this;
    }
    public Boolean getSquashMerge() {
        return this.squashMerge;
    }

    public ExecLinkeantcodeAntcodeRebasepullrequestResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecLinkeantcodeAntcodeRebasepullrequestResponseBody setIid(Long iid) {
        this.iid = iid;
        return this;
    }
    public Long getIid() {
        return this.iid;
    }

    public ExecLinkeantcodeAntcodeRebasepullrequestResponseBody setFfOnlyEnabled(Boolean ffOnlyEnabled) {
        this.ffOnlyEnabled = ffOnlyEnabled;
        return this;
    }
    public Boolean getFfOnlyEnabled() {
        return this.ffOnlyEnabled;
    }

    public ExecLinkeantcodeAntcodeRebasepullrequestResponseBody setWebUrl(String webUrl) {
        this.webUrl = webUrl;
        return this;
    }
    public String getWebUrl() {
        return this.webUrl;
    }

    public ExecLinkeantcodeAntcodeRebasepullrequestResponseBody setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public ExecLinkeantcodeAntcodeRebasepullrequestResponseBody setWorkInProgress(Boolean workInProgress) {
        this.workInProgress = workInProgress;
        return this;
    }
    public Boolean getWorkInProgress() {
        return this.workInProgress;
    }

    public ExecLinkeantcodeAntcodeRebasepullrequestResponseBody setLabels(java.util.List<String> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<String> getLabels() {
        return this.labels;
    }

    public ExecLinkeantcodeAntcodeRebasepullrequestResponseBody setMergeCommitSha(String mergeCommitSha) {
        this.mergeCommitSha = mergeCommitSha;
        return this;
    }
    public String getMergeCommitSha() {
        return this.mergeCommitSha;
    }

    public ExecLinkeantcodeAntcodeRebasepullrequestResponseBody setMergedAt(String mergedAt) {
        this.mergedAt = mergedAt;
        return this;
    }
    public String getMergedAt() {
        return this.mergedAt;
    }

    public ExecLinkeantcodeAntcodeRebasepullrequestResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ExecLinkeantcodeAntcodeRebasepullrequestResponseBody setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public ExecLinkeantcodeAntcodeRebasepullrequestResponseBody setMergedBy(ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyMergedBy mergedBy) {
        this.mergedBy = mergedBy;
        return this;
    }
    public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyMergedBy getMergedBy() {
        return this.mergedBy;
    }

    public ExecLinkeantcodeAntcodeRebasepullrequestResponseBody setReviewAction(String reviewAction) {
        this.reviewAction = reviewAction;
        return this;
    }
    public String getReviewAction() {
        return this.reviewAction;
    }

    public ExecLinkeantcodeAntcodeRebasepullrequestResponseBody setActiveTime(String activeTime) {
        this.activeTime = activeTime;
        return this;
    }
    public String getActiveTime() {
        return this.activeTime;
    }

    public ExecLinkeantcodeAntcodeRebasepullrequestResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public ExecLinkeantcodeAntcodeRebasepullrequestResponseBody setSourceBranch(String sourceBranch) {
        this.sourceBranch = sourceBranch;
        return this;
    }
    public String getSourceBranch() {
        return this.sourceBranch;
    }

    public ExecLinkeantcodeAntcodeRebasepullrequestResponseBody setMergeStatus(String mergeStatus) {
        this.mergeStatus = mergeStatus;
        return this;
    }
    public String getMergeStatus() {
        return this.mergeStatus;
    }

    public ExecLinkeantcodeAntcodeRebasepullrequestResponseBody setAuthor(ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyAuthor author) {
        this.author = author;
        return this;
    }
    public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyAuthor getAuthor() {
        return this.author;
    }

    public ExecLinkeantcodeAntcodeRebasepullrequestResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ExecLinkeantcodeAntcodeRebasepullrequestResponseBody setCompareId(Long compareId) {
        this.compareId = compareId;
        return this;
    }
    public Long getCompareId() {
        return this.compareId;
    }

    public ExecLinkeantcodeAntcodeRebasepullrequestResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyIssues extends TeaModel {
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

        public static ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyIssues build(java.util.Map<String, ?> map) throws Exception {
            ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyIssues self = new ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyIssues();
            return TeaModel.build(map, self);
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyIssues setPullRequestId(Long pullRequestId) {
            this.pullRequestId = pullRequestId;
            return this;
        }
        public Long getPullRequestId() {
            return this.pullRequestId;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyIssues setIssueUrl(String issueUrl) {
            this.issueUrl = issueUrl;
            return this;
        }
        public String getIssueUrl() {
            return this.issueUrl;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyIssues setIssueId(String issueId) {
            this.issueId = issueId;
            return this;
        }
        public String getIssueId() {
            return this.issueId;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyIssues setIssueProvider(String issueProvider) {
            this.issueProvider = issueProvider;
            return this;
        }
        public String getIssueProvider() {
            return this.issueProvider;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyIssues setIssueSite(String issueSite) {
            this.issueSite = issueSite;
            return this;
        }
        public String getIssueSite() {
            return this.issueSite;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyIssues setIssueTitle(String issueTitle) {
            this.issueTitle = issueTitle;
            return this;
        }
        public String getIssueTitle() {
            return this.issueTitle;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyIssues setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyIssues setIssueType(String issueType) {
            this.issueType = issueType;
            return this;
        }
        public String getIssueType() {
            return this.issueType;
        }

    }

    public static class ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyReview extends TeaModel {
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

        public static ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyReview build(java.util.Map<String, ?> map) throws Exception {
            ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyReview self = new ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyReview();
            return TeaModel.build(map, self);
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyReview setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyReview setTargetProject(String targetProject) {
            this.targetProject = targetProject;
            return this;
        }
        public String getTargetProject() {
            return this.targetProject;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyReview setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyReview setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyReview setAuthor(String author) {
            this.author = author;
            return this;
        }
        public String getAuthor() {
            return this.author;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyReview setSourceBranch(String sourceBranch) {
            this.sourceBranch = sourceBranch;
            return this;
        }
        public String getSourceBranch() {
            return this.sourceBranch;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyReview setStateDetail(String stateDetail) {
            this.stateDetail = stateDetail;
            return this;
        }
        public String getStateDetail() {
            return this.stateDetail;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyReview setTasks(java.util.List<String> tasks) {
            this.tasks = tasks;
            return this;
        }
        public java.util.List<String> getTasks() {
            return this.tasks;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyReview setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyReview setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyReview setRulesType(String rulesType) {
            this.rulesType = rulesType;
            return this;
        }
        public String getRulesType() {
            return this.rulesType;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyReview setTargetBranch(String targetBranch) {
            this.targetBranch = targetBranch;
            return this;
        }
        public String getTargetBranch() {
            return this.targetBranch;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyReview setSourceProject(String sourceProject) {
            this.sourceProject = sourceProject;
            return this;
        }
        public String getSourceProject() {
            return this.sourceProject;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyReview setThresholdClear(Boolean thresholdClear) {
            this.thresholdClear = thresholdClear;
            return this;
        }
        public Boolean getThresholdClear() {
            return this.thresholdClear;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyReview setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyReview setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyReview setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyReview setIid(Long iid) {
            this.iid = iid;
            return this;
        }
        public Long getIid() {
            return this.iid;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyReview setReviewers(java.util.List<String> reviewers) {
            this.reviewers = reviewers;
            return this;
        }
        public java.util.List<String> getReviewers() {
            return this.reviewers;
        }

    }

    public static class ExecLinkeantcodeAntcodeRebasepullrequestResponseBodySource extends TeaModel {
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

        public static ExecLinkeantcodeAntcodeRebasepullrequestResponseBodySource build(java.util.Map<String, ?> map) throws Exception {
            ExecLinkeantcodeAntcodeRebasepullrequestResponseBodySource self = new ExecLinkeantcodeAntcodeRebasepullrequestResponseBodySource();
            return TeaModel.build(map, self);
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodySource setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodySource setNameWithNamespace(String nameWithNamespace) {
            this.nameWithNamespace = nameWithNamespace;
            return this;
        }
        public String getNameWithNamespace() {
            return this.nameWithNamespace;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodySource setPathWithNamespace(String pathWithNamespace) {
            this.pathWithNamespace = pathWithNamespace;
            return this;
        }
        public String getPathWithNamespace() {
            return this.pathWithNamespace;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodySource setVisibilityLevel(Long visibilityLevel) {
            this.visibilityLevel = visibilityLevel;
            return this;
        }
        public Long getVisibilityLevel() {
            return this.visibilityLevel;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodySource setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodySource setHttpUrl(String httpUrl) {
            this.httpUrl = httpUrl;
            return this;
        }
        public String getHttpUrl() {
            return this.httpUrl;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodySource setSshUrl(String sshUrl) {
            this.sshUrl = sshUrl;
            return this;
        }
        public String getSshUrl() {
            return this.sshUrl;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodySource setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodySource setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyUpdatedBy extends TeaModel {
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

        public static ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyUpdatedBy build(java.util.Map<String, ?> map) throws Exception {
            ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyUpdatedBy self = new ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyUpdatedBy();
            return TeaModel.build(map, self);
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyUpdatedBy setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyUpdatedBy setCurrentSignInAt(String currentSignInAt) {
            this.currentSignInAt = currentSignInAt;
            return this;
        }
        public String getCurrentSignInAt() {
            return this.currentSignInAt;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyUpdatedBy setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyUpdatedBy setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyUpdatedBy setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyUpdatedBy setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyUpdatedBy setExternUid(String externUid) {
            this.externUid = externUid;
            return this;
        }
        public String getExternUid() {
            return this.externUid;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyUpdatedBy setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyUpdatedBy setThemeId(Long themeId) {
            this.themeId = themeId;
            return this;
        }
        public Long getThemeId() {
            return this.themeId;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyUpdatedBy setBio(String bio) {
            this.bio = bio;
            return this;
        }
        public String getBio() {
            return this.bio;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyUpdatedBy setCanCreateProject(Boolean canCreateProject) {
            this.canCreateProject = canCreateProject;
            return this;
        }
        public Boolean getCanCreateProject() {
            return this.canCreateProject;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyUpdatedBy setIsAdmin(Boolean isAdmin) {
            this.isAdmin = isAdmin;
            return this;
        }
        public Boolean getIsAdmin() {
            return this.isAdmin;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyUpdatedBy setCanCreateGroup(Boolean canCreateGroup) {
            this.canCreateGroup = canCreateGroup;
            return this;
        }
        public Boolean getCanCreateGroup() {
            return this.canCreateGroup;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyUpdatedBy setExpiresAt(String expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }
        public String getExpiresAt() {
            return this.expiresAt;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyUpdatedBy setProjectsLimit(Long projectsLimit) {
            this.projectsLimit = projectsLimit;
            return this;
        }
        public Long getProjectsLimit() {
            return this.projectsLimit;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyUpdatedBy setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyUpdatedBy setWebsiteUrl(String websiteUrl) {
            this.websiteUrl = websiteUrl;
            return this;
        }
        public String getWebsiteUrl() {
            return this.websiteUrl;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyUpdatedBy setIdentities(java.util.List<String> identities) {
            this.identities = identities;
            return this;
        }
        public java.util.List<String> getIdentities() {
            return this.identities;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyUpdatedBy setAccessLevel(Long accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }
        public Long getAccessLevel() {
            return this.accessLevel;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyUpdatedBy setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyUpdatedBy setRole(Long role) {
            this.role = role;
            return this;
        }
        public Long getRole() {
            return this.role;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyUpdatedBy setPrivateToken(String privateToken) {
            this.privateToken = privateToken;
            return this;
        }
        public String getPrivateToken() {
            return this.privateToken;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyUpdatedBy setRegistered(Boolean registered) {
            this.registered = registered;
            return this;
        }
        public Boolean getRegistered() {
            return this.registered;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyUpdatedBy setColorSchemeId(Long colorSchemeId) {
            this.colorSchemeId = colorSchemeId;
            return this;
        }
        public Long getColorSchemeId() {
            return this.colorSchemeId;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyUpdatedBy setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyUpdatedBy setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyTarget extends TeaModel {
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

        public static ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyTarget build(java.util.Map<String, ?> map) throws Exception {
            ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyTarget self = new ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyTarget();
            return TeaModel.build(map, self);
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyTarget setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyTarget setNameWithNamespace(String nameWithNamespace) {
            this.nameWithNamespace = nameWithNamespace;
            return this;
        }
        public String getNameWithNamespace() {
            return this.nameWithNamespace;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyTarget setPathWithNamespace(String pathWithNamespace) {
            this.pathWithNamespace = pathWithNamespace;
            return this;
        }
        public String getPathWithNamespace() {
            return this.pathWithNamespace;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyTarget setVisibilityLevel(Long visibilityLevel) {
            this.visibilityLevel = visibilityLevel;
            return this;
        }
        public Long getVisibilityLevel() {
            return this.visibilityLevel;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyTarget setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyTarget setHttpUrl(String httpUrl) {
            this.httpUrl = httpUrl;
            return this;
        }
        public String getHttpUrl() {
            return this.httpUrl;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyTarget setSshUrl(String sshUrl) {
            this.sshUrl = sshUrl;
            return this;
        }
        public String getSshUrl() {
            return this.sshUrl;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyTarget setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyTarget setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyLastCommit extends TeaModel {
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

        public static ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyLastCommit build(java.util.Map<String, ?> map) throws Exception {
            ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyLastCommit self = new ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyLastCommit();
            return TeaModel.build(map, self);
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyLastCommit setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyLastCommit setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyLastCommit setAuthor(String author) {
            this.author = author;
            return this;
        }
        public String getAuthor() {
            return this.author;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyLastCommit setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyLastCommit setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyAssignee extends TeaModel {
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

        public static ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyAssignee build(java.util.Map<String, ?> map) throws Exception {
            ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyAssignee self = new ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyAssignee();
            return TeaModel.build(map, self);
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyAssignee setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyAssignee setCurrentSignInAt(String currentSignInAt) {
            this.currentSignInAt = currentSignInAt;
            return this;
        }
        public String getCurrentSignInAt() {
            return this.currentSignInAt;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyAssignee setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyAssignee setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyAssignee setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyAssignee setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyAssignee setExternUid(String externUid) {
            this.externUid = externUid;
            return this;
        }
        public String getExternUid() {
            return this.externUid;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyAssignee setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyAssignee setThemeId(Long themeId) {
            this.themeId = themeId;
            return this;
        }
        public Long getThemeId() {
            return this.themeId;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyAssignee setBio(String bio) {
            this.bio = bio;
            return this;
        }
        public String getBio() {
            return this.bio;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyAssignee setCanCreateProject(Boolean canCreateProject) {
            this.canCreateProject = canCreateProject;
            return this;
        }
        public Boolean getCanCreateProject() {
            return this.canCreateProject;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyAssignee setIsAdmin(Boolean isAdmin) {
            this.isAdmin = isAdmin;
            return this;
        }
        public Boolean getIsAdmin() {
            return this.isAdmin;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyAssignee setCanCreateGroup(Boolean canCreateGroup) {
            this.canCreateGroup = canCreateGroup;
            return this;
        }
        public Boolean getCanCreateGroup() {
            return this.canCreateGroup;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyAssignee setExpiresAt(String expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }
        public String getExpiresAt() {
            return this.expiresAt;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyAssignee setProjectsLimit(Long projectsLimit) {
            this.projectsLimit = projectsLimit;
            return this;
        }
        public Long getProjectsLimit() {
            return this.projectsLimit;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyAssignee setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyAssignee setWebsiteUrl(String websiteUrl) {
            this.websiteUrl = websiteUrl;
            return this;
        }
        public String getWebsiteUrl() {
            return this.websiteUrl;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyAssignee setIdentities(java.util.List<String> identities) {
            this.identities = identities;
            return this;
        }
        public java.util.List<String> getIdentities() {
            return this.identities;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyAssignee setAccessLevel(Long accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }
        public Long getAccessLevel() {
            return this.accessLevel;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyAssignee setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyAssignee setRole(Long role) {
            this.role = role;
            return this;
        }
        public Long getRole() {
            return this.role;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyAssignee setPrivateToken(String privateToken) {
            this.privateToken = privateToken;
            return this;
        }
        public String getPrivateToken() {
            return this.privateToken;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyAssignee setRegistered(Boolean registered) {
            this.registered = registered;
            return this;
        }
        public Boolean getRegistered() {
            return this.registered;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyAssignee setColorSchemeId(Long colorSchemeId) {
            this.colorSchemeId = colorSchemeId;
            return this;
        }
        public Long getColorSchemeId() {
            return this.colorSchemeId;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyAssignee setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyAssignee setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyMergedBy extends TeaModel {
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

        public static ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyMergedBy build(java.util.Map<String, ?> map) throws Exception {
            ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyMergedBy self = new ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyMergedBy();
            return TeaModel.build(map, self);
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyMergedBy setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyMergedBy setCurrentSignInAt(String currentSignInAt) {
            this.currentSignInAt = currentSignInAt;
            return this;
        }
        public String getCurrentSignInAt() {
            return this.currentSignInAt;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyMergedBy setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyMergedBy setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyMergedBy setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyMergedBy setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyMergedBy setExternUid(String externUid) {
            this.externUid = externUid;
            return this;
        }
        public String getExternUid() {
            return this.externUid;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyMergedBy setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyMergedBy setThemeId(Long themeId) {
            this.themeId = themeId;
            return this;
        }
        public Long getThemeId() {
            return this.themeId;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyMergedBy setBio(String bio) {
            this.bio = bio;
            return this;
        }
        public String getBio() {
            return this.bio;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyMergedBy setCanCreateProject(Boolean canCreateProject) {
            this.canCreateProject = canCreateProject;
            return this;
        }
        public Boolean getCanCreateProject() {
            return this.canCreateProject;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyMergedBy setIsAdmin(Boolean isAdmin) {
            this.isAdmin = isAdmin;
            return this;
        }
        public Boolean getIsAdmin() {
            return this.isAdmin;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyMergedBy setCanCreateGroup(Boolean canCreateGroup) {
            this.canCreateGroup = canCreateGroup;
            return this;
        }
        public Boolean getCanCreateGroup() {
            return this.canCreateGroup;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyMergedBy setExpiresAt(String expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }
        public String getExpiresAt() {
            return this.expiresAt;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyMergedBy setProjectsLimit(Long projectsLimit) {
            this.projectsLimit = projectsLimit;
            return this;
        }
        public Long getProjectsLimit() {
            return this.projectsLimit;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyMergedBy setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyMergedBy setWebsiteUrl(String websiteUrl) {
            this.websiteUrl = websiteUrl;
            return this;
        }
        public String getWebsiteUrl() {
            return this.websiteUrl;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyMergedBy setIdentities(java.util.List<String> identities) {
            this.identities = identities;
            return this;
        }
        public java.util.List<String> getIdentities() {
            return this.identities;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyMergedBy setAccessLevel(Long accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }
        public Long getAccessLevel() {
            return this.accessLevel;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyMergedBy setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyMergedBy setRole(Long role) {
            this.role = role;
            return this;
        }
        public Long getRole() {
            return this.role;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyMergedBy setPrivateToken(String privateToken) {
            this.privateToken = privateToken;
            return this;
        }
        public String getPrivateToken() {
            return this.privateToken;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyMergedBy setRegistered(Boolean registered) {
            this.registered = registered;
            return this;
        }
        public Boolean getRegistered() {
            return this.registered;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyMergedBy setColorSchemeId(Long colorSchemeId) {
            this.colorSchemeId = colorSchemeId;
            return this;
        }
        public Long getColorSchemeId() {
            return this.colorSchemeId;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyMergedBy setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyMergedBy setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyAuthor extends TeaModel {
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

        public static ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyAuthor build(java.util.Map<String, ?> map) throws Exception {
            ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyAuthor self = new ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyAuthor();
            return TeaModel.build(map, self);
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyAuthor setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyAuthor setCurrentSignInAt(String currentSignInAt) {
            this.currentSignInAt = currentSignInAt;
            return this;
        }
        public String getCurrentSignInAt() {
            return this.currentSignInAt;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyAuthor setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyAuthor setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyAuthor setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyAuthor setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyAuthor setExternUid(String externUid) {
            this.externUid = externUid;
            return this;
        }
        public String getExternUid() {
            return this.externUid;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyAuthor setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyAuthor setThemeId(Long themeId) {
            this.themeId = themeId;
            return this;
        }
        public Long getThemeId() {
            return this.themeId;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyAuthor setBio(String bio) {
            this.bio = bio;
            return this;
        }
        public String getBio() {
            return this.bio;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyAuthor setCanCreateProject(Boolean canCreateProject) {
            this.canCreateProject = canCreateProject;
            return this;
        }
        public Boolean getCanCreateProject() {
            return this.canCreateProject;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyAuthor setIsAdmin(Boolean isAdmin) {
            this.isAdmin = isAdmin;
            return this;
        }
        public Boolean getIsAdmin() {
            return this.isAdmin;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyAuthor setCanCreateGroup(Boolean canCreateGroup) {
            this.canCreateGroup = canCreateGroup;
            return this;
        }
        public Boolean getCanCreateGroup() {
            return this.canCreateGroup;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyAuthor setExpiresAt(String expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }
        public String getExpiresAt() {
            return this.expiresAt;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyAuthor setProjectsLimit(Long projectsLimit) {
            this.projectsLimit = projectsLimit;
            return this;
        }
        public Long getProjectsLimit() {
            return this.projectsLimit;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyAuthor setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyAuthor setWebsiteUrl(String websiteUrl) {
            this.websiteUrl = websiteUrl;
            return this;
        }
        public String getWebsiteUrl() {
            return this.websiteUrl;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyAuthor setIdentities(java.util.List<String> identities) {
            this.identities = identities;
            return this;
        }
        public java.util.List<String> getIdentities() {
            return this.identities;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyAuthor setAccessLevel(Long accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }
        public Long getAccessLevel() {
            return this.accessLevel;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyAuthor setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyAuthor setRole(Long role) {
            this.role = role;
            return this;
        }
        public Long getRole() {
            return this.role;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyAuthor setPrivateToken(String privateToken) {
            this.privateToken = privateToken;
            return this;
        }
        public String getPrivateToken() {
            return this.privateToken;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyAuthor setRegistered(Boolean registered) {
            this.registered = registered;
            return this;
        }
        public Boolean getRegistered() {
            return this.registered;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyAuthor setColorSchemeId(Long colorSchemeId) {
            this.colorSchemeId = colorSchemeId;
            return this;
        }
        public Long getColorSchemeId() {
            return this.colorSchemeId;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyAuthor setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ExecLinkeantcodeAntcodeRebasepullrequestResponseBodyAuthor setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

}
