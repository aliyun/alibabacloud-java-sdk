// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetVmcoreDiagnosisTaskRequest extends TeaModel {
    @NameInMap("X-Debug-Id")
    public String xDebugId;

    /**
     * <p>The task ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bbe94a98-4192-4172-b856-95777e0a55d7</p>
     */
    @NameInMap("taskId")
    public String taskId;

    @NameInMap("x-sysom-invoke-source")
    public String xSysomInvokeSource;

    public static GetVmcoreDiagnosisTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVmcoreDiagnosisTaskRequest self = new GetVmcoreDiagnosisTaskRequest();
        return TeaModel.build(map, self);
    }

    public GetVmcoreDiagnosisTaskRequest setXDebugId(String xDebugId) {
        this.xDebugId = xDebugId;
        return this;
    }
    public String getXDebugId() {
        return this.xDebugId;
    }

    public GetVmcoreDiagnosisTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public GetVmcoreDiagnosisTaskRequest setXSysomInvokeSource(String xSysomInvokeSource) {
        this.xSysomInvokeSource = xSysomInvokeSource;
        return this;
    }
    public String getXSysomInvokeSource() {
        return this.xSysomInvokeSource;
    }

}
