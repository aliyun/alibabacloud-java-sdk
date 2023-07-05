// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class ListVpcEndpointConnectionsResponseBody extends TeaModel {
    /**
     * <p>The endpoint connections.</p>
     */
    @NameInMap("Connections")
    public java.util.List<ListVpcEndpointConnectionsResponseBodyConnections> connections;

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

    @NameInMap("TotalCount")
    public String totalCount;

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

    public ListVpcEndpointConnectionsResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class ListVpcEndpointConnectionsResponseBodyConnectionsZones extends TeaModel {
        /**
         * <p>The endpoint connection ID.</p>
         * <br>
         * <p>> This parameter is returned only when a gateway is used for load balancing.</p>
         */
        @NameInMap("ConnectionId")
        public Long connectionId;

        /**
         * <p>The endpoint connection ID.</p>
         * <br>
         * <p>> This parameter is returned only when a gateway is used for load balancing. The value of this parameter is the value of the **ConnectionId** parameter in **string** format.</p>
         */
        @NameInMap("ConnectionStringId")
        public String connectionStringId;

        /**
         * <p>The endpoint ENI ID.</p>
         */
        @NameInMap("EniId")
        public String eniId;

        /**
         * <p>The ID of the replaced endpoint ENI in smooth migration scenarios.</p>
         */
        @NameInMap("ReplacedEniId")
        public String replacedEniId;

        /**
         * <p>The ID of the replaced service resource in smooth migration scenarios.</p>
         */
        @NameInMap("ReplacedResourceId")
        public String replacedResourceId;

        /**
         * <p>The service resource ID.</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The ID of the vSwitch to which the endpoint belongs.</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The domain name of the zone.</p>
         */
        @NameInMap("ZoneDomain")
        public String zoneDomain;

        /**
         * <p>The zone ID.</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

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
         * <p>*   **Migrating**: The zone is being migrated.</p>
         * <p>*   **Migrated**: The zone is migrated.</p>
         */
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
        /**
         * <p>The bandwidth of the endpoint connection. Valid values: **1024 to 10240**. Unit: Mbit/s.</p>
         */
        @NameInMap("Bandwidth")
        public Integer bandwidth;

        /**
         * <p>The state of the endpoint connection. Valid values:</p>
         * <br>
         * <p>*   **Pending**: The connection is being modified.</p>
         * <p>*   **Connecting**: The connection is being established.</p>
         * <p>*   **Connected**: The connection is established.</p>
         * <p>*   **Disconnecting**: The endpoint is being disconnected from the endpoint service.</p>
         * <p>*   **Disconnected**: The endpoint is disconnected from the endpoint service.</p>
         * <p>*   **Deleting**: The connection is being deleted.</p>
         * <p>*   **ServiceDeleted**: The corresponding endpoint service has been deleted.</p>
         */
        @NameInMap("ConnectionStatus")
        public String connectionStatus;

        /**
         * <p>The endpoint ID.</p>
         */
        @NameInMap("EndpointId")
        public String endpointId;

        /**
         * <p>The ID of the Alibaba Cloud account to which the endpoint belongs.</p>
         */
        @NameInMap("EndpointOwnerId")
        public Long endpointOwnerId;

        /**
         * <p>The ID of the virtual private cloud (VPC) to which the endpoint belongs.</p>
         */
        @NameInMap("EndpointVpcId")
        public String endpointVpcId;

        /**
         * <p>The time when the endpoint connection was modified.</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <p>The ID of the resource group to which the endpoint belongs.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>Indicates whether the endpoint and the endpoint service belong to the same Alibaba Cloud account. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("ResourceOwner")
        public Boolean resourceOwner;

        /**
         * <p>The endpoint service ID.</p>
         */
        @NameInMap("ServiceId")
        public String serviceId;

        /**
         * <p>The zones.</p>
         */
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
