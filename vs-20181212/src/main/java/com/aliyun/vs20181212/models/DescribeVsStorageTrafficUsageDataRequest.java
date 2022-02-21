// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeVsStorageTrafficUsageDataRequest extends TeaModel {
    @NameInMap("Bucket")
    public String bucket;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("Interval")
    public String interval;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SplitBy")
    public String splitBy;

    @NameInMap("StartTime")
    public String startTime;

    public static DescribeVsStorageTrafficUsageDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVsStorageTrafficUsageDataRequest self = new DescribeVsStorageTrafficUsageDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVsStorageTrafficUsageDataRequest setBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }
    public String getBucket() {
        return this.bucket;
    }

    public DescribeVsStorageTrafficUsageDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeVsStorageTrafficUsageDataRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public DescribeVsStorageTrafficUsageDataRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeVsStorageTrafficUsageDataRequest setSplitBy(String splitBy) {
        this.splitBy = splitBy;
        return this;
    }
    public String getSplitBy() {
        return this.splitBy;
    }

    public DescribeVsStorageTrafficUsageDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
