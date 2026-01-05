// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class ListProductsAsAdminRequest extends TeaModel {
    /**
     * <p>The filter conditions.</p>
     */
    @NameInMap("Filters")
    public java.util.List<ListProductsAsAdminRequestFilters> filters;

    /**
     * <p>The number of the page to return.</p>
     * <p>Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * <p>Valid values: 1 to 100. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the product portfolio.</p>
     * 
     * <strong>example:</strong>
     * <p>port-bp1yt7582g****</p>
     */
    @NameInMap("PortfolioId")
    public String portfolioId;

    /**
     * <p>The query scope. Valid values:</p>
     * <ul>
     * <li>Local: the products that are created by using the current account. This is the default value.</li>
     * <li>Import: the products that are imported from other accounts.</li>
     * <li>All: all available products.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Local</p>
     */
    @NameInMap("Scope")
    public String scope;

    /**
     * <p>The field that is used to sort the queried data.</p>
     * <p>Set the value to CreateTime, which specifies the time when the product was created.</p>
     * 
     * <strong>example:</strong>
     * <p>CreateTime</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The order in which you want to sort the queried data. Valid values:</p>
     * <ul>
     * <li>Asc: the ascending order</li>
     * <li>Desc: the descending order</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Desc</p>
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
         * <ul>
         * <li>ProductName: performs exact matches by product name. Product names are not case-sensitive.</li>
         * <li>FullTextSearch: performs full-text searches by product name, product provider, or product description. Fuzzy match is supported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ProductName</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the filter condition.</p>
         * 
         * <strong>example:</strong>
         * <p>DEMO-Create an ECS instance</p>
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
