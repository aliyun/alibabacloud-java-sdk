// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class SearchResourcesRequest extends TeaModel {
    /**
     * <p>The filter conditions.</p>
     */
    @NameInMap("Filter")
    public java.util.List<SearchResourcesRequestFilter> filter;

    /**
     * <p>Specifies whether to include deleted resources. Valid values:</p>
     * <ul>
     * <li><p>true</p>
     * </li>
     * <li><p>false</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IncludeDeletedResources")
    public Boolean includeDeletedResources;

    /**
     * <p>The maximum number of entries per page.</p>
     * <p>Valid values: 1 to 500.</p>
     * <p>Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of <code>NextToken</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJzZWFyY2hBZnRlcnMiOlsiMTAwMTU2Nzk4MTU1OSJd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmzawhxxc****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The search keyword. Resource Center filters and sorts the search results based on relevance.
     * If you do not specify a sorting parameter, resources that better match the keyword are displayed with higher priority.</p>
     * 
     * <strong>example:</strong>
     * <p>keywords</p>
     */
    @NameInMap("SearchExpression")
    public String searchExpression;

    /**
     * <p>The sorting parameters.</p>
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

    public SearchResourcesRequest setIncludeDeletedResources(Boolean includeDeletedResources) {
        this.includeDeletedResources = includeDeletedResources;
        return this;
    }
    public Boolean getIncludeDeletedResources() {
        return this.includeDeletedResources;
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

    public SearchResourcesRequest setSearchExpression(String searchExpression) {
        this.searchExpression = searchExpression;
        return this;
    }
    public String getSearchExpression() {
        return this.searchExpression;
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
         * <p>The key of the filter condition. For more information about the valid values, see the &quot;<code>Supported filter parameters</code>&quot; section below.</p>
         * 
         * <strong>example:</strong>
         * <p>RegionId</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The matching method. Valid values:</p>
         * <ul>
         * <li><p>Equals: Exact match.</p>
         * </li>
         * <li><p>Prefix: Prefix match.</p>
         * </li>
         * <li><p>Contains: Contains a value.</p>
         * </li>
         * <li><p>NotContains: Does not contain a value.</p>
         * </li>
         * <li><p>Exists: The key exists.</p>
         * </li>
         * <li><p>NotExists: The key does not exist.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Equals</p>
         */
        @NameInMap("MatchType")
        public String matchType;

        /**
         * <p>The value of the filter condition.</p>
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
         * <p>The sort key.</p>
         * <p>Set this parameter to <code>CreateTime</code>, which means the results are sorted by resource creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>CreateTime</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The sort order. Valid values:</p>
         * <ul>
         * <li><p>ASC: Ascending order.</p>
         * </li>
         * <li><p>DESC: Descending order.</p>
         * </li>
         * </ul>
         * <p>Default value: ASC.</p>
         * 
         * <strong>example:</strong>
         * <p>ASC</p>
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
