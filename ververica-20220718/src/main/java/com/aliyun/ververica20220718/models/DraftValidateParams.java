// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class DraftValidateParams extends TeaModel {
    @NameInMap("deploymentDraftId")
    public String deploymentDraftId;

    @NameInMap("deploymentTargetName")
    public String deploymentTargetName;

    public static DraftValidateParams build(java.util.Map<String, ?> map) throws Exception {
        DraftValidateParams self = new DraftValidateParams();
        return TeaModel.build(map, self);
    }

    public DraftValidateParams setDeploymentDraftId(String deploymentDraftId) {
        this.deploymentDraftId = deploymentDraftId;
        return this;
    }
    public String getDeploymentDraftId() {
        return this.deploymentDraftId;
    }

    public DraftValidateParams setDeploymentTargetName(String deploymentTargetName) {
        this.deploymentTargetName = deploymentTargetName;
        return this;
    }
    public String getDeploymentTargetName() {
        return this.deploymentTargetName;
    }

}
