// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paielasticdatasetaccelerator20220801.models;

import com.aliyun.tea.*;

public class QueryInstanceMetricsResponseBody extends TeaModel {
    @NameInMap("Metrics")
    public java.util.List<Metric> metrics;

    @NameInMap("Period")
    public String period;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryInstanceMetricsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryInstanceMetricsResponseBody self = new QueryInstanceMetricsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryInstanceMetricsResponseBody setMetrics(java.util.List<Metric> metrics) {
        this.metrics = metrics;
        return this;
    }
    public java.util.List<Metric> getMetrics() {
        return this.metrics;
    }

    public QueryInstanceMetricsResponseBody setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public QueryInstanceMetricsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
