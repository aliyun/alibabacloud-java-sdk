// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class ListInfiniteCanvasesRequest extends TeaModel {
    /**
     * <p>The keyword for querying site monitoring tasks. Supports fuzzy match based on task name or task address.</p>
     * 
     * <strong>example:</strong>
     * <p>v2_</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The current page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>16</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ProductionId")
    public String productionId;

    /**
     * <p>The sort field and sort order. Separate multiple values with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>utcCreate:Desc</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The sort direction.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>Asc: Ascending order.</li>
     * <li>Desc: Descending order.</li>
     * </ul>
     * <p>Default value: Desc.</p>
     * 
     * <strong>example:</strong>
     * <p>Ascending</p>
     */
    @NameInMap("SortOrder")
    public String sortOrder;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListInfiniteCanvasesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInfiniteCanvasesRequest self = new ListInfiniteCanvasesRequest();
        return TeaModel.build(map, self);
    }

    public ListInfiniteCanvasesRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListInfiniteCanvasesRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListInfiniteCanvasesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListInfiniteCanvasesRequest setProductionId(String productionId) {
        this.productionId = productionId;
        return this;
    }
    public String getProductionId() {
        return this.productionId;
    }

    public ListInfiniteCanvasesRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListInfiniteCanvasesRequest setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public String getSortOrder() {
        return this.sortOrder;
    }

    public ListInfiniteCanvasesRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
