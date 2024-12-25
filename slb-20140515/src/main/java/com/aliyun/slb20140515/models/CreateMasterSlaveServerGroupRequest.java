// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class CreateMasterSlaveServerGroupRequest extends TeaModel {
    /**
     * <p>The CLB instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>lb-bp1hv944r69al4j******</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    /**
     * <p>The backend servers in the primary/secondary server group. Each primary/secondary server group consists of two backend servers.</p>
     * <p>Configure the following parameters:</p>
     * <ul>
     * <li><p><strong>ServerId</strong>: required. The IDs of the backend servers. Specify the IDs in a string. You can specify the IDs of Elastic Compute Service (ECS) instances, elastic network interfaces (ENIs), and elastic container instances. If you set <strong>ServerId</strong> to the IDs of ENIs or elastic container instances, you must configure the <strong>Type</strong> parameter.</p>
     * </li>
     * <li><p><strong>Weight</strong>: the weight of the backend server. Valid values: <strong>0</strong> to <strong>100</strong>. Default value: <strong>100</strong>. If you set the weight of a backend server to 0, no requests are forwarded to the backend server.</p>
     * </li>
     * <li><p><strong>Description</strong>: optional. The description of the backend servers. Specify the description in a string. The description must be 1 to 80 characters in length, and can contain letters, digits, hyphens (-), forward slashes (/). periods (.), and underscores (_).</p>
     * </li>
     * <li><p><strong>Type</strong>: the type of the backend server. Valid values:</p>
     * <ul>
     * <li><strong>ecs</strong> (default): ECS instance</li>
     * <li><strong>eni</strong>: ENI</li>
     * <li><strong>eci</strong>: elastic container instance</li>
     * </ul>
     * </li>
     * </ul>
     * <blockquote>
     * <p> You can specify ENIs and elastic container instances as backend servers only for high-performance CLB instances.</p>
     * </blockquote>
     * <ul>
     * <li><p><strong>ServerIp</strong>: the IP address of the ENI or elastic container instance.</p>
     * </li>
     * <li><p><strong>Port</strong>: the backend port.</p>
     * </li>
     * <li><p><strong>ServerType</strong>: Specify the primary and secondary backend servers in a string. Valid values:</p>
     * <ul>
     * <li><strong>Master</strong>: primary server</li>
     * <li><strong>Slave</strong>: secondary server</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[{ &quot;ServerId&quot;: &quot;i-xxxxxxxxx&quot;, &quot;Weight&quot;: &quot;100&quot;, &quot;Type&quot;: &quot;ecs&quot;,  &quot;Port&quot;:&quot;82&quot;,&quot;ServerType&quot;:&quot;Master&quot;,&quot;Description&quot;:&quot;test-112&quot; },  { &quot;ServerId&quot;: &quot;i-xxxxxxxxx&quot;, &quot;Weight&quot;: &quot;100&quot;, &quot;Type&quot;: &quot;ecs&quot;,  &quot;Port&quot;:&quot;84&quot;,&quot;ServerType&quot;:&quot;Slave&quot;,&quot;Description&quot;:&quot;test-112&quot; }]</p>
     */
    @NameInMap("MasterSlaveBackendServers")
    public String masterSlaveBackendServers;

    /**
     * <p>The name of the primary/secondary server group.</p>
     * 
     * <strong>example:</strong>
     * <p>Group1</p>
     */
    @NameInMap("MasterSlaveServerGroupName")
    public String masterSlaveServerGroupName;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the Classic Load Balancer (CLB) instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The tags.</p>
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
         * <p>The key of tag N. Valid values of N: <strong>1</strong> to <strong>20</strong>. The tag key cannot be an empty string.</p>
         * <p>The tag key can be up to 64 characters in length, and cannot contain <code>http://</code> or <code>https://</code>. The tag key cannot start with <code>aliyun</code> or <code>acs:</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N. Valid values of N: <strong>1 to 20</strong>. The tag value can be an empty string. The tag value can be up to 128 characters in length, and cannot contain <code>http://</code> or <code>https://</code>. The tag value cannot start with <code>aliyun</code> or <code>acs:</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
