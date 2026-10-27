// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class GetInstanceTrendingReportResponseBody extends TeaModel {
    /**
     * <p>The internal error code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The scenario ID.</p>
     */
    @NameInMap("Data")
    public java.util.List<GetInstanceTrendingReportResponseBodyData> data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Instance af81a389-91f0-4157-8d82-720edd02b66a
     *  does not exist.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The dynamic error parameters.</p>
     */
    @NameInMap("Params")
    public java.util.List<String> params;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>14C39896-AE6D-4643-9C9A-E0566B2C2DDD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetInstanceTrendingReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceTrendingReportResponseBody self = new GetInstanceTrendingReportResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceTrendingReportResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetInstanceTrendingReportResponseBody setData(java.util.List<GetInstanceTrendingReportResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetInstanceTrendingReportResponseBodyData> getData() {
        return this.data;
    }

    public GetInstanceTrendingReportResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetInstanceTrendingReportResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetInstanceTrendingReportResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public GetInstanceTrendingReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetInstanceTrendingReportResponseBodyData extends TeaModel {
        /**
         * <p>The number of answered sessions.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("CallsHandled")
        public Long callsHandled;

        /**
         * <p>The number of incoming sessions.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("CallsOffered")
        public Long callsOffered;

        /**
         * <p>The number of rejected sessions.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("CallsRejected")
        public Long callsRejected;

        /**
         * <p>The number of resolved sessions, based on the model evaluation results.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("CallsResolved")
        public Long callsResolved;

        /**
         * <p>The latest configured concurrency.</p>
         * 
         * <strong>example:</strong>
         * <p>13</p>
         */
        @NameInMap("ConfiguredConcurrency")
        public Long configuredConcurrency;

        /**
         * <p>The distribution of labels.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;label1&quot;:{ 
         *      &quot;label1_sub1&quot;:10,
         *      &quot;label1_sub2&quot;:2
         * }
         * }</p>
         */
        @NameInMap("LabelBreakdown")
        public String labelBreakdown;

        /**
         * <p>The maximum talk time, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("MaxTalkTime")
        public Long maxTalkTime;

        /**
         * <p>The distribution of rejection reasons.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;ConcurrentLimitExceeded&quot;:3
         * }</p>
         */
        @NameInMap("RejectionBreakdown")
        public String rejectionBreakdown;

        /**
         * <p>The distribution of hang-up reasons after a session is connected.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;SilenceTimeout&quot;:1,
         *   &quot;TurnsLimitExceeded&quot;:1,
         *    &quot;Exception&quot;:1,
         *    &quot;Transferred&quot;:1,
         *    &quot;Normal&quot;:1
         * }</p>
         */
        @NameInMap("ReleaseReasonBreakdown")
        public String releaseReasonBreakdown;

        /**
         * <p>The statistical time. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1774881208361</p>
         */
        @NameInMap("StatsTime")
        public Long statsTime;

        /**
         * <p>The distribution of dialog turns.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;1&quot;:2,
         *   &quot;10&quot;:3
         * }</p>
         */
        @NameInMap("TalkTurnsDistribution")
        public String talkTurnsDistribution;

        /**
         * <p>Reserved for future use.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TotalInputTokens")
        public Long totalInputTokens;

        /**
         * <p>Reserved for future use.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TotalOutputTokens")
        public Long totalOutputTokens;

        /**
         * <p>The total talk time, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalTalkTime")
        public Long totalTalkTime;

        /**
         * <p>Reserved for future use.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TotalTokens")
        public Long totalTokens;

        /**
         * <p>The maximum concurrency used.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("UsedConcurrency")
        public Long usedConcurrency;

        public static GetInstanceTrendingReportResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceTrendingReportResponseBodyData self = new GetInstanceTrendingReportResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetInstanceTrendingReportResponseBodyData setCallsHandled(Long callsHandled) {
            this.callsHandled = callsHandled;
            return this;
        }
        public Long getCallsHandled() {
            return this.callsHandled;
        }

        public GetInstanceTrendingReportResponseBodyData setCallsOffered(Long callsOffered) {
            this.callsOffered = callsOffered;
            return this;
        }
        public Long getCallsOffered() {
            return this.callsOffered;
        }

        public GetInstanceTrendingReportResponseBodyData setCallsRejected(Long callsRejected) {
            this.callsRejected = callsRejected;
            return this;
        }
        public Long getCallsRejected() {
            return this.callsRejected;
        }

        public GetInstanceTrendingReportResponseBodyData setCallsResolved(Long callsResolved) {
            this.callsResolved = callsResolved;
            return this;
        }
        public Long getCallsResolved() {
            return this.callsResolved;
        }

        public GetInstanceTrendingReportResponseBodyData setConfiguredConcurrency(Long configuredConcurrency) {
            this.configuredConcurrency = configuredConcurrency;
            return this;
        }
        public Long getConfiguredConcurrency() {
            return this.configuredConcurrency;
        }

        public GetInstanceTrendingReportResponseBodyData setLabelBreakdown(String labelBreakdown) {
            this.labelBreakdown = labelBreakdown;
            return this;
        }
        public String getLabelBreakdown() {
            return this.labelBreakdown;
        }

        public GetInstanceTrendingReportResponseBodyData setMaxTalkTime(Long maxTalkTime) {
            this.maxTalkTime = maxTalkTime;
            return this;
        }
        public Long getMaxTalkTime() {
            return this.maxTalkTime;
        }

        public GetInstanceTrendingReportResponseBodyData setRejectionBreakdown(String rejectionBreakdown) {
            this.rejectionBreakdown = rejectionBreakdown;
            return this;
        }
        public String getRejectionBreakdown() {
            return this.rejectionBreakdown;
        }

        public GetInstanceTrendingReportResponseBodyData setReleaseReasonBreakdown(String releaseReasonBreakdown) {
            this.releaseReasonBreakdown = releaseReasonBreakdown;
            return this;
        }
        public String getReleaseReasonBreakdown() {
            return this.releaseReasonBreakdown;
        }

        public GetInstanceTrendingReportResponseBodyData setStatsTime(Long statsTime) {
            this.statsTime = statsTime;
            return this;
        }
        public Long getStatsTime() {
            return this.statsTime;
        }

        public GetInstanceTrendingReportResponseBodyData setTalkTurnsDistribution(String talkTurnsDistribution) {
            this.talkTurnsDistribution = talkTurnsDistribution;
            return this;
        }
        public String getTalkTurnsDistribution() {
            return this.talkTurnsDistribution;
        }

        public GetInstanceTrendingReportResponseBodyData setTotalInputTokens(Long totalInputTokens) {
            this.totalInputTokens = totalInputTokens;
            return this;
        }
        public Long getTotalInputTokens() {
            return this.totalInputTokens;
        }

        public GetInstanceTrendingReportResponseBodyData setTotalOutputTokens(Long totalOutputTokens) {
            this.totalOutputTokens = totalOutputTokens;
            return this;
        }
        public Long getTotalOutputTokens() {
            return this.totalOutputTokens;
        }

        public GetInstanceTrendingReportResponseBodyData setTotalTalkTime(Long totalTalkTime) {
            this.totalTalkTime = totalTalkTime;
            return this;
        }
        public Long getTotalTalkTime() {
            return this.totalTalkTime;
        }

        public GetInstanceTrendingReportResponseBodyData setTotalTokens(Long totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Long getTotalTokens() {
            return this.totalTokens;
        }

        public GetInstanceTrendingReportResponseBodyData setUsedConcurrency(Long usedConcurrency) {
            this.usedConcurrency = usedConcurrency;
            return this;
        }
        public Long getUsedConcurrency() {
            return this.usedConcurrency;
        }

    }

}
