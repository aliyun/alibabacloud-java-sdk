// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rmc20211104.models;

import com.aliyun.tea.*;

public class SearchResourcesResponseBody extends TeaModel {
    @NameInMap("Filters")
    public java.util.List<SearchResourcesResponseBodyFilters> filters;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Resources")
    public java.util.List<SearchResourcesResponseBodyResources> resources;

    public static SearchResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchResourcesResponseBody self = new SearchResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchResourcesResponseBody setFilters(java.util.List<SearchResourcesResponseBodyFilters> filters) {
        this.filters = filters;
        return this;
    }
    public java.util.List<SearchResourcesResponseBodyFilters> getFilters() {
        return this.filters;
    }

    public SearchResourcesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public SearchResourcesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public SearchResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchResourcesResponseBody setResources(java.util.List<SearchResourcesResponseBodyResources> resources) {
        this.resources = resources;
        return this;
    }
    public java.util.List<SearchResourcesResponseBodyResources> getResources() {
        return this.resources;
    }

    public static class SearchResourcesResponseBodyFilters extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("MatchType")
        public String matchType;

        @NameInMap("Values")
        public java.util.List<String> values;

        public static SearchResourcesResponseBodyFilters build(java.util.Map<String, ?> map) throws Exception {
            SearchResourcesResponseBodyFilters self = new SearchResourcesResponseBodyFilters();
            return TeaModel.build(map, self);
        }

        public SearchResourcesResponseBodyFilters setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public SearchResourcesResponseBodyFilters setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }
        public String getMatchType() {
            return this.matchType;
        }

        public SearchResourcesResponseBodyFilters setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class SearchResourcesResponseBodyResourcesTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static SearchResourcesResponseBodyResourcesTags build(java.util.Map<String, ?> map) throws Exception {
            SearchResourcesResponseBodyResourcesTags self = new SearchResourcesResponseBodyResourcesTags();
            return TeaModel.build(map, self);
        }

        public SearchResourcesResponseBodyResourcesTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public SearchResourcesResponseBodyResourcesTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class SearchResourcesResponseBodyResources extends TeaModel {
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
        public java.util.List<SearchResourcesResponseBodyResourcesTags> tags;

        @NameInMap("ZoneId")
        public String zoneId;

        public static SearchResourcesResponseBodyResources build(java.util.Map<String, ?> map) throws Exception {
            SearchResourcesResponseBodyResources self = new SearchResourcesResponseBodyResources();
            return TeaModel.build(map, self);
        }

        public SearchResourcesResponseBodyResources setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public SearchResourcesResponseBodyResources setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public SearchResourcesResponseBodyResources setIpAddresses(java.util.List<String> ipAddresses) {
            this.ipAddresses = ipAddresses;
            return this;
        }
        public java.util.List<String> getIpAddresses() {
            return this.ipAddresses;
        }

        public SearchResourcesResponseBodyResources setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public SearchResourcesResponseBodyResources setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public SearchResourcesResponseBodyResources setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public SearchResourcesResponseBodyResources setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

        public SearchResourcesResponseBodyResources setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public SearchResourcesResponseBodyResources setTags(java.util.List<SearchResourcesResponseBodyResourcesTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<SearchResourcesResponseBodyResourcesTags> getTags() {
            return this.tags;
        }

        public SearchResourcesResponseBodyResources setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
