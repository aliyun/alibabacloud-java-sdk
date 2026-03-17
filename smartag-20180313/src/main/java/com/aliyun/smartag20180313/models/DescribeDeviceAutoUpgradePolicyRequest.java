// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeDeviceAutoUpgradePolicyRequest extends TeaModel {
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the SAG instance.</p>
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
     * <p>The serial number of the SAG instance.</p>
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
     * <p>sag-kxe2cv7hot7qrv****</p>
     */
    @NameInMap("SmartAGId")
    public String smartAGId;

    /**
     * <p>The type of the software for which you want to query the automatic upgrade policy. Valid values:</p>
     * <ul>
     * <li><strong>Device</strong>: The operating system that is run by the SAG instance.</li>
     * <li><strong>Dpi</strong>: The signature database that is used by the SAG instance.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Device</p>
     */
    @NameInMap("VersionType")
    public String versionType;

    public static DescribeDeviceAutoUpgradePolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeviceAutoUpgradePolicyRequest self = new DescribeDeviceAutoUpgradePolicyRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDeviceAutoUpgradePolicyRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeDeviceAutoUpgradePolicyRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeDeviceAutoUpgradePolicyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDeviceAutoUpgradePolicyRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeDeviceAutoUpgradePolicyRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeDeviceAutoUpgradePolicyRequest setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }
    public String getSerialNumber() {
        return this.serialNumber;
    }

    public DescribeDeviceAutoUpgradePolicyRequest setSmartAGId(String smartAGId) {
        this.smartAGId = smartAGId;
        return this;
    }
    public String getSmartAGId() {
        return this.smartAGId;
    }

    public DescribeDeviceAutoUpgradePolicyRequest setVersionType(String versionType) {
        this.versionType = versionType;
        return this;
    }
    public String getVersionType() {
        return this.versionType;
    }

}
