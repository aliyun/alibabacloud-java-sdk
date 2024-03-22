// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescriberPython3ScriptLogsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The operational logs of the Python3 script.</p>
     */
    @NameInMap("RunResult")
    public String runResult;

    public static DescriberPython3ScriptLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescriberPython3ScriptLogsResponseBody self = new DescriberPython3ScriptLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescriberPython3ScriptLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescriberPython3ScriptLogsResponseBody setRunResult(String runResult) {
        this.runResult = runResult;
        return this;
    }
    public String getRunResult() {
        return this.runResult;
    }

}
