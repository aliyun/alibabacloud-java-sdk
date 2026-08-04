// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class ListTrainingJobInstanceMetricsResponseBody extends TeaModel {
    /**
     * <p>List of all monitoring metrics that match the filter condition.</p>
     */
    @NameInMap("InstanceMetrics")
    public java.util.List<ListTrainingJobInstanceMetricsResponseBodyInstanceMetrics> instanceMetrics;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F082BD0D-21E1-5F9B-81A0-AB07485B03CD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListTrainingJobInstanceMetricsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTrainingJobInstanceMetricsResponseBody self = new ListTrainingJobInstanceMetricsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTrainingJobInstanceMetricsResponseBody setInstanceMetrics(java.util.List<ListTrainingJobInstanceMetricsResponseBodyInstanceMetrics> instanceMetrics) {
        this.instanceMetrics = instanceMetrics;
        return this;
    }
    public java.util.List<ListTrainingJobInstanceMetricsResponseBodyInstanceMetrics> getInstanceMetrics() {
        return this.instanceMetrics;
    }

    public ListTrainingJobInstanceMetricsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListTrainingJobInstanceMetricsResponseBodyInstanceMetricsMetrics extends TeaModel {
        /**
         * <p>UTC time in ISO 8601 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-11-08T16:00:00Z</p>
         */
        @NameInMap("Time")
        public String time;

        /**
         * <p>Metric value.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Value")
        public Double value;

        public static ListTrainingJobInstanceMetricsResponseBodyInstanceMetricsMetrics build(java.util.Map<String, ?> map) throws Exception {
            ListTrainingJobInstanceMetricsResponseBodyInstanceMetricsMetrics self = new ListTrainingJobInstanceMetricsResponseBodyInstanceMetricsMetrics();
            return TeaModel.build(map, self);
        }

        public ListTrainingJobInstanceMetricsResponseBodyInstanceMetricsMetrics setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public ListTrainingJobInstanceMetricsResponseBodyInstanceMetricsMetrics setValue(Double value) {
            this.value = value;
            return this;
        }
        public Double getValue() {
            return this.value;
        }

    }

    public static class ListTrainingJobInstanceMetricsResponseBodyInstanceMetrics extends TeaModel {
        /**
         * <p>Instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>trainkxen7qjyg6y-master-0</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>List of instance monitoring metrics.</p>
         */
        @NameInMap("Metrics")
        public java.util.List<ListTrainingJobInstanceMetricsResponseBodyInstanceMetricsMetrics> metrics;

        /**
         * <p>Node name.</p>
         * 
         * <strong>example:</strong>
         * <p>trains930928remn-master-0</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        public static ListTrainingJobInstanceMetricsResponseBodyInstanceMetrics build(java.util.Map<String, ?> map) throws Exception {
            ListTrainingJobInstanceMetricsResponseBodyInstanceMetrics self = new ListTrainingJobInstanceMetricsResponseBodyInstanceMetrics();
            return TeaModel.build(map, self);
        }

        public ListTrainingJobInstanceMetricsResponseBodyInstanceMetrics setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListTrainingJobInstanceMetricsResponseBodyInstanceMetrics setMetrics(java.util.List<ListTrainingJobInstanceMetricsResponseBodyInstanceMetricsMetrics> metrics) {
            this.metrics = metrics;
            return this;
        }
        public java.util.List<ListTrainingJobInstanceMetricsResponseBodyInstanceMetricsMetrics> getMetrics() {
            return this.metrics;
        }

        public ListTrainingJobInstanceMetricsResponseBodyInstanceMetrics setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

    }

}
