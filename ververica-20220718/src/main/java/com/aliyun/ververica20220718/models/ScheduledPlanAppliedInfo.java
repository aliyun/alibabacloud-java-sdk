// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class ScheduledPlanAppliedInfo extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>00000000-0000-0000-0000-000000000001</p>
     */
    @NameInMap("deploymentId")
    public String deploymentId;

    /**
     * <strong>example:</strong>
     * <p>RUNNING</p>
     */
    @NameInMap("expectedState")
    public String expectedState;

    /**
     * <strong>example:</strong>
     * <p>1723197248</p>
     */
    @NameInMap("modifiedAt")
    public String modifiedAt;

    /**
     * <strong>example:</strong>
     * <p>27846363877456****</p>
     */
    @NameInMap("modifier")
    public String modifier;

    /**
     * <strong>example:</strong>
     * <p>****@streamcompute.onaliyun.com</p>
     */
    @NameInMap("modifierName")
    public String modifierName;

    /**
     * <strong>example:</strong>
     * <p>default-namespace</p>
     */
    @NameInMap("namespace")
    public String namespace;

    /**
     * <strong>example:</strong>
     * <p>f3b4ec1e-85dc-4b1d-9726-1d7f4c37****</p>
     */
    @NameInMap("scheduledPlanId")
    public String scheduledPlanId;

    /**
     * <strong>example:</strong>
     * <p>test-scheduled-plan</p>
     */
    @NameInMap("scheduledPlanName")
    public String scheduledPlanName;

    /**
     * <strong>example:</strong>
     * <p>WAITING</p>
     */
    @NameInMap("statusState")
    public String statusState;

    /**
     * <strong>example:</strong>
     * <p>edcef******b4f</p>
     */
    @NameInMap("workspace")
    public String workspace;

    public static ScheduledPlanAppliedInfo build(java.util.Map<String, ?> map) throws Exception {
        ScheduledPlanAppliedInfo self = new ScheduledPlanAppliedInfo();
        return TeaModel.build(map, self);
    }

    public ScheduledPlanAppliedInfo setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
        return this;
    }
    public String getDeploymentId() {
        return this.deploymentId;
    }

    public ScheduledPlanAppliedInfo setExpectedState(String expectedState) {
        this.expectedState = expectedState;
        return this;
    }
    public String getExpectedState() {
        return this.expectedState;
    }

    public ScheduledPlanAppliedInfo setModifiedAt(String modifiedAt) {
        this.modifiedAt = modifiedAt;
        return this;
    }
    public String getModifiedAt() {
        return this.modifiedAt;
    }

    public ScheduledPlanAppliedInfo setModifier(String modifier) {
        this.modifier = modifier;
        return this;
    }
    public String getModifier() {
        return this.modifier;
    }

    public ScheduledPlanAppliedInfo setModifierName(String modifierName) {
        this.modifierName = modifierName;
        return this;
    }
    public String getModifierName() {
        return this.modifierName;
    }

    public ScheduledPlanAppliedInfo setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ScheduledPlanAppliedInfo setScheduledPlanId(String scheduledPlanId) {
        this.scheduledPlanId = scheduledPlanId;
        return this;
    }
    public String getScheduledPlanId() {
        return this.scheduledPlanId;
    }

    public ScheduledPlanAppliedInfo setScheduledPlanName(String scheduledPlanName) {
        this.scheduledPlanName = scheduledPlanName;
        return this;
    }
    public String getScheduledPlanName() {
        return this.scheduledPlanName;
    }

    public ScheduledPlanAppliedInfo setStatusState(String statusState) {
        this.statusState = statusState;
        return this;
    }
    public String getStatusState() {
        return this.statusState;
    }

    public ScheduledPlanAppliedInfo setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
