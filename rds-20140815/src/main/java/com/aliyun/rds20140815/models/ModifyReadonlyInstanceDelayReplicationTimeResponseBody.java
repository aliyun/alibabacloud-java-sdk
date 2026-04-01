// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyReadonlyInstanceDelayReplicationTimeResponseBody extends TeaModel {
    /**
     * <p>The ID of the read-only instance.</p>
     * 
     * <strong>example:</strong>
     * <p>rr-bpxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The latency at which to replicate data from the primary instance to the read-only instance. Unit: seconds.</p>
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
     * <p>BBB11B5A-7B37-493A-87E6-490BCB7BDF98</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>241535739</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static ModifyReadonlyInstanceDelayReplicationTimeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyReadonlyInstanceDelayReplicationTimeResponseBody self = new ModifyReadonlyInstanceDelayReplicationTimeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyReadonlyInstanceDelayReplicationTimeResponseBody setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyReadonlyInstanceDelayReplicationTimeResponseBody setReadSQLReplicationTime(String readSQLReplicationTime) {
        this.readSQLReplicationTime = readSQLReplicationTime;
        return this;
    }
    public String getReadSQLReplicationTime() {
        return this.readSQLReplicationTime;
    }

    public ModifyReadonlyInstanceDelayReplicationTimeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyReadonlyInstanceDelayReplicationTimeResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
