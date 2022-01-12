// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeZonesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Zones")
    public DescribeZonesResponseBodyZones zones;

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

    public DescribeZonesResponseBody setZones(DescribeZonesResponseBodyZones zones) {
        this.zones = zones;
        return this;
    }
    public DescribeZonesResponseBodyZones getZones() {
        return this.zones;
    }

    public static class DescribeZonesResponseBodyZonesKVStoreZone extends TeaModel {
        @NameInMap("Disabled")
        public Boolean disabled;

        @NameInMap("IsRds")
        public Boolean isRds;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("SwitchNetwork")
        public Boolean switchNetwork;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("ZoneName")
        public String zoneName;

        public static DescribeZonesResponseBodyZonesKVStoreZone build(java.util.Map<String, ?> map) throws Exception {
            DescribeZonesResponseBodyZonesKVStoreZone self = new DescribeZonesResponseBodyZonesKVStoreZone();
            return TeaModel.build(map, self);
        }

        public DescribeZonesResponseBodyZonesKVStoreZone setDisabled(Boolean disabled) {
            this.disabled = disabled;
            return this;
        }
        public Boolean getDisabled() {
            return this.disabled;
        }

        public DescribeZonesResponseBodyZonesKVStoreZone setIsRds(Boolean isRds) {
            this.isRds = isRds;
            return this;
        }
        public Boolean getIsRds() {
            return this.isRds;
        }

        public DescribeZonesResponseBodyZonesKVStoreZone setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeZonesResponseBodyZonesKVStoreZone setSwitchNetwork(Boolean switchNetwork) {
            this.switchNetwork = switchNetwork;
            return this;
        }
        public Boolean getSwitchNetwork() {
            return this.switchNetwork;
        }

        public DescribeZonesResponseBodyZonesKVStoreZone setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeZonesResponseBodyZonesKVStoreZone setZoneName(String zoneName) {
            this.zoneName = zoneName;
            return this;
        }
        public String getZoneName() {
            return this.zoneName;
        }

    }

    public static class DescribeZonesResponseBodyZones extends TeaModel {
        @NameInMap("KVStoreZone")
        public java.util.List<DescribeZonesResponseBodyZonesKVStoreZone> KVStoreZone;

        public static DescribeZonesResponseBodyZones build(java.util.Map<String, ?> map) throws Exception {
            DescribeZonesResponseBodyZones self = new DescribeZonesResponseBodyZones();
            return TeaModel.build(map, self);
        }

        public DescribeZonesResponseBodyZones setKVStoreZone(java.util.List<DescribeZonesResponseBodyZonesKVStoreZone> KVStoreZone) {
            this.KVStoreZone = KVStoreZone;
            return this;
        }
        public java.util.List<DescribeZonesResponseBodyZonesKVStoreZone> getKVStoreZone() {
            return this.KVStoreZone;
        }

    }

}
