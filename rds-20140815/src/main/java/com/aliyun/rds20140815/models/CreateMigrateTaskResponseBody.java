// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateMigrateTaskResponseBody extends TeaModel {
    /**
     * <p>The type of the migration task. Valid values:</p>
     * <ul>
     * <li><strong>FULL</strong>: The migration task migrates full backup files.</li>
     * <li><strong>UPDF</strong>: The migration task migrates incremental or log backup files.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FULL</p>
     */
    @NameInMap("BackupMode")
    public String backupMode;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk******</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The name of the database.</p>
     * 
     * <strong>example:</strong>
     * <p>test02</p>
     */
    @NameInMap("DBName")
    public String DBName;

    /**
     * <p>The ID of the migration task.</p>
     * 
     * <strong>example:</strong>
     * <p>564******</p>
     */
    @NameInMap("MigrateTaskId")
    public String migrateTaskId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>866F5EB8-4650-4061-87F0-379F6F968BCE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>545****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static CreateMigrateTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMigrateTaskResponseBody self = new CreateMigrateTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMigrateTaskResponseBody setBackupMode(String backupMode) {
        this.backupMode = backupMode;
        return this;
    }
    public String getBackupMode() {
        return this.backupMode;
    }

    public CreateMigrateTaskResponseBody setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public CreateMigrateTaskResponseBody setDBName(String DBName) {
        this.DBName = DBName;
        return this;
    }
    public String getDBName() {
        return this.DBName;
    }

    public CreateMigrateTaskResponseBody setMigrateTaskId(String migrateTaskId) {
        this.migrateTaskId = migrateTaskId;
        return this;
    }
    public String getMigrateTaskId() {
        return this.migrateTaskId;
    }

    public CreateMigrateTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateMigrateTaskResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
