// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class SearchMultiAccountResourcesRequest extends TeaModel {
    /**
     * <p>The filter conditions.</p>
     */
    @NameInMap("Filter")
    public java.util.List<SearchMultiAccountResourcesRequestFilter> filter;

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
     * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
     * <br>
     * <p>If the total number of entries returned for the current request exceeds the value of the `MaxResults` parameter, the entries are truncated. In this case, you can use the token to initiate another request and obtain the remaining entries.``</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The search scope. You can set the value to one of the following items:</p>
     * <br>
     * <p>*   ID of a resource directory: Resources within the management account and all members of the resource directory are searched. You can call the [GetResourceDirectory](~~159995~~) operation to obtain the ID.</p>
     * <p>*   ID of the Root folder: Resources within all members in the Root folder and the subfolders of the Root folder are searched. You can call the [ListFoldersForParent](~~159997~~) operation to obtain the ID.</p>
     * <p>*   ID of a folder: Resources within all members in the folder are searched. You can call the [ListFoldersForParent](~~159997~~) operation to obtain the ID.</p>
     * <p>*   ID of a member: Resources within the member are searched. You can call the [ListAccounts](~~160016~~) operation to obtain the ID.</p>
     */
    @NameInMap("Scope")
    public String scope;

    /**
     * <p>The method that is used to sort the entries returned.</p>
     */
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
        /**
         * <p>The key of the filter condition. For more information, see `Supported filter parameters`.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The matching mode.</p>
         * <br>
         * <p>The value Equals indicates an equal match.</p>
         */
        @NameInMap("MatchType")
        public String matchType;

        /**
         * <p>The values of the filter condition.</p>
         */
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
        /**
         * <p>The attribute based on which the entries are sorted.</p>
         * <br>
         * <p>The value CreateTime indicates the creation time of resources.</p>
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
