// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeUserEventTrendResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F51E6DD6-B2D2-57C9-90F1-FAFD0A19DE00</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The trends of attacks.</p>
     */
    @NameInMap("Trend")
    public java.util.List<DescribeUserEventTrendResponseBodyTrend> trend;

    public static DescribeUserEventTrendResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserEventTrendResponseBody self = new DescribeUserEventTrendResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUserEventTrendResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUserEventTrendResponseBody setTrend(java.util.List<DescribeUserEventTrendResponseBodyTrend> trend) {
        this.trend = trend;
        return this;
    }
    public java.util.List<DescribeUserEventTrendResponseBodyTrend> getTrend() {
        return this.trend;
    }

    public static class DescribeUserEventTrendResponseBodyTrend extends TeaModel {
        /**
         * <p>The number of high-risk events.</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        @NameInMap("EventHigh")
        public Long eventHigh;

        /**
         * <p>The number of low-risk events.</p>
         * 
         * <strong>example:</strong>
         * <p>23</p>
         */
        @NameInMap("EventLow")
        public Long eventLow;

        /**
         * <p>The number of medium-risk events.</p>
         * 
         * <strong>example:</strong>
         * <p>17</p>
         */
        @NameInMap("EventMedium")
        public Long eventMedium;

        /**
         * <p>The time at which the API was called. The value is a UNIX timestamp displayed in UTC. Unit: seconds.</p>
         * <blockquote>
         * <p>Notice: The parameter has been deprecated, it is recommended to use the Timestamp parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1723435200</p>
         */
        @NameInMap("TimeStamp")
        public Long timeStamp;

        /**
         * <p>The time at which the API was called. The value is a UNIX timestamp displayed in UTC. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1723435200</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        public static DescribeUserEventTrendResponseBodyTrend build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserEventTrendResponseBodyTrend self = new DescribeUserEventTrendResponseBodyTrend();
            return TeaModel.build(map, self);
        }

        public DescribeUserEventTrendResponseBodyTrend setEventHigh(Long eventHigh) {
            this.eventHigh = eventHigh;
            return this;
        }
        public Long getEventHigh() {
            return this.eventHigh;
        }

        public DescribeUserEventTrendResponseBodyTrend setEventLow(Long eventLow) {
            this.eventLow = eventLow;
            return this;
        }
        public Long getEventLow() {
            return this.eventLow;
        }

        public DescribeUserEventTrendResponseBodyTrend setEventMedium(Long eventMedium) {
            this.eventMedium = eventMedium;
            return this;
        }
        public Long getEventMedium() {
            return this.eventMedium;
        }

        public DescribeUserEventTrendResponseBodyTrend setTimeStamp(Long timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public Long getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeUserEventTrendResponseBodyTrend setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

}
