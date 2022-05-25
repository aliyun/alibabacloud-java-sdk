// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class GetSourcePackStatusRequest extends TeaModel {
    // 任务ID
    @NameInMap("TaskId")
    public String taskId;

    public static GetSourcePackStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSourcePackStatusRequest self = new GetSourcePackStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetSourcePackStatusRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
