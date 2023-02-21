// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateMigrateTaskRequest extends TeaModel {
    /**
     * <p>The type of the migration task. Valid values:</p>
     * <br>
     * <p>*   **FULL**: The migration task migrates full backup files.</p>
     * <p>*   **UPDF**: The migration task migrates incremental or log backup files.</p>
     */
    @NameInMap("BackupMode")
    public String backupMode;

    /**
     * <p>The consistency check method for the database. Valid values:</p>
     * <br>
     * <p>*   **SyncExecuteDBCheck**: synchronous database check</p>
     * <p>*   **AsyncExecuteDBCheck**: asynchronous database check</p>
     * <br>
     * <p>Default value: **AsyncExecuteDBCheck** (compatible with SQL Server 2008 R2).</p>
     * <br>
     * <p>>  This parameter is valid when **IsOnlineDB** is set to **True**.</p>
     */
    @NameInMap("CheckDBMode")
    public String checkDBMode;

    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The name of the database that you want to back up.</p>
     */
    @NameInMap("DBName")
    public String DBName;

    /**
     * <p>Specifies whether to make the restored database data available for user access. Valid values:</p>
     * <br>
     * <p>*   **True**</p>
     * <p>*   **False**</p>
     * <br>
     * <p>>  Set the value to **True** for instances that run SQL Server 2008 R2.</p>
     */
    @NameInMap("IsOnlineDB")
    public String isOnlineDB;

    /**
     * <p>The ID of the migration task. Valid values:</p>
     * <br>
     * <p>*   If **BackupMode** is set to **FULL**, the value of this parameter is empty. The full backup mode is compatible with instance that runs SQL Server 2008 R2.</p>
     * <p>*   If **BackupMode** is set to **UPDF**, the value of this parameter is the ID of the required full migration task.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   If **IsOnlineDB** is set to **True**, **BackupMode** must be set to **FULL**.</p>
     * <p>*   If **IsOnlineDB** is set to **False**, **BackupMode** must be set to **UPDF**.</p>
     */
    @NameInMap("MigrateTaskId")
    public String migrateTaskId;

    /**
     * <p>The shared URL of the backup file in the OSS bucket. The URL must be encoded.</p>
     * <br>
     * <p>If you specify multiple URLs, separate them with vertical bars (|) and then encode them.</p>
     * <br>
     * <p>>  This parameter is required for instances that run SQL Server 2008 R2.</p>
     */
    @NameInMap("OSSUrls")
    public String OSSUrls;

    /**
     * <p>The location of the backup file in the OSS bucket.</p>
     * <br>
     * <p>The value consists of the following parts that are separated by colons (:):</p>
     * <br>
     * <p>*   The OSS endpoint: oss-ap-southeast-1.aliyuncs.com.</p>
     * <p>*   The name of the OSS bucket: rdsmssqlsingapore.</p>
     * <p>*   The key of the backup file in the OSS bucket: autotest\_2008R2\_TestMigration_FULL.bak.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   This parameter is optional for instances that run SQL Server 2008 R2.</p>
     * <p>*   This parameter is required for instances that run a database engine later than SQL Server 2008 R2.</p>
     */
    @NameInMap("OssObjectPositions")
    public String ossObjectPositions;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static CreateMigrateTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMigrateTaskRequest self = new CreateMigrateTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateMigrateTaskRequest setBackupMode(String backupMode) {
        this.backupMode = backupMode;
        return this;
    }
    public String getBackupMode() {
        return this.backupMode;
    }

    public CreateMigrateTaskRequest setCheckDBMode(String checkDBMode) {
        this.checkDBMode = checkDBMode;
        return this;
    }
    public String getCheckDBMode() {
        return this.checkDBMode;
    }

    public CreateMigrateTaskRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public CreateMigrateTaskRequest setDBName(String DBName) {
        this.DBName = DBName;
        return this;
    }
    public String getDBName() {
        return this.DBName;
    }

    public CreateMigrateTaskRequest setIsOnlineDB(String isOnlineDB) {
        this.isOnlineDB = isOnlineDB;
        return this;
    }
    public String getIsOnlineDB() {
        return this.isOnlineDB;
    }

    public CreateMigrateTaskRequest setMigrateTaskId(String migrateTaskId) {
        this.migrateTaskId = migrateTaskId;
        return this;
    }
    public String getMigrateTaskId() {
        return this.migrateTaskId;
    }

    public CreateMigrateTaskRequest setOSSUrls(String OSSUrls) {
        this.OSSUrls = OSSUrls;
        return this;
    }
    public String getOSSUrls() {
        return this.OSSUrls;
    }

    public CreateMigrateTaskRequest setOssObjectPositions(String ossObjectPositions) {
        this.ossObjectPositions = ossObjectPositions;
        return this;
    }
    public String getOssObjectPositions() {
        return this.ossObjectPositions;
    }

    public CreateMigrateTaskRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateMigrateTaskRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateMigrateTaskRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
