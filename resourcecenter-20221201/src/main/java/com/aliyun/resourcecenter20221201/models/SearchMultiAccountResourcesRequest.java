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
     * <p>Valid values: 1 to 100.</p>
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
     * <p>The scope of the accounts in which you want to search for resources. Valid values:</p>
     * <ul>
     * <li><p>The ID of a resource directory: Searches for resources in the management account and all its member accounts. For more information, see <a href="https://help.aliyun.com/document_detail/159995.html">GetResourceDirectory</a>.</p>
     * </li>
     * <li><p>The ID of the Root folder: Searches for resources in all member accounts under the Root folder and its subfolders. For more information, see <a href="https://help.aliyun.com/document_detail/159997.html">ListFoldersForParent</a>.</p>
     * </li>
     * <li><p>The ID of a folder: Searches for resources in all member accounts under the folder. For more information, see <a href="https://help.aliyun.com/document_detail/159997.html">ListFoldersForParent</a>.</p>
     * </li>
     * <li><p>The ID of a member account: Searches for resources in the member account. For more information, see <a href="https://help.aliyun.com/document_detail/160016.html">ListAccounts</a>.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rd-r4****</p>
     */
    @NameInMap("Scope")
    public String scope;

    /**
     * <p>The sorting parameters.</p>
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
         * <p>The key of the filter condition. For more information, see the &quot;<code>Supported filter parameters</code>&quot; section below.</p>
         * 
         * <strong>example:</strong>
         * <p>ResourceGroupId</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The matching method.</p>
         * <p>Set this parameter to <code>Equals</code>, which means an exact match.</p>
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
