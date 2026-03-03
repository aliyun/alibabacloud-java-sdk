// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class DeploymentRevertCmd extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>121321412341</p>
     */
    @NameInMap("accountId")
    public String accountId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("cpu")
    public Integer cpu;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("deploymentId")
    public Long deploymentId;

    /**
     * <strong>example:</strong>
     * <p>员工管理</p>
     */
    @NameInMap("description")
    public String description;

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

    /**
     * <strong>example:</strong>
     * <p>300</p>
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

    public DeploymentRevertCmd setIsMonitorEnable(Integer isMonitorEnable) {
        this.isMonitorEnable = isMonitorEnable;
        return this;
    }
    public Integer getIsMonitorEnable() {
        return this.isMonitorEnable;
    }

    public DeploymentRevertCmd setIsServiceGroupEnable(Integer isServiceGroupEnable) {
        this.isServiceGroupEnable = isServiceGroupEnable;
        return this;
    }
    public Integer getIsServiceGroupEnable() {
        return this.isServiceGroupEnable;
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
