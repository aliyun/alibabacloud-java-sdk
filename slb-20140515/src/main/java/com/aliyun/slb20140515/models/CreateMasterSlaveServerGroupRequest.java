// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class CreateMasterSlaveServerGroupRequest extends TeaModel {
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    @NameInMap("MasterSlaveBackendServers")
    public String masterSlaveBackendServers;

    @NameInMap("MasterSlaveServerGroupName")
    public String masterSlaveServerGroupName;

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

    public static CreateMasterSlaveServerGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMasterSlaveServerGroupRequest self = new CreateMasterSlaveServerGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateMasterSlaveServerGroupRequest setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public CreateMasterSlaveServerGroupRequest setMasterSlaveBackendServers(String masterSlaveBackendServers) {
        this.masterSlaveBackendServers = masterSlaveBackendServers;
        return this;
    }
    public String getMasterSlaveBackendServers() {
        return this.masterSlaveBackendServers;
    }

    public CreateMasterSlaveServerGroupRequest setMasterSlaveServerGroupName(String masterSlaveServerGroupName) {
        this.masterSlaveServerGroupName = masterSlaveServerGroupName;
        return this;
    }
    public String getMasterSlaveServerGroupName() {
        return this.masterSlaveServerGroupName;
    }

    public CreateMasterSlaveServerGroupRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateMasterSlaveServerGroupRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateMasterSlaveServerGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateMasterSlaveServerGroupRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateMasterSlaveServerGroupRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
