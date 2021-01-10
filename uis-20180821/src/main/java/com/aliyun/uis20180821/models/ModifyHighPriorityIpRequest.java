// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uis20180821.models;

import com.aliyun.tea.*;

public class ModifyHighPriorityIpRequest extends TeaModel {
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

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("UisId")
    public String uisId;

    @NameInMap("HighPriorityIp")
    public String highPriorityIp;

    public static ModifyHighPriorityIpRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyHighPriorityIpRequest self = new ModifyHighPriorityIpRequest();
        return TeaModel.build(map, self);
    }

    public ModifyHighPriorityIpRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyHighPriorityIpRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyHighPriorityIpRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyHighPriorityIpRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyHighPriorityIpRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyHighPriorityIpRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyHighPriorityIpRequest setUisId(String uisId) {
        this.uisId = uisId;
        return this;
    }
    public String getUisId() {
        return this.uisId;
    }

    public ModifyHighPriorityIpRequest setHighPriorityIp(String highPriorityIp) {
        this.highPriorityIp = highPriorityIp;
        return this;
    }
    public String getHighPriorityIp() {
        return this.highPriorityIp;
    }

}
