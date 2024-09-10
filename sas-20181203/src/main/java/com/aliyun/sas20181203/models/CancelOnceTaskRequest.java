// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CancelOnceTaskRequest extends TeaModel {
    /**
     * <p>The ID of the task.</p>
     * <blockquote>
     * <p> You can call the <a href="~~GenerateOnceTask~~">GenerateOnceTask</a> operation to query the IDs of tasks.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ec9c0d88f36cc27765a98c554ee2****</p>
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
