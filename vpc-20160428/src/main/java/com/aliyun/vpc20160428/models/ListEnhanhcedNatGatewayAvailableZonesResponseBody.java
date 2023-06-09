// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListEnhanhcedNatGatewayAvailableZonesResponseBody extends TeaModel {
    /**
     * <p>The list of zones.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the zone where the instance is deployed.</p>
     */
    @NameInMap("Zones")
    public java.util.List<ListEnhanhcedNatGatewayAvailableZonesResponseBodyZones> zones;

    public static ListEnhanhcedNatGatewayAvailableZonesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEnhanhcedNatGatewayAvailableZonesResponseBody self = new ListEnhanhcedNatGatewayAvailableZonesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEnhanhcedNatGatewayAvailableZonesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEnhanhcedNatGatewayAvailableZonesResponseBody setZones(java.util.List<ListEnhanhcedNatGatewayAvailableZonesResponseBodyZones> zones) {
        this.zones = zones;
        return this;
    }
    public java.util.List<ListEnhanhcedNatGatewayAvailableZonesResponseBodyZones> getZones() {
        return this.zones;
    }

    public static class ListEnhanhcedNatGatewayAvailableZonesResponseBodyZones extends TeaModel {
        @NameInMap("LocalName")
        public String localName;

        /**
         * <p>The name of the zone.</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static ListEnhanhcedNatGatewayAvailableZonesResponseBodyZones build(java.util.Map<String, ?> map) throws Exception {
            ListEnhanhcedNatGatewayAvailableZonesResponseBodyZones self = new ListEnhanhcedNatGatewayAvailableZonesResponseBodyZones();
            return TeaModel.build(map, self);
        }

        public ListEnhanhcedNatGatewayAvailableZonesResponseBodyZones setLocalName(String localName) {
            this.localName = localName;
            return this;
        }
        public String getLocalName() {
            return this.localName;
        }

        public ListEnhanhcedNatGatewayAvailableZonesResponseBodyZones setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
