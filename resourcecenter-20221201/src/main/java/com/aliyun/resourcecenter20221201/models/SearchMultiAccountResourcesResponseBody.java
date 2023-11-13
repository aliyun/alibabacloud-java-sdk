// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class SearchMultiAccountResourcesResponseBody extends TeaModel {
    /**
     * <p>The filter conditions.</p>
     */
    @NameInMap("Filters")
    public java.util.List<SearchMultiAccountResourcesResponseBodyFilters> filters;

    /**
     * <p>The maximum number of entries returned per page.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the resources.</p>
     */
    @NameInMap("Resources")
    public java.util.List<SearchMultiAccountResourcesResponseBodyResources> resources;

    /**
     * <p>The search scope.</p>
     * <br>
     * <p>*   ID of a resource directory: Resources within the management account and all members of the resource directory are searched.</p>
     * <p>*   ID of the Root folder: Resources within all members in the Root folder and the subfolders of the Root folder are searched.</p>
     * <p>*   ID of a folder: Resources within all members in the folder are searched.</p>
     * <p>*   ID of a member: Resources within the member are searched.</p>
     */
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
        /**
         * <p>The key of the filter condition.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The matching mode.</p>
         */
        @NameInMap("MatchType")
        public String matchType;

        /**
         * <p>The values of the filter condition.</p>
         */
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

    public static class SearchMultiAccountResourcesResponseBodyResourcesIpAddressAttributes extends TeaModel {
        @NameInMap("IpAddress")
        public java.util.List<String> ipAddress;

        @NameInMap("NetworkType")
        public String networkType;

        @NameInMap("Version")
        public String version;

        public static SearchMultiAccountResourcesResponseBodyResourcesIpAddressAttributes build(java.util.Map<String, ?> map) throws Exception {
            SearchMultiAccountResourcesResponseBodyResourcesIpAddressAttributes self = new SearchMultiAccountResourcesResponseBodyResourcesIpAddressAttributes();
            return TeaModel.build(map, self);
        }

        public SearchMultiAccountResourcesResponseBodyResourcesIpAddressAttributes setIpAddress(java.util.List<String> ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public java.util.List<String> getIpAddress() {
            return this.ipAddress;
        }

        public SearchMultiAccountResourcesResponseBodyResourcesIpAddressAttributes setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public SearchMultiAccountResourcesResponseBodyResourcesIpAddressAttributes setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class SearchMultiAccountResourcesResponseBodyResourcesTags extends TeaModel {
        /**
         * <p>The key of the tag.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         */
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
        /**
         * <p>The ID of the management account or member of the resource directory.</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        /**
         * <p>The time when the resource was created.</p>
         * <br>
         * <p>> Whether this parameter is returned is determined by the Alibaba Cloud service to which the resource belongs.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("IpAddressAttributes")
        public java.util.List<SearchMultiAccountResourcesResponseBodyResourcesIpAddressAttributes> ipAddressAttributes;

        /**
         * <p>The IP addresses.</p>
         * <br>
         * <p>> Whether this parameter is returned is determined by the Alibaba Cloud service to which the resource belongs.</p>
         */
        @NameInMap("IpAddresses")
        public java.util.List<String> ipAddresses;

        /**
         * <p>The region ID of the resource.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the resource group to which the resource belongs.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The ID of the resource.</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The name of the resource.</p>
         */
        @NameInMap("ResourceName")
        public String resourceName;

        /**
         * <p>The type of the resource.</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The tags of the resource.</p>
         */
        @NameInMap("Tags")
        public java.util.List<SearchMultiAccountResourcesResponseBodyResourcesTags> tags;

        /**
         * <p>The zone ID of the resource.</p>
         * <br>
         * <p>> Whether this parameter is returned is determined by the Alibaba Cloud service to which the resource belongs.</p>
         */
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

        public SearchMultiAccountResourcesResponseBodyResources setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public SearchMultiAccountResourcesResponseBodyResources setIpAddressAttributes(java.util.List<SearchMultiAccountResourcesResponseBodyResourcesIpAddressAttributes> ipAddressAttributes) {
            this.ipAddressAttributes = ipAddressAttributes;
            return this;
        }
        public java.util.List<SearchMultiAccountResourcesResponseBodyResourcesIpAddressAttributes> getIpAddressAttributes() {
            return this.ipAddressAttributes;
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
