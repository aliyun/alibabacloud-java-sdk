// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class SearchResourcesRequest extends TeaModel {
    /**
     * <p>The filter conditions.</p>
     */
    @NameInMap("Filter")
    public java.util.List<SearchResourcesRequestFilter> filter;

    @NameInMap("IncludeDeletedResources")
    public Boolean includeDeletedResources;

    /**
     * <p>The maximum number of entries per page.</p>
     * <p>Valid values: 1 to 100.</p>
     * <p>Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
     * <p>If the total number of entries returned for the current request exceeds the value of the <code>MaxResults</code> parameter, the entries are truncated. In this case, you can use the <code>token</code> to initiate another request and obtain the remaining entries.</p>
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

    @NameInMap("SearchExpression")
    public String searchExpression;

    /**
     * <p>The method that is used to sort the entries returned.</p>
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
         * <p>The key of the filter condition. For more information, see <code>Supported filter parameters</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>RegionId</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The matching mode.</p>
         * <p>The value Equals indicates an equal match.</p>
         * 
         * <strong>example:</strong>
         * <p>Equals</p>
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
         * <p>The value CreateTime indicates the creation time of resources.</p>
         * 
         * <strong>example:</strong>
         * <p>CreateTime</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The order in which the entries are sorted. Valid values:</p>
         * <ul>
         * <li>ASC: The entries are sorted in ascending order. This value is the default value.</li>
         * <li>DESC: The entries are sorted in descending order.</li>
         * </ul>
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
