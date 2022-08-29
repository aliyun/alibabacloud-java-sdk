// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class SearchShareLinkRequest extends TeaModel {
    @NameInMap("creators")
    public java.util.List<String> creators;

    @NameInMap("limit")
    public Integer limit;

    @NameInMap("marker")
    public String marker;

    @NameInMap("order_by")
    public String orderBy;

    @NameInMap("order_direction")
    public String orderDirection;

    @NameInMap("query")
    public String query;

    @NameInMap("return_total_count")
    public Boolean returnTotalCount;

    public static SearchShareLinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchShareLinkRequest self = new SearchShareLinkRequest();
        return TeaModel.build(map, self);
    }

    public SearchShareLinkRequest setCreators(java.util.List<String> creators) {
        this.creators = creators;
        return this;
    }
    public java.util.List<String> getCreators() {
        return this.creators;
    }

    public SearchShareLinkRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public SearchShareLinkRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public SearchShareLinkRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public SearchShareLinkRequest setOrderDirection(String orderDirection) {
        this.orderDirection = orderDirection;
        return this;
    }
    public String getOrderDirection() {
        return this.orderDirection;
    }

    public SearchShareLinkRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public SearchShareLinkRequest setReturnTotalCount(Boolean returnTotalCount) {
        this.returnTotalCount = returnTotalCount;
        return this;
    }
    public Boolean getReturnTotalCount() {
        return this.returnTotalCount;
    }

}
