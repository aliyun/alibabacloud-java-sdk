// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreatePolarClawCronJobRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>main</p>
     */
    @NameInMap("AgentId")
    public String agentId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-**************</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DeleteAfterRun")
    public Boolean deleteAfterRun;

    /**
     * <strong>example:</strong>
     * <p>{&quot;Mode&quot;:&quot;announce&quot;,&quot;Channel&quot;:&quot;telegram&quot;}</p>
     */
    @NameInMap("Delivery")
    public CreatePolarClawCronJobRequestDelivery delivery;

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
     * <p>{&quot;After&quot;:3,&quot;Channel&quot;:&quot;telegram&quot;}</p>
     */
    @NameInMap("FailureAlert")
    public CreatePolarClawCronJobRequestFailureAlert failureAlert;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>daily-report</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Kind&quot;:&quot;agentTurn&quot;,&quot;Message&quot;:&quot;Generate the daily report.&quot;}</p>
     */
    @NameInMap("Payload")
    public CreatePolarClawCronJobRequestPayload payload;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Restart")
    public Boolean restart;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("RunImmediately")
    public Boolean runImmediately;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Kind&quot;:&quot;cron&quot;,&quot;Expr&quot;:&quot;0 9 * * *&quot;,&quot;Tz&quot;:&quot;Asia/Shanghai&quot;}</p>
     */
    @NameInMap("Schedule")
    public CreatePolarClawCronJobRequestSchedule schedule;

    /**
     * <strong>example:</strong>
     * <p>agent:main:feishu:direct:***</p>
     */
    @NameInMap("SessionKey")
    public String sessionKey;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>main</p>
     */
    @NameInMap("SessionTarget")
    public String sessionTarget;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>now</p>
     */
    @NameInMap("WakeMode")
    public String wakeMode;

    public static CreatePolarClawCronJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePolarClawCronJobRequest self = new CreatePolarClawCronJobRequest();
        return TeaModel.build(map, self);
    }

    public CreatePolarClawCronJobRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public CreatePolarClawCronJobRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public CreatePolarClawCronJobRequest setDeleteAfterRun(Boolean deleteAfterRun) {
        this.deleteAfterRun = deleteAfterRun;
        return this;
    }
    public Boolean getDeleteAfterRun() {
        return this.deleteAfterRun;
    }

    public CreatePolarClawCronJobRequest setDelivery(CreatePolarClawCronJobRequestDelivery delivery) {
        this.delivery = delivery;
        return this;
    }
    public CreatePolarClawCronJobRequestDelivery getDelivery() {
        return this.delivery;
    }

    public CreatePolarClawCronJobRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreatePolarClawCronJobRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public CreatePolarClawCronJobRequest setFailureAlert(CreatePolarClawCronJobRequestFailureAlert failureAlert) {
        this.failureAlert = failureAlert;
        return this;
    }
    public CreatePolarClawCronJobRequestFailureAlert getFailureAlert() {
        return this.failureAlert;
    }

    public CreatePolarClawCronJobRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreatePolarClawCronJobRequest setPayload(CreatePolarClawCronJobRequestPayload payload) {
        this.payload = payload;
        return this;
    }
    public CreatePolarClawCronJobRequestPayload getPayload() {
        return this.payload;
    }

    public CreatePolarClawCronJobRequest setRestart(Boolean restart) {
        this.restart = restart;
        return this;
    }
    public Boolean getRestart() {
        return this.restart;
    }

    public CreatePolarClawCronJobRequest setRunImmediately(Boolean runImmediately) {
        this.runImmediately = runImmediately;
        return this;
    }
    public Boolean getRunImmediately() {
        return this.runImmediately;
    }

    public CreatePolarClawCronJobRequest setSchedule(CreatePolarClawCronJobRequestSchedule schedule) {
        this.schedule = schedule;
        return this;
    }
    public CreatePolarClawCronJobRequestSchedule getSchedule() {
        return this.schedule;
    }

    public CreatePolarClawCronJobRequest setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey;
        return this;
    }
    public String getSessionKey() {
        return this.sessionKey;
    }

    public CreatePolarClawCronJobRequest setSessionTarget(String sessionTarget) {
        this.sessionTarget = sessionTarget;
        return this;
    }
    public String getSessionTarget() {
        return this.sessionTarget;
    }

    public CreatePolarClawCronJobRequest setWakeMode(String wakeMode) {
        this.wakeMode = wakeMode;
        return this;
    }
    public String getWakeMode() {
        return this.wakeMode;
    }

    public static class CreatePolarClawCronJobRequestDelivery extends TeaModel {
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

        public static CreatePolarClawCronJobRequestDelivery build(java.util.Map<String, ?> map) throws Exception {
            CreatePolarClawCronJobRequestDelivery self = new CreatePolarClawCronJobRequestDelivery();
            return TeaModel.build(map, self);
        }

        public CreatePolarClawCronJobRequestDelivery setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public CreatePolarClawCronJobRequestDelivery setBestEffort(Boolean bestEffort) {
            this.bestEffort = bestEffort;
            return this;
        }
        public Boolean getBestEffort() {
            return this.bestEffort;
        }

        public CreatePolarClawCronJobRequestDelivery setChannel(String channel) {
            this.channel = channel;
            return this;
        }
        public String getChannel() {
            return this.channel;
        }

        public CreatePolarClawCronJobRequestDelivery setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public CreatePolarClawCronJobRequestDelivery setTo(String to) {
            this.to = to;
            return this;
        }
        public String getTo() {
            return this.to;
        }

    }

    public static class CreatePolarClawCronJobRequestFailureAlert extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("After")
        public Integer after;

        /**
         * <strong>example:</strong>
         * <p>feishu</p>
         */
        @NameInMap("Channel")
        public String channel;

        /**
         * <strong>example:</strong>
         * <p>5000</p>
         */
        @NameInMap("CooldownMs")
        public Integer cooldownMs;

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

        public static CreatePolarClawCronJobRequestFailureAlert build(java.util.Map<String, ?> map) throws Exception {
            CreatePolarClawCronJobRequestFailureAlert self = new CreatePolarClawCronJobRequestFailureAlert();
            return TeaModel.build(map, self);
        }

        public CreatePolarClawCronJobRequestFailureAlert setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public CreatePolarClawCronJobRequestFailureAlert setAfter(Integer after) {
            this.after = after;
            return this;
        }
        public Integer getAfter() {
            return this.after;
        }

        public CreatePolarClawCronJobRequestFailureAlert setChannel(String channel) {
            this.channel = channel;
            return this;
        }
        public String getChannel() {
            return this.channel;
        }

        public CreatePolarClawCronJobRequestFailureAlert setCooldownMs(Integer cooldownMs) {
            this.cooldownMs = cooldownMs;
            return this;
        }
        public Integer getCooldownMs() {
            return this.cooldownMs;
        }

        public CreatePolarClawCronJobRequestFailureAlert setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public CreatePolarClawCronJobRequestFailureAlert setTo(String to) {
            this.to = to;
            return this;
        }
        public String getTo() {
            return this.to;
        }

    }

    public static class CreatePolarClawCronJobRequestPayload extends TeaModel {
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

        @NameInMap("Fallbacks")
        public java.util.List<String> fallbacks;

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
         * <p>xhigh</p>
         */
        @NameInMap("Thinking")
        public String thinking;

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

        public static CreatePolarClawCronJobRequestPayload build(java.util.Map<String, ?> map) throws Exception {
            CreatePolarClawCronJobRequestPayload self = new CreatePolarClawCronJobRequestPayload();
            return TeaModel.build(map, self);
        }

        public CreatePolarClawCronJobRequestPayload setBestEffortDeliver(Boolean bestEffortDeliver) {
            this.bestEffortDeliver = bestEffortDeliver;
            return this;
        }
        public Boolean getBestEffortDeliver() {
            return this.bestEffortDeliver;
        }

        public CreatePolarClawCronJobRequestPayload setChannel(String channel) {
            this.channel = channel;
            return this;
        }
        public String getChannel() {
            return this.channel;
        }

        public CreatePolarClawCronJobRequestPayload setDeliver(Boolean deliver) {
            this.deliver = deliver;
            return this;
        }
        public Boolean getDeliver() {
            return this.deliver;
        }

        public CreatePolarClawCronJobRequestPayload setFallbacks(java.util.List<String> fallbacks) {
            this.fallbacks = fallbacks;
            return this;
        }
        public java.util.List<String> getFallbacks() {
            return this.fallbacks;
        }

        public CreatePolarClawCronJobRequestPayload setKind(String kind) {
            this.kind = kind;
            return this;
        }
        public String getKind() {
            return this.kind;
        }

        public CreatePolarClawCronJobRequestPayload setLightContext(Boolean lightContext) {
            this.lightContext = lightContext;
            return this;
        }
        public Boolean getLightContext() {
            return this.lightContext;
        }

        public CreatePolarClawCronJobRequestPayload setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public CreatePolarClawCronJobRequestPayload setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public CreatePolarClawCronJobRequestPayload setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public CreatePolarClawCronJobRequestPayload setThinking(String thinking) {
            this.thinking = thinking;
            return this;
        }
        public String getThinking() {
            return this.thinking;
        }

        public CreatePolarClawCronJobRequestPayload setTimeoutSeconds(Integer timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }
        public Integer getTimeoutSeconds() {
            return this.timeoutSeconds;
        }

        public CreatePolarClawCronJobRequestPayload setTo(String to) {
            this.to = to;
            return this;
        }
        public String getTo() {
            return this.to;
        }

    }

    public static class CreatePolarClawCronJobRequestSchedule extends TeaModel {
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
         * <p>0</p>
         */
        @NameInMap("StaggerMs")
        public Integer staggerMs;

        /**
         * <strong>example:</strong>
         * <p>Asia/Shanghai</p>
         */
        @NameInMap("Tz")
        public String tz;

        public static CreatePolarClawCronJobRequestSchedule build(java.util.Map<String, ?> map) throws Exception {
            CreatePolarClawCronJobRequestSchedule self = new CreatePolarClawCronJobRequestSchedule();
            return TeaModel.build(map, self);
        }

        public CreatePolarClawCronJobRequestSchedule setAnchorMs(Long anchorMs) {
            this.anchorMs = anchorMs;
            return this;
        }
        public Long getAnchorMs() {
            return this.anchorMs;
        }

        public CreatePolarClawCronJobRequestSchedule setAt(String at) {
            this.at = at;
            return this;
        }
        public String getAt() {
            return this.at;
        }

        public CreatePolarClawCronJobRequestSchedule setEveryMs(Long everyMs) {
            this.everyMs = everyMs;
            return this;
        }
        public Long getEveryMs() {
            return this.everyMs;
        }

        public CreatePolarClawCronJobRequestSchedule setExpr(String expr) {
            this.expr = expr;
            return this;
        }
        public String getExpr() {
            return this.expr;
        }

        public CreatePolarClawCronJobRequestSchedule setKind(String kind) {
            this.kind = kind;
            return this;
        }
        public String getKind() {
            return this.kind;
        }

        public CreatePolarClawCronJobRequestSchedule setStaggerMs(Integer staggerMs) {
            this.staggerMs = staggerMs;
            return this;
        }
        public Integer getStaggerMs() {
            return this.staggerMs;
        }

        public CreatePolarClawCronJobRequestSchedule setTz(String tz) {
            this.tz = tz;
            return this;
        }
        public String getTz() {
            return this.tz;
        }

    }

}
