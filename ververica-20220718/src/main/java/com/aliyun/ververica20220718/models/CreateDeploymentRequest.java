// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class CreateDeploymentRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("body")
    public Deployment body;

    public static CreateDeploymentRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDeploymentRequest self = new CreateDeploymentRequest();
        return TeaModel.build(map, self);
    }

    public CreateDeploymentRequest setBody(Deployment body) {
        this.body = body;
        return this;
    }
    public Deployment getBody() {
        return this.body;
    }

}
