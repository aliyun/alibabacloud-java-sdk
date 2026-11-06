// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeAIDBClusterPerformanceRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/98094.html">describedbclusters</a> operation to view the details of all clusters under your account, such as the cluster ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-****************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The end time of the query. The end time must be later than the start time. The format is YYYY-MM-DDThh:mmZ (UTC).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-09-23T01:01:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>Specifies the time granularity of the monitoring data to retrieve. Valid values: <strong>60</strong> (minutes) and <strong>3600</strong> (hours).</p>
     * <ul>
     * <li><strong>Interval</strong>=<strong>60</strong>: You can query data for the last month at most. The maximum time span for a single query is 7 days.</li>
     * <li><strong>Interval</strong>=<strong>3600</strong>: You can query data for the last month at most. The maximum time span for a single query is 7 days.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Interval")
    public String interval;

    /**
     * <p>The name of the monitoring metric.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PolarDBAIModelCall</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <p>The start time of the query. The format is YYYY-MM-DDThh:mmZ (UTC).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-09-17T02:18:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeAIDBClusterPerformanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAIDBClusterPerformanceRequest self = new DescribeAIDBClusterPerformanceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAIDBClusterPerformanceRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeAIDBClusterPerformanceRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeAIDBClusterPerformanceRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public DescribeAIDBClusterPerformanceRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public DescribeAIDBClusterPerformanceRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
