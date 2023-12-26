// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class ListFiltersResponseBody extends TeaModel {
    @NameInMap("DefaultFilterName")
    public String defaultFilterName;

    @NameInMap("Filters")
    public java.util.List<ListFiltersResponseBodyFilters> filters;

    @NameInMap("RequestId")
    public String requestId;

    public static ListFiltersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFiltersResponseBody self = new ListFiltersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFiltersResponseBody setDefaultFilterName(String defaultFilterName) {
        this.defaultFilterName = defaultFilterName;
        return this;
    }
    public String getDefaultFilterName() {
        return this.defaultFilterName;
    }

    public ListFiltersResponseBody setFilters(java.util.List<ListFiltersResponseBodyFilters> filters) {
        this.filters = filters;
        return this;
    }
    public java.util.List<ListFiltersResponseBodyFilters> getFilters() {
        return this.filters;
    }

    public ListFiltersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListFiltersResponseBodyFilters extends TeaModel {
        @NameInMap("FilterConfiguration")
        public String filterConfiguration;

        @NameInMap("FilterName")
        public String filterName;

        public static ListFiltersResponseBodyFilters build(java.util.Map<String, ?> map) throws Exception {
            ListFiltersResponseBodyFilters self = new ListFiltersResponseBodyFilters();
            return TeaModel.build(map, self);
        }

        public ListFiltersResponseBodyFilters setFilterConfiguration(String filterConfiguration) {
            this.filterConfiguration = filterConfiguration;
            return this;
        }
        public String getFilterConfiguration() {
            return this.filterConfiguration;
        }

        public ListFiltersResponseBodyFilters setFilterName(String filterName) {
            this.filterName = filterName;
            return this;
        }
        public String getFilterName() {
            return this.filterName;
        }

    }

}
