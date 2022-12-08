// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paielasticdatasetaccelerator20220801.models;

import com.aliyun.tea.*;

public class QuerySlotMetricsResponseBody extends TeaModel {
    @NameInMap("Metrics")
    public java.util.List<Metric> metrics;

    @NameInMap("Period")
    public String period;

    @NameInMap("RequestId")
    public String requestId;

    public static QuerySlotMetricsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySlotMetricsResponseBody self = new QuerySlotMetricsResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySlotMetricsResponseBody setMetrics(java.util.List<Metric> metrics) {
        this.metrics = metrics;
        return this;
    }
    public java.util.List<Metric> getMetrics() {
        return this.metrics;
    }

    public QuerySlotMetricsResponseBody setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public QuerySlotMetricsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
