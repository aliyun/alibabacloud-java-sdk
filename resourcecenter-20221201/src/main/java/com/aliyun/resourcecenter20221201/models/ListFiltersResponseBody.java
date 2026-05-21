// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class ListFiltersResponseBody extends TeaModel {
    /**
     * <p>The name of the default filter.</p>
     * 
     * <strong>example:</strong>
     * <p>My Filters</p>
     */
    @NameInMap("DefaultFilterName")
    public String defaultFilterName;

    /**
     * <p>The configurations of the filter.</p>
     */
    @NameInMap("Filters")
    public java.util.List<ListFiltersResponseBodyFilters> filters;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>AA39FB9C-CB74-5E73-8DFE-3A2B096F0759</p>
     */
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
        /**
         * <p>The configurations of the filter.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;regions&quot;: [],
         *   &quot;tagFilters&quot;: [
         *     [{ &quot;type&quot;: &quot;notContainTagKey&quot;, &quot;tagKey&quot;: &quot;xxx&quot;, &quot;tagValue&quot;: &quot;&quot; }],
         *     [{ &quot;tagKey&quot;: &quot;xxx&quot;, &quot;tagValue&quot;: &quot;xxx&quot; }]
         *   ],
         *   &quot;resourceTypes&quot;: [
         *     &quot;ACS::ECS::AutoSnapshotPolicy&quot;
         *   ]
         * }</p>
         */
        @NameInMap("FilterConfiguration")
        public String filterConfiguration;

        /**
         * <p>The name of the filter.</p>
         * 
         * <strong>example:</strong>
         * <p>My devices</p>
         */
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
