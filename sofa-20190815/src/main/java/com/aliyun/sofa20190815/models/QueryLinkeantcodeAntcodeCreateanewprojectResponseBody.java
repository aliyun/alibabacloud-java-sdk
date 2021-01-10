// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeantcodeAntcodeCreateanewprojectResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

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

    @NameInMap("NameWithNamespace")
    public String nameWithNamespace;

    @NameInMap("Path")
    public String path;

    @NameInMap("PathWithNamespace")
    public String pathWithNamespace;

    @NameInMap("Public")
    public Boolean _public;

    @NameInMap("RepositorySize")
    public String repositorySize;

    @NameInMap("RepositorySizeLimit")
    public Long repositorySizeLimit;

    @NameInMap("ResponsePage")
    public String responsePage;

    @NameInMap("ResponsePageInfoNextPage")
    public String responsePageInfoNextPage;

    @NameInMap("ResponsePageInfoPerPage")
    public String responsePageInfoPerPage;

    @NameInMap("ResponsePageInfoPrevPage")
    public String responsePageInfoPrevPage;

    @NameInMap("ResponsePageInfoTotal")
    public String responsePageInfoTotal;

    @NameInMap("ResponsePageInfoTotalPages")
    public String responsePageInfoTotalPages;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

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

    @NameInMap("Namespace")
    public QueryLinkeantcodeAntcodeCreateanewprojectResponseBodyNamespace namespace;

    @NameInMap("Owner")
    public QueryLinkeantcodeAntcodeCreateanewprojectResponseBodyOwner owner;

    @NameInMap("Permission")
    public QueryLinkeantcodeAntcodeCreateanewprojectResponseBodyPermission permission;

    public static QueryLinkeantcodeAntcodeCreateanewprojectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeantcodeAntcodeCreateanewprojectResponseBody self = new QueryLinkeantcodeAntcodeCreateanewprojectResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkeantcodeAntcodeCreateanewprojectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkeantcodeAntcodeCreateanewprojectResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkeantcodeAntcodeCreateanewprojectResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkeantcodeAntcodeCreateanewprojectResponseBody setArchived(Boolean archived) {
        this.archived = archived;
        return this;
    }
    public Boolean getArchived() {
        return this.archived;
    }

    public QueryLinkeantcodeAntcodeCreateanewprojectResponseBody setArtifacts(Boolean artifacts) {
        this.artifacts = artifacts;
        return this;
    }
    public Boolean getArtifacts() {
        return this.artifacts;
    }

    public QueryLinkeantcodeAntcodeCreateanewprojectResponseBody setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
        return this;
    }
    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    public QueryLinkeantcodeAntcodeCreateanewprojectResponseBody setCheckEmail(Boolean checkEmail) {
        this.checkEmail = checkEmail;
        return this;
    }
    public Boolean getCheckEmail() {
        return this.checkEmail;
    }

    public QueryLinkeantcodeAntcodeCreateanewprojectResponseBody setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public QueryLinkeantcodeAntcodeCreateanewprojectResponseBody setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
        return this;
    }
    public Long getCreatorId() {
        return this.creatorId;
    }

    public QueryLinkeantcodeAntcodeCreateanewprojectResponseBody setDefaultBranch(String defaultBranch) {
        this.defaultBranch = defaultBranch;
        return this;
    }
    public String getDefaultBranch() {
        return this.defaultBranch;
    }

    public QueryLinkeantcodeAntcodeCreateanewprojectResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public QueryLinkeantcodeAntcodeCreateanewprojectResponseBody setEncoding(String encoding) {
        this.encoding = encoding;
        return this;
    }
    public String getEncoding() {
        return this.encoding;
    }

    public QueryLinkeantcodeAntcodeCreateanewprojectResponseBody setExceptBranch(String exceptBranch) {
        this.exceptBranch = exceptBranch;
        return this;
    }
    public String getExceptBranch() {
        return this.exceptBranch;
    }

    public QueryLinkeantcodeAntcodeCreateanewprojectResponseBody setHomepage(String homepage) {
        this.homepage = homepage;
        return this;
    }
    public String getHomepage() {
        return this.homepage;
    }

    public QueryLinkeantcodeAntcodeCreateanewprojectResponseBody setHttpUrlToRepo(String httpUrlToRepo) {
        this.httpUrlToRepo = httpUrlToRepo;
        return this;
    }
    public String getHttpUrlToRepo() {
        return this.httpUrlToRepo;
    }

    public QueryLinkeantcodeAntcodeCreateanewprojectResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public QueryLinkeantcodeAntcodeCreateanewprojectResponseBody setImportStatus(String importStatus) {
        this.importStatus = importStatus;
        return this;
    }
    public String getImportStatus() {
        return this.importStatus;
    }

    public QueryLinkeantcodeAntcodeCreateanewprojectResponseBody setIsGray(Boolean isGray) {
        this.isGray = isGray;
        return this;
    }
    public Boolean getIsGray() {
        return this.isGray;
    }

    public QueryLinkeantcodeAntcodeCreateanewprojectResponseBody setIsReview(Boolean isReview) {
        this.isReview = isReview;
        return this;
    }
    public Boolean getIsReview() {
        return this.isReview;
    }

    public QueryLinkeantcodeAntcodeCreateanewprojectResponseBody setLastActivityAt(String lastActivityAt) {
        this.lastActivityAt = lastActivityAt;
        return this;
    }
    public String getLastActivityAt() {
        return this.lastActivityAt;
    }

    public QueryLinkeantcodeAntcodeCreateanewprojectResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryLinkeantcodeAntcodeCreateanewprojectResponseBody setNameWithNamespace(String nameWithNamespace) {
        this.nameWithNamespace = nameWithNamespace;
        return this;
    }
    public String getNameWithNamespace() {
        return this.nameWithNamespace;
    }

    public QueryLinkeantcodeAntcodeCreateanewprojectResponseBody setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public QueryLinkeantcodeAntcodeCreateanewprojectResponseBody setPathWithNamespace(String pathWithNamespace) {
        this.pathWithNamespace = pathWithNamespace;
        return this;
    }
    public String getPathWithNamespace() {
        return this.pathWithNamespace;
    }

    public QueryLinkeantcodeAntcodeCreateanewprojectResponseBody set_public(Boolean _public) {
        this._public = _public;
        return this;
    }
    public Boolean get_public() {
        return this._public;
    }

    public QueryLinkeantcodeAntcodeCreateanewprojectResponseBody setRepositorySize(String repositorySize) {
        this.repositorySize = repositorySize;
        return this;
    }
    public String getRepositorySize() {
        return this.repositorySize;
    }

    public QueryLinkeantcodeAntcodeCreateanewprojectResponseBody setRepositorySizeLimit(Long repositorySizeLimit) {
        this.repositorySizeLimit = repositorySizeLimit;
        return this;
    }
    public Long getRepositorySizeLimit() {
        return this.repositorySizeLimit;
    }

    public QueryLinkeantcodeAntcodeCreateanewprojectResponseBody setResponsePage(String responsePage) {
        this.responsePage = responsePage;
        return this;
    }
    public String getResponsePage() {
        return this.responsePage;
    }

    public QueryLinkeantcodeAntcodeCreateanewprojectResponseBody setResponsePageInfoNextPage(String responsePageInfoNextPage) {
        this.responsePageInfoNextPage = responsePageInfoNextPage;
        return this;
    }
    public String getResponsePageInfoNextPage() {
        return this.responsePageInfoNextPage;
    }

    public QueryLinkeantcodeAntcodeCreateanewprojectResponseBody setResponsePageInfoPerPage(String responsePageInfoPerPage) {
        this.responsePageInfoPerPage = responsePageInfoPerPage;
        return this;
    }
    public String getResponsePageInfoPerPage() {
        return this.responsePageInfoPerPage;
    }

    public QueryLinkeantcodeAntcodeCreateanewprojectResponseBody setResponsePageInfoPrevPage(String responsePageInfoPrevPage) {
        this.responsePageInfoPrevPage = responsePageInfoPrevPage;
        return this;
    }
    public String getResponsePageInfoPrevPage() {
        return this.responsePageInfoPrevPage;
    }

    public QueryLinkeantcodeAntcodeCreateanewprojectResponseBody setResponsePageInfoTotal(String responsePageInfoTotal) {
        this.responsePageInfoTotal = responsePageInfoTotal;
        return this;
    }
    public String getResponsePageInfoTotal() {
        return this.responsePageInfoTotal;
    }

    public QueryLinkeantcodeAntcodeCreateanewprojectResponseBody setResponsePageInfoTotalPages(String responsePageInfoTotalPages) {
        this.responsePageInfoTotalPages = responsePageInfoTotalPages;
        return this;
    }
    public String getResponsePageInfoTotalPages() {
        return this.responsePageInfoTotalPages;
    }

    public QueryLinkeantcodeAntcodeCreateanewprojectResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkeantcodeAntcodeCreateanewprojectResponseBody setRunnersToken(String runnersToken) {
        this.runnersToken = runnersToken;
        return this;
    }
    public String getRunnersToken() {
        return this.runnersToken;
    }

    public QueryLinkeantcodeAntcodeCreateanewprojectResponseBody setSshUrlToRepo(String sshUrlToRepo) {
        this.sshUrlToRepo = sshUrlToRepo;
        return this;
    }
    public String getSshUrlToRepo() {
        return this.sshUrlToRepo;
    }

    public QueryLinkeantcodeAntcodeCreateanewprojectResponseBody setVisibility(String visibility) {
        this.visibility = visibility;
        return this;
    }
    public String getVisibility() {
        return this.visibility;
    }

    public QueryLinkeantcodeAntcodeCreateanewprojectResponseBody setVisibilityLevel(Long visibilityLevel) {
        this.visibilityLevel = visibilityLevel;
        return this;
    }
    public Long getVisibilityLevel() {
        return this.visibilityLevel;
    }

    public QueryLinkeantcodeAntcodeCreateanewprojectResponseBody setWebUrl(String webUrl) {
        this.webUrl = webUrl;
        return this;
    }
    public String getWebUrl() {
        return this.webUrl;
    }

    public QueryLinkeantcodeAntcodeCreateanewprojectResponseBody setTagList(java.util.List<String> tagList) {
        this.tagList = tagList;
        return this;
    }
    public java.util.List<String> getTagList() {
        return this.tagList;
    }

    public QueryLinkeantcodeAntcodeCreateanewprojectResponseBody setNamespace(QueryLinkeantcodeAntcodeCreateanewprojectResponseBodyNamespace namespace) {
        this.namespace = namespace;
        return this;
    }
    public QueryLinkeantcodeAntcodeCreateanewprojectResponseBodyNamespace getNamespace() {
        return this.namespace;
    }

    public QueryLinkeantcodeAntcodeCreateanewprojectResponseBody setOwner(QueryLinkeantcodeAntcodeCreateanewprojectResponseBodyOwner owner) {
        this.owner = owner;
        return this;
    }
    public QueryLinkeantcodeAntcodeCreateanewprojectResponseBodyOwner getOwner() {
        return this.owner;
    }

    public QueryLinkeantcodeAntcodeCreateanewprojectResponseBody setPermission(QueryLinkeantcodeAntcodeCreateanewprojectResponseBodyPermission permission) {
        this.permission = permission;
        return this;
    }
    public QueryLinkeantcodeAntcodeCreateanewprojectResponseBodyPermission getPermission() {
        return this.permission;
    }

    public static class QueryLinkeantcodeAntcodeCreateanewprojectResponseBodyNamespace extends TeaModel {
        @NameInMap("Avatar")
        public String avatar;

        @NameInMap("AvatarUrl")
        public String avatarUrl;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("Description")
        public String description;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("OwnerId")
        public Long ownerId;

        @NameInMap("Path")
        public String path;

        @NameInMap("Permission")
        public String permission;

        @NameInMap("Public")
        public Boolean _public;

        @NameInMap("State")
        public String state;

        @NameInMap("Tenant")
        public String tenant;

        @NameInMap("Type")
        public String type;

        @NameInMap("UpdatedAt")
        public String updatedAt;

        @NameInMap("WebUrl")
        public String webUrl;

        public static QueryLinkeantcodeAntcodeCreateanewprojectResponseBodyNamespace build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeantcodeAntcodeCreateanewprojectResponseBodyNamespace self = new QueryLinkeantcodeAntcodeCreateanewprojectResponseBodyNamespace();
            return TeaModel.build(map, self);
        }

        public QueryLinkeantcodeAntcodeCreateanewprojectResponseBodyNamespace setAvatar(String avatar) {
            this.avatar = avatar;
            return this;
        }
        public String getAvatar() {
            return this.avatar;
        }

        public QueryLinkeantcodeAntcodeCreateanewprojectResponseBodyNamespace setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public QueryLinkeantcodeAntcodeCreateanewprojectResponseBodyNamespace setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public QueryLinkeantcodeAntcodeCreateanewprojectResponseBodyNamespace setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryLinkeantcodeAntcodeCreateanewprojectResponseBodyNamespace setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryLinkeantcodeAntcodeCreateanewprojectResponseBodyNamespace setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryLinkeantcodeAntcodeCreateanewprojectResponseBodyNamespace setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public QueryLinkeantcodeAntcodeCreateanewprojectResponseBodyNamespace setOwnerId(Long ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public Long getOwnerId() {
            return this.ownerId;
        }

        public QueryLinkeantcodeAntcodeCreateanewprojectResponseBodyNamespace setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public QueryLinkeantcodeAntcodeCreateanewprojectResponseBodyNamespace setPermission(String permission) {
            this.permission = permission;
            return this;
        }
        public String getPermission() {
            return this.permission;
        }

        public QueryLinkeantcodeAntcodeCreateanewprojectResponseBodyNamespace set_public(Boolean _public) {
            this._public = _public;
            return this;
        }
        public Boolean get_public() {
            return this._public;
        }

        public QueryLinkeantcodeAntcodeCreateanewprojectResponseBodyNamespace setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QueryLinkeantcodeAntcodeCreateanewprojectResponseBodyNamespace setTenant(String tenant) {
            this.tenant = tenant;
            return this;
        }
        public String getTenant() {
            return this.tenant;
        }

        public QueryLinkeantcodeAntcodeCreateanewprojectResponseBodyNamespace setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryLinkeantcodeAntcodeCreateanewprojectResponseBodyNamespace setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public QueryLinkeantcodeAntcodeCreateanewprojectResponseBodyNamespace setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

    }

    public static class QueryLinkeantcodeAntcodeCreateanewprojectResponseBodyOwner extends TeaModel {
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

        public static QueryLinkeantcodeAntcodeCreateanewprojectResponseBodyOwner build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeantcodeAntcodeCreateanewprojectResponseBodyOwner self = new QueryLinkeantcodeAntcodeCreateanewprojectResponseBodyOwner();
            return TeaModel.build(map, self);
        }

        public QueryLinkeantcodeAntcodeCreateanewprojectResponseBodyOwner setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public QueryLinkeantcodeAntcodeCreateanewprojectResponseBodyOwner setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public QueryLinkeantcodeAntcodeCreateanewprojectResponseBodyOwner setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public QueryLinkeantcodeAntcodeCreateanewprojectResponseBodyOwner setExternUid(String externUid) {
            this.externUid = externUid;
            return this;
        }
        public String getExternUid() {
            return this.externUid;
        }

        public QueryLinkeantcodeAntcodeCreateanewprojectResponseBodyOwner setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryLinkeantcodeAntcodeCreateanewprojectResponseBodyOwner setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryLinkeantcodeAntcodeCreateanewprojectResponseBodyOwner setNotificationLevel(Long notificationLevel) {
            this.notificationLevel = notificationLevel;
            return this;
        }
        public Long getNotificationLevel() {
            return this.notificationLevel;
        }

        public QueryLinkeantcodeAntcodeCreateanewprojectResponseBodyOwner setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QueryLinkeantcodeAntcodeCreateanewprojectResponseBodyOwner setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public QueryLinkeantcodeAntcodeCreateanewprojectResponseBodyOwner setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public QueryLinkeantcodeAntcodeCreateanewprojectResponseBodyOwner setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

    }

    public static class QueryLinkeantcodeAntcodeCreateanewprojectResponseBodyPermission extends TeaModel {
        @NameInMap("GroupAccess")
        public String groupAccess;

        @NameInMap("ProjectAccess")
        public String projectAccess;

        @NameInMap("ReviewAccess")
        public String reviewAccess;

        @NameInMap("TenantAccess")
        public String tenantAccess;

        public static QueryLinkeantcodeAntcodeCreateanewprojectResponseBodyPermission build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeantcodeAntcodeCreateanewprojectResponseBodyPermission self = new QueryLinkeantcodeAntcodeCreateanewprojectResponseBodyPermission();
            return TeaModel.build(map, self);
        }

        public QueryLinkeantcodeAntcodeCreateanewprojectResponseBodyPermission setGroupAccess(String groupAccess) {
            this.groupAccess = groupAccess;
            return this;
        }
        public String getGroupAccess() {
            return this.groupAccess;
        }

        public QueryLinkeantcodeAntcodeCreateanewprojectResponseBodyPermission setProjectAccess(String projectAccess) {
            this.projectAccess = projectAccess;
            return this;
        }
        public String getProjectAccess() {
            return this.projectAccess;
        }

        public QueryLinkeantcodeAntcodeCreateanewprojectResponseBodyPermission setReviewAccess(String reviewAccess) {
            this.reviewAccess = reviewAccess;
            return this;
        }
        public String getReviewAccess() {
            return this.reviewAccess;
        }

        public QueryLinkeantcodeAntcodeCreateanewprojectResponseBodyPermission setTenantAccess(String tenantAccess) {
            this.tenantAccess = tenantAccess;
            return this;
        }
        public String getTenantAccess() {
            return this.tenantAccess;
        }

    }

}
