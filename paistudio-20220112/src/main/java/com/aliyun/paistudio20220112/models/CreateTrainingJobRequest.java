// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class CreateTrainingJobRequest extends TeaModel {
    /**
     * <p>The algorithm name.</p>
     * 
     * <strong>example:</strong>
     * <p>ev_classification</p>
     */
    @NameInMap("AlgorithmName")
    public String algorithmName;

    /**
     * <p>The algorithm provider.</p>
     * 
     * <strong>example:</strong>
     * <p>pai</p>
     */
    @NameInMap("AlgorithmProvider")
    public String algorithmProvider;

    /**
     * <p>The algorithm configuration for the training job.</p>
     */
    @NameInMap("AlgorithmSpec")
    public AlgorithmSpec algorithmSpec;

    /**
     * <p>The algorithm version.</p>
     * 
     * <strong>example:</strong>
     * <p>v1.0.0</p>
     */
    @NameInMap("AlgorithmVersion")
    public String algorithmVersion;

    @NameInMap("AssignNodeSpec")
    public AssignNodeSpec assignNodeSpec;

    /**
     * <p>The code directory for the training job.</p>
     */
    @NameInMap("CodeDir")
    public Location codeDir;

    /**
     * <p>The compute resource configuration.</p>
     */
    @NameInMap("ComputeResource")
    public CreateTrainingJobRequestComputeResource computeResource;

    @NameInMap("CredentialConfig")
    public CredentialConfig credentialConfig;

    /**
     * <p>The environment variables for the training job.</p>
     */
    @NameInMap("Environments")
    public java.util.Map<String, String> environments;

    /**
     * <p>The experiment configuration associated with the training job.</p>
     */
    @NameInMap("ExperimentConfig")
    public CreateTrainingJobRequestExperimentConfig experimentConfig;

    /**
     * <p>The training hyperparameter settings.</p>
     */
    @NameInMap("HyperParameters")
    public java.util.List<CreateTrainingJobRequestHyperParameters> hyperParameters;

    /**
     * <p>The training input data configuration.</p>
     */
    @NameInMap("InputChannels")
    public java.util.List<CreateTrainingJobRequestInputChannels> inputChannels;

    /**
     * <p>The training job labels.</p>
     */
    @NameInMap("Labels")
    public java.util.List<CreateTrainingJobRequestLabels> labels;

    /**
     * <p>The training output data configuration.</p>
     */
    @NameInMap("OutputChannels")
    public java.util.List<CreateTrainingJobRequestOutputChannels> outputChannels;

    /**
     * <p>The priority of the training job.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>The Python package configuration for the training job.</p>
     */
    @NameInMap("PythonRequirements")
    public java.util.List<String> pythonRequirements;

    /**
     * <p>The Alibaba Cloud Resource Name (ARN) of the RAM role. Format: acs:ram::$accountID:role/$roleName.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::1157703270994901:role/aliyunserviceroleforpaiworkspace</p>
     */
    @NameInMap("RoleArn")
    public String roleArn;

    /**
     * <p>The training job scheduling configuration.</p>
     */
    @NameInMap("Scheduler")
    public CreateTrainingJobRequestScheduler scheduler;

    /**
     * <p>The additional parameter settings for the training node.</p>
     */
    @NameInMap("Settings")
    public JobSettings settings;

    /**
     * <p>The description of the training job.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen large language model training</p>
     */
    @NameInMap("TrainingJobDescription")
    public String trainingJobDescription;

    /**
     * <p>The name of the training job.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen_llm</p>
     */
    @NameInMap("TrainingJobName")
    public String trainingJobName;

    /**
     * <p>The VPC configuration.</p>
     */
    @NameInMap("UserVpc")
    public CreateTrainingJobRequestUserVpc userVpc;

    /**
     * <p>The workspace ID.</p>
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

    public CreateTrainingJobRequest setAssignNodeSpec(AssignNodeSpec assignNodeSpec) {
        this.assignNodeSpec = assignNodeSpec;
        return this;
    }
    public AssignNodeSpec getAssignNodeSpec() {
        return this.assignNodeSpec;
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

    public CreateTrainingJobRequest setCredentialConfig(CredentialConfig credentialConfig) {
        this.credentialConfig = credentialConfig;
        return this;
    }
    public CredentialConfig getCredentialConfig() {
        return this.credentialConfig;
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
         * <p>The number of CPU cores for the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("CPU")
        public String CPU;

        /**
         * <p>The number of GPUs for the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("GPU")
        public String GPU;

        /**
         * <p>The GPU type for the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>V100</p>
         */
        @NameInMap("GPUType")
        public String GPUType;

        /**
         * <p>The memory size of the instance. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("Memory")
        public String memory;

        /**
         * <p>The shared memory size of the instance. Unit: GB.</p>
         * 
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
         * <p>The maximum hourly price discount for the instance. This parameter takes effect only when SpotStrategy is set to SpotWithPriceLimit.</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        @NameInMap("SpotDiscountLimit")
        public Float spotDiscountLimit;

        /**
         * <p>The bidding strategy for the spot instance. Valid values:</p>
         * <ul>
         * <li>SpotWithPriceLimit: a spot instance with a maximum price limit.</li>
         * <li>SpotAsPriceGo: the system automatically bids at the current market price.</li>
         * </ul>
         * 
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
         * <p>The number of ECS instances.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("EcsCount")
        public Long ecsCount;

        /**
         * <p>The ECS instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.gn5-c8g1.2xlarge</p>
         */
        @NameInMap("EcsSpec")
        public String ecsSpec;

        /**
         * <p>The number of instances used from the resource quota.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("InstanceCount")
        public Long instanceCount;

        /**
         * <p>The instance specification for the resource quota.</p>
         */
        @NameInMap("InstanceSpec")
        public CreateTrainingJobRequestComputeResourceInstanceSpec instanceSpec;

        /**
         * <p>The resource quota ID.</p>
         * 
         * <strong>example:</strong>
         * <p>quotam670lixikcs</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The spot instance configuration.</p>
         */
        @NameInMap("SpotSpec")
        public CreateTrainingJobRequestComputeResourceSpotSpec spotSpec;

        /**
         * <p>Specifies whether to use spot instances.</p>
         * 
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
         * <p>The experiment ID associated with the training job.</p>
         * 
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
         * <p>The parameter name.</p>
         * 
         * <strong>example:</strong>
         * <p>learning_rate</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The parameter value.</p>
         * 
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
         * <p>The dataset ID.</p>
         * 
         * <strong>example:</strong>
         * <p>d-475megosidivjfgfq6</p>
         */
        @NameInMap("DatasetId")
        public String datasetId;

        /**
         * <p>The input data URI.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://pai-quickstart-cn-hangzhou.oss-cn-hangzhou-internal.aliyuncs.com/modelscope/models/qwen2-0.5b/main/</p>
         */
        @NameInMap("InputUri")
        public String inputUri;

        /**
         * <p>The input data name.</p>
         * 
         * <strong>example:</strong>
         * <p>model</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The input data parameter settings.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;appendable&quot;: true}</p>
         */
        @NameInMap("Options")
        public String options;

        @NameInMap("RoleArn")
        public String roleArn;

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

        public CreateTrainingJobRequestInputChannels setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
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
         * <p>The key of the label.</p>
         * 
         * <strong>example:</strong>
         * <p>CreatedBy</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the label.</p>
         * 
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
         * <p>The dataset ID.</p>
         * 
         * <strong>example:</strong>
         * <p>d-475megosidivjfgfq6</p>
         */
        @NameInMap("DatasetId")
        public String datasetId;

        /**
         * <p>The output data name.</p>
         * 
         * <strong>example:</strong>
         * <p>model</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The output data URI.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://pai-quickstart-cn-hangzhou.oss-cn-hangzhou-internal.aliyuncs.com/modelscope/models/qwen2-0.5b/main/</p>
         */
        @NameInMap("OutputUri")
        public String outputUri;

        @NameInMap("RoleArn")
        public String roleArn;

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

        public CreateTrainingJobRequestOutputChannels setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
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
        /**
         * <p>The maximum training runtime in minutes. A value of 0 indicates no limit on the maximum runtime.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MaxRunningTimeInMinutes")
        public Long maxRunningTimeInMinutes;

        /**
         * <p>The maximum training runtime in seconds. A value of 0 indicates no limit on the maximum runtime.</p>
         * 
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
         * <p>The default route interface. eth0 indicates that the default route uses the PAI VPC. eth1 indicates that the default route uses the user VPC. Default value: eth0.</p>
         * 
         * <strong>example:</strong>
         * <p>eth0</p>
         */
        @NameInMap("DefaultRoute")
        public String defaultRoute;

        /**
         * <p>The extended CIDR block configuration.</p>
         */
        @NameInMap("ExtendedCIDRs")
        public java.util.List<String> extendedCIDRs;

        /**
         * <p>The security group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-qdfasd13sdasf</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The vSwitch ID.</p>
         * 
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
