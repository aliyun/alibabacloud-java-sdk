// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class GetDeploymentDraftLockRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c84d73be-40ad-4627-8bdd-fa1eba51b234</p>
     */
    @NameInMap("deploymentDraftId")
    public String deploymentDraftId;

    public static GetDeploymentDraftLockRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDeploymentDraftLockRequest self = new GetDeploymentDraftLockRequest();
        return TeaModel.build(map, self);
    }

    public GetDeploymentDraftLockRequest setDeploymentDraftId(String deploymentDraftId) {
        this.deploymentDraftId = deploymentDraftId;
        return this;
    }
    public String getDeploymentDraftId() {
        return this.deploymentDraftId;
    }

}
