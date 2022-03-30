// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rmc20211104.models;

import com.aliyun.tea.*;

public class SearchResourcesRequest extends TeaModel {
    @NameInMap("Filter")
    public java.util.List<SearchResourcesRequestFilter> filter;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

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
        @NameInMap("Key")
        public String key;

        @NameInMap("MatchType")
        public String matchType;

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
        @NameInMap("Key")
        public String key;

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
