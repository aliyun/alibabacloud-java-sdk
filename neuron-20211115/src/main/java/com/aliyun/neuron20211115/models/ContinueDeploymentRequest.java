// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ContinueDeploymentRequest extends TeaModel {
    @NameInMap("body")
    public DeploymentContinueCmd body;

    public static ContinueDeploymentRequest build(java.util.Map<String, ?> map) throws Exception {
        ContinueDeploymentRequest self = new ContinueDeploymentRequest();
        return TeaModel.build(map, self);
    }

    public ContinueDeploymentRequest setBody(DeploymentContinueCmd body) {
        this.body = body;
        return this;
    }
    public DeploymentContinueCmd getBody() {
        return this.body;
    }

}
