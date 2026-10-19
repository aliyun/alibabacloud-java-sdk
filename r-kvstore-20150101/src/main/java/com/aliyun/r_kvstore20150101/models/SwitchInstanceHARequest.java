// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class SwitchInstanceHARequest extends TeaModel {
    /**
     * <p>The instance ID. You can call the <a href="https://help.aliyun.com/document_detail/473778.html">DescribeInstances</a> operation to query the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>r-bp1zxszhcgatnx****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the data shard node. You can call the <a href="https://help.aliyun.com/document_detail/473782.html">DescribeRoleZoneInfo</a> operation to obtain the CustinsId parameter. Separate multiple data shard node IDs with commas (,). To specify all nodes, enter <code>all</code>.</p>
     * <blockquote>
     * <p>This parameter is available and required only when the instance uses the cluster or read/write splitting architecture.</p>
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
     * <p>The ID of the original primary node of the shard.</p>
     * 
     * <strong>example:</strong>
     * <p>52717408</p>
     */
    @NameInMap("SourceNodeId")
    public String sourceNodeId;

    /**
     * <p>The execution time. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: executes the operation immediately. This is the default value.</li>
     * <li><strong>1</strong>: executes the operation within the maintenance window.</li>
     * </ul>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/473775.html">ModifyInstanceMaintainTime</a> operation to modify the maintenance window of the instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SwitchMode")
    public Integer switchMode;

    /**
     * <p>The switchover mode. Valid values:</p>
     * <ul>
     * <li><strong>ReliabilityPriority</strong> (default): prioritizes reliability. The primary/secondary switchover is performed only when there is no synchronization latency between the primary and secondary nodes, ensuring no data loss. In scenarios with a large write volume and continuous synchronization latency, this mode may cause the switchover to fail.</li>
     * <li><strong>AvailablePriority</strong>: prioritizes availability. The primary/secondary switchover is performed immediately regardless of the synchronization latency between the primary and secondary nodes, which may result in a small amount of data loss.</li>
     * </ul>
     * <blockquote>
     * <p>Select a switchover mode based on your business requirements for data and services.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ReliabilityPriority</p>
     */
    @NameInMap("SwitchType")
    public String switchType;

    /**
     * <p>The ID of the target primary node after the switchover.</p>
     * 
     * <strong>example:</strong>
     * <p>52717403</p>
     */
    @NameInMap("TargetNodeId")
    public String targetNodeId;

    /**
     * <p>The name of the instance shard.</p>
     * 
     * <strong>example:</strong>
     * <p>r-2zegk3jyxxxwixfo6c-db-1</p>
     */
    @NameInMap("TargetShardName")
    public String targetShardName;

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

    public SwitchInstanceHARequest setSourceNodeId(String sourceNodeId) {
        this.sourceNodeId = sourceNodeId;
        return this;
    }
    public String getSourceNodeId() {
        return this.sourceNodeId;
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

    public SwitchInstanceHARequest setTargetNodeId(String targetNodeId) {
        this.targetNodeId = targetNodeId;
        return this;
    }
    public String getTargetNodeId() {
        return this.targetNodeId;
    }

    public SwitchInstanceHARequest setTargetShardName(String targetShardName) {
        this.targetShardName = targetShardName;
        return this;
    }
    public String getTargetShardName() {
        return this.targetShardName;
    }

}
