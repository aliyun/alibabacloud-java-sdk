// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiabtest20240119.models;

import com.aliyun.tea.*;

public class ListMetricGroupsRequest extends TeaModel {
    @NameInMap("All")
    public Boolean all;

    @NameInMap("MetricGroupId")
    public String metricGroupId;

    @NameInMap("MetricGroupName")
    public String metricGroupName;

    @NameInMap("Order")
    public String order;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("SortBy")
    public String sortBy;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListMetricGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMetricGroupsRequest self = new ListMetricGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ListMetricGroupsRequest setAll(Boolean all) {
        this.all = all;
        return this;
    }
    public Boolean getAll() {
        return this.all;
    }

    public ListMetricGroupsRequest setMetricGroupId(String metricGroupId) {
        this.metricGroupId = metricGroupId;
        return this;
    }
    public String getMetricGroupId() {
        return this.metricGroupId;
    }

    public ListMetricGroupsRequest setMetricGroupName(String metricGroupName) {
        this.metricGroupName = metricGroupName;
        return this;
    }
    public String getMetricGroupName() {
        return this.metricGroupName;
    }

    public ListMetricGroupsRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListMetricGroupsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListMetricGroupsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListMetricGroupsRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListMetricGroupsRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
