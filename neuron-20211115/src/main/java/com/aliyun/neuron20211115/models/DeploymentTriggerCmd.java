// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class DeploymentTriggerCmd extends TeaModel {
    @NameInMap("accountId")
    public String accountId;

    @NameInMap("cpu")
    public Integer cpu;

    @NameInMap("description")
    public String description;

    @NameInMap("env")
    public String env;

    @NameInMap("imageTag")
    public String imageTag;

    @NameInMap("instanceCount")
    public Integer instanceCount;

    @NameInMap("memory")
    public Integer memory;

    @NameInMap("serviceId")
    public Long serviceId;

    @NameInMap("timeout")
    public Integer timeout;

    @NameInMap("times")
    public Integer times;

    @NameInMap("type")
    public String type;

    public static DeploymentTriggerCmd build(java.util.Map<String, ?> map) throws Exception {
        DeploymentTriggerCmd self = new DeploymentTriggerCmd();
        return TeaModel.build(map, self);
    }

    public DeploymentTriggerCmd setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public DeploymentTriggerCmd setCpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }
    public Integer getCpu() {
        return this.cpu;
    }

    public DeploymentTriggerCmd setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DeploymentTriggerCmd setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public DeploymentTriggerCmd setImageTag(String imageTag) {
        this.imageTag = imageTag;
        return this;
    }
    public String getImageTag() {
        return this.imageTag;
    }

    public DeploymentTriggerCmd setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }
    public Integer getInstanceCount() {
        return this.instanceCount;
    }

    public DeploymentTriggerCmd setMemory(Integer memory) {
        this.memory = memory;
        return this;
    }
    public Integer getMemory() {
        return this.memory;
    }

    public DeploymentTriggerCmd setServiceId(Long serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public Long getServiceId() {
        return this.serviceId;
    }

    public DeploymentTriggerCmd setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

    public DeploymentTriggerCmd setTimes(Integer times) {
        this.times = times;
        return this;
    }
    public Integer getTimes() {
        return this.times;
    }

    public DeploymentTriggerCmd setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
