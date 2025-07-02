// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class ListIpamPoolsResponseBody extends TeaModel {
    /**
     * <p>The number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Count")
    public Long count;

    /**
     * <p>The IPAM pools.</p>
     */
    @NameInMap("IpamPools")
    public java.util.List<ListIpamPoolsResponseBodyIpamPools> ipamPools;

    /**
     * <p>The number of entries per page. Valid values: 1 to 100. Default value: 10.</p>
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
     * <p>B54867DE-83DC-56B4-A57E-69A03119D0B1</p>
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

    public static ListIpamPoolsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIpamPoolsResponseBody self = new ListIpamPoolsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIpamPoolsResponseBody setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public ListIpamPoolsResponseBody setIpamPools(java.util.List<ListIpamPoolsResponseBodyIpamPools> ipamPools) {
        this.ipamPools = ipamPools;
        return this;
    }
    public java.util.List<ListIpamPoolsResponseBodyIpamPools> getIpamPools() {
        return this.ipamPools;
    }

    public ListIpamPoolsResponseBody setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListIpamPoolsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListIpamPoolsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListIpamPoolsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListIpamPoolsResponseBodyIpamPoolsTags extends TeaModel {
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

        public static ListIpamPoolsResponseBodyIpamPoolsTags build(java.util.Map<String, ?> map) throws Exception {
            ListIpamPoolsResponseBodyIpamPoolsTags self = new ListIpamPoolsResponseBodyIpamPoolsTags();
            return TeaModel.build(map, self);
        }

        public ListIpamPoolsResponseBodyIpamPoolsTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListIpamPoolsResponseBodyIpamPoolsTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListIpamPoolsResponseBodyIpamPools extends TeaModel {
        /**
         * <p>The default network mask assigned to the IPAM pool.</p>
         * <p>An IPv4 mask must be <strong>0 to 32</strong> bits in length.</p>
         * 
         * <strong>example:</strong>
         * <p>28</p>
         */
        @NameInMap("AllocationDefaultCidrMask")
        public Integer allocationDefaultCidrMask;

        /**
         * <p>The maximum network mask assigned to the IPAM pool.</p>
         * <p>An IPv4 mask must be <strong>0 to 32</strong> bits in length.</p>
         * 
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("AllocationMaxCidrMask")
        public Integer allocationMaxCidrMask;

        /**
         * <p>The minimum network mask assigned to the IPAM pool.</p>
         * <p>An IPv4 mask must be <strong>0 to 32</strong> bits in length.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("AllocationMinCidrMask")
        public Integer allocationMinCidrMask;

        /**
         * <p>Whether the pool has the auto-import feature enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AutoImport")
        public Boolean autoImport;

        /**
         * <p>The time when the IPAM pool was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-04-19T16:49:01Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>Indicates whether the pool is a subpool. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasSubPool")
        public Boolean hasSubPool;

        /**
         * <p>The IP version. Only <strong>IPv4</strong> may be returned.</p>
         * 
         * <strong>example:</strong>
         * <p>IPv4</p>
         */
        @NameInMap("IpVersion")
        public String ipVersion;

        /**
         * <p>The ID of the IPAM.</p>
         * 
         * <strong>example:</strong>
         * <p>ipam-b5mtlx3q7xcnyr****</p>
         */
        @NameInMap("IpamId")
        public String ipamId;

        /**
         * <p>The description of the IPAM pool.</p>
         * 
         * <strong>example:</strong>
         * <p>test description</p>
         */
        @NameInMap("IpamPoolDescription")
        public String ipamPoolDescription;

        /**
         * <p>The ID of the IPAM pool.</p>
         * 
         * <strong>example:</strong>
         * <p>ipam-pool-6rcq3tobayc20t****</p>
         */
        @NameInMap("IpamPoolId")
        public String ipamPoolId;

        /**
         * <p>The name of the IPAM pool.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("IpamPoolName")
        public String ipamPoolName;

        /**
         * <p>The ID of the region where the IPAM to which the IPAM pool belongs is hosted.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("IpamRegionId")
        public String ipamRegionId;

        /**
         * <p>The ID of the IPAM scope.</p>
         * 
         * <strong>example:</strong>
         * <p>ipam-scope-glfmcyldpm8lsy****</p>
         */
        @NameInMap("IpamScopeId")
        public String ipamScopeId;

        /**
         * <p>The type of the IPAM scope. Valid values:</p>
         * <ul>
         * <li><strong>public</strong></li>
         * <li><strong>private</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>private</p>
         */
        @NameInMap("IpamScopeType")
        public String ipamScopeType;

        /**
         * <p>Whether it is a shared pool.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsShared")
        public Boolean isShared;

        /**
         * <p>The Alibaba Cloud account of the owner for the IPAM pool.</p>
         * 
         * <strong>example:</strong>
         * <p>1210123456******</p>
         */
        @NameInMap("OwnerId")
        public Long ownerId;

        /**
         * <p>The depth of the IPAM pool. Valid values: <strong>0 to 10</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("PoolDepth")
        public Integer poolDepth;

        /**
         * <p>The effective region of the IPAM pool. The ID of the effective region for the IPAM pool.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("PoolRegionId")
        public String poolRegionId;

        /**
         * <p>The ID of the region where the operation is called.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxazb4ph6aiy****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The ID of the source IPAM pool.</p>
         * 
         * <strong>example:</strong>
         * <p>ipam-pool-lfnwi4jok1ss0g****</p>
         */
        @NameInMap("SourceIpamPoolId")
        public String sourceIpamPoolId;

        /**
         * <p>The status of the IPAM pool. Valid values:</p>
         * <ul>
         * <li><strong>Creating</strong></li>
         * <li><strong>Created</strong>: indicates that the creation is complete.</li>
         * <li><strong>Modifying</strong></li>
         * <li><strong>Deleting</strong></li>
         * <li><strong>Deleted</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Created</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tag list.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListIpamPoolsResponseBodyIpamPoolsTags> tags;

        public static ListIpamPoolsResponseBodyIpamPools build(java.util.Map<String, ?> map) throws Exception {
            ListIpamPoolsResponseBodyIpamPools self = new ListIpamPoolsResponseBodyIpamPools();
            return TeaModel.build(map, self);
        }

        public ListIpamPoolsResponseBodyIpamPools setAllocationDefaultCidrMask(Integer allocationDefaultCidrMask) {
            this.allocationDefaultCidrMask = allocationDefaultCidrMask;
            return this;
        }
        public Integer getAllocationDefaultCidrMask() {
            return this.allocationDefaultCidrMask;
        }

        public ListIpamPoolsResponseBodyIpamPools setAllocationMaxCidrMask(Integer allocationMaxCidrMask) {
            this.allocationMaxCidrMask = allocationMaxCidrMask;
            return this;
        }
        public Integer getAllocationMaxCidrMask() {
            return this.allocationMaxCidrMask;
        }

        public ListIpamPoolsResponseBodyIpamPools setAllocationMinCidrMask(Integer allocationMinCidrMask) {
            this.allocationMinCidrMask = allocationMinCidrMask;
            return this;
        }
        public Integer getAllocationMinCidrMask() {
            return this.allocationMinCidrMask;
        }

        public ListIpamPoolsResponseBodyIpamPools setAutoImport(Boolean autoImport) {
            this.autoImport = autoImport;
            return this;
        }
        public Boolean getAutoImport() {
            return this.autoImport;
        }

        public ListIpamPoolsResponseBodyIpamPools setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListIpamPoolsResponseBodyIpamPools setHasSubPool(Boolean hasSubPool) {
            this.hasSubPool = hasSubPool;
            return this;
        }
        public Boolean getHasSubPool() {
            return this.hasSubPool;
        }

        public ListIpamPoolsResponseBodyIpamPools setIpVersion(String ipVersion) {
            this.ipVersion = ipVersion;
            return this;
        }
        public String getIpVersion() {
            return this.ipVersion;
        }

        public ListIpamPoolsResponseBodyIpamPools setIpamId(String ipamId) {
            this.ipamId = ipamId;
            return this;
        }
        public String getIpamId() {
            return this.ipamId;
        }

        public ListIpamPoolsResponseBodyIpamPools setIpamPoolDescription(String ipamPoolDescription) {
            this.ipamPoolDescription = ipamPoolDescription;
            return this;
        }
        public String getIpamPoolDescription() {
            return this.ipamPoolDescription;
        }

        public ListIpamPoolsResponseBodyIpamPools setIpamPoolId(String ipamPoolId) {
            this.ipamPoolId = ipamPoolId;
            return this;
        }
        public String getIpamPoolId() {
            return this.ipamPoolId;
        }

        public ListIpamPoolsResponseBodyIpamPools setIpamPoolName(String ipamPoolName) {
            this.ipamPoolName = ipamPoolName;
            return this;
        }
        public String getIpamPoolName() {
            return this.ipamPoolName;
        }

        public ListIpamPoolsResponseBodyIpamPools setIpamRegionId(String ipamRegionId) {
            this.ipamRegionId = ipamRegionId;
            return this;
        }
        public String getIpamRegionId() {
            return this.ipamRegionId;
        }

        public ListIpamPoolsResponseBodyIpamPools setIpamScopeId(String ipamScopeId) {
            this.ipamScopeId = ipamScopeId;
            return this;
        }
        public String getIpamScopeId() {
            return this.ipamScopeId;
        }

        public ListIpamPoolsResponseBodyIpamPools setIpamScopeType(String ipamScopeType) {
            this.ipamScopeType = ipamScopeType;
            return this;
        }
        public String getIpamScopeType() {
            return this.ipamScopeType;
        }

        public ListIpamPoolsResponseBodyIpamPools setIsShared(Boolean isShared) {
            this.isShared = isShared;
            return this;
        }
        public Boolean getIsShared() {
            return this.isShared;
        }

        public ListIpamPoolsResponseBodyIpamPools setOwnerId(Long ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public Long getOwnerId() {
            return this.ownerId;
        }

        public ListIpamPoolsResponseBodyIpamPools setPoolDepth(Integer poolDepth) {
            this.poolDepth = poolDepth;
            return this;
        }
        public Integer getPoolDepth() {
            return this.poolDepth;
        }

        public ListIpamPoolsResponseBodyIpamPools setPoolRegionId(String poolRegionId) {
            this.poolRegionId = poolRegionId;
            return this;
        }
        public String getPoolRegionId() {
            return this.poolRegionId;
        }

        public ListIpamPoolsResponseBodyIpamPools setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListIpamPoolsResponseBodyIpamPools setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListIpamPoolsResponseBodyIpamPools setSourceIpamPoolId(String sourceIpamPoolId) {
            this.sourceIpamPoolId = sourceIpamPoolId;
            return this;
        }
        public String getSourceIpamPoolId() {
            return this.sourceIpamPoolId;
        }

        public ListIpamPoolsResponseBodyIpamPools setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListIpamPoolsResponseBodyIpamPools setTags(java.util.List<ListIpamPoolsResponseBodyIpamPoolsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListIpamPoolsResponseBodyIpamPoolsTags> getTags() {
            return this.tags;
        }

    }

}
