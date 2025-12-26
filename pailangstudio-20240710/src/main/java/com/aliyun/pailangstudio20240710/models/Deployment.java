// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pailangstudio20240710.models;

import com.aliyun.tea.*;

public class Deployment extends TeaModel {
    @NameInMap("Accessibility")
    public String accessibility;

    @NameInMap("ChatHistoryConfig")
    public DeploymentChatHistoryConfig chatHistoryConfig;

    @NameInMap("ContentModerationConfig")
    public DeploymentContentModerationConfig contentModerationConfig;

    @NameInMap("Creator")
    public String creator;

    @NameInMap("CredentialConfig")
    public DeploymentCredentialConfig credentialConfig;

    @NameInMap("DataSources")
    public java.util.List<DeploymentDataSources> dataSources;

    @NameInMap("DeploymentConfig")
    public String deploymentConfig;

    @NameInMap("DeploymentId")
    public String deploymentId;

    @NameInMap("DeploymentStages")
    public String deploymentStages;

    @NameInMap("DeploymentStatus")
    public String deploymentStatus;

    @NameInMap("Description")
    public String description;

    @NameInMap("EcsSpec")
    public DeploymentEcsSpec ecsSpec;

    @NameInMap("EnableTrace")
    public Boolean enableTrace;

    @NameInMap("Envs")
    public java.util.List<DeploymentEnvs> envs;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    @NameInMap("Labels")
    public java.util.List<DeploymentLabels> labels;

    @NameInMap("OperationType")
    public String operationType;

    @NameInMap("ResourceId")
    public String resourceId;

    @NameInMap("ResourceSnapshotId")
    public String resourceSnapshotId;

    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("ServiceGroup")
    public String serviceGroup;

    @NameInMap("ServiceName")
    public String serviceName;

    @NameInMap("UserVpc")
    public DeploymentUserVpc userVpc;

    @NameInMap("WorkDir")
    public String workDir;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static Deployment build(java.util.Map<String, ?> map) throws Exception {
        Deployment self = new Deployment();
        return TeaModel.build(map, self);
    }

