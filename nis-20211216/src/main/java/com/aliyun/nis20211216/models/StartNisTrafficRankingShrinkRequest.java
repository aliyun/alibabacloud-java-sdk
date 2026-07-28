// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class StartNisTrafficRankingShrinkRequest extends TeaModel {
    /**
     * <p>The start timestamp of the query, in milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1638239092000</p>
     */
    @NameInMap("BeginTime")
    public Long beginTime;

    /**
     * <p>The network traffic direction based on Alibaba Cloud resources.</p>
     * <p>In: Traffic flowing into the target resource.
     * Out: Traffic flowing out of the target resource.</p>
     * <ul>
     * <li><p>VPC flow log scenario (<code>TraffficScenario = VpcFlowLogAll</code> / <code>VpcFlowLogInternet</code>):</p>
     * <ul>
     * <li>In: Traffic flowing into the ENI.</li>
     * <li>Out: Traffic flowing out of the ENI.</li>
     * </ul>
     * </li>
     * <li><p>TR flow log scenario (<code>TraffficScenario = TRFlowlog</code>):</p>
     * <ul>
     * <li>In: Traffic flowing into the TR.</li>
     * <li>Out: Traffic flowing out of the TR.</li>
     * </ul>
     * </li>
     * <li><p>Internet Shared Bandwidth metric analysis scenario (<code>TraffficScenario = CbwpMetric</code>):</p>
     * <ul>
     * <li>In: Traffic flowing into the EIP.</li>
     * <li>Out: Traffic flowing out of the EIP.</li>
     * </ul>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Out</p>
     */
    @NameInMap("Direction")
    public String direction;

    /**
     * <p>The end timestamp of the query, in milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1684373700099</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>Specifies additional filter conditions for focused network traffic analysis.</p>
     */
    @NameInMap("Filter")
    public String filterShrink;

    /**
     * <p>Specifies multiple traffic dimensions for aggregation and sorting.</p>
     */
    @NameInMap("GroupBy")
    public String groupByShrink;

    /**
     * <p>The language. Valid values: zh-CN, en-US.</p>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>The page size. Valid values: 1 to 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token for the next query. Leave this parameter empty for the first query or when no more results are available. If a next query exists, set this value to the NextToken value returned by the previous API call.</p>
     * 
     * <strong>example:</strong>
     * <p>2A07PfBPlzmmNi/75Qca9SK73UfY48/+WBiREjfVfXqMQxtV8XckOg5lk7F2bhC+</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Based on the <code>TrafficScenario</code> field, the following metrics are supported for ranking traffic:</p>
     * <ul>
     * <li><p><code>TrafficScenario = VpcFlowLogAll</code> / <code>VpcFlowLogInternet</code> (VPC flow log scenario):</p>
     * <ul>
     * <li><code>Bytes</code>: Bandwidth</li>
     * <li><code>Packets</code>: Packets</li>
     * <li><code>RoundTripTime</code>: TCP RTT</li>
     * </ul>
     * </li>
     * <li><p><code>TrafficScenario = TRFlowlog</code> (TR flow log scenario):</p>
     * <ul>
     * <li><code>Bytes</code>: Bandwidth</li>
     * <li><code>Packets</code>: Packets</li>
     * <li><code>PacketsLostNoRoute</code>: Packet loss due to no routing</li>
     * <li><code>PacketsLostBlackhole</code>: Packet loss due to blackhole routing</li>
     * <li><code>PacketsLostTTLExpired</code>: Packet loss due to TTL timeout</li>
     * <li><code>BytesIncrease</code>: Bandwidth increase</li>
     * <li><code>BytesIncreaseRatio</code>: Bandwidth increase ratio</li>
     * </ul>
     * </li>
     * <li><p><code>TrafficScenario = CbwpMetric</code> (Internet Shared Bandwidth metric analysis scenario):</p>
     * <ul>
     * <li><code>Bytes</code>: Bandwidth</li>
     * <li><code>Packets</code>: Packets</li>
     * </ul>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Bytes</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The region where the resource resides.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionNo")
    public String regionNo;

    /**
     * <p>The sorting method for network traffic analysis. Valid values:</p>
     * <ul>
     * <li>ASC: Sorts in ascending order.</li>
     * <li>DESC: Sorts in descending order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Desc</p>
     */
    @NameInMap("Sort")
    public String sort;

    /**
     * <p>The storage bucket precision property.</p>
     * <p>The storage bucket precision specifies the storage aggregation epoch to query. Two precision levels are supported: high precision (such as 1 minute) and long epoch (such as 1 day). The specific precision is determined by the network traffic analysis sampling interval configured for high-precision traffic statistics or long-epoch traffic statistics when creating or editing the network traffic analysis instance.</p>
     * <ul>
     * <li><p>The storage precision supported by the corresponding tuple of the network traffic analysis instance:</p>
     * <ul>
     * <li><code>1</code>: In minutes (1 minute)</li>
     * <li><code>10</code>: In minutes (10 minutes)</li>
     * <li><code>60</code>: In minutes (60 minutes, or 1 hour)</li>
     * <li><code>1440</code>: In minutes (1440 minutes, or 1 day)</li>
     * </ul>
     * </li>
     * <li><p>The storage bucket precision can be used for two typical purposes:</p>
     * <ul>
     * <li>High-precision traffic statistics: Aggregation at 1-minute, 10-minute, or 60-minute intervals.</li>
     * <li>Long-epoch traffic statistics: Aggregation at 1440-minute (1-day) intervals.</li>
     * </ul>
     * </li>
     * <li><p>Pass a value for this field during the query to specify the storage aggregation epoch. For example:</p>
     * <ul>
     * <li>Pass <code>10</code>: Queries short-epoch data aggregated at 10-minute granularity.</li>
     * <li>Pass <code>1440</code>: Queries long-epoch data aggregated at 1-day granularity.</li>
     * </ul>
     * </li>
     * </ul>
     * <p>Note: The active storage precision values depend on the configuration of the network traffic analysis instance.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("StorageInterval")
    public Integer storageInterval;

    /**
     * <p>The number of entries for the network traffic analysis sorting query.</p>
     * <p>You can specify a custom number. If this field is not specified, all traffic data that meets the specified conditions is sorted and analyzed within the performance capacity of the network traffic analysis feature.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TopN")
    public Integer topN;

    /**
     * <p>The ID of the network traffic analysis instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>nta-262****ca07f</p>
     */
    @NameInMap("TrafficAnalyzerId")
    public String trafficAnalyzerId;

    /**
     * <p>Supported analysis scenarios: </p>
     * <ul>
     * <li>All VPC flow log analysis</li>
     * <li>Public VPC flow log analysis</li>
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
     * <p>The storage aggregation dimension of the network traffic analysis instance.</p>
     * <p>Based on the TraffficScenario:</p>
     * <ul>
     * <li><p>VpcFlowLogAll/VpcFlowLog: Required. Specifies the storage aggregation view to query, which corresponds to the storage aggregation property configured in the network traffic analysis instance.</p>
     * </li>
     * <li><p>TRFlowLog/CbwpMetric: Optional. Automatically adapts based on the storage aggregation property of the network traffic analysis instance.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Tuple1</p>
     */
    @NameInMap("TupleDimension")
    public String tupleDimension;

    public static StartNisTrafficRankingShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        StartNisTrafficRankingShrinkRequest self = new StartNisTrafficRankingShrinkRequest();
        return TeaModel.build(map, self);
    }

    public StartNisTrafficRankingShrinkRequest setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Long getBeginTime() {
        return this.beginTime;
    }

    public StartNisTrafficRankingShrinkRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public StartNisTrafficRankingShrinkRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public StartNisTrafficRankingShrinkRequest setFilterShrink(String filterShrink) {
        this.filterShrink = filterShrink;
        return this;
    }
    public String getFilterShrink() {
        return this.filterShrink;
    }

    public StartNisTrafficRankingShrinkRequest setGroupByShrink(String groupByShrink) {
        this.groupByShrink = groupByShrink;
        return this;
    }
    public String getGroupByShrink() {
        return this.groupByShrink;
    }

    public StartNisTrafficRankingShrinkRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public StartNisTrafficRankingShrinkRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public StartNisTrafficRankingShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public StartNisTrafficRankingShrinkRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public StartNisTrafficRankingShrinkRequest setRegionNo(String regionNo) {
        this.regionNo = regionNo;
        return this;
    }
    public String getRegionNo() {
        return this.regionNo;
    }

    public StartNisTrafficRankingShrinkRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

    public StartNisTrafficRankingShrinkRequest setStorageInterval(Integer storageInterval) {
        this.storageInterval = storageInterval;
        return this;
    }
    public Integer getStorageInterval() {
        return this.storageInterval;
    }

    public StartNisTrafficRankingShrinkRequest setTopN(Integer topN) {
        this.topN = topN;
        return this;
    }
    public Integer getTopN() {
        return this.topN;
    }

    public StartNisTrafficRankingShrinkRequest setTrafficAnalyzerId(String trafficAnalyzerId) {
        this.trafficAnalyzerId = trafficAnalyzerId;
        return this;
    }
    public String getTrafficAnalyzerId() {
        return this.trafficAnalyzerId;
    }

    public StartNisTrafficRankingShrinkRequest setTrafficScenario(String trafficScenario) {
        this.trafficScenario = trafficScenario;
        return this;
    }
    public String getTrafficScenario() {
        return this.trafficScenario;
    }

    public StartNisTrafficRankingShrinkRequest setTupleDimension(String tupleDimension) {
        this.tupleDimension = tupleDimension;
        return this;
    }
    public String getTupleDimension() {
        return this.tupleDimension;
    }

}
