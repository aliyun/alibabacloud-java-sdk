// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListPdpServicesRequest extends TeaModel {
    @NameInMap("alias")
    public String alias;

    @NameInMap("name")
    public String name;

    @NameInMap("order_by")
    public String orderBy;

    @NameInMap("order_direction")
    public String orderDirection;

    @NameInMap("page_number")
    public Integer pageNumber;

    @NameInMap("page_size")
    public Integer pageSize;

    @NameInMap("pbc_id")
    public Long pbcId;

    @NameInMap("pdp_service_ids")
    public java.util.List<Long> pdpServiceIds;

    public static ListPdpServicesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPdpServicesRequest self = new ListPdpServicesRequest();
        return TeaModel.build(map, self);
    }

    public ListPdpServicesRequest setAlias(String alias) {
        this.alias = alias;
        return this;
    }
    public String getAlias() {
        return this.alias;
    }

    public ListPdpServicesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListPdpServicesRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListPdpServicesRequest setOrderDirection(String orderDirection) {
        this.orderDirection = orderDirection;
        return this;
    }
    public String getOrderDirection() {
        return this.orderDirection;
    }

    public ListPdpServicesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListPdpServicesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPdpServicesRequest setPbcId(Long pbcId) {
        this.pbcId = pbcId;
        return this;
    }
    public Long getPbcId() {
        return this.pbcId;
    }

    public ListPdpServicesRequest setPdpServiceIds(java.util.List<Long> pdpServiceIds) {
        this.pdpServiceIds = pdpServiceIds;
        return this;
    }
    public java.util.List<Long> getPdpServiceIds() {
        return this.pdpServiceIds;
    }

}
