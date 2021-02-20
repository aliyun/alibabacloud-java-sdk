// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeRtcChannelMetricsResponseBody extends TeaModel {
    @NameInMap("Metrics")
    public java.util.List<DescribeRtcChannelMetricsResponseBodyMetrics> metrics;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeRtcChannelMetricsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRtcChannelMetricsResponseBody self = new DescribeRtcChannelMetricsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRtcChannelMetricsResponseBody setMetrics(java.util.List<DescribeRtcChannelMetricsResponseBodyMetrics> metrics) {
        this.metrics = metrics;
        return this;
    }
    public java.util.List<DescribeRtcChannelMetricsResponseBodyMetrics> getMetrics() {
        return this.metrics;
    }

    public DescribeRtcChannelMetricsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeRtcChannelMetricsResponseBodyMetrics extends TeaModel {
        @NameInMap("Mid")
        public String mid;

        @NameInMap("KVs")
        public java.util.List<String> KVs;

        @NameInMap("Uid")
        public String uid;

        public static DescribeRtcChannelMetricsResponseBodyMetrics build(java.util.Map<String, ?> map) throws Exception {
            DescribeRtcChannelMetricsResponseBodyMetrics self = new DescribeRtcChannelMetricsResponseBodyMetrics();
            return TeaModel.build(map, self);
        }

        public DescribeRtcChannelMetricsResponseBodyMetrics setMid(String mid) {
            this.mid = mid;
            return this;
        }
        public String getMid() {
            return this.mid;
        }

        public DescribeRtcChannelMetricsResponseBodyMetrics setKVs(java.util.List<String> KVs) {
            this.KVs = KVs;
            return this;
        }
        public java.util.List<String> getKVs() {
            return this.KVs;
        }

        public DescribeRtcChannelMetricsResponseBodyMetrics setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

}
