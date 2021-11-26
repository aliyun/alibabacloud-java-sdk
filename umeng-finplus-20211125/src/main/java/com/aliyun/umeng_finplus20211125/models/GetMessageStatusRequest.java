// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20211125.models;

import com.aliyun.tea.*;

public class GetMessageStatusRequest extends TeaModel {
    @NameInMap("TaskId")
    public String taskId;

    public static GetMessageStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMessageStatusRequest self = new GetMessageStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetMessageStatusRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
