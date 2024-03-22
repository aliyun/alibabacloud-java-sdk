// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class RunPython3ScriptResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The execution result of the Python3 script.</p>
     */
    @NameInMap("RunResult")
    public String runResult;

    public static RunPython3ScriptResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunPython3ScriptResponseBody self = new RunPython3ScriptResponseBody();
        return TeaModel.build(map, self);
    }

    public RunPython3ScriptResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RunPython3ScriptResponseBody setRunResult(String runResult) {
        this.runResult = runResult;
        return this;
    }
    public String getRunResult() {
        return this.runResult;
    }

}
