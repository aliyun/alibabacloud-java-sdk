// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class GetTaskStatusRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static GetTaskStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTaskStatusRequest self = new GetTaskStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetTaskStatusRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
