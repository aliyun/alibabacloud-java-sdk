// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateMigrateTaskForSQLServerResponseBody extends TeaModel {
    @NameInMap("MigrateIaskId")
    public String migrateIaskId;

    @NameInMap("TaskType")
    public String taskType;

    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DBName")
    public String DBName;

    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("TaskId")
    public String taskId;

    public static CreateMigrateTaskForSQLServerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMigrateTaskForSQLServerResponseBody self = new CreateMigrateTaskForSQLServerResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMigrateTaskForSQLServerResponseBody setMigrateIaskId(String migrateIaskId) {
        this.migrateIaskId = migrateIaskId;
        return this;
    }
    public String getMigrateIaskId() {
        return this.migrateIaskId;
    }

    public CreateMigrateTaskForSQLServerResponseBody setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

    public CreateMigrateTaskForSQLServerResponseBody setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public CreateMigrateTaskForSQLServerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateMigrateTaskForSQLServerResponseBody setDBName(String DBName) {
        this.DBName = DBName;
        return this;
    }
    public String getDBName() {
        return this.DBName;
    }

    public CreateMigrateTaskForSQLServerResponseBody setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public CreateMigrateTaskForSQLServerResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
