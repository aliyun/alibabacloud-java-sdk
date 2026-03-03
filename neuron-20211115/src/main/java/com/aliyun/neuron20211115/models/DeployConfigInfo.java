// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class DeployConfigInfo extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("cpu")
    public Integer cpu;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("deploymentId")
    public Long deploymentId;

    /**
     * <strong>example:</strong>
     * <p>AUTO</p>
     */
    @NameInMap("deploymentType")
    public String deploymentType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TEST</p>
     */
    @NameInMap("env")
    public String env;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("finish")
    public Boolean finish;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("instanceCount")
    public Integer instanceCount;

    @NameInMap("isMonitorEnable")
    public Integer isMonitorEnable;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("isServiceGroupEnable")
    public Integer isServiceGroupEnable;

    /**
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("memory")
    public Integer memory;

    /**
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("pipelineId")
    public String pipelineId;

    @NameInMap("preStop")
    public String preStop;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("serviceGroupId")
    public Long serviceGroupId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("serviceId")
    public Long serviceId;

    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("timeout")
    public Integer timeout;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
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

    public DeployConfigInfo setIsMonitorEnable(Integer isMonitorEnable) {
        this.isMonitorEnable = isMonitorEnable;
        return this;
    }
    public Integer getIsMonitorEnable() {
        return this.isMonitorEnable;
    }

    public DeployConfigInfo setIsServiceGroupEnable(Integer isServiceGroupEnable) {
        this.isServiceGroupEnable = isServiceGroupEnable;
        return this;
    }
    public Integer getIsServiceGroupEnable() {
        return this.isServiceGroupEnable;
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

    public DeployConfigInfo setPreStop(String preStop) {
        this.preStop = preStop;
        return this;
    }
    public String getPreStop() {
        return this.preStop;
    }

    public DeployConfigInfo setServiceGroupId(Long serviceGroupId) {
        this.serviceGroupId = serviceGroupId;
        return this;
    }
    public Long getServiceGroupId() {
        return this.serviceGroupId;
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
