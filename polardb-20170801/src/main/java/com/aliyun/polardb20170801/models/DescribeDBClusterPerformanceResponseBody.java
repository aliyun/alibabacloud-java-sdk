// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClusterPerformanceResponseBody extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

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
    public DescribeDBClusterPerformanceResponseBodyPerformanceKeys performanceKeys;

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

    public static DescribeDBClusterPerformanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterPerformanceResponseBody self = new DescribeDBClusterPerformanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterPerformanceResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeDBClusterPerformanceResponseBody setDBType(String DBType) {
        this.DBType = DBType;
        return this;
    }
    public String getDBType() {
        return this.DBType;
    }

    public DescribeDBClusterPerformanceResponseBody setDBVersion(String DBVersion) {
        this.DBVersion = DBVersion;
        return this;
    }
    public String getDBVersion() {
        return this.DBVersion;
    }

    public DescribeDBClusterPerformanceResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDBClusterPerformanceResponseBody setPerformanceKeys(DescribeDBClusterPerformanceResponseBodyPerformanceKeys performanceKeys) {
        this.performanceKeys = performanceKeys;
        return this;
    }
    public DescribeDBClusterPerformanceResponseBodyPerformanceKeys getPerformanceKeys() {
        return this.performanceKeys;
    }

    public DescribeDBClusterPerformanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBClusterPerformanceResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeDBClusterPerformanceResponseBodyPerformanceKeysPerformanceItemPointsPerformanceItemValue extends TeaModel {
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

        public static DescribeDBClusterPerformanceResponseBodyPerformanceKeysPerformanceItemPointsPerformanceItemValue build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterPerformanceResponseBodyPerformanceKeysPerformanceItemPointsPerformanceItemValue self = new DescribeDBClusterPerformanceResponseBodyPerformanceKeysPerformanceItemPointsPerformanceItemValue();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterPerformanceResponseBodyPerformanceKeysPerformanceItemPointsPerformanceItemValue setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public DescribeDBClusterPerformanceResponseBodyPerformanceKeysPerformanceItemPointsPerformanceItemValue setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDBClusterPerformanceResponseBodyPerformanceKeysPerformanceItemPoints extends TeaModel {
        @NameInMap("PerformanceItemValue")
        public java.util.List<DescribeDBClusterPerformanceResponseBodyPerformanceKeysPerformanceItemPointsPerformanceItemValue> performanceItemValue;

        public static DescribeDBClusterPerformanceResponseBodyPerformanceKeysPerformanceItemPoints build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterPerformanceResponseBodyPerformanceKeysPerformanceItemPoints self = new DescribeDBClusterPerformanceResponseBodyPerformanceKeysPerformanceItemPoints();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterPerformanceResponseBodyPerformanceKeysPerformanceItemPoints setPerformanceItemValue(java.util.List<DescribeDBClusterPerformanceResponseBodyPerformanceKeysPerformanceItemPointsPerformanceItemValue> performanceItemValue) {
            this.performanceItemValue = performanceItemValue;
            return this;
        }
        public java.util.List<DescribeDBClusterPerformanceResponseBodyPerformanceKeysPerformanceItemPointsPerformanceItemValue> getPerformanceItemValue() {
            return this.performanceItemValue;
        }

    }

    public static class DescribeDBClusterPerformanceResponseBodyPerformanceKeysPerformanceItem extends TeaModel {
        /**
         * <p>The ID of the cluster node.</p>
         * <br>
         * <p>>  The value of this parameter is not returned if the `Key` parameter is set to `PolarDBDiskUsage`.</p>
         */
        @NameInMap("DBNodeId")
        public String DBNodeId;

        /**
         * <p>The performance metrics that are returned.</p>
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
        public DescribeDBClusterPerformanceResponseBodyPerformanceKeysPerformanceItemPoints points;

        public static DescribeDBClusterPerformanceResponseBodyPerformanceKeysPerformanceItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterPerformanceResponseBodyPerformanceKeysPerformanceItem self = new DescribeDBClusterPerformanceResponseBodyPerformanceKeysPerformanceItem();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterPerformanceResponseBodyPerformanceKeysPerformanceItem setDBNodeId(String DBNodeId) {
            this.DBNodeId = DBNodeId;
            return this;
        }
        public String getDBNodeId() {
            return this.DBNodeId;
        }

        public DescribeDBClusterPerformanceResponseBodyPerformanceKeysPerformanceItem setMeasurement(String measurement) {
            this.measurement = measurement;
            return this;
        }
        public String getMeasurement() {
            return this.measurement;
        }

        public DescribeDBClusterPerformanceResponseBodyPerformanceKeysPerformanceItem setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public DescribeDBClusterPerformanceResponseBodyPerformanceKeysPerformanceItem setPoints(DescribeDBClusterPerformanceResponseBodyPerformanceKeysPerformanceItemPoints points) {
            this.points = points;
            return this;
        }
        public DescribeDBClusterPerformanceResponseBodyPerformanceKeysPerformanceItemPoints getPoints() {
            return this.points;
        }

    }

    public static class DescribeDBClusterPerformanceResponseBodyPerformanceKeys extends TeaModel {
        @NameInMap("PerformanceItem")
        public java.util.List<DescribeDBClusterPerformanceResponseBodyPerformanceKeysPerformanceItem> performanceItem;

        public static DescribeDBClusterPerformanceResponseBodyPerformanceKeys build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterPerformanceResponseBodyPerformanceKeys self = new DescribeDBClusterPerformanceResponseBodyPerformanceKeys();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterPerformanceResponseBodyPerformanceKeys setPerformanceItem(java.util.List<DescribeDBClusterPerformanceResponseBodyPerformanceKeysPerformanceItem> performanceItem) {
            this.performanceItem = performanceItem;
            return this;
        }
        public java.util.List<DescribeDBClusterPerformanceResponseBodyPerformanceKeysPerformanceItem> getPerformanceItem() {
            return this.performanceItem;
        }

    }

}
