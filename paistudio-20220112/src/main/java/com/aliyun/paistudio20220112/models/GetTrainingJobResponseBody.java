// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class GetTrainingJobResponseBody extends TeaModel {
    @NameInMap("AlgorithmId")
    public String algorithmId;

    @NameInMap("AlgorithmName")
    public String algorithmName;

    @NameInMap("AlgorithmProvider")
    public String algorithmProvider;

    @NameInMap("AlgorithmSpec")
    public AlgorithmSpec algorithmSpec;

    @NameInMap("AlgorithmVersion")
    public String algorithmVersion;

    @NameInMap("ComputeResource")
    public GetTrainingJobResponseBodyComputeResource computeResource;

    @NameInMap("Duration")
    public Long duration;

    @NameInMap("ExperimentConfig")
    public GetTrainingJobResponseBodyExperimentConfig experimentConfig;

    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    @NameInMap("HyperParameters")
    public java.util.List<GetTrainingJobResponseBodyHyperParameters> hyperParameters;

    @NameInMap("InputChannels")
    public java.util.List<GetTrainingJobResponseBodyInputChannels> inputChannels;

    @NameInMap("Instances")
    public java.util.List<GetTrainingJobResponseBodyInstances> instances;

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

    @NameInMap("ReasonCode")
    public String reasonCode;

    @NameInMap("ReasonMessage")
    public String reasonMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RoleArn")
    public String roleArn;

    @NameInMap("Scheduler")
    public GetTrainingJobResponseBodyScheduler scheduler;

    @NameInMap("Settings")
    public GetTrainingJobResponseBodySettings settings;

    @NameInMap("Status")
    public String status;

    @NameInMap("StatusTransitions")
    public java.util.List<GetTrainingJobResponseBodyStatusTransitions> statusTransitions;

    @NameInMap("TrainingJobDescription")
    public String trainingJobDescription;

    @NameInMap("TrainingJobId")
    public String trainingJobId;

    @NameInMap("TrainingJobName")
    public String trainingJobName;

    @NameInMap("TrainingJobUrl")
    public String trainingJobUrl;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("UserVpc")
    public GetTrainingJobResponseBodyUserVpc userVpc;

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

    public GetTrainingJobResponseBody setSettings(GetTrainingJobResponseBodySettings settings) {
        this.settings = settings;
        return this;
    }
    public GetTrainingJobResponseBodySettings getSettings() {
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

    public static class GetTrainingJobResponseBodyComputeResource extends TeaModel {
        @NameInMap("EcsCount")
        public Long ecsCount;

        @NameInMap("EcsSpec")
        public String ecsSpec;

        @NameInMap("InstanceCount")
        public Long instanceCount;

        @NameInMap("InstanceSpec")
        public GetTrainingJobResponseBodyComputeResourceInstanceSpec instanceSpec;

        @NameInMap("ResourceId")
        public String resourceId;

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

    }

    public static class GetTrainingJobResponseBodyExperimentConfig extends TeaModel {
        @NameInMap("ExperimentId")
        public String experimentId;

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
        @NameInMap("Name")
        public String name;

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
        @NameInMap("DatasetId")
        public String datasetId;

        @NameInMap("InputUri")
        public String inputUri;

        @NameInMap("Name")
        public String name;

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

    }

    public static class GetTrainingJobResponseBodyInstances extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Role")
        public String role;

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
        @NameInMap("Key")
        public String key;

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
        @NameInMap("Name")
        public String name;

        @NameInMap("Timestamp")
        public String timestamp;

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
        @NameInMap("Timestamp")
        public String timestamp;

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
        @NameInMap("Timestamp")
        public String timestamp;

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
        @NameInMap("DatasetId")
        public String datasetId;

        @NameInMap("Name")
        public String name;

        @NameInMap("OutputUri")
        public String outputUri;

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

    }

    public static class GetTrainingJobResponseBodyOutputModel extends TeaModel {
        @NameInMap("OutputChannelName")
        public String outputChannelName;

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
        @NameInMap("MaxRunningTimeInSeconds")
        public Long maxRunningTimeInSeconds;

        public static GetTrainingJobResponseBodyScheduler build(java.util.Map<String, ?> map) throws Exception {
            GetTrainingJobResponseBodyScheduler self = new GetTrainingJobResponseBodyScheduler();
            return TeaModel.build(map, self);
        }

        public GetTrainingJobResponseBodyScheduler setMaxRunningTimeInSeconds(Long maxRunningTimeInSeconds) {
            this.maxRunningTimeInSeconds = maxRunningTimeInSeconds;
            return this;
        }
        public Long getMaxRunningTimeInSeconds() {
            return this.maxRunningTimeInSeconds;
        }

    }

    public static class GetTrainingJobResponseBodySettings extends TeaModel {
        @NameInMap("AIMasterType")
        public String AIMasterType;

        @NameInMap("EnableErrorMonitoringInAIMaster")
        public Boolean enableErrorMonitoringInAIMaster;

        @NameInMap("ErrorMonitoringArgs")
        public String errorMonitoringArgs;

        @NameInMap("Priority")
        public Integer priority;

        public static GetTrainingJobResponseBodySettings build(java.util.Map<String, ?> map) throws Exception {
            GetTrainingJobResponseBodySettings self = new GetTrainingJobResponseBodySettings();
            return TeaModel.build(map, self);
        }

        public GetTrainingJobResponseBodySettings setAIMasterType(String AIMasterType) {
            this.AIMasterType = AIMasterType;
            return this;
        }
        public String getAIMasterType() {
            return this.AIMasterType;
        }

        public GetTrainingJobResponseBodySettings setEnableErrorMonitoringInAIMaster(Boolean enableErrorMonitoringInAIMaster) {
            this.enableErrorMonitoringInAIMaster = enableErrorMonitoringInAIMaster;
            return this;
        }
        public Boolean getEnableErrorMonitoringInAIMaster() {
            return this.enableErrorMonitoringInAIMaster;
        }

        public GetTrainingJobResponseBodySettings setErrorMonitoringArgs(String errorMonitoringArgs) {
            this.errorMonitoringArgs = errorMonitoringArgs;
            return this;
        }
        public String getErrorMonitoringArgs() {
            return this.errorMonitoringArgs;
        }

        public GetTrainingJobResponseBodySettings setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

    }

    public static class GetTrainingJobResponseBodyStatusTransitions extends TeaModel {
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("ReasonCode")
        public String reasonCode;

        @NameInMap("ReasonMessage")
        public String reasonMessage;

        @NameInMap("StartTime")
        public String startTime;

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

        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        @NameInMap("SwitchId")
        public String switchId;

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
