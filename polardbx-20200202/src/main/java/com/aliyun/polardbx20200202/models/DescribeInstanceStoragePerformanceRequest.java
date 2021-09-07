// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeInstanceStoragePerformanceRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("DbInstanceName")
    public String dbInstanceName;

    @NameInMap("StorageInstanceId")
    public String storageInstanceId;

    @NameInMap("Keys")
    public String keys;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    public static DescribeInstanceStoragePerformanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceStoragePerformanceRequest self = new DescribeInstanceStoragePerformanceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceStoragePerformanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeInstanceStoragePerformanceRequest setDbInstanceName(String dbInstanceName) {
        this.dbInstanceName = dbInstanceName;
        return this;
    }
    public String getDbInstanceName() {
        return this.dbInstanceName;
    }

    public DescribeInstanceStoragePerformanceRequest setStorageInstanceId(String storageInstanceId) {
        this.storageInstanceId = storageInstanceId;
        return this;
    }
    public String getStorageInstanceId() {
        return this.storageInstanceId;
    }

    public DescribeInstanceStoragePerformanceRequest setKeys(String keys) {
        this.keys = keys;
        return this;
    }
    public String getKeys() {
        return this.keys;
    }

    public DescribeInstanceStoragePerformanceRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeInstanceStoragePerformanceRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

}
