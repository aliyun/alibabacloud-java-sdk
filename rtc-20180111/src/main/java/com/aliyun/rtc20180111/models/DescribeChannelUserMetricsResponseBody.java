// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeChannelUserMetricsResponseBody extends TeaModel {
    /**
     * <p>The metric data list.</p>
     */
    @NameInMap("MetricDatas")
    public java.util.List<DescribeChannelUserMetricsResponseBodyMetricDatas> metricDatas;

    /**
     * <p>The overview data.</p>
     */
    @NameInMap("OverallData")
    public DescribeChannelUserMetricsResponseBodyOverallData overallData;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>231470C1-ACFB-4C9F-844F-4CFE1E3804C5</p>
     */
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
        /**
         * <p>The extended properties.</p>
         */
        @NameInMap("Ext")
        public java.util.Map<String, ?> ext;

        /**
         * <p>The x-axis coordinate in the metric trends chart.</p>
         * 
         * <strong>example:</strong>
         * <p>1612418625</p>
         */
        @NameInMap("X")
        public String x;

        /**
         * <p>The y-axis coordinate in the metric trends chart.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
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
        /**
         * <p>The list of coordinate points in the metric trends chart.</p>
         */
        @NameInMap("Nodes")
        public java.util.List<DescribeChannelUserMetricsResponseBodyMetricDatasNodes> nodes;

        /**
         * <p>The metric type. Valid values:</p>
         * <ul>
         * <li><strong>ALL_NUM</strong>: the number of users per unit of time.</li>
         * <li><strong>PUB_NUM</strong>: the number of publishing users per unit of time.</li>
         * <li><strong>SUB_NUM</strong>: the number of subscribing users per unit of time.</li>
         * <li><strong>JOIN_FAIL_NUM</strong>: the number of users who failed to join the channel per unit of time.</li>
         * <li><strong>BAD_EXP_NUM</strong>: the number of users with abnormal communication experience per unit of time.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ALL_NUM</p>
         */
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
        /**
         * <p>The total number of users with abnormal communication experience.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TotalBadExpNum")
        public Long totalBadExpNum;

        /**
         * <p>The total number of users who failed to join the channel.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TotalJoinFailNum")
        public Long totalJoinFailNum;

        /**
         * <p>The total number of publishing users.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalPubUserNum")
        public Long totalPubUserNum;

        /**
         * <p>The total number of subscribing users.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("TotalSubUserNum")
        public Long totalSubUserNum;

        /**
         * <p>The total number of users.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
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
