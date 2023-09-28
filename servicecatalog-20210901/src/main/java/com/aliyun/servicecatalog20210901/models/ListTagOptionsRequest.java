// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class ListTagOptionsRequest extends TeaModel {
    /**
     * <p>The filter condition.</p>
     */
    @NameInMap("Filters")
    public ListTagOptionsRequestFilters filters;

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
     * <p>The information based on which you want to sort the query results.</p>
     * <br>
     * <p>Set the value to CreateTime, which specifies the creation time of tag options.</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The order in which you want to sort the query results. Valid values:</p>
     * <br>
     * <p>*   Asc: the ascending order</p>
     * <p>*   Desc (default): the descending order</p>
     */
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
        /**
         * <p>Specifies whether to enable the tag option. Valid values:</p>
         * <br>
         * <p>*   true (default)</p>
         * <p>*   false</p>
         */
        @NameInMap("Active")
        public Boolean active;

        /**
         * <p>The full-text search method.</p>
         */
        @NameInMap("FullTextSearch")
        public String fullTextSearch;

        /**
         * <p>The key of the tag option.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag option.</p>
         */
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
