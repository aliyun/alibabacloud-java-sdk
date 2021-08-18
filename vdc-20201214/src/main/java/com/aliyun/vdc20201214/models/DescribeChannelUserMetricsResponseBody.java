// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeChannelUserMetricsResponseBody extends TeaModel {
    // 指标数据列表。
    @NameInMap("MetricDatas")
    public java.util.List<DescribeChannelUserMetricsResponseBodyMetricDatas> metricDatas;

    // 总览数据
    @NameInMap("OverallData")
    public DescribeChannelUserMetricsResponseBodyOverallData overallData;

    // 请求ID。
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeChannelUserMetricsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeChannelUserMetricsResponseBody self = new DescribeChannelUserMetricsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeChannelUserMetricsResponseBody setMetricDatas(java.util.List<DescribeChannelUserMetricsResponseBodyMetricDatas> metricDatas) {
        this.metricDatas = metricDatas;
        return this;
    }
    public java.util.List<DescribeChannelUserMetricsResponseBodyMetricDatas> getMetricDatas() {
        return this.metricDatas;
    }

    public DescribeChannelUserMetricsResponseBody setOverallData(DescribeChannelUserMetricsResponseBodyOverallData overallData) {
        this.overallData = overallData;
        return this;
    }
    public DescribeChannelUserMetricsResponseBodyOverallData getOverallData() {
        return this.overallData;
    }

    public DescribeChannelUserMetricsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeChannelUserMetricsResponseBodyMetricDatasNodes extends TeaModel {
        // 指标趋势图中x轴横坐标。
        @NameInMap("X")
        public String x;

        // 指标趋势图中y轴纵坐标。
        @NameInMap("Y")
        public String y;

        // 拓展属性
        @NameInMap("Ext")
        public java.util.Map<String, ?> ext;

        public static DescribeChannelUserMetricsResponseBodyMetricDatasNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeChannelUserMetricsResponseBodyMetricDatasNodes self = new DescribeChannelUserMetricsResponseBodyMetricDatasNodes();
            return TeaModel.build(map, self);
        }

        public DescribeChannelUserMetricsResponseBodyMetricDatasNodes setX(String x) {
            this.x = x;
            return this;
        }
        public String getX() {
            return this.x;
        }

        public DescribeChannelUserMetricsResponseBodyMetricDatasNodes setY(String y) {
            this.y = y;
            return this;
        }
        public String getY() {
            return this.y;
        }

        public DescribeChannelUserMetricsResponseBodyMetricDatasNodes setExt(java.util.Map<String, ?> ext) {
            this.ext = ext;
            return this;
        }
        public java.util.Map<String, ?> getExt() {
            return this.ext;
        }

    }

    public static class DescribeChannelUserMetricsResponseBodyMetricDatas extends TeaModel {
        // 指标类型，取值：ALL_NUM：累计用户数量。PUB_NUM：累计发布用户数量。SUB_NUM：累计订阅用户数量。JOIN_FAIL_NUM：累计加入频道异常用户数量。BAD_EXP_NUM：累计通信体验异常用户。
        @NameInMap("Type")
        public String type;

        // 指标趋势图坐标点列表。
        @NameInMap("Nodes")
        public java.util.List<DescribeChannelUserMetricsResponseBodyMetricDatasNodes> nodes;

        public static DescribeChannelUserMetricsResponseBodyMetricDatas build(java.util.Map<String, ?> map) throws Exception {
            DescribeChannelUserMetricsResponseBodyMetricDatas self = new DescribeChannelUserMetricsResponseBodyMetricDatas();
            return TeaModel.build(map, self);
        }

        public DescribeChannelUserMetricsResponseBodyMetricDatas setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeChannelUserMetricsResponseBodyMetricDatas setNodes(java.util.List<DescribeChannelUserMetricsResponseBodyMetricDatasNodes> nodes) {
            this.nodes = nodes;
            return this;
        }
        public java.util.List<DescribeChannelUserMetricsResponseBodyMetricDatasNodes> getNodes() {
            return this.nodes;
        }

    }

    public static class DescribeChannelUserMetricsResponseBodyOverallData extends TeaModel {
        // 累计用户数量。
        @NameInMap("TotalUserNum")
        public Long totalUserNum;

        // 累计发布端用户数量。
        @NameInMap("TotalPubUserNum")
        public Long totalPubUserNum;

        // 累计订阅端用户数量。
        @NameInMap("TotalSubUserNum")
        public Long totalSubUserNum;

        // 累计加入频道异常用户数量。
        @NameInMap("TotalJoinFailNum")
        public Long totalJoinFailNum;

        // 累计通信体验异常用户数量。
        @NameInMap("TotalBadExpNum")
        public Long totalBadExpNum;

        public static DescribeChannelUserMetricsResponseBodyOverallData build(java.util.Map<String, ?> map) throws Exception {
            DescribeChannelUserMetricsResponseBodyOverallData self = new DescribeChannelUserMetricsResponseBodyOverallData();
            return TeaModel.build(map, self);
        }

        public DescribeChannelUserMetricsResponseBodyOverallData setTotalUserNum(Long totalUserNum) {
            this.totalUserNum = totalUserNum;
            return this;
        }
        public Long getTotalUserNum() {
            return this.totalUserNum;
        }

        public DescribeChannelUserMetricsResponseBodyOverallData setTotalPubUserNum(Long totalPubUserNum) {
            this.totalPubUserNum = totalPubUserNum;
            return this;
        }
        public Long getTotalPubUserNum() {
            return this.totalPubUserNum;
        }

        public DescribeChannelUserMetricsResponseBodyOverallData setTotalSubUserNum(Long totalSubUserNum) {
            this.totalSubUserNum = totalSubUserNum;
            return this;
        }
        public Long getTotalSubUserNum() {
            return this.totalSubUserNum;
        }

        public DescribeChannelUserMetricsResponseBodyOverallData setTotalJoinFailNum(Long totalJoinFailNum) {
            this.totalJoinFailNum = totalJoinFailNum;
            return this;
        }
        public Long getTotalJoinFailNum() {
            return this.totalJoinFailNum;
        }

        public DescribeChannelUserMetricsResponseBodyOverallData setTotalBadExpNum(Long totalBadExpNum) {
            this.totalBadExpNum = totalBadExpNum;
            return this;
        }
        public Long getTotalBadExpNum() {
            return this.totalBadExpNum;
        }

    }

}
