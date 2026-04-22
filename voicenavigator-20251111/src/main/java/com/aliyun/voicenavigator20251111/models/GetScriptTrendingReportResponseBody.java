// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class GetScriptTrendingReportResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetScriptTrendingReportResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>get upload tool url success</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Params")
    public java.util.List<String> params;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>9DB8BA95-4513-54B9-9C67-A28909CFB4AD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetScriptTrendingReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetScriptTrendingReportResponseBody self = new GetScriptTrendingReportResponseBody();
        return TeaModel.build(map, self);
    }

    public GetScriptTrendingReportResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetScriptTrendingReportResponseBody setData(java.util.List<GetScriptTrendingReportResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetScriptTrendingReportResponseBodyData> getData() {
        return this.data;
    }

    public GetScriptTrendingReportResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetScriptTrendingReportResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetScriptTrendingReportResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public GetScriptTrendingReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetScriptTrendingReportResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("CallsHandled")
        public Long callsHandled;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("CallsOffered")
        public Long callsOffered;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("CallsRejected")
        public Long callsRejected;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("CallsResolved")
        public Long callsResolved;

        /**
         * <strong>example:</strong>
         * <p>13</p>
         */
        @NameInMap("ConfiguredConcurrency")
        public Long configuredConcurrency;

        /**
         * <strong>example:</strong>
         * <p>{
         *   &quot;label1&quot;:{ 
         *      &quot;label1_sub1&quot;:10,
         *      &quot;label1_sub2&quot;:2
         * }
         * }</p>
         */
        @NameInMap("LabelBreakDown")
        public String labelBreakDown;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("MaxTalkTime")
        public Long maxTalkTime;

        /**
         * <strong>example:</strong>
         * <p>{
         *   &quot;ConcurrentLimitExceeded&quot;:3
         * }</p>
         */
        @NameInMap("RejectionBreakdown")
        public String rejectionBreakdown;

        /**
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
         * <strong>example:</strong>
         * <p>1774881208361</p>
         */
        @NameInMap("StatsTime")
        public Long statsTime;

        /**
         * <strong>example:</strong>
         * <p>{
         *   &quot;1&quot;:2,
         *   &quot;10&quot;:3
         * }</p>
         */
        @NameInMap("TalkTurnsDistribution")
        public String talkTurnsDistribution;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TotalInputTokens")
        public Long totalInputTokens;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TotalOutputTokens")
        public Long totalOutputTokens;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalTalkTime")
        public Long totalTalkTime;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TotalTokens")
        public Long totalTokens;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("UsedConcurrency")
        public Long usedConcurrency;

        public static GetScriptTrendingReportResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetScriptTrendingReportResponseBodyData self = new GetScriptTrendingReportResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetScriptTrendingReportResponseBodyData setCallsHandled(Long callsHandled) {
            this.callsHandled = callsHandled;
            return this;
        }
        public Long getCallsHandled() {
            return this.callsHandled;
        }

        public GetScriptTrendingReportResponseBodyData setCallsOffered(Long callsOffered) {
            this.callsOffered = callsOffered;
            return this;
        }
        public Long getCallsOffered() {
            return this.callsOffered;
        }

        public GetScriptTrendingReportResponseBodyData setCallsRejected(Long callsRejected) {
            this.callsRejected = callsRejected;
            return this;
        }
        public Long getCallsRejected() {
            return this.callsRejected;
        }

        public GetScriptTrendingReportResponseBodyData setCallsResolved(Long callsResolved) {
            this.callsResolved = callsResolved;
            return this;
        }
        public Long getCallsResolved() {
            return this.callsResolved;
        }

        public GetScriptTrendingReportResponseBodyData setConfiguredConcurrency(Long configuredConcurrency) {
            this.configuredConcurrency = configuredConcurrency;
            return this;
        }
        public Long getConfiguredConcurrency() {
            return this.configuredConcurrency;
        }

        public GetScriptTrendingReportResponseBodyData setLabelBreakDown(String labelBreakDown) {
            this.labelBreakDown = labelBreakDown;
            return this;
        }
        public String getLabelBreakDown() {
            return this.labelBreakDown;
        }

        public GetScriptTrendingReportResponseBodyData setMaxTalkTime(Long maxTalkTime) {
            this.maxTalkTime = maxTalkTime;
            return this;
        }
        public Long getMaxTalkTime() {
            return this.maxTalkTime;
        }

        public GetScriptTrendingReportResponseBodyData setRejectionBreakdown(String rejectionBreakdown) {
            this.rejectionBreakdown = rejectionBreakdown;
            return this;
        }
        public String getRejectionBreakdown() {
            return this.rejectionBreakdown;
        }

        public GetScriptTrendingReportResponseBodyData setReleaseReasonBreakdown(String releaseReasonBreakdown) {
            this.releaseReasonBreakdown = releaseReasonBreakdown;
            return this;
        }
        public String getReleaseReasonBreakdown() {
            return this.releaseReasonBreakdown;
        }

        public GetScriptTrendingReportResponseBodyData setStatsTime(Long statsTime) {
            this.statsTime = statsTime;
            return this;
        }
        public Long getStatsTime() {
            return this.statsTime;
        }

        public GetScriptTrendingReportResponseBodyData setTalkTurnsDistribution(String talkTurnsDistribution) {
            this.talkTurnsDistribution = talkTurnsDistribution;
            return this;
        }
        public String getTalkTurnsDistribution() {
            return this.talkTurnsDistribution;
        }

        public GetScriptTrendingReportResponseBodyData setTotalInputTokens(Long totalInputTokens) {
            this.totalInputTokens = totalInputTokens;
            return this;
        }
        public Long getTotalInputTokens() {
            return this.totalInputTokens;
        }

        public GetScriptTrendingReportResponseBodyData setTotalOutputTokens(Long totalOutputTokens) {
            this.totalOutputTokens = totalOutputTokens;
            return this;
        }
        public Long getTotalOutputTokens() {
            return this.totalOutputTokens;
        }

        public GetScriptTrendingReportResponseBodyData setTotalTalkTime(Long totalTalkTime) {
            this.totalTalkTime = totalTalkTime;
            return this;
        }
        public Long getTotalTalkTime() {
            return this.totalTalkTime;
        }

        public GetScriptTrendingReportResponseBodyData setTotalTokens(Long totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Long getTotalTokens() {
            return this.totalTokens;
        }

        public GetScriptTrendingReportResponseBodyData setUsedConcurrency(Long usedConcurrency) {
            this.usedConcurrency = usedConcurrency;
            return this;
        }
        public Long getUsedConcurrency() {
            return this.usedConcurrency;
        }

    }

}
