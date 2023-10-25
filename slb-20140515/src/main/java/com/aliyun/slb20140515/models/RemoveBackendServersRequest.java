// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class RemoveBackendServersRequest extends TeaModel {
    /**
     * <p>The backend servers to be removed.</p>
     * <br>
     * <p>*   **ServerId**: The IDs of the backend servers. Set the value to a string. This parameter is required.</p>
     * <br>
     * <p>*   **Type**: The type of the backend server. Valid values:</p>
     * <br>
     * <p>    *   **ecs** (default): an Elastic Compute Service (ECS) instance</p>
     * <br>
     * <p>    <!----></p>
     * <br>
     * <p>    *   **eni**: an elastic network interface (ENI)</p>
     * <br>
     * <p>*   **Weight**: the weight of the backend server. Valid values: **0** to **100**. Set the value to an integer.</p>
     * <br>
     * <p>You can remove at most 20 backend servers in each call. Examples:</p>
     * <br>
     * <p>*   Remove an ECS instance: `[{"ServerId":"i-bp1fq61enf4loa5i****", "Type": "ecs","Weight":"100"}]`</p>
     * <p>*   Remove an ENI: `[{"ServerId":"eni-2ze1sdp5****","Type": "eni","Weight":"100"}]`</p>
     */
    @NameInMap("BackendServers")
    public String backendServers;

    /**
     * <p>The ID of the CLB instance.</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region where the CLB instance is deployed.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static RemoveBackendServersRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveBackendServersRequest self = new RemoveBackendServersRequest();
        return TeaModel.build(map, self);
    }

    public RemoveBackendServersRequest setBackendServers(String backendServers) {
        this.backendServers = backendServers;
        return this;
    }
    public String getBackendServers() {
        return this.backendServers;
    }

    public RemoveBackendServersRequest setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public RemoveBackendServersRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public RemoveBackendServersRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public RemoveBackendServersRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RemoveBackendServersRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public RemoveBackendServersRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
