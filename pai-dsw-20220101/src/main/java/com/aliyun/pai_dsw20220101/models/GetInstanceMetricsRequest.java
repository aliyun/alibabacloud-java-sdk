// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class GetInstanceMetricsRequest extends TeaModel {
    /**
     * <p>The end of the time range to query.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-11-08T15:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The metric type. Valid values:</p>
     * <ul>
     * <li>GpuCoreUsage: the GPU utilization.</li>
     * <li>GpuMemoryUsage: the GPU memory utilization.</li>
     * <li>CpuCoreUsage: the CPU utilization.</li>
     * <li>MemoryUsage: the memory utilization.</li>
     * <li>NetworkInputRate: the network ingress rate.</li>
     * <li>NetworkOutputRate: the network egress rate.</li>
     * <li>DiskReadRate: the disk read rate.</li>
     * <li>DiskWriteRate: the disk write rate.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>GpuCoreUsage</p>
     */
    @NameInMap("MetricType")
    public String metricType;

    /**
     * <p>The beginning of the time range to query.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-11-08T15:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The interval at which metrics are returned. Unit: minutes.</p>
     * 
     * <strong>example:</strong>
     * <p>15m</p>
     */
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
