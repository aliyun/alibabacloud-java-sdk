// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CopyDatabaseBetweenInstancesRequest extends TeaModel {
    /**
     * <p>The ID of the backup set by which you want to restore databases of the source instance. You can call the [DescribeBackups](~~26273~~) operation to obtain the IDs of backup sets.</p>
     * <br>
     * <p>> You must specify one of the **BackupId** and **RestoreTime** parameters.</p>
     */
    @NameInMap("BackupId")
    public String backupId;

    /**
     * <p>The ID of the source instance.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The names of the databases. Format: `{"Original database name 1":"New database name 1","Original database name 2":"New database name 2"}`.</p>
     */
    @NameInMap("DbNames")
    public String dbNames;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The point in time when the system replicates databases. You can select a point in time within the backup retention period. Specify the time in the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time must be in UTC.</p>
     * <br>
     * <p>> You must specify one of the **BackupId** and **RestoreTime** parameters.</p>
     */
    @NameInMap("RestoreTime")
    public String restoreTime;

    /**
     * <p>Specifies whether to copy users and permissions.</p>
     * <br>
     * <p>*   **YES**: copies users and permissions. If the destination instance has a user whose name is the same as a user in the source instance, the permissions of the user in the source instance will also be granted to the user in the destination instance after you copy user permissions.</p>
     * <p>*   **NO**: does not copy users and permissions.</p>
     * <br>
     * <p>Default value: **NO**.</p>
     */
    @NameInMap("SyncUserPrivilege")
    public String syncUserPrivilege;

    /**
     * <p>The ID of the destination instance, which must differ from the ID of the source instance.</p>
     */
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
