// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CopyDatabaseBetweenInstancesRequest extends TeaModel {
    @NameInMap("BackupId")
    public String backupId;

    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("DbNames")
    public String dbNames;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RestoreTime")
    public String restoreTime;

    @NameInMap("SyncUserPrivilege")
    public String syncUserPrivilege;

    @NameInMap("TargetDBInstanceId")
    public String targetDBInstanceId;

    public static CopyDatabaseBetweenInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        CopyDatabaseBetweenInstancesRequest self = new CopyDatabaseBetweenInstancesRequest();
        return TeaModel.build(map, self);
    }

    public CopyDatabaseBetweenInstancesRequest setBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }
    public String getBackupId() {
        return this.backupId;
    }

    public CopyDatabaseBetweenInstancesRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public CopyDatabaseBetweenInstancesRequest setDbNames(String dbNames) {
        this.dbNames = dbNames;
        return this;
    }
    public String getDbNames() {
        return this.dbNames;
    }

    public CopyDatabaseBetweenInstancesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
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

    public CopyDatabaseBetweenInstancesRequest setTargetDBInstanceId(String targetDBInstanceId) {
        this.targetDBInstanceId = targetDBInstanceId;
        return this;
    }
    public String getTargetDBInstanceId() {
        return this.targetDBInstanceId;
    }

}
