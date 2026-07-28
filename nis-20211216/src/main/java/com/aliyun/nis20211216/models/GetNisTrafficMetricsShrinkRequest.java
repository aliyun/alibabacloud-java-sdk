// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class GetNisTrafficMetricsShrinkRequest extends TeaModel {
    /**
     * <p>The start timestamp, in milliseconds. If not specified, the most recent 1 hour is queried by default.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1638239092000</p>
     */
    @NameInMap("BeginTime")
    public Long beginTime;

    /**
     * <p>The network traffic direction based on Alibaba Cloud resources.</p>
     * <p>In: traffic flowing into the target resource.
     * Out: traffic flowing out of the target resource.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>In</p>
     */
    @NameInMap("Direction")
    public String direction;

    /**
     * <p>The end timestamp, in milliseconds. If not specified, the most recent 1 hour is queried by default. If only BeginTime is specified, the 1 hour after BeginTime is queried.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1684373700099</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>Specifies additional filter conditions for the traffic to perform focused network traffic analysis.</p>
     */
    @NameInMap("Filter")
    public String filterShrink;

    /**
     * <p>In VPC scenarios, this parameter specifies the paging size. In TR and Internet Shared Bandwidth scenarios, this parameter specifies the SQL query limit. If not specified, the backend defaults to 1440.</p>
     * 
     * <strong>example:</strong>
     * <p>1440</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The metric name.
     * Common parameters supported in network traffic analysis scenarios:
     *   bps: bits per second.
     *   pps: packets per second.
     * Parameters specific to the Internet scenario:
     *   rtt: round-trip time when establishing a TCP protocol connection.
     *   RetransmitRate: retransmission rate.
     * Parameters specific to the area-level bandwidth scenario:
     *   RatelimitDropPps: rate of packet loss due to rate limiting.
     *   BandwidthUtilization: bandwidth utilization.
     * Parameters specific to the NAT scenario:
     *   ActiveSessionCount: number of concurrent sessions.
     *   NewSessionPerSecond: number of new sessions per second.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bps</p>
     */
    @NameInMap("MetricName")
    public String metricName;

    /**
     * <p>The token for the next query. You do not need to specify this parameter for the first query or when no more results exist. If a next page exists, set this parameter to the NextToken value returned by the previous API invoke. This parameter is valid only in VPC scenarios. TR and Internet Shared Bandwidth scenarios do not use this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>f7zUd3gArYj/xjPttJo5L5dK0R+gSbfHElLqi8C2IPWMQxtV8XckOg5lk7F2bhC+</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionNo")
    public String regionNo;

    /**
     * <p>The sort order. Valid values:
     * TimestampAscending: sorts by time in ascending order.
     * TimestampDescending: sorts by time in descending order.</p>
     * 
     * <strong>example:</strong>
     * <p>TimestampAscending</p>
     */
    @NameInMap("ScanBy")
    public String scanBy;

    /**
     * <p>The aggregation step for time series data, in minutes. The final query granularity is the larger value between StepMinutes and the underlying storage granularity. The number of data points calculated by (EndTime-BeginTime)/StepMinutes cannot exceed 1440.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("StepMinutes")
    public Integer stepMinutes;

    /**
     * <p>The storage bucket precision property.</p>
     * <p>The storage bucket precision specifies the storage aggregation epoch to query. Two precision levels are supported: high precision (such as 1 minute) or long epoch (such as 1 day). The specific precision is determined by the network traffic analysis sampling interval configured for high-precision traffic statistics or long-epoch traffic statistics when creating or editing the network traffic analysis analyzer.</p>
     * <ul>
     * <li><p>The storage precisions active for the corresponding tuples of the network traffic analysis analyzer are:</p>
     * <ul>
     * <li><code>1</code>: in minutes (1 minute)</li>
     * <li><code>10</code>: in minutes (10 minutes)</li>
     * <li><code>60</code>: in minutes (60 minutes, i.e., 1 hour)</li>
     * <li><code>1440</code>: in minutes (1440 minutes, i.e., 1 day)</li>
     * </ul>
     * </li>
     * <li><p>The storage bucket precision can be used for two typical purposes:</p>
     * <ul>
     * <li>High-precision traffic statistics: such as 1-minute, 10-minute, or 60-minute aggregation</li>
     * <li>Long-epoch traffic statistics: such as 1440-minute (1-day) aggregation</li>
     * </ul>
     * </li>
     * <li><p>Specify a value for this field during the query to select the storage aggregation epoch. For example:</p>
     * <ul>
     * <li>Pass <code>10</code>: queries short-epoch data with a 10-minute aggregation granularity</li>
     * <li>Pass <code>1440</code>: queries long-epoch data with a 1-day aggregation granularity</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("StorageInterval")
    public Integer storageInterval;

    /**
     * <p>The ID of the network traffic analysis analyzer.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>nta-e093cb80c7c047afbd1d</p>
     */
    @NameInMap("TrafficAnalyzerId")
    public String trafficAnalyzerId;

    /**
     * <p>The supported analysis scenarios: </p>
     * <ul>
     * <li>All VPC flow log analysis</li>
     * <li>Internet VPC flow log analysis</li>
     * <li>All TR flow log analysis</li>
     * <li>Internet Shared Bandwidth metric analysis</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>VpcFlowLogAll</p>
     */
    @NameInMap("TrafficScenario")
    public String trafficScenario;

    /**
     * <p>The traffic storage aggregation dimension.</p>
     * <p>Based on the TrafficScenario:</p>
     * <ul>
     * <li><p>VpcFlowLogAll/VpcFlowLog: required. Specifies the storage aggregation view to query, which corresponds to the storage aggregation property configured in the network traffic analysis analyzer.</p>
     * </li>
     * <li><p>TRFlowLog/CbwpMetric: optional. Automatically adapts based on the storage aggregation property of the network traffic analysis analyzer.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Tuple2</p>
     */
    @NameInMap("TupleDimension")
    public String tupleDimension;

    public static GetNisTrafficMetricsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetNisTrafficMetricsShrinkRequest self = new GetNisTrafficMetricsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetNisTrafficMetricsShrinkRequest setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Long getBeginTime() {
        return this.beginTime;
    }

    public GetNisTrafficMetricsShrinkRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public GetNisTrafficMetricsShrinkRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetNisTrafficMetricsShrinkRequest setFilterShrink(String filterShrink) {
        this.filterShrink = filterShrink;
        return this;
    }
    public String getFilterShrink() {
        return this.filterShrink;
    }

    public GetNisTrafficMetricsShrinkRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public GetNisTrafficMetricsShrinkRequest setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

    public GetNisTrafficMetricsShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public GetNisTrafficMetricsShrinkRequest setRegionNo(String regionNo) {
        this.regionNo = regionNo;
        return this;
    }
    public String getRegionNo() {
        return this.regionNo;
    }

    public GetNisTrafficMetricsShrinkRequest setScanBy(String scanBy) {
        this.scanBy = scanBy;
        return this;
    }
    public String getScanBy() {
        return this.scanBy;
    }

    public GetNisTrafficMetricsShrinkRequest setStepMinutes(Integer stepMinutes) {
        this.stepMinutes = stepMinutes;
        return this;
    }
    public Integer getStepMinutes() {
        return this.stepMinutes;
    }

    public GetNisTrafficMetricsShrinkRequest setStorageInterval(Integer storageInterval) {
        this.storageInterval = storageInterval;
        return this;
    }
    public Integer getStorageInterval() {
        return this.storageInterval;
    }

    public GetNisTrafficMetricsShrinkRequest setTrafficAnalyzerId(String trafficAnalyzerId) {
        this.trafficAnalyzerId = trafficAnalyzerId;
        return this;
    }
    public String getTrafficAnalyzerId() {
        return this.trafficAnalyzerId;
    }

    public GetNisTrafficMetricsShrinkRequest setTrafficScenario(String trafficScenario) {
        this.trafficScenario = trafficScenario;
        return this;
    }
    public String getTrafficScenario() {
        return this.trafficScenario;
    }

    public GetNisTrafficMetricsShrinkRequest setTupleDimension(String tupleDimension) {
        this.tupleDimension = tupleDimension;
        return this;
    }
    public String getTupleDimension() {
        return this.tupleDimension;
    }

}
