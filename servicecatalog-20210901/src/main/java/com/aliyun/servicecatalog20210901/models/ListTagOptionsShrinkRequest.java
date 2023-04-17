// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class ListTagOptionsShrinkRequest extends TeaModel {
    @NameInMap("Filters")
    public String filtersShrink;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SortBy")
    public String sortBy;

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
