// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetDiagnosisResultRequest extends TeaModel {
    @NameInMap("task_id")
    public String taskId;

    public static GetDiagnosisResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDiagnosisResultRequest self = new GetDiagnosisResultRequest();
        return TeaModel.build(map, self);
    }

    public GetDiagnosisResultRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
