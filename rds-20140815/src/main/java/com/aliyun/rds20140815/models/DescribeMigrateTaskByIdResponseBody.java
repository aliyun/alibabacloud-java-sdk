// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeMigrateTaskByIdResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    @NameInMap("DBName")
    public String DBName;

    @NameInMap("MigrateTaskId")
    public String migrateTaskId;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("BackupMode")
    public String backupMode;

    @NameInMap("Status")
    public String status;

    @NameInMap("IsDBReplaced")
    public String isDBReplaced;

    @NameInMap("Description")
    public String description;

    public static DescribeMigrateTaskByIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMigrateTaskByIdResponseBody self = new DescribeMigrateTaskByIdResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMigrateTaskByIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMigrateTaskByIdResponseBody setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public DescribeMigrateTaskByIdResponseBody setDBName(String DBName) {
        this.DBName = DBName;
        return this;
    }
    public String getDBName() {
        return this.DBName;
    }

    public DescribeMigrateTaskByIdResponseBody setMigrateTaskId(String migrateTaskId) {
        this.migrateTaskId = migrateTaskId;
        return this;
    }
    public String getMigrateTaskId() {
        return this.migrateTaskId;
    }

    public DescribeMigrateTaskByIdResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeMigrateTaskByIdResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeMigrateTaskByIdResponseBody setBackupMode(String backupMode) {
        this.backupMode = backupMode;
        return this;
    }
    public String getBackupMode() {
        return this.backupMode;
    }

    public DescribeMigrateTaskByIdResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeMigrateTaskByIdResponseBody setIsDBReplaced(String isDBReplaced) {
        this.isDBReplaced = isDBReplaced;
        return this;
    }
    public String getIsDBReplaced() {
        return this.isDBReplaced;
    }

    public DescribeMigrateTaskByIdResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
