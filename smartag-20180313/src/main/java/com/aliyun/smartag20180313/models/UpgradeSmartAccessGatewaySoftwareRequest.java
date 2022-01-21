// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class UpgradeSmartAccessGatewaySoftwareRequest extends TeaModel {
    @NameInMap("AutoPay")
    public Boolean autoPay;

    @NameInMap("DataPlan")
    public Long dataPlan;

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

    @NameInMap("UserCount")
    public Integer userCount;

    public static UpgradeSmartAccessGatewaySoftwareRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradeSmartAccessGatewaySoftwareRequest self = new UpgradeSmartAccessGatewaySoftwareRequest();
        return TeaModel.build(map, self);
    }

    public UpgradeSmartAccessGatewaySoftwareRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public UpgradeSmartAccessGatewaySoftwareRequest setDataPlan(Long dataPlan) {
        this.dataPlan = dataPlan;
        return this;
    }
    public Long getDataPlan() {
        return this.dataPlan;
    }

    public UpgradeSmartAccessGatewaySoftwareRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public UpgradeSmartAccessGatewaySoftwareRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpgradeSmartAccessGatewaySoftwareRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpgradeSmartAccessGatewaySoftwareRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpgradeSmartAccessGatewaySoftwareRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UpgradeSmartAccessGatewaySoftwareRequest setSmartAGId(String smartAGId) {
        this.smartAGId = smartAGId;
        return this;
    }
    public String getSmartAGId() {
        return this.smartAGId;
    }

    public UpgradeSmartAccessGatewaySoftwareRequest setUserCount(Integer userCount) {
        this.userCount = userCount;
        return this;
    }
    public Integer getUserCount() {
        return this.userCount;
    }

}
