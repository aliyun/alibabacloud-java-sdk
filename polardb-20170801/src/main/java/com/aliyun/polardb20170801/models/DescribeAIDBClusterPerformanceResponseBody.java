// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeAIDBClusterPerformanceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("ApiKey")
    public String apiKey;

    /**
     * <strong>example:</strong>
     * <p>pc-a************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <strong>example:</strong>
     * <p>polardb_ai</p>
     */
    @NameInMap("DBType")
    public String DBType;

    /**
     * <strong>example:</strong>
     * <p>3.0</p>
     */
    @NameInMap("DBVersion")
    public String DBVersion;

    /**
     * <strong>example:</strong>
     * <p>2022-11-16T16:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Interval")
    public String interval;

    @NameInMap("PerformanceKeys")
    public java.util.List<DescribeAIDBClusterPerformanceResponseBodyPerformanceKeys> performanceKeys;

    /**
     * <strong>example:</strong>
     * <p>D0CEC6AC-7760-409A-A0D5-E6CD86******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>2022-11-15T16:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeAIDBClusterPerformanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAIDBClusterPerformanceResponseBody self = new DescribeAIDBClusterPerformanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAIDBClusterPerformanceResponseBody setApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    public String getApiKey() {
        return this.apiKey;
    }

    public DescribeAIDBClusterPerformanceResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeAIDBClusterPerformanceResponseBody setDBType(String DBType) {
        this.DBType = DBType;
        return this;
    }
    public String getDBType() {
        return this.DBType;
    }

    public DescribeAIDBClusterPerformanceResponseBody setDBVersion(String DBVersion) {
        this.DBVersion = DBVersion;
        return this;
    }
    public String getDBVersion() {
        return this.DBVersion;
    }

    public DescribeAIDBClusterPerformanceResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeAIDBClusterPerformanceResponseBody setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public DescribeAIDBClusterPerformanceResponseBody setPerformanceKeys(java.util.List<DescribeAIDBClusterPerformanceResponseBodyPerformanceKeys> performanceKeys) {
        this.performanceKeys = performanceKeys;
        return this;
    }
    public java.util.List<DescribeAIDBClusterPerformanceResponseBodyPerformanceKeys> getPerformanceKeys() {
        return this.performanceKeys;
    }

    public DescribeAIDBClusterPerformanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAIDBClusterPerformanceResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeAIDBClusterPerformanceResponseBodyPerformanceKeysPoints extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1724206183</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        /**
         * <strong>example:</strong>
         * <p>42.38</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeAIDBClusterPerformanceResponseBodyPerformanceKeysPoints build(java.util.Map<String, ?> map) throws Exception {
            DescribeAIDBClusterPerformanceResponseBodyPerformanceKeysPoints self = new DescribeAIDBClusterPerformanceResponseBodyPerformanceKeysPoints();
            return TeaModel.build(map, self);
        }

        public DescribeAIDBClusterPerformanceResponseBodyPerformanceKeysPoints setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public DescribeAIDBClusterPerformanceResponseBodyPerformanceKeysPoints setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeAIDBClusterPerformanceResponseBodyPerformanceKeys extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>pi-*************</p>
         */
        @NameInMap("DBNodeId")
        public String DBNodeId;

        /**
         * <strong>example:</strong>
         * <p>PolarDBAIModelCall</p>
         */
        @NameInMap("Measurement")
        public String measurement;

        /**
         * <strong>example:</strong>
         * <p>model_input_amount</p>
         */
        @NameInMap("MetricName")
        public String metricName;

        @NameInMap("Points")
        public java.util.List<DescribeAIDBClusterPerformanceResponseBodyPerformanceKeysPoints> points;

        public static DescribeAIDBClusterPerformanceResponseBodyPerformanceKeys build(java.util.Map<String, ?> map) throws Exception {
            DescribeAIDBClusterPerformanceResponseBodyPerformanceKeys self = new DescribeAIDBClusterPerformanceResponseBodyPerformanceKeys();
            return TeaModel.build(map, self);
        }

        public DescribeAIDBClusterPerformanceResponseBodyPerformanceKeys setDBNodeId(String DBNodeId) {
            this.DBNodeId = DBNodeId;
            return this;
        }
        public String getDBNodeId() {
            return this.DBNodeId;
        }

        public DescribeAIDBClusterPerformanceResponseBodyPerformanceKeys setMeasurement(String measurement) {
            this.measurement = measurement;
            return this;
        }
        public String getMeasurement() {
            return this.measurement;
        }

        public DescribeAIDBClusterPerformanceResponseBodyPerformanceKeys setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public DescribeAIDBClusterPerformanceResponseBodyPerformanceKeys setPoints(java.util.List<DescribeAIDBClusterPerformanceResponseBodyPerformanceKeysPoints> points) {
            this.points = points;
            return this;
        }
        public java.util.List<DescribeAIDBClusterPerformanceResponseBodyPerformanceKeysPoints> getPoints() {
            return this.points;
        }

    }

}
