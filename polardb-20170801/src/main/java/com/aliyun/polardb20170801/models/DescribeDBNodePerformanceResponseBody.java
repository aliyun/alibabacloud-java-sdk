// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBNodePerformanceResponseBody extends TeaModel {
    /**
     * <p>The ID of the cluster node.</p>
     */
    @NameInMap("DBNodeId")
    public String DBNodeId;

    /**
     * <p>The type of the database engine.</p>
     */
    @NameInMap("DBType")
    public String DBType;

    /**
     * <p>The version of the database engine.</p>
     */
    @NameInMap("DBVersion")
    public String DBVersion;

    /**
     * <p>The end time of the query. The time follows the ISO 8601 standard in the `yyyy-MM-ddTHH:mm:ssZ` format. The time is displayed in UTC.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The cluster performance metrics.</p>
     */
    @NameInMap("PerformanceKeys")
    public DescribeDBNodePerformanceResponseBodyPerformanceKeys performanceKeys;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The start time of the query. The time follows the ISO 8601 standard in the `yyyy-MM-ddTHH:mm:ssZ` format. The time is displayed in UTC.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDBNodePerformanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBNodePerformanceResponseBody self = new DescribeDBNodePerformanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBNodePerformanceResponseBody setDBNodeId(String DBNodeId) {
        this.DBNodeId = DBNodeId;
        return this;
    }
    public String getDBNodeId() {
        return this.DBNodeId;
    }

    public DescribeDBNodePerformanceResponseBody setDBType(String DBType) {
        this.DBType = DBType;
        return this;
    }
    public String getDBType() {
        return this.DBType;
    }

    public DescribeDBNodePerformanceResponseBody setDBVersion(String DBVersion) {
        this.DBVersion = DBVersion;
        return this;
    }
    public String getDBVersion() {
        return this.DBVersion;
    }

    public DescribeDBNodePerformanceResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDBNodePerformanceResponseBody setPerformanceKeys(DescribeDBNodePerformanceResponseBodyPerformanceKeys performanceKeys) {
        this.performanceKeys = performanceKeys;
        return this;
    }
    public DescribeDBNodePerformanceResponseBodyPerformanceKeys getPerformanceKeys() {
        return this.performanceKeys;
    }

    public DescribeDBNodePerformanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBNodePerformanceResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeDBNodePerformanceResponseBodyPerformanceKeysPerformanceItemPointsPerformanceItemValue extends TeaModel {
        /**
         * <p>The timestamp of the metric. This value is a UNIX timestamp. Unit: millisecond.</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        /**
         * <p>The value of the metric.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeDBNodePerformanceResponseBodyPerformanceKeysPerformanceItemPointsPerformanceItemValue build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBNodePerformanceResponseBodyPerformanceKeysPerformanceItemPointsPerformanceItemValue self = new DescribeDBNodePerformanceResponseBodyPerformanceKeysPerformanceItemPointsPerformanceItemValue();
            return TeaModel.build(map, self);
        }

        public DescribeDBNodePerformanceResponseBodyPerformanceKeysPerformanceItemPointsPerformanceItemValue setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public DescribeDBNodePerformanceResponseBodyPerformanceKeysPerformanceItemPointsPerformanceItemValue setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDBNodePerformanceResponseBodyPerformanceKeysPerformanceItemPoints extends TeaModel {
        @NameInMap("PerformanceItemValue")
        public java.util.List<DescribeDBNodePerformanceResponseBodyPerformanceKeysPerformanceItemPointsPerformanceItemValue> performanceItemValue;

        public static DescribeDBNodePerformanceResponseBodyPerformanceKeysPerformanceItemPoints build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBNodePerformanceResponseBodyPerformanceKeysPerformanceItemPoints self = new DescribeDBNodePerformanceResponseBodyPerformanceKeysPerformanceItemPoints();
            return TeaModel.build(map, self);
        }

        public DescribeDBNodePerformanceResponseBodyPerformanceKeysPerformanceItemPoints setPerformanceItemValue(java.util.List<DescribeDBNodePerformanceResponseBodyPerformanceKeysPerformanceItemPointsPerformanceItemValue> performanceItemValue) {
            this.performanceItemValue = performanceItemValue;
            return this;
        }
        public java.util.List<DescribeDBNodePerformanceResponseBodyPerformanceKeysPerformanceItemPointsPerformanceItemValue> getPerformanceItemValue() {
            return this.performanceItemValue;
        }

    }

    public static class DescribeDBNodePerformanceResponseBodyPerformanceKeysPerformanceItem extends TeaModel {
        /**
         * <p>The performance metrics that you want to query.</p>
         */
        @NameInMap("Measurement")
        public String measurement;

        /**
         * <p>The name of the performance metric.</p>
         */
        @NameInMap("MetricName")
        public String metricName;

        /**
         * <p>The performance metrics.</p>
         */
        @NameInMap("Points")
        public DescribeDBNodePerformanceResponseBodyPerformanceKeysPerformanceItemPoints points;

        public static DescribeDBNodePerformanceResponseBodyPerformanceKeysPerformanceItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBNodePerformanceResponseBodyPerformanceKeysPerformanceItem self = new DescribeDBNodePerformanceResponseBodyPerformanceKeysPerformanceItem();
            return TeaModel.build(map, self);
        }

        public DescribeDBNodePerformanceResponseBodyPerformanceKeysPerformanceItem setMeasurement(String measurement) {
            this.measurement = measurement;
            return this;
        }
        public String getMeasurement() {
            return this.measurement;
        }

        public DescribeDBNodePerformanceResponseBodyPerformanceKeysPerformanceItem setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public DescribeDBNodePerformanceResponseBodyPerformanceKeysPerformanceItem setPoints(DescribeDBNodePerformanceResponseBodyPerformanceKeysPerformanceItemPoints points) {
            this.points = points;
            return this;
        }
        public DescribeDBNodePerformanceResponseBodyPerformanceKeysPerformanceItemPoints getPoints() {
            return this.points;
        }

    }

    public static class DescribeDBNodePerformanceResponseBodyPerformanceKeys extends TeaModel {
        @NameInMap("PerformanceItem")
        public java.util.List<DescribeDBNodePerformanceResponseBodyPerformanceKeysPerformanceItem> performanceItem;

        public static DescribeDBNodePerformanceResponseBodyPerformanceKeys build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBNodePerformanceResponseBodyPerformanceKeys self = new DescribeDBNodePerformanceResponseBodyPerformanceKeys();
            return TeaModel.build(map, self);
        }

        public DescribeDBNodePerformanceResponseBodyPerformanceKeys setPerformanceItem(java.util.List<DescribeDBNodePerformanceResponseBodyPerformanceKeysPerformanceItem> performanceItem) {
            this.performanceItem = performanceItem;
            return this;
        }
        public java.util.List<DescribeDBNodePerformanceResponseBodyPerformanceKeysPerformanceItem> getPerformanceItem() {
            return this.performanceItem;
        }

    }

}
