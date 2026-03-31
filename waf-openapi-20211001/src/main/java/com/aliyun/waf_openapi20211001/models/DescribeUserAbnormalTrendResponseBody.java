// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeUserAbnormalTrendResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D7861F61-5B61-46CE-A47C-6B19160D5EB0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The trends of risks.</p>
     */
    @NameInMap("Trend")
    public java.util.List<DescribeUserAbnormalTrendResponseBodyTrend> trend;

    public static DescribeUserAbnormalTrendResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserAbnormalTrendResponseBody self = new DescribeUserAbnormalTrendResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUserAbnormalTrendResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUserAbnormalTrendResponseBody setTrend(java.util.List<DescribeUserAbnormalTrendResponseBodyTrend> trend) {
        this.trend = trend;
        return this;
    }
    public java.util.List<DescribeUserAbnormalTrendResponseBodyTrend> getTrend() {
        return this.trend;
    }

    public static class DescribeUserAbnormalTrendResponseBodyTrend extends TeaModel {
        /**
         * <p>The number of high risks.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("AbnormalHigh")
        public Long abnormalHigh;

        /**
         * <p>The number of low risks.</p>
         * 
         * <strong>example:</strong>
         * <p>23</p>
         */
        @NameInMap("AbnormalLow")
        public Long abnormalLow;

        /**
         * <p>The number of medium risks.</p>
         * 
         * <strong>example:</strong>
         * <p>14</p>
         */
        @NameInMap("AbnormalMedium")
        public Long abnormalMedium;

        /**
         * <p>The time at which the API was called. The value is a UNIX timestamp displayed in UTC. Unit: seconds.</p>
         * <blockquote>
         * <p>Notice: The parameter has been deprecated, it is recommended to use the Timestamp parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1722268800</p>
         */
        @NameInMap("TimeStamp")
        @Deprecated
        public Long timeStamp;

        /**
         * <p>The time at which the API was called. The value is a UNIX timestamp displayed in UTC. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1722268800</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        public static DescribeUserAbnormalTrendResponseBodyTrend build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserAbnormalTrendResponseBodyTrend self = new DescribeUserAbnormalTrendResponseBodyTrend();
            return TeaModel.build(map, self);
        }

        public DescribeUserAbnormalTrendResponseBodyTrend setAbnormalHigh(Long abnormalHigh) {
            this.abnormalHigh = abnormalHigh;
            return this;
        }
        public Long getAbnormalHigh() {
            return this.abnormalHigh;
        }

        public DescribeUserAbnormalTrendResponseBodyTrend setAbnormalLow(Long abnormalLow) {
            this.abnormalLow = abnormalLow;
            return this;
        }
        public Long getAbnormalLow() {
            return this.abnormalLow;
        }

        public DescribeUserAbnormalTrendResponseBodyTrend setAbnormalMedium(Long abnormalMedium) {
            this.abnormalMedium = abnormalMedium;
            return this;
        }
        public Long getAbnormalMedium() {
            return this.abnormalMedium;
        }

        @Deprecated
        public DescribeUserAbnormalTrendResponseBodyTrend setTimeStamp(Long timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public Long getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeUserAbnormalTrendResponseBodyTrend setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

}
