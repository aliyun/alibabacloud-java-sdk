// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class UpdatePolarClawCronJobResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pa-**************</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Job")
    public UpdatePolarClawCronJobResponseBodyJob job;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Ok")
    public Boolean ok;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>2281C6C9-CBAB-1AFD-8400-670750CF6025_2212</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdatePolarClawCronJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdatePolarClawCronJobResponseBody self = new UpdatePolarClawCronJobResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdatePolarClawCronJobResponseBody setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public UpdatePolarClawCronJobResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public UpdatePolarClawCronJobResponseBody setJob(UpdatePolarClawCronJobResponseBodyJob job) {
        this.job = job;
        return this;
    }
    public UpdatePolarClawCronJobResponseBodyJob getJob() {
        return this.job;
    }

    public UpdatePolarClawCronJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdatePolarClawCronJobResponseBody setOk(Boolean ok) {
        this.ok = ok;
        return this;
    }
    public Boolean getOk() {
        return this.ok;
    }

    public UpdatePolarClawCronJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdatePolarClawCronJobResponseBodyJobDelivery extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        @NameInMap("BestEffort")
        public Boolean bestEffort;

        /**
         * <strong>example:</strong>
         * <p>telegram</p>
         */
        @NameInMap("Channel")
        public String channel;

        /**
         * <strong>example:</strong>
         * <p>announce</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <strong>example:</strong>
         * <p><a href="https://example.com/webhook">https://example.com/webhook</a></p>
         */
        @NameInMap("To")
        public String to;

        public static UpdatePolarClawCronJobResponseBodyJobDelivery build(java.util.Map<String, ?> map) throws Exception {
            UpdatePolarClawCronJobResponseBodyJobDelivery self = new UpdatePolarClawCronJobResponseBodyJobDelivery();
            return TeaModel.build(map, self);
        }

        public UpdatePolarClawCronJobResponseBodyJobDelivery setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public UpdatePolarClawCronJobResponseBodyJobDelivery setBestEffort(Boolean bestEffort) {
            this.bestEffort = bestEffort;
            return this;
        }
        public Boolean getBestEffort() {
            return this.bestEffort;
        }

        public UpdatePolarClawCronJobResponseBodyJobDelivery setChannel(String channel) {
            this.channel = channel;
            return this;
        }
        public String getChannel() {
            return this.channel;
        }

        public UpdatePolarClawCronJobResponseBodyJobDelivery setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public UpdatePolarClawCronJobResponseBodyJobDelivery setTo(String to) {
            this.to = to;
            return this;
        }
        public String getTo() {
            return this.to;
        }

    }

    public static class UpdatePolarClawCronJobResponseBodyJobPayload extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("BestEffortDeliver")
        public Boolean bestEffortDeliver;

        /**
         * <strong>example:</strong>
         * <p>telegram</p>
         */
        @NameInMap("Channel")
        public String channel;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Deliver")
        public Boolean deliver;

        /**
         * <strong>example:</strong>
         * <p>agentTurn</p>
         */
        @NameInMap("Kind")
        public String kind;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("LightContext")
        public Boolean lightContext;

        /**
         * <strong>example:</strong>
         * <p>Generate the daily report.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <strong>example:</strong>
         * <p>anthropic/sonnet-4.6</p>
         */
        @NameInMap("Model")
        public String model;

        /**
         * <strong>example:</strong>
         * <p>Generate the daily report.</p>
         */
        @NameInMap("Text")
        public String text;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TimeoutSeconds")
        public Integer timeoutSeconds;

        /**
         * <strong>example:</strong>
         * <p>team</p>
         */
        @NameInMap("To")
        public String to;

        public static UpdatePolarClawCronJobResponseBodyJobPayload build(java.util.Map<String, ?> map) throws Exception {
            UpdatePolarClawCronJobResponseBodyJobPayload self = new UpdatePolarClawCronJobResponseBodyJobPayload();
            return TeaModel.build(map, self);
        }

        public UpdatePolarClawCronJobResponseBodyJobPayload setBestEffortDeliver(Boolean bestEffortDeliver) {
            this.bestEffortDeliver = bestEffortDeliver;
            return this;
        }
        public Boolean getBestEffortDeliver() {
            return this.bestEffortDeliver;
        }

        public UpdatePolarClawCronJobResponseBodyJobPayload setChannel(String channel) {
            this.channel = channel;
            return this;
        }
        public String getChannel() {
            return this.channel;
        }

        public UpdatePolarClawCronJobResponseBodyJobPayload setDeliver(Boolean deliver) {
            this.deliver = deliver;
            return this;
        }
        public Boolean getDeliver() {
            return this.deliver;
        }

        public UpdatePolarClawCronJobResponseBodyJobPayload setKind(String kind) {
            this.kind = kind;
            return this;
        }
        public String getKind() {
            return this.kind;
        }

        public UpdatePolarClawCronJobResponseBodyJobPayload setLightContext(Boolean lightContext) {
            this.lightContext = lightContext;
            return this;
        }
        public Boolean getLightContext() {
            return this.lightContext;
        }

        public UpdatePolarClawCronJobResponseBodyJobPayload setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public UpdatePolarClawCronJobResponseBodyJobPayload setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public UpdatePolarClawCronJobResponseBodyJobPayload setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public UpdatePolarClawCronJobResponseBodyJobPayload setTimeoutSeconds(Integer timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }
        public Integer getTimeoutSeconds() {
            return this.timeoutSeconds;
        }

        public UpdatePolarClawCronJobResponseBodyJobPayload setTo(String to) {
            this.to = to;
            return this;
        }
        public String getTo() {
            return this.to;
        }

    }

    public static class UpdatePolarClawCronJobResponseBodyJobRunsUsage extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>30250</p>
         */
        @NameInMap("InputTokens")
        public Integer inputTokens;

        /**
         * <strong>example:</strong>
         * <p>30250</p>
         */
        @NameInMap("OutputTokens")
        public Integer outputTokens;

        /**
         * <strong>example:</strong>
         * <p>60500</p>
         */
        @NameInMap("TotalTokens")
        public Integer totalTokens;

        public static UpdatePolarClawCronJobResponseBodyJobRunsUsage build(java.util.Map<String, ?> map) throws Exception {
            UpdatePolarClawCronJobResponseBodyJobRunsUsage self = new UpdatePolarClawCronJobResponseBodyJobRunsUsage();
            return TeaModel.build(map, self);
        }

        public UpdatePolarClawCronJobResponseBodyJobRunsUsage setInputTokens(Integer inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Integer getInputTokens() {
            return this.inputTokens;
        }

        public UpdatePolarClawCronJobResponseBodyJobRunsUsage setOutputTokens(Integer outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Integer getOutputTokens() {
            return this.outputTokens;
        }

        public UpdatePolarClawCronJobResponseBodyJobRunsUsage setTotalTokens(Integer totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Integer getTotalTokens() {
            return this.totalTokens;
        }

    }

    public static class UpdatePolarClawCronJobResponseBodyJobRuns extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>finished</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Delivered")
        public Boolean delivered;

        /**
         * <strong>example:</strong>
         * <p>delivered</p>
         */
        @NameInMap("DeliveryStatus")
        public String deliveryStatus;

        /**
         * <strong>example:</strong>
         * <p>27586</p>
         */
        @NameInMap("DurationMs")
        public Long durationMs;

        /**
         * <strong>example:</strong>
         * <p>0ee00f56-f467-4d41-858c-ca4ede2c770e</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <strong>example:</strong>
         * <p>daily-report</p>
         */
        @NameInMap("JobName")
        public String jobName;

        /**
         * <strong>example:</strong>
         * <p>anthropic/sonnet-4.6</p>
         */
        @NameInMap("Model")
        public String model;

        /**
         * <strong>example:</strong>
         * <p>1777424400000</p>
         */
        @NameInMap("NextRunAtMs")
        public Long nextRunAtMs;

        /**
         * <strong>example:</strong>
         * <p>anthropic</p>
         */
        @NameInMap("Provider")
        public String provider;

        /**
         * <strong>example:</strong>
         * <p>1777370544931</p>
         */
        @NameInMap("RunAtMs")
        public Long runAtMs;

        /**
         * <strong>example:</strong>
         * <p>abc123</p>
         */
        @NameInMap("SessionId")
        public String sessionId;

        /**
         * <strong>example:</strong>
         * <p>ok</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>Report generated successfully.</p>
         */
        @NameInMap("Summary")
        public String summary;

        /**
         * <strong>example:</strong>
         * <p>1777370572518</p>
         */
        @NameInMap("Ts")
        public Long ts;

        @NameInMap("Usage")
        public UpdatePolarClawCronJobResponseBodyJobRunsUsage usage;

        public static UpdatePolarClawCronJobResponseBodyJobRuns build(java.util.Map<String, ?> map) throws Exception {
            UpdatePolarClawCronJobResponseBodyJobRuns self = new UpdatePolarClawCronJobResponseBodyJobRuns();
            return TeaModel.build(map, self);
        }

        public UpdatePolarClawCronJobResponseBodyJobRuns setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public UpdatePolarClawCronJobResponseBodyJobRuns setDelivered(Boolean delivered) {
            this.delivered = delivered;
            return this;
        }
        public Boolean getDelivered() {
            return this.delivered;
        }

        public UpdatePolarClawCronJobResponseBodyJobRuns setDeliveryStatus(String deliveryStatus) {
            this.deliveryStatus = deliveryStatus;
            return this;
        }
        public String getDeliveryStatus() {
            return this.deliveryStatus;
        }

        public UpdatePolarClawCronJobResponseBodyJobRuns setDurationMs(Long durationMs) {
            this.durationMs = durationMs;
            return this;
        }
        public Long getDurationMs() {
            return this.durationMs;
        }

        public UpdatePolarClawCronJobResponseBodyJobRuns setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public UpdatePolarClawCronJobResponseBodyJobRuns setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public UpdatePolarClawCronJobResponseBodyJobRuns setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public UpdatePolarClawCronJobResponseBodyJobRuns setNextRunAtMs(Long nextRunAtMs) {
            this.nextRunAtMs = nextRunAtMs;
            return this;
        }
        public Long getNextRunAtMs() {
            return this.nextRunAtMs;
        }

        public UpdatePolarClawCronJobResponseBodyJobRuns setProvider(String provider) {
            this.provider = provider;
            return this;
        }
        public String getProvider() {
            return this.provider;
        }

        public UpdatePolarClawCronJobResponseBodyJobRuns setRunAtMs(Long runAtMs) {
            this.runAtMs = runAtMs;
            return this;
        }
        public Long getRunAtMs() {
            return this.runAtMs;
        }

        public UpdatePolarClawCronJobResponseBodyJobRuns setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public UpdatePolarClawCronJobResponseBodyJobRuns setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public UpdatePolarClawCronJobResponseBodyJobRuns setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public UpdatePolarClawCronJobResponseBodyJobRuns setTs(Long ts) {
            this.ts = ts;
            return this;
        }
        public Long getTs() {
            return this.ts;
        }

        public UpdatePolarClawCronJobResponseBodyJobRuns setUsage(UpdatePolarClawCronJobResponseBodyJobRunsUsage usage) {
            this.usage = usage;
            return this;
        }
        public UpdatePolarClawCronJobResponseBodyJobRunsUsage getUsage() {
            return this.usage;
        }

    }

    public static class UpdatePolarClawCronJobResponseBodyJobSchedule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1777370572518</p>
         */
        @NameInMap("AnchorMs")
        public Long anchorMs;

        /**
         * <strong>example:</strong>
         * <p>2026-04-10T09:00:00+08:00</p>
         */
        @NameInMap("At")
        public String at;

        /**
         * <strong>example:</strong>
         * <p>100000</p>
         */
        @NameInMap("EveryMs")
        public Long everyMs;

        /**
         * <strong>example:</strong>
         * <p>0 9 * * *</p>
         */
        @NameInMap("Expr")
        public String expr;

        /**
         * <strong>example:</strong>
         * <p>cron</p>
         */
        @NameInMap("Kind")
        public String kind;

        /**
         * <strong>example:</strong>
         * <p>Asia/Shanghai</p>
         */
        @NameInMap("Tz")
        public String tz;

        public static UpdatePolarClawCronJobResponseBodyJobSchedule build(java.util.Map<String, ?> map) throws Exception {
            UpdatePolarClawCronJobResponseBodyJobSchedule self = new UpdatePolarClawCronJobResponseBodyJobSchedule();
            return TeaModel.build(map, self);
        }

        public UpdatePolarClawCronJobResponseBodyJobSchedule setAnchorMs(Long anchorMs) {
            this.anchorMs = anchorMs;
            return this;
        }
        public Long getAnchorMs() {
            return this.anchorMs;
        }

        public UpdatePolarClawCronJobResponseBodyJobSchedule setAt(String at) {
            this.at = at;
            return this;
        }
        public String getAt() {
            return this.at;
        }

        public UpdatePolarClawCronJobResponseBodyJobSchedule setEveryMs(Long everyMs) {
            this.everyMs = everyMs;
            return this;
        }
        public Long getEveryMs() {
            return this.everyMs;
        }

        public UpdatePolarClawCronJobResponseBodyJobSchedule setExpr(String expr) {
            this.expr = expr;
            return this;
        }
        public String getExpr() {
            return this.expr;
        }

        public UpdatePolarClawCronJobResponseBodyJobSchedule setKind(String kind) {
            this.kind = kind;
            return this;
        }
        public String getKind() {
            return this.kind;
        }

        public UpdatePolarClawCronJobResponseBodyJobSchedule setTz(String tz) {
            this.tz = tz;
            return this;
        }
        public String getTz() {
            return this.tz;
        }

    }

    public static class UpdatePolarClawCronJobResponseBodyJobState extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ConsecutiveErrors")
        public Integer consecutiveErrors;

        /**
         * <strong>example:</strong>
         * <p>1777370544931</p>
         */
        @NameInMap("LastRunAtMs")
        public Long lastRunAtMs;

        /**
         * <strong>example:</strong>
         * <p>ok</p>
         */
        @NameInMap("LastRunStatus")
        public String lastRunStatus;

        /**
         * <strong>example:</strong>
         * <p>1777424400000</p>
         */
        @NameInMap("NextRunAtMs")
        public Long nextRunAtMs;

        public static UpdatePolarClawCronJobResponseBodyJobState build(java.util.Map<String, ?> map) throws Exception {
            UpdatePolarClawCronJobResponseBodyJobState self = new UpdatePolarClawCronJobResponseBodyJobState();
            return TeaModel.build(map, self);
        }

        public UpdatePolarClawCronJobResponseBodyJobState setConsecutiveErrors(Integer consecutiveErrors) {
            this.consecutiveErrors = consecutiveErrors;
            return this;
        }
        public Integer getConsecutiveErrors() {
            return this.consecutiveErrors;
        }

        public UpdatePolarClawCronJobResponseBodyJobState setLastRunAtMs(Long lastRunAtMs) {
            this.lastRunAtMs = lastRunAtMs;
            return this;
        }
        public Long getLastRunAtMs() {
            return this.lastRunAtMs;
        }

        public UpdatePolarClawCronJobResponseBodyJobState setLastRunStatus(String lastRunStatus) {
            this.lastRunStatus = lastRunStatus;
            return this;
        }
        public String getLastRunStatus() {
            return this.lastRunStatus;
        }

        public UpdatePolarClawCronJobResponseBodyJobState setNextRunAtMs(Long nextRunAtMs) {
            this.nextRunAtMs = nextRunAtMs;
            return this;
        }
        public Long getNextRunAtMs() {
            return this.nextRunAtMs;
        }

    }

    public static class UpdatePolarClawCronJobResponseBodyJob extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>work</p>
         */
        @NameInMap("AgentId")
        public String agentId;

        /**
         * <strong>example:</strong>
         * <p>1777368967284</p>
         */
        @NameInMap("CreatedAtMs")
        public Long createdAtMs;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("DeleteAfterRun")
        public Boolean deleteAfterRun;

        @NameInMap("Delivery")
        public UpdatePolarClawCronJobResponseBodyJobDelivery delivery;

        /**
         * <strong>example:</strong>
         * <p>Daily report generation</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <strong>example:</strong>
         * <p>0ee00f56-f467-4d41-858c-ca4ede2c770e</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>daily-report</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("Payload")
        public UpdatePolarClawCronJobResponseBodyJobPayload payload;

        @NameInMap("Runs")
        public java.util.List<UpdatePolarClawCronJobResponseBodyJobRuns> runs;

        @NameInMap("Schedule")
        public UpdatePolarClawCronJobResponseBodyJobSchedule schedule;

        /**
         * <strong>example:</strong>
         * <p>abc123</p>
         */
        @NameInMap("SessionKey")
        public String sessionKey;

        /**
         * <strong>example:</strong>
         * <p>main</p>
         */
        @NameInMap("SessionTarget")
        public String sessionTarget;

        @NameInMap("State")
        public UpdatePolarClawCronJobResponseBodyJobState state;

        /**
         * <strong>example:</strong>
         * <p>1777370572517</p>
         */
        @NameInMap("UpdatedAtMs")
        public Long updatedAtMs;

        /**
         * <strong>example:</strong>
         * <p>now</p>
         */
        @NameInMap("WakeMode")
        public String wakeMode;

        public static UpdatePolarClawCronJobResponseBodyJob build(java.util.Map<String, ?> map) throws Exception {
            UpdatePolarClawCronJobResponseBodyJob self = new UpdatePolarClawCronJobResponseBodyJob();
            return TeaModel.build(map, self);
        }

        public UpdatePolarClawCronJobResponseBodyJob setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public UpdatePolarClawCronJobResponseBodyJob setCreatedAtMs(Long createdAtMs) {
            this.createdAtMs = createdAtMs;
            return this;
        }
        public Long getCreatedAtMs() {
            return this.createdAtMs;
        }

        public UpdatePolarClawCronJobResponseBodyJob setDeleteAfterRun(Boolean deleteAfterRun) {
            this.deleteAfterRun = deleteAfterRun;
            return this;
        }
        public Boolean getDeleteAfterRun() {
            return this.deleteAfterRun;
        }

        public UpdatePolarClawCronJobResponseBodyJob setDelivery(UpdatePolarClawCronJobResponseBodyJobDelivery delivery) {
            this.delivery = delivery;
            return this;
        }
        public UpdatePolarClawCronJobResponseBodyJobDelivery getDelivery() {
            return this.delivery;
        }

        public UpdatePolarClawCronJobResponseBodyJob setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdatePolarClawCronJobResponseBodyJob setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public UpdatePolarClawCronJobResponseBodyJob setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpdatePolarClawCronJobResponseBodyJob setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdatePolarClawCronJobResponseBodyJob setPayload(UpdatePolarClawCronJobResponseBodyJobPayload payload) {
            this.payload = payload;
            return this;
        }
        public UpdatePolarClawCronJobResponseBodyJobPayload getPayload() {
            return this.payload;
        }

        public UpdatePolarClawCronJobResponseBodyJob setRuns(java.util.List<UpdatePolarClawCronJobResponseBodyJobRuns> runs) {
            this.runs = runs;
            return this;
        }
        public java.util.List<UpdatePolarClawCronJobResponseBodyJobRuns> getRuns() {
            return this.runs;
        }

        public UpdatePolarClawCronJobResponseBodyJob setSchedule(UpdatePolarClawCronJobResponseBodyJobSchedule schedule) {
            this.schedule = schedule;
            return this;
        }
        public UpdatePolarClawCronJobResponseBodyJobSchedule getSchedule() {
            return this.schedule;
        }

        public UpdatePolarClawCronJobResponseBodyJob setSessionKey(String sessionKey) {
            this.sessionKey = sessionKey;
            return this;
        }
        public String getSessionKey() {
            return this.sessionKey;
        }

        public UpdatePolarClawCronJobResponseBodyJob setSessionTarget(String sessionTarget) {
            this.sessionTarget = sessionTarget;
            return this;
        }
        public String getSessionTarget() {
            return this.sessionTarget;
        }

        public UpdatePolarClawCronJobResponseBodyJob setState(UpdatePolarClawCronJobResponseBodyJobState state) {
            this.state = state;
            return this;
        }
        public UpdatePolarClawCronJobResponseBodyJobState getState() {
            return this.state;
        }

        public UpdatePolarClawCronJobResponseBodyJob setUpdatedAtMs(Long updatedAtMs) {
            this.updatedAtMs = updatedAtMs;
            return this;
        }
        public Long getUpdatedAtMs() {
            return this.updatedAtMs;
        }

        public UpdatePolarClawCronJobResponseBodyJob setWakeMode(String wakeMode) {
            this.wakeMode = wakeMode;
            return this;
        }
        public String getWakeMode() {
            return this.wakeMode;
        }

    }

}
