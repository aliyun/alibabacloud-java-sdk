// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class SearchTracesByPageResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("traceInfos")
    public java.util.List<TraceInfo> traceInfos;

    public static SearchTracesByPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchTracesByPageResponseBody self = new SearchTracesByPageResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchTracesByPageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchTracesByPageResponseBody setTraceInfos(java.util.List<TraceInfo> traceInfos) {
        this.traceInfos = traceInfos;
        return this;
    }
    public java.util.List<TraceInfo> getTraceInfos() {
        return this.traceInfos;
    }

}
