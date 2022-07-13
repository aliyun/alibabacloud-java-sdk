// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class ListVpcEndpointZonesResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("EniId")
        public String eniId;

        @NameInMap("EniIp")
        public String eniIp;

        @NameInMap("NsiIndex")
        public Long nsiIndex;

        @NameInMap("NsiIndexString")
        public String nsiIndexString;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ServiceStatus")
        public String serviceStatus;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("ZoneDomain")
        public String zoneDomain;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("ZoneIpv6Address")
        public String zoneIpv6Address;

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

        public ListVpcEndpointZonesResponseBodyZones setNsiIndex(Long nsiIndex) {
            this.nsiIndex = nsiIndex;
            return this;
        }
        public Long getNsiIndex() {
            return this.nsiIndex;
        }

        public ListVpcEndpointZonesResponseBodyZones setNsiIndexString(String nsiIndexString) {
            this.nsiIndexString = nsiIndexString;
            return this;
        }
        public String getNsiIndexString() {
            return this.nsiIndexString;
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
