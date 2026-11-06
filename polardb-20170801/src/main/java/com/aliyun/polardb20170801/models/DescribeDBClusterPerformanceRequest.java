// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClusterPerformanceRequest extends TeaModel {
    /**
     * <p>The ID of the PolarDB cluster. Before you query performance data, the cluster must be in the Running state. You can call the DescribeDBClusters operation and check the DBClusterStatus parameter to confirm the cluster status.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-****************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The end time of the query. Specify the time in the <code>yyyy-MM-ddTHH:mmZ</code> format. The time must be in UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-09-23T01:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The data granularity of the performance data. Valid values:</p>
     * <ul>
     * <li>5</li>
     * <li>30</li>
     * <li>60</li>
     * <li>600</li>
     * <li>1800</li>
     * <li>3600</li>
     * <li>86400</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Interval")
    public String interval;

    /**
     * <p>The performance metrics to query. Separate multiple values with commas (,). For more information, see <a href="https://help.aliyun.com/document_detail/141787.html">Performance metrics</a>.</p>
     * <blockquote>
     * <p>You can specify up to 5 performance metrics.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PolarDBDiskUsage</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <p>The start time of the query. Specify the time in the <code>yyyy-MM-ddTHH:mmZ</code> format. The time must be in UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-09-23T01:01Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The name of the subgroup for the performance metrics. Specify this parameter only when the queried metrics contain a subgroup.</p>
     * 
     * <strong>example:</strong>
     * <p>example-name</p>
     */
    @NameInMap("SubGroupName")
    public String subGroupName;

    /**
     * <p>The query type.</p>
     * 
     * <strong>example:</strong>
     * <p>orca</p>
     */
    @NameInMap("Type")
    public String type;

    public static DescribeDBClusterPerformanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterPerformanceRequest self = new DescribeDBClusterPerformanceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterPerformanceRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeDBClusterPerformanceRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDBClusterPerformanceRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public DescribeDBClusterPerformanceRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public DescribeDBClusterPerformanceRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeDBClusterPerformanceRequest setSubGroupName(String subGroupName) {
        this.subGroupName = subGroupName;
        return this;
    }
    public String getSubGroupName() {
        return this.subGroupName;
    }

    public DescribeDBClusterPerformanceRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
