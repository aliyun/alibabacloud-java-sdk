// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class BuildPipelineRun extends TeaModel {
    @NameInMap("BuildConfig")
    public BuildPipelineRunBuildConfig buildConfig;

    @NameInMap("BuildDuration")
    public Long buildDuration;

    @NameInMap("CodeConfig")
    public BuildPipelineRunCodeConfig codeConfig;

    @NameInMap("CreateTime")
    public Long createTime;

    @NameInMap("DeployConfig")
    public BuildPipelineRunDeployConfig deployConfig;

    @NameInMap("DeployDuration")
    public Long deployDuration;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("ImageConfig")
    public BuildPipelineRunImageConfig imageConfig;

    @NameInMap("PackageConfig")
    public BuildPipelineRunPackageConfig packageConfig;

    @NameInMap("PipelineId")
    public String pipelineId;

    @NameInMap("PipelineRunId")
    public String pipelineRunId;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("Status")
    public String status;

    @NameInMap("Steps")
    public java.util.List<BuildPipelineRunSteps> steps;

    @NameInMap("TriggerConfig")
    public BuildPipelineRunTriggerConfig triggerConfig;

    @NameInMap("VersionId")
    public String versionId;

    @NameInMap("WaitDuration")
    public Long waitDuration;

    public static BuildPipelineRun build(java.util.Map<String, ?> map) throws Exception {
        BuildPipelineRun self = new BuildPipelineRun();
        return TeaModel.build(map, self);
    }

    public BuildPipelineRun setBuildConfig(BuildPipelineRunBuildConfig buildConfig) {
        this.buildConfig = buildConfig;
        return this;
    }
    public BuildPipelineRunBuildConfig getBuildConfig() {
        return this.buildConfig;
    }

    public BuildPipelineRun setBuildDuration(Long buildDuration) {
        this.buildDuration = buildDuration;
        return this;
    }
    public Long getBuildDuration() {
        return this.buildDuration;
    }

    public BuildPipelineRun setCodeConfig(BuildPipelineRunCodeConfig codeConfig) {
        this.codeConfig = codeConfig;
        return this;
    }
    public BuildPipelineRunCodeConfig getCodeConfig() {
        return this.codeConfig;
    }

    public BuildPipelineRun setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public BuildPipelineRun setDeployConfig(BuildPipelineRunDeployConfig deployConfig) {
        this.deployConfig = deployConfig;
        return this;
    }
    public BuildPipelineRunDeployConfig getDeployConfig() {
        return this.deployConfig;
    }

    public BuildPipelineRun setDeployDuration(Long deployDuration) {
        this.deployDuration = deployDuration;
        return this;
    }
    public Long getDeployDuration() {
        return this.deployDuration;
    }

    public BuildPipelineRun setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public BuildPipelineRun setImageConfig(BuildPipelineRunImageConfig imageConfig) {
        this.imageConfig = imageConfig;
        return this;
    }
    public BuildPipelineRunImageConfig getImageConfig() {
        return this.imageConfig;
    }

    public BuildPipelineRun setPackageConfig(BuildPipelineRunPackageConfig packageConfig) {
        this.packageConfig = packageConfig;
        return this;
    }
    public BuildPipelineRunPackageConfig getPackageConfig() {
        return this.packageConfig;
    }

    public BuildPipelineRun setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public String getPipelineId() {
        return this.pipelineId;
    }

    public BuildPipelineRun setPipelineRunId(String pipelineRunId) {
        this.pipelineRunId = pipelineRunId;
        return this;
    }
    public String getPipelineRunId() {
        return this.pipelineRunId;
    }

    public BuildPipelineRun setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public BuildPipelineRun setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public BuildPipelineRun setSteps(java.util.List<BuildPipelineRunSteps> steps) {
        this.steps = steps;
        return this;
    }
    public java.util.List<BuildPipelineRunSteps> getSteps() {
        return this.steps;
    }

    public BuildPipelineRun setTriggerConfig(BuildPipelineRunTriggerConfig triggerConfig) {
        this.triggerConfig = triggerConfig;
        return this;
    }
    public BuildPipelineRunTriggerConfig getTriggerConfig() {
        return this.triggerConfig;
    }

    public BuildPipelineRun setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

    public BuildPipelineRun setWaitDuration(Long waitDuration) {
        this.waitDuration = waitDuration;
        return this;
    }
    public Long getWaitDuration() {
        return this.waitDuration;
    }

    public static class BuildPipelineRunBuildConfigTrigger extends TeaModel {
        @NameInMap("BranchName")
        public String branchName;

        @NameInMap("TagName")
        public String tagName;

        @NameInMap("Type")
        public String type;

        public static BuildPipelineRunBuildConfigTrigger build(java.util.Map<String, ?> map) throws Exception {
            BuildPipelineRunBuildConfigTrigger self = new BuildPipelineRunBuildConfigTrigger();
            return TeaModel.build(map, self);
        }

        public BuildPipelineRunBuildConfigTrigger setBranchName(String branchName) {
            this.branchName = branchName;
            return this;
        }
        public String getBranchName() {
            return this.branchName;
        }

        public BuildPipelineRunBuildConfigTrigger setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

        public BuildPipelineRunBuildConfigTrigger setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class BuildPipelineRunBuildConfig extends TeaModel {
        @NameInMap("BeforeBuildCommand")
        public String beforeBuildCommand;

        @NameInMap("BuildType")
        public String buildType;

        @NameInMap("DockerfilePath")
        public String dockerfilePath;

        @NameInMap("RunCommand")
        public String runCommand;

        @NameInMap("RuntimeType")
        public String runtimeType;

        @NameInMap("RuntimeVersion")
        public String runtimeVersion;

        @NameInMap("TomcatConfig")
        public TomcatConfig tomcatConfig;

        @NameInMap("Trigger")
        public BuildPipelineRunBuildConfigTrigger trigger;

        @NameInMap("WorkingDir")
        public String workingDir;

        public static BuildPipelineRunBuildConfig build(java.util.Map<String, ?> map) throws Exception {
            BuildPipelineRunBuildConfig self = new BuildPipelineRunBuildConfig();
            return TeaModel.build(map, self);
        }

        public BuildPipelineRunBuildConfig setBeforeBuildCommand(String beforeBuildCommand) {
            this.beforeBuildCommand = beforeBuildCommand;
            return this;
        }
        public String getBeforeBuildCommand() {
            return this.beforeBuildCommand;
        }

        public BuildPipelineRunBuildConfig setBuildType(String buildType) {
            this.buildType = buildType;
            return this;
        }
        public String getBuildType() {
            return this.buildType;
        }

        public BuildPipelineRunBuildConfig setDockerfilePath(String dockerfilePath) {
            this.dockerfilePath = dockerfilePath;
            return this;
        }
        public String getDockerfilePath() {
            return this.dockerfilePath;
        }

        public BuildPipelineRunBuildConfig setRunCommand(String runCommand) {
            this.runCommand = runCommand;
            return this;
        }
        public String getRunCommand() {
            return this.runCommand;
        }

        public BuildPipelineRunBuildConfig setRuntimeType(String runtimeType) {
            this.runtimeType = runtimeType;
            return this;
        }
        public String getRuntimeType() {
            return this.runtimeType;
        }

        public BuildPipelineRunBuildConfig setRuntimeVersion(String runtimeVersion) {
            this.runtimeVersion = runtimeVersion;
            return this;
        }
        public String getRuntimeVersion() {
            return this.runtimeVersion;
        }

        public BuildPipelineRunBuildConfig setTomcatConfig(TomcatConfig tomcatConfig) {
            this.tomcatConfig = tomcatConfig;
            return this;
        }
        public TomcatConfig getTomcatConfig() {
            return this.tomcatConfig;
        }

        public BuildPipelineRunBuildConfig setTrigger(BuildPipelineRunBuildConfigTrigger trigger) {
            this.trigger = trigger;
            return this;
        }
        public BuildPipelineRunBuildConfigTrigger getTrigger() {
            return this.trigger;
        }

        public BuildPipelineRunBuildConfig setWorkingDir(String workingDir) {
            this.workingDir = workingDir;
            return this;
        }
        public String getWorkingDir() {
            return this.workingDir;
        }

    }

    public static class BuildPipelineRunCodeConfig extends TeaModel {
        @NameInMap("AccountId")
        public String accountId;

        @NameInMap("BranchName")
        public String branchName;

        @NameInMap("CommitId")
        public String commitId;

        @NameInMap("CommitUrl")
        public String commitUrl;

        @NameInMap("OrganizationId")
        public String organizationId;

        @NameInMap("Provider")
        public String provider;

        @NameInMap("RepoFullName")
        public String repoFullName;

        @NameInMap("RepoId")
        public String repoId;

        public static BuildPipelineRunCodeConfig build(java.util.Map<String, ?> map) throws Exception {
            BuildPipelineRunCodeConfig self = new BuildPipelineRunCodeConfig();
            return TeaModel.build(map, self);
        }

        public BuildPipelineRunCodeConfig setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public BuildPipelineRunCodeConfig setBranchName(String branchName) {
            this.branchName = branchName;
            return this;
        }
        public String getBranchName() {
            return this.branchName;
        }

        public BuildPipelineRunCodeConfig setCommitId(String commitId) {
            this.commitId = commitId;
            return this;
        }
        public String getCommitId() {
            return this.commitId;
        }

        public BuildPipelineRunCodeConfig setCommitUrl(String commitUrl) {
            this.commitUrl = commitUrl;
            return this;
        }
        public String getCommitUrl() {
            return this.commitUrl;
        }

        public BuildPipelineRunCodeConfig setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

        public BuildPipelineRunCodeConfig setProvider(String provider) {
            this.provider = provider;
            return this;
        }
        public String getProvider() {
            return this.provider;
        }

        public BuildPipelineRunCodeConfig setRepoFullName(String repoFullName) {
            this.repoFullName = repoFullName;
            return this;
        }
        public String getRepoFullName() {
            return this.repoFullName;
        }

        public BuildPipelineRunCodeConfig setRepoId(String repoId) {
            this.repoId = repoId;
            return this;
        }
        public String getRepoId() {
            return this.repoId;
        }

    }

    public static class BuildPipelineRunDeployConfig extends TeaModel {
        @NameInMap("AlwaysAllocateCPU")
        public Boolean alwaysAllocateCPU;

        @NameInMap("MaximumInstanceCount")
        public Integer maximumInstanceCount;

        @NameInMap("MinimumInstanceCount")
        public Integer minimumInstanceCount;

        @NameInMap("UpdateApplicationInput")
        public String updateApplicationInput;

        public static BuildPipelineRunDeployConfig build(java.util.Map<String, ?> map) throws Exception {
            BuildPipelineRunDeployConfig self = new BuildPipelineRunDeployConfig();
            return TeaModel.build(map, self);
        }

        public BuildPipelineRunDeployConfig setAlwaysAllocateCPU(Boolean alwaysAllocateCPU) {
            this.alwaysAllocateCPU = alwaysAllocateCPU;
            return this;
        }
        public Boolean getAlwaysAllocateCPU() {
            return this.alwaysAllocateCPU;
        }

        public BuildPipelineRunDeployConfig setMaximumInstanceCount(Integer maximumInstanceCount) {
            this.maximumInstanceCount = maximumInstanceCount;
            return this;
        }
        public Integer getMaximumInstanceCount() {
            return this.maximumInstanceCount;
        }

        public BuildPipelineRunDeployConfig setMinimumInstanceCount(Integer minimumInstanceCount) {
            this.minimumInstanceCount = minimumInstanceCount;
            return this;
        }
        public Integer getMinimumInstanceCount() {
            return this.minimumInstanceCount;
        }

        public BuildPipelineRunDeployConfig setUpdateApplicationInput(String updateApplicationInput) {
            this.updateApplicationInput = updateApplicationInput;
            return this;
        }
        public String getUpdateApplicationInput() {
            return this.updateApplicationInput;
        }

    }

    public static class BuildPipelineRunImageConfig extends TeaModel {
        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("Repository")
        public String repository;

        public static BuildPipelineRunImageConfig build(java.util.Map<String, ?> map) throws Exception {
            BuildPipelineRunImageConfig self = new BuildPipelineRunImageConfig();
            return TeaModel.build(map, self);
        }

        public BuildPipelineRunImageConfig setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public BuildPipelineRunImageConfig setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public BuildPipelineRunImageConfig setRepository(String repository) {
            this.repository = repository;
            return this;
        }
        public String getRepository() {
            return this.repository;
        }

    }

    public static class BuildPipelineRunPackageConfig extends TeaModel {
        @NameInMap("PackageName")
        public String packageName;

        @NameInMap("PackageType")
        public String packageType;

        @NameInMap("PackageUrl")
        public String packageUrl;

        @NameInMap("PackageVersion")
        public String packageVersion;

        public static BuildPipelineRunPackageConfig build(java.util.Map<String, ?> map) throws Exception {
            BuildPipelineRunPackageConfig self = new BuildPipelineRunPackageConfig();
            return TeaModel.build(map, self);
        }

        public BuildPipelineRunPackageConfig setPackageName(String packageName) {
            this.packageName = packageName;
            return this;
        }
        public String getPackageName() {
            return this.packageName;
        }

        public BuildPipelineRunPackageConfig setPackageType(String packageType) {
            this.packageType = packageType;
            return this;
        }
        public String getPackageType() {
            return this.packageType;
        }

        public BuildPipelineRunPackageConfig setPackageUrl(String packageUrl) {
            this.packageUrl = packageUrl;
            return this;
        }
        public String getPackageUrl() {
            return this.packageUrl;
        }

        public BuildPipelineRunPackageConfig setPackageVersion(String packageVersion) {
            this.packageVersion = packageVersion;
            return this;
        }
        public String getPackageVersion() {
            return this.packageVersion;
        }

    }

    public static class BuildPipelineRunSteps extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Duration")
        public Long duration;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Result")
        public String result;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("Status")
        public String status;

        public static BuildPipelineRunSteps build(java.util.Map<String, ?> map) throws Exception {
            BuildPipelineRunSteps self = new BuildPipelineRunSteps();
            return TeaModel.build(map, self);
        }

        public BuildPipelineRunSteps setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public BuildPipelineRunSteps setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public BuildPipelineRunSteps setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public BuildPipelineRunSteps setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public BuildPipelineRunSteps setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public BuildPipelineRunSteps setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public BuildPipelineRunSteps setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public BuildPipelineRunSteps setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class BuildPipelineRunTriggerConfig extends TeaModel {
        @NameInMap("BranchName")
        public String branchName;

        @NameInMap("TagName")
        public String tagName;

        @NameInMap("Type")
        public String type;

        public static BuildPipelineRunTriggerConfig build(java.util.Map<String, ?> map) throws Exception {
            BuildPipelineRunTriggerConfig self = new BuildPipelineRunTriggerConfig();
            return TeaModel.build(map, self);
        }

        public BuildPipelineRunTriggerConfig setBranchName(String branchName) {
            this.branchName = branchName;
            return this;
        }
        public String getBranchName() {
            return this.branchName;
        }

        public BuildPipelineRunTriggerConfig setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

        public BuildPipelineRunTriggerConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
