// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class CreateVServerGroupRequest extends TeaModel {
    /**
     * <p>The list of backend servers to be added.</p>
     * <br>
     * <p>The value of this parameter must be a STRING list in the JSON format. You can specify up to 20 elements in each request.</p>
     * <br>
     * <p>*   **ServerId**: Required. Specify the ID of an Elastic Compute Service (ECS) instance or an Elastic Network Interface (ENI). This parameter must be of the STRING type.</p>
     * <br>
     * <p>*   **Port**: Required. Specify the port that is used by the backend server. This parameter must be of the INTEGER type. Valid values: **1** to **65535**.</p>
     * <br>
     * <p>*   **Weight**: Required. Specify the weight of the backend server. This parameter must be of the INTEGER type. Valid values: **0** to **100**.</p>
     * <br>
     * <p>*   **Description**: Optional. Specify the description of the backend server. This parameter must be of the STRING type. The description must be 1 to 80 characters in length, and can contain letters, digits, hyphens (-), forward slashes (/), periods (.),and underscores (\_).</p>
     * <br>
     * <p>*   **Type**: Specify the type of the backend server. This parameter must be of the STRING type. Valid values:</p>
     * <br>
     * <p>    *   **ecs**: an ECS instance. This is the default value.</p>
     * <p>    *   **eni**: an ENI.</p>
     * <br>
     * <p>*   **ServerIp**: The IP address of the ECS instance or ENI.</p>
     * <br>
     * <p>Examples:</p>
     * <br>
     * <p>*   ECS instance:`  [{ "ServerId": "i-xxxxxxxxx", "Weight": "100", "Type": "ecs", "Port": "80", "Description": "test-112" }]. `</p>
     * <p>*   ENI:`  [{ "ServerId": "eni-xxxxxxxxx", "Weight": "100", "Type": "eni", "ServerIp": "192.168.**.**", "Port":"80","Description":"test-112" }] `</p>
     * <p>*   ENI with multiple IP addresses:`  [{ "ServerId": "eni-xxxxxxxxx", "Weight": "100", "Type": "eni", "ServerIp": "192.168.**.**", "Port":"80","Description":"test-112" },{ "ServerId": "eni-xxxxxxxxx", "Weight": "100", "Type": "eni", "ServerIp": "172.166.**.**", "Port":"80","Description":"test-113" }] `</p>
     */
    @NameInMap("BackendServers")
    public String backendServers;

    /**
     * <p>The ID of the Server Load Balancer (SLB) instance.</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region where the SLB instance is deployed.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>标签列表。</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateVServerGroupRequestTag> tag;

    /**
     * <p>The name of the vServer group.</p>
     * <br>
     * <p>The name must be 1 to 80 characters in length, and can contain letters, digits, hyphens (-), forward slashes (/), periods (.),and underscores (\_).</p>
     */
    @NameInMap("VServerGroupName")
    public String VServerGroupName;

    public static CreateVServerGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVServerGroupRequest self = new CreateVServerGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateVServerGroupRequest setBackendServers(String backendServers) {
        this.backendServers = backendServers;
        return this;
    }
    public String getBackendServers() {
        return this.backendServers;
    }

    public CreateVServerGroupRequest setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public CreateVServerGroupRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateVServerGroupRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateVServerGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateVServerGroupRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateVServerGroupRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateVServerGroupRequest setTag(java.util.List<CreateVServerGroupRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateVServerGroupRequestTag> getTag() {
        return this.tag;
    }

    public CreateVServerGroupRequest setVServerGroupName(String VServerGroupName) {
        this.VServerGroupName = VServerGroupName;
        return this;
    }
    public String getVServerGroupName() {
        return this.VServerGroupName;
    }

    public static class CreateVServerGroupRequestTag extends TeaModel {
        /**
         * <p>资源的标签键。N的取值范围：**1~20**。一旦输入该值，则不允许为空字符串。</p>
         * <br>
         * <p>最多支持64个字符，不能以`aliyun`和`acs:`开头，不能包含`http://`或者`https://`。</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>资源的标签值。N的取值范围：**1~20**。一旦输入该值，可以为空字符串。</p>
         * <p>最多支持128个字符，不能以`aliyun`和`acs:`开头，不能包含`http://`或者`https://`。</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateVServerGroupRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateVServerGroupRequestTag self = new CreateVServerGroupRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateVServerGroupRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateVServerGroupRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
