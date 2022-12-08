// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paielasticdatasetaccelerator20220801.models;

import com.aliyun.tea.*;

public class QuerySlotMetricsShrinkRequest extends TeaModel {
    @NameInMap("Dimensions")
    public String dimensionsShrink;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("MetricType")
    public String metricType;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("TimeStep")
    public String timeStep;

    public static QuerySlotMetricsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySlotMetricsShrinkRequest self = new QuerySlotMetricsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QuerySlotMetricsShrinkRequest setDimensionsShrink(String dimensionsShrink) {
        this.dimensionsShrink = dimensionsShrink;
        return this;
    }
    public String getDimensionsShrink() {
        return this.dimensionsShrink;
    }

    public QuerySlotMetricsShrinkRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public QuerySlotMetricsShrinkRequest setMetricType(String metricType) {
        this.metricType = metricType;
        return this;
    }
    public String getMetricType() {
        return this.metricType;
    }

    public QuerySlotMetricsShrinkRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public QuerySlotMetricsShrinkRequest setTimeStep(String timeStep) {
        this.timeStep = timeStep;
        return this;
    }
    public String getTimeStep() {
        return this.timeStep;
    }

}
