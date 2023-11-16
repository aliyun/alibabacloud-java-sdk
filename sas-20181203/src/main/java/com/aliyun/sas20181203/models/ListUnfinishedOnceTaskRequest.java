// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListUnfinishedOnceTaskRequest extends TeaModel {
    @NameInMap("Target")
    public String target;

    @NameInMap("TaskType")
    public String taskType;

    public static ListUnfinishedOnceTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUnfinishedOnceTaskRequest self = new ListUnfinishedOnceTaskRequest();
        return TeaModel.build(map, self);
    }

    public ListUnfinishedOnceTaskRequest setTarget(String target) {
        this.target = target;
        return this;
    }
    public String getTarget() {
        return this.target;
    }

    public ListUnfinishedOnceTaskRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
