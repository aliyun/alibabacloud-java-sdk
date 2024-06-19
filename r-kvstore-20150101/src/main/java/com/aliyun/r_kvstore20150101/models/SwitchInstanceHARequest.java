// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class SwitchInstanceHARequest extends TeaModel {
    /**
     * <p>The ID of the instance. You can call the <a href="https://help.aliyun.com/document_detail/60933.html">DescribeInstances</a> operation to query the ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>r-bp1zxszhcgatnx****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the data shard. You can call the <a href="https://help.aliyun.com/document_detail/190794.html">DescribeRoleZoneInfo</a> operation to obtain the value of the CustinsId parameter. Separate multiple data shard IDs with commas (,). <code>all</code> indicates that all data shards are specified.</p>
     * <blockquote>
     * <p>This parameter is available and required only for read/write splitting and cluster instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>56<strong><strong>19,56</strong></strong>20</p>
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

    /**
     * <p>The time when to perform the switchover. Default value: 0. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: immediately performs the switchover.</li>
     * <li><strong>1</strong>: performs the switchover during the maintenance window.</li>
     * </ul>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/61000.html">ModifyInstanceMaintainTime</a> operation to modify the maintenance window of an ApsaraDB for Redis instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SwitchMode")
    public Integer switchMode;

    /**
     * <p>The switching mode. Valid values:</p>
     * <ul>
     * <li><strong>AvailablePriority</strong>: prioritizes the availability and performs a switchover immediately without considering the latency of data synchronization between the master and replica nodes. This may cause data loss.</li>
     * <li><strong>ReliabilityPriority</strong>: prioritizes the reliability and performs a switchover after no latency of data synchronization between the master and replica nodes exists. This ensures data integrity. This mode may cause a switchover failure in scenarios that involve a large volume of data writes and persistent latency of data synchronization.</li>
     * </ul>
     * <blockquote>
     * <p>You must evaluate the requirements for data and services based on your business scenarios and then select a switching mode.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>AvailablePriority</p>
     */
    @NameInMap("SwitchType")
    public String switchType;

    public static SwitchInstanceHARequest build(java.util.Map<String, ?> map) throws Exception {
        SwitchInstanceHARequest self = new SwitchInstanceHARequest();
        return TeaModel.build(map, self);
    }

    public SwitchInstanceHARequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SwitchInstanceHARequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public SwitchInstanceHARequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public SwitchInstanceHARequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SwitchInstanceHARequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SwitchInstanceHARequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SwitchInstanceHARequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public SwitchInstanceHARequest setSwitchMode(Integer switchMode) {
        this.switchMode = switchMode;
        return this;
    }
    public Integer getSwitchMode() {
        return this.switchMode;
    }

    public SwitchInstanceHARequest setSwitchType(String switchType) {
        this.switchType = switchType;
        return this;
    }
    public String getSwitchType() {
        return this.switchType;
    }

}
