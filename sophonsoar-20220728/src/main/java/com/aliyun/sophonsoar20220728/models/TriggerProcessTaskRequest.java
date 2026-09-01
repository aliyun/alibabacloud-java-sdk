// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class TriggerProcessTaskRequest extends TeaModel {
    /**
     * <p>The type of the handling action. Valid values:</p>
     * <ul>
     * <li><p><strong>remove</strong>: Removes a block or an asset from isolation.</p>
     * </li>
     * <li><p><strong>retry</strong>: Resubmits the task.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>remove</p>
     */
    @NameInMap("ActionType")
    public String actionType;

    /**
     * <p>The unique ID of the handling task.</p>
     * <blockquote>
     * <p>Call the <a href="~~DescribeProcessTasks~~">DescribeProcessTasks</a> operation to obtain this parameter.</p>
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
