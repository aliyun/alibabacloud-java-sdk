// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smart_subtitle20201217.models;

import com.aliyun.tea.*;

public class GetGameVideoTaskStatusRequest extends TeaModel {
    @NameInMap("TaskId")
    public Long taskId;

    public static GetGameVideoTaskStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetGameVideoTaskStatusRequest self = new GetGameVideoTaskStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetGameVideoTaskStatusRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
