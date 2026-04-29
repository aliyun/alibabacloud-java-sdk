// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribePolarClawCronJobsResponseBody extends TeaModel {
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

    @NameInMap("Jobs")
    public java.util.List<DescribePolarClawCronJobsResponseBodyJobs> jobs;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>2281C6C9-CBAB-1AFD-8400-670750CF6025_2212</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static DescribePolarClawCronJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePolarClawCronJobsResponseBody self = new DescribePolarClawCronJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePolarClawCronJobsResponseBody setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public DescribePolarClawCronJobsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribePolarClawCronJobsResponseBody setJobs(java.util.List<DescribePolarClawCronJobsResponseBodyJobs> jobs) {
        this.jobs = jobs;
        return this;
    }
    public java.util.List<DescribePolarClawCronJobsResponseBodyJobs> getJobs() {
        return this.jobs;
    }

    public DescribePolarClawCronJobsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribePolarClawCronJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePolarClawCronJobsResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class DescribePolarClawCronJobsResponseBodyJobsDelivery extends TeaModel {
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

        public static DescribePolarClawCronJobsResponseBodyJobsDelivery build(java.util.Map<String, ?> map) throws Exception {
            DescribePolarClawCronJobsResponseBodyJobsDelivery self = new DescribePolarClawCronJobsResponseBodyJobsDelivery();
            return TeaModel.build(map, self);
        }

        public DescribePolarClawCronJobsResponseBodyJobsDelivery setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public DescribePolarClawCronJobsResponseBodyJobsDelivery setBestEffort(Boolean bestEffort) {
            this.bestEffort = bestEffort;
            return this;
        }
        public Boolean getBestEffort() {
            return this.bestEffort;
        }

        public DescribePolarClawCronJobsResponseBodyJobsDelivery setChannel(String channel) {
            this.channel = channel;
            return this;
        }
        public String getChannel() {
            return this.channel;
        }

        public DescribePolarClawCronJobsResponseBodyJobsDelivery setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public DescribePolarClawCronJobsResponseBodyJobsDelivery setTo(String to) {
            this.to = to;
            return this;
        }
        public String getTo() {
            return this.to;
        }

    }

    public static class DescribePolarClawCronJobsResponseBodyJobsPayload extends TeaModel {
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
         * <p>true</p>
         */
        @NameInMap("Deliver")
        public Boolean deliver;

        /**
         * <strong>example:</strong>
         * <p>systemEvent</p>
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

        public static DescribePolarClawCronJobsResponseBodyJobsPayload build(java.util.Map<String, ?> map) throws Exception {
            DescribePolarClawCronJobsResponseBodyJobsPayload self = new DescribePolarClawCronJobsResponseBodyJobsPayload();
            return TeaModel.build(map, self);
        }

        public DescribePolarClawCronJobsResponseBodyJobsPayload setBestEffortDeliver(Boolean bestEffortDeliver) {
            this.bestEffortDeliver = bestEffortDeliver;
            return this;
        }
        public Boolean getBestEffortDeliver() {
            return this.bestEffortDeliver;
        }

        public DescribePolarClawCronJobsResponseBodyJobsPayload setChannel(String channel) {
            this.channel = channel;
            return this;
        }
        public String getChannel() {
            return this.channel;
        }

        public DescribePolarClawCronJobsResponseBodyJobsPayload setDeliver(Boolean deliver) {
            this.deliver = deliver;
            return this;
        }
        public Boolean getDeliver() {
            return this.deliver;
        }

        public DescribePolarClawCronJobsResponseBodyJobsPayload setKind(String kind) {
            this.kind = kind;
            return this;
        }
        public String getKind() {
            return this.kind;
        }

        public DescribePolarClawCronJobsResponseBodyJobsPayload setLightContext(Boolean lightContext) {
            this.lightContext = lightContext;
            return this;
        }
        public Boolean getLightContext() {
            return this.lightContext;
        }

        public DescribePolarClawCronJobsResponseBodyJobsPayload setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribePolarClawCronJobsResponseBodyJobsPayload setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public DescribePolarClawCronJobsResponseBodyJobsPayload setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public DescribePolarClawCronJobsResponseBodyJobsPayload setTimeoutSeconds(Integer timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }
        public Integer getTimeoutSeconds() {
            return this.timeoutSeconds;
        }

        public DescribePolarClawCronJobsResponseBodyJobsPayload setTo(String to) {
            this.to = to;
            return this;
        }
        public String getTo() {
            return this.to;
        }

    }

    public static class DescribePolarClawCronJobsResponseBodyJobsRunsUsage extends TeaModel {
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

        public static DescribePolarClawCronJobsResponseBodyJobsRunsUsage build(java.util.Map<String, ?> map) throws Exception {
            DescribePolarClawCronJobsResponseBodyJobsRunsUsage self = new DescribePolarClawCronJobsResponseBodyJobsRunsUsage();
            return TeaModel.build(map, self);
        }

        public DescribePolarClawCronJobsResponseBodyJobsRunsUsage setInputTokens(Integer inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Integer getInputTokens() {
            return this.inputTokens;
        }

        public DescribePolarClawCronJobsResponseBodyJobsRunsUsage setOutputTokens(Integer outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Integer getOutputTokens() {
            return this.outputTokens;
        }

        public DescribePolarClawCronJobsResponseBodyJobsRunsUsage setTotalTokens(Integer totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Integer getTotalTokens() {
            return this.totalTokens;
        }

    }

    public static class DescribePolarClawCronJobsResponseBodyJobsRuns extends TeaModel {
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
        public DescribePolarClawCronJobsResponseBodyJobsRunsUsage usage;

        public static DescribePolarClawCronJobsResponseBodyJobsRuns build(java.util.Map<String, ?> map) throws Exception {
            DescribePolarClawCronJobsResponseBodyJobsRuns self = new DescribePolarClawCronJobsResponseBodyJobsRuns();
            return TeaModel.build(map, self);
        }

        public DescribePolarClawCronJobsResponseBodyJobsRuns setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public DescribePolarClawCronJobsResponseBodyJobsRuns setDelivered(Boolean delivered) {
            this.delivered = delivered;
            return this;
        }
        public Boolean getDelivered() {
            return this.delivered;
        }

        public DescribePolarClawCronJobsResponseBodyJobsRuns setDeliveryStatus(String deliveryStatus) {
            this.deliveryStatus = deliveryStatus;
            return this;
        }
        public String getDeliveryStatus() {
            return this.deliveryStatus;
        }

        public DescribePolarClawCronJobsResponseBodyJobsRuns setDurationMs(Long durationMs) {
            this.durationMs = durationMs;
            return this;
        }
        public Long getDurationMs() {
            return this.durationMs;
        }

        public DescribePolarClawCronJobsResponseBodyJobsRuns setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public DescribePolarClawCronJobsResponseBodyJobsRuns setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public DescribePolarClawCronJobsResponseBodyJobsRuns setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public DescribePolarClawCronJobsResponseBodyJobsRuns setNextRunAtMs(Long nextRunAtMs) {
            this.nextRunAtMs = nextRunAtMs;
            return this;
        }
        public Long getNextRunAtMs() {
            return this.nextRunAtMs;
        }

        public DescribePolarClawCronJobsResponseBodyJobsRuns setProvider(String provider) {
            this.provider = provider;
            return this;
        }
        public String getProvider() {
            return this.provider;
        }

        public DescribePolarClawCronJobsResponseBodyJobsRuns setRunAtMs(Long runAtMs) {
            this.runAtMs = runAtMs;
            return this;
        }
        public Long getRunAtMs() {
            return this.runAtMs;
        }

        public DescribePolarClawCronJobsResponseBodyJobsRuns setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public DescribePolarClawCronJobsResponseBodyJobsRuns setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribePolarClawCronJobsResponseBodyJobsRuns setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public DescribePolarClawCronJobsResponseBodyJobsRuns setTs(Long ts) {
            this.ts = ts;
            return this;
        }
        public Long getTs() {
            return this.ts;
        }

        public DescribePolarClawCronJobsResponseBodyJobsRuns setUsage(DescribePolarClawCronJobsResponseBodyJobsRunsUsage usage) {
            this.usage = usage;
            return this;
        }
        public DescribePolarClawCronJobsResponseBodyJobsRunsUsage getUsage() {
            return this.usage;
        }

    }

    public static class DescribePolarClawCronJobsResponseBodyJobsSchedule extends TeaModel {
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

        public static DescribePolarClawCronJobsResponseBodyJobsSchedule build(java.util.Map<String, ?> map) throws Exception {
            DescribePolarClawCronJobsResponseBodyJobsSchedule self = new DescribePolarClawCronJobsResponseBodyJobsSchedule();
            return TeaModel.build(map, self);
        }

        public DescribePolarClawCronJobsResponseBodyJobsSchedule setAnchorMs(Long anchorMs) {
            this.anchorMs = anchorMs;
            return this;
        }
        public Long getAnchorMs() {
            return this.anchorMs;
        }

        public DescribePolarClawCronJobsResponseBodyJobsSchedule setAt(String at) {
            this.at = at;
            return this;
        }
        public String getAt() {
            return this.at;
        }

        public DescribePolarClawCronJobsResponseBodyJobsSchedule setEveryMs(Long everyMs) {
            this.everyMs = everyMs;
            return this;
        }
        public Long getEveryMs() {
            return this.everyMs;
        }

        public DescribePolarClawCronJobsResponseBodyJobsSchedule setExpr(String expr) {
            this.expr = expr;
            return this;
        }
        public String getExpr() {
            return this.expr;
        }

        public DescribePolarClawCronJobsResponseBodyJobsSchedule setKind(String kind) {
            this.kind = kind;
            return this;
        }
        public String getKind() {
            return this.kind;
        }

        public DescribePolarClawCronJobsResponseBodyJobsSchedule setTz(String tz) {
            this.tz = tz;
            return this;
        }
        public String getTz() {
            return this.tz;
        }

    }

    public static class DescribePolarClawCronJobsResponseBodyJobsState extends TeaModel {
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

        public static DescribePolarClawCronJobsResponseBodyJobsState build(java.util.Map<String, ?> map) throws Exception {
            DescribePolarClawCronJobsResponseBodyJobsState self = new DescribePolarClawCronJobsResponseBodyJobsState();
            return TeaModel.build(map, self);
        }

        public DescribePolarClawCronJobsResponseBodyJobsState setConsecutiveErrors(Integer consecutiveErrors) {
            this.consecutiveErrors = consecutiveErrors;
            return this;
        }
        public Integer getConsecutiveErrors() {
            return this.consecutiveErrors;
        }

        public DescribePolarClawCronJobsResponseBodyJobsState setLastRunAtMs(Long lastRunAtMs) {
            this.lastRunAtMs = lastRunAtMs;
            return this;
        }
        public Long getLastRunAtMs() {
            return this.lastRunAtMs;
        }

        public DescribePolarClawCronJobsResponseBodyJobsState setLastRunStatus(String lastRunStatus) {
            this.lastRunStatus = lastRunStatus;
            return this;
        }
        public String getLastRunStatus() {
            return this.lastRunStatus;
        }

        public DescribePolarClawCronJobsResponseBodyJobsState setNextRunAtMs(Long nextRunAtMs) {
            this.nextRunAtMs = nextRunAtMs;
            return this;
        }
        public Long getNextRunAtMs() {
            return this.nextRunAtMs;
        }

    }

    public static class DescribePolarClawCronJobsResponseBodyJobs extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>main</p>
         */
        @NameInMap("AgentId")
        public String agentId;

        /**
         * <strong>example:</strong>
         * <p>1777370572517</p>
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
        public DescribePolarClawCronJobsResponseBodyJobsDelivery delivery;

        /**
         * <strong>example:</strong>
         * <p>Daily report generation</p>
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
         * <p>0ee00f56-f467-4d41-858c-ca4ede2c770e</p>
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
        public DescribePolarClawCronJobsResponseBodyJobsPayload payload;

        @NameInMap("Runs")
        public java.util.List<DescribePolarClawCronJobsResponseBodyJobsRuns> runs;

        @NameInMap("Schedule")
        public DescribePolarClawCronJobsResponseBodyJobsSchedule schedule;

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
        public DescribePolarClawCronJobsResponseBodyJobsState state;

        /**
         * <strong>example:</strong>
         * <p>1777368967284</p>
         */
        @NameInMap("UpdatedAtMs")
        public Long updatedAtMs;

        /**
         * <strong>example:</strong>
         * <p>now</p>
         */
        @NameInMap("WakeMode")
        public String wakeMode;

        public static DescribePolarClawCronJobsResponseBodyJobs build(java.util.Map<String, ?> map) throws Exception {
            DescribePolarClawCronJobsResponseBodyJobs self = new DescribePolarClawCronJobsResponseBodyJobs();
            return TeaModel.build(map, self);
        }

        public DescribePolarClawCronJobsResponseBodyJobs setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public DescribePolarClawCronJobsResponseBodyJobs setCreatedAtMs(Long createdAtMs) {
            this.createdAtMs = createdAtMs;
            return this;
        }
        public Long getCreatedAtMs() {
            return this.createdAtMs;
        }

        public DescribePolarClawCronJobsResponseBodyJobs setDeleteAfterRun(Boolean deleteAfterRun) {
            this.deleteAfterRun = deleteAfterRun;
            return this;
        }
        public Boolean getDeleteAfterRun() {
            return this.deleteAfterRun;
        }

        public DescribePolarClawCronJobsResponseBodyJobs setDelivery(DescribePolarClawCronJobsResponseBodyJobsDelivery delivery) {
            this.delivery = delivery;
            return this;
        }
        public DescribePolarClawCronJobsResponseBodyJobsDelivery getDelivery() {
            return this.delivery;
        }

        public DescribePolarClawCronJobsResponseBodyJobs setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribePolarClawCronJobsResponseBodyJobs setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public DescribePolarClawCronJobsResponseBodyJobs setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribePolarClawCronJobsResponseBodyJobs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribePolarClawCronJobsResponseBodyJobs setPayload(DescribePolarClawCronJobsResponseBodyJobsPayload payload) {
            this.payload = payload;
            return this;
        }
        public DescribePolarClawCronJobsResponseBodyJobsPayload getPayload() {
            return this.payload;
        }

        public DescribePolarClawCronJobsResponseBodyJobs setRuns(java.util.List<DescribePolarClawCronJobsResponseBodyJobsRuns> runs) {
            this.runs = runs;
            return this;
        }
        public java.util.List<DescribePolarClawCronJobsResponseBodyJobsRuns> getRuns() {
            return this.runs;
        }

        public DescribePolarClawCronJobsResponseBodyJobs setSchedule(DescribePolarClawCronJobsResponseBodyJobsSchedule schedule) {
            this.schedule = schedule;
            return this;
        }
        public DescribePolarClawCronJobsResponseBodyJobsSchedule getSchedule() {
            return this.schedule;
        }

        public DescribePolarClawCronJobsResponseBodyJobs setSessionKey(String sessionKey) {
            this.sessionKey = sessionKey;
            return this;
        }
        public String getSessionKey() {
            return this.sessionKey;
        }

        public DescribePolarClawCronJobsResponseBodyJobs setSessionTarget(String sessionTarget) {
            this.sessionTarget = sessionTarget;
            return this;
        }
        public String getSessionTarget() {
            return this.sessionTarget;
        }

        public DescribePolarClawCronJobsResponseBodyJobs setState(DescribePolarClawCronJobsResponseBodyJobsState state) {
            this.state = state;
            return this;
        }
        public DescribePolarClawCronJobsResponseBodyJobsState getState() {
            return this.state;
        }

        public DescribePolarClawCronJobsResponseBodyJobs setUpdatedAtMs(Long updatedAtMs) {
            this.updatedAtMs = updatedAtMs;
            return this;
        }
        public Long getUpdatedAtMs() {
            return this.updatedAtMs;
        }

        public DescribePolarClawCronJobsResponseBodyJobs setWakeMode(String wakeMode) {
            this.wakeMode = wakeMode;
            return this;
        }
        public String getWakeMode() {
            return this.wakeMode;
        }

    }

}
