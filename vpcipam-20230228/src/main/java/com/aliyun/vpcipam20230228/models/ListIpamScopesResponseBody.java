// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class ListIpamScopesResponseBody extends TeaModel {
    @NameInMap("Count")
    public Long count;

    @NameInMap("IpamScopes")
    public java.util.List<ListIpamScopesResponseBodyIpamScopes> ipamScopes;

    @NameInMap("MaxResults")
    public Long maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListIpamScopesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIpamScopesResponseBody self = new ListIpamScopesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIpamScopesResponseBody setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public ListIpamScopesResponseBody setIpamScopes(java.util.List<ListIpamScopesResponseBodyIpamScopes> ipamScopes) {
        this.ipamScopes = ipamScopes;
        return this;
    }
    public java.util.List<ListIpamScopesResponseBodyIpamScopes> getIpamScopes() {
        return this.ipamScopes;
    }

    public ListIpamScopesResponseBody setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListIpamScopesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListIpamScopesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListIpamScopesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListIpamScopesResponseBodyIpamScopesTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListIpamScopesResponseBodyIpamScopesTags build(java.util.Map<String, ?> map) throws Exception {
            ListIpamScopesResponseBodyIpamScopesTags self = new ListIpamScopesResponseBodyIpamScopesTags();
            return TeaModel.build(map, self);
        }

        public ListIpamScopesResponseBodyIpamScopesTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListIpamScopesResponseBodyIpamScopesTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListIpamScopesResponseBodyIpamScopes extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("IpamId")
        public String ipamId;

        @NameInMap("IpamScopeDescription")
        public String ipamScopeDescription;

        @NameInMap("IpamScopeId")
        public String ipamScopeId;

        @NameInMap("IpamScopeName")
        public String ipamScopeName;

        @NameInMap("IpamScopeType")
        public String ipamScopeType;

        @NameInMap("IsDefault")
        public Boolean isDefault;

        @NameInMap("OwnerId")
        public Long ownerId;

        @NameInMap("PoolCount")
        public Integer poolCount;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("Status")
        public String status;

        @NameInMap("Tags")
        public java.util.List<ListIpamScopesResponseBodyIpamScopesTags> tags;

        public static ListIpamScopesResponseBodyIpamScopes build(java.util.Map<String, ?> map) throws Exception {
            ListIpamScopesResponseBodyIpamScopes self = new ListIpamScopesResponseBodyIpamScopes();
            return TeaModel.build(map, self);
        }

        public ListIpamScopesResponseBodyIpamScopes setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListIpamScopesResponseBodyIpamScopes setIpamId(String ipamId) {
            this.ipamId = ipamId;
            return this;
        }
        public String getIpamId() {
            return this.ipamId;
        }

        public ListIpamScopesResponseBodyIpamScopes setIpamScopeDescription(String ipamScopeDescription) {
            this.ipamScopeDescription = ipamScopeDescription;
            return this;
        }
        public String getIpamScopeDescription() {
            return this.ipamScopeDescription;
        }

        public ListIpamScopesResponseBodyIpamScopes setIpamScopeId(String ipamScopeId) {
            this.ipamScopeId = ipamScopeId;
            return this;
        }
        public String getIpamScopeId() {
            return this.ipamScopeId;
        }

        public ListIpamScopesResponseBodyIpamScopes setIpamScopeName(String ipamScopeName) {
            this.ipamScopeName = ipamScopeName;
            return this;
        }
        public String getIpamScopeName() {
            return this.ipamScopeName;
        }

        public ListIpamScopesResponseBodyIpamScopes setIpamScopeType(String ipamScopeType) {
            this.ipamScopeType = ipamScopeType;
            return this;
        }
        public String getIpamScopeType() {
            return this.ipamScopeType;
        }

        public ListIpamScopesResponseBodyIpamScopes setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public ListIpamScopesResponseBodyIpamScopes setOwnerId(Long ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public Long getOwnerId() {
            return this.ownerId;
        }

        public ListIpamScopesResponseBodyIpamScopes setPoolCount(Integer poolCount) {
            this.poolCount = poolCount;
            return this;
        }
        public Integer getPoolCount() {
            return this.poolCount;
        }

        public ListIpamScopesResponseBodyIpamScopes setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListIpamScopesResponseBodyIpamScopes setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListIpamScopesResponseBodyIpamScopes setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListIpamScopesResponseBodyIpamScopes setTags(java.util.List<ListIpamScopesResponseBodyIpamScopesTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListIpamScopesResponseBodyIpamScopesTags> getTags() {
            return this.tags;
        }

    }

}
