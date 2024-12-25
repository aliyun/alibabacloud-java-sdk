// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class RemoveBackendServersRequest extends TeaModel {
    /**
     * <p>The backend servers that you want to remove.</p>
     * <ul>
     * <li><p><strong>ServerId</strong>: The IDs of the backend servers. Set the value to a string. This parameter is required.</p>
     * </li>
     * <li><p><strong>Type</strong>: the type of the backend server. Valid values:</p>
     * <ul>
     * <li><strong>ecs</strong> (default): Elastic Compute Service (ECS) instance</li>
     * <li><strong>eni</strong>: elastic network interface (ENI)</li>
     * <li><strong>eci</strong>: elastic container instance</li>
     * </ul>
     * </li>
     * <li><p><strong>Weight</strong>: the weight of the backend server. Valid values: <strong>0</strong> to <strong>100</strong>. Set the value to an integer.</p>
     * </li>
     * </ul>
     * <p>You can specify at most 20 backend servers in each call. Examples:</p>
     * <ul>
     * <li>Remove ECS instances:</li>
     * </ul>
     * <p><code>[{&quot;ServerId&quot;:&quot;i-bp1fq61enf4loa5i****&quot;, &quot;Type&quot;: &quot;ecs&quot;,&quot;Weight&quot;:&quot;100&quot;}]</code></p>
     * <ul>
     * <li>Remove ENIs:</li>
     * </ul>
     * <p><code>[{&quot;ServerId&quot;:&quot;eni-2ze1sdp5****&quot;,&quot;Type&quot;: &quot;eni&quot;,&quot;Weight&quot;:&quot;100&quot;}]</code></p>
     * <ul>
     * <li>Remove elastic container instances:</li>
     * </ul>
     * <p><code>[{&quot;ServerId&quot;:&quot;eci-2ze1sdp5****&quot;,&quot;Type&quot;: &quot;eci&quot;,&quot;Weight&quot;:&quot;100&quot;}]</code></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;ServerId&quot;:&quot;i-bp1fq61enf4loa5i****&quot;, &quot;Type&quot;: &quot;ecs&quot;,&quot;Weight&quot;:&quot;100&quot;}]</p>
     */
    @NameInMap("BackendServers")
    public String backendServers;

    /**
     * <p>The ID of the CLB instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>lb-bp15lbk8uja8rvm4a****</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region where the CLB instance is deployed.</p>
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

    public static RemoveBackendServersRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveBackendServersRequest self = new RemoveBackendServersRequest();
        return TeaModel.build(map, self);
    }

    public RemoveBackendServersRequest setBackendServers(String backendServers) {
        this.backendServers = backendServers;
        return this;
    }
    public String getBackendServers() {
        return this.backendServers;
    }

    public RemoveBackendServersRequest setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public RemoveBackendServersRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public RemoveBackendServersRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public RemoveBackendServersRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RemoveBackendServersRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public RemoveBackendServersRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
