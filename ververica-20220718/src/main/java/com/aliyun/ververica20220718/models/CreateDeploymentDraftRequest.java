// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class CreateDeploymentDraftRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("body")
    public DeploymentDraft body;

    public static CreateDeploymentDraftRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDeploymentDraftRequest self = new CreateDeploymentDraftRequest();
        return TeaModel.build(map, self);
    }

    public CreateDeploymentDraftRequest setBody(DeploymentDraft body) {
        this.body = body;
        return this;
    }
    public DeploymentDraft getBody() {
        return this.body;
    }

}
