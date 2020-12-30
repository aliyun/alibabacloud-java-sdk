// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyGlobalAccelerationInstanceAttributesRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("GlobalAccelerationInstanceId")
    public String globalAccelerationInstanceId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Description")
    public String description;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    public static ModifyGlobalAccelerationInstanceAttributesRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyGlobalAccelerationInstanceAttributesRequest self = new ModifyGlobalAccelerationInstanceAttributesRequest();
        return TeaModel.build(map, self);
    }

    public ModifyGlobalAccelerationInstanceAttributesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyGlobalAccelerationInstanceAttributesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyGlobalAccelerationInstanceAttributesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyGlobalAccelerationInstanceAttributesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyGlobalAccelerationInstanceAttributesRequest setGlobalAccelerationInstanceId(String globalAccelerationInstanceId) {
        this.globalAccelerationInstanceId = globalAccelerationInstanceId;
        return this;
    }
    public String getGlobalAccelerationInstanceId() {
        return this.globalAccelerationInstanceId;
    }

    public ModifyGlobalAccelerationInstanceAttributesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyGlobalAccelerationInstanceAttributesRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyGlobalAccelerationInstanceAttributesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

}
