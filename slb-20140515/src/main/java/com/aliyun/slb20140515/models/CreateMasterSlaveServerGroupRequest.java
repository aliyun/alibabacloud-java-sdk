// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class CreateMasterSlaveServerGroupRequest extends TeaModel {
    /**
     * <p>The ID of the SLB instance.</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    /**
     * <p>The backend servers in the primary/secondary server group.</p>
     * <br>
     * <p>The value of this parameter must be a STRING list in the JSON format. You can specify up to 20 elements in each request.</p>
     * <br>
     * <p>*   **ServerId**: Required. Specify the ID of the backend server. The value must be of the STRING type.</p>
     * <br>
     * <p>*   **Port**: Required. Specify the port that is used by the backend server. The value must be of the INTEGER type. Valid values: **1** to **65535**.</p>
     * <br>
     * <p>*   **Weight**: Required. Specify the weight of the backend server. The value must be of the INTEGER type. Valid values: **0** to **100**.</p>
     * <br>
     * <p>*   \*\*Description \*\*: Optional. The description of the backend server. The value must be of the STRING type. The description must be 1 to 80 characters in length, and can contain letters, digits, hyphens (-), forward slashes (/), periods (.), and underscores (\_).</p>
     * <br>
     * <p>*   **ServerType**: the type of the backend server. The value must be of the STRING type. Valid values:</p>
     * <br>
     * <p>    *   **Master**</p>
     * <br>
     * <p>*   **Slave**</p>
     * <br>
     * <p>*   **Type**: the service type of backend server. The value must be of the STRING type. Valid values:</p>
     * <br>
     * <p>    *   **ecs**</p>
     * <p>    *   **eni**</p>
     * <br>
     * <p>*   **ServerIp**</p>
     * <br>
     * <p>A primary/secondary server group can contain up to two backend servers.</p>
     * <br>
     * <p>If you do not specify this parameter, an empty primary/secondary server group is created.</p>
     * <br>
     * <p>Examples:</p>
     * <br>
     * <p>*   ECS instances:</p>
     * <br>
     * <p>`[{ "ServerId": "i-xxxxxxxxx", "Weight": "100", "Type": "ecs", "Port":"82","ServerType":"Master","Description":"test-112" }, { "ServerId": "i-xxxxxxxxx", "Weight": "100", "Type": "ecs", "Port":"84","ServerType":"Slave","Description":"test-112" }]`</p>
     * <br>
     * <p>*   ENIs:</p>
     * <br>
     * <p>    `[{ "ServerId": "eni-xxxxxxxxx", "Weight": "100", "Type": "eni", "Port":"80","ServerType":"Master","Description":"test-112" }, { "ServerId": "eni-xxxxxxxxx", "Weight": "100", "Type": "eni", "ServerIp": "192.168.**.**", "Port":"80","ServerType":"Slave","Description":"test-112" }]`</p>
     * <br>
     * <p>*   IP addresses of ENIs:</p>
     * <br>
     * <p>    `[{ "ServerId": "eni-xxxxxxxxx", "Weight": "100", "Type": "eni","ServerIp": "192.168.**.**", "Port":"80","ServerType":"Master","Description":"test-112" }, { "ServerId": "eni-xxxxxxxxx", "Weight": "100", "Type": "eni","ServerIp": "192.168.**.**", "Port":"80","ServerType":"Slave","Description":"test-112" }]`</p>
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
     * <p>The ID of the region where the Server Load Balancer (SLB) instance is deployed.</p>
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
    public java.util.List<CreateMasterSlaveServerGroupRequestTag> tag;

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

    public CreateMasterSlaveServerGroupRequest setTag(java.util.List<CreateMasterSlaveServerGroupRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateMasterSlaveServerGroupRequestTag> getTag() {
        return this.tag;
    }

    public static class CreateMasterSlaveServerGroupRequestTag extends TeaModel {
        /**
         * <p>资源标签键。N的取值范围：**1**~**20**。一旦输入该值，则不允许为空字符串。</p>
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

        public static CreateMasterSlaveServerGroupRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateMasterSlaveServerGroupRequestTag self = new CreateMasterSlaveServerGroupRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateMasterSlaveServerGroupRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateMasterSlaveServerGroupRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
