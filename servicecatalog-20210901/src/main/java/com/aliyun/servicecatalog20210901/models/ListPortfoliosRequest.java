// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class ListPortfoliosRequest extends TeaModel {
    @NameInMap("Filters")
    public java.util.List<ListPortfoliosRequestFilters> filters;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>prod-bp18r7q127****</p>
     */
    @NameInMap("ProductId")
    public String productId;

    /**
     * <strong>example:</strong>
     * <p>Local</p>
     */
    @NameInMap("Scope")
    public String scope;

    /**
     * <strong>example:</strong>
     * <p>CreateTime</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <strong>example:</strong>
     * <p>Desc</p>
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
         * <strong>example:</strong>
         * <p>PortfolioName</p>
         */
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
