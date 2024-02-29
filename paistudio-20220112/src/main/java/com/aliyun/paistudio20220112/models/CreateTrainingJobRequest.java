// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class CreateTrainingJobRequest extends TeaModel {
    @NameInMap("AlgorithmName")
    public String algorithmName;

    @NameInMap("AlgorithmProvider")
    public String algorithmProvider;

    @NameInMap("AlgorithmSpec")
    public AlgorithmSpec algorithmSpec;

    @NameInMap("AlgorithmVersion")
    public String algorithmVersion;

    @NameInMap("CodeDir")
    public Location codeDir;

    @NameInMap("ComputeResource")
    public CreateTrainingJobRequestComputeResource computeResource;

    @NameInMap("ExperimentConfig")
    public CreateTrainingJobRequestExperimentConfig experimentConfig;

    @NameInMap("HyperParameters")
    public java.util.List<CreateTrainingJobRequestHyperParameters> hyperParameters;

    @NameInMap("InputChannels")
    public java.util.List<CreateTrainingJobRequestInputChannels> inputChannels;

    @NameInMap("Labels")
    public java.util.List<CreateTrainingJobRequestLabels> labels;

    @NameInMap("OutputChannels")
    public java.util.List<CreateTrainingJobRequestOutputChannels> outputChannels;

    @NameInMap("RoleArn")
    public String roleArn;

    @NameInMap("Scheduler")
    public CreateTrainingJobRequestScheduler scheduler;

    @NameInMap("Settings")
    public CreateTrainingJobRequestSettings settings;

    @NameInMap("TrainingJobDescription")
    public String trainingJobDescription;

    @NameInMap("TrainingJobName")
    public String trainingJobName;

    @NameInMap("UserVpc")
    public CreateTrainingJobRequestUserVpc userVpc;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateTrainingJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTrainingJobRequest self = new CreateTrainingJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateTrainingJobRequest setAlgorithmName(String algorithmName) {
        this.algorithmName = algorithmName;
        return this;
    }
    public String getAlgorithmName() {
        return this.algorithmName;
    }

    public CreateTrainingJobRequest setAlgorithmProvider(String algorithmProvider) {
        this.algorithmProvider = algorithmProvider;
        return this;
    }
    public String getAlgorithmProvider() {
        return this.algorithmProvider;
    }

    public CreateTrainingJobRequest setAlgorithmSpec(AlgorithmSpec algorithmSpec) {
        this.algorithmSpec = algorithmSpec;
        return this;
    }
    public AlgorithmSpec getAlgorithmSpec() {
        return this.algorithmSpec;
    }

    public CreateTrainingJobRequest setAlgorithmVersion(String algorithmVersion) {
        this.algorithmVersion = algorithmVersion;
        return this;
    }
    public String getAlgorithmVersion() {
        return this.algorithmVersion;
    }

    public CreateTrainingJobRequest setCodeDir(Location codeDir) {
        this.codeDir = codeDir;
        return this;
    }
    public Location getCodeDir() {
        return this.codeDir;
    }

    public CreateTrainingJobRequest setComputeResource(CreateTrainingJobRequestComputeResource computeResource) {
        this.computeResource = computeResource;
        return this;
    }
    public CreateTrainingJobRequestComputeResource getComputeResource() {
        return this.computeResource;
    }

    public CreateTrainingJobRequest setExperimentConfig(CreateTrainingJobRequestExperimentConfig experimentConfig) {
        this.experimentConfig = experimentConfig;
        return this;
    }
    public CreateTrainingJobRequestExperimentConfig getExperimentConfig() {
        return this.experimentConfig;
    }

    public CreateTrainingJobRequest setHyperParameters(java.util.List<CreateTrainingJobRequestHyperParameters> hyperParameters) {
        this.hyperParameters = hyperParameters;
        return this;
    }
    public java.util.List<CreateTrainingJobRequestHyperParameters> getHyperParameters() {
        return this.hyperParameters;
    }

    public CreateTrainingJobRequest setInputChannels(java.util.List<CreateTrainingJobRequestInputChannels> inputChannels) {
        this.inputChannels = inputChannels;
        return this;
    }
    public java.util.List<CreateTrainingJobRequestInputChannels> getInputChannels() {
        return this.inputChannels;
    }

    public CreateTrainingJobRequest setLabels(java.util.List<CreateTrainingJobRequestLabels> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<CreateTrainingJobRequestLabels> getLabels() {
        return this.labels;
    }

    public CreateTrainingJobRequest setOutputChannels(java.util.List<CreateTrainingJobRequestOutputChannels> outputChannels) {
        this.outputChannels = outputChannels;
        return this;
    }
    public java.util.List<CreateTrainingJobRequestOutputChannels> getOutputChannels() {
        return this.outputChannels;
    }

    public CreateTrainingJobRequest setRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }
    public String getRoleArn() {
        return this.roleArn;
    }

    public CreateTrainingJobRequest setScheduler(CreateTrainingJobRequestScheduler scheduler) {
        this.scheduler = scheduler;
        return this;
    }
    public CreateTrainingJobRequestScheduler getScheduler() {
        return this.scheduler;
    }

    public CreateTrainingJobRequest setSettings(CreateTrainingJobRequestSettings settings) {
        this.settings = settings;
        return this;
    }
    public CreateTrainingJobRequestSettings getSettings() {
        return this.settings;
    }

    public CreateTrainingJobRequest setTrainingJobDescription(String trainingJobDescription) {
        this.trainingJobDescription = trainingJobDescription;
        return this;
    }
    public String getTrainingJobDescription() {
        return this.trainingJobDescription;
    }

    public CreateTrainingJobRequest setTrainingJobName(String trainingJobName) {
        this.trainingJobName = trainingJobName;
        return this;
    }
    public String getTrainingJobName() {
        return this.trainingJobName;
    }

    public CreateTrainingJobRequest setUserVpc(CreateTrainingJobRequestUserVpc userVpc) {
        this.userVpc = userVpc;
        return this;
    }
    public CreateTrainingJobRequestUserVpc getUserVpc() {
        return this.userVpc;
    }

    public CreateTrainingJobRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class CreateTrainingJobRequestComputeResourceInstanceSpec extends TeaModel {
        @NameInMap("CPU")
        public String CPU;

        @NameInMap("GPU")
        public String GPU;

        @NameInMap("GPUType")
        public String GPUType;

        @NameInMap("Memory")
        public String memory;

        @NameInMap("SharedMemory")
        public String sharedMemory;

        public static CreateTrainingJobRequestComputeResourceInstanceSpec build(java.util.Map<String, ?> map) throws Exception {
            CreateTrainingJobRequestComputeResourceInstanceSpec self = new CreateTrainingJobRequestComputeResourceInstanceSpec();
            return TeaModel.build(map, self);
        }

        public CreateTrainingJobRequestComputeResourceInstanceSpec setCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }
        public String getCPU() {
            return this.CPU;
        }

        public CreateTrainingJobRequestComputeResourceInstanceSpec setGPU(String GPU) {
            this.GPU = GPU;
            return this;
        }
        public String getGPU() {
            return this.GPU;
        }

        public CreateTrainingJobRequestComputeResourceInstanceSpec setGPUType(String GPUType) {
            this.GPUType = GPUType;
            return this;
        }
        public String getGPUType() {
            return this.GPUType;
        }

        public CreateTrainingJobRequestComputeResourceInstanceSpec setMemory(String memory) {
            this.memory = memory;
            return this;
        }
        public String getMemory() {
            return this.memory;
        }

        public CreateTrainingJobRequestComputeResourceInstanceSpec setSharedMemory(String sharedMemory) {
            this.sharedMemory = sharedMemory;
            return this;
        }
        public String getSharedMemory() {
            return this.sharedMemory;
        }

    }

    public static class CreateTrainingJobRequestComputeResource extends TeaModel {
        @NameInMap("EcsCount")
        public Long ecsCount;

        @NameInMap("EcsSpec")
        public String ecsSpec;

        @NameInMap("InstanceCount")
        public Long instanceCount;

        @NameInMap("InstanceSpec")
        public CreateTrainingJobRequestComputeResourceInstanceSpec instanceSpec;

        @NameInMap("ResourceId")
        public String resourceId;

        public static CreateTrainingJobRequestComputeResource build(java.util.Map<String, ?> map) throws Exception {
            CreateTrainingJobRequestComputeResource self = new CreateTrainingJobRequestComputeResource();
            return TeaModel.build(map, self);
        }

        public CreateTrainingJobRequestComputeResource setEcsCount(Long ecsCount) {
            this.ecsCount = ecsCount;
            return this;
        }
        public Long getEcsCount() {
            return this.ecsCount;
        }

        public CreateTrainingJobRequestComputeResource setEcsSpec(String ecsSpec) {
            this.ecsSpec = ecsSpec;
            return this;
        }
        public String getEcsSpec() {
            return this.ecsSpec;
        }

        public CreateTrainingJobRequestComputeResource setInstanceCount(Long instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }
        public Long getInstanceCount() {
            return this.instanceCount;
        }

        public CreateTrainingJobRequestComputeResource setInstanceSpec(CreateTrainingJobRequestComputeResourceInstanceSpec instanceSpec) {
            this.instanceSpec = instanceSpec;
            return this;
        }
        public CreateTrainingJobRequestComputeResourceInstanceSpec getInstanceSpec() {
            return this.instanceSpec;
        }

        public CreateTrainingJobRequestComputeResource setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

    }

    public static class CreateTrainingJobRequestExperimentConfig extends TeaModel {
        @NameInMap("ExperimentId")
        public String experimentId;

        public static CreateTrainingJobRequestExperimentConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateTrainingJobRequestExperimentConfig self = new CreateTrainingJobRequestExperimentConfig();
            return TeaModel.build(map, self);
        }

        public CreateTrainingJobRequestExperimentConfig setExperimentId(String experimentId) {
            this.experimentId = experimentId;
            return this;
        }
        public String getExperimentId() {
            return this.experimentId;
        }

    }

    public static class CreateTrainingJobRequestHyperParameters extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Value")
        public String value;

        public static CreateTrainingJobRequestHyperParameters build(java.util.Map<String, ?> map) throws Exception {
            CreateTrainingJobRequestHyperParameters self = new CreateTrainingJobRequestHyperParameters();
            return TeaModel.build(map, self);
        }

        public CreateTrainingJobRequestHyperParameters setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateTrainingJobRequestHyperParameters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateTrainingJobRequestInputChannels extends TeaModel {
        @NameInMap("DatasetId")
        public String datasetId;

        @NameInMap("InputUri")
        public String inputUri;

        @NameInMap("Name")
        public String name;

        public static CreateTrainingJobRequestInputChannels build(java.util.Map<String, ?> map) throws Exception {
            CreateTrainingJobRequestInputChannels self = new CreateTrainingJobRequestInputChannels();
            return TeaModel.build(map, self);
        }

        public CreateTrainingJobRequestInputChannels setDatasetId(String datasetId) {
            this.datasetId = datasetId;
            return this;
        }
        public String getDatasetId() {
            return this.datasetId;
        }

        public CreateTrainingJobRequestInputChannels setInputUri(String inputUri) {
            this.inputUri = inputUri;
            return this;
        }
        public String getInputUri() {
            return this.inputUri;
        }

        public CreateTrainingJobRequestInputChannels setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class CreateTrainingJobRequestLabels extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateTrainingJobRequestLabels build(java.util.Map<String, ?> map) throws Exception {
            CreateTrainingJobRequestLabels self = new CreateTrainingJobRequestLabels();
            return TeaModel.build(map, self);
        }

        public CreateTrainingJobRequestLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateTrainingJobRequestLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateTrainingJobRequestOutputChannels extends TeaModel {
        @NameInMap("DatasetId")
        public String datasetId;

        @NameInMap("Name")
        public String name;

        @NameInMap("OutputUri")
        public String outputUri;

        public static CreateTrainingJobRequestOutputChannels build(java.util.Map<String, ?> map) throws Exception {
            CreateTrainingJobRequestOutputChannels self = new CreateTrainingJobRequestOutputChannels();
            return TeaModel.build(map, self);
        }

        public CreateTrainingJobRequestOutputChannels setDatasetId(String datasetId) {
            this.datasetId = datasetId;
            return this;
        }
        public String getDatasetId() {
            return this.datasetId;
        }

        public CreateTrainingJobRequestOutputChannels setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateTrainingJobRequestOutputChannels setOutputUri(String outputUri) {
            this.outputUri = outputUri;
            return this;
        }
        public String getOutputUri() {
            return this.outputUri;
        }

    }

    public static class CreateTrainingJobRequestScheduler extends TeaModel {
        @NameInMap("MaxRunningTimeInSeconds")
        public Long maxRunningTimeInSeconds;

        public static CreateTrainingJobRequestScheduler build(java.util.Map<String, ?> map) throws Exception {
            CreateTrainingJobRequestScheduler self = new CreateTrainingJobRequestScheduler();
            return TeaModel.build(map, self);
        }

        public CreateTrainingJobRequestScheduler setMaxRunningTimeInSeconds(Long maxRunningTimeInSeconds) {
            this.maxRunningTimeInSeconds = maxRunningTimeInSeconds;
            return this;
        }
        public Long getMaxRunningTimeInSeconds() {
            return this.maxRunningTimeInSeconds;
        }

    }

    public static class CreateTrainingJobRequestSettings extends TeaModel {
        @NameInMap("AIMasterType")
        public String AIMasterType;

        @NameInMap("EnableErrorMonitoringInAIMaster")
        public Boolean enableErrorMonitoringInAIMaster;

        @NameInMap("ErrorMonitoringArgs")
        public String errorMonitoringArgs;

        @NameInMap("Priority")
        public Integer priority;

        public static CreateTrainingJobRequestSettings build(java.util.Map<String, ?> map) throws Exception {
            CreateTrainingJobRequestSettings self = new CreateTrainingJobRequestSettings();
            return TeaModel.build(map, self);
        }

        public CreateTrainingJobRequestSettings setAIMasterType(String AIMasterType) {
            this.AIMasterType = AIMasterType;
            return this;
        }
        public String getAIMasterType() {
            return this.AIMasterType;
        }

        public CreateTrainingJobRequestSettings setEnableErrorMonitoringInAIMaster(Boolean enableErrorMonitoringInAIMaster) {
            this.enableErrorMonitoringInAIMaster = enableErrorMonitoringInAIMaster;
            return this;
        }
        public Boolean getEnableErrorMonitoringInAIMaster() {
            return this.enableErrorMonitoringInAIMaster;
        }

        public CreateTrainingJobRequestSettings setErrorMonitoringArgs(String errorMonitoringArgs) {
            this.errorMonitoringArgs = errorMonitoringArgs;
            return this;
        }
        public String getErrorMonitoringArgs() {
            return this.errorMonitoringArgs;
        }

        public CreateTrainingJobRequestSettings setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

    }

    public static class CreateTrainingJobRequestUserVpc extends TeaModel {
        @NameInMap("DefaultRoute")
        public String defaultRoute;

        @NameInMap("ExtendedCIDRs")
        public java.util.List<String> extendedCIDRs;

        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        @NameInMap("SwitchId")
        public String switchId;

        @NameInMap("VpcId")
        public String vpcId;

        public static CreateTrainingJobRequestUserVpc build(java.util.Map<String, ?> map) throws Exception {
            CreateTrainingJobRequestUserVpc self = new CreateTrainingJobRequestUserVpc();
            return TeaModel.build(map, self);
        }

        public CreateTrainingJobRequestUserVpc setDefaultRoute(String defaultRoute) {
            this.defaultRoute = defaultRoute;
            return this;
        }
        public String getDefaultRoute() {
            return this.defaultRoute;
        }

        public CreateTrainingJobRequestUserVpc setExtendedCIDRs(java.util.List<String> extendedCIDRs) {
            this.extendedCIDRs = extendedCIDRs;
            return this;
        }
        public java.util.List<String> getExtendedCIDRs() {
            return this.extendedCIDRs;
        }

        public CreateTrainingJobRequestUserVpc setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public CreateTrainingJobRequestUserVpc setSwitchId(String switchId) {
            this.switchId = switchId;
            return this;
        }
        public String getSwitchId() {
            return this.switchId;
        }

        public CreateTrainingJobRequestUserVpc setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
