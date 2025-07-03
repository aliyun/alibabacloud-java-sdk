// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeMetricsDataRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-06-13T15:40:43Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>app,clusterId</p>
     */
    @NameInMap("GroupByLabels")
    public String groupByLabels;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ob317v4uif****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>app:OB,clusterId:ob***</p>
     */
    @NameInMap("Labels")
    public String labels;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("Limit")
    public String limit;

    @NameInMap("MetricScope")
    public String metricScope;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tps</p>
     */
    @NameInMap("Metrics")
    public String metrics;

    @NameInMap("ReplicaType")
    public String replicaType;

    /**
     * <strong>example:</strong>
     * <p>tps</p>
     */
    @NameInMap("SortMetricKey")
    public String sortMetricKey;

    /**
     * <strong>example:</strong>
     * <p>DESC</p>
     */
    @NameInMap("SortOrder")
    public String sortOrder;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-06-13T15:40:43Z</p>
     */
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

    public DescribeMetricsDataRequest setMetricScope(String metricScope) {
        this.metricScope = metricScope;
        return this;
    }
    public String getMetricScope() {
        return this.metricScope;
    }

    public DescribeMetricsDataRequest setMetrics(String metrics) {
        this.metrics = metrics;
        return this;
    }
    public String getMetrics() {
        return this.metrics;
    }

    public DescribeMetricsDataRequest setReplicaType(String replicaType) {
        this.replicaType = replicaType;
        return this;
    }
    public String getReplicaType() {
        return this.replicaType;
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
