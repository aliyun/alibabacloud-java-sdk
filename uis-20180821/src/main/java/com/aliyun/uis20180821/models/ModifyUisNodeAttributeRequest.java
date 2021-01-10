// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uis20180821.models;

import com.aliyun.tea.*;

public class ModifyUisNodeAttributeRequest extends TeaModel {
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("UisId")
    public String uisId;

    @NameInMap("UisNodeId")
    public String uisNodeId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Description")
    public String description;

    @NameInMap("UisNodeBandwidth")
    public Integer uisNodeBandwidth;

    public static ModifyUisNodeAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyUisNodeAttributeRequest self = new ModifyUisNodeAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyUisNodeAttributeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyUisNodeAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyUisNodeAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyUisNodeAttributeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyUisNodeAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyUisNodeAttributeRequest setUisId(String uisId) {
        this.uisId = uisId;
        return this;
    }
    public String getUisId() {
        return this.uisId;
    }

    public ModifyUisNodeAttributeRequest setUisNodeId(String uisNodeId) {
        this.uisNodeId = uisNodeId;
        return this;
    }
    public String getUisNodeId() {
        return this.uisNodeId;
    }

    public ModifyUisNodeAttributeRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyUisNodeAttributeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyUisNodeAttributeRequest setUisNodeBandwidth(Integer uisNodeBandwidth) {
        this.uisNodeBandwidth = uisNodeBandwidth;
        return this;
    }
    public Integer getUisNodeBandwidth() {
        return this.uisNodeBandwidth;
    }

}
