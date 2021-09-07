// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeInstancePerformanceResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public DescribeInstancePerformanceResponseBodyData data;

    public static DescribeInstancePerformanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstancePerformanceResponseBody self = new DescribeInstancePerformanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstancePerformanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeInstancePerformanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstancePerformanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeInstancePerformanceResponseBody setData(DescribeInstancePerformanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeInstancePerformanceResponseBodyData getData() {
        return this.data;
    }

    public static class DescribeInstancePerformanceResponseBodyDataPerformanceItemsPoints extends TeaModel {
        @NameInMap("Value")
        public String value;

        @NameInMap("Timestamp")
        public Long timestamp;

        public static DescribeInstancePerformanceResponseBodyDataPerformanceItemsPoints build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancePerformanceResponseBodyDataPerformanceItemsPoints self = new DescribeInstancePerformanceResponseBodyDataPerformanceItemsPoints();
            return TeaModel.build(map, self);
        }

        public DescribeInstancePerformanceResponseBodyDataPerformanceItemsPoints setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DescribeInstancePerformanceResponseBodyDataPerformanceItemsPoints setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

    public static class DescribeInstancePerformanceResponseBodyDataPerformanceItems extends TeaModel {
        @NameInMap("MetricName")
        public String metricName;

        @NameInMap("Measurement")
        public String measurement;

        @NameInMap("Points")
        public java.util.List<DescribeInstancePerformanceResponseBodyDataPerformanceItemsPoints> points;

        public static DescribeInstancePerformanceResponseBodyDataPerformanceItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancePerformanceResponseBodyDataPerformanceItems self = new DescribeInstancePerformanceResponseBodyDataPerformanceItems();
            return TeaModel.build(map, self);
        }

        public DescribeInstancePerformanceResponseBodyDataPerformanceItems setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public DescribeInstancePerformanceResponseBodyDataPerformanceItems setMeasurement(String measurement) {
            this.measurement = measurement;
            return this;
        }
        public String getMeasurement() {
            return this.measurement;
        }

        public DescribeInstancePerformanceResponseBodyDataPerformanceItems setPoints(java.util.List<DescribeInstancePerformanceResponseBodyDataPerformanceItemsPoints> points) {
            this.points = points;
            return this;
        }
        public java.util.List<DescribeInstancePerformanceResponseBodyDataPerformanceItemsPoints> getPoints() {
            return this.points;
        }

    }

    public static class DescribeInstancePerformanceResponseBodyData extends TeaModel {
        @NameInMap("PerformanceItems")
        public java.util.List<DescribeInstancePerformanceResponseBodyDataPerformanceItems> performanceItems;

        public static DescribeInstancePerformanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancePerformanceResponseBodyData self = new DescribeInstancePerformanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeInstancePerformanceResponseBodyData setPerformanceItems(java.util.List<DescribeInstancePerformanceResponseBodyDataPerformanceItems> performanceItems) {
            this.performanceItems = performanceItems;
            return this;
        }
        public java.util.List<DescribeInstancePerformanceResponseBodyDataPerformanceItems> getPerformanceItems() {
            return this.performanceItems;
        }

    }

}
