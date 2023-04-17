// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class ListProductsAsEndUserRequest extends TeaModel {
    /**
     * <p>The filter conditions.</p>
     */
    @NameInMap("Filters")
    public java.util.List<ListProductsAsEndUserRequestFilters> filters;

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
     * <p>Valid values: 1 to 100. Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The field that is used to sort the queried data.</p>
     * <br>
     * <p>Set the value to CreateTime, which specifies the time when the product was created.</p>
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

        public static ListProductsAsEndUserRequestFilters build(java.util.Map<String, ?> map) throws Exception {
            ListProductsAsEndUserRequestFilters self = new ListProductsAsEndUserRequestFilters();
            return TeaModel.build(map, self);
        }

        public ListProductsAsEndUserRequestFilters setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
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
