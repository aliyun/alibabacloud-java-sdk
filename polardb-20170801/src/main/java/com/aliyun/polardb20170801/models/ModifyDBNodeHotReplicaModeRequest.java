// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBNodeHotReplicaModeRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/98094.html">DescribeDBClusters</a> operation to query the details of all clusters under your account, including the cluster ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-*****************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The ID of the database cluster node.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pi-*****************</p>
     */
    @NameInMap("DBNodeId")
    public String DBNodeId;

    /**
     * <p>Specifies whether to enable hot standby. Valid values:</p>
     * <ul>
     * <li><strong>ON</strong>: Enabled.</li>
     * <li><strong>OFF</strong>: Disabled.
     * Limits: This operation is supported only for non-serverless MySQL clusters. The target node must be a read-only node. Each cluster allows only one node to have HotReplicaMode (ON). Usage notes: Append the following limits to the end of the HotReplicaMode parameter description: this operation is supported only for non-serverless MySQL clusters. The target node must be a read-only node. Each cluster allows only one node to have HotReplicaMode (ON).</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ON</p>
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
