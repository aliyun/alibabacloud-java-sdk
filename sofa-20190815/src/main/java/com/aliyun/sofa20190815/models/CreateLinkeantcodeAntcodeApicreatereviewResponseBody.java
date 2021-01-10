// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeantcodeAntcodeApicreatereviewResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("CreatedAt")
    public String createdAt;

    @NameInMap("Author")
    public CreateLinkeantcodeAntcodeApicreatereviewResponseBodyAuthor author;

    @NameInMap("Id")
    public Long id;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("PullRequestId")
    public Long pullRequestId;

    @NameInMap("UpdatedAt")
    public String updatedAt;

    @NameInMap("Body")
    public String body;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("Pending")
    public Boolean pending;

    @NameInMap("ReviewNotes")
    public java.util.List<CreateLinkeantcodeAntcodeApicreatereviewResponseBodyReviewNotes> reviewNotes;

    public static CreateLinkeantcodeAntcodeApicreatereviewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeantcodeAntcodeApicreatereviewResponseBody self = new CreateLinkeantcodeAntcodeApicreatereviewResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLinkeantcodeAntcodeApicreatereviewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateLinkeantcodeAntcodeApicreatereviewResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public CreateLinkeantcodeAntcodeApicreatereviewResponseBody setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public CreateLinkeantcodeAntcodeApicreatereviewResponseBody setAuthor(CreateLinkeantcodeAntcodeApicreatereviewResponseBodyAuthor author) {
        this.author = author;
        return this;
    }
    public CreateLinkeantcodeAntcodeApicreatereviewResponseBodyAuthor getAuthor() {
        return this.author;
    }

    public CreateLinkeantcodeAntcodeApicreatereviewResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public CreateLinkeantcodeAntcodeApicreatereviewResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CreateLinkeantcodeAntcodeApicreatereviewResponseBody setPullRequestId(Long pullRequestId) {
        this.pullRequestId = pullRequestId;
        return this;
    }
    public Long getPullRequestId() {
        return this.pullRequestId;
    }

    public CreateLinkeantcodeAntcodeApicreatereviewResponseBody setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public CreateLinkeantcodeAntcodeApicreatereviewResponseBody setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public CreateLinkeantcodeAntcodeApicreatereviewResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateLinkeantcodeAntcodeApicreatereviewResponseBody setPending(Boolean pending) {
        this.pending = pending;
        return this;
    }
    public Boolean getPending() {
        return this.pending;
    }

    public CreateLinkeantcodeAntcodeApicreatereviewResponseBody setReviewNotes(java.util.List<CreateLinkeantcodeAntcodeApicreatereviewResponseBodyReviewNotes> reviewNotes) {
        this.reviewNotes = reviewNotes;
        return this;
    }
    public java.util.List<CreateLinkeantcodeAntcodeApicreatereviewResponseBodyReviewNotes> getReviewNotes() {
        return this.reviewNotes;
    }

    public static class CreateLinkeantcodeAntcodeApicreatereviewResponseBodyAuthor extends TeaModel {
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

        public static CreateLinkeantcodeAntcodeApicreatereviewResponseBodyAuthor build(java.util.Map<String, ?> map) throws Exception {
            CreateLinkeantcodeAntcodeApicreatereviewResponseBodyAuthor self = new CreateLinkeantcodeAntcodeApicreatereviewResponseBodyAuthor();
            return TeaModel.build(map, self);
        }

        public CreateLinkeantcodeAntcodeApicreatereviewResponseBodyAuthor setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public CreateLinkeantcodeAntcodeApicreatereviewResponseBodyAuthor setCurrentSignInAt(String currentSignInAt) {
            this.currentSignInAt = currentSignInAt;
            return this;
        }
        public String getCurrentSignInAt() {
            return this.currentSignInAt;
        }

        public CreateLinkeantcodeAntcodeApicreatereviewResponseBodyAuthor setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

        public CreateLinkeantcodeAntcodeApicreatereviewResponseBodyAuthor setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateLinkeantcodeAntcodeApicreatereviewResponseBodyAuthor setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public CreateLinkeantcodeAntcodeApicreatereviewResponseBodyAuthor setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public CreateLinkeantcodeAntcodeApicreatereviewResponseBodyAuthor setExternUid(String externUid) {
            this.externUid = externUid;
            return this;
        }
        public String getExternUid() {
            return this.externUid;
        }

        public CreateLinkeantcodeAntcodeApicreatereviewResponseBodyAuthor setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public CreateLinkeantcodeAntcodeApicreatereviewResponseBodyAuthor setThemeId(Long themeId) {
            this.themeId = themeId;
            return this;
        }
        public Long getThemeId() {
            return this.themeId;
        }

        public CreateLinkeantcodeAntcodeApicreatereviewResponseBodyAuthor setBio(String bio) {
            this.bio = bio;
            return this;
        }
        public String getBio() {
            return this.bio;
        }

        public CreateLinkeantcodeAntcodeApicreatereviewResponseBodyAuthor setCanCreateProject(Boolean canCreateProject) {
            this.canCreateProject = canCreateProject;
            return this;
        }
        public Boolean getCanCreateProject() {
            return this.canCreateProject;
        }

        public CreateLinkeantcodeAntcodeApicreatereviewResponseBodyAuthor setIsAdmin(Boolean isAdmin) {
            this.isAdmin = isAdmin;
            return this;
        }
        public Boolean getIsAdmin() {
            return this.isAdmin;
        }

        public CreateLinkeantcodeAntcodeApicreatereviewResponseBodyAuthor setCanCreateGroup(Boolean canCreateGroup) {
            this.canCreateGroup = canCreateGroup;
            return this;
        }
        public Boolean getCanCreateGroup() {
            return this.canCreateGroup;
        }

        public CreateLinkeantcodeAntcodeApicreatereviewResponseBodyAuthor setExpiresAt(String expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }
        public String getExpiresAt() {
            return this.expiresAt;
        }

        public CreateLinkeantcodeAntcodeApicreatereviewResponseBodyAuthor setProjectsLimit(Long projectsLimit) {
            this.projectsLimit = projectsLimit;
            return this;
        }
        public Long getProjectsLimit() {
            return this.projectsLimit;
        }

        public CreateLinkeantcodeAntcodeApicreatereviewResponseBodyAuthor setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public CreateLinkeantcodeAntcodeApicreatereviewResponseBodyAuthor setWebsiteUrl(String websiteUrl) {
            this.websiteUrl = websiteUrl;
            return this;
        }
        public String getWebsiteUrl() {
            return this.websiteUrl;
        }

        public CreateLinkeantcodeAntcodeApicreatereviewResponseBodyAuthor setIdentities(java.util.List<String> identities) {
            this.identities = identities;
            return this;
        }
        public java.util.List<String> getIdentities() {
            return this.identities;
        }

        public CreateLinkeantcodeAntcodeApicreatereviewResponseBodyAuthor setAccessLevel(Long accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }
        public Long getAccessLevel() {
            return this.accessLevel;
        }

        public CreateLinkeantcodeAntcodeApicreatereviewResponseBodyAuthor setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public CreateLinkeantcodeAntcodeApicreatereviewResponseBodyAuthor setRole(Long role) {
            this.role = role;
            return this;
        }
        public Long getRole() {
            return this.role;
        }

        public CreateLinkeantcodeAntcodeApicreatereviewResponseBodyAuthor setPrivateToken(String privateToken) {
            this.privateToken = privateToken;
            return this;
        }
        public String getPrivateToken() {
            return this.privateToken;
        }

        public CreateLinkeantcodeAntcodeApicreatereviewResponseBodyAuthor setRegistered(Boolean registered) {
            this.registered = registered;
            return this;
        }
        public Boolean getRegistered() {
            return this.registered;
        }

        public CreateLinkeantcodeAntcodeApicreatereviewResponseBodyAuthor setColorSchemeId(Long colorSchemeId) {
            this.colorSchemeId = colorSchemeId;
            return this;
        }
        public Long getColorSchemeId() {
            return this.colorSchemeId;
        }

        public CreateLinkeantcodeAntcodeApicreatereviewResponseBodyAuthor setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CreateLinkeantcodeAntcodeApicreatereviewResponseBodyAuthor setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class CreateLinkeantcodeAntcodeApicreatereviewResponseBodyReviewNotes extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("ResolvedBy")
        public String resolvedBy;

        @NameInMap("CommitId")
        public String commitId;

        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("Author")
        public String author;

        @NameInMap("NoteableType")
        public String noteableType;

        @NameInMap("Discussions")
        public java.util.List<String> discussions;

        @NameInMap("StDiff")
        public String stDiff;

        @NameInMap("Note")
        public String note;

        @NameInMap("NoteableId")
        public Long noteableId;

        @NameInMap("ResolvedAt")
        public String resolvedAt;

        @NameInMap("LatestStDiff")
        public String latestStDiff;

        @NameInMap("Labels")
        public java.util.List<String> labels;

        @NameInMap("State")
        public String state;

        @NameInMap("Outdated")
        public Boolean outdated;

        @NameInMap("IsAward")
        public Boolean isAward;

        @NameInMap("Url")
        public String url;

        @NameInMap("System")
        public Boolean system;

        @NameInMap("LineCode")
        public String lineCode;

        @NameInMap("Path")
        public String path;

        @NameInMap("UpdatedAt")
        public String updatedAt;

        @NameInMap("DiscussionId")
        public Long discussionId;

        @NameInMap("Id")
        public Long id;

        @NameInMap("LineType")
        public String lineType;

        public static CreateLinkeantcodeAntcodeApicreatereviewResponseBodyReviewNotes build(java.util.Map<String, ?> map) throws Exception {
            CreateLinkeantcodeAntcodeApicreatereviewResponseBodyReviewNotes self = new CreateLinkeantcodeAntcodeApicreatereviewResponseBodyReviewNotes();
            return TeaModel.build(map, self);
        }

        public CreateLinkeantcodeAntcodeApicreatereviewResponseBodyReviewNotes setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateLinkeantcodeAntcodeApicreatereviewResponseBodyReviewNotes setResolvedBy(String resolvedBy) {
            this.resolvedBy = resolvedBy;
            return this;
        }
        public String getResolvedBy() {
            return this.resolvedBy;
        }

        public CreateLinkeantcodeAntcodeApicreatereviewResponseBodyReviewNotes setCommitId(String commitId) {
            this.commitId = commitId;
            return this;
        }
        public String getCommitId() {
            return this.commitId;
        }

        public CreateLinkeantcodeAntcodeApicreatereviewResponseBodyReviewNotes setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public CreateLinkeantcodeAntcodeApicreatereviewResponseBodyReviewNotes setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public CreateLinkeantcodeAntcodeApicreatereviewResponseBodyReviewNotes setAuthor(String author) {
            this.author = author;
            return this;
        }
        public String getAuthor() {
            return this.author;
        }

        public CreateLinkeantcodeAntcodeApicreatereviewResponseBodyReviewNotes setNoteableType(String noteableType) {
            this.noteableType = noteableType;
            return this;
        }
        public String getNoteableType() {
            return this.noteableType;
        }

        public CreateLinkeantcodeAntcodeApicreatereviewResponseBodyReviewNotes setDiscussions(java.util.List<String> discussions) {
            this.discussions = discussions;
            return this;
        }
        public java.util.List<String> getDiscussions() {
            return this.discussions;
        }

        public CreateLinkeantcodeAntcodeApicreatereviewResponseBodyReviewNotes setStDiff(String stDiff) {
            this.stDiff = stDiff;
            return this;
        }
        public String getStDiff() {
            return this.stDiff;
        }

        public CreateLinkeantcodeAntcodeApicreatereviewResponseBodyReviewNotes setNote(String note) {
            this.note = note;
            return this;
        }
        public String getNote() {
            return this.note;
        }

        public CreateLinkeantcodeAntcodeApicreatereviewResponseBodyReviewNotes setNoteableId(Long noteableId) {
            this.noteableId = noteableId;
            return this;
        }
        public Long getNoteableId() {
            return this.noteableId;
        }

        public CreateLinkeantcodeAntcodeApicreatereviewResponseBodyReviewNotes setResolvedAt(String resolvedAt) {
            this.resolvedAt = resolvedAt;
            return this;
        }
        public String getResolvedAt() {
            return this.resolvedAt;
        }

        public CreateLinkeantcodeAntcodeApicreatereviewResponseBodyReviewNotes setLatestStDiff(String latestStDiff) {
            this.latestStDiff = latestStDiff;
            return this;
        }
        public String getLatestStDiff() {
            return this.latestStDiff;
        }

        public CreateLinkeantcodeAntcodeApicreatereviewResponseBodyReviewNotes setLabels(java.util.List<String> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<String> getLabels() {
            return this.labels;
        }

        public CreateLinkeantcodeAntcodeApicreatereviewResponseBodyReviewNotes setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public CreateLinkeantcodeAntcodeApicreatereviewResponseBodyReviewNotes setOutdated(Boolean outdated) {
            this.outdated = outdated;
            return this;
        }
        public Boolean getOutdated() {
            return this.outdated;
        }

        public CreateLinkeantcodeAntcodeApicreatereviewResponseBodyReviewNotes setIsAward(Boolean isAward) {
            this.isAward = isAward;
            return this;
        }
        public Boolean getIsAward() {
            return this.isAward;
        }

        public CreateLinkeantcodeAntcodeApicreatereviewResponseBodyReviewNotes setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public CreateLinkeantcodeAntcodeApicreatereviewResponseBodyReviewNotes setSystem(Boolean system) {
            this.system = system;
            return this;
        }
        public Boolean getSystem() {
            return this.system;
        }

        public CreateLinkeantcodeAntcodeApicreatereviewResponseBodyReviewNotes setLineCode(String lineCode) {
            this.lineCode = lineCode;
            return this;
        }
        public String getLineCode() {
            return this.lineCode;
        }

        public CreateLinkeantcodeAntcodeApicreatereviewResponseBodyReviewNotes setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public CreateLinkeantcodeAntcodeApicreatereviewResponseBodyReviewNotes setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public CreateLinkeantcodeAntcodeApicreatereviewResponseBodyReviewNotes setDiscussionId(Long discussionId) {
            this.discussionId = discussionId;
            return this;
        }
        public Long getDiscussionId() {
            return this.discussionId;
        }

        public CreateLinkeantcodeAntcodeApicreatereviewResponseBodyReviewNotes setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CreateLinkeantcodeAntcodeApicreatereviewResponseBodyReviewNotes setLineType(String lineType) {
            this.lineType = lineType;
            return this;
        }
        public String getLineType() {
            return this.lineType;
        }

    }

}
