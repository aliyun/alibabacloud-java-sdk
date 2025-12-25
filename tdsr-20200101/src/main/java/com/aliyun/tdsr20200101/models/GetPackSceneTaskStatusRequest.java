// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class GetPackSceneTaskStatusRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hjsyuyiuwe7wehg****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>download</p>
     */
    @NameInMap("Type")
    public String type;

    public static GetPackSceneTaskStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPackSceneTaskStatusRequest self = new GetPackSceneTaskStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetPackSceneTaskStatusRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public GetPackSceneTaskStatusRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
