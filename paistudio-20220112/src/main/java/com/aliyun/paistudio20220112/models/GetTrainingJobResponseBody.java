// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class GetTrainingJobResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>algo-xsldfvu1334</p>
     */
    @NameInMap("AlgorithmId")
    public String algorithmId;

    /**
     * <strong>example:</strong>
     * <p>llm_training</p>
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
     * <p>v0.0.1</p>
     */
    @NameInMap("AlgorithmVersion")
    public String algorithmVersion;

    @NameInMap("ComputeResource")
    public GetTrainingJobResponseBodyComputeResource computeResource;

    /**
     * <strong>example:</strong>
     * <p>7200</p>
     */
    @NameInMap("Duration")
    public Long duration;

    @NameInMap("Environments")
    public java.util.Map<String, String> environments;

    @NameInMap("ExperimentConfig")
    public GetTrainingJobResponseBodyExperimentConfig experimentConfig;

    /**
     * <strong>example:</strong>
     * <p>2024-07-10T11:49:47Z</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <strong>example:</strong>
     * <p>2024-07-10T11:49:47Z</p>
     */
    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    @NameInMap("HyperParameters")
    public java.util.List<GetTrainingJobResponseBodyHyperParameters> hyperParameters;

    @NameInMap("InputChannels")
    public java.util.List<GetTrainingJobResponseBodyInputChannels> inputChannels;

    @NameInMap("Instances")
    public java.util.List<GetTrainingJobResponseBodyInstances> instances;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsTempAlgo")
    public Boolean isTempAlgo;

    @NameInMap("Labels")
    public java.util.List<GetTrainingJobResponseBodyLabels> labels;

    @NameInMap("LatestMetrics")
    public java.util.List<GetTrainingJobResponseBodyLatestMetrics> latestMetrics;

    @NameInMap("LatestProgress")
    public GetTrainingJobResponseBodyLatestProgress latestProgress;

    @NameInMap("OutputChannels")
    public java.util.List<GetTrainingJobResponseBodyOutputChannels> outputChannels;

    @NameInMap("OutputModel")
    public GetTrainingJobResponseBodyOutputModel outputModel;

    @NameInMap("Priority")
    public Integer priority;

    @NameInMap("PythonRequirements")
    public java.util.List<String> pythonRequirements;

    /**
     * <strong>example:</strong>
     * <p>TrainingJobSucceed</p>
     */
    @NameInMap("ReasonCode")
    public String reasonCode;

    /**
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("ReasonMessage")
    public String reasonMessage;

    /**
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>acs:ram::{accountID}:role/{roleName}</p>
     */
    @NameInMap("RoleArn")
    public String roleArn;

    @NameInMap("Scheduler")
    public GetTrainingJobResponseBodyScheduler scheduler;

    @NameInMap("Settings")
    public JobSettings settings;

    /**
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("Status")
    public String status;

    @NameInMap("StatusTransitions")
    public java.util.List<GetTrainingJobResponseBodyStatusTransitions> statusTransitions;

    @NameInMap("TrainingJobDescription")
    public String trainingJobDescription;

    /**
     * <strong>example:</strong>
     * <p>traini6hhxiq69eo</p>
     */
    @NameInMap("TrainingJobId")
    public String trainingJobId;

    /**
     * <strong>example:</strong>
     * <p>qwen_llm</p>
     */
    @NameInMap("TrainingJobName")
    public String trainingJobName;

    /**
     * <strong>example:</strong>
     * <p><a href="https://pai.console.aliyun.com/?regionId=cn-hangzhou&workspaceId=1234#/training/jobs/train1ouyadsl8n4">https://pai.console.aliyun.com/?regionId=cn-hangzhou&amp;workspaceId=1234#/training/jobs/train1ouyadsl8n4</a></p>
     */
    @NameInMap("TrainingJobUrl")
    public String trainingJobUrl;

    /**
     * <strong>example:</strong>
     * <p>123456789</p>
     */
    @NameInMap("UserId")
    public String userId;

    @NameInMap("UserVpc")
    public GetTrainingJobResponseBodyUserVpc userVpc;

    /**
     * <strong>example:</strong>
     * <p>86995</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetTrainingJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTrainingJobResponseBody self = new GetTrainingJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTrainingJobResponseBody setAlgorithmId(String algorithmId) {
        this.algorithmId = algorithmId;
        return this;
    }
    public String getAlgorithmId() {
        return this.algorithmId;
    }

    public GetTrainingJobResponseBody setAlgorithmName(String algorithmName) {
        this.algorithmName = algorithmName;
        return this;
    }
    public String getAlgorithmName() {
        return this.algorithmName;
    }

    public GetTrainingJobResponseBody setAlgorithmProvider(String algorithmProvider) {
        this.algorithmProvider = algorithmProvider;
        return this;
    }
    public String getAlgorithmProvider() {
        return this.algorithmProvider;
    }

    public GetTrainingJobResponseBody setAlgorithmSpec(AlgorithmSpec algorithmSpec) {
        this.algorithmSpec = algorithmSpec;
        return this;
    }
    public AlgorithmSpec getAlgorithmSpec() {
        return this.algorithmSpec;
    }

    public GetTrainingJobResponseBody setAlgorithmVersion(String algorithmVersion) {
        this.algorithmVersion = algorithmVersion;
        return this;
    }
    public String getAlgorithmVersion() {
        return this.algorithmVersion;
    }

    public GetTrainingJobResponseBody setComputeResource(GetTrainingJobResponseBodyComputeResource computeResource) {
        this.computeResource = computeResource;
        return this;
    }
    public GetTrainingJobResponseBodyComputeResource getComputeResource() {
        return this.computeResource;
    }

    public GetTrainingJobResponseBody setDuration(Long duration) {
        this.duration = duration;
        return this;
    }
    public Long getDuration() {
        return this.duration;
    }

    public GetTrainingJobResponseBody setEnvironments(java.util.Map<String, String> environments) {
        this.environments = environments;
        return this;
    }
    public java.util.Map<String, String> getEnvironments() {
        return this.environments;
    }

    public GetTrainingJobResponseBody setExperimentConfig(GetTrainingJobResponseBodyExperimentConfig experimentConfig) {
        this.experimentConfig = experimentConfig;
        return this;
    }
    public GetTrainingJobResponseBodyExperimentConfig getExperimentConfig() {
        return this.experimentConfig;
    }

    public GetTrainingJobResponseBody setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public GetTrainingJobResponseBody setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public GetTrainingJobResponseBody setHyperParameters(java.util.List<GetTrainingJobResponseBodyHyperParameters> hyperParameters) {
        this.hyperParameters = hyperParameters;
        return this;
    }
    public java.util.List<GetTrainingJobResponseBodyHyperParameters> getHyperParameters() {
        return this.hyperParameters;
    }

    public GetTrainingJobResponseBody setInputChannels(java.util.List<GetTrainingJobResponseBodyInputChannels> inputChannels) {
        this.inputChannels = inputChannels;
        return this;
    }
    public java.util.List<GetTrainingJobResponseBodyInputChannels> getInputChannels() {
        return this.inputChannels;
    }

    public GetTrainingJobResponseBody setInstances(java.util.List<GetTrainingJobResponseBodyInstances> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<GetTrainingJobResponseBodyInstances> getInstances() {
        return this.instances;
    }

    public GetTrainingJobResponseBody setIsTempAlgo(Boolean isTempAlgo) {
        this.isTempAlgo = isTempAlgo;
        return this;
    }
    public Boolean getIsTempAlgo() {
        return this.isTempAlgo;
    }

    public GetTrainingJobResponseBody setLabels(java.util.List<GetTrainingJobResponseBodyLabels> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<GetTrainingJobResponseBodyLabels> getLabels() {
        return this.labels;
    }

    public GetTrainingJobResponseBody setLatestMetrics(java.util.List<GetTrainingJobResponseBodyLatestMetrics> latestMetrics) {
        this.latestMetrics = latestMetrics;
        return this;
    }
    public java.util.List<GetTrainingJobResponseBodyLatestMetrics> getLatestMetrics() {
        return this.latestMetrics;
    }

    public GetTrainingJobResponseBody setLatestProgress(GetTrainingJobResponseBodyLatestProgress latestProgress) {
        this.latestProgress = latestProgress;
        return this;
    }
    public GetTrainingJobResponseBodyLatestProgress getLatestProgress() {
        return this.latestProgress;
    }

    public GetTrainingJobResponseBody setOutputChannels(java.util.List<GetTrainingJobResponseBodyOutputChannels> outputChannels) {
        this.outputChannels = outputChannels;
        return this;
    }
    public java.util.List<GetTrainingJobResponseBodyOutputChannels> getOutputChannels() {
        return this.outputChannels;
    }

    public GetTrainingJobResponseBody setOutputModel(GetTrainingJobResponseBodyOutputModel outputModel) {
        this.outputModel = outputModel;
        return this;
    }
    public GetTrainingJobResponseBodyOutputModel getOutputModel() {
        return this.outputModel;
    }

    public GetTrainingJobResponseBody setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public GetTrainingJobResponseBody setPythonRequirements(java.util.List<String> pythonRequirements) {
        this.pythonRequirements = pythonRequirements;
        return this;
    }
    public java.util.List<String> getPythonRequirements() {
        return this.pythonRequirements;
    }

    public GetTrainingJobResponseBody setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
        return this;
    }
    public String getReasonCode() {
        return this.reasonCode;
    }

    public GetTrainingJobResponseBody setReasonMessage(String reasonMessage) {
        this.reasonMessage = reasonMessage;
        return this;
    }
    public String getReasonMessage() {
        return this.reasonMessage;
    }

    public GetTrainingJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTrainingJobResponseBody setRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }
    public String getRoleArn() {
        return this.roleArn;
    }

    public GetTrainingJobResponseBody setScheduler(GetTrainingJobResponseBodyScheduler scheduler) {
        this.scheduler = scheduler;
        return this;
    }
    public GetTrainingJobResponseBodyScheduler getScheduler() {
        return this.scheduler;
    }

    public GetTrainingJobResponseBody setSettings(JobSettings settings) {
        this.settings = settings;
        return this;
    }
    public JobSettings getSettings() {
        return this.settings;
    }

    public GetTrainingJobResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetTrainingJobResponseBody setStatusTransitions(java.util.List<GetTrainingJobResponseBodyStatusTransitions> statusTransitions) {
        this.statusTransitions = statusTransitions;
        return this;
    }
    public java.util.List<GetTrainingJobResponseBodyStatusTransitions> getStatusTransitions() {
        return this.statusTransitions;
    }

    public GetTrainingJobResponseBody setTrainingJobDescription(String trainingJobDescription) {
        this.trainingJobDescription = trainingJobDescription;
        return this;
    }
    public String getTrainingJobDescription() {
        return this.trainingJobDescription;
    }

    public GetTrainingJobResponseBody setTrainingJobId(String trainingJobId) {
        this.trainingJobId = trainingJobId;
        return this;
    }
    public String getTrainingJobId() {
        return this.trainingJobId;
    }

    public GetTrainingJobResponseBody setTrainingJobName(String trainingJobName) {
        this.trainingJobName = trainingJobName;
        return this;
    }
    public String getTrainingJobName() {
        return this.trainingJobName;
    }

    public GetTrainingJobResponseBody setTrainingJobUrl(String trainingJobUrl) {
        this.trainingJobUrl = trainingJobUrl;
        return this;
    }
    public String getTrainingJobUrl() {
        return this.trainingJobUrl;
    }

    public GetTrainingJobResponseBody setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public GetTrainingJobResponseBody setUserVpc(GetTrainingJobResponseBodyUserVpc userVpc) {
        this.userVpc = userVpc;
        return this;
    }
    public GetTrainingJobResponseBodyUserVpc getUserVpc() {
        return this.userVpc;
    }

    public GetTrainingJobResponseBody setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class GetTrainingJobResponseBodyComputeResourceInstanceSpec extends TeaModel {
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

        public static GetTrainingJobResponseBodyComputeResourceInstanceSpec build(java.util.Map<String, ?> map) throws Exception {
            GetTrainingJobResponseBodyComputeResourceInstanceSpec self = new GetTrainingJobResponseBodyComputeResourceInstanceSpec();
            return TeaModel.build(map, self);
        }

        public GetTrainingJobResponseBodyComputeResourceInstanceSpec setCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }
        public String getCPU() {
            return this.CPU;
        }

        public GetTrainingJobResponseBodyComputeResourceInstanceSpec setGPU(String GPU) {
            this.GPU = GPU;
            return this;
        }
        public String getGPU() {
            return this.GPU;
        }

        public GetTrainingJobResponseBodyComputeResourceInstanceSpec setGPUType(String GPUType) {
            this.GPUType = GPUType;
            return this;
        }
        public String getGPUType() {
            return this.GPUType;
        }

        public GetTrainingJobResponseBodyComputeResourceInstanceSpec setMemory(String memory) {
            this.memory = memory;
            return this;
        }
        public String getMemory() {
            return this.memory;
        }

        public GetTrainingJobResponseBodyComputeResourceInstanceSpec setSharedMemory(String sharedMemory) {
            this.sharedMemory = sharedMemory;
            return this;
        }
        public String getSharedMemory() {
            return this.sharedMemory;
        }

    }

    public static class GetTrainingJobResponseBodyComputeResourceSpotSpec extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0.9</p>
         */
        @NameInMap("SpotDiscountLimit")
        public Float spotDiscountLimit;

        /**
         * <strong>example:</strong>
         * <p>SpotWithPriceLimit</p>
         */
        @NameInMap("SpotStrategy")
        public String spotStrategy;

        public static GetTrainingJobResponseBodyComputeResourceSpotSpec build(java.util.Map<String, ?> map) throws Exception {
            GetTrainingJobResponseBodyComputeResourceSpotSpec self = new GetTrainingJobResponseBodyComputeResourceSpotSpec();
            return TeaModel.build(map, self);
        }

        public GetTrainingJobResponseBodyComputeResourceSpotSpec setSpotDiscountLimit(Float spotDiscountLimit) {
            this.spotDiscountLimit = spotDiscountLimit;
            return this;
        }
        public Float getSpotDiscountLimit() {
            return this.spotDiscountLimit;
        }

        public GetTrainingJobResponseBodyComputeResourceSpotSpec setSpotStrategy(String spotStrategy) {
            this.spotStrategy = spotStrategy;
            return this;
        }
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

    }

    public static class GetTrainingJobResponseBodyComputeResource extends TeaModel {
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
        public GetTrainingJobResponseBodyComputeResourceInstanceSpec instanceSpec;

        /**
         * <strong>example:</strong>
         * <p>quotam670lixikcl</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("ResourceName")
        public String resourceName;

        @NameInMap("SpotSpec")
        public GetTrainingJobResponseBodyComputeResourceSpotSpec spotSpec;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("UseSpotInstance")
        public Boolean useSpotInstance;

        public static GetTrainingJobResponseBodyComputeResource build(java.util.Map<String, ?> map) throws Exception {
            GetTrainingJobResponseBodyComputeResource self = new GetTrainingJobResponseBodyComputeResource();
            return TeaModel.build(map, self);
        }

        public GetTrainingJobResponseBodyComputeResource setEcsCount(Long ecsCount) {
            this.ecsCount = ecsCount;
            return this;
        }
        public Long getEcsCount() {
            return this.ecsCount;
        }

        public GetTrainingJobResponseBodyComputeResource setEcsSpec(String ecsSpec) {
            this.ecsSpec = ecsSpec;
            return this;
        }
        public String getEcsSpec() {
            return this.ecsSpec;
        }

        public GetTrainingJobResponseBodyComputeResource setInstanceCount(Long instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }
        public Long getInstanceCount() {
            return this.instanceCount;
        }

        public GetTrainingJobResponseBodyComputeResource setInstanceSpec(GetTrainingJobResponseBodyComputeResourceInstanceSpec instanceSpec) {
            this.instanceSpec = instanceSpec;
            return this;
        }
        public GetTrainingJobResponseBodyComputeResourceInstanceSpec getInstanceSpec() {
            return this.instanceSpec;
        }

        public GetTrainingJobResponseBodyComputeResource setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public GetTrainingJobResponseBodyComputeResource setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

        public GetTrainingJobResponseBodyComputeResource setSpotSpec(GetTrainingJobResponseBodyComputeResourceSpotSpec spotSpec) {
            this.spotSpec = spotSpec;
            return this;
        }
        public GetTrainingJobResponseBodyComputeResourceSpotSpec getSpotSpec() {
            return this.spotSpec;
        }

        public GetTrainingJobResponseBodyComputeResource setUseSpotInstance(Boolean useSpotInstance) {
            this.useSpotInstance = useSpotInstance;
            return this;
        }
        public Boolean getUseSpotInstance() {
            return this.useSpotInstance;
        }

    }

    public static class GetTrainingJobResponseBodyExperimentConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>exp-ds9aefia90v</p>
         */
        @NameInMap("ExperimentId")
        public String experimentId;

        /**
         * <strong>example:</strong>
         * <p>large_language_model_train</p>
         */
        @NameInMap("ExperimentName")
        public String experimentName;

        public static GetTrainingJobResponseBodyExperimentConfig build(java.util.Map<String, ?> map) throws Exception {
            GetTrainingJobResponseBodyExperimentConfig self = new GetTrainingJobResponseBodyExperimentConfig();
            return TeaModel.build(map, self);
        }

        public GetTrainingJobResponseBodyExperimentConfig setExperimentId(String experimentId) {
            this.experimentId = experimentId;
            return this;
        }
        public String getExperimentId() {
            return this.experimentId;
        }

        public GetTrainingJobResponseBodyExperimentConfig setExperimentName(String experimentName) {
            this.experimentName = experimentName;
            return this;
        }
        public String getExperimentName() {
            return this.experimentName;
        }

    }

    public static class GetTrainingJobResponseBodyHyperParameters extends TeaModel {
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

        public static GetTrainingJobResponseBodyHyperParameters build(java.util.Map<String, ?> map) throws Exception {
            GetTrainingJobResponseBodyHyperParameters self = new GetTrainingJobResponseBodyHyperParameters();
            return TeaModel.build(map, self);
        }

        public GetTrainingJobResponseBodyHyperParameters setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetTrainingJobResponseBodyHyperParameters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetTrainingJobResponseBodyInputChannels extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>d-475megosidivjfgfq6</p>
         */
        @NameInMap("DatasetId")
        public String datasetId;

        /**
         * <strong>example:</strong>
         * <p>oss://test-bucket.oss-cn-hangzhou-internal.aliyuncs.com/path/to/input/model/</p>
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

        public static GetTrainingJobResponseBodyInputChannels build(java.util.Map<String, ?> map) throws Exception {
            GetTrainingJobResponseBodyInputChannels self = new GetTrainingJobResponseBodyInputChannels();
            return TeaModel.build(map, self);
        }

        public GetTrainingJobResponseBodyInputChannels setDatasetId(String datasetId) {
            this.datasetId = datasetId;
            return this;
        }
        public String getDatasetId() {
            return this.datasetId;
        }

        public GetTrainingJobResponseBodyInputChannels setInputUri(String inputUri) {
            this.inputUri = inputUri;
            return this;
        }
        public String getInputUri() {
            return this.inputUri;
        }

        public GetTrainingJobResponseBodyInputChannels setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetTrainingJobResponseBodyInputChannels setOptions(String options) {
            this.options = options;
            return this;
        }
        public String getOptions() {
            return this.options;
        }

        public GetTrainingJobResponseBodyInputChannels setVersionName(String versionName) {
            this.versionName = versionName;
            return this;
        }
        public String getVersionName() {
            return this.versionName;
        }

    }

    public static class GetTrainingJobResponseBodyInstances extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>train1oug3yehan4-master-0</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>master</p>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <strong>example:</strong>
         * <p>Succeeded</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetTrainingJobResponseBodyInstances build(java.util.Map<String, ?> map) throws Exception {
            GetTrainingJobResponseBodyInstances self = new GetTrainingJobResponseBodyInstances();
            return TeaModel.build(map, self);
        }

        public GetTrainingJobResponseBodyInstances setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetTrainingJobResponseBodyInstances setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public GetTrainingJobResponseBodyInstances setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetTrainingJobResponseBodyLabels extends TeaModel {
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

        public static GetTrainingJobResponseBodyLabels build(java.util.Map<String, ?> map) throws Exception {
            GetTrainingJobResponseBodyLabels self = new GetTrainingJobResponseBodyLabels();
            return TeaModel.build(map, self);
        }

        public GetTrainingJobResponseBodyLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetTrainingJobResponseBodyLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetTrainingJobResponseBodyLatestMetrics extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>loss</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>2024-07-10T11:49:47Z</p>
         */
        @NameInMap("Timestamp")
        public String timestamp;

        /**
         * <strong>example:</strong>
         * <p>0.11</p>
         */
        @NameInMap("Value")
        public Double value;

        public static GetTrainingJobResponseBodyLatestMetrics build(java.util.Map<String, ?> map) throws Exception {
            GetTrainingJobResponseBodyLatestMetrics self = new GetTrainingJobResponseBodyLatestMetrics();
            return TeaModel.build(map, self);
        }

        public GetTrainingJobResponseBodyLatestMetrics setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetTrainingJobResponseBodyLatestMetrics setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

        public GetTrainingJobResponseBodyLatestMetrics setValue(Double value) {
            this.value = value;
            return this;
        }
        public Double getValue() {
            return this.value;
        }

    }

    public static class GetTrainingJobResponseBodyLatestProgressOverallProgress extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2023-07-04T13:20:18Z</p>
         */
        @NameInMap("Timestamp")
        public String timestamp;

        /**
         * <strong>example:</strong>
         * <p>0.75</p>
         */
        @NameInMap("Value")
        public Float value;

        public static GetTrainingJobResponseBodyLatestProgressOverallProgress build(java.util.Map<String, ?> map) throws Exception {
            GetTrainingJobResponseBodyLatestProgressOverallProgress self = new GetTrainingJobResponseBodyLatestProgressOverallProgress();
            return TeaModel.build(map, self);
        }

        public GetTrainingJobResponseBodyLatestProgressOverallProgress setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

        public GetTrainingJobResponseBodyLatestProgressOverallProgress setValue(Float value) {
            this.value = value;
            return this;
        }
        public Float getValue() {
            return this.value;
        }

    }

    public static class GetTrainingJobResponseBodyLatestProgressRemainingTime extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2023-07-04T13:20:18Z</p>
         */
        @NameInMap("Timestamp")
        public String timestamp;

        /**
         * <strong>example:</strong>
         * <p>3600</p>
         */
        @NameInMap("Value")
        public Long value;

        public static GetTrainingJobResponseBodyLatestProgressRemainingTime build(java.util.Map<String, ?> map) throws Exception {
            GetTrainingJobResponseBodyLatestProgressRemainingTime self = new GetTrainingJobResponseBodyLatestProgressRemainingTime();
            return TeaModel.build(map, self);
        }

        public GetTrainingJobResponseBodyLatestProgressRemainingTime setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

        public GetTrainingJobResponseBodyLatestProgressRemainingTime setValue(Long value) {
            this.value = value;
            return this;
        }
        public Long getValue() {
            return this.value;
        }

    }

    public static class GetTrainingJobResponseBodyLatestProgress extends TeaModel {
        @NameInMap("OverallProgress")
        public GetTrainingJobResponseBodyLatestProgressOverallProgress overallProgress;

        @NameInMap("RemainingTime")
        public GetTrainingJobResponseBodyLatestProgressRemainingTime remainingTime;

        public static GetTrainingJobResponseBodyLatestProgress build(java.util.Map<String, ?> map) throws Exception {
            GetTrainingJobResponseBodyLatestProgress self = new GetTrainingJobResponseBodyLatestProgress();
            return TeaModel.build(map, self);
        }

        public GetTrainingJobResponseBodyLatestProgress setOverallProgress(GetTrainingJobResponseBodyLatestProgressOverallProgress overallProgress) {
            this.overallProgress = overallProgress;
            return this;
        }
        public GetTrainingJobResponseBodyLatestProgressOverallProgress getOverallProgress() {
            return this.overallProgress;
        }

        public GetTrainingJobResponseBodyLatestProgress setRemainingTime(GetTrainingJobResponseBodyLatestProgressRemainingTime remainingTime) {
            this.remainingTime = remainingTime;
            return this;
        }
        public GetTrainingJobResponseBodyLatestProgressRemainingTime getRemainingTime() {
            return this.remainingTime;
        }

    }

    public static class GetTrainingJobResponseBodyOutputChannels extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>d-8o0hh35po15ejcdq2p</p>
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
         * <p>oss://test-bucket.oss-cn-hangzhou-internal.aliyuncs.com/path/to/output/model/</p>
         */
        @NameInMap("OutputUri")
        public String outputUri;

        @NameInMap("VersionName")
        public String versionName;

        public static GetTrainingJobResponseBodyOutputChannels build(java.util.Map<String, ?> map) throws Exception {
            GetTrainingJobResponseBodyOutputChannels self = new GetTrainingJobResponseBodyOutputChannels();
            return TeaModel.build(map, self);
        }

        public GetTrainingJobResponseBodyOutputChannels setDatasetId(String datasetId) {
            this.datasetId = datasetId;
            return this;
        }
        public String getDatasetId() {
            return this.datasetId;
        }

        public GetTrainingJobResponseBodyOutputChannels setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetTrainingJobResponseBodyOutputChannels setOutputUri(String outputUri) {
            this.outputUri = outputUri;
            return this;
        }
        public String getOutputUri() {
            return this.outputUri;
        }

        public GetTrainingJobResponseBodyOutputChannels setVersionName(String versionName) {
            this.versionName = versionName;
            return this;
        }
        public String getVersionName() {
            return this.versionName;
        }

    }

    public static class GetTrainingJobResponseBodyOutputModel extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>model</p>
         */
        @NameInMap("OutputChannelName")
        public String outputChannelName;

        /**
         * <strong>example:</strong>
         * <p>oss://test-bucket.oss-cn-hangzhou-internal.aliyuncs.com/path/to/model/output/</p>
         */
        @NameInMap("Uri")
        public String uri;

        public static GetTrainingJobResponseBodyOutputModel build(java.util.Map<String, ?> map) throws Exception {
            GetTrainingJobResponseBodyOutputModel self = new GetTrainingJobResponseBodyOutputModel();
            return TeaModel.build(map, self);
        }

        public GetTrainingJobResponseBodyOutputModel setOutputChannelName(String outputChannelName) {
            this.outputChannelName = outputChannelName;
            return this;
        }
        public String getOutputChannelName() {
            return this.outputChannelName;
        }

        public GetTrainingJobResponseBodyOutputModel setUri(String uri) {
            this.uri = uri;
            return this;
        }
        public String getUri() {
            return this.uri;
        }

    }

    public static class GetTrainingJobResponseBodyScheduler extends TeaModel {
        @NameInMap("MaxRunningTimeInMinutes")
        public String maxRunningTimeInMinutes;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MaxRunningTimeInSeconds")
        public String maxRunningTimeInSeconds;

        public static GetTrainingJobResponseBodyScheduler build(java.util.Map<String, ?> map) throws Exception {
            GetTrainingJobResponseBodyScheduler self = new GetTrainingJobResponseBodyScheduler();
            return TeaModel.build(map, self);
        }

        public GetTrainingJobResponseBodyScheduler setMaxRunningTimeInMinutes(String maxRunningTimeInMinutes) {
            this.maxRunningTimeInMinutes = maxRunningTimeInMinutes;
            return this;
        }
        public String getMaxRunningTimeInMinutes() {
            return this.maxRunningTimeInMinutes;
        }

        public GetTrainingJobResponseBodyScheduler setMaxRunningTimeInSeconds(String maxRunningTimeInSeconds) {
            this.maxRunningTimeInSeconds = maxRunningTimeInSeconds;
            return this;
        }
        public String getMaxRunningTimeInSeconds() {
            return this.maxRunningTimeInSeconds;
        }

    }

    public static class GetTrainingJobResponseBodyStatusTransitions extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2024-07-10T11:49:47Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>TrainingJobSucceed</p>
         */
        @NameInMap("ReasonCode")
        public String reasonCode;

        /**
         * <strong>example:</strong>
         * <p>KubeDL job runs successfully</p>
         */
        @NameInMap("ReasonMessage")
        public String reasonMessage;

        /**
         * <strong>example:</strong>
         * <p>2024-07-10T11:49:47Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <strong>example:</strong>
         * <p>Creating</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetTrainingJobResponseBodyStatusTransitions build(java.util.Map<String, ?> map) throws Exception {
            GetTrainingJobResponseBodyStatusTransitions self = new GetTrainingJobResponseBodyStatusTransitions();
            return TeaModel.build(map, self);
        }

        public GetTrainingJobResponseBodyStatusTransitions setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetTrainingJobResponseBodyStatusTransitions setReasonCode(String reasonCode) {
            this.reasonCode = reasonCode;
            return this;
        }
        public String getReasonCode() {
            return this.reasonCode;
        }

        public GetTrainingJobResponseBodyStatusTransitions setReasonMessage(String reasonMessage) {
            this.reasonMessage = reasonMessage;
            return this;
        }
        public String getReasonMessage() {
            return this.reasonMessage;
        }

        public GetTrainingJobResponseBodyStatusTransitions setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetTrainingJobResponseBodyStatusTransitions setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetTrainingJobResponseBodyUserVpc extends TeaModel {
        @NameInMap("ExtendedCIDRs")
        public java.util.List<String> extendedCIDRs;

        /**
         * <strong>example:</strong>
         * <p>sg-abcdef****</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <strong>example:</strong>
         * <p>vs-abcdef****</p>
         */
        @NameInMap("SwitchId")
        public String switchId;

        /**
         * <p>VPC ID。</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-abcdef****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static GetTrainingJobResponseBodyUserVpc build(java.util.Map<String, ?> map) throws Exception {
            GetTrainingJobResponseBodyUserVpc self = new GetTrainingJobResponseBodyUserVpc();
            return TeaModel.build(map, self);
        }

        public GetTrainingJobResponseBodyUserVpc setExtendedCIDRs(java.util.List<String> extendedCIDRs) {
            this.extendedCIDRs = extendedCIDRs;
            return this;
        }
        public java.util.List<String> getExtendedCIDRs() {
            return this.extendedCIDRs;
        }

        public GetTrainingJobResponseBodyUserVpc setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public GetTrainingJobResponseBodyUserVpc setSwitchId(String switchId) {
            this.switchId = switchId;
            return this;
        }
        public String getSwitchId() {
            return this.switchId;
        }

        public GetTrainingJobResponseBodyUserVpc setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
