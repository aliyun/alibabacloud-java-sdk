// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class OpenAITaskResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The task ID.</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static OpenAITaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OpenAITaskResponseBody self = new OpenAITaskResponseBody();
        return TeaModel.build(map, self);
    }

    public OpenAITaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OpenAITaskResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
