// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uis20180821.models;

import com.aliyun.tea.*;

public class CreateUisConnectionRequest extends TeaModel {
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

    public static CreateUisConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUisConnectionRequest self = new CreateUisConnectionRequest();
        return TeaModel.build(map, self);
    }

    public CreateUisConnectionRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateUisConnectionRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateUisConnectionRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateUisConnectionRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateUisConnectionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateUisConnectionRequest setUisNodeId(String uisNodeId) {
        this.uisNodeId = uisNodeId;
        return this;
    }
    public String getUisNodeId() {
        return this.uisNodeId;
    }

    public CreateUisConnectionRequest setUisProtocol(String uisProtocol) {
        this.uisProtocol = uisProtocol;
        return this;
    }
    public String getUisProtocol() {
        return this.uisProtocol;
    }

    public CreateUisConnectionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateUisConnectionRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateUisConnectionRequest setGreConfig(String greConfig) {
        this.greConfig = greConfig;
        return this;
    }
    public String getGreConfig() {
        return this.greConfig;
    }

    public CreateUisConnectionRequest setSslConfig(String sslConfig) {
        this.sslConfig = sslConfig;
        return this;
    }
    public String getSslConfig() {
        return this.sslConfig;
    }

}
