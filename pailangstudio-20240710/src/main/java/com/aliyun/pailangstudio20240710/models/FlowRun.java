// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pailangstudio20240710.models;

import com.aliyun.tea.*;

public class FlowRun extends TeaModel {
    @NameInMap("Accessibility")
    public String accessibility;

    @NameInMap("ChildRuns")
    public java.util.List<FlowRunChildRuns> childRuns;

    @NameInMap("Creator")
    public String creator;

    @NameInMap("CredentialConfig")
    public FlowRunCredentialConfig credentialConfig;

    @NameInMap("DataColumnMapping")
    public java.util.Map<String, String> dataColumnMapping;

    @NameInMap("DataSources")
    public java.util.List<FlowRunDataSources> dataSources;

    @NameInMap("Duration")
    public Integer duration;

    @NameInMap("EcsSpec")
    public FlowRunEcsSpec ecsSpec;

    @NameInMap("Envs")
    public java.util.List<FlowRunEnvs> envs;

    @NameInMap("EvaluationConfigs")
    public java.util.List<FlowRunEvaluationConfigs> evaluationConfigs;

    @NameInMap("EvaluationWorkerCount")
    public Integer evaluationWorkerCount;

    @NameInMap("Exception")
    public String exception;

    @NameInMap("FlowId")
    public String flowId;

    @NameInMap("FlowName")
    public String flowName;

    @NameInMap("FlowRunId")
    public String flowRunId;

    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    @NameInMap("GmtFinishTime")
    public String gmtFinishTime;

    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    @NameInMap("GmtStartTime")
    public String gmtStartTime;

    @NameInMap("Labels")
    public java.util.List<FlowRunLabels> labels;

    @NameInMap("NodeName")
    public String nodeName;

    @NameInMap("NodeRunInfos")
    public java.util.List<FlowRunNodeRunInfos> nodeRunInfos;

    @NameInMap("ResourceId")
    public String resourceId;

    @NameInMap("RunMode")
    public String runMode;

    @NameInMap("RunName")
    public String runName;

    @NameInMap("RunResult")
    public String runResult;

    @NameInMap("RunStatus")
    public String runStatus;

    @NameInMap("RunTimeout")
    public Integer runTimeout;

    @NameInMap("UserVpc")
    public FlowRunUserVpc userVpc;

    @NameInMap("Variant")
    public String variant;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static FlowRun build(java.util.Map<String, ?> map) throws Exception {
        FlowRun self = new FlowRun();
        return TeaModel.build(map, self);
    }

