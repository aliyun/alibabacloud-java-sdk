// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListPdpPbcsRequest extends TeaModel {
    @NameInMap("developer_id")
    public String developerId;

    @NameInMap("keyword")
    public String keyword;

    @NameInMap("order_by")
    public String orderBy;

    @NameInMap("order_direction")
    public String orderDirection;

    @NameInMap("page_number")
    public Integer pageNumber;

    @NameInMap("page_size")
    public Integer pageSize;

    @NameInMap("pbcIds")
    public java.util.List<Long> pbcIds;

    public static ListPdpPbcsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPdpPbcsRequest self = new ListPdpPbcsRequest();
        return TeaModel.build(map, self);
    }

    public ListPdpPbcsRequest setDeveloperId(String developerId) {
        this.developerId = developerId;
        return this;
    }
    public String getDeveloperId() {
        return this.developerId;
    }

    public ListPdpPbcsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListPdpPbcsRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListPdpPbcsRequest setOrderDirection(String orderDirection) {
        this.orderDirection = orderDirection;
        return this;
    }
    public String getOrderDirection() {
        return this.orderDirection;
    }

    public ListPdpPbcsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListPdpPbcsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPdpPbcsRequest setPbcIds(java.util.List<Long> pbcIds) {
        this.pbcIds = pbcIds;
        return this;
    }
    public java.util.List<Long> getPbcIds() {
        return this.pbcIds;
    }

}
