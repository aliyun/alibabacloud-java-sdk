// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class RollbackPdpServiceRequest extends TeaModel {
    @NameInMap("body")
    public DeploymentRollbackCmd body;

    public static RollbackPdpServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        RollbackPdpServiceRequest self = new RollbackPdpServiceRequest();
        return TeaModel.build(map, self);
    }

    public RollbackPdpServiceRequest setBody(DeploymentRollbackCmd body) {
        this.body = body;
        return this;
    }
    public DeploymentRollbackCmd getBody() {
        return this.body;
    }

}
