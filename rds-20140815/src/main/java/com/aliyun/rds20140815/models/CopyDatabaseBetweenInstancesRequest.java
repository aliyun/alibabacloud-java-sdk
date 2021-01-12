// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CopyDatabaseBetweenInstancesRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("PayType")
    public String payType;

    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("TargetDBInstanceId")
    public String targetDBInstanceId;

    @NameInMap("DbNames")
    public String dbNames;

    @NameInMap("BackupId")
    public String backupId;

    @NameInMap("RestoreTime")
    public String restoreTime;

    @NameInMap("SyncUserPrivilege")
    public String syncUserPrivilege;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static CopyDatabaseBetweenInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        CopyDatabaseBetweenInstancesRequest self = new CopyDatabaseBetweenInstancesRequest();
        return TeaModel.build(map, self);
    }

    public CopyDatabaseBetweenInstancesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CopyDatabaseBetweenInstancesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CopyDatabaseBetweenInstancesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CopyDatabaseBetweenInstancesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CopyDatabaseBetweenInstancesRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public CopyDatabaseBetweenInstancesRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public CopyDatabaseBetweenInstancesRequest setTargetDBInstanceId(String targetDBInstanceId) {
        this.targetDBInstanceId = targetDBInstanceId;
        return this;
    }
    public String getTargetDBInstanceId() {
        return this.targetDBInstanceId;
    }

    public CopyDatabaseBetweenInstancesRequest setDbNames(String dbNames) {
        this.dbNames = dbNames;
        return this;
    }
    public String getDbNames() {
        return this.dbNames;
    }

    public CopyDatabaseBetweenInstancesRequest setBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }
    public String getBackupId() {
        return this.backupId;
    }

    public CopyDatabaseBetweenInstancesRequest setRestoreTime(String restoreTime) {
        this.restoreTime = restoreTime;
        return this;
    }
    public String getRestoreTime() {
        return this.restoreTime;
    }

    public CopyDatabaseBetweenInstancesRequest setSyncUserPrivilege(String syncUserPrivilege) {
        this.syncUserPrivilege = syncUserPrivilege;
        return this;
    }
    public String getSyncUserPrivilege() {
        return this.syncUserPrivilege;
    }

    public CopyDatabaseBetweenInstancesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CopyDatabaseBetweenInstancesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
