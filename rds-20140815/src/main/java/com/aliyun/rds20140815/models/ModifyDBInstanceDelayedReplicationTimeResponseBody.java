// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceDelayedReplicationTimeResponseBody extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5*****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The replication latency of the read-only instance. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("ReadSQLReplicationTime")
    public String readSQLReplicationTime;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EFB6083A-7699-489B-8278-C0CB4793A96E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1715482.0</p>
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
