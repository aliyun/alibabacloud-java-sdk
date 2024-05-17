// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBClusterAuditLogCollectorRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable or disable SQL collector. Valid values:</p>
     * <br>
     * <p>*   Enable</p>
     * <p>*   Disable</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CollectorStatus")
    public String collectorStatus;

    /**
     * <p>The cluster ID.</p>
     * <br>
     * <p>This parameter is required.</p>
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

    public static ModifyDBClusterAuditLogCollectorRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterAuditLogCollectorRequest self = new ModifyDBClusterAuditLogCollectorRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterAuditLogCollectorRequest setCollectorStatus(String collectorStatus) {
        this.collectorStatus = collectorStatus;
        return this;
    }
    public String getCollectorStatus() {
        return this.collectorStatus;
    }

    public ModifyDBClusterAuditLogCollectorRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyDBClusterAuditLogCollectorRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyDBClusterAuditLogCollectorRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyDBClusterAuditLogCollectorRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyDBClusterAuditLogCollectorRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
