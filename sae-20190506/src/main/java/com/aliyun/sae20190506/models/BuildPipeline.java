// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class BuildPipeline extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApplicationName")
    public String applicationName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("BuildConfig")
    public BuildPipelineBuildConfig buildConfig;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CodeConfig")
    public BuildPipelineCodeConfig codeConfig;

    @NameInMap("DeployConfig")
    public BuildPipelineDeployConfig deployConfig;

    @NameInMap("Enabled")
    public Boolean enabled;

    @NameInMap("ImageConfig")
    public BuildPipelineImageConfig imageConfig;

    @NameInMap("PackageConfig")
    public BuildPipelinePackageConfig packageConfig;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TriggerConfig")
    public BuildPipelineTriggerConfig triggerConfig;

    public static BuildPipeline build(java.util.Map<String, ?> map) throws Exception {
        BuildPipeline self = new BuildPipeline();
        return TeaModel.build(map, self);
    }

    public BuildPipeline setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public BuildPipeline setApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    public String getApplicationName() {
        return this.applicationName;
    }

    public BuildPipeline setBuildConfig(BuildPipelineBuildConfig buildConfig) {
        this.buildConfig = buildConfig;
        return this;
    }
    public BuildPipelineBuildConfig getBuildConfig() {
        return this.buildConfig;
    }

    public BuildPipeline setCodeConfig(BuildPipelineCodeConfig codeConfig) {
        this.codeConfig = codeConfig;
        return this;
    }
    public BuildPipelineCodeConfig getCodeConfig() {
        return this.codeConfig;
    }

    public BuildPipeline setDeployConfig(BuildPipelineDeployConfig deployConfig) {
        this.deployConfig = deployConfig;
        return this;
    }
    public BuildPipelineDeployConfig getDeployConfig() {
        return this.deployConfig;
    }

    public BuildPipeline setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public BuildPipeline setImageConfig(BuildPipelineImageConfig imageConfig) {
        this.imageConfig = imageConfig;
        return this;
    }
    public BuildPipelineImageConfig getImageConfig() {
        return this.imageConfig;
    }

    public BuildPipeline setPackageConfig(BuildPipelinePackageConfig packageConfig) {
        this.packageConfig = packageConfig;
        return this;
    }
    public BuildPipelinePackageConfig getPackageConfig() {
        return this.packageConfig;
    }

    public BuildPipeline setTriggerConfig(BuildPipelineTriggerConfig triggerConfig) {
        this.triggerConfig = triggerConfig;
        return this;
    }
    public BuildPipelineTriggerConfig getTriggerConfig() {
        return this.triggerConfig;
    }

    public static class BuildPipelineBuildConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>mvn clean package</p>
         */
        @NameInMap("BeforeBuildCommand")
        public String beforeBuildCommand;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>buildpacks/dockerfile</p>
         */
        @NameInMap("BuildType")
        public String buildType;

        /**
         * <strong>example:</strong>
         * <p>code/Dockerfile</p>
         */
        @NameInMap("DockerfilePath")
        public String dockerfilePath;

        /**
         * <strong>example:</strong>
         * <p>java -jar target/app.jar</p>
         */
        @NameInMap("RunCommand")
        public String runCommand;

        @NameInMap("RuntimeType")
        public String runtimeType;

        @NameInMap("RuntimeVersion")
        public String runtimeVersion;

        @NameInMap("TomcatConfig")
        public TomcatConfig tomcatConfig;

        /**
         * <strong>example:</strong>
         * <p>code</p>
         */
        @NameInMap("WorkingDir")
        public String workingDir;

        public static BuildPipelineBuildConfig build(java.util.Map<String, ?> map) throws Exception {
            BuildPipelineBuildConfig self = new BuildPipelineBuildConfig();
            return TeaModel.build(map, self);
        }

        public BuildPipelineBuildConfig setBeforeBuildCommand(String beforeBuildCommand) {
            this.beforeBuildCommand = beforeBuildCommand;
            return this;
        }
        public String getBeforeBuildCommand() {
            return this.beforeBuildCommand;
        }

        public BuildPipelineBuildConfig setBuildType(String buildType) {
            this.buildType = buildType;
            return this;
        }
        public String getBuildType() {
            return this.buildType;
        }

        public BuildPipelineBuildConfig setDockerfilePath(String dockerfilePath) {
            this.dockerfilePath = dockerfilePath;
            return this;
        }
        public String getDockerfilePath() {
            return this.dockerfilePath;
        }

        public BuildPipelineBuildConfig setRunCommand(String runCommand) {
            this.runCommand = runCommand;
            return this;
        }
        public String getRunCommand() {
            return this.runCommand;
        }

        public BuildPipelineBuildConfig setRuntimeType(String runtimeType) {
            this.runtimeType = runtimeType;
            return this;
        }
        public String getRuntimeType() {
            return this.runtimeType;
        }

        public BuildPipelineBuildConfig setRuntimeVersion(String runtimeVersion) {
            this.runtimeVersion = runtimeVersion;
            return this;
        }
        public String getRuntimeVersion() {
            return this.runtimeVersion;
        }

        public BuildPipelineBuildConfig setTomcatConfig(TomcatConfig tomcatConfig) {
            this.tomcatConfig = tomcatConfig;
            return this;
        }
        public TomcatConfig getTomcatConfig() {
            return this.tomcatConfig;
        }

        public BuildPipelineBuildConfig setWorkingDir(String workingDir) {
            this.workingDir = workingDir;
            return this;
        }
        public String getWorkingDir() {
            return this.workingDir;
        }

    }

    public static class BuildPipelineCodeConfig extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>master</p>
         */
        @NameInMap("BranchName")
        public String branchName;

        @NameInMap("CommitId")
        public String commitId;

        @NameInMap("CommitUrl")
        public String commitUrl;

        @NameInMap("OrganizationId")
        public String organizationId;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>github/gitee/gitlab等</p>
         */
        @NameInMap("Provider")
        public String provider;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sae-samples/java-maven-demo</p>
         */
        @NameInMap("RepoFullName")
        public String repoFullName;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3001</p>
         */
        @NameInMap("RepoId")
        public String repoId;

        public static BuildPipelineCodeConfig build(java.util.Map<String, ?> map) throws Exception {
            BuildPipelineCodeConfig self = new BuildPipelineCodeConfig();
            return TeaModel.build(map, self);
        }

        public BuildPipelineCodeConfig setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public BuildPipelineCodeConfig setBranchName(String branchName) {
            this.branchName = branchName;
            return this;
        }
        public String getBranchName() {
            return this.branchName;
        }

        public BuildPipelineCodeConfig setCommitId(String commitId) {
            this.commitId = commitId;
            return this;
        }
        public String getCommitId() {
            return this.commitId;
        }

        public BuildPipelineCodeConfig setCommitUrl(String commitUrl) {
            this.commitUrl = commitUrl;
            return this;
        }
        public String getCommitUrl() {
            return this.commitUrl;
        }

        public BuildPipelineCodeConfig setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

        public BuildPipelineCodeConfig setProvider(String provider) {
            this.provider = provider;
            return this;
        }
        public String getProvider() {
            return this.provider;
        }

        public BuildPipelineCodeConfig setRepoFullName(String repoFullName) {
            this.repoFullName = repoFullName;
            return this;
        }
        public String getRepoFullName() {
            return this.repoFullName;
        }

        public BuildPipelineCodeConfig setRepoId(String repoId) {
            this.repoId = repoId;
            return this;
        }
        public String getRepoId() {
            return this.repoId;
        }

    }

    public static class BuildPipelineDeployConfig extends TeaModel {
        @NameInMap("AlwaysAllocateCPU")
        public Boolean alwaysAllocateCPU;

        @NameInMap("MaximumInstanceCount")
        public Integer maximumInstanceCount;

        @NameInMap("MinimumInstanceCount")
        public Integer minimumInstanceCount;

        @NameInMap("UpdateApplicationInput")
        public String updateApplicationInput;

        @NameInMap("UpdateTraffic")
        public Boolean updateTraffic;

        public static BuildPipelineDeployConfig build(java.util.Map<String, ?> map) throws Exception {
            BuildPipelineDeployConfig self = new BuildPipelineDeployConfig();
            return TeaModel.build(map, self);
        }

        public BuildPipelineDeployConfig setAlwaysAllocateCPU(Boolean alwaysAllocateCPU) {
            this.alwaysAllocateCPU = alwaysAllocateCPU;
            return this;
        }
        public Boolean getAlwaysAllocateCPU() {
            return this.alwaysAllocateCPU;
        }

        public BuildPipelineDeployConfig setMaximumInstanceCount(Integer maximumInstanceCount) {
            this.maximumInstanceCount = maximumInstanceCount;
            return this;
        }
        public Integer getMaximumInstanceCount() {
            return this.maximumInstanceCount;
        }

        public BuildPipelineDeployConfig setMinimumInstanceCount(Integer minimumInstanceCount) {
            this.minimumInstanceCount = minimumInstanceCount;
            return this;
        }
        public Integer getMinimumInstanceCount() {
            return this.minimumInstanceCount;
        }

        public BuildPipelineDeployConfig setUpdateApplicationInput(String updateApplicationInput) {
            this.updateApplicationInput = updateApplicationInput;
            return this;
        }
        public String getUpdateApplicationInput() {
            return this.updateApplicationInput;
        }

        public BuildPipelineDeployConfig setUpdateTraffic(Boolean updateTraffic) {
            this.updateTraffic = updateTraffic;
            return this;
        }
        public Boolean getUpdateTraffic() {
            return this.updateTraffic;
        }

    }

    public static class BuildPipelineImageConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ACR/ACREE</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("Repository")
        public String repository;

        public static BuildPipelineImageConfig build(java.util.Map<String, ?> map) throws Exception {
            BuildPipelineImageConfig self = new BuildPipelineImageConfig();
            return TeaModel.build(map, self);
        }

        public BuildPipelineImageConfig setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public BuildPipelineImageConfig setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public BuildPipelineImageConfig setRepository(String repository) {
            this.repository = repository;
            return this;
        }
        public String getRepository() {
            return this.repository;
        }

    }

    public static class BuildPipelinePackageConfig extends TeaModel {
        @NameInMap("PackageName")
        public String packageName;

        /**
         * <strong>example:</strong>
         * <p>war/jar/zip</p>
         */
        @NameInMap("PackageType")
        public String packageType;

        /**
         * <strong>example:</strong>
         * <p><a href="http://myoss.oss-cn-****.aliyuncs.com/my-buc/2019-06-30/****.jar">http://myoss.oss-cn-****.aliyuncs.com/my-buc/2019-06-30/****.jar</a></p>
         */
        @NameInMap("PackageUrl")
        public String packageUrl;

        /**
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("PackageVersion")
        public String packageVersion;

        public static BuildPipelinePackageConfig build(java.util.Map<String, ?> map) throws Exception {
            BuildPipelinePackageConfig self = new BuildPipelinePackageConfig();
            return TeaModel.build(map, self);
        }

        public BuildPipelinePackageConfig setPackageName(String packageName) {
            this.packageName = packageName;
            return this;
        }
        public String getPackageName() {
            return this.packageName;
        }

        public BuildPipelinePackageConfig setPackageType(String packageType) {
            this.packageType = packageType;
            return this;
        }
        public String getPackageType() {
            return this.packageType;
        }

        public BuildPipelinePackageConfig setPackageUrl(String packageUrl) {
            this.packageUrl = packageUrl;
            return this;
        }
        public String getPackageUrl() {
            return this.packageUrl;
        }

        public BuildPipelinePackageConfig setPackageVersion(String packageVersion) {
            this.packageVersion = packageVersion;
            return this;
        }
        public String getPackageVersion() {
            return this.packageVersion;
        }

    }

    public static class BuildPipelineTriggerConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>master</p>
         */
        @NameInMap("BranchName")
        public String branchName;

        /**
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("TagName")
        public String tagName;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PUSH</p>
         */
        @NameInMap("Type")
        public String type;

        public static BuildPipelineTriggerConfig build(java.util.Map<String, ?> map) throws Exception {
            BuildPipelineTriggerConfig self = new BuildPipelineTriggerConfig();
            return TeaModel.build(map, self);
        }

        public BuildPipelineTriggerConfig setBranchName(String branchName) {
            this.branchName = branchName;
            return this;
        }
        public String getBranchName() {
            return this.branchName;
        }

        public BuildPipelineTriggerConfig setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

        public BuildPipelineTriggerConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
