// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class UnlockDBInstanceWriteResponseBody extends TeaModel {
    /**
     * <p>The name of the instance.</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The task ID.</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    public static UnlockDBInstanceWriteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnlockDBInstanceWriteResponseBody self = new UnlockDBInstanceWriteResponseBody();
        return TeaModel.build(map, self);
    }

    public UnlockDBInstanceWriteResponseBody setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public UnlockDBInstanceWriteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UnlockDBInstanceWriteResponseBody setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
