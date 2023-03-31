// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class ListTrainingJobMetricsResponseBody extends TeaModel {
    @NameInMap("Metrics")
    public java.util.List<ListTrainingJobMetricsResponseBodyMetrics> metrics;

    @NameInMap("RequestId")
    public String requestId;

    public static ListTrainingJobMetricsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTrainingJobMetricsResponseBody self = new ListTrainingJobMetricsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTrainingJobMetricsResponseBody setMetrics(java.util.List<ListTrainingJobMetricsResponseBodyMetrics> metrics) {
        this.metrics = metrics;
        return this;
    }
    public java.util.List<ListTrainingJobMetricsResponseBodyMetrics> getMetrics() {
        return this.metrics;
    }

    public ListTrainingJobMetricsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListTrainingJobMetricsResponseBodyMetrics extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Timestamp")
        public String timestamp;

        @NameInMap("Value")
        public Double value;

        public static ListTrainingJobMetricsResponseBodyMetrics build(java.util.Map<String, ?> map) throws Exception {
            ListTrainingJobMetricsResponseBodyMetrics self = new ListTrainingJobMetricsResponseBodyMetrics();
            return TeaModel.build(map, self);
        }

        public ListTrainingJobMetricsResponseBodyMetrics setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListTrainingJobMetricsResponseBodyMetrics setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

        public ListTrainingJobMetricsResponseBodyMetrics setValue(Double value) {
            this.value = value;
            return this;
        }
        public Double getValue() {
            return this.value;
        }

    }

}
