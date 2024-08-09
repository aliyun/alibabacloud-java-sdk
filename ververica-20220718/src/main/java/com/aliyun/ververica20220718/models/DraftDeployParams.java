// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class DraftDeployParams extends TeaModel {
    @NameInMap("deploymentDraftId")
    public String deploymentDraftId;

    @NameInMap("deploymentTarget")
    public BriefDeploymentTarget deploymentTarget;

    /**
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
