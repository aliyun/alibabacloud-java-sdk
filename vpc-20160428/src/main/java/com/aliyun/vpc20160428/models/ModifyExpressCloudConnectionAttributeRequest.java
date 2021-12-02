// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyExpressCloudConnectionAttributeRequest extends TeaModel {
    @NameInMap("BgpAs")
    public String bgpAs;

    @NameInMap("CeIp")
    public String ceIp;

    @NameInMap("Description")
    public String description;

    @NameInMap("EccId")
    public String eccId;

    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PeIp")
    public String peIp;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ModifyExpressCloudConnectionAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyExpressCloudConnectionAttributeRequest self = new ModifyExpressCloudConnectionAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyExpressCloudConnectionAttributeRequest setBgpAs(String bgpAs) {
        this.bgpAs = bgpAs;
        return this;
    }
    public String getBgpAs() {
        return this.bgpAs;
    }

    public ModifyExpressCloudConnectionAttributeRequest setCeIp(String ceIp) {
        this.ceIp = ceIp;
        return this;
    }
    public String getCeIp() {
        return this.ceIp;
    }

    public ModifyExpressCloudConnectionAttributeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyExpressCloudConnectionAttributeRequest setEccId(String eccId) {
        this.eccId = eccId;
        return this;
    }
    public String getEccId() {
        return this.eccId;
    }

    public ModifyExpressCloudConnectionAttributeRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyExpressCloudConnectionAttributeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyExpressCloudConnectionAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyExpressCloudConnectionAttributeRequest setPeIp(String peIp) {
        this.peIp = peIp;
        return this;
    }
    public String getPeIp() {
        return this.peIp;
    }

    public ModifyExpressCloudConnectionAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyExpressCloudConnectionAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyExpressCloudConnectionAttributeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
