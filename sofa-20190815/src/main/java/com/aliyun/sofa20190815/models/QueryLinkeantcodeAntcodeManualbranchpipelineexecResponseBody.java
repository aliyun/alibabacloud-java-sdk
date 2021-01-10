// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeantcodeAntcodeManualbranchpipelineexecResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("BeginAt")
    public String beginAt;

    @NameInMap("CommitId")
    public String commitId;

    @NameInMap("CommitMsg")
    public String commitMsg;

    @NameInMap("CommitShortId")
    public String commitShortId;

    @NameInMap("CreatedAt")
    public String createdAt;

    @NameInMap("EventTriggerType")
    public String eventTriggerType;

    @NameInMap("ExecId")
    public String execId;

    @NameInMap("FinishedAt")
    public String finishedAt;

    @NameInMap("Id")
    public String id;

    @NameInMap("Lastest")
    public Boolean lastest;

    @NameInMap("PullRequestId")
    public Long pullRequestId;

    @NameInMap("PullRequestIid")
    public Long pullRequestIid;

    @NameInMap("Ref")
    public String ref;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Status")
    public String status;

    @NameInMap("Type")
    public String type;

    @NameInMap("UtCover")
    public String utCover;

    @NameInMap("UtCoverUrl")
    public String utCoverUrl;

    @NameInMap("UtPass")
    public String utPass;

    @NameInMap("Artifacts")
    public java.util.List<QueryLinkeantcodeAntcodeManualbranchpipelineexecResponseBodyArtifacts> artifacts;

    @NameInMap("Builds")
    public java.util.List<QueryLinkeantcodeAntcodeManualbranchpipelineexecResponseBodyBuilds> builds;

    @NameInMap("Author")
    public QueryLinkeantcodeAntcodeManualbranchpipelineexecResponseBodyAuthor author;

    public static QueryLinkeantcodeAntcodeManualbranchpipelineexecResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeantcodeAntcodeManualbranchpipelineexecResponseBody self = new QueryLinkeantcodeAntcodeManualbranchpipelineexecResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkeantcodeAntcodeManualbranchpipelineexecResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkeantcodeAntcodeManualbranchpipelineexecResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkeantcodeAntcodeManualbranchpipelineexecResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkeantcodeAntcodeManualbranchpipelineexecResponseBody setBeginAt(String beginAt) {
        this.beginAt = beginAt;
        return this;
    }
    public String getBeginAt() {
        return this.beginAt;
    }

    public QueryLinkeantcodeAntcodeManualbranchpipelineexecResponseBody setCommitId(String commitId) {
        this.commitId = commitId;
        return this;
    }
    public String getCommitId() {
        return this.commitId;
    }

    public QueryLinkeantcodeAntcodeManualbranchpipelineexecResponseBody setCommitMsg(String commitMsg) {
        this.commitMsg = commitMsg;
        return this;
    }
    public String getCommitMsg() {
        return this.commitMsg;
    }

    public QueryLinkeantcodeAntcodeManualbranchpipelineexecResponseBody setCommitShortId(String commitShortId) {
        this.commitShortId = commitShortId;
        return this;
    }
    public String getCommitShortId() {
        return this.commitShortId;
    }

    public QueryLinkeantcodeAntcodeManualbranchpipelineexecResponseBody setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public QueryLinkeantcodeAntcodeManualbranchpipelineexecResponseBody setEventTriggerType(String eventTriggerType) {
        this.eventTriggerType = eventTriggerType;
        return this;
    }
    public String getEventTriggerType() {
        return this.eventTriggerType;
    }

    public QueryLinkeantcodeAntcodeManualbranchpipelineexecResponseBody setExecId(String execId) {
        this.execId = execId;
        return this;
    }
    public String getExecId() {
        return this.execId;
    }

    public QueryLinkeantcodeAntcodeManualbranchpipelineexecResponseBody setFinishedAt(String finishedAt) {
        this.finishedAt = finishedAt;
        return this;
    }
    public String getFinishedAt() {
        return this.finishedAt;
    }

    public QueryLinkeantcodeAntcodeManualbranchpipelineexecResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public QueryLinkeantcodeAntcodeManualbranchpipelineexecResponseBody setLastest(Boolean lastest) {
        this.lastest = lastest;
        return this;
    }
    public Boolean getLastest() {
        return this.lastest;
    }

    public QueryLinkeantcodeAntcodeManualbranchpipelineexecResponseBody setPullRequestId(Long pullRequestId) {
        this.pullRequestId = pullRequestId;
        return this;
    }
    public Long getPullRequestId() {
        return this.pullRequestId;
    }

    public QueryLinkeantcodeAntcodeManualbranchpipelineexecResponseBody setPullRequestIid(Long pullRequestIid) {
        this.pullRequestIid = pullRequestIid;
        return this;
    }
    public Long getPullRequestIid() {
        return this.pullRequestIid;
    }

    public QueryLinkeantcodeAntcodeManualbranchpipelineexecResponseBody setRef(String ref) {
        this.ref = ref;
        return this;
    }
    public String getRef() {
        return this.ref;
    }

    public QueryLinkeantcodeAntcodeManualbranchpipelineexecResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkeantcodeAntcodeManualbranchpipelineexecResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryLinkeantcodeAntcodeManualbranchpipelineexecResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public QueryLinkeantcodeAntcodeManualbranchpipelineexecResponseBody setUtCover(String utCover) {
        this.utCover = utCover;
        return this;
    }
    public String getUtCover() {
        return this.utCover;
    }

    public QueryLinkeantcodeAntcodeManualbranchpipelineexecResponseBody setUtCoverUrl(String utCoverUrl) {
        this.utCoverUrl = utCoverUrl;
        return this;
    }
    public String getUtCoverUrl() {
        return this.utCoverUrl;
    }

    public QueryLinkeantcodeAntcodeManualbranchpipelineexecResponseBody setUtPass(String utPass) {
        this.utPass = utPass;
        return this;
    }
    public String getUtPass() {
        return this.utPass;
    }

    public QueryLinkeantcodeAntcodeManualbranchpipelineexecResponseBody setArtifacts(java.util.List<QueryLinkeantcodeAntcodeManualbranchpipelineexecResponseBodyArtifacts> artifacts) {
        this.artifacts = artifacts;
        return this;
    }
    public java.util.List<QueryLinkeantcodeAntcodeManualbranchpipelineexecResponseBodyArtifacts> getArtifacts() {
        return this.artifacts;
    }

    public QueryLinkeantcodeAntcodeManualbranchpipelineexecResponseBody setBuilds(java.util.List<QueryLinkeantcodeAntcodeManualbranchpipelineexecResponseBodyBuilds> builds) {
        this.builds = builds;
        return this;
    }
    public java.util.List<QueryLinkeantcodeAntcodeManualbranchpipelineexecResponseBodyBuilds> getBuilds() {
        return this.builds;
    }

    public QueryLinkeantcodeAntcodeManualbranchpipelineexecResponseBody setAuthor(QueryLinkeantcodeAntcodeManualbranchpipelineexecResponseBodyAuthor author) {
        this.author = author;
        return this;
    }
    public QueryLinkeantcodeAntcodeManualbranchpipelineexecResponseBodyAuthor getAuthor() {
        return this.author;
    }

    public static class QueryLinkeantcodeAntcodeManualbranchpipelineexecResponseBodyArtifacts extends TeaModel {
        @NameInMap("BuildId")
        public String buildId;

        @NameInMap("BuildSystem")
        public String buildSystem;

        @NameInMap("BuildType")
        public String buildType;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("Description")
        public String description;

        @NameInMap("FsPath")
        public String fsPath;

        @NameInMap("FsType")
        public String fsType;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Md5")
        public String md5;

        @NameInMap("Name")
        public String name;

        @NameInMap("Sha")
        public String sha;

        public static QueryLinkeantcodeAntcodeManualbranchpipelineexecResponseBodyArtifacts build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeantcodeAntcodeManualbranchpipelineexecResponseBodyArtifacts self = new QueryLinkeantcodeAntcodeManualbranchpipelineexecResponseBodyArtifacts();
            return TeaModel.build(map, self);
        }

        public QueryLinkeantcodeAntcodeManualbranchpipelineexecResponseBodyArtifacts setBuildId(String buildId) {
            this.buildId = buildId;
            return this;
        }
        public String getBuildId() {
            return this.buildId;
        }

        public QueryLinkeantcodeAntcodeManualbranchpipelineexecResponseBodyArtifacts setBuildSystem(String buildSystem) {
            this.buildSystem = buildSystem;
            return this;
        }
        public String getBuildSystem() {
            return this.buildSystem;
        }

        public QueryLinkeantcodeAntcodeManualbranchpipelineexecResponseBodyArtifacts setBuildType(String buildType) {
            this.buildType = buildType;
            return this;
        }
        public String getBuildType() {
            return this.buildType;
        }

        public QueryLinkeantcodeAntcodeManualbranchpipelineexecResponseBodyArtifacts setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public QueryLinkeantcodeAntcodeManualbranchpipelineexecResponseBodyArtifacts setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryLinkeantcodeAntcodeManualbranchpipelineexecResponseBodyArtifacts setFsPath(String fsPath) {
            this.fsPath = fsPath;
            return this;
        }
        public String getFsPath() {
            return this.fsPath;
        }

        public QueryLinkeantcodeAntcodeManualbranchpipelineexecResponseBodyArtifacts setFsType(String fsType) {
            this.fsType = fsType;
            return this;
        }
        public String getFsType() {
            return this.fsType;
        }

        public QueryLinkeantcodeAntcodeManualbranchpipelineexecResponseBodyArtifacts setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryLinkeantcodeAntcodeManualbranchpipelineexecResponseBodyArtifacts setMd5(String md5) {
            this.md5 = md5;
            return this;
        }
        public String getMd5() {
            return this.md5;
        }

        public QueryLinkeantcodeAntcodeManualbranchpipelineexecResponseBodyArtifacts setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryLinkeantcodeAntcodeManualbranchpipelineexecResponseBodyArtifacts setSha(String sha) {
            this.sha = sha;
            return this;
        }
        public String getSha() {
            return this.sha;
        }

    }

    public static class QueryLinkeantcodeAntcodeManualbranchpipelineexecResponseBodyBuilds extends TeaModel {
        @NameInMap("BuildId")
        public String buildId;

        @NameInMap("BuildSystem")
        public String buildSystem;

        public static QueryLinkeantcodeAntcodeManualbranchpipelineexecResponseBodyBuilds build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeantcodeAntcodeManualbranchpipelineexecResponseBodyBuilds self = new QueryLinkeantcodeAntcodeManualbranchpipelineexecResponseBodyBuilds();
            return TeaModel.build(map, self);
        }

        public QueryLinkeantcodeAntcodeManualbranchpipelineexecResponseBodyBuilds setBuildId(String buildId) {
            this.buildId = buildId;
            return this;
        }
        public String getBuildId() {
            return this.buildId;
        }

        public QueryLinkeantcodeAntcodeManualbranchpipelineexecResponseBodyBuilds setBuildSystem(String buildSystem) {
            this.buildSystem = buildSystem;
            return this;
        }
        public String getBuildSystem() {
            return this.buildSystem;
        }

    }

    public static class QueryLinkeantcodeAntcodeManualbranchpipelineexecResponseBodyAuthor extends TeaModel {
        @NameInMap("AvatarUrl")
        public String avatarUrl;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("Email")
        public String email;

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

        public static QueryLinkeantcodeAntcodeManualbranchpipelineexecResponseBodyAuthor build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeantcodeAntcodeManualbranchpipelineexecResponseBodyAuthor self = new QueryLinkeantcodeAntcodeManualbranchpipelineexecResponseBodyAuthor();
            return TeaModel.build(map, self);
        }

        public QueryLinkeantcodeAntcodeManualbranchpipelineexecResponseBodyAuthor setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public QueryLinkeantcodeAntcodeManualbranchpipelineexecResponseBodyAuthor setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public QueryLinkeantcodeAntcodeManualbranchpipelineexecResponseBodyAuthor setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public QueryLinkeantcodeAntcodeManualbranchpipelineexecResponseBodyAuthor setExternUid(String externUid) {
            this.externUid = externUid;
            return this;
        }
        public String getExternUid() {
            return this.externUid;
        }

        public QueryLinkeantcodeAntcodeManualbranchpipelineexecResponseBodyAuthor setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryLinkeantcodeAntcodeManualbranchpipelineexecResponseBodyAuthor setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryLinkeantcodeAntcodeManualbranchpipelineexecResponseBodyAuthor setNotificationLevel(Long notificationLevel) {
            this.notificationLevel = notificationLevel;
            return this;
        }
        public Long getNotificationLevel() {
            return this.notificationLevel;
        }

        public QueryLinkeantcodeAntcodeManualbranchpipelineexecResponseBodyAuthor setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QueryLinkeantcodeAntcodeManualbranchpipelineexecResponseBodyAuthor setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public QueryLinkeantcodeAntcodeManualbranchpipelineexecResponseBodyAuthor setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public QueryLinkeantcodeAntcodeManualbranchpipelineexecResponseBodyAuthor setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

    }

}
