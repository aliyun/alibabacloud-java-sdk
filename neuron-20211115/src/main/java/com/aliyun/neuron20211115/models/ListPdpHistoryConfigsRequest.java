// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListPdpHistoryConfigsRequest extends TeaModel {
    @NameInMap("configId")
    public Long configId;

    @NameInMap("orderBy")
    public String orderBy;

    @NameInMap("orderDirection")
    public String orderDirection;

    @NameInMap("pageNumber")
    public Integer pageNumber;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("serviceGroupId")
    public Long serviceGroupId;

    @NameInMap("type")
    public String type;

    public static ListPdpHistoryConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPdpHistoryConfigsRequest self = new ListPdpHistoryConfigsRequest();
        return TeaModel.build(map, self);
    }

    public ListPdpHistoryConfigsRequest setConfigId(Long configId) {
        this.configId = configId;
        return this;
    }
    public Long getConfigId() {
        return this.configId;
    }

    public ListPdpHistoryConfigsRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListPdpHistoryConfigsRequest setOrderDirection(String orderDirection) {
        this.orderDirection = orderDirection;
        return this;
    }
    public String getOrderDirection() {
        return this.orderDirection;
    }

    public ListPdpHistoryConfigsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListPdpHistoryConfigsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPdpHistoryConfigsRequest setServiceGroupId(Long serviceGroupId) {
        this.serviceGroupId = serviceGroupId;
        return this;
    }
    public Long getServiceGroupId() {
        return this.serviceGroupId;
    }

    public ListPdpHistoryConfigsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
