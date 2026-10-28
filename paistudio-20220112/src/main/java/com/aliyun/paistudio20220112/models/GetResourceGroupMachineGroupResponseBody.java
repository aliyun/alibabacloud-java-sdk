// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class GetResourceGroupMachineGroupResponseBody extends TeaModel {
    /**
     * <p>The number of allocatable CPU cores on each machine in the machine group.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("AllocatableCpu")
    public String allocatableCpu;

    /**
     * <p>The allocatable memory size on each machine in the machine group.</p>
     * 
     * <strong>example:</strong>
     * <p>55</p>
     */
    @NameInMap("AllocatableMemory")
    public String allocatableMemory;

    /**
     * <p>The total number of CPU cores on each machine in the machine group.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Cpu")
    public String cpu;

    /**
     * <p>The default GPU driver version of each machine in the machine group.</p>
     * 
     * <strong>example:</strong>
     * <p>535</p>
     */
    @NameInMap("DefaultDriver")
    public String defaultDriver;

    /**
     * <p>The number of ECS instances.</p>
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
     * <p>The time when the machine group was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-06-22T00:00:00Z</p>
     */
    @NameInMap("GmtCreatedTime")
    public String gmtCreatedTime;

    /**
     * <p>The expiration time of the machine group.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-06-22T00:00:00Z</p>
     */
    @NameInMap("GmtExpiredTime")
    public String gmtExpiredTime;

    /**
     * <p>The time when the machine group was updated.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-06-22T00:00:00Z</p>
     */
    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    /**
     * <p>The time when the machine group was started.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-06-22T00:00:00Z</p>
     */
    @NameInMap("GmtStartedTime")
    public String gmtStartedTime;

    /**
     * <p>The number of GPU cores on each machine in the machine group.</p>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("Gpu")
    public String gpu;

    /**
     * <p>The GPU type of each machine in the machine group.</p>
     * 
     * <strong>example:</strong>
     * <p>A100</p>
     */
    @NameInMap("GpuType")
    public String gpuType;

    /**
     * <p>The ID of the machine group.</p>
     * 
     * <strong>example:</strong>
     * <p>mgmioirqjgw6c5lg</p>
     */
    @NameInMap("MachineGroupID")
    public String machineGroupID;

    /**
     * <p>The memory size of each machine in the machine group.</p>
     * 
     * <strong>example:</strong>
     * <p>64</p>
     */
    @NameInMap("Memory")
    public String memory;

    /**
     * <p>The name of the machine group.</p>
     * 
     * <strong>example:</strong>
     * <p>testMachineGroup</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The billing duration. If PaymentDurationUnit is set to Month, valid values are 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24, 36, 48, and 60.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PaymentDuration")
    public String paymentDuration;

    /**
     * <p>The billing duration unit of the machine group.</p>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
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
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>18D5A1C6-14B8-545E-8408-0A7DDB4C6B5E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the resource group. Each resource group has a globally unique ID. You can use the resource group ID to retrieve the information about the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rgf0zhfqn1d4ity2</p>
     */
    @NameInMap("ResourceGroupID")
    public String resourceGroupID;

    /**
     * <p>The instance status. Valid values:</p>
     * <ul>
     * <li>Creating: The instance is being created.</li>
     * <li>Ready: The instance is running.</li>
     * <li>Expiring: The instance is about to expire.</li>
     * <li>Expired: The instance has expired.</li>
     * <li>Stopping: The instance is being stopped.</li>
     * <li>Stopped: The instance is stopped.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Ready</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The GPU driver versions supported by nodes in the machine group.</p>
     */
    @NameInMap("SupportedDrivers")
    public java.util.List<String> supportedDrivers;

    /**
     * <p>The number of system-reserved CPU cores on each machine in the machine group.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SystemReservedCpu")
    public String systemReservedCpu;

    /**
     * <p>The size of system-reserved memory on each machine in the machine group.</p>
     * 
     * <strong>example:</strong>
     * <p>9</p>
     */
    @NameInMap("SystemReservedMemory")
    public String systemReservedMemory;

    /**
     * <p>The list of tags to query. The value is a JSON string that contains up to 20 tags.</p>
     */
    @NameInMap("Tags")
    public java.util.List<GetResourceGroupMachineGroupResponseBodyTags> tags;

    public static GetResourceGroupMachineGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetResourceGroupMachineGroupResponseBody self = new GetResourceGroupMachineGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public GetResourceGroupMachineGroupResponseBody setAllocatableCpu(String allocatableCpu) {
        this.allocatableCpu = allocatableCpu;
        return this;
    }
    public String getAllocatableCpu() {
        return this.allocatableCpu;
    }

    public GetResourceGroupMachineGroupResponseBody setAllocatableMemory(String allocatableMemory) {
        this.allocatableMemory = allocatableMemory;
        return this;
    }
    public String getAllocatableMemory() {
        return this.allocatableMemory;
    }

    public GetResourceGroupMachineGroupResponseBody setCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }
    public String getCpu() {
        return this.cpu;
    }

    public GetResourceGroupMachineGroupResponseBody setDefaultDriver(String defaultDriver) {
        this.defaultDriver = defaultDriver;
        return this;
    }
    public String getDefaultDriver() {
        return this.defaultDriver;
    }

    public GetResourceGroupMachineGroupResponseBody setEcsCount(Long ecsCount) {
        this.ecsCount = ecsCount;
        return this;
    }
    public Long getEcsCount() {
        return this.ecsCount;
    }

    public GetResourceGroupMachineGroupResponseBody setEcsSpec(String ecsSpec) {
        this.ecsSpec = ecsSpec;
        return this;
    }
    public String getEcsSpec() {
        return this.ecsSpec;
    }

    public GetResourceGroupMachineGroupResponseBody setGmtCreatedTime(String gmtCreatedTime) {
        this.gmtCreatedTime = gmtCreatedTime;
        return this;
    }
    public String getGmtCreatedTime() {
        return this.gmtCreatedTime;
    }

    public GetResourceGroupMachineGroupResponseBody setGmtExpiredTime(String gmtExpiredTime) {
        this.gmtExpiredTime = gmtExpiredTime;
        return this;
    }
    public String getGmtExpiredTime() {
        return this.gmtExpiredTime;
    }

    public GetResourceGroupMachineGroupResponseBody setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public GetResourceGroupMachineGroupResponseBody setGmtStartedTime(String gmtStartedTime) {
        this.gmtStartedTime = gmtStartedTime;
        return this;
    }
    public String getGmtStartedTime() {
        return this.gmtStartedTime;
    }

    public GetResourceGroupMachineGroupResponseBody setGpu(String gpu) {
        this.gpu = gpu;
        return this;
    }
    public String getGpu() {
        return this.gpu;
    }

    public GetResourceGroupMachineGroupResponseBody setGpuType(String gpuType) {
        this.gpuType = gpuType;
        return this;
    }
    public String getGpuType() {
        return this.gpuType;
    }

    public GetResourceGroupMachineGroupResponseBody setMachineGroupID(String machineGroupID) {
        this.machineGroupID = machineGroupID;
        return this;
    }
    public String getMachineGroupID() {
        return this.machineGroupID;
    }

    public GetResourceGroupMachineGroupResponseBody setMemory(String memory) {
        this.memory = memory;
        return this;
    }
    public String getMemory() {
        return this.memory;
    }

    public GetResourceGroupMachineGroupResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetResourceGroupMachineGroupResponseBody setPaymentDuration(String paymentDuration) {
        this.paymentDuration = paymentDuration;
        return this;
    }
    public String getPaymentDuration() {
        return this.paymentDuration;
    }

    public GetResourceGroupMachineGroupResponseBody setPaymentDurationUnit(String paymentDurationUnit) {
        this.paymentDurationUnit = paymentDurationUnit;
        return this;
    }
    public String getPaymentDurationUnit() {
        return this.paymentDurationUnit;
    }

    public GetResourceGroupMachineGroupResponseBody setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public String getPaymentType() {
        return this.paymentType;
    }

    public GetResourceGroupMachineGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetResourceGroupMachineGroupResponseBody setResourceGroupID(String resourceGroupID) {
        this.resourceGroupID = resourceGroupID;
        return this;
    }
    public String getResourceGroupID() {
        return this.resourceGroupID;
    }

    public GetResourceGroupMachineGroupResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetResourceGroupMachineGroupResponseBody setSupportedDrivers(java.util.List<String> supportedDrivers) {
        this.supportedDrivers = supportedDrivers;
        return this;
    }
    public java.util.List<String> getSupportedDrivers() {
        return this.supportedDrivers;
    }

    public GetResourceGroupMachineGroupResponseBody setSystemReservedCpu(String systemReservedCpu) {
        this.systemReservedCpu = systemReservedCpu;
        return this;
    }
    public String getSystemReservedCpu() {
        return this.systemReservedCpu;
    }

    public GetResourceGroupMachineGroupResponseBody setSystemReservedMemory(String systemReservedMemory) {
        this.systemReservedMemory = systemReservedMemory;
        return this;
    }
    public String getSystemReservedMemory() {
        return this.systemReservedMemory;
    }

    public GetResourceGroupMachineGroupResponseBody setTags(java.util.List<GetResourceGroupMachineGroupResponseBodyTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<GetResourceGroupMachineGroupResponseBodyTags> getTags() {
        return this.tags;
    }

    public static class GetResourceGroupMachineGroupResponseBodyTags extends TeaModel {
        /**
         * <p>The key of the tag. Valid values of N: 1 to 20.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The value of the tag. Valid values of N: 1 to 20.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static GetResourceGroupMachineGroupResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            GetResourceGroupMachineGroupResponseBodyTags self = new GetResourceGroupMachineGroupResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public GetResourceGroupMachineGroupResponseBodyTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public GetResourceGroupMachineGroupResponseBodyTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

}
