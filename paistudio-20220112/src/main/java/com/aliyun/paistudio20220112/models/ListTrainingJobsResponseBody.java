// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class ListTrainingJobsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of training jobs.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    /**
     * <p>The list of training job details.</p>
     */
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

    public static class ListTrainingJobsResponseBodyTrainingJobsComputeResourceInstanceSpec extends TeaModel {
        /**
         * <p>The number of CPU cores of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("CPU")
        public String CPU;

        /**
         * <p>The number of GPUs of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("GPU")
        public String GPU;

        /**
         * <p>The GPU type of the instance.</p>
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
         * <p>The shared memory size of the instance. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("SharedMemory")
        public String sharedMemory;

        public static ListTrainingJobsResponseBodyTrainingJobsComputeResourceInstanceSpec build(java.util.Map<String, ?> map) throws Exception {
            ListTrainingJobsResponseBodyTrainingJobsComputeResourceInstanceSpec self = new ListTrainingJobsResponseBodyTrainingJobsComputeResourceInstanceSpec();
            return TeaModel.build(map, self);
        }

        public ListTrainingJobsResponseBodyTrainingJobsComputeResourceInstanceSpec setCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }
        public String getCPU() {
            return this.CPU;
        }

        public ListTrainingJobsResponseBodyTrainingJobsComputeResourceInstanceSpec setGPU(String GPU) {
            this.GPU = GPU;
            return this;
        }
        public String getGPU() {
            return this.GPU;
        }

        public ListTrainingJobsResponseBodyTrainingJobsComputeResourceInstanceSpec setGPUType(String GPUType) {
            this.GPUType = GPUType;
            return this;
        }
        public String getGPUType() {
            return this.GPUType;
        }

        public ListTrainingJobsResponseBodyTrainingJobsComputeResourceInstanceSpec setMemory(String memory) {
            this.memory = memory;
            return this;
        }
        public String getMemory() {
            return this.memory;
        }

        public ListTrainingJobsResponseBodyTrainingJobsComputeResourceInstanceSpec setSharedMemory(String sharedMemory) {
            this.sharedMemory = sharedMemory;
            return this;
        }
        public String getSharedMemory() {
            return this.sharedMemory;
        }

    }

    public static class ListTrainingJobsResponseBodyTrainingJobsComputeResource extends TeaModel {
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
         * <p>The number of resource quota instances.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("InstanceCount")
        public Long instanceCount;

        /**
         * <p>The resource quota instance specification.</p>
         */
        @NameInMap("InstanceSpec")
        public ListTrainingJobsResponseBodyTrainingJobsComputeResourceInstanceSpec instanceSpec;

        /**
         * <p>The resource quota ID.</p>
         * 
         * <strong>example:</strong>
         * <p>quotam670lixikcl</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The resource quota name.</p>
         * 
         * <strong>example:</strong>
         * <p>quota</p>
         */
        @NameInMap("ResourceName")
        public String resourceName;

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

        public ListTrainingJobsResponseBodyTrainingJobsComputeResource setInstanceCount(Long instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }
        public Long getInstanceCount() {
            return this.instanceCount;
        }

        public ListTrainingJobsResponseBodyTrainingJobsComputeResource setInstanceSpec(ListTrainingJobsResponseBodyTrainingJobsComputeResourceInstanceSpec instanceSpec) {
            this.instanceSpec = instanceSpec;
            return this;
        }
        public ListTrainingJobsResponseBodyTrainingJobsComputeResourceInstanceSpec getInstanceSpec() {
            return this.instanceSpec;
        }

        public ListTrainingJobsResponseBodyTrainingJobsComputeResource setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ListTrainingJobsResponseBodyTrainingJobsComputeResource setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

    }

    public static class ListTrainingJobsResponseBodyTrainingJobsExperimentConfig extends TeaModel {
        /**
         * <p>The ID of the experiment associated with the training job.</p>
         * 
         * <strong>example:</strong>
         * <p>exp-ds9aefia90v</p>
         */
        @NameInMap("ExperimentId")
        public String experimentId;

        /**
         * <p>The name of the experiment associated with the training job.</p>
         * 
         * <strong>example:</strong>
         * <p>large_language_model</p>
         */
        @NameInMap("ExperimentName")
        public String experimentName;

        public static ListTrainingJobsResponseBodyTrainingJobsExperimentConfig build(java.util.Map<String, ?> map) throws Exception {
            ListTrainingJobsResponseBodyTrainingJobsExperimentConfig self = new ListTrainingJobsResponseBodyTrainingJobsExperimentConfig();
            return TeaModel.build(map, self);
        }

        public ListTrainingJobsResponseBodyTrainingJobsExperimentConfig setExperimentId(String experimentId) {
            this.experimentId = experimentId;
            return this;
        }
        public String getExperimentId() {
            return this.experimentId;
        }

        public ListTrainingJobsResponseBodyTrainingJobsExperimentConfig setExperimentName(String experimentName) {
            this.experimentName = experimentName;
            return this;
        }
        public String getExperimentName() {
            return this.experimentName;
        }

    }

    public static class ListTrainingJobsResponseBodyTrainingJobsHyperParameters extends TeaModel {
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
         * <p>0.001</p>
         */
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
         * <p>oss://test-bucket.oss-cn-hangzhou-internal.aliyuncs.com/path/to/input/channel/</p>
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

        @NameInMap("RoleArn")
        public String roleArn;

        @NameInMap("VersionName")
        public String versionName;

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

        public ListTrainingJobsResponseBodyTrainingJobsInputChannels setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

        public ListTrainingJobsResponseBodyTrainingJobsInputChannels setVersionName(String versionName) {
            this.versionName = versionName;
            return this;
        }
        public String getVersionName() {
            return this.versionName;
        }

    }

    public static class ListTrainingJobsResponseBodyTrainingJobsLabels extends TeaModel {
        /**
         * <p>The label key.</p>
         * 
         * <strong>example:</strong>
         * <p>CreatedBy</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The label value.</p>
         * 
         * <strong>example:</strong>
         * <p>QuickStart</p>
         */
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
        /**
         * <p>The dataset ID.</p>
         * 
         * <strong>example:</strong>
         * <p>d-8o0hh35po15ejcdq2p</p>
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
         * <p>oss://test-bucket.oss-cn-hangzhou-internal.aliyuncs.com/path/to/output/channel/</p>
         */
        @NameInMap("OutputUri")
        public String outputUri;

        @NameInMap("RoleArn")
        public String roleArn;

        @NameInMap("VersionName")
        public String versionName;

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

        public ListTrainingJobsResponseBodyTrainingJobsOutputChannels setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

        public ListTrainingJobsResponseBodyTrainingJobsOutputChannels setVersionName(String versionName) {
            this.versionName = versionName;
            return this;
        }
        public String getVersionName() {
            return this.versionName;
        }

    }

    public static class ListTrainingJobsResponseBodyTrainingJobsScheduler extends TeaModel {
        /**
         * <p>The maximum training runtime in seconds. A value of 0 indicates no limit on the maximum runtime.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
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
        /**
         * <p>The end time of the status.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-07-10T11:49:47Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>TrainingJobSucceed</p>
         */
        @NameInMap("ReasonCode")
        public String reasonCode;

        /**
         * <p>The status update message.</p>
         * 
         * <strong>example:</strong>
         * <p>KubeDL job runs successfully</p>
         */
        @NameInMap("ReasonMessage")
        public String reasonMessage;

        /**
         * <p>The start time of the status.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-07-10T11:49:47Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The status of the training job.</p>
         * 
         * <strong>example:</strong>
         * <p>Creating</p>
         */
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

    public static class ListTrainingJobsResponseBodyTrainingJobsUserVpc extends TeaModel {
        /**
         * <p>The default route.</p>
         * 
         * <strong>example:</strong>
         * <p>eth1</p>
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
         * <p>sg-abcdef****</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The vSwitch ID.</p>
         * 
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

        public static ListTrainingJobsResponseBodyTrainingJobsUserVpc build(java.util.Map<String, ?> map) throws Exception {
            ListTrainingJobsResponseBodyTrainingJobsUserVpc self = new ListTrainingJobsResponseBodyTrainingJobsUserVpc();
            return TeaModel.build(map, self);
        }

        public ListTrainingJobsResponseBodyTrainingJobsUserVpc setDefaultRoute(String defaultRoute) {
            this.defaultRoute = defaultRoute;
            return this;
        }
        public String getDefaultRoute() {
            return this.defaultRoute;
        }

        public ListTrainingJobsResponseBodyTrainingJobsUserVpc setExtendedCIDRs(java.util.List<String> extendedCIDRs) {
            this.extendedCIDRs = extendedCIDRs;
            return this;
        }
        public java.util.List<String> getExtendedCIDRs() {
            return this.extendedCIDRs;
        }

        public ListTrainingJobsResponseBodyTrainingJobsUserVpc setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public ListTrainingJobsResponseBodyTrainingJobsUserVpc setSwitchId(String switchId) {
            this.switchId = switchId;
            return this;
        }
        public String getSwitchId() {
            return this.switchId;
        }

        public ListTrainingJobsResponseBodyTrainingJobsUserVpc setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class ListTrainingJobsResponseBodyTrainingJobs extends TeaModel {
        /**
         * <p>The algorithm name.</p>
         * 
         * <strong>example:</strong>
         * <p>llm_train</p>
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
         * <p>The algorithm version.</p>
         * 
         * <strong>example:</strong>
         * <p>v0.0.1</p>
         */
        @NameInMap("AlgorithmVersion")
        public String algorithmVersion;

        @NameInMap("AssignNodeSpec")
        public AssignNodeSpec assignNodeSpec;

        /**
         * <p>The compute resource configuration.</p>
         */
        @NameInMap("ComputeResource")
        public ListTrainingJobsResponseBodyTrainingJobsComputeResource computeResource;

        @NameInMap("CredentialConfig")
        public CredentialConfig credentialConfig;

        @NameInMap("DlcJobId")
        public String dlcJobId;

        /**
         * <p>The list of environment variables.</p>
         */
        @NameInMap("Environments")
        public java.util.Map<String, String> environments;

        /**
         * <p>The experiment configuration associated with the training job.</p>
         */
        @NameInMap("ExperimentConfig")
        public ListTrainingJobsResponseBodyTrainingJobsExperimentConfig experimentConfig;

        /**
         * <p>The time when the training job was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-07-10T11:49:47Z</p>
         */
        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        /**
         * <p>The time when the training job status was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-07-10T11:49:47Z</p>
         */
        @NameInMap("GmtModifiedTime")
        public String gmtModifiedTime;

        /**
         * <p>The hyperparameter settings for training.</p>
         */
        @NameInMap("HyperParameters")
        public java.util.List<ListTrainingJobsResponseBodyTrainingJobsHyperParameters> hyperParameters;

        /**
         * <p>The input data configuration for training.</p>
         */
        @NameInMap("InputChannels")
        public java.util.List<ListTrainingJobsResponseBodyTrainingJobsInputChannels> inputChannels;

        /**
         * <p>Indicates whether a temporary algorithm is used.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsTempAlgo")
        public Boolean isTempAlgo;

        /**
         * <p>The labels of the training job.</p>
         */
        @NameInMap("Labels")
        public java.util.List<ListTrainingJobsResponseBodyTrainingJobsLabels> labels;

        /**
         * <p>The output data configuration for training.</p>
         */
        @NameInMap("OutputChannels")
        public java.util.List<ListTrainingJobsResponseBodyTrainingJobsOutputChannels> outputChannels;

        /**
         * <p>The Python package configuration for the training job.</p>
         */
        @NameInMap("PythonRequirements")
        public java.util.List<String> pythonRequirements;

        /**
         * <p>The status code of the training job.</p>
         * 
         * <strong>example:</strong>
         * <p>TrainingJobSucceed</p>
         */
        @NameInMap("ReasonCode")
        public String reasonCode;

        /**
         * <p>The error message of the training job.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("ReasonMessage")
        public String reasonMessage;

        /**
         * <p>The role ARN used for delegated authorization.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::{accountID}:role/{roleName}</p>
         */
        @NameInMap("RoleArn")
        public String roleArn;

        /**
         * <p>The scheduling configuration of the training job.</p>
         */
        @NameInMap("Scheduler")
        public ListTrainingJobsResponseBodyTrainingJobsScheduler scheduler;

        /**
         * <p>The job status.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The list of training job status transitions.</p>
         */
        @NameInMap("StatusTransitions")
        public java.util.List<ListTrainingJobsResponseBodyTrainingJobsStatusTransitions> statusTransitions;

        /**
         * <p>The description of the training job.</p>
         * 
         * <strong>example:</strong>
         * <p>Qwen2 large language model training.</p>
         */
        @NameInMap("TrainingJobDescription")
        public String trainingJobDescription;

        /**
         * <p>The training job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>train1layo6js8ra</p>
         */
        @NameInMap("TrainingJobId")
        public String trainingJobId;

        /**
         * <p>The name of the training job.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen2-7b</p>
         */
        @NameInMap("TrainingJobName")
        public String trainingJobName;

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123456789</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>The user VPC configuration.</p>
         */
        @NameInMap("UserVpc")
        public ListTrainingJobsResponseBodyTrainingJobsUserVpc userVpc;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
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

        public ListTrainingJobsResponseBodyTrainingJobs setAssignNodeSpec(AssignNodeSpec assignNodeSpec) {
            this.assignNodeSpec = assignNodeSpec;
            return this;
        }
        public AssignNodeSpec getAssignNodeSpec() {
            return this.assignNodeSpec;
        }

        public ListTrainingJobsResponseBodyTrainingJobs setComputeResource(ListTrainingJobsResponseBodyTrainingJobsComputeResource computeResource) {
            this.computeResource = computeResource;
            return this;
        }
        public ListTrainingJobsResponseBodyTrainingJobsComputeResource getComputeResource() {
            return this.computeResource;
        }

        public ListTrainingJobsResponseBodyTrainingJobs setCredentialConfig(CredentialConfig credentialConfig) {
            this.credentialConfig = credentialConfig;
            return this;
        }
        public CredentialConfig getCredentialConfig() {
            return this.credentialConfig;
        }

        public ListTrainingJobsResponseBodyTrainingJobs setDlcJobId(String dlcJobId) {
            this.dlcJobId = dlcJobId;
            return this;
        }
        public String getDlcJobId() {
            return this.dlcJobId;
        }

        public ListTrainingJobsResponseBodyTrainingJobs setEnvironments(java.util.Map<String, String> environments) {
            this.environments = environments;
            return this;
        }
        public java.util.Map<String, String> getEnvironments() {
            return this.environments;
        }

        public ListTrainingJobsResponseBodyTrainingJobs setExperimentConfig(ListTrainingJobsResponseBodyTrainingJobsExperimentConfig experimentConfig) {
            this.experimentConfig = experimentConfig;
            return this;
        }
        public ListTrainingJobsResponseBodyTrainingJobsExperimentConfig getExperimentConfig() {
            return this.experimentConfig;
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

        public ListTrainingJobsResponseBodyTrainingJobs setPythonRequirements(java.util.List<String> pythonRequirements) {
            this.pythonRequirements = pythonRequirements;
            return this;
        }
        public java.util.List<String> getPythonRequirements() {
            return this.pythonRequirements;
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

        public ListTrainingJobsResponseBodyTrainingJobs setUserVpc(ListTrainingJobsResponseBodyTrainingJobsUserVpc userVpc) {
            this.userVpc = userVpc;
            return this;
        }
        public ListTrainingJobsResponseBodyTrainingJobsUserVpc getUserVpc() {
            return this.userVpc;
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
