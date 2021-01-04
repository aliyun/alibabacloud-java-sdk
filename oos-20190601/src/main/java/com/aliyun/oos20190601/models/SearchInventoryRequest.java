// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class SearchInventoryRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("Filter")
    public java.util.List<SearchInventoryRequestFilter> filter;

    @NameInMap("Aggregator")
    public java.util.List<String> aggregator;

    public static SearchInventoryRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchInventoryRequest self = new SearchInventoryRequest();
        return TeaModel.build(map, self);
    }

    public SearchInventoryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SearchInventoryRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public SearchInventoryRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public SearchInventoryRequest setFilter(java.util.List<SearchInventoryRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<SearchInventoryRequestFilter> getFilter() {
        return this.filter;
    }

    public SearchInventoryRequest setAggregator(java.util.List<String> aggregator) {
        this.aggregator = aggregator;
        return this;
    }
    public java.util.List<String> getAggregator() {
        return this.aggregator;
    }

    public static class SearchInventoryRequestFilter extends TeaModel {
        @NameInMap("Value")
        public java.util.List<String> value;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("Name")
        public String name;

        public static SearchInventoryRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            SearchInventoryRequestFilter self = new SearchInventoryRequestFilter();
            return TeaModel.build(map, self);
        }

        public SearchInventoryRequestFilter setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

        public SearchInventoryRequestFilter setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public SearchInventoryRequestFilter setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
