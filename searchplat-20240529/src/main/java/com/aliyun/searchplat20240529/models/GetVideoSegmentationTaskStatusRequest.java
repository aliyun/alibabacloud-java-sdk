// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240529.models;

import com.aliyun.tea.*;

public class GetVideoSegmentationTaskStatusRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("task_id")
    public String taskId;

    public static GetVideoSegmentationTaskStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVideoSegmentationTaskStatusRequest self = new GetVideoSegmentationTaskStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetVideoSegmentationTaskStatusRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
