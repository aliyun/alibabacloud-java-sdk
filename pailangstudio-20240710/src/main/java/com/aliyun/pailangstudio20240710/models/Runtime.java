// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pailangstudio20240710.models;

import com.aliyun.tea.*;

public class Runtime extends TeaModel {
    @NameInMap("Accessibility")
    public String accessibility;

    @NameInMap("Creator")
    public String creator;

    @NameInMap("CredentialConfig")
    public RuntimeCredentialConfig credentialConfig;

    @NameInMap("DataSources")
    public java.util.List<RuntimeDataSources> dataSources;

    @NameInMap("EcsSpec")
    public RuntimeEcsSpec ecsSpec;

    @NameInMap("Envs")
    public java.util.List<RuntimeEnvs> envs;

    @NameInMap("FlowId")
    public String flowId;

    @NameInMap("Flows")
    public java.util.List<RuntimeFlows> flows;

    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    @NameInMap("IdleTimeout")
    public Integer idleTimeout;

    @NameInMap("Labels")
    public java.util.List<RuntimeLabels> labels;

    @NameInMap("LatestVersion")
    public String latestVersion;

    @NameInMap("MCPConfig")
    public String MCPConfig;

    @NameInMap("ResourceId")
    public String resourceId;

    @NameInMap("RunTimeout")
    public Integer runTimeout;

    @NameInMap("RuntimeId")
    public String runtimeId;

    @NameInMap("RuntimeLog")
    public String runtimeLog;

    @NameInMap("RuntimeName")
    public String runtimeName;

    @NameInMap("RuntimeStatus")
    public String runtimeStatus;

    @NameInMap("RuntimeType")
    public String runtimeType;

    @NameInMap("SupportSSEStream")
    public Boolean supportSSEStream;

    @NameInMap("UserVpc")
    public RuntimeUserVpc userVpc;

    @NameInMap("Version")
    public String version;

    @NameInMap("WorkDir")
    public String workDir;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static Runtime build(java.util.Map<String, ?> map) throws Exception {
        Runtime self = new Runtime();
        return TeaModel.build(map, self);
    }

