// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class MachineGroup extends TeaModel {
    /**
     * <p>The number of allocatable CPU cores.</p>
     * 
     * <strong>example:</strong>
     * <p>16</p>
     */
    @NameInMap("AllocatableCpu")
    public Long allocatableCpu;

    /**
     * <p>The allocatable memory size.</p>
     * 
     * <strong>example:</strong>
     * <p>55</p>
     */
    @NameInMap("AllocatableMemory")
    public Long allocatableMemory;

    /**
     * <p>The number of CPU cores in the machine group.</p>
     * 
     * <strong>example:</strong>
     * <p>16</p>
     */
    @NameInMap("Cpu")
    public Long cpu;

    /**
     * <p>The ID of the machine group creator.</p>
     * 
     * <strong>example:</strong>
     * <p>1612285282502324</p>
     */
    @NameInMap("CreatorID")
    public String creatorID;

    /**
     * <p>The default driver supported by the machine group.</p>
     * 
     * <strong>example:</strong>
     * <p>470.199.02</p>
     */
    @NameInMap("DefaultDriver")
    public String defaultDriver;

    /**
     * <p>The cloud disk size.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("DiskCapacity")
    public Long diskCapacity;

    /**
     * <p>The cloud disk performance level.</p>
     * 
     * <strong>example:</strong>
     * <p>PL0</p>
     */
    @NameInMap("DiskPL")
    public String diskPL;

    /**
     * <p>The resource count.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("EcsCount")
    public Long ecsCount;

    /**
     * <p>The ECS instance type.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs.c6.large</p>
     */
    @NameInMap("EcsSpec")
    public String ecsSpec;

    /**
     * <p>The creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-06-22T00:00:00Z</p>
     */
    @NameInMap("GmtCreatedTime")
    public String gmtCreatedTime;

    /**
     * <p>The expiration time.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-08-22T00:00:00Z</p>
     */
    @NameInMap("GmtExpiredTime")
    public String gmtExpiredTime;

    /**
     * <p>The update time.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-06-22T00:00:00Z</p>
     */
    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    /**
     * <p>The start time.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-06-22T00:00:00Z</p>
     */
    @NameInMap("GmtStartedTime")
    public String gmtStartedTime;

    /**
     * <p>The number of GPUs in the machine group.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Gpu")
    public Long gpu;

    /**
     * <p>The GPU memory size of the machine group.</p>
     * 
     * <strong>example:</strong>
     * <p>16</p>
     */
    @NameInMap("GpuMemory")
    public Long gpuMemory;

    /**
     * <p>The GPU type of the machine group.</p>
     * 
     * <strong>example:</strong>
     * <p>A100</p>
     */
    @NameInMap("GpuType")
    public String gpuType;

    /**
     * <p>The machine group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>mg1</p>
     */
    @NameInMap("MachineGroupID")
    public String machineGroupID;

    /**
     * <p>The memory size of the machine group.</p>
     * 
     * <strong>example:</strong>
     * <p>64</p>
     */
    @NameInMap("Memory")
    public Long memory;

    /**
     * <p>The order ID.</p>
     * 
     * <strong>example:</strong>
     * <p>“”</p>
     */
    @NameInMap("OrderInstanceId")
    public String orderInstanceId;

    /**
     * <p>The duration.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PaymentDuration")
    public String paymentDuration;

    /**
     * <p>region ID</p>
     * 
     * <strong>example:</strong>
     * <p>Monthly</p>
     */
    @NameInMap("PaymentDurationUnit")
    public String paymentDurationUnit;

    /**
     * <p>The billing method.</p>
     * 
     * <strong>example:</strong>
     * <p>PREPAY</p>
     */
    @NameInMap("PaymentType")
    public String paymentType;

    /**
     * <p>The machine group error code.</p>
     * 
     * <strong>example:</strong>
     * <p>“”</p>
     */
    @NameInMap("ReasonCode")
    public String reasonCode;

    /**
     * <p>The machine group error message.</p>
     * 
     * <strong>example:</strong>
     * <p>“”</p>
     */
    @NameInMap("ReasonMessage")
    public String reasonMessage;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rgf0zhfqn1d4ity2</p>
     */
    @NameInMap("ResourceGroupID")
    public String resourceGroupID;

    /**
     * <p>The resource type.</p>
     * 
     * <strong>example:</strong>
     * <p>ECS</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The machine group status.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The list of NVIDIA GPU driver versions supported by the machine group.</p>
     */
    @NameInMap("SupportedDrivers")
    public java.util.List<String> supportedDrivers;

    /**
     * <p>The number of system-reserved CPU cores.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SystemReservedCpu")
    public Long systemReservedCpu;

    /**
     * <p>The size of system-reserved memory.</p>
     * 
     * <strong>example:</strong>
     * <p>9</p>
     */
    @NameInMap("SystemReservedMemory")
    public Long systemReservedMemory;

    public static MachineGroup build(java.util.Map<String, ?> map) throws Exception {
        MachineGroup self = new MachineGroup();
        return TeaModel.build(map, self);
    }

    public MachineGroup setAllocatableCpu(Long allocatableCpu) {
        this.allocatableCpu = allocatableCpu;
        return this;
    }
    public Long getAllocatableCpu() {
        return this.allocatableCpu;
    }

    public MachineGroup setAllocatableMemory(Long allocatableMemory) {
        this.allocatableMemory = allocatableMemory;
        return this;
    }
    public Long getAllocatableMemory() {
        return this.allocatableMemory;
    }

    public MachineGroup setCpu(Long cpu) {
        this.cpu = cpu;
        return this;
    }
    public Long getCpu() {
        return this.cpu;
    }

    public MachineGroup setCreatorID(String creatorID) {
        this.creatorID = creatorID;
        return this;
    }
    public String getCreatorID() {
        return this.creatorID;
    }

    public MachineGroup setDefaultDriver(String defaultDriver) {
        this.defaultDriver = defaultDriver;
        return this;
    }
    public String getDefaultDriver() {
        return this.defaultDriver;
    }

    public MachineGroup setDiskCapacity(Long diskCapacity) {
        this.diskCapacity = diskCapacity;
        return this;
    }
    public Long getDiskCapacity() {
        return this.diskCapacity;
    }

    public MachineGroup setDiskPL(String diskPL) {
        this.diskPL = diskPL;
        return this;
    }
    public String getDiskPL() {
        return this.diskPL;
    }

    public MachineGroup setEcsCount(Long ecsCount) {
        this.ecsCount = ecsCount;
        return this;
    }
    public Long getEcsCount() {
        return this.ecsCount;
    }

    public MachineGroup setEcsSpec(String ecsSpec) {
        this.ecsSpec = ecsSpec;
        return this;
    }
    public String getEcsSpec() {
        return this.ecsSpec;
    }

    public MachineGroup setGmtCreatedTime(String gmtCreatedTime) {
        this.gmtCreatedTime = gmtCreatedTime;
        return this;
    }
    public String getGmtCreatedTime() {
        return this.gmtCreatedTime;
    }

    public MachineGroup setGmtExpiredTime(String gmtExpiredTime) {
        this.gmtExpiredTime = gmtExpiredTime;
        return this;
    }
    public String getGmtExpiredTime() {
        return this.gmtExpiredTime;
    }

    public MachineGroup setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public MachineGroup setGmtStartedTime(String gmtStartedTime) {
        this.gmtStartedTime = gmtStartedTime;
        return this;
    }
    public String getGmtStartedTime() {
        return this.gmtStartedTime;
    }

    public MachineGroup setGpu(Long gpu) {
        this.gpu = gpu;
        return this;
    }
    public Long getGpu() {
        return this.gpu;
    }

    public MachineGroup setGpuMemory(Long gpuMemory) {
        this.gpuMemory = gpuMemory;
        return this;
    }
    public Long getGpuMemory() {
        return this.gpuMemory;
    }

    public MachineGroup setGpuType(String gpuType) {
        this.gpuType = gpuType;
        return this;
    }
    public String getGpuType() {
        return this.gpuType;
    }

    public MachineGroup setMachineGroupID(String machineGroupID) {
        this.machineGroupID = machineGroupID;
        return this;
    }
    public String getMachineGroupID() {
        return this.machineGroupID;
    }

    public MachineGroup setMemory(Long memory) {
        this.memory = memory;
        return this;
    }
    public Long getMemory() {
        return this.memory;
    }

    public MachineGroup setOrderInstanceId(String orderInstanceId) {
        this.orderInstanceId = orderInstanceId;
        return this;
    }
    public String getOrderInstanceId() {
        return this.orderInstanceId;
    }

    public MachineGroup setPaymentDuration(String paymentDuration) {
        this.paymentDuration = paymentDuration;
        return this;
    }
    public String getPaymentDuration() {
        return this.paymentDuration;
    }

    public MachineGroup setPaymentDurationUnit(String paymentDurationUnit) {
        this.paymentDurationUnit = paymentDurationUnit;
        return this;
    }
    public String getPaymentDurationUnit() {
        return this.paymentDurationUnit;
    }

    public MachineGroup setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public String getPaymentType() {
        return this.paymentType;
    }

    public MachineGroup setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
        return this;
    }
    public String getReasonCode() {
        return this.reasonCode;
    }

    public MachineGroup setReasonMessage(String reasonMessage) {
        this.reasonMessage = reasonMessage;
        return this;
    }
    public String getReasonMessage() {
        return this.reasonMessage;
    }

    public MachineGroup setResourceGroupID(String resourceGroupID) {
        this.resourceGroupID = resourceGroupID;
        return this;
    }
    public String getResourceGroupID() {
        return this.resourceGroupID;
    }

    public MachineGroup setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public MachineGroup setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public MachineGroup setSupportedDrivers(java.util.List<String> supportedDrivers) {
        this.supportedDrivers = supportedDrivers;
        return this;
    }
    public java.util.List<String> getSupportedDrivers() {
        return this.supportedDrivers;
    }

    public MachineGroup setSystemReservedCpu(Long systemReservedCpu) {
        this.systemReservedCpu = systemReservedCpu;
        return this;
    }
    public Long getSystemReservedCpu() {
        return this.systemReservedCpu;
    }

    public MachineGroup setSystemReservedMemory(Long systemReservedMemory) {
        this.systemReservedMemory = systemReservedMemory;
        return this;
    }
    public Long getSystemReservedMemory() {
        return this.systemReservedMemory;
    }

}
