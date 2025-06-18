// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class MachineGroup extends TeaModel {
    @NameInMap("CreatorID")
    public String creatorID;

    /**
     * <strong>example:</strong>
     * <p>470.199.02</p>
     */
    @NameInMap("DefaultDriver")
    public String defaultDriver;

    @NameInMap("DiskCapacity")
    public Long diskCapacity;

    @NameInMap("DiskPL")
    public String diskPL;

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

    /**
     * <strong>example:</strong>
     * <p>mg1</p>
     */
    @NameInMap("MachineGroupID")
    public String machineGroupID;

    @NameInMap("OrderInstanceId")
    public String orderInstanceId;

    @NameInMap("PaymentDuration")
    public String paymentDuration;

    @NameInMap("PaymentDurationUnit")
    public String paymentDurationUnit;

    @NameInMap("PaymentType")
    public String paymentType;

    @NameInMap("ReasonCode")
    public String reasonCode;

    @NameInMap("ReasonMessage")
    public String reasonMessage;

    @NameInMap("ResourceGroupID")
    public String resourceGroupID;

    @NameInMap("Status")
    public String status;

    @NameInMap("SupportedDrivers")
    public java.util.List<String> supportedDrivers;

    public static MachineGroup build(java.util.Map<String, ?> map) throws Exception {
        MachineGroup self = new MachineGroup();
        return TeaModel.build(map, self);
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

    public MachineGroup setMachineGroupID(String machineGroupID) {
        this.machineGroupID = machineGroupID;
        return this;
    }
    public String getMachineGroupID() {
        return this.machineGroupID;
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

}
