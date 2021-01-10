// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasDiagnosisTasksnapshotRequest extends TeaModel {
    @NameInMap("TaskId")
    public String taskId;

    public static GetHasDiagnosisTasksnapshotRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHasDiagnosisTasksnapshotRequest self = new GetHasDiagnosisTasksnapshotRequest();
        return TeaModel.build(map, self);
    }

    public GetHasDiagnosisTasksnapshotRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
