// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribeStatisticSummaryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("VpcRequestTops")
    public DescribeStatisticSummaryResponseBodyVpcRequestTops vpcRequestTops;

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
        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RegionName")
        public String regionName;

        @NameInMap("RequestCount")
        public Long requestCount;

        @NameInMap("TunnelId")
        public String tunnelId;

        /**
         * <p>VPC ID</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

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
        @NameInMap("BizType")
        public String bizType;

        @NameInMap("RequestCount")
        public Long requestCount;

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
