// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetJobMetricsRequest extends TeaModel {
    // 截止时间
    @NameInMap("EndTime")
    public String endTime;

    // 指标类型
    @NameInMap("MetricType")
    public String metricType;

    // 起始时间
    @NameInMap("StartTime")
    public String startTime;

    // 时间间隔
    @NameInMap("TimeStep")
    public String timeStep;

    // Token
    @NameInMap("Token")
    public String token;

    public static GetJobMetricsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetJobMetricsRequest self = new GetJobMetricsRequest();
        return TeaModel.build(map, self);
    }

    public GetJobMetricsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetJobMetricsRequest setMetricType(String metricType) {
        this.metricType = metricType;
        return this;
    }
    public String getMetricType() {
        return this.metricType;
    }

    public GetJobMetricsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public GetJobMetricsRequest setTimeStep(String timeStep) {
        this.timeStep = timeStep;
        return this;
    }
    public String getTimeStep() {
        return this.timeStep;
    }

    public GetJobMetricsRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
