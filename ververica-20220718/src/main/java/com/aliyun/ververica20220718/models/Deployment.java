// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class Deployment extends TeaModel {
    @NameInMap("artifact")
    public Artifact artifact;

    @NameInMap("batchResourceSetting")
    public BatchResourceSetting batchResourceSetting;

    @NameInMap("createdAt")
    public String createdAt;

    @NameInMap("creator")
    public String creator;

    @NameInMap("creatorName")
    public String creatorName;

    @NameInMap("deploymentHasChanged")
    public Boolean deploymentHasChanged;

    @NameInMap("deploymentId")
    public String deploymentId;

    @NameInMap("deploymentTarget")
    public BriefDeploymentTarget deploymentTarget;

    @NameInMap("description")
    public String description;

    @NameInMap("engineVersion")
    public String engineVersion;

    @NameInMap("executionMode")
    public String executionMode;

    @NameInMap("flinkConf")
    public java.util.Map<String, ?> flinkConf;

    @NameInMap("jobSummary")
    public JobSummary jobSummary;

    @NameInMap("localVariables")
    public java.util.List<LocalVariable> localVariables;

    @NameInMap("logging")
    public Logging logging;

    @NameInMap("modifiedAt")
    public String modifiedAt;

    @NameInMap("modifier")
    public String modifier;

    @NameInMap("modifierName")
    public String modifierName;

    @NameInMap("name")
    public String name;

    @NameInMap("namespace")
    public String namespace;

    @NameInMap("streamingResourceSetting")
    public StreamingResourceSetting streamingResourceSetting;

    @NameInMap("workspace")
    public String workspace;

    public static Deployment build(java.util.Map<String, ?> map) throws Exception {
        Deployment self = new Deployment();
        return TeaModel.build(map, self);
    }

    public Deployment setArtifact(Artifact artifact) {
        this.artifact = artifact;
        return this;
    }
    public Artifact getArtifact() {
        return this.artifact;
    }

    public Deployment setBatchResourceSetting(BatchResourceSetting batchResourceSetting) {
        this.batchResourceSetting = batchResourceSetting;
        return this;
    }
    public BatchResourceSetting getBatchResourceSetting() {
        return this.batchResourceSetting;
    }

    public Deployment setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public Deployment setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public Deployment setCreatorName(String creatorName) {
        this.creatorName = creatorName;
        return this;
    }
    public String getCreatorName() {
        return this.creatorName;
    }

    public Deployment setDeploymentHasChanged(Boolean deploymentHasChanged) {
        this.deploymentHasChanged = deploymentHasChanged;
        return this;
    }
    public Boolean getDeploymentHasChanged() {
        return this.deploymentHasChanged;
    }

    public Deployment setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
        return this;
    }
    public String getDeploymentId() {
        return this.deploymentId;
    }

    public Deployment setDeploymentTarget(BriefDeploymentTarget deploymentTarget) {
        this.deploymentTarget = deploymentTarget;
        return this;
    }
    public BriefDeploymentTarget getDeploymentTarget() {
        return this.deploymentTarget;
    }

    public Deployment setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public Deployment setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public Deployment setExecutionMode(String executionMode) {
        this.executionMode = executionMode;
        return this;
    }
    public String getExecutionMode() {
        return this.executionMode;
    }

    public Deployment setFlinkConf(java.util.Map<String, ?> flinkConf) {
        this.flinkConf = flinkConf;
        return this;
    }
    public java.util.Map<String, ?> getFlinkConf() {
        return this.flinkConf;
    }

    public Deployment setJobSummary(JobSummary jobSummary) {
        this.jobSummary = jobSummary;
        return this;
    }
    public JobSummary getJobSummary() {
        return this.jobSummary;
    }

    public Deployment setLocalVariables(java.util.List<LocalVariable> localVariables) {
        this.localVariables = localVariables;
        return this;
    }
    public java.util.List<LocalVariable> getLocalVariables() {
        return this.localVariables;
    }

    public Deployment setLogging(Logging logging) {
        this.logging = logging;
        return this;
    }
    public Logging getLogging() {
        return this.logging;
    }

    public Deployment setModifiedAt(String modifiedAt) {
        this.modifiedAt = modifiedAt;
        return this;
    }
    public String getModifiedAt() {
        return this.modifiedAt;
    }

    public Deployment setModifier(String modifier) {
        this.modifier = modifier;
        return this;
    }
    public String getModifier() {
        return this.modifier;
    }

    public Deployment setModifierName(String modifierName) {
        this.modifierName = modifierName;
        return this;
    }
    public String getModifierName() {
        return this.modifierName;
    }

    public Deployment setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Deployment setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public Deployment setStreamingResourceSetting(StreamingResourceSetting streamingResourceSetting) {
        this.streamingResourceSetting = streamingResourceSetting;
        return this;
    }
    public StreamingResourceSetting getStreamingResourceSetting() {
        return this.streamingResourceSetting;
    }

    public Deployment setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
