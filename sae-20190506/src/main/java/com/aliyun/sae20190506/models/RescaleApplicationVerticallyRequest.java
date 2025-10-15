// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class RescaleApplicationVerticallyRequest extends TeaModel {
    /**
     * <p>The app ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0099b7be-5f5b-4512-a7fc-56049ef1****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>Target CPU specification. Unit: millicore.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("Cpu")
    public String cpu;

    /**
     * <p>The disk size. Unit: GB.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("DiskSize")
    public String diskSize;

    /**
     * <p>Target memory specification. Unit: MB.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2048</p>
     */
    @NameInMap("Memory")
    public String memory;

    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>Enable application scale rules automatically.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("autoEnableApplicationScalingRule")
    public Boolean autoEnableApplicationScalingRule;

    /**
     * <p>The ratio of minimum ready instances.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("minReadyInstanceRatio")
    public Integer minReadyInstanceRatio;

    /**
     * <p>Minimum ready instances.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("minReadyInstances")
    public Integer minReadyInstances;

    public static RescaleApplicationVerticallyRequest build(java.util.Map<String, ?> map) throws Exception {
        RescaleApplicationVerticallyRequest self = new RescaleApplicationVerticallyRequest();
        return TeaModel.build(map, self);
    }

    public RescaleApplicationVerticallyRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public RescaleApplicationVerticallyRequest setCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }
    public String getCpu() {
        return this.cpu;
    }

    public RescaleApplicationVerticallyRequest setDiskSize(String diskSize) {
        this.diskSize = diskSize;
        return this;
    }
    public String getDiskSize() {
        return this.diskSize;
    }

    public RescaleApplicationVerticallyRequest setMemory(String memory) {
        this.memory = memory;
        return this;
    }
    public String getMemory() {
        return this.memory;
    }

    public RescaleApplicationVerticallyRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public RescaleApplicationVerticallyRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public RescaleApplicationVerticallyRequest setAutoEnableApplicationScalingRule(Boolean autoEnableApplicationScalingRule) {
        this.autoEnableApplicationScalingRule = autoEnableApplicationScalingRule;
        return this;
    }
    public Boolean getAutoEnableApplicationScalingRule() {
        return this.autoEnableApplicationScalingRule;
    }

    public RescaleApplicationVerticallyRequest setMinReadyInstanceRatio(Integer minReadyInstanceRatio) {
        this.minReadyInstanceRatio = minReadyInstanceRatio;
        return this;
    }
    public Integer getMinReadyInstanceRatio() {
        return this.minReadyInstanceRatio;
    }

    public RescaleApplicationVerticallyRequest setMinReadyInstances(Integer minReadyInstances) {
        this.minReadyInstances = minReadyInstances;
        return this;
    }
    public Integer getMinReadyInstances() {
        return this.minReadyInstances;
    }

}
