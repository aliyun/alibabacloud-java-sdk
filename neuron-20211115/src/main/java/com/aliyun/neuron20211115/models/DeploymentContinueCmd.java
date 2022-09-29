// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class DeploymentContinueCmd extends TeaModel {
    @NameInMap("deploymentId")
    public Long deploymentId;

    public static DeploymentContinueCmd build(java.util.Map<String, ?> map) throws Exception {
        DeploymentContinueCmd self = new DeploymentContinueCmd();
        return TeaModel.build(map, self);
    }

    public DeploymentContinueCmd setDeploymentId(Long deploymentId) {
        this.deploymentId = deploymentId;
        return this;
    }
    public Long getDeploymentId() {
        return this.deploymentId;
    }

}
