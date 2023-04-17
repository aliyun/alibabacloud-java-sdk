// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class ListTagOptionsRequest extends TeaModel {
    @NameInMap("Filters")
    public ListTagOptionsRequestFilters filters;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SortBy")
    public String sortBy;

    @NameInMap("SortOrder")
    public String sortOrder;

    public static ListTagOptionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTagOptionsRequest self = new ListTagOptionsRequest();
        return TeaModel.build(map, self);
    }

    public ListTagOptionsRequest setFilters(ListTagOptionsRequestFilters filters) {
        this.filters = filters;
        return this;
    }
    public ListTagOptionsRequestFilters getFilters() {
        return this.filters;
    }

    public ListTagOptionsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListTagOptionsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTagOptionsRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListTagOptionsRequest setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public String getSortOrder() {
        return this.sortOrder;
    }

    public static class ListTagOptionsRequestFilters extends TeaModel {
        @NameInMap("Active")
        public Boolean active;

        @NameInMap("FullTextSearch")
        public String fullTextSearch;

        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListTagOptionsRequestFilters build(java.util.Map<String, ?> map) throws Exception {
            ListTagOptionsRequestFilters self = new ListTagOptionsRequestFilters();
            return TeaModel.build(map, self);
        }

        public ListTagOptionsRequestFilters setActive(Boolean active) {
            this.active = active;
            return this;
        }
        public Boolean getActive() {
            return this.active;
        }

        public ListTagOptionsRequestFilters setFullTextSearch(String fullTextSearch) {
            this.fullTextSearch = fullTextSearch;
            return this;
        }
        public String getFullTextSearch() {
            return this.fullTextSearch;
        }

        public ListTagOptionsRequestFilters setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListTagOptionsRequestFilters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
