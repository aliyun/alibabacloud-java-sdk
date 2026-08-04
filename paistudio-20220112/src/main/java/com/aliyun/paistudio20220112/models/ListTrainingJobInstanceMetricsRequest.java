// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class ListTrainingJobInstanceMetricsRequest extends TeaModel {
    /**
     * <p>End time in UTC, in ISO 8601 format. If empty, use the current time.</p>
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
     * 
     * <strong>example:</strong>
     * <p>2020-11-08T16:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>Instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>trains930928remn-master-0</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Metric type:</p>
     * <ul>
     * <li><p>GpuCoreUsage: POD GPU usage</p>
     * </li>
     * <li><p>GpuMemoryUsage: POD GPU memory usage</p>
     * </li>
     * <li><p>CpuCoreUsage: POD CPU usage</p>
     * </li>
     * <li><p>MemoryUsage: POD memory usage</p>
     * </li>
     * <li><p>NetworkInputRate: POD network input rate (TCP/IP) (MB/s)</p>
     * </li>
     * <li><p>NetworkOutputRate: POD network output rate (TCP/IP) (MB/s)</p>
     * </li>
     * <li><p>DiskReadRate: POD disk read rate (MB/s)</p>
     * </li>
     * <li><p>DiskWriteRate: POD disk write rate (MB/s)</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>GpuCoreUsage</p>
     */
    @NameInMap("MetricType")
    public String metricType;

    /**
     * <p>Start time in UTC, in ISO 8601 format. If empty, use the job start time.</p>
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
     * 
     * <strong>example:</strong>
     * <p>2020-11-08T16:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>Time interval. Valid values: 1h, 30m, 5m, 10s.</p>
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
