// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeAgenticDBPerformanceRequest extends TeaModel {
    /**
     * <p>The alert aggregation method. Valid values vary by metric:</p>
     * <ul>
     * <li>Value: The value of the HTTP status code.</li>
     * <li>Average: The average HTTP wait time.</li>
     * <li>Value: The value of the Telnet status code.</li>
     * <li>TelnetLatency: The average Telnet wait time.</li>
     * <li>Average: The average ping packet loss rate.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Average</p>
     */
    @NameInMap("Aggregate")
    public Boolean aggregate;

    /**
     * <p>The anchor branch ID. If you do not specify this parameter, the main branch of the project is used by default.</p>
     * 
     * <strong>example:</strong>
     * <p>br-7g8h9i0j1k2l</p>
     */
    @NameInMap("BranchId")
    public String branchId;

    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-**************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The end time of the query. Specify the time in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time must be in UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-15T15:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The endpoint ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ep-3m4n5o6p7q8r</p>
     */
    @NameInMap("EndpointId")
    public String endpointId;

    /**
     * <p>The granularity of performance data. Valid values:</p>
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
     * <p>5</p>
     */
    @NameInMap("Interval")
    public String interval;

    /**
     * <p>The performance metrics to query. Separate multiple values with commas (,).
     * Note
     * You can specify up to 5 performance metrics.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PolarDBCPUForPCU,PolarDBPCU,PolarDBMemoryForPCU,PolarDBQPSTPS,PolarDBConnections</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <p>The start time of the query. Specify the time in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time must be in UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-05-01T00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeAgenticDBPerformanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAgenticDBPerformanceRequest self = new DescribeAgenticDBPerformanceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAgenticDBPerformanceRequest setAggregate(Boolean aggregate) {
        this.aggregate = aggregate;
        return this;
    }
    public Boolean getAggregate() {
        return this.aggregate;
    }

    public DescribeAgenticDBPerformanceRequest setBranchId(String branchId) {
        this.branchId = branchId;
        return this;
    }
    public String getBranchId() {
        return this.branchId;
    }

    public DescribeAgenticDBPerformanceRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeAgenticDBPerformanceRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeAgenticDBPerformanceRequest setEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }
    public String getEndpointId() {
        return this.endpointId;
    }

    public DescribeAgenticDBPerformanceRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public DescribeAgenticDBPerformanceRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public DescribeAgenticDBPerformanceRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
