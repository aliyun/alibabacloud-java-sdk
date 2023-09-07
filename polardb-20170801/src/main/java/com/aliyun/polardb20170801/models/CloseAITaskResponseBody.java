// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CloseAITaskResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the task for disabling the PolarDB for AI feature.</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static CloseAITaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloseAITaskResponseBody self = new CloseAITaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CloseAITaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CloseAITaskResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
