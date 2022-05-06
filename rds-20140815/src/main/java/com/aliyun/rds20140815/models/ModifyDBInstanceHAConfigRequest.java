// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceHAConfigRequest extends TeaModel {
    @NameInMap("DbInstanceId")
    public String dbInstanceId;

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
