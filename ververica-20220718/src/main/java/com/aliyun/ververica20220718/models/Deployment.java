// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class Deployment extends TeaModel {
    @NameInMap("artifact")
    public Artifact artifact;

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

    @NameInMap("logging")
    public Logging logging;

    @NameInMap("name")
    public String name;

    @NameInMap("namespace")
    public String namespace;

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

    public Deployment setLogging(Logging logging) {
        this.logging = logging;
        return this;
    }
    public Logging getLogging() {
        return this.logging;
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

}
