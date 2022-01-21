// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifyCloudConnectNetworkRequest extends TeaModel {
    @NameInMap("CcnId")
    public String ccnId;

    @NameInMap("CidrBlock")
    public String cidrBlock;

    @NameInMap("Description")
    public String description;

    @NameInMap("InterworkingStatus")
    public String interworkingStatus;

    @NameInMap("Name")
    public String name;

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

    public static ModifyCloudConnectNetworkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyCloudConnectNetworkRequest self = new ModifyCloudConnectNetworkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyCloudConnectNetworkRequest setCcnId(String ccnId) {
        this.ccnId = ccnId;
        return this;
    }
    public String getCcnId() {
        return this.ccnId;
    }

    public ModifyCloudConnectNetworkRequest setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
        return this;
    }
    public String getCidrBlock() {
        return this.cidrBlock;
    }

    public ModifyCloudConnectNetworkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyCloudConnectNetworkRequest setInterworkingStatus(String interworkingStatus) {
        this.interworkingStatus = interworkingStatus;
        return this;
    }
    public String getInterworkingStatus() {
        return this.interworkingStatus;
    }

    public ModifyCloudConnectNetworkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyCloudConnectNetworkRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyCloudConnectNetworkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyCloudConnectNetworkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyCloudConnectNetworkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyCloudConnectNetworkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
