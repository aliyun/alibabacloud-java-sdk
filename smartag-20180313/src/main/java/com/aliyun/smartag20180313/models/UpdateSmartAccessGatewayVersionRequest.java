// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class UpdateSmartAccessGatewayVersionRequest extends TeaModel {
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region where the SAG instance is deployed.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The serial number of the SAG device.</p>
     * 
     * <strong>example:</strong>
     * <p>sag233****</p>
     */
    @NameInMap("SerialNumber")
    public String serialNumber;

    /**
     * <p>The ID of the SAG instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sag-0ovhf732a9j*******</p>
     */
    @NameInMap("SmartAGId")
    public String smartAGId;

    /**
     * <p>The version to which you want to upgrade the SAG device.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0.1</p>
     */
    @NameInMap("VersionCode")
    public String versionCode;

    /**
     * <p>The type of software that you want to upgrade. Valid values:</p>
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

    public static UpdateSmartAccessGatewayVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSmartAccessGatewayVersionRequest self = new UpdateSmartAccessGatewayVersionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSmartAccessGatewayVersionRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public UpdateSmartAccessGatewayVersionRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateSmartAccessGatewayVersionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateSmartAccessGatewayVersionRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdateSmartAccessGatewayVersionRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UpdateSmartAccessGatewayVersionRequest setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }
    public String getSerialNumber() {
        return this.serialNumber;
    }

    public UpdateSmartAccessGatewayVersionRequest setSmartAGId(String smartAGId) {
        this.smartAGId = smartAGId;
        return this;
    }
    public String getSmartAGId() {
        return this.smartAGId;
    }

    public UpdateSmartAccessGatewayVersionRequest setVersionCode(String versionCode) {
        this.versionCode = versionCode;
        return this;
    }
    public String getVersionCode() {
        return this.versionCode;
    }

    public UpdateSmartAccessGatewayVersionRequest setVersionType(String versionType) {
        this.versionType = versionType;
        return this;
    }
    public String getVersionType() {
        return this.versionType;
    }

}
