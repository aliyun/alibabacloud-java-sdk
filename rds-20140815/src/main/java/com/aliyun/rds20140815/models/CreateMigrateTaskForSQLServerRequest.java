// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateMigrateTaskForSQLServerRequest extends TeaModel {
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    @NameInMap("DBName")
    @Validation(required = true)
    public String DBName;

    @NameInMap("TaskType")
    @Validation(required = true)
    public String taskType;

    @NameInMap("IsOnlineDB")
    @Validation(required = true)
    public String isOnlineDB;

    @NameInMap("OSSUrls")
    @Validation(required = true)
    public String OSSUrls;

    public static CreateMigrateTaskForSQLServerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMigrateTaskForSQLServerRequest self = new CreateMigrateTaskForSQLServerRequest();
        return TeaModel.build(map, self);
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
