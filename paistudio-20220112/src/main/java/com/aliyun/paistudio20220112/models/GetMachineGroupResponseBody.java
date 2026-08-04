// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class GetMachineGroupResponseBody extends TeaModel {
    /**
     * <p>The number of instances in the machine group.</p>
     */
    @NameInMap("Count")
    public Long count;

    /**
     * <p>The default driver.</p>
     */
    @NameInMap("DefaultDriver")
    public String defaultDriver;

    /**
     * <p>The subscription duration. This parameter is returned only when <code>PayType</code> is <code>PrePay</code>.</p>
     */
    @NameInMap("Duration")
    public String duration;

    /**
     * <p>The ECS instance type of the machine group.</p>
     */
    @NameInMap("EcsType")
    public String ecsType;

    /**
     * <p>The time when the machine group was created.</p>
     */
    @NameInMap("GmtCreated")
    public String gmtCreated;

    /**
     * <p>The expiration time. This parameter is returned only when <code>PayType</code> is <code>PrePay</code>.</p>
     */
    @NameInMap("GmtExpired")
    public String gmtExpired;

    /**
     * <p>The time when the machine group was last modified.</p>
     */
    @NameInMap("GmtModified")
    public String gmtModified;

    /**
     * <p>The time when the machine group started.</p>
     */
    @NameInMap("GmtStarted")
    public String gmtStarted;

    /**
     * <p>The ID of the machine group.</p>
     */
    @NameInMap("MachineGroupID")
    public String machineGroupID;

    /**
     * <p>The order ID.</p>
     */
    @NameInMap("OrderID")
    public String orderID;

    /**
     * <p>The instance ID of the order.</p>
     */
    @NameInMap("OrderInstanceId")
    public String orderInstanceId;

    /**
     * <p>The PAI resource ID.</p>
     */
    @NameInMap("PAIResourceID")
    public String PAIResourceID;

    /**
     * <p>The payment type. Valid values: <code>PostPay</code> (pay-as-you-go) and <code>PrePay</code> (subscription).</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The billing cycle. This parameter is returned only when <code>PayType</code> is <code>PrePay</code>.</p>
     */
    @NameInMap("PricingCycle")
    public String pricingCycle;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionID")
    public String regionID;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the machine group.</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The drivers that the machine group supports.</p>
     */
    @NameInMap("SupportedDrivers")
    public java.util.List<String> supportedDrivers;

    public static GetMachineGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMachineGroupResponseBody self = new GetMachineGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMachineGroupResponseBody setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public GetMachineGroupResponseBody setDefaultDriver(String defaultDriver) {
        this.defaultDriver = defaultDriver;
        return this;
    }
    public String getDefaultDriver() {
        return this.defaultDriver;
    }

    public GetMachineGroupResponseBody setDuration(String duration) {
        this.duration = duration;
        return this;
    }
    public String getDuration() {
        return this.duration;
    }

    public GetMachineGroupResponseBody setEcsType(String ecsType) {
        this.ecsType = ecsType;
        return this;
    }
    public String getEcsType() {
        return this.ecsType;
    }

    public GetMachineGroupResponseBody setGmtCreated(String gmtCreated) {
        this.gmtCreated = gmtCreated;
        return this;
    }
    public String getGmtCreated() {
        return this.gmtCreated;
    }

    public GetMachineGroupResponseBody setGmtExpired(String gmtExpired) {
        this.gmtExpired = gmtExpired;
        return this;
    }
    public String getGmtExpired() {
        return this.gmtExpired;
    }

    public GetMachineGroupResponseBody setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public GetMachineGroupResponseBody setGmtStarted(String gmtStarted) {
        this.gmtStarted = gmtStarted;
        return this;
    }
    public String getGmtStarted() {
        return this.gmtStarted;
    }

    public GetMachineGroupResponseBody setMachineGroupID(String machineGroupID) {
        this.machineGroupID = machineGroupID;
        return this;
    }
    public String getMachineGroupID() {
        return this.machineGroupID;
    }

    public GetMachineGroupResponseBody setOrderID(String orderID) {
        this.orderID = orderID;
        return this;
    }
    public String getOrderID() {
        return this.orderID;
    }

    public GetMachineGroupResponseBody setOrderInstanceId(String orderInstanceId) {
        this.orderInstanceId = orderInstanceId;
        return this;
    }
    public String getOrderInstanceId() {
        return this.orderInstanceId;
    }

    public GetMachineGroupResponseBody setPAIResourceID(String PAIResourceID) {
        this.PAIResourceID = PAIResourceID;
        return this;
    }
    public String getPAIResourceID() {
        return this.PAIResourceID;
    }

    public GetMachineGroupResponseBody setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public GetMachineGroupResponseBody setPricingCycle(String pricingCycle) {
        this.pricingCycle = pricingCycle;
        return this;
    }
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    public GetMachineGroupResponseBody setRegionID(String regionID) {
        this.regionID = regionID;
        return this;
    }
    public String getRegionID() {
        return this.regionID;
    }

    public GetMachineGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMachineGroupResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetMachineGroupResponseBody setSupportedDrivers(java.util.List<String> supportedDrivers) {
        this.supportedDrivers = supportedDrivers;
        return this;
    }
    public java.util.List<String> getSupportedDrivers() {
        return this.supportedDrivers;
    }

}
