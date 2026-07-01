// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class UpdateDeploymentDraftRequest extends TeaModel {
    /**
     * <p>The information to update the job draft.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("body")
    public DeploymentDraft body;

    public static UpdateDeploymentDraftRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDeploymentDraftRequest self = new UpdateDeploymentDraftRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDeploymentDraftRequest setBody(DeploymentDraft body) {
        this.body = body;
        return this;
    }
    public DeploymentDraft getBody() {
        return this.body;
    }

}
