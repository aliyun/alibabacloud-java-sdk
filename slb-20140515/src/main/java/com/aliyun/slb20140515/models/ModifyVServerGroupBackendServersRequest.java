// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class ModifyVServerGroupBackendServersRequest extends TeaModel {
    @NameInMap("NewBackendServers")
    public String newBackendServers;

    @NameInMap("OldBackendServers")
    public String oldBackendServers;

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

    @NameInMap("VServerGroupId")
    public String VServerGroupId;

    public static ModifyVServerGroupBackendServersRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyVServerGroupBackendServersRequest self = new ModifyVServerGroupBackendServersRequest();
        return TeaModel.build(map, self);
    }

    public ModifyVServerGroupBackendServersRequest setNewBackendServers(String newBackendServers) {
        this.newBackendServers = newBackendServers;
        return this;
    }
    public String getNewBackendServers() {
        return this.newBackendServers;
    }

    public ModifyVServerGroupBackendServersRequest setOldBackendServers(String oldBackendServers) {
        this.oldBackendServers = oldBackendServers;
        return this;
    }
    public String getOldBackendServers() {
        return this.oldBackendServers;
    }

    public ModifyVServerGroupBackendServersRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyVServerGroupBackendServersRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyVServerGroupBackendServersRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyVServerGroupBackendServersRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyVServerGroupBackendServersRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyVServerGroupBackendServersRequest setVServerGroupId(String VServerGroupId) {
        this.VServerGroupId = VServerGroupId;
        return this;
    }
    public String getVServerGroupId() {
        return this.VServerGroupId;
    }

}
