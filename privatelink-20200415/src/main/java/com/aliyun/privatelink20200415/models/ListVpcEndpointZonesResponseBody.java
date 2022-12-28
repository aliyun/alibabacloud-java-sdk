// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class ListVpcEndpointZonesResponseBody extends TeaModel {
    // The number of entries returned per page.
    @NameInMap("MaxResults")
    public Integer maxResults;

    // The token that is used for the next query. Valid values:
    // 
    // *   If **NextToken** is empty, it indicates that no next query is to be sent.
    // *   If a value of **NextToken** is returned, the value is the token that is used for the next query.
    @NameInMap("NextToken")
    public String nextToken;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The information about the zones.
    @NameInMap("Zones")
    public java.util.List<ListVpcEndpointZonesResponseBodyZones> zones;

    public static ListVpcEndpointZonesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVpcEndpointZonesResponseBody self = new ListVpcEndpointZonesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVpcEndpointZonesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListVpcEndpointZonesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListVpcEndpointZonesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListVpcEndpointZonesResponseBody setZones(java.util.List<ListVpcEndpointZonesResponseBodyZones> zones) {
        this.zones = zones;
        return this;
    }
    public java.util.List<ListVpcEndpointZonesResponseBodyZones> getZones() {
        return this.zones;
    }

    public static class ListVpcEndpointZonesResponseBodyZones extends TeaModel {
        // The ID of the endpoint ENI.
        @NameInMap("EniId")
        public String eniId;

        // The IP address of the endpoint ENI.
        @NameInMap("EniIp")
        public String eniIp;

        // The ID of the region to which the endpoint belongs.
        @NameInMap("RegionId")
        public String regionId;

        // The status of the endpoint service. Valid values:
        // 
        // *   **Creating**: The endpoint service is being created.
        // *   **Pending**: The endpoint service is being modified.
        // *   **Active**: The endpoint service is available.
        // *   **Deleting**: The endpoint service is being deleted.
        @NameInMap("ServiceStatus")
        public String serviceStatus;

        // The vSwitch of the zone. The system automatically creates an endpoint elastic network interface (ENI) in the vSwitch.
        @NameInMap("VSwitchId")
        public String vSwitchId;

        // The domain name of the zone.
        // 
        // After an endpoint is connected to an endpoint service, you can access the service resources in the endpoint service by using the domain name of the zone.
        @NameInMap("ZoneDomain")
        public String zoneDomain;

        // The ID of the zone.
        @NameInMap("ZoneId")
        public String zoneId;

        // Indicates whether the endpoint service supports IPv6. Valid values:
        // 
        // *   **true**: The endpoint supports IPv6.
        // *   **false**: The endpoint does not support IPv6. This is the default value.
        @NameInMap("ZoneIpv6Address")
        public String zoneIpv6Address;

        // The status of the zone. Valid values:
        // 
        // *   **Creating**: The zone is being created.
        // *   **Wait**: The zone is to be connected.
        // *   **Connected**: The zone is connected.
        // *   **Deleting**: The zone is being deleted.
        // *   **Disconnecting**: The zone is being disconnected.
        // *   **Disconnected**: The zone is disconnected.
        // *   **Connecting**: The zone is being connected.
        @NameInMap("ZoneStatus")
        public String zoneStatus;

        public static ListVpcEndpointZonesResponseBodyZones build(java.util.Map<String, ?> map) throws Exception {
            ListVpcEndpointZonesResponseBodyZones self = new ListVpcEndpointZonesResponseBodyZones();
            return TeaModel.build(map, self);
        }

        public ListVpcEndpointZonesResponseBodyZones setEniId(String eniId) {
            this.eniId = eniId;
            return this;
        }
        public String getEniId() {
            return this.eniId;
        }

        public ListVpcEndpointZonesResponseBodyZones setEniIp(String eniIp) {
            this.eniIp = eniIp;
            return this;
        }
        public String getEniIp() {
            return this.eniIp;
        }

        public ListVpcEndpointZonesResponseBodyZones setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListVpcEndpointZonesResponseBodyZones setServiceStatus(String serviceStatus) {
            this.serviceStatus = serviceStatus;
            return this;
        }
        public String getServiceStatus() {
            return this.serviceStatus;
        }

        public ListVpcEndpointZonesResponseBodyZones setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public ListVpcEndpointZonesResponseBodyZones setZoneDomain(String zoneDomain) {
            this.zoneDomain = zoneDomain;
            return this;
        }
        public String getZoneDomain() {
            return this.zoneDomain;
        }

        public ListVpcEndpointZonesResponseBodyZones setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public ListVpcEndpointZonesResponseBodyZones setZoneIpv6Address(String zoneIpv6Address) {
            this.zoneIpv6Address = zoneIpv6Address;
            return this;
        }
        public String getZoneIpv6Address() {
            return this.zoneIpv6Address;
        }

        public ListVpcEndpointZonesResponseBodyZones setZoneStatus(String zoneStatus) {
            this.zoneStatus = zoneStatus;
            return this;
        }
        public String getZoneStatus() {
            return this.zoneStatus;
        }

    }

}
