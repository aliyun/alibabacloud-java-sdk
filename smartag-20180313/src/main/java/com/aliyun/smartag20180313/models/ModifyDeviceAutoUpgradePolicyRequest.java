// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifyDeviceAutoUpgradePolicyRequest extends TeaModel {
    @NameInMap("CronExpression")
    public String cronExpression;

    @NameInMap("Duration")
    public Integer duration;

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

    @NameInMap("SerialNumber")
    public String serialNumber;

    @NameInMap("SmartAGId")
    public String smartAGId;

    @NameInMap("TimeZone")
    public String timeZone;

    @NameInMap("UpgradeType")
    public String upgradeType;

    @NameInMap("VersionType")
    public String versionType;

    public static ModifyDeviceAutoUpgradePolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDeviceAutoUpgradePolicyRequest self = new ModifyDeviceAutoUpgradePolicyRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDeviceAutoUpgradePolicyRequest setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
        return this;
    }
    public String getCronExpression() {
        return this.cronExpression;
    }

    public ModifyDeviceAutoUpgradePolicyRequest setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public ModifyDeviceAutoUpgradePolicyRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyDeviceAutoUpgradePolicyRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyDeviceAutoUpgradePolicyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyDeviceAutoUpgradePolicyRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyDeviceAutoUpgradePolicyRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyDeviceAutoUpgradePolicyRequest setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }
    public String getSerialNumber() {
        return this.serialNumber;
    }

    public ModifyDeviceAutoUpgradePolicyRequest setSmartAGId(String smartAGId) {
        this.smartAGId = smartAGId;
        return this;
    }
    public String getSmartAGId() {
        return this.smartAGId;
    }

    public ModifyDeviceAutoUpgradePolicyRequest setTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }
    public String getTimeZone() {
        return this.timeZone;
    }

    public ModifyDeviceAutoUpgradePolicyRequest setUpgradeType(String upgradeType) {
        this.upgradeType = upgradeType;
        return this;
    }
    public String getUpgradeType() {
        return this.upgradeType;
    }

    public ModifyDeviceAutoUpgradePolicyRequest setVersionType(String versionType) {
        this.versionType = versionType;
        return this;
    }
    public String getVersionType() {
        return this.versionType;
    }

}
