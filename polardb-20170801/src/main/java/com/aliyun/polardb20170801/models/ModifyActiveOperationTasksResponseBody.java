// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyActiveOperationTasksResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>42CD2EF5-D77E-5AD4-961B-159330D98286</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The task IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>11111,22222</p>
     */
    @NameInMap("TaskIds")
    public String taskIds;

    public static ModifyActiveOperationTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyActiveOperationTasksResponseBody self = new ModifyActiveOperationTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyActiveOperationTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyActiveOperationTasksResponseBody setTaskIds(String taskIds) {
        this.taskIds = taskIds;
        return this;
    }
    public String getTaskIds() {
        return this.taskIds;
    }

}
