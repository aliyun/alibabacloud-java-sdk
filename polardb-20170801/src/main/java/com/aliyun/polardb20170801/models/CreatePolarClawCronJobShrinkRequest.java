// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreatePolarClawCronJobShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the agent that executes the task.</p>
     * 
     * <strong>example:</strong>
     * <p>main</p>
     */
    @NameInMap("AgentId")
    public String agentId;

    /**
     * <p>The application ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-**************</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>Specifies whether to automatically delete the job after its first execution. This is useful for one-time tasks. Default: <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DeleteAfterRun")
    public Boolean deleteAfterRun;

    /**
     * <p>The configuration for delivering task execution results.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Mode&quot;:&quot;announce&quot;,&quot;Channel&quot;:&quot;telegram&quot;}</p>
     */
    @NameInMap("Delivery")
    public String deliveryShrink;

    /**
     * <p>A description of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>Daily report generation</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether the cron job is enabled. Default: <code>true</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enabled")
    public Boolean enabled;

    /**
     * <p>The failure alert configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;After&quot;:3,&quot;Channel&quot;:&quot;telegram&quot;}</p>
     */
    @NameInMap("FailureAlert")
    public String failureAlertShrink;

    /**
     * <p>The unique name of the task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>daily-report</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The execution payload configuration.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Kind&quot;:&quot;agentTurn&quot;,&quot;Message&quot;:&quot;Generate the daily report.&quot;}</p>
     */
    @NameInMap("Payload")
    public String payloadShrink;

    /**
     * <p>Specifies whether to restart the gateway upon job creation. Default: <code>true</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Restart")
    public Boolean restart;

    /**
     * <p>Specifies whether to run the job once immediately upon creation. Default: <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("RunImmediately")
    public Boolean runImmediately;

    /**
     * <p>The schedule configuration.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Kind&quot;:&quot;cron&quot;,&quot;Expr&quot;:&quot;0 9 * * *&quot;,&quot;Tz&quot;:&quot;Asia/Shanghai&quot;}</p>
     */
    @NameInMap("Schedule")
    public String scheduleShrink;

    /**
     * <p>The session routing key, which determines the conversation session for the task.</p>
     * 
     * <strong>example:</strong>
     * <p>agent:main:feishu:direct:***</p>
     */
    @NameInMap("SessionKey")
    public String sessionKey;

    /**
     * <p>The session target. Valid values are <code>main</code>, <code>isolated</code>, and <code>current</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>main</p>
     */
    @NameInMap("SessionTarget")
    public String sessionTarget;

    /**
     * <p>The wake mode for the agent. Valid values are <code>now</code> and <code>next-heartbeat</code>.</p>
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
