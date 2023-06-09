// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class GetResourceCountsResponseBody extends TeaModel {
    /**
     * <p>The filter conditions.</p>
     */
    @NameInMap("Filters")
    public java.util.List<GetResourceCountsResponseBodyFilters> filters;

    /**
     * <p>The dimension by which resources are queried.</p>
     */
    @NameInMap("GroupByKey")
    public String groupByKey;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The numbers of resources.</p>
     */
    @NameInMap("ResourceCounts")
    public java.util.List<GetResourceCountsResponseBodyResourceCounts> resourceCounts;

    public static GetResourceCountsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetResourceCountsResponseBody self = new GetResourceCountsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetResourceCountsResponseBody setFilters(java.util.List<GetResourceCountsResponseBodyFilters> filters) {
        this.filters = filters;
        return this;
    }
    public java.util.List<GetResourceCountsResponseBodyFilters> getFilters() {
        return this.filters;
    }

    public GetResourceCountsResponseBody setGroupByKey(String groupByKey) {
        this.groupByKey = groupByKey;
        return this;
    }
    public String getGroupByKey() {
        return this.groupByKey;
    }

    public GetResourceCountsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetResourceCountsResponseBody setResourceCounts(java.util.List<GetResourceCountsResponseBodyResourceCounts> resourceCounts) {
        this.resourceCounts = resourceCounts;
        return this;
    }
    public java.util.List<GetResourceCountsResponseBodyResourceCounts> getResourceCounts() {
        return this.resourceCounts;
    }

    public static class GetResourceCountsResponseBodyFilters extends TeaModel {
        /**
         * <p>The key of the filter condition.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The values of the filter condition.</p>
         */
        @NameInMap("Values")
        public java.util.List<String> values;

        public static GetResourceCountsResponseBodyFilters build(java.util.Map<String, ?> map) throws Exception {
            GetResourceCountsResponseBodyFilters self = new GetResourceCountsResponseBodyFilters();
            return TeaModel.build(map, self);
        }

        public GetResourceCountsResponseBodyFilters setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetResourceCountsResponseBodyFilters setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class GetResourceCountsResponseBodyResourceCounts extends TeaModel {
        /**
         * <p>The number of resources.</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <p>The group name.</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        public static GetResourceCountsResponseBodyResourceCounts build(java.util.Map<String, ?> map) throws Exception {
            GetResourceCountsResponseBodyResourceCounts self = new GetResourceCountsResponseBodyResourceCounts();
            return TeaModel.build(map, self);
        }

        public GetResourceCountsResponseBodyResourceCounts setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public GetResourceCountsResponseBodyResourceCounts setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

    }

}
