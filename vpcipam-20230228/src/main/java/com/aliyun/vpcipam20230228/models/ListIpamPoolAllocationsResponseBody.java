// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class ListIpamPoolAllocationsResponseBody extends TeaModel {
    @NameInMap("Count")
    public Long count;

    @NameInMap("IpamPoolAllocations")
    public java.util.List<ListIpamPoolAllocationsResponseBodyIpamPoolAllocations> ipamPoolAllocations;

    @NameInMap("MaxResults")
    public Long maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListIpamPoolAllocationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIpamPoolAllocationsResponseBody self = new ListIpamPoolAllocationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIpamPoolAllocationsResponseBody setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public ListIpamPoolAllocationsResponseBody setIpamPoolAllocations(java.util.List<ListIpamPoolAllocationsResponseBodyIpamPoolAllocations> ipamPoolAllocations) {
        this.ipamPoolAllocations = ipamPoolAllocations;
        return this;
    }
    public java.util.List<ListIpamPoolAllocationsResponseBodyIpamPoolAllocations> getIpamPoolAllocations() {
        return this.ipamPoolAllocations;
    }

    public ListIpamPoolAllocationsResponseBody setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListIpamPoolAllocationsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListIpamPoolAllocationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListIpamPoolAllocationsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListIpamPoolAllocationsResponseBodyIpamPoolAllocations extends TeaModel {
        @NameInMap("Cidr")
        public String cidr;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("IpamPoolAllocationDescription")
        public String ipamPoolAllocationDescription;

        @NameInMap("IpamPoolAllocationId")
        public String ipamPoolAllocationId;

        @NameInMap("IpamPoolAllocationName")
        public String ipamPoolAllocationName;

        @NameInMap("IpamPoolId")
        public String ipamPoolId;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("ResourceOwnerId")
        public Long resourceOwnerId;

        @NameInMap("ResourceRegionId")
        public String resourceRegionId;

        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("SourceCidr")
        public String sourceCidr;

        @NameInMap("Status")
        public String status;

        public static ListIpamPoolAllocationsResponseBodyIpamPoolAllocations build(java.util.Map<String, ?> map) throws Exception {
            ListIpamPoolAllocationsResponseBodyIpamPoolAllocations self = new ListIpamPoolAllocationsResponseBodyIpamPoolAllocations();
            return TeaModel.build(map, self);
        }

        public ListIpamPoolAllocationsResponseBodyIpamPoolAllocations setCidr(String cidr) {
            this.cidr = cidr;
            return this;
        }
        public String getCidr() {
            return this.cidr;
        }

        public ListIpamPoolAllocationsResponseBodyIpamPoolAllocations setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListIpamPoolAllocationsResponseBodyIpamPoolAllocations setIpamPoolAllocationDescription(String ipamPoolAllocationDescription) {
            this.ipamPoolAllocationDescription = ipamPoolAllocationDescription;
            return this;
        }
        public String getIpamPoolAllocationDescription() {
            return this.ipamPoolAllocationDescription;
        }

        public ListIpamPoolAllocationsResponseBodyIpamPoolAllocations setIpamPoolAllocationId(String ipamPoolAllocationId) {
            this.ipamPoolAllocationId = ipamPoolAllocationId;
            return this;
        }
        public String getIpamPoolAllocationId() {
            return this.ipamPoolAllocationId;
        }

        public ListIpamPoolAllocationsResponseBodyIpamPoolAllocations setIpamPoolAllocationName(String ipamPoolAllocationName) {
            this.ipamPoolAllocationName = ipamPoolAllocationName;
            return this;
        }
        public String getIpamPoolAllocationName() {
            return this.ipamPoolAllocationName;
        }

        public ListIpamPoolAllocationsResponseBodyIpamPoolAllocations setIpamPoolId(String ipamPoolId) {
            this.ipamPoolId = ipamPoolId;
            return this;
        }
        public String getIpamPoolId() {
            return this.ipamPoolId;
        }

        public ListIpamPoolAllocationsResponseBodyIpamPoolAllocations setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListIpamPoolAllocationsResponseBodyIpamPoolAllocations setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ListIpamPoolAllocationsResponseBodyIpamPoolAllocations setResourceOwnerId(Long resourceOwnerId) {
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }
        public Long getResourceOwnerId() {
            return this.resourceOwnerId;
        }

        public ListIpamPoolAllocationsResponseBodyIpamPoolAllocations setResourceRegionId(String resourceRegionId) {
            this.resourceRegionId = resourceRegionId;
            return this;
        }
        public String getResourceRegionId() {
            return this.resourceRegionId;
        }

        public ListIpamPoolAllocationsResponseBodyIpamPoolAllocations setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListIpamPoolAllocationsResponseBodyIpamPoolAllocations setSourceCidr(String sourceCidr) {
            this.sourceCidr = sourceCidr;
            return this;
        }
        public String getSourceCidr() {
            return this.sourceCidr;
        }

        public ListIpamPoolAllocationsResponseBodyIpamPoolAllocations setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
