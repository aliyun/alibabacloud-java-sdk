// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifySagManagementPortRequest extends TeaModel {
    @NameInMap("Gateway")
    public String gateway;

    @NameInMap("IP")
    public String IP;

    @NameInMap("Mask")
    public String mask;

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

    @NameInMap("SmartAGSn")
    public String smartAGSn;

    public static ModifySagManagementPortRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySagManagementPortRequest self = new ModifySagManagementPortRequest();
        return TeaModel.build(map, self);
    }

    public ModifySagManagementPortRequest setGateway(String gateway) {
        this.gateway = gateway;
        return this;
    }
    public String getGateway() {
        return this.gateway;
    }

    public ModifySagManagementPortRequest setIP(String IP) {
        this.IP = IP;
        return this;
    }
    public String getIP() {
        return this.IP;
    }

    public ModifySagManagementPortRequest setMask(String mask) {
        this.mask = mask;
        return this;
    }
    public String getMask() {
        return this.mask;
    }

    public ModifySagManagementPortRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifySagManagementPortRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifySagManagementPortRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifySagManagementPortRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifySagManagementPortRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifySagManagementPortRequest setSmartAGId(String smartAGId) {
        this.smartAGId = smartAGId;
        return this;
    }
    public String getSmartAGId() {
        return this.smartAGId;
    }

    public ModifySagManagementPortRequest setSmartAGSn(String smartAGSn) {
        this.smartAGSn = smartAGSn;
        return this;
    }
    public String getSmartAGSn() {
        return this.smartAGSn;
    }

}
