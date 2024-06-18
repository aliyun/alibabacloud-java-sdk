// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class MigrateDBInstanceResponseBody extends TeaModel {
    /**
     * <p>The serial number of the task in the migration task queue. When the serial number becomes 0, the system starts the migration.</p>
     * 
     * <strong>example:</strong>
     * <p>224****</p>
     */
    @NameInMap("MigrationId")
    public Integer migrationId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>498AE8CA-8C81-4A01-AF37-2B902014ED30</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>10824****</p>
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
