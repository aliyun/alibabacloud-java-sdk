// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeZonesResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of zones.</p>
     */
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

    public static class DescribeZonesResponseBodyZonesZoneSlaveZonesSlaveZone extends TeaModel {
        /**
         * <p>The name of the secondary zone.</p>
         */
        @NameInMap("LocalName")
        public String localName;

        /**
         * <p>The ID of the secondary zone.</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeZonesResponseBodyZonesZoneSlaveZonesSlaveZone build(java.util.Map<String, ?> map) throws Exception {
            DescribeZonesResponseBodyZonesZoneSlaveZonesSlaveZone self = new DescribeZonesResponseBodyZonesZoneSlaveZonesSlaveZone();
            return TeaModel.build(map, self);
        }

        public DescribeZonesResponseBodyZonesZoneSlaveZonesSlaveZone setLocalName(String localName) {
            this.localName = localName;
            return this;
        }
        public String getLocalName() {
            return this.localName;
        }

        public DescribeZonesResponseBodyZonesZoneSlaveZonesSlaveZone setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeZonesResponseBodyZonesZoneSlaveZones extends TeaModel {
        @NameInMap("SlaveZone")
        public java.util.List<DescribeZonesResponseBodyZonesZoneSlaveZonesSlaveZone> slaveZone;

        public static DescribeZonesResponseBodyZonesZoneSlaveZones build(java.util.Map<String, ?> map) throws Exception {
            DescribeZonesResponseBodyZonesZoneSlaveZones self = new DescribeZonesResponseBodyZonesZoneSlaveZones();
            return TeaModel.build(map, self);
        }

        public DescribeZonesResponseBodyZonesZoneSlaveZones setSlaveZone(java.util.List<DescribeZonesResponseBodyZonesZoneSlaveZonesSlaveZone> slaveZone) {
            this.slaveZone = slaveZone;
            return this;
        }
        public java.util.List<DescribeZonesResponseBodyZonesZoneSlaveZonesSlaveZone> getSlaveZone() {
            return this.slaveZone;
        }

    }

    public static class DescribeZonesResponseBodyZonesZone extends TeaModel {
        /**
         * <p>The name of the zone.</p>
         */
        @NameInMap("LocalName")
        public String localName;

        /**
         * <p>The list of secondary zones.</p>
         */
        @NameInMap("SlaveZones")
        public DescribeZonesResponseBodyZonesZoneSlaveZones slaveZones;

        /**
         * <p>The ID of the zone.</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeZonesResponseBodyZonesZone build(java.util.Map<String, ?> map) throws Exception {
            DescribeZonesResponseBodyZonesZone self = new DescribeZonesResponseBodyZonesZone();
            return TeaModel.build(map, self);
        }

        public DescribeZonesResponseBodyZonesZone setLocalName(String localName) {
            this.localName = localName;
            return this;
        }
        public String getLocalName() {
            return this.localName;
        }

        public DescribeZonesResponseBodyZonesZone setSlaveZones(DescribeZonesResponseBodyZonesZoneSlaveZones slaveZones) {
            this.slaveZones = slaveZones;
            return this;
        }
        public DescribeZonesResponseBodyZonesZoneSlaveZones getSlaveZones() {
            return this.slaveZones;
        }

        public DescribeZonesResponseBodyZonesZone setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeZonesResponseBodyZones extends TeaModel {
        @NameInMap("Zone")
        public java.util.List<DescribeZonesResponseBodyZonesZone> zone;

        public static DescribeZonesResponseBodyZones build(java.util.Map<String, ?> map) throws Exception {
            DescribeZonesResponseBodyZones self = new DescribeZonesResponseBodyZones();
            return TeaModel.build(map, self);
        }

        public DescribeZonesResponseBodyZones setZone(java.util.List<DescribeZonesResponseBodyZonesZone> zone) {
            this.zone = zone;
            return this;
        }
        public java.util.List<DescribeZonesResponseBodyZonesZone> getZone() {
            return this.zone;
        }

    }

}
