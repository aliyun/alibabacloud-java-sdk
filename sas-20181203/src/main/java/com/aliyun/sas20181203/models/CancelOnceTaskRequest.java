// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CancelOnceTaskRequest extends TeaModel {
    /**
     * <p>The ID of the task.</p>
     * <br>
     * <p>>  You can call the [GenerateOnceTask](~~GenerateOnceTask~~) operation to query the IDs of tasks.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
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
