// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class ListProductsAsAdminRequest extends TeaModel {
    // 过滤条件
    @NameInMap("Filters")
    public java.util.List<ListProductsAsAdminRequestFilters> filters;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    // 产品组合ID
    @NameInMap("PortfolioId")
    public String portfolioId;

    @NameInMap("Scope")
    public String scope;

    // 排序字段
    @NameInMap("SortBy")
    public String sortBy;

    // 排序方式
    @NameInMap("SortOrder")
    public String sortOrder;

    public static ListProductsAsAdminRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProductsAsAdminRequest self = new ListProductsAsAdminRequest();
        return TeaModel.build(map, self);
    }

    public ListProductsAsAdminRequest setFilters(java.util.List<ListProductsAsAdminRequestFilters> filters) {
        this.filters = filters;
        return this;
    }
    public java.util.List<ListProductsAsAdminRequestFilters> getFilters() {
        return this.filters;
    }

    public ListProductsAsAdminRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListProductsAsAdminRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListProductsAsAdminRequest setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
        return this;
    }
    public String getPortfolioId() {
        return this.portfolioId;
    }

    public ListProductsAsAdminRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public ListProductsAsAdminRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListProductsAsAdminRequest setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public String getSortOrder() {
        return this.sortOrder;
    }

    public static class ListProductsAsAdminRequestFilters extends TeaModel {
        // 过滤条件的名称
        @NameInMap("Key")
        public String key;

        // 过滤条件的值
        @NameInMap("Value")
        public String value;

        public static ListProductsAsAdminRequestFilters build(java.util.Map<String, ?> map) throws Exception {
            ListProductsAsAdminRequestFilters self = new ListProductsAsAdminRequestFilters();
            return TeaModel.build(map, self);
        }

        public ListProductsAsAdminRequestFilters setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListProductsAsAdminRequestFilters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
