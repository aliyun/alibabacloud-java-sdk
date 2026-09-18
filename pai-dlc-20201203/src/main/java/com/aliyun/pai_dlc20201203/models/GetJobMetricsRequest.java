// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetJobMetricsRequest extends TeaModel {
    /**
     * <p>The end time (UTC) of the time range for querying monitoring data. Default value: the current time.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-11-09T16:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The metric type of the monitoring data to query. Valid values:</p>
     * <ul>
     * <li><p>GpuCoreUsage: GPU utilization.</p>
     * </li>
     * <li><p>GpuMemoryUsage: GPU memory usage.</p>
     * </li>
     * <li><p>CpuCoreUsage: CPU utilization.</p>
     * </li>
     * <li><p>MemoryUsage: memory usage.</p>
     * </li>
     * <li><p>NetworkInputRate: network input rate.</p>
     * </li>
     * <li><p>NetworkOutputRate: network output rate.</p>
     * </li>
     * <li><p>DiskReadRate: disk read rate.</p>
     * </li>
     * <li><p>DiskWriteRate: disk write rate.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>GpuMemoryUsage</p>
     */
    @NameInMap("MetricType")
    public String metricType;

    /**
     * <p>The start time (UTC) of the time range for querying monitoring data. Default value: one hour before the current time.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-11-08T16:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The time interval at which monitoring data is returned. Default value: 5 minutes.</p>
     * 
     * <strong>example:</strong>
     * <p>5m</p>
     */
    @NameInMap("TimeStep")
    public String timeStep;

    /**
     * <p>The temporary token used for authentication.</p>
     * 
     * <strong>example:</strong>
     * <p>eyXXXX-XXXX.XXXXX</p>
     */
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
