// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeInstanceDbPerformanceResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public DescribeInstanceDbPerformanceResponseBodyData data;

    public static DescribeInstanceDbPerformanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceDbPerformanceResponseBody self = new DescribeInstanceDbPerformanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceDbPerformanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeInstanceDbPerformanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceDbPerformanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeInstanceDbPerformanceResponseBody setData(DescribeInstanceDbPerformanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeInstanceDbPerformanceResponseBodyData getData() {
        return this.data;
    }

    public static class DescribeInstanceDbPerformanceResponseBodyDataPerformanceItemsPoints extends TeaModel {
        @NameInMap("Value")
        public String value;

        @NameInMap("Timestamp")
        public Long timestamp;

        public static DescribeInstanceDbPerformanceResponseBodyDataPerformanceItemsPoints build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceDbPerformanceResponseBodyDataPerformanceItemsPoints self = new DescribeInstanceDbPerformanceResponseBodyDataPerformanceItemsPoints();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceDbPerformanceResponseBodyDataPerformanceItemsPoints setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DescribeInstanceDbPerformanceResponseBodyDataPerformanceItemsPoints setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

    public static class DescribeInstanceDbPerformanceResponseBodyDataPerformanceItems extends TeaModel {
        @NameInMap("MetricName")
        public String metricName;

        @NameInMap("Measurement")
        public String measurement;

        @NameInMap("Points")
        public java.util.List<DescribeInstanceDbPerformanceResponseBodyDataPerformanceItemsPoints> points;

        public static DescribeInstanceDbPerformanceResponseBodyDataPerformanceItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceDbPerformanceResponseBodyDataPerformanceItems self = new DescribeInstanceDbPerformanceResponseBodyDataPerformanceItems();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceDbPerformanceResponseBodyDataPerformanceItems setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public DescribeInstanceDbPerformanceResponseBodyDataPerformanceItems setMeasurement(String measurement) {
            this.measurement = measurement;
            return this;
        }
        public String getMeasurement() {
            return this.measurement;
        }

        public DescribeInstanceDbPerformanceResponseBodyDataPerformanceItems setPoints(java.util.List<DescribeInstanceDbPerformanceResponseBodyDataPerformanceItemsPoints> points) {
            this.points = points;
            return this;
        }
        public java.util.List<DescribeInstanceDbPerformanceResponseBodyDataPerformanceItemsPoints> getPoints() {
            return this.points;
        }

    }

    public static class DescribeInstanceDbPerformanceResponseBodyData extends TeaModel {
        @NameInMap("PerformanceItems")
        public java.util.List<DescribeInstanceDbPerformanceResponseBodyDataPerformanceItems> performanceItems;

        public static DescribeInstanceDbPerformanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceDbPerformanceResponseBodyData self = new DescribeInstanceDbPerformanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceDbPerformanceResponseBodyData setPerformanceItems(java.util.List<DescribeInstanceDbPerformanceResponseBodyDataPerformanceItems> performanceItems) {
            this.performanceItems = performanceItems;
            return this;
        }
        public java.util.List<DescribeInstanceDbPerformanceResponseBodyDataPerformanceItems> getPerformanceItems() {
            return this.performanceItems;
        }

    }

}
