// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class GetMachineGroupResponseBody extends TeaModel {
    @NameInMap("Count")
    public Long count;

    @NameInMap("DefaultDriver")
    public String defaultDriver;

    @NameInMap("Duration")
    public String duration;

    @NameInMap("EcsType")
    public String ecsType;

    @NameInMap("GmtCreated")
    public String gmtCreated;

    @NameInMap("GmtExpired")
    public String gmtExpired;

    @NameInMap("GmtModified")
    public String gmtModified;

    @NameInMap("GmtStarted")
    public String gmtStarted;

    @NameInMap("MachineGroupID")
    public String machineGroupID;

    @NameInMap("OrderID")
    public String orderID;

    @NameInMap("PAIResourceID")
    public String PAIResourceID;

    @NameInMap("PayType")
    public String payType;

    @NameInMap("PricingCycle")
    public String pricingCycle;

    @NameInMap("RegionID")
    public String regionID;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

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
