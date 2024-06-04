// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class GetInstanceMetricsRequest extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("MetricType")
    public String metricType;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("TimeStep")
    public String timeStep;

    public static GetInstanceMetricsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceMetricsRequest self = new GetInstanceMetricsRequest();
        return TeaModel.build(map, self);
    }

    public GetInstanceMetricsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetInstanceMetricsRequest setMetricType(String metricType) {
        this.metricType = metricType;
        return this;
    }
    public String getMetricType() {
        return this.metricType;
    }

    public GetInstanceMetricsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public GetInstanceMetricsRequest setTimeStep(String timeStep) {
        this.timeStep = timeStep;
        return this;
    }
    public String getTimeStep() {
        return this.timeStep;
    }

}
