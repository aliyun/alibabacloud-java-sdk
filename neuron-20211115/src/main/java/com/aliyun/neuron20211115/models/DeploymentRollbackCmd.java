// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class DeploymentRollbackCmd extends TeaModel {
    @NameInMap("deploymentId")
    public Long deploymentId;

    public static DeploymentRollbackCmd build(java.util.Map<String, ?> map) throws Exception {
        DeploymentRollbackCmd self = new DeploymentRollbackCmd();
        return TeaModel.build(map, self);
    }

    public DeploymentRollbackCmd setDeploymentId(Long deploymentId) {
        this.deploymentId = deploymentId;
        return this;
    }
    public Long getDeploymentId() {
        return this.deploymentId;
    }

}
