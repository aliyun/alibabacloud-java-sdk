// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeantcodeAntcodeManualbranchpipelineResponseBody extends TeaModel {
    @NameInMap("CreatedAt")
    public String createdAt;

    @NameInMap("BeginAt")
    public String beginAt;

    @NameInMap("PullRequestId")
    public Long pullRequestId;

    @NameInMap("UtCoverUrl")
    public String utCoverUrl;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("FinishedAt")
    public String finishedAt;

    @NameInMap("CommitShortId")
    public String commitShortId;

    @NameInMap("PullRequestIid")
    public Long pullRequestIid;

    @NameInMap("Status")
    public String status;

    @NameInMap("UtPass")
    public String utPass;

    @NameInMap("ExecId")
    public String execId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Builds")
    public java.util.List<ExecLinkeantcodeAntcodeManualbranchpipelineResponseBodyBuilds> builds;

    @NameInMap("CommitId")
    public String commitId;

    @NameInMap("EventTriggerType")
    public String eventTriggerType;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("UtCover")
    public String utCover;

    @NameInMap("Artifacts")
    public java.util.List<ExecLinkeantcodeAntcodeManualbranchpipelineResponseBodyArtifacts> artifacts;

    @NameInMap("Type")
    public String type;

    @NameInMap("Ref")
    public String ref;

    @NameInMap("Author")
    public ExecLinkeantcodeAntcodeManualbranchpipelineResponseBodyAuthor author;

    @NameInMap("Lastest")
    public Boolean lastest;

    @NameInMap("CommitMsg")
    public String commitMsg;

    @NameInMap("Id")
    public String id;

    @NameInMap("ResultCode")
    public String resultCode;

    public static ExecLinkeantcodeAntcodeManualbranchpipelineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeantcodeAntcodeManualbranchpipelineResponseBody self = new ExecLinkeantcodeAntcodeManualbranchpipelineResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecLinkeantcodeAntcodeManualbranchpipelineResponseBody setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public ExecLinkeantcodeAntcodeManualbranchpipelineResponseBody setBeginAt(String beginAt) {
        this.beginAt = beginAt;
        return this;
    }
    public String getBeginAt() {
        return this.beginAt;
    }

    public ExecLinkeantcodeAntcodeManualbranchpipelineResponseBody setPullRequestId(Long pullRequestId) {
        this.pullRequestId = pullRequestId;
        return this;
    }
    public Long getPullRequestId() {
        return this.pullRequestId;
    }

    public ExecLinkeantcodeAntcodeManualbranchpipelineResponseBody setUtCoverUrl(String utCoverUrl) {
        this.utCoverUrl = utCoverUrl;
        return this;
    }
    public String getUtCoverUrl() {
        return this.utCoverUrl;
    }

    public ExecLinkeantcodeAntcodeManualbranchpipelineResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public ExecLinkeantcodeAntcodeManualbranchpipelineResponseBody setFinishedAt(String finishedAt) {
        this.finishedAt = finishedAt;
        return this;
    }
    public String getFinishedAt() {
        return this.finishedAt;
    }

    public ExecLinkeantcodeAntcodeManualbranchpipelineResponseBody setCommitShortId(String commitShortId) {
        this.commitShortId = commitShortId;
        return this;
    }
    public String getCommitShortId() {
        return this.commitShortId;
    }

    public ExecLinkeantcodeAntcodeManualbranchpipelineResponseBody setPullRequestIid(Long pullRequestIid) {
        this.pullRequestIid = pullRequestIid;
        return this;
    }
    public Long getPullRequestIid() {
        return this.pullRequestIid;
    }

    public ExecLinkeantcodeAntcodeManualbranchpipelineResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ExecLinkeantcodeAntcodeManualbranchpipelineResponseBody setUtPass(String utPass) {
        this.utPass = utPass;
        return this;
    }
    public String getUtPass() {
        return this.utPass;
    }

    public ExecLinkeantcodeAntcodeManualbranchpipelineResponseBody setExecId(String execId) {
        this.execId = execId;
        return this;
    }
    public String getExecId() {
        return this.execId;
    }

    public ExecLinkeantcodeAntcodeManualbranchpipelineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecLinkeantcodeAntcodeManualbranchpipelineResponseBody setBuilds(java.util.List<ExecLinkeantcodeAntcodeManualbranchpipelineResponseBodyBuilds> builds) {
        this.builds = builds;
        return this;
    }
    public java.util.List<ExecLinkeantcodeAntcodeManualbranchpipelineResponseBodyBuilds> getBuilds() {
        return this.builds;
    }

    public ExecLinkeantcodeAntcodeManualbranchpipelineResponseBody setCommitId(String commitId) {
        this.commitId = commitId;
        return this;
    }
    public String getCommitId() {
        return this.commitId;
    }

    public ExecLinkeantcodeAntcodeManualbranchpipelineResponseBody setEventTriggerType(String eventTriggerType) {
        this.eventTriggerType = eventTriggerType;
        return this;
    }
    public String getEventTriggerType() {
        return this.eventTriggerType;
    }

    public ExecLinkeantcodeAntcodeManualbranchpipelineResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ExecLinkeantcodeAntcodeManualbranchpipelineResponseBody setUtCover(String utCover) {
        this.utCover = utCover;
        return this;
    }
    public String getUtCover() {
        return this.utCover;
    }

    public ExecLinkeantcodeAntcodeManualbranchpipelineResponseBody setArtifacts(java.util.List<ExecLinkeantcodeAntcodeManualbranchpipelineResponseBodyArtifacts> artifacts) {
        this.artifacts = artifacts;
        return this;
    }
    public java.util.List<ExecLinkeantcodeAntcodeManualbranchpipelineResponseBodyArtifacts> getArtifacts() {
        return this.artifacts;
    }

    public ExecLinkeantcodeAntcodeManualbranchpipelineResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ExecLinkeantcodeAntcodeManualbranchpipelineResponseBody setRef(String ref) {
        this.ref = ref;
        return this;
    }
    public String getRef() {
        return this.ref;
    }

    public ExecLinkeantcodeAntcodeManualbranchpipelineResponseBody setAuthor(ExecLinkeantcodeAntcodeManualbranchpipelineResponseBodyAuthor author) {
        this.author = author;
        return this;
    }
    public ExecLinkeantcodeAntcodeManualbranchpipelineResponseBodyAuthor getAuthor() {
        return this.author;
    }

    public ExecLinkeantcodeAntcodeManualbranchpipelineResponseBody setLastest(Boolean lastest) {
        this.lastest = lastest;
        return this;
    }
    public Boolean getLastest() {
        return this.lastest;
    }

    public ExecLinkeantcodeAntcodeManualbranchpipelineResponseBody setCommitMsg(String commitMsg) {
        this.commitMsg = commitMsg;
        return this;
    }
    public String getCommitMsg() {
        return this.commitMsg;
    }

    public ExecLinkeantcodeAntcodeManualbranchpipelineResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ExecLinkeantcodeAntcodeManualbranchpipelineResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class ExecLinkeantcodeAntcodeManualbranchpipelineResponseBodyBuilds extends TeaModel {
        @NameInMap("BuildId")
        public String buildId;

        @NameInMap("BuildSystem")
        public String buildSystem;

        public static ExecLinkeantcodeAntcodeManualbranchpipelineResponseBodyBuilds build(java.util.Map<String, ?> map) throws Exception {
            ExecLinkeantcodeAntcodeManualbranchpipelineResponseBodyBuilds self = new ExecLinkeantcodeAntcodeManualbranchpipelineResponseBodyBuilds();
            return TeaModel.build(map, self);
        }

        public ExecLinkeantcodeAntcodeManualbranchpipelineResponseBodyBuilds setBuildId(String buildId) {
            this.buildId = buildId;
            return this;
        }
        public String getBuildId() {
            return this.buildId;
        }

        public ExecLinkeantcodeAntcodeManualbranchpipelineResponseBodyBuilds setBuildSystem(String buildSystem) {
            this.buildSystem = buildSystem;
            return this;
        }
        public String getBuildSystem() {
            return this.buildSystem;
        }

    }

    public static class ExecLinkeantcodeAntcodeManualbranchpipelineResponseBodyArtifacts extends TeaModel {
        @NameInMap("FsType")
        public String fsType;

        @NameInMap("FsPath")
        public String fsPath;

        @NameInMap("Description")
        public String description;

        @NameInMap("BuildId")
        public String buildId;

        @NameInMap("BuildType")
        public String buildType;

        @NameInMap("Sha")
        public String sha;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("Md5")
        public String md5;

        @NameInMap("Name")
        public String name;

        @NameInMap("BuildSystem")
        public String buildSystem;

        @NameInMap("Id")
        public Long id;

        public static ExecLinkeantcodeAntcodeManualbranchpipelineResponseBodyArtifacts build(java.util.Map<String, ?> map) throws Exception {
            ExecLinkeantcodeAntcodeManualbranchpipelineResponseBodyArtifacts self = new ExecLinkeantcodeAntcodeManualbranchpipelineResponseBodyArtifacts();
            return TeaModel.build(map, self);
        }

        public ExecLinkeantcodeAntcodeManualbranchpipelineResponseBodyArtifacts setFsType(String fsType) {
            this.fsType = fsType;
            return this;
        }
        public String getFsType() {
            return this.fsType;
        }

        public ExecLinkeantcodeAntcodeManualbranchpipelineResponseBodyArtifacts setFsPath(String fsPath) {
            this.fsPath = fsPath;
            return this;
        }
        public String getFsPath() {
            return this.fsPath;
        }

        public ExecLinkeantcodeAntcodeManualbranchpipelineResponseBodyArtifacts setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ExecLinkeantcodeAntcodeManualbranchpipelineResponseBodyArtifacts setBuildId(String buildId) {
            this.buildId = buildId;
            return this;
        }
        public String getBuildId() {
            return this.buildId;
        }

        public ExecLinkeantcodeAntcodeManualbranchpipelineResponseBodyArtifacts setBuildType(String buildType) {
            this.buildType = buildType;
            return this;
        }
        public String getBuildType() {
            return this.buildType;
        }

        public ExecLinkeantcodeAntcodeManualbranchpipelineResponseBodyArtifacts setSha(String sha) {
            this.sha = sha;
            return this;
        }
        public String getSha() {
            return this.sha;
        }

        public ExecLinkeantcodeAntcodeManualbranchpipelineResponseBodyArtifacts setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ExecLinkeantcodeAntcodeManualbranchpipelineResponseBodyArtifacts setMd5(String md5) {
            this.md5 = md5;
            return this;
        }
        public String getMd5() {
            return this.md5;
        }

        public ExecLinkeantcodeAntcodeManualbranchpipelineResponseBodyArtifacts setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ExecLinkeantcodeAntcodeManualbranchpipelineResponseBodyArtifacts setBuildSystem(String buildSystem) {
            this.buildSystem = buildSystem;
            return this;
        }
        public String getBuildSystem() {
            return this.buildSystem;
        }

        public ExecLinkeantcodeAntcodeManualbranchpipelineResponseBodyArtifacts setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class ExecLinkeantcodeAntcodeManualbranchpipelineResponseBodyAuthor extends TeaModel {
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

        public static ExecLinkeantcodeAntcodeManualbranchpipelineResponseBodyAuthor build(java.util.Map<String, ?> map) throws Exception {
            ExecLinkeantcodeAntcodeManualbranchpipelineResponseBodyAuthor self = new ExecLinkeantcodeAntcodeManualbranchpipelineResponseBodyAuthor();
            return TeaModel.build(map, self);
        }

        public ExecLinkeantcodeAntcodeManualbranchpipelineResponseBodyAuthor setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ExecLinkeantcodeAntcodeManualbranchpipelineResponseBodyAuthor setCurrentSignInAt(String currentSignInAt) {
            this.currentSignInAt = currentSignInAt;
            return this;
        }
        public String getCurrentSignInAt() {
            return this.currentSignInAt;
        }

        public ExecLinkeantcodeAntcodeManualbranchpipelineResponseBodyAuthor setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

        public ExecLinkeantcodeAntcodeManualbranchpipelineResponseBodyAuthor setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ExecLinkeantcodeAntcodeManualbranchpipelineResponseBodyAuthor setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public ExecLinkeantcodeAntcodeManualbranchpipelineResponseBodyAuthor setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public ExecLinkeantcodeAntcodeManualbranchpipelineResponseBodyAuthor setExternUid(String externUid) {
            this.externUid = externUid;
            return this;
        }
        public String getExternUid() {
            return this.externUid;
        }

        public ExecLinkeantcodeAntcodeManualbranchpipelineResponseBodyAuthor setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ExecLinkeantcodeAntcodeManualbranchpipelineResponseBodyAuthor setThemeId(Long themeId) {
            this.themeId = themeId;
            return this;
        }
        public Long getThemeId() {
            return this.themeId;
        }

        public ExecLinkeantcodeAntcodeManualbranchpipelineResponseBodyAuthor setBio(String bio) {
            this.bio = bio;
            return this;
        }
        public String getBio() {
            return this.bio;
        }

        public ExecLinkeantcodeAntcodeManualbranchpipelineResponseBodyAuthor setCanCreateProject(Boolean canCreateProject) {
            this.canCreateProject = canCreateProject;
            return this;
        }
        public Boolean getCanCreateProject() {
            return this.canCreateProject;
        }

        public ExecLinkeantcodeAntcodeManualbranchpipelineResponseBodyAuthor setIsAdmin(Boolean isAdmin) {
            this.isAdmin = isAdmin;
            return this;
        }
        public Boolean getIsAdmin() {
            return this.isAdmin;
        }

        public ExecLinkeantcodeAntcodeManualbranchpipelineResponseBodyAuthor setCanCreateGroup(Boolean canCreateGroup) {
            this.canCreateGroup = canCreateGroup;
            return this;
        }
        public Boolean getCanCreateGroup() {
            return this.canCreateGroup;
        }

        public ExecLinkeantcodeAntcodeManualbranchpipelineResponseBodyAuthor setExpiresAt(String expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }
        public String getExpiresAt() {
            return this.expiresAt;
        }

        public ExecLinkeantcodeAntcodeManualbranchpipelineResponseBodyAuthor setProjectsLimit(Long projectsLimit) {
            this.projectsLimit = projectsLimit;
            return this;
        }
        public Long getProjectsLimit() {
            return this.projectsLimit;
        }

        public ExecLinkeantcodeAntcodeManualbranchpipelineResponseBodyAuthor setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ExecLinkeantcodeAntcodeManualbranchpipelineResponseBodyAuthor setWebsiteUrl(String websiteUrl) {
            this.websiteUrl = websiteUrl;
            return this;
        }
        public String getWebsiteUrl() {
            return this.websiteUrl;
        }

        public ExecLinkeantcodeAntcodeManualbranchpipelineResponseBodyAuthor setIdentities(java.util.List<String> identities) {
            this.identities = identities;
            return this;
        }
        public java.util.List<String> getIdentities() {
            return this.identities;
        }

        public ExecLinkeantcodeAntcodeManualbranchpipelineResponseBodyAuthor setAccessLevel(Long accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }
        public Long getAccessLevel() {
            return this.accessLevel;
        }

        public ExecLinkeantcodeAntcodeManualbranchpipelineResponseBodyAuthor setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public ExecLinkeantcodeAntcodeManualbranchpipelineResponseBodyAuthor setRole(Long role) {
            this.role = role;
            return this;
        }
        public Long getRole() {
            return this.role;
        }

        public ExecLinkeantcodeAntcodeManualbranchpipelineResponseBodyAuthor setPrivateToken(String privateToken) {
            this.privateToken = privateToken;
            return this;
        }
        public String getPrivateToken() {
            return this.privateToken;
        }

        public ExecLinkeantcodeAntcodeManualbranchpipelineResponseBodyAuthor setRegistered(Boolean registered) {
            this.registered = registered;
            return this;
        }
        public Boolean getRegistered() {
            return this.registered;
        }

        public ExecLinkeantcodeAntcodeManualbranchpipelineResponseBodyAuthor setColorSchemeId(Long colorSchemeId) {
            this.colorSchemeId = colorSchemeId;
            return this;
        }
        public Long getColorSchemeId() {
            return this.colorSchemeId;
        }

        public ExecLinkeantcodeAntcodeManualbranchpipelineResponseBodyAuthor setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ExecLinkeantcodeAntcodeManualbranchpipelineResponseBodyAuthor setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

}
