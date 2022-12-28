// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class ListVpcEndpointServiceResourcesResponseBody extends TeaModel {
    // The number of entries to return on each page.
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

    // The list of service resources.
    @NameInMap("Resources")
    public java.util.List<ListVpcEndpointServiceResourcesResponseBodyResources> resources;

    public static ListVpcEndpointServiceResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVpcEndpointServiceResourcesResponseBody self = new ListVpcEndpointServiceResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVpcEndpointServiceResourcesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListVpcEndpointServiceResourcesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListVpcEndpointServiceResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListVpcEndpointServiceResourcesResponseBody setResources(java.util.List<ListVpcEndpointServiceResourcesResponseBodyResources> resources) {
        this.resources = resources;
        return this;
    }
    public java.util.List<ListVpcEndpointServiceResourcesResponseBodyResources> getResources() {
        return this.resources;
    }

    public static class ListVpcEndpointServiceResourcesResponseBodyResources extends TeaModel {
        // Indicates whether automatic resource allocation is allowed. Valid values:
        // 
        // *   **true**: yes
        // *   **false**: no
        @NameInMap("AutoAllocatedEnabled")
        public Boolean autoAllocatedEnabled;

        // The IP address of the service resource.
        @NameInMap("Ip")
        public String ip;

        // The ID of the region where the service resource is deployed.
        @NameInMap("RegionId")
        public String regionId;

        // The number of replaced connections to the endpoint associated with the endpoint service in smooth migration scenarios.
        @NameInMap("RelatedDeprecatedEndpointCount")
        public Long relatedDeprecatedEndpointCount;

        // The number of connections to the endpoint associated with the service resource.
        @NameInMap("RelatedEndpointCount")
        public Long relatedEndpointCount;

        // The ID of the service resource.
        @NameInMap("ResourceId")
        public String resourceId;

        // Indicates whether the endpoint service supports IPv6. Valid values:
        // 
        // *   **true**: yes
        // *   **false**: no
        @NameInMap("ResourceSupportIPv6")
        public Boolean resourceSupportIPv6;

        // The type of the service resource.
        // 
        // The value is set to **slb**, which indicates Classic Load Balancer (CLB).
        @NameInMap("ResourceType")
        public String resourceType;

        // The vSwitch to which the service resource belongs.
        @NameInMap("VSwitchId")
        public String vSwitchId;

        // The virtual private cloud (VPC) to which the service resource belongs.
        @NameInMap("VpcId")
        public String vpcId;

        // The ID of the zone where the service resource is deployed.
        @NameInMap("ZoneId")
        public String zoneId;

        public static ListVpcEndpointServiceResourcesResponseBodyResources build(java.util.Map<String, ?> map) throws Exception {
            ListVpcEndpointServiceResourcesResponseBodyResources self = new ListVpcEndpointServiceResourcesResponseBodyResources();
            return TeaModel.build(map, self);
        }

        public ListVpcEndpointServiceResourcesResponseBodyResources setAutoAllocatedEnabled(Boolean autoAllocatedEnabled) {
            this.autoAllocatedEnabled = autoAllocatedEnabled;
            return this;
        }
        public Boolean getAutoAllocatedEnabled() {
            return this.autoAllocatedEnabled;
        }

        public ListVpcEndpointServiceResourcesResponseBodyResources setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public ListVpcEndpointServiceResourcesResponseBodyResources setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListVpcEndpointServiceResourcesResponseBodyResources setRelatedDeprecatedEndpointCount(Long relatedDeprecatedEndpointCount) {
            this.relatedDeprecatedEndpointCount = relatedDeprecatedEndpointCount;
            return this;
        }
        public Long getRelatedDeprecatedEndpointCount() {
            return this.relatedDeprecatedEndpointCount;
        }

        public ListVpcEndpointServiceResourcesResponseBodyResources setRelatedEndpointCount(Long relatedEndpointCount) {
            this.relatedEndpointCount = relatedEndpointCount;
            return this;
        }
        public Long getRelatedEndpointCount() {
            return this.relatedEndpointCount;
        }

        public ListVpcEndpointServiceResourcesResponseBodyResources setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ListVpcEndpointServiceResourcesResponseBodyResources setResourceSupportIPv6(Boolean resourceSupportIPv6) {
            this.resourceSupportIPv6 = resourceSupportIPv6;
            return this;
        }
        public Boolean getResourceSupportIPv6() {
            return this.resourceSupportIPv6;
        }

        public ListVpcEndpointServiceResourcesResponseBodyResources setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListVpcEndpointServiceResourcesResponseBodyResources setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public ListVpcEndpointServiceResourcesResponseBodyResources setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListVpcEndpointServiceResourcesResponseBodyResources setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
