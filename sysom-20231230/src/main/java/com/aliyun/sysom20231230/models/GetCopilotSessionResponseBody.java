// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetCopilotSessionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public GetCopilotSessionResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>5BC79EF5-798B-5499-9683-4E14EBBBF712</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetCopilotSessionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCopilotSessionResponseBody self = new GetCopilotSessionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCopilotSessionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetCopilotSessionResponseBody setData(GetCopilotSessionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetCopilotSessionResponseBodyData getData() {
        return this.data;
    }

    public GetCopilotSessionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetCopilotSessionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetCopilotSessionResponseBodyDataActiveTurn extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2026-09-09T01:01:00Z</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <strong>example:</strong>
         * <p>2026-09-09T01:03:00Z</p>
         */
        @NameInMap("finishedAt")
        public String finishedAt;

        /**
         * <strong>example:</strong>
         * <p>1200</p>
         */
        @NameInMap("inputTokens")
        public Long inputTokens;

        /**
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("outputTokens")
        public Long outputTokens;

        /**
         * <strong>example:</strong>
         * <p>iso-boot-validation</p>
         */
        @NameInMap("pendingInputId")
        public String pendingInputId;

        /**
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>e499819f351242dba59ab8af31bc8b0f</p>
         */
        @NameInMap("turnId")
        public String turnId;

        /**
         * <strong>example:</strong>
         * <p>2026-09-09T01:02:00Z</p>
         */
        @NameInMap("updatedAt")
        public String updatedAt;

        public static GetCopilotSessionResponseBodyDataActiveTurn build(java.util.Map<String, ?> map) throws Exception {
            GetCopilotSessionResponseBodyDataActiveTurn self = new GetCopilotSessionResponseBodyDataActiveTurn();
            return TeaModel.build(map, self);
        }

        public GetCopilotSessionResponseBodyDataActiveTurn setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetCopilotSessionResponseBodyDataActiveTurn setFinishedAt(String finishedAt) {
            this.finishedAt = finishedAt;
            return this;
        }
        public String getFinishedAt() {
            return this.finishedAt;
        }

        public GetCopilotSessionResponseBodyDataActiveTurn setInputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Long getInputTokens() {
            return this.inputTokens;
        }

        public GetCopilotSessionResponseBodyDataActiveTurn setOutputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        public GetCopilotSessionResponseBodyDataActiveTurn setPendingInputId(String pendingInputId) {
            this.pendingInputId = pendingInputId;
            return this;
        }
        public String getPendingInputId() {
            return this.pendingInputId;
        }

        public GetCopilotSessionResponseBodyDataActiveTurn setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetCopilotSessionResponseBodyDataActiveTurn setTurnId(String turnId) {
            this.turnId = turnId;
            return this;
        }
        public String getTurnId() {
            return this.turnId;
        }

        public GetCopilotSessionResponseBodyDataActiveTurn setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

    }

    public static class GetCopilotSessionResponseBodyDataLastTurn extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2026-09-09T01:01:00Z</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <strong>example:</strong>
         * <p>2026-09-09T01:03:00Z</p>
         */
        @NameInMap("finishedAt")
        public String finishedAt;

        /**
         * <strong>example:</strong>
         * <p>1200</p>
         */
        @NameInMap("inputTokens")
        public Long inputTokens;

        /**
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("outputTokens")
        public Long outputTokens;

        /**
         * <strong>example:</strong>
         * <p>iso-boot-validation</p>
         */
        @NameInMap("pendingInputId")
        public String pendingInputId;

        /**
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>e499819f351242dba59ab8af31bc8b0f</p>
         */
        @NameInMap("turnId")
        public String turnId;

        /**
         * <strong>example:</strong>
         * <p>2026-09-09T01:02:00Z</p>
         */
        @NameInMap("updatedAt")
        public String updatedAt;

        public static GetCopilotSessionResponseBodyDataLastTurn build(java.util.Map<String, ?> map) throws Exception {
            GetCopilotSessionResponseBodyDataLastTurn self = new GetCopilotSessionResponseBodyDataLastTurn();
            return TeaModel.build(map, self);
        }

        public GetCopilotSessionResponseBodyDataLastTurn setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetCopilotSessionResponseBodyDataLastTurn setFinishedAt(String finishedAt) {
            this.finishedAt = finishedAt;
            return this;
        }
        public String getFinishedAt() {
            return this.finishedAt;
        }

        public GetCopilotSessionResponseBodyDataLastTurn setInputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Long getInputTokens() {
            return this.inputTokens;
        }

        public GetCopilotSessionResponseBodyDataLastTurn setOutputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        public GetCopilotSessionResponseBodyDataLastTurn setPendingInputId(String pendingInputId) {
            this.pendingInputId = pendingInputId;
            return this;
        }
        public String getPendingInputId() {
            return this.pendingInputId;
        }

        public GetCopilotSessionResponseBodyDataLastTurn setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetCopilotSessionResponseBodyDataLastTurn setTurnId(String turnId) {
            this.turnId = turnId;
            return this;
        }
        public String getTurnId() {
            return this.turnId;
        }

        public GetCopilotSessionResponseBodyDataLastTurn setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

    }

    public static class GetCopilotSessionResponseBodyDataScheduledTask extends TeaModel {
        /**
         * <p>本次定时执行的 Run ID</p>
         * 
         * <strong>example:</strong>
         * <p>run-example-001</p>
         */
        @NameInMap("runId")
        public String runId;

        /**
         * <p>计划触发时间，ISO 8601 含时区偏移</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-09T01:00:00+00:00</p>
         */
        @NameInMap("scheduledAt")
        public String scheduledAt;

        /**
         * <p>Copilot 开始处理时间，ISO 8601 含时区偏移</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-09T01:00:03+00:00</p>
         */
        @NameInMap("startedAt")
        public String startedAt;

        /**
         * <p>任务 ID；任务删除后仍保留</p>
         * 
         * <strong>example:</strong>
         * <p>42</p>
         */
        @NameInMap("taskId")
        public Long taskId;

        /**
         * <p>触发时的任务名称快照</p>
         * 
         * <strong>example:</strong>
         * <p>每日巡检</p>
         */
        @NameInMap("taskName")
        public String taskName;

        /**
         * <p>任务的 cron 时区</p>
         * 
         * <strong>example:</strong>
         * <p>Asia/Shanghai</p>
         */
        @NameInMap("timezone")
        public String timezone;

        public static GetCopilotSessionResponseBodyDataScheduledTask build(java.util.Map<String, ?> map) throws Exception {
            GetCopilotSessionResponseBodyDataScheduledTask self = new GetCopilotSessionResponseBodyDataScheduledTask();
            return TeaModel.build(map, self);
        }

        public GetCopilotSessionResponseBodyDataScheduledTask setRunId(String runId) {
            this.runId = runId;
            return this;
        }
        public String getRunId() {
            return this.runId;
        }

        public GetCopilotSessionResponseBodyDataScheduledTask setScheduledAt(String scheduledAt) {
            this.scheduledAt = scheduledAt;
            return this;
        }
        public String getScheduledAt() {
            return this.scheduledAt;
        }

        public GetCopilotSessionResponseBodyDataScheduledTask setStartedAt(String startedAt) {
            this.startedAt = startedAt;
            return this;
        }
        public String getStartedAt() {
            return this.startedAt;
        }

        public GetCopilotSessionResponseBodyDataScheduledTask setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

        public GetCopilotSessionResponseBodyDataScheduledTask setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public GetCopilotSessionResponseBodyDataScheduledTask setTimezone(String timezone) {
            this.timezone = timezone;
            return this;
        }
        public String getTimezone() {
            return this.timezone;
        }

    }

    public static class GetCopilotSessionResponseBodyData extends TeaModel {
        @NameInMap("activeTurn")
        public GetCopilotSessionResponseBodyDataActiveTurn activeTurn;

        /**
         * <strong>example:</strong>
         * <p>2026-09-09T01:00:00Z</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <p>十进制事件序号字符串，范围 0..9223372036854775807；避免 JavaScript 精度丢失</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("cursor")
        public String cursor;

        @NameInMap("lastTurn")
        public GetCopilotSessionResponseBodyDataLastTurn lastTurn;

        /**
         * <strong>example:</strong>
         * <p>排查 CPU 负载</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>定时任务触发快照；非定时会话为空</p>
         */
        @NameInMap("scheduledTask")
        public GetCopilotSessionResponseBodyDataScheduledTask scheduledTask;

        /**
         * <strong>example:</strong>
         * <p>c356bc310e4345c3a602a2912322ad21</p>
         */
        @NameInMap("sessionId")
        public String sessionId;

        /**
         * <p>会话初始来源：chat、scheduled_task、alert；后续追问不改变来源</p>
         * 
         * <strong>example:</strong>
         * <p>openapi</p>
         */
        @NameInMap("sessionType")
        public String sessionType;

        /**
         * <strong>example:</strong>
         * <p>active</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>2026-09-09T01:02:00Z</p>
         */
        @NameInMap("updatedAt")
        public String updatedAt;

        public static GetCopilotSessionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCopilotSessionResponseBodyData self = new GetCopilotSessionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCopilotSessionResponseBodyData setActiveTurn(GetCopilotSessionResponseBodyDataActiveTurn activeTurn) {
            this.activeTurn = activeTurn;
            return this;
        }
        public GetCopilotSessionResponseBodyDataActiveTurn getActiveTurn() {
            return this.activeTurn;
        }

        public GetCopilotSessionResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetCopilotSessionResponseBodyData setCursor(String cursor) {
            this.cursor = cursor;
            return this;
        }
        public String getCursor() {
            return this.cursor;
        }

        public GetCopilotSessionResponseBodyData setLastTurn(GetCopilotSessionResponseBodyDataLastTurn lastTurn) {
            this.lastTurn = lastTurn;
            return this;
        }
        public GetCopilotSessionResponseBodyDataLastTurn getLastTurn() {
            return this.lastTurn;
        }

        public GetCopilotSessionResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetCopilotSessionResponseBodyData setScheduledTask(GetCopilotSessionResponseBodyDataScheduledTask scheduledTask) {
            this.scheduledTask = scheduledTask;
            return this;
        }
        public GetCopilotSessionResponseBodyDataScheduledTask getScheduledTask() {
            return this.scheduledTask;
        }

        public GetCopilotSessionResponseBodyData setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public GetCopilotSessionResponseBodyData setSessionType(String sessionType) {
            this.sessionType = sessionType;
            return this;
        }
        public String getSessionType() {
            return this.sessionType;
        }

        public GetCopilotSessionResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetCopilotSessionResponseBodyData setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

    }

}
