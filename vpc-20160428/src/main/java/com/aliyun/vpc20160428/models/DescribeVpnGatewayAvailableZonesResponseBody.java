// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVpnGatewayAvailableZonesResponseBody extends TeaModel {
    @NameInMap("AvailableZoneIdList")
    public java.util.List<DescribeVpnGatewayAvailableZonesResponseBodyAvailableZoneIdList> availableZoneIdList;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeVpnGatewayAvailableZonesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpnGatewayAvailableZonesResponseBody self = new DescribeVpnGatewayAvailableZonesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVpnGatewayAvailableZonesResponseBody setAvailableZoneIdList(java.util.List<DescribeVpnGatewayAvailableZonesResponseBodyAvailableZoneIdList> availableZoneIdList) {
        this.availableZoneIdList = availableZoneIdList;
        return this;
    }
    public java.util.List<DescribeVpnGatewayAvailableZonesResponseBodyAvailableZoneIdList> getAvailableZoneIdList() {
        return this.availableZoneIdList;
    }

    public DescribeVpnGatewayAvailableZonesResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeVpnGatewayAvailableZonesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeVpnGatewayAvailableZonesResponseBodyAvailableZoneIdList extends TeaModel {
        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("ZoneName")
        public String zoneName;

        public static DescribeVpnGatewayAvailableZonesResponseBodyAvailableZoneIdList build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnGatewayAvailableZonesResponseBodyAvailableZoneIdList self = new DescribeVpnGatewayAvailableZonesResponseBodyAvailableZoneIdList();
            return TeaModel.build(map, self);
        }

        public DescribeVpnGatewayAvailableZonesResponseBodyAvailableZoneIdList setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeVpnGatewayAvailableZonesResponseBodyAvailableZoneIdList setZoneName(String zoneName) {
            this.zoneName = zoneName;
            return this;
        }
        public String getZoneName() {
            return this.zoneName;
        }

    }

}
