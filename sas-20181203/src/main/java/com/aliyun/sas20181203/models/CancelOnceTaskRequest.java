// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CancelOnceTaskRequest extends TeaModel {
    @NameInMap("TaskId")
    public String taskId;

    public static CancelOnceTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelOnceTaskRequest self = new CancelOnceTaskRequest();
        return TeaModel.build(map, self);
    }

    public CancelOnceTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
