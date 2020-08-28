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

    }

    public static class DescribeAvailableDedicatedHostZonesResponseZones extends TeaModel {
        @NameInMap("DedicatedHostZones")
        @Validation(required = true)
        public java.util.List<DescribeAvailableDedicatedHostZonesResponseZonesDedicatedHostZones> dedicatedHostZones;

        public static DescribeAvailableDedicatedHostZonesResponseZones build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableDedicatedHostZonesResponseZones self = new DescribeAvailableDedicatedHostZonesResponseZones();
            return TeaModel.build(map, self);
        }

    }

}
