// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20150801.models;

import com.aliyun.tea.*;

public class StopTaskRequest extends TeaModel {
    @NameInMap("Msg")
    public String msg;

    @NameInMap("TaskId")
    public Integer taskId;

    @NameInMap("Type")
    public String type;

    public static StopTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        StopTaskRequest self = new StopTaskRequest();
        return TeaModel.build(map, self);
    }

    public StopTaskRequest setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public StopTaskRequest setTaskId(Integer taskId) {
        this.taskId = taskId;
        return this;
    }
    public Integer getTaskId() {
        return this.taskId;
    }

    public StopTaskRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
