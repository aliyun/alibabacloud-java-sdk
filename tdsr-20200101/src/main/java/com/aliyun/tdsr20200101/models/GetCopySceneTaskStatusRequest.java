// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class GetCopySceneTaskStatusRequest extends TeaModel {
    // 任务ID
    @NameInMap("TaskId")
    public String taskId;

    public static GetCopySceneTaskStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCopySceneTaskStatusRequest self = new GetCopySceneTaskStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetCopySceneTaskStatusRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
