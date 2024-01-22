// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListMetricsOutput extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("metrics")
    public java.util.Map<String, java.util.List<MetricInfo>> metrics;

    public static ListMetricsOutput build(java.util.Map<String, ?> map) throws Exception {
        ListMetricsOutput self = new ListMetricsOutput();
        return TeaModel.build(map, self);
    }

    public ListMetricsOutput setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMetricsOutput setMetrics(java.util.Map<String, java.util.List<MetricInfo>> metrics) {
        this.metrics = metrics;
        return this;
    }
    public java.util.Map<String, java.util.List<MetricInfo>> getMetrics() {
        return this.metrics;
    }

}
