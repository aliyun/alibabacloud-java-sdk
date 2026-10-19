// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DeleteShardingNodeRequest extends TeaModel {
    /**
     * <p>The time when the proxy deletion takes effect if proxy nodes are deleted when you delete shards from a cluster instance in proxy mode. Valid values:</p>
     * <ul>
     * <li><strong>0 or Immediately</strong>: Takes effect immediately. This is the default value.</li>
     * <li><strong>1 or MaintainTime</strong>: Takes effect during the maintenance window.</li>
     * </ul>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/473775.html">ModifyInstanceMaintainTime</a> operation to modify the maintenance window of the instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Immediately</p>
     */
    @NameInMap("EffectiveTime")
    public String effectiveTime;

    /**
     * <p>Specifies whether to enable forced migration. Valid values:</p>
     * <ul>
     * <li><strong>false</strong> (default): Before the upgrade/downgrade, the system checks the current minor engine version of the instance. If the kernel version is too low, an error is reported. You must upgrade the minor engine version and retry.</li>
     * <li><strong>true</strong>: Skips the checks and directly executes the upgrade/downgrade operation.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ForceTrans")
    public Boolean forceTrans;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>r-bp1zxszhcgatnx****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the data shard node to be deleted. To specify multiple shard node IDs, separate them with commas (,).</p>
     * <blockquote>
     * <p>If both the NodeId and ShardCount parameters are specified, the NodeId parameter takes precedence.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>r-bp1zxszhcgatnx****-db-0,r-bp1zxszhcgatnx****-db-1</p>
     */
    @NameInMap("NodeId")
    @Deprecated
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
     * <p>The number of shards to be deleted. The system deletes the specified number of shard nodes starting from the end.</p>
     * <blockquote>
     * <p>For example, if an instance has five shard nodes: db-0, db-1, db-2, db-3, and db-4, and you set this parameter to 2, the db-3 and db-4 nodes are deleted.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ShardCount")
    public Integer shardCount;

    public static DeleteShardingNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteShardingNodeRequest self = new DeleteShardingNodeRequest();
        return TeaModel.build(map, self);
    }

    public DeleteShardingNodeRequest setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
        return this;
    }
    public String getEffectiveTime() {
        return this.effectiveTime;
    }

    public DeleteShardingNodeRequest setForceTrans(Boolean forceTrans) {
        this.forceTrans = forceTrans;
        return this;
    }
    public Boolean getForceTrans() {
        return this.forceTrans;
    }

    public DeleteShardingNodeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    @Deprecated
    public DeleteShardingNodeRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public DeleteShardingNodeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DeleteShardingNodeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteShardingNodeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DeleteShardingNodeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DeleteShardingNodeRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DeleteShardingNodeRequest setShardCount(Integer shardCount) {
        this.shardCount = shardCount;
        return this;
    }
    public Integer getShardCount() {
        return this.shardCount;
    }

}
