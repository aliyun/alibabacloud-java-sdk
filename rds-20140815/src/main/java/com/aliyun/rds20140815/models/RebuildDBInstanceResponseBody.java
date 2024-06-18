// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class RebuildDBInstanceResponseBody extends TeaModel {
    /**
     * <p>The serial number of the task in the rebuild task queue. When the serial number becomes 0, the system starts to rebuild the secondary instance.</p>
     * 
     * <strong>example:</strong>
     * <p>3298015</p>
     */
    @NameInMap("MigrationId")
    public Integer migrationId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>355DA57C-8CC4-40AB-B3F8-B684BA32EB9E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>208676661</p>
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
