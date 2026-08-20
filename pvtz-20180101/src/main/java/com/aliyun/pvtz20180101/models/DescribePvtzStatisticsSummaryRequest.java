// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribePvtzStatisticsSummaryRequest extends TeaModel {
    /**
     * <p>The sort order. Valid values: ASC and DESC.</p>
     * 
     * <strong>example:</strong>
     * <p>ASC</p>
     */
    @NameInMap("Direction")
    public String direction;

    /**
     * <p>The domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end of the time range to query, specified as a UNIX timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1571673600000</p>
     */
    @NameInMap("EndTimestamp")
    public String endTimestamp;

    /**
     * <p>Specifies the type of change in request volume to report. Valid values: up (request spikes) and down (request drops).</p>
     * 
     * <strong>example:</strong>
     * <p>up</p>
     */
    @NameInMap("GrowType")
    public String growType;

    /**
     * <p>The statistics module. Valid values: AUTHORITY, AUTH_FAST, AUTH_SLOW, GLOBAL, CACHE, FORWARD, and RECURSION.</p>
     * 
     * <strong>example:</strong>
     * <p>AUTH_FAST</p>
     */
    @NameInMap("Module")
    public String module;

    /**
     * <p>The network parameters.</p>
     */
    @NameInMap("NetworkParams")
    public java.util.List<DescribePvtzStatisticsSummaryRequestNetworkParams> networkParams;

    /**
     * <p>The field by which to sort the results. To sort by fluctuation ratio, set this parameter to fluctuation_ratio.</p>
     * 
     * <strong>example:</strong>
     * <p>fluctuation_ratio</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The page number to return.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The time granularity for the statistics.</p>
     * 
     * <strong>example:</strong>
     * <p>day</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The DNS response code.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Rcode")
    public String rcode;

    /**
     * <p>The region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("ServerRegion")
    public String serverRegion;

    /**
     * <p>The beginning of the time range to query, specified as a UNIX timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1571587200000</p>
     */
    @NameInMap("StartTimestamp")
    public String startTimestamp;

    /**
     * <p>The type of statistics to collect. Valid values: QTYPE_RATIO: The ratio of DNS request record types. NEGATIVE_RCODE: Statistics on negative DNS responses. RCODE_DOMAIN: The top domain names that receive negative responses. RCODE_SOURCE_IP: The top source IP addresses for requests to a specified domain name that receive negative responses. REQUEST_ZONE: The top zones by request volume. REQUEST_DOMAIN: The top subdomains by request volume. VPC_RATIO: The ratio of request sources. SOURCE_VPC: Analysis of high-traffic source networks. SOURCE_IP: Statistics on source IP addresses. LINE_RATIO: The percentage of traffic per resolution line. LINE_HIT: Details about resolution line hits.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li>QTYPE_RATIO: Distribution ratio of DNS request record types.</li>
     * <li>NEGATIVE_RCODE: Negative DNS response type statistics.</li>
     * <li>RCODE_DOMAIN: Top domains by negative response count</li>
     * <li>RCODE_SOURCE_IP: Top source IP addresses requesting a specific domain with negative responses.</li>
     * <li>REQUEST_ZONE: Domain request volume ranking (zone level).</li>
     * <li>REQUEST_DOMAIN: Subdomain request volume ranking (domain name level).</li>
     * <li>VPC_RATIO: Request source distribution ratio.</li>
     * <li>SOURCE_VPC: Hot source network analysis for requests.</li>
     * <li>SOURCE_IP: Request source IP address statistics.</li>
     * <li>LINE_RATIO: Traffic distribution ratio by resolution line.</li>
     * <li>LINE_HIT: Resolution line hit details.</li>
     * </ul>
     */
    @NameInMap("StatisticalType")
    public String statisticalType;

    /**
     * <p>The zone name.</p>
     * 
     * <strong>example:</strong>
     * <p>host.local</p>
     */
    @NameInMap("ZoneName")
    public String zoneName;

    public static DescribePvtzStatisticsSummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePvtzStatisticsSummaryRequest self = new DescribePvtzStatisticsSummaryRequest();
        return TeaModel.build(map, self);
    }

    public DescribePvtzStatisticsSummaryRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public DescribePvtzStatisticsSummaryRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribePvtzStatisticsSummaryRequest setEndTimestamp(String endTimestamp) {
        this.endTimestamp = endTimestamp;
        return this;
    }
    public String getEndTimestamp() {
        return this.endTimestamp;
    }

    public DescribePvtzStatisticsSummaryRequest setGrowType(String growType) {
        this.growType = growType;
        return this;
    }
    public String getGrowType() {
        return this.growType;
    }

    public DescribePvtzStatisticsSummaryRequest setModule(String module) {
        this.module = module;
        return this;
    }
    public String getModule() {
        return this.module;
    }

    public DescribePvtzStatisticsSummaryRequest setNetworkParams(java.util.List<DescribePvtzStatisticsSummaryRequestNetworkParams> networkParams) {
        this.networkParams = networkParams;
        return this;
    }
    public java.util.List<DescribePvtzStatisticsSummaryRequestNetworkParams> getNetworkParams() {
        return this.networkParams;
    }

    public DescribePvtzStatisticsSummaryRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public DescribePvtzStatisticsSummaryRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribePvtzStatisticsSummaryRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribePvtzStatisticsSummaryRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public DescribePvtzStatisticsSummaryRequest setRcode(String rcode) {
        this.rcode = rcode;
        return this;
    }
    public String getRcode() {
        return this.rcode;
    }

    public DescribePvtzStatisticsSummaryRequest setServerRegion(String serverRegion) {
        this.serverRegion = serverRegion;
        return this;
    }
    public String getServerRegion() {
        return this.serverRegion;
    }

    public DescribePvtzStatisticsSummaryRequest setStartTimestamp(String startTimestamp) {
        this.startTimestamp = startTimestamp;
        return this;
    }
    public String getStartTimestamp() {
        return this.startTimestamp;
    }

    public DescribePvtzStatisticsSummaryRequest setStatisticalType(String statisticalType) {
        this.statisticalType = statisticalType;
        return this;
    }
    public String getStatisticalType() {
        return this.statisticalType;
    }

    public DescribePvtzStatisticsSummaryRequest setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }
    public String getZoneName() {
        return this.zoneName;
    }

    public static class DescribePvtzStatisticsSummaryRequestNetworkParams extends TeaModel {
        /**
         * <p>The ID of the region where the VPC is deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1uvv79h1t8unnzdh3nq</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The ID of the Alibaba Cloud account that owns the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>1256177436790486</p>
         */
        @NameInMap("VpcOwner")
        public String vpcOwner;

        /**
         * <p>The type of the VPC.</p>
         * <ul>
         * <li><p>STANDARD: A standard VPC.</p>
         * </li>
         * <li><p>EDS: A VPC for Elastic Desktop Service (EDS).</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>STANDARD</p>
         */
        @NameInMap("VpcType")
        public String vpcType;

        public static DescribePvtzStatisticsSummaryRequestNetworkParams build(java.util.Map<String, ?> map) throws Exception {
            DescribePvtzStatisticsSummaryRequestNetworkParams self = new DescribePvtzStatisticsSummaryRequestNetworkParams();
            return TeaModel.build(map, self);
        }

        public DescribePvtzStatisticsSummaryRequestNetworkParams setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribePvtzStatisticsSummaryRequestNetworkParams setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribePvtzStatisticsSummaryRequestNetworkParams setVpcOwner(String vpcOwner) {
            this.vpcOwner = vpcOwner;
            return this;
        }
        public String getVpcOwner() {
            return this.vpcOwner;
        }

        public DescribePvtzStatisticsSummaryRequestNetworkParams setVpcType(String vpcType) {
            this.vpcType = vpcType;
            return this;
        }
        public String getVpcType() {
            return this.vpcType;
        }

    }

}
