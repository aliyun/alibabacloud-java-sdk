// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class DescribeDatabaseInstanceMetricDataRequest extends TeaModel {
    /**
     * <p>The ID of the Simple Database Service instance.</p>
     */
    @NameInMap("DatabaseInstanceId")
    public String databaseInstanceId;

    /**
     * <p>The end of the time range to query. Specify the time in the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mmZ format. The time must be in UTC.</p>
     * <br>
     * <p>> The time displayed in the Simple Application Server console is in the format of UTC+8.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The name of the metric. Valid values:</p>
     * <br>
     * <p>*   MySQL_MemCpuUsage: The CPU utilization and memory usage of the instance within the entire operating system.</p>
     * <p>*   MySQL_DetailedSpaceUsage: The total space usage, data space, log space, temporary space, and system space of the instance.</p>
     * <p>*   MySQL_Sessions : The total number of active connections.</p>
     * <p>*   MySQL_IOPS: The IOPS of the instance.</p>
     */
    @NameInMap("MetricName")
    public String metricName;

    /**
     * <p>The region ID of the Simple Database Service instance. You can call the [ListRegions](~~189315~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The beginning of the time range to query. Specify the time in the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mmZ format. The time must be in UTC.</p>
     * <br>
     * <p>> The time displayed in the Simple Application Server console is in the format of UTC+8.</p>
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
