// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paimodelgallery20260603.models;

import com.aliyun.tea.*;

public class GetModelDeploymentSpecRequest extends TeaModel {
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
     * <strong>example:</strong>
     * <p>%7B%22MemberType%22%3A%22Default%22%7D</p>
     */
    @NameInMap("ResourceSelections")
    public String resourceSelections;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>295949</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetModelDeploymentSpecRequest build(java.util.Map<String, ?> map) throws Exception {
        GetModelDeploymentSpecRequest self = new GetModelDeploymentSpecRequest();
        return TeaModel.build(map, self);
    }

    public GetModelDeploymentSpecRequest setBizKey(String bizKey) {
        this.bizKey = bizKey;
        return this;
    }
    public String getBizKey() {
        return this.bizKey;
    }

    public GetModelDeploymentSpecRequest setModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
        return this;
    }
    public String getModelVersion() {
        return this.modelVersion;
    }

    public GetModelDeploymentSpecRequest setProfileId(String profileId) {
        this.profileId = profileId;
        return this;
    }
    public String getProfileId() {
        return this.profileId;
    }

    public GetModelDeploymentSpecRequest setResourceSelections(String resourceSelections) {
        this.resourceSelections = resourceSelections;
        return this;
    }
    public String getResourceSelections() {
        return this.resourceSelections;
    }

    public GetModelDeploymentSpecRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
