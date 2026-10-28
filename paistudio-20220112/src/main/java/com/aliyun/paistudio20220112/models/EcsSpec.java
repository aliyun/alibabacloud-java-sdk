// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class EcsSpec extends TeaModel {
    /**
     * <p>The accelerator type.</p>
     * 
     * <strong>example:</strong>
     * <p>CPU</p>
     */
    @NameInMap("AcceleratorType")
    public String acceleratorType;

    /**
     * <p>The number of CPU cores.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("Cpu")
    public Integer cpu;

    /**
     * <p>The ECS image ID.</p>
     * 
     * <strong>example:</strong>
     * <p>m-bp1g7004ksh0oeuc****</p>
     */
    @NameInMap("EcsImageId")
    public String ecsImageId;

    /**
     * <p>The number of Elastic RDMA Interface (ERI) network interface controllers.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("EriQuantity")
    public Integer eriQuantity;

    /**
     * <p>The number of GPUs.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Gpu")
    public Integer gpu;

    /**
     * <p>The GPU computing unit specifications.</p>
     */
    @NameInMap("GpuGUSpec")
    public String gpuGUSpec;

    /**
     * <p>The GPU memory size.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("GpuMemory")
    public Integer gpuMemory;

    /**
     * <strong>example:</strong>
     * <p>A100</p>
     */
    @NameInMap("GpuType")
    public String gpuType;

    /**
     * <p>The GPU type alias.</p>
     * 
     * <strong>example:</strong>
     * <p>A100</p>
     */
    @NameInMap("GpuTypeAlias")
    public String gpuTypeAlias;

    /**
     * <p>The instance type.</p>
     * 
     * <strong>example:</strong>
     * <p>ml.gu7xf.8xlarge-gu108</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The machine model.</p>
     */
    @NameInMap("MachineModel")
    public String machineModel;

    /**
     * <p>The memory resources.</p>
     * 
     * <strong>example:</strong>
     * <p>92</p>
     */
    @NameInMap("Memory")
    public Integer memory;

    /**
     * <p>The network mode.</p>
     */
    @NameInMap("NetworkMode")
    public String networkMode;

    /**
     * <p>The planned number of CPU cores.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("PlannedCpu")
    public Integer plannedCpu;

    /**
     * <p>The planned memory size.</p>
     */
    @NameInMap("PlannedMemory")
    public Integer plannedMemory;

    /**
     * <p>The resource type.</p>
     * 
     * <strong>example:</strong>
     * <p>ECS</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>Specifies whether GPU sharing is supported.</p>
     */
    @NameInMap("SupportGPUShare")
    public Boolean supportGPUShare;

    @NameInMap("SupportRDMA")
    public Boolean supportRDMA;

    /**
     * <p>Specifies whether setting the network interface controller index is supported.</p>
     */
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
