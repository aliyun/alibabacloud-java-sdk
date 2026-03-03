// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListRuntimeTokensRequest extends TeaModel {
    @NameInMap("enterpriseId")
    public Long enterpriseId;

    @NameInMap("orderBy")
    public String orderBy;

    @NameInMap("orderDirection")
    public String orderDirection;

    @NameInMap("pageNumber")
    public String pageNumber;

    @NameInMap("pageSize")
    public String pageSize;

    @NameInMap("pbcId")
    public Long pbcId;

    @NameInMap("serviceGroupId")
    public Long serviceGroupId;

    public static ListRuntimeTokensRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRuntimeTokensRequest self = new ListRuntimeTokensRequest();
        return TeaModel.build(map, self);
    }

    public ListRuntimeTokensRequest setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    public ListRuntimeTokensRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListRuntimeTokensRequest setOrderDirection(String orderDirection) {
        this.orderDirection = orderDirection;
        return this;
    }
    public String getOrderDirection() {
        return this.orderDirection;
    }

    public ListRuntimeTokensRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListRuntimeTokensRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListRuntimeTokensRequest setPbcId(Long pbcId) {
        this.pbcId = pbcId;
        return this;
    }
    public Long getPbcId() {
        return this.pbcId;
    }

    public ListRuntimeTokensRequest setServiceGroupId(Long serviceGroupId) {
        this.serviceGroupId = serviceGroupId;
        return this;
    }
    public Long getServiceGroupId() {
        return this.serviceGroupId;
    }

}
