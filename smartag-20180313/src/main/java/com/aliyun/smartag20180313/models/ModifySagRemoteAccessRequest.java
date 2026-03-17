// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifySagRemoteAccessRequest extends TeaModel {
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The remote access IP address of the SAG device.</p>
     * 
     * <strong>example:</strong>
     * <p>10.10.10.2</p>
     */
    @NameInMap("RemoteAccessIp")
    public String remoteAccessIp;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The serial number (SN) of the SAG device.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sag-100-v1p7-9</p>
     */
    @NameInMap("SerialNumber")
    public String serialNumber;

    /**
     * <p>The ID of the corresponding SAG instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sag-r79m060r6oy55******</p>
     */
    @NameInMap("SmartAGId")
    public String smartAGId;

    public static ModifySagRemoteAccessRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySagRemoteAccessRequest self = new ModifySagRemoteAccessRequest();
        return TeaModel.build(map, self);
    }

    public ModifySagRemoteAccessRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifySagRemoteAccessRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifySagRemoteAccessRequest setRemoteAccessIp(String remoteAccessIp) {
        this.remoteAccessIp = remoteAccessIp;
        return this;
    }
    public String getRemoteAccessIp() {
        return this.remoteAccessIp;
    }

    public ModifySagRemoteAccessRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifySagRemoteAccessRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifySagRemoteAccessRequest setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }
    public String getSerialNumber() {
        return this.serialNumber;
    }

    public ModifySagRemoteAccessRequest setSmartAGId(String smartAGId) {
        this.smartAGId = smartAGId;
        return this;
    }
    public String getSmartAGId() {
        return this.smartAGId;
    }

}
