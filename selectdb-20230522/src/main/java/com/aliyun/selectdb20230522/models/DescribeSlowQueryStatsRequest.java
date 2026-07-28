// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class DescribeSlowQueryStatsRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>selectdb-cn-7213cjv****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The end time. Must be later than the start time. Defaults to the current time.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-04-08 16:00:00</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shenzhen</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The start time. Defaults to 24 hours before the current time.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-04-07 16:00:00</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The slow query threshold, in milliseconds. The default value is 5000.</p>
     * 
     * <strong>example:</strong>
     * <p>5000</p>
     */
    @NameInMap("ThresholdMs")
    public Long thresholdMs;

    /**
     * <p>The number of top slow queries to return. The default value is 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TopN")
    public Integer topN;

    public static DescribeSlowQueryStatsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlowQueryStatsRequest self = new DescribeSlowQueryStatsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSlowQueryStatsRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeSlowQueryStatsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeSlowQueryStatsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeSlowQueryStatsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeSlowQueryStatsRequest setThresholdMs(Long thresholdMs) {
        this.thresholdMs = thresholdMs;
        return this;
    }
    public Long getThresholdMs() {
        return this.thresholdMs;
    }

    public DescribeSlowQueryStatsRequest setTopN(Integer topN) {
        this.topN = topN;
        return this;
    }
    public Integer getTopN() {
        return this.topN;
    }

}
