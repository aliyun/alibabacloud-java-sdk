// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class RunPython3ScriptResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F210521C-D9BF-5264-8369-83EDDC617DB0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The execution result of the Python3 script.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;requestUuid&quot;: &quot;fe240b98-27b1-4a36-aec1-550b894318d9&quot;,
     *     &quot;content&quot;: {
     *         &quot;resultData&quot;: [],
     *         &quot;success&quot;: true
     *     }
     * }</p>
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
