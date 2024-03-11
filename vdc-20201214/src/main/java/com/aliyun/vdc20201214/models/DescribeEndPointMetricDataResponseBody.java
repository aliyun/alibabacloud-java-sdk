// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeEndPointMetricDataResponseBody extends TeaModel {
    @NameInMap("PubMetrics")
    public java.util.List<DescribeEndPointMetricDataResponseBodyPubMetrics> pubMetrics;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SubMetrics")
    public java.util.List<DescribeEndPointMetricDataResponseBodySubMetrics> subMetrics;

    public static DescribeEndPointMetricDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEndPointMetricDataResponseBody self = new DescribeEndPointMetricDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEndPointMetricDataResponseBody setPubMetrics(java.util.List<DescribeEndPointMetricDataResponseBodyPubMetrics> pubMetrics) {
        this.pubMetrics = pubMetrics;
        return this;
    }
    public java.util.List<DescribeEndPointMetricDataResponseBodyPubMetrics> getPubMetrics() {
        return this.pubMetrics;
    }

    public DescribeEndPointMetricDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEndPointMetricDataResponseBody setSubMetrics(java.util.List<DescribeEndPointMetricDataResponseBodySubMetrics> subMetrics) {
        this.subMetrics = subMetrics;
        return this;
    }
    public java.util.List<DescribeEndPointMetricDataResponseBodySubMetrics> getSubMetrics() {
        return this.subMetrics;
    }

    public static class DescribeEndPointMetricDataResponseBodyPubMetricsNodes extends TeaModel {
        @NameInMap("Ext")
        public java.util.Map<String, ?> ext;

        @NameInMap("X")
        public String x;

        @NameInMap("Y")
        public String y;

        public static DescribeEndPointMetricDataResponseBodyPubMetricsNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeEndPointMetricDataResponseBodyPubMetricsNodes self = new DescribeEndPointMetricDataResponseBodyPubMetricsNodes();
            return TeaModel.build(map, self);
        }

        public DescribeEndPointMetricDataResponseBodyPubMetricsNodes setExt(java.util.Map<String, ?> ext) {
            this.ext = ext;
            return this;
        }
        public java.util.Map<String, ?> getExt() {
            return this.ext;
        }

        public DescribeEndPointMetricDataResponseBodyPubMetricsNodes setX(String x) {
            this.x = x;
            return this;
        }
        public String getX() {
            return this.x;
        }

        public DescribeEndPointMetricDataResponseBodyPubMetricsNodes setY(String y) {
            this.y = y;
            return this;
        }
        public String getY() {
            return this.y;
        }

    }

    public static class DescribeEndPointMetricDataResponseBodyPubMetrics extends TeaModel {
        @NameInMap("Nodes")
        public java.util.List<DescribeEndPointMetricDataResponseBodyPubMetricsNodes> nodes;

        @NameInMap("Type")
        public String type;

        @NameInMap("UserId")
        public String userId;

        public static DescribeEndPointMetricDataResponseBodyPubMetrics build(java.util.Map<String, ?> map) throws Exception {
            DescribeEndPointMetricDataResponseBodyPubMetrics self = new DescribeEndPointMetricDataResponseBodyPubMetrics();
            return TeaModel.build(map, self);
        }

        public DescribeEndPointMetricDataResponseBodyPubMetrics setNodes(java.util.List<DescribeEndPointMetricDataResponseBodyPubMetricsNodes> nodes) {
            this.nodes = nodes;
            return this;
        }
        public java.util.List<DescribeEndPointMetricDataResponseBodyPubMetricsNodes> getNodes() {
            return this.nodes;
        }

        public DescribeEndPointMetricDataResponseBodyPubMetrics setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeEndPointMetricDataResponseBodyPubMetrics setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class DescribeEndPointMetricDataResponseBodySubMetricsNodes extends TeaModel {
        @NameInMap("Ext")
        public java.util.Map<String, ?> ext;

        @NameInMap("X")
        public String x;

        @NameInMap("Y")
        public String y;

        public static DescribeEndPointMetricDataResponseBodySubMetricsNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeEndPointMetricDataResponseBodySubMetricsNodes self = new DescribeEndPointMetricDataResponseBodySubMetricsNodes();
            return TeaModel.build(map, self);
        }

        public DescribeEndPointMetricDataResponseBodySubMetricsNodes setExt(java.util.Map<String, ?> ext) {
            this.ext = ext;
            return this;
        }
        public java.util.Map<String, ?> getExt() {
            return this.ext;
        }

        public DescribeEndPointMetricDataResponseBodySubMetricsNodes setX(String x) {
            this.x = x;
            return this;
        }
        public String getX() {
            return this.x;
        }

        public DescribeEndPointMetricDataResponseBodySubMetricsNodes setY(String y) {
            this.y = y;
            return this;
        }
        public String getY() {
            return this.y;
        }

    }

    public static class DescribeEndPointMetricDataResponseBodySubMetrics extends TeaModel {
        @NameInMap("Nodes")
        public java.util.List<DescribeEndPointMetricDataResponseBodySubMetricsNodes> nodes;

        @NameInMap("Type")
        public String type;

        @NameInMap("UserId")
        public String userId;

        public static DescribeEndPointMetricDataResponseBodySubMetrics build(java.util.Map<String, ?> map) throws Exception {
            DescribeEndPointMetricDataResponseBodySubMetrics self = new DescribeEndPointMetricDataResponseBodySubMetrics();
            return TeaModel.build(map, self);
        }

        public DescribeEndPointMetricDataResponseBodySubMetrics setNodes(java.util.List<DescribeEndPointMetricDataResponseBodySubMetricsNodes> nodes) {
            this.nodes = nodes;
            return this;
        }
        public java.util.List<DescribeEndPointMetricDataResponseBodySubMetricsNodes> getNodes() {
            return this.nodes;
        }

        public DescribeEndPointMetricDataResponseBodySubMetrics setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeEndPointMetricDataResponseBodySubMetrics setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
