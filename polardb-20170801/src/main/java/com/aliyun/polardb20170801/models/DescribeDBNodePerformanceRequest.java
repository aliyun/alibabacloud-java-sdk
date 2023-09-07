// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBNodePerformanceRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The ID of the cluster node.</p>
     */
    @NameInMap("DBNodeId")
    public String DBNodeId;

    /**
     * <p>The end of the time range to query. Specify the time in the ISO 8601 standard in the `yyyy-MM-ddTHH:mmZ` format. The time must be in UTC.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The performance metrics that you want to query. Separate multiple metrics with commas (,). For more information, see [Performance parameters](~~141787~~).</p>
     * <br>
     * <p>>  You can specify a maximum of five performance metrics.</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the `yyyy-MM-ddTHH:mmZ` format. The time must be in UTC.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDBNodePerformanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBNodePerformanceRequest self = new DescribeDBNodePerformanceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDBNodePerformanceRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeDBNodePerformanceRequest setDBNodeId(String DBNodeId) {
        this.DBNodeId = DBNodeId;
        return this;
    }
    public String getDBNodeId() {
        return this.DBNodeId;
    }

    public DescribeDBNodePerformanceRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDBNodePerformanceRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public DescribeDBNodePerformanceRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
