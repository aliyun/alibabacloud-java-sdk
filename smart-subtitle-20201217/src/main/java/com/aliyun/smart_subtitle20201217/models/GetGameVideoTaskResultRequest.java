// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smart_subtitle20201217.models;

import com.aliyun.tea.*;

public class GetGameVideoTaskResultRequest extends TeaModel {
    @NameInMap("TaskId")
    public Long taskId;

    public static GetGameVideoTaskResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetGameVideoTaskResultRequest self = new GetGameVideoTaskResultRequest();
        return TeaModel.build(map, self);
    }

    public GetGameVideoTaskResultRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
