// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeAvailableDedicatedHostZonesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Zones")
    @Validation(required = true)
    public DescribeAvailableDedicatedHostZonesResponseZones zones;

    public static DescribeAvailableDedicatedHostZonesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableDedicatedHostZonesResponse self = new DescribeAvailableDedicatedHostZonesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableDedicatedHostZonesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAvailableDedicatedHostZonesResponse setZones(DescribeAvailableDedicatedHostZonesResponseZones zones) {
        this.zones = zones;
        return this;
    }
    public DescribeAvailableDedicatedHostZonesResponseZones getZones() {
        return this.zones;
    }

    public static class DescribeAvailableDedicatedHostZonesResponseZonesDedicatedHostZones extends TeaModel {
        @NameInMap("ZoneId")
        @Validation(required = true)
        public String zoneId;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        public static DescribeAvailableDedicatedHostZonesResponseZonesDedicatedHostZones build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableDedicatedHostZonesResponseZonesDedicatedHostZones self = new DescribeAvailableDedicatedHostZonesResponseZonesDedicatedHostZones();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableDedicatedHostZonesResponseZonesDedicatedHostZones setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeAvailableDedicatedHostZonesResponseZonesDedicatedHostZones setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

    public static class DescribeAvailableDedicatedHostZonesResponseZones extends TeaModel {
        @NameInMap("DedicatedHostZones")
        @Validation(required = true)
        public java.util.List<DescribeAvailableDedicatedHostZonesResponseZonesDedicatedHostZones> dedicatedHostZones;

        public static DescribeAvailableDedicatedHostZonesResponseZones build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableDedicatedHostZonesResponseZones self = new DescribeAvailableDedicatedHostZonesResponseZones();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableDedicatedHostZonesResponseZones setDedicatedHostZones(java.util.List<DescribeAvailableDedicatedHostZonesResponseZonesDedicatedHostZones> dedicatedHostZones) {
            this.dedicatedHostZones = dedicatedHostZones;
            return this;
        }
        public java.util.List<DescribeAvailableDedicatedHostZonesResponseZonesDedicatedHostZones> getDedicatedHostZones() {
            return this.dedicatedHostZones;
        }

    }

}
