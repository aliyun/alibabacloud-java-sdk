// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uis20180821.models;

import com.aliyun.tea.*;

public class ModifyUisConnectionAttributeRequest extends TeaModel {
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

    @NameInMap("UisNodeId")
    public String uisNodeId;

    @NameInMap("UisConnectionId")
    public String uisConnectionId;

    @NameInMap("UisProtocol")
    public String uisProtocol;

    @NameInMap("Description")
    public String description;

    @NameInMap("Name")
    public String name;

    @NameInMap("GreConfig")
    public String greConfig;

    @NameInMap("SslConfig")
    public String sslConfig;

    public static ModifyUisConnectionAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyUisConnectionAttributeRequest self = new ModifyUisConnectionAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyUisConnectionAttributeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyUisConnectionAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyUisConnectionAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyUisConnectionAttributeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyUisConnectionAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyUisConnectionAttributeRequest setUisNodeId(String uisNodeId) {
        this.uisNodeId = uisNodeId;
        return this;
    }
    public String getUisNodeId() {
        return this.uisNodeId;
    }

    public ModifyUisConnectionAttributeRequest setUisConnectionId(String uisConnectionId) {
        this.uisConnectionId = uisConnectionId;
        return this;
    }
    public String getUisConnectionId() {
        return this.uisConnectionId;
    }

    public ModifyUisConnectionAttributeRequest setUisProtocol(String uisProtocol) {
        this.uisProtocol = uisProtocol;
        return this;
    }
    public String getUisProtocol() {
        return this.uisProtocol;
    }

    public ModifyUisConnectionAttributeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyUisConnectionAttributeRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyUisConnectionAttributeRequest setGreConfig(String greConfig) {
        this.greConfig = greConfig;
        return this;
    }
    public String getGreConfig() {
        return this.greConfig;
    }

    public ModifyUisConnectionAttributeRequest setSslConfig(String sslConfig) {
        this.sslConfig = sslConfig;
        return this;
    }
    public String getSslConfig() {
        return this.sslConfig;
    }

}
