// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class ListTagOptionsShrinkRequest extends TeaModel {
    /**
     * <p>The filter condition.</p>
     */
    @NameInMap("Filters")
    public String filtersShrink;

    /**
     * <p>The number of the page to return.</p>
     * <br>
     * <p>Pages start from page 1. Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * <br>
     * <p>Valid values: 1 to 100. Minimum value: 1. Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The information based on which you want to sort the query results.</p>
     * <br>
     * <p>Set the value to CreateTime, which specifies the creation time of tag options.</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The order in which you want to sort the query results. Valid values:</p>
     * <br>
     * <p>*   Asc: the ascending order</p>
     * <p>*   Desc (default): the descending order</p>
     */
    @NameInMap("SortOrder")
    public String sortOrder;

    public static ListTagOptionsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTagOptionsShrinkRequest self = new ListTagOptionsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListTagOptionsShrinkRequest setFiltersShrink(String filtersShrink) {
        this.filtersShrink = filtersShrink;
        return this;
    }
    public String getFiltersShrink() {
        return this.filtersShrink;
    }

    public ListTagOptionsShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListTagOptionsShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTagOptionsShrinkRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListTagOptionsShrinkRequest setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public String getSortOrder() {
        return this.sortOrder;
    }

}
