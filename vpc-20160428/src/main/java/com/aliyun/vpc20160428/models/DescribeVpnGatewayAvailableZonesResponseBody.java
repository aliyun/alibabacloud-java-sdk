// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVpnGatewayAvailableZonesResponseBody extends TeaModel {
    @NameInMap("AvailableZoneIdList")
    public java.util.List<DescribeVpnGatewayAvailableZonesResponseBodyAvailableZoneIdList> availableZoneIdList;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>29784052-931F-543D-A612-36B3838163FA</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
         */
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
