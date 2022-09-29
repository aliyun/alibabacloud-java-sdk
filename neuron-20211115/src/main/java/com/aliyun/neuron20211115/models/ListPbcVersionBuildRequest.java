// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListPbcVersionBuildRequest extends TeaModel {
    @NameInMap("order_by")
    public String orderBy;

    @NameInMap("order_direction")
    public String orderDirection;

    @NameInMap("page_number")
    public Integer pageNumber;

    @NameInMap("page_size")
    public Integer pageSize;

    public static ListPbcVersionBuildRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPbcVersionBuildRequest self = new ListPbcVersionBuildRequest();
        return TeaModel.build(map, self);
    }

    public ListPbcVersionBuildRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListPbcVersionBuildRequest setOrderDirection(String orderDirection) {
        this.orderDirection = orderDirection;
        return this;
    }
    public String getOrderDirection() {
        return this.orderDirection;
    }

    public ListPbcVersionBuildRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListPbcVersionBuildRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
