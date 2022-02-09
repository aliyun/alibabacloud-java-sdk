// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeOmsMigrationMonitorResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeOmsMigrationMonitorResponseBodyData> data;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeOmsMigrationMonitorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOmsMigrationMonitorResponseBody self = new DescribeOmsMigrationMonitorResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOmsMigrationMonitorResponseBody setData(java.util.List<DescribeOmsMigrationMonitorResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeOmsMigrationMonitorResponseBodyData> getData() {
        return this.data;
    }

    public DescribeOmsMigrationMonitorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeOmsMigrationMonitorResponseBodyDataDataPoints extends TeaModel {
        @NameInMap("Timestamp")
        public Integer timestamp;

        @NameInMap("Value")
        public Float value;

        public static DescribeOmsMigrationMonitorResponseBodyDataDataPoints build(java.util.Map<String, ?> map) throws Exception {
            DescribeOmsMigrationMonitorResponseBodyDataDataPoints self = new DescribeOmsMigrationMonitorResponseBodyDataDataPoints();
            return TeaModel.build(map, self);
        }

        public DescribeOmsMigrationMonitorResponseBodyDataDataPoints setTimestamp(Integer timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Integer getTimestamp() {
            return this.timestamp;
        }

        public DescribeOmsMigrationMonitorResponseBodyDataDataPoints setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
            return this.value;
        }

    }

    public static class DescribeOmsMigrationMonitorResponseBodyData extends TeaModel {
        @NameInMap("DataPoints")
        public java.util.List<DescribeOmsMigrationMonitorResponseBodyDataDataPoints> dataPoints;

        @NameInMap("Metric")
        public String metric;

        @NameInMap("Tags")
        public java.util.Map<String, ?> tags;

        public static DescribeOmsMigrationMonitorResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeOmsMigrationMonitorResponseBodyData self = new DescribeOmsMigrationMonitorResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeOmsMigrationMonitorResponseBodyData setDataPoints(java.util.List<DescribeOmsMigrationMonitorResponseBodyDataDataPoints> dataPoints) {
            this.dataPoints = dataPoints;
            return this;
        }
        public java.util.List<DescribeOmsMigrationMonitorResponseBodyDataDataPoints> getDataPoints() {
            return this.dataPoints;
        }

        public DescribeOmsMigrationMonitorResponseBodyData setMetric(String metric) {
            this.metric = metric;
            return this;
        }
        public String getMetric() {
            return this.metric;
        }

        public DescribeOmsMigrationMonitorResponseBodyData setTags(java.util.Map<String, ?> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.Map<String, ?> getTags() {
            return this.tags;
        }

    }

}
