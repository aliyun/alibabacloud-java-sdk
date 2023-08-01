// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class ListTrainingJobsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("TrainingJobs")
    public java.util.List<ListTrainingJobsResponseBodyTrainingJobs> trainingJobs;

    public static ListTrainingJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTrainingJobsResponseBody self = new ListTrainingJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTrainingJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTrainingJobsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListTrainingJobsResponseBody setTrainingJobs(java.util.List<ListTrainingJobsResponseBodyTrainingJobs> trainingJobs) {
        this.trainingJobs = trainingJobs;
        return this;
    }
    public java.util.List<ListTrainingJobsResponseBodyTrainingJobs> getTrainingJobs() {
        return this.trainingJobs;
    }

    public static class ListTrainingJobsResponseBodyTrainingJobsComputeResource extends TeaModel {
        @NameInMap("EcsCount")
        public Long ecsCount;

        @NameInMap("EcsSpec")
        public String ecsSpec;

        public static ListTrainingJobsResponseBodyTrainingJobsComputeResource build(java.util.Map<String, ?> map) throws Exception {
            ListTrainingJobsResponseBodyTrainingJobsComputeResource self = new ListTrainingJobsResponseBodyTrainingJobsComputeResource();
            return TeaModel.build(map, self);
        }

        public ListTrainingJobsResponseBodyTrainingJobsComputeResource setEcsCount(Long ecsCount) {
            this.ecsCount = ecsCount;
            return this;
        }
        public Long getEcsCount() {
            return this.ecsCount;
        }

        public ListTrainingJobsResponseBodyTrainingJobsComputeResource setEcsSpec(String ecsSpec) {
            this.ecsSpec = ecsSpec;
            return this;
        }
        public String getEcsSpec() {
            return this.ecsSpec;
        }

    }

    public static class ListTrainingJobsResponseBodyTrainingJobsHyperParameters extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Value")
        public String value;

        public static ListTrainingJobsResponseBodyTrainingJobsHyperParameters build(java.util.Map<String, ?> map) throws Exception {
            ListTrainingJobsResponseBodyTrainingJobsHyperParameters self = new ListTrainingJobsResponseBodyTrainingJobsHyperParameters();
            return TeaModel.build(map, self);
        }

        public ListTrainingJobsResponseBodyTrainingJobsHyperParameters setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListTrainingJobsResponseBodyTrainingJobsHyperParameters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListTrainingJobsResponseBodyTrainingJobsInputChannels extends TeaModel {
        @NameInMap("DatasetId")
        public String datasetId;

        @NameInMap("InputUri")
        public String inputUri;

        @NameInMap("Name")
        public String name;

        public static ListTrainingJobsResponseBodyTrainingJobsInputChannels build(java.util.Map<String, ?> map) throws Exception {
            ListTrainingJobsResponseBodyTrainingJobsInputChannels self = new ListTrainingJobsResponseBodyTrainingJobsInputChannels();
            return TeaModel.build(map, self);
        }

        public ListTrainingJobsResponseBodyTrainingJobsInputChannels setDatasetId(String datasetId) {
            this.datasetId = datasetId;
            return this;
        }
        public String getDatasetId() {
            return this.datasetId;
        }

        public ListTrainingJobsResponseBodyTrainingJobsInputChannels setInputUri(String inputUri) {
            this.inputUri = inputUri;
            return this;
        }
        public String getInputUri() {
            return this.inputUri;
        }

        public ListTrainingJobsResponseBodyTrainingJobsInputChannels setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListTrainingJobsResponseBodyTrainingJobsLabels extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListTrainingJobsResponseBodyTrainingJobsLabels build(java.util.Map<String, ?> map) throws Exception {
            ListTrainingJobsResponseBodyTrainingJobsLabels self = new ListTrainingJobsResponseBodyTrainingJobsLabels();
            return TeaModel.build(map, self);
        }

        public ListTrainingJobsResponseBodyTrainingJobsLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListTrainingJobsResponseBodyTrainingJobsLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListTrainingJobsResponseBodyTrainingJobsOutputChannels extends TeaModel {
        @NameInMap("DatasetId")
        public String datasetId;

        @NameInMap("Name")
        public String name;

        @NameInMap("OutputUri")
        public String outputUri;

        public static ListTrainingJobsResponseBodyTrainingJobsOutputChannels build(java.util.Map<String, ?> map) throws Exception {
            ListTrainingJobsResponseBodyTrainingJobsOutputChannels self = new ListTrainingJobsResponseBodyTrainingJobsOutputChannels();
            return TeaModel.build(map, self);
        }

        public ListTrainingJobsResponseBodyTrainingJobsOutputChannels setDatasetId(String datasetId) {
            this.datasetId = datasetId;
            return this;
        }
        public String getDatasetId() {
            return this.datasetId;
        }

        public ListTrainingJobsResponseBodyTrainingJobsOutputChannels setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListTrainingJobsResponseBodyTrainingJobsOutputChannels setOutputUri(String outputUri) {
            this.outputUri = outputUri;
            return this;
        }
        public String getOutputUri() {
            return this.outputUri;
        }

    }

    public static class ListTrainingJobsResponseBodyTrainingJobsScheduler extends TeaModel {
        @NameInMap("MaxRunningTimeInSeconds")
        public Long maxRunningTimeInSeconds;

        public static ListTrainingJobsResponseBodyTrainingJobsScheduler build(java.util.Map<String, ?> map) throws Exception {
            ListTrainingJobsResponseBodyTrainingJobsScheduler self = new ListTrainingJobsResponseBodyTrainingJobsScheduler();
            return TeaModel.build(map, self);
        }

        public ListTrainingJobsResponseBodyTrainingJobsScheduler setMaxRunningTimeInSeconds(Long maxRunningTimeInSeconds) {
            this.maxRunningTimeInSeconds = maxRunningTimeInSeconds;
            return this;
        }
        public Long getMaxRunningTimeInSeconds() {
            return this.maxRunningTimeInSeconds;
        }

    }

    public static class ListTrainingJobsResponseBodyTrainingJobsStatusTransitions extends TeaModel {
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

        public static ListTrainingJobsResponseBodyTrainingJobsStatusTransitions build(java.util.Map<String, ?> map) throws Exception {
            ListTrainingJobsResponseBodyTrainingJobsStatusTransitions self = new ListTrainingJobsResponseBodyTrainingJobsStatusTransitions();
            return TeaModel.build(map, self);
        }

        public ListTrainingJobsResponseBodyTrainingJobsStatusTransitions setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListTrainingJobsResponseBodyTrainingJobsStatusTransitions setReasonCode(String reasonCode) {
            this.reasonCode = reasonCode;
            return this;
        }
        public String getReasonCode() {
            return this.reasonCode;
        }

        public ListTrainingJobsResponseBodyTrainingJobsStatusTransitions setReasonMessage(String reasonMessage) {
            this.reasonMessage = reasonMessage;
            return this;
        }
        public String getReasonMessage() {
            return this.reasonMessage;
        }

        public ListTrainingJobsResponseBodyTrainingJobsStatusTransitions setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListTrainingJobsResponseBodyTrainingJobsStatusTransitions setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListTrainingJobsResponseBodyTrainingJobs extends TeaModel {
        @NameInMap("AlgorithmName")
        public String algorithmName;

        @NameInMap("AlgorithmProvider")
        public String algorithmProvider;

        @NameInMap("AlgorithmVersion")
        public String algorithmVersion;

        @NameInMap("ComputeResource")
        public ListTrainingJobsResponseBodyTrainingJobsComputeResource computeResource;

        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        @NameInMap("GmtModifiedTime")
        public String gmtModifiedTime;

        @NameInMap("HyperParameters")
        public java.util.List<ListTrainingJobsResponseBodyTrainingJobsHyperParameters> hyperParameters;

        @NameInMap("InputChannels")
        public java.util.List<ListTrainingJobsResponseBodyTrainingJobsInputChannels> inputChannels;

        @NameInMap("IsTempAlgo")
        public Boolean isTempAlgo;

        @NameInMap("Labels")
        public java.util.List<ListTrainingJobsResponseBodyTrainingJobsLabels> labels;

        @NameInMap("OutputChannels")
        public java.util.List<ListTrainingJobsResponseBodyTrainingJobsOutputChannels> outputChannels;

        @NameInMap("ReasonCode")
        public String reasonCode;

        @NameInMap("ReasonMessage")
        public String reasonMessage;

        @NameInMap("RoleArn")
        public String roleArn;

        @NameInMap("Scheduler")
        public ListTrainingJobsResponseBodyTrainingJobsScheduler scheduler;

        @NameInMap("Status")
        public String status;

        @NameInMap("StatusTransitions")
        public java.util.List<ListTrainingJobsResponseBodyTrainingJobsStatusTransitions> statusTransitions;

        @NameInMap("TrainingJobDescription")
        public String trainingJobDescription;

        @NameInMap("TrainingJobId")
        public String trainingJobId;

        @NameInMap("TrainingJobName")
        public String trainingJobName;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        public static ListTrainingJobsResponseBodyTrainingJobs build(java.util.Map<String, ?> map) throws Exception {
            ListTrainingJobsResponseBodyTrainingJobs self = new ListTrainingJobsResponseBodyTrainingJobs();
            return TeaModel.build(map, self);
        }

        public ListTrainingJobsResponseBodyTrainingJobs setAlgorithmName(String algorithmName) {
            this.algorithmName = algorithmName;
            return this;
        }
        public String getAlgorithmName() {
            return this.algorithmName;
        }

        public ListTrainingJobsResponseBodyTrainingJobs setAlgorithmProvider(String algorithmProvider) {
            this.algorithmProvider = algorithmProvider;
            return this;
        }
        public String getAlgorithmProvider() {
            return this.algorithmProvider;
        }

        public ListTrainingJobsResponseBodyTrainingJobs setAlgorithmVersion(String algorithmVersion) {
            this.algorithmVersion = algorithmVersion;
            return this;
        }
        public String getAlgorithmVersion() {
            return this.algorithmVersion;
        }

        public ListTrainingJobsResponseBodyTrainingJobs setComputeResource(ListTrainingJobsResponseBodyTrainingJobsComputeResource computeResource) {
            this.computeResource = computeResource;
            return this;
        }
        public ListTrainingJobsResponseBodyTrainingJobsComputeResource getComputeResource() {
            return this.computeResource;
        }

        public ListTrainingJobsResponseBodyTrainingJobs setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public ListTrainingJobsResponseBodyTrainingJobs setGmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public ListTrainingJobsResponseBodyTrainingJobs setHyperParameters(java.util.List<ListTrainingJobsResponseBodyTrainingJobsHyperParameters> hyperParameters) {
            this.hyperParameters = hyperParameters;
            return this;
        }
        public java.util.List<ListTrainingJobsResponseBodyTrainingJobsHyperParameters> getHyperParameters() {
            return this.hyperParameters;
        }

        public ListTrainingJobsResponseBodyTrainingJobs setInputChannels(java.util.List<ListTrainingJobsResponseBodyTrainingJobsInputChannels> inputChannels) {
            this.inputChannels = inputChannels;
            return this;
        }
        public java.util.List<ListTrainingJobsResponseBodyTrainingJobsInputChannels> getInputChannels() {
            return this.inputChannels;
        }

        public ListTrainingJobsResponseBodyTrainingJobs setIsTempAlgo(Boolean isTempAlgo) {
            this.isTempAlgo = isTempAlgo;
            return this;
        }
        public Boolean getIsTempAlgo() {
            return this.isTempAlgo;
        }

        public ListTrainingJobsResponseBodyTrainingJobs setLabels(java.util.List<ListTrainingJobsResponseBodyTrainingJobsLabels> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<ListTrainingJobsResponseBodyTrainingJobsLabels> getLabels() {
            return this.labels;
        }

        public ListTrainingJobsResponseBodyTrainingJobs setOutputChannels(java.util.List<ListTrainingJobsResponseBodyTrainingJobsOutputChannels> outputChannels) {
            this.outputChannels = outputChannels;
            return this;
        }
        public java.util.List<ListTrainingJobsResponseBodyTrainingJobsOutputChannels> getOutputChannels() {
            return this.outputChannels;
        }

        public ListTrainingJobsResponseBodyTrainingJobs setReasonCode(String reasonCode) {
            this.reasonCode = reasonCode;
            return this;
        }
        public String getReasonCode() {
            return this.reasonCode;
        }

        public ListTrainingJobsResponseBodyTrainingJobs setReasonMessage(String reasonMessage) {
            this.reasonMessage = reasonMessage;
            return this;
        }
        public String getReasonMessage() {
            return this.reasonMessage;
        }

        public ListTrainingJobsResponseBodyTrainingJobs setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

        public ListTrainingJobsResponseBodyTrainingJobs setScheduler(ListTrainingJobsResponseBodyTrainingJobsScheduler scheduler) {
            this.scheduler = scheduler;
            return this;
        }
        public ListTrainingJobsResponseBodyTrainingJobsScheduler getScheduler() {
            return this.scheduler;
        }

        public ListTrainingJobsResponseBodyTrainingJobs setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListTrainingJobsResponseBodyTrainingJobs setStatusTransitions(java.util.List<ListTrainingJobsResponseBodyTrainingJobsStatusTransitions> statusTransitions) {
            this.statusTransitions = statusTransitions;
            return this;
        }
        public java.util.List<ListTrainingJobsResponseBodyTrainingJobsStatusTransitions> getStatusTransitions() {
            return this.statusTransitions;
        }

        public ListTrainingJobsResponseBodyTrainingJobs setTrainingJobDescription(String trainingJobDescription) {
            this.trainingJobDescription = trainingJobDescription;
            return this;
        }
        public String getTrainingJobDescription() {
            return this.trainingJobDescription;
        }

        public ListTrainingJobsResponseBodyTrainingJobs setTrainingJobId(String trainingJobId) {
            this.trainingJobId = trainingJobId;
            return this;
        }
        public String getTrainingJobId() {
            return this.trainingJobId;
        }

        public ListTrainingJobsResponseBodyTrainingJobs setTrainingJobName(String trainingJobName) {
            this.trainingJobName = trainingJobName;
            return this;
        }
        public String getTrainingJobName() {
            return this.trainingJobName;
        }

        public ListTrainingJobsResponseBodyTrainingJobs setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListTrainingJobsResponseBodyTrainingJobs setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
