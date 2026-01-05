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
     * <p>The field that is used to sort data.</p>
     * <p>The default value is CreateTime, which specifies the time when the product was created.</p>
     * 
     * <strong>example:</strong>
     * <p>CreateTime</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The method that is used to sort the returned entries. Valid values:</p>
     * <ul>
     * <li>Asc: sorts the entries in ascending order.</li>
     * <li>Desc (default): sorts the entries in descending order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Desc</p>
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
