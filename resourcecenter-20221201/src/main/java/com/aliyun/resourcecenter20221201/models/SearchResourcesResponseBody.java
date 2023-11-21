// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class SearchResourcesResponseBody extends TeaModel {
    /**
     * <p>The filter conditions.</p>
     */
    @NameInMap("Filters")
    public java.util.List<SearchResourcesResponseBodyFilters> filters;

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

    public static class SearchResourcesResponseBodyResourcesIpAddressAttributes extends TeaModel {
        /**
         * <p>The IP address.</p>
         */
        @NameInMap("IpAddress")
        public String ipAddress;

        /**
         * <p>The network type. Valid values:</p>
         * <br>
         * <p>*   **Public**: the Internet</p>
         * <p>*   **Private**: internal network</p>
         */
        @NameInMap("NetworkType")
        public String networkType;

        /**
         * <p>The version.</p>
         */
        @NameInMap("Version")
        public String version;

        public static SearchResourcesResponseBodyResourcesIpAddressAttributes build(java.util.Map<String, ?> map) throws Exception {
            SearchResourcesResponseBodyResourcesIpAddressAttributes self = new SearchResourcesResponseBodyResourcesIpAddressAttributes();
            return TeaModel.build(map, self);
        }

        public SearchResourcesResponseBodyResourcesIpAddressAttributes setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public String getIpAddress() {
            return this.ipAddress;
        }

        public SearchResourcesResponseBodyResourcesIpAddressAttributes setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public SearchResourcesResponseBodyResourcesIpAddressAttributes setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class SearchResourcesResponseBodyResourcesTags extends TeaModel {
        /**
         * <p>The key of tag N.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N.</p>
         */
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
        /**
         * <p>The ID of the Alibaba Cloud account.</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        /**
         * <p>The time when the resource was created.</p>
         * <br>
         * <p>>  Whether this parameter is returned is determined by the Alibaba Cloud service to which the resource belongs.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The time when the resource expires.</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>The attributes of the IP address.</p>
         */
        @NameInMap("IpAddressAttributes")
        public java.util.List<SearchResourcesResponseBodyResourcesIpAddressAttributes> ipAddressAttributes;

        /**
         * <p>The IP addresses.</p>
         * <br>
         * <p>>  Whether this parameter is returned is determined by the Alibaba Cloud service to which the resource belongs.</p>
         */
        @NameInMap("IpAddresses")
        public java.util.List<String> ipAddresses;

        /**
         * <p>The region ID.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The resource group ID.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The resource ID.</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The resource name.</p>
         */
        @NameInMap("ResourceName")
        public String resourceName;

        /**
         * <p>The resource type.</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<SearchResourcesResponseBodyResourcesTags> tags;

        /**
         * <p>The zone ID.</p>
         * <br>
         * <p>>  Whether this parameter is returned is determined by the Alibaba Cloud service to which the resource belongs.</p>
         */
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

        public SearchResourcesResponseBodyResources setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public SearchResourcesResponseBodyResources setIpAddressAttributes(java.util.List<SearchResourcesResponseBodyResourcesIpAddressAttributes> ipAddressAttributes) {
            this.ipAddressAttributes = ipAddressAttributes;
            return this;
        }
        public java.util.List<SearchResourcesResponseBodyResourcesIpAddressAttributes> getIpAddressAttributes() {
            return this.ipAddressAttributes;
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
