// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifyDeviceAutoUpgradePolicyRequest extends TeaModel {
    /**
     * <p>The time when upgrades start. Valid values: Set the parameter in a cron expression.</p>
     * <p>For example, you can use <code>0 0 4 1/1 * ?</code> to specify 04:00:00 (UTC+8) on the first day of each month.</p>
     * 
     * <strong>example:</strong>
     * <p>0 0 4 1/1 * ?</p>
     */
    @NameInMap("CronExpression")
    public String cronExpression;

    /**
     * <p>The time period during which upgrades are performed. Valid values: <strong>30 to 120</strong>.</p>
     * <p>Unit: minutes.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("Duration")
    public Integer duration;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region where the SAG instance is deployed.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The serial number of the SAG device.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sage62x022502****</p>
     */
    @NameInMap("SerialNumber")
    public String serialNumber;

    /**
     * <p>The ID of the SAG instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sag-1um5x5nwhilymw****</p>
     */
    @NameInMap("SmartAGId")
    public String smartAGId;

    /**
     * <p>The time zone. Valid values:</p>
     * <p><strong>Asia/Shanghai</strong>: UTC+8 (Beijing)</p>
     * <p><strong>Asia/Hong_Kong</strong>: UTC+8 (Hong Kong)</p>
     * <p><strong>Asia/Tokyo</strong>: UTC+9 (Tokyo)</p>
     * <p><strong>Australia/Sydney</strong>: UTC+10 (Sydney)</p>
     * <p><strong>Asia/Kuala_Lumpur</strong>: UTC+8 (Kuala Lumpur)</p>
     * <p><strong>Europe/Berli</strong>: UTC+1 (Berlin)</p>
     * <p><strong>Asia/Singapore</strong>: UTC+8 (Singapore)</p>
     * <p><strong>Asia/Jakarta</strong>: UTC+7 (Jakarta)</p>
     * 
     * <strong>example:</strong>
     * <p>Asia/Shanghai</p>
     */
    @NameInMap("TimeZone")
    public String timeZone;

    /**
     * <p>The update type. Valid values:</p>
     * <ul>
     * <li><strong>scheduled</strong>: scheduled upgrade.</li>
     * <li><strong>boot</strong>: automatic upgrade upon device startup.</li>
     * <li><strong>manual</strong>: manual upgrade.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>scheduled</p>
     */
    @NameInMap("UpgradeType")
    public String upgradeType;

    /**
     * <p>The type of software for which you want to modify the upgrade policy. Valid values:</p>
     * <ul>
     * <li><strong>Device</strong>: The operating system run by the SAG device.</li>
     * <li><strong>Dpi</strong>: The signature database used by the SAG device.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Device</p>
     */
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
