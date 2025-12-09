// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class EcsSpec extends TeaModel {
    @NameInMap("AcceleratorType")
    public String acceleratorType;

    @NameInMap("Cpu")
    public Integer cpu;

    @NameInMap("EcsImageId")
    public String ecsImageId;

    @NameInMap("EriQuantity")
    public Integer eriQuantity;

    @NameInMap("Gpu")
    public Integer gpu;

    @NameInMap("GpuGUSpec")
    public String gpuGUSpec;

    @NameInMap("GpuMemory")
    public Integer gpuMemory;

    @NameInMap("GpuType")
    public String gpuType;

    @NameInMap("GpuTypeAlias")
    public String gpuTypeAlias;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("MachineModel")
    public String machineModel;

    @NameInMap("Memory")
    public Integer memory;

    @NameInMap("NetworkMode")
    public String networkMode;

    @NameInMap("PlannedCpu")
    public Integer plannedCpu;

    @NameInMap("PlannedMemory")
    public Integer plannedMemory;

    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("SupportGPUShare")
    public Boolean supportGPUShare;

    @NameInMap("SupportRDMA")
    public Boolean supportRDMA;

    @NameInMap("SupportSetNetworkCardIndex")
    public Boolean supportSetNetworkCardIndex;

    public static EcsSpec build(java.util.Map<String, ?> map) throws Exception {
        EcsSpec self = new EcsSpec();
        return TeaModel.build(map, self);
    }

    public EcsSpec setAcceleratorType(String acceleratorType) {
        this.acceleratorType = acceleratorType;
        return this;
    }
    public String getAcceleratorType() {
        return this.acceleratorType;
    }

    public EcsSpec setCpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }
    public Integer getCpu() {
        return this.cpu;
    }

    public EcsSpec setEcsImageId(String ecsImageId) {
        this.ecsImageId = ecsImageId;
        return this;
    }
    public String getEcsImageId() {
        return this.ecsImageId;
    }

    public EcsSpec setEriQuantity(Integer eriQuantity) {
        this.eriQuantity = eriQuantity;
        return this;
    }
    public Integer getEriQuantity() {
        return this.eriQuantity;
    }

    public EcsSpec setGpu(Integer gpu) {
        this.gpu = gpu;
        return this;
    }
    public Integer getGpu() {
        return this.gpu;
    }

    public EcsSpec setGpuGUSpec(String gpuGUSpec) {
        this.gpuGUSpec = gpuGUSpec;
        return this;
    }
    public String getGpuGUSpec() {
        return this.gpuGUSpec;
    }

    public EcsSpec setGpuMemory(Integer gpuMemory) {
        this.gpuMemory = gpuMemory;
        return this;
    }
    public Integer getGpuMemory() {
        return this.gpuMemory;
    }

    public EcsSpec setGpuType(String gpuType) {
        this.gpuType = gpuType;
        return this;
    }
    public String getGpuType() {
        return this.gpuType;
    }

    public EcsSpec setGpuTypeAlias(String gpuTypeAlias) {
        this.gpuTypeAlias = gpuTypeAlias;
        return this;
    }
    public String getGpuTypeAlias() {
        return this.gpuTypeAlias;
    }

    public EcsSpec setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public EcsSpec setMachineModel(String machineModel) {
        this.machineModel = machineModel;
        return this;
    }
    public String getMachineModel() {
        return this.machineModel;
    }

    public EcsSpec setMemory(Integer memory) {
        this.memory = memory;
        return this;
    }
    public Integer getMemory() {
        return this.memory;
    }

    public EcsSpec setNetworkMode(String networkMode) {
        this.networkMode = networkMode;
        return this;
    }
    public String getNetworkMode() {
        return this.networkMode;
    }

    public EcsSpec setPlannedCpu(Integer plannedCpu) {
        this.plannedCpu = plannedCpu;
        return this;
    }
    public Integer getPlannedCpu() {
        return this.plannedCpu;
    }

    public EcsSpec setPlannedMemory(Integer plannedMemory) {
        this.plannedMemory = plannedMemory;
        return this;
    }
    public Integer getPlannedMemory() {
        return this.plannedMemory;
    }

    public EcsSpec setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public EcsSpec setSupportGPUShare(Boolean supportGPUShare) {
        this.supportGPUShare = supportGPUShare;
        return this;
    }
    public Boolean getSupportGPUShare() {
        return this.supportGPUShare;
    }

    public EcsSpec setSupportRDMA(Boolean supportRDMA) {
        this.supportRDMA = supportRDMA;
        return this;
    }
    public Boolean getSupportRDMA() {
        return this.supportRDMA;
    }

    public EcsSpec setSupportSetNetworkCardIndex(Boolean supportSetNetworkCardIndex) {
        this.supportSetNetworkCardIndex = supportSetNetworkCardIndex;
        return this;
    }
    public Boolean getSupportSetNetworkCardIndex() {
        return this.supportSetNetworkCardIndex;
    }

}
