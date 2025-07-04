// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class RedeployRCInstanceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>866F5EB8-4650-4061-87F0-379F6F968BCE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>t-bp10e8orkp8x****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static RedeployRCInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RedeployRCInstanceResponseBody self = new RedeployRCInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public RedeployRCInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RedeployRCInstanceResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
