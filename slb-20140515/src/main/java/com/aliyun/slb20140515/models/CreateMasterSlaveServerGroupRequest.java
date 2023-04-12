// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class CreateMasterSlaveServerGroupRequest extends TeaModel {
    /**
     * <p>The ID of the Classic Load Balancer (CLB) instance.</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    /**
     * <p>The list of backend servers in the primary/secondary server group.</p>
     * <br>
     * <p>The value of this parameter must be a STRING list in the JSON format. You can specify up to 20 elements in each request.</p>
     * <br>
     * <p>*   **ServerId**: This parameter is required. Specify the ID of the backend server. This parameter must be of the STRING type.</p>
     * <br>
     * <p>*   **Port**: This parameter is required. Specify the port that is used by the backend server. This parameter must be of the INTEGER type. Valid values: **1** to **65535**.</p>
     * <br>
     * <p>*   **Weight**: This parameter is required. Specify the weight of the backend server. This parameter must be of the INTEGER type. Valid values: **0** to **100**.</p>
     * <br>
     * <p>*   **Description**: This parameter is optional. Specify the description of the backend server. This parameter must be of the STRING type. The description must be 1 to 80 characters in length, and can contain letters, digits, hyphens (-), forward slashes (/), periods (.),and underscores (\_).</p>
     * <br>
     * <p>*   **ServerType**: Specify the type of the backend server. This parameter must be of the STRING type. Valid values:</p>
     * <br>
     * <p>    *   **Master**: primary server</p>
     * <br>
     * <p>    <!----></p>
     * <br>
     * <p>    *   **Slave**: secondary server</p>
     * <br>
     * <p>*   **Type**: Specify the type of backend server. This parameter must be of the STRING type. Valid values:</p>
     * <br>
     * <p>    *   **ecs**: an ECS instance</p>
     * <p>    *   **eni**: an elastic network interface (ENI)</p>
     * <br>
     * <p>*   **ServerIp**: the IP address of the ECS instance or ENI</p>
     * <br>
     * <p>A primary/secondary server group can contain at most two backend servers.</p>
     * <br>
     * <p>If you do not set this parameter, an empty primary/secondary server group is created.</p>
     * <br>
     * <p>Examples:</p>
     * <br>
     * <p>*   ECS: `[{ "ServerId": "i-xxxxxxxxx", "Weight": "100", "Type": "ecs", "Port":"82","ServerType":"Master","Description":"test-112" }, { "ServerId": "i-xxxxxxxxx", "Weight": "100", "Type": "ecs", "Port":"84","ServerType":"Slave","Description":"test-112" }]`</p>
     * <br>
     * <p><!----></p>
     * <br>
     * <p>*   ENI: `[{ "ServerId": "eni-xxxxxxxxx", "Weight": "100", "Type": "eni", "Port":"80","ServerType":"Master","Description":"test-112" }, { "ServerId": "eni-xxxxxxxxx", "Weight": "100", "Type": "eni", "ServerIp": "192.168.**.**", "Port":"80","ServerType":"Slave","Description":"test-112" }]`</p>
     * <p>*   ENI with multiple IP addresses: `[{ "ServerId": "eni-xxxxxxxxx", "Weight": "100", "Type": "eni","ServerIp": "192.168.**.**", "Port":"80","ServerType":"Master","Description":"test-112" }, { "ServerId": "eni-xxxxxxxxx", "Weight": "100", "Type": "eni","ServerIp": "192.168.**.**", "Port":"80","ServerType":"Slave","Description":"test-112" }]`</p>
     */
    @NameInMap("MasterSlaveBackendServers")
    public String masterSlaveBackendServers;

    /**
     * <p>The name of the primary/secondary server group.</p>
     */
    @NameInMap("MasterSlaveServerGroupName")
    public String masterSlaveServerGroupName;

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
