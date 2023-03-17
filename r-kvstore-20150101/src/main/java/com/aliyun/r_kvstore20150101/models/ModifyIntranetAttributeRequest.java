// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ModifyIntranetAttributeRequest extends TeaModel {
    /**
     * <p>The amount of bandwidth that you want to add. Unit: Mbit/s. The value must be an integer greater than or equal to 0. In most cases, the maximum bandwidth that can be added can be two times the default maximum bandwidth of the current instance type. For more information about the bandwidth specifications supported by different instance types, see [Overview](~~26350~~). The bandwidth is also subject to the following limits:</p>
     * <br>
     * <p>*   The bandwidth of an individual instance cannot exceed 75% of the bandwidth of the host. For more information about the host specifications and bandwidth, see [Instance types of hosts](~~206343~~).</p>
     * <p>*   The total bandwidth of all of the instances on the host cannot exceed 150% of the bandwidth of the host. You can configure resource overcommitment to handle traffic spikes. For more information, see [Configure resource overcommitment to reduce costs](~~183798~~).</p>
     * <br>
     * <p>> If you do not specify this parameter for a standard instance, the bandwidth of the instance is set to two times that of the current bandwidth.</p>
     */
    @NameInMap("BandWidth")
    public Long bandWidth;

    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the data node. You can call the [DescribeClusterMemberInfo](~~193462~~) operation to query the node ID. Separate multiple IDs with commas (,).</p>
     * <br>
     * <p>> This parameter is available and required only when the instance uses the [cluster architecture](~~52228~~).</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static ModifyIntranetAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyIntranetAttributeRequest self = new ModifyIntranetAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyIntranetAttributeRequest setBandWidth(Long bandWidth) {
        this.bandWidth = bandWidth;
        return this;
    }
    public Long getBandWidth() {
        return this.bandWidth;
    }

    public ModifyIntranetAttributeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyIntranetAttributeRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public ModifyIntranetAttributeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyIntranetAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyIntranetAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyIntranetAttributeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyIntranetAttributeRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
