// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBody extends TeaModel {
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
    public java.util.List<UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyDiscussions> discussions;

    @NameInMap("Author")
    public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyAuthor author;

    @NameInMap("LatestStDiff")
    public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyLatestStDiff latestStDiff;

    @NameInMap("ResolvedBy")
    public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyResolvedBy resolvedBy;

    @NameInMap("StDiff")
    public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyStDiff stDiff;

    public static UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBody self = new UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBody setCommitId(String commitId) {
        this.commitId = commitId;
        return this;
    }
    public String getCommitId() {
        return this.commitId;
    }

    public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBody setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBody setDiscussionId(Long discussionId) {
        this.discussionId = discussionId;
        return this;
    }
    public Long getDiscussionId() {
        return this.discussionId;
    }

    public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBody setIsAward(Boolean isAward) {
        this.isAward = isAward;
        return this;
    }
    public Boolean getIsAward() {
        return this.isAward;
    }

    public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBody setLineCode(String lineCode) {
        this.lineCode = lineCode;
        return this;
    }
    public String getLineCode() {
        return this.lineCode;
    }

    public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBody setLineType(String lineType) {
        this.lineType = lineType;
        return this;
    }
    public String getLineType() {
        return this.lineType;
    }

    public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBody setNote(String note) {
        this.note = note;
        return this;
    }
    public String getNote() {
        return this.note;
    }

    public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBody setNoteableId(Long noteableId) {
        this.noteableId = noteableId;
        return this;
    }
    public Long getNoteableId() {
        return this.noteableId;
    }

    public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBody setNoteableType(String noteableType) {
        this.noteableType = noteableType;
        return this;
    }
    public String getNoteableType() {
        return this.noteableType;
    }

    public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBody setOutdated(Boolean outdated) {
        this.outdated = outdated;
        return this;
    }
    public Boolean getOutdated() {
        return this.outdated;
    }

    public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBody setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBody setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBody setResolvedAt(String resolvedAt) {
        this.resolvedAt = resolvedAt;
        return this;
    }
    public String getResolvedAt() {
        return this.resolvedAt;
    }

    public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBody setSystem(Boolean system) {
        this.system = system;
        return this;
    }
    public Boolean getSystem() {
        return this.system;
    }

    public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBody setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBody setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBody setLabels(java.util.List<String> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<String> getLabels() {
        return this.labels;
    }

    public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBody setDiscussions(java.util.List<UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyDiscussions> discussions) {
        this.discussions = discussions;
        return this;
    }
    public java.util.List<UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyDiscussions> getDiscussions() {
        return this.discussions;
    }

    public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBody setAuthor(UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyAuthor author) {
        this.author = author;
        return this;
    }
    public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyAuthor getAuthor() {
        return this.author;
    }

    public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBody setLatestStDiff(UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyLatestStDiff latestStDiff) {
        this.latestStDiff = latestStDiff;
        return this;
    }
    public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyLatestStDiff getLatestStDiff() {
        return this.latestStDiff;
    }

    public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBody setResolvedBy(UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyResolvedBy resolvedBy) {
        this.resolvedBy = resolvedBy;
        return this;
    }
    public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyResolvedBy getResolvedBy() {
        return this.resolvedBy;
    }

    public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBody setStDiff(UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyStDiff stDiff) {
        this.stDiff = stDiff;
        return this;
    }
    public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyStDiff getStDiff() {
        return this.stDiff;
    }

    public static class UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyDiscussions extends TeaModel {
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

        public static UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyDiscussions build(java.util.Map<String, ?> map) throws Exception {
            UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyDiscussions self = new UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyDiscussions();
            return TeaModel.build(map, self);
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyDiscussions setAuthor(String author) {
            this.author = author;
            return this;
        }
        public String getAuthor() {
            return this.author;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyDiscussions setCommitId(String commitId) {
            this.commitId = commitId;
            return this;
        }
        public String getCommitId() {
            return this.commitId;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyDiscussions setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyDiscussions setDiscussionId(Long discussionId) {
            this.discussionId = discussionId;
            return this;
        }
        public Long getDiscussionId() {
            return this.discussionId;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyDiscussions setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyDiscussions setIsAward(Boolean isAward) {
            this.isAward = isAward;
            return this;
        }
        public Boolean getIsAward() {
            return this.isAward;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyDiscussions setLatestStDiff(String latestStDiff) {
            this.latestStDiff = latestStDiff;
            return this;
        }
        public String getLatestStDiff() {
            return this.latestStDiff;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyDiscussions setLineCode(String lineCode) {
            this.lineCode = lineCode;
            return this;
        }
        public String getLineCode() {
            return this.lineCode;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyDiscussions setLineType(String lineType) {
            this.lineType = lineType;
            return this;
        }
        public String getLineType() {
            return this.lineType;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyDiscussions setNote(String note) {
            this.note = note;
            return this;
        }
        public String getNote() {
            return this.note;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyDiscussions setNoteableId(Long noteableId) {
            this.noteableId = noteableId;
            return this;
        }
        public Long getNoteableId() {
            return this.noteableId;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyDiscussions setNoteableType(String noteableType) {
            this.noteableType = noteableType;
            return this;
        }
        public String getNoteableType() {
            return this.noteableType;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyDiscussions setOutdated(Boolean outdated) {
            this.outdated = outdated;
            return this;
        }
        public Boolean getOutdated() {
            return this.outdated;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyDiscussions setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyDiscussions setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyDiscussions setResolvedAt(String resolvedAt) {
            this.resolvedAt = resolvedAt;
            return this;
        }
        public String getResolvedAt() {
            return this.resolvedAt;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyDiscussions setResolvedBy(String resolvedBy) {
            this.resolvedBy = resolvedBy;
            return this;
        }
        public String getResolvedBy() {
            return this.resolvedBy;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyDiscussions setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyDiscussions setStDiff(String stDiff) {
            this.stDiff = stDiff;
            return this;
        }
        public String getStDiff() {
            return this.stDiff;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyDiscussions setSystem(Boolean system) {
            this.system = system;
            return this;
        }
        public Boolean getSystem() {
            return this.system;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyDiscussions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyDiscussions setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyDiscussions setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyDiscussions setDiscussions(java.util.List<String> discussions) {
            this.discussions = discussions;
            return this;
        }
        public java.util.List<String> getDiscussions() {
            return this.discussions;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyDiscussions setLabels(java.util.List<String> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<String> getLabels() {
            return this.labels;
        }

    }

    public static class UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyAuthor extends TeaModel {
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

        public static UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyAuthor build(java.util.Map<String, ?> map) throws Exception {
            UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyAuthor self = new UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyAuthor();
            return TeaModel.build(map, self);
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyAuthor setAccessLevel(Long accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }
        public Long getAccessLevel() {
            return this.accessLevel;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyAuthor setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyAuthor setBio(String bio) {
            this.bio = bio;
            return this;
        }
        public String getBio() {
            return this.bio;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyAuthor setCanCreateGroup(Boolean canCreateGroup) {
            this.canCreateGroup = canCreateGroup;
            return this;
        }
        public Boolean getCanCreateGroup() {
            return this.canCreateGroup;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyAuthor setCanCreateProject(Boolean canCreateProject) {
            this.canCreateProject = canCreateProject;
            return this;
        }
        public Boolean getCanCreateProject() {
            return this.canCreateProject;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyAuthor setColorSchemeId(Long colorSchemeId) {
            this.colorSchemeId = colorSchemeId;
            return this;
        }
        public Long getColorSchemeId() {
            return this.colorSchemeId;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyAuthor setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyAuthor setCurrentSignInAt(String currentSignInAt) {
            this.currentSignInAt = currentSignInAt;
            return this;
        }
        public String getCurrentSignInAt() {
            return this.currentSignInAt;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyAuthor setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyAuthor setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyAuthor setExpiresAt(String expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }
        public String getExpiresAt() {
            return this.expiresAt;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyAuthor setExternUid(String externUid) {
            this.externUid = externUid;
            return this;
        }
        public String getExternUid() {
            return this.externUid;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyAuthor setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyAuthor setIsAdmin(Boolean isAdmin) {
            this.isAdmin = isAdmin;
            return this;
        }
        public Boolean getIsAdmin() {
            return this.isAdmin;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyAuthor setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyAuthor setPrivateToken(String privateToken) {
            this.privateToken = privateToken;
            return this;
        }
        public String getPrivateToken() {
            return this.privateToken;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyAuthor setProjectsLimit(Long projectsLimit) {
            this.projectsLimit = projectsLimit;
            return this;
        }
        public Long getProjectsLimit() {
            return this.projectsLimit;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyAuthor setRegistered(Boolean registered) {
            this.registered = registered;
            return this;
        }
        public Boolean getRegistered() {
            return this.registered;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyAuthor setRole(Long role) {
            this.role = role;
            return this;
        }
        public Long getRole() {
            return this.role;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyAuthor setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyAuthor setThemeId(Long themeId) {
            this.themeId = themeId;
            return this;
        }
        public Long getThemeId() {
            return this.themeId;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyAuthor setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyAuthor setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyAuthor setWebsiteUrl(String websiteUrl) {
            this.websiteUrl = websiteUrl;
            return this;
        }
        public String getWebsiteUrl() {
            return this.websiteUrl;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyAuthor setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyAuthor setIdentities(java.util.List<String> identities) {
            this.identities = identities;
            return this;
        }
        public java.util.List<String> getIdentities() {
            return this.identities;
        }

    }

    public static class UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyLatestStDiff extends TeaModel {
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

        public static UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyLatestStDiff build(java.util.Map<String, ?> map) throws Exception {
            UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyLatestStDiff self = new UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyLatestStDiff();
            return TeaModel.build(map, self);
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyLatestStDiff setAddLineNum(Long addLineNum) {
            this.addLineNum = addLineNum;
            return this;
        }
        public Long getAddLineNum() {
            return this.addLineNum;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyLatestStDiff setAmode(String amode) {
            this.amode = amode;
            return this;
        }
        public String getAmode() {
            return this.amode;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyLatestStDiff setAMode(String AMode) {
            this.AMode = AMode;
            return this;
        }
        public String getAMode() {
            return this.AMode;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyLatestStDiff setBinaryFile(Boolean binaryFile) {
            this.binaryFile = binaryFile;
            return this;
        }
        public Boolean getBinaryFile() {
            return this.binaryFile;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyLatestStDiff setBmode(String bmode) {
            this.bmode = bmode;
            return this;
        }
        public String getBmode() {
            return this.bmode;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyLatestStDiff setBMode(String BMode) {
            this.BMode = BMode;
            return this;
        }
        public String getBMode() {
            return this.BMode;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyLatestStDiff setCharsetName(String charsetName) {
            this.charsetName = charsetName;
            return this;
        }
        public String getCharsetName() {
            return this.charsetName;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyLatestStDiff setCompareDiffId(Long compareDiffId) {
            this.compareDiffId = compareDiffId;
            return this;
        }
        public Long getCompareDiffId() {
            return this.compareDiffId;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyLatestStDiff setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyLatestStDiff setDeletedFile(Boolean deletedFile) {
            this.deletedFile = deletedFile;
            return this;
        }
        public Boolean getDeletedFile() {
            return this.deletedFile;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyLatestStDiff setDelLineNum(Long delLineNum) {
            this.delLineNum = delLineNum;
            return this;
        }
        public Long getDelLineNum() {
            return this.delLineNum;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyLatestStDiff setDiff(String diff) {
            this.diff = diff;
            return this;
        }
        public String getDiff() {
            return this.diff;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyLatestStDiff setHighlightedDiff(String highlightedDiff) {
            this.highlightedDiff = highlightedDiff;
            return this;
        }
        public String getHighlightedDiff() {
            return this.highlightedDiff;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyLatestStDiff setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyLatestStDiff setNewFile(Boolean newFile) {
            this.newFile = newFile;
            return this;
        }
        public Boolean getNewFile() {
            return this.newFile;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyLatestStDiff setNewPath(String newPath) {
            this.newPath = newPath;
            return this;
        }
        public String getNewPath() {
            return this.newPath;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyLatestStDiff setOldPath(String oldPath) {
            this.oldPath = oldPath;
            return this;
        }
        public String getOldPath() {
            return this.oldPath;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyLatestStDiff setRenamedFile(Boolean renamedFile) {
            this.renamedFile = renamedFile;
            return this;
        }
        public Boolean getRenamedFile() {
            return this.renamedFile;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyLatestStDiff setSuffix(String suffix) {
            this.suffix = suffix;
            return this;
        }
        public String getSuffix() {
            return this.suffix;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyLatestStDiff setTooLarge(Boolean tooLarge) {
            this.tooLarge = tooLarge;
            return this;
        }
        public Boolean getTooLarge() {
            return this.tooLarge;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyLatestStDiff setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

    }

    public static class UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyResolvedBy extends TeaModel {
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

        public static UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyResolvedBy build(java.util.Map<String, ?> map) throws Exception {
            UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyResolvedBy self = new UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyResolvedBy();
            return TeaModel.build(map, self);
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyResolvedBy setAccessLevel(Long accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }
        public Long getAccessLevel() {
            return this.accessLevel;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyResolvedBy setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyResolvedBy setBio(String bio) {
            this.bio = bio;
            return this;
        }
        public String getBio() {
            return this.bio;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyResolvedBy setCanCreateGroup(Boolean canCreateGroup) {
            this.canCreateGroup = canCreateGroup;
            return this;
        }
        public Boolean getCanCreateGroup() {
            return this.canCreateGroup;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyResolvedBy setCanCreateProject(Boolean canCreateProject) {
            this.canCreateProject = canCreateProject;
            return this;
        }
        public Boolean getCanCreateProject() {
            return this.canCreateProject;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyResolvedBy setColorSchemeId(Long colorSchemeId) {
            this.colorSchemeId = colorSchemeId;
            return this;
        }
        public Long getColorSchemeId() {
            return this.colorSchemeId;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyResolvedBy setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyResolvedBy setCurrentSignInAt(String currentSignInAt) {
            this.currentSignInAt = currentSignInAt;
            return this;
        }
        public String getCurrentSignInAt() {
            return this.currentSignInAt;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyResolvedBy setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyResolvedBy setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyResolvedBy setExpiresAt(String expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }
        public String getExpiresAt() {
            return this.expiresAt;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyResolvedBy setExternUid(String externUid) {
            this.externUid = externUid;
            return this;
        }
        public String getExternUid() {
            return this.externUid;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyResolvedBy setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyResolvedBy setIsAdmin(Boolean isAdmin) {
            this.isAdmin = isAdmin;
            return this;
        }
        public Boolean getIsAdmin() {
            return this.isAdmin;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyResolvedBy setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyResolvedBy setPrivateToken(String privateToken) {
            this.privateToken = privateToken;
            return this;
        }
        public String getPrivateToken() {
            return this.privateToken;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyResolvedBy setProjectsLimit(Long projectsLimit) {
            this.projectsLimit = projectsLimit;
            return this;
        }
        public Long getProjectsLimit() {
            return this.projectsLimit;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyResolvedBy setRegistered(Boolean registered) {
            this.registered = registered;
            return this;
        }
        public Boolean getRegistered() {
            return this.registered;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyResolvedBy setRole(Long role) {
            this.role = role;
            return this;
        }
        public Long getRole() {
            return this.role;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyResolvedBy setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyResolvedBy setThemeId(Long themeId) {
            this.themeId = themeId;
            return this;
        }
        public Long getThemeId() {
            return this.themeId;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyResolvedBy setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyResolvedBy setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyResolvedBy setWebsiteUrl(String websiteUrl) {
            this.websiteUrl = websiteUrl;
            return this;
        }
        public String getWebsiteUrl() {
            return this.websiteUrl;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyResolvedBy setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyResolvedBy setIdentities(java.util.List<String> identities) {
            this.identities = identities;
            return this;
        }
        public java.util.List<String> getIdentities() {
            return this.identities;
        }

    }

    public static class UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyStDiff extends TeaModel {
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

        public static UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyStDiff build(java.util.Map<String, ?> map) throws Exception {
            UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyStDiff self = new UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyStDiff();
            return TeaModel.build(map, self);
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyStDiff setAddLineNum(Long addLineNum) {
            this.addLineNum = addLineNum;
            return this;
        }
        public Long getAddLineNum() {
            return this.addLineNum;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyStDiff setAmode(String amode) {
            this.amode = amode;
            return this;
        }
        public String getAmode() {
            return this.amode;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyStDiff setAMode(String AMode) {
            this.AMode = AMode;
            return this;
        }
        public String getAMode() {
            return this.AMode;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyStDiff setBinaryFile(Boolean binaryFile) {
            this.binaryFile = binaryFile;
            return this;
        }
        public Boolean getBinaryFile() {
            return this.binaryFile;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyStDiff setBmode(String bmode) {
            this.bmode = bmode;
            return this;
        }
        public String getBmode() {
            return this.bmode;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyStDiff setBMode(String BMode) {
            this.BMode = BMode;
            return this;
        }
        public String getBMode() {
            return this.BMode;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyStDiff setCharsetName(String charsetName) {
            this.charsetName = charsetName;
            return this;
        }
        public String getCharsetName() {
            return this.charsetName;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyStDiff setCompareDiffId(Long compareDiffId) {
            this.compareDiffId = compareDiffId;
            return this;
        }
        public Long getCompareDiffId() {
            return this.compareDiffId;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyStDiff setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyStDiff setDeletedFile(Boolean deletedFile) {
            this.deletedFile = deletedFile;
            return this;
        }
        public Boolean getDeletedFile() {
            return this.deletedFile;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyStDiff setDelLineNum(Long delLineNum) {
            this.delLineNum = delLineNum;
            return this;
        }
        public Long getDelLineNum() {
            return this.delLineNum;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyStDiff setDiff(String diff) {
            this.diff = diff;
            return this;
        }
        public String getDiff() {
            return this.diff;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyStDiff setHighlightedDiff(String highlightedDiff) {
            this.highlightedDiff = highlightedDiff;
            return this;
        }
        public String getHighlightedDiff() {
            return this.highlightedDiff;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyStDiff setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyStDiff setNewFile(Boolean newFile) {
            this.newFile = newFile;
            return this;
        }
        public Boolean getNewFile() {
            return this.newFile;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyStDiff setNewPath(String newPath) {
            this.newPath = newPath;
            return this;
        }
        public String getNewPath() {
            return this.newPath;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyStDiff setOldPath(String oldPath) {
            this.oldPath = oldPath;
            return this;
        }
        public String getOldPath() {
            return this.oldPath;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyStDiff setRenamedFile(Boolean renamedFile) {
            this.renamedFile = renamedFile;
            return this;
        }
        public Boolean getRenamedFile() {
            return this.renamedFile;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyStDiff setSuffix(String suffix) {
            this.suffix = suffix;
            return this;
        }
        public String getSuffix() {
            return this.suffix;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyStDiff setTooLarge(Boolean tooLarge) {
            this.tooLarge = tooLarge;
            return this;
        }
        public Boolean getTooLarge() {
            return this.tooLarge;
        }

        public UpdateLinkeantcodeAntcodeApiupdateprojectpullrequestnoteResponseBodyStDiff setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

    }

}
