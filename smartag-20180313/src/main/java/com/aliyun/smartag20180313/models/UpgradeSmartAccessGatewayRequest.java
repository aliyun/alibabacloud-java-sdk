// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class UpgradeSmartAccessGatewayRequest extends TeaModel {
    @NameInMap("AutoPay")
    public Boolean autoPay;

    @NameInMap("BandWidthSpec")
    public Long bandWidthSpec;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SmartAGId")
    public String smartAGId;

    public static UpgradeSmartAccessGatewayRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradeSmartAccessGatewayRequest self = new UpgradeSmartAccessGatewayRequest();
        return TeaModel.build(map, self);
    }

    public UpgradeSmartAccessGatewayRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public UpgradeSmartAccessGatewayRequest setBandWidthSpec(Long bandWidthSpec) {
        this.bandWidthSpec = bandWidthSpec;
        return this;
    }
    public Long getBandWidthSpec() {
        return this.bandWidthSpec;
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

    public UpgradeSmartAccessGatewayRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
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

}
