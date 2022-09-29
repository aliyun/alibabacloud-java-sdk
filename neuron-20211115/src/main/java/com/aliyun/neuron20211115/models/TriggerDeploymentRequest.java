// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class TriggerDeploymentRequest extends TeaModel {
    @NameInMap("body")
    public DeploymentTriggerCmd body;

    public static TriggerDeploymentRequest build(java.util.Map<String, ?> map) throws Exception {
        TriggerDeploymentRequest self = new TriggerDeploymentRequest();
        return TeaModel.build(map, self);
    }

    public TriggerDeploymentRequest setBody(DeploymentTriggerCmd body) {
        this.body = body;
        return this;
    }
    public DeploymentTriggerCmd getBody() {
        return this.body;
    }

}
