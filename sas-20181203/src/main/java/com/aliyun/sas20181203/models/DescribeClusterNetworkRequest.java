// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeClusterNetworkRequest extends TeaModel {
    /**
     * <p>The end timestamp of the query. Unit: milliseconds.</p>
     * <br>
     * <p>> The days between the start timestamp and the end timestamp cannot exceed **seven** days.</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The start timestamp of the query. Unit: milliseconds.</p>
     * <br>
     * <p>> The days between the start timestamp and the end timestamp cannot exceed **seven** days.</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static DescribeClusterNetworkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterNetworkRequest self = new DescribeClusterNetworkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeClusterNetworkRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeClusterNetworkRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
