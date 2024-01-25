// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rmc20211104.models;

import com.aliyun.tea.*;

public class SearchResourcesRequest extends TeaModel {
    /**
     * <p>The filter conditions.</p>
     */
    @NameInMap("Filter")
    public java.util.List<SearchResourcesRequestFilter> filter;

    /**
     * <p>The maximum number of entries to return on each page.</p>
     * <br>
     * <p>Valid values: 1 to 100.</p>
     * <br>
     * <p>Default value: 20.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used to initiate the next request.</p>
     * <br>
     * <p>If the total number of entries returned for the current request exceeds the value of the `MaxResults` parameter, the entries are truncated. In this case, you can use the token to initiate another request and obtain the remaining entries.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The method that is used to sort the entries.</p>
     */
    @NameInMap("SortCriterion")
    public SearchResourcesRequestSortCriterion sortCriterion;

    public static SearchResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchResourcesRequest self = new SearchResourcesRequest();
        return TeaModel.build(map, self);
    }

    public SearchResourcesRequest setFilter(java.util.List<SearchResourcesRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<SearchResourcesRequestFilter> getFilter() {
        return this.filter;
    }

    public SearchResourcesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public SearchResourcesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public SearchResourcesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public SearchResourcesRequest setSortCriterion(SearchResourcesRequestSortCriterion sortCriterion) {
        this.sortCriterion = sortCriterion;
        return this;
    }
    public SearchResourcesRequestSortCriterion getSortCriterion() {
        return this.sortCriterion;
    }

    public static class SearchResourcesRequestFilter extends TeaModel {
        /**
         * <p>The key of the filter condition. Valid values:</p>
         * <br>
         * <p>*   ResourceType: resource type</p>
         * <p>*   RegionId: region ID</p>
         * <p>*   ResourceId: resource ID</p>
         * <p>*   ResourceGroupId: resource group ID</p>
         * <p>*   ResourceName: resource name</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The matching method. Set the value to Equals. This value indicates that resources that match the filter conditions are queried.</p>
         */
        @NameInMap("MatchType")
        public String matchType;

        /**
         * <p>The values of the filter condition.</p>
         */
        @NameInMap("Value")
        public java.util.List<String> value;

        public static SearchResourcesRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            SearchResourcesRequestFilter self = new SearchResourcesRequestFilter();
            return TeaModel.build(map, self);
        }

        public SearchResourcesRequestFilter setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public SearchResourcesRequestFilter setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }
        public String getMatchType() {
            return this.matchType;
        }

        public SearchResourcesRequestFilter setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

    public static class SearchResourcesRequestSortCriterion extends TeaModel {
        /**
         * <p>The attribute based on which the entries are sorted.</p>
         * <br>
         * <p>The value `CreateTime` indicates the creation time of resources.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The order in which the entries are sorted. Valid values:</p>
         * <br>
         * <p>*   ASC: The entries are sorted in ascending order. This value is the default value.</p>
         * <p>*   DESC: The entries are sorted in descending order.</p>
         */
        @NameInMap("Order")
        public String order;

        public static SearchResourcesRequestSortCriterion build(java.util.Map<String, ?> map) throws Exception {
            SearchResourcesRequestSortCriterion self = new SearchResourcesRequestSortCriterion();
            return TeaModel.build(map, self);
        }

        public SearchResourcesRequestSortCriterion setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public SearchResourcesRequestSortCriterion setOrder(String order) {
            this.order = order;
            return this;
        }
        public String getOrder() {
            return this.order;
        }

    }

}
