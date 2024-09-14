// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class ScheduledPlanExecutedInfo extends TeaModel {
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
     * <p>0e6d3bab-2277-4ed1-b573-9de6413d****</p>
     */
    @NameInMap("jobResourceUpgradingId")
    public String jobResourceUpgradingId;

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
     * <p>SCHEDULED_PLAN</p>
     */
    @NameInMap("origin")
    public String origin;

    /**
     * <strong>example:</strong>
     * <p>f8a2d5d9-9fc5-4273-bfcc-2a3cd354****</p>
     */
    @NameInMap("originJobId")
    public String originJobId;

    @NameInMap("status")
    public ScheduledPlanExecutedStatus status;

    /**
     * <strong>example:</strong>
     * <p>edcef******b4f</p>
     */
    @NameInMap("workspace")
    public String workspace;

    public static ScheduledPlanExecutedInfo build(java.util.Map<String, ?> map) throws Exception {
        ScheduledPlanExecutedInfo self = new ScheduledPlanExecutedInfo();
        return TeaModel.build(map, self);
    }

    public ScheduledPlanExecutedInfo setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public ScheduledPlanExecutedInfo setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public ScheduledPlanExecutedInfo setCreatorName(String creatorName) {
        this.creatorName = creatorName;
        return this;
    }
    public String getCreatorName() {
        return this.creatorName;
    }

    public ScheduledPlanExecutedInfo setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
        return this;
    }
    public String getDeploymentId() {
        return this.deploymentId;
    }

    public ScheduledPlanExecutedInfo setJobResourceUpgradingId(String jobResourceUpgradingId) {
        this.jobResourceUpgradingId = jobResourceUpgradingId;
        return this;
    }
    public String getJobResourceUpgradingId() {
        return this.jobResourceUpgradingId;
    }

    public ScheduledPlanExecutedInfo setModifiedAt(String modifiedAt) {
        this.modifiedAt = modifiedAt;
        return this;
    }
    public String getModifiedAt() {
        return this.modifiedAt;
    }

    public ScheduledPlanExecutedInfo setModifier(String modifier) {
        this.modifier = modifier;
        return this;
    }
    public String getModifier() {
        return this.modifier;
    }

    public ScheduledPlanExecutedInfo setModifierName(String modifierName) {
        this.modifierName = modifierName;
        return this;
    }
    public String getModifierName() {
        return this.modifierName;
    }

    public ScheduledPlanExecutedInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ScheduledPlanExecutedInfo setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ScheduledPlanExecutedInfo setOrigin(String origin) {
        this.origin = origin;
        return this;
    }
    public String getOrigin() {
        return this.origin;
    }

    public ScheduledPlanExecutedInfo setOriginJobId(String originJobId) {
        this.originJobId = originJobId;
        return this;
    }
    public String getOriginJobId() {
        return this.originJobId;
    }

    public ScheduledPlanExecutedInfo setStatus(ScheduledPlanExecutedStatus status) {
        this.status = status;
        return this;
    }
    public ScheduledPlanExecutedStatus getStatus() {
        return this.status;
    }

    public ScheduledPlanExecutedInfo setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
