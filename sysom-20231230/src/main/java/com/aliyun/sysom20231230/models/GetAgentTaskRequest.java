// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetAgentTaskRequest extends TeaModel {
    @NameInMap("task_id")
    public String taskId;

    public static GetAgentTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAgentTaskRequest self = new GetAgentTaskRequest();
        return TeaModel.build(map, self);
    }

    public GetAgentTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
