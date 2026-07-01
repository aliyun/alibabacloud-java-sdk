// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class Deployment extends TeaModel {
    /**
     * <p>The data structure required to start the deployed job.</p>
     */
    @NameInMap("artifact")
    public Artifact artifact;

    /**
     * <p>Resource settings for a batch job.</p>
     */
    @NameInMap("batchResourceSetting")
    public BatchResourceSetting batchResourceSetting;

    /**
     * <p>Creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>1714058507</p>
     */
    @NameInMap("createdAt")
    public String createdAt;

    /**
     * <p>Creator.</p>
     * 
     * <strong>example:</strong>
     * <p>27846363877456****</p>
     */
    @NameInMap("creator")
    public String creator;

    /**
     * <p>Name of the creator.</p>
     * 
     * <strong>example:</strong>
     * <p>****@streamcompute.onaliyun.com</p>
     */
    @NameInMap("creatorName")
    public String creatorName;

    /**
     * <p>Indicates whether the deployed job has been modified after it was started.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("deploymentHasChanged")
    public Boolean deploymentHasChanged;

    /**
     * <p>Deployed job ID.</p>
     * 
     * <strong>example:</strong>
     * <p>00000000-0000-0000-0000-0000012312****</p>
     */
    @NameInMap("deploymentId")
    public String deploymentId;

    /**
     * <p>Deployment target.</p>
     */
    @NameInMap("deploymentTarget")
    public BriefDeploymentTarget deploymentTarget;

    /**
     * <p>Description.</p>
     * 
     * <strong>example:</strong>
     * <p>this is a deployment description</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>Engine version.</p>
     * 
     * <strong>example:</strong>
     * <p>vvr-6.0.0-flink-1.15</p>
     */
    @NameInMap("engineVersion")
    public String engineVersion;

    /**
     * <p>Execution mode.</p>
     * <ul>
     * <li><p>STREAMING: stream mode.</p>
     * </li>
     * <li><p>BATCH: batch mode.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>STREAMING</p>
     */
    @NameInMap("executionMode")
    public String executionMode;

    /**
     * <p>Flink configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;taskmanager.numberOfTaskSlots&quot;:&quot;1&quot;}</p>
     */
    @NameInMap("flinkConf")
    public java.util.Map<String, ?> flinkConf;

    /**
     * <p>A summary of information about the job instances under the deployed job.</p>
     */
    @NameInMap("jobSummary")
    public JobSummary jobSummary;

    /**
     * <p>Job labels.</p>
     */
    @NameInMap("labels")
    public java.util.Map<String, ?> labels;

    /**
     * <p>Job variables.</p>
     */
    @NameInMap("localVariables")
    public java.util.List<LocalVariable> localVariables;

    /**
     * <p>Log configuration.</p>
     */
    @NameInMap("logging")
    public Logging logging;

    /**
     * <p>Modification time.</p>
     * 
     * <strong>example:</strong>
     * <p>1714058843</p>
     */
    @NameInMap("modifiedAt")
    public String modifiedAt;

    /**
     * <p>Modifier.</p>
     * 
     * <strong>example:</strong>
     * <p>27846363877456****</p>
     */
    @NameInMap("modifier")
    public String modifier;

    /**
     * <p>Name of the modifier.</p>
     * 
     * <strong>example:</strong>
     * <p>****@streamcompute.onaliyun.com</p>
     */
    @NameInMap("modifierName")
    public String modifierName;

    /**
     * <p>Deployed job name.</p>
     * 
     * <strong>example:</strong>
     * <p>deploymentName</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The name of the namespace.</p>
     * 
     * <strong>example:</strong>
     * <p>default-namespace</p>
     */
    @NameInMap("namespace")
    public String namespace;

    /**
     * <p>Associated job draft ID.</p>
     * 
     * <strong>example:</strong>
     * <p>00000000-0000-0000-0000-000000000003</p>
     */
    @NameInMap("referencedDeploymentDraftId")
    public String referencedDeploymentDraftId;

    /**
     * <p>Resource settings for a stream job.</p>
     */
    @NameInMap("streamingResourceSetting")
    public StreamingResourceSetting streamingResourceSetting;

    /**
     * <p>Workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>edcef******b4f</p>
     */
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

    public Deployment setLabels(java.util.Map<String, ?> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.Map<String, ?> getLabels() {
        return this.labels;
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

    public Deployment setReferencedDeploymentDraftId(String referencedDeploymentDraftId) {
        this.referencedDeploymentDraftId = referencedDeploymentDraftId;
        return this;
    }
    public String getReferencedDeploymentDraftId() {
        return this.referencedDeploymentDraftId;
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
