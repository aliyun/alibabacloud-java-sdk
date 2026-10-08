// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateMigrateTaskRequest extends TeaModel {
    /**
     * <p>The type of the cloud migration task. Valid values:</p>
     * <ul>
     * <li><strong>FULL</strong>: performs a restore operation by using a full backup file. This value is applicable to first-time migrations or full data recovery scenarios.</li>
     * <li><strong>UPDF</strong>: restores incremental data by using an incremental backup file or log file. This value is applicable to incremental synchronization scenarios where a full backup already exists.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>FULL</p>
     */
    @NameInMap("BackupMode")
    public String backupMode;

    /**
     * <p>The consistency check method after the database is brought online. This parameter takes effect only when IsOnlineDB is set to True. Valid values:</p>
     * <ul>
     * <li><strong>SyncExecuteDBCheck</strong>: performs a synchronous database check. This value is applicable to scenarios that require high data consistency.</li>
     * <li><strong>AsyncExecuteDBCheck</strong>: performs an asynchronous database check. This value provides higher performance but may delay the detection of potential issues.</li>
     * </ul>
     * <p>Default value: <strong>AsyncExecuteDBCheck</strong> (compatible with SQL Server 2008 R2).</p>
     * 
     * <strong>example:</strong>
     * <p>AsyncExecuteDBCheck</p>
     */
    @NameInMap("CheckDBMode")
    public String checkDBMode;

    /**
     * <p>The instance ID. You can call DescribeDBInstances to query the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5****</p>
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
     * <p>Specifies whether to bring the restored database online so that users can access it. Valid values:</p>
     * <ul>
     * <li><strong>True</strong>: Brings the database online.</li>
     * <li><strong>False</strong>: Does not bring the database online.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>For SQL Server 2008 R2, this value is always True.</li>
     * <li>When <strong>IsOnlineDB</strong> is set to <strong>True</strong>, <strong>BackupMode</strong> must be set to <strong>FULL</strong>.</li>
     * <li>When <strong>IsOnlineDB</strong> is set to <strong>False</strong>, <strong>BackupMode</strong> must be set to <strong>UPDF</strong>.</li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("IsOnlineDB")
    public String isOnlineDB;

    /**
     * <p>The migration task ID. Valid values:</p>
     * <ul>
     * <li>When <strong>BackupMode</strong> is set to <strong>FULL</strong>, leave this parameter empty (compatible with SQL Server 2008 R2).</li>
     * <li>When <strong>BackupMode</strong> is set to <strong>UPDF</strong>, set this parameter to the ID of the corresponding FULL task. You can call DescribeMigrateTasks to query the task ID.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("MigrateTaskId")
    public String migrateTaskId;

    /**
     * <p>The shared URL of the backup file on OSS (URL-encoded). If multiple URLs exist, separate them with vertical bars (|) before encoding, and then pass the encoded value.</p>
     * <blockquote>
     * <p>This parameter is required for SQL Server 2008 R2.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>check_cdn_oss.sh www.******.mobi</p>
     */
    @NameInMap("OSSUrls")
    public String OSSUrls;

    /**
     * <p>The OSS file information, which consists of the following three parts separated by colons (:):</p>
     * <ul>
     * <li><strong>OSS endpoint</strong>: oss-ap-southeast-1.aliyuncs.com.</li>
     * <li><strong>OSS bucket name</strong>: rdsmssqlsingapore.</li>
     * <li><strong>Backup file name on OSS</strong>: autotest_2008R2_TestMigration_FULL.bak.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required for SQL Server versions later than SQL Server 2008 R2.</p>
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
