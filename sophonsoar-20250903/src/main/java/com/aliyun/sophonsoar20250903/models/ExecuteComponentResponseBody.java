// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20250903.models;

import com.aliyun.tea.*;

public class ExecuteComponentResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>10B92EE1-4597-593B-A131-7A17D25EF5C9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
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

    public static ExecuteComponentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecuteComponentResponseBody self = new ExecuteComponentResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecuteComponentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecuteComponentResponseBody setRunResult(String runResult) {
        this.runResult = runResult;
        return this;
    }
    public String getRunResult() {
        return this.runResult;
    }

}
