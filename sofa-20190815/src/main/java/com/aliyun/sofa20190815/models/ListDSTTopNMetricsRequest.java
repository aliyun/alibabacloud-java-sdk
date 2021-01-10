// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListDSTTopNMetricsRequest extends TeaModel {
    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Metrics")
    public java.util.List<ListDSTTopNMetricsRequestMetrics> metrics;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("Tags")
    public java.util.List<ListDSTTopNMetricsRequestTags> tags;

    @NameInMap("TopN")
    public Long topN;

    @NameInMap("Type")
    public String type;

    public static ListDSTTopNMetricsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDSTTopNMetricsRequest self = new ListDSTTopNMetricsRequest();
        return TeaModel.build(map, self);
    }

    public ListDSTTopNMetricsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListDSTTopNMetricsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListDSTTopNMetricsRequest setMetrics(java.util.List<ListDSTTopNMetricsRequestMetrics> metrics) {
        this.metrics = metrics;
        return this;
    }
    public java.util.List<ListDSTTopNMetricsRequestMetrics> getMetrics() {
        return this.metrics;
    }

    public ListDSTTopNMetricsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public ListDSTTopNMetricsRequest setTags(java.util.List<ListDSTTopNMetricsRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<ListDSTTopNMetricsRequestTags> getTags() {
        return this.tags;
    }

    public ListDSTTopNMetricsRequest setTopN(Long topN) {
        this.topN = topN;
        return this;
    }
    public Long getTopN() {
        return this.topN;
    }

    public ListDSTTopNMetricsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class ListDSTTopNMetricsRequestMetrics extends TeaModel {
        @NameInMap("Value")
        public String value;

        public static ListDSTTopNMetricsRequestMetrics build(java.util.Map<String, ?> map) throws Exception {
            ListDSTTopNMetricsRequestMetrics self = new ListDSTTopNMetricsRequestMetrics();
            return TeaModel.build(map, self);
        }

        public ListDSTTopNMetricsRequestMetrics setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListDSTTopNMetricsRequestTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListDSTTopNMetricsRequestTags build(java.util.Map<String, ?> map) throws Exception {
            ListDSTTopNMetricsRequestTags self = new ListDSTTopNMetricsRequestTags();
            return TeaModel.build(map, self);
        }

        public ListDSTTopNMetricsRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListDSTTopNMetricsRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
