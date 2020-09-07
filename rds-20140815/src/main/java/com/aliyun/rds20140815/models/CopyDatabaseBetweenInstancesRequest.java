// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CopyDatabaseBetweenInstancesRequest extends TeaModel {
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    @NameInMap("TargetDBInstanceId")
    @Validation(required = true)
    public String targetDBInstanceId;

    @NameInMap("DbNames")
    @Validation(required = true)
    public String dbNames;

    @NameInMap("BackupId")
    public String backupId;

    @NameInMap("RestoreTime")
    public String restoreTime;

    @NameInMap("SyncUserPrivilege")
    public String syncUserPrivilege;

    public static CopyDatabaseBetweenInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        CopyDatabaseBetweenInstancesRequest self = new CopyDatabaseBetweenInstancesRequest();
        return TeaModel.build(map, self);
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

}
