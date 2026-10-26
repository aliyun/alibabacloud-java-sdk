// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class ListInstanceInspectionRunsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("data")
    public java.util.List<ListInstanceInspectionRunsResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>eyJvZmZzZXQiOjIwfQ</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("total")
    public Long total;

    public static ListInstanceInspectionRunsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceInspectionRunsResponseBody self = new ListInstanceInspectionRunsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstanceInspectionRunsResponseBody setData(java.util.List<ListInstanceInspectionRunsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListInstanceInspectionRunsResponseBodyData> getData() {
        return this.data;
    }

    public ListInstanceInspectionRunsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListInstanceInspectionRunsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListInstanceInspectionRunsResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListInstanceInspectionRunsResponseBodyDataAiSummary extends TeaModel {
        /**
         * <p>Pending 等待、Running 生成中、Succeeded 已生成、Failed 生成失败；不改变巡检结果。</p>
         * 
         * <strong>example:</strong>
         * <p>Succeeded</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>仅生成成功时返回，最多 200 字，不由前端拼接或截取。</p>
         * 
         * <strong>example:</strong>
         * <p>本次巡检未发现风险，实例运行正常。</p>
         */
        @NameInMap("text")
        public String text;

        public static ListInstanceInspectionRunsResponseBodyDataAiSummary build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceInspectionRunsResponseBodyDataAiSummary self = new ListInstanceInspectionRunsResponseBodyDataAiSummary();
            return TeaModel.build(map, self);
        }

        public ListInstanceInspectionRunsResponseBodyDataAiSummary setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListInstanceInspectionRunsResponseBodyDataAiSummary setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class ListInstanceInspectionRunsResponseBodyDataNotification extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>inspection-event-001</p>
         */
        @NameInMap("eventId")
        public String eventId;

        /**
         * <strong>example:</strong>
         * <p>Sent</p>
         */
        @NameInMap("status")
        public String status;

        public static ListInstanceInspectionRunsResponseBodyDataNotification build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceInspectionRunsResponseBodyDataNotification self = new ListInstanceInspectionRunsResponseBodyDataNotification();
            return TeaModel.build(map, self);
        }

        public ListInstanceInspectionRunsResponseBodyDataNotification setEventId(String eventId) {
            this.eventId = eventId;
            return this;
        }
        public String getEventId() {
            return this.eventId;
        }

        public ListInstanceInspectionRunsResponseBodyDataNotification setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListInstanceInspectionRunsResponseBodyDataSummary extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("infoCount")
        public Integer infoCount;

        /**
         * <strong>example:</strong>
         * <p>risk</p>
         */
        @NameInMap("result")
        public String result;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("riskCount")
        public Integer riskCount;

        public static ListInstanceInspectionRunsResponseBodyDataSummary build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceInspectionRunsResponseBodyDataSummary self = new ListInstanceInspectionRunsResponseBodyDataSummary();
            return TeaModel.build(map, self);
        }

        public ListInstanceInspectionRunsResponseBodyDataSummary setInfoCount(Integer infoCount) {
            this.infoCount = infoCount;
            return this;
        }
        public Integer getInfoCount() {
            return this.infoCount;
        }

        public ListInstanceInspectionRunsResponseBodyDataSummary setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public ListInstanceInspectionRunsResponseBodyDataSummary setRiskCount(Integer riskCount) {
            this.riskCount = riskCount;
            return this;
        }
        public Integer getRiskCount() {
            return this.riskCount;
        }

    }

    public static class ListInstanceInspectionRunsResponseBodyDataTimeRange extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2026-09-08T00:00:00Z</p>
         */
        @NameInMap("endTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>2026-09-01T00:00:00Z</p>
         */
        @NameInMap("startTime")
        public String startTime;

        public static ListInstanceInspectionRunsResponseBodyDataTimeRange build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceInspectionRunsResponseBodyDataTimeRange self = new ListInstanceInspectionRunsResponseBodyDataTimeRange();
            return TeaModel.build(map, self);
        }

        public ListInstanceInspectionRunsResponseBodyDataTimeRange setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListInstanceInspectionRunsResponseBodyDataTimeRange setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class ListInstanceInspectionRunsResponseBodyData extends TeaModel {
        /**
         * <p>每次巡检结果由 LLM 总结；包含生成状态及成功后的原文，未生成时为空。</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("aiSummary")
        public ListInstanceInspectionRunsResponseBodyDataAiSummary aiSummary;

        /**
         * <strong>example:</strong>
         * <p>2026-09-08T00:01:00Z</p>
         */
        @NameInMap("finishedAt")
        public String finishedAt;

        /**
         * <strong>example:</strong>
         * <p>rmq-cn-example</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>订单实例</p>
         */
        @NameInMap("instanceName")
        public String instanceName;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("notification")
        public ListInstanceInspectionRunsResponseBodyDataNotification notification;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>2026-10-15T10:00:00Z</p>
         */
        @NameInMap("reportFinishedAt")
        public String reportFinishedAt;

        /**
         * <strong>example:</strong>
         * <p>irpt-one</p>
         */
        @NameInMap("reportId")
        public String reportId;

        /**
         * <strong>example:</strong>
         * <p>Succeeded</p>
         */
        @NameInMap("reportStatus")
        public String reportStatus;

        /**
         * <strong>example:</strong>
         * <p>2026-09-08T00:00:00Z</p>
         */
        @NameInMap("requestedAt")
        public String requestedAt;

        /**
         * <strong>example:</strong>
         * <p>inspection-run-001</p>
         */
        @NameInMap("runId")
        public String runId;

        /**
         * <strong>example:</strong>
         * <p>Succeeded</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("summary")
        public ListInstanceInspectionRunsResponseBodyDataSummary summary;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("timeRange")
        public ListInstanceInspectionRunsResponseBodyDataTimeRange timeRange;

        /**
         * <strong>example:</strong>
         * <p>manual</p>
         */
        @NameInMap("triggerSource")
        public String triggerSource;

        public static ListInstanceInspectionRunsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceInspectionRunsResponseBodyData self = new ListInstanceInspectionRunsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListInstanceInspectionRunsResponseBodyData setAiSummary(ListInstanceInspectionRunsResponseBodyDataAiSummary aiSummary) {
            this.aiSummary = aiSummary;
            return this;
        }
        public ListInstanceInspectionRunsResponseBodyDataAiSummary getAiSummary() {
            return this.aiSummary;
        }

        public ListInstanceInspectionRunsResponseBodyData setFinishedAt(String finishedAt) {
            this.finishedAt = finishedAt;
            return this;
        }
        public String getFinishedAt() {
            return this.finishedAt;
        }

        public ListInstanceInspectionRunsResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListInstanceInspectionRunsResponseBodyData setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public ListInstanceInspectionRunsResponseBodyData setNotification(ListInstanceInspectionRunsResponseBodyDataNotification notification) {
            this.notification = notification;
            return this;
        }
        public ListInstanceInspectionRunsResponseBodyDataNotification getNotification() {
            return this.notification;
        }

        public ListInstanceInspectionRunsResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListInstanceInspectionRunsResponseBodyData setReportFinishedAt(String reportFinishedAt) {
            this.reportFinishedAt = reportFinishedAt;
            return this;
        }
        public String getReportFinishedAt() {
            return this.reportFinishedAt;
        }

        public ListInstanceInspectionRunsResponseBodyData setReportId(String reportId) {
            this.reportId = reportId;
            return this;
        }
        public String getReportId() {
            return this.reportId;
        }

        public ListInstanceInspectionRunsResponseBodyData setReportStatus(String reportStatus) {
            this.reportStatus = reportStatus;
            return this;
        }
        public String getReportStatus() {
            return this.reportStatus;
        }

        public ListInstanceInspectionRunsResponseBodyData setRequestedAt(String requestedAt) {
            this.requestedAt = requestedAt;
            return this;
        }
        public String getRequestedAt() {
            return this.requestedAt;
        }

        public ListInstanceInspectionRunsResponseBodyData setRunId(String runId) {
            this.runId = runId;
            return this;
        }
        public String getRunId() {
            return this.runId;
        }

        public ListInstanceInspectionRunsResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListInstanceInspectionRunsResponseBodyData setSummary(ListInstanceInspectionRunsResponseBodyDataSummary summary) {
            this.summary = summary;
            return this;
        }
        public ListInstanceInspectionRunsResponseBodyDataSummary getSummary() {
            return this.summary;
        }

        public ListInstanceInspectionRunsResponseBodyData setTimeRange(ListInstanceInspectionRunsResponseBodyDataTimeRange timeRange) {
            this.timeRange = timeRange;
            return this;
        }
        public ListInstanceInspectionRunsResponseBodyDataTimeRange getTimeRange() {
            return this.timeRange;
        }

        public ListInstanceInspectionRunsResponseBodyData setTriggerSource(String triggerSource) {
            this.triggerSource = triggerSource;
            return this;
        }
        public String getTriggerSource() {
            return this.triggerSource;
        }

    }

}
