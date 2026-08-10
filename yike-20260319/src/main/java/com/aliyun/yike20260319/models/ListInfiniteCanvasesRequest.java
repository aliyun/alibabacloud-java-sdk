// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class ListInfiniteCanvasesRequest extends TeaModel {
    /**
     * <p>The query keyword. Currently, only searching by infinite canvas ID is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>canvas_xxx</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The current page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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

    /**
     * <p>The field by which the results are sorted.</p>
     * 
     * <strong>example:</strong>
     * <p>CreatedTime</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The sort order. Valid values:</p>
     * <ul>
     * <li><p>asc: ascending order</p>
     * </li>
     * <li><p>desc: descending order</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>asc</p>
     */
    @NameInMap("SortOrder")
    public String sortOrder;

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

}
