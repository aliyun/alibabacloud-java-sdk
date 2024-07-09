// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribeStatisticSummaryResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A73F3BD0-B1A8-42A9-A9B6-689BBABC4891</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>2254</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    /**
     * <p>The top 3 virtual private clouds (VPCs) that initiate the largest number of DNS requests.</p>
     */
    @NameInMap("VpcRequestTops")
    public DescribeStatisticSummaryResponseBodyVpcRequestTops vpcRequestTops;

    /**
     * <p>The top 3 zones with the largest number of DNS requests.</p>
     */
    @NameInMap("ZoneRequestTops")
    public DescribeStatisticSummaryResponseBodyZoneRequestTops zoneRequestTops;

    public static DescribeStatisticSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeStatisticSummaryResponseBody self = new DescribeStatisticSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeStatisticSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeStatisticSummaryResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public DescribeStatisticSummaryResponseBody setVpcRequestTops(DescribeStatisticSummaryResponseBodyVpcRequestTops vpcRequestTops) {
        this.vpcRequestTops = vpcRequestTops;
        return this;
    }
    public DescribeStatisticSummaryResponseBodyVpcRequestTops getVpcRequestTops() {
        return this.vpcRequestTops;
    }

    public DescribeStatisticSummaryResponseBody setZoneRequestTops(DescribeStatisticSummaryResponseBodyZoneRequestTops zoneRequestTops) {
        this.zoneRequestTops = zoneRequestTops;
        return this;
    }
    public DescribeStatisticSummaryResponseBodyZoneRequestTops getZoneRequestTops() {
        return this.zoneRequestTops;
    }

    public static class DescribeStatisticSummaryResponseBodyVpcRequestTopsVpcRequestTop extends TeaModel {
        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The name of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>China (Beijing)</p>
         */
        @NameInMap("RegionName")
        public String regionName;

        /**
         * <p>The number of DNS requests.</p>
         * 
         * <strong>example:</strong>
         * <p>2254</p>
         */
        @NameInMap("RequestCount")
        public Long requestCount;

        /**
         * <p>The tunnel ID.</p>
         * 
         * <strong>example:</strong>
         * <p>46574</p>
         */
        @NameInMap("TunnelId")
        public String tunnelId;

        /**
         * <p>The VPC ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-2zeisd8c0j6wk1451jr6o</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The type of the VPC. Valid values:</p>
         * <ul>
         * <li>STANDARD: standard VPC</li>
         * <li>EDS: Elastic Desktop Service (EDS) workspace VPC</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>STANDARD</p>
         */
        @NameInMap("VpcType")
        public String vpcType;

        public static DescribeStatisticSummaryResponseBodyVpcRequestTopsVpcRequestTop build(java.util.Map<String, ?> map) throws Exception {
            DescribeStatisticSummaryResponseBodyVpcRequestTopsVpcRequestTop self = new DescribeStatisticSummaryResponseBodyVpcRequestTopsVpcRequestTop();
            return TeaModel.build(map, self);
        }

        public DescribeStatisticSummaryResponseBodyVpcRequestTopsVpcRequestTop setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeStatisticSummaryResponseBodyVpcRequestTopsVpcRequestTop setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

        public DescribeStatisticSummaryResponseBodyVpcRequestTopsVpcRequestTop setRequestCount(Long requestCount) {
            this.requestCount = requestCount;
            return this;
        }
        public Long getRequestCount() {
            return this.requestCount;
        }

        public DescribeStatisticSummaryResponseBodyVpcRequestTopsVpcRequestTop setTunnelId(String tunnelId) {
            this.tunnelId = tunnelId;
            return this;
        }
        public String getTunnelId() {
            return this.tunnelId;
        }

        public DescribeStatisticSummaryResponseBodyVpcRequestTopsVpcRequestTop setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeStatisticSummaryResponseBodyVpcRequestTopsVpcRequestTop setVpcType(String vpcType) {
            this.vpcType = vpcType;
            return this;
        }
        public String getVpcType() {
            return this.vpcType;
        }

    }

    public static class DescribeStatisticSummaryResponseBodyVpcRequestTops extends TeaModel {
        @NameInMap("VpcRequestTop")
        public java.util.List<DescribeStatisticSummaryResponseBodyVpcRequestTopsVpcRequestTop> vpcRequestTop;

        public static DescribeStatisticSummaryResponseBodyVpcRequestTops build(java.util.Map<String, ?> map) throws Exception {
            DescribeStatisticSummaryResponseBodyVpcRequestTops self = new DescribeStatisticSummaryResponseBodyVpcRequestTops();
            return TeaModel.build(map, self);
        }

        public DescribeStatisticSummaryResponseBodyVpcRequestTops setVpcRequestTop(java.util.List<DescribeStatisticSummaryResponseBodyVpcRequestTopsVpcRequestTop> vpcRequestTop) {
            this.vpcRequestTop = vpcRequestTop;
            return this;
        }
        public java.util.List<DescribeStatisticSummaryResponseBodyVpcRequestTopsVpcRequestTop> getVpcRequestTop() {
            return this.vpcRequestTop;
        }

    }

    public static class DescribeStatisticSummaryResponseBodyZoneRequestTopsZoneRequestTop extends TeaModel {
        /**
         * <p>The business type. Valid values:</p>
         * <ul>
         * <li>AUTH_ZONE: authoritative zone</li>
         * <li>RESOLVER_RULE: forwarding rule</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AUTH_ZONE</p>
         */
        @NameInMap("BizType")
        public String bizType;

        /**
         * <p>The number of DNS requests.</p>
         * 
         * <strong>example:</strong>
         * <p>2251</p>
         */
        @NameInMap("RequestCount")
        public Long requestCount;

        /**
         * <p>The name of the zone.</p>
         * 
         * <strong>example:</strong>
         * <p>host.local</p>
         */
        @NameInMap("ZoneName")
        public String zoneName;

        public static DescribeStatisticSummaryResponseBodyZoneRequestTopsZoneRequestTop build(java.util.Map<String, ?> map) throws Exception {
            DescribeStatisticSummaryResponseBodyZoneRequestTopsZoneRequestTop self = new DescribeStatisticSummaryResponseBodyZoneRequestTopsZoneRequestTop();
            return TeaModel.build(map, self);
        }

        public DescribeStatisticSummaryResponseBodyZoneRequestTopsZoneRequestTop setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public DescribeStatisticSummaryResponseBodyZoneRequestTopsZoneRequestTop setRequestCount(Long requestCount) {
            this.requestCount = requestCount;
            return this;
        }
        public Long getRequestCount() {
            return this.requestCount;
        }

        public DescribeStatisticSummaryResponseBodyZoneRequestTopsZoneRequestTop setZoneName(String zoneName) {
            this.zoneName = zoneName;
            return this;
        }
        public String getZoneName() {
            return this.zoneName;
        }

    }

    public static class DescribeStatisticSummaryResponseBodyZoneRequestTops extends TeaModel {
        @NameInMap("ZoneRequestTop")
        public java.util.List<DescribeStatisticSummaryResponseBodyZoneRequestTopsZoneRequestTop> zoneRequestTop;

        public static DescribeStatisticSummaryResponseBodyZoneRequestTops build(java.util.Map<String, ?> map) throws Exception {
            DescribeStatisticSummaryResponseBodyZoneRequestTops self = new DescribeStatisticSummaryResponseBodyZoneRequestTops();
            return TeaModel.build(map, self);
        }

        public DescribeStatisticSummaryResponseBodyZoneRequestTops setZoneRequestTop(java.util.List<DescribeStatisticSummaryResponseBodyZoneRequestTopsZoneRequestTop> zoneRequestTop) {
            this.zoneRequestTop = zoneRequestTop;
            return this;
        }
        public java.util.List<DescribeStatisticSummaryResponseBodyZoneRequestTopsZoneRequestTop> getZoneRequestTop() {
            return this.zoneRequestTop;
        }

    }

}