    public Deployment setAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }
    public String getAccessibility() {
        return this.accessibility;
    }

    public Deployment setChatHistoryConfig(DeploymentChatHistoryConfig chatHistoryConfig) {
        this.chatHistoryConfig = chatHistoryConfig;
        return this;
    }
    public DeploymentChatHistoryConfig getChatHistoryConfig() {
        return this.chatHistoryConfig;
    }

    public Deployment setContentModerationConfig(DeploymentContentModerationConfig contentModerationConfig) {
        this.contentModerationConfig = contentModerationConfig;
        return this;
    }
    public DeploymentContentModerationConfig getContentModerationConfig() {
        return this.contentModerationConfig;
    }

    public Deployment setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public Deployment setCredentialConfig(DeploymentCredentialConfig credentialConfig) {
        this.credentialConfig = credentialConfig;
        return this;
    }
    public DeploymentCredentialConfig getCredentialConfig() {
        return this.credentialConfig;
    }

    public Deployment setDataSources(java.util.List<DeploymentDataSources> dataSources) {
        this.dataSources = dataSources;
        return this;
    }
    public java.util.List<DeploymentDataSources> getDataSources() {
        return this.dataSources;
    }

    public Deployment setDeploymentConfig(String deploymentConfig) {
        this.deploymentConfig = deploymentConfig;
        return this;
    }
    public String getDeploymentConfig() {
        return this.deploymentConfig;
    }

    public Deployment setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
        return this;
    }
    public String getDeploymentId() {
        return this.deploymentId;
    }

    public Deployment setDeploymentStages(String deploymentStages) {
        this.deploymentStages = deploymentStages;
        return this;
    }
    public String getDeploymentStages() {
        return this.deploymentStages;
    }

    public Deployment setDeploymentStatus(String deploymentStatus) {
        this.deploymentStatus = deploymentStatus;
        return this;
    }
    public String getDeploymentStatus() {
        return this.deploymentStatus;
    }

    public Deployment setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public Deployment setEcsSpec(DeploymentEcsSpec ecsSpec) {
        this.ecsSpec = ecsSpec;
        return this;
    }
    public DeploymentEcsSpec getEcsSpec() {
        return this.ecsSpec;
    }

    public Deployment setEnableTrace(Boolean enableTrace) {
        this.enableTrace = enableTrace;
        return this;
    }
    public Boolean getEnableTrace() {
        return this.enableTrace;
    }

    public Deployment setEnvs(java.util.List<DeploymentEnvs> envs) {
        this.envs = envs;
        return this;
    }
    public java.util.List<DeploymentEnvs> getEnvs() {
        return this.envs;
    }

    public Deployment setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public Deployment setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public Deployment setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public Deployment setLabels(java.util.List<DeploymentLabels> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<DeploymentLabels> getLabels() {
        return this.labels;
    }

    public Deployment setOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }
    public String getOperationType() {
        return this.operationType;
    }

    public Deployment setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public Deployment setResourceSnapshotId(String resourceSnapshotId) {
        this.resourceSnapshotId = resourceSnapshotId;
        return this;
    }
    public String getResourceSnapshotId() {
        return this.resourceSnapshotId;
    }

    public Deployment setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public Deployment setServiceGroup(String serviceGroup) {
        this.serviceGroup = serviceGroup;
        return this;
    }
    public String getServiceGroup() {
        return this.serviceGroup;
    }

    public Deployment setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public Deployment setUserVpc(DeploymentUserVpc userVpc) {
        this.userVpc = userVpc;
        return this;
    }
    public DeploymentUserVpc getUserVpc() {
        return this.userVpc;
    }

    public Deployment setWorkDir(String workDir) {
        this.workDir = workDir;
        return this;
    }
    public String getWorkDir() {
        return this.workDir;
    }

    public Deployment setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class DeploymentChatHistoryConfig extends TeaModel {
        /**
         * <p>连接名称</p>
         */
        @NameInMap("ConnectionName")
        public String connectionName;

        /**
         * <p>存储类型</p>
         */
        @NameInMap("StorageType")
        public String storageType;

        public static DeploymentChatHistoryConfig build(java.util.Map<String, ?> map) throws Exception {
            DeploymentChatHistoryConfig self = new DeploymentChatHistoryConfig();
            return TeaModel.build(map, self);
        }

        public DeploymentChatHistoryConfig setConnectionName(String connectionName) {
            this.connectionName = connectionName;
            return this;
        }
        public String getConnectionName() {
            return this.connectionName;
        }

        public DeploymentChatHistoryConfig setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

    }

    public static class DeploymentContentModerationConfig extends TeaModel {
        /**
         * <p>启用输入内容审查</p>
         */
        @NameInMap("EnableInputModeration")
        public Boolean enableInputModeration;

        /**
         * <p>启用输出内容审查</p>
         */
        @NameInMap("EnableOutputModeration")
        public Boolean enableOutputModeration;

        /**
         * <p>流式输出内容送审缓存大小</p>
         */
        @NameInMap("StreamingModerationThreshold")
        public Integer streamingModerationThreshold;

        public static DeploymentContentModerationConfig build(java.util.Map<String, ?> map) throws Exception {
            DeploymentContentModerationConfig self = new DeploymentContentModerationConfig();
            return TeaModel.build(map, self);
        }

        public DeploymentContentModerationConfig setEnableInputModeration(Boolean enableInputModeration) {
            this.enableInputModeration = enableInputModeration;
            return this;
        }
        public Boolean getEnableInputModeration() {
            return this.enableInputModeration;
        }

        public DeploymentContentModerationConfig setEnableOutputModeration(Boolean enableOutputModeration) {
            this.enableOutputModeration = enableOutputModeration;
            return this;
        }
        public Boolean getEnableOutputModeration() {
            return this.enableOutputModeration;
        }

        public DeploymentContentModerationConfig setStreamingModerationThreshold(Integer streamingModerationThreshold) {
            this.streamingModerationThreshold = streamingModerationThreshold;
            return this;
        }
        public Integer getStreamingModerationThreshold() {
            return this.streamingModerationThreshold;
        }

    }

    public static class DeploymentCredentialConfigCredentialConfigItemsRoles extends TeaModel {
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

        public static DeploymentCredentialConfigCredentialConfigItemsRoles build(java.util.Map<String, ?> map) throws Exception {
            DeploymentCredentialConfigCredentialConfigItemsRoles self = new DeploymentCredentialConfigCredentialConfigItemsRoles();
            return TeaModel.build(map, self);
        }

        public DeploymentCredentialConfigCredentialConfigItemsRoles setAssumeRoleFor(String assumeRoleFor) {
            this.assumeRoleFor = assumeRoleFor;
            return this;
        }
        public String getAssumeRoleFor() {
            return this.assumeRoleFor;
        }

        public DeploymentCredentialConfigCredentialConfigItemsRoles setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

        public DeploymentCredentialConfigCredentialConfigItemsRoles setRoleType(String roleType) {
            this.roleType = roleType;
            return this;
        }
        public String getRoleType() {
            return this.roleType;
        }

    }

    public static class DeploymentCredentialConfigCredentialConfigItems extends TeaModel {
        /**
         * <p>Key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>角色列表</p>
         */
        @NameInMap("Roles")
        public java.util.List<DeploymentCredentialConfigCredentialConfigItemsRoles> roles;

        /**
         * <p>Type</p>
         */
        @NameInMap("Type")
        public String type;

        public static DeploymentCredentialConfigCredentialConfigItems build(java.util.Map<String, ?> map) throws Exception {
            DeploymentCredentialConfigCredentialConfigItems self = new DeploymentCredentialConfigCredentialConfigItems();
            return TeaModel.build(map, self);
        }

        public DeploymentCredentialConfigCredentialConfigItems setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DeploymentCredentialConfigCredentialConfigItems setRoles(java.util.List<DeploymentCredentialConfigCredentialConfigItemsRoles> roles) {
            this.roles = roles;
            return this;
        }
        public java.util.List<DeploymentCredentialConfigCredentialConfigItemsRoles> getRoles() {
            return this.roles;
        }

        public DeploymentCredentialConfigCredentialConfigItems setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DeploymentCredentialConfig extends TeaModel {
        /**
         * <p>AliyunEnvRoleKey</p>
         */
        @NameInMap("AliyunEnvRoleKey")
        public String aliyunEnvRoleKey;

        /**
         * <p>Credential配置项列表</p>
         */
        @NameInMap("CredentialConfigItems")
        public java.util.List<DeploymentCredentialConfigCredentialConfigItems> credentialConfigItems;

        /**
         * <p>是否启用Credential注入</p>
         */
        @NameInMap("EnableCredentialInject")
        public Boolean enableCredentialInject;

        public static DeploymentCredentialConfig build(java.util.Map<String, ?> map) throws Exception {
            DeploymentCredentialConfig self = new DeploymentCredentialConfig();
            return TeaModel.build(map, self);
        }

        public DeploymentCredentialConfig setAliyunEnvRoleKey(String aliyunEnvRoleKey) {
            this.aliyunEnvRoleKey = aliyunEnvRoleKey;
            return this;
        }
        public String getAliyunEnvRoleKey() {
            return this.aliyunEnvRoleKey;
        }

        public DeploymentCredentialConfig setCredentialConfigItems(java.util.List<DeploymentCredentialConfigCredentialConfigItems> credentialConfigItems) {
            this.credentialConfigItems = credentialConfigItems;
            return this;
        }
        public java.util.List<DeploymentCredentialConfigCredentialConfigItems> getCredentialConfigItems() {
            return this.credentialConfigItems;
        }

        public DeploymentCredentialConfig setEnableCredentialInject(Boolean enableCredentialInject) {
            this.enableCredentialInject = enableCredentialInject;
            return this;
        }
        public Boolean getEnableCredentialInject() {
            return this.enableCredentialInject;
        }

    }

    public static class DeploymentDataSources extends TeaModel {
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

        public static DeploymentDataSources build(java.util.Map<String, ?> map) throws Exception {
            DeploymentDataSources self = new DeploymentDataSources();
            return TeaModel.build(map, self);
        }

        public DeploymentDataSources setDatasetId(String datasetId) {
            this.datasetId = datasetId;
            return this;
        }
        public String getDatasetId() {
            return this.datasetId;
        }

        public DeploymentDataSources setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

        public DeploymentDataSources setUri(String uri) {
            this.uri = uri;
            return this;
        }
        public String getUri() {
            return this.uri;
        }

    }

    public static class DeploymentEcsSpecComputingInstanceConfigComputingInstances extends TeaModel {
        /**
         * <p>竞价出价</p>
         */
        @NameInMap("SpotPriceLimit")
        public Float spotPriceLimit;

        /**
         * <p>机型</p>
         */
        @NameInMap("Type")
        public String type;

        public static DeploymentEcsSpecComputingInstanceConfigComputingInstances build(java.util.Map<String, ?> map) throws Exception {
            DeploymentEcsSpecComputingInstanceConfigComputingInstances self = new DeploymentEcsSpecComputingInstanceConfigComputingInstances();
            return TeaModel.build(map, self);
        }

        public DeploymentEcsSpecComputingInstanceConfigComputingInstances setSpotPriceLimit(Float spotPriceLimit) {
            this.spotPriceLimit = spotPriceLimit;
            return this;
        }
        public Float getSpotPriceLimit() {
            return this.spotPriceLimit;
        }

        public DeploymentEcsSpecComputingInstanceConfigComputingInstances setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DeploymentEcsSpecComputingInstanceConfig extends TeaModel {
        /**
         * <p>机器资源配置</p>
         */
        @NameInMap("ComputingInstances")
        public java.util.List<DeploymentEcsSpecComputingInstanceConfigComputingInstances> computingInstances;

        /**
         * <p>是否启用竞价保留时长</p>
         */
        @NameInMap("DisableSpotProtectionPeriod")
        public Boolean disableSpotProtectionPeriod;

        public static DeploymentEcsSpecComputingInstanceConfig build(java.util.Map<String, ?> map) throws Exception {
            DeploymentEcsSpecComputingInstanceConfig self = new DeploymentEcsSpecComputingInstanceConfig();
            return TeaModel.build(map, self);
        }

        public DeploymentEcsSpecComputingInstanceConfig setComputingInstances(java.util.List<DeploymentEcsSpecComputingInstanceConfigComputingInstances> computingInstances) {
            this.computingInstances = computingInstances;
            return this;
        }
        public java.util.List<DeploymentEcsSpecComputingInstanceConfigComputingInstances> getComputingInstances() {
            return this.computingInstances;
        }

        public DeploymentEcsSpecComputingInstanceConfig setDisableSpotProtectionPeriod(Boolean disableSpotProtectionPeriod) {
            this.disableSpotProtectionPeriod = disableSpotProtectionPeriod;
            return this;
        }
        public Boolean getDisableSpotProtectionPeriod() {
            return this.disableSpotProtectionPeriod;
        }

    }

    public static class DeploymentEcsSpec extends TeaModel {
        /**
         * <p>CPU信息</p>
         */
        @NameInMap("CPU")
        public Integer CPU;

        /**
         * <p>竞价资源配置</p>
         */
        @NameInMap("ComputingInstanceConfig")
        public DeploymentEcsSpecComputingInstanceConfig computingInstanceConfig;

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
         * <p>是否启用弹性资源池</p>
         */
        @NameInMap("ResourceBurstable")
        public Boolean resourceBurstable;

        /**
         * <p>资源组ID</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>共享内存</p>
         */
        @NameInMap("SharedMemory")
        public Integer sharedMemory;

        public static DeploymentEcsSpec build(java.util.Map<String, ?> map) throws Exception {
            DeploymentEcsSpec self = new DeploymentEcsSpec();
            return TeaModel.build(map, self);
        }

        public DeploymentEcsSpec setCPU(Integer CPU) {
            this.CPU = CPU;
            return this;
        }
        public Integer getCPU() {
            return this.CPU;
        }

        public DeploymentEcsSpec setComputingInstanceConfig(DeploymentEcsSpecComputingInstanceConfig computingInstanceConfig) {
            this.computingInstanceConfig = computingInstanceConfig;
            return this;
        }
        public DeploymentEcsSpecComputingInstanceConfig getComputingInstanceConfig() {
            return this.computingInstanceConfig;
        }

        public DeploymentEcsSpec setExtraEphemeralStorage(Integer extraEphemeralStorage) {
            this.extraEphemeralStorage = extraEphemeralStorage;
            return this;
        }
        public Integer getExtraEphemeralStorage() {
            return this.extraEphemeralStorage;
        }

        public DeploymentEcsSpec setGPU(Integer GPU) {
            this.GPU = GPU;
            return this;
        }
        public Integer getGPU() {
            return this.GPU;
        }

        public DeploymentEcsSpec setGPUCorePercentage(Integer GPUCorePercentage) {
            this.GPUCorePercentage = GPUCorePercentage;
            return this;
        }
        public Integer getGPUCorePercentage() {
            return this.GPUCorePercentage;
        }

        public DeploymentEcsSpec setGPUMemory(Integer GPUMemory) {
            this.GPUMemory = GPUMemory;
            return this;
        }
        public Integer getGPUMemory() {
            return this.GPUMemory;
        }

        public DeploymentEcsSpec setGPUType(String GPUType) {
            this.GPUType = GPUType;
            return this;
        }
        public String getGPUType() {
            return this.GPUType;
        }

        public DeploymentEcsSpec setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DeploymentEcsSpec setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
        }

        public DeploymentEcsSpec setPodCount(Integer podCount) {
            this.podCount = podCount;
            return this;
        }
        public Integer getPodCount() {
            return this.podCount;
        }

        public DeploymentEcsSpec setQuotaId(String quotaId) {
            this.quotaId = quotaId;
            return this;
        }
        public String getQuotaId() {
            return this.quotaId;
        }

        public DeploymentEcsSpec setQuotaType(String quotaType) {
            this.quotaType = quotaType;
            return this;
        }
        public String getQuotaType() {
            return this.quotaType;
        }

        public DeploymentEcsSpec setResourceBurstable(Boolean resourceBurstable) {
            this.resourceBurstable = resourceBurstable;
            return this;
        }
        public Boolean getResourceBurstable() {
            return this.resourceBurstable;
        }

        public DeploymentEcsSpec setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public DeploymentEcsSpec setSharedMemory(Integer sharedMemory) {
            this.sharedMemory = sharedMemory;
            return this;
        }
        public Integer getSharedMemory() {
            return this.sharedMemory;
        }

    }

    public static class DeploymentEnvs extends TeaModel {
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

        public static DeploymentEnvs build(java.util.Map<String, ?> map) throws Exception {
            DeploymentEnvs self = new DeploymentEnvs();
            return TeaModel.build(map, self);
        }

        public DeploymentEnvs setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DeploymentEnvs setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DeploymentLabels extends TeaModel {
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

        public static DeploymentLabels build(java.util.Map<String, ?> map) throws Exception {
            DeploymentLabels self = new DeploymentLabels();
            return TeaModel.build(map, self);
        }

        public DeploymentLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DeploymentLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DeploymentUserVpc extends TeaModel {
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

        public static DeploymentUserVpc build(java.util.Map<String, ?> map) throws Exception {
            DeploymentUserVpc self = new DeploymentUserVpc();
            return TeaModel.build(map, self);
        }

        public DeploymentUserVpc setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public DeploymentUserVpc setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DeploymentUserVpc setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
