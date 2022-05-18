// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class ListProductsAsEndUserRequest extends TeaModel {
    // 过滤条件
    @NameInMap("Filters")
    public java.util.List<ListProductsAsEndUserRequestFilters> filters;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    // 排序字段
    @NameInMap("SortBy")
    public String sortBy;

    // 排序方式
    @NameInMap("SortOrder")
    public String sortOrder;

    public static ListProductsAsEndUserRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProductsAsEndUserRequest self = new ListProductsAsEndUserRequest();
        return TeaModel.build(map, self);
    }

    public ListProductsAsEndUserRequest setFilters(java.util.List<ListProductsAsEndUserRequestFilters> filters) {
        this.filters = filters;
        return this;
    }
    public java.util.List<ListProductsAsEndUserRequestFilters> getFilters() {
        return this.filters;
    }

    public ListProductsAsEndUserRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListProductsAsEndUserRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListProductsAsEndUserRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListProductsAsEndUserRequest setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public String getSortOrder() {
        return this.sortOrder;
    }

    public static class ListProductsAsEndUserRequestFilters extends TeaModel {
        // 过滤条件的名称
        @NameInMap("Name")
        public String name;

        // 过滤条件的值
        @NameInMap("Value")
        public String value;

        public static ListProductsAsEndUserRequestFilters build(java.util.Map<String, ?> map) throws Exception {
            ListProductsAsEndUserRequestFilters self = new ListProductsAsEndUserRequestFilters();
            return TeaModel.build(map, self);
        }

        public ListProductsAsEndUserRequestFilters setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListProductsAsEndUserRequestFilters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
