// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasDiagnosisFailedtaskinfoRequest extends TeaModel {
    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("DgNodeId")
    public String dgNodeId;

    public static GetHasDiagnosisFailedtaskinfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHasDiagnosisFailedtaskinfoRequest self = new GetHasDiagnosisFailedtaskinfoRequest();
        return TeaModel.build(map, self);
    }

    public GetHasDiagnosisFailedtaskinfoRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public GetHasDiagnosisFailedtaskinfoRequest setDgNodeId(String dgNodeId) {
        this.dgNodeId = dgNodeId;
        return this;
    }
    public String getDgNodeId() {
        return this.dgNodeId;
    }

}
