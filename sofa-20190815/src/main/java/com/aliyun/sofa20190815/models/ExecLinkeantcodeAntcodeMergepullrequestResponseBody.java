// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeantcodeAntcodeMergepullrequestResponseBody extends TeaModel {
    @NameInMap("Mergeable")
    public Boolean mergeable;

    @NameInMap("Action")
    public String action;

    @NameInMap("Description")
    public String description;

    @NameInMap("ShouldBeRebased")
    public Boolean shouldBeRebased;

    @NameInMap("Issues")
    public java.util.List<ExecLinkeantcodeAntcodeMergepullrequestResponseBodyIssues> issues;

    @NameInMap("CreatedAt")
    public String createdAt;

    @NameInMap("MergeError")
    public String mergeError;

    @NameInMap("SourceProjectId")
    public Long sourceProjectId;

    @NameInMap("Review")
    public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyReview review;

    @NameInMap("MergeCommitMessage")
    public String mergeCommitMessage;

    @NameInMap("Url")
    public String url;

    @NameInMap("Source")
    public ExecLinkeantcodeAntcodeMergepullrequestResponseBodySource source;

    @NameInMap("UpdatedBy")
    public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyUpdatedBy updatedBy;

    @NameInMap("Target")
    public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyTarget target;

    @NameInMap("LastCommit")
    public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyLastCommit lastCommit;

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
    public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyAssignee assignee;

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
    public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyMergedBy mergedBy;

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
    public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyAuthor author;

    @NameInMap("Id")
    public Long id;

    @NameInMap("CompareId")
    public Long compareId;

    @NameInMap("ResultCode")
    public String resultCode;

    public static ExecLinkeantcodeAntcodeMergepullrequestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeantcodeAntcodeMergepullrequestResponseBody self = new ExecLinkeantcodeAntcodeMergepullrequestResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecLinkeantcodeAntcodeMergepullrequestResponseBody setMergeable(Boolean mergeable) {
        this.mergeable = mergeable;
        return this;
    }
    public Boolean getMergeable() {
        return this.mergeable;
    }

    public ExecLinkeantcodeAntcodeMergepullrequestResponseBody setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public ExecLinkeantcodeAntcodeMergepullrequestResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ExecLinkeantcodeAntcodeMergepullrequestResponseBody setShouldBeRebased(Boolean shouldBeRebased) {
        this.shouldBeRebased = shouldBeRebased;
        return this;
    }
    public Boolean getShouldBeRebased() {
        return this.shouldBeRebased;
    }

    public ExecLinkeantcodeAntcodeMergepullrequestResponseBody setIssues(java.util.List<ExecLinkeantcodeAntcodeMergepullrequestResponseBodyIssues> issues) {
        this.issues = issues;
        return this;
    }
    public java.util.List<ExecLinkeantcodeAntcodeMergepullrequestResponseBodyIssues> getIssues() {
        return this.issues;
    }

    public ExecLinkeantcodeAntcodeMergepullrequestResponseBody setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public ExecLinkeantcodeAntcodeMergepullrequestResponseBody setMergeError(String mergeError) {
        this.mergeError = mergeError;
        return this;
    }
    public String getMergeError() {
        return this.mergeError;
    }

    public ExecLinkeantcodeAntcodeMergepullrequestResponseBody setSourceProjectId(Long sourceProjectId) {
        this.sourceProjectId = sourceProjectId;
        return this;
    }
    public Long getSourceProjectId() {
        return this.sourceProjectId;
    }

    public ExecLinkeantcodeAntcodeMergepullrequestResponseBody setReview(ExecLinkeantcodeAntcodeMergepullrequestResponseBodyReview review) {
        this.review = review;
        return this;
    }
    public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyReview getReview() {
        return this.review;
    }

    public ExecLinkeantcodeAntcodeMergepullrequestResponseBody setMergeCommitMessage(String mergeCommitMessage) {
        this.mergeCommitMessage = mergeCommitMessage;
        return this;
    }
    public String getMergeCommitMessage() {
        return this.mergeCommitMessage;
    }

    public ExecLinkeantcodeAntcodeMergepullrequestResponseBody setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public ExecLinkeantcodeAntcodeMergepullrequestResponseBody setSource(ExecLinkeantcodeAntcodeMergepullrequestResponseBodySource source) {
        this.source = source;
        return this;
    }
    public ExecLinkeantcodeAntcodeMergepullrequestResponseBodySource getSource() {
        return this.source;
    }

    public ExecLinkeantcodeAntcodeMergepullrequestResponseBody setUpdatedBy(ExecLinkeantcodeAntcodeMergepullrequestResponseBodyUpdatedBy updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }
    public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyUpdatedBy getUpdatedBy() {
        return this.updatedBy;
    }

    public ExecLinkeantcodeAntcodeMergepullrequestResponseBody setTarget(ExecLinkeantcodeAntcodeMergepullrequestResponseBodyTarget target) {
        this.target = target;
        return this;
    }
    public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyTarget getTarget() {
        return this.target;
    }

    public ExecLinkeantcodeAntcodeMergepullrequestResponseBody setLastCommit(ExecLinkeantcodeAntcodeMergepullrequestResponseBodyLastCommit lastCommit) {
        this.lastCommit = lastCommit;
        return this;
    }
    public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyLastCommit getLastCommit() {
        return this.lastCommit;
    }

    public ExecLinkeantcodeAntcodeMergepullrequestResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public ExecLinkeantcodeAntcodeMergepullrequestResponseBody setAutoMerge(Boolean autoMerge) {
        this.autoMerge = autoMerge;
        return this;
    }
    public Boolean getAutoMerge() {
        return this.autoMerge;
    }

    public ExecLinkeantcodeAntcodeMergepullrequestResponseBody setTargetProjectId(Long targetProjectId) {
        this.targetProjectId = targetProjectId;
        return this;
    }
    public Long getTargetProjectId() {
        return this.targetProjectId;
    }

    public ExecLinkeantcodeAntcodeMergepullrequestResponseBody setTargetBranch(String targetBranch) {
        this.targetBranch = targetBranch;
        return this;
    }
    public String getTargetBranch() {
        return this.targetBranch;
    }

    public ExecLinkeantcodeAntcodeMergepullrequestResponseBody setReviewed(Boolean reviewed) {
        this.reviewed = reviewed;
        return this;
    }
    public Boolean getReviewed() {
        return this.reviewed;
    }

    public ExecLinkeantcodeAntcodeMergepullrequestResponseBody setShouldRemoveSourceBranch(Boolean shouldRemoveSourceBranch) {
        this.shouldRemoveSourceBranch = shouldRemoveSourceBranch;
        return this;
    }
    public Boolean getShouldRemoveSourceBranch() {
        return this.shouldRemoveSourceBranch;
    }

    public ExecLinkeantcodeAntcodeMergepullrequestResponseBody setAssignee(ExecLinkeantcodeAntcodeMergepullrequestResponseBodyAssignee assignee) {
        this.assignee = assignee;
        return this;
    }
    public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyAssignee getAssignee() {
        return this.assignee;
    }

    public ExecLinkeantcodeAntcodeMergepullrequestResponseBody setSquashMerge(Boolean squashMerge) {
        this.squashMerge = squashMerge;
        return this;
    }
    public Boolean getSquashMerge() {
        return this.squashMerge;
    }

    public ExecLinkeantcodeAntcodeMergepullrequestResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecLinkeantcodeAntcodeMergepullrequestResponseBody setIid(Long iid) {
        this.iid = iid;
        return this;
    }
    public Long getIid() {
        return this.iid;
    }

    public ExecLinkeantcodeAntcodeMergepullrequestResponseBody setFfOnlyEnabled(Boolean ffOnlyEnabled) {
        this.ffOnlyEnabled = ffOnlyEnabled;
        return this;
    }
    public Boolean getFfOnlyEnabled() {
        return this.ffOnlyEnabled;
    }

    public ExecLinkeantcodeAntcodeMergepullrequestResponseBody setWebUrl(String webUrl) {
        this.webUrl = webUrl;
        return this;
    }
    public String getWebUrl() {
        return this.webUrl;
    }

    public ExecLinkeantcodeAntcodeMergepullrequestResponseBody setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public ExecLinkeantcodeAntcodeMergepullrequestResponseBody setWorkInProgress(Boolean workInProgress) {
        this.workInProgress = workInProgress;
        return this;
    }
    public Boolean getWorkInProgress() {
        return this.workInProgress;
    }

    public ExecLinkeantcodeAntcodeMergepullrequestResponseBody setLabels(java.util.List<String> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<String> getLabels() {
        return this.labels;
    }

    public ExecLinkeantcodeAntcodeMergepullrequestResponseBody setMergeCommitSha(String mergeCommitSha) {
        this.mergeCommitSha = mergeCommitSha;
        return this;
    }
    public String getMergeCommitSha() {
        return this.mergeCommitSha;
    }

    public ExecLinkeantcodeAntcodeMergepullrequestResponseBody setMergedAt(String mergedAt) {
        this.mergedAt = mergedAt;
        return this;
    }
    public String getMergedAt() {
        return this.mergedAt;
    }

    public ExecLinkeantcodeAntcodeMergepullrequestResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ExecLinkeantcodeAntcodeMergepullrequestResponseBody setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public ExecLinkeantcodeAntcodeMergepullrequestResponseBody setMergedBy(ExecLinkeantcodeAntcodeMergepullrequestResponseBodyMergedBy mergedBy) {
        this.mergedBy = mergedBy;
        return this;
    }
    public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyMergedBy getMergedBy() {
        return this.mergedBy;
    }

    public ExecLinkeantcodeAntcodeMergepullrequestResponseBody setReviewAction(String reviewAction) {
        this.reviewAction = reviewAction;
        return this;
    }
    public String getReviewAction() {
        return this.reviewAction;
    }

    public ExecLinkeantcodeAntcodeMergepullrequestResponseBody setActiveTime(String activeTime) {
        this.activeTime = activeTime;
        return this;
    }
    public String getActiveTime() {
        return this.activeTime;
    }

    public ExecLinkeantcodeAntcodeMergepullrequestResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public ExecLinkeantcodeAntcodeMergepullrequestResponseBody setSourceBranch(String sourceBranch) {
        this.sourceBranch = sourceBranch;
        return this;
    }
    public String getSourceBranch() {
        return this.sourceBranch;
    }

    public ExecLinkeantcodeAntcodeMergepullrequestResponseBody setMergeStatus(String mergeStatus) {
        this.mergeStatus = mergeStatus;
        return this;
    }
    public String getMergeStatus() {
        return this.mergeStatus;
    }

    public ExecLinkeantcodeAntcodeMergepullrequestResponseBody setAuthor(ExecLinkeantcodeAntcodeMergepullrequestResponseBodyAuthor author) {
        this.author = author;
        return this;
    }
    public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyAuthor getAuthor() {
        return this.author;
    }

    public ExecLinkeantcodeAntcodeMergepullrequestResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ExecLinkeantcodeAntcodeMergepullrequestResponseBody setCompareId(Long compareId) {
        this.compareId = compareId;
        return this;
    }
    public Long getCompareId() {
        return this.compareId;
    }

    public ExecLinkeantcodeAntcodeMergepullrequestResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class ExecLinkeantcodeAntcodeMergepullrequestResponseBodyIssues extends TeaModel {
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

        public static ExecLinkeantcodeAntcodeMergepullrequestResponseBodyIssues build(java.util.Map<String, ?> map) throws Exception {
            ExecLinkeantcodeAntcodeMergepullrequestResponseBodyIssues self = new ExecLinkeantcodeAntcodeMergepullrequestResponseBodyIssues();
            return TeaModel.build(map, self);
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyIssues setPullRequestId(Long pullRequestId) {
            this.pullRequestId = pullRequestId;
            return this;
        }
        public Long getPullRequestId() {
            return this.pullRequestId;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyIssues setIssueUrl(String issueUrl) {
            this.issueUrl = issueUrl;
            return this;
        }
        public String getIssueUrl() {
            return this.issueUrl;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyIssues setIssueId(String issueId) {
            this.issueId = issueId;
            return this;
        }
        public String getIssueId() {
            return this.issueId;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyIssues setIssueProvider(String issueProvider) {
            this.issueProvider = issueProvider;
            return this;
        }
        public String getIssueProvider() {
            return this.issueProvider;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyIssues setIssueSite(String issueSite) {
            this.issueSite = issueSite;
            return this;
        }
        public String getIssueSite() {
            return this.issueSite;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyIssues setIssueTitle(String issueTitle) {
            this.issueTitle = issueTitle;
            return this;
        }
        public String getIssueTitle() {
            return this.issueTitle;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyIssues setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyIssues setIssueType(String issueType) {
            this.issueType = issueType;
            return this;
        }
        public String getIssueType() {
            return this.issueType;
        }

    }

    public static class ExecLinkeantcodeAntcodeMergepullrequestResponseBodyReview extends TeaModel {
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

        public static ExecLinkeantcodeAntcodeMergepullrequestResponseBodyReview build(java.util.Map<String, ?> map) throws Exception {
            ExecLinkeantcodeAntcodeMergepullrequestResponseBodyReview self = new ExecLinkeantcodeAntcodeMergepullrequestResponseBodyReview();
            return TeaModel.build(map, self);
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyReview setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyReview setTargetProject(String targetProject) {
            this.targetProject = targetProject;
            return this;
        }
        public String getTargetProject() {
            return this.targetProject;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyReview setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyReview setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyReview setAuthor(String author) {
            this.author = author;
            return this;
        }
        public String getAuthor() {
            return this.author;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyReview setSourceBranch(String sourceBranch) {
            this.sourceBranch = sourceBranch;
            return this;
        }
        public String getSourceBranch() {
            return this.sourceBranch;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyReview setStateDetail(String stateDetail) {
            this.stateDetail = stateDetail;
            return this;
        }
        public String getStateDetail() {
            return this.stateDetail;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyReview setTasks(java.util.List<String> tasks) {
            this.tasks = tasks;
            return this;
        }
        public java.util.List<String> getTasks() {
            return this.tasks;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyReview setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyReview setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyReview setRulesType(String rulesType) {
            this.rulesType = rulesType;
            return this;
        }
        public String getRulesType() {
            return this.rulesType;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyReview setTargetBranch(String targetBranch) {
            this.targetBranch = targetBranch;
            return this;
        }
        public String getTargetBranch() {
            return this.targetBranch;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyReview setSourceProject(String sourceProject) {
            this.sourceProject = sourceProject;
            return this;
        }
        public String getSourceProject() {
            return this.sourceProject;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyReview setThresholdClear(Boolean thresholdClear) {
            this.thresholdClear = thresholdClear;
            return this;
        }
        public Boolean getThresholdClear() {
            return this.thresholdClear;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyReview setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyReview setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyReview setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyReview setIid(Long iid) {
            this.iid = iid;
            return this;
        }
        public Long getIid() {
            return this.iid;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyReview setReviewers(java.util.List<String> reviewers) {
            this.reviewers = reviewers;
            return this;
        }
        public java.util.List<String> getReviewers() {
            return this.reviewers;
        }

    }

    public static class ExecLinkeantcodeAntcodeMergepullrequestResponseBodySource extends TeaModel {
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

        public static ExecLinkeantcodeAntcodeMergepullrequestResponseBodySource build(java.util.Map<String, ?> map) throws Exception {
            ExecLinkeantcodeAntcodeMergepullrequestResponseBodySource self = new ExecLinkeantcodeAntcodeMergepullrequestResponseBodySource();
            return TeaModel.build(map, self);
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodySource setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodySource setNameWithNamespace(String nameWithNamespace) {
            this.nameWithNamespace = nameWithNamespace;
            return this;
        }
        public String getNameWithNamespace() {
            return this.nameWithNamespace;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodySource setPathWithNamespace(String pathWithNamespace) {
            this.pathWithNamespace = pathWithNamespace;
            return this;
        }
        public String getPathWithNamespace() {
            return this.pathWithNamespace;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodySource setVisibilityLevel(Long visibilityLevel) {
            this.visibilityLevel = visibilityLevel;
            return this;
        }
        public Long getVisibilityLevel() {
            return this.visibilityLevel;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodySource setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodySource setHttpUrl(String httpUrl) {
            this.httpUrl = httpUrl;
            return this;
        }
        public String getHttpUrl() {
            return this.httpUrl;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodySource setSshUrl(String sshUrl) {
            this.sshUrl = sshUrl;
            return this;
        }
        public String getSshUrl() {
            return this.sshUrl;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodySource setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodySource setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class ExecLinkeantcodeAntcodeMergepullrequestResponseBodyUpdatedBy extends TeaModel {
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

        public static ExecLinkeantcodeAntcodeMergepullrequestResponseBodyUpdatedBy build(java.util.Map<String, ?> map) throws Exception {
            ExecLinkeantcodeAntcodeMergepullrequestResponseBodyUpdatedBy self = new ExecLinkeantcodeAntcodeMergepullrequestResponseBodyUpdatedBy();
            return TeaModel.build(map, self);
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyUpdatedBy setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyUpdatedBy setCurrentSignInAt(String currentSignInAt) {
            this.currentSignInAt = currentSignInAt;
            return this;
        }
        public String getCurrentSignInAt() {
            return this.currentSignInAt;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyUpdatedBy setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyUpdatedBy setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyUpdatedBy setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyUpdatedBy setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyUpdatedBy setExternUid(String externUid) {
            this.externUid = externUid;
            return this;
        }
        public String getExternUid() {
            return this.externUid;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyUpdatedBy setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyUpdatedBy setThemeId(Long themeId) {
            this.themeId = themeId;
            return this;
        }
        public Long getThemeId() {
            return this.themeId;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyUpdatedBy setBio(String bio) {
            this.bio = bio;
            return this;
        }
        public String getBio() {
            return this.bio;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyUpdatedBy setCanCreateProject(Boolean canCreateProject) {
            this.canCreateProject = canCreateProject;
            return this;
        }
        public Boolean getCanCreateProject() {
            return this.canCreateProject;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyUpdatedBy setIsAdmin(Boolean isAdmin) {
            this.isAdmin = isAdmin;
            return this;
        }
        public Boolean getIsAdmin() {
            return this.isAdmin;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyUpdatedBy setCanCreateGroup(Boolean canCreateGroup) {
            this.canCreateGroup = canCreateGroup;
            return this;
        }
        public Boolean getCanCreateGroup() {
            return this.canCreateGroup;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyUpdatedBy setExpiresAt(String expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }
        public String getExpiresAt() {
            return this.expiresAt;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyUpdatedBy setProjectsLimit(Long projectsLimit) {
            this.projectsLimit = projectsLimit;
            return this;
        }
        public Long getProjectsLimit() {
            return this.projectsLimit;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyUpdatedBy setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyUpdatedBy setWebsiteUrl(String websiteUrl) {
            this.websiteUrl = websiteUrl;
            return this;
        }
        public String getWebsiteUrl() {
            return this.websiteUrl;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyUpdatedBy setIdentities(java.util.List<String> identities) {
            this.identities = identities;
            return this;
        }
        public java.util.List<String> getIdentities() {
            return this.identities;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyUpdatedBy setAccessLevel(Long accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }
        public Long getAccessLevel() {
            return this.accessLevel;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyUpdatedBy setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyUpdatedBy setRole(Long role) {
            this.role = role;
            return this;
        }
        public Long getRole() {
            return this.role;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyUpdatedBy setPrivateToken(String privateToken) {
            this.privateToken = privateToken;
            return this;
        }
        public String getPrivateToken() {
            return this.privateToken;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyUpdatedBy setRegistered(Boolean registered) {
            this.registered = registered;
            return this;
        }
        public Boolean getRegistered() {
            return this.registered;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyUpdatedBy setColorSchemeId(Long colorSchemeId) {
            this.colorSchemeId = colorSchemeId;
            return this;
        }
        public Long getColorSchemeId() {
            return this.colorSchemeId;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyUpdatedBy setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyUpdatedBy setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class ExecLinkeantcodeAntcodeMergepullrequestResponseBodyTarget extends TeaModel {
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

        public static ExecLinkeantcodeAntcodeMergepullrequestResponseBodyTarget build(java.util.Map<String, ?> map) throws Exception {
            ExecLinkeantcodeAntcodeMergepullrequestResponseBodyTarget self = new ExecLinkeantcodeAntcodeMergepullrequestResponseBodyTarget();
            return TeaModel.build(map, self);
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyTarget setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyTarget setNameWithNamespace(String nameWithNamespace) {
            this.nameWithNamespace = nameWithNamespace;
            return this;
        }
        public String getNameWithNamespace() {
            return this.nameWithNamespace;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyTarget setPathWithNamespace(String pathWithNamespace) {
            this.pathWithNamespace = pathWithNamespace;
            return this;
        }
        public String getPathWithNamespace() {
            return this.pathWithNamespace;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyTarget setVisibilityLevel(Long visibilityLevel) {
            this.visibilityLevel = visibilityLevel;
            return this;
        }
        public Long getVisibilityLevel() {
            return this.visibilityLevel;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyTarget setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyTarget setHttpUrl(String httpUrl) {
            this.httpUrl = httpUrl;
            return this;
        }
        public String getHttpUrl() {
            return this.httpUrl;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyTarget setSshUrl(String sshUrl) {
            this.sshUrl = sshUrl;
            return this;
        }
        public String getSshUrl() {
            return this.sshUrl;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyTarget setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyTarget setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class ExecLinkeantcodeAntcodeMergepullrequestResponseBodyLastCommit extends TeaModel {
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

        public static ExecLinkeantcodeAntcodeMergepullrequestResponseBodyLastCommit build(java.util.Map<String, ?> map) throws Exception {
            ExecLinkeantcodeAntcodeMergepullrequestResponseBodyLastCommit self = new ExecLinkeantcodeAntcodeMergepullrequestResponseBodyLastCommit();
            return TeaModel.build(map, self);
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyLastCommit setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyLastCommit setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyLastCommit setAuthor(String author) {
            this.author = author;
            return this;
        }
        public String getAuthor() {
            return this.author;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyLastCommit setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyLastCommit setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class ExecLinkeantcodeAntcodeMergepullrequestResponseBodyAssignee extends TeaModel {
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

        public static ExecLinkeantcodeAntcodeMergepullrequestResponseBodyAssignee build(java.util.Map<String, ?> map) throws Exception {
            ExecLinkeantcodeAntcodeMergepullrequestResponseBodyAssignee self = new ExecLinkeantcodeAntcodeMergepullrequestResponseBodyAssignee();
            return TeaModel.build(map, self);
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyAssignee setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyAssignee setCurrentSignInAt(String currentSignInAt) {
            this.currentSignInAt = currentSignInAt;
            return this;
        }
        public String getCurrentSignInAt() {
            return this.currentSignInAt;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyAssignee setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyAssignee setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyAssignee setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyAssignee setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyAssignee setExternUid(String externUid) {
            this.externUid = externUid;
            return this;
        }
        public String getExternUid() {
            return this.externUid;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyAssignee setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyAssignee setThemeId(Long themeId) {
            this.themeId = themeId;
            return this;
        }
        public Long getThemeId() {
            return this.themeId;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyAssignee setBio(String bio) {
            this.bio = bio;
            return this;
        }
        public String getBio() {
            return this.bio;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyAssignee setCanCreateProject(Boolean canCreateProject) {
            this.canCreateProject = canCreateProject;
            return this;
        }
        public Boolean getCanCreateProject() {
            return this.canCreateProject;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyAssignee setIsAdmin(Boolean isAdmin) {
            this.isAdmin = isAdmin;
            return this;
        }
        public Boolean getIsAdmin() {
            return this.isAdmin;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyAssignee setCanCreateGroup(Boolean canCreateGroup) {
            this.canCreateGroup = canCreateGroup;
            return this;
        }
        public Boolean getCanCreateGroup() {
            return this.canCreateGroup;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyAssignee setExpiresAt(String expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }
        public String getExpiresAt() {
            return this.expiresAt;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyAssignee setProjectsLimit(Long projectsLimit) {
            this.projectsLimit = projectsLimit;
            return this;
        }
        public Long getProjectsLimit() {
            return this.projectsLimit;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyAssignee setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyAssignee setWebsiteUrl(String websiteUrl) {
            this.websiteUrl = websiteUrl;
            return this;
        }
        public String getWebsiteUrl() {
            return this.websiteUrl;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyAssignee setIdentities(java.util.List<String> identities) {
            this.identities = identities;
            return this;
        }
        public java.util.List<String> getIdentities() {
            return this.identities;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyAssignee setAccessLevel(Long accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }
        public Long getAccessLevel() {
            return this.accessLevel;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyAssignee setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyAssignee setRole(Long role) {
            this.role = role;
            return this;
        }
        public Long getRole() {
            return this.role;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyAssignee setPrivateToken(String privateToken) {
            this.privateToken = privateToken;
            return this;
        }
        public String getPrivateToken() {
            return this.privateToken;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyAssignee setRegistered(Boolean registered) {
            this.registered = registered;
            return this;
        }
        public Boolean getRegistered() {
            return this.registered;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyAssignee setColorSchemeId(Long colorSchemeId) {
            this.colorSchemeId = colorSchemeId;
            return this;
        }
        public Long getColorSchemeId() {
            return this.colorSchemeId;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyAssignee setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyAssignee setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class ExecLinkeantcodeAntcodeMergepullrequestResponseBodyMergedBy extends TeaModel {
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

        public static ExecLinkeantcodeAntcodeMergepullrequestResponseBodyMergedBy build(java.util.Map<String, ?> map) throws Exception {
            ExecLinkeantcodeAntcodeMergepullrequestResponseBodyMergedBy self = new ExecLinkeantcodeAntcodeMergepullrequestResponseBodyMergedBy();
            return TeaModel.build(map, self);
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyMergedBy setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyMergedBy setCurrentSignInAt(String currentSignInAt) {
            this.currentSignInAt = currentSignInAt;
            return this;
        }
        public String getCurrentSignInAt() {
            return this.currentSignInAt;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyMergedBy setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyMergedBy setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyMergedBy setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyMergedBy setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyMergedBy setExternUid(String externUid) {
            this.externUid = externUid;
            return this;
        }
        public String getExternUid() {
            return this.externUid;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyMergedBy setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyMergedBy setThemeId(Long themeId) {
            this.themeId = themeId;
            return this;
        }
        public Long getThemeId() {
            return this.themeId;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyMergedBy setBio(String bio) {
            this.bio = bio;
            return this;
        }
        public String getBio() {
            return this.bio;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyMergedBy setCanCreateProject(Boolean canCreateProject) {
            this.canCreateProject = canCreateProject;
            return this;
        }
        public Boolean getCanCreateProject() {
            return this.canCreateProject;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyMergedBy setIsAdmin(Boolean isAdmin) {
            this.isAdmin = isAdmin;
            return this;
        }
        public Boolean getIsAdmin() {
            return this.isAdmin;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyMergedBy setCanCreateGroup(Boolean canCreateGroup) {
            this.canCreateGroup = canCreateGroup;
            return this;
        }
        public Boolean getCanCreateGroup() {
            return this.canCreateGroup;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyMergedBy setExpiresAt(String expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }
        public String getExpiresAt() {
            return this.expiresAt;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyMergedBy setProjectsLimit(Long projectsLimit) {
            this.projectsLimit = projectsLimit;
            return this;
        }
        public Long getProjectsLimit() {
            return this.projectsLimit;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyMergedBy setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyMergedBy setWebsiteUrl(String websiteUrl) {
            this.websiteUrl = websiteUrl;
            return this;
        }
        public String getWebsiteUrl() {
            return this.websiteUrl;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyMergedBy setIdentities(java.util.List<String> identities) {
            this.identities = identities;
            return this;
        }
        public java.util.List<String> getIdentities() {
            return this.identities;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyMergedBy setAccessLevel(Long accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }
        public Long getAccessLevel() {
            return this.accessLevel;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyMergedBy setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyMergedBy setRole(Long role) {
            this.role = role;
            return this;
        }
        public Long getRole() {
            return this.role;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyMergedBy setPrivateToken(String privateToken) {
            this.privateToken = privateToken;
            return this;
        }
        public String getPrivateToken() {
            return this.privateToken;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyMergedBy setRegistered(Boolean registered) {
            this.registered = registered;
            return this;
        }
        public Boolean getRegistered() {
            return this.registered;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyMergedBy setColorSchemeId(Long colorSchemeId) {
            this.colorSchemeId = colorSchemeId;
            return this;
        }
        public Long getColorSchemeId() {
            return this.colorSchemeId;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyMergedBy setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyMergedBy setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class ExecLinkeantcodeAntcodeMergepullrequestResponseBodyAuthor extends TeaModel {
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

        public static ExecLinkeantcodeAntcodeMergepullrequestResponseBodyAuthor build(java.util.Map<String, ?> map) throws Exception {
            ExecLinkeantcodeAntcodeMergepullrequestResponseBodyAuthor self = new ExecLinkeantcodeAntcodeMergepullrequestResponseBodyAuthor();
            return TeaModel.build(map, self);
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyAuthor setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyAuthor setCurrentSignInAt(String currentSignInAt) {
            this.currentSignInAt = currentSignInAt;
            return this;
        }
        public String getCurrentSignInAt() {
            return this.currentSignInAt;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyAuthor setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyAuthor setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyAuthor setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyAuthor setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyAuthor setExternUid(String externUid) {
            this.externUid = externUid;
            return this;
        }
        public String getExternUid() {
            return this.externUid;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyAuthor setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyAuthor setThemeId(Long themeId) {
            this.themeId = themeId;
            return this;
        }
        public Long getThemeId() {
            return this.themeId;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyAuthor setBio(String bio) {
            this.bio = bio;
            return this;
        }
        public String getBio() {
            return this.bio;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyAuthor setCanCreateProject(Boolean canCreateProject) {
            this.canCreateProject = canCreateProject;
            return this;
        }
        public Boolean getCanCreateProject() {
            return this.canCreateProject;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyAuthor setIsAdmin(Boolean isAdmin) {
            this.isAdmin = isAdmin;
            return this;
        }
        public Boolean getIsAdmin() {
            return this.isAdmin;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyAuthor setCanCreateGroup(Boolean canCreateGroup) {
            this.canCreateGroup = canCreateGroup;
            return this;
        }
        public Boolean getCanCreateGroup() {
            return this.canCreateGroup;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyAuthor setExpiresAt(String expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }
        public String getExpiresAt() {
            return this.expiresAt;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyAuthor setProjectsLimit(Long projectsLimit) {
            this.projectsLimit = projectsLimit;
            return this;
        }
        public Long getProjectsLimit() {
            return this.projectsLimit;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyAuthor setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyAuthor setWebsiteUrl(String websiteUrl) {
            this.websiteUrl = websiteUrl;
            return this;
        }
        public String getWebsiteUrl() {
            return this.websiteUrl;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyAuthor setIdentities(java.util.List<String> identities) {
            this.identities = identities;
            return this;
        }
        public java.util.List<String> getIdentities() {
            return this.identities;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyAuthor setAccessLevel(Long accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }
        public Long getAccessLevel() {
            return this.accessLevel;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyAuthor setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyAuthor setRole(Long role) {
            this.role = role;
            return this;
        }
        public Long getRole() {
            return this.role;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyAuthor setPrivateToken(String privateToken) {
            this.privateToken = privateToken;
            return this;
        }
        public String getPrivateToken() {
            return this.privateToken;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyAuthor setRegistered(Boolean registered) {
            this.registered = registered;
            return this;
        }
        public Boolean getRegistered() {
            return this.registered;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyAuthor setColorSchemeId(Long colorSchemeId) {
            this.colorSchemeId = colorSchemeId;
            return this;
        }
        public Long getColorSchemeId() {
            return this.colorSchemeId;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyAuthor setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ExecLinkeantcodeAntcodeMergepullrequestResponseBodyAuthor setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

}
