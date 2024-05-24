// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class RemoveVServerGroupBackendServersRequest extends TeaModel {
    /**
     * <p>The list of backend servers that you want to remove from the vServer group.</p>
     * <br>
     * <p>You can specify at most 20 backend servers for a vServer group in each call.</p>
     * <br>
     * <p>The value of this parameter is a JSON list of the STRING type. You can specify at most 20 elements in a list for each request.</p>
     * <br>
     * <p>*   **ServerId**: the ID of the Elastic Compute Service (ECS) instance or elastic network interface (ENI) that serves as a backend server.</p>
     * <br>
     * <p>*   **Port**: the port that is used by the backend server. Valid values: **1 to 65535**.</p>
     * <br>
     * <p>*   **Weight**: the weight of the backend server. Valid values: **0 to 100**.</p>
     * <br>
     * <p>*   **Description**: the description of the backend server. The description must be 1 to 80 characters in length, and can contain letters, digits, hyphens (-), forward slashes (/), periods (.),and underscores (_).</p>
     * <br>
     * <p>*   **Type**: the type of backend server. Valid values:</p>
     * <br>
     * <p>    *   **ecs**: an ECS instance. This is the default value.</p>
     * <p>    *   **eni**: an ENI.</p>
     * <br>
     * <p>*   **ServerIp**: the IP address of the ECS instance or ENI.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("BackendServers")
    public String backendServers;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region where the Classic Load Balancer (CLB) instance is deployed.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the vServer group.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("VServerGroupId")
    public String VServerGroupId;

    public static RemoveVServerGroupBackendServersRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveVServerGroupBackendServersRequest self = new RemoveVServerGroupBackendServersRequest();
        return TeaModel.build(map, self);
    }

    public RemoveVServerGroupBackendServersRequest setBackendServers(String backendServers) {
        this.backendServers = backendServers;
        return this;
    }
    public String getBackendServers() {
        return this.backendServers;
    }

    public RemoveVServerGroupBackendServersRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public RemoveVServerGroupBackendServersRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public RemoveVServerGroupBackendServersRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RemoveVServerGroupBackendServersRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public RemoveVServerGroupBackendServersRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public RemoveVServerGroupBackendServersRequest setVServerGroupId(String VServerGroupId) {
        this.VServerGroupId = VServerGroupId;
        return this;
    }
    public String getVServerGroupId() {
        return this.VServerGroupId;
    }

}
