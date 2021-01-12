// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceNetworkTypeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskId")
    public String taskId;

    public static ModifyDBInstanceNetworkTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceNetworkTypeResponseBody self = new ModifyDBInstanceNetworkTypeResponseBody();
        return TeaModel.build(map, self);
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
