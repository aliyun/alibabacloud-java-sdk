// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class TriggerProcessTaskRequest extends TeaModel {
    /**
     * <p>The type of the action. Valid values:</p>
     * <ul>
     * <li><strong>remove</strong>: cancels blocking or isolation.</li>
     * <li><strong>retry</strong>: submits the task again.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>remove</p>
     */
    @NameInMap("ActionType")
    public String actionType;

    /**
     * <p>The ID of the handling task.</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeProcessTasks~~">DescribeProcessTasks</a> operation to query the IDs of handling tasks.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>15355xxxxxx82894882</p>
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
