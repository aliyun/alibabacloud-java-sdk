// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class ListProvisionedProductsRequest extends TeaModel {
    // 访问过滤器
    @NameInMap("AccessLevelFilter")
    public String accessLevelFilter;

    // 过滤条件
    @NameInMap("Filters")
    public java.util.List<ListProvisionedProductsRequestFilters> filters;

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
        // 过滤条件的名称
        @NameInMap("Key")
        public String key;

        // 过滤条件的值
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
