// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListRuntimeTokensRequest extends TeaModel {
    @NameInMap("enterprise_id")
    public Long enterpriseId;

    @NameInMap("env")
    public String env;

    @NameInMap("order_by")
    public String orderBy;

    @NameInMap("order_direction")
    public String orderDirection;

    @NameInMap("page_number")
    public String pageNumber;

    @NameInMap("page_size")
    public String pageSize;

    @NameInMap("pbc_id")
    public Long pbcId;

    @NameInMap("service_id")
    public Long serviceId;

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

    public ListRuntimeTokensRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
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

    public ListRuntimeTokensRequest setServiceId(Long serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public Long getServiceId() {
        return this.serviceId;
    }

}
