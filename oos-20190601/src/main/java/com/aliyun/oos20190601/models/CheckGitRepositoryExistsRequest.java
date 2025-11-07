// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class CheckGitRepositoryExistsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>5ffd468b1e45db3c1cc26ad6</p>
     */
    @NameInMap("OrgId")
    public String orgId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ir9SK9n1u</p>
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
     * <p>LYH-RAIN/vue-color-avatar</p>
     */
    @NameInMap("RepoFullName")
    public String repoFullName;

    /**
     * <strong>example:</strong>
     * <p>2859382</p>
     */
    @NameInMap("RepoId")
    public Long repoId;

    public static CheckGitRepositoryExistsRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckGitRepositoryExistsRequest self = new CheckGitRepositoryExistsRequest();
        return TeaModel.build(map, self);
    }

    public CheckGitRepositoryExistsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CheckGitRepositoryExistsRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public CheckGitRepositoryExistsRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public CheckGitRepositoryExistsRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public CheckGitRepositoryExistsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CheckGitRepositoryExistsRequest setRepoFullName(String repoFullName) {
        this.repoFullName = repoFullName;
        return this;
    }
    public String getRepoFullName() {
        return this.repoFullName;
    }

    public CheckGitRepositoryExistsRequest setRepoId(Long repoId) {
        this.repoId = repoId;
        return this;
    }
    public Long getRepoId() {
        return this.repoId;
    }

}
