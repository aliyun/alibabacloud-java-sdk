// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class ListIpamPoolAllocationsResponseBody extends TeaModel {
    @NameInMap("IpamPoolAllocations")
    public java.util.List<ListIpamPoolAllocationsResponseBodyIpamPoolAllocations> ipamPoolAllocations;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>3748DEFF-68BE-5EED-9937-7C1D0C21BAB4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListIpamPoolAllocationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIpamPoolAllocationsResponseBody self = new ListIpamPoolAllocationsResponseBody();
        return TeaModel.build(map, self);
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
         * <strong>example:</strong>
         * <p>192.168.1.0/24</p>
         */
        @NameInMap("Cidr")
        public String cidr;

        /**
         * <strong>example:</strong>
         * <p>2023-05-19T08:59:18Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <strong>example:</strong>
         * <p>ipam-pool-alloc-112za33e4****</p>
         */
        @NameInMap("IpamPoolAllocationId")
        public String ipamPoolAllocationId;

        /**
         * <strong>example:</strong>
         * <p>ipam-pool-6rcq3tobayc20t****</p>
         */
        @NameInMap("IpamPoolId")
        public String ipamPoolId;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>vpc-bp16qjewdsunr41m1****</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <strong>example:</strong>
         * <p>132193271328****</p>
         */
        @NameInMap("ResourceOwnerId")
        public Long resourceOwnerId;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("ResourceRegionId")
        public String resourceRegionId;

        /**
         * <strong>example:</strong>
         * <p>Custom</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <strong>example:</strong>
         * <p>192.168.0.0/16</p>
         */
        @NameInMap("SourceCidr")
        public String sourceCidr;

        /**
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

        public ListIpamPoolAllocationsResponseBodyIpamPoolAllocations setIpamPoolAllocationId(String ipamPoolAllocationId) {
            this.ipamPoolAllocationId = ipamPoolAllocationId;
            return this;
        }
        public String getIpamPoolAllocationId() {
            return this.ipamPoolAllocationId;
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
