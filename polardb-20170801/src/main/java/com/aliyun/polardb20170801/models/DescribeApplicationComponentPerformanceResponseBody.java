// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeApplicationComponentPerformanceResponseBody extends TeaModel {
    /**
     * <p>The ID of the application.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-**************</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>The type of the application.</p>
     * 
     * <strong>example:</strong>
     * <p>supabase</p>
     */
    @NameInMap("ApplicationType")
    public String applicationType;

    /**
     * <p>The version of the application.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0.0</p>
     */
    @NameInMap("ApplicationVersion")
    public String applicationVersion;

    /**
     * <p>The ID of the application component.</p>
     * 
     * <strong>example:</strong>
     * <p>pac-*******************</p>
     */
    @NameInMap("ComponentId")
    public String componentId;

    /**
     * <p>The type of the application component.</p>
     * 
     * <strong>example:</strong>
     * <p>backend</p>
     */
    @NameInMap("ComponentType")
    public String componentType;

    /**
     * <p>The end time of the query. The time is in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-09-23T02:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("PerformanceKeys")
    public DescribeApplicationComponentPerformanceResponseBodyPerformanceKeys performanceKeys;

    /**
     * <p>The ID of the request.</p>
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
     * <p>2020-09-23T01:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeApplicationComponentPerformanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationComponentPerformanceResponseBody self = new DescribeApplicationComponentPerformanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationComponentPerformanceResponseBody setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public DescribeApplicationComponentPerformanceResponseBody setApplicationType(String applicationType) {
        this.applicationType = applicationType;
        return this;
    }
    public String getApplicationType() {
        return this.applicationType;
    }

    public DescribeApplicationComponentPerformanceResponseBody setApplicationVersion(String applicationVersion) {
        this.applicationVersion = applicationVersion;
        return this;
    }
    public String getApplicationVersion() {
        return this.applicationVersion;
    }

    public DescribeApplicationComponentPerformanceResponseBody setComponentId(String componentId) {
        this.componentId = componentId;
        return this;
    }
    public String getComponentId() {
        return this.componentId;
    }

    public DescribeApplicationComponentPerformanceResponseBody setComponentType(String componentType) {
        this.componentType = componentType;
        return this;
    }
    public String getComponentType() {
        return this.componentType;
    }

    public DescribeApplicationComponentPerformanceResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeApplicationComponentPerformanceResponseBody setPerformanceKeys(DescribeApplicationComponentPerformanceResponseBodyPerformanceKeys performanceKeys) {
        this.performanceKeys = performanceKeys;
        return this;
    }
    public DescribeApplicationComponentPerformanceResponseBodyPerformanceKeys getPerformanceKeys() {
        return this.performanceKeys;
    }

    public DescribeApplicationComponentPerformanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApplicationComponentPerformanceResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeApplicationComponentPerformanceResponseBodyPerformanceKeysPerformanceItemPointsPerformanceItemValue extends TeaModel {
        @NameInMap("Timestamp")
        public Long timestamp;

        @NameInMap("Value")
        public String value;

        public static DescribeApplicationComponentPerformanceResponseBodyPerformanceKeysPerformanceItemPointsPerformanceItemValue build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationComponentPerformanceResponseBodyPerformanceKeysPerformanceItemPointsPerformanceItemValue self = new DescribeApplicationComponentPerformanceResponseBodyPerformanceKeysPerformanceItemPointsPerformanceItemValue();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationComponentPerformanceResponseBodyPerformanceKeysPerformanceItemPointsPerformanceItemValue setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public DescribeApplicationComponentPerformanceResponseBodyPerformanceKeysPerformanceItemPointsPerformanceItemValue setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeApplicationComponentPerformanceResponseBodyPerformanceKeysPerformanceItemPoints extends TeaModel {
        @NameInMap("PerformanceItemValue")
        public java.util.List<DescribeApplicationComponentPerformanceResponseBodyPerformanceKeysPerformanceItemPointsPerformanceItemValue> performanceItemValue;

        public static DescribeApplicationComponentPerformanceResponseBodyPerformanceKeysPerformanceItemPoints build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationComponentPerformanceResponseBodyPerformanceKeysPerformanceItemPoints self = new DescribeApplicationComponentPerformanceResponseBodyPerformanceKeysPerformanceItemPoints();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationComponentPerformanceResponseBodyPerformanceKeysPerformanceItemPoints setPerformanceItemValue(java.util.List<DescribeApplicationComponentPerformanceResponseBodyPerformanceKeysPerformanceItemPointsPerformanceItemValue> performanceItemValue) {
            this.performanceItemValue = performanceItemValue;
            return this;
        }
        public java.util.List<DescribeApplicationComponentPerformanceResponseBodyPerformanceKeysPerformanceItemPointsPerformanceItemValue> getPerformanceItemValue() {
            return this.performanceItemValue;
        }

    }

    public static class DescribeApplicationComponentPerformanceResponseBodyPerformanceKeysPerformanceItem extends TeaModel {
        @NameInMap("Measurement")
        public String measurement;

        @NameInMap("MetricName")
        public String metricName;

        @NameInMap("Points")
        public DescribeApplicationComponentPerformanceResponseBodyPerformanceKeysPerformanceItemPoints points;

        public static DescribeApplicationComponentPerformanceResponseBodyPerformanceKeysPerformanceItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationComponentPerformanceResponseBodyPerformanceKeysPerformanceItem self = new DescribeApplicationComponentPerformanceResponseBodyPerformanceKeysPerformanceItem();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationComponentPerformanceResponseBodyPerformanceKeysPerformanceItem setMeasurement(String measurement) {
            this.measurement = measurement;
            return this;
        }
        public String getMeasurement() {
            return this.measurement;
        }

        public DescribeApplicationComponentPerformanceResponseBodyPerformanceKeysPerformanceItem setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public DescribeApplicationComponentPerformanceResponseBodyPerformanceKeysPerformanceItem setPoints(DescribeApplicationComponentPerformanceResponseBodyPerformanceKeysPerformanceItemPoints points) {
            this.points = points;
            return this;
        }
        public DescribeApplicationComponentPerformanceResponseBodyPerformanceKeysPerformanceItemPoints getPoints() {
            return this.points;
        }

    }

    public static class DescribeApplicationComponentPerformanceResponseBodyPerformanceKeys extends TeaModel {
        @NameInMap("PerformanceItem")
        public java.util.List<DescribeApplicationComponentPerformanceResponseBodyPerformanceKeysPerformanceItem> performanceItem;

        public static DescribeApplicationComponentPerformanceResponseBodyPerformanceKeys build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationComponentPerformanceResponseBodyPerformanceKeys self = new DescribeApplicationComponentPerformanceResponseBodyPerformanceKeys();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationComponentPerformanceResponseBodyPerformanceKeys setPerformanceItem(java.util.List<DescribeApplicationComponentPerformanceResponseBodyPerformanceKeysPerformanceItem> performanceItem) {
            this.performanceItem = performanceItem;
            return this;
        }
        public java.util.List<DescribeApplicationComponentPerformanceResponseBodyPerformanceKeysPerformanceItem> getPerformanceItem() {
            return this.performanceItem;
        }

    }

}
