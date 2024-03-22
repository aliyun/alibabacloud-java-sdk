// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class TriggerProcessTaskRequest extends TeaModel {
    /**
     * <p>The type of the action. Valid values:</p>
     * <br>
     * <p>*   **remove**: cancels blocking or isolation.</p>
     * <p>*   **retry**: submits the task again.</p>
     */
    @NameInMap("ActionType")
    public String actionType;

    /**
     * <p>The ID of the handling task.</p>
     * <br>
     * <p>>  You can call the [DescribeProcessTasks](~~DescribeProcessTasks~~) operation to query the IDs of handling tasks.</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static TriggerProcessTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        TriggerProcessTaskRequest self = new TriggerProcessTaskRequest();
        return TeaModel.build(map, self);
    }

    public TriggerProcessTaskRequest setActionType(String actionType) {
        this.actionType = actionType;
        return this;
    }
    public String getActionType() {
        return this.actionType;
    }

    public TriggerProcessTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
