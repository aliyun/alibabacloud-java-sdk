// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class ListPortfoliosRequest extends TeaModel {
    /**
     * <p>The filter condition.</p>
     */
    @NameInMap("Filters")
    public java.util.List<ListPortfoliosRequestFilters> filters;

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
     * <p>The ID of the product.</p>
     */
    @NameInMap("ProductId")
    public String productId;

    /**
     * <p>The query scope. Valid values:</p>
     * <br>
     * <p>*   Local: the product portfolios that are created by using the current account. This is the default value.</p>
     * <p>*   Import: the product portfolios that are imported from other accounts.</p>
     * <p>*   All: All available product portfolios.</p>
     */
    @NameInMap("Scope")
    public String scope;

    /**
     * <p>The field that is used to sort the queried data.</p>
     * <br>
     * <p>The value is fixed as CreateTime, which specifies the creation time of product portfolios.</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The order in which you want to sort the queried data. Valid values:</p>
     * <br>
     * <p>*   Asc: the ascending order</p>
     * <p>*   Desc: the descending order</p>
     */
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
        /**
         * <p>The name of the filter condition. Valid values:</p>
         * <br>
         * <p>*   PortfolioName: performs exact matches by product portfolio name. Product portfolio names are not case-sensitive.</p>
         * <p>*   FullTextSearch: performs full-text searches by product portfolio name, product portfolio provider, or product portfolio description. Fuzzy match is supported.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the filter condition.</p>
         */
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
