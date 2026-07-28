// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class GetNisTrafficMetricsRequest extends TeaModel {
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
    public java.util.List<GetNisTrafficMetricsRequestFilter> filter;

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

    public static GetNisTrafficMetricsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetNisTrafficMetricsRequest self = new GetNisTrafficMetricsRequest();
        return TeaModel.build(map, self);
    }

    public GetNisTrafficMetricsRequest setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Long getBeginTime() {
        return this.beginTime;
    }

    public GetNisTrafficMetricsRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public GetNisTrafficMetricsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetNisTrafficMetricsRequest setFilter(java.util.List<GetNisTrafficMetricsRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<GetNisTrafficMetricsRequestFilter> getFilter() {
        return this.filter;
    }

    public GetNisTrafficMetricsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public GetNisTrafficMetricsRequest setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

    public GetNisTrafficMetricsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public GetNisTrafficMetricsRequest setRegionNo(String regionNo) {
        this.regionNo = regionNo;
        return this;
    }
    public String getRegionNo() {
        return this.regionNo;
    }

    public GetNisTrafficMetricsRequest setScanBy(String scanBy) {
        this.scanBy = scanBy;
        return this;
    }
    public String getScanBy() {
        return this.scanBy;
    }

    public GetNisTrafficMetricsRequest setStepMinutes(Integer stepMinutes) {
        this.stepMinutes = stepMinutes;
        return this;
    }
    public Integer getStepMinutes() {
        return this.stepMinutes;
    }

    public GetNisTrafficMetricsRequest setStorageInterval(Integer storageInterval) {
        this.storageInterval = storageInterval;
        return this;
    }
    public Integer getStorageInterval() {
        return this.storageInterval;
    }

    public GetNisTrafficMetricsRequest setTrafficAnalyzerId(String trafficAnalyzerId) {
        this.trafficAnalyzerId = trafficAnalyzerId;
        return this;
    }
    public String getTrafficAnalyzerId() {
        return this.trafficAnalyzerId;
    }

    public GetNisTrafficMetricsRequest setTrafficScenario(String trafficScenario) {
        this.trafficScenario = trafficScenario;
        return this;
    }
    public String getTrafficScenario() {
        return this.trafficScenario;
    }

    public GetNisTrafficMetricsRequest setTupleDimension(String tupleDimension) {
        this.tupleDimension = tupleDimension;
        return this;
    }
    public String getTupleDimension() {
        return this.tupleDimension;
    }

    public static class GetNisTrafficMetricsRequestFilter extends TeaModel {
        /**
         * <p>Based on the TupleDimension field and TrafficScenario field, the supported filter condition label keys are as follows:</p>
         * <ul>
         * <li><p><code>TrafficScenario = VpcFlowLogAll</code> / <code>VpcFlowLogInternet</code> (VPC flow log scenario):</p>
         * <ul>
         * <li><p>When <code>TupleDimension</code> is a 1-tuple, the following keys are supported:</p>
         * <ul>
         * <li><code>FlowAction</code>: the action type to execute on traffic after it matches the corresponding rule or policy (required, the corresponding value does not support multiple selections)</li>
         * <li><code>VpcId</code>: VPC ID (the corresponding value supports multiple selections)</li>
         * <li><code>VSwitchId</code>: vSwitch ID (the corresponding value supports multiple selections)</li>
         * <li><code>NetworkInterfaceId</code>: elastic network interfaces (ENIs) ID (the corresponding value supports multiple selections)</li>
         * <li><code>EcsId</code>: ECS instance ID (the corresponding value supports multiple selections)</li>
         * <li><code>CloudIp</code>: cloud IP address (the corresponding value supports multiple selections)</li>
         * </ul>
         * </li>
         * <li><p>When <code>TupleDimension</code> is a 2-tuple, the following keys are supported:</p>
         * <ul>
         * <li><code>FlowAction</code>: the action type to execute on traffic after it matches the corresponding rule or policy (required, the corresponding value does not support multiple selections)</li>
         * <li><code>VpcId</code>: VPC ID (the corresponding value supports multiple selections)</li>
         * <li><code>VSwitchId</code>: vSwitch ID (the corresponding value supports multiple selections)</li>
         * <li><code>NetworkInterfaceId</code>: elastic network interfaces (ENIs) ID (the corresponding value supports multiple selections)</li>
         * <li><code>EcsId</code>: ECS instance ID (the corresponding value supports multiple selections)</li>
         * <li><code>SourceIp</code>: source IP address (the corresponding value supports multiple selections)</li>
         * <li><code>DestinationIp</code>: destination IP address (the corresponding value supports multiple selections)</li>
         * <li><code>TrafficPath</code>: traffic path (the corresponding value supports multiple selections)</li>
         * </ul>
         * </li>
         * <li><p>When <code>TupleDimension</code> is a 5-tuple, the following keys are supported:</p>
         * <ul>
         * <li><code>FlowAction</code>: the action type to execute on traffic after it matches the corresponding rule or policy (required, the corresponding value does not support multiple selections)</li>
         * <li><code>VpcId</code>: VPC ID (the corresponding value supports multiple selections)</li>
         * <li><code>VSwitchId</code>: vSwitch ID (the corresponding value supports multiple selections)</li>
         * <li><code>NetworkInterfaceId</code>: elastic network interfaces (ENIs) ID (the corresponding value supports multiple selections)</li>
         * <li><code>EcsId</code>: ECS instance ID (the corresponding value supports multiple selections)</li>
         * <li><code>SourceIp</code>: source IP address</li>
         * <li><code>DestinationIp</code>: destination IP address</li>
         * <li><code>TrafficPath</code>: traffic path (the corresponding value supports multiple selections)</li>
         * <li><code>SourcePort</code>: source port (the corresponding value supports multiple selections)</li>
         * <li><code>DestinationPort</code>: destination port (the corresponding value supports multiple selections)</li>
         * <li><code>Protocol</code>: network protocol (the corresponding value supports multiple selections)</li>
         * </ul>
         * </li>
         * <li><p>In the VPC Internet scenario (<code>TrafficScenario = VpcFlowLogInternet</code>), the following additional keys are supported for filtering by Internet location:</p>
         * <ul>
         * <li><code>ClientCountry</code>: filters network traffic analysis scope by country (the corresponding value supports multiple selections)</li>
         * <li><code>ClientCity</code>: filters network traffic analysis scope by city (the corresponding value supports multiple selections)</li>
         * <li><code>ClientAsn</code>: filters network traffic analysis scope by ASN (the corresponding value supports multiple selections)</li>
         * <li><code>ClientIsp</code>: filters network traffic analysis scope by client ISP (the corresponding value supports multiple selections)</li>
         * </ul>
         * </li>
         * <li><p>In VPC scenarios, the following traffic metrics filters are supported:</p>
         * <ul>
         * <li><code>MinBytes</code>: specifies the minimum traffic volume for sorting, in bytes (the corresponding value does not support multiple selections)</li>
         * <li><code>MaxBytes</code>: specifies the maximum traffic volume for sorting, in bytes (the corresponding value does not support multiple selections)</li>
         * <li><code>MinRoundTripTime</code>: specifies the minimum RTT for sorting, in ms (the corresponding value does not support multiple selections)</li>
         * <li><code>MaxRoundTripTime</code>: specifies the maximum RTT for sorting, in ms (the corresponding value does not support multiple selections)</li>
         * <li><code>MinPackages</code>: specifies the minimum number of packets for sorting (the corresponding value does not support multiple selections)</li>
         * <li><code>MaxPackages</code>: specifies the maximum number of packets for sorting (the corresponding value does not support multiple selections)</li>
         * </ul>
         * </li>
         * </ul>
         * </li>
         * </ul>
         * <hr>
         * <ul>
         * <li><p><code>TrafficScenario = TRFlowlog</code> (TR flow log scenario):</p>
         * <ul>
         * <li><p>When querying 2-tuples or adaptively using 2-tuples, the following keys are supported:</p>
         * <ul>
         * <li><code>TransitRouterAttachmentId</code>: network instance connection ID (required, the corresponding value does not support multiple selections)</li>
         * <li><code>TransitRouterPairAttachmentId</code>: peer TR connection ID (the corresponding value supports multiple selections)</li>
         * <li><code>TransitRouterId</code>: transit router instance ID (the corresponding value supports multiple selections)</li>
         * <li><code>SourceIp</code>: source IP address (the corresponding value does not support multiple selections when Operator is like, and supports multiple selections when Operator is not like)</li>
         * <li><code>DestinationIp</code>: destination IP address (the corresponding value does not support multiple selections when Operator is like, and supports multiple selections when Operator is not like)</li>
         * <li><code>Dscp</code>: Differentiated Services Code Point (the corresponding value supports multiple selections)</li>
         * </ul>
         * </li>
         * <li><p>When querying 5-tuples or adaptively using 5-tuples, the following additional keys are supported in addition to the 2-tuple keys:</p>
         * <ul>
         * <li><code>Protocol</code>: network protocol (the corresponding value supports multiple selections)</li>
         * <li><code>SourcePort</code>: source port (the corresponding value supports multiple selections)</li>
         * <li><code>DestinationPort</code>: destination port (the corresponding value supports multiple selections)</li>
         * </ul>
         * </li>
         * <li><p>In <code>non-TR cross-region scenarios</code>, the following additional keys are supported:</p>
         * <ul>
         * <li><code>TransitRouterSourceResourceId</code>: source network instance ID (the corresponding value supports multiple selections)</li>
         * <li><code>TransitRouterDestinationResourceId</code>: destination network instance ID (the corresponding value supports multiple selections)</li>
         * </ul>
         * </li>
         * <li><p>In <code>VPC connection traffic scenarios</code>, the following additional keys are supported:</p>
         * <ul>
         * <li><code>TransitRouterSourceNetworkInterface</code>: source TR network interface controller (NIC) (the corresponding value supports multiple selections)</li>
         * <li><code>TransitRouterDestinationNetworkInterface</code>: destination TR network interface controller (NIC) (the corresponding value supports multiple selections)</li>
         * </ul>
         * </li>
         * <li><p>In TR scenarios, the following traffic metrics filters are supported:</p>
         * <ul>
         * <li><code>MinBytes</code>: specifies the minimum traffic volume for sorting, in bytes (the corresponding value does not support multiple selections)</li>
         * <li><code>MaxBytes</code>: specifies the maximum traffic volume for sorting, in bytes (the corresponding value does not support multiple selections)</li>
         * <li><code>MinPackages</code>: specifies the minimum number of packets for sorting (the corresponding value does not support multiple selections)</li>
         * <li><code>MaxPackages</code>: specifies the maximum number of packets for sorting (the corresponding value does not support multiple selections)</li>
         * <li><code>MinPacketsLostNoRoute</code>: minimum number of packets dropped due to no route (the corresponding value does not support multiple selections)</li>
         * <li><code>MinPacketsLostBlackhole</code>: minimum number of packets dropped due to blackhole route (the corresponding value does not support multiple selections)</li>
         * <li><code>MinPacketsLostTTLExpired</code>: minimum number of packets dropped due to TTL timeout (the corresponding value does not support multiple selections)</li>
         * <li><code>MaxPacketsLostNoRoute</code>: maximum number of packets dropped due to no route (the corresponding value does not support multiple selections)</li>
         * <li><code>MaxPacketsLostBlackhole</code>: maximum number of packets dropped due to blackhole route (the corresponding value does not support multiple selections)</li>
         * <li><code>MaxPacketsLostTTLExpired</code>: maximum number of packets dropped due to TTL timeout (the corresponding value does not support multiple selections)</li>
         * </ul>
         * </li>
         * </ul>
         * </li>
         * </ul>
         * <hr>
         * <ul>
         * <li><p><code>TrafficScenario = CbwpMetric</code> (Internet Shared Bandwidth metric analysis scenario):</p>
         * <ul>
         * <li><p>The following filter condition keys are supported:</p>
         * <ul>
         * <li><code>PublicIpAddress</code>: the public IP address of the associated EIP (the corresponding value does not support multiple selections when Operator is like, and supports multiple selections when Operator is not like)</li>
         * <li><code>BindingResourceType</code>: the type of the instance resource to which the EIP is bound (the corresponding value supports multiple selections)</li>
         * <li><code>BindingResourceId</code>: the ID of the instance resource to which the EIP is bound (the corresponding value supports multiple selections)</li>
         * <li><code>CbwpId</code>: the Internet Shared Bandwidth instance ID (required, the corresponding value does not support multiple selections)</li>
         * <li><code>InstanceId</code>: the EIP ID bound to the Internet Shared Bandwidth instance (the corresponding value supports multiple selections)</li>
         * </ul>
         * </li>
         * <li><p>In CBWP scenarios, the following traffic metrics filters are supported:</p>
         * <ul>
         * <li><code>MinBytes</code>: specifies the minimum traffic volume for sorting, in bytes (the corresponding value does not support multiple selections)</li>
         * <li><code>MaxBytes</code>: specifies the maximum traffic volume for sorting, in bytes (the corresponding value does not support multiple selections)</li>
         * <li><code>MinPackages</code>: specifies the minimum number of packets for sorting (the corresponding value does not support multiple selections)</li>
         * <li><code>MaxPackages</code>: specifies the maximum number of packets for sorting (the corresponding value does not support multiple selections)</li>
         * </ul>
         * </li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NetworkInterfaceId</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The filter operator.</p>
         * <ul>
         * <li>TR and Internet Shared Bandwidth scenarios:<ul>
         * <li>Defaults to in if not specified.</li>
         * <li>like performs prefix matching and only one Value can be specified.</li>
         * </ul>
         * </li>
         * <li>VPC scenarios currently ignore this parameter and uniformly process it as IN.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>in</p>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <p>The filter value corresponding to the specified key type.</p>
         * <p>Based on the <code>TupleDimension</code> field and <code>TrafficScenario</code> field, the supported values are as follows:</p>
         * <ul>
         * <li><p><code>TrafficScenario = VpcFlowLogAll</code> / <code>VpcFlowLogInternet</code> (VPC flow log scenario)</p>
         * <ul>
         * <li>When the key is <code>FlowAction</code>, the valid values are:<ul>
         * <li><code>ACCEPT</code> (pass <code>Accept</code> by default): traffic allowed by security groups and network ACLs</li>
         * <li><code>REJECT</code>: traffic denied by security groups and network ACLs</li>
         * </ul>
         * </li>
         * </ul>
         * </li>
         * <li><p><code>TrafficScenario = TRFlowlog</code> (TR flow log scenario)</p>
         * <ul>
         * <li>When the key is <code>TransitRouterAttachmentId</code>, this is a required field, and the corresponding value is also required (specify the specific VPC connection / VPN connection / VBR connection / ECR connection / inter-region connection or network instance connection ID).</li>
         * </ul>
         * </li>
         * <li><p><code>TrafficScenario = CbwpMetric</code> (shared bandwidth metric analysis scenario)</p>
         * <ul>
         * <li>When the key is <code>CbwpId</code>, this is a required field, and the corresponding value is also required (specify the specific Internet Shared Bandwidth instance ID).</li>
         * </ul>
         * </li>
         * </ul>
         */
        @NameInMap("Value")
        public java.util.List<String> value;

        public static GetNisTrafficMetricsRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            GetNisTrafficMetricsRequestFilter self = new GetNisTrafficMetricsRequestFilter();
            return TeaModel.build(map, self);
        }

        public GetNisTrafficMetricsRequestFilter setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetNisTrafficMetricsRequestFilter setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public GetNisTrafficMetricsRequestFilter setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

}
