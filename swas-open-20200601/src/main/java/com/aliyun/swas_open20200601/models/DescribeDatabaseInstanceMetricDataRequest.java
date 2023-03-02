// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class DescribeDatabaseInstanceMetricDataRequest extends TeaModel {
    @NameInMap("DatabaseInstanceId")
    public String databaseInstanceId;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("MetricName")
    public String metricName;

    @NameInMap("RegionId")
    public String regionId;

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
