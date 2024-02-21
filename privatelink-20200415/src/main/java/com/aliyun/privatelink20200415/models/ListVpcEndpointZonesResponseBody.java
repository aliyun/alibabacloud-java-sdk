// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class ListVpcEndpointZonesResponseBody extends TeaModel {
    /**
     * <p>The number of entries returned on each page.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The returned value of NextToken is a pagination token, which can be used in the next request to retrieve a new page of results. Valid values:</p>
     * <br>
     * <p>*   If no value is returned for **NextToken**, no next requests are performed.</p>
     * <p>*   If a value is returned for **NextToken**, the value can be used in the next request to retrieve a new page of results.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the zones.</p>
     */
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
        /**
         * <p>The ID of the endpoint ENI.</p>
         */
        @NameInMap("EniId")
        public String eniId;

        /**
         * <p>The IP address of the endpoint ENI.</p>
         */
        @NameInMap("EniIp")
        public String eniIp;

        /**
         * <p>The region ID of the endpoint.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the vSwitch in the zone. The system automatically creates an endpoint elastic network interface (ENI) in the vSwitch.</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The domain name of the zone.</p>
         * <br>
         * <p>After the endpoint in the zone is connected to the endpoint service, you can access the service resources of the endpoint service by using the domain name of the zone.</p>
         */
        @NameInMap("ZoneDomain")
        public String zoneDomain;

        /**
         * <p>The zone ID.</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        /**
         * <p>Indicates whether the endpoint service supports IPv6. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false** (default)</p>
         */
        @NameInMap("ZoneIpv6Address")
        public String zoneIpv6Address;

        /**
         * <p>The state of the zone. Valid values:</p>
         * <br>
         * <p>*   **Creating**: The zone is being created.</p>
         * <p>*   **Wait**: The zone is to be connected.</p>
         * <p>*   **Connected**: The zone is connected.</p>
         * <p>*   **Deleting**: The zone is being deleted.</p>
         * <p>*   **Disconnecting**: The zone is being disconnected.</p>
         * <p>*   **Disconnected**: The zone is disconnected.</p>
         * <p>*   **Connecting**: The zone is being connected.</p>
         */
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
