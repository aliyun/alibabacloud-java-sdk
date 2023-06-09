// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class GetResourceCountsRequest extends TeaModel {
    /**
     * <p>The filter conditions.</p>
     */
    @NameInMap("Filter")
    public java.util.List<GetResourceCountsRequestFilter> filter;

    /**
     * <p>The dimension by which resources are queried. Valid values:</p>
     * <br>
     * <p>*   ResourceType</p>
     * <p>*   Region</p>
     * <p>*   ResourceGroupId</p>
     * <p>*   TagKey</p>
     * <p>*   TagValue</p>
     */
    @NameInMap("GroupByKey")
    public String groupByKey;

    public static GetResourceCountsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetResourceCountsRequest self = new GetResourceCountsRequest();
        return TeaModel.build(map, self);
    }

    public GetResourceCountsRequest setFilter(java.util.List<GetResourceCountsRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<GetResourceCountsRequestFilter> getFilter() {
        return this.filter;
    }

    public GetResourceCountsRequest setGroupByKey(String groupByKey) {
        this.groupByKey = groupByKey;
        return this;
    }
    public String getGroupByKey() {
        return this.groupByKey;
    }

    public static class GetResourceCountsRequestFilter extends TeaModel {
        /**
         * <p>The key of the filter condition. For more information, see `Supported filter parameters`.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The matching mode.</p>
         * <br>
         * <p>The value Equals indicates an equal match.</p>
         */
        @NameInMap("MatchType")
        public String matchType;

        /**
         * <p>The values of the filter condition.</p>
         */
        @NameInMap("Value")
        public java.util.List<String> value;

        public static GetResourceCountsRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            GetResourceCountsRequestFilter self = new GetResourceCountsRequestFilter();
            return TeaModel.build(map, self);
        }

        public GetResourceCountsRequestFilter setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetResourceCountsRequestFilter setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }
        public String getMatchType() {
            return this.matchType;
        }

        public GetResourceCountsRequestFilter setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

}
