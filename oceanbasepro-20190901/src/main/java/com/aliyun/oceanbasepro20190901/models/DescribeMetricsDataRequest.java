// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeMetricsDataRequest extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("GroupByLabels")
    public String groupByLabels;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Labels")
    public String labels;

    @NameInMap("Limit")
    public String limit;

    @NameInMap("Metrics")
    public String metrics;

    @NameInMap("SortMetricKey")
    public String sortMetricKey;

    @NameInMap("SortOrder")
    public String sortOrder;

    @NameInMap("StartTime")
    public String startTime;

    public static DescribeMetricsDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetricsDataRequest self = new DescribeMetricsDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMetricsDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeMetricsDataRequest setGroupByLabels(String groupByLabels) {
        this.groupByLabels = groupByLabels;
        return this;
    }
    public String getGroupByLabels() {
        return this.groupByLabels;
    }

    public DescribeMetricsDataRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeMetricsDataRequest setLabels(String labels) {
        this.labels = labels;
        return this;
    }
    public String getLabels() {
        return this.labels;
    }

    public DescribeMetricsDataRequest setLimit(String limit) {
        this.limit = limit;
        return this;
    }
    public String getLimit() {
        return this.limit;
    }

    public DescribeMetricsDataRequest setMetrics(String metrics) {
        this.metrics = metrics;
        return this;
    }
    public String getMetrics() {
        return this.metrics;
    }

    public DescribeMetricsDataRequest setSortMetricKey(String sortMetricKey) {
        this.sortMetricKey = sortMetricKey;
        return this;
    }
    public String getSortMetricKey() {
        return this.sortMetricKey;
    }

    public DescribeMetricsDataRequest setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public String getSortOrder() {
        return this.sortOrder;
    }

    public DescribeMetricsDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
