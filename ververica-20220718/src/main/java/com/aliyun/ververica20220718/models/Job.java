// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class Job extends TeaModel {
    @NameInMap("artifact")
    public Artifact artifact;

    @NameInMap("batchResourceSetting")
    public BatchResourceSetting batchResourceSetting;

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
     * <p>354dde66-a3ae-463e-967a-0b4107fd****</p>
     */
    @NameInMap("deploymentId")
    public String deploymentId;

    /**
     * <strong>example:</strong>
     * <p>flinktest</p>
     */
    @NameInMap("deploymentName")
    public String deploymentName;

    /**
     * <strong>example:</strong>
     * <p>1660277235</p>
     */
    @NameInMap("endTime")
    public Long endTime;

    /**
     * <strong>example:</strong>
     * <p>vvr-4.0.14-flink-1.13</p>
     */
    @NameInMap("engineVersion")
    public String engineVersion;

    /**
     * <strong>example:</strong>
     * <p>BATCH</p>
     */
    @NameInMap("executionMode")
    public String executionMode;

    @NameInMap("flinkConf")
    public java.util.Map<String, ?> flinkConf;

    /**
     * <strong>example:</strong>
     * <p>354dde66-a3ae-463e-967a-0b4107fd****</p>
     */
    @NameInMap("jobId")
    public String jobId;

    @NameInMap("localVariables")
    public java.util.List<LocalVariable> localVariables;

    @NameInMap("logging")
    public Logging logging;

    @NameInMap("metric")
    public JobMetric metric;

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
     * <p>namespacetest</p>
     */
    @NameInMap("namespace")
    public String namespace;

    @NameInMap("restoreStrategy")
    public DeploymentRestoreStrategy restoreStrategy;

    /**
     * <strong>example:</strong>
     * <p>preview</p>
     */
    @NameInMap("sessionClusterName")
    public String sessionClusterName;

    /**
     * <strong>example:</strong>
     * <p>1660190835</p>
     */
    @NameInMap("startTime")
    public Long startTime;

    @NameInMap("status")
    public JobStatus status;

    @NameInMap("streamingResourceSetting")
    public StreamingResourceSetting streamingResourceSetting;

    @NameInMap("userFlinkConf")
    public java.util.Map<String, ?> userFlinkConf;

    /**
     * <strong>example:</strong>
     * <p>edcef******b4f</p>
     */
    @NameInMap("workspace")
    public String workspace;

    public static Job build(java.util.Map<String, ?> map) throws Exception {
        Job self = new Job();
        return TeaModel.build(map, self);
    }

    public Job setArtifact(Artifact artifact) {
        this.artifact = artifact;
        return this;
    }
    public Artifact getArtifact() {
        return this.artifact;
    }

    public Job setBatchResourceSetting(BatchResourceSetting batchResourceSetting) {
        this.batchResourceSetting = batchResourceSetting;
        return this;
    }
    public BatchResourceSetting getBatchResourceSetting() {
        return this.batchResourceSetting;
    }

    public Job setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public Job setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public Job setCreatorName(String creatorName) {
        this.creatorName = creatorName;
        return this;
    }
    public String getCreatorName() {
        return this.creatorName;
    }

    public Job setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
        return this;
    }
    public String getDeploymentId() {
        return this.deploymentId;
    }

    public Job setDeploymentName(String deploymentName) {
        this.deploymentName = deploymentName;
        return this;
    }
    public String getDeploymentName() {
        return this.deploymentName;
    }

    public Job setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public Job setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public Job setExecutionMode(String executionMode) {
        this.executionMode = executionMode;
        return this;
    }
    public String getExecutionMode() {
        return this.executionMode;
    }

    public Job setFlinkConf(java.util.Map<String, ?> flinkConf) {
        this.flinkConf = flinkConf;
        return this;
    }
    public java.util.Map<String, ?> getFlinkConf() {
        return this.flinkConf;
    }

    public Job setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public Job setLocalVariables(java.util.List<LocalVariable> localVariables) {
        this.localVariables = localVariables;
        return this;
    }
    public java.util.List<LocalVariable> getLocalVariables() {
        return this.localVariables;
    }

    public Job setLogging(Logging logging) {
        this.logging = logging;
        return this;
    }
    public Logging getLogging() {
        return this.logging;
    }

    public Job setMetric(JobMetric metric) {
        this.metric = metric;
        return this;
    }
    public JobMetric getMetric() {
        return this.metric;
    }

    public Job setModifiedAt(String modifiedAt) {
        this.modifiedAt = modifiedAt;
        return this;
    }
    public String getModifiedAt() {
        return this.modifiedAt;
    }

    public Job setModifier(String modifier) {
        this.modifier = modifier;
        return this;
    }
    public String getModifier() {
        return this.modifier;
    }

    public Job setModifierName(String modifierName) {
        this.modifierName = modifierName;
        return this;
    }
    public String getModifierName() {
        return this.modifierName;
    }

    public Job setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public Job setRestoreStrategy(DeploymentRestoreStrategy restoreStrategy) {
        this.restoreStrategy = restoreStrategy;
        return this;
    }
    public DeploymentRestoreStrategy getRestoreStrategy() {
        return this.restoreStrategy;
    }

    public Job setSessionClusterName(String sessionClusterName) {
        this.sessionClusterName = sessionClusterName;
        return this;
    }
    public String getSessionClusterName() {
        return this.sessionClusterName;
    }

    public Job setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public Job setStatus(JobStatus status) {
        this.status = status;
        return this;
    }
    public JobStatus getStatus() {
        return this.status;
    }

    public Job setStreamingResourceSetting(StreamingResourceSetting streamingResourceSetting) {
        this.streamingResourceSetting = streamingResourceSetting;
        return this;
    }
    public StreamingResourceSetting getStreamingResourceSetting() {
        return this.streamingResourceSetting;
    }

    public Job setUserFlinkConf(java.util.Map<String, ?> userFlinkConf) {
        this.userFlinkConf = userFlinkConf;
        return this;
    }
    public java.util.Map<String, ?> getUserFlinkConf() {
        return this.userFlinkConf;
    }

    public Job setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
