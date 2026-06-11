// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class ListVpcEndpointsResponseBody extends TeaModel {
    /**
     * <p>A list of endpoints.</p>
     */
    @NameInMap("Endpoints")
    public java.util.List<ListVpcEndpointsResponseBodyEndpoints> endpoints;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token to retrieve the next page of results.</p>
     * <ul>
     * <li><p>If <strong>NextToken</strong> is empty, no next page exists.</p>
     * </li>
     * <li><p>If a value is returned, use it in your next request to retrieve the next page of results.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a****</p>
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
     * <p>The total number of entries that match the query.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListVpcEndpointsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVpcEndpointsResponseBody self = new ListVpcEndpointsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVpcEndpointsResponseBody setEndpoints(java.util.List<ListVpcEndpointsResponseBodyEndpoints> endpoints) {
        this.endpoints = endpoints;
        return this;
    }
    public java.util.List<ListVpcEndpointsResponseBodyEndpoints> getEndpoints() {
        return this.endpoints;
    }

    public ListVpcEndpointsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListVpcEndpointsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListVpcEndpointsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListVpcEndpointsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListVpcEndpointsResponseBodyEndpointsTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceJoshua</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListVpcEndpointsResponseBodyEndpointsTags build(java.util.Map<String, ?> map) throws Exception {
            ListVpcEndpointsResponseBodyEndpointsTags self = new ListVpcEndpointsResponseBodyEndpointsTags();
            return TeaModel.build(map, self);
        }

        public ListVpcEndpointsResponseBodyEndpointsTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListVpcEndpointsResponseBodyEndpointsTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListVpcEndpointsResponseBodyEndpoints extends TeaModel {
        /**
         * <p>The IP address family. Valid values:</p>
         * <ul>
         * <li><p><strong>IPv4</strong>: IPv4.</p>
         * </li>
         * <li><p><strong>DualStack</strong>: dual stack.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>IPv4</p>
         */
        @NameInMap("AddressIpVersion")
        public String addressIpVersion;

        /**
         * <p>The connection bandwidth of the endpoint, in Mbps.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("Bandwidth")
        public Long bandwidth;

        /**
         * <p>The connection status of the endpoint. Valid values:</p>
         * <ul>
         * <li><p><strong>Pending</strong>: The connection is being modified.</p>
         * </li>
         * <li><p><strong>Connecting</strong>: The endpoint is being connected.</p>
         * </li>
         * <li><p><strong>Connected</strong>: The endpoint is connected.</p>
         * </li>
         * <li><p><strong>Disconnecting</strong>: The endpoint is being disconnected.</p>
         * </li>
         * <li><p><strong>Disconnected</strong>: The endpoint is disconnected.</p>
         * </li>
         * <li><p><strong>Deleting</strong>: The endpoint is being deleted.</p>
         * </li>
         * <li><p><strong>ServiceDeleted</strong>: The associated endpoint service has been deleted.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Disconnected</p>
         */
        @NameInMap("ConnectionStatus")
        public String connectionStatus;

        /**
         * <p>The time when the endpoint was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-09-24T18:00:07Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The bandwidth of the cross-region connection, in Mbps.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("CrossRegionBandwidth")
        public Integer crossRegionBandwidth;

        /**
         * <p>The business status of the endpoint. Valid values:</p>
         * <ul>
         * <li><p><strong>Normal</strong>: The endpoint is running as expected.</p>
         * </li>
         * <li><p><strong>FinancialLocked</strong>: The endpoint is locked due to an overdue payment.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("EndpointBusinessStatus")
        public String endpointBusinessStatus;

        /**
         * <p>The description of the endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>This is my Endpoint.</p>
         */
        @NameInMap("EndpointDescription")
        public String endpointDescription;

        /**
         * <p>The domain name of the endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>ep-hp33b2e43fays7s8****.epsrv-hp3xdsq46ael67lo****.cn-huhehaote.privatelink.aliyuncs.com</p>
         */
        @NameInMap("EndpointDomain")
        public String endpointDomain;

        /**
         * <p>The ID of the endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>ep-hp33b2e43fays7s8****</p>
         */
        @NameInMap("EndpointId")
        public String endpointId;

        /**
         * <p>The name of the endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("EndpointName")
        public String endpointName;

        /**
         * <p>The status of the endpoint. Valid values:</p>
         * <ul>
         * <li><p><strong>Creating</strong>: The endpoint is being created.</p>
         * </li>
         * <li><p><strong>Active</strong>: The endpoint is available.</p>
         * </li>
         * <li><p><strong>Pending</strong>: The endpoint is being modified.</p>
         * </li>
         * <li><p><strong>Deleting</strong>: The endpoint is being deleted.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("EndpointStatus")
        public String endpointStatus;

        /**
         * <p>The type of the endpoint. Valid values:</p>
         * <ul>
         * <li><p><strong>Interface</strong>: an interface endpoint.</p>
         * </li>
         * <li><p><strong>Reverse</strong>: a reverse endpoint.</p>
         * </li>
         * <li><p><strong>GatewayLoadBalancer</strong>: a gateway load balancer endpoint.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Interface</p>
         */
        @NameInMap("EndpointType")
        public String endpointType;

        /**
         * <p>The RAM access policy. For details on the policy syntax, see <a href="https://help.aliyun.com/document_detail/93738.html">Basic elements of a RAM policy</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{\n  \&quot;Version\&quot;: \&quot;1\&quot;,\n  \&quot;Statement\&quot;: [\n    {\n      \&quot;Effect\&quot;: \&quot;Allow\&quot;,\n      \&quot;Action\&quot;: \&quot;<em>\&quot;,\n      \&quot;Principal\&quot;: \&quot;</em>\&quot;,\n      \&quot;Resource\&quot;: \&quot;*\&quot;\n    }\n  ]\n}</p>
         */
        @NameInMap("PolicyDocument")
        public String policyDocument;

        /**
         * <p>The ID of the region that contains the endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-huhehaote</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>Indicates whether the endpoint and the endpoint service belong to the same Alibaba Cloud account. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong></p>
         * </li>
         * <li><p><strong>false</strong></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ResourceOwner")
        public Boolean resourceOwner;

        /**
         * <p>The ID of the associated endpoint service.</p>
         * 
         * <strong>example:</strong>
         * <p>epsrv-hp3vpx8yqxblby3i****</p>
         */
        @NameInMap("ServiceId")
        public String serviceId;

        /**
         * <p>The name of the associated endpoint service.</p>
         * 
         * <strong>example:</strong>
         * <p>com.aliyuncs.privatelink.cn-huhehaote.epsrv-hp3xdsq46ael67lo****</p>
         */
        @NameInMap("ServiceName")
        public String serviceName;

        /**
         * <p>The ID of the region where the associated endpoint service is deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-huhehaote</p>
         */
        @NameInMap("ServiceRegionId")
        public String serviceRegionId;

        /**
         * <p>A list of tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListVpcEndpointsResponseBodyEndpointsTags> tags;

        /**
         * <p>The ID of the VPC to which the endpoint belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-hp356stwkxg3fn2xe****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>Indicates whether zone-aware DNS resolution is enabled. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong></p>
         * </li>
         * <li><p><strong>false</strong></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ZoneAffinityEnabled")
        public Boolean zoneAffinityEnabled;

        public static ListVpcEndpointsResponseBodyEndpoints build(java.util.Map<String, ?> map) throws Exception {
            ListVpcEndpointsResponseBodyEndpoints self = new ListVpcEndpointsResponseBodyEndpoints();
            return TeaModel.build(map, self);
        }

        public ListVpcEndpointsResponseBodyEndpoints setAddressIpVersion(String addressIpVersion) {
            this.addressIpVersion = addressIpVersion;
            return this;
        }
        public String getAddressIpVersion() {
            return this.addressIpVersion;
        }

        public ListVpcEndpointsResponseBodyEndpoints setBandwidth(Long bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Long getBandwidth() {
            return this.bandwidth;
        }

        public ListVpcEndpointsResponseBodyEndpoints setConnectionStatus(String connectionStatus) {
            this.connectionStatus = connectionStatus;
            return this;
        }
        public String getConnectionStatus() {
            return this.connectionStatus;
        }

        public ListVpcEndpointsResponseBodyEndpoints setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListVpcEndpointsResponseBodyEndpoints setCrossRegionBandwidth(Integer crossRegionBandwidth) {
            this.crossRegionBandwidth = crossRegionBandwidth;
            return this;
        }
        public Integer getCrossRegionBandwidth() {
            return this.crossRegionBandwidth;
        }

        public ListVpcEndpointsResponseBodyEndpoints setEndpointBusinessStatus(String endpointBusinessStatus) {
            this.endpointBusinessStatus = endpointBusinessStatus;
            return this;
        }
        public String getEndpointBusinessStatus() {
            return this.endpointBusinessStatus;
        }

        public ListVpcEndpointsResponseBodyEndpoints setEndpointDescription(String endpointDescription) {
            this.endpointDescription = endpointDescription;
            return this;
        }
        public String getEndpointDescription() {
            return this.endpointDescription;
        }

        public ListVpcEndpointsResponseBodyEndpoints setEndpointDomain(String endpointDomain) {
            this.endpointDomain = endpointDomain;
            return this;
        }
        public String getEndpointDomain() {
            return this.endpointDomain;
        }

        public ListVpcEndpointsResponseBodyEndpoints setEndpointId(String endpointId) {
            this.endpointId = endpointId;
            return this;
        }
        public String getEndpointId() {
            return this.endpointId;
        }

        public ListVpcEndpointsResponseBodyEndpoints setEndpointName(String endpointName) {
            this.endpointName = endpointName;
            return this;
        }
        public String getEndpointName() {
            return this.endpointName;
        }

        public ListVpcEndpointsResponseBodyEndpoints setEndpointStatus(String endpointStatus) {
            this.endpointStatus = endpointStatus;
            return this;
        }
        public String getEndpointStatus() {
            return this.endpointStatus;
        }

        public ListVpcEndpointsResponseBodyEndpoints setEndpointType(String endpointType) {
            this.endpointType = endpointType;
            return this;
        }
        public String getEndpointType() {
            return this.endpointType;
        }

        public ListVpcEndpointsResponseBodyEndpoints setPolicyDocument(String policyDocument) {
            this.policyDocument = policyDocument;
            return this;
        }
        public String getPolicyDocument() {
            return this.policyDocument;
        }

        public ListVpcEndpointsResponseBodyEndpoints setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListVpcEndpointsResponseBodyEndpoints setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListVpcEndpointsResponseBodyEndpoints setResourceOwner(Boolean resourceOwner) {
            this.resourceOwner = resourceOwner;
            return this;
        }
        public Boolean getResourceOwner() {
            return this.resourceOwner;
        }

        public ListVpcEndpointsResponseBodyEndpoints setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public ListVpcEndpointsResponseBodyEndpoints setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public ListVpcEndpointsResponseBodyEndpoints setServiceRegionId(String serviceRegionId) {
            this.serviceRegionId = serviceRegionId;
            return this;
        }
        public String getServiceRegionId() {
            return this.serviceRegionId;
        }

        public ListVpcEndpointsResponseBodyEndpoints setTags(java.util.List<ListVpcEndpointsResponseBodyEndpointsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListVpcEndpointsResponseBodyEndpointsTags> getTags() {
            return this.tags;
        }

        public ListVpcEndpointsResponseBodyEndpoints setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListVpcEndpointsResponseBodyEndpoints setZoneAffinityEnabled(Boolean zoneAffinityEnabled) {
            this.zoneAffinityEnabled = zoneAffinityEnabled;
            return this;
        }
        public Boolean getZoneAffinityEnabled() {
            return this.zoneAffinityEnabled;
        }

    }

}
