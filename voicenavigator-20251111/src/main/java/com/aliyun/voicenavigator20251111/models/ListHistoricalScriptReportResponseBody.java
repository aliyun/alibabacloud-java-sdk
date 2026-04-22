// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class ListHistoricalScriptReportResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListHistoricalScriptReportResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Params")
    public java.util.List<String> params;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>9ab43460-c0b9-40e2-8447-48d82c97fc67</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListHistoricalScriptReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHistoricalScriptReportResponseBody self = new ListHistoricalScriptReportResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHistoricalScriptReportResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListHistoricalScriptReportResponseBody setData(ListHistoricalScriptReportResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListHistoricalScriptReportResponseBodyData getData() {
        return this.data;
    }

    public ListHistoricalScriptReportResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListHistoricalScriptReportResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListHistoricalScriptReportResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public ListHistoricalScriptReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListHistoricalScriptReportResponseBodyDataList extends TeaModel {
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
         * <p>4</p>
         */
        @NameInMap("CallsResolved")
        public Long callsResolved;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ConfiguredConcurrency")
        public Long configuredConcurrency;

        /**
         * <strong>example:</strong>
         * <p>{
         *   &quot;1&quot;:2,
         *   &quot;10&quot;:3
         * }</p>
         */
        @NameInMap("LabelDistribution")
        public String labelDistribution;

        /**
         * <strong>example:</strong>
         * <p>30</p>
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
         * <p>891264b9-5883-4068-94a6-241ceb8d51e4</p>
         */
        @NameInMap("ScriptId")
        public String scriptId;

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
         * <p>2</p>
         */
        @NameInMap("UsedConcurrency")
        public Long usedConcurrency;

        public static ListHistoricalScriptReportResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListHistoricalScriptReportResponseBodyDataList self = new ListHistoricalScriptReportResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListHistoricalScriptReportResponseBodyDataList setCallsHandled(Long callsHandled) {
            this.callsHandled = callsHandled;
            return this;
        }
        public Long getCallsHandled() {
            return this.callsHandled;
        }

        public ListHistoricalScriptReportResponseBodyDataList setCallsOffered(Long callsOffered) {
            this.callsOffered = callsOffered;
            return this;
        }
        public Long getCallsOffered() {
            return this.callsOffered;
        }

        public ListHistoricalScriptReportResponseBodyDataList setCallsRejected(Long callsRejected) {
            this.callsRejected = callsRejected;
            return this;
        }
        public Long getCallsRejected() {
            return this.callsRejected;
        }

        public ListHistoricalScriptReportResponseBodyDataList setCallsResolved(Long callsResolved) {
            this.callsResolved = callsResolved;
            return this;
        }
        public Long getCallsResolved() {
            return this.callsResolved;
        }

        public ListHistoricalScriptReportResponseBodyDataList setConfiguredConcurrency(Long configuredConcurrency) {
            this.configuredConcurrency = configuredConcurrency;
            return this;
        }
        public Long getConfiguredConcurrency() {
            return this.configuredConcurrency;
        }

        public ListHistoricalScriptReportResponseBodyDataList setLabelDistribution(String labelDistribution) {
            this.labelDistribution = labelDistribution;
            return this;
        }
        public String getLabelDistribution() {
            return this.labelDistribution;
        }

        public ListHistoricalScriptReportResponseBodyDataList setMaxTalkTime(Long maxTalkTime) {
            this.maxTalkTime = maxTalkTime;
            return this;
        }
        public Long getMaxTalkTime() {
            return this.maxTalkTime;
        }

        public ListHistoricalScriptReportResponseBodyDataList setRejectionBreakdown(String rejectionBreakdown) {
            this.rejectionBreakdown = rejectionBreakdown;
            return this;
        }
        public String getRejectionBreakdown() {
            return this.rejectionBreakdown;
        }

        public ListHistoricalScriptReportResponseBodyDataList setReleaseReasonBreakdown(String releaseReasonBreakdown) {
            this.releaseReasonBreakdown = releaseReasonBreakdown;
            return this;
        }
        public String getReleaseReasonBreakdown() {
            return this.releaseReasonBreakdown;
        }

        public ListHistoricalScriptReportResponseBodyDataList setScriptId(String scriptId) {
            this.scriptId = scriptId;
            return this;
        }
        public String getScriptId() {
            return this.scriptId;
        }

        public ListHistoricalScriptReportResponseBodyDataList setTalkTurnsDistribution(String talkTurnsDistribution) {
            this.talkTurnsDistribution = talkTurnsDistribution;
            return this;
        }
        public String getTalkTurnsDistribution() {
            return this.talkTurnsDistribution;
        }

        public ListHistoricalScriptReportResponseBodyDataList setTotalInputTokens(Long totalInputTokens) {
            this.totalInputTokens = totalInputTokens;
            return this;
        }
        public Long getTotalInputTokens() {
            return this.totalInputTokens;
        }

        public ListHistoricalScriptReportResponseBodyDataList setTotalOutputTokens(Long totalOutputTokens) {
            this.totalOutputTokens = totalOutputTokens;
            return this;
        }
        public Long getTotalOutputTokens() {
            return this.totalOutputTokens;
        }

        public ListHistoricalScriptReportResponseBodyDataList setTotalTalkTime(Long totalTalkTime) {
            this.totalTalkTime = totalTalkTime;
            return this;
        }
        public Long getTotalTalkTime() {
            return this.totalTalkTime;
        }

        public ListHistoricalScriptReportResponseBodyDataList setTotalTokens(Long totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Long getTotalTokens() {
            return this.totalTokens;
        }

        public ListHistoricalScriptReportResponseBodyDataList setUsedConcurrency(Long usedConcurrency) {
            this.usedConcurrency = usedConcurrency;
            return this;
        }
        public Long getUsedConcurrency() {
            return this.usedConcurrency;
        }

    }

    public static class ListHistoricalScriptReportResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<ListHistoricalScriptReportResponseBodyDataList> list;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListHistoricalScriptReportResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListHistoricalScriptReportResponseBodyData self = new ListHistoricalScriptReportResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListHistoricalScriptReportResponseBodyData setList(java.util.List<ListHistoricalScriptReportResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListHistoricalScriptReportResponseBodyDataList> getList() {
            return this.list;
        }

        public ListHistoricalScriptReportResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListHistoricalScriptReportResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListHistoricalScriptReportResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
