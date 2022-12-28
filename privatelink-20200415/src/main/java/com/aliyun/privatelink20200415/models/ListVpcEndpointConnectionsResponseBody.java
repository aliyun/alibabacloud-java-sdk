// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class ListVpcEndpointConnectionsResponseBody extends TeaModel {
    // The information about the endpoint connections.
    @NameInMap("Connections")
    public java.util.List<ListVpcEndpointConnectionsResponseBodyConnections> connections;

    // The number of entries returned per page.
    @NameInMap("MaxResults")
    public Integer maxResults;

    // The token that is used for the next query. Valid values:
    // 
    // *   If **NextToken** is empty, no next query is to be sent.
    // *   If a value of **NextToken** is returned, the value is the token that is used for the next query.
    @NameInMap("NextToken")
    public String nextToken;

    // The ID of the request.
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
        // The ID of the endpoint connection.
        // 
        // >  This parameter is returned only when a gateway is used for load balancing.
        @NameInMap("ConnectionId")
        public Long connectionId;

        // The ID of the endpoint connection.
        // 
        // >  This parameter is returned only when a gateway is used for load balancing. This parameter returns the value of the **ConnectionId** parameter as a **string**.
        @NameInMap("ConnectionStringId")
        public String connectionStringId;

        // The ID of the endpoint elastic network interface (ENI).
        @NameInMap("EniId")
        public String eniId;

        // The ID of the replaced endpoint ENI in smooth migration scenarios.
        @NameInMap("ReplacedEniId")
        public String replacedEniId;

        // The ID of the replaced service resource in smooth migration scenarios.
        @NameInMap("ReplacedResourceId")
        public String replacedResourceId;

        // The ID of the service resource.
        @NameInMap("ResourceId")
        public String resourceId;

        // The vSwitch to which the endpoint belongs.
        @NameInMap("VSwitchId")
        public String vSwitchId;

        // The domain name of the zone.
        @NameInMap("ZoneDomain")
        public String zoneDomain;

        // The ID of the zone.
        @NameInMap("ZoneId")
        public String zoneId;

        // The status of the zone. Valid values:
        // 
        // *   **Creating**: being created.
        // *   **Wait**: to be connected.
        // *   **Connected**: connected.
        // *   **Deleting**: being deleted.
        // *   **Disconnecting**: disconnecting.
        // *   **Disconnected**: disconnected.
        // *   **Connecting**: connecting.
        // *   **Migrating**: being migrated.
        // *   **Migrated**: migrated.
        @NameInMap("ZoneStatus")
        public String zoneStatus;

        public static ListVpcEndpointConnectionsResponseBodyConnectionsZones build(java.util.Map<String, ?> map) throws Exception {
            ListVpcEndpointConnectionsResponseBodyConnectionsZones self = new ListVpcEndpointConnectionsResponseBodyConnectionsZones();
            return TeaModel.build(map, self);
        }

        public ListVpcEndpointConnectionsResponseBodyConnectionsZones setConnectionId(Long connectionId) {
            this.connectionId = connectionId;
            return this;
        }
        public Long getConnectionId() {
            return this.connectionId;
        }

        public ListVpcEndpointConnectionsResponseBodyConnectionsZones setConnectionStringId(String connectionStringId) {
            this.connectionStringId = connectionStringId;
            return this;
        }
        public String getConnectionStringId() {
            return this.connectionStringId;
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
        // The bandwidth of the endpoint connection. Unit: Mbit/s. Valid values: **1024 to 10240**.
        @NameInMap("Bandwidth")
        public Integer bandwidth;

        // The status of the endpoint connection. Valid values:
        // 
        // *   **Pending**: being modified.
        // *   **Connecting**: connecting.
        // *   **Connected**: connected.
        // *   **Disconnecting**: disconnecting.
        // *   **Disconnected**: disconnected.
        // *   **Deleting**: being deleted.
        // *   **ServiceDeleted**: The corresponding endpoint service is deleted.
        @NameInMap("ConnectionStatus")
        public String connectionStatus;

        // The ID of the endpoint.
        @NameInMap("EndpointId")
        public String endpointId;

        // The ID of the Alibaba Cloud account to which the endpoint belongs.
        @NameInMap("EndpointOwnerId")
        public Long endpointOwnerId;

        // The virtual private cloud (VPC) to which the endpoint belongs.
        @NameInMap("EndpointVpcId")
        public String endpointVpcId;

        // The time when the endpoint connection was modified.
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        // The ID of the resource group to which the endpoint belongs.
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        // Indicates whether the endpoint and the endpoint service belong to the same Alibaba Cloud account. Valid values:
        // 
        // *   **true**: yes
        // *   **false**: no
        @NameInMap("ResourceOwner")
        public Boolean resourceOwner;

        // The ID of the endpoint service.
        @NameInMap("ServiceId")
        public String serviceId;

        // The information about the zones.
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

        public ListVpcEndpointConnectionsResponseBodyConnections setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
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
