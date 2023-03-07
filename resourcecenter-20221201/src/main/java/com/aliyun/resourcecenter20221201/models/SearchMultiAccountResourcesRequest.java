// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class SearchMultiAccountResourcesRequest extends TeaModel {
    @NameInMap("Filter")
    public java.util.List<SearchMultiAccountResourcesRequestFilter> filter;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("Scope")
    public String scope;

    @NameInMap("SortCriterion")
    public SearchMultiAccountResourcesRequestSortCriterion sortCriterion;

    public static SearchMultiAccountResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchMultiAccountResourcesRequest self = new SearchMultiAccountResourcesRequest();
        return TeaModel.build(map, self);
    }

    public SearchMultiAccountResourcesRequest setFilter(java.util.List<SearchMultiAccountResourcesRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<SearchMultiAccountResourcesRequestFilter> getFilter() {
        return this.filter;
    }

    public SearchMultiAccountResourcesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public SearchMultiAccountResourcesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public SearchMultiAccountResourcesRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public SearchMultiAccountResourcesRequest setSortCriterion(SearchMultiAccountResourcesRequestSortCriterion sortCriterion) {
        this.sortCriterion = sortCriterion;
        return this;
    }
    public SearchMultiAccountResourcesRequestSortCriterion getSortCriterion() {
        return this.sortCriterion;
    }

    public static class SearchMultiAccountResourcesRequestFilter extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("MatchType")
        public String matchType;

        @NameInMap("Value")
        public java.util.List<String> value;

        public static SearchMultiAccountResourcesRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            SearchMultiAccountResourcesRequestFilter self = new SearchMultiAccountResourcesRequestFilter();
            return TeaModel.build(map, self);
        }

        public SearchMultiAccountResourcesRequestFilter setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public SearchMultiAccountResourcesRequestFilter setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }
        public String getMatchType() {
            return this.matchType;
        }

        public SearchMultiAccountResourcesRequestFilter setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

    public static class SearchMultiAccountResourcesRequestSortCriterion extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Order")
        public String order;

        public static SearchMultiAccountResourcesRequestSortCriterion build(java.util.Map<String, ?> map) throws Exception {
            SearchMultiAccountResourcesRequestSortCriterion self = new SearchMultiAccountResourcesRequestSortCriterion();
            return TeaModel.build(map, self);
        }

        public SearchMultiAccountResourcesRequestSortCriterion setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public SearchMultiAccountResourcesRequestSortCriterion setOrder(String order) {
            this.order = order;
            return this;
        }
        public String getOrder() {
            return this.order;
        }

    }

}
