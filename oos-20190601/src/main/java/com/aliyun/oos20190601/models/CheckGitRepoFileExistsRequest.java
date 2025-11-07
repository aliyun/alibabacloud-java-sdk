// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class CheckGitRepoFileExistsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>test</p>
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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>src/main/resources/config/promql_capacity.yaml</p>
     */
    @NameInMap("FilePath")
    public String filePath;

    /**
     * <strong>example:</strong>
     * <p>5f9f9f6122a8c7ff3934f99a</p>
     */
    @NameInMap("OrgId")
    public String orgId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hujue</p>
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
     * <p>2835387</p>
     */
    @NameInMap("RepoId")
    public Long repoId;

    public static CheckGitRepoFileExistsRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckGitRepoFileExistsRequest self = new CheckGitRepoFileExistsRequest();
        return TeaModel.build(map, self);
    }

    public CheckGitRepoFileExistsRequest setBranch(String branch) {
        this.branch = branch;
        return this;
    }
    public String getBranch() {
        return this.branch;
    }

    public CheckGitRepoFileExistsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CheckGitRepoFileExistsRequest setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

    public CheckGitRepoFileExistsRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public CheckGitRepoFileExistsRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public CheckGitRepoFileExistsRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public CheckGitRepoFileExistsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CheckGitRepoFileExistsRequest setRepoFullName(String repoFullName) {
        this.repoFullName = repoFullName;
        return this;
    }
    public String getRepoFullName() {
        return this.repoFullName;
    }

    public CheckGitRepoFileExistsRequest setRepoId(Long repoId) {
        this.repoId = repoId;
        return this;
    }
    public Long getRepoId() {
        return this.repoId;
    }

}
