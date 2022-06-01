// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class MachineGroup extends TeaModel {
    // 机器组创建者ID
    @NameInMap("CreatorID")
    public String creatorID;

    // 资源数量
    @NameInMap("EcsCount")
    public Long ecsCount;

    // ecs规格
    @NameInMap("EcsSpec")
    public String ecsSpec;

    // 创建时间
    @NameInMap("GmtCreatedTime")
    public String gmtCreatedTime;

    // 过期时间
    @NameInMap("GmtExpiredTime")
    public String gmtExpiredTime;

    // 更新时间
    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    // 启动时间
    @NameInMap("GmtStartedTime")
    public String gmtStartedTime;

    // 机器组ID
    @NameInMap("MachineGroupID")
    public String machineGroupID;

    // 持续时长
    @NameInMap("PaymentDuration")
    public String paymentDuration;

    // region ID
    @NameInMap("PaymentDurationUnit")
    public String paymentDurationUnit;

    // 付费类型
    @NameInMap("PaymentType")
    public String paymentType;

    // 机器组错误码
    @NameInMap("ReasonCode")
    public String reasonCode;

    // 机器组错误消息
    @NameInMap("ReasonMessage")
    public String reasonMessage;

    // 资源组ID
    @NameInMap("ResourceGroupID")
    public String resourceGroupID;

    // 机器组状态
    @NameInMap("Status")
    public String status;

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

}
