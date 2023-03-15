// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class RevertPdpServiceRequest extends TeaModel {
    @NameInMap("body")
    public DeploymentRevertCmd body;

    public static RevertPdpServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        RevertPdpServiceRequest self = new RevertPdpServiceRequest();
        return TeaModel.build(map, self);
    }

    public RevertPdpServiceRequest setBody(DeploymentRevertCmd body) {
        this.body = body;
        return this;
    }
    public DeploymentRevertCmd getBody() {
        return this.body;
    }

}
