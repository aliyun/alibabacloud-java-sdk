// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class ModifyVServerGroupBackendServersRequest extends TeaModel {
    /**
     * <p>The list of new backend servers that you want to use to replace those in the vServer group. You can specify at most 20 backend servers for a vServer group in each call.</p>
     * <br>
     * <p>*   **ServerId**: required. The ID of the ECS instance or ENI that serves as a backend server. This parameter must be of the STRING type.</p>
     * <br>
     * <p>*   **Port**: required. The port that is used by the backend server. This parameter must be of the INTEGER type. Valid values: **1 to 65535**.</p>
     * <br>
     * <p>*   **Weight**: required. The weight of the backend server. This parameter must be of the INTEGER type. Valid values: **0 to 100**.</p>
     * <br>
     * <p>*   **Description**: optional. The description of the backend server. This parameter must be of the STRING type. The description can contain letters, digits, hyphens (-), forward slashes (/), periods (.),and underscores (_).</p>
     * <br>
     * <p>*   **Type**: the type of backend server. This parameter must be of the STRING type. Valid values:</p>
     * <br>
     * <p>    *   **ecs**: an ECS instance. This is the default value.</p>
     * <p>    *   **eni**: an ENI.</p>
     * <br>
     * <p>*   **ServerIp**: the IP address of the ECS instance or ENI.</p>
     * <br>
     * <p>Examples:</p>
     * <br>
     * <p>*   An ECS instance: `[{ "ServerId": "i-xxxxxxxxx", "Weight": "100", "Type": "ecs", "Port":"80","Description":"test-112" }]`</p>
     * <p>*   An ENI: `[{ "ServerId": "eni-xxxxxxxxx", "Weight": "100", "Type": "eni", "ServerIp": "192.168.\*\*.**", "Port":"80","Description":"test-112" }]`</p>
     * <p>*   An ENI with multiple IP addresses: `[{ "ServerId": "eni-xxxxxxxxx", "Weight": "100", "Type": "eni", "ServerIp": "192.168.\*\*.**", "Port":"80","Description":"test-112" },{ "ServerId": "eni-xxxxxxxxx", "Weight": "100", "Type": "eni", "ServerIp": "172.166.\*\*.**", "Port":"80","Description":"test-113" }]`</p>
     */
    @NameInMap("NewBackendServers")
    public String newBackendServers;

    /**
     * <p>The list of backend servers that you want to replace in the vServer group. You can specify at most 20 backend servers for a vServer group in each call.</p>
     * <br>
     * <p>*   **ServerId**: required. The ID of the Elastic Compute Service (ECS) instance or elastic network interface (ENI) that serves as a backend server. This parameter must be of the STRING type.</p>
     * <br>
     * <p>*   **Port**: required. The port that is used by the backend server. This parameter must be of the INTEGER type. Valid values: **1 to 65535**.</p>
     * <br>
     * <p>*   **Weight**: required. The weight of the backend server. This parameter must be of the INTEGER type. Valid values: **0 to 100**.</p>
     * <br>
     * <p>*   **Description**: optional. The description of the backend server. This parameter must be of the STRING type. The description must be 1 to 80 characters in length, and can contain letters, digits, hyphens (-), forward slashes (/), periods (.),and underscores (_).</p>
     * <br>
     * <p>*   **Type**: the type of backend server. This parameter must be of the STRING type. Valid values:</p>
     * <br>
     * <p>    *   **ecs**: an ECS instance. This is the default value.</p>
     * <p>    *   **eni**: an ENI.</p>
     * <br>
     * <p>*   **ServerIp**: the IP address of the ECS instance or ENI.</p>
     * <br>
     * <p>Examples:</p>
     * <br>
     * <p>*   An ECS instance: `[{ "ServerId": "i-xxxxxxxxx", "Weight": "100", "Type": "ecs", "Port":"80","Description":"test-112" }]`</p>
     * <p>*   An ENI: `[{ "ServerId": "eni-xxxxxxxxx", "Weight": "100", "Type": "eni", "ServerIp": "192.168.\*\*.**", "Port":"80","Description":"test-112" }]`</p>
     * <p>*   An ENI with multiple IP addresses: `[{ "ServerId": "eni-xxxxxxxxx", "Weight": "100", "Type": "eni", "ServerIp": "192.168.\*\*.**", "Port":"80","Description":"test-112" },{ "ServerId": "eni-xxxxxxxxx", "Weight": "100", "Type": "eni", "ServerIp": "172.166.\*\*.**", "Port":"80","Description":"test-113" }]`</p>
     */
    @NameInMap("OldBackendServers")
    public String oldBackendServers;

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
