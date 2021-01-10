// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DescribeBacklogMetricsResponseBody extends TeaModel {
    @NameInMap("Metrics")
    public java.util.List<DescribeBacklogMetricsResponseBodyMetrics> metrics;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("Interval")
    public Long interval;

    public static DescribeBacklogMetricsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBacklogMetricsResponseBody self = new DescribeBacklogMetricsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBacklogMetricsResponseBody setMetrics(java.util.List<DescribeBacklogMetricsResponseBodyMetrics> metrics) {
        this.metrics = metrics;
        return this;
    }
    public java.util.List<DescribeBacklogMetricsResponseBodyMetrics> getMetrics() {
        return this.metrics;
    }

    public DescribeBacklogMetricsResponseBody setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeBacklogMetricsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBacklogMetricsResponseBody setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeBacklogMetricsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public DescribeBacklogMetricsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DescribeBacklogMetricsResponseBody setInterval(Long interval) {
        this.interval = interval;
        return this;
    }
    public Long getInterval() {
        return this.interval;
    }

    public static class DescribeBacklogMetricsResponseBodyMetrics extends TeaModel {
        @NameInMap("BacklogCnt")
        public Long backlogCnt;

        @NameInMap("Timestamp")
        public Long timestamp;

        public static DescribeBacklogMetricsResponseBodyMetrics build(java.util.Map<String, ?> map) throws Exception {
            DescribeBacklogMetricsResponseBodyMetrics self = new DescribeBacklogMetricsResponseBodyMetrics();
            return TeaModel.build(map, self);
        }

        public DescribeBacklogMetricsResponseBodyMetrics setBacklogCnt(Long backlogCnt) {
            this.backlogCnt = backlogCnt;
            return this;
        }
        public Long getBacklogCnt() {
            return this.backlogCnt;
        }

        public DescribeBacklogMetricsResponseBodyMetrics setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

}
