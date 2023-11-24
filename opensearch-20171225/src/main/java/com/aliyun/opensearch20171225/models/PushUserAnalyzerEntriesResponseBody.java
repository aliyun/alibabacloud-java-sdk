// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class PushUserAnalyzerEntriesResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The result returned.</p>
     */
    @NameInMap("result")
    public java.util.Map<String, ?> result;

    public static PushUserAnalyzerEntriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PushUserAnalyzerEntriesResponseBody self = new PushUserAnalyzerEntriesResponseBody();
        return TeaModel.build(map, self);
    }

    public PushUserAnalyzerEntriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PushUserAnalyzerEntriesResponseBody setResult(java.util.Map<String, ?> result) {
        this.result = result;
        return this;
    }
    public java.util.Map<String, ?> getResult() {
        return this.result;
    }

}
