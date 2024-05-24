// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class AddBackendServersRequest extends TeaModel {
    /**
     * <p>The list of backend servers that you want to add. Set the following parameters:</p>
     * <br>
     * <p>*   **ServerId**: Required. This value must be a string. Enter the ID of an ECS instance, elastic network interface (ENI), or elastic container instance. If **ServerId** is set to the ID of an ENI or elastic container instance, **Type** is required.</p>
     * <br>
     * <p>*   **Weight**: the weight of the backend server. Valid values: **0** to **100**. Default value: **100**.</p>
     * <br>
     * <p>    If the value is set to 0, no requests are forwarded to the backend server.</p>
     * <br>
     * <p>*   **Description**: Optional. The description of the backend server. This value must be a string. The description must be 1 to 80 characters in length, and can contain letters, digits, hyphens (-), forward slashes (/), periods (.), and underscores (_).</p>
     * <br>
     * <p>*   **Type**: the type of the backend server. Valid values:</p>
     * <br>
     * <p>    *   **ecs** (default): an ECS instance</p>
     * <p>    *   **eni**: an ENI</p>
     * <p>    *   **eci**: an elastic container instance</p>
     * <br>
     * <p>>  You can specify ENIs and elastic container instances as the backend servers only for high-performance CLB instances.</p>
     * <br>
     * <p>*   **ServerIp**: the IP address of the ECS instance, ENI, or elastic container instance</p>
     * <p>*   **Port**: the backend port</p>
     * <br>
     * <p>Examples:</p>
     * <br>
     * <p>*   ECS instance: `[{ "ServerId": "i-xxxxxxxxx", "Weight": "100", "Type": "ecs", "Port":"80","Description":"test-112" }]`</p>
     * <p>*   ENI: `[{ "ServerId": "eni-xxxxxxxxx", "Weight": "100", "Type": "eni", "ServerIp": "192.168.\*\*.**", "Port":"80","Description":"test-112" }]`</p>
     * <p>*   ENI with multiple IP addresses: `[{ "ServerId": "eni-xxxxxxxxx", "Weight": "100", "Type": "eni", "ServerIp": "192.168.\*\*.**", "Port":"80","Description":"test-113" },{ "ServerId": "eni-xxxxxxxxx", "Weight": "100", "Type": "eni", "ServerIp": "172.166.\*\*.**", "Port":"80","Description":"test-113" }]`</p>
     * <p>*   Elastic container instance: `[{ "ServerId": "eci-xxxxxxxxx", "Weight": "100", "Type": "eci", "ServerIp": "192.168.\*\*.**", "Port":"80","Description":"test-114" }]`</p>
     * <br>
     * <p>>  The backend servers that you add to a CLB instance must be in the Running state. You can add at most 20 backend servers to a CLB instance in each request.</p>
     */
    @NameInMap("BackendServers")
    public String backendServers;

    /**
     * <p>The ID of the CLB instance.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region where the Classic Load Balancer (CLB) instance is deployed.</p>
     * <br>
     * <p>You can call the [DescribeRegions](https://help.aliyun.com/document_detail/27584.html) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static AddBackendServersRequest build(java.util.Map<String, ?> map) throws Exception {
        AddBackendServersRequest self = new AddBackendServersRequest();
        return TeaModel.build(map, self);
    }

    public AddBackendServersRequest setBackendServers(String backendServers) {
        this.backendServers = backendServers;
        return this;
    }
    public String getBackendServers() {
        return this.backendServers;
    }

    public AddBackendServersRequest setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public AddBackendServersRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public AddBackendServersRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddBackendServersRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AddBackendServersRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AddBackendServersRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
