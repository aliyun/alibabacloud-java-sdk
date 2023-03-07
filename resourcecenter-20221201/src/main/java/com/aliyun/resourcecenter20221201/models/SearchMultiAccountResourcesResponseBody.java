// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class SearchMultiAccountResourcesResponseBody extends TeaModel {
    @NameInMap("Filters")
    public java.util.List<SearchMultiAccountResourcesResponseBodyFilters> filters;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Resources")
    public java.util.List<SearchMultiAccountResourcesResponseBodyResources> resources;

    @NameInMap("Scope")
    public String scope;

    public static SearchMultiAccountResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchMultiAccountResourcesResponseBody self = new SearchMultiAccountResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchMultiAccountResourcesResponseBody setFilters(java.util.List<SearchMultiAccountResourcesResponseBodyFilters> filters) {
        this.filters = filters;
        return this;
    }
    public java.util.List<SearchMultiAccountResourcesResponseBodyFilters> getFilters() {
        return this.filters;
    }

    public SearchMultiAccountResourcesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public SearchMultiAccountResourcesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public SearchMultiAccountResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchMultiAccountResourcesResponseBody setResources(java.util.List<SearchMultiAccountResourcesResponseBodyResources> resources) {
        this.resources = resources;
        return this;
    }
    public java.util.List<SearchMultiAccountResourcesResponseBodyResources> getResources() {
        return this.resources;
    }

    public SearchMultiAccountResourcesResponseBody setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public static class SearchMultiAccountResourcesResponseBodyFilters extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("MatchType")
        public String matchType;

        @NameInMap("Values")
        public java.util.List<String> values;

        public static SearchMultiAccountResourcesResponseBodyFilters build(java.util.Map<String, ?> map) throws Exception {
            SearchMultiAccountResourcesResponseBodyFilters self = new SearchMultiAccountResourcesResponseBodyFilters();
            return TeaModel.build(map, self);
        }

        public SearchMultiAccountResourcesResponseBodyFilters setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public SearchMultiAccountResourcesResponseBodyFilters setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }
        public String getMatchType() {
            return this.matchType;
        }

        public SearchMultiAccountResourcesResponseBodyFilters setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class SearchMultiAccountResourcesResponseBodyResourcesTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static SearchMultiAccountResourcesResponseBodyResourcesTags build(java.util.Map<String, ?> map) throws Exception {
            SearchMultiAccountResourcesResponseBodyResourcesTags self = new SearchMultiAccountResourcesResponseBodyResourcesTags();
            return TeaModel.build(map, self);
        }

        public SearchMultiAccountResourcesResponseBodyResourcesTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public SearchMultiAccountResourcesResponseBodyResourcesTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class SearchMultiAccountResourcesResponseBodyResources extends TeaModel {
        @NameInMap("AccountId")
        public String accountId;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("IpAddresses")
        public java.util.List<String> ipAddresses;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("ResourceName")
        public String resourceName;

        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("Tags")
        public java.util.List<SearchMultiAccountResourcesResponseBodyResourcesTags> tags;

        @NameInMap("ZoneId")
        public String zoneId;

        public static SearchMultiAccountResourcesResponseBodyResources build(java.util.Map<String, ?> map) throws Exception {
            SearchMultiAccountResourcesResponseBodyResources self = new SearchMultiAccountResourcesResponseBodyResources();
            return TeaModel.build(map, self);
        }

        public SearchMultiAccountResourcesResponseBodyResources setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public SearchMultiAccountResourcesResponseBodyResources setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public SearchMultiAccountResourcesResponseBodyResources setIpAddresses(java.util.List<String> ipAddresses) {
            this.ipAddresses = ipAddresses;
            return this;
        }
        public java.util.List<String> getIpAddresses() {
            return this.ipAddresses;
        }

        public SearchMultiAccountResourcesResponseBodyResources setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public SearchMultiAccountResourcesResponseBodyResources setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public SearchMultiAccountResourcesResponseBodyResources setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public SearchMultiAccountResourcesResponseBodyResources setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

        public SearchMultiAccountResourcesResponseBodyResources setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public SearchMultiAccountResourcesResponseBodyResources setTags(java.util.List<SearchMultiAccountResourcesResponseBodyResourcesTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<SearchMultiAccountResourcesResponseBodyResourcesTags> getTags() {
            return this.tags;
        }

        public SearchMultiAccountResourcesResponseBodyResources setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
