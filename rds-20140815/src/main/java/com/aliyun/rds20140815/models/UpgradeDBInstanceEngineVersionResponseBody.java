// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class UpgradeDBInstanceEngineVersionResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>65BDA532-28AF-4122-AA39-B382721EEE64</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>10254125</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static UpgradeDBInstanceEngineVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpgradeDBInstanceEngineVersionResponseBody self = new UpgradeDBInstanceEngineVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpgradeDBInstanceEngineVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpgradeDBInstanceEngineVersionResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
