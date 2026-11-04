// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateInspectionTaskResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>2921D843-433A-5FB3-A03B-4EC093B219F8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the created inspection task.</p>
     * 
     * <strong>example:</strong>
     * <p>task-123</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static CreateInspectionTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateInspectionTaskResponseBody self = new CreateInspectionTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateInspectionTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateInspectionTaskResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
