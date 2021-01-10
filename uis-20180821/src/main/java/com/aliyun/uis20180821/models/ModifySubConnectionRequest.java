// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uis20180821.models;

import com.aliyun.tea.*;

public class ModifySubConnectionRequest extends TeaModel {
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("UisSubConnectionId")
    public String uisSubConnectionId;

    @NameInMap("Description")
    public String description;

    @NameInMap("Name")
    public String name;

    @NameInMap("GreConfig")
    public String greConfig;

    public static ModifySubConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySubConnectionRequest self = new ModifySubConnectionRequest();
        return TeaModel.build(map, self);
    }

    public ModifySubConnectionRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifySubConnectionRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifySubConnectionRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifySubConnectionRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifySubConnectionRequest setUisSubConnectionId(String uisSubConnectionId) {
        this.uisSubConnectionId = uisSubConnectionId;
        return this;
    }
    public String getUisSubConnectionId() {
        return this.uisSubConnectionId;
    }

    public ModifySubConnectionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifySubConnectionRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifySubConnectionRequest setGreConfig(String greConfig) {
        this.greConfig = greConfig;
        return this;
    }
    public String getGreConfig() {
        return this.greConfig;
    }

}
