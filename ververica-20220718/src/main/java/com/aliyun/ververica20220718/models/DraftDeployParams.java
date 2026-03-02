// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class DraftDeployParams extends TeaModel {
    /**
     * <p>The draft ID.</p>
     * 
     * <strong>example:</strong>
     * <p>c84d73be-40ad-4627-8bdd-fa1eba51****</p>
     */
    @NameInMap("deploymentDraftId")
    public String deploymentDraftId;

    /**
     * <p>The cluster on which the deployment is deployed.</p>
     */
    @NameInMap("deploymentTarget")
    public BriefDeploymentTarget deploymentTarget;

    /**
     * <p>Specifies whether to skip the syntax check.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("skipValidate")
    public Boolean skipValidate;

    public static DraftDeployParams build(java.util.Map<String, ?> map) throws Exception {
        DraftDeployParams self = new DraftDeployParams();
        return TeaModel.build(map, self);
    }

    public DraftDeployParams setDeploymentDraftId(String deploymentDraftId) {
        this.deploymentDraftId = deploymentDraftId;
        return this;
    }
    public String getDeploymentDraftId() {
        return this.deploymentDraftId;
    }

    public DraftDeployParams setDeploymentTarget(BriefDeploymentTarget deploymentTarget) {
        this.deploymentTarget = deploymentTarget;
        return this;
    }
    public BriefDeploymentTarget getDeploymentTarget() {
        return this.deploymentTarget;
    }

    public DraftDeployParams setSkipValidate(Boolean skipValidate) {
        this.skipValidate = skipValidate;
        return this;
    }
    public Boolean getSkipValidate() {
        return this.skipValidate;
    }

}
