// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class UpgradeSmartAccessGatewayRequest extends TeaModel {
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SmartAGId")
    public String smartAGId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("BandWidthSpec")
    public Long bandWidthSpec;

    @NameInMap("AutoPay")
    public Boolean autoPay;

    @NameInMap("DataPlan")
    public Long dataPlan;

    @NameInMap("UserCount")
    public Integer userCount;

    public static UpgradeSmartAccessGatewayRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradeSmartAccessGatewayRequest self = new UpgradeSmartAccessGatewayRequest();
        return TeaModel.build(map, self);
    }

    public UpgradeSmartAccessGatewayRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public UpgradeSmartAccessGatewayRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpgradeSmartAccessGatewayRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpgradeSmartAccessGatewayRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UpgradeSmartAccessGatewayRequest setSmartAGId(String smartAGId) {
        this.smartAGId = smartAGId;
        return this;
    }
    public String getSmartAGId() {
        return this.smartAGId;
    }

    public UpgradeSmartAccessGatewayRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpgradeSmartAccessGatewayRequest setBandWidthSpec(Long bandWidthSpec) {
        this.bandWidthSpec = bandWidthSpec;
        return this;
    }
    public Long getBandWidthSpec() {
        return this.bandWidthSpec;
    }

    public UpgradeSmartAccessGatewayRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public UpgradeSmartAccessGatewayRequest setDataPlan(Long dataPlan) {
        this.dataPlan = dataPlan;
        return this;
    }
    public Long getDataPlan() {
        return this.dataPlan;
    }

    public UpgradeSmartAccessGatewayRequest setUserCount(Integer userCount) {
        this.userCount = userCount;
        return this;
    }
    public Integer getUserCount() {
        return this.userCount;
    }

}
