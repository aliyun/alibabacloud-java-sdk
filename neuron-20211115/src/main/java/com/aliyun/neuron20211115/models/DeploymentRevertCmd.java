// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class DeploymentRevertCmd extends TeaModel {
    @NameInMap("accountId")
    public String accountId;

    @NameInMap("cpu")
    public Integer cpu;

    @NameInMap("deploymentId")
    public Long deploymentId;

    @NameInMap("description")
    public String description;

    @NameInMap("instanceCount")
    public Integer instanceCount;

    @NameInMap("memory")
    public Integer memory;

    @NameInMap("timeout")
    public Integer timeout;

    @NameInMap("times")
    public Integer times;

    @NameInMap("type")
    public String type;

    public static DeploymentRevertCmd build(java.util.Map<String, ?> map) throws Exception {
        DeploymentRevertCmd self = new DeploymentRevertCmd();
        return TeaModel.build(map, self);
    }

    public DeploymentRevertCmd setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public DeploymentRevertCmd setCpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }
    public Integer getCpu() {
        return this.cpu;
    }

    public DeploymentRevertCmd setDeploymentId(Long deploymentId) {
        this.deploymentId = deploymentId;
        return this;
    }
    public Long getDeploymentId() {
        return this.deploymentId;
    }

    public DeploymentRevertCmd setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DeploymentRevertCmd setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }
    public Integer getInstanceCount() {
        return this.instanceCount;
    }

    public DeploymentRevertCmd setMemory(Integer memory) {
        this.memory = memory;
        return this;
    }
    public Integer getMemory() {
        return this.memory;
    }

    public DeploymentRevertCmd setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

    public DeploymentRevertCmd setTimes(Integer times) {
        this.times = times;
        return this;
    }
    public Integer getTimes() {
        return this.times;
    }

    public DeploymentRevertCmd setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
