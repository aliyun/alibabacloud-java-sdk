// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetDiagnosisResultRequest extends TeaModel {
    @NameInMap("X-Debug-Id")
    public String xDebugId;

    /**
     * <p>The diagnostic task ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>quzuYl23</p>
     */
    @NameInMap("task_id")
    public String taskId;

    @NameInMap("x-sysom-invoke-source")
    public String xSysomInvokeSource;

    public static GetDiagnosisResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDiagnosisResultRequest self = new GetDiagnosisResultRequest();
        return TeaModel.build(map, self);
    }

    public GetDiagnosisResultRequest setXDebugId(String xDebugId) {
        this.xDebugId = xDebugId;
        return this;
    }
    public String getXDebugId() {
        return this.xDebugId;
    }

    public GetDiagnosisResultRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public GetDiagnosisResultRequest setXSysomInvokeSource(String xSysomInvokeSource) {
        this.xSysomInvokeSource = xSysomInvokeSource;
        return this;
    }
    public String getXSysomInvokeSource() {
        return this.xSysomInvokeSource;
    }

}
