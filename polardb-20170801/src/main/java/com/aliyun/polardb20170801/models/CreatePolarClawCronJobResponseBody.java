// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreatePolarClawCronJobResponseBody extends TeaModel {
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
    public CreatePolarClawCronJobResponseBodyJob job;

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
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("RanImmediately")
    public Boolean ranImmediately;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>6BD9CDE4-5E7B-4BF3-9BB8-83C73E******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreatePolarClawCronJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePolarClawCronJobResponseBody self = new CreatePolarClawCronJobResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePolarClawCronJobResponseBody setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public CreatePolarClawCronJobResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CreatePolarClawCronJobResponseBody setJob(CreatePolarClawCronJobResponseBodyJob job) {
        this.job = job;
        return this;
    }
    public CreatePolarClawCronJobResponseBodyJob getJob() {
        return this.job;
    }

    public CreatePolarClawCronJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreatePolarClawCronJobResponseBody setOk(Boolean ok) {
        this.ok = ok;
        return this;
    }
    public Boolean getOk() {
        return this.ok;
    }

    public CreatePolarClawCronJobResponseBody setRanImmediately(Boolean ranImmediately) {
        this.ranImmediately = ranImmediately;
        return this;
    }
    public Boolean getRanImmediately() {
        return this.ranImmediately;
    }

    public CreatePolarClawCronJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreatePolarClawCronJobResponseBodyJobDelivery extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("BestEffort")
        public Boolean bestEffort;

        /**
         * <strong>example:</strong>
         * <p>feishu</p>
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
         * <p>ou_***</p>
         */
        @NameInMap("To")
        public String to;

        public static CreatePolarClawCronJobResponseBodyJobDelivery build(java.util.Map<String, ?> map) throws Exception {
            CreatePolarClawCronJobResponseBodyJobDelivery self = new CreatePolarClawCronJobResponseBodyJobDelivery();
            return TeaModel.build(map, self);
        }

        public CreatePolarClawCronJobResponseBodyJobDelivery setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public CreatePolarClawCronJobResponseBodyJobDelivery setBestEffort(Boolean bestEffort) {
            this.bestEffort = bestEffort;
            return this;
        }
        public Boolean getBestEffort() {
            return this.bestEffort;
        }

        public CreatePolarClawCronJobResponseBodyJobDelivery setChannel(String channel) {
            this.channel = channel;
            return this;
        }
        public String getChannel() {
            return this.channel;
        }

        public CreatePolarClawCronJobResponseBodyJobDelivery setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public CreatePolarClawCronJobResponseBodyJobDelivery setTo(String to) {
            this.to = to;
            return this;
        }
        public String getTo() {
            return this.to;
        }

    }

    public static class CreatePolarClawCronJobResponseBodyJobPayload extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("BestEffortDeliver")
        public Boolean bestEffortDeliver;

        /**
         * <strong>example:</strong>
         * <p>feishu</p>
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
         * <p>bailian/qwen3.5-plus</p>
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
         * <p>ou_***</p>
         */
        @NameInMap("To")
        public String to;

        public static CreatePolarClawCronJobResponseBodyJobPayload build(java.util.Map<String, ?> map) throws Exception {
            CreatePolarClawCronJobResponseBodyJobPayload self = new CreatePolarClawCronJobResponseBodyJobPayload();
            return TeaModel.build(map, self);
        }

        public CreatePolarClawCronJobResponseBodyJobPayload setBestEffortDeliver(Boolean bestEffortDeliver) {
            this.bestEffortDeliver = bestEffortDeliver;
            return this;
        }
        public Boolean getBestEffortDeliver() {
            return this.bestEffortDeliver;
        }

        public CreatePolarClawCronJobResponseBodyJobPayload setChannel(String channel) {
            this.channel = channel;
            return this;
        }
        public String getChannel() {
            return this.channel;
        }

        public CreatePolarClawCronJobResponseBodyJobPayload setDeliver(Boolean deliver) {
            this.deliver = deliver;
            return this;
        }
        public Boolean getDeliver() {
            return this.deliver;
        }

        public CreatePolarClawCronJobResponseBodyJobPayload setKind(String kind) {
            this.kind = kind;
            return this;
        }
        public String getKind() {
            return this.kind;
        }

        public CreatePolarClawCronJobResponseBodyJobPayload setLightContext(Boolean lightContext) {
            this.lightContext = lightContext;
            return this;
        }
        public Boolean getLightContext() {
            return this.lightContext;
        }

        public CreatePolarClawCronJobResponseBodyJobPayload setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public CreatePolarClawCronJobResponseBodyJobPayload setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public CreatePolarClawCronJobResponseBodyJobPayload setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public CreatePolarClawCronJobResponseBodyJobPayload setTimeoutSeconds(Integer timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }
        public Integer getTimeoutSeconds() {
            return this.timeoutSeconds;
        }

        public CreatePolarClawCronJobResponseBodyJobPayload setTo(String to) {
            this.to = to;
            return this;
        }
        public String getTo() {
            return this.to;
        }

    }

    public static class CreatePolarClawCronJobResponseBodyJobRunsUsage extends TeaModel {
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

        public static CreatePolarClawCronJobResponseBodyJobRunsUsage build(java.util.Map<String, ?> map) throws Exception {
            CreatePolarClawCronJobResponseBodyJobRunsUsage self = new CreatePolarClawCronJobResponseBodyJobRunsUsage();
            return TeaModel.build(map, self);
        }

        public CreatePolarClawCronJobResponseBodyJobRunsUsage setInputTokens(Integer inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Integer getInputTokens() {
            return this.inputTokens;
        }

        public CreatePolarClawCronJobResponseBodyJobRunsUsage setOutputTokens(Integer outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Integer getOutputTokens() {
            return this.outputTokens;
        }

        public CreatePolarClawCronJobResponseBodyJobRunsUsage setTotalTokens(Integer totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Integer getTotalTokens() {
            return this.totalTokens;
        }

    }

    public static class CreatePolarClawCronJobResponseBodyJobRuns extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>finished</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Delivered")
        public Boolean delivered;

        /**
         * <strong>example:</strong>
         * <p>not-requested</p>
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
         * <p>f83f5278-1abe-40a6-b10e-ad3ecdc05de2</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("JobName")
        public String jobName;

        /**
         * <strong>example:</strong>
         * <p>bailian/qwen3.5-plus</p>
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
         * <p>bailian</p>
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
         * <hr>
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
         * <p>Generate the daily report.</p>
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
        public CreatePolarClawCronJobResponseBodyJobRunsUsage usage;

        public static CreatePolarClawCronJobResponseBodyJobRuns build(java.util.Map<String, ?> map) throws Exception {
            CreatePolarClawCronJobResponseBodyJobRuns self = new CreatePolarClawCronJobResponseBodyJobRuns();
            return TeaModel.build(map, self);
        }

        public CreatePolarClawCronJobResponseBodyJobRuns setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public CreatePolarClawCronJobResponseBodyJobRuns setDelivered(Boolean delivered) {
            this.delivered = delivered;
            return this;
        }
        public Boolean getDelivered() {
            return this.delivered;
        }

        public CreatePolarClawCronJobResponseBodyJobRuns setDeliveryStatus(String deliveryStatus) {
            this.deliveryStatus = deliveryStatus;
            return this;
        }
        public String getDeliveryStatus() {
            return this.deliveryStatus;
        }

        public CreatePolarClawCronJobResponseBodyJobRuns setDurationMs(Long durationMs) {
            this.durationMs = durationMs;
            return this;
        }
        public Long getDurationMs() {
            return this.durationMs;
        }

        public CreatePolarClawCronJobResponseBodyJobRuns setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public CreatePolarClawCronJobResponseBodyJobRuns setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public CreatePolarClawCronJobResponseBodyJobRuns setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public CreatePolarClawCronJobResponseBodyJobRuns setNextRunAtMs(Long nextRunAtMs) {
            this.nextRunAtMs = nextRunAtMs;
            return this;
        }
        public Long getNextRunAtMs() {
            return this.nextRunAtMs;
        }

        public CreatePolarClawCronJobResponseBodyJobRuns setProvider(String provider) {
            this.provider = provider;
            return this;
        }
        public String getProvider() {
            return this.provider;
        }

        public CreatePolarClawCronJobResponseBodyJobRuns setRunAtMs(Long runAtMs) {
            this.runAtMs = runAtMs;
            return this;
        }
        public Long getRunAtMs() {
            return this.runAtMs;
        }

        public CreatePolarClawCronJobResponseBodyJobRuns setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public CreatePolarClawCronJobResponseBodyJobRuns setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreatePolarClawCronJobResponseBodyJobRuns setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public CreatePolarClawCronJobResponseBodyJobRuns setTs(Long ts) {
            this.ts = ts;
            return this;
        }
        public Long getTs() {
            return this.ts;
        }

        public CreatePolarClawCronJobResponseBodyJobRuns setUsage(CreatePolarClawCronJobResponseBodyJobRunsUsage usage) {
            this.usage = usage;
            return this;
        }
        public CreatePolarClawCronJobResponseBodyJobRunsUsage getUsage() {
            return this.usage;
        }

    }

    public static class CreatePolarClawCronJobResponseBodyJobSchedule extends TeaModel {
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
         * <p>1000</p>
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

        public static CreatePolarClawCronJobResponseBodyJobSchedule build(java.util.Map<String, ?> map) throws Exception {
            CreatePolarClawCronJobResponseBodyJobSchedule self = new CreatePolarClawCronJobResponseBodyJobSchedule();
            return TeaModel.build(map, self);
        }

        public CreatePolarClawCronJobResponseBodyJobSchedule setAnchorMs(Long anchorMs) {
            this.anchorMs = anchorMs;
            return this;
        }
        public Long getAnchorMs() {
            return this.anchorMs;
        }

        public CreatePolarClawCronJobResponseBodyJobSchedule setAt(String at) {
            this.at = at;
            return this;
        }
        public String getAt() {
            return this.at;
        }

        public CreatePolarClawCronJobResponseBodyJobSchedule setEveryMs(Long everyMs) {
            this.everyMs = everyMs;
            return this;
        }
        public Long getEveryMs() {
            return this.everyMs;
        }

        public CreatePolarClawCronJobResponseBodyJobSchedule setExpr(String expr) {
            this.expr = expr;
            return this;
        }
        public String getExpr() {
            return this.expr;
        }

        public CreatePolarClawCronJobResponseBodyJobSchedule setKind(String kind) {
            this.kind = kind;
            return this;
        }
        public String getKind() {
            return this.kind;
        }

        public CreatePolarClawCronJobResponseBodyJobSchedule setTz(String tz) {
            this.tz = tz;
            return this;
        }
        public String getTz() {
            return this.tz;
        }

    }

    public static class CreatePolarClawCronJobResponseBodyJobState extends TeaModel {
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

        public static CreatePolarClawCronJobResponseBodyJobState build(java.util.Map<String, ?> map) throws Exception {
            CreatePolarClawCronJobResponseBodyJobState self = new CreatePolarClawCronJobResponseBodyJobState();
            return TeaModel.build(map, self);
        }

        public CreatePolarClawCronJobResponseBodyJobState setConsecutiveErrors(Integer consecutiveErrors) {
            this.consecutiveErrors = consecutiveErrors;
            return this;
        }
        public Integer getConsecutiveErrors() {
            return this.consecutiveErrors;
        }

        public CreatePolarClawCronJobResponseBodyJobState setLastRunAtMs(Long lastRunAtMs) {
            this.lastRunAtMs = lastRunAtMs;
            return this;
        }
        public Long getLastRunAtMs() {
            return this.lastRunAtMs;
        }

        public CreatePolarClawCronJobResponseBodyJobState setLastRunStatus(String lastRunStatus) {
            this.lastRunStatus = lastRunStatus;
            return this;
        }
        public String getLastRunStatus() {
            return this.lastRunStatus;
        }

        public CreatePolarClawCronJobResponseBodyJobState setNextRunAtMs(Long nextRunAtMs) {
            this.nextRunAtMs = nextRunAtMs;
            return this;
        }
        public Long getNextRunAtMs() {
            return this.nextRunAtMs;
        }

    }

    public static class CreatePolarClawCronJobResponseBodyJob extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>main</p>
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
        public CreatePolarClawCronJobResponseBodyJobDelivery delivery;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <strong>example:</strong>
         * <p>e2c57423-12f0-45cc-a387-6155168b3201</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("Payload")
        public CreatePolarClawCronJobResponseBodyJobPayload payload;

        @NameInMap("Runs")
        public java.util.List<CreatePolarClawCronJobResponseBodyJobRuns> runs;

        @NameInMap("Schedule")
        public CreatePolarClawCronJobResponseBodyJobSchedule schedule;

        /**
         * <strong>example:</strong>
         * <p>agent:main:feishu:direct:***</p>
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
        public CreatePolarClawCronJobResponseBodyJobState state;

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

        public static CreatePolarClawCronJobResponseBodyJob build(java.util.Map<String, ?> map) throws Exception {
            CreatePolarClawCronJobResponseBodyJob self = new CreatePolarClawCronJobResponseBodyJob();
            return TeaModel.build(map, self);
        }

        public CreatePolarClawCronJobResponseBodyJob setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public CreatePolarClawCronJobResponseBodyJob setCreatedAtMs(Long createdAtMs) {
            this.createdAtMs = createdAtMs;
            return this;
        }
        public Long getCreatedAtMs() {
            return this.createdAtMs;
        }

        public CreatePolarClawCronJobResponseBodyJob setDeleteAfterRun(Boolean deleteAfterRun) {
            this.deleteAfterRun = deleteAfterRun;
            return this;
        }
        public Boolean getDeleteAfterRun() {
            return this.deleteAfterRun;
        }

        public CreatePolarClawCronJobResponseBodyJob setDelivery(CreatePolarClawCronJobResponseBodyJobDelivery delivery) {
            this.delivery = delivery;
            return this;
        }
        public CreatePolarClawCronJobResponseBodyJobDelivery getDelivery() {
            return this.delivery;
        }

        public CreatePolarClawCronJobResponseBodyJob setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreatePolarClawCronJobResponseBodyJob setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public CreatePolarClawCronJobResponseBodyJob setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreatePolarClawCronJobResponseBodyJob setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreatePolarClawCronJobResponseBodyJob setPayload(CreatePolarClawCronJobResponseBodyJobPayload payload) {
            this.payload = payload;
            return this;
        }
        public CreatePolarClawCronJobResponseBodyJobPayload getPayload() {
            return this.payload;
        }

        public CreatePolarClawCronJobResponseBodyJob setRuns(java.util.List<CreatePolarClawCronJobResponseBodyJobRuns> runs) {
            this.runs = runs;
            return this;
        }
        public java.util.List<CreatePolarClawCronJobResponseBodyJobRuns> getRuns() {
            return this.runs;
        }

        public CreatePolarClawCronJobResponseBodyJob setSchedule(CreatePolarClawCronJobResponseBodyJobSchedule schedule) {
            this.schedule = schedule;
            return this;
        }
        public CreatePolarClawCronJobResponseBodyJobSchedule getSchedule() {
            return this.schedule;
        }

        public CreatePolarClawCronJobResponseBodyJob setSessionKey(String sessionKey) {
            this.sessionKey = sessionKey;
            return this;
        }
        public String getSessionKey() {
            return this.sessionKey;
        }

        public CreatePolarClawCronJobResponseBodyJob setSessionTarget(String sessionTarget) {
            this.sessionTarget = sessionTarget;
            return this;
        }
        public String getSessionTarget() {
            return this.sessionTarget;
        }

        public CreatePolarClawCronJobResponseBodyJob setState(CreatePolarClawCronJobResponseBodyJobState state) {
            this.state = state;
            return this;
        }
        public CreatePolarClawCronJobResponseBodyJobState getState() {
            return this.state;
        }

        public CreatePolarClawCronJobResponseBodyJob setUpdatedAtMs(Long updatedAtMs) {
            this.updatedAtMs = updatedAtMs;
            return this;
        }
        public Long getUpdatedAtMs() {
            return this.updatedAtMs;
        }

        public CreatePolarClawCronJobResponseBodyJob setWakeMode(String wakeMode) {
            this.wakeMode = wakeMode;
            return this;
        }
        public String getWakeMode() {
            return this.wakeMode;
        }

    }

}
