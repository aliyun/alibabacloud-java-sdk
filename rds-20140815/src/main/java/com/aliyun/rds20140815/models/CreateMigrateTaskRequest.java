// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateMigrateTaskRequest extends TeaModel {
    /**
     * <p>The type of the migration task. Valid values:</p>
     * <ul>
     * <li><strong>FULL</strong>: The migration task migrates full backup files.</li>
     * <li><strong>UPDF</strong>: The migration task migrates incremental or log backup files.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>FULL</p>
     */
    @NameInMap("BackupMode")
    public String backupMode;

    /**
     * <p>The consistency check method for the database. Valid values:</p>
     * <ul>
     * <li><strong>SyncExecuteDBCheck</strong>: synchronous database check</li>
     * <li><strong>AsyncExecuteDBCheck</strong>: asynchronous database check</li>
     * </ul>
     * <p>Default value: <strong>AsyncExecuteDBCheck</strong> (compatible with SQL Server 2008 R2)</p>
     * <blockquote>
     * <p> This parameter is valid when <strong>IsOnlineDB</strong> is set to <strong>True</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>AsyncExecuteDBCheck</p>
     */
    @NameInMap("CheckDBMode")
    public String checkDBMode;

    /**
     * <p>The instance ID. You can call the DescribeDBInstances operation to query the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk******</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The name of the destination database.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testDB</p>
     */
    @NameInMap("DBName")
    public String DBName;

    /**
     * <p>Specifies whether to make the restored database data available for user access. Valid values:</p>
     * <ul>
     * <li><strong>True</strong></li>
     * <li><strong>False</strong></li>
     * </ul>
     * <blockquote>
     * <p> Set the value to <strong>True</strong> for instances that run SQL Server 2008 R2.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("IsOnlineDB")
    public String isOnlineDB;

    /**
     * <p>The migration task ID.</p>
     * <ul>
     * <li>If you set <strong>BackupMode</strong> to <strong>FULL</strong>, the value of this parameter is empty. The full backup mode is compatible with instance that runs SQL Server 2008 R2.</li>
     * <li>If you set <strong>BackupMode</strong> to <strong>UPDF</strong>, the value of this parameter is the ID of the required full migration task.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>If you set <strong>IsOnlineDB</strong> to <strong>True</strong>, the value of <strong>BackupMode</strong> must be <strong>FULL</strong>.</li>
     * <li>If you set <strong>IsOnlineDB</strong> to <strong>False</strong>, the value of <strong>BackupMode</strong> must be <strong>UPDF</strong>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("MigrateTaskId")
    public String migrateTaskId;

    /**
     * <p>The shared URL of the backup file in the OSS bucket. The URL must be encoded.</p>
     * <p>If you specify multiple URLs, separate them with vertical bars (|) and then encode them.</p>
     * <blockquote>
     * <p> This parameter is required for instances that run SQL Server 2008 R2.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>check_cdn_oss.sh <a href="http://www.xxxxxx.mobi">www.xxxxxx.mobi</a></p>
     */
    @NameInMap("OSSUrls")
    public String OSSUrls;

    /**
     * <p>The information about the backup file in the OSS bucket. The values consist of three parts that are separated by colons (:):</p>
     * <ul>
     * <li>OSS endpoint: oss-ap-southeast-1.aliyuncs.com.</li>
     * <li>Name of the OSS bucket: rdsmssqlsingapore.</li>
     * <li>Key of the backup file in the OSS bucket: autotest_2008R2_TestMigration_FULL.bak.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>This parameter is optional for instances that run SQL Server 2008 R2.</li>
     * <li>This parameter is required for instances that run a major engine version later than SQL Server 2008 R2.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>oss-ap-southeast-1.aliyuncs.com:rdsmssqlsingapore:autotest_2008R2_TestMigration_FULL.bak</p>
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
