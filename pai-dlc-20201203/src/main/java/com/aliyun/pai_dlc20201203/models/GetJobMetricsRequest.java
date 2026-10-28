// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetJobMetricsRequest extends TeaModel {
    /**
     * <p>The end time of the time range for querying monitoring data, in UTC. Default value: the current time.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-11-09T16:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The metric type of the monitoring data to query. Valid values:</p>
     * <ul>
     * <li>GpuCoreUsage: the GPU usage</li>
     * <li>GpuMemoryUsage: the GPU memory usage</li>
     * <li>CpuCoreUsage: the CPU usage</li>
     * <li>MemoryUsage: the memory usage</li>
     * <li>NetworkInputRate: the network input rate</li>
     * <li>NetworkOutputRate: the network output rate</li>
     * <li>DiskReadRate: the disk read rate</li>
     * <li>DiskWriteRate: the disk write rate</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>GpuMemoryUsage</p>
     */
    @NameInMap("MetricType")
    public String metricType;

    /**
     * <p>The start time of the time range for querying monitoring data, in UTC. Default value: 1 hour ago.</p>
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
