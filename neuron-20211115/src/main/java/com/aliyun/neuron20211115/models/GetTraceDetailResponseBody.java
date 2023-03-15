// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class GetTraceDetailResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public TraceInfoDetailResult result;

    public static GetTraceDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTraceDetailResponseBody self = new GetTraceDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTraceDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTraceDetailResponseBody setResult(TraceInfoDetailResult result) {
        this.result = result;
        return this;
    }
    public TraceInfoDetailResult getResult() {
        return this.result;
    }

}
