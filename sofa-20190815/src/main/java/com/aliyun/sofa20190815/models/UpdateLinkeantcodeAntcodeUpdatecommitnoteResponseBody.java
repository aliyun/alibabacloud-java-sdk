// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("CommitId")
    public String commitId;

    @NameInMap("CreatedAt")
    public String createdAt;

    @NameInMap("DiscussionId")
    public Long discussionId;

    @NameInMap("Id")
    public Long id;

    @NameInMap("IsAward")
    public Boolean isAward;

    @NameInMap("LineCode")
    public String lineCode;

    @NameInMap("LineType")
    public String lineType;

    @NameInMap("Note")
    public String note;

    @NameInMap("NoteableId")
    public Long noteableId;

    @NameInMap("NoteableType")
    public String noteableType;

    @NameInMap("Outdated")
    public Boolean outdated;

    @NameInMap("Path")
    public String path;

    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("ResolvedAt")
    public String resolvedAt;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("State")
    public String state;

    @NameInMap("System")
    public Boolean system;

    @NameInMap("Type")
    public String type;

    @NameInMap("UpdatedAt")
    public String updatedAt;

    @NameInMap("Url")
    public String url;

    @NameInMap("Labels")
    public java.util.List<String> labels;

    @NameInMap("Discussions")
    public java.util.List<UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyDiscussions> discussions;

    @NameInMap("Author")
    public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyAuthor author;

    @NameInMap("LatestStDiff")
    public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyLatestStDiff latestStDiff;

    @NameInMap("ResolvedBy")
    public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyResolvedBy resolvedBy;

    @NameInMap("StDiff")
    public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyStDiff stDiff;

    public static UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBody self = new UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBody setCommitId(String commitId) {
        this.commitId = commitId;
        return this;
    }
    public String getCommitId() {
        return this.commitId;
    }

    public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBody setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBody setDiscussionId(Long discussionId) {
        this.discussionId = discussionId;
        return this;
    }
    public Long getDiscussionId() {
        return this.discussionId;
    }

    public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBody setIsAward(Boolean isAward) {
        this.isAward = isAward;
        return this;
    }
    public Boolean getIsAward() {
        return this.isAward;
    }

    public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBody setLineCode(String lineCode) {
        this.lineCode = lineCode;
        return this;
    }
    public String getLineCode() {
        return this.lineCode;
    }

    public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBody setLineType(String lineType) {
        this.lineType = lineType;
        return this;
    }
    public String getLineType() {
        return this.lineType;
    }

    public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBody setNote(String note) {
        this.note = note;
        return this;
    }
    public String getNote() {
        return this.note;
    }

    public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBody setNoteableId(Long noteableId) {
        this.noteableId = noteableId;
        return this;
    }
    public Long getNoteableId() {
        return this.noteableId;
    }

    public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBody setNoteableType(String noteableType) {
        this.noteableType = noteableType;
        return this;
    }
    public String getNoteableType() {
        return this.noteableType;
    }

    public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBody setOutdated(Boolean outdated) {
        this.outdated = outdated;
        return this;
    }
    public Boolean getOutdated() {
        return this.outdated;
    }

    public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBody setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBody setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBody setResolvedAt(String resolvedAt) {
        this.resolvedAt = resolvedAt;
        return this;
    }
    public String getResolvedAt() {
        return this.resolvedAt;
    }

    public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBody setSystem(Boolean system) {
        this.system = system;
        return this;
    }
    public Boolean getSystem() {
        return this.system;
    }

    public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBody setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBody setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBody setLabels(java.util.List<String> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<String> getLabels() {
        return this.labels;
    }

    public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBody setDiscussions(java.util.List<UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyDiscussions> discussions) {
        this.discussions = discussions;
        return this;
    }
    public java.util.List<UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyDiscussions> getDiscussions() {
        return this.discussions;
    }

    public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBody setAuthor(UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyAuthor author) {
        this.author = author;
        return this;
    }
    public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyAuthor getAuthor() {
        return this.author;
    }

    public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBody setLatestStDiff(UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyLatestStDiff latestStDiff) {
        this.latestStDiff = latestStDiff;
        return this;
    }
    public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyLatestStDiff getLatestStDiff() {
        return this.latestStDiff;
    }

    public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBody setResolvedBy(UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyResolvedBy resolvedBy) {
        this.resolvedBy = resolvedBy;
        return this;
    }
    public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyResolvedBy getResolvedBy() {
        return this.resolvedBy;
    }

    public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBody setStDiff(UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyStDiff stDiff) {
        this.stDiff = stDiff;
        return this;
    }
    public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyStDiff getStDiff() {
        return this.stDiff;
    }

    public static class UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyDiscussions extends TeaModel {
        @NameInMap("Author")
        public String author;

        @NameInMap("CommitId")
        public String commitId;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("DiscussionId")
        public Long discussionId;

        @NameInMap("Id")
        public Long id;

        @NameInMap("IsAward")
        public Boolean isAward;

        @NameInMap("LatestStDiff")
        public String latestStDiff;

        @NameInMap("LineCode")
        public String lineCode;

        @NameInMap("LineType")
        public String lineType;

        @NameInMap("Note")
        public String note;

        @NameInMap("NoteableId")
        public Long noteableId;

        @NameInMap("NoteableType")
        public String noteableType;

        @NameInMap("Outdated")
        public Boolean outdated;

        @NameInMap("Path")
        public String path;

        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("ResolvedAt")
        public String resolvedAt;

        @NameInMap("ResolvedBy")
        public String resolvedBy;

        @NameInMap("State")
        public String state;

        @NameInMap("StDiff")
        public String stDiff;

        @NameInMap("System")
        public Boolean system;

        @NameInMap("Type")
        public String type;

        @NameInMap("UpdatedAt")
        public String updatedAt;

        @NameInMap("Url")
        public String url;

        @NameInMap("Discussions")
        public java.util.List<String> discussions;

        @NameInMap("Labels")
        public java.util.List<String> labels;

        public static UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyDiscussions build(java.util.Map<String, ?> map) throws Exception {
            UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyDiscussions self = new UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyDiscussions();
            return TeaModel.build(map, self);
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyDiscussions setAuthor(String author) {
            this.author = author;
            return this;
        }
        public String getAuthor() {
            return this.author;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyDiscussions setCommitId(String commitId) {
            this.commitId = commitId;
            return this;
        }
        public String getCommitId() {
            return this.commitId;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyDiscussions setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyDiscussions setDiscussionId(Long discussionId) {
            this.discussionId = discussionId;
            return this;
        }
        public Long getDiscussionId() {
            return this.discussionId;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyDiscussions setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyDiscussions setIsAward(Boolean isAward) {
            this.isAward = isAward;
            return this;
        }
        public Boolean getIsAward() {
            return this.isAward;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyDiscussions setLatestStDiff(String latestStDiff) {
            this.latestStDiff = latestStDiff;
            return this;
        }
        public String getLatestStDiff() {
            return this.latestStDiff;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyDiscussions setLineCode(String lineCode) {
            this.lineCode = lineCode;
            return this;
        }
        public String getLineCode() {
            return this.lineCode;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyDiscussions setLineType(String lineType) {
            this.lineType = lineType;
            return this;
        }
        public String getLineType() {
            return this.lineType;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyDiscussions setNote(String note) {
            this.note = note;
            return this;
        }
        public String getNote() {
            return this.note;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyDiscussions setNoteableId(Long noteableId) {
            this.noteableId = noteableId;
            return this;
        }
        public Long getNoteableId() {
            return this.noteableId;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyDiscussions setNoteableType(String noteableType) {
            this.noteableType = noteableType;
            return this;
        }
        public String getNoteableType() {
            return this.noteableType;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyDiscussions setOutdated(Boolean outdated) {
            this.outdated = outdated;
            return this;
        }
        public Boolean getOutdated() {
            return this.outdated;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyDiscussions setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyDiscussions setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyDiscussions setResolvedAt(String resolvedAt) {
            this.resolvedAt = resolvedAt;
            return this;
        }
        public String getResolvedAt() {
            return this.resolvedAt;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyDiscussions setResolvedBy(String resolvedBy) {
            this.resolvedBy = resolvedBy;
            return this;
        }
        public String getResolvedBy() {
            return this.resolvedBy;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyDiscussions setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyDiscussions setStDiff(String stDiff) {
            this.stDiff = stDiff;
            return this;
        }
        public String getStDiff() {
            return this.stDiff;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyDiscussions setSystem(Boolean system) {
            this.system = system;
            return this;
        }
        public Boolean getSystem() {
            return this.system;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyDiscussions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyDiscussions setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyDiscussions setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyDiscussions setDiscussions(java.util.List<String> discussions) {
            this.discussions = discussions;
            return this;
        }
        public java.util.List<String> getDiscussions() {
            return this.discussions;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyDiscussions setLabels(java.util.List<String> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<String> getLabels() {
            return this.labels;
        }

    }

    public static class UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyAuthor extends TeaModel {
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

        public static UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyAuthor build(java.util.Map<String, ?> map) throws Exception {
            UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyAuthor self = new UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyAuthor();
            return TeaModel.build(map, self);
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyAuthor setAccessLevel(Long accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }
        public Long getAccessLevel() {
            return this.accessLevel;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyAuthor setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyAuthor setBio(String bio) {
            this.bio = bio;
            return this;
        }
        public String getBio() {
            return this.bio;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyAuthor setCanCreateGroup(Boolean canCreateGroup) {
            this.canCreateGroup = canCreateGroup;
            return this;
        }
        public Boolean getCanCreateGroup() {
            return this.canCreateGroup;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyAuthor setCanCreateProject(Boolean canCreateProject) {
            this.canCreateProject = canCreateProject;
            return this;
        }
        public Boolean getCanCreateProject() {
            return this.canCreateProject;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyAuthor setColorSchemeId(Long colorSchemeId) {
            this.colorSchemeId = colorSchemeId;
            return this;
        }
        public Long getColorSchemeId() {
            return this.colorSchemeId;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyAuthor setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyAuthor setCurrentSignInAt(String currentSignInAt) {
            this.currentSignInAt = currentSignInAt;
            return this;
        }
        public String getCurrentSignInAt() {
            return this.currentSignInAt;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyAuthor setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyAuthor setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyAuthor setExpiresAt(String expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }
        public String getExpiresAt() {
            return this.expiresAt;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyAuthor setExternUid(String externUid) {
            this.externUid = externUid;
            return this;
        }
        public String getExternUid() {
            return this.externUid;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyAuthor setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyAuthor setIsAdmin(Boolean isAdmin) {
            this.isAdmin = isAdmin;
            return this;
        }
        public Boolean getIsAdmin() {
            return this.isAdmin;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyAuthor setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyAuthor setPrivateToken(String privateToken) {
            this.privateToken = privateToken;
            return this;
        }
        public String getPrivateToken() {
            return this.privateToken;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyAuthor setProjectsLimit(Long projectsLimit) {
            this.projectsLimit = projectsLimit;
            return this;
        }
        public Long getProjectsLimit() {
            return this.projectsLimit;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyAuthor setRegistered(Boolean registered) {
            this.registered = registered;
            return this;
        }
        public Boolean getRegistered() {
            return this.registered;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyAuthor setRole(Long role) {
            this.role = role;
            return this;
        }
        public Long getRole() {
            return this.role;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyAuthor setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyAuthor setThemeId(Long themeId) {
            this.themeId = themeId;
            return this;
        }
        public Long getThemeId() {
            return this.themeId;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyAuthor setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyAuthor setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyAuthor setWebsiteUrl(String websiteUrl) {
            this.websiteUrl = websiteUrl;
            return this;
        }
        public String getWebsiteUrl() {
            return this.websiteUrl;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyAuthor setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyAuthor setIdentities(java.util.List<String> identities) {
            this.identities = identities;
            return this;
        }
        public java.util.List<String> getIdentities() {
            return this.identities;
        }

    }

    public static class UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyLatestStDiff extends TeaModel {
        @NameInMap("AddLineNum")
        public Long addLineNum;

        @NameInMap("Amode")
        public String amode;

        @NameInMap("AMode")
        public String AMode;

        @NameInMap("BinaryFile")
        public Boolean binaryFile;

        @NameInMap("Bmode")
        public String bmode;

        @NameInMap("BMode")
        public String BMode;

        @NameInMap("CharsetName")
        public String charsetName;

        @NameInMap("CompareDiffId")
        public Long compareDiffId;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("DeletedFile")
        public Boolean deletedFile;

        @NameInMap("DelLineNum")
        public Long delLineNum;

        @NameInMap("Diff")
        public String diff;

        @NameInMap("HighlightedDiff")
        public String highlightedDiff;

        @NameInMap("Id")
        public Long id;

        @NameInMap("NewFile")
        public Boolean newFile;

        @NameInMap("NewPath")
        public String newPath;

        @NameInMap("OldPath")
        public String oldPath;

        @NameInMap("RenamedFile")
        public Boolean renamedFile;

        @NameInMap("Suffix")
        public String suffix;

        @NameInMap("TooLarge")
        public Boolean tooLarge;

        @NameInMap("UpdatedAt")
        public String updatedAt;

        public static UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyLatestStDiff build(java.util.Map<String, ?> map) throws Exception {
            UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyLatestStDiff self = new UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyLatestStDiff();
            return TeaModel.build(map, self);
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyLatestStDiff setAddLineNum(Long addLineNum) {
            this.addLineNum = addLineNum;
            return this;
        }
        public Long getAddLineNum() {
            return this.addLineNum;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyLatestStDiff setAmode(String amode) {
            this.amode = amode;
            return this;
        }
        public String getAmode() {
            return this.amode;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyLatestStDiff setAMode(String AMode) {
            this.AMode = AMode;
            return this;
        }
        public String getAMode() {
            return this.AMode;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyLatestStDiff setBinaryFile(Boolean binaryFile) {
            this.binaryFile = binaryFile;
            return this;
        }
        public Boolean getBinaryFile() {
            return this.binaryFile;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyLatestStDiff setBmode(String bmode) {
            this.bmode = bmode;
            return this;
        }
        public String getBmode() {
            return this.bmode;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyLatestStDiff setBMode(String BMode) {
            this.BMode = BMode;
            return this;
        }
        public String getBMode() {
            return this.BMode;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyLatestStDiff setCharsetName(String charsetName) {
            this.charsetName = charsetName;
            return this;
        }
        public String getCharsetName() {
            return this.charsetName;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyLatestStDiff setCompareDiffId(Long compareDiffId) {
            this.compareDiffId = compareDiffId;
            return this;
        }
        public Long getCompareDiffId() {
            return this.compareDiffId;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyLatestStDiff setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyLatestStDiff setDeletedFile(Boolean deletedFile) {
            this.deletedFile = deletedFile;
            return this;
        }
        public Boolean getDeletedFile() {
            return this.deletedFile;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyLatestStDiff setDelLineNum(Long delLineNum) {
            this.delLineNum = delLineNum;
            return this;
        }
        public Long getDelLineNum() {
            return this.delLineNum;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyLatestStDiff setDiff(String diff) {
            this.diff = diff;
            return this;
        }
        public String getDiff() {
            return this.diff;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyLatestStDiff setHighlightedDiff(String highlightedDiff) {
            this.highlightedDiff = highlightedDiff;
            return this;
        }
        public String getHighlightedDiff() {
            return this.highlightedDiff;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyLatestStDiff setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyLatestStDiff setNewFile(Boolean newFile) {
            this.newFile = newFile;
            return this;
        }
        public Boolean getNewFile() {
            return this.newFile;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyLatestStDiff setNewPath(String newPath) {
            this.newPath = newPath;
            return this;
        }
        public String getNewPath() {
            return this.newPath;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyLatestStDiff setOldPath(String oldPath) {
            this.oldPath = oldPath;
            return this;
        }
        public String getOldPath() {
            return this.oldPath;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyLatestStDiff setRenamedFile(Boolean renamedFile) {
            this.renamedFile = renamedFile;
            return this;
        }
        public Boolean getRenamedFile() {
            return this.renamedFile;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyLatestStDiff setSuffix(String suffix) {
            this.suffix = suffix;
            return this;
        }
        public String getSuffix() {
            return this.suffix;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyLatestStDiff setTooLarge(Boolean tooLarge) {
            this.tooLarge = tooLarge;
            return this;
        }
        public Boolean getTooLarge() {
            return this.tooLarge;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyLatestStDiff setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

    }

    public static class UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyResolvedBy extends TeaModel {
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

        public static UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyResolvedBy build(java.util.Map<String, ?> map) throws Exception {
            UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyResolvedBy self = new UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyResolvedBy();
            return TeaModel.build(map, self);
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyResolvedBy setAccessLevel(Long accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }
        public Long getAccessLevel() {
            return this.accessLevel;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyResolvedBy setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyResolvedBy setBio(String bio) {
            this.bio = bio;
            return this;
        }
        public String getBio() {
            return this.bio;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyResolvedBy setCanCreateGroup(Boolean canCreateGroup) {
            this.canCreateGroup = canCreateGroup;
            return this;
        }
        public Boolean getCanCreateGroup() {
            return this.canCreateGroup;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyResolvedBy setCanCreateProject(Boolean canCreateProject) {
            this.canCreateProject = canCreateProject;
            return this;
        }
        public Boolean getCanCreateProject() {
            return this.canCreateProject;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyResolvedBy setColorSchemeId(Long colorSchemeId) {
            this.colorSchemeId = colorSchemeId;
            return this;
        }
        public Long getColorSchemeId() {
            return this.colorSchemeId;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyResolvedBy setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyResolvedBy setCurrentSignInAt(String currentSignInAt) {
            this.currentSignInAt = currentSignInAt;
            return this;
        }
        public String getCurrentSignInAt() {
            return this.currentSignInAt;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyResolvedBy setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyResolvedBy setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyResolvedBy setExpiresAt(String expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }
        public String getExpiresAt() {
            return this.expiresAt;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyResolvedBy setExternUid(String externUid) {
            this.externUid = externUid;
            return this;
        }
        public String getExternUid() {
            return this.externUid;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyResolvedBy setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyResolvedBy setIsAdmin(Boolean isAdmin) {
            this.isAdmin = isAdmin;
            return this;
        }
        public Boolean getIsAdmin() {
            return this.isAdmin;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyResolvedBy setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyResolvedBy setPrivateToken(String privateToken) {
            this.privateToken = privateToken;
            return this;
        }
        public String getPrivateToken() {
            return this.privateToken;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyResolvedBy setProjectsLimit(Long projectsLimit) {
            this.projectsLimit = projectsLimit;
            return this;
        }
        public Long getProjectsLimit() {
            return this.projectsLimit;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyResolvedBy setRegistered(Boolean registered) {
            this.registered = registered;
            return this;
        }
        public Boolean getRegistered() {
            return this.registered;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyResolvedBy setRole(Long role) {
            this.role = role;
            return this;
        }
        public Long getRole() {
            return this.role;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyResolvedBy setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyResolvedBy setThemeId(Long themeId) {
            this.themeId = themeId;
            return this;
        }
        public Long getThemeId() {
            return this.themeId;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyResolvedBy setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyResolvedBy setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyResolvedBy setWebsiteUrl(String websiteUrl) {
            this.websiteUrl = websiteUrl;
            return this;
        }
        public String getWebsiteUrl() {
            return this.websiteUrl;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyResolvedBy setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyResolvedBy setIdentities(java.util.List<String> identities) {
            this.identities = identities;
            return this;
        }
        public java.util.List<String> getIdentities() {
            return this.identities;
        }

    }

    public static class UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyStDiff extends TeaModel {
        @NameInMap("AddLineNum")
        public Long addLineNum;

        @NameInMap("Amode")
        public String amode;

        @NameInMap("AMode")
        public String AMode;

        @NameInMap("BinaryFile")
        public Boolean binaryFile;

        @NameInMap("Bmode")
        public String bmode;

        @NameInMap("BMode")
        public String BMode;

        @NameInMap("CharsetName")
        public String charsetName;

        @NameInMap("CompareDiffId")
        public Long compareDiffId;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("DeletedFile")
        public Boolean deletedFile;

        @NameInMap("DelLineNum")
        public Long delLineNum;

        @NameInMap("Diff")
        public String diff;

        @NameInMap("HighlightedDiff")
        public String highlightedDiff;

        @NameInMap("Id")
        public Long id;

        @NameInMap("NewFile")
        public Boolean newFile;

        @NameInMap("NewPath")
        public String newPath;

        @NameInMap("OldPath")
        public String oldPath;

        @NameInMap("RenamedFile")
        public Boolean renamedFile;

        @NameInMap("Suffix")
        public String suffix;

        @NameInMap("TooLarge")
        public Boolean tooLarge;

        @NameInMap("UpdatedAt")
        public String updatedAt;

        public static UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyStDiff build(java.util.Map<String, ?> map) throws Exception {
            UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyStDiff self = new UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyStDiff();
            return TeaModel.build(map, self);
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyStDiff setAddLineNum(Long addLineNum) {
            this.addLineNum = addLineNum;
            return this;
        }
        public Long getAddLineNum() {
            return this.addLineNum;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyStDiff setAmode(String amode) {
            this.amode = amode;
            return this;
        }
        public String getAmode() {
            return this.amode;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyStDiff setAMode(String AMode) {
            this.AMode = AMode;
            return this;
        }
        public String getAMode() {
            return this.AMode;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyStDiff setBinaryFile(Boolean binaryFile) {
            this.binaryFile = binaryFile;
            return this;
        }
        public Boolean getBinaryFile() {
            return this.binaryFile;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyStDiff setBmode(String bmode) {
            this.bmode = bmode;
            return this;
        }
        public String getBmode() {
            return this.bmode;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyStDiff setBMode(String BMode) {
            this.BMode = BMode;
            return this;
        }
        public String getBMode() {
            return this.BMode;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyStDiff setCharsetName(String charsetName) {
            this.charsetName = charsetName;
            return this;
        }
        public String getCharsetName() {
            return this.charsetName;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyStDiff setCompareDiffId(Long compareDiffId) {
            this.compareDiffId = compareDiffId;
            return this;
        }
        public Long getCompareDiffId() {
            return this.compareDiffId;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyStDiff setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyStDiff setDeletedFile(Boolean deletedFile) {
            this.deletedFile = deletedFile;
            return this;
        }
        public Boolean getDeletedFile() {
            return this.deletedFile;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyStDiff setDelLineNum(Long delLineNum) {
            this.delLineNum = delLineNum;
            return this;
        }
        public Long getDelLineNum() {
            return this.delLineNum;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyStDiff setDiff(String diff) {
            this.diff = diff;
            return this;
        }
        public String getDiff() {
            return this.diff;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyStDiff setHighlightedDiff(String highlightedDiff) {
            this.highlightedDiff = highlightedDiff;
            return this;
        }
        public String getHighlightedDiff() {
            return this.highlightedDiff;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyStDiff setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyStDiff setNewFile(Boolean newFile) {
            this.newFile = newFile;
            return this;
        }
        public Boolean getNewFile() {
            return this.newFile;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyStDiff setNewPath(String newPath) {
            this.newPath = newPath;
            return this;
        }
        public String getNewPath() {
            return this.newPath;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyStDiff setOldPath(String oldPath) {
            this.oldPath = oldPath;
            return this;
        }
        public String getOldPath() {
            return this.oldPath;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyStDiff setRenamedFile(Boolean renamedFile) {
            this.renamedFile = renamedFile;
            return this;
        }
        public Boolean getRenamedFile() {
            return this.renamedFile;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyStDiff setSuffix(String suffix) {
            this.suffix = suffix;
            return this;
        }
        public String getSuffix() {
            return this.suffix;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyStDiff setTooLarge(Boolean tooLarge) {
            this.tooLarge = tooLarge;
            return this;
        }
        public Boolean getTooLarge() {
            return this.tooLarge;
        }

        public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBodyStDiff setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

    }

}
