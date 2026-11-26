// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetKnowledgeBaseSmartIndexConfigurationResponseBody extends TeaModel {
    /**
     * <p>已发布产物引用</p>
     */
    @NameInMap("artifacts")
    public GetKnowledgeBaseSmartIndexConfigurationResponseBodyArtifacts artifacts;

    /**
     * <p>当前或最近任务账单标识</p>
     * 
     * <strong>example:</strong>
     * <p>billing-example</p>
     */
    @NameInMap("billingId")
    public String billingId;

    /**
     * <p>业务状态码：成功为 200，失败为后端错误码（ERR.* / InvalidParameter.*）</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>企业知识库根目录业务 ID</p>
     * 
     * <strong>example:</strong>
     * <p>kb-example</p>
     */
    @NameInMap("directoryId")
    public String directoryId;

    /**
     * <p>是否开启 LLM Wiki 智能索引</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enabled")
    public Boolean enabled;

    /**
     * <p>最近一次配置或扫描错误</p>
     * 
     * <strong>example:</strong>
     * <p>自动扫描失败</p>
     */
    @NameInMap("lastError")
    public String lastError;

    /**
     * <p>最近成功任务标识</p>
     * 
     * <strong>example:</strong>
     * <p>0123456789abcdef0123456789abcdef</p>
     */
    @NameInMap("lastSuccessTaskId")
    public String lastSuccessTaskId;

    /**
     * <p>配置生命周期：DISABLED、ENABLED 或 DISABLING</p>
     * 
     * <strong>example:</strong>
     * <p>ENABLED</p>
     */
    @NameInMap("lifecycle")
    public String lifecycle;

    /**
     * <p>错误描述，成功时为 success</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>请求追踪 ID</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>配置版本；更新时作为 expectedRevision 提交</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("revision")
    public Long revision;

    /**
     * <p>自动执行计划</p>
     */
    @NameInMap("schedule")
    public GetKnowledgeBaseSmartIndexConfigurationResponseBodySchedule schedule;

    /**
     * <p>智能索引产物目录业务 ID</p>
     * 
     * <strong>example:</strong>
     * <p>kb-artifacts-example</p>
     */
    @NameInMap("targetDirId")
    public String targetDirId;

    /**
     * <p>当前或最近任务状态</p>
     */
    @NameInMap("task")
    public GetKnowledgeBaseSmartIndexConfigurationResponseBodyTask task;

    public static GetKnowledgeBaseSmartIndexConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetKnowledgeBaseSmartIndexConfigurationResponseBody self = new GetKnowledgeBaseSmartIndexConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetKnowledgeBaseSmartIndexConfigurationResponseBody setArtifacts(GetKnowledgeBaseSmartIndexConfigurationResponseBodyArtifacts artifacts) {
        this.artifacts = artifacts;
        return this;
    }
    public GetKnowledgeBaseSmartIndexConfigurationResponseBodyArtifacts getArtifacts() {
        return this.artifacts;
    }

    public GetKnowledgeBaseSmartIndexConfigurationResponseBody setBillingId(String billingId) {
        this.billingId = billingId;
        return this;
    }
    public String getBillingId() {
        return this.billingId;
    }

    public GetKnowledgeBaseSmartIndexConfigurationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetKnowledgeBaseSmartIndexConfigurationResponseBody setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public GetKnowledgeBaseSmartIndexConfigurationResponseBody setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public GetKnowledgeBaseSmartIndexConfigurationResponseBody setLastError(String lastError) {
        this.lastError = lastError;
        return this;
    }
    public String getLastError() {
        return this.lastError;
    }

    public GetKnowledgeBaseSmartIndexConfigurationResponseBody setLastSuccessTaskId(String lastSuccessTaskId) {
        this.lastSuccessTaskId = lastSuccessTaskId;
        return this;
    }
    public String getLastSuccessTaskId() {
        return this.lastSuccessTaskId;
    }

    public GetKnowledgeBaseSmartIndexConfigurationResponseBody setLifecycle(String lifecycle) {
        this.lifecycle = lifecycle;
        return this;
    }
    public String getLifecycle() {
        return this.lifecycle;
    }

    public GetKnowledgeBaseSmartIndexConfigurationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetKnowledgeBaseSmartIndexConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetKnowledgeBaseSmartIndexConfigurationResponseBody setRevision(Long revision) {
        this.revision = revision;
        return this;
    }
    public Long getRevision() {
        return this.revision;
    }

    public GetKnowledgeBaseSmartIndexConfigurationResponseBody setSchedule(GetKnowledgeBaseSmartIndexConfigurationResponseBodySchedule schedule) {
        this.schedule = schedule;
        return this;
    }
    public GetKnowledgeBaseSmartIndexConfigurationResponseBodySchedule getSchedule() {
        return this.schedule;
    }

    public GetKnowledgeBaseSmartIndexConfigurationResponseBody setTargetDirId(String targetDirId) {
        this.targetDirId = targetDirId;
        return this;
    }
    public String getTargetDirId() {
        return this.targetDirId;
    }

    public GetKnowledgeBaseSmartIndexConfigurationResponseBody setTask(GetKnowledgeBaseSmartIndexConfigurationResponseBodyTask task) {
        this.task = task;
        return this;
    }
    public GetKnowledgeBaseSmartIndexConfigurationResponseBodyTask getTask() {
        return this.task;
    }

    public static class GetKnowledgeBaseSmartIndexConfigurationResponseBodyArtifactsKnowledgeInsights extends TeaModel {
        /**
         * <p>产物资源业务 ID</p>
         * 
         * <strong>example:</strong>
         * <p>2001187</p>
         */
        @NameInMap("sourceId")
        public String sourceId;

        public static GetKnowledgeBaseSmartIndexConfigurationResponseBodyArtifactsKnowledgeInsights build(java.util.Map<String, ?> map) throws Exception {
            GetKnowledgeBaseSmartIndexConfigurationResponseBodyArtifactsKnowledgeInsights self = new GetKnowledgeBaseSmartIndexConfigurationResponseBodyArtifactsKnowledgeInsights();
            return TeaModel.build(map, self);
        }

        public GetKnowledgeBaseSmartIndexConfigurationResponseBodyArtifactsKnowledgeInsights setSourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public String getSourceId() {
            return this.sourceId;
        }

    }

    public static class GetKnowledgeBaseSmartIndexConfigurationResponseBodyArtifactsTopicCards extends TeaModel {
        /**
         * <p>产物目录业务 ID</p>
         * 
         * <strong>example:</strong>
         * <p>kb-topic-cards-example</p>
         */
        @NameInMap("directoryId")
        public String directoryId;

        public static GetKnowledgeBaseSmartIndexConfigurationResponseBodyArtifactsTopicCards build(java.util.Map<String, ?> map) throws Exception {
            GetKnowledgeBaseSmartIndexConfigurationResponseBodyArtifactsTopicCards self = new GetKnowledgeBaseSmartIndexConfigurationResponseBodyArtifactsTopicCards();
            return TeaModel.build(map, self);
        }

        public GetKnowledgeBaseSmartIndexConfigurationResponseBodyArtifactsTopicCards setDirectoryId(String directoryId) {
            this.directoryId = directoryId;
            return this;
        }
        public String getDirectoryId() {
            return this.directoryId;
        }

    }

    public static class GetKnowledgeBaseSmartIndexConfigurationResponseBodyArtifactsTopicGraph extends TeaModel {
        /**
         * <p>产物资源业务 ID</p>
         * 
         * <strong>example:</strong>
         * <p>2001085</p>
         */
        @NameInMap("sourceId")
        public String sourceId;

        public static GetKnowledgeBaseSmartIndexConfigurationResponseBodyArtifactsTopicGraph build(java.util.Map<String, ?> map) throws Exception {
            GetKnowledgeBaseSmartIndexConfigurationResponseBodyArtifactsTopicGraph self = new GetKnowledgeBaseSmartIndexConfigurationResponseBodyArtifactsTopicGraph();
            return TeaModel.build(map, self);
        }

        public GetKnowledgeBaseSmartIndexConfigurationResponseBodyArtifactsTopicGraph setSourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public String getSourceId() {
            return this.sourceId;
        }

    }

    public static class GetKnowledgeBaseSmartIndexConfigurationResponseBodyArtifactsTopicOverview extends TeaModel {
        /**
         * <p>产物资源业务 ID</p>
         * 
         * <strong>example:</strong>
         * <p>2001186</p>
         */
        @NameInMap("sourceId")
        public String sourceId;

        public static GetKnowledgeBaseSmartIndexConfigurationResponseBodyArtifactsTopicOverview build(java.util.Map<String, ?> map) throws Exception {
            GetKnowledgeBaseSmartIndexConfigurationResponseBodyArtifactsTopicOverview self = new GetKnowledgeBaseSmartIndexConfigurationResponseBodyArtifactsTopicOverview();
            return TeaModel.build(map, self);
        }

        public GetKnowledgeBaseSmartIndexConfigurationResponseBodyArtifactsTopicOverview setSourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public String getSourceId() {
            return this.sourceId;
        }

    }

    public static class GetKnowledgeBaseSmartIndexConfigurationResponseBodyArtifacts extends TeaModel {
        /**
         * <p>知识洞察</p>
         */
        @NameInMap("knowledgeInsights")
        public GetKnowledgeBaseSmartIndexConfigurationResponseBodyArtifactsKnowledgeInsights knowledgeInsights;

        /**
         * <p>主题卡片目录</p>
         */
        @NameInMap("topicCards")
        public GetKnowledgeBaseSmartIndexConfigurationResponseBodyArtifactsTopicCards topicCards;

        /**
         * <p>主题关系图</p>
         */
        @NameInMap("topicGraph")
        public GetKnowledgeBaseSmartIndexConfigurationResponseBodyArtifactsTopicGraph topicGraph;

        /**
         * <p>主题概览</p>
         */
        @NameInMap("topicOverview")
        public GetKnowledgeBaseSmartIndexConfigurationResponseBodyArtifactsTopicOverview topicOverview;

        public static GetKnowledgeBaseSmartIndexConfigurationResponseBodyArtifacts build(java.util.Map<String, ?> map) throws Exception {
            GetKnowledgeBaseSmartIndexConfigurationResponseBodyArtifacts self = new GetKnowledgeBaseSmartIndexConfigurationResponseBodyArtifacts();
            return TeaModel.build(map, self);
        }

        public GetKnowledgeBaseSmartIndexConfigurationResponseBodyArtifacts setKnowledgeInsights(GetKnowledgeBaseSmartIndexConfigurationResponseBodyArtifactsKnowledgeInsights knowledgeInsights) {
            this.knowledgeInsights = knowledgeInsights;
            return this;
        }
        public GetKnowledgeBaseSmartIndexConfigurationResponseBodyArtifactsKnowledgeInsights getKnowledgeInsights() {
            return this.knowledgeInsights;
        }

        public GetKnowledgeBaseSmartIndexConfigurationResponseBodyArtifacts setTopicCards(GetKnowledgeBaseSmartIndexConfigurationResponseBodyArtifactsTopicCards topicCards) {
            this.topicCards = topicCards;
            return this;
        }
        public GetKnowledgeBaseSmartIndexConfigurationResponseBodyArtifactsTopicCards getTopicCards() {
            return this.topicCards;
        }

        public GetKnowledgeBaseSmartIndexConfigurationResponseBodyArtifacts setTopicGraph(GetKnowledgeBaseSmartIndexConfigurationResponseBodyArtifactsTopicGraph topicGraph) {
            this.topicGraph = topicGraph;
            return this;
        }
        public GetKnowledgeBaseSmartIndexConfigurationResponseBodyArtifactsTopicGraph getTopicGraph() {
            return this.topicGraph;
        }

        public GetKnowledgeBaseSmartIndexConfigurationResponseBodyArtifacts setTopicOverview(GetKnowledgeBaseSmartIndexConfigurationResponseBodyArtifactsTopicOverview topicOverview) {
            this.topicOverview = topicOverview;
            return this;
        }
        public GetKnowledgeBaseSmartIndexConfigurationResponseBodyArtifactsTopicOverview getTopicOverview() {
            return this.topicOverview;
        }

    }

    public static class GetKnowledgeBaseSmartIndexConfigurationResponseBodySchedule extends TeaModel {
        /**
         * <p>Cron 表达式；空表示手动执行</p>
         * 
         * <strong>example:</strong>
         * <p>0 2 * * *</p>
         */
        @NameInMap("cronExpression")
        public String cronExpression;

        /**
         * <p>下次计划执行时间，ISO 8601 格式</p>
         * 
         * <strong>example:</strong>
         * <p>2026-11-19T02:00:00+08:00</p>
         */
        @NameInMap("nextRunAt")
        public String nextRunAt;

        /**
         * <p>计划使用的 IANA 时区</p>
         * 
         * <strong>example:</strong>
         * <p>Asia/Shanghai</p>
         */
        @NameInMap("timezone")
        public String timezone;

        public static GetKnowledgeBaseSmartIndexConfigurationResponseBodySchedule build(java.util.Map<String, ?> map) throws Exception {
            GetKnowledgeBaseSmartIndexConfigurationResponseBodySchedule self = new GetKnowledgeBaseSmartIndexConfigurationResponseBodySchedule();
            return TeaModel.build(map, self);
        }

        public GetKnowledgeBaseSmartIndexConfigurationResponseBodySchedule setCronExpression(String cronExpression) {
            this.cronExpression = cronExpression;
            return this;
        }
        public String getCronExpression() {
            return this.cronExpression;
        }

        public GetKnowledgeBaseSmartIndexConfigurationResponseBodySchedule setNextRunAt(String nextRunAt) {
            this.nextRunAt = nextRunAt;
            return this;
        }
        public String getNextRunAt() {
            return this.nextRunAt;
        }

        public GetKnowledgeBaseSmartIndexConfigurationResponseBodySchedule setTimezone(String timezone) {
            this.timezone = timezone;
            return this;
        }
        public String getTimezone() {
            return this.timezone;
        }

    }

    public static class GetKnowledgeBaseSmartIndexConfigurationResponseBodyTask extends TeaModel {
        /**
         * <p>任务账单标识</p>
         * 
         * <strong>example:</strong>
         * <p>billing-example</p>
         */
        @NameInMap("billingId")
        public String billingId;

        /**
         * <p>任务计费状态</p>
         * 
         * <strong>example:</strong>
         * <p>PENDING</p>
         */
        @NameInMap("billingStatus")
        public String billingStatus;

        /**
         * <p>任务执行状态</p>
         * 
         * <strong>example:</strong>
         * <p>QUEUED</p>
         */
        @NameInMap("executionStatus")
        public String executionStatus;

        /**
         * <p>任务创建时间，ISO 8601 格式</p>
         * 
         * <strong>example:</strong>
         * <p>2026-11-18T09:00:00+00:00</p>
         */
        @NameInMap("gmtCreate")
        public String gmtCreate;

        /**
         * <p>任务更新时间，ISO 8601 格式</p>
         * 
         * <strong>example:</strong>
         * <p>2026-11-18T09:01:00+00:00</p>
         */
        @NameInMap("gmtModified")
        public String gmtModified;

        /**
         * <p>最近一次任务错误</p>
         * 
         * <strong>example:</strong>
         * <p>任务执行失败</p>
         */
        @NameInMap("lastError")
        public String lastError;

        /**
         * <p>任务操作类型</p>
         * 
         * <strong>example:</strong>
         * <p>full</p>
         */
        @NameInMap("operation")
        public String operation;

        /**
         * <p>任务执行进度</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("progress")
        public Long progress;

        /**
         * <p>任务结果上报状态</p>
         * 
         * <strong>example:</strong>
         * <p>pending</p>
         */
        @NameInMap("reportStatus")
        public String reportStatus;

        /**
         * <p>是否复用已有任务</p>
         */
        @NameInMap("reused")
        public Boolean reused;

        /**
         * <p>任务业务标识</p>
         * 
         * <strong>example:</strong>
         * <p>0123456789abcdef0123456789abcdef</p>
         */
        @NameInMap("taskKey")
        public String taskKey;

        /**
         * <p>任务触发类型</p>
         * 
         * <strong>example:</strong>
         * <p>manual</p>
         */
        @NameInMap("triggerType")
        public String triggerType;

        /**
         * <p>用量统计是否完成</p>
         */
        @NameInMap("usageComplete")
        public Boolean usageComplete;

        public static GetKnowledgeBaseSmartIndexConfigurationResponseBodyTask build(java.util.Map<String, ?> map) throws Exception {
            GetKnowledgeBaseSmartIndexConfigurationResponseBodyTask self = new GetKnowledgeBaseSmartIndexConfigurationResponseBodyTask();
            return TeaModel.build(map, self);
        }

        public GetKnowledgeBaseSmartIndexConfigurationResponseBodyTask setBillingId(String billingId) {
            this.billingId = billingId;
            return this;
        }
        public String getBillingId() {
            return this.billingId;
        }

        public GetKnowledgeBaseSmartIndexConfigurationResponseBodyTask setBillingStatus(String billingStatus) {
            this.billingStatus = billingStatus;
            return this;
        }
        public String getBillingStatus() {
            return this.billingStatus;
        }

        public GetKnowledgeBaseSmartIndexConfigurationResponseBodyTask setExecutionStatus(String executionStatus) {
            this.executionStatus = executionStatus;
            return this;
        }
        public String getExecutionStatus() {
            return this.executionStatus;
        }

        public GetKnowledgeBaseSmartIndexConfigurationResponseBodyTask setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetKnowledgeBaseSmartIndexConfigurationResponseBodyTask setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetKnowledgeBaseSmartIndexConfigurationResponseBodyTask setLastError(String lastError) {
            this.lastError = lastError;
            return this;
        }
        public String getLastError() {
            return this.lastError;
        }

        public GetKnowledgeBaseSmartIndexConfigurationResponseBodyTask setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public GetKnowledgeBaseSmartIndexConfigurationResponseBodyTask setProgress(Long progress) {
            this.progress = progress;
            return this;
        }
        public Long getProgress() {
            return this.progress;
        }

        public GetKnowledgeBaseSmartIndexConfigurationResponseBodyTask setReportStatus(String reportStatus) {
            this.reportStatus = reportStatus;
            return this;
        }
        public String getReportStatus() {
            return this.reportStatus;
        }

        public GetKnowledgeBaseSmartIndexConfigurationResponseBodyTask setReused(Boolean reused) {
            this.reused = reused;
            return this;
        }
        public Boolean getReused() {
            return this.reused;
        }

        public GetKnowledgeBaseSmartIndexConfigurationResponseBodyTask setTaskKey(String taskKey) {
            this.taskKey = taskKey;
            return this;
        }
        public String getTaskKey() {
            return this.taskKey;
        }

        public GetKnowledgeBaseSmartIndexConfigurationResponseBodyTask setTriggerType(String triggerType) {
            this.triggerType = triggerType;
            return this;
        }
        public String getTriggerType() {
            return this.triggerType;
        }

        public GetKnowledgeBaseSmartIndexConfigurationResponseBodyTask setUsageComplete(Boolean usageComplete) {
            this.usageComplete = usageComplete;
            return this;
        }
        public Boolean getUsageComplete() {
            return this.usageComplete;
        }

    }

}
