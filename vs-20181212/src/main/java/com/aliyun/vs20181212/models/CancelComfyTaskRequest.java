// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class CancelComfyTaskRequest extends TeaModel {
    /**
     * <p>The ID of the Comfy task to cancel.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6c8234f4-d1e1-4cea-b08b-7926fbdea144</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static CancelComfyTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelComfyTaskRequest self = new CancelComfyTaskRequest();
        return TeaModel.build(map, self);
    }

    public CancelComfyTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
