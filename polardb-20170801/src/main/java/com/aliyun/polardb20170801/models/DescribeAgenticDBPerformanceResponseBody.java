// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeAgenticDBPerformanceResponseBody extends TeaModel {
    /**
     * <p>The AgenticDB cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-**************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The end time of the query. Specify the time in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-09-23T01:01:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("PerformanceKeys")
    public DescribeAgenticDBPerformanceResponseBodyPerformanceKeys performanceKeys;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2F029645-FED9-4FE8-A6D3-488954******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The start time of the query. Specify the time in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-09-23T01:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeAgenticDBPerformanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAgenticDBPerformanceResponseBody self = new DescribeAgenticDBPerformanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAgenticDBPerformanceResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeAgenticDBPerformanceResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeAgenticDBPerformanceResponseBody setPerformanceKeys(DescribeAgenticDBPerformanceResponseBodyPerformanceKeys performanceKeys) {
        this.performanceKeys = performanceKeys;
        return this;
    }
    public DescribeAgenticDBPerformanceResponseBodyPerformanceKeys getPerformanceKeys() {
        return this.performanceKeys;
    }

    public DescribeAgenticDBPerformanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAgenticDBPerformanceResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeAgenticDBPerformanceResponseBodyPerformanceKeysPerformanceKeysPointsPoints extends TeaModel {
        @NameInMap("Timestamp")
        public Long timestamp;

        @NameInMap("Value")
        public String value;

        public static DescribeAgenticDBPerformanceResponseBodyPerformanceKeysPerformanceKeysPointsPoints build(java.util.Map<String, ?> map) throws Exception {
            DescribeAgenticDBPerformanceResponseBodyPerformanceKeysPerformanceKeysPointsPoints self = new DescribeAgenticDBPerformanceResponseBodyPerformanceKeysPerformanceKeysPointsPoints();
            return TeaModel.build(map, self);
        }

        public DescribeAgenticDBPerformanceResponseBodyPerformanceKeysPerformanceKeysPointsPoints setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public DescribeAgenticDBPerformanceResponseBodyPerformanceKeysPerformanceKeysPointsPoints setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeAgenticDBPerformanceResponseBodyPerformanceKeysPerformanceKeysPoints extends TeaModel {
        @NameInMap("points")
        public java.util.List<DescribeAgenticDBPerformanceResponseBodyPerformanceKeysPerformanceKeysPointsPoints> points;

        public static DescribeAgenticDBPerformanceResponseBodyPerformanceKeysPerformanceKeysPoints build(java.util.Map<String, ?> map) throws Exception {
            DescribeAgenticDBPerformanceResponseBodyPerformanceKeysPerformanceKeysPoints self = new DescribeAgenticDBPerformanceResponseBodyPerformanceKeysPerformanceKeysPoints();
            return TeaModel.build(map, self);
        }

        public DescribeAgenticDBPerformanceResponseBodyPerformanceKeysPerformanceKeysPoints setPoints(java.util.List<DescribeAgenticDBPerformanceResponseBodyPerformanceKeysPerformanceKeysPointsPoints> points) {
            this.points = points;
            return this;
        }
        public java.util.List<DescribeAgenticDBPerformanceResponseBodyPerformanceKeysPerformanceKeysPointsPoints> getPoints() {
            return this.points;
        }

    }

    public static class DescribeAgenticDBPerformanceResponseBodyPerformanceKeysPerformanceKeys extends TeaModel {
        @NameInMap("BranchId")
        public String branchId;

        @NameInMap("EndpointId")
        public String endpointId;

        @NameInMap("Measurement")
        public String measurement;

        @NameInMap("MetricName")
        public String metricName;

        @NameInMap("Points")
        public DescribeAgenticDBPerformanceResponseBodyPerformanceKeysPerformanceKeysPoints points;

        public static DescribeAgenticDBPerformanceResponseBodyPerformanceKeysPerformanceKeys build(java.util.Map<String, ?> map) throws Exception {
            DescribeAgenticDBPerformanceResponseBodyPerformanceKeysPerformanceKeys self = new DescribeAgenticDBPerformanceResponseBodyPerformanceKeysPerformanceKeys();
            return TeaModel.build(map, self);
        }

        public DescribeAgenticDBPerformanceResponseBodyPerformanceKeysPerformanceKeys setBranchId(String branchId) {
            this.branchId = branchId;
            return this;
        }
        public String getBranchId() {
            return this.branchId;
        }

        public DescribeAgenticDBPerformanceResponseBodyPerformanceKeysPerformanceKeys setEndpointId(String endpointId) {
            this.endpointId = endpointId;
            return this;
        }
        public String getEndpointId() {
            return this.endpointId;
        }

        public DescribeAgenticDBPerformanceResponseBodyPerformanceKeysPerformanceKeys setMeasurement(String measurement) {
            this.measurement = measurement;
            return this;
        }
        public String getMeasurement() {
            return this.measurement;
        }

        public DescribeAgenticDBPerformanceResponseBodyPerformanceKeysPerformanceKeys setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public DescribeAgenticDBPerformanceResponseBodyPerformanceKeysPerformanceKeys setPoints(DescribeAgenticDBPerformanceResponseBodyPerformanceKeysPerformanceKeysPoints points) {
            this.points = points;
            return this;
        }
        public DescribeAgenticDBPerformanceResponseBodyPerformanceKeysPerformanceKeysPoints getPoints() {
            return this.points;
        }

    }

    public static class DescribeAgenticDBPerformanceResponseBodyPerformanceKeys extends TeaModel {
        @NameInMap("performanceKeys")
        public java.util.List<DescribeAgenticDBPerformanceResponseBodyPerformanceKeysPerformanceKeys> performanceKeys;

        public static DescribeAgenticDBPerformanceResponseBodyPerformanceKeys build(java.util.Map<String, ?> map) throws Exception {
            DescribeAgenticDBPerformanceResponseBodyPerformanceKeys self = new DescribeAgenticDBPerformanceResponseBodyPerformanceKeys();
            return TeaModel.build(map, self);
        }

        public DescribeAgenticDBPerformanceResponseBodyPerformanceKeys setPerformanceKeys(java.util.List<DescribeAgenticDBPerformanceResponseBodyPerformanceKeysPerformanceKeys> performanceKeys) {
            this.performanceKeys = performanceKeys;
            return this;
        }
        public java.util.List<DescribeAgenticDBPerformanceResponseBodyPerformanceKeysPerformanceKeys> getPerformanceKeys() {
            return this.performanceKeys;
        }

    }

}
