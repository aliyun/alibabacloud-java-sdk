// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class RetryAgentlessTaskRequest extends TeaModel {
    /**
     * <p>The ID of the task. You can call the [ListAgentlessTask](~~ListAgentlessTask~~) operation to obtain the IDs of tasks.</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static RetryAgentlessTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        RetryAgentlessTaskRequest self = new RetryAgentlessTaskRequest();
        return TeaModel.build(map, self);
    }

    public RetryAgentlessTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