    public Runtime setAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }
    public String getAccessibility() {
        return this.accessibility;
    }

    public Runtime setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public Runtime setCredentialConfig(RuntimeCredentialConfig credentialConfig) {
        this.credentialConfig = credentialConfig;
        return this;
    }
    public RuntimeCredentialConfig getCredentialConfig() {
        return this.credentialConfig;
    }

    public Runtime setDataSources(java.util.List<RuntimeDataSources> dataSources) {
        this.dataSources = dataSources;
        return this;
    }
    public java.util.List<RuntimeDataSources> getDataSources() {
        return this.dataSources;
    }

    public Runtime setEcsSpec(RuntimeEcsSpec ecsSpec) {
        this.ecsSpec = ecsSpec;
        return this;
    }
    public RuntimeEcsSpec getEcsSpec() {
        return this.ecsSpec;
    }

    public Runtime setEnvs(java.util.List<RuntimeEnvs> envs) {
        this.envs = envs;
        return this;
    }
    public java.util.List<RuntimeEnvs> getEnvs() {
        return this.envs;
    }

    public Runtime setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public Runtime setFlows(java.util.List<RuntimeFlows> flows) {
        this.flows = flows;
        return this;
    }
    public java.util.List<RuntimeFlows> getFlows() {
        return this.flows;
    }

    public Runtime setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public Runtime setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public Runtime setIdleTimeout(Integer idleTimeout) {
        this.idleTimeout = idleTimeout;
        return this;
    }
    public Integer getIdleTimeout() {
        return this.idleTimeout;
    }

    public Runtime setLabels(java.util.List<RuntimeLabels> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<RuntimeLabels> getLabels() {
        return this.labels;
    }

    public Runtime setLatestVersion(String latestVersion) {
        this.latestVersion = latestVersion;
        return this;
    }
    public String getLatestVersion() {
        return this.latestVersion;
    }

    public Runtime setMCPConfig(String MCPConfig) {
        this.MCPConfig = MCPConfig;
        return this;
    }
    public String getMCPConfig() {
        return this.MCPConfig;
    }

    public Runtime setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public Runtime setRunTimeout(Integer runTimeout) {
        this.runTimeout = runTimeout;
        return this;
    }
    public Integer getRunTimeout() {
        return this.runTimeout;
    }

    public Runtime setRuntimeId(String runtimeId) {
        this.runtimeId = runtimeId;
        return this;
    }
    public String getRuntimeId() {
        return this.runtimeId;
    }

    public Runtime setRuntimeLog(String runtimeLog) {
        this.runtimeLog = runtimeLog;
        return this;
    }
    public String getRuntimeLog() {
        return this.runtimeLog;
    }

    public Runtime setRuntimeName(String runtimeName) {
        this.runtimeName = runtimeName;
        return this;
    }
    public String getRuntimeName() {
        return this.runtimeName;
    }

    public Runtime setRuntimeStatus(String runtimeStatus) {
        this.runtimeStatus = runtimeStatus;
        return this;
    }
    public String getRuntimeStatus() {
        return this.runtimeStatus;
    }

    public Runtime setRuntimeType(String runtimeType) {
        this.runtimeType = runtimeType;
        return this;
    }
    public String getRuntimeType() {
        return this.runtimeType;
    }

    public Runtime setSupportSSEStream(Boolean supportSSEStream) {
        this.supportSSEStream = supportSSEStream;
        return this;
    }
    public Boolean getSupportSSEStream() {
        return this.supportSSEStream;
    }

    public Runtime setUserVpc(RuntimeUserVpc userVpc) {
        this.userVpc = userVpc;
        return this;
    }
    public RuntimeUserVpc getUserVpc() {
        return this.userVpc;
    }

    public Runtime setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public Runtime setWorkDir(String workDir) {
        this.workDir = workDir;
        return this;
    }
    public String getWorkDir() {
        return this.workDir;
    }

    public Runtime setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class RuntimeCredentialConfigCredentialConfigItemsRoles extends TeaModel {
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

        public static RuntimeCredentialConfigCredentialConfigItemsRoles build(java.util.Map<String, ?> map) throws Exception {
            RuntimeCredentialConfigCredentialConfigItemsRoles self = new RuntimeCredentialConfigCredentialConfigItemsRoles();
            return TeaModel.build(map, self);
        }

        public RuntimeCredentialConfigCredentialConfigItemsRoles setAssumeRoleFor(String assumeRoleFor) {
            this.assumeRoleFor = assumeRoleFor;
            return this;
        }
        public String getAssumeRoleFor() {
            return this.assumeRoleFor;
        }

        public RuntimeCredentialConfigCredentialConfigItemsRoles setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

        public RuntimeCredentialConfigCredentialConfigItemsRoles setRoleType(String roleType) {
            this.roleType = roleType;
            return this;
        }
        public String getRoleType() {
            return this.roleType;
        }

    }

    public static class RuntimeCredentialConfigCredentialConfigItems extends TeaModel {
        /**
         * <p>Key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>角色列表</p>
         */
        @NameInMap("Roles")
        public java.util.List<RuntimeCredentialConfigCredentialConfigItemsRoles> roles;

        /**
         * <p>Type</p>
         */
        @NameInMap("Type")
        public String type;

        public static RuntimeCredentialConfigCredentialConfigItems build(java.util.Map<String, ?> map) throws Exception {
            RuntimeCredentialConfigCredentialConfigItems self = new RuntimeCredentialConfigCredentialConfigItems();
            return TeaModel.build(map, self);
        }

        public RuntimeCredentialConfigCredentialConfigItems setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public RuntimeCredentialConfigCredentialConfigItems setRoles(java.util.List<RuntimeCredentialConfigCredentialConfigItemsRoles> roles) {
            this.roles = roles;
            return this;
        }
        public java.util.List<RuntimeCredentialConfigCredentialConfigItemsRoles> getRoles() {
            return this.roles;
        }

        public RuntimeCredentialConfigCredentialConfigItems setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class RuntimeCredentialConfig extends TeaModel {
        /**
         * <p>AliyunEnvRoleKey</p>
         */
        @NameInMap("AliyunEnvRoleKey")
        public String aliyunEnvRoleKey;

        /**
         * <p>Credential配置项列表</p>
         */
        @NameInMap("CredentialConfigItems")
        public java.util.List<RuntimeCredentialConfigCredentialConfigItems> credentialConfigItems;

        /**
         * <p>是否启用Credential注入</p>
         */
        @NameInMap("EnableCredentialInject")
        public Boolean enableCredentialInject;

        public static RuntimeCredentialConfig build(java.util.Map<String, ?> map) throws Exception {
            RuntimeCredentialConfig self = new RuntimeCredentialConfig();
            return TeaModel.build(map, self);
        }

        public RuntimeCredentialConfig setAliyunEnvRoleKey(String aliyunEnvRoleKey) {
            this.aliyunEnvRoleKey = aliyunEnvRoleKey;
            return this;
        }
        public String getAliyunEnvRoleKey() {
            return this.aliyunEnvRoleKey;
        }

        public RuntimeCredentialConfig setCredentialConfigItems(java.util.List<RuntimeCredentialConfigCredentialConfigItems> credentialConfigItems) {
            this.credentialConfigItems = credentialConfigItems;
            return this;
        }
        public java.util.List<RuntimeCredentialConfigCredentialConfigItems> getCredentialConfigItems() {
            return this.credentialConfigItems;
        }

        public RuntimeCredentialConfig setEnableCredentialInject(Boolean enableCredentialInject) {
            this.enableCredentialInject = enableCredentialInject;
            return this;
        }
        public Boolean getEnableCredentialInject() {
            return this.enableCredentialInject;
        }

    }

    public static class RuntimeDataSources extends TeaModel {
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

        public static RuntimeDataSources build(java.util.Map<String, ?> map) throws Exception {
            RuntimeDataSources self = new RuntimeDataSources();
            return TeaModel.build(map, self);
        }

        public RuntimeDataSources setDatasetId(String datasetId) {
            this.datasetId = datasetId;
            return this;
        }
        public String getDatasetId() {
            return this.datasetId;
        }

        public RuntimeDataSources setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

        public RuntimeDataSources setUri(String uri) {
            this.uri = uri;
            return this;
        }
        public String getUri() {
            return this.uri;
        }

    }

    public static class RuntimeEcsSpec extends TeaModel {
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

        public static RuntimeEcsSpec build(java.util.Map<String, ?> map) throws Exception {
            RuntimeEcsSpec self = new RuntimeEcsSpec();
            return TeaModel.build(map, self);
        }

        public RuntimeEcsSpec setCPU(Integer CPU) {
            this.CPU = CPU;
            return this;
        }
        public Integer getCPU() {
            return this.CPU;
        }

        public RuntimeEcsSpec setExtraEphemeralStorage(Integer extraEphemeralStorage) {
            this.extraEphemeralStorage = extraEphemeralStorage;
            return this;
        }
        public Integer getExtraEphemeralStorage() {
            return this.extraEphemeralStorage;
        }

        public RuntimeEcsSpec setGPU(Integer GPU) {
            this.GPU = GPU;
            return this;
        }
        public Integer getGPU() {
            return this.GPU;
        }

        public RuntimeEcsSpec setGPUCorePercentage(Integer GPUCorePercentage) {
            this.GPUCorePercentage = GPUCorePercentage;
            return this;
        }
        public Integer getGPUCorePercentage() {
            return this.GPUCorePercentage;
        }

        public RuntimeEcsSpec setGPUMemory(Integer GPUMemory) {
            this.GPUMemory = GPUMemory;
            return this;
        }
        public Integer getGPUMemory() {
            return this.GPUMemory;
        }

        public RuntimeEcsSpec setGPUType(String GPUType) {
            this.GPUType = GPUType;
            return this;
        }
        public String getGPUType() {
            return this.GPUType;
        }

        public RuntimeEcsSpec setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public RuntimeEcsSpec setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
        }

        public RuntimeEcsSpec setPodCount(Integer podCount) {
            this.podCount = podCount;
            return this;
        }
        public Integer getPodCount() {
            return this.podCount;
        }

        public RuntimeEcsSpec setQuotaId(String quotaId) {
            this.quotaId = quotaId;
            return this;
        }
        public String getQuotaId() {
            return this.quotaId;
        }

        public RuntimeEcsSpec setQuotaType(String quotaType) {
            this.quotaType = quotaType;
            return this;
        }
        public String getQuotaType() {
            return this.quotaType;
        }

        public RuntimeEcsSpec setSharedMemory(Integer sharedMemory) {
            this.sharedMemory = sharedMemory;
            return this;
        }
        public Integer getSharedMemory() {
            return this.sharedMemory;
        }

    }

    public static class RuntimeEnvs extends TeaModel {
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

        public static RuntimeEnvs build(java.util.Map<String, ?> map) throws Exception {
            RuntimeEnvs self = new RuntimeEnvs();
            return TeaModel.build(map, self);
        }

        public RuntimeEnvs setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public RuntimeEnvs setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class RuntimeFlows extends TeaModel {
        /**
         * <p>应用流ID</p>
         */
        @NameInMap("FlowId")
        public String flowId;

        /**
         * <p>应用流名称</p>
         */
        @NameInMap("FlowName")
        public String flowName;

        public static RuntimeFlows build(java.util.Map<String, ?> map) throws Exception {
            RuntimeFlows self = new RuntimeFlows();
            return TeaModel.build(map, self);
        }

        public RuntimeFlows setFlowId(String flowId) {
            this.flowId = flowId;
            return this;
        }
        public String getFlowId() {
            return this.flowId;
        }

        public RuntimeFlows setFlowName(String flowName) {
            this.flowName = flowName;
            return this;
        }
        public String getFlowName() {
            return this.flowName;
        }

    }

    public static class RuntimeLabels extends TeaModel {
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

        public static RuntimeLabels build(java.util.Map<String, ?> map) throws Exception {
            RuntimeLabels self = new RuntimeLabels();
            return TeaModel.build(map, self);
        }

        public RuntimeLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public RuntimeLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class RuntimeUserVpc extends TeaModel {
        /**
         * <p>默认路由</p>
         */
        @NameInMap("DefaultRoute")
        public String defaultRoute;

        /**
         * <p>扩展网段</p>
         */
        @NameInMap("ExtendedCIDRs")
        public java.util.List<String> extendedCIDRs;

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

        public static RuntimeUserVpc build(java.util.Map<String, ?> map) throws Exception {
            RuntimeUserVpc self = new RuntimeUserVpc();
            return TeaModel.build(map, self);
        }

        public RuntimeUserVpc setDefaultRoute(String defaultRoute) {
            this.defaultRoute = defaultRoute;
            return this;
        }
        public String getDefaultRoute() {
            return this.defaultRoute;
        }

        public RuntimeUserVpc setExtendedCIDRs(java.util.List<String> extendedCIDRs) {
            this.extendedCIDRs = extendedCIDRs;
            return this;
        }
        public java.util.List<String> getExtendedCIDRs() {
            return this.extendedCIDRs;
        }

        public RuntimeUserVpc setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public RuntimeUserVpc setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public RuntimeUserVpc setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
