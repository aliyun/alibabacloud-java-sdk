// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeInstanceStoragePerformanceResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public DescribeInstanceStoragePerformanceResponseBodyData data;

    public static DescribeInstanceStoragePerformanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceStoragePerformanceResponseBody self = new DescribeInstanceStoragePerformanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceStoragePerformanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeInstanceStoragePerformanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceStoragePerformanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeInstanceStoragePerformanceResponseBody setData(DescribeInstanceStoragePerformanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeInstanceStoragePerformanceResponseBodyData getData() {
        return this.data;
    }

    public static class DescribeInstanceStoragePerformanceResponseBodyDataPerformanceItemsPoints extends TeaModel {
        @NameInMap("Value")
        public String value;

        @NameInMap("Timestamp")
        public Long timestamp;

        public static DescribeInstanceStoragePerformanceResponseBodyDataPerformanceItemsPoints build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceStoragePerformanceResponseBodyDataPerformanceItemsPoints self = new DescribeInstanceStoragePerformanceResponseBodyDataPerformanceItemsPoints();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceStoragePerformanceResponseBodyDataPerformanceItemsPoints setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DescribeInstanceStoragePerformanceResponseBodyDataPerformanceItemsPoints setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

    public static class DescribeInstanceStoragePerformanceResponseBodyDataPerformanceItems extends TeaModel {
        @NameInMap("MetricName")
        public String metricName;

        @NameInMap("Measurement")
        public String measurement;

        @NameInMap("Points")
        public java.util.List<DescribeInstanceStoragePerformanceResponseBodyDataPerformanceItemsPoints> points;

        public static DescribeInstanceStoragePerformanceResponseBodyDataPerformanceItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceStoragePerformanceResponseBodyDataPerformanceItems self = new DescribeInstanceStoragePerformanceResponseBodyDataPerformanceItems();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceStoragePerformanceResponseBodyDataPerformanceItems setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public DescribeInstanceStoragePerformanceResponseBodyDataPerformanceItems setMeasurement(String measurement) {
            this.measurement = measurement;
            return this;
        }
        public String getMeasurement() {
            return this.measurement;
        }

        public DescribeInstanceStoragePerformanceResponseBodyDataPerformanceItems setPoints(java.util.List<DescribeInstanceStoragePerformanceResponseBodyDataPerformanceItemsPoints> points) {
            this.points = points;
            return this;
        }
        public java.util.List<DescribeInstanceStoragePerformanceResponseBodyDataPerformanceItemsPoints> getPoints() {
            return this.points;
        }

    }

    public static class DescribeInstanceStoragePerformanceResponseBodyData extends TeaModel {
        @NameInMap("PerformanceItems")
        public java.util.List<DescribeInstanceStoragePerformanceResponseBodyDataPerformanceItems> performanceItems;

        public static DescribeInstanceStoragePerformanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceStoragePerformanceResponseBodyData self = new DescribeInstanceStoragePerformanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceStoragePerformanceResponseBodyData setPerformanceItems(java.util.List<DescribeInstanceStoragePerformanceResponseBodyDataPerformanceItems> performanceItems) {
            this.performanceItems = performanceItems;
            return this;
        }
        public java.util.List<DescribeInstanceStoragePerformanceResponseBodyDataPerformanceItems> getPerformanceItems() {
            return this.performanceItems;
        }

    }

}
