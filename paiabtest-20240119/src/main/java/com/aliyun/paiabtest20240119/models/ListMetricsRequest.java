// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiabtest20240119.models;

import com.aliyun.tea.*;

public class ListMetricsRequest extends TeaModel {
    @NameInMap("All")
    public String all;

    @NameInMap("MetricGroupId")
    public String metricGroupId;

    @NameInMap("MetricId")
    public String metricId;

    @NameInMap("MetricName")
    public String metricName;

    @NameInMap("Order")
    public String order;

    @NameInMap("PageNumber")
    public String pageNumber;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("SortBy")
    public String sortBy;

    public static ListMetricsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMetricsRequest self = new ListMetricsRequest();
        return TeaModel.build(map, self);
    }

    public ListMetricsRequest setAll(String all) {
        this.all = all;
        return this;
    }
    public String getAll() {
        return this.all;
    }

    public ListMetricsRequest setMetricGroupId(String metricGroupId) {
        this.metricGroupId = metricGroupId;
        return this;
    }
    public String getMetricGroupId() {
        return this.metricGroupId;
    }

    public ListMetricsRequest setMetricId(String metricId) {
        this.metricId = metricId;
        return this;
    }
    public String getMetricId() {
        return this.metricId;
    }

    public ListMetricsRequest setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

    public ListMetricsRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListMetricsRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListMetricsRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListMetricsRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

}
