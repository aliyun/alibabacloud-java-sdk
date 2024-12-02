// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListGitRepositoryContentsRequest extends TeaModel {
    @NameInMap("Branch")
    public String branch;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("ContentType")
    public String contentType;

    @NameInMap("OrgId")
    public String orgId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Owner")
    public String owner;

    @NameInMap("Path")
    public String path;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Platform")
    public String platform;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RepoFullName")
    public String repoFullName;

    @NameInMap("RepoId")
    public Long repoId;

    public static ListGitRepositoryContentsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListGitRepositoryContentsRequest self = new ListGitRepositoryContentsRequest();
        return TeaModel.build(map, self);
    }

    public ListGitRepositoryContentsRequest setBranch(String branch) {
        this.branch = branch;
        return this;
    }
    public String getBranch() {
        return this.branch;
    }

    public ListGitRepositoryContentsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ListGitRepositoryContentsRequest setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public ListGitRepositoryContentsRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public ListGitRepositoryContentsRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public ListGitRepositoryContentsRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public ListGitRepositoryContentsRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public ListGitRepositoryContentsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListGitRepositoryContentsRequest setRepoFullName(String repoFullName) {
        this.repoFullName = repoFullName;
        return this;
    }
    public String getRepoFullName() {
        return this.repoFullName;
    }

    public ListGitRepositoryContentsRequest setRepoId(Long repoId) {
        this.repoId = repoId;
        return this;
    }
    public Long getRepoId() {
        return this.repoId;
    }

}
