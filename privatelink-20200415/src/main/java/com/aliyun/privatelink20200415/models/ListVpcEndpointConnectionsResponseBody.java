// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class ListVpcEndpointConnectionsResponseBody extends TeaModel {
    @NameInMap("Connections")
    public java.util.List<ListVpcEndpointConnectionsResponseBodyConnections> connections;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    public static ListVpcEndpointConnectionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVpcEndpointConnectionsResponseBody self = new ListVpcEndpointConnectionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVpcEndpointConnectionsResponseBody setConnections(java.util.List<ListVpcEndpointConnectionsResponseBodyConnections> connections) {
        this.connections = connections;
        return this;
    }
    public java.util.List<ListVpcEndpointConnectionsResponseBodyConnections> getConnections() {
        return this.connections;
    }

    public ListVpcEndpointConnectionsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListVpcEndpointConnectionsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListVpcEndpointConnectionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListVpcEndpointConnectionsResponseBodyConnectionsZones extends TeaModel {
        @NameInMap("EniId")
        public String eniId;

        @NameInMap("ReplacedEniId")
        public String replacedEniId;

        @NameInMap("ReplacedResourceId")
        public String replacedResourceId;

        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("ZoneDomain")
        public String zoneDomain;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("ZoneStatus")
        public String zoneStatus;

        public static ListVpcEndpointConnectionsResponseBodyConnectionsZones build(java.util.Map<String, ?> map) throws Exception {
            ListVpcEndpointConnectionsResponseBodyConnectionsZones self = new ListVpcEndpointConnectionsResponseBodyConnectionsZones();
            return TeaModel.build(map, self);
        }

        public ListVpcEndpointConnectionsResponseBodyConnectionsZones setEniId(String eniId) {
            this.eniId = eniId;
            return this;
        }
        public String getEniId() {
            return this.eniId;
        }

        public ListVpcEndpointConnectionsResponseBodyConnectionsZones setReplacedEniId(String replacedEniId) {
            this.replacedEniId = replacedEniId;
            return this;
        }
        public String getReplacedEniId() {
            return this.replacedEniId;
        }

        public ListVpcEndpointConnectionsResponseBodyConnectionsZones setReplacedResourceId(String replacedResourceId) {
            this.replacedResourceId = replacedResourceId;
            return this;
        }
        public String getReplacedResourceId() {
            return this.replacedResourceId;
        }

        public ListVpcEndpointConnectionsResponseBodyConnectionsZones setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ListVpcEndpointConnectionsResponseBodyConnectionsZones setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public ListVpcEndpointConnectionsResponseBodyConnectionsZones setZoneDomain(String zoneDomain) {
            this.zoneDomain = zoneDomain;
            return this;
        }
        public String getZoneDomain() {
            return this.zoneDomain;
        }

        public ListVpcEndpointConnectionsResponseBodyConnectionsZones setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public ListVpcEndpointConnectionsResponseBodyConnectionsZones setZoneStatus(String zoneStatus) {
            this.zoneStatus = zoneStatus;
            return this;
        }
        public String getZoneStatus() {
            return this.zoneStatus;
        }

    }

    public static class ListVpcEndpointConnectionsResponseBodyConnections extends TeaModel {
        @NameInMap("Bandwidth")
        public Integer bandwidth;

        @NameInMap("ConnectionStatus")
        public String connectionStatus;

        @NameInMap("EndpointId")
        public String endpointId;

        @NameInMap("EndpointOwnerId")
        public Long endpointOwnerId;

        @NameInMap("EndpointVpcId")
        public String endpointVpcId;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("ResourceOwner")
        public Boolean resourceOwner;

        @NameInMap("ServiceId")
        public String serviceId;

        @NameInMap("Zones")
        public java.util.List<ListVpcEndpointConnectionsResponseBodyConnectionsZones> zones;

        public static ListVpcEndpointConnectionsResponseBodyConnections build(java.util.Map<String, ?> map) throws Exception {
            ListVpcEndpointConnectionsResponseBodyConnections self = new ListVpcEndpointConnectionsResponseBodyConnections();
            return TeaModel.build(map, self);
        }

        public ListVpcEndpointConnectionsResponseBodyConnections setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public ListVpcEndpointConnectionsResponseBodyConnections setConnectionStatus(String connectionStatus) {
            this.connectionStatus = connectionStatus;
            return this;
        }
        public String getConnectionStatus() {
            return this.connectionStatus;
        }

        public ListVpcEndpointConnectionsResponseBodyConnections setEndpointId(String endpointId) {
            this.endpointId = endpointId;
            return this;
        }
        public String getEndpointId() {
            return this.endpointId;
        }

        public ListVpcEndpointConnectionsResponseBodyConnections setEndpointOwnerId(Long endpointOwnerId) {
            this.endpointOwnerId = endpointOwnerId;
            return this;
        }
        public Long getEndpointOwnerId() {
            return this.endpointOwnerId;
        }

        public ListVpcEndpointConnectionsResponseBodyConnections setEndpointVpcId(String endpointVpcId) {
            this.endpointVpcId = endpointVpcId;
            return this;
        }
        public String getEndpointVpcId() {
            return this.endpointVpcId;
        }

        public ListVpcEndpointConnectionsResponseBodyConnections setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public ListVpcEndpointConnectionsResponseBodyConnections setResourceOwner(Boolean resourceOwner) {
            this.resourceOwner = resourceOwner;
            return this;
        }
        public Boolean getResourceOwner() {
            return this.resourceOwner;
        }

        public ListVpcEndpointConnectionsResponseBodyConnections setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public ListVpcEndpointConnectionsResponseBodyConnections setZones(java.util.List<ListVpcEndpointConnectionsResponseBodyConnectionsZones> zones) {
            this.zones = zones;
            return this;
        }
        public java.util.List<ListVpcEndpointConnectionsResponseBodyConnectionsZones> getZones() {
            return this.zones;
        }

    }

}
