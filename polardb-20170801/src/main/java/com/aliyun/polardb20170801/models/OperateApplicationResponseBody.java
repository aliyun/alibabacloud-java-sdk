// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class OperateApplicationResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>CD3FA5F3-FAF3-44CA-AFFF-BAF869******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The asynchronous task ID. For Ray restart, the parent task ID of restart_ray_cluster is returned. For DisableHeadScheduling and EnableHeadScheduling, the modify_ray_head_scheduling task ID is returned. A success response only indicates that the request is accepted. Historical applications or MCP paths may not return a task ID, and the default output is 0, which does not represent a valid task.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("TaskId")
    public Integer taskId;

    public static OperateApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OperateApplicationResponseBody self = new OperateApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public OperateApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OperateApplicationResponseBody setTaskId(Integer taskId) {
        this.taskId = taskId;
        return this;
    }
    public Integer getTaskId() {
        return this.taskId;
    }

}
