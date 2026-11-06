// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribePolarFsPerformanceRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/129857.html">DescribeDBClusters</a> operation to query the IDs of all Data Warehouse Edition clusters in the specified region.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>pc-*****************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The end time of the query. Specify the time in the ISO 8601 standard in the YYYY-MM-DDTHH:mm:ssZ format. The time must be in UTC and must not be earlier than the start time.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-10-07T03:04:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The sampling granularity of performance data, in seconds. The value must be a multiple of 60 and greater than 0. Default value: 60.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Interval")
    public String interval;

    /**
     * <p>The monitoring metric group. Valid values: Capacity (capacity), Inode (file nodes), Iops (read and write operations per second), Latency (read and write latency), QpsMeta (metadata operation requests), and Throughput (read and write throughput).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Capacity</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <p>The PolarFS instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pfs-2ze0i74ka607*****</p>
     */
    @NameInMap("PolarFsInstanceId")
    public String polarFsInstanceId;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The start time of the query. Specify the time in the ISO 8601 standard in the YYYY-MM-DDTHH:mm:ssZ format. The time must be in UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-10-07T02:04:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribePolarFsPerformanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePolarFsPerformanceRequest self = new DescribePolarFsPerformanceRequest();
        return TeaModel.build(map, self);
    }

    public DescribePolarFsPerformanceRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribePolarFsPerformanceRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribePolarFsPerformanceRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public DescribePolarFsPerformanceRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public DescribePolarFsPerformanceRequest setPolarFsInstanceId(String polarFsInstanceId) {
        this.polarFsInstanceId = polarFsInstanceId;
        return this;
    }
    public String getPolarFsInstanceId() {
        return this.polarFsInstanceId;
    }

    public DescribePolarFsPerformanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribePolarFsPerformanceRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
