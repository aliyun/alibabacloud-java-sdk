// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateMigrateTaskForSQLServerRequest extends TeaModel {
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

    @NameInMap("TaskType")
    public String taskType;

    @NameInMap("IsOnlineDB")
    public String isOnlineDB;

    @NameInMap("OSSUrls")
    public String OSSUrls;

    public static CreateMigrateTaskForSQLServerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMigrateTaskForSQLServerRequest self = new CreateMigrateTaskForSQLServerRequest();
        return TeaModel.build(map, self);
    }

    public CreateMigrateTaskForSQLServerRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateMigrateTaskForSQLServerRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateMigrateTaskForSQLServerRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateMigrateTaskForSQLServerRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public CreateMigrateTaskForSQLServerRequest setDBName(String DBName) {
        this.DBName = DBName;
        return this;
    }
    public String getDBName() {
        return this.DBName;
    }

    public CreateMigrateTaskForSQLServerRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

    public CreateMigrateTaskForSQLServerRequest setIsOnlineDB(String isOnlineDB) {
        this.isOnlineDB = isOnlineDB;
        return this;
    }
    public String getIsOnlineDB() {
        return this.isOnlineDB;
    }

    public CreateMigrateTaskForSQLServerRequest setOSSUrls(String OSSUrls) {
        this.OSSUrls = OSSUrls;
        return this;
    }
    public String getOSSUrls() {
        return this.OSSUrls;
    }

}
