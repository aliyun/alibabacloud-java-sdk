// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetJobMetricsRequest extends TeaModel {
    /**
     * <p>The end time of the time range to query monitoring data. The time is displayed in UTC. The default value is the current time.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-11-09T16:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The type of the monitoring metrics. Valid values:</p>
     * <ul>
     * <li>GpuCoreUsage: GPU utilization</li>
     * <li>GpuMemoryUsage: GPU memory utilization</li>
     * <li>CpuCoreUsage: CPU utilization</li>
     * <li>MemoryUsage: memory utilization</li>
     * <li>NetworkInputRate: the network write in rate.</li>
     * <li>NetworkOutputRate: the network write out rate</li>
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
     * <p>The beginning of the time range to query monitoring data. The time is displayed in UTC. The default value is the time 1 hour before the current time.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-11-08T16:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The interval at which monitoring data is returned. Default value: 5. Unit: minutes.</p>
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
