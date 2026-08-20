// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribePvtzStatisticsHistoryRequest extends TeaModel {
    /**
     * <p>The domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end of the query time range. This value is a UNIX timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1571673600000</p>
     */
    @NameInMap("EndTimestamp")
    public String endTimestamp;

    /**
     * <p>The statistics module.</p>
     * 
     * <strong>example:</strong>
     * <p>AUTH</p>
     */
    @NameInMap("Module")
    public String module;

    /**
     * <p>The network parameters.</p>
     */
    @NameInMap("NetworkParams")
    public java.util.List<DescribePvtzStatisticsHistoryRequestNetworkParams> networkParams;

    /**
     * <p>The DNS response code.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Rcode")
    public String rcode;

    /**
     * <p>The service region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("ServerRegion")
    public String serverRegion;

    /**
     * <p>The start of the query time range. This value is a UNIX timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1516779348000</p>
     */
    @NameInMap("StartTimestamp")
    public String startTimestamp;

    /**
     * <p>The type of statistics to collect.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li>PROTOCOL: DNS request statistics by UDP and TCP protocol (global domain statistics only).</li>
     * <li>FORWARD: Forwarding resolution volume, including successful resolutions, failed resolutions, and total resolutions.</li>
     * <li>RECURSION: Recursive resolution volume, including successful resolutions, failed resolutions, and total resolutions.</li>
     * <li>QTYPE: Distribution of DNS request record types, such as A, AAAA, CNAME, and MX.</li>
     * <li>RCODE: Negative DNS response statistics.</li>
     * <li>SUCCESS_RATIO: Average resolution success rate (resolution success rate = number of valid responses matching the requested record type (QTYPE) / total number of resolutions).</li>
     * <li>LATENCY: Average DNS resolution latency (ms), which is the average time elapsed from when the Alibaba Cloud DNS server receives a DNS query to when it generates and returns a response.</li>
     * <li>REQUEST: DNS request volume statistics, showing QPS query trends.</li>
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

    public static DescribePvtzStatisticsHistoryRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePvtzStatisticsHistoryRequest self = new DescribePvtzStatisticsHistoryRequest();
        return TeaModel.build(map, self);
    }

    public DescribePvtzStatisticsHistoryRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribePvtzStatisticsHistoryRequest setEndTimestamp(String endTimestamp) {
        this.endTimestamp = endTimestamp;
        return this;
    }
    public String getEndTimestamp() {
        return this.endTimestamp;
    }

    public DescribePvtzStatisticsHistoryRequest setModule(String module) {
        this.module = module;
        return this;
    }
    public String getModule() {
        return this.module;
    }

    public DescribePvtzStatisticsHistoryRequest setNetworkParams(java.util.List<DescribePvtzStatisticsHistoryRequestNetworkParams> networkParams) {
        this.networkParams = networkParams;
        return this;
    }
    public java.util.List<DescribePvtzStatisticsHistoryRequestNetworkParams> getNetworkParams() {
        return this.networkParams;
    }

    public DescribePvtzStatisticsHistoryRequest setRcode(String rcode) {
        this.rcode = rcode;
        return this;
    }
    public String getRcode() {
        return this.rcode;
    }

    public DescribePvtzStatisticsHistoryRequest setServerRegion(String serverRegion) {
        this.serverRegion = serverRegion;
        return this;
    }
    public String getServerRegion() {
        return this.serverRegion;
    }

    public DescribePvtzStatisticsHistoryRequest setStartTimestamp(String startTimestamp) {
        this.startTimestamp = startTimestamp;
        return this;
    }
    public String getStartTimestamp() {
        return this.startTimestamp;
    }

    public DescribePvtzStatisticsHistoryRequest setStatisticalType(String statisticalType) {
        this.statisticalType = statisticalType;
        return this;
    }
    public String getStatisticalType() {
        return this.statisticalType;
    }

    public DescribePvtzStatisticsHistoryRequest setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }
    public String getZoneName() {
        return this.zoneName;
    }

    public static class DescribePvtzStatisticsHistoryRequestNetworkParams extends TeaModel {
        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1hneq5pcy2gv87op0uf</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The ID of the VPC owner.</p>
         * 
         * <strong>example:</strong>
         * <p>1634808626233933</p>
         */
        @NameInMap("VpcOwner")
        public String vpcOwner;

        /**
         * <p>The VPC type. Valid values:</p>
         * <ul>
         * <li><p><code>STANDARD</code>: Standard VPC.</p>
         * </li>
         * <li><p><code>EDS</code>: Elastic Desktop Service VPC.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>STANDARD</p>
         */
        @NameInMap("VpcType")
        public String vpcType;

        public static DescribePvtzStatisticsHistoryRequestNetworkParams build(java.util.Map<String, ?> map) throws Exception {
            DescribePvtzStatisticsHistoryRequestNetworkParams self = new DescribePvtzStatisticsHistoryRequestNetworkParams();
            return TeaModel.build(map, self);
        }

        public DescribePvtzStatisticsHistoryRequestNetworkParams setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribePvtzStatisticsHistoryRequestNetworkParams setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribePvtzStatisticsHistoryRequestNetworkParams setVpcOwner(String vpcOwner) {
            this.vpcOwner = vpcOwner;
            return this;
        }
        public String getVpcOwner() {
            return this.vpcOwner;
        }

        public DescribePvtzStatisticsHistoryRequestNetworkParams setVpcType(String vpcType) {
            this.vpcType = vpcType;
            return this;
        }
        public String getVpcType() {
            return this.vpcType;
        }

    }

}
