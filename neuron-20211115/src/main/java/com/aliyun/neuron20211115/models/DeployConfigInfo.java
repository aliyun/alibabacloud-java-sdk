// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class DeployConfigInfo extends TeaModel {
    @NameInMap("cpu")
    public Integer cpu;

    @NameInMap("deploymentId")
    public Long deploymentId;

    @NameInMap("deploymentType")
    public String deploymentType;

    @NameInMap("env")
    public String env;

    @NameInMap("finish")
    public Boolean finish;

    @NameInMap("instanceCount")
    public Integer instanceCount;

    @NameInMap("memory")
    public Integer memory;

    @NameInMap("pipelineId")
    public String pipelineId;

    @NameInMap("serviceId")
    public Long serviceId;

    @NameInMap("timeout")
    public Integer timeout;

    @NameInMap("times")
    public Integer times;

    public static DeployConfigInfo build(java.util.Map<String, ?> map) throws Exception {
        DeployConfigInfo self = new DeployConfigInfo();
        return TeaModel.build(map, self);
    }

    public DeployConfigInfo setCpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }
    public Integer getCpu() {
        return this.cpu;
    }

    public DeployConfigInfo setDeploymentId(Long deploymentId) {
        this.deploymentId = deploymentId;
        return this;
    }
    public Long getDeploymentId() {
        return this.deploymentId;
    }

    public DeployConfigInfo setDeploymentType(String deploymentType) {
        this.deploymentType = deploymentType;
        return this;
    }
    public String getDeploymentType() {
        return this.deploymentType;
    }

    public DeployConfigInfo setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public DeployConfigInfo setFinish(Boolean finish) {
        this.finish = finish;
        return this;
    }
    public Boolean getFinish() {
        return this.finish;
    }

    public DeployConfigInfo setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }
    public Integer getInstanceCount() {
        return this.instanceCount;
    }

    public DeployConfigInfo setMemory(Integer memory) {
        this.memory = memory;
        return this;
    }
    public Integer getMemory() {
        return this.memory;
    }

    public DeployConfigInfo setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public String getPipelineId() {
        return this.pipelineId;
    }

    public DeployConfigInfo setServiceId(Long serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public Long getServiceId() {
        return this.serviceId;
    }

    public DeployConfigInfo setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

    public DeployConfigInfo setTimes(Integer times) {
        this.times = times;
        return this;
    }
    public Integer getTimes() {
        return this.times;
    }

}
