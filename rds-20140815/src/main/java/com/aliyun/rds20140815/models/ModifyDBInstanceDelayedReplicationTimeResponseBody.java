// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceDelayedReplicationTimeResponseBody extends TeaModel {
    /**
     * <p>The instance ID.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The replication latency of the read-only instance. Unit: seconds.</p>
     */
    @NameInMap("ReadSQLReplicationTime")
    public String readSQLReplicationTime;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The task ID.</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static ModifyDBInstanceDelayedReplicationTimeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceDelayedReplicationTimeResponseBody self = new ModifyDBInstanceDelayedReplicationTimeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceDelayedReplicationTimeResponseBody setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyDBInstanceDelayedReplicationTimeResponseBody setReadSQLReplicationTime(String readSQLReplicationTime) {
        this.readSQLReplicationTime = readSQLReplicationTime;
        return this;
    }
    public String getReadSQLReplicationTime() {
        return this.readSQLReplicationTime;
    }

    public ModifyDBInstanceDelayedReplicationTimeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyDBInstanceDelayedReplicationTimeResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
