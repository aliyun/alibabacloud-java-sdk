// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBProxyPerformanceRequest extends TeaModel {
    /**
     * <p>The ID of cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-****************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The ID of the endpoint.</p>
     * 
     * <strong>example:</strong>
     * <p>pe-****************</p>
     */
    @NameInMap("DBEndpointId")
    public String DBEndpointId;

    /**
     * <p>Database instance node ID.</p>
     * <blockquote>
     * <p>It is used to query the metrics of Proxy on different DB nodes, supporting metrics such as PolarProxy_DBConns, PolarProxy_DBQps, and PolarProxy_DBActionOps.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>pi-******************</p>
     */
    @NameInMap("DBNodeId")
    public String DBNodeId;

    /**
     * <p>The end of the time range to query. Specify the time in the <code>yyyy-MM-ddTHH:mmZ</code> format. The time must be in UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-09-24T02:08Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The interval at which performance data is collected. Valid values: 5, 30, 60, 600, 1800, 3600, 86400, in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Interval")
    public String interval;

    /**
     * <p>The performance metrics that you want to query. Separate multiple indicators with commas (,). For more information, see <a href="https://help.aliyun.com/document_detail/141787.html">Performance parameters</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PolarProxy_CpuUsage</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <p>The beginning of the time range to query. Specify the time in the <code>yyyy-MM-ddTHH:mmZ</code> format. The time must be in UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-09-23T01:01Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>Special metric. Set the value to tair, which indicates the PolarTair architecture.</p>
     * 
     * <strong>example:</strong>
     * <p>tair</p>
     */
    @NameInMap("Type")
    public String type;

    public static DescribeDBProxyPerformanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBProxyPerformanceRequest self = new DescribeDBProxyPerformanceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDBProxyPerformanceRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeDBProxyPerformanceRequest setDBEndpointId(String DBEndpointId) {
        this.DBEndpointId = DBEndpointId;
        return this;
    }
    public String getDBEndpointId() {
        return this.DBEndpointId;
    }

    public DescribeDBProxyPerformanceRequest setDBNodeId(String DBNodeId) {
        this.DBNodeId = DBNodeId;
        return this;
    }
    public String getDBNodeId() {
        return this.DBNodeId;
    }

    public DescribeDBProxyPerformanceRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDBProxyPerformanceRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public DescribeDBProxyPerformanceRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public DescribeDBProxyPerformanceRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeDBProxyPerformanceRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
