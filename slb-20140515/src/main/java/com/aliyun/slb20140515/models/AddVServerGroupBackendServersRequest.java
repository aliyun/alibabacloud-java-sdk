// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class AddVServerGroupBackendServersRequest extends TeaModel {
    /**
     * <p>The list of backend servers. You can specify up to 20 backend servers in each request.</p>
     * <br>
     * <p>The following parameters are used to specify the backend servers:</p>
     * <br>
     * <p>*   **ServerId**: The ID of the backend server. You can specify the ID of an Elastic Compute Service (ECS) instance or an elastic network interface (ENI).</p>
     * <br>
     * <p>*   **Port**: Required. The port that is used by the backend server. Valid values: **1 to 65535**.</p>
     * <br>
     * <p>*   **Weight**: The weight of the backend server. Valid values: **0** to **100**. Default value: **100**. If the value is set to 0, no requests are forwarded to the backend server.</p>
     * <br>
     * <p>*   **Type**: The type of backend server. Valid values:</p>
     * <br>
     * <p>    *   **ecs**: an ECS instance. This is the default value.</p>
     * <p>    *   **eni**: an ENI.</p>
     * <br>
     * <p>*   **Description**: Optional. The description of the backend server. This parameter is of the STRING type. The description must be 1 to 80 characters in length, and can contain letters, digits, hyphens (-), forward slashes (/), periods (.), and underscores (_).</p>
     * <br>
     * <p>*   **ServerIp**: The IP address of the ECS instance or ENI.</p>
     * <br>
     * <p>Examples:</p>
     * <br>
     * <p>*   ECS instance:`  [{ "ServerId": "i-xxxxxxxxx", "Weight": "100", "Type": "ecs", "Port": "80", "Description": "test-112" }]. `</p>
     * <p>*   ENI:`  [{ "ServerId": "eni-xxxxxxxxx", "Weight": "100", "Type": "eni", "ServerIp": "192.168. **. **", "Port":"80","Description":"test-112" }] `</p>
     * <p>*   ENI with multiple IP addresses:`  [{ "ServerId": "eni-xxxxxxxxx", "Weight": "100", "Type": "eni", "ServerIp": "192.168. **. **", "Port":"80","Description":"test-112" },{ "ServerId": "eni-xxxxxxxxx", "Weight": "100", "Type": "eni", "ServerIp": "172.166. **. **", "Port":"80","Description":"test-113" }] `</p>
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
     * <p>The ID of the region where the Classic Load Balancer (CLB) instance is created.</p>
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
     * <p>The ID of the server group.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("VServerGroupId")
    public String VServerGroupId;

    public static AddVServerGroupBackendServersRequest build(java.util.Map<String, ?> map) throws Exception {
        AddVServerGroupBackendServersRequest self = new AddVServerGroupBackendServersRequest();
        return TeaModel.build(map, self);
    }

    public AddVServerGroupBackendServersRequest setBackendServers(String backendServers) {
        this.backendServers = backendServers;
        return this;
    }
    public String getBackendServers() {
        return this.backendServers;
    }

    public AddVServerGroupBackendServersRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public AddVServerGroupBackendServersRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddVServerGroupBackendServersRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AddVServerGroupBackendServersRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AddVServerGroupBackendServersRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public AddVServerGroupBackendServersRequest setVServerGroupId(String VServerGroupId) {
        this.VServerGroupId = VServerGroupId;
        return this;
    }
    public String getVServerGroupId() {
        return this.VServerGroupId;
    }

}
