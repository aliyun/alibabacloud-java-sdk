// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeApplicationPerformanceResponseBody extends TeaModel {
    /**
     * <p>The application cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-**************</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>The application type.</p>
     * 
     * <strong>example:</strong>
     * <p>supabase</p>
     */
    @NameInMap("ApplicationType")
    public String applicationType;

    /**
     * <p>The end time of the query. The time is in UTC and follows the <code>yyyy-MM-ddTHH:mm:ssZ</code> format.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-05-23T02:21:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("Interval")
    public String interval;

    /**
     * <p>The performance metrics.</p>
     */
    @NameInMap("PerformanceKeys")
    public DescribeApplicationPerformanceResponseBodyPerformanceKeys performanceKeys;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CDB3258F-B5DE-43C4-8935-CBA0CA******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The start time of the query. The time is in UTC and follows the <code>yyyy-MM-ddTHH:mm:ssZ</code> format.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-11-15T16:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeApplicationPerformanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationPerformanceResponseBody self = new DescribeApplicationPerformanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationPerformanceResponseBody setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public DescribeApplicationPerformanceResponseBody setApplicationType(String applicationType) {
        this.applicationType = applicationType;
        return this;
    }
    public String getApplicationType() {
        return this.applicationType;
    }

    public DescribeApplicationPerformanceResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeApplicationPerformanceResponseBody setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public DescribeApplicationPerformanceResponseBody setPerformanceKeys(DescribeApplicationPerformanceResponseBodyPerformanceKeys performanceKeys) {
        this.performanceKeys = performanceKeys;
        return this;
    }
    public DescribeApplicationPerformanceResponseBodyPerformanceKeys getPerformanceKeys() {
        return this.performanceKeys;
    }

    public DescribeApplicationPerformanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApplicationPerformanceResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeApplicationPerformanceResponseBodyPerformanceKeysPerformanceItemPointsPerformanceItemValue extends TeaModel {
        @NameInMap("Step")
        public Long step;

        @NameInMap("Timestamp")
        public Long timestamp;

        @NameInMap("Value")
        public String value;

        public static DescribeApplicationPerformanceResponseBodyPerformanceKeysPerformanceItemPointsPerformanceItemValue build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationPerformanceResponseBodyPerformanceKeysPerformanceItemPointsPerformanceItemValue self = new DescribeApplicationPerformanceResponseBodyPerformanceKeysPerformanceItemPointsPerformanceItemValue();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationPerformanceResponseBodyPerformanceKeysPerformanceItemPointsPerformanceItemValue setStep(Long step) {
            this.step = step;
            return this;
        }
        public Long getStep() {
            return this.step;
        }

        public DescribeApplicationPerformanceResponseBodyPerformanceKeysPerformanceItemPointsPerformanceItemValue setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public DescribeApplicationPerformanceResponseBodyPerformanceKeysPerformanceItemPointsPerformanceItemValue setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeApplicationPerformanceResponseBodyPerformanceKeysPerformanceItemPoints extends TeaModel {
        @NameInMap("PerformanceItemValue")
        public java.util.List<DescribeApplicationPerformanceResponseBodyPerformanceKeysPerformanceItemPointsPerformanceItemValue> performanceItemValue;

        public static DescribeApplicationPerformanceResponseBodyPerformanceKeysPerformanceItemPoints build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationPerformanceResponseBodyPerformanceKeysPerformanceItemPoints self = new DescribeApplicationPerformanceResponseBodyPerformanceKeysPerformanceItemPoints();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationPerformanceResponseBodyPerformanceKeysPerformanceItemPoints setPerformanceItemValue(java.util.List<DescribeApplicationPerformanceResponseBodyPerformanceKeysPerformanceItemPointsPerformanceItemValue> performanceItemValue) {
            this.performanceItemValue = performanceItemValue;
            return this;
        }
        public java.util.List<DescribeApplicationPerformanceResponseBodyPerformanceKeysPerformanceItemPointsPerformanceItemValue> getPerformanceItemValue() {
            return this.performanceItemValue;
        }

    }

    public static class DescribeApplicationPerformanceResponseBodyPerformanceKeysPerformanceItem extends TeaModel {
        @NameInMap("ComponentId")
        public String componentId;

        @NameInMap("ComponentType")
        public String componentType;

        @NameInMap("Measurement")
        public String measurement;

        @NameInMap("MetricName")
        public String metricName;

        @NameInMap("Points")
        public DescribeApplicationPerformanceResponseBodyPerformanceKeysPerformanceItemPoints points;

        public static DescribeApplicationPerformanceResponseBodyPerformanceKeysPerformanceItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationPerformanceResponseBodyPerformanceKeysPerformanceItem self = new DescribeApplicationPerformanceResponseBodyPerformanceKeysPerformanceItem();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationPerformanceResponseBodyPerformanceKeysPerformanceItem setComponentId(String componentId) {
            this.componentId = componentId;
            return this;
        }
        public String getComponentId() {
            return this.componentId;
        }

        public DescribeApplicationPerformanceResponseBodyPerformanceKeysPerformanceItem setComponentType(String componentType) {
            this.componentType = componentType;
            return this;
        }
        public String getComponentType() {
            return this.componentType;
        }

        public DescribeApplicationPerformanceResponseBodyPerformanceKeysPerformanceItem setMeasurement(String measurement) {
            this.measurement = measurement;
            return this;
        }
        public String getMeasurement() {
            return this.measurement;
        }

        public DescribeApplicationPerformanceResponseBodyPerformanceKeysPerformanceItem setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public DescribeApplicationPerformanceResponseBodyPerformanceKeysPerformanceItem setPoints(DescribeApplicationPerformanceResponseBodyPerformanceKeysPerformanceItemPoints points) {
            this.points = points;
            return this;
        }
        public DescribeApplicationPerformanceResponseBodyPerformanceKeysPerformanceItemPoints getPoints() {
            return this.points;
        }

    }

    public static class DescribeApplicationPerformanceResponseBodyPerformanceKeys extends TeaModel {
        @NameInMap("PerformanceItem")
        public java.util.List<DescribeApplicationPerformanceResponseBodyPerformanceKeysPerformanceItem> performanceItem;

        public static DescribeApplicationPerformanceResponseBodyPerformanceKeys build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationPerformanceResponseBodyPerformanceKeys self = new DescribeApplicationPerformanceResponseBodyPerformanceKeys();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationPerformanceResponseBodyPerformanceKeys setPerformanceItem(java.util.List<DescribeApplicationPerformanceResponseBodyPerformanceKeysPerformanceItem> performanceItem) {
            this.performanceItem = performanceItem;
            return this;
        }
        public java.util.List<DescribeApplicationPerformanceResponseBodyPerformanceKeysPerformanceItem> getPerformanceItem() {
            return this.performanceItem;
        }

    }

}
