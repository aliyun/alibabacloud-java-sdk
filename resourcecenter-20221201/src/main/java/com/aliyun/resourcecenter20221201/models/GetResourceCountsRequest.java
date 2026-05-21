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
     * <ul>
     * <li>ResourceType</li>
     * <li>Region</li>
     * <li>ResourceGroupId</li>
     * <li>TagKey</li>
     * <li>TagValue</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ResourceType</p>
     */
    @NameInMap("GroupByKey")
    public String groupByKey;

    @NameInMap("IncludeDeletedResources")
    public Boolean includeDeletedResources;

    @NameInMap("SearchExpression")
    public String searchExpression;

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

    public GetResourceCountsRequest setIncludeDeletedResources(Boolean includeDeletedResources) {
        this.includeDeletedResources = includeDeletedResources;
        return this;
    }
    public Boolean getIncludeDeletedResources() {
        return this.includeDeletedResources;
    }

    public GetResourceCountsRequest setSearchExpression(String searchExpression) {
        this.searchExpression = searchExpression;
        return this;
    }
    public String getSearchExpression() {
        return this.searchExpression;
    }

    public static class GetResourceCountsRequestFilter extends TeaModel {
        /**
         * <p>The key of the filter condition. For more information, see <code>Supported filter parameters</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>RegionId</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The matching mode.</p>
         * <p>The value Equals indicates an equal match.</p>
         * 
         * <strong>example:</strong>
         * <p>Equals</p>
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
