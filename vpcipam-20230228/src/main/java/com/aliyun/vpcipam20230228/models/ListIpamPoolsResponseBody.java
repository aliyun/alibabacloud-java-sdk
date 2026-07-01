// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class ListIpamPoolsResponseBody extends TeaModel {
    @NameInMap("Count")
    public Long count;

    @NameInMap("IpamPools")
    public java.util.List<ListIpamPoolsResponseBodyIpamPools> ipamPools;

    @NameInMap("MaxResults")
    public Long maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Key")
        public String key;

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
        @NameInMap("AllocationDefaultCidrMask")
        public Integer allocationDefaultCidrMask;

        @NameInMap("AllocationMaxCidrMask")
        public Integer allocationMaxCidrMask;

        @NameInMap("AllocationMinCidrMask")
        public Integer allocationMinCidrMask;

        @NameInMap("AutoImport")
        public Boolean autoImport;

        @NameInMap("Cidrs")
        public java.util.List<String> cidrs;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("HasSubPool")
        public Boolean hasSubPool;

        @NameInMap("IpVersion")
        public String ipVersion;

        @NameInMap("IpamId")
        public String ipamId;

        @NameInMap("IpamPoolDescription")
        public String ipamPoolDescription;

        @NameInMap("IpamPoolId")
        public String ipamPoolId;

        @NameInMap("IpamPoolName")
        public String ipamPoolName;

        @NameInMap("IpamRegionId")
        public String ipamRegionId;

        @NameInMap("IpamScopeId")
        public String ipamScopeId;

        @NameInMap("IpamScopeType")
        public String ipamScopeType;

        @NameInMap("Ipv6Isp")
        public String ipv6Isp;

        @NameInMap("IsShared")
        public Boolean isShared;

        @NameInMap("OwnerId")
        public Long ownerId;

        @NameInMap("PoolDepth")
        public Integer poolDepth;

        @NameInMap("PoolRegionId")
        public String poolRegionId;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("SourceIpamPoolId")
        public String sourceIpamPoolId;

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

        public ListIpamPoolsResponseBodyIpamPools setAutoImport(Boolean autoImport) {
            this.autoImport = autoImport;
            return this;
        }
        public Boolean getAutoImport() {
            return this.autoImport;
        }

        public ListIpamPoolsResponseBodyIpamPools setCidrs(java.util.List<String> cidrs) {
            this.cidrs = cidrs;
            return this;
        }
        public java.util.List<String> getCidrs() {
            return this.cidrs;
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

        public ListIpamPoolsResponseBodyIpamPools setIpv6Isp(String ipv6Isp) {
            this.ipv6Isp = ipv6Isp;
            return this;
        }
        public String getIpv6Isp() {
            return this.ipv6Isp;
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
