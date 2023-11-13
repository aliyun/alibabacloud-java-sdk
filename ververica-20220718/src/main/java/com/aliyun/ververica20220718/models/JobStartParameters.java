// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class JobStartParameters extends TeaModel {
    @NameInMap("deploymentId")
    public String deploymentId;

    @NameInMap("resourceQueueName")
    public String resourceQueueName;

    @NameInMap("restoreStrategy")
    public DeploymentRestoreStrategy restoreStrategy;

    public static JobStartParameters build(java.util.Map<String, ?> map) throws Exception {
        JobStartParameters self = new JobStartParameters();
        return TeaModel.build(map, self);
    }

    public JobStartParameters setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
        return this;
    }
    public String getDeploymentId() {
        return this.deploymentId;
    }

    public JobStartParameters setResourceQueueName(String resourceQueueName) {
        this.resourceQueueName = resourceQueueName;
        return this;
    }
    public String getResourceQueueName() {
        return this.resourceQueueName;
    }

    public JobStartParameters setRestoreStrategy(DeploymentRestoreStrategy restoreStrategy) {
        this.restoreStrategy = restoreStrategy;
        return this;
    }
    public DeploymentRestoreStrategy getRestoreStrategy() {
        return this.restoreStrategy;
    }

}
