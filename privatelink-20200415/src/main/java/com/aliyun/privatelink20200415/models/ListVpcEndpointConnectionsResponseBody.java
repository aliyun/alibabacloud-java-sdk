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
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The returned value of NextToken is a pagination token, which can be used in the next request to retrieve a new page of results. Valid values:</p>
     * <ul>
     * <li>If no value is returned for <strong>NextToken</strong>, no next requests are performed.</li>
     * <li>If a value is returned for <strong>NextToken</strong>, the value can be used in the next request to retrieve a new page of results.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0ED8D006-F706-4D23-88ED-E11ED28DCAC0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
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
         * <p>The endpoint ENI ID.</p>
         * 
         * <strong>example:</strong>
         * <p>eni-hp32lk0pyv6o94hs****</p>
         */
        @NameInMap("EniId")
        public String eniId;

        /**
         * <p>The ID of the replaced endpoint ENI in smooth migration scenarios.</p>
         * 
         * <strong>example:</strong>
         * <p>eni-hp32lk0pyv6o94hs****</p>
         */
        @NameInMap("ReplacedEniId")
        public String replacedEniId;

        /**
         * <p>The ID of the replaced service resource in smooth migration scenarios.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-hp32z1wp5peaoox2q****</p>
         */
        @NameInMap("ReplacedResourceId")
        public String replacedResourceId;

        /**
         * <p>The service resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-hp32z1wp5peaoox2q****</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The ID of the vSwitch to which the endpoint belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-hp3uf6045ljdhd5zr****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The domain name of the zone.</p>
         * 
         * <strong>example:</strong>
         * <p>ep-hp34jaz8ykl0exwt****-cn-huhehaote.epsrv-hp3vpx8yqxblby3i****.cn-huhehaote-b.privatelink.aliyuncs.com</p>
         */
        @NameInMap("ZoneDomain")
        public String zoneDomain;

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-huhehaote-b</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        /**
         * <p>The state of the zone. Valid values:</p>
         * <ul>
         * <li><strong>Creating</strong>: The zone is being created.</li>
         * <li><strong>Wait</strong>: The zone is to be connected.</li>
         * <li><strong>Connected</strong>: The zone is connected.</li>
         * <li><strong>Deleting</strong>: The zone is being deleted.</li>
         * <li><strong>Disconnecting</strong>: The zone is being disconnected.</li>
         * <li><strong>Disconnected</strong>: The zone is disconnected.</li>
         * <li><strong>Connecting</strong>: The zone is being connected.</li>
         * <li><strong>Migrating</strong>: The zone is being migrated.</li>
         * <li><strong>Migrated</strong>: The zone is migrated.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Connected</p>
         */
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
        /**
         * <p>The bandwidth of the endpoint connection. Valid values: <strong>1024 to 10240</strong>. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("Bandwidth")
        public Integer bandwidth;

        /**
         * <p>The state of the endpoint connection. Valid values:</p>
         * <ul>
         * <li><strong>Pending</strong>: The connection is being modified.</li>
         * <li><strong>Connecting</strong>: The connection is being established.</li>
         * <li><strong>Connected</strong>: The connection is established.</li>
         * <li><strong>Disconnecting</strong>: The endpoint is being disconnected from the endpoint service.</li>
         * <li><strong>Disconnected</strong>: The endpoint is disconnected from the endpoint service.</li>
         * <li><strong>Deleting</strong>: The connection is being deleted.</li>
         * <li><strong>ServiceDeleted</strong>: The corresponding endpoint service has been deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Disconnected</p>
         */
        @NameInMap("ConnectionStatus")
        public String connectionStatus;

        /**
         * <p>The endpoint ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ep-hp33b2e43fays7s8****</p>
         */
        @NameInMap("EndpointId")
        public String endpointId;

        /**
         * <p>The ID of the Alibaba Cloud account to which the endpoint belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>25346073170691****</p>
         */
        @NameInMap("EndpointOwnerId")
        public Long endpointOwnerId;

        /**
         * <p>The ID of the virtual private cloud (VPC) to which the endpoint belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-hp356stwkxg3fn2xe****</p>
         */
        @NameInMap("EndpointVpcId")
        public String endpointVpcId;

        /**
         * <p>The time when the endpoint connection was modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-09-28T10:34:46Z</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <p>The ID of the resource group to which the endpoint belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmw353z35v***</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>Indicates whether the endpoint and the endpoint service belong to the same Alibaba Cloud account. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ResourceOwner")
        public Boolean resourceOwner;

        /**
         * <p>The endpoint service ID.</p>
         * 
         * <strong>example:</strong>
         * <p>epsrv-hp3vpx8yqxblby3i****</p>
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
