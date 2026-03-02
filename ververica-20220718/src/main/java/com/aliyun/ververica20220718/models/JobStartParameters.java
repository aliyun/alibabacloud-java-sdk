// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class JobStartParameters extends TeaModel {
    /**
     * <p>The deployment ID.</p>
     * 
     * <strong>example:</strong>
     * <p>737d0921-c5ac-47fc-9ba9-07a1e0b4****</p>
     */
    @NameInMap("deploymentId")
    public String deploymentId;

    @NameInMap("jobId")
    public String jobId;

    /**
     * <p>The variables.</p>
     */
    @NameInMap("localVariables")
    public java.util.List<LocalVariable> localVariables;

    /**
     * <p>The queue in which the deployment is running.</p>
     * 
     * <strong>example:</strong>
     * <p>default-queue</p>
     */
    @NameInMap("resourceQueueName")
    public String resourceQueueName;

    /**
     * <p>The configuration of the start offset of the deployment.</p>
     */
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

    public JobStartParameters setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public JobStartParameters setLocalVariables(java.util.List<LocalVariable> localVariables) {
        this.localVariables = localVariables;
        return this;
    }
    public java.util.List<LocalVariable> getLocalVariables() {
        return this.localVariables;
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
