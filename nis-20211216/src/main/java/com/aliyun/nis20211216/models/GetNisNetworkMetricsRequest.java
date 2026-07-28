// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class GetNisNetworkMetricsRequest extends TeaModel {
    /**
     * <p>Explicitly passes sub-account IDs.</p>
     */
    @NameInMap("AccountIds")
    public java.util.List<String> accountIds;

    /**
     * <p>The start time, in <strong>ms</strong>, in <strong>UNIX</strong> timestamp format. If not specified, the most recent 1 hour is queried by default. The earliest start time is 7 days ago.</p>
     * 
     * <strong>example:</strong>
     * <p>1638239092000</p>
     */
    @NameInMap("BeginTime")
    public Long beginTime;

    /**
     * <p>The collection of metric query parameters for specific business scenarios. For metric description of each scenario, see <a href="https://help.aliyun.com/document_detail/2833348.html">GetNisNetworkMetrics</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bps</p>
     */
    @NameInMap("Dimensions")
    public java.util.List<GetNisNetworkMetricsRequestDimensions> dimensions;

    /**
     * <p>The end time, in <strong>ms</strong>, in <strong>UNIX</strong> timestamp format. If not specified, the most recent 1 hour is queried by default. If only BeginTime is specified, the 1 hour after BeginTime is queried. The maximum time span between the end time and start time is 24 hours.</p>
     * 
     * <strong>example:</strong>
     * <p>1684373700099</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The metric name. Valid values:</p>
     * <ul>
     * <li>bps: bits per second.</li>
     * <li>pps: packets per second.</li>
     * <li>rtt: round-trip time when establishing a TCP connection.</li>
     * <li>RetransmitRate: retransmission rate.</li>
     * <li>RatelimitDropPps: rate of packets dropped due to throttling.</li>
     * <li>ActiveSessionCount: concurrent sessions.</li>
     * <li>NewSessionPerSecond: new sessions per second.</li>
     * <li>BandwidthUtilization: bandwidth utilization.</li>
     * <li>passRate: inspection pass rate.<blockquote>
     * <p>If no RTT data is available within the selected time range, the connection is a persistent connection and no initial connection was established during that period.</p>
     * </blockquote>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bps</p>
     */
    @NameInMap("MetricName")
    public String metricName;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shenzhen</p>
     */
    @NameInMap("RegionNo")
    public String regionNo;

    /**
     * <p>Analyzes traffic by the Alibaba Cloud network resource type used for traffic forwarding. Valid values:</p>
     * <ul>
     * <li>AccessInternetIpV4: all Alibaba Cloud public IPv4 addresses.</li>
     * <li>AccessInternetIpV4Limited: all region-throttled Alibaba Cloud public IPv4 addresses.</li>
     * <li>ElasticIP: Elastic IP Address (EIP) (IPv4).</li>
     * <li>PublicIpEcs: static public IP address bound to an ECS instance (IPv4).</li>
     * <li>PublicIpClb: static public IP address bound to a CLB instance (IPv4).</li>
     * <li>NAT: public traffic through SNAT.</li>
     * <li>TR: traffic through Cloud Enterprise Network (CEN) transit routers.</li>
     * <li>TRAttachment: traffic through CEN connection instances, including intra-region and inter-region connections. Intra-region connections have inbound and outbound directions. Inter-region connections have only the outbound direction.</li>
     * <li>VBR: traffic through virtual border routers.</li>
     * <li>GA: traffic through Global Accelerator.</li>
     * <li>InternetProbing: Internet quality probing data.</li>
     * <li>IntranetProbing: internal network quality probing data.</li>
     * <li>NisInspectionHistoryReportScore: inspection history scores.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AccessInternetIPV4</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The sort order. Default value: TimestampAscending. Valid values:</p>
     * <ul>
     * <li>TimestampAscending: sorts by time in ascending order.</li>
     * <li>TimestampDescending: sorts by time in descending order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>TimestampAscending</p>
     */
    @NameInMap("ScanBy")
    public String scanBy;

    @NameInMap("StepMinutes")
    public Integer stepMinutes;

    /**
     * <p>Specifies whether to use cross-account access mode. This is a reserved parameter and is not currently supported.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("UseCrossAccount")
    public Boolean useCrossAccount;

    public static GetNisNetworkMetricsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetNisNetworkMetricsRequest self = new GetNisNetworkMetricsRequest();
        return TeaModel.build(map, self);
    }

    public GetNisNetworkMetricsRequest setAccountIds(java.util.List<String> accountIds) {
        this.accountIds = accountIds;
        return this;
    }
    public java.util.List<String> getAccountIds() {
        return this.accountIds;
    }

    public GetNisNetworkMetricsRequest setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Long getBeginTime() {
        return this.beginTime;
    }

    public GetNisNetworkMetricsRequest setDimensions(java.util.List<GetNisNetworkMetricsRequestDimensions> dimensions) {
        this.dimensions = dimensions;
        return this;
    }
    public java.util.List<GetNisNetworkMetricsRequestDimensions> getDimensions() {
        return this.dimensions;
    }

    public GetNisNetworkMetricsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetNisNetworkMetricsRequest setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

    public GetNisNetworkMetricsRequest setRegionNo(String regionNo) {
        this.regionNo = regionNo;
        return this;
    }
    public String getRegionNo() {
        return this.regionNo;
    }

    public GetNisNetworkMetricsRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public GetNisNetworkMetricsRequest setScanBy(String scanBy) {
        this.scanBy = scanBy;
        return this;
    }
    public String getScanBy() {
        return this.scanBy;
    }

    public GetNisNetworkMetricsRequest setStepMinutes(Integer stepMinutes) {
        this.stepMinutes = stepMinutes;
        return this;
    }
    public Integer getStepMinutes() {
        return this.stepMinutes;
    }

    public GetNisNetworkMetricsRequest setUseCrossAccount(Boolean useCrossAccount) {
        this.useCrossAccount = useCrossAccount;
        return this;
    }
    public Boolean getUseCrossAccount() {
        return this.useCrossAccount;
    }

    public static class GetNisNetworkMetricsRequestDimensions extends TeaModel {
        /**
         * <p>The name of the filter condition.</p>
         * 
         * <strong>example:</strong>
         * <p>instanceId</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The value of the filter condition.</p>
         * 
         * <strong>example:</strong>
         * <p>eip-sample*</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetNisNetworkMetricsRequestDimensions build(java.util.Map<String, ?> map) throws Exception {
            GetNisNetworkMetricsRequestDimensions self = new GetNisNetworkMetricsRequestDimensions();
            return TeaModel.build(map, self);
        }

        public GetNisNetworkMetricsRequestDimensions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetNisNetworkMetricsRequestDimensions setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
