// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paielasticdatasetaccelerator20220801.models;

import com.aliyun.tea.*;

public class QueryInstanceMetricsShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SlotIDs: xxx</p>
     */
    @NameInMap("Dimensions")
    public String dimensionsShrink;

    /**
     * <strong>example:</strong>
     * <p>2020-11-08T16:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>StorageUsage</p>
     */
    @NameInMap("MetricType")
    public String metricType;

    /**
     * <strong>example:</strong>
     * <p>2020-11-08T15:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <strong>example:</strong>
     * <p>5m</p>
     */
    @NameInMap("TimeStep")
    public String timeStep;

    public static QueryInstanceMetricsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryInstanceMetricsShrinkRequest self = new QueryInstanceMetricsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryInstanceMetricsShrinkRequest setDimensionsShrink(String dimensionsShrink) {
        this.dimensionsShrink = dimensionsShrink;
        return this;
    }
    public String getDimensionsShrink() {
        return this.dimensionsShrink;
    }

    public QueryInstanceMetricsShrinkRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public QueryInstanceMetricsShrinkRequest setMetricType(String metricType) {
        this.metricType = metricType;
        return this;
    }
    public String getMetricType() {
        return this.metricType;
    }

    public QueryInstanceMetricsShrinkRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public QueryInstanceMetricsShrinkRequest setTimeStep(String timeStep) {
        this.timeStep = timeStep;
        return this;
    }
    public String getTimeStep() {
        return this.timeStep;
    }

}
