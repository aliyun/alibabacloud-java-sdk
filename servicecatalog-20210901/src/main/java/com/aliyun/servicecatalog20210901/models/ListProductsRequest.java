// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class ListProductsRequest extends TeaModel {
    @NameInMap("Filter")
    public java.util.List<ListProductsRequestFilter> filter;

    @NameInMap("PageNumber")
    public String pageNumber;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SortBy")
    public String sortBy;

    @NameInMap("SortOrder")
    public String sortOrder;

    public static ListProductsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProductsRequest self = new ListProductsRequest();
        return TeaModel.build(map, self);
    }

    public ListProductsRequest setFilter(java.util.List<ListProductsRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<ListProductsRequestFilter> getFilter() {
        return this.filter;
    }

    public ListProductsRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListProductsRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListProductsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListProductsRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListProductsRequest setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public String getSortOrder() {
        return this.sortOrder;
    }

    public static class ListProductsRequestFilter extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Value")
        public String value;

        public static ListProductsRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            ListProductsRequestFilter self = new ListProductsRequestFilter();
            return TeaModel.build(map, self);
        }

        public ListProductsRequestFilter setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListProductsRequestFilter setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
