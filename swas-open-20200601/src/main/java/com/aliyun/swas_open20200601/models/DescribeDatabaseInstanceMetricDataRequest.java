// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class DescribeDatabaseInstanceMetricDataRequest extends TeaModel {
    /**
     * <p>The ID of the Simple Database Service instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>db-38263fa955774501a2ae1bdaed6f****</p>
     */
    @NameInMap("DatabaseInstanceId")
    public String databaseInstanceId;

    /**
     * <p>The end of the time range to query. Specify the time in the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddTHH:mmZ format. The time must be in UTC.</p>
     * <blockquote>
     * <p>The time displayed in the Simple Application Server console is in the format of UTC+8.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-09-07T04:04Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The name of the metric. Valid values:</p>
     * <ul>
     * <li>MySQL_MemCpuUsage: The CPU utilization and memory usage of the instance within the entire operating system.</li>
     * <li>MySQL_DetailedSpaceUsage: The total space usage, data space, log space, temporary space, and system space of the instance.</li>
     * <li>MySQL_Sessions : The total number of active connections.</li>
     * <li>MySQL_IOPS: The IOPS of the instance.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MySQL_MemCpuUsage</p>
     */
    @NameInMap("MetricName")
    public String metricName;

    /**
     * <p>The region ID of the Simple Database Service instance. You can call the <a href="https://help.aliyun.com/document_detail/189315.html">ListRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The beginning of the time range to query. Specify the time in the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddTHH:mmZ format. The time must be in UTC.</p>
     * <blockquote>
     * <p>The time displayed in the Simple Application Server console is in the format of UTC+8.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-09-06T04:04Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDatabaseInstanceMetricDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDatabaseInstanceMetricDataRequest self = new DescribeDatabaseInstanceMetricDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDatabaseInstanceMetricDataRequest setDatabaseInstanceId(String databaseInstanceId) {
        this.databaseInstanceId = databaseInstanceId;
        return this;
    }
    public String getDatabaseInstanceId() {
        return this.databaseInstanceId;
    }

    public DescribeDatabaseInstanceMetricDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDatabaseInstanceMetricDataRequest setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

    public DescribeDatabaseInstanceMetricDataRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDatabaseInstanceMetricDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