    public FlowRun setAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }
    public String getAccessibility() {
        return this.accessibility;
    }

    public FlowRun setChildRuns(java.util.List<FlowRunChildRuns> childRuns) {
        this.childRuns = childRuns;
        return this;
    }
    public java.util.List<FlowRunChildRuns> getChildRuns() {
        return this.childRuns;
    }

    public FlowRun setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public FlowRun setCredentialConfig(FlowRunCredentialConfig credentialConfig) {
        this.credentialConfig = credentialConfig;
        return this;
    }
    public FlowRunCredentialConfig getCredentialConfig() {
        return this.credentialConfig;
    }

    public FlowRun setDataColumnMapping(java.util.Map<String, String> dataColumnMapping) {
        this.dataColumnMapping = dataColumnMapping;
        return this;
    }
    public java.util.Map<String, String> getDataColumnMapping() {
        return this.dataColumnMapping;
    }

    public FlowRun setDataSources(java.util.List<FlowRunDataSources> dataSources) {
        this.dataSources = dataSources;
        return this;
    }
    public java.util.List<FlowRunDataSources> getDataSources() {
        return this.dataSources;
    }

    public FlowRun setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public FlowRun setEcsSpec(FlowRunEcsSpec ecsSpec) {
        this.ecsSpec = ecsSpec;
        return this;
    }
    public FlowRunEcsSpec getEcsSpec() {
        return this.ecsSpec;
    }

    public FlowRun setEnvs(java.util.List<FlowRunEnvs> envs) {
        this.envs = envs;
        return this;
    }
    public java.util.List<FlowRunEnvs> getEnvs() {
        return this.envs;
    }

    public FlowRun setEvaluationConfigs(java.util.List<FlowRunEvaluationConfigs> evaluationConfigs) {
        this.evaluationConfigs = evaluationConfigs;
        return this;
    }
    public java.util.List<FlowRunEvaluationConfigs> getEvaluationConfigs() {
        return this.evaluationConfigs;
    }

    public FlowRun setEvaluationWorkerCount(Integer evaluationWorkerCount) {
        this.evaluationWorkerCount = evaluationWorkerCount;
        return this;
    }
    public Integer getEvaluationWorkerCount() {
        return this.evaluationWorkerCount;
    }

    public FlowRun setException(String exception) {
        this.exception = exception;
        return this;
    }
    public String getException() {
        return this.exception;
    }

    public FlowRun setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public FlowRun setFlowName(String flowName) {
        this.flowName = flowName;
        return this;
    }
    public String getFlowName() {
        return this.flowName;
    }

    public FlowRun setFlowRunId(String flowRunId) {
        this.flowRunId = flowRunId;
        return this;
    }
    public String getFlowRunId() {
        return this.flowRunId;
    }

    public FlowRun setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public FlowRun setGmtFinishTime(String gmtFinishTime) {
        this.gmtFinishTime = gmtFinishTime;
        return this;
    }
    public String getGmtFinishTime() {
        return this.gmtFinishTime;
    }

    public FlowRun setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public FlowRun setGmtStartTime(String gmtStartTime) {
        this.gmtStartTime = gmtStartTime;
        return this;
    }
    public String getGmtStartTime() {
        return this.gmtStartTime;
    }

    public FlowRun setLabels(java.util.List<FlowRunLabels> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<FlowRunLabels> getLabels() {
        return this.labels;
    }

    public FlowRun setNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }
    public String getNodeName() {
        return this.nodeName;
    }

    public FlowRun setNodeRunInfos(java.util.List<FlowRunNodeRunInfos> nodeRunInfos) {
        this.nodeRunInfos = nodeRunInfos;
        return this;
    }
    public java.util.List<FlowRunNodeRunInfos> getNodeRunInfos() {
        return this.nodeRunInfos;
    }

    public FlowRun setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public FlowRun setRunMode(String runMode) {
        this.runMode = runMode;
        return this;
    }
    public String getRunMode() {
        return this.runMode;
    }

    public FlowRun setRunName(String runName) {
        this.runName = runName;
        return this;
    }
    public String getRunName() {
        return this.runName;
    }

    public FlowRun setRunResult(String runResult) {
        this.runResult = runResult;
        return this;
    }
    public String getRunResult() {
        return this.runResult;
    }

    public FlowRun setRunStatus(String runStatus) {
        this.runStatus = runStatus;
        return this;
    }
    public String getRunStatus() {
        return this.runStatus;
    }

    public FlowRun setRunTimeout(Integer runTimeout) {
        this.runTimeout = runTimeout;
        return this;
    }
    public Integer getRunTimeout() {
        return this.runTimeout;
    }

    public FlowRun setUserVpc(FlowRunUserVpc userVpc) {
        this.userVpc = userVpc;
        return this;
    }
    public FlowRunUserVpc getUserVpc() {
        return this.userVpc;
    }

    public FlowRun setVariant(String variant) {
        this.variant = variant;
        return this;
    }
    public String getVariant() {
        return this.variant;
    }

    public FlowRun setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class FlowRunChildRunsFlowSource extends TeaModel {
        /**
         * <p>ID</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>名称</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>类型</p>
         */
        @NameInMap("Type")
        public String type;

        public static FlowRunChildRunsFlowSource build(java.util.Map<String, ?> map) throws Exception {
            FlowRunChildRunsFlowSource self = new FlowRunChildRunsFlowSource();
            return TeaModel.build(map, self);
        }

        public FlowRunChildRunsFlowSource setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public FlowRunChildRunsFlowSource setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public FlowRunChildRunsFlowSource setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class FlowRunChildRunsJobInfo extends TeaModel {
        /**
         * <p>任务ID</p>
         */
        @NameInMap("JobId")
        public String jobId;

        public static FlowRunChildRunsJobInfo build(java.util.Map<String, ?> map) throws Exception {
            FlowRunChildRunsJobInfo self = new FlowRunChildRunsJobInfo();
            return TeaModel.build(map, self);
        }

        public FlowRunChildRunsJobInfo setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

    }

    public static class FlowRunChildRuns extends TeaModel {
        /**
         * <p>运行时长</p>
         */
        @NameInMap("Duration")
        public Integer duration;

        /**
         * <p>应用流运行ID</p>
         */
        @NameInMap("FlowRunId")
        public String flowRunId;

        /**
         * <p>应用流来源</p>
         */
        @NameInMap("FlowSource")
        public FlowRunChildRunsFlowSource flowSource;

        /**
         * <p>创建时间</p>
         */
        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        /**
         * <p>结束时间</p>
         */
        @NameInMap("GmtFinishTime")
        public String gmtFinishTime;

        /**
         * <p>修改时间</p>
         */
        @NameInMap("GmtModifiedTime")
        public String gmtModifiedTime;

        /**
         * <p>开始时间</p>
         */
        @NameInMap("GmtStartTime")
        public String gmtStartTime;

        /**
         * <p>任务信息</p>
         */
        @NameInMap("JobInfo")
        public FlowRunChildRunsJobInfo jobInfo;

        /**
         * <p>运行模式</p>
         */
        @NameInMap("RunMode")
        public String runMode;

        /**
         * <p>运行名称</p>
         */
        @NameInMap("RunName")
        public String runName;

        /**
         * <p>运行结果</p>
         */
        @NameInMap("RunResult")
        public String runResult;

        /**
         * <p>运行状态</p>
         */
        @NameInMap("RunStatus")
        public String runStatus;

        public static FlowRunChildRuns build(java.util.Map<String, ?> map) throws Exception {
            FlowRunChildRuns self = new FlowRunChildRuns();
            return TeaModel.build(map, self);
        }

        public FlowRunChildRuns setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public FlowRunChildRuns setFlowRunId(String flowRunId) {
            this.flowRunId = flowRunId;
            return this;
        }
        public String getFlowRunId() {
            return this.flowRunId;
        }

        public FlowRunChildRuns setFlowSource(FlowRunChildRunsFlowSource flowSource) {
            this.flowSource = flowSource;
            return this;
        }
        public FlowRunChildRunsFlowSource getFlowSource() {
            return this.flowSource;
        }

        public FlowRunChildRuns setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public FlowRunChildRuns setGmtFinishTime(String gmtFinishTime) {
            this.gmtFinishTime = gmtFinishTime;
            return this;
        }
        public String getGmtFinishTime() {
            return this.gmtFinishTime;
        }

        public FlowRunChildRuns setGmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public FlowRunChildRuns setGmtStartTime(String gmtStartTime) {
            this.gmtStartTime = gmtStartTime;
            return this;
        }
        public String getGmtStartTime() {
            return this.gmtStartTime;
        }

        public FlowRunChildRuns setJobInfo(FlowRunChildRunsJobInfo jobInfo) {
            this.jobInfo = jobInfo;
            return this;
        }
        public FlowRunChildRunsJobInfo getJobInfo() {
            return this.jobInfo;
        }

        public FlowRunChildRuns setRunMode(String runMode) {
            this.runMode = runMode;
            return this;
        }
        public String getRunMode() {
            return this.runMode;
        }

        public FlowRunChildRuns setRunName(String runName) {
            this.runName = runName;
            return this;
        }
        public String getRunName() {
            return this.runName;
        }

        public FlowRunChildRuns setRunResult(String runResult) {
            this.runResult = runResult;
            return this;
        }
        public String getRunResult() {
            return this.runResult;
        }

        public FlowRunChildRuns setRunStatus(String runStatus) {
            this.runStatus = runStatus;
            return this;
        }
        public String getRunStatus() {
            return this.runStatus;
        }

    }

    public static class FlowRunCredentialConfigCredentialConfigItemsRoles extends TeaModel {
        /**
         * <p>AssumeRoleFor</p>
         */
        @NameInMap("AssumeRoleFor")
        public String assumeRoleFor;

        /**
         * <p>角色名称</p>
         */
        @NameInMap("RoleArn")
        public String roleArn;

        /**
         * <p>角色类型</p>
         */
        @NameInMap("RoleType")
        public String roleType;

        public static FlowRunCredentialConfigCredentialConfigItemsRoles build(java.util.Map<String, ?> map) throws Exception {
            FlowRunCredentialConfigCredentialConfigItemsRoles self = new FlowRunCredentialConfigCredentialConfigItemsRoles();
            return TeaModel.build(map, self);
        }

        public FlowRunCredentialConfigCredentialConfigItemsRoles setAssumeRoleFor(String assumeRoleFor) {
            this.assumeRoleFor = assumeRoleFor;
            return this;
        }
        public String getAssumeRoleFor() {
            return this.assumeRoleFor;
        }

        public FlowRunCredentialConfigCredentialConfigItemsRoles setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

        public FlowRunCredentialConfigCredentialConfigItemsRoles setRoleType(String roleType) {
            this.roleType = roleType;
            return this;
        }
        public String getRoleType() {
            return this.roleType;
        }

    }

    public static class FlowRunCredentialConfigCredentialConfigItems extends TeaModel {
        /**
         * <p>Key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>角色列表</p>
         */
        @NameInMap("Roles")
        public java.util.List<FlowRunCredentialConfigCredentialConfigItemsRoles> roles;

        /**
         * <p>Type</p>
         */
        @NameInMap("Type")
        public String type;

        public static FlowRunCredentialConfigCredentialConfigItems build(java.util.Map<String, ?> map) throws Exception {
            FlowRunCredentialConfigCredentialConfigItems self = new FlowRunCredentialConfigCredentialConfigItems();
            return TeaModel.build(map, self);
        }

        public FlowRunCredentialConfigCredentialConfigItems setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public FlowRunCredentialConfigCredentialConfigItems setRoles(java.util.List<FlowRunCredentialConfigCredentialConfigItemsRoles> roles) {
            this.roles = roles;
            return this;
        }
        public java.util.List<FlowRunCredentialConfigCredentialConfigItemsRoles> getRoles() {
            return this.roles;
        }

        public FlowRunCredentialConfigCredentialConfigItems setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class FlowRunCredentialConfig extends TeaModel {
        /**
         * <p>AliyunEnvRoleKey</p>
         */
        @NameInMap("AliyunEnvRoleKey")
        public String aliyunEnvRoleKey;

        /**
         * <p>Credential配置项列表</p>
         */
        @NameInMap("CredentialConfigItems")
        public java.util.List<FlowRunCredentialConfigCredentialConfigItems> credentialConfigItems;

        /**
         * <p>是否启用Credential注入</p>
         */
        @NameInMap("EnableCredentialInject")
        public Boolean enableCredentialInject;

        public static FlowRunCredentialConfig build(java.util.Map<String, ?> map) throws Exception {
            FlowRunCredentialConfig self = new FlowRunCredentialConfig();
            return TeaModel.build(map, self);
        }

        public FlowRunCredentialConfig setAliyunEnvRoleKey(String aliyunEnvRoleKey) {
            this.aliyunEnvRoleKey = aliyunEnvRoleKey;
            return this;
        }
        public String getAliyunEnvRoleKey() {
            return this.aliyunEnvRoleKey;
        }

        public FlowRunCredentialConfig setCredentialConfigItems(java.util.List<FlowRunCredentialConfigCredentialConfigItems> credentialConfigItems) {
            this.credentialConfigItems = credentialConfigItems;
            return this;
        }
        public java.util.List<FlowRunCredentialConfigCredentialConfigItems> getCredentialConfigItems() {
            return this.credentialConfigItems;
        }

        public FlowRunCredentialConfig setEnableCredentialInject(Boolean enableCredentialInject) {
            this.enableCredentialInject = enableCredentialInject;
            return this;
        }
        public Boolean getEnableCredentialInject() {
            return this.enableCredentialInject;
        }

    }

    public static class FlowRunDataSources extends TeaModel {
        /**
         * <p>数据集ID</p>
         */
        @NameInMap("DatasetId")
        public String datasetId;

        /**
         * <p>挂载路径</p>
         */
        @NameInMap("MountPath")
        public String mountPath;

        /**
         * <p>统一资源识别码</p>
         */
        @NameInMap("Uri")
        public String uri;

        public static FlowRunDataSources build(java.util.Map<String, ?> map) throws Exception {
            FlowRunDataSources self = new FlowRunDataSources();
            return TeaModel.build(map, self);
        }

        public FlowRunDataSources setDatasetId(String datasetId) {
            this.datasetId = datasetId;
            return this;
        }
        public String getDatasetId() {
            return this.datasetId;
        }

        public FlowRunDataSources setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

        public FlowRunDataSources setUri(String uri) {
            this.uri = uri;
            return this;
        }
        public String getUri() {
            return this.uri;
        }

    }

    public static class FlowRunEcsSpec extends TeaModel {
        /**
         * <p>CPU信息</p>
         */
        @NameInMap("CPU")
        public Integer CPU;

        /**
         * <p>额外系统盘</p>
         */
        @NameInMap("ExtraEphemeralStorage")
        public Integer extraEphemeralStorage;

        /**
         * <p>GPU信息</p>
         */
        @NameInMap("GPU")
        public Integer GPU;

        /**
         * <p>GPU算力占比</p>
         */
        @NameInMap("GPUCorePercentage")
        public Integer GPUCorePercentage;

        /**
         * <p>GPU显存</p>
         */
        @NameInMap("GPUMemory")
        public Integer GPUMemory;

        /**
         * <p>GPU类型</p>
         */
        @NameInMap("GPUType")
        public String GPUType;

        /**
         * <p>实例类型</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>内存信息</p>
         */
        @NameInMap("Memory")
        public Integer memory;

        /**
         * <p>Pod数量</p>
         */
        @NameInMap("PodCount")
        public Integer podCount;

        /**
         * <p>资源配额ID</p>
         */
        @NameInMap("QuotaId")
        public String quotaId;

        /**
         * <p>资源配额类型</p>
         */
        @NameInMap("QuotaType")
        public String quotaType;

        /**
         * <p>共享内存</p>
         */
        @NameInMap("SharedMemory")
        public Integer sharedMemory;

        public static FlowRunEcsSpec build(java.util.Map<String, ?> map) throws Exception {
            FlowRunEcsSpec self = new FlowRunEcsSpec();
            return TeaModel.build(map, self);
        }

        public FlowRunEcsSpec setCPU(Integer CPU) {
            this.CPU = CPU;
            return this;
        }
        public Integer getCPU() {
            return this.CPU;
        }

        public FlowRunEcsSpec setExtraEphemeralStorage(Integer extraEphemeralStorage) {
            this.extraEphemeralStorage = extraEphemeralStorage;
            return this;
        }
        public Integer getExtraEphemeralStorage() {
            return this.extraEphemeralStorage;
        }

        public FlowRunEcsSpec setGPU(Integer GPU) {
            this.GPU = GPU;
            return this;
        }
        public Integer getGPU() {
            return this.GPU;
        }

        public FlowRunEcsSpec setGPUCorePercentage(Integer GPUCorePercentage) {
            this.GPUCorePercentage = GPUCorePercentage;
            return this;
        }
        public Integer getGPUCorePercentage() {
            return this.GPUCorePercentage;
        }

        public FlowRunEcsSpec setGPUMemory(Integer GPUMemory) {
            this.GPUMemory = GPUMemory;
            return this;
        }
        public Integer getGPUMemory() {
            return this.GPUMemory;
        }

        public FlowRunEcsSpec setGPUType(String GPUType) {
            this.GPUType = GPUType;
            return this;
        }
        public String getGPUType() {
            return this.GPUType;
        }

        public FlowRunEcsSpec setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public FlowRunEcsSpec setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
        }

        public FlowRunEcsSpec setPodCount(Integer podCount) {
            this.podCount = podCount;
            return this;
        }
        public Integer getPodCount() {
            return this.podCount;
        }

        public FlowRunEcsSpec setQuotaId(String quotaId) {
            this.quotaId = quotaId;
            return this;
        }
        public String getQuotaId() {
            return this.quotaId;
        }

        public FlowRunEcsSpec setQuotaType(String quotaType) {
            this.quotaType = quotaType;
            return this;
        }
        public String getQuotaType() {
            return this.quotaType;
        }

        public FlowRunEcsSpec setSharedMemory(Integer sharedMemory) {
            this.sharedMemory = sharedMemory;
            return this;
        }
        public Integer getSharedMemory() {
            return this.sharedMemory;
        }

    }

    public static class FlowRunEnvs extends TeaModel {
        /**
         * <p>环境键</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>环境值</p>
         */
        @NameInMap("Value")
        public String value;

        public static FlowRunEnvs build(java.util.Map<String, ?> map) throws Exception {
            FlowRunEnvs self = new FlowRunEnvs();
            return TeaModel.build(map, self);
        }

        public FlowRunEnvs setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public FlowRunEnvs setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class FlowRunEvaluationConfigsFlowSource extends TeaModel {
        /**
         * <p>ID</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>名称</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>类型</p>
         */
        @NameInMap("Type")
        public String type;

        public static FlowRunEvaluationConfigsFlowSource build(java.util.Map<String, ?> map) throws Exception {
            FlowRunEvaluationConfigsFlowSource self = new FlowRunEvaluationConfigsFlowSource();
            return TeaModel.build(map, self);
        }

        public FlowRunEvaluationConfigsFlowSource setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public FlowRunEvaluationConfigsFlowSource setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public FlowRunEvaluationConfigsFlowSource setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class FlowRunEvaluationConfigs extends TeaModel {
        /**
         * <p>映射配置</p>
         */
        @NameInMap("DataColumnMapping")
        public java.util.Map<String, String> dataColumnMapping;

        /**
         * <p>应用流来源</p>
         */
        @NameInMap("FlowSource")
        public FlowRunEvaluationConfigsFlowSource flowSource;

        /**
         * <p>输入配置</p>
         */
        @NameInMap("InputsOverrideConfig")
        public String inputsOverrideConfig;

        public static FlowRunEvaluationConfigs build(java.util.Map<String, ?> map) throws Exception {
            FlowRunEvaluationConfigs self = new FlowRunEvaluationConfigs();
            return TeaModel.build(map, self);
        }

        public FlowRunEvaluationConfigs setDataColumnMapping(java.util.Map<String, String> dataColumnMapping) {
            this.dataColumnMapping = dataColumnMapping;
            return this;
        }
        public java.util.Map<String, String> getDataColumnMapping() {
            return this.dataColumnMapping;
        }

        public FlowRunEvaluationConfigs setFlowSource(FlowRunEvaluationConfigsFlowSource flowSource) {
            this.flowSource = flowSource;
            return this;
        }
        public FlowRunEvaluationConfigsFlowSource getFlowSource() {
            return this.flowSource;
        }

        public FlowRunEvaluationConfigs setInputsOverrideConfig(String inputsOverrideConfig) {
            this.inputsOverrideConfig = inputsOverrideConfig;
            return this;
        }
        public String getInputsOverrideConfig() {
            return this.inputsOverrideConfig;
        }

    }

    public static class FlowRunLabels extends TeaModel {
        /**
         * <p>标签键</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>标签值</p>
         */
        @NameInMap("Value")
        public String value;

        public static FlowRunLabels build(java.util.Map<String, ?> map) throws Exception {
            FlowRunLabels self = new FlowRunLabels();
            return TeaModel.build(map, self);
        }

        public FlowRunLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public FlowRunLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class FlowRunNodeRunInfos extends TeaModel {
        /**
         * <p>耗时</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <p>错误信息</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>输入</p>
         */
        @NameInMap("Inputs")
        public String inputs;

        /**
         * <p>节点名称</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <p>输出</p>
         */
        @NameInMap("Output")
        public String output;

        /**
         * <p>节点状态</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>日志信息</p>
         */
        @NameInMap("Stdout")
        public String stdout;

        public static FlowRunNodeRunInfos build(java.util.Map<String, ?> map) throws Exception {
            FlowRunNodeRunInfos self = new FlowRunNodeRunInfos();
            return TeaModel.build(map, self);
        }

        public FlowRunNodeRunInfos setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public FlowRunNodeRunInfos setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public FlowRunNodeRunInfos setInputs(String inputs) {
            this.inputs = inputs;
            return this;
        }
        public String getInputs() {
            return this.inputs;
        }

        public FlowRunNodeRunInfos setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public FlowRunNodeRunInfos setOutput(String output) {
            this.output = output;
            return this;
        }
        public String getOutput() {
            return this.output;
        }

        public FlowRunNodeRunInfos setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public FlowRunNodeRunInfos setStdout(String stdout) {
            this.stdout = stdout;
            return this;
        }
        public String getStdout() {
            return this.stdout;
        }

    }

    public static class FlowRunUserVpc extends TeaModel {
        /**
         * <p>安全组ID</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>交换机ID</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>VPC ID</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static FlowRunUserVpc build(java.util.Map<String, ?> map) throws Exception {
            FlowRunUserVpc self = new FlowRunUserVpc();
            return TeaModel.build(map, self);
        }

        public FlowRunUserVpc setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public FlowRunUserVpc setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public FlowRunUserVpc setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
