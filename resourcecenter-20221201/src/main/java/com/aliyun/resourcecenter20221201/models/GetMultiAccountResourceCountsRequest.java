// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class GetMultiAccountResourceCountsRequest extends TeaModel {
    @NameInMap("Filter")
    public java.util.List<GetMultiAccountResourceCountsRequestFilter> filter;

    /**
     * <strong>example:</strong>
     * <p>ResourceType</p>
     */
    @NameInMap("GroupByKey")
    public String groupByKey;

    /**
     * <strong>example:</strong>
     * <p>rd-r4****</p>
     */
    @NameInMap("Scope")
    public String scope;

    public static GetMultiAccountResourceCountsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMultiAccountResourceCountsRequest self = new GetMultiAccountResourceCountsRequest();
        return TeaModel.build(map, self);
    }

    public GetMultiAccountResourceCountsRequest setFilter(java.util.List<GetMultiAccountResourceCountsRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<GetMultiAccountResourceCountsRequestFilter> getFilter() {
        return this.filter;
    }

    public GetMultiAccountResourceCountsRequest setGroupByKey(String groupByKey) {
        this.groupByKey = groupByKey;
        return this;
    }
    public String getGroupByKey() {
        return this.groupByKey;
    }

    public GetMultiAccountResourceCountsRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public static class GetMultiAccountResourceCountsRequestFilter extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>RegionId</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>Equals</p>
         */
        @NameInMap("MatchType")
        public String matchType;

        @NameInMap("Value")
        public java.util.List<String> value;

        public static GetMultiAccountResourceCountsRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            GetMultiAccountResourceCountsRequestFilter self = new GetMultiAccountResourceCountsRequestFilter();
            return TeaModel.build(map, self);
        }

        public GetMultiAccountResourceCountsRequestFilter setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetMultiAccountResourceCountsRequestFilter setMatchType(String matchType) {
            this.matchType = matchType;
            return this;
        }
        public String getMatchType() {
            return this.matchType;
        }

        public GetMultiAccountResourceCountsRequestFilter setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

}
