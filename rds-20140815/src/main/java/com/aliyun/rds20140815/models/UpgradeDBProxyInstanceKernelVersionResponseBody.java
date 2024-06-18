// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class UpgradeDBProxyInstanceKernelVersionResponseBody extends TeaModel {
    /**
     * <p>The ID of the database proxy of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>bu9***</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>44537EC8-DFA2-4745-B579-E733FF2C5B9A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>33436****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static UpgradeDBProxyInstanceKernelVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpgradeDBProxyInstanceKernelVersionResponseBody self = new UpgradeDBProxyInstanceKernelVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpgradeDBProxyInstanceKernelVersionResponseBody setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public UpgradeDBProxyInstanceKernelVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpgradeDBProxyInstanceKernelVersionResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
