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

    @NameInMap("AlgorithmVersion")
    public String algorithmVersion;

    @NameInMap("ComputeResource")
    public GetTrainingJobResponseBodyComputeResource computeResource;

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

    @NameInMap("Labels")
    public java.util.List<GetTrainingJobResponseBodyLabels> labels;

    @NameInMap("LatestMetrics")
    public java.util.List<GetTrainingJobResponseBodyLatestMetrics> latestMetrics;

    @NameInMap("OutputChannels")
    public java.util.List<GetTrainingJobResponseBodyOutputChannels> outputChannels;

    @NameInMap("ReasonCode")
    public String reasonCode;

    @NameInMap("ReasonMessage")
    public String reasonMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Scheduler")
    public GetTrainingJobResponseBodyScheduler scheduler;

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

    public GetTrainingJobResponseBody setOutputChannels(java.util.List<GetTrainingJobResponseBodyOutputChannels> outputChannels) {
        this.outputChannels = outputChannels;
        return this;
    }
    public java.util.List<GetTrainingJobResponseBodyOutputChannels> getOutputChannels() {
        return this.outputChannels;
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

    public GetTrainingJobResponseBody setScheduler(GetTrainingJobResponseBodyScheduler scheduler) {
        this.scheduler = scheduler;
        return this;
    }
    public GetTrainingJobResponseBodyScheduler getScheduler() {
        return this.scheduler;
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

    public GetTrainingJobResponseBody setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class GetTrainingJobResponseBodyComputeResource extends TeaModel {
        @NameInMap("EcsCount")
        public Long ecsCount;

        @NameInMap("EcsSpec")
        public String ecsSpec;

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

}
