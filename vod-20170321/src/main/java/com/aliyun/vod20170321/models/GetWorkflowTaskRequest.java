// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetWorkflowTaskRequest extends TeaModel {
    /**
     * <p>The task ID used to query the refresh status.</p>
     * 
     * <strong>example:</strong>
     * <p>70422****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static GetWorkflowTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWorkflowTaskRequest self = new GetWorkflowTaskRequest();
        return TeaModel.build(map, self);
    }

    public GetWorkflowTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
