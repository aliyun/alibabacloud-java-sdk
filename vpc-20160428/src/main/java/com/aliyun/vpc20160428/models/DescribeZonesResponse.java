// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeZonesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Zones")
    @Validation(required = true)
    public DescribeZonesResponseZones zones;

    public static DescribeZonesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeZonesResponse self = new DescribeZonesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeZonesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeZonesResponse setZones(DescribeZonesResponseZones zones) {
        this.zones = zones;
        return this;
    }
    public DescribeZonesResponseZones getZones() {
        return this.zones;
    }

    public static class DescribeZonesResponseZonesZone extends TeaModel {
        @NameInMap("ZoneId")
        @Validation(required = true)
        public String zoneId;

        @NameInMap("LocalName")
        @Validation(required = true)
        public String localName;

        public static DescribeZonesResponseZonesZone build(java.util.Map<String, ?> map) throws Exception {
            DescribeZonesResponseZonesZone self = new DescribeZonesResponseZonesZone();
            return TeaModel.build(map, self);
        }

        public DescribeZonesResponseZonesZone setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeZonesResponseZonesZone setLocalName(String localName) {
            this.localName = localName;
            return this;
        }
        public String getLocalName() {
            return this.localName;
        }

    }

    public static class DescribeZonesResponseZones extends TeaModel {
        @NameInMap("Zone")
        @Validation(required = true)
        public java.util.List<DescribeZonesResponseZonesZone> zone;

        public static DescribeZonesResponseZones build(java.util.Map<String, ?> map) throws Exception {
            DescribeZonesResponseZones self = new DescribeZonesResponseZones();
            return TeaModel.build(map, self);
        }

        public DescribeZonesResponseZones setZone(java.util.List<DescribeZonesResponseZonesZone> zone) {
            this.zone = zone;
            return this;
        }
        public java.util.List<DescribeZonesResponseZonesZone> getZone() {
            return this.zone;
        }

    }

}
