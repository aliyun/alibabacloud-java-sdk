// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class UpdateVideoAnalysisTasksShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("taskIds")
    public String taskIdsShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CANCELED</p>
     */
    @NameInMap("taskStatus")
    public String taskStatus;

    public static UpdateVideoAnalysisTasksShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateVideoAnalysisTasksShrinkRequest self = new UpdateVideoAnalysisTasksShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateVideoAnalysisTasksShrinkRequest setTaskIdsShrink(String taskIdsShrink) {
        this.taskIdsShrink = taskIdsShrink;
        return this;
    }
    public String getTaskIdsShrink() {
        return this.taskIdsShrink;
    }

    public UpdateVideoAnalysisTasksShrinkRequest setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public String getTaskStatus() {
        return this.taskStatus;
    }

}
