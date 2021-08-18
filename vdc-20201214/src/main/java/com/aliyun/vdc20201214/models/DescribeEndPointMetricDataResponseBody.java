// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeEndPointMetricDataResponseBody extends TeaModel {
    // 订阅端用户指标数据。
    @NameInMap("SubMetrics")
    public java.util.List<DescribeEndPointMetricDataResponseBodySubMetrics> subMetrics;

    // 发布端用户指标数据。
    @NameInMap("PubMetrics")
    public java.util.List<DescribeEndPointMetricDataResponseBodyPubMetrics> pubMetrics;

    // 请求ID。
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeEndPointMetricDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEndPointMetricDataResponseBody self = new DescribeEndPointMetricDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEndPointMetricDataResponseBody setSubMetrics(java.util.List<DescribeEndPointMetricDataResponseBodySubMetrics> subMetrics) {
        this.subMetrics = subMetrics;
        return this;
    }
    public java.util.List<DescribeEndPointMetricDataResponseBodySubMetrics> getSubMetrics() {
        return this.subMetrics;
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

    public static class DescribeEndPointMetricDataResponseBodySubMetricsNodes extends TeaModel {
        // 订阅端指标趋势图中x轴横坐标。
        @NameInMap("X")
        public String x;

        // 订阅端指标趋势图y轴纵坐标。
        @NameInMap("Y")
        public String y;

        // 拓展属性
        @NameInMap("Ext")
        public java.util.Map<String, ?> ext;

        public static DescribeEndPointMetricDataResponseBodySubMetricsNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeEndPointMetricDataResponseBodySubMetricsNodes self = new DescribeEndPointMetricDataResponseBodySubMetricsNodes();
            return TeaModel.build(map, self);
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

        public DescribeEndPointMetricDataResponseBodySubMetricsNodes setExt(java.util.Map<String, ?> ext) {
            this.ext = ext;
            return this;
        }
        public java.util.Map<String, ?> getExt() {
            return this.ext;
        }

    }

    public static class DescribeEndPointMetricDataResponseBodySubMetrics extends TeaModel {
        // 对应入参Metrics中的类型
        @NameInMap("Type")
        public String type;

        // 用户ID。
        @NameInMap("UserId")
        public String userId;

        // 订阅端指标趋势图坐标点列表。
        @NameInMap("Nodes")
        public java.util.List<DescribeEndPointMetricDataResponseBodySubMetricsNodes> nodes;

        public static DescribeEndPointMetricDataResponseBodySubMetrics build(java.util.Map<String, ?> map) throws Exception {
            DescribeEndPointMetricDataResponseBodySubMetrics self = new DescribeEndPointMetricDataResponseBodySubMetrics();
            return TeaModel.build(map, self);
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

        public DescribeEndPointMetricDataResponseBodySubMetrics setNodes(java.util.List<DescribeEndPointMetricDataResponseBodySubMetricsNodes> nodes) {
            this.nodes = nodes;
            return this;
        }
        public java.util.List<DescribeEndPointMetricDataResponseBodySubMetricsNodes> getNodes() {
            return this.nodes;
        }

    }

    public static class DescribeEndPointMetricDataResponseBodyPubMetricsNodes extends TeaModel {
        // 发布端指标趋势图中x轴横坐标。
        @NameInMap("X")
        public String x;

        // 发布端指标趋势图中y轴纵坐标。
        @NameInMap("Y")
        public String y;

        // 拓展属性
        @NameInMap("Ext")
        public java.util.Map<String, ?> ext;

        public static DescribeEndPointMetricDataResponseBodyPubMetricsNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeEndPointMetricDataResponseBodyPubMetricsNodes self = new DescribeEndPointMetricDataResponseBodyPubMetricsNodes();
            return TeaModel.build(map, self);
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

        public DescribeEndPointMetricDataResponseBodyPubMetricsNodes setExt(java.util.Map<String, ?> ext) {
            this.ext = ext;
            return this;
        }
        public java.util.Map<String, ?> getExt() {
            return this.ext;
        }

    }

    public static class DescribeEndPointMetricDataResponseBodyPubMetrics extends TeaModel {
        // 对应入参Metrics中的类型
        @NameInMap("Type")
        public String type;

        // 用户ID。
        @NameInMap("UserId")
        public String userId;

        // 坐标点列表
        @NameInMap("Nodes")
        public java.util.List<DescribeEndPointMetricDataResponseBodyPubMetricsNodes> nodes;

        public static DescribeEndPointMetricDataResponseBodyPubMetrics build(java.util.Map<String, ?> map) throws Exception {
            DescribeEndPointMetricDataResponseBodyPubMetrics self = new DescribeEndPointMetricDataResponseBodyPubMetrics();
            return TeaModel.build(map, self);
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

        public DescribeEndPointMetricDataResponseBodyPubMetrics setNodes(java.util.List<DescribeEndPointMetricDataResponseBodyPubMetricsNodes> nodes) {
            this.nodes = nodes;
            return this;
        }
        public java.util.List<DescribeEndPointMetricDataResponseBodyPubMetricsNodes> getNodes() {
            return this.nodes;
        }

    }

}
