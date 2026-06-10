// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetCreateLogoTaskRequest extends TeaModel {
    /**
     * <p>The job ID returned upon successful invocation. Note: Keep this ID securely. You need this ID to query the device creation status.</p>
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
