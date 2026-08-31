// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class MetricSetSpec extends TeaModel {
    /**
     * <p>The label definitions for the metric set. Labels are recommended to be automatically generated using the dynamic method. MetricSet defines only common labels. Defining additional labels under individual Metrics is not recommended.</p>
     */
    @NameInMap("labels")
    public MetricSetSpecLabels labels;

    /**
     * <p>The list of metrics included in the metric set.</p>
     */
    @NameInMap("metrics")
    public java.util.List<Metric> metrics;

    /**
     * <p>Specifies whether the metric requires secondary processing before use. For example, Prometheus counter/summary/histogram metrics require calculations such as rate before they can be used directly.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("needs_processing")
    public Boolean needsProcessing;

    /**
     * <p>The query syntax for the metrics. Valid values: prom (PromQL), spl, and cms (CloudMonitor).</p>
     * 
     * <strong>example:</strong>
     * <p>prom</p>
     */
    @NameInMap("query_type")
    public String queryType;

    public static MetricSetSpec build(java.util.Map<String, ?> map) throws Exception {
        MetricSetSpec self = new MetricSetSpec();
        return TeaModel.build(map, self);
    }

    public MetricSetSpec setLabels(MetricSetSpecLabels labels) {
        this.labels = labels;
        return this;
    }
    public MetricSetSpecLabels getLabels() {
        return this.labels;
    }

    public MetricSetSpec setMetrics(java.util.List<Metric> metrics) {
        this.metrics = metrics;
        return this;
    }
    public java.util.List<Metric> getMetrics() {
        return this.metrics;
    }

    public MetricSetSpec setNeedsProcessing(Boolean needsProcessing) {
        this.needsProcessing = needsProcessing;
        return this;
    }
    public Boolean getNeedsProcessing() {
        return this.needsProcessing;
    }

    public MetricSetSpec setQueryType(String queryType) {
        this.queryType = queryType;
        return this;
    }
    public String getQueryType() {
        return this.queryType;
    }

    public static class MetricSetSpecLabels extends TeaModel {
        /**
         * <p>Specifies whether to automatically extract (dynamically generate) labels based on data. Set this parameter to true in most cases.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("dynamic")
        public Boolean dynamic;

        /**
         * <p>The static label key list. This parameter takes effect when dynamic is set to false.</p>
         */
        @NameInMap("keys")
        public java.util.List<String> keys;

        public static MetricSetSpecLabels build(java.util.Map<String, ?> map) throws Exception {
            MetricSetSpecLabels self = new MetricSetSpecLabels();
            return TeaModel.build(map, self);
        }

        public MetricSetSpecLabels setDynamic(Boolean dynamic) {
            this.dynamic = dynamic;
            return this;
        }
        public Boolean getDynamic() {
            return this.dynamic;
        }

        public MetricSetSpecLabels setKeys(java.util.List<String> keys) {
            this.keys = keys;
            return this;
        }
        public java.util.List<String> getKeys() {
            return this.keys;
        }

    }

}
