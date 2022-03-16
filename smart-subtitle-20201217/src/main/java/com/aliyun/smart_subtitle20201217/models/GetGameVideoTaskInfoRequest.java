// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smart_subtitle20201217.models;

import com.aliyun.tea.*;

public class GetGameVideoTaskInfoRequest extends TeaModel {
    @NameInMap("TaskId")
    public Long taskId;

    public static GetGameVideoTaskInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetGameVideoTaskInfoRequest self = new GetGameVideoTaskInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetGameVideoTaskInfoRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
