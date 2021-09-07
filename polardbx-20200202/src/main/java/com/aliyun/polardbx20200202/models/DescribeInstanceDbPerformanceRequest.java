// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeInstanceDbPerformanceRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("DbInstanceName")
    public String dbInstanceName;

    @NameInMap("Keys")
    public String keys;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("DbName")
    public String dbName;

    public static DescribeInstanceDbPerformanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceDbPerformanceRequest self = new DescribeInstanceDbPerformanceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceDbPerformanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeInstanceDbPerformanceRequest setDbInstanceName(String dbInstanceName) {
        this.dbInstanceName = dbInstanceName;
        return this;
    }
    public String getDbInstanceName() {
        return this.dbInstanceName;
    }

    public DescribeInstanceDbPerformanceRequest setKeys(String keys) {
        this.keys = keys;
        return this;
    }
    public String getKeys() {
        return this.keys;
    }

    public DescribeInstanceDbPerformanceRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeInstanceDbPerformanceRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeInstanceDbPerformanceRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

}
