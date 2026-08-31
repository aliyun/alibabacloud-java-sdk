// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class Metric extends TeaModel {
    /**
     * <p>The aggregation method of the metric (such as avg or sum). If the metric is already aggregated by the same dimensions (such as avg(rate(cpu_core_usage_seconds_total{}[1m]))), configuration is not required. Metrics based on log aggregation generally do not require configuration either.</p>
     * 
     * <strong>example:</strong>
     * <p>avg</p>
     */
    @NameInMap("aggregator")
    public String aggregator;

    /**
     * <p>The numeric or display formatting method, such as KMB (thousand/million/billion), percent, ms, or dthms (hours:minutes:seconds).</p>
     * 
     * <strong>example:</strong>
     * <p>KMB</p>
     */
    @NameInMap("data_format")
    public String dataFormat;

    /**
     * <p>The business description of the metric.</p>
     * 
     * <strong>example:</strong>
     * <p>The number of requests processed by the service per second</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The display name for UI presentation, which can contain Chinese characters.</p>
     * 
     * <strong>example:</strong>
     * <p>Request Count</p>
     */
    @NameInMap("display_name")
    public String displayName;

    /**
     * <p>The generation method of the metric. In PromQL mode, this is a PromQL expression (such as rate(request_count{}[1m]), which can be combined with aggregator to compute sum(...) by (label1, label2)). In SQL/SPL mode, this is an aggregation expression (such as count(1)) that is incorporated into the generated query statement.</p>
     * 
     * <strong>example:</strong>
     * <p>rate(request_count{}[1m])</p>
     */
    @NameInMap("generator")
    public String generator;

    /**
     * <p>Indicates whether the metric is a golden metric (core metrics such as latency, traffic, error count, and saturation).</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("golden_metric")
    public Boolean goldenMetric;

    /**
     * <p>The collection interval of the metric in microseconds. Multiple values indicate that multiple collection interval precisions are supported.</p>
     */
    @NameInMap("interval_us")
    public java.util.List<Long> intervalUs;

    /**
     * <p>The metric name, which is unique within the MetricSet.</p>
     * 
     * <strong>example:</strong>
     * <p>request_count</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The expected query mode of the metric: range (range query), instant (instant query), or both.</p>
     * 
     * <strong>example:</strong>
     * <p>instant</p>
     */
    @NameInMap("query_mode")
    public String queryMode;

    /**
     * <p>The metric type. Metrics that do not require secondary processing are fixed as gauge.</p>
     * 
     * <strong>example:</strong>
     * <p>gauge</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <p>The metric unit, which is used for display only without automatic conversion. For example, ms is not automatically converted to s.</p>
     * 
     * <strong>example:</strong>
     * <p>ms</p>
     */
    @NameInMap("unit")
    public String unit;

    public static Metric build(java.util.Map<String, ?> map) throws Exception {
        Metric self = new Metric();
        return TeaModel.build(map, self);
    }

    public Metric setAggregator(String aggregator) {
        this.aggregator = aggregator;
        return this;
    }
    public String getAggregator() {
        return this.aggregator;
    }

    public Metric setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
        return this;
    }
    public String getDataFormat() {
        return this.dataFormat;
    }

    public Metric setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public Metric setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public Metric setGenerator(String generator) {
        this.generator = generator;
        return this;
    }
    public String getGenerator() {
        return this.generator;
    }

    public Metric setGoldenMetric(Boolean goldenMetric) {
        this.goldenMetric = goldenMetric;
        return this;
    }
    public Boolean getGoldenMetric() {
        return this.goldenMetric;
    }

    public Metric setIntervalUs(java.util.List<Long> intervalUs) {
        this.intervalUs = intervalUs;
        return this;
    }
    public java.util.List<Long> getIntervalUs() {
        return this.intervalUs;
    }

    public Metric setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Metric setQueryMode(String queryMode) {
        this.queryMode = queryMode;
        return this;
    }
    public String getQueryMode() {
        return this.queryMode;
    }

    public Metric setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public Metric setUnit(String unit) {
        this.unit = unit;
        return this;
    }
    public String getUnit() {
        return this.unit;
    }

}
