// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeAvailableDedicatedHostZonesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Zones")
    public DescribeAvailableDedicatedHostZonesResponseBodyZones zones;

    public static DescribeAvailableDedicatedHostZonesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableDedicatedHostZonesResponseBody self = new DescribeAvailableDedicatedHostZonesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableDedicatedHostZonesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAvailableDedicatedHostZonesResponseBody setZones(DescribeAvailableDedicatedHostZonesResponseBodyZones zones) {
        this.zones = zones;
        return this;
    }
    public DescribeAvailableDedicatedHostZonesResponseBodyZones getZones() {
        return this.zones;
    }

    public static class DescribeAvailableDedicatedHostZonesResponseBodyZonesDedicatedHostZones extends TeaModel {
        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("Description")
        public String description;

        public static DescribeAvailableDedicatedHostZonesResponseBodyZonesDedicatedHostZones build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableDedicatedHostZonesResponseBodyZonesDedicatedHostZones self = new DescribeAvailableDedicatedHostZonesResponseBodyZonesDedicatedHostZones();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableDedicatedHostZonesResponseBodyZonesDedicatedHostZones setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeAvailableDedicatedHostZonesResponseBodyZonesDedicatedHostZones setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

    public static class DescribeAvailableDedicatedHostZonesResponseBodyZones extends TeaModel {
        @NameInMap("DedicatedHostZones")
        public java.util.List<DescribeAvailableDedicatedHostZonesResponseBodyZonesDedicatedHostZones> dedicatedHostZones;

        public static DescribeAvailableDedicatedHostZonesResponseBodyZones build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableDedicatedHostZonesResponseBodyZones self = new DescribeAvailableDedicatedHostZonesResponseBodyZones();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableDedicatedHostZonesResponseBodyZones setDedicatedHostZones(java.util.List<DescribeAvailableDedicatedHostZonesResponseBodyZonesDedicatedHostZones> dedicatedHostZones) {
            this.dedicatedHostZones = dedicatedHostZones;
            return this;
        }
        public java.util.List<DescribeAvailableDedicatedHostZonesResponseBodyZonesDedicatedHostZones> getDedicatedHostZones() {
            return this.dedicatedHostZones;
        }

    }

}
