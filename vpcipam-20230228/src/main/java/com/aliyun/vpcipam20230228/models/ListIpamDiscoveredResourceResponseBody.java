// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class ListIpamDiscoveredResourceResponseBody extends TeaModel {
    /**
     * <p>The maximum number of entries on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>The list of resources.</p>
     */
    @NameInMap("IpamDiscoveredResources")
    public java.util.List<ListIpamDiscoveredResourceResponseBodyIpamDiscoveredResources> ipamDiscoveredResources;

    /**
     * <p>The maximum number of entries on each page. Valid values: 1 to 100. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. Valid values:</p>
     * <ul>
     * <li>If <strong>NextToken</strong> is empty, there is no next page.</li>
     * <li>If a value of <strong>NextToken</strong> is returned, it indicates the token that is used for the next query.</li>
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

    public static ListIpamDiscoveredResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIpamDiscoveredResourceResponseBody self = new ListIpamDiscoveredResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIpamDiscoveredResourceResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public ListIpamDiscoveredResourceResponseBody setIpamDiscoveredResources(java.util.List<ListIpamDiscoveredResourceResponseBodyIpamDiscoveredResources> ipamDiscoveredResources) {
        this.ipamDiscoveredResources = ipamDiscoveredResources;
        return this;
    }
    public java.util.List<ListIpamDiscoveredResourceResponseBodyIpamDiscoveredResources> getIpamDiscoveredResources() {
        return this.ipamDiscoveredResources;
    }

    public ListIpamDiscoveredResourceResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListIpamDiscoveredResourceResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListIpamDiscoveredResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListIpamDiscoveredResourceResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListIpamDiscoveredResourceResponseBodyIpamDiscoveredResourcesIpCountDetail extends TeaModel {
        @NameInMap("FreeIpCount")
        public String freeIpCount;

        @NameInMap("TotalIpCount")
        public String totalIpCount;

        @NameInMap("UsedIpCount")
        public String usedIpCount;

        public static ListIpamDiscoveredResourceResponseBodyIpamDiscoveredResourcesIpCountDetail build(java.util.Map<String, ?> map) throws Exception {
            ListIpamDiscoveredResourceResponseBodyIpamDiscoveredResourcesIpCountDetail self = new ListIpamDiscoveredResourceResponseBodyIpamDiscoveredResourcesIpCountDetail();
            return TeaModel.build(map, self);
        }

        public ListIpamDiscoveredResourceResponseBodyIpamDiscoveredResourcesIpCountDetail setFreeIpCount(String freeIpCount) {
            this.freeIpCount = freeIpCount;
            return this;
        }
        public String getFreeIpCount() {
            return this.freeIpCount;
        }

        public ListIpamDiscoveredResourceResponseBodyIpamDiscoveredResourcesIpCountDetail setTotalIpCount(String totalIpCount) {
            this.totalIpCount = totalIpCount;
            return this;
        }
        public String getTotalIpCount() {
            return this.totalIpCount;
        }

        public ListIpamDiscoveredResourceResponseBodyIpamDiscoveredResourcesIpCountDetail setUsedIpCount(String usedIpCount) {
            this.usedIpCount = usedIpCount;
            return this;
        }
        public String getUsedIpCount() {
            return this.usedIpCount;
        }

    }

    public static class ListIpamDiscoveredResourceResponseBodyIpamDiscoveredResources extends TeaModel {
        /**
         * <p>The ID of the Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>132193271328****</p>
         */
        @NameInMap("AliUid")
        public Long aliUid;

        /**
         * <p>The CIDR block of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.1.0/32</p>
         */
        @NameInMap("Cidr")
        public String cidr;

        /**
         * <p>The time when the resource was discovered.</p>
         * <blockquote>
         * <p> If the resource has not been modified since it was created, the discovery time remains unchanged.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2024-01-01 00:00:00</p>
         */
        @NameInMap("DiscoveryTime")
        public String discoveryTime;

        @NameInMap("IpCountDetail")
        public ListIpamDiscoveredResourceResponseBodyIpamDiscoveredResourcesIpCountDetail ipCountDetail;

        /**
         * <p>The IP usage in decimal form.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IpUsage")
        public String ipUsage;

        /**
         * <p>The ID of resource discovery instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ipam-res-disco-jt5f2af2u6nk2z321****</p>
         */
        @NameInMap("IpamResourceDiscoveryId")
        public String ipamResourceDiscoveryId;

        /**
         * <p>The ID of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-uf611fp465c7dyb4z****</p>
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
         * <p>The ID of the region to which the resource belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("ResourceRegionId")
        public String resourceRegionId;

        /**
         * <p>The resource type. Valid values:</p>
         * <ul>
         * <li><strong>VPC</strong></li>
         * <li><strong>VSwitch</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The source CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.1.0/24</p>
         */
        @NameInMap("SourceCidr")
        public String sourceCidr;

        /**
         * <p>The ID of the VPC to which the resource belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-uf611fp465c7dyb4z****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static ListIpamDiscoveredResourceResponseBodyIpamDiscoveredResources build(java.util.Map<String, ?> map) throws Exception {
            ListIpamDiscoveredResourceResponseBodyIpamDiscoveredResources self = new ListIpamDiscoveredResourceResponseBodyIpamDiscoveredResources();
            return TeaModel.build(map, self);
        }

        public ListIpamDiscoveredResourceResponseBodyIpamDiscoveredResources setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public ListIpamDiscoveredResourceResponseBodyIpamDiscoveredResources setCidr(String cidr) {
            this.cidr = cidr;
            return this;
        }
        public String getCidr() {
            return this.cidr;
        }

        public ListIpamDiscoveredResourceResponseBodyIpamDiscoveredResources setDiscoveryTime(String discoveryTime) {
            this.discoveryTime = discoveryTime;
            return this;
        }
        public String getDiscoveryTime() {
            return this.discoveryTime;
        }

        public ListIpamDiscoveredResourceResponseBodyIpamDiscoveredResources setIpCountDetail(ListIpamDiscoveredResourceResponseBodyIpamDiscoveredResourcesIpCountDetail ipCountDetail) {
            this.ipCountDetail = ipCountDetail;
            return this;
        }
        public ListIpamDiscoveredResourceResponseBodyIpamDiscoveredResourcesIpCountDetail getIpCountDetail() {
            return this.ipCountDetail;
        }

        public ListIpamDiscoveredResourceResponseBodyIpamDiscoveredResources setIpUsage(String ipUsage) {
            this.ipUsage = ipUsage;
            return this;
        }
        public String getIpUsage() {
            return this.ipUsage;
        }

        public ListIpamDiscoveredResourceResponseBodyIpamDiscoveredResources setIpamResourceDiscoveryId(String ipamResourceDiscoveryId) {
            this.ipamResourceDiscoveryId = ipamResourceDiscoveryId;
            return this;
        }
        public String getIpamResourceDiscoveryId() {
            return this.ipamResourceDiscoveryId;
        }

        public ListIpamDiscoveredResourceResponseBodyIpamDiscoveredResources setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ListIpamDiscoveredResourceResponseBodyIpamDiscoveredResources setResourceOwnerId(Long resourceOwnerId) {
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }
        public Long getResourceOwnerId() {
            return this.resourceOwnerId;
        }

        public ListIpamDiscoveredResourceResponseBodyIpamDiscoveredResources setResourceRegionId(String resourceRegionId) {
            this.resourceRegionId = resourceRegionId;
            return this;
        }
        public String getResourceRegionId() {
            return this.resourceRegionId;
        }

        public ListIpamDiscoveredResourceResponseBodyIpamDiscoveredResources setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListIpamDiscoveredResourceResponseBodyIpamDiscoveredResources setSourceCidr(String sourceCidr) {
            this.sourceCidr = sourceCidr;
            return this;
        }
        public String getSourceCidr() {
            return this.sourceCidr;
        }

        public ListIpamDiscoveredResourceResponseBodyIpamDiscoveredResources setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
