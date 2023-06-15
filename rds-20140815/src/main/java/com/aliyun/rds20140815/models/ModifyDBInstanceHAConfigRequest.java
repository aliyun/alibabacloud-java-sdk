// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceHAConfigRequest extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("DbInstanceId")
    public String dbInstanceId;

    /**
     * <p>The HA mode of the instance.</p>
     * <br>
     * <p>*   RPO: Data consistency is preferred. The instance ensures data reliability to minimize data losses. If you have high requirements on data consistency, select this mode.</p>
     * <p>*   RTO: Service availability is preferred. The instance restores the database service at the earliest opportunity to ensure service availability. If you have high requirements for service availability, select this mode.</p>
     */
    @NameInMap("HAMode")
    public String HAMode;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The data replication mode of the instance. For more information, see [Data replication mode](~~96055~~).</p>
     * <br>
     * <p>*   Semi-sync: the semi-synchronous mode.</p>
     * <p>*   Sync: the synchronous mode.</p>
     * <p>*   gAsyncg: the asynchronous mode.</p>
     * <p>*   Mgr: the MySQL group replication (MGR) mode. This mode is available only for the China site (aliyun.com).</p>
     * <br>
     * <p>> This parameter is not supported for instances that run SQL Server 2017 on RDS Cluster Edition.</p>
     */
    @NameInMap("SyncMode")
    public String syncMode;

    public static ModifyDBInstanceHAConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceHAConfigRequest self = new ModifyDBInstanceHAConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceHAConfigRequest setDbInstanceId(String dbInstanceId) {
        this.dbInstanceId = dbInstanceId;
        return this;
    }
    public String getDbInstanceId() {
        return this.dbInstanceId;
    }

    public ModifyDBInstanceHAConfigRequest setHAMode(String HAMode) {
        this.HAMode = HAMode;
        return this;
    }
    public String getHAMode() {
        return this.HAMode;
    }

    public ModifyDBInstanceHAConfigRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyDBInstanceHAConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyDBInstanceHAConfigRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyDBInstanceHAConfigRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyDBInstanceHAConfigRequest setSyncMode(String syncMode) {
        this.syncMode = syncMode;
        return this;
    }
    public String getSyncMode() {
        return this.syncMode;
    }

}
