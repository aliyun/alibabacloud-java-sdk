// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class ListTrainingJobInstanceMetricsRequest extends TeaModel {
    /**
     * <p>The end UTC time in ISO 8601 format. If left empty, the current time is used.</p>
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
     * 
     * <strong>example:</strong>
     * <p>2020-11-08T16:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>trains930928remn-master-0</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The metric type. Valid values:</p>
     * <ul>
     * <li>GpuCoreUsage: POD GPU utilization.</li>
     * <li>GpuMemoryUsage: POD GPU memory utilization.</li>
     * <li>CpuCoreUsage: POD CPU utilization.</li>
     * <li>MemoryUsage: POD memory utilization.</li>
     * <li>NetworkInputRate: POD network write rate (TCP/IP) (MB/s).</li>
     * <li>NetworkOutputRate: POD network read rate (TCP/IP) (MB/s).</li>
     * <li>DiskReadRate: POD disk read rate (MB/s).</li>
     * <li>DiskWriteRate: POD disk write rate (MB/s).</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>GpuCoreUsage</p>
     */
    @NameInMap("MetricType")
    public String metricType;

    /**
     * <p>The start UTC time in ISO 8601 format. If left empty, the job start time is used.</p>
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
     * 
     * <strong>example:</strong>
     * <p>2020-11-08T16:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The metric collection interval. Valid values: 1h, 30m, 5m, and 10s. h indicates hours, m indicates minutes, and s indicates seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>10s</p>
     */
    @NameInMap("TimeStep")
    public String timeStep;

    public static ListTrainingJobInstanceMetricsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTrainingJobInstanceMetricsRequest self = new ListTrainingJobInstanceMetricsRequest();
        return TeaModel.build(map, self);
    }

    public ListTrainingJobInstanceMetricsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListTrainingJobInstanceMetricsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListTrainingJobInstanceMetricsRequest setMetricType(String metricType) {
        this.metricType = metricType;
        return this;
    }
    public String getMetricType() {
        return this.metricType;
    }

    public ListTrainingJobInstanceMetricsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListTrainingJobInstanceMetricsRequest setTimeStep(String timeStep) {
        this.timeStep = timeStep;
        return this;
    }
    public String getTimeStep() {
        return this.timeStep;
    }

}
