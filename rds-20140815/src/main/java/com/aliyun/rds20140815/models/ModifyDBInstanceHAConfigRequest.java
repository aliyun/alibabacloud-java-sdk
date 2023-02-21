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
     * <p>The high availability mode. Valid values:</p>
     * <br>
     * <p>*   **RPO**: Data persistence is preferred. The instance preferentially ensures data reliability to minimize data loss. Use this mode if you have higher requirements on data consistency.</p>
     * <p>*   **RTO**: Instance availability is preferred. The instance restores services as soon as possible to ensure availability. Use this mode if you have higher requirements on service availability.</p>
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
     * <p>[The data replication mode](~~96055~~). Valid values:</p>
     * <br>
     * <p>*   **Sync**: synchronous replication</p>
     * <p>*   **Semi-sync**: semi-synchronous replication</p>
     * <p>*   **Async**: asynchronous replication</p>
     * <br>
     * <p>>  This parameter is not supported for instances that run SQL Server 2017 EE.</p>
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
