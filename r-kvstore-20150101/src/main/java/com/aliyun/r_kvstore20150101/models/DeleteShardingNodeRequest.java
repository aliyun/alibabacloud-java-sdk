// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DeleteShardingNodeRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable forced transmission during a configuration change. Valid values:</p>
     * <ul>
     * <li><strong>false</strong> (default): Before the configuration change, the system checks the minor version of the instance. If the minor version of the instance is outdated, an error is reported. You must update the minor version of the instance and try again.</li>
     * <li><strong>true</strong>: The system skips the version check and directly performs the configuration change.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ForceTrans")
    public Boolean forceTrans;

    /**
     * <p>The ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>r-bp1zxszhcgatnx****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the data shard that you want to remove. You can specify multiple IDs at a time. Separate multiple IDs with commas (,).</p>
     * <blockquote>
     * <p>If you specify both the NodeId and ShardCount parameters, the system prioritizes the NodeId parameter.</p>
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
     * <p>The number of data shards that you want to remove. Shard removal starts from the end of the shard list.</p>
     * <blockquote>
     * <p>For example, the instance has the following data shards: db-0, db-1, db-2, db-3, and db-4. In this case, if you set this parameter to 2, db-3 and db-4 are removed.</p>
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
