// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class SetVServerGroupAttributeRequest extends TeaModel {
    /**
     * <p>The backend servers. This operation only can be used to modify the weights of backend servers and names of vServer groups. Configure the following parameters:</p>
     * <ul>
     * <li><p><strong>ServerId</strong>: Required. The ID of the backend server. Specify the value in a string. You can specify the ID of an Elastic Compute Service (ECS) instance, an elastic network interface (ENI), or an elastic container instance. If you set <strong>ServerId</strong> to the ID of an ENI or an elastic container instance, you must configure the <strong>Type</strong> parameter.</p>
     * </li>
     * <li><p><strong>Weight</strong>: the weight of the backend server. Valid values: <strong>0</strong> to <strong>100</strong>. Default value: <strong>100</strong>. If you set the weight of a backend server to 0, no requests are forwarded to the backend server.</p>
     * </li>
     * <li><p><strong>Description</strong>: Optional. The description of the backend server. Specify the value in a string. The description must be 1 to 80 characters in length, and can contain letters, digits, hyphens (-), forward slashes (/), periods (.), and underscores (_).</p>
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
     * <li><strong>ServerIp</strong>: the IP address of an ENI or an elastic container instance.</li>
     * <li><strong>Port</strong>: the backend port.</li>
     * </ul>
     * <p>Examples:</p>
     * <ul>
     * <li><p>Add ECS instances:</p>
     * <p><code>[{ &quot;ServerId&quot;: &quot;i-xxxxxxxxx&quot;, &quot;Weight&quot;: &quot;100&quot;, &quot;Type&quot;: &quot;ecs&quot;, &quot;Port&quot;:&quot;80&quot;,&quot;Description&quot;:&quot;test-112&quot; }]</code></p>
     * </li>
     * <li><p>Add ENIs:</p>
     * <p><code>[{ &quot;ServerId&quot;: &quot;eni-xxxxxxxxx&quot;, &quot;Weight&quot;: &quot;100&quot;, &quot;Type&quot;: &quot;eni&quot;, &quot;ServerIp&quot;: &quot;``192.168.**.**``&quot;, &quot;Port&quot;:&quot;80&quot;,&quot;Description&quot;:&quot;test-112&quot; }]</code></p>
     * </li>
     * <li><p>Add ENIs with multiple IP addresses:</p>
     * <p><code>[{ &quot;ServerId&quot;: &quot;eni-xxxxxxxxx&quot;, &quot;Weight&quot;: &quot;100&quot;, &quot;Type&quot;: &quot;eni&quot;, &quot;ServerIp&quot;: &quot;``192.168.**.**``&quot;, &quot;Port&quot;:&quot;80&quot;,&quot;Description&quot;:&quot;test-113&quot; },{ &quot;ServerId&quot;: &quot;eni-xxxxxxxxx&quot;, &quot;Weight&quot;: &quot;100&quot;, &quot;Type&quot;: &quot;eni&quot;, &quot;ServerIp&quot;: &quot;``172.166.**.**``&quot;, &quot;Port&quot;:&quot;80&quot;,&quot;Description&quot;:&quot;test-113&quot; }]</code></p>
     * </li>
     * <li><p>Add elastic container instances:</p>
     * <p><code>[{ &quot;ServerId&quot;: &quot;eci-xxxxxxxxx&quot;, &quot;Weight&quot;: &quot;100&quot;, &quot;Type&quot;: &quot;eci&quot;, &quot;ServerIp&quot;: &quot;``192.168.**.**``&quot;, &quot;Port&quot;:&quot;80&quot;,&quot;Description&quot;:&quot;test-114&quot; }]</code></p>
     * </li>
     * </ul>
     * <blockquote>
     * <p> You can add only running backend servers to SLB instances. You can specify at most 20 backend servers in each call.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[{ &quot;ServerId&quot;: &quot;eni-xxxxxxxxx&quot;, &quot;Weight&quot;: &quot;100&quot;, &quot;Type&quot;: &quot;eni&quot;, &quot;ServerIp&quot;: &quot;192.XX.XX.6&quot;, &quot;Port&quot;:&quot;80&quot;,&quot;Description&quot;:&quot;test-112&quot; },{ &quot;ServerId&quot;: &quot;eni-xxxxxxxxx&quot;, &quot;Weight&quot;: &quot;100&quot;, &quot;Type&quot;: &quot;eni&quot;, &quot;ServerIp&quot;: &quot;172.XX.XX.6&quot;, &quot;Port&quot;:&quot;80&quot;,&quot;Description&quot;:&quot;test-113&quot; }]</p>
     */
    @NameInMap("BackendServers")
    public String backendServers;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the Server Load Balancer (SLB) instance, which cannot be modified.</p>
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
     * <p>The vServer group ID, which cannot be modified.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rsp-cige6****</p>
     */
    @NameInMap("VServerGroupId")
    public String VServerGroupId;

    /**
     * <p>The vServer group name. You can specify a name.</p>
     * 
     * <strong>example:</strong>
     * <p>Group1</p>
     */
    @NameInMap("VServerGroupName")
    public String VServerGroupName;

    public static SetVServerGroupAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        SetVServerGroupAttributeRequest self = new SetVServerGroupAttributeRequest();
        return TeaModel.build(map, self);
    }

    public SetVServerGroupAttributeRequest setBackendServers(String backendServers) {
        this.backendServers = backendServers;
        return this;
    }
    public String getBackendServers() {
        return this.backendServers;
    }

    public SetVServerGroupAttributeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public SetVServerGroupAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SetVServerGroupAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SetVServerGroupAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SetVServerGroupAttributeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SetVServerGroupAttributeRequest setVServerGroupId(String VServerGroupId) {
        this.VServerGroupId = VServerGroupId;
        return this;
    }
    public String getVServerGroupId() {
        return this.VServerGroupId;
    }

    public SetVServerGroupAttributeRequest setVServerGroupName(String VServerGroupName) {
        this.VServerGroupName = VServerGroupName;
        return this;
    }
    public String getVServerGroupName() {
        return this.VServerGroupName;
    }

}
