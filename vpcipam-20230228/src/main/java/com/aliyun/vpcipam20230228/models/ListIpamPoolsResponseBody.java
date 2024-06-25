// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class ListIpamPoolsResponseBody extends TeaModel {
    @NameInMap("IpamPools")
    public java.util.List<ListIpamPoolsResponseBodyIpamPools> ipamPools;

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
     * <p>B54867DE-83DC-56B4-A57E-69A03119D0B1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListIpamPoolsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIpamPoolsResponseBody self = new ListIpamPoolsResponseBody();
        return TeaModel.build(map, self);
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
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
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
         * <strong>example:</strong>
         * <p>28</p>
         */
        @NameInMap("AllocationDefaultCidrMask")
        public Integer allocationDefaultCidrMask;

        /**
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("AllocationMaxCidrMask")
        public Integer allocationMaxCidrMask;

        /**
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("AllocationMinCidrMask")
        public Integer allocationMinCidrMask;

        /**
         * <strong>example:</strong>
         * <p>2023-04-19T16:49:01Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasSubPool")
        public Boolean hasSubPool;

        /**
         * <strong>example:</strong>
         * <p>IPv4</p>
         */
        @NameInMap("IpVersion")
        public String ipVersion;

        /**
         * <strong>example:</strong>
         * <p>ipam-b5mtlx3q7xcnyr****</p>
         */
        @NameInMap("IpamId")
        public String ipamId;

        /**
         * <strong>example:</strong>
         * <p>test description</p>
         */
        @NameInMap("IpamPoolDescription")
        public String ipamPoolDescription;

        /**
         * <strong>example:</strong>
         * <p>ipam-pool-6rcq3tobayc20t****</p>
         */
        @NameInMap("IpamPoolId")
        public String ipamPoolId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("IpamPoolName")
        public String ipamPoolName;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("IpamRegionId")
        public String ipamRegionId;

        /**
         * <strong>example:</strong>
         * <p>ipam-scope-glfmcyldpm8lsy****</p>
         */
        @NameInMap("IpamScopeId")
        public String ipamScopeId;

        /**
         * <strong>example:</strong>
         * <p>private</p>
         */
        @NameInMap("IpamScopeType")
        public String ipamScopeType;

        /**
         * <strong>example:</strong>
         * <p>1210123456******</p>
         */
        @NameInMap("OwnerId")
        public Long ownerId;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("PoolDepth")
        public Integer poolDepth;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("PoolRegionId")
        public String poolRegionId;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>ipam-pool-lfnwi4jok1ss0g****</p>
         */
        @NameInMap("SourceIpamPoolId")
        public String sourceIpamPoolId;

        /**
         * <strong>example:</strong>
         * <p>Created</p>
         */
        @NameInMap("Status")
        public String status;

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
