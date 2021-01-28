// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class CreateUserClusterHostRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("ChargeType")
    public String chargeType;

    @NameInMap("HostClass")
    public String hostClass;

    @NameInMap("OrderNum")
    public Integer orderNum;

    @NameInMap("OrderPeriod")
    public Integer orderPeriod;

    @NameInMap("AutoPay")
    public Boolean autoPay;

    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    @NameInMap("AgentId")
    public String agentId;

    @NameInMap("BusinessInfo")
    public String businessInfo;

    @NameInMap("CouponNo")
    public String couponNo;

    @NameInMap("Engine")
    public String engine;

    @NameInMap("ZoneId")
    public String zoneId;

    public static CreateUserClusterHostRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUserClusterHostRequest self = new CreateUserClusterHostRequest();
        return TeaModel.build(map, self);
    }

    public CreateUserClusterHostRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public CreateUserClusterHostRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateUserClusterHostRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateUserClusterHostRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateUserClusterHostRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateUserClusterHostRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateUserClusterHostRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateUserClusterHostRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public CreateUserClusterHostRequest setHostClass(String hostClass) {
        this.hostClass = hostClass;
        return this;
    }
    public String getHostClass() {
        return this.hostClass;
    }

    public CreateUserClusterHostRequest setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
        return this;
    }
    public Integer getOrderNum() {
        return this.orderNum;
    }

    public CreateUserClusterHostRequest setOrderPeriod(Integer orderPeriod) {
        this.orderPeriod = orderPeriod;
        return this;
    }
    public Integer getOrderPeriod() {
        return this.orderPeriod;
    }

    public CreateUserClusterHostRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public CreateUserClusterHostRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public CreateUserClusterHostRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public CreateUserClusterHostRequest setBusinessInfo(String businessInfo) {
        this.businessInfo = businessInfo;
        return this;
    }
    public String getBusinessInfo() {
        return this.businessInfo;
    }

    public CreateUserClusterHostRequest setCouponNo(String couponNo) {
        this.couponNo = couponNo;
        return this;
    }
    public String getCouponNo() {
        return this.couponNo;
    }

    public CreateUserClusterHostRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public CreateUserClusterHostRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
