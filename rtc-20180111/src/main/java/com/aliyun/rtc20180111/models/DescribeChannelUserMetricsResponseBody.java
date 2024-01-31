// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeChannelUserMetricsResponseBody extends TeaModel {
    @NameInMap("MetricDatas")
    public java.util.List<DescribeChannelUserMetricsResponseBodyMetricDatas> metricDatas;

    @NameInMap("OverallData")
    public DescribeChannelUserMetricsResponseBodyOverallData overallData;

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
        @NameInMap("Ext")
        public java.util.Map<String, ?> ext;

        @NameInMap("X")
        public String x;

        @NameInMap("Y")
        public String y;

        public static DescribeChannelUserMetricsResponseBodyMetricDatasNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeChannelUserMetricsResponseBodyMetricDatasNodes self = new DescribeChannelUserMetricsResponseBodyMetricDatasNodes();
            return TeaModel.build(map, self);
        }

        public DescribeChannelUserMetricsResponseBodyMetricDatasNodes setExt(java.util.Map<String, ?> ext) {
            this.ext = ext;
            return this;
        }
        public java.util.Map<String, ?> getExt() {
            return this.ext;
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

    }

    public static class DescribeChannelUserMetricsResponseBodyMetricDatas extends TeaModel {
        @NameInMap("Nodes")
        public java.util.List<DescribeChannelUserMetricsResponseBodyMetricDatasNodes> nodes;

        @NameInMap("Type")
        public String type;

        public static DescribeChannelUserMetricsResponseBodyMetricDatas build(java.util.Map<String, ?> map) throws Exception {
            DescribeChannelUserMetricsResponseBodyMetricDatas self = new DescribeChannelUserMetricsResponseBodyMetricDatas();
            return TeaModel.build(map, self);
        }

        public DescribeChannelUserMetricsResponseBodyMetricDatas setNodes(java.util.List<DescribeChannelUserMetricsResponseBodyMetricDatasNodes> nodes) {
            this.nodes = nodes;
            return this;
        }
        public java.util.List<DescribeChannelUserMetricsResponseBodyMetricDatasNodes> getNodes() {
            return this.nodes;
        }

        public DescribeChannelUserMetricsResponseBodyMetricDatas setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeChannelUserMetricsResponseBodyOverallData extends TeaModel {
        @NameInMap("TotalBadExpNum")
        public Long totalBadExpNum;

        @NameInMap("TotalJoinFailNum")
        public Long totalJoinFailNum;

        @NameInMap("TotalPubUserNum")
        public Long totalPubUserNum;

        @NameInMap("TotalSubUserNum")
        public Long totalSubUserNum;

        @NameInMap("TotalUserNum")
        public Long totalUserNum;

        public static DescribeChannelUserMetricsResponseBodyOverallData build(java.util.Map<String, ?> map) throws Exception {
            DescribeChannelUserMetricsResponseBodyOverallData self = new DescribeChannelUserMetricsResponseBodyOverallData();
            return TeaModel.build(map, self);
        }

        public DescribeChannelUserMetricsResponseBodyOverallData setTotalBadExpNum(Long totalBadExpNum) {
            this.totalBadExpNum = totalBadExpNum;
            return this;
        }
        public Long getTotalBadExpNum() {
            return this.totalBadExpNum;
        }

        public DescribeChannelUserMetricsResponseBodyOverallData setTotalJoinFailNum(Long totalJoinFailNum) {
            this.totalJoinFailNum = totalJoinFailNum;
            return this;
        }
        public Long getTotalJoinFailNum() {
            return this.totalJoinFailNum;
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

        public DescribeChannelUserMetricsResponseBodyOverallData setTotalUserNum(Long totalUserNum) {
            this.totalUserNum = totalUserNum;
            return this;
        }
        public Long getTotalUserNum() {
            return this.totalUserNum;
        }

    }

}
