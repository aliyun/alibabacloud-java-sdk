// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeDBNodePerformanceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pxc-********</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <strong>example:</strong>
     * <p>2021-10-20T02:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("PerformanceKeys")
    public DescribeDBNodePerformanceResponseBodyPerformanceKeys performanceKeys;

    /**
     * <strong>example:</strong>
     * <p>EFB5E10B-5268-170F-A378-9AF86CCEACC8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>2021-10-20T00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDBNodePerformanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBNodePerformanceResponseBody self = new DescribeDBNodePerformanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBNodePerformanceResponseBody setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
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
         * <strong>example:</strong>
         * <p>1600822800000</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        /**
         * <strong>example:</strong>
         * <p>42.38</p>
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
         * <strong>example:</strong>
         * <p>pxc-i-********</p>
         */
        @NameInMap("DBNodeId")
        public String DBNodeId;

        /**
         * <strong>example:</strong>
         * <p>Logic_TPS</p>
         */
        @NameInMap("Measurement")
        public String measurement;

        /**
         * <strong>example:</strong>
         * <p>logic_tps</p>
         */
        @NameInMap("MetricName")
        public String metricName;

        @NameInMap("Points")
        public DescribeDBNodePerformanceResponseBodyPerformanceKeysPerformanceItemPoints points;

        public static DescribeDBNodePerformanceResponseBodyPerformanceKeysPerformanceItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBNodePerformanceResponseBodyPerformanceKeysPerformanceItem self = new DescribeDBNodePerformanceResponseBodyPerformanceKeysPerformanceItem();
            return TeaModel.build(map, self);
        }

        public DescribeDBNodePerformanceResponseBodyPerformanceKeysPerformanceItem setDBNodeId(String DBNodeId) {
            this.DBNodeId = DBNodeId;
            return this;
        }
        public String getDBNodeId() {
            return this.DBNodeId;
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
