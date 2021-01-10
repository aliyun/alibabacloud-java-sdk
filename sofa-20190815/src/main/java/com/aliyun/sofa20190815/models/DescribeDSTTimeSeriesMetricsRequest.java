// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DescribeDSTTimeSeriesMetricsRequest extends TeaModel {
    @NameInMap("Aggregator")
    public String aggregator;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("Type")
    public String type;

    @NameInMap("Metrics")
    public java.util.List<DescribeDSTTimeSeriesMetricsRequestMetrics> metrics;

    @NameInMap("Tags")
    public java.util.List<DescribeDSTTimeSeriesMetricsRequestTags> tags;

    public static DescribeDSTTimeSeriesMetricsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDSTTimeSeriesMetricsRequest self = new DescribeDSTTimeSeriesMetricsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDSTTimeSeriesMetricsRequest setAggregator(String aggregator) {
        this.aggregator = aggregator;
        return this;
    }
    public String getAggregator() {
        return this.aggregator;
    }

    public DescribeDSTTimeSeriesMetricsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeDSTTimeSeriesMetricsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeDSTTimeSeriesMetricsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeDSTTimeSeriesMetricsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribeDSTTimeSeriesMetricsRequest setMetrics(java.util.List<DescribeDSTTimeSeriesMetricsRequestMetrics> metrics) {
        this.metrics = metrics;
        return this;
    }
    public java.util.List<DescribeDSTTimeSeriesMetricsRequestMetrics> getMetrics() {
        return this.metrics;
    }

    public DescribeDSTTimeSeriesMetricsRequest setTags(java.util.List<DescribeDSTTimeSeriesMetricsRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<DescribeDSTTimeSeriesMetricsRequestTags> getTags() {
        return this.tags;
    }

    public static class DescribeDSTTimeSeriesMetricsRequestMetrics extends TeaModel {
        @NameInMap("Value")
        public String value;

        public static DescribeDSTTimeSeriesMetricsRequestMetrics build(java.util.Map<String, ?> map) throws Exception {
            DescribeDSTTimeSeriesMetricsRequestMetrics self = new DescribeDSTTimeSeriesMetricsRequestMetrics();
            return TeaModel.build(map, self);
        }

        public DescribeDSTTimeSeriesMetricsRequestMetrics setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDSTTimeSeriesMetricsRequestTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeDSTTimeSeriesMetricsRequestTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeDSTTimeSeriesMetricsRequestTags self = new DescribeDSTTimeSeriesMetricsRequestTags();
            return TeaModel.build(map, self);
        }

        public DescribeDSTTimeSeriesMetricsRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDSTTimeSeriesMetricsRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
