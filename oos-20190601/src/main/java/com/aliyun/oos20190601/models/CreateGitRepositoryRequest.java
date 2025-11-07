// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class CreateGitRepositoryRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>TF-CreateApplication-1647587475-84104b89-eba5-47a8-b2fd-807b8b7d</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("IsPrivate")
    public Boolean isPrivate;

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
     * <p>JJGGu</p>
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
     * <strong>example:</strong>
     * <p>main</p>
     */
    @NameInMap("SourceRepoBranch")
    public String sourceRepoBranch;

    /**
     * <strong>example:</strong>
     * <p>test-repo</p>
     */
    @NameInMap("SourceRepoName")
    public String sourceRepoName;

    /**
     * <strong>example:</strong>
     * <p>aliyun-computenest</p>
     */
    @NameInMap("SourceRepoOwner")
    public String sourceRepoOwner;

    /**
     * <strong>example:</strong>
     * <p>test-repo</p>
     */
    @NameInMap("TargetRepoName")
    public String targetRepoName;

    /**
     * <strong>example:</strong>
     * <p>namexx</p>
     */
    @NameInMap("TargetRepoOwner")
    public String targetRepoOwner;

    public static CreateGitRepositoryRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGitRepositoryRequest self = new CreateGitRepositoryRequest();
        return TeaModel.build(map, self);
    }

    public CreateGitRepositoryRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateGitRepositoryRequest setIsPrivate(Boolean isPrivate) {
        this.isPrivate = isPrivate;
        return this;
    }
    public Boolean getIsPrivate() {
        return this.isPrivate;
    }

    public CreateGitRepositoryRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public CreateGitRepositoryRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public CreateGitRepositoryRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public CreateGitRepositoryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateGitRepositoryRequest setSourceRepoBranch(String sourceRepoBranch) {
        this.sourceRepoBranch = sourceRepoBranch;
        return this;
    }
    public String getSourceRepoBranch() {
        return this.sourceRepoBranch;
    }

    public CreateGitRepositoryRequest setSourceRepoName(String sourceRepoName) {
        this.sourceRepoName = sourceRepoName;
        return this;
    }
    public String getSourceRepoName() {
        return this.sourceRepoName;
    }

    public CreateGitRepositoryRequest setSourceRepoOwner(String sourceRepoOwner) {
        this.sourceRepoOwner = sourceRepoOwner;
        return this;
    }
    public String getSourceRepoOwner() {
        return this.sourceRepoOwner;
    }

    public CreateGitRepositoryRequest setTargetRepoName(String targetRepoName) {
        this.targetRepoName = targetRepoName;
        return this;
    }
    public String getTargetRepoName() {
        return this.targetRepoName;
    }

    public CreateGitRepositoryRequest setTargetRepoOwner(String targetRepoOwner) {
        this.targetRepoOwner = targetRepoOwner;
        return this;
    }
    public String getTargetRepoOwner() {
        return this.targetRepoOwner;
    }

}
