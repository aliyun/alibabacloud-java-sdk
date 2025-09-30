// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class UpdateVideoAnalysisTasksRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("taskIds")
    public java.util.List<String> taskIds;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CANCELED</p>
     */
    @NameInMap("taskStatus")
    public String taskStatus;

    public static UpdateVideoAnalysisTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateVideoAnalysisTasksRequest self = new UpdateVideoAnalysisTasksRequest();
        return TeaModel.build(map, self);
    }

    public UpdateVideoAnalysisTasksRequest setTaskIds(java.util.List<String> taskIds) {
        this.taskIds = taskIds;
        return this;
    }
    public java.util.List<String> getTaskIds() {
        return this.taskIds;
    }

    public UpdateVideoAnalysisTasksRequest setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public String getTaskStatus() {
        return this.taskStatus;
    }

}
