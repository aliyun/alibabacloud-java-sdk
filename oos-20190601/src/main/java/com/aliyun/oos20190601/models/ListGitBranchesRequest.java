// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListGitBranchesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>TF-CreateApplication-1647587475-84104b89-eba5-47a8-b2fd-807b8b7d</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

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
     * <p>geegenw-j-imwinmtuej</p>
     */
    @NameInMap("Owner")
    public String owner;

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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>alibaba/fastjson</p>
     */
    @NameInMap("RepoFullName")
    public String repoFullName;

    /**
     * <strong>example:</strong>
     * <p>2642213</p>
     */
    @NameInMap("RepoId")
    public Long repoId;

    public static ListGitBranchesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListGitBranchesRequest self = new ListGitBranchesRequest();
        return TeaModel.build(map, self);
    }

    public ListGitBranchesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ListGitBranchesRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public ListGitBranchesRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public ListGitBranchesRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public ListGitBranchesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListGitBranchesRequest setRepoFullName(String repoFullName) {
        this.repoFullName = repoFullName;
        return this;
    }
    public String getRepoFullName() {
        return this.repoFullName;
    }

    public ListGitBranchesRequest setRepoId(Long repoId) {
        this.repoId = repoId;
        return this;
    }
    public Long getRepoId() {
        return this.repoId;
    }

}
