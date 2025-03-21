// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class ListAccountsRequest extends TeaModel {
    /**
     * <p>Specifies whether to return information about tags. Valid values:</p>
     * <ul>
     * <li>false (default value)</li>
     * <li>true</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IncludeTags")
    public Boolean includeTags;

    /**
     * <p>The number of entries per page. After you configure this parameter, token-based paging is preferentially used.</p>
     * <p>Valid values: 1 to 100. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. If you leave this parameter empty, the query starts from the beginning.</p>
     * 
     * <strong>example:</strong>
     * <p>TGlzdFJlc291cm****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The number of the page to return.</p>
     * <p>Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * <p>Valid values: 1 to 100. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The keyword used for the query, such as the display name of a member.</p>
     * <p>Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>Advance</p>
     */
    @NameInMap("QueryKeyword")
    public String queryKeyword;

    /**
     * <p>The tags. This parameter specifies a filter condition.</p>
     */
    @NameInMap("Tag")
    public java.util.List<ListAccountsRequestTag> tag;

    public static ListAccountsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAccountsRequest self = new ListAccountsRequest();
        return TeaModel.build(map, self);
    }

    public ListAccountsRequest setIncludeTags(Boolean includeTags) {
        this.includeTags = includeTags;
        return this;
    }
    public Boolean getIncludeTags() {
        return this.includeTags;
    }

    public ListAccountsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAccountsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAccountsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAccountsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAccountsRequest setQueryKeyword(String queryKeyword) {
        this.queryKeyword = queryKeyword;
        return this;
    }
    public String getQueryKeyword() {
        return this.queryKeyword;
    }

    public ListAccountsRequest setTag(java.util.List<ListAccountsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListAccountsRequestTag> getTag() {
        return this.tag;
    }

    public static class ListAccountsRequestTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>tag_key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>tag_value</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListAccountsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListAccountsRequestTag self = new ListAccountsRequestTag();
            return TeaModel.build(map, self);
        }

        public ListAccountsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListAccountsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
