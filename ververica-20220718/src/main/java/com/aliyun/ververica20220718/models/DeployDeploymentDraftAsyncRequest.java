// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class DeployDeploymentDraftAsyncRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("body")
    public DraftDeployParams body;

    public static DeployDeploymentDraftAsyncRequest build(java.util.Map<String, ?> map) throws Exception {
        DeployDeploymentDraftAsyncRequest self = new DeployDeploymentDraftAsyncRequest();
        return TeaModel.build(map, self);
    }

    public DeployDeploymentDraftAsyncRequest setBody(DraftDeployParams body) {
        this.body = body;
        return this;
    }
    public DraftDeployParams getBody() {
        return this.body;
    }

}
