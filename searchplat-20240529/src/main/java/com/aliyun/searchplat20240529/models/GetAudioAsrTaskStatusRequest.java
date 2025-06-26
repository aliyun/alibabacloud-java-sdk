// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240529.models;

import com.aliyun.tea.*;

public class GetAudioAsrTaskStatusRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("task_id")
    public String taskId;

    public static GetAudioAsrTaskStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAudioAsrTaskStatusRequest self = new GetAudioAsrTaskStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetAudioAsrTaskStatusRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
