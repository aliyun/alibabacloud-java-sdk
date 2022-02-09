// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeOmsSyncMonitorResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeOmsSyncMonitorResponseBodyData> data;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeOmsSyncMonitorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOmsSyncMonitorResponseBody self = new DescribeOmsSyncMonitorResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOmsSyncMonitorResponseBody setData(java.util.List<DescribeOmsSyncMonitorResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeOmsSyncMonitorResponseBodyData> getData() {
        return this.data;
    }

    public DescribeOmsSyncMonitorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeOmsSyncMonitorResponseBodyDataDataPoints extends TeaModel {
        @NameInMap("Timestamp")
        public Integer timestamp;

        @NameInMap("Value")
        public Float value;

        public static DescribeOmsSyncMonitorResponseBodyDataDataPoints build(java.util.Map<String, ?> map) throws Exception {
            DescribeOmsSyncMonitorResponseBodyDataDataPoints self = new DescribeOmsSyncMonitorResponseBodyDataDataPoints();
            return TeaModel.build(map, self);
        }

        public DescribeOmsSyncMonitorResponseBodyDataDataPoints setTimestamp(Integer timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Integer getTimestamp() {
            return this.timestamp;
        }

        public DescribeOmsSyncMonitorResponseBodyDataDataPoints setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
            return this.value;
        }

    }

    public static class DescribeOmsSyncMonitorResponseBodyData extends TeaModel {
        @NameInMap("DataPoints")
        public java.util.List<DescribeOmsSyncMonitorResponseBodyDataDataPoints> dataPoints;

        @NameInMap("Metric")
        public String metric;

        @NameInMap("Tags")
        public java.util.Map<String, ?> tags;

        public static DescribeOmsSyncMonitorResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeOmsSyncMonitorResponseBodyData self = new DescribeOmsSyncMonitorResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeOmsSyncMonitorResponseBodyData setDataPoints(java.util.List<DescribeOmsSyncMonitorResponseBodyDataDataPoints> dataPoints) {
            this.dataPoints = dataPoints;
            return this;
        }
        public java.util.List<DescribeOmsSyncMonitorResponseBodyDataDataPoints> getDataPoints() {
            return this.dataPoints;
        }

        public DescribeOmsSyncMonitorResponseBodyData setMetric(String metric) {
            this.metric = metric;
            return this;
        }
        public String getMetric() {
            return this.metric;
        }

        public DescribeOmsSyncMonitorResponseBodyData setTags(java.util.Map<String, ?> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.Map<String, ?> getTags() {
            return this.tags;
        }

    }

}
