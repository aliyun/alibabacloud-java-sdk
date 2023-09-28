// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class ListProvisionedProductsRequest extends TeaModel {
    /**
     * <p>The access filter. Valid values:</p>
     * <br>
     * <p>*   User: queries the product instances that are created by the current requester. This is the default value.</p>
     * <p>*   Account: queries the product instances that belong to the current Alibaba Cloud account.</p>
     */
    @NameInMap("AccessLevelFilter")
    public String accessLevelFilter;

    /**
     * <p>The filter conditions.</p>
     */
    @NameInMap("Filters")
    public java.util.List<ListProvisionedProductsRequestFilters> filters;

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
     * <p>Set the value to CreateTime, which specifies the time when the product instance was created.</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The sorting method. Valid values:</p>
     * <br>
     * <p>*   Asc: the ascending order.</p>
     * <p>*   Desc (default): the descending order.</p>
     */
    @NameInMap("SortOrder")
    public String sortOrder;

    public static ListProvisionedProductsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProvisionedProductsRequest self = new ListProvisionedProductsRequest();
        return TeaModel.build(map, self);
    }

    public ListProvisionedProductsRequest setAccessLevelFilter(String accessLevelFilter) {
        this.accessLevelFilter = accessLevelFilter;
        return this;
    }
    public String getAccessLevelFilter() {
        return this.accessLevelFilter;
    }

    public ListProvisionedProductsRequest setFilters(java.util.List<ListProvisionedProductsRequestFilters> filters) {
        this.filters = filters;
        return this;
    }
    public java.util.List<ListProvisionedProductsRequestFilters> getFilters() {
        return this.filters;
    }

    public ListProvisionedProductsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListProvisionedProductsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListProvisionedProductsRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListProvisionedProductsRequest setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public String getSortOrder() {
        return this.sortOrder;
    }

    public static class ListProvisionedProductsRequestFilters extends TeaModel {
        /**
         * <p>The name of the filter condition. Valid values:</p>
         * <br>
         * <p>*   ProvisionedProductName: performs exact matches by product instance name. Product instance names are not case-sensitive.</p>
         * <p>*   FullTextSearch: performs full-text searches by product instance name. Fuzzy match is supported.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the filter condition.</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListProvisionedProductsRequestFilters build(java.util.Map<String, ?> map) throws Exception {
            ListProvisionedProductsRequestFilters self = new ListProvisionedProductsRequestFilters();
            return TeaModel.build(map, self);
        }

        public ListProvisionedProductsRequestFilters setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListProvisionedProductsRequestFilters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
