// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class UpdatePolarClawCronJobRequest extends TeaModel {
    /**
     * <p>The ID of the Agent that runs the task.</p>
     * 
     * <strong>example:</strong>
     * <p>work</p>
     */
    @NameInMap("AgentId")
    public String agentId;

    /**
     * <p>The application ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-xxx</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>Specifies whether to delete the task after its first execution.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DeleteAfterRun")
    public Boolean deleteAfterRun;

    /**
     * <p>The result delivery configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Mode&quot;:&quot;announce&quot;,&quot;Channel&quot;:&quot;telegram&quot;}</p>
     */
    @NameInMap("Delivery")
    public UpdatePolarClawCronJobRequestDelivery delivery;

    /**
     * <p>The new description for the task.</p>
     * 
     * <strong>example:</strong>
     * <p>Daily report generation</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether the task is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Enabled")
    public Boolean enabled;

    /**
     * <p>The configuration for failure alerts. Set this to <code>false</code> to disable alerts.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;After&quot;:3,&quot;Channel&quot;:&quot;telegram&quot;}</p>
     */
    @NameInMap("FailureAlert")
    public UpdatePolarClawCronJobRequestFailureAlert failureAlert;

    /**
     * <p>The ID of the scheduled task to update.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0ee00f56-f467-4d41-858c-ca4ede2c770e</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The new name for the task.</p>
     * 
     * <strong>example:</strong>
     * <p>afternoon-report</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The new payload configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Kind&quot;:&quot;agentTurn&quot;,&quot;Message&quot;:&quot;Updated: Generate afternoon report.&quot;}</p>
     */
    @NameInMap("Payload")
    public UpdatePolarClawCronJobRequestPayload payload;

    /**
     * <p>Specifies whether to restart the gateway after the update. Default value: <code>true</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Restart")
    public Boolean restart;

    /**
     * <p>The scheduling configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Kind&quot;:&quot;cron&quot;,&quot;Expr&quot;:&quot;0 12 * * *&quot;,&quot;Tz&quot;:&quot;America/New_York&quot;}</p>
     */
    @NameInMap("Schedule")
    public UpdatePolarClawCronJobRequestSchedule schedule;

    /**
     * <p>The session routing key.</p>
     * 
     * <strong>example:</strong>
     * <p>agent:main:feishu:direct:***</p>
     */
    @NameInMap("SessionKey")
    public String sessionKey;

    /**
     * <p>The new session target.</p>
     * 
     * <strong>example:</strong>
     * <p>isolated</p>
     */
    @NameInMap("SessionTarget")
    public String sessionTarget;

    /**
     * <p>The new wake mode.</p>
     * 
     * <strong>example:</strong>
     * <p>now</p>
     */
    @NameInMap("WakeMode")
    public String wakeMode;

    public static UpdatePolarClawCronJobRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePolarClawCronJobRequest self = new UpdatePolarClawCronJobRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePolarClawCronJobRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public UpdatePolarClawCronJobRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public UpdatePolarClawCronJobRequest setDeleteAfterRun(Boolean deleteAfterRun) {
        this.deleteAfterRun = deleteAfterRun;
        return this;
    }
    public Boolean getDeleteAfterRun() {
        return this.deleteAfterRun;
    }

    public UpdatePolarClawCronJobRequest setDelivery(UpdatePolarClawCronJobRequestDelivery delivery) {
        this.delivery = delivery;
        return this;
    }
    public UpdatePolarClawCronJobRequestDelivery getDelivery() {
        return this.delivery;
    }

    public UpdatePolarClawCronJobRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdatePolarClawCronJobRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public UpdatePolarClawCronJobRequest setFailureAlert(UpdatePolarClawCronJobRequestFailureAlert failureAlert) {
        this.failureAlert = failureAlert;
        return this;
    }
    public UpdatePolarClawCronJobRequestFailureAlert getFailureAlert() {
        return this.failureAlert;
    }

    public UpdatePolarClawCronJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public UpdatePolarClawCronJobRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdatePolarClawCronJobRequest setPayload(UpdatePolarClawCronJobRequestPayload payload) {
        this.payload = payload;
        return this;
    }
    public UpdatePolarClawCronJobRequestPayload getPayload() {
        return this.payload;
    }

    public UpdatePolarClawCronJobRequest setRestart(Boolean restart) {
        this.restart = restart;
        return this;
    }
    public Boolean getRestart() {
        return this.restart;
    }

    public UpdatePolarClawCronJobRequest setSchedule(UpdatePolarClawCronJobRequestSchedule schedule) {
        this.schedule = schedule;
        return this;
    }
    public UpdatePolarClawCronJobRequestSchedule getSchedule() {
        return this.schedule;
    }

    public UpdatePolarClawCronJobRequest setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey;
        return this;
    }
    public String getSessionKey() {
        return this.sessionKey;
    }

    public UpdatePolarClawCronJobRequest setSessionTarget(String sessionTarget) {
        this.sessionTarget = sessionTarget;
        return this;
    }
    public String getSessionTarget() {
        return this.sessionTarget;
    }

    public UpdatePolarClawCronJobRequest setWakeMode(String wakeMode) {
        this.wakeMode = wakeMode;
        return this;
    }
    public String getWakeMode() {
        return this.wakeMode;
    }

    public static class UpdatePolarClawCronJobRequestDelivery extends TeaModel {
        /**
         * <p>The account ID for the channel.</p>
         * 
         * <strong>example:</strong>
         * <p>accountId123</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        /**
         * <p>Specifies whether to ignore delivery failures.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("BestEffort")
        public Boolean bestEffort;

        /**
         * <p>The delivery channel.</p>
         * 
         * <strong>example:</strong>
         * <p>telegram</p>
         */
        @NameInMap("Channel")
        public String channel;

        /**
         * <p>The delivery mode. Valid values: <code>none</code>, <code>announce</code>, and <code>webhook</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>announce</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <p>The delivery target. This parameter is required and must be a URL if <code>Delivery.Mode</code> is <code>webhook</code>.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/webhook">https://example.com/webhook</a></p>
         */
        @NameInMap("To")
        public String to;

        public static UpdatePolarClawCronJobRequestDelivery build(java.util.Map<String, ?> map) throws Exception {
            UpdatePolarClawCronJobRequestDelivery self = new UpdatePolarClawCronJobRequestDelivery();
            return TeaModel.build(map, self);
        }

        public UpdatePolarClawCronJobRequestDelivery setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public UpdatePolarClawCronJobRequestDelivery setBestEffort(Boolean bestEffort) {
            this.bestEffort = bestEffort;
            return this;
        }
        public Boolean getBestEffort() {
            return this.bestEffort;
        }

        public UpdatePolarClawCronJobRequestDelivery setChannel(String channel) {
            this.channel = channel;
            return this;
        }
        public String getChannel() {
            return this.channel;
        }

        public UpdatePolarClawCronJobRequestDelivery setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public UpdatePolarClawCronJobRequestDelivery setTo(String to) {
            this.to = to;
            return this;
        }
        public String getTo() {
            return this.to;
        }

    }

    public static class UpdatePolarClawCronJobRequestFailureAlert extends TeaModel {
        /**
         * <p>The account ID for the channel.</p>
         * 
         * <strong>example:</strong>
         * <p>accountId123</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        /**
         * <p>The number of consecutive failures after which to send an alert.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("After")
        public Integer after;

        /**
         * <p>The alert channel.</p>
         * 
         * <strong>example:</strong>
         * <p>email</p>
         */
        @NameInMap("Channel")
        public String channel;

        /**
         * <p>The minimum interval between two alerts, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>5000</p>
         */
        @NameInMap("CooldownMs")
        public Integer cooldownMs;

        /**
         * <p>The alert mode. Valid values: <code>announce</code> and <code>webhook</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>announce</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <p>The alert target.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:user@example.com">user@example.com</a></p>
         */
        @NameInMap("To")
        public String to;

        public static UpdatePolarClawCronJobRequestFailureAlert build(java.util.Map<String, ?> map) throws Exception {
            UpdatePolarClawCronJobRequestFailureAlert self = new UpdatePolarClawCronJobRequestFailureAlert();
            return TeaModel.build(map, self);
        }

        public UpdatePolarClawCronJobRequestFailureAlert setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public UpdatePolarClawCronJobRequestFailureAlert setAfter(Integer after) {
            this.after = after;
            return this;
        }
        public Integer getAfter() {
            return this.after;
        }

        public UpdatePolarClawCronJobRequestFailureAlert setChannel(String channel) {
            this.channel = channel;
            return this;
        }
        public String getChannel() {
            return this.channel;
        }

        public UpdatePolarClawCronJobRequestFailureAlert setCooldownMs(Integer cooldownMs) {
            this.cooldownMs = cooldownMs;
            return this;
        }
        public Integer getCooldownMs() {
            return this.cooldownMs;
        }

        public UpdatePolarClawCronJobRequestFailureAlert setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public UpdatePolarClawCronJobRequestFailureAlert setTo(String to) {
            this.to = to;
            return this;
        }
        public String getTo() {
            return this.to;
        }

    }

    public static class UpdatePolarClawCronJobRequestPayload extends TeaModel {
        /**
         * <p>Specifies whether to ignore delivery failures.</p>
         */
        @NameInMap("BestEffortDeliver")
        public Boolean bestEffortDeliver;

        /**
         * <p>The ID of the delivery channel.</p>
         * 
         * <strong>example:</strong>
         * <p>telegram</p>
         */
        @NameInMap("Channel")
        public String channel;

        /**
         * <p>Specifies whether to deliver the output to a channel.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Deliver")
        public Boolean deliver;

        /**
         * <p>A list of fallback models.</p>
         */
        @NameInMap("Fallbacks")
        public java.util.List<String> fallbacks;

        /**
         * <p>The payload type. Valid values are <code>agentTurn</code> (for an Agent conversation) or <code>systemEvent</code> (for a system event).</p>
         * 
         * <strong>example:</strong>
         * <p>agentTurn</p>
         */
        @NameInMap("Kind")
        public String kind;

        /**
         * <p>Specifies whether to use a lightweight context.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("LightContext")
        public Boolean lightContext;

        /**
         * <p>The prompt for the Agent conversation. This parameter is required if <code>Payload.Kind</code> is <code>agentTurn</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>Generate the daily report and send it to the team.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The model override.</p>
         * 
         * <strong>example:</strong>
         * <p>anthropic/sonnet-4.6</p>
         */
        @NameInMap("Model")
        public String model;

        /**
         * <p>The text for the system event. This parameter is required if <code>Payload.Kind</code> is <code>systemEvent</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>Send a reminder to the user.</p>
         */
        @NameInMap("Text")
        public String text;

        /**
         * <p>The thinking level. Valid values: <code>off</code>, <code>minimal</code>, <code>low</code>, <code>medium</code>, <code>high</code>, and <code>xhigh</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>medium</p>
         */
        @NameInMap("Thinking")
        public String thinking;

        /**
         * <p>The execution timeout in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TimeoutSeconds")
        public Integer timeoutSeconds;

        /**
         * <p>The delivery target.</p>
         * 
         * <strong>example:</strong>
         * <p>team</p>
         */
        @NameInMap("To")
        public String to;

        public static UpdatePolarClawCronJobRequestPayload build(java.util.Map<String, ?> map) throws Exception {
            UpdatePolarClawCronJobRequestPayload self = new UpdatePolarClawCronJobRequestPayload();
            return TeaModel.build(map, self);
        }

        public UpdatePolarClawCronJobRequestPayload setBestEffortDeliver(Boolean bestEffortDeliver) {
            this.bestEffortDeliver = bestEffortDeliver;
            return this;
        }
        public Boolean getBestEffortDeliver() {
            return this.bestEffortDeliver;
        }

        public UpdatePolarClawCronJobRequestPayload setChannel(String channel) {
            this.channel = channel;
            return this;
        }
        public String getChannel() {
            return this.channel;
        }

        public UpdatePolarClawCronJobRequestPayload setDeliver(Boolean deliver) {
            this.deliver = deliver;
            return this;
        }
        public Boolean getDeliver() {
            return this.deliver;
        }

        public UpdatePolarClawCronJobRequestPayload setFallbacks(java.util.List<String> fallbacks) {
            this.fallbacks = fallbacks;
            return this;
        }
        public java.util.List<String> getFallbacks() {
            return this.fallbacks;
        }

        public UpdatePolarClawCronJobRequestPayload setKind(String kind) {
            this.kind = kind;
            return this;
        }
        public String getKind() {
            return this.kind;
        }

        public UpdatePolarClawCronJobRequestPayload setLightContext(Boolean lightContext) {
            this.lightContext = lightContext;
            return this;
        }
        public Boolean getLightContext() {
            return this.lightContext;
        }

        public UpdatePolarClawCronJobRequestPayload setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public UpdatePolarClawCronJobRequestPayload setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public UpdatePolarClawCronJobRequestPayload setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public UpdatePolarClawCronJobRequestPayload setThinking(String thinking) {
            this.thinking = thinking;
            return this;
        }
        public String getThinking() {
            return this.thinking;
        }

        public UpdatePolarClawCronJobRequestPayload setTimeoutSeconds(Integer timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }
        public Integer getTimeoutSeconds() {
            return this.timeoutSeconds;
        }

        public UpdatePolarClawCronJobRequestPayload setTo(String to) {
            this.to = to;
            return this;
        }
        public String getTo() {
            return this.to;
        }

    }

    public static class UpdatePolarClawCronJobRequestSchedule extends TeaModel {
        /**
         * <p>The anchor timestamp for interval alignment, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1777370572518</p>
         */
        @NameInMap("AnchorMs")
        public Long anchorMs;

        /**
         * <p>An ISO 8601 timestamp. This parameter is required if <code>Schedule.Kind</code> is <code>at</code>. For example: <code>2026-04-10T09:00:00+08:00</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-04-10T09:00:00+08:00</p>
         */
        @NameInMap("At")
        public String at;

        /**
         * <p>The interval in milliseconds. This parameter is required if <code>Schedule.Kind</code> is <code>every</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>100000</p>
         */
        @NameInMap("EveryMs")
        public Long everyMs;

        /**
         * <p>The cron expression.</p>
         * 
         * <strong>example:</strong>
         * <p>0 9 * * *</p>
         */
        @NameInMap("Expr")
        public String expr;

        /**
         * <p>The schedule type.</p>
         * 
         * <strong>example:</strong>
         * <p>cron</p>
         */
        @NameInMap("Kind")
        public String kind;

        /**
         * <p>The deterministic jitter window, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("StaggerMs")
        public Integer staggerMs;

        /**
         * <p>The time zone.</p>
         * 
         * <strong>example:</strong>
         * <p>Asia/Shanghai</p>
         */
        @NameInMap("Tz")
        public String tz;

        public static UpdatePolarClawCronJobRequestSchedule build(java.util.Map<String, ?> map) throws Exception {
            UpdatePolarClawCronJobRequestSchedule self = new UpdatePolarClawCronJobRequestSchedule();
            return TeaModel.build(map, self);
        }

        public UpdatePolarClawCronJobRequestSchedule setAnchorMs(Long anchorMs) {
            this.anchorMs = anchorMs;
            return this;
        }
        public Long getAnchorMs() {
            return this.anchorMs;
        }

        public UpdatePolarClawCronJobRequestSchedule setAt(String at) {
            this.at = at;
            return this;
        }
        public String getAt() {
            return this.at;
        }

        public UpdatePolarClawCronJobRequestSchedule setEveryMs(Long everyMs) {
            this.everyMs = everyMs;
            return this;
        }
        public Long getEveryMs() {
            return this.everyMs;
        }

        public UpdatePolarClawCronJobRequestSchedule setExpr(String expr) {
            this.expr = expr;
            return this;
        }
        public String getExpr() {
            return this.expr;
        }

        public UpdatePolarClawCronJobRequestSchedule setKind(String kind) {
            this.kind = kind;
            return this;
        }
        public String getKind() {
            return this.kind;
        }

        public UpdatePolarClawCronJobRequestSchedule setStaggerMs(Integer staggerMs) {
            this.staggerMs = staggerMs;
            return this;
        }
        public Integer getStaggerMs() {
            return this.staggerMs;
        }

        public UpdatePolarClawCronJobRequestSchedule setTz(String tz) {
            this.tz = tz;
            return this;
        }
        public String getTz() {
            return this.tz;
        }

    }

}
