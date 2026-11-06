// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribePolarFsPerformanceResponseBody extends TeaModel {
    /**
     * <p>The end time of the query. The time is in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-10-07T03:04:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("PerformanceKeys")
    public DescribePolarFsPerformanceResponseBodyPerformanceKeys performanceKeys;

    /**
     * <p>The PolarFS instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pfs-2ze0i74ka607*****</p>
     */
    @NameInMap("PolarFsInstanceId")
    public String polarFsInstanceId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2921D843-433A-5FB3-A03B-4EC093B219F8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The start time of the query. The time is in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-10-07T02:04:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribePolarFsPerformanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePolarFsPerformanceResponseBody self = new DescribePolarFsPerformanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePolarFsPerformanceResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribePolarFsPerformanceResponseBody setPerformanceKeys(DescribePolarFsPerformanceResponseBodyPerformanceKeys performanceKeys) {
        this.performanceKeys = performanceKeys;
        return this;
    }
    public DescribePolarFsPerformanceResponseBodyPerformanceKeys getPerformanceKeys() {
        return this.performanceKeys;
    }

    public DescribePolarFsPerformanceResponseBody setPolarFsInstanceId(String polarFsInstanceId) {
        this.polarFsInstanceId = polarFsInstanceId;
        return this;
    }
    public String getPolarFsInstanceId() {
        return this.polarFsInstanceId;
    }

    public DescribePolarFsPerformanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePolarFsPerformanceResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribePolarFsPerformanceResponseBodyPerformanceKeysPerformanceItemPointsPerformanceItemValue extends TeaModel {
        @NameInMap("Timestamp")
        public Long timestamp;

        @NameInMap("Value")
        public String value;

        public static DescribePolarFsPerformanceResponseBodyPerformanceKeysPerformanceItemPointsPerformanceItemValue build(java.util.Map<String, ?> map) throws Exception {
            DescribePolarFsPerformanceResponseBodyPerformanceKeysPerformanceItemPointsPerformanceItemValue self = new DescribePolarFsPerformanceResponseBodyPerformanceKeysPerformanceItemPointsPerformanceItemValue();
            return TeaModel.build(map, self);
        }

        public DescribePolarFsPerformanceResponseBodyPerformanceKeysPerformanceItemPointsPerformanceItemValue setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public DescribePolarFsPerformanceResponseBodyPerformanceKeysPerformanceItemPointsPerformanceItemValue setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribePolarFsPerformanceResponseBodyPerformanceKeysPerformanceItemPoints extends TeaModel {
        @NameInMap("PerformanceItemValue")
        public java.util.List<DescribePolarFsPerformanceResponseBodyPerformanceKeysPerformanceItemPointsPerformanceItemValue> performanceItemValue;

        public static DescribePolarFsPerformanceResponseBodyPerformanceKeysPerformanceItemPoints build(java.util.Map<String, ?> map) throws Exception {
            DescribePolarFsPerformanceResponseBodyPerformanceKeysPerformanceItemPoints self = new DescribePolarFsPerformanceResponseBodyPerformanceKeysPerformanceItemPoints();
            return TeaModel.build(map, self);
        }

        public DescribePolarFsPerformanceResponseBodyPerformanceKeysPerformanceItemPoints setPerformanceItemValue(java.util.List<DescribePolarFsPerformanceResponseBodyPerformanceKeysPerformanceItemPointsPerformanceItemValue> performanceItemValue) {
            this.performanceItemValue = performanceItemValue;
            return this;
        }
        public java.util.List<DescribePolarFsPerformanceResponseBodyPerformanceKeysPerformanceItemPointsPerformanceItemValue> getPerformanceItemValue() {
            return this.performanceItemValue;
        }

    }

    public static class DescribePolarFsPerformanceResponseBodyPerformanceKeysPerformanceItem extends TeaModel {
        @NameInMap("Measurement")
        public String measurement;

        @NameInMap("MetricName")
        public String metricName;

        @NameInMap("Points")
        public DescribePolarFsPerformanceResponseBodyPerformanceKeysPerformanceItemPoints points;

        public static DescribePolarFsPerformanceResponseBodyPerformanceKeysPerformanceItem build(java.util.Map<String, ?> map) throws Exception {
            DescribePolarFsPerformanceResponseBodyPerformanceKeysPerformanceItem self = new DescribePolarFsPerformanceResponseBodyPerformanceKeysPerformanceItem();
            return TeaModel.build(map, self);
        }

        public DescribePolarFsPerformanceResponseBodyPerformanceKeysPerformanceItem setMeasurement(String measurement) {
            this.measurement = measurement;
            return this;
        }
        public String getMeasurement() {
            return this.measurement;
        }

        public DescribePolarFsPerformanceResponseBodyPerformanceKeysPerformanceItem setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public DescribePolarFsPerformanceResponseBodyPerformanceKeysPerformanceItem setPoints(DescribePolarFsPerformanceResponseBodyPerformanceKeysPerformanceItemPoints points) {
            this.points = points;
            return this;
        }
        public DescribePolarFsPerformanceResponseBodyPerformanceKeysPerformanceItemPoints getPoints() {
            return this.points;
        }

    }

    public static class DescribePolarFsPerformanceResponseBodyPerformanceKeys extends TeaModel {
        @NameInMap("PerformanceItem")
        public java.util.List<DescribePolarFsPerformanceResponseBodyPerformanceKeysPerformanceItem> performanceItem;

        public static DescribePolarFsPerformanceResponseBodyPerformanceKeys build(java.util.Map<String, ?> map) throws Exception {
            DescribePolarFsPerformanceResponseBodyPerformanceKeys self = new DescribePolarFsPerformanceResponseBodyPerformanceKeys();
            return TeaModel.build(map, self);
        }

        public DescribePolarFsPerformanceResponseBodyPerformanceKeys setPerformanceItem(java.util.List<DescribePolarFsPerformanceResponseBodyPerformanceKeysPerformanceItem> performanceItem) {
            this.performanceItem = performanceItem;
            return this;
        }
        public java.util.List<DescribePolarFsPerformanceResponseBodyPerformanceKeysPerformanceItem> getPerformanceItem() {
            return this.performanceItem;
        }

    }

}
