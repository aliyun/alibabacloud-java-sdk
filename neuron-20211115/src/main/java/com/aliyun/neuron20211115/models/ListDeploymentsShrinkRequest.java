// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListDeploymentsShrinkRequest extends TeaModel {
    @NameInMap("env")
    public String env;

    @NameInMap("excludeStatus")
    public String excludeStatusShrink;

    @NameInMap("orderBy")
    public String orderBy;

    @NameInMap("orderDirection")
    public String orderDirection;

    @NameInMap("pageNumber")
    public Integer pageNumber;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("serviceId")
    public Long serviceId;

    @NameInMap("status")
    public String statusShrink;

    public static ListDeploymentsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDeploymentsShrinkRequest self = new ListDeploymentsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListDeploymentsShrinkRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public ListDeploymentsShrinkRequest setExcludeStatusShrink(String excludeStatusShrink) {
        this.excludeStatusShrink = excludeStatusShrink;
        return this;
    }
    public String getExcludeStatusShrink() {
        return this.excludeStatusShrink;
    }

    public ListDeploymentsShrinkRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListDeploymentsShrinkRequest setOrderDirection(String orderDirection) {
        this.orderDirection = orderDirection;
        return this;
    }
    public String getOrderDirection() {
        return this.orderDirection;
    }

    public ListDeploymentsShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDeploymentsShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDeploymentsShrinkRequest setServiceId(Long serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public Long getServiceId() {
        return this.serviceId;
    }

    public ListDeploymentsShrinkRequest setStatusShrink(String statusShrink) {
        this.statusShrink = statusShrink;
        return this;
    }
    public String getStatusShrink() {
        return this.statusShrink;
    }

}
