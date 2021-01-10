// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DescribeTopicMetricsResponseBody extends TeaModel {
    @NameInMap("Metrics")
    public java.util.List<DescribeTopicMetricsResponseBodyMetrics> metrics;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("Topic")
    public String topic;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("Interval")
    public Long interval;

    public static DescribeTopicMetricsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTopicMetricsResponseBody self = new DescribeTopicMetricsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTopicMetricsResponseBody setMetrics(java.util.List<DescribeTopicMetricsResponseBodyMetrics> metrics) {
        this.metrics = metrics;
        return this;
    }
    public java.util.List<DescribeTopicMetricsResponseBodyMetrics> getMetrics() {
        return this.metrics;
    }

    public DescribeTopicMetricsResponseBody setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeTopicMetricsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTopicMetricsResponseBody setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeTopicMetricsResponseBody setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public DescribeTopicMetricsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public DescribeTopicMetricsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DescribeTopicMetricsResponseBody setInterval(Long interval) {
        this.interval = interval;
        return this;
    }
    public Long getInterval() {
        return this.interval;
    }

    public static class DescribeTopicMetricsResponseBodyMetrics extends TeaModel {
        @NameInMap("SendTraffic")
        public Long sendTraffic;

        @NameInMap("RecvCnt")
        public Long recvCnt;

        @NameInMap("SendCnt")
        public Long sendCnt;

        @NameInMap("Timestamp")
        public Long timestamp;

        @NameInMap("RecvTraffic")
        public Long recvTraffic;

        public static DescribeTopicMetricsResponseBodyMetrics build(java.util.Map<String, ?> map) throws Exception {
            DescribeTopicMetricsResponseBodyMetrics self = new DescribeTopicMetricsResponseBodyMetrics();
            return TeaModel.build(map, self);
        }

        public DescribeTopicMetricsResponseBodyMetrics setSendTraffic(Long sendTraffic) {
            this.sendTraffic = sendTraffic;
            return this;
        }
        public Long getSendTraffic() {
            return this.sendTraffic;
        }

        public DescribeTopicMetricsResponseBodyMetrics setRecvCnt(Long recvCnt) {
            this.recvCnt = recvCnt;
            return this;
        }
        public Long getRecvCnt() {
            return this.recvCnt;
        }

        public DescribeTopicMetricsResponseBodyMetrics setSendCnt(Long sendCnt) {
            this.sendCnt = sendCnt;
            return this;
        }
        public Long getSendCnt() {
            return this.sendCnt;
        }

        public DescribeTopicMetricsResponseBodyMetrics setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public DescribeTopicMetricsResponseBodyMetrics setRecvTraffic(Long recvTraffic) {
            this.recvTraffic = recvTraffic;
            return this;
        }
        public Long getRecvTraffic() {
            return this.recvTraffic;
        }

    }

}
