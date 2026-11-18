// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetWorkflowTaskRequest extends TeaModel {
    /**
     * <p>The workflow task ID. It is returned by the SubmitWorkflowJob operation and is used to query the execution status and result of the task.</p>
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
