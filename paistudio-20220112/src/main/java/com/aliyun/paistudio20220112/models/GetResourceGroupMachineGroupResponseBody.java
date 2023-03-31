// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class GetResourceGroupMachineGroupResponseBody extends TeaModel {
    @NameInMap("Cpu")
    public String cpu;

    @NameInMap("EcsCount")
    public Long ecsCount;

    @NameInMap("EcsSpec")
    public String ecsSpec;

    @NameInMap("GmtCreatedTime")
    public String gmtCreatedTime;

    @NameInMap("GmtExpiredTime")
    public String gmtExpiredTime;

    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    @NameInMap("GmtStartedTime")
    public String gmtStartedTime;

    @NameInMap("Gpu")
    public String gpu;

    @NameInMap("GpuType")
    public String gpuType;

    @NameInMap("MachineGroupID")
    public String machineGroupID;

    @NameInMap("Memory")
    public String memory;

    @NameInMap("PaymentDuration")
    public String paymentDuration;

    @NameInMap("PaymentDurationUnit")
    public String paymentDurationUnit;

    @NameInMap("PaymentType")
    public String paymentType;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceGroupID")
    public String resourceGroupID;

    @NameInMap("Status")
    public String status;

    public static GetResourceGroupMachineGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetResourceGroupMachineGroupResponseBody self = new GetResourceGroupMachineGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public GetResourceGroupMachineGroupResponseBody setCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }
    public String getCpu() {
        return this.cpu;
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

}
