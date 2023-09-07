// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBNodeHotReplicaModeRequest extends TeaModel {
    /**
     * <p>The ID of the cluster.</p>
     * <br>
     * <p>> You can call the [DescribeDBClusters](~~98094~~) operation to query the details of the clusters that belong to your Alibaba Cloud account, such as cluster IDs.</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The ID of the node in the cluster.</p>
     */
    @NameInMap("DBNodeId")
    public String DBNodeId;

    /**
     * <p>Specifies whether to enable the hot standby feature. Valid values:</p>
     * <br>
     * <p>*   **ON**</p>
     * <p>*   **OFF**</p>
     */
    @NameInMap("HotReplicaMode")
    public String hotReplicaMode;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ModifyDBNodeHotReplicaModeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBNodeHotReplicaModeRequest self = new ModifyDBNodeHotReplicaModeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBNodeHotReplicaModeRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyDBNodeHotReplicaModeRequest setDBNodeId(String DBNodeId) {
        this.DBNodeId = DBNodeId;
        return this;
    }
    public String getDBNodeId() {
        return this.DBNodeId;
    }

    public ModifyDBNodeHotReplicaModeRequest setHotReplicaMode(String hotReplicaMode) {
        this.hotReplicaMode = hotReplicaMode;
        return this;
    }
    public String getHotReplicaMode() {
        return this.hotReplicaMode;
    }

    public ModifyDBNodeHotReplicaModeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyDBNodeHotReplicaModeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyDBNodeHotReplicaModeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyDBNodeHotReplicaModeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
