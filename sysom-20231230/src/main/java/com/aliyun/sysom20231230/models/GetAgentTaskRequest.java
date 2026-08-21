// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetAgentTaskRequest extends TeaModel {
    @NameInMap("X-Debug-Id")
    public String xDebugId;

    /**
     * <p>The task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>42172120177e4b3abd6fabb3a6b5e2dd</p>
     */
    @NameInMap("task_id")
    public String taskId;

    @NameInMap("x-sysom-invoke-source")
    public String xSysomInvokeSource;

    public static GetAgentTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAgentTaskRequest self = new GetAgentTaskRequest();
        return TeaModel.build(map, self);
    }

    public GetAgentTaskRequest setXDebugId(String xDebugId) {
        this.xDebugId = xDebugId;
        return this;
    }
    public String getXDebugId() {
        return this.xDebugId;
    }

    public GetAgentTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public GetAgentTaskRequest setXSysomInvokeSource(String xSysomInvokeSource) {
        this.xSysomInvokeSource = xSysomInvokeSource;
        return this;
    }
    public String getXSysomInvokeSource() {
        return this.xSysomInvokeSource;
    }

}
