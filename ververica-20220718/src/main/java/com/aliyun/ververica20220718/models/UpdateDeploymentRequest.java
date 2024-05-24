// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class UpdateDeploymentRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("body")
    public Deployment body;

    public static UpdateDeploymentRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDeploymentRequest self = new UpdateDeploymentRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDeploymentRequest setBody(Deployment body) {
        this.body = body;
        return this;
    }
    public Deployment getBody() {
        return this.body;
    }

}
