// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class RebuildDBInstanceResponseBody extends TeaModel {
    /**
     * <p>The serial number of the task in the rebuild task queue. When the serial number becomes 0, the system starts to rebuild the secondary instance.</p>
     */
    @NameInMap("MigrationId")
    public Integer migrationId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the task.</p>
     */
    @NameInMap("TaskId")
    public Integer taskId;

    public static RebuildDBInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RebuildDBInstanceResponseBody self = new RebuildDBInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public RebuildDBInstanceResponseBody setMigrationId(Integer migrationId) {
        this.migrationId = migrationId;
        return this;
    }
    public Integer getMigrationId() {
        return this.migrationId;
    }

    public RebuildDBInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RebuildDBInstanceResponseBody setTaskId(Integer taskId) {
        this.taskId = taskId;
        return this;
    }
    public Integer getTaskId() {
        return this.taskId;
    }

}
