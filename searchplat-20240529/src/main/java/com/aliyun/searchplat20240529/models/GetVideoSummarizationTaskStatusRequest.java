// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240529.models;

import com.aliyun.tea.*;

public class GetVideoSummarizationTaskStatusRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("task_id")
    public String taskId;

    public static GetVideoSummarizationTaskStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVideoSummarizationTaskStatusRequest self = new GetVideoSummarizationTaskStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetVideoSummarizationTaskStatusRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
