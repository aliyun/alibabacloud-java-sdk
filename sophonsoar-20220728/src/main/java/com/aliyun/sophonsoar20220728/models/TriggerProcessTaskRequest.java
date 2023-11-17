// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class TriggerProcessTaskRequest extends TeaModel {
    @NameInMap("ActionType")
    public String actionType;

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
