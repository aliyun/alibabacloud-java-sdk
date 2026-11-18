// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class FailoverDBClusterRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request and prevent duplicate submissions. You can use the client to generate the value, and you must ensure that the value is unique among different requests. The value is case-sensitive and can be up to 64 ASCII characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>6000170000591aed949d0f54a343f1a4233c1e7d1c5******</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the database cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-**************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Specifies whether to switch back to the original primary zone after a failover. Valid values:</p>
     * <ul>
     * <li>true: Yes.</li>
     * <li>false: No.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("RollBackForDisaster")
    public Boolean rollBackForDisaster;

    /**
     * <p>The ID of the node to be switched to the primary node. If you do not specify this parameter, the system automatically elects a primary node. You can call the <a href="https://help.aliyun.com/document_detail/98094.html">DescribeDBClusters</a> operation to query the node ID and other information.</p>
     * <blockquote>
     * <ul>
     * <li>Automatic primary node election: The system identifies all read-only nodes that can be elected. It selects one or more read-only nodes with the highest priority. If the switchover to the first node fails (for example, due to network issues or abnormal replication status), the system attempts to switch to the next node until the switchover succeeds.</li>
     * <li>This parameter is required when the cluster is a PolarDB for PostgreSQL (Compatible with Oracle) or PolarDB for PostgreSQL cluster. This parameter is optional when the cluster is a PolarDB for MySQL cluster.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>pi-***********</p>
     */
    @NameInMap("TargetDBNodeId")
    public String targetDBNodeId;

    /**
     * <p>Specifies whether the primary/secondary switchover is performed within the primary zone. Valid values:</p>
     * <ul>
     * <li>Primary: primary/secondary switchover within the primary zone.</li>
     * <li>Standby: switchover to the hot standby storage cluster.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Primary</p>
     */
    @NameInMap("TargetZoneType")
    public String targetZoneType;

    public static FailoverDBClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        FailoverDBClusterRequest self = new FailoverDBClusterRequest();
        return TeaModel.build(map, self);
    }

    public FailoverDBClusterRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public FailoverDBClusterRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public FailoverDBClusterRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public FailoverDBClusterRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public FailoverDBClusterRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public FailoverDBClusterRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public FailoverDBClusterRequest setRollBackForDisaster(Boolean rollBackForDisaster) {
        this.rollBackForDisaster = rollBackForDisaster;
        return this;
    }
    public Boolean getRollBackForDisaster() {
        return this.rollBackForDisaster;
    }

    public FailoverDBClusterRequest setTargetDBNodeId(String targetDBNodeId) {
        this.targetDBNodeId = targetDBNodeId;
        return this;
    }
    public String getTargetDBNodeId() {
        return this.targetDBNodeId;
    }

    public FailoverDBClusterRequest setTargetZoneType(String targetZoneType) {
        this.targetZoneType = targetZoneType;
        return this;
    }
    public String getTargetZoneType() {
        return this.targetZoneType;
    }

}
