// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class CreateCopilotSessionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public CreateCopilotSessionResponseBodyData data;

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

    public static CreateCopilotSessionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCopilotSessionResponseBody self = new CreateCopilotSessionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCopilotSessionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateCopilotSessionResponseBody setData(CreateCopilotSessionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateCopilotSessionResponseBodyData getData() {
        return this.data;
    }

    public CreateCopilotSessionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateCopilotSessionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateCopilotSessionResponseBodyDataActiveTurn extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2026-10-29T10:01:00+08:00</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <strong>example:</strong>
         * <p>2026-10-29T10:02:00+08:00</p>
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
         * <p>form-001</p>
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
         * <p>d71fc5ceac2949f39a264c8a585f3148</p>
         */
        @NameInMap("turnId")
        public String turnId;

        /**
         * <strong>example:</strong>
         * <p>2026-10-29T10:01:30+08:00</p>
         */
        @NameInMap("updatedAt")
        public String updatedAt;

        public static CreateCopilotSessionResponseBodyDataActiveTurn build(java.util.Map<String, ?> map) throws Exception {
            CreateCopilotSessionResponseBodyDataActiveTurn self = new CreateCopilotSessionResponseBodyDataActiveTurn();
            return TeaModel.build(map, self);
        }

        public CreateCopilotSessionResponseBodyDataActiveTurn setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public CreateCopilotSessionResponseBodyDataActiveTurn setFinishedAt(String finishedAt) {
            this.finishedAt = finishedAt;
            return this;
        }
        public String getFinishedAt() {
            return this.finishedAt;
        }

        public CreateCopilotSessionResponseBodyDataActiveTurn setInputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Long getInputTokens() {
            return this.inputTokens;
        }

        public CreateCopilotSessionResponseBodyDataActiveTurn setOutputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        public CreateCopilotSessionResponseBodyDataActiveTurn setPendingInputId(String pendingInputId) {
            this.pendingInputId = pendingInputId;
            return this;
        }
        public String getPendingInputId() {
            return this.pendingInputId;
        }

        public CreateCopilotSessionResponseBodyDataActiveTurn setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateCopilotSessionResponseBodyDataActiveTurn setTurnId(String turnId) {
            this.turnId = turnId;
            return this;
        }
        public String getTurnId() {
            return this.turnId;
        }

        public CreateCopilotSessionResponseBodyDataActiveTurn setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

    }

    public static class CreateCopilotSessionResponseBodyDataLastTurn extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2026-10-29T10:01:00+08:00</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <strong>example:</strong>
         * <p>2026-10-29T10:01:00+08:00</p>
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
         * <p>form-001</p>
         */
        @NameInMap("pendingInputId")
        public String pendingInputId;

        /**
         * <strong>example:</strong>
         * <p>completed</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>d71fc5ceac2949f39a264c8a585f3148</p>
         */
        @NameInMap("turnId")
        public String turnId;

        /**
         * <strong>example:</strong>
         * <p>2026-10-29T10:01:00+08:00</p>
         */
        @NameInMap("updatedAt")
        public String updatedAt;

        public static CreateCopilotSessionResponseBodyDataLastTurn build(java.util.Map<String, ?> map) throws Exception {
            CreateCopilotSessionResponseBodyDataLastTurn self = new CreateCopilotSessionResponseBodyDataLastTurn();
            return TeaModel.build(map, self);
        }

        public CreateCopilotSessionResponseBodyDataLastTurn setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public CreateCopilotSessionResponseBodyDataLastTurn setFinishedAt(String finishedAt) {
            this.finishedAt = finishedAt;
            return this;
        }
        public String getFinishedAt() {
            return this.finishedAt;
        }

        public CreateCopilotSessionResponseBodyDataLastTurn setInputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Long getInputTokens() {
            return this.inputTokens;
        }

        public CreateCopilotSessionResponseBodyDataLastTurn setOutputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        public CreateCopilotSessionResponseBodyDataLastTurn setPendingInputId(String pendingInputId) {
            this.pendingInputId = pendingInputId;
            return this;
        }
        public String getPendingInputId() {
            return this.pendingInputId;
        }

        public CreateCopilotSessionResponseBodyDataLastTurn setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateCopilotSessionResponseBodyDataLastTurn setTurnId(String turnId) {
            this.turnId = turnId;
            return this;
        }
        public String getTurnId() {
            return this.turnId;
        }

        public CreateCopilotSessionResponseBodyDataLastTurn setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

    }

    public static class CreateCopilotSessionResponseBodyDataScheduledTask extends TeaModel {
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
         * <p>2026-10-29T09:00:00+08:00</p>
         */
        @NameInMap("scheduledAt")
        public String scheduledAt;

        /**
         * <p>Copilot 开始处理时间，ISO 8601 含时区偏移</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-29T09:00:00+08:00</p>
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

        public static CreateCopilotSessionResponseBodyDataScheduledTask build(java.util.Map<String, ?> map) throws Exception {
            CreateCopilotSessionResponseBodyDataScheduledTask self = new CreateCopilotSessionResponseBodyDataScheduledTask();
            return TeaModel.build(map, self);
        }

        public CreateCopilotSessionResponseBodyDataScheduledTask setRunId(String runId) {
            this.runId = runId;
            return this;
        }
        public String getRunId() {
            return this.runId;
        }

        public CreateCopilotSessionResponseBodyDataScheduledTask setScheduledAt(String scheduledAt) {
            this.scheduledAt = scheduledAt;
            return this;
        }
        public String getScheduledAt() {
            return this.scheduledAt;
        }

        public CreateCopilotSessionResponseBodyDataScheduledTask setStartedAt(String startedAt) {
            this.startedAt = startedAt;
            return this;
        }
        public String getStartedAt() {
            return this.startedAt;
        }

        public CreateCopilotSessionResponseBodyDataScheduledTask setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

        public CreateCopilotSessionResponseBodyDataScheduledTask setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public CreateCopilotSessionResponseBodyDataScheduledTask setTimezone(String timezone) {
            this.timezone = timezone;
            return this;
        }
        public String getTimezone() {
            return this.timezone;
        }

    }

    public static class CreateCopilotSessionResponseBodyData extends TeaModel {
        @NameInMap("activeTurn")
        public CreateCopilotSessionResponseBodyDataActiveTurn activeTurn;

        /**
         * <strong>example:</strong>
         * <p>2026-10-29T10:00:00+08:00</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <p>十进制事件序号字符串，范围 0..9223372036854775807；避免 JavaScript 精度丢失</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("cursor")
        public String cursor;

        @NameInMap("lastTurn")
        public CreateCopilotSessionResponseBodyDataLastTurn lastTurn;

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
        public CreateCopilotSessionResponseBodyDataScheduledTask scheduledTask;

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
         * <p>2026-10-29T10:00:00+08:00</p>
         */
        @NameInMap("updatedAt")
        public String updatedAt;

        public static CreateCopilotSessionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateCopilotSessionResponseBodyData self = new CreateCopilotSessionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateCopilotSessionResponseBodyData setActiveTurn(CreateCopilotSessionResponseBodyDataActiveTurn activeTurn) {
            this.activeTurn = activeTurn;
            return this;
        }
        public CreateCopilotSessionResponseBodyDataActiveTurn getActiveTurn() {
            return this.activeTurn;
        }

        public CreateCopilotSessionResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public CreateCopilotSessionResponseBodyData setCursor(String cursor) {
            this.cursor = cursor;
            return this;
        }
        public String getCursor() {
            return this.cursor;
        }

        public CreateCopilotSessionResponseBodyData setLastTurn(CreateCopilotSessionResponseBodyDataLastTurn lastTurn) {
            this.lastTurn = lastTurn;
            return this;
        }
        public CreateCopilotSessionResponseBodyDataLastTurn getLastTurn() {
            return this.lastTurn;
        }

        public CreateCopilotSessionResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateCopilotSessionResponseBodyData setScheduledTask(CreateCopilotSessionResponseBodyDataScheduledTask scheduledTask) {
            this.scheduledTask = scheduledTask;
            return this;
        }
        public CreateCopilotSessionResponseBodyDataScheduledTask getScheduledTask() {
            return this.scheduledTask;
        }

        public CreateCopilotSessionResponseBodyData setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public CreateCopilotSessionResponseBodyData setSessionType(String sessionType) {
            this.sessionType = sessionType;
            return this;
        }
        public String getSessionType() {
            return this.sessionType;
        }

        public CreateCopilotSessionResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateCopilotSessionResponseBodyData setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

    }

}
