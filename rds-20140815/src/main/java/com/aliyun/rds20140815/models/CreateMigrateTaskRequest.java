// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateMigrateTaskRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("DBName")
    public String DBName;

    @NameInMap("BackupMode")
    public String backupMode;

    @NameInMap("IsOnlineDB")
    public String isOnlineDB;

    @NameInMap("CheckDBMode")
    public String checkDBMode;

    @NameInMap("OssObjectPositions")
    public String ossObjectPositions;

    @NameInMap("OSSUrls")
    public String OSSUrls;

    @NameInMap("MigrateTaskId")
    public String migrateTaskId;

    public static CreateMigrateTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMigrateTaskRequest self = new CreateMigrateTaskRequest();
        return TeaModel.build(map, self);
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

    public CreateMigrateTaskRequest setBackupMode(String backupMode) {
        this.backupMode = backupMode;
        return this;
    }
    public String getBackupMode() {
        return this.backupMode;
    }

    public CreateMigrateTaskRequest setIsOnlineDB(String isOnlineDB) {
        this.isOnlineDB = isOnlineDB;
        return this;
    }
    public String getIsOnlineDB() {
        return this.isOnlineDB;
    }

    public CreateMigrateTaskRequest setCheckDBMode(String checkDBMode) {
        this.checkDBMode = checkDBMode;
        return this;
    }
    public String getCheckDBMode() {
        return this.checkDBMode;
    }

    public CreateMigrateTaskRequest setOssObjectPositions(String ossObjectPositions) {
        this.ossObjectPositions = ossObjectPositions;
        return this;
    }
    public String getOssObjectPositions() {
        return this.ossObjectPositions;
    }

    public CreateMigrateTaskRequest setOSSUrls(String OSSUrls) {
        this.OSSUrls = OSSUrls;
        return this;
    }
    public String getOSSUrls() {
        return this.OSSUrls;
    }

    public CreateMigrateTaskRequest setMigrateTaskId(String migrateTaskId) {
        this.migrateTaskId = migrateTaskId;
        return this;
    }
    public String getMigrateTaskId() {
        return this.migrateTaskId;
    }

}
