// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class DeploymentTriggerCmd extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>121321412341</p>
     */
    @NameInMap("accountId")
    public String accountId;

    /**
     * <strong>example:</strong>
     * <p>DAPR</p>
     */
    @NameInMap("applicationType")
    public String applicationType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("cpu")
    public Integer cpu;

    /**
     * <strong>example:</strong>
     * <p>员工管理</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>v0.1</p>
     */
    @NameInMap("imageTag")
    public String imageTag;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("instanceCount")
    public Integer instanceCount;

    @NameInMap("isMonitorEnable")
    public Integer isMonitorEnable;

    @NameInMap("isServiceGroupEnable")
    public Integer isServiceGroupEnable;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("memory")
    public Integer memory;

    @NameInMap("preStop")
    public String preStop;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("serviceGroupId")
    public Long serviceGroupId;

    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("timeout")
    public Integer timeout;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("times")
    public Integer times;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AUTO</p>
     */
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

    public DeploymentTriggerCmd setApplicationType(String applicationType) {
        this.applicationType = applicationType;
        return this;
    }
    public String getApplicationType() {
        return this.applicationType;
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

    public DeploymentTriggerCmd setIsMonitorEnable(Integer isMonitorEnable) {
        this.isMonitorEnable = isMonitorEnable;
        return this;
    }
    public Integer getIsMonitorEnable() {
        return this.isMonitorEnable;
    }

    public DeploymentTriggerCmd setIsServiceGroupEnable(Integer isServiceGroupEnable) {
        this.isServiceGroupEnable = isServiceGroupEnable;
        return this;
    }
    public Integer getIsServiceGroupEnable() {
        return this.isServiceGroupEnable;
    }

    public DeploymentTriggerCmd setMemory(Integer memory) {
        this.memory = memory;
        return this;
    }
    public Integer getMemory() {
        return this.memory;
    }

    public DeploymentTriggerCmd setPreStop(String preStop) {
        this.preStop = preStop;
        return this;
    }
    public String getPreStop() {
        return this.preStop;
    }

    public DeploymentTriggerCmd setServiceGroupId(Long serviceGroupId) {
        this.serviceGroupId = serviceGroupId;
        return this;
    }
    public Long getServiceGroupId() {
        return this.serviceGroupId;
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
