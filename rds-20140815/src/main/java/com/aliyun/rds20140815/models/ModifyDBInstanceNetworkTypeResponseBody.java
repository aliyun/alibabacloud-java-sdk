// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceNetworkTypeResponseBody extends TeaModel {
    /**
     * <p>The endpoint that is used to connect to the instance.</p>
     */
    @NameInMap("ConnectionString")
    public String connectionString;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the task.</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static ModifyDBInstanceNetworkTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceNetworkTypeResponseBody self = new ModifyDBInstanceNetworkTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceNetworkTypeResponseBody setConnectionString(String connectionString) {
        this.connectionString = connectionString;
        return this;
    }
    public String getConnectionString() {
        return this.connectionString;
    }

    public ModifyDBInstanceNetworkTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyDBInstanceNetworkTypeResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
