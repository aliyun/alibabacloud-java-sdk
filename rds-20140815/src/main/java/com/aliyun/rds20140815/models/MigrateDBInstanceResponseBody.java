// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class MigrateDBInstanceResponseBody extends TeaModel {
    /**
     * <p>The serial number of the task in the migration task queue. When the serial number becomes 0, the system starts the migration.</p>
     */
    @NameInMap("MigrationId")
    public Integer migrationId;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The task ID.</p>
     */
    @NameInMap("TaskId")
    public Integer taskId;

    public static MigrateDBInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MigrateDBInstanceResponseBody self = new MigrateDBInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public MigrateDBInstanceResponseBody setMigrationId(Integer migrationId) {
        this.migrationId = migrationId;
        return this;
    }
    public Integer getMigrationId() {
        return this.migrationId;
    }

    public MigrateDBInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MigrateDBInstanceResponseBody setTaskId(Integer taskId) {
        this.taskId = taskId;
        return this;
    }
    public Integer getTaskId() {
        return this.taskId;
    }

}
