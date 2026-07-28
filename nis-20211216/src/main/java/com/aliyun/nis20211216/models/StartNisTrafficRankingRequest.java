// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class StartNisTrafficRankingRequest extends TeaModel {
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
    public java.util.List<StartNisTrafficRankingRequestFilter> filter;

    /**
     * <p>Specifies multiple traffic dimensions for aggregation and sorting.</p>
     */
    @NameInMap("GroupBy")
    public java.util.List<String> groupBy;

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

    public static StartNisTrafficRankingRequest build(java.util.Map<String, ?> map) throws Exception {
        StartNisTrafficRankingRequest self = new StartNisTrafficRankingRequest();
        return TeaModel.build(map, self);
    }

    public StartNisTrafficRankingRequest setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Long getBeginTime() {
        return this.beginTime;
    }

    public StartNisTrafficRankingRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public StartNisTrafficRankingRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public StartNisTrafficRankingRequest setFilter(java.util.List<StartNisTrafficRankingRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<StartNisTrafficRankingRequestFilter> getFilter() {
        return this.filter;
    }

    public StartNisTrafficRankingRequest setGroupBy(java.util.List<String> groupBy) {
        this.groupBy = groupBy;
        return this;
    }
    public java.util.List<String> getGroupBy() {
        return this.groupBy;
    }

    public StartNisTrafficRankingRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public StartNisTrafficRankingRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public StartNisTrafficRankingRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public StartNisTrafficRankingRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public StartNisTrafficRankingRequest setRegionNo(String regionNo) {
        this.regionNo = regionNo;
        return this;
    }
    public String getRegionNo() {
        return this.regionNo;
    }

    public StartNisTrafficRankingRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

    public StartNisTrafficRankingRequest setStorageInterval(Integer storageInterval) {
        this.storageInterval = storageInterval;
        return this;
    }
    public Integer getStorageInterval() {
        return this.storageInterval;
    }

    public StartNisTrafficRankingRequest setTopN(Integer topN) {
        this.topN = topN;
        return this;
    }
    public Integer getTopN() {
        return this.topN;
    }

    public StartNisTrafficRankingRequest setTrafficAnalyzerId(String trafficAnalyzerId) {
        this.trafficAnalyzerId = trafficAnalyzerId;
        return this;
    }
    public String getTrafficAnalyzerId() {
        return this.trafficAnalyzerId;
    }

    public StartNisTrafficRankingRequest setTrafficScenario(String trafficScenario) {
        this.trafficScenario = trafficScenario;
        return this;
    }
    public String getTrafficScenario() {
        return this.trafficScenario;
    }

    public StartNisTrafficRankingRequest setTupleDimension(String tupleDimension) {
        this.tupleDimension = tupleDimension;
        return this;
    }
    public String getTupleDimension() {
        return this.tupleDimension;
    }

    public static class StartNisTrafficRankingRequestFilter extends TeaModel {
        /**
         * <p>Based on the <code>TupleDimension</code> and <code>TrafficScenario</code> fields, the following filter condition label keys are supported:</p>
         * <ul>
         * <li><p><code>TrafficScenario = VpcFlowLogAll</code> / <code>VpcFlowLogInternet</code> (VPC flow log scenario):</p>
         * <ul>
         * <li><p>When <code>TupleDimension</code> is 1-tuple, the following keys are supported:</p>
         * <ul>
         * <li><code>FlowAction</code>: The action type to execute on traffic after it matches a rule or policy (required, corresponding value does not support multiple selections)</li>
         * <li><code>VpcId</code>: VPC ID (corresponding value supports multiple selections)</li>
         * <li><code>VSwitchId</code>: vSwitch ID (corresponding value supports multiple selections)</li>
         * <li><code>NetworkInterfaceId</code>: Network interface controller (NIC) ID (corresponding value supports multiple selections)</li>
         * <li><code>EcsId</code>: ECS server ID (corresponding value supports multiple selections)</li>
         * <li><code>CloudIp</code>: Cloud IP address (corresponding value supports multiple selections)</li>
         * </ul>
         * </li>
         * <li><p>When <code>TupleDimension</code> is 2-tuple, the following keys are supported:</p>
         * <ul>
         * <li><code>FlowAction</code>: The action type to execute on traffic after it matches a rule or policy (required, corresponding value does not support multiple selections)</li>
         * <li><code>VpcId</code>: VPC ID (corresponding value supports multiple selections)</li>
         * <li><code>VSwitchId</code>: vSwitch ID (corresponding value supports multiple selections)</li>
         * <li><code>NetworkInterfaceId</code>: Network interface controller (NIC) ID (corresponding value supports multiple selections)</li>
         * <li><code>EcsId</code>: ECS server ID (corresponding value supports multiple selections)</li>
         * <li><code>SourceIp</code>: Source IP address (corresponding value supports multiple selections)</li>
         * <li><code>DestinationIp</code>: Destination IP address (corresponding value supports multiple selections)</li>
         * <li><code>TrafficPath</code>: Traffic path (corresponding value supports multiple selections)</li>
         * </ul>
         * </li>
         * <li><p>When <code>TupleDimension</code> is 5-tuple, the following keys are supported:</p>
         * <ul>
         * <li><code>FlowAction</code>: The action type to execute on traffic after it matches a rule or policy (required, corresponding value does not support multiple selections)</li>
         * <li><code>VpcId</code>: VPC ID (corresponding value supports multiple selections)</li>
         * <li><code>VSwitchId</code>: vSwitch ID (corresponding value supports multiple selections)</li>
         * <li><code>NetworkInterfaceId</code>: Network interface controller (NIC) ID (corresponding value supports multiple selections)</li>
         * <li><code>EcsId</code>: ECS server ID (corresponding value supports multiple selections)</li>
         * <li><code>SourceIp</code>: Source IP address</li>
         * <li><code>DestinationIp</code>: Destination IP address</li>
         * <li><code>TrafficPath</code>: Traffic path (corresponding value supports multiple selections)</li>
         * <li><code>SourcePort</code>: Source port (corresponding value supports multiple selections)</li>
         * <li><code>DestinationPort</code>: Destination port (corresponding value supports multiple selections)</li>
         * <li><code>Protocol</code>: Network protocol (corresponding value supports multiple selections)</li>
         * </ul>
         * </li>
         * <li><p>For VPC public network scenarios (<code>TrafficScenario = VpcFlowLogInternet</code>), the following additional keys are supported for filtering by Internet location:</p>
         * <ul>
         * <li><code>ClientCountry</code>: Filter network traffic analysis scope by country (corresponding value supports multiple selections)</li>
         * <li><code>ClientCity</code>: Filter network traffic analysis scope by city (corresponding value supports multiple selections)</li>
         * <li><code>ClientAsn</code>: Filter network traffic analysis scope by ASN (corresponding value supports multiple selections)</li>
         * <li><code>ClientIsp</code>: Filter network traffic analysis scope by client ISP (corresponding value supports multiple selections)</li>
         * </ul>
         * </li>
         * <li><p>For all VPC scenarios, filtering by traffic metrics is supported:</p>
         * <ul>
         * <li><code>MinBytes</code>: Specifies the minimum traffic volume for sorting, in bytes (corresponding value does not support multiple selections)</li>
         * <li><code>MaxBytes</code>: Specifies the maximum traffic volume for sorting, in bytes (corresponding value does not support multiple selections)</li>
         * <li><code>MinRoundTripTime</code>: Specifies the minimum RTT for sorting, in ms (corresponding value does not support multiple selections)</li>
         * <li><code>MaxRoundTripTime</code>: Specifies the maximum RTT for sorting, in ms (corresponding value does not support multiple selections)</li>
         * <li><code>MinPackages</code>: Specifies the minimum number of packets for sorting (corresponding value does not support multiple selections)</li>
         * <li><code>MaxPackages</code>: Specifies the maximum number of packets for sorting (corresponding value does not support multiple selections)</li>
         * </ul>
         * </li>
         * </ul>
         * </li>
         * </ul>
         * <hr>
         * <ul>
         * <li><p><code>TrafficScenario = TRFlowlog</code> (TR flow log scenario):</p>
         * <ul>
         * <li><p>When querying 2-tuple or adaptive 2-tuple, the following keys are supported:</p>
         * <ul>
         * <li><code>TransitRouterAttachmentId</code>: Network instance connection ID (required, corresponding value does not support multiple selections)</li>
         * <li><code>TransitRouterPairAttachmentId</code>: Peer TR connection ID (corresponding value supports multiple selections)</li>
         * <li><code>TransitRouterId</code>: Forward router instance ID (corresponding value supports multiple selections)</li>
         * <li><code>SourceIp</code>: Source IP address (corresponding value does not support multiple selections when Operator = like. Corresponding value supports multiple selections when Operator != like)</li>
         * <li><code>DestinationIp</code>: Destination IP address (corresponding value does not support multiple selections when Operator = like. Corresponding value supports multiple selections when Operator != like)</li>
         * <li><code>Dscp</code>: Differentiated Services Code Point (corresponding value supports multiple selections)</li>
         * </ul>
         * </li>
         * <li><p>When querying 5-tuple or adaptive 5-tuple, the following additional keys are supported on top of 2-tuple:</p>
         * <ul>
         * <li><code>Protocol</code>: Network protocol (corresponding value supports multiple selections)</li>
         * <li><code>SourcePort</code>: Source port (corresponding value supports multiple selections)</li>
         * <li><code>DestinationPort</code>: Destination port (corresponding value supports multiple selections)</li>
         * </ul>
         * </li>
         * <li><p>In <code>non-TR cross-region scenarios</code>, the following additional keys are supported:</p>
         * <ul>
         * <li><code>TransitRouterSourceResourceId</code>: Source network instance ID (corresponding value supports multiple selections)</li>
         * <li><code>TransitRouterDestinationResourceId</code>: Destination network instance ID (corresponding value supports multiple selections)</li>
         * </ul>
         * </li>
         * <li><p>In <code>VPC connection traffic scenarios</code>, the following additional keys are supported:</p>
         * <ul>
         * <li><code>TransitRouterSourceNetworkInterface</code>: Source TR ENI (corresponding value supports multiple selections)</li>
         * <li><code>TransitRouterDestinationNetworkInterface</code>: Destination TR ENI (corresponding value supports multiple selections)</li>
         * </ul>
         * </li>
         * <li><p>For all TR scenarios, filtering by traffic metrics is supported:</p>
         * <ul>
         * <li><code>MinBytes</code>: Specifies the minimum traffic volume for sorting, in bytes (corresponding value does not support multiple selections)</li>
         * <li><code>MaxBytes</code>: Specifies the maximum traffic volume for sorting, in bytes (corresponding value does not support multiple selections)</li>
         * <li><code>MinPackages</code>: Specifies the minimum number of packets for sorting (corresponding value does not support multiple selections)</li>
         * <li><code>MaxPackages</code>: Specifies the maximum number of packets for sorting (corresponding value does not support multiple selections)</li>
         * <li><code>MinPacketsLostNoRoute</code>: Minimum packet loss due to no routing (corresponding value does not support multiple selections)</li>
         * <li><code>MinPacketsLostBlackhole</code>: Minimum packet loss due to blackhole routing (corresponding value does not support multiple selections)</li>
         * <li><code>MinPacketsLostTTLExpired</code>: Minimum packet loss due to TTL timeout (corresponding value does not support multiple selections)</li>
         * <li><code>MaxPacketsLostNoRoute</code>: Maximum packet loss due to no routing (corresponding value does not support multiple selections)</li>
         * <li><code>MaxPacketsLostBlackhole</code>: Maximum packet loss due to blackhole routing (corresponding value does not support multiple selections)</li>
         * <li><code>MaxPacketsLostTTLExpired</code>: Maximum packet loss due to TTL timeout (corresponding value does not support multiple selections)</li>
         * </ul>
         * </li>
         * </ul>
         * </li>
         * </ul>
         * <hr>
         * <ul>
         * <li><p><code>TrafficScenario = CbwpMetric</code> (Internet Shared Bandwidth metric analysis scenario):</p>
         * <ul>
         * <li><p>Filtering by conditions supports:</p>
         * <ul>
         * <li><code>PublicIpAddress</code>: Public IP address of the bound EIP (corresponding value does not support multiple selections when Operator = like. Corresponding value supports multiple selections when Operator != like)</li>
         * <li><code>BindingResourceType</code>: Resource type of the instance bound to the EIP (corresponding value supports multiple selections)</li>
         * <li><code>BindingResourceId</code>: Resource ID of the instance bound to the EIP (corresponding value supports multiple selections)</li>
         * <li><code>CbwpId</code>: Internet Shared Bandwidth ID (required, corresponding value does not support multiple selections)</li>
         * <li><code>InstanceId</code>: EIP ID bound to the Internet Shared Bandwidth instance (corresponding value supports multiple selections)</li>
         * </ul>
         * </li>
         * <li><p>For all CBWP scenarios, filtering by traffic metrics is supported:</p>
         * <ul>
         * <li><code>MinBytes</code>: Specifies the minimum traffic volume for sorting, in bytes (corresponding value does not support multiple selections)</li>
         * <li><code>MaxBytes</code>: Specifies the maximum traffic volume for sorting, in bytes (corresponding value does not support multiple selections)</li>
         * <li><code>MinPackages</code>: Specifies the minimum number of packets for sorting (corresponding value does not support multiple selections)</li>
         * <li><code>MaxPackages</code>: Specifies the maximum number of packets for sorting (corresponding value does not support multiple selections)</li>
         * </ul>
         * </li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FlowAction</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>For specified key types, some support using operators to perform string matching on the passed value. Valid values (default value: <code>in</code>):</p>
         * <ul>
         * <li><code>in</code>: Equal to.</li>
         * <li><code>not in</code>: Not equal to.</li>
         * <li><code>like</code>: Contains.</li>
         * </ul>
         * <p>Based on the <code>TupleDimension</code> and <code>TrafficScenario</code> fields, <code>like</code> is supported as follows:</p>
         * <ul>
         * <li><p><code>TrafficScenario = VpcFlowLogAll</code> / <code>VpcFlowLogInternet</code> (VPC flow log scenario):</p>
         * <ul>
         * <li>The <code>like</code> operator is supported when the key is one of the following:<ul>
         * <li><code>CloudIp</code></li>
         * <li><code>SourceIp</code></li>
         * <li><code>DestinationIp</code></li>
         * </ul>
         * </li>
         * </ul>
         * </li>
         * <li><p><code>TrafficScenario = TRFlowlog</code> (TR flow log scenario):</p>
         * <ul>
         * <li>The <code>like</code> operator is supported when the key is one of the following:<ul>
         * <li><code>SourceIp</code></li>
         * <li><code>DestinationIp</code></li>
         * </ul>
         * </li>
         * </ul>
         * </li>
         * <li><p><code>TrafficScenario = CbwpMetric</code> (Internet Shared Bandwidth metric analysis scenario):</p>
         * <ul>
         * <li>The <code>like</code> operator is supported when the key is one of the following:<ul>
         * <li><code>PublicIpAddress</code></li>
         * </ul>
         * </li>
         * </ul>
         * </li>
         * </ul>
         * <p>For all other fields, only the <code>in</code> and <code>not in</code> operators are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>in</p>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <p>The value of the filter condition.</p>
         */
        @NameInMap("Value")
        public java.util.List<String> value;

        public static StartNisTrafficRankingRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            StartNisTrafficRankingRequestFilter self = new StartNisTrafficRankingRequestFilter();
            return TeaModel.build(map, self);
        }

        public StartNisTrafficRankingRequestFilter setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public StartNisTrafficRankingRequestFilter setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public StartNisTrafficRankingRequestFilter setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

}
