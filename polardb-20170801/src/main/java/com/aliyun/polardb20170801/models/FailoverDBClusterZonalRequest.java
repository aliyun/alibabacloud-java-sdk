// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class FailoverDBClusterZonalRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value. Make sure that the value is unique among different requests. The token is case-sensitive and can contain a maximum of 64 ASCII characters.</p>
     * 
     * <strong>example:</strong>
     * <p>6000170000591aed949d0f54a343f1a4233c1e7d1c5******</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The cluster ID.</p>
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
     * <li>true: Switch back to the original primary zone.</li>
     * <li>false: Do not switch back to the original primary zone.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("RollBackForDisaster")
    public Boolean rollBackForDisaster;

    /**
     * <p>The ID of the node to be switched to the primary node. If you leave this parameter empty, the system automatically elects a node. You can call the DescribeDBClusters operation to query the node ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pi-***********</p>
     */
    @NameInMap("TargetDBNodeId")
    public String targetDBNodeId;

    /**
     * <p>Specifies whether the switchover is a primary/secondary switchover within the primary zone. Valid values:</p>
     * <ul>
     * <li>Primary: primary/secondary switchover within the primary zone.</li>
     * <li>Standby: switchover to the hot standby storage cluster.</li>
     * </ul>
     * <p>Default value: Primary. This value indicates that the switchover is performed within the active zone.</p>
     * 
     * <strong>example:</strong>
     * <p>Primary</p>
     */
    @NameInMap("TargetZoneType")
    public String targetZoneType;

    public static FailoverDBClusterZonalRequest build(java.util.Map<String, ?> map) throws Exception {
        FailoverDBClusterZonalRequest self = new FailoverDBClusterZonalRequest();
        return TeaModel.build(map, self);
    }

    public FailoverDBClusterZonalRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public FailoverDBClusterZonalRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public FailoverDBClusterZonalRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public FailoverDBClusterZonalRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public FailoverDBClusterZonalRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public FailoverDBClusterZonalRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public FailoverDBClusterZonalRequest setRollBackForDisaster(Boolean rollBackForDisaster) {
        this.rollBackForDisaster = rollBackForDisaster;
        return this;
    }
    public Boolean getRollBackForDisaster() {
        return this.rollBackForDisaster;
    }

    public FailoverDBClusterZonalRequest setTargetDBNodeId(String targetDBNodeId) {
        this.targetDBNodeId = targetDBNodeId;
        return this;
    }
    public String getTargetDBNodeId() {
        return this.targetDBNodeId;
    }

    public FailoverDBClusterZonalRequest setTargetZoneType(String targetZoneType) {
        this.targetZoneType = targetZoneType;
        return this;
    }
    public String getTargetZoneType() {
        return this.targetZoneType;
    }

}
