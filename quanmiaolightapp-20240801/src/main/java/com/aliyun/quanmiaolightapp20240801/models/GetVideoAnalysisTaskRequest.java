// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class GetVideoAnalysisTaskRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a3d1c2ac-f086-4a21-9069-f5631542f5a2</p>
     */
    @NameInMap("taskId")
    public String taskId;

    public static GetVideoAnalysisTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVideoAnalysisTaskRequest self = new GetVideoAnalysisTaskRequest();
        return TeaModel.build(map, self);
    }

    public GetVideoAnalysisTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
