// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class StartDebugExecutionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>exec-xxx</p>
     */
    @NameInMap("ExecutionId")
    public String executionId;

    /**
     * <strong>example:</strong>
     * <p>A5320F1D-92D9-44BB-A416-5FC525ED6D57</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static StartDebugExecutionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartDebugExecutionResponseBody self = new StartDebugExecutionResponseBody();
        return TeaModel.build(map, self);
    }

    public StartDebugExecutionResponseBody setExecutionId(String executionId) {
        this.executionId = executionId;
        return this;
    }
    public String getExecutionId() {
        return this.executionId;
    }

    public StartDebugExecutionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
