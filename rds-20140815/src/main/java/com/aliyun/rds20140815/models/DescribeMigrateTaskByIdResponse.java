// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeMigrateTaskByIdResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DBInstanceName")
    @Validation(required = true)
    public String DBInstanceName;

    @NameInMap("DBName")
    @Validation(required = true)
    public String DBName;

    @NameInMap("MigrateTaskId")
    @Validation(required = true)
    public String migrateTaskId;

    @NameInMap("CreateTime")
    @Validation(required = true)
    public String createTime;

    @NameInMap("EndTime")
    @Validation(required = true)
    public String endTime;

    @NameInMap("BackupMode")
    @Validation(required = true)
    public String backupMode;

    @NameInMap("Status")
    @Validation(required = true)
    public String status;

    @NameInMap("IsDBReplaced")
    @Validation(required = true)
    public String isDBReplaced;

    @NameInMap("Description")
    @Validation(required = true)
    public String description;

    public static DescribeMigrateTaskByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMigrateTaskByIdResponse self = new DescribeMigrateTaskByIdResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMigrateTaskByIdResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMigrateTaskByIdResponse setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public DescribeMigrateTaskByIdResponse setDBName(String DBName) {
        this.DBName = DBName;
        return this;
    }
    public String getDBName() {
        return this.DBName;
    }

    public DescribeMigrateTaskByIdResponse setMigrateTaskId(String migrateTaskId) {
        this.migrateTaskId = migrateTaskId;
        return this;
    }
    public String getMigrateTaskId() {
        return this.migrateTaskId;
    }

    public DescribeMigrateTaskByIdResponse setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeMigrateTaskByIdResponse setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeMigrateTaskByIdResponse setBackupMode(String backupMode) {
        this.backupMode = backupMode;
        return this;
    }
    public String getBackupMode() {
        return this.backupMode;
    }

    public DescribeMigrateTaskByIdResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeMigrateTaskByIdResponse setIsDBReplaced(String isDBReplaced) {
        this.isDBReplaced = isDBReplaced;
        return this;
    }
    public String getIsDBReplaced() {
        return this.isDBReplaced;
    }

    public DescribeMigrateTaskByIdResponse setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
