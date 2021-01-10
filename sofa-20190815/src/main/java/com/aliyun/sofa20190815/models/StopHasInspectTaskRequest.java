// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class StopHasInspectTaskRequest extends TeaModel {
    @NameInMap("TaskId")
    public String taskId;

    public static StopHasInspectTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        StopHasInspectTaskRequest self = new StopHasInspectTaskRequest();
        return TeaModel.build(map, self);
    }

    public StopHasInspectTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
