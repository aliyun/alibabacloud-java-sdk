// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ListShareLinkRequest extends TeaModel {
    @NameInMap("creator")
    public String creator;

    @NameInMap("include_cancelled")
    public Boolean includeCancelled;

    @NameInMap("limit")
    public Integer limit;

    @NameInMap("marker")
    public String marker;

    @NameInMap("order_by")
    public String orderBy;

    @NameInMap("order_direction")
    public String orderDirection;

    public static ListShareLinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListShareLinkRequest self = new ListShareLinkRequest();
        return TeaModel.build(map, self);
    }

    public ListShareLinkRequest setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public ListShareLinkRequest setIncludeCancelled(Boolean includeCancelled) {
        this.includeCancelled = includeCancelled;
        return this;
    }
    public Boolean getIncludeCancelled() {
        return this.includeCancelled;
    }

    public ListShareLinkRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public ListShareLinkRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public ListShareLinkRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListShareLinkRequest setOrderDirection(String orderDirection) {
        this.orderDirection = orderDirection;
        return this;
    }
    public String getOrderDirection() {
        return this.orderDirection;
    }

}
