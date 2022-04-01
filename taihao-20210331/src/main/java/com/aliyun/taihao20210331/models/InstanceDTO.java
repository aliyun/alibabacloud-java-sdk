// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class InstanceDTO extends TeaModel {
    // autoRenewal
    @NameInMap("autoRenewal")
    public Boolean autoRenewal;

    // autoRenewalDuration
    @NameInMap("autoRenewalDuration")
    public Long autoRenewalDuration;

    // bid
    @NameInMap("bid")
    public String bid;

    // commodityCode
    @NameInMap("commodityCode")
    public String commodityCode;

    // endTime
    @NameInMap("endTime")
    public Long endTime;

    // instanceId
    @NameInMap("instanceId")
    public String instanceId;

    // marketType
    @NameInMap("marketType")
    public String marketType;

    // orderId
    @NameInMap("orderId")
    public Long orderId;

    // paymentType
    @NameInMap("paymentType")
    public String paymentType;

    // regionId
    @NameInMap("regionId")
    public String regionId;

    // releaseTime
    @NameInMap("releaseTime")
    public Long releaseTime;

    // resourceType
    @NameInMap("resourceType")
    public String resourceType;

    // status
    @NameInMap("status")
    public String status;

    // userId
    @NameInMap("userId")
    public Long userId;

    public static InstanceDTO build(java.util.Map<String, ?> map) throws Exception {
        InstanceDTO self = new InstanceDTO();
        return TeaModel.build(map, self);
    }

    public InstanceDTO setAutoRenewal(Boolean autoRenewal) {
        this.autoRenewal = autoRenewal;
        return this;
    }
    public Boolean getAutoRenewal() {
        return this.autoRenewal;
    }

    public InstanceDTO setAutoRenewalDuration(Long autoRenewalDuration) {
        this.autoRenewalDuration = autoRenewalDuration;
        return this;
    }
    public Long getAutoRenewalDuration() {
        return this.autoRenewalDuration;
    }

    public InstanceDTO setBid(String bid) {
        this.bid = bid;
        return this;
    }
    public String getBid() {
        return this.bid;
    }

    public InstanceDTO setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public InstanceDTO setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public InstanceDTO setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public InstanceDTO setMarketType(String marketType) {
        this.marketType = marketType;
        return this;
    }
    public String getMarketType() {
        return this.marketType;
    }

    public InstanceDTO setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public InstanceDTO setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public String getPaymentType() {
        return this.paymentType;
    }

    public InstanceDTO setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public InstanceDTO setReleaseTime(Long releaseTime) {
        this.releaseTime = releaseTime;
        return this;
    }
    public Long getReleaseTime() {
        return this.releaseTime;
    }

    public InstanceDTO setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public InstanceDTO setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public InstanceDTO setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

}
