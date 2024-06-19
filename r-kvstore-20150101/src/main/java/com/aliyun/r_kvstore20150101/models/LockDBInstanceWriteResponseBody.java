// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class LockDBInstanceWriteResponseBody extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>r-2ev03avw0r0552***</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>The reason why write operations on the instance are locked.</p>
     * 
     * <strong>example:</strong>
     * <p>lock reason</p>
     */
    @NameInMap("LockReason")
    public String lockReason;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2BE6E619-A657-42E3-AD2D-18F8428A****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>21986****</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    public static LockDBInstanceWriteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        LockDBInstanceWriteResponseBody self = new LockDBInstanceWriteResponseBody();
        return TeaModel.build(map, self);
    }

    public LockDBInstanceWriteResponseBody setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public LockDBInstanceWriteResponseBody setLockReason(String lockReason) {
        this.lockReason = lockReason;
        return this;
    }
    public String getLockReason() {
        return this.lockReason;
    }

    public LockDBInstanceWriteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public LockDBInstanceWriteResponseBody setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
