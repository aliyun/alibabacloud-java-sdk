// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.speechfiletranscriberlite20211221.models;

import com.aliyun.tea.*;

public class SubmitTaskRequest extends TeaModel {
    @NameInMap("Debug")
    public Boolean debug;

    @NameInMap("Task")
    public String task;

    public static SubmitTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitTaskRequest self = new SubmitTaskRequest();
        return TeaModel.build(map, self);
    }

    public SubmitTaskRequest setDebug(Boolean debug) {
        this.debug = debug;
        return this;
    }
    public Boolean getDebug() {
        return this.debug;
    }

    public SubmitTaskRequest setTask(String task) {
        this.task = task;
        return this;
    }
    public String getTask() {
        return this.task;
    }

}
