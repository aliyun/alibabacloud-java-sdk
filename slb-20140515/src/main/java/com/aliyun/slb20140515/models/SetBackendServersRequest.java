// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class SetBackendServersRequest extends TeaModel {
    /**
     * <p>The list of backend servers that you want to modify.</p>
     * <br>
     * <p>The value of this parameter must be a STRING list in the JSON format. You can specify up to 20 elements in each request.</p>
     * <br>
     * <p>*   **ServerId**: Required. Specify the ID of the backend server. This parameter must be of the STRING type.</p>
     * <br>
     * <p>*   **Port**: Required. Specify the port that is used by the backend server. This parameter must be of the INTEGER type. Valid values: **1** to **65535**.</p>
     * <br>
     * <p>*   **Weight**: Specify the weight of the backend server. This parameter must be of the INTEGER type. Valid values: **0** to **100**.</p>
     * <br>
     * <p>*   **Description**: Optional. The description of the backend server. This value must be a string. The description must be 1 to 80 characters in length, and can contain letters, digits, hyphens (-), forward slashes (/), periods (.), and underscores (\_).</p>
     * <br>
     * <p>*   **Type**: the type of backend server. This parameter must be of the STRING type. Valid values:</p>
     * <br>
     * <p>    *   **ecs** (default): an Elastic Compute Service (ECS) instance</p>
     * <p>    *   **eni**: an elastic network interface (ENI). You can specify ENIs as the backend servers only for high-performance CLB instances.</p>
     * <br>
     * <p>*   **ServerIp**: the IP address of the ECS instance or ENI</p>
     * <br>
     * <p>Examples:</p>
     * <br>
     * <p>*   ECS instance: `[{ "ServerId": "ecs-******FmYAXG", "Weight": "100", "Type": "ecs", "Port":"80","Description":"test-112" }]`</p>
     * <p>*   ENI: `[{ "ServerId": "eni-xxxxxxxxx", "Weight": "100", "Type": "eni", "ServerIp": "192.168.**.**", "Port":"80","Description":"test-112" }]`</p>
     * <p>*   ENI with multiple IP addresses: `[{ "ServerId": "eni-xxxxxxxxx", "Weight": "100", "Type": "eni", "ServerIp": "192.168.**.**", "Port":"80","Description":"test-112" },{ "ServerId": "eni-xxxxxxxxx", "Weight": "100", "Type": "eni", "ServerIp": "172.166.**.**", "Port":"80","Description":"test-113" }]`</p>
     * <br>
     * <p>> </p>
     * <p>*   The backend servers must be in the Running state. You can specify up to 20 backend servers in each request.</p>
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
     * <p>The region ID of the Classic Load Balancer (CLB) instance.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static SetBackendServersRequest build(java.util.Map<String, ?> map) throws Exception {
        SetBackendServersRequest self = new SetBackendServersRequest();
        return TeaModel.build(map, self);
    }

    public SetBackendServersRequest setBackendServers(String backendServers) {
        this.backendServers = backendServers;
        return this;
    }
    public String getBackendServers() {
        return this.backendServers;
    }

    public SetBackendServersRequest setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public SetBackendServersRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public SetBackendServersRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SetBackendServersRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SetBackendServersRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SetBackendServersRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
