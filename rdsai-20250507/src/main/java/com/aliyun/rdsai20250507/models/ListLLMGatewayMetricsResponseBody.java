// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ListLLMGatewayMetricsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>minute</p>
     */
    @NameInMap("Granularity")
    public String granularity;

    @NameInMap("MetricItems")
    public java.util.List<ListLLMGatewayMetricsResponseBodyMetricItems> metricItems;

    /**
     * <strong>example:</strong>
     * <p>tokenPerMinute</p>
     */
    @NameInMap("MetricType")
    public String metricType;

    /**
     * <strong>example:</strong>
     * <p>ABCDEF77-41B5-5F9E-81E8-93DFDD379024</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListLLMGatewayMetricsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLLMGatewayMetricsResponseBody self = new ListLLMGatewayMetricsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLLMGatewayMetricsResponseBody setGranularity(String granularity) {
        this.granularity = granularity;
        return this;
    }
    public String getGranularity() {
        return this.granularity;
    }

    public ListLLMGatewayMetricsResponseBody setMetricItems(java.util.List<ListLLMGatewayMetricsResponseBodyMetricItems> metricItems) {
        this.metricItems = metricItems;
        return this;
    }
    public java.util.List<ListLLMGatewayMetricsResponseBodyMetricItems> getMetricItems() {
        return this.metricItems;
    }

    public ListLLMGatewayMetricsResponseBody setMetricType(String metricType) {
        this.metricType = metricType;
        return this;
    }
    public String getMetricType() {
        return this.metricType;
    }

    public ListLLMGatewayMetricsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListLLMGatewayMetricsResponseBodyMetricItemsDataPoints extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1779799200000</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        /**
         * <strong>example:</strong>
         * <p>16022</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListLLMGatewayMetricsResponseBodyMetricItemsDataPoints build(java.util.Map<String, ?> map) throws Exception {
            ListLLMGatewayMetricsResponseBodyMetricItemsDataPoints self = new ListLLMGatewayMetricsResponseBodyMetricItemsDataPoints();
            return TeaModel.build(map, self);
        }

        public ListLLMGatewayMetricsResponseBodyMetricItemsDataPoints setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public ListLLMGatewayMetricsResponseBodyMetricItemsDataPoints setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListLLMGatewayMetricsResponseBodyMetricItems extends TeaModel {
        @NameInMap("DataPoints")
        public java.util.List<ListLLMGatewayMetricsResponseBodyMetricItemsDataPoints> dataPoints;

        /**
         * <strong>example:</strong>
         * <p>inputTokens</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>qwen-plus</p>
         */
        @NameInMap("Model")
        public String model;

        /**
         * <strong>example:</strong>
         * <p>tokens</p>
         */
        @NameInMap("Unit")
        public String unit;

        public static ListLLMGatewayMetricsResponseBodyMetricItems build(java.util.Map<String, ?> map) throws Exception {
            ListLLMGatewayMetricsResponseBodyMetricItems self = new ListLLMGatewayMetricsResponseBodyMetricItems();
            return TeaModel.build(map, self);
        }

        public ListLLMGatewayMetricsResponseBodyMetricItems setDataPoints(java.util.List<ListLLMGatewayMetricsResponseBodyMetricItemsDataPoints> dataPoints) {
            this.dataPoints = dataPoints;
            return this;
        }
        public java.util.List<ListLLMGatewayMetricsResponseBodyMetricItemsDataPoints> getDataPoints() {
            return this.dataPoints;
        }

        public ListLLMGatewayMetricsResponseBodyMetricItems setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListLLMGatewayMetricsResponseBodyMetricItems setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public ListLLMGatewayMetricsResponseBodyMetricItems setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

    }

}
