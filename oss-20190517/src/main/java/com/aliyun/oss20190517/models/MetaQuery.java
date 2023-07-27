// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class MetaQuery extends TeaModel {
    @NameInMap("Aggregations")
    public Aggregations aggregations;

    @NameInMap("MaxResults")
    public Long maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("Order")
    public String order;

    @NameInMap("Query")
    public String query;

    @NameInMap("Sort")
    public String sort;

    public static MetaQuery build(java.util.Map<String, ?> map) throws Exception {
        MetaQuery self = new MetaQuery();
        return TeaModel.build(map, self);
    }

    public MetaQuery setAggregations(Aggregations aggregations) {
        this.aggregations = aggregations;
        return this;
    }
    public Aggregations getAggregations() {
        return this.aggregations;
    }

    public MetaQuery setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public MetaQuery setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public MetaQuery setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public MetaQuery setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public MetaQuery setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

    public static class Aggregations extends TeaModel {
        @NameInMap("Aggregation")
        public java.util.List<MetaQueryAggregation> aggregation;

        public static Aggregations build(java.util.Map<String, ?> map) throws Exception {
            Aggregations self = new Aggregations();
            return TeaModel.build(map, self);
        }

        public Aggregations setAggregation(java.util.List<MetaQueryAggregation> aggregation) {
            this.aggregation = aggregation;
            return this;
        }
        public java.util.List<MetaQueryAggregation> getAggregation() {
            return this.aggregation;
        }

    }

}
