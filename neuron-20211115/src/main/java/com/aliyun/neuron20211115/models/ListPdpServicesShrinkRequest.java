// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListPdpServicesShrinkRequest extends TeaModel {
    @NameInMap("alias")
    public String alias;

    @NameInMap("name")
    public String name;

    @NameInMap("orderBy")
    public String orderBy;

    @NameInMap("orderDirection")
    public String orderDirection;

    @NameInMap("pageNumber")
    public Integer pageNumber;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("pbcId")
    public Long pbcId;

    @NameInMap("pdpServiceIds")
    public String pdpServiceIdsShrink;

    public static ListPdpServicesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPdpServicesShrinkRequest self = new ListPdpServicesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListPdpServicesShrinkRequest setAlias(String alias) {
        this.alias = alias;
        return this;
    }
    public String getAlias() {
        return this.alias;
    }

    public ListPdpServicesShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListPdpServicesShrinkRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListPdpServicesShrinkRequest setOrderDirection(String orderDirection) {
        this.orderDirection = orderDirection;
        return this;
    }
    public String getOrderDirection() {
        return this.orderDirection;
    }

    public ListPdpServicesShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListPdpServicesShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPdpServicesShrinkRequest setPbcId(Long pbcId) {
        this.pbcId = pbcId;
        return this;
    }
    public Long getPbcId() {
        return this.pbcId;
    }

    public ListPdpServicesShrinkRequest setPdpServiceIdsShrink(String pdpServiceIdsShrink) {
        this.pdpServiceIdsShrink = pdpServiceIdsShrink;
        return this;
    }
    public String getPdpServiceIdsShrink() {
        return this.pdpServiceIdsShrink;
    }

}
