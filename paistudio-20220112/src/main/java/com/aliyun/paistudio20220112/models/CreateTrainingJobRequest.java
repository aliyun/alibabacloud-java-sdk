// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class CreateTrainingJobRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ev_classification</p>
     */
    @NameInMap("AlgorithmName")
    public String algorithmName;

    /**
     * <strong>example:</strong>
     * <p>pai</p>
     */
    @NameInMap("AlgorithmProvider")
    public String algorithmProvider;

    @NameInMap("AlgorithmSpec")
    public AlgorithmSpec algorithmSpec;

    /**
     * <strong>example:</strong>
     * <p>v1.0.0</p>
     */
    @NameInMap("AlgorithmVersion")
    public String algorithmVersion;

    @NameInMap("CodeDir")
    public Location codeDir;

    @NameInMap("ComputeResource")
    public CreateTrainingJobRequestComputeResource computeResource;

    @NameInMap("Environments")
    public java.util.Map<String, String> environments;

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

    @NameInMap("Priority")
    public Integer priority;

    @NameInMap("PythonRequirements")
    public java.util.List<String> pythonRequirements;

    /**
     * <strong>example:</strong>
     * <p>acs:ram::1157703270994901:role/aliyunserviceroleforpaiworkspace</p>
     */
    @NameInMap("RoleArn")
    public String roleArn;

    @NameInMap("Scheduler")
    public CreateTrainingJobRequestScheduler scheduler;

    @NameInMap("Settings")
    public JobSettings settings;

    /**
     * <strong>example:</strong>
     * <p>qwen large language model training</p>
     */
    @NameInMap("TrainingJobDescription")
    public String trainingJobDescription;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen_llm</p>
     */
    @NameInMap("TrainingJobName")
    public String trainingJobName;

    @NameInMap("UserVpc")
    public CreateTrainingJobRequestUserVpc userVpc;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
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

    public CreateTrainingJobRequest setEnvironments(java.util.Map<String, String> environments) {
        this.environments = environments;
        return this;
    }
    public java.util.Map<String, String> getEnvironments() {
        return this.environments;
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

    public CreateTrainingJobRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public CreateTrainingJobRequest setPythonRequirements(java.util.List<String> pythonRequirements) {
        this.pythonRequirements = pythonRequirements;
        return this;
    }
    public java.util.List<String> getPythonRequirements() {
        return this.pythonRequirements;
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

    public CreateTrainingJobRequest setSettings(JobSettings settings) {
        this.settings = settings;
        return this;
    }
    public JobSettings getSettings() {
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
        /**
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("CPU")
        public String CPU;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("GPU")
        public String GPU;

        /**
         * <strong>example:</strong>
         * <p>V100</p>
         */
        @NameInMap("GPUType")
        public String GPUType;

        /**
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("Memory")
        public String memory;

        /**
         * <strong>example:</strong>
         * <p>32</p>
         */
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

    public static class CreateTrainingJobRequestComputeResourceSpotSpec extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>9</p>
         */
        @NameInMap("SpotDiscountLimit")
        public Float spotDiscountLimit;

        /**
         * <strong>example:</strong>
         * <p>SpotWithPriceLimit</p>
         */
        @NameInMap("SpotStrategy")
        public String spotStrategy;

        public static CreateTrainingJobRequestComputeResourceSpotSpec build(java.util.Map<String, ?> map) throws Exception {
            CreateTrainingJobRequestComputeResourceSpotSpec self = new CreateTrainingJobRequestComputeResourceSpotSpec();
            return TeaModel.build(map, self);
        }

        public CreateTrainingJobRequestComputeResourceSpotSpec setSpotDiscountLimit(Float spotDiscountLimit) {
            this.spotDiscountLimit = spotDiscountLimit;
            return this;
        }
        public Float getSpotDiscountLimit() {
            return this.spotDiscountLimit;
        }

        public CreateTrainingJobRequestComputeResourceSpotSpec setSpotStrategy(String spotStrategy) {
            this.spotStrategy = spotStrategy;
            return this;
        }
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

    }

    public static class CreateTrainingJobRequestComputeResource extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("EcsCount")
        public Long ecsCount;

        /**
         * <strong>example:</strong>
         * <p>ecs.gn5-c8g1.2xlarge</p>
         */
        @NameInMap("EcsSpec")
        public String ecsSpec;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("InstanceCount")
        public Long instanceCount;

        @NameInMap("InstanceSpec")
        public CreateTrainingJobRequestComputeResourceInstanceSpec instanceSpec;

        /**
         * <strong>example:</strong>
         * <p>quotam670lixikcs</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("SpotSpec")
        public CreateTrainingJobRequestComputeResourceSpotSpec spotSpec;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("UseSpotInstance")
        public Boolean useSpotInstance;

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

        public CreateTrainingJobRequestComputeResource setSpotSpec(CreateTrainingJobRequestComputeResourceSpotSpec spotSpec) {
            this.spotSpec = spotSpec;
            return this;
        }
        public CreateTrainingJobRequestComputeResourceSpotSpec getSpotSpec() {
            return this.spotSpec;
        }

        public CreateTrainingJobRequestComputeResource setUseSpotInstance(Boolean useSpotInstance) {
            this.useSpotInstance = useSpotInstance;
            return this;
        }
        public Boolean getUseSpotInstance() {
            return this.useSpotInstance;
        }

    }

    public static class CreateTrainingJobRequestExperimentConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>exp-ds9aefia90v</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>learning_rate</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>0.0001</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>d-475megosidivjfgfq6</p>
         */
        @NameInMap("DatasetId")
        public String datasetId;

        /**
         * <strong>example:</strong>
         * <p>oss://pai-quickstart-cn-hangzhou.oss-cn-hangzhou-internal.aliyuncs.com/modelscope/models/qwen2-0.5b/main/</p>
         */
        @NameInMap("InputUri")
        public String inputUri;

        /**
         * <strong>example:</strong>
         * <p>model</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("Options")
        public String options;

        @NameInMap("VersionName")
        public String versionName;

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

        public CreateTrainingJobRequestInputChannels setOptions(String options) {
            this.options = options;
            return this;
        }
        public String getOptions() {
            return this.options;
        }

        public CreateTrainingJobRequestInputChannels setVersionName(String versionName) {
            this.versionName = versionName;
            return this;
        }
        public String getVersionName() {
            return this.versionName;
        }

    }

    public static class CreateTrainingJobRequestLabels extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CreatedBy</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>QuickStart</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>d-475megosidivjfgfq6</p>
         */
        @NameInMap("DatasetId")
        public String datasetId;

        /**
         * <strong>example:</strong>
         * <p>model</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>oss://pai-quickstart-cn-hangzhou.oss-cn-hangzhou-internal.aliyuncs.com/modelscope/models/qwen2-0.5b/main/</p>
         */
        @NameInMap("OutputUri")
        public String outputUri;

        @NameInMap("VersionName")
        public String versionName;

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

        public CreateTrainingJobRequestOutputChannels setVersionName(String versionName) {
            this.versionName = versionName;
            return this;
        }
        public String getVersionName() {
            return this.versionName;
        }

    }

    public static class CreateTrainingJobRequestScheduler extends TeaModel {
        @NameInMap("MaxRunningTimeInMinutes")
        public Long maxRunningTimeInMinutes;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MaxRunningTimeInSeconds")
        public Long maxRunningTimeInSeconds;

        public static CreateTrainingJobRequestScheduler build(java.util.Map<String, ?> map) throws Exception {
            CreateTrainingJobRequestScheduler self = new CreateTrainingJobRequestScheduler();
            return TeaModel.build(map, self);
        }

        public CreateTrainingJobRequestScheduler setMaxRunningTimeInMinutes(Long maxRunningTimeInMinutes) {
            this.maxRunningTimeInMinutes = maxRunningTimeInMinutes;
            return this;
        }
        public Long getMaxRunningTimeInMinutes() {
            return this.maxRunningTimeInMinutes;
        }

        public CreateTrainingJobRequestScheduler setMaxRunningTimeInSeconds(Long maxRunningTimeInSeconds) {
            this.maxRunningTimeInSeconds = maxRunningTimeInSeconds;
            return this;
        }
        public Long getMaxRunningTimeInSeconds() {
            return this.maxRunningTimeInSeconds;
        }

    }

    public static class CreateTrainingJobRequestUserVpc extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>eth0</p>
         */
        @NameInMap("DefaultRoute")
        public String defaultRoute;

        @NameInMap("ExtendedCIDRs")
        public java.util.List<String> extendedCIDRs;

        /**
         * <strong>example:</strong>
         * <p>sg-qdfasd13sdasf</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <strong>example:</strong>
         * <p>vs-icrc813vdsfol</p>
         */
        @NameInMap("SwitchId")
        public String switchId;

        /**
         * <p>VPC ID。</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-dxiflssjx978sl</p>
         */
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
