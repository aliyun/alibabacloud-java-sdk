// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeAiEngineEventTrendsResponseBody extends TeaModel {
    /**
     * <p>The aggregation interval, which is automatically selected based on the query time range. Valid values:</p>
     * <ul>
     * <li><strong>1m</strong>: 1 minute</li>
     * <li><strong>5m</strong>: 5 minutes</li>
     * <li><strong>15m</strong>: 15 minutes</li>
     * <li><strong>1h</strong>: 1 hour</li>
     * <li><strong>1d</strong>: 1 day</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1m</p>
     */
    @NameInMap("AggregateInterval")
    public String aggregateInterval;

    /**
     * <p>The time series data of events aggregated by first discovery time, sorted in ascending order of time.</p>
     */
    @NameInMap("Points")
    public java.util.List<DescribeAiEngineEventTrendsResponseBodyPoints> points;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>01A****-1219-019A-8B44-2557C*****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAiEngineEventTrendsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAiEngineEventTrendsResponseBody self = new DescribeAiEngineEventTrendsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAiEngineEventTrendsResponseBody setAggregateInterval(String aggregateInterval) {
        this.aggregateInterval = aggregateInterval;
        return this;
    }
    public String getAggregateInterval() {
        return this.aggregateInterval;
    }

    public DescribeAiEngineEventTrendsResponseBody setPoints(java.util.List<DescribeAiEngineEventTrendsResponseBodyPoints> points) {
        this.points = points;
        return this;
    }
    public java.util.List<DescribeAiEngineEventTrendsResponseBodyPoints> getPoints() {
        return this.points;
    }

    public DescribeAiEngineEventTrendsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAiEngineEventTrendsResponseBodyPointsRiskCounts extends TeaModel {
        /**
         * <p>The number of critical events.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Critical")
        public Long critical;

        /**
         * <p>The number of high-risk events.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("High")
        public Long high;

        /**
         * <p>The number of low-risk events.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Low")
        public Long low;

        /**
         * <p>The number of medium-risk events.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Medium")
        public Long medium;

        public static DescribeAiEngineEventTrendsResponseBodyPointsRiskCounts build(java.util.Map<String, ?> map) throws Exception {
            DescribeAiEngineEventTrendsResponseBodyPointsRiskCounts self = new DescribeAiEngineEventTrendsResponseBodyPointsRiskCounts();
            return TeaModel.build(map, self);
        }

        public DescribeAiEngineEventTrendsResponseBodyPointsRiskCounts setCritical(Long critical) {
            this.critical = critical;
            return this;
        }
        public Long getCritical() {
            return this.critical;
        }

        public DescribeAiEngineEventTrendsResponseBodyPointsRiskCounts setHigh(Long high) {
            this.high = high;
            return this;
        }
        public Long getHigh() {
            return this.high;
        }

        public DescribeAiEngineEventTrendsResponseBodyPointsRiskCounts setLow(Long low) {
            this.low = low;
            return this;
        }
        public Long getLow() {
            return this.low;
        }

        public DescribeAiEngineEventTrendsResponseBodyPointsRiskCounts setMedium(Long medium) {
            this.medium = medium;
            return this;
        }
        public Long getMedium() {
            return this.medium;
        }

    }

    public static class DescribeAiEngineEventTrendsResponseBodyPoints extends TeaModel {
        /**
         * <p>The number of events first discovered within the time period.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("EventCount")
        public Long eventCount;

        /**
         * <p>The number of events within the time period, aggregated by risk level.</p>
         */
        @NameInMap("RiskCounts")
        public DescribeAiEngineEventTrendsResponseBodyPointsRiskCounts riskCounts;

        /**
         * <p>The start time of the statistical period in the UNIX timestamp format. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1792973400000</p>
         */
        @NameInMap("Time")
        public Long time;

        public static DescribeAiEngineEventTrendsResponseBodyPoints build(java.util.Map<String, ?> map) throws Exception {
            DescribeAiEngineEventTrendsResponseBodyPoints self = new DescribeAiEngineEventTrendsResponseBodyPoints();
            return TeaModel.build(map, self);
        }

        public DescribeAiEngineEventTrendsResponseBodyPoints setEventCount(Long eventCount) {
            this.eventCount = eventCount;
            return this;
        }
        public Long getEventCount() {
            return this.eventCount;
        }

        public DescribeAiEngineEventTrendsResponseBodyPoints setRiskCounts(DescribeAiEngineEventTrendsResponseBodyPointsRiskCounts riskCounts) {
            this.riskCounts = riskCounts;
            return this;
        }
        public DescribeAiEngineEventTrendsResponseBodyPointsRiskCounts getRiskCounts() {
            return this.riskCounts;
        }

        public DescribeAiEngineEventTrendsResponseBodyPoints setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

    }

}
