// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListGitRepositoryContentsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>dev</p>
     */
    @NameInMap("Branch")
    public String branch;

    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>dir</p>
     */
    @NameInMap("ContentType")
    public String contentType;

    /**
     * <strong>example:</strong>
     * <p>6fekfmnfll135123kdf33</p>
     */
    @NameInMap("OrgId")
    public String orgId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dhuai</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <strong>example:</strong>
     * <p>dir1</p>
     */
    @NameInMap("Path")
    public String path;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gitee</p>
     */
    @NameInMap("Platform")
    public String platform;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>LYH-RAIN/vue-color-avatar</p>
     */
    @NameInMap("RepoFullName")
    public String repoFullName;

    /**
     * <strong>example:</strong>
     * <p>2642213</p>
     */
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
