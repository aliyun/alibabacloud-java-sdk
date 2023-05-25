// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeZonesResponseBody extends TeaModel {
    /**
     * <p>```</p>
     * <p>http(s)://[Endpoint]/?Action=DescribeZones</p>
     * <p>&Series=normal</p>
     * <p>&DeployType=single</p>
     * <p>&Common request parameters</p>
     * <p>```</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>You can call this operation to learn of zones where a cluster can be created in an Alibaba Cloud region.</p>
     */
    @NameInMap("Zones")
    public java.util.List<DescribeZonesResponseBodyZones> zones;

    public static DescribeZonesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeZonesResponseBody self = new DescribeZonesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeZonesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeZonesResponseBody setZones(java.util.List<DescribeZonesResponseBodyZones> zones) {
        this.zones = zones;
        return this;
    }
    public java.util.List<DescribeZonesResponseBodyZones> getZones() {
        return this.zones;
    }

    public static class DescribeZonesResponseBodyZones extends TeaModel {
        @NameInMap("DeployType")
        public String deployType;

        @NameInMap("Series")
        public String series;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("ZoneName")
        public String zoneName;

        public static DescribeZonesResponseBodyZones build(java.util.Map<String, ?> map) throws Exception {
            DescribeZonesResponseBodyZones self = new DescribeZonesResponseBodyZones();
            return TeaModel.build(map, self);
        }

        public DescribeZonesResponseBodyZones setDeployType(String deployType) {
            this.deployType = deployType;
            return this;
        }
        public String getDeployType() {
            return this.deployType;
        }

        public DescribeZonesResponseBodyZones setSeries(String series) {
            this.series = series;
            return this;
        }
        public String getSeries() {
            return this.series;
        }

        public DescribeZonesResponseBodyZones setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeZonesResponseBodyZones setZoneName(String zoneName) {
            this.zoneName = zoneName;
            return this;
        }
        public String getZoneName() {
            return this.zoneName;
        }

    }

}
