// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class ListPortfoliosRequest extends TeaModel {
    @NameInMap("Filters")
    public java.util.List<ListPortfoliosRequestFilters> filters;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ProductId")
    public String productId;

    @NameInMap("Scope")
    public String scope;

    @NameInMap("SortBy")
    public String sortBy;

    @NameInMap("SortOrder")
    public String sortOrder;

    public static ListPortfoliosRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPortfoliosRequest self = new ListPortfoliosRequest();
        return TeaModel.build(map, self);
    }

    public ListPortfoliosRequest setFilters(java.util.List<ListPortfoliosRequestFilters> filters) {
        this.filters = filters;
        return this;
    }
    public java.util.List<ListPortfoliosRequestFilters> getFilters() {
        return this.filters;
    }

    public ListPortfoliosRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListPortfoliosRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPortfoliosRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public ListPortfoliosRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public ListPortfoliosRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListPortfoliosRequest setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public String getSortOrder() {
        return this.sortOrder;
    }

    public static class ListPortfoliosRequestFilters extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListPortfoliosRequestFilters build(java.util.Map<String, ?> map) throws Exception {
            ListPortfoliosRequestFilters self = new ListPortfoliosRequestFilters();
            return TeaModel.build(map, self);
        }

        public ListPortfoliosRequestFilters setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListPortfoliosRequestFilters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
