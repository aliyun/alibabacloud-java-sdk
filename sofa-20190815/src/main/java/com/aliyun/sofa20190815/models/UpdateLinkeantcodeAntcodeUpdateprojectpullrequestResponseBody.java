// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Action")
    public String action;

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

    @NameInMap("MergedAt")
    public String mergedAt;

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

    @NameInMap("ReviewAction")
    public String reviewAction;

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

    @NameInMap("Issues")
    public java.util.List<UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyIssues> issues;

    @NameInMap("Assignee")
    public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyAssignee assignee;

    @NameInMap("Author")
    public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyAuthor author;

    @NameInMap("LastCommit")
    public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyLastCommit lastCommit;

    @NameInMap("MergedBy")
    public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyMergedBy mergedBy;

    @NameInMap("Review")
    public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyReview review;

    @NameInMap("Source")
    public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodySource source;

    @NameInMap("Target")
    public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyTarget target;

    @NameInMap("UpdatedBy")
    public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyUpdatedBy updatedBy;

    public static UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBody self = new UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBody setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBody setActiveTime(String activeTime) {
        this.activeTime = activeTime;
        return this;
    }
    public String getActiveTime() {
        return this.activeTime;
    }

    public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBody setAutoMerge(Boolean autoMerge) {
        this.autoMerge = autoMerge;
        return this;
    }
    public Boolean getAutoMerge() {
        return this.autoMerge;
    }

    public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBody setCompareId(Long compareId) {
        this.compareId = compareId;
        return this;
    }
    public Long getCompareId() {
        return this.compareId;
    }

    public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBody setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBody setFfOnlyEnabled(Boolean ffOnlyEnabled) {
        this.ffOnlyEnabled = ffOnlyEnabled;
        return this;
    }
    public Boolean getFfOnlyEnabled() {
        return this.ffOnlyEnabled;
    }

    public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBody setIid(Long iid) {
        this.iid = iid;
        return this;
    }
    public Long getIid() {
        return this.iid;
    }

    public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBody setMergeable(Boolean mergeable) {
        this.mergeable = mergeable;
        return this;
    }
    public Boolean getMergeable() {
        return this.mergeable;
    }

    public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBody setMergedAt(String mergedAt) {
        this.mergedAt = mergedAt;
        return this;
    }
    public String getMergedAt() {
        return this.mergedAt;
    }

    public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBody setMergeCommitMessage(String mergeCommitMessage) {
        this.mergeCommitMessage = mergeCommitMessage;
        return this;
    }
    public String getMergeCommitMessage() {
        return this.mergeCommitMessage;
    }

    public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBody setMergeCommitSha(String mergeCommitSha) {
        this.mergeCommitSha = mergeCommitSha;
        return this;
    }
    public String getMergeCommitSha() {
        return this.mergeCommitSha;
    }

    public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBody setMergeError(String mergeError) {
        this.mergeError = mergeError;
        return this;
    }
    public String getMergeError() {
        return this.mergeError;
    }

    public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBody setMergeStatus(String mergeStatus) {
        this.mergeStatus = mergeStatus;
        return this;
    }
    public String getMergeStatus() {
        return this.mergeStatus;
    }

    public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBody setReviewed(Boolean reviewed) {
        this.reviewed = reviewed;
        return this;
    }
    public Boolean getReviewed() {
        return this.reviewed;
    }

    public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBody setReviewAction(String reviewAction) {
        this.reviewAction = reviewAction;
        return this;
    }
    public String getReviewAction() {
        return this.reviewAction;
    }

    public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBody setShouldBeRebased(Boolean shouldBeRebased) {
        this.shouldBeRebased = shouldBeRebased;
        return this;
    }
    public Boolean getShouldBeRebased() {
        return this.shouldBeRebased;
    }

    public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBody setShouldRemoveSourceBranch(Boolean shouldRemoveSourceBranch) {
        this.shouldRemoveSourceBranch = shouldRemoveSourceBranch;
        return this;
    }
    public Boolean getShouldRemoveSourceBranch() {
        return this.shouldRemoveSourceBranch;
    }

    public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBody setSourceBranch(String sourceBranch) {
        this.sourceBranch = sourceBranch;
        return this;
    }
    public String getSourceBranch() {
        return this.sourceBranch;
    }

    public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBody setSourceProjectId(Long sourceProjectId) {
        this.sourceProjectId = sourceProjectId;
        return this;
    }
    public Long getSourceProjectId() {
        return this.sourceProjectId;
    }

    public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBody setSquashMerge(Boolean squashMerge) {
        this.squashMerge = squashMerge;
        return this;
    }
    public Boolean getSquashMerge() {
        return this.squashMerge;
    }

    public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBody setTargetBranch(String targetBranch) {
        this.targetBranch = targetBranch;
        return this;
    }
    public String getTargetBranch() {
        return this.targetBranch;
    }

    public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBody setTargetProjectId(Long targetProjectId) {
        this.targetProjectId = targetProjectId;
        return this;
    }
    public Long getTargetProjectId() {
        return this.targetProjectId;
    }

    public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBody setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBody setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBody setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBody setWebUrl(String webUrl) {
        this.webUrl = webUrl;
        return this;
    }
    public String getWebUrl() {
        return this.webUrl;
    }

    public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBody setWorkInProgress(Boolean workInProgress) {
        this.workInProgress = workInProgress;
        return this;
    }
    public Boolean getWorkInProgress() {
        return this.workInProgress;
    }

    public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBody setLabels(java.util.List<String> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<String> getLabels() {
        return this.labels;
    }

    public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBody setIssues(java.util.List<UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyIssues> issues) {
        this.issues = issues;
        return this;
    }
    public java.util.List<UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyIssues> getIssues() {
        return this.issues;
    }

    public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBody setAssignee(UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyAssignee assignee) {
        this.assignee = assignee;
        return this;
    }
    public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyAssignee getAssignee() {
        return this.assignee;
    }

    public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBody setAuthor(UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyAuthor author) {
        this.author = author;
        return this;
    }
    public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyAuthor getAuthor() {
        return this.author;
    }

    public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBody setLastCommit(UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyLastCommit lastCommit) {
        this.lastCommit = lastCommit;
        return this;
    }
    public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyLastCommit getLastCommit() {
        return this.lastCommit;
    }

    public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBody setMergedBy(UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyMergedBy mergedBy) {
        this.mergedBy = mergedBy;
        return this;
    }
    public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyMergedBy getMergedBy() {
        return this.mergedBy;
    }

    public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBody setReview(UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyReview review) {
        this.review = review;
        return this;
    }
    public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyReview getReview() {
        return this.review;
    }

    public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBody setSource(UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodySource source) {
        this.source = source;
        return this;
    }
    public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodySource getSource() {
        return this.source;
    }

    public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBody setTarget(UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyTarget target) {
        this.target = target;
        return this;
    }
    public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyTarget getTarget() {
        return this.target;
    }

    public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBody setUpdatedBy(UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyUpdatedBy updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }
    public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyUpdatedBy getUpdatedBy() {
        return this.updatedBy;
    }

    public static class UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyIssues extends TeaModel {
        @NameInMap("Id")
        public Long id;

        @NameInMap("IssueId")
        public String issueId;

        @NameInMap("IssueProvider")
        public String issueProvider;

        @NameInMap("IssueSite")
        public String issueSite;

        @NameInMap("IssueTitle")
        public String issueTitle;

        @NameInMap("IssueType")
        public String issueType;

        @NameInMap("IssueUrl")
        public String issueUrl;

        @NameInMap("PullRequestId")
        public Long pullRequestId;

        public static UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyIssues build(java.util.Map<String, ?> map) throws Exception {
            UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyIssues self = new UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyIssues();
            return TeaModel.build(map, self);
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyIssues setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyIssues setIssueId(String issueId) {
            this.issueId = issueId;
            return this;
        }
        public String getIssueId() {
            return this.issueId;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyIssues setIssueProvider(String issueProvider) {
            this.issueProvider = issueProvider;
            return this;
        }
        public String getIssueProvider() {
            return this.issueProvider;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyIssues setIssueSite(String issueSite) {
            this.issueSite = issueSite;
            return this;
        }
        public String getIssueSite() {
            return this.issueSite;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyIssues setIssueTitle(String issueTitle) {
            this.issueTitle = issueTitle;
            return this;
        }
        public String getIssueTitle() {
            return this.issueTitle;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyIssues setIssueType(String issueType) {
            this.issueType = issueType;
            return this;
        }
        public String getIssueType() {
            return this.issueType;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyIssues setIssueUrl(String issueUrl) {
            this.issueUrl = issueUrl;
            return this;
        }
        public String getIssueUrl() {
            return this.issueUrl;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyIssues setPullRequestId(Long pullRequestId) {
            this.pullRequestId = pullRequestId;
            return this;
        }
        public Long getPullRequestId() {
            return this.pullRequestId;
        }

    }

    public static class UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyAssignee extends TeaModel {
        @NameInMap("AccessLevel")
        public Long accessLevel;

        @NameInMap("AvatarUrl")
        public String avatarUrl;

        @NameInMap("Bio")
        public String bio;

        @NameInMap("CanCreateGroup")
        public Boolean canCreateGroup;

        @NameInMap("CanCreateProject")
        public Boolean canCreateProject;

        @NameInMap("ColorSchemeId")
        public Long colorSchemeId;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("CurrentSignInAt")
        public String currentSignInAt;

        @NameInMap("Department")
        public String department;

        @NameInMap("Email")
        public String email;

        @NameInMap("ExpiresAt")
        public String expiresAt;

        @NameInMap("ExternUid")
        public String externUid;

        @NameInMap("Id")
        public Long id;

        @NameInMap("IsAdmin")
        public Boolean isAdmin;

        @NameInMap("Name")
        public String name;

        @NameInMap("PrivateToken")
        public String privateToken;

        @NameInMap("ProjectsLimit")
        public Long projectsLimit;

        @NameInMap("Registered")
        public Boolean registered;

        @NameInMap("Role")
        public Long role;

        @NameInMap("State")
        public String state;

        @NameInMap("ThemeId")
        public Long themeId;

        @NameInMap("UpdatedAt")
        public String updatedAt;

        @NameInMap("Username")
        public String username;

        @NameInMap("WebsiteUrl")
        public String websiteUrl;

        @NameInMap("WebUrl")
        public String webUrl;

        @NameInMap("Identities")
        public java.util.List<String> identities;

        public static UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyAssignee build(java.util.Map<String, ?> map) throws Exception {
            UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyAssignee self = new UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyAssignee();
            return TeaModel.build(map, self);
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyAssignee setAccessLevel(Long accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }
        public Long getAccessLevel() {
            return this.accessLevel;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyAssignee setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyAssignee setBio(String bio) {
            this.bio = bio;
            return this;
        }
        public String getBio() {
            return this.bio;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyAssignee setCanCreateGroup(Boolean canCreateGroup) {
            this.canCreateGroup = canCreateGroup;
            return this;
        }
        public Boolean getCanCreateGroup() {
            return this.canCreateGroup;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyAssignee setCanCreateProject(Boolean canCreateProject) {
            this.canCreateProject = canCreateProject;
            return this;
        }
        public Boolean getCanCreateProject() {
            return this.canCreateProject;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyAssignee setColorSchemeId(Long colorSchemeId) {
            this.colorSchemeId = colorSchemeId;
            return this;
        }
        public Long getColorSchemeId() {
            return this.colorSchemeId;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyAssignee setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyAssignee setCurrentSignInAt(String currentSignInAt) {
            this.currentSignInAt = currentSignInAt;
            return this;
        }
        public String getCurrentSignInAt() {
            return this.currentSignInAt;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyAssignee setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyAssignee setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyAssignee setExpiresAt(String expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }
        public String getExpiresAt() {
            return this.expiresAt;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyAssignee setExternUid(String externUid) {
            this.externUid = externUid;
            return this;
        }
        public String getExternUid() {
            return this.externUid;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyAssignee setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyAssignee setIsAdmin(Boolean isAdmin) {
            this.isAdmin = isAdmin;
            return this;
        }
        public Boolean getIsAdmin() {
            return this.isAdmin;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyAssignee setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyAssignee setPrivateToken(String privateToken) {
            this.privateToken = privateToken;
            return this;
        }
        public String getPrivateToken() {
            return this.privateToken;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyAssignee setProjectsLimit(Long projectsLimit) {
            this.projectsLimit = projectsLimit;
            return this;
        }
        public Long getProjectsLimit() {
            return this.projectsLimit;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyAssignee setRegistered(Boolean registered) {
            this.registered = registered;
            return this;
        }
        public Boolean getRegistered() {
            return this.registered;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyAssignee setRole(Long role) {
            this.role = role;
            return this;
        }
        public Long getRole() {
            return this.role;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyAssignee setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyAssignee setThemeId(Long themeId) {
            this.themeId = themeId;
            return this;
        }
        public Long getThemeId() {
            return this.themeId;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyAssignee setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyAssignee setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyAssignee setWebsiteUrl(String websiteUrl) {
            this.websiteUrl = websiteUrl;
            return this;
        }
        public String getWebsiteUrl() {
            return this.websiteUrl;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyAssignee setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyAssignee setIdentities(java.util.List<String> identities) {
            this.identities = identities;
            return this;
        }
        public java.util.List<String> getIdentities() {
            return this.identities;
        }

    }

    public static class UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyAuthor extends TeaModel {
        @NameInMap("AccessLevel")
        public Long accessLevel;

        @NameInMap("AvatarUrl")
        public String avatarUrl;

        @NameInMap("Bio")
        public String bio;

        @NameInMap("CanCreateGroup")
        public Boolean canCreateGroup;

        @NameInMap("CanCreateProject")
        public Boolean canCreateProject;

        @NameInMap("ColorSchemeId")
        public Long colorSchemeId;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("CurrentSignInAt")
        public String currentSignInAt;

        @NameInMap("Department")
        public String department;

        @NameInMap("Email")
        public String email;

        @NameInMap("ExpiresAt")
        public String expiresAt;

        @NameInMap("ExternUid")
        public String externUid;

        @NameInMap("Id")
        public Long id;

        @NameInMap("IsAdmin")
        public Boolean isAdmin;

        @NameInMap("Name")
        public String name;

        @NameInMap("PrivateToken")
        public String privateToken;

        @NameInMap("ProjectsLimit")
        public Long projectsLimit;

        @NameInMap("Registered")
        public Boolean registered;

        @NameInMap("Role")
        public Long role;

        @NameInMap("State")
        public String state;

        @NameInMap("ThemeId")
        public Long themeId;

        @NameInMap("UpdatedAt")
        public String updatedAt;

        @NameInMap("Username")
        public String username;

        @NameInMap("WebsiteUrl")
        public String websiteUrl;

        @NameInMap("WebUrl")
        public String webUrl;

        @NameInMap("Identities")
        public java.util.List<String> identities;

        public static UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyAuthor build(java.util.Map<String, ?> map) throws Exception {
            UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyAuthor self = new UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyAuthor();
            return TeaModel.build(map, self);
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyAuthor setAccessLevel(Long accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }
        public Long getAccessLevel() {
            return this.accessLevel;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyAuthor setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyAuthor setBio(String bio) {
            this.bio = bio;
            return this;
        }
        public String getBio() {
            return this.bio;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyAuthor setCanCreateGroup(Boolean canCreateGroup) {
            this.canCreateGroup = canCreateGroup;
            return this;
        }
        public Boolean getCanCreateGroup() {
            return this.canCreateGroup;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyAuthor setCanCreateProject(Boolean canCreateProject) {
            this.canCreateProject = canCreateProject;
            return this;
        }
        public Boolean getCanCreateProject() {
            return this.canCreateProject;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyAuthor setColorSchemeId(Long colorSchemeId) {
            this.colorSchemeId = colorSchemeId;
            return this;
        }
        public Long getColorSchemeId() {
            return this.colorSchemeId;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyAuthor setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyAuthor setCurrentSignInAt(String currentSignInAt) {
            this.currentSignInAt = currentSignInAt;
            return this;
        }
        public String getCurrentSignInAt() {
            return this.currentSignInAt;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyAuthor setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyAuthor setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyAuthor setExpiresAt(String expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }
        public String getExpiresAt() {
            return this.expiresAt;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyAuthor setExternUid(String externUid) {
            this.externUid = externUid;
            return this;
        }
        public String getExternUid() {
            return this.externUid;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyAuthor setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyAuthor setIsAdmin(Boolean isAdmin) {
            this.isAdmin = isAdmin;
            return this;
        }
        public Boolean getIsAdmin() {
            return this.isAdmin;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyAuthor setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyAuthor setPrivateToken(String privateToken) {
            this.privateToken = privateToken;
            return this;
        }
        public String getPrivateToken() {
            return this.privateToken;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyAuthor setProjectsLimit(Long projectsLimit) {
            this.projectsLimit = projectsLimit;
            return this;
        }
        public Long getProjectsLimit() {
            return this.projectsLimit;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyAuthor setRegistered(Boolean registered) {
            this.registered = registered;
            return this;
        }
        public Boolean getRegistered() {
            return this.registered;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyAuthor setRole(Long role) {
            this.role = role;
            return this;
        }
        public Long getRole() {
            return this.role;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyAuthor setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyAuthor setThemeId(Long themeId) {
            this.themeId = themeId;
            return this;
        }
        public Long getThemeId() {
            return this.themeId;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyAuthor setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyAuthor setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyAuthor setWebsiteUrl(String websiteUrl) {
            this.websiteUrl = websiteUrl;
            return this;
        }
        public String getWebsiteUrl() {
            return this.websiteUrl;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyAuthor setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyAuthor setIdentities(java.util.List<String> identities) {
            this.identities = identities;
            return this;
        }
        public java.util.List<String> getIdentities() {
            return this.identities;
        }

    }

    public static class UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyLastCommit extends TeaModel {
        @NameInMap("Author")
        public String author;

        @NameInMap("Id")
        public String id;

        @NameInMap("Message")
        public String message;

        @NameInMap("Timestamp")
        public String timestamp;

        @NameInMap("Url")
        public String url;

        public static UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyLastCommit build(java.util.Map<String, ?> map) throws Exception {
            UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyLastCommit self = new UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyLastCommit();
            return TeaModel.build(map, self);
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyLastCommit setAuthor(String author) {
            this.author = author;
            return this;
        }
        public String getAuthor() {
            return this.author;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyLastCommit setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyLastCommit setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyLastCommit setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyLastCommit setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyMergedBy extends TeaModel {
        @NameInMap("AccessLevel")
        public Long accessLevel;

        @NameInMap("AvatarUrl")
        public String avatarUrl;

        @NameInMap("Bio")
        public String bio;

        @NameInMap("CanCreateGroup")
        public Boolean canCreateGroup;

        @NameInMap("CanCreateProject")
        public Boolean canCreateProject;

        @NameInMap("ColorSchemeId")
        public Long colorSchemeId;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("CurrentSignInAt")
        public String currentSignInAt;

        @NameInMap("Department")
        public String department;

        @NameInMap("Email")
        public String email;

        @NameInMap("ExpiresAt")
        public String expiresAt;

        @NameInMap("ExternUid")
        public String externUid;

        @NameInMap("Id")
        public Long id;

        @NameInMap("IsAdmin")
        public Boolean isAdmin;

        @NameInMap("Name")
        public String name;

        @NameInMap("PrivateToken")
        public String privateToken;

        @NameInMap("ProjectsLimit")
        public Long projectsLimit;

        @NameInMap("Registered")
        public Boolean registered;

        @NameInMap("Role")
        public Long role;

        @NameInMap("State")
        public String state;

        @NameInMap("ThemeId")
        public Long themeId;

        @NameInMap("UpdatedAt")
        public String updatedAt;

        @NameInMap("Username")
        public String username;

        @NameInMap("WebsiteUrl")
        public String websiteUrl;

        @NameInMap("WebUrl")
        public String webUrl;

        @NameInMap("Identities")
        public java.util.List<String> identities;

        public static UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyMergedBy build(java.util.Map<String, ?> map) throws Exception {
            UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyMergedBy self = new UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyMergedBy();
            return TeaModel.build(map, self);
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyMergedBy setAccessLevel(Long accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }
        public Long getAccessLevel() {
            return this.accessLevel;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyMergedBy setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyMergedBy setBio(String bio) {
            this.bio = bio;
            return this;
        }
        public String getBio() {
            return this.bio;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyMergedBy setCanCreateGroup(Boolean canCreateGroup) {
            this.canCreateGroup = canCreateGroup;
            return this;
        }
        public Boolean getCanCreateGroup() {
            return this.canCreateGroup;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyMergedBy setCanCreateProject(Boolean canCreateProject) {
            this.canCreateProject = canCreateProject;
            return this;
        }
        public Boolean getCanCreateProject() {
            return this.canCreateProject;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyMergedBy setColorSchemeId(Long colorSchemeId) {
            this.colorSchemeId = colorSchemeId;
            return this;
        }
        public Long getColorSchemeId() {
            return this.colorSchemeId;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyMergedBy setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyMergedBy setCurrentSignInAt(String currentSignInAt) {
            this.currentSignInAt = currentSignInAt;
            return this;
        }
        public String getCurrentSignInAt() {
            return this.currentSignInAt;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyMergedBy setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyMergedBy setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyMergedBy setExpiresAt(String expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }
        public String getExpiresAt() {
            return this.expiresAt;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyMergedBy setExternUid(String externUid) {
            this.externUid = externUid;
            return this;
        }
        public String getExternUid() {
            return this.externUid;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyMergedBy setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyMergedBy setIsAdmin(Boolean isAdmin) {
            this.isAdmin = isAdmin;
            return this;
        }
        public Boolean getIsAdmin() {
            return this.isAdmin;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyMergedBy setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyMergedBy setPrivateToken(String privateToken) {
            this.privateToken = privateToken;
            return this;
        }
        public String getPrivateToken() {
            return this.privateToken;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyMergedBy setProjectsLimit(Long projectsLimit) {
            this.projectsLimit = projectsLimit;
            return this;
        }
        public Long getProjectsLimit() {
            return this.projectsLimit;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyMergedBy setRegistered(Boolean registered) {
            this.registered = registered;
            return this;
        }
        public Boolean getRegistered() {
            return this.registered;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyMergedBy setRole(Long role) {
            this.role = role;
            return this;
        }
        public Long getRole() {
            return this.role;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyMergedBy setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyMergedBy setThemeId(Long themeId) {
            this.themeId = themeId;
            return this;
        }
        public Long getThemeId() {
            return this.themeId;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyMergedBy setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyMergedBy setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyMergedBy setWebsiteUrl(String websiteUrl) {
            this.websiteUrl = websiteUrl;
            return this;
        }
        public String getWebsiteUrl() {
            return this.websiteUrl;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyMergedBy setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyMergedBy setIdentities(java.util.List<String> identities) {
            this.identities = identities;
            return this;
        }
        public java.util.List<String> getIdentities() {
            return this.identities;
        }

    }

    public static class UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyReview extends TeaModel {
        @NameInMap("Author")
        public String author;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("Description")
        public String description;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Iid")
        public Long iid;

        @NameInMap("Rule")
        public String rule;

        @NameInMap("RulesType")
        public String rulesType;

        @NameInMap("SourceBranch")
        public String sourceBranch;

        @NameInMap("SourceProject")
        public String sourceProject;

        @NameInMap("State")
        public String state;

        @NameInMap("StateDetail")
        public String stateDetail;

        @NameInMap("TargetBranch")
        public String targetBranch;

        @NameInMap("TargetProject")
        public String targetProject;

        @NameInMap("ThresholdClear")
        public Boolean thresholdClear;

        @NameInMap("Title")
        public String title;

        @NameInMap("Type")
        public String type;

        @NameInMap("UpdatedAt")
        public String updatedAt;

        @NameInMap("Reviewers")
        public java.util.List<String> reviewers;

        @NameInMap("Tasks")
        public java.util.List<String> tasks;

        public static UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyReview build(java.util.Map<String, ?> map) throws Exception {
            UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyReview self = new UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyReview();
            return TeaModel.build(map, self);
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyReview setAuthor(String author) {
            this.author = author;
            return this;
        }
        public String getAuthor() {
            return this.author;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyReview setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyReview setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyReview setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyReview setIid(Long iid) {
            this.iid = iid;
            return this;
        }
        public Long getIid() {
            return this.iid;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyReview setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyReview setRulesType(String rulesType) {
            this.rulesType = rulesType;
            return this;
        }
        public String getRulesType() {
            return this.rulesType;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyReview setSourceBranch(String sourceBranch) {
            this.sourceBranch = sourceBranch;
            return this;
        }
        public String getSourceBranch() {
            return this.sourceBranch;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyReview setSourceProject(String sourceProject) {
            this.sourceProject = sourceProject;
            return this;
        }
        public String getSourceProject() {
            return this.sourceProject;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyReview setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyReview setStateDetail(String stateDetail) {
            this.stateDetail = stateDetail;
            return this;
        }
        public String getStateDetail() {
            return this.stateDetail;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyReview setTargetBranch(String targetBranch) {
            this.targetBranch = targetBranch;
            return this;
        }
        public String getTargetBranch() {
            return this.targetBranch;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyReview setTargetProject(String targetProject) {
            this.targetProject = targetProject;
            return this;
        }
        public String getTargetProject() {
            return this.targetProject;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyReview setThresholdClear(Boolean thresholdClear) {
            this.thresholdClear = thresholdClear;
            return this;
        }
        public Boolean getThresholdClear() {
            return this.thresholdClear;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyReview setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyReview setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyReview setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyReview setReviewers(java.util.List<String> reviewers) {
            this.reviewers = reviewers;
            return this;
        }
        public java.util.List<String> getReviewers() {
            return this.reviewers;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyReview setTasks(java.util.List<String> tasks) {
            this.tasks = tasks;
            return this;
        }
        public java.util.List<String> getTasks() {
            return this.tasks;
        }

    }

    public static class UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodySource extends TeaModel {
        @NameInMap("HttpUrl")
        public String httpUrl;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("NameWithNamespace")
        public String nameWithNamespace;

        @NameInMap("Path")
        public String path;

        @NameInMap("PathWithNamespace")
        public String pathWithNamespace;

        @NameInMap("SshUrl")
        public String sshUrl;

        @NameInMap("VisibilityLevel")
        public Long visibilityLevel;

        @NameInMap("WebUrl")
        public String webUrl;

        public static UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodySource build(java.util.Map<String, ?> map) throws Exception {
            UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodySource self = new UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodySource();
            return TeaModel.build(map, self);
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodySource setHttpUrl(String httpUrl) {
            this.httpUrl = httpUrl;
            return this;
        }
        public String getHttpUrl() {
            return this.httpUrl;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodySource setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodySource setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodySource setNameWithNamespace(String nameWithNamespace) {
            this.nameWithNamespace = nameWithNamespace;
            return this;
        }
        public String getNameWithNamespace() {
            return this.nameWithNamespace;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodySource setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodySource setPathWithNamespace(String pathWithNamespace) {
            this.pathWithNamespace = pathWithNamespace;
            return this;
        }
        public String getPathWithNamespace() {
            return this.pathWithNamespace;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodySource setSshUrl(String sshUrl) {
            this.sshUrl = sshUrl;
            return this;
        }
        public String getSshUrl() {
            return this.sshUrl;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodySource setVisibilityLevel(Long visibilityLevel) {
            this.visibilityLevel = visibilityLevel;
            return this;
        }
        public Long getVisibilityLevel() {
            return this.visibilityLevel;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodySource setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

    }

    public static class UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyTarget extends TeaModel {
        @NameInMap("HttpUrl")
        public String httpUrl;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("NameWithNamespace")
        public String nameWithNamespace;

        @NameInMap("Path")
        public String path;

        @NameInMap("PathWithNamespace")
        public String pathWithNamespace;

        @NameInMap("SshUrl")
        public String sshUrl;

        @NameInMap("VisibilityLevel")
        public Long visibilityLevel;

        @NameInMap("WebUrl")
        public String webUrl;

        public static UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyTarget build(java.util.Map<String, ?> map) throws Exception {
            UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyTarget self = new UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyTarget();
            return TeaModel.build(map, self);
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyTarget setHttpUrl(String httpUrl) {
            this.httpUrl = httpUrl;
            return this;
        }
        public String getHttpUrl() {
            return this.httpUrl;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyTarget setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyTarget setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyTarget setNameWithNamespace(String nameWithNamespace) {
            this.nameWithNamespace = nameWithNamespace;
            return this;
        }
        public String getNameWithNamespace() {
            return this.nameWithNamespace;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyTarget setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyTarget setPathWithNamespace(String pathWithNamespace) {
            this.pathWithNamespace = pathWithNamespace;
            return this;
        }
        public String getPathWithNamespace() {
            return this.pathWithNamespace;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyTarget setSshUrl(String sshUrl) {
            this.sshUrl = sshUrl;
            return this;
        }
        public String getSshUrl() {
            return this.sshUrl;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyTarget setVisibilityLevel(Long visibilityLevel) {
            this.visibilityLevel = visibilityLevel;
            return this;
        }
        public Long getVisibilityLevel() {
            return this.visibilityLevel;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyTarget setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

    }

    public static class UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyUpdatedBy extends TeaModel {
        @NameInMap("AccessLevel")
        public Long accessLevel;

        @NameInMap("AvatarUrl")
        public String avatarUrl;

        @NameInMap("Bio")
        public String bio;

        @NameInMap("CanCreateGroup")
        public Boolean canCreateGroup;

        @NameInMap("CanCreateProject")
        public Boolean canCreateProject;

        @NameInMap("ColorSchemeId")
        public Long colorSchemeId;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("CurrentSignInAt")
        public String currentSignInAt;

        @NameInMap("Department")
        public String department;

        @NameInMap("Email")
        public String email;

        @NameInMap("ExpiresAt")
        public String expiresAt;

        @NameInMap("ExternUid")
        public String externUid;

        @NameInMap("Id")
        public Long id;

        @NameInMap("IsAdmin")
        public Boolean isAdmin;

        @NameInMap("Name")
        public String name;

        @NameInMap("PrivateToken")
        public String privateToken;

        @NameInMap("ProjectsLimit")
        public Long projectsLimit;

        @NameInMap("Registered")
        public Boolean registered;

        @NameInMap("Role")
        public Long role;

        @NameInMap("State")
        public String state;

        @NameInMap("ThemeId")
        public Long themeId;

        @NameInMap("UpdatedAt")
        public String updatedAt;

        @NameInMap("Username")
        public String username;

        @NameInMap("WebsiteUrl")
        public String websiteUrl;

        @NameInMap("WebUrl")
        public String webUrl;

        @NameInMap("Identities")
        public java.util.List<String> identities;

        public static UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyUpdatedBy build(java.util.Map<String, ?> map) throws Exception {
            UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyUpdatedBy self = new UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyUpdatedBy();
            return TeaModel.build(map, self);
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyUpdatedBy setAccessLevel(Long accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }
        public Long getAccessLevel() {
            return this.accessLevel;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyUpdatedBy setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyUpdatedBy setBio(String bio) {
            this.bio = bio;
            return this;
        }
        public String getBio() {
            return this.bio;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyUpdatedBy setCanCreateGroup(Boolean canCreateGroup) {
            this.canCreateGroup = canCreateGroup;
            return this;
        }
        public Boolean getCanCreateGroup() {
            return this.canCreateGroup;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyUpdatedBy setCanCreateProject(Boolean canCreateProject) {
            this.canCreateProject = canCreateProject;
            return this;
        }
        public Boolean getCanCreateProject() {
            return this.canCreateProject;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyUpdatedBy setColorSchemeId(Long colorSchemeId) {
            this.colorSchemeId = colorSchemeId;
            return this;
        }
        public Long getColorSchemeId() {
            return this.colorSchemeId;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyUpdatedBy setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyUpdatedBy setCurrentSignInAt(String currentSignInAt) {
            this.currentSignInAt = currentSignInAt;
            return this;
        }
        public String getCurrentSignInAt() {
            return this.currentSignInAt;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyUpdatedBy setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyUpdatedBy setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyUpdatedBy setExpiresAt(String expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }
        public String getExpiresAt() {
            return this.expiresAt;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyUpdatedBy setExternUid(String externUid) {
            this.externUid = externUid;
            return this;
        }
        public String getExternUid() {
            return this.externUid;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyUpdatedBy setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyUpdatedBy setIsAdmin(Boolean isAdmin) {
            this.isAdmin = isAdmin;
            return this;
        }
        public Boolean getIsAdmin() {
            return this.isAdmin;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyUpdatedBy setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyUpdatedBy setPrivateToken(String privateToken) {
            this.privateToken = privateToken;
            return this;
        }
        public String getPrivateToken() {
            return this.privateToken;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyUpdatedBy setProjectsLimit(Long projectsLimit) {
            this.projectsLimit = projectsLimit;
            return this;
        }
        public Long getProjectsLimit() {
            return this.projectsLimit;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyUpdatedBy setRegistered(Boolean registered) {
            this.registered = registered;
            return this;
        }
        public Boolean getRegistered() {
            return this.registered;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyUpdatedBy setRole(Long role) {
            this.role = role;
            return this;
        }
        public Long getRole() {
            return this.role;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyUpdatedBy setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyUpdatedBy setThemeId(Long themeId) {
            this.themeId = themeId;
            return this;
        }
        public Long getThemeId() {
            return this.themeId;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyUpdatedBy setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyUpdatedBy setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyUpdatedBy setWebsiteUrl(String websiteUrl) {
            this.websiteUrl = websiteUrl;
            return this;
        }
        public String getWebsiteUrl() {
            return this.websiteUrl;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyUpdatedBy setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

        public UpdateLinkeantcodeAntcodeUpdateprojectpullrequestResponseBodyUpdatedBy setIdentities(java.util.List<String> identities) {
            this.identities = identities;
            return this;
        }
        public java.util.List<String> getIdentities() {
            return this.identities;
        }

    }

}
