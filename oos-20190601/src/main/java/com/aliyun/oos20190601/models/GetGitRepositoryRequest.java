// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class GetGitRepositoryRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>5e9ee15af89c9700014a558a</p>
     */
    @NameInMap("OrgId")
    public String orgId;

    /**
     * <strong>example:</strong>
     * <p>testowner</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>github</p>
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
     * <p>286584</p>
     */
    @NameInMap("RepoId")
    public Long repoId;

    public static GetGitRepositoryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetGitRepositoryRequest self = new GetGitRepositoryRequest();
        return TeaModel.build(map, self);
    }

    public GetGitRepositoryRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public GetGitRepositoryRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public GetGitRepositoryRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public GetGitRepositoryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetGitRepositoryRequest setRepoFullName(String repoFullName) {
        this.repoFullName = repoFullName;
        return this;
    }
    public String getRepoFullName() {
        return this.repoFullName;
    }

    public GetGitRepositoryRequest setRepoId(Long repoId) {
        this.repoId = repoId;
        return this;
    }
    public Long getRepoId() {
        return this.repoId;
    }

}
