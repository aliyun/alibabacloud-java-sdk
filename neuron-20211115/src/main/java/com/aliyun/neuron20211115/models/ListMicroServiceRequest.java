// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListMicroServiceRequest extends TeaModel {
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

    @NameInMap("serviceIds")
    public String serviceIds;

    public static ListMicroServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMicroServiceRequest self = new ListMicroServiceRequest();
        return TeaModel.build(map, self);
    }

    public ListMicroServiceRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListMicroServiceRequest setOrderDirection(String orderDirection) {
        this.orderDirection = orderDirection;
        return this;
    }
    public String getOrderDirection() {
        return this.orderDirection;
    }

    public ListMicroServiceRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListMicroServiceRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListMicroServiceRequest setPbcId(Long pbcId) {
        this.pbcId = pbcId;
        return this;
    }
    public Long getPbcId() {
        return this.pbcId;
    }

    public ListMicroServiceRequest setServiceIds(String serviceIds) {
        this.serviceIds = serviceIds;
        return this;
    }
    public String getServiceIds() {
        return this.serviceIds;
    }

}
