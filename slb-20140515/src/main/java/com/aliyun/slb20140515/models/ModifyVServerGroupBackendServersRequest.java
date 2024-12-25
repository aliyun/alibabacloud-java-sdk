// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class ModifyVServerGroupBackendServersRequest extends TeaModel {
    /**
     * <p>The backend servers that you want to add to the vServer group. Configure the following parameters:</p>
     * <ul>
     * <li><p><strong>ServerId</strong>: required. The IDs of the backend servers. Specify the IDs in a string. You can specify the IDs of ECS instances, ENIs, and elastic container instances. If you set <strong>ServerId</strong> to the IDs of ENIs or elastic container instances, you must configure the <strong>Type</strong> parameter.</p>
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
     * <p> You can specify ENIs and elastic container instances as backend servers only for high-performance SLB instances.</p>
     * </blockquote>
     * <ul>
     * <li><strong>ServerIp</strong>: the IP address of the ENI or elastic container instance.</li>
     * <li><strong>Port</strong>: the backend port.</li>
     * </ul>
     * <p>Examples:</p>
     * <ul>
     * <li><p>Add an ECS instance:</p>
     * <p><code>[{ &quot;ServerId&quot;: &quot;i-xxxxxxxxx&quot;, &quot;Weight&quot;: &quot;100&quot;, &quot;Type&quot;: &quot;ecs&quot;, &quot;Port&quot;:&quot;80&quot;,&quot;Description&quot;:&quot;test-112&quot; }]</code></p>
     * </li>
     * <li><p>Add an ENI:</p>
     * <p><code>[{ &quot;ServerId&quot;: &quot;eni-xxxxxxxxx&quot;, &quot;Weight&quot;: &quot;100&quot;, &quot;Type&quot;: &quot;eni&quot;, &quot;ServerIp&quot;: &quot;``192.168.**.**``&quot;, &quot;Port&quot;:&quot;80&quot;,&quot;Description&quot;:&quot;test-112&quot; }]</code></p>
     * </li>
     * <li><p>Add an ENI with multiple IP addresses:</p>
     * <p><code>[{ &quot;ServerId&quot;: &quot;eni-xxxxxxxxx&quot;, &quot;Weight&quot;: &quot;100&quot;, &quot;Type&quot;: &quot;eni&quot;, &quot;ServerIp&quot;: &quot;``192.168.**.**``&quot;, &quot;Port&quot;:&quot;80&quot;,&quot;Description&quot;:&quot;test-113&quot; },{ &quot;ServerId&quot;: &quot;eni-xxxxxxxxx&quot;, &quot;Weight&quot;: &quot;100&quot;, &quot;Type&quot;: &quot;eni&quot;, &quot;ServerIp&quot;: &quot;``172.166.**.**``&quot;, &quot;Port&quot;:&quot;80&quot;,&quot;Description&quot;:&quot;test-113&quot; }]</code></p>
     * </li>
     * <li><p>Add an elastic container instance</p>
     * <p><code>[{ &quot;ServerId&quot;: &quot;eci-xxxxxxxxx&quot;, &quot;Weight&quot;: &quot;100&quot;, &quot;Type&quot;: &quot;eci&quot;, &quot;ServerIp&quot;: &quot;``192.168.**.**``&quot;, &quot;Port&quot;:&quot;80&quot;,&quot;Description&quot;:&quot;test-114&quot; }]</code></p>
     * </li>
     * </ul>
     * <blockquote>
     * <p> You can add only running backend servers to SLB instances. You can specify at most 20 backend servers in each call.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[{ &quot;ServerId&quot;: &quot;eni-xxxxxxxxx&quot;, &quot;Weight&quot;: &quot;100&quot;, &quot;Type&quot;: &quot;eni&quot;, &quot;ServerIp&quot;: &quot;<code>192.168.**.**</code>&quot;, &quot;Port&quot;:&quot;80&quot;,&quot;Description&quot;:&quot;test-112&quot; },{ &quot;ServerId&quot;: &quot;eni-xxxxxxxxx&quot;, &quot;Weight&quot;: &quot;100&quot;, &quot;Type&quot;: &quot;eni&quot;, &quot;ServerIp&quot;: &quot;<code>172.166.**.**</code>&quot;, &quot;Port&quot;:&quot;80&quot;,&quot;Description&quot;:&quot;test-113&quot; }]</p>
     */
    @NameInMap("NewBackendServers")
    public String newBackendServers;

    /**
     * <p>The backend servers that you want to replace. Configure the following parameters:</p>
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
     * <p> You can specify ENIs and elastic container instances as backend servers only for high-performance SLB instances.</p>
     * </blockquote>
     * <ul>
     * <li><strong>ServerIp</strong>: the IP address of the ENI or elastic container instance.</li>
     * <li><strong>Port</strong>: the backend port.</li>
     * </ul>
     * <p>Examples:</p>
     * <ul>
     * <li><p>Add an ECS instance:</p>
     * <p><code>[{ &quot;ServerId&quot;: &quot;i-xxxxxxxxx&quot;, &quot;Weight&quot;: &quot;100&quot;, &quot;Type&quot;: &quot;ecs&quot;, &quot;Port&quot;:&quot;80&quot;,&quot;Description&quot;:&quot;test-112&quot; }]</code></p>
     * </li>
     * <li><p>Add an ENI:</p>
     * <p><code>[{ &quot;ServerId&quot;: &quot;eni-xxxxxxxxx&quot;, &quot;Weight&quot;: &quot;100&quot;, &quot;Type&quot;: &quot;eni&quot;, &quot;ServerIp&quot;: &quot;``192.168.**.**``&quot;, &quot;Port&quot;:&quot;80&quot;,&quot;Description&quot;:&quot;test-112&quot; }]</code></p>
     * </li>
     * <li><p>Add an ENI with multiple IP addresses:</p>
     * <p><code>[{ &quot;ServerId&quot;: &quot;eni-xxxxxxxxx&quot;, &quot;Weight&quot;: &quot;100&quot;, &quot;Type&quot;: &quot;eni&quot;, &quot;ServerIp&quot;: &quot;``192.168.**.**``&quot;, &quot;Port&quot;:&quot;80&quot;,&quot;Description&quot;:&quot;test-113&quot; },{ &quot;ServerId&quot;: &quot;eni-xxxxxxxxx&quot;, &quot;Weight&quot;: &quot;100&quot;, &quot;Type&quot;: &quot;eni&quot;, &quot;ServerIp&quot;: &quot;``172.166.**.**``&quot;, &quot;Port&quot;:&quot;80&quot;,&quot;Description&quot;:&quot;test-113&quot; }]</code></p>
     * </li>
     * <li><p>Add an elastic container instance</p>
     * <p><code>[{ &quot;ServerId&quot;: &quot;eci-xxxxxxxxx&quot;, &quot;Weight&quot;: &quot;100&quot;, &quot;Type&quot;: &quot;eci&quot;, &quot;ServerIp&quot;: &quot;``192.168.**.**``&quot;, &quot;Port&quot;:&quot;80&quot;,&quot;Description&quot;:&quot;test-114&quot; }]</code></p>
     * </li>
     * </ul>
     * <blockquote>
     * <p> You can add only running backend servers to SLB instances. You can specify at most 20 backend servers in each call.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[{ &quot;ServerId&quot;: &quot;i-xxxxxxxxx&quot;, &quot;Weight&quot;: &quot;100&quot;, &quot;Type&quot;: &quot;ecs&quot;,  &quot;Port&quot;:&quot;80&quot;,&quot;Description&quot;:&quot;test-112&quot; }]</p>
     */
    @NameInMap("OldBackendServers")
    public String oldBackendServers;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region where the Classic Load Balancer (CLB) instance is deployed.</p>
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
     * <p>The ID of the vServer group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rsp-cige6j****</p>
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
