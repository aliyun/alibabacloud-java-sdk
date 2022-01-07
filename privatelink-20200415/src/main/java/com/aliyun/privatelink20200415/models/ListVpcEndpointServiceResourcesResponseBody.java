// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class ListVpcEndpointServiceResourcesResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    public String maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Resources")
    public java.util.List<ListVpcEndpointServiceResourcesResponseBodyResources> resources;

    public static ListVpcEndpointServiceResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVpcEndpointServiceResourcesResponseBody self = new ListVpcEndpointServiceResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVpcEndpointServiceResourcesResponseBody setMaxResults(String maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public String getMaxResults() {
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
        @NameInMap("AutoAllocatedEnabled")
        public Boolean autoAllocatedEnabled;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RelatedDeprecatedEndpointCount")
        public Long relatedDeprecatedEndpointCount;

        @NameInMap("RelatedEndpointCount")
        public Long relatedEndpointCount;

        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("VpcId")
        public String vpcId;

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
