// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreatePolarClawCronJobShrinkRequest extends TeaModel {
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
    public String deliveryShrink;

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
    public String failureAlertShrink;

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
    public String payloadShrink;

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
    public String scheduleShrink;

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

    public static CreatePolarClawCronJobShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePolarClawCronJobShrinkRequest self = new CreatePolarClawCronJobShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreatePolarClawCronJobShrinkRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public CreatePolarClawCronJobShrinkRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public CreatePolarClawCronJobShrinkRequest setDeleteAfterRun(Boolean deleteAfterRun) {
        this.deleteAfterRun = deleteAfterRun;
        return this;
    }
    public Boolean getDeleteAfterRun() {
        return this.deleteAfterRun;
    }

    public CreatePolarClawCronJobShrinkRequest setDeliveryShrink(String deliveryShrink) {
        this.deliveryShrink = deliveryShrink;
        return this;
    }
    public String getDeliveryShrink() {
        return this.deliveryShrink;
    }

    public CreatePolarClawCronJobShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreatePolarClawCronJobShrinkRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public CreatePolarClawCronJobShrinkRequest setFailureAlertShrink(String failureAlertShrink) {
        this.failureAlertShrink = failureAlertShrink;
        return this;
    }
    public String getFailureAlertShrink() {
        return this.failureAlertShrink;
    }

    public CreatePolarClawCronJobShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreatePolarClawCronJobShrinkRequest setPayloadShrink(String payloadShrink) {
        this.payloadShrink = payloadShrink;
        return this;
    }
    public String getPayloadShrink() {
        return this.payloadShrink;
    }

    public CreatePolarClawCronJobShrinkRequest setRestart(Boolean restart) {
        this.restart = restart;
        return this;
    }
    public Boolean getRestart() {
        return this.restart;
    }

    public CreatePolarClawCronJobShrinkRequest setRunImmediately(Boolean runImmediately) {
        this.runImmediately = runImmediately;
        return this;
    }
    public Boolean getRunImmediately() {
        return this.runImmediately;
    }

    public CreatePolarClawCronJobShrinkRequest setScheduleShrink(String scheduleShrink) {
        this.scheduleShrink = scheduleShrink;
        return this;
    }
    public String getScheduleShrink() {
        return this.scheduleShrink;
    }

    public CreatePolarClawCronJobShrinkRequest setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey;
        return this;
    }
    public String getSessionKey() {
        return this.sessionKey;
    }

    public CreatePolarClawCronJobShrinkRequest setSessionTarget(String sessionTarget) {
        this.sessionTarget = sessionTarget;
        return this;
    }
    public String getSessionTarget() {
        return this.sessionTarget;
    }

    public CreatePolarClawCronJobShrinkRequest setWakeMode(String wakeMode) {
        this.wakeMode = wakeMode;
        return this;
    }
    public String getWakeMode() {
        return this.wakeMode;
    }

}
