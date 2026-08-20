// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paimodelgallery20260603.models;

import com.aliyun.tea.*;

public class GetModelDeploymentResourcesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cmu-biz</p>
     */
    @NameInMap("BizKey")
    public String bizKey;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0.0</p>
     */
    @NameInMap("ModelVersion")
    public String modelVersion;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>prf_5cd37a1c7eaa***c6829dbb02</p>
     */
    @NameInMap("ProfileId")
    public String profileId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>295949</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetModelDeploymentResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetModelDeploymentResourcesRequest self = new GetModelDeploymentResourcesRequest();
        return TeaModel.build(map, self);
    }

    public GetModelDeploymentResourcesRequest setBizKey(String bizKey) {
        this.bizKey = bizKey;
        return this;
    }
    public String getBizKey() {
        return this.bizKey;
    }

    public GetModelDeploymentResourcesRequest setModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
        return this;
    }
    public String getModelVersion() {
        return this.modelVersion;
    }

    public GetModelDeploymentResourcesRequest setProfileId(String profileId) {
        this.profileId = profileId;
        return this;
    }
    public String getProfileId() {
        return this.profileId;
    }

    public GetModelDeploymentResourcesRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
