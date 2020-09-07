// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateMigrateTaskForSQLServerResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    @NameInMap("DBInstanceName")
    @Validation(required = true)
    public String DBInstanceName;

    @NameInMap("TaskId")
    @Validation(required = true)
    public String taskId;

    @NameInMap("DBName")
    @Validation(required = true)
    public String DBName;

    @NameInMap("MigrateIaskId")
    @Validation(required = true)
    public String migrateIaskId;

    @NameInMap("TaskType")
    @Validation(required = true)
    public String taskType;

    public static CreateMigrateTaskForSQLServerResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMigrateTaskForSQLServerResponse self = new CreateMigrateTaskForSQLServerResponse();
        return TeaModel.build(map, self);
    }

    public CreateMigrateTaskForSQLServerResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateMigrateTaskForSQLServerResponse setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public CreateMigrateTaskForSQLServerResponse setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public CreateMigrateTaskForSQLServerResponse setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public CreateMigrateTaskForSQLServerResponse setDBName(String DBName) {
        this.DBName = DBName;
        return this;
    }
    public String getDBName() {
        return this.DBName;
    }

    public CreateMigrateTaskForSQLServerResponse setMigrateIaskId(String migrateIaskId) {
        this.migrateIaskId = migrateIaskId;
        return this;
    }
    public String getMigrateIaskId() {
        return this.migrateIaskId;
    }

    public CreateMigrateTaskForSQLServerResponse setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
