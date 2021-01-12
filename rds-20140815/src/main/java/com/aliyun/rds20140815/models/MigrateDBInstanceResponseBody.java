// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class MigrateDBInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskId")
    public Integer taskId;

    @NameInMap("MigrationId")
    public Integer migrationId;

    public static MigrateDBInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MigrateDBInstanceResponseBody self = new MigrateDBInstanceResponseBody();
        return TeaModel.build(map, self);
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

    public MigrateDBInstanceResponseBody setMigrationId(Integer migrationId) {
        this.migrationId = migrationId;
        return this;
    }
    public Integer getMigrationId() {
        return this.migrationId;
    }

}
