// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class SearchTracesPageResult extends TeaModel {
    @NameInMap("traceInfos")
    public java.util.List<TraceInfo> traceInfos;

    public static SearchTracesPageResult build(java.util.Map<String, ?> map) throws Exception {
        SearchTracesPageResult self = new SearchTracesPageResult();
        return TeaModel.build(map, self);
    }

    public SearchTracesPageResult setTraceInfos(java.util.List<TraceInfo> traceInfos) {
        this.traceInfos = traceInfos;
        return this;
    }
    public java.util.List<TraceInfo> getTraceInfos() {
        return this.traceInfos;
    }

}
