// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyReadonlyInstanceDelayReplicationTimeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("ReadSQLReplicationTime")
    public String readSQLReplicationTime;

    @NameInMap("TaskId")
    public String taskId;

    public static ModifyReadonlyInstanceDelayReplicationTimeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyReadonlyInstanceDelayReplicationTimeResponseBody self = new ModifyReadonlyInstanceDelayReplicationTimeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyReadonlyInstanceDelayReplicationTimeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
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

    public ModifyReadonlyInstanceDelayReplicationTimeResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
