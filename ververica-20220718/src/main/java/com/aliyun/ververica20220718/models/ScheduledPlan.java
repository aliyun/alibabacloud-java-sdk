// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class ScheduledPlan extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1723197248</p>
     */
    @NameInMap("createdAt")
    public String createdAt;

    /**
     * <strong>example:</strong>
     * <p>27846363877456****</p>
     */
    @NameInMap("creator")
    public String creator;

    /**
     * <strong>example:</strong>
     * <p>****@streamcompute.onaliyun.com</p>
     */
    @NameInMap("creatorName")
    public String creatorName;

    /**
     * <strong>example:</strong>
     * <p>00000000-0000-0000-0000-000000000001</p>
     */
    @NameInMap("deploymentId")
    public String deploymentId;

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
     * <p>test-scheduled-plan</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>default-namespace</p>
     */
    @NameInMap("namespace")
    public String namespace;

    /**
     * <strong>example:</strong>
     * <p>USER_DEFINED</p>
     */
    @NameInMap("origin")
    public String origin;

    @NameInMap("periodicSchedulingPolicies")
    public java.util.List<PeriodicSchedulingPolicy> periodicSchedulingPolicies;

    /**
     * <strong>example:</strong>
     * <p>f3b4ec1e-85dc-4b1d-9726-1d7f4c37****</p>
     */
    @NameInMap("scheduledPlanId")
    public String scheduledPlanId;

    /**
     * <strong>example:</strong>
     * <p>FINISHED</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("updatedByUser")
    public Boolean updatedByUser;

    /**
     * <strong>example:</strong>
     * <p>edcef******b4f</p>
     */
    @NameInMap("workspace")
    public String workspace;

    public static ScheduledPlan build(java.util.Map<String, ?> map) throws Exception {
        ScheduledPlan self = new ScheduledPlan();
        return TeaModel.build(map, self);
    }

    public ScheduledPlan setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public ScheduledPlan setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public ScheduledPlan setCreatorName(String creatorName) {
        this.creatorName = creatorName;
        return this;
    }
    public String getCreatorName() {
        return this.creatorName;
    }

    public ScheduledPlan setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
        return this;
    }
    public String getDeploymentId() {
        return this.deploymentId;
    }

    public ScheduledPlan setModifiedAt(String modifiedAt) {
        this.modifiedAt = modifiedAt;
        return this;
    }
    public String getModifiedAt() {
        return this.modifiedAt;
    }

    public ScheduledPlan setModifier(String modifier) {
        this.modifier = modifier;
        return this;
    }
    public String getModifier() {
        return this.modifier;
    }

    public ScheduledPlan setModifierName(String modifierName) {
        this.modifierName = modifierName;
        return this;
    }
    public String getModifierName() {
        return this.modifierName;
    }

    public ScheduledPlan setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ScheduledPlan setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ScheduledPlan setOrigin(String origin) {
        this.origin = origin;
        return this;
    }
    public String getOrigin() {
        return this.origin;
    }

    public ScheduledPlan setPeriodicSchedulingPolicies(java.util.List<PeriodicSchedulingPolicy> periodicSchedulingPolicies) {
        this.periodicSchedulingPolicies = periodicSchedulingPolicies;
        return this;
    }
    public java.util.List<PeriodicSchedulingPolicy> getPeriodicSchedulingPolicies() {
        return this.periodicSchedulingPolicies;
    }

    public ScheduledPlan setScheduledPlanId(String scheduledPlanId) {
        this.scheduledPlanId = scheduledPlanId;
        return this;
    }
    public String getScheduledPlanId() {
        return this.scheduledPlanId;
    }

    public ScheduledPlan setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ScheduledPlan setUpdatedByUser(Boolean updatedByUser) {
        this.updatedByUser = updatedByUser;
        return this;
    }
    public Boolean getUpdatedByUser() {
        return this.updatedByUser;
    }

    public ScheduledPlan setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
