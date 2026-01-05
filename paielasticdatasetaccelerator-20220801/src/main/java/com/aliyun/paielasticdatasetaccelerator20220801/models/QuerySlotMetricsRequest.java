// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paielasticdatasetaccelerator20220801.models;

import com.aliyun.tea.*;

public class QuerySlotMetricsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SlotIDs: xxx</p>
     */
    @NameInMap("Dimensions")
    public java.util.Map<String, ?> dimensions;

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
     * <p>NetworkReceiveBytesPerSecond</p>
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

    public static QuerySlotMetricsRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySlotMetricsRequest self = new QuerySlotMetricsRequest();
        return TeaModel.build(map, self);
    }

    public QuerySlotMetricsRequest setDimensions(java.util.Map<String, ?> dimensions) {
        this.dimensions = dimensions;
        return this;
    }
    public java.util.Map<String, ?> getDimensions() {
        return this.dimensions;
    }

    public QuerySlotMetricsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public QuerySlotMetricsRequest setMetricType(String metricType) {
        this.metricType = metricType;
        return this;
    }
    public String getMetricType() {
        return this.metricType;
    }

    public QuerySlotMetricsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public QuerySlotMetricsRequest setTimeStep(String timeStep) {
        this.timeStep = timeStep;
        return this;
    }
    public String getTimeStep() {
        return this.timeStep;
    }

}
