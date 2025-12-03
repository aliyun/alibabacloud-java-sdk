// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetVmcoreDiagnosisTaskRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bbe94a98-4192-4172-b856-95777e0a55d7</p>
     */
    @NameInMap("taskId")
    public String taskId;

    public static GetVmcoreDiagnosisTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVmcoreDiagnosisTaskRequest self = new GetVmcoreDiagnosisTaskRequest();
        return TeaModel.build(map, self);
    }

    public GetVmcoreDiagnosisTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
