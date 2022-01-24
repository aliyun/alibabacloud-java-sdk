// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.speechfiletranscriberlite20211221.models;

import com.aliyun.tea.*;

public class GetTaskResultRequest extends TeaModel {
    @NameInMap("Debug")
    public Boolean debug;

    @NameInMap("TaskId")
    public String taskId;

    public static GetTaskResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTaskResultRequest self = new GetTaskResultRequest();
        return TeaModel.build(map, self);
    }

    public GetTaskResultRequest setDebug(Boolean debug) {
        this.debug = debug;
        return this;
    }
    public Boolean getDebug() {
        return this.debug;
    }

    public GetTaskResultRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
