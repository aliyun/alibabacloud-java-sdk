// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class GetEnterpriseVocAnalysisTaskRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>a3d1c2ac-f086-4a21-9069-f5631542f5a2</p>
     */
    @NameInMap("taskId")
    public String taskId;

    public static GetEnterpriseVocAnalysisTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEnterpriseVocAnalysisTaskRequest self = new GetEnterpriseVocAnalysisTaskRequest();
        return TeaModel.build(map, self);
    }

    public GetEnterpriseVocAnalysisTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
