// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListDeploymentsShrinkRequest extends TeaModel {
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

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("serviceGroupId")
    public Long serviceGroupId;

    @NameInMap("status")
    public String statusShrink;

    public static ListDeploymentsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDeploymentsShrinkRequest self = new ListDeploymentsShrinkRequest();
        return TeaModel.build(map, self);
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

    public ListDeploymentsShrinkRequest setServiceGroupId(Long serviceGroupId) {
        this.serviceGroupId = serviceGroupId;
        return this;
    }
    public Long getServiceGroupId() {
        return this.serviceGroupId;
    }

    public ListDeploymentsShrinkRequest setStatusShrink(String statusShrink) {
        this.statusShrink = statusShrink;
        return this;
    }
    public String getStatusShrink() {
        return this.statusShrink;
    }

}
