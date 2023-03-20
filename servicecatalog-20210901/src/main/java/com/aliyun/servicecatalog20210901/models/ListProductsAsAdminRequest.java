// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class ListProductsAsAdminRequest extends TeaModel {
    /**
     * <p>An array that consists of filter conditions.</p>
     */
    @NameInMap("Filters")
    public java.util.List<ListProductsAsAdminRequestFilters> filters;

    /**
     * <p>The number of the page to return.</p>
     * <br>
     * <p>Pages start from page 1. Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * <br>
     * <p>Valid values: 1 to 100. Pages start from page 1. Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the product portfolio.</p>
     */
    @NameInMap("PortfolioId")
    public String portfolioId;

    /**
     * <p>The query scope. Valid values:</p>
     * <br>
     * <p>*   Local: the products that are created by using the current account. This is the default value.</p>
     * <p>*   Import: the products that are imported from other accounts.</p>
     * <p>*   All: all available products.</p>
     */
    @NameInMap("Scope")
    public String scope;

    /**
     * <p>The information based on which you want to sort the products.</p>
     * <br>
     * <p>The value is fixed as CreateTime, which specifies the creation time of products.</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The order in which you want to sort the query results. Valid values:</p>
     * <br>
     * <p>*   Asc: the ascending order</p>
     * <p>*   Desc: the descending order</p>
     */
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
        /**
         * <p>The name of the filter condition. Valid values:</p>
         * <br>
         * <p>*   ProductName: performs exact matches by product name. Product names are not case-sensitive.</p>
         * <p>*   FullTextSearch: performs full-text searches by product name, product provider, or product description. Fuzzy match is supported.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the filter condition.</p>
         */
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
