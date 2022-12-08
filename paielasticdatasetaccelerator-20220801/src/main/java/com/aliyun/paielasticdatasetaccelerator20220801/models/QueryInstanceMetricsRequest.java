// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paielasticdatasetaccelerator20220801.models;

import com.aliyun.tea.*;

public class QueryInstanceMetricsRequest extends TeaModel {
    @NameInMap("Dimensions")
    public java.util.Map<String, ?> dimensions;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("MetricType")
    public String metricType;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("TimeStep")
    public String timeStep;

    public static QueryInstanceMetricsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryInstanceMetricsRequest self = new QueryInstanceMetricsRequest();
        return TeaModel.build(map, self);
    }

    public QueryInstanceMetricsRequest setDimensions(java.util.Map<String, ?> dimensions) {
        this.dimensions = dimensions;
        return this;
    }
    public java.util.Map<String, ?> getDimensions() {
        return this.dimensions;
    }

    public QueryInstanceMetricsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public QueryInstanceMetricsRequest setMetricType(String metricType) {
        this.metricType = metricType;
        return this;
    }
    public String getMetricType() {
        return this.metricType;
    }

    public QueryInstanceMetricsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public QueryInstanceMetricsRequest setTimeStep(String timeStep) {
        this.timeStep = timeStep;
        return this;
    }
    public String getTimeStep() {
        return this.timeStep;
    }

}
