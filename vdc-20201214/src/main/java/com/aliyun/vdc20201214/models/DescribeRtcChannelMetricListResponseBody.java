// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeRtcChannelMetricListResponseBody extends TeaModel {
    // 指标列表
    @NameInMap("Metrics")
    public java.util.List<DescribeRtcChannelMetricListResponseBodyMetrics> metrics;

    // 请求Id
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeRtcChannelMetricListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRtcChannelMetricListResponseBody self = new DescribeRtcChannelMetricListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRtcChannelMetricListResponseBody setMetrics(java.util.List<DescribeRtcChannelMetricListResponseBodyMetrics> metrics) {
        this.metrics = metrics;
        return this;
    }
    public java.util.List<DescribeRtcChannelMetricListResponseBodyMetrics> getMetrics() {
        return this.metrics;
    }

    public DescribeRtcChannelMetricListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeRtcChannelMetricListResponseBodyMetrics extends TeaModel {
        // 指标键值对,指标发生时间:指标值
        @NameInMap("KVs")
        public java.util.Map<String, ?> KVs;

        // 指标ID
        @NameInMap("Mid")
        public Integer mid;

        // 用户ID
        @NameInMap("Uid")
        public String uid;

        public static DescribeRtcChannelMetricListResponseBodyMetrics build(java.util.Map<String, ?> map) throws Exception {
            DescribeRtcChannelMetricListResponseBodyMetrics self = new DescribeRtcChannelMetricListResponseBodyMetrics();
            return TeaModel.build(map, self);
        }

        public DescribeRtcChannelMetricListResponseBodyMetrics setKVs(java.util.Map<String, ?> KVs) {
            this.KVs = KVs;
            return this;
        }
        public java.util.Map<String, ?> getKVs() {
            return this.KVs;
        }

        public DescribeRtcChannelMetricListResponseBodyMetrics setMid(Integer mid) {
            this.mid = mid;
            return this;
        }
        public Integer getMid() {
            return this.mid;
        }

        public DescribeRtcChannelMetricListResponseBodyMetrics setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

}
