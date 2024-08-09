// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class DeploymentDraft extends TeaModel {
    @NameInMap("artifact")
    public Artifact artifact;

    @NameInMap("createdAt")
    public Long createdAt;

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
     * <p>00000000-0000-0000-0000-00000012****</p>
     */
    @NameInMap("deploymentDraftId")
    public String deploymentDraftId;

    /**
     * <strong>example:</strong>
     * <p>vvr-6.0.7-flink-1.15</p>
     */
    @NameInMap("engineVersion")
    public String engineVersion;

    /**
     * <strong>example:</strong>
     * <p>STREAMING</p>
     */
    @NameInMap("executionMode")
    public String executionMode;

    @NameInMap("labels")
    public java.util.Map<String, ?> labels;

    @NameInMap("localVariables")
    public java.util.List<LocalVariable> localVariables;

    @NameInMap("lock")
    public Lock lock;

    @NameInMap("modifiedAt")
    public Long modifiedAt;

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
     * <p>test-draft</p>
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
     * <p>00000000-0000-0000-0000-00000013****</p>
     */
    @NameInMap("parentId")
    public String parentId;

    /**
     * <strong>example:</strong>
     * <p>00000000-0000-0000-0000-0000012312****</p>
     */
    @NameInMap("referencedDeploymentId")
    public String referencedDeploymentId;

    /**
     * <strong>example:</strong>
     * <p>edcef******b4f</p>
     */
    @NameInMap("workspace")
    public String workspace;

    public static DeploymentDraft build(java.util.Map<String, ?> map) throws Exception {
        DeploymentDraft self = new DeploymentDraft();
        return TeaModel.build(map, self);
    }

    public DeploymentDraft setArtifact(Artifact artifact) {
        this.artifact = artifact;
        return this;
    }
    public Artifact getArtifact() {
        return this.artifact;
    }

    public DeploymentDraft setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public Long getCreatedAt() {
        return this.createdAt;
    }

    public DeploymentDraft setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public DeploymentDraft setCreatorName(String creatorName) {
        this.creatorName = creatorName;
        return this;
    }
    public String getCreatorName() {
        return this.creatorName;
    }

    public DeploymentDraft setDeploymentDraftId(String deploymentDraftId) {
        this.deploymentDraftId = deploymentDraftId;
        return this;
    }
    public String getDeploymentDraftId() {
        return this.deploymentDraftId;
    }

    public DeploymentDraft setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public DeploymentDraft setExecutionMode(String executionMode) {
        this.executionMode = executionMode;
        return this;
    }
    public String getExecutionMode() {
        return this.executionMode;
    }

    public DeploymentDraft setLabels(java.util.Map<String, ?> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.Map<String, ?> getLabels() {
        return this.labels;
    }

    public DeploymentDraft setLocalVariables(java.util.List<LocalVariable> localVariables) {
        this.localVariables = localVariables;
        return this;
    }
    public java.util.List<LocalVariable> getLocalVariables() {
        return this.localVariables;
    }

    public DeploymentDraft setLock(Lock lock) {
        this.lock = lock;
        return this;
    }
    public Lock getLock() {
        return this.lock;
    }

    public DeploymentDraft setModifiedAt(Long modifiedAt) {
        this.modifiedAt = modifiedAt;
        return this;
    }
    public Long getModifiedAt() {
        return this.modifiedAt;
    }

    public DeploymentDraft setModifier(String modifier) {
        this.modifier = modifier;
        return this;
    }
    public String getModifier() {
        return this.modifier;
    }

    public DeploymentDraft setModifierName(String modifierName) {
        this.modifierName = modifierName;
        return this;
    }
    public String getModifierName() {
        return this.modifierName;
    }

    public DeploymentDraft setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DeploymentDraft setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DeploymentDraft setParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }
    public String getParentId() {
        return this.parentId;
    }

    public DeploymentDraft setReferencedDeploymentId(String referencedDeploymentId) {
        this.referencedDeploymentId = referencedDeploymentId;
        return this;
    }
    public String getReferencedDeploymentId() {
        return this.referencedDeploymentId;
    }

    public DeploymentDraft setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
