// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class UpdatePolarClawCronJobShrinkRequest extends TeaModel {
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
    public String deliveryShrink;

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
    public String failureAlertShrink;

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
    public String payloadShrink;

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
    public String scheduleShrink;

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

    public static UpdatePolarClawCronJobShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePolarClawCronJobShrinkRequest self = new UpdatePolarClawCronJobShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePolarClawCronJobShrinkRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public UpdatePolarClawCronJobShrinkRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public UpdatePolarClawCronJobShrinkRequest setDeleteAfterRun(Boolean deleteAfterRun) {
        this.deleteAfterRun = deleteAfterRun;
        return this;
    }
    public Boolean getDeleteAfterRun() {
        return this.deleteAfterRun;
    }

    public UpdatePolarClawCronJobShrinkRequest setDeliveryShrink(String deliveryShrink) {
        this.deliveryShrink = deliveryShrink;
        return this;
    }
    public String getDeliveryShrink() {
        return this.deliveryShrink;
    }

    public UpdatePolarClawCronJobShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdatePolarClawCronJobShrinkRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public UpdatePolarClawCronJobShrinkRequest setFailureAlertShrink(String failureAlertShrink) {
        this.failureAlertShrink = failureAlertShrink;
        return this;
    }
    public String getFailureAlertShrink() {
        return this.failureAlertShrink;
    }

    public UpdatePolarClawCronJobShrinkRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public UpdatePolarClawCronJobShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdatePolarClawCronJobShrinkRequest setPayloadShrink(String payloadShrink) {
        this.payloadShrink = payloadShrink;
        return this;
    }
    public String getPayloadShrink() {
        return this.payloadShrink;
    }

    public UpdatePolarClawCronJobShrinkRequest setRestart(Boolean restart) {
        this.restart = restart;
        return this;
    }
    public Boolean getRestart() {
        return this.restart;
    }

    public UpdatePolarClawCronJobShrinkRequest setScheduleShrink(String scheduleShrink) {
        this.scheduleShrink = scheduleShrink;
        return this;
    }
    public String getScheduleShrink() {
        return this.scheduleShrink;
    }

    public UpdatePolarClawCronJobShrinkRequest setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey;
        return this;
    }
    public String getSessionKey() {
        return this.sessionKey;
    }

    public UpdatePolarClawCronJobShrinkRequest setSessionTarget(String sessionTarget) {
        this.sessionTarget = sessionTarget;
        return this;
    }
    public String getSessionTarget() {
        return this.sessionTarget;
    }

    public UpdatePolarClawCronJobShrinkRequest setWakeMode(String wakeMode) {
        this.wakeMode = wakeMode;
        return this;
    }
    public String getWakeMode() {
        return this.wakeMode;
    }

}
