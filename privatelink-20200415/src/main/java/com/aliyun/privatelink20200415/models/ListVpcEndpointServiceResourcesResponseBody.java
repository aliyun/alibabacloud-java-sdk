// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class ListVpcEndpointServiceResourcesResponseBody extends TeaModel {
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
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
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
     * <p>The service resources.</p>
     */
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
        /**
         * <p>Indicates whether automatic resource allocation is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AutoAllocatedEnabled")
        public Boolean autoAllocatedEnabled;

        /**
         * <p>The IP address of the service resource.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.10.23</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The ID of the region where the service resource is deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-huhehaote</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The number of endpoints that are associated with the service resource that is smoothly migrated.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("RelatedDeprecatedEndpointCount")
        public Long relatedDeprecatedEndpointCount;

        /**
         * <p>The number of endpoints that are associated with the service resource.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("RelatedEndpointCount")
        public Long relatedEndpointCount;

        /**
         * <p>The service resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-hp32z1wp5peaoox2q****</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>Indicates whether IPv6 is enabled for the endpoint service. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ResourceSupportIPv6")
        public Boolean resourceSupportIPv6;

        /**
         * <p>The type of the service resource.</p>
         * <p>Only <strong>slb</strong> is returned. This value indicates a Classic Load Balancer (CLB) instance.</p>
         * 
         * <strong>example:</strong>
         * <p>slb</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The ID of the vSwitch to which the service resource belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-hp3uf6045ljdhd5zr****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The ID of the virtual private cloud (VPC) to which the service resource belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-hp356stwkxg3fn2xe****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The ID of the zone to which the service resource belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-huhehaote-b</p>
         */
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
