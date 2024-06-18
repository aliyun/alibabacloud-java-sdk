// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CopyDatabaseBetweenInstancesRequest extends TeaModel {
    /**
     * <p>The ID of the backup set based on which you want to restore databases of the source instance. When you replicate databases by backup set, you can call the DescribeBackups operation to obtain the ID of the backup set.</p>
     * <blockquote>
     * <p> You must specify one of the <strong>BackupId</strong> and <strong>RestoreTime</strong> parameters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>106523874****</p>
     */
    @NameInMap("BackupId")
    public String backupId;

    /**
     * <p>The source instance ID. You can call the DescribeDBInstances operation to query the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5xxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The names of the databases that you want to copy. Format: <code>Source database name 1,Source database name 2</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;test1&quot;:&quot;newtest1&quot;,&quot;test2&quot;:&quot;newtest2&quot;}</p>
     */
    @NameInMap("DbNames")
    public String dbNames;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The point in time when the system replicates databases. You can select a point in time within the backup retention period. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC.</p>
     * <blockquote>
     * <p>You must specify one of the <strong>BackupId</strong> and <strong>RestoreTime</strong> parameters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2011-06-11T16:00:00Z</p>
     */
    @NameInMap("RestoreTime")
    public String restoreTime;

    /**
     * <p>Specifies whether to copy users and permissions.</p>
     * <ul>
     * <li><strong>YES</strong>: copies users and permissions. If the destination instance has a user whose name is the same as a user in the source instance, the permissions of the user in the source instance will also be granted to the user in the destination instance after you copy user permissions.</li>
     * <li><strong>NO</strong>: does not copy users and permissions.</li>
     * </ul>
     * <p>Default value: <strong>NO</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>NO</p>
     */
    @NameInMap("SyncUserPrivilege")
    public String syncUserPrivilege;

    /**
     * <p>The destination instance ID. You can call the DescribeDBInstances operation to query the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-ut5ajk3xxxxxxx</p>
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
