// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class ListIpamPoolAllocationsResponseBody extends TeaModel {
    /**
     * <p>The number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Count")
    public Long count;

    /**
     * <p>The IDs of the instances to which CIDR blocks are allocated from the IPAM pool.</p>
     */
    @NameInMap("IpamPoolAllocations")
    public java.util.List<ListIpamPoolAllocationsResponseBodyIpamPoolAllocations> ipamPoolAllocations;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. Valid values:</p>
     * <ul>
     * <li>If <strong>NextToken</strong> is empty, no next page exists.</li>
     * <li>If a value of <strong>NextToken</strong> is returned, the value indicates the token that is used for the next query.</li>
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
     * <p>3748DEFF-68BE-5EED-9937-7C1D0C21BAB4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
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
        /**
         * <p>The allocated CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.1.0/24</p>
         */
        @NameInMap("Cidr")
        public String cidr;

        /**
         * <p>The time when the instance was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-05-19T08:59:18Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The description of the allocation.</p>
         * 
         * <strong>example:</strong>
         * <p>test description</p>
         */
        @NameInMap("IpamPoolAllocationDescription")
        public String ipamPoolAllocationDescription;

        /**
         * <p>The ID of the instance to which CIDR blocks are allocated from the IPAM pool.</p>
         * 
         * <strong>example:</strong>
         * <p>ipam-pool-alloc-112za33e4****</p>
         */
        @NameInMap("IpamPoolAllocationId")
        public String ipamPoolAllocationId;

        /**
         * <p>The name of the allocation.</p>
         * 
         * <strong>example:</strong>
         * <p>test name</p>
         */
        @NameInMap("IpamPoolAllocationName")
        public String ipamPoolAllocationName;

        /**
         * <p>The ID of the IPAM pool.</p>
         * 
         * <strong>example:</strong>
         * <p>ipam-pool-6rcq3tobayc20t****</p>
         */
        @NameInMap("IpamPoolId")
        public String ipamPoolId;

        /**
         * <p>The region ID of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the resource to which the CIDR block is allocated.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp16qjewdsunr41m1****</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The ID of the Alibaba Cloud account to which the resource belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>132193271328****</p>
         */
        @NameInMap("ResourceOwnerId")
        public Long resourceOwnerId;

        /**
         * <p>The effective region ID of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("ResourceRegionId")
        public String resourceRegionId;

        /**
         * <p>The type of the resource to which the CIDR block is allocated. Valid values:</p>
         * <ul>
         * <li><strong>VPC</strong></li>
         * <li><strong>IpamPool</strong></li>
         * <li><strong>Custom</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Custom</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The source CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.0/16</p>
         */
        @NameInMap("SourceCidr")
        public String sourceCidr;

        /**
         * <p>The status of the instance. Valid values:</p>
         * <ul>
         * <li><strong>Created</strong></li>
         * <li><strong>Deleted</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Created</p>
         */
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
