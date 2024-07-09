// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240529.models;

import com.aliyun.tea.*;

public class GetImageAnalyzeTaskStatusRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("task_id")
    public String taskId;

    public static GetImageAnalyzeTaskStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetImageAnalyzeTaskStatusRequest self = new GetImageAnalyzeTaskStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetImageAnalyzeTaskStatusRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
