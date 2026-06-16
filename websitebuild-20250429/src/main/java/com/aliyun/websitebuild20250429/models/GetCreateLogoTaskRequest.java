// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetCreateLogoTaskRequest extends TeaModel {
    /**
     * <p>The task ID returned when the call is successful. Note: Keep this ID safe. This ID is required when you query the status of device creation.</p>
     * 
     * <strong>example:</strong>
     * <p>20051349</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static GetCreateLogoTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCreateLogoTaskRequest self = new GetCreateLogoTaskRequest();
        return TeaModel.build(map, self);
    }

    public GetCreateLogoTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
