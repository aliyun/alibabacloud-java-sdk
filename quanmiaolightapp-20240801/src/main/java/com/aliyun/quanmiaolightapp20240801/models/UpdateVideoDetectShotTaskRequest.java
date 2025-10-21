// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class UpdateVideoDetectShotTaskRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("taskId")
    public String taskId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CANCELED</p>
     */
    @NameInMap("taskStatus")
    public String taskStatus;

    public static UpdateVideoDetectShotTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateVideoDetectShotTaskRequest self = new UpdateVideoDetectShotTaskRequest();
        return TeaModel.build(map, self);
    }

    public UpdateVideoDetectShotTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public UpdateVideoDetectShotTaskRequest setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public String getTaskStatus() {
        return this.taskStatus;
    }

}
