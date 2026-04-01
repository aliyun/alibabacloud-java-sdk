// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeleteRCClusterNodesResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7E0970A1-0434-5C83-B560-613EBA11B525</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>238028563</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static DeleteRCClusterNodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteRCClusterNodesResponseBody self = new DeleteRCClusterNodesResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteRCClusterNodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteRCClusterNodesResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
