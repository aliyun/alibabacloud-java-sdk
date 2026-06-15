// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class ListLLMConfigsRequest extends TeaModel {
    /**
     * <p>The maximum number of results to return.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The name of the LLM configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>llm_config_1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>A pagination token returned from a previous call. Pass this token to retrieve the next page of results. If you do not specify this parameter, the query starts from the beginning.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The sort order.</p>
     * 
     * <strong>example:</strong>
     * <p>Asc</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The page size.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The field to sort by.</p>
     * 
     * <strong>example:</strong>
     * <p>GmtModifiedTime</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>234</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListLLMConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLLMConfigsRequest self = new ListLLMConfigsRequest();
        return TeaModel.build(map, self);
    }

    public ListLLMConfigsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListLLMConfigsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListLLMConfigsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListLLMConfigsRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListLLMConfigsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListLLMConfigsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListLLMConfigsRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListLLMConfigsRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
