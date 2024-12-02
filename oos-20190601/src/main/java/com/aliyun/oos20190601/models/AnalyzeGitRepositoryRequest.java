// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class AnalyzeGitRepositoryRequest extends TeaModel {
    @NameInMap("Branch")
    public String branch;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("OrgId")
    public String orgId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Owner")
    public String owner;

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
    public String repoId;

    public static AnalyzeGitRepositoryRequest build(java.util.Map<String, ?> map) throws Exception {
        AnalyzeGitRepositoryRequest self = new AnalyzeGitRepositoryRequest();
        return TeaModel.build(map, self);
    }

    public AnalyzeGitRepositoryRequest setBranch(String branch) {
        this.branch = branch;
        return this;
    }
    public String getBranch() {
        return this.branch;
    }

    public AnalyzeGitRepositoryRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AnalyzeGitRepositoryRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public AnalyzeGitRepositoryRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public AnalyzeGitRepositoryRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public AnalyzeGitRepositoryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AnalyzeGitRepositoryRequest setRepoFullName(String repoFullName) {
        this.repoFullName = repoFullName;
        return this;
    }
    public String getRepoFullName() {
        return this.repoFullName;
    }

    public AnalyzeGitRepositoryRequest setRepoId(String repoId) {
        this.repoId = repoId;
        return this;
    }
    public String getRepoId() {
        return this.repoId;
    }

}
