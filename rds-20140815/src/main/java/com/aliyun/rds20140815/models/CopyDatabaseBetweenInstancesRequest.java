// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CopyDatabaseBetweenInstancesRequest extends TeaModel {
    /**
     * <p>The backup set ID of the source instance. To copy a database from a backup set, call DescribeBackups to query the backup set ID.</p>
     * <blockquote>
     * <p>You must specify either <strong>BackupId</strong> or <strong>RestoreTime</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>259321****</p>
     */
    @NameInMap("BackupId")
    public String backupId;

    /**
     * <p>The source instance ID. You can call DescribeDBInstances to query the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-bp172446ys9cf****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The list of database names to be copied. Format: <code>{&quot;Source database name&quot;:&quot;Destination database name&quot;}</code>. Separate multiple databases with commas (,). Examples:</p>
     * <ul>
     * <li>Copy a single database: <code>{&quot;zhttest&quot;:&quot;zhttest&quot;}</code></li>
     * <li>Copy multiple databases: <code>{&quot;zhttest01&quot;:&quot;zhttest01&quot;,&quot;zhttest02&quot;:&quot;zhttest02&quot;}</code></li>
     * </ul>
     * <blockquote>
     * <p>The database name on the target instance can be different from that on the source instance. However, make sure that the target instance does not contain a database with the same name before copying.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;zhttest&quot;:&quot;zhttest&quot;}</p>
     */
    @NameInMap("DbNames")
    public String dbNames;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The point in time to which you want to copy the database. You can specify any point in time within the backup retention period. Format: <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z (UTC).</p>
     * <blockquote>
     * <p>You must specify either <strong>BackupId</strong> or <strong>RestoreTime</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2025-06-08T17:41:14Z</p>
     */
    @NameInMap("RestoreTime")
    public String restoreTime;

    /**
     * <p>Specifies whether to copy users and permissions. Valid values:</p>
     * <ul>
     * <li><strong>YES</strong>: Users and permissions are copied. If the target instance contains a user with the same name, the permissions of the user on the source instance are merged with those of the user on the target instance.</li>
     * <li><strong>NO</strong> (default): Users and permissions are not copied.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NO</p>
     */
    @NameInMap("SyncUserPrivilege")
    public String syncUserPrivilege;

    /**
     * <p>The target instance ID. You can invoke DescribeDBInstances to query the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-bp1m71wvzfiq7****</p>
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
