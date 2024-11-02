// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescriberPython3ScriptLogsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D22D8A0C-6E86-57B2-A142-929184122AB1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The operational logs of the Python3 script.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;logs&quot;: [
     *         {
     *             &quot;message&quot;: &quot;function input is {}&quot;
     *         }
     *     ]
     * }</p>
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
