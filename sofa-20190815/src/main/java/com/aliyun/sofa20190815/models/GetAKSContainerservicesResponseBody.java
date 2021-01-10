// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetAKSContainerservicesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public GetAKSContainerservicesResponseBodyData data;

    public static GetAKSContainerservicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAKSContainerservicesResponseBody self = new GetAKSContainerservicesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAKSContainerservicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAKSContainerservicesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetAKSContainerservicesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetAKSContainerservicesResponseBody setData(GetAKSContainerservicesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAKSContainerservicesResponseBodyData getData() {
        return this.data;
    }

    public static class GetAKSContainerservicesResponseBodyDataContainerServiceLogConfigs extends TeaModel {
        @NameInMap("Created")
        public Boolean created;

        @NameInMap("FilePattern")
        public String filePattern;

        @NameInMap("LogConfigPath")
        public String logConfigPath;

        @NameInMap("LogPath")
        public String logPath;

        @NameInMap("LogStore")
        public String logStore;

        @NameInMap("Name")
        public String name;

        @NameInMap("Published")
        public Boolean published;

        public static GetAKSContainerservicesResponseBodyDataContainerServiceLogConfigs build(java.util.Map<String, ?> map) throws Exception {
            GetAKSContainerservicesResponseBodyDataContainerServiceLogConfigs self = new GetAKSContainerservicesResponseBodyDataContainerServiceLogConfigs();
            return TeaModel.build(map, self);
        }

        public GetAKSContainerservicesResponseBodyDataContainerServiceLogConfigs setCreated(Boolean created) {
            this.created = created;
            return this;
        }
        public Boolean getCreated() {
            return this.created;
        }

        public GetAKSContainerservicesResponseBodyDataContainerServiceLogConfigs setFilePattern(String filePattern) {
            this.filePattern = filePattern;
            return this;
        }
        public String getFilePattern() {
            return this.filePattern;
        }

        public GetAKSContainerservicesResponseBodyDataContainerServiceLogConfigs setLogConfigPath(String logConfigPath) {
            this.logConfigPath = logConfigPath;
            return this;
        }
        public String getLogConfigPath() {
            return this.logConfigPath;
        }

        public GetAKSContainerservicesResponseBodyDataContainerServiceLogConfigs setLogPath(String logPath) {
            this.logPath = logPath;
            return this;
        }
        public String getLogPath() {
            return this.logPath;
        }

        public GetAKSContainerservicesResponseBodyDataContainerServiceLogConfigs setLogStore(String logStore) {
            this.logStore = logStore;
            return this;
        }
        public String getLogStore() {
            return this.logStore;
        }

        public GetAKSContainerservicesResponseBodyDataContainerServiceLogConfigs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetAKSContainerservicesResponseBodyDataContainerServiceLogConfigs setPublished(Boolean published) {
            this.published = published;
            return this;
        }
        public Boolean getPublished() {
            return this.published;
        }

    }

    public static class GetAKSContainerservicesResponseBodyDataContainerServiceLifecycleState extends TeaModel {
        @NameInMap("DeploymentState")
        public String deploymentState;

        @NameInMap("MetadataState")
        public String metadataState;

        @NameInMap("RuntimeState")
        public String runtimeState;

        public static GetAKSContainerservicesResponseBodyDataContainerServiceLifecycleState build(java.util.Map<String, ?> map) throws Exception {
            GetAKSContainerservicesResponseBodyDataContainerServiceLifecycleState self = new GetAKSContainerservicesResponseBodyDataContainerServiceLifecycleState();
            return TeaModel.build(map, self);
        }

        public GetAKSContainerservicesResponseBodyDataContainerServiceLifecycleState setDeploymentState(String deploymentState) {
            this.deploymentState = deploymentState;
            return this;
        }
        public String getDeploymentState() {
            return this.deploymentState;
        }

        public GetAKSContainerservicesResponseBodyDataContainerServiceLifecycleState setMetadataState(String metadataState) {
            this.metadataState = metadataState;
            return this;
        }
        public String getMetadataState() {
            return this.metadataState;
        }

        public GetAKSContainerservicesResponseBodyDataContainerServiceLifecycleState setRuntimeState(String runtimeState) {
            this.runtimeState = runtimeState;
            return this;
        }
        public String getRuntimeState() {
            return this.runtimeState;
        }

    }

    public static class GetAKSContainerservicesResponseBodyDataContainerServiceNamespaceScopedEntityEnvEntityEntity extends TeaModel {
        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("Id")
        public String id;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        public static GetAKSContainerservicesResponseBodyDataContainerServiceNamespaceScopedEntityEnvEntityEntity build(java.util.Map<String, ?> map) throws Exception {
            GetAKSContainerservicesResponseBodyDataContainerServiceNamespaceScopedEntityEnvEntityEntity self = new GetAKSContainerservicesResponseBodyDataContainerServiceNamespaceScopedEntityEnvEntityEntity();
            return TeaModel.build(map, self);
        }

        public GetAKSContainerservicesResponseBodyDataContainerServiceNamespaceScopedEntityEnvEntityEntity setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public GetAKSContainerservicesResponseBodyDataContainerServiceNamespaceScopedEntityEnvEntityEntity setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetAKSContainerservicesResponseBodyDataContainerServiceNamespaceScopedEntityEnvEntityEntity setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

    }

    public static class GetAKSContainerservicesResponseBodyDataContainerServiceNamespaceScopedEntityEnvEntity extends TeaModel {
        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RunEnv")
        public String runEnv;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        @NameInMap("Entity")
        public GetAKSContainerservicesResponseBodyDataContainerServiceNamespaceScopedEntityEnvEntityEntity entity;

        public static GetAKSContainerservicesResponseBodyDataContainerServiceNamespaceScopedEntityEnvEntity build(java.util.Map<String, ?> map) throws Exception {
            GetAKSContainerservicesResponseBodyDataContainerServiceNamespaceScopedEntityEnvEntity self = new GetAKSContainerservicesResponseBodyDataContainerServiceNamespaceScopedEntityEnvEntity();
            return TeaModel.build(map, self);
        }

        public GetAKSContainerservicesResponseBodyDataContainerServiceNamespaceScopedEntityEnvEntity setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetAKSContainerservicesResponseBodyDataContainerServiceNamespaceScopedEntityEnvEntity setRunEnv(String runEnv) {
            this.runEnv = runEnv;
            return this;
        }
        public String getRunEnv() {
            return this.runEnv;
        }

        public GetAKSContainerservicesResponseBodyDataContainerServiceNamespaceScopedEntityEnvEntity setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public GetAKSContainerservicesResponseBodyDataContainerServiceNamespaceScopedEntityEnvEntity setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public GetAKSContainerservicesResponseBodyDataContainerServiceNamespaceScopedEntityEnvEntity setEntity(GetAKSContainerservicesResponseBodyDataContainerServiceNamespaceScopedEntityEnvEntityEntity entity) {
            this.entity = entity;
            return this;
        }
        public GetAKSContainerservicesResponseBodyDataContainerServiceNamespaceScopedEntityEnvEntityEntity getEntity() {
            return this.entity;
        }

    }

    public static class GetAKSContainerservicesResponseBodyDataContainerServiceNamespaceScopedEntity extends TeaModel {
        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("Name")
        public String name;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("EnvEntity")
        public GetAKSContainerservicesResponseBodyDataContainerServiceNamespaceScopedEntityEnvEntity envEntity;

        public static GetAKSContainerservicesResponseBodyDataContainerServiceNamespaceScopedEntity build(java.util.Map<String, ?> map) throws Exception {
            GetAKSContainerservicesResponseBodyDataContainerServiceNamespaceScopedEntity self = new GetAKSContainerservicesResponseBodyDataContainerServiceNamespaceScopedEntity();
            return TeaModel.build(map, self);
        }

        public GetAKSContainerservicesResponseBodyDataContainerServiceNamespaceScopedEntity setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public GetAKSContainerservicesResponseBodyDataContainerServiceNamespaceScopedEntity setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetAKSContainerservicesResponseBodyDataContainerServiceNamespaceScopedEntity setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public GetAKSContainerservicesResponseBodyDataContainerServiceNamespaceScopedEntity setEnvEntity(GetAKSContainerservicesResponseBodyDataContainerServiceNamespaceScopedEntityEnvEntity envEntity) {
            this.envEntity = envEntity;
            return this;
        }
        public GetAKSContainerservicesResponseBodyDataContainerServiceNamespaceScopedEntityEnvEntity getEnvEntity() {
            return this.envEntity;
        }

    }

    public static class GetAKSContainerservicesResponseBodyDataContainerServicePodTemplateNamespaceScopedEntityEnvEntityEntity extends TeaModel {
        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("Id")
        public String id;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        public static GetAKSContainerservicesResponseBodyDataContainerServicePodTemplateNamespaceScopedEntityEnvEntityEntity build(java.util.Map<String, ?> map) throws Exception {
            GetAKSContainerservicesResponseBodyDataContainerServicePodTemplateNamespaceScopedEntityEnvEntityEntity self = new GetAKSContainerservicesResponseBodyDataContainerServicePodTemplateNamespaceScopedEntityEnvEntityEntity();
            return TeaModel.build(map, self);
        }

        public GetAKSContainerservicesResponseBodyDataContainerServicePodTemplateNamespaceScopedEntityEnvEntityEntity setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public GetAKSContainerservicesResponseBodyDataContainerServicePodTemplateNamespaceScopedEntityEnvEntityEntity setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetAKSContainerservicesResponseBodyDataContainerServicePodTemplateNamespaceScopedEntityEnvEntityEntity setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

    }

    public static class GetAKSContainerservicesResponseBodyDataContainerServicePodTemplateNamespaceScopedEntityEnvEntity extends TeaModel {
        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RunEnv")
        public String runEnv;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        @NameInMap("Entity")
        public GetAKSContainerservicesResponseBodyDataContainerServicePodTemplateNamespaceScopedEntityEnvEntityEntity entity;

        public static GetAKSContainerservicesResponseBodyDataContainerServicePodTemplateNamespaceScopedEntityEnvEntity build(java.util.Map<String, ?> map) throws Exception {
            GetAKSContainerservicesResponseBodyDataContainerServicePodTemplateNamespaceScopedEntityEnvEntity self = new GetAKSContainerservicesResponseBodyDataContainerServicePodTemplateNamespaceScopedEntityEnvEntity();
            return TeaModel.build(map, self);
        }

        public GetAKSContainerservicesResponseBodyDataContainerServicePodTemplateNamespaceScopedEntityEnvEntity setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetAKSContainerservicesResponseBodyDataContainerServicePodTemplateNamespaceScopedEntityEnvEntity setRunEnv(String runEnv) {
            this.runEnv = runEnv;
            return this;
        }
        public String getRunEnv() {
            return this.runEnv;
        }

        public GetAKSContainerservicesResponseBodyDataContainerServicePodTemplateNamespaceScopedEntityEnvEntity setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public GetAKSContainerservicesResponseBodyDataContainerServicePodTemplateNamespaceScopedEntityEnvEntity setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public GetAKSContainerservicesResponseBodyDataContainerServicePodTemplateNamespaceScopedEntityEnvEntity setEntity(GetAKSContainerservicesResponseBodyDataContainerServicePodTemplateNamespaceScopedEntityEnvEntityEntity entity) {
            this.entity = entity;
            return this;
        }
        public GetAKSContainerservicesResponseBodyDataContainerServicePodTemplateNamespaceScopedEntityEnvEntityEntity getEntity() {
            return this.entity;
        }

    }

    public static class GetAKSContainerservicesResponseBodyDataContainerServicePodTemplateNamespaceScopedEntity extends TeaModel {
        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("Name")
        public String name;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("EnvEntity")
        public GetAKSContainerservicesResponseBodyDataContainerServicePodTemplateNamespaceScopedEntityEnvEntity envEntity;

        public static GetAKSContainerservicesResponseBodyDataContainerServicePodTemplateNamespaceScopedEntity build(java.util.Map<String, ?> map) throws Exception {
            GetAKSContainerservicesResponseBodyDataContainerServicePodTemplateNamespaceScopedEntity self = new GetAKSContainerservicesResponseBodyDataContainerServicePodTemplateNamespaceScopedEntity();
            return TeaModel.build(map, self);
        }

        public GetAKSContainerservicesResponseBodyDataContainerServicePodTemplateNamespaceScopedEntity setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public GetAKSContainerservicesResponseBodyDataContainerServicePodTemplateNamespaceScopedEntity setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetAKSContainerservicesResponseBodyDataContainerServicePodTemplateNamespaceScopedEntity setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public GetAKSContainerservicesResponseBodyDataContainerServicePodTemplateNamespaceScopedEntity setEnvEntity(GetAKSContainerservicesResponseBodyDataContainerServicePodTemplateNamespaceScopedEntityEnvEntity envEntity) {
            this.envEntity = envEntity;
            return this;
        }
        public GetAKSContainerservicesResponseBodyDataContainerServicePodTemplateNamespaceScopedEntityEnvEntity getEnvEntity() {
            return this.envEntity;
        }

    }

    public static class GetAKSContainerservicesResponseBodyDataContainerServicePodTemplate extends TeaModel {
        @NameInMap("ContainerServiceId")
        public String containerServiceId;

        @NameInMap("DnsPolicy")
        public String dnsPolicy;

        @NameInMap("HostNameTemplate")
        public String hostNameTemplate;

        @NameInMap("UseHostNetwork")
        public Boolean useHostNetwork;

        @NameInMap("NamespaceScopedEntity")
        public GetAKSContainerservicesResponseBodyDataContainerServicePodTemplateNamespaceScopedEntity namespaceScopedEntity;

        public static GetAKSContainerservicesResponseBodyDataContainerServicePodTemplate build(java.util.Map<String, ?> map) throws Exception {
            GetAKSContainerservicesResponseBodyDataContainerServicePodTemplate self = new GetAKSContainerservicesResponseBodyDataContainerServicePodTemplate();
            return TeaModel.build(map, self);
        }

        public GetAKSContainerservicesResponseBodyDataContainerServicePodTemplate setContainerServiceId(String containerServiceId) {
            this.containerServiceId = containerServiceId;
            return this;
        }
        public String getContainerServiceId() {
            return this.containerServiceId;
        }

        public GetAKSContainerservicesResponseBodyDataContainerServicePodTemplate setDnsPolicy(String dnsPolicy) {
            this.dnsPolicy = dnsPolicy;
            return this;
        }
        public String getDnsPolicy() {
            return this.dnsPolicy;
        }

        public GetAKSContainerservicesResponseBodyDataContainerServicePodTemplate setHostNameTemplate(String hostNameTemplate) {
            this.hostNameTemplate = hostNameTemplate;
            return this;
        }
        public String getHostNameTemplate() {
            return this.hostNameTemplate;
        }

        public GetAKSContainerservicesResponseBodyDataContainerServicePodTemplate setUseHostNetwork(Boolean useHostNetwork) {
            this.useHostNetwork = useHostNetwork;
            return this;
        }
        public Boolean getUseHostNetwork() {
            return this.useHostNetwork;
        }

        public GetAKSContainerservicesResponseBodyDataContainerServicePodTemplate setNamespaceScopedEntity(GetAKSContainerservicesResponseBodyDataContainerServicePodTemplateNamespaceScopedEntity namespaceScopedEntity) {
            this.namespaceScopedEntity = namespaceScopedEntity;
            return this;
        }
        public GetAKSContainerservicesResponseBodyDataContainerServicePodTemplateNamespaceScopedEntity getNamespaceScopedEntity() {
            return this.namespaceScopedEntity;
        }

    }

    public static class GetAKSContainerservicesResponseBodyDataContainerService extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("AppSvcId")
        public String appSvcId;

        @NameInMap("AppSvcName")
        public String appSvcName;

        @NameInMap("ContainerServiceType")
        public String containerServiceType;

        @NameInMap("Description")
        public String description;

        @NameInMap("DraftedRevision")
        public String draftedRevision;

        @NameInMap("DraftedTime")
        public String draftedTime;

        @NameInMap("EnableBizMonitor")
        public Boolean enableBizMonitor;

        @NameInMap("EnableMesh")
        public Boolean enableMesh;

        @NameInMap("EnableSofaMesh")
        public Boolean enableSofaMesh;

        @NameInMap("OperatorId")
        public String operatorId;

        @NameInMap("OperatorName")
        public String operatorName;

        @NameInMap("RuntimeRevision")
        public String runtimeRevision;

        @NameInMap("UseHostNetwork")
        public Boolean useHostNetwork;

        @NameInMap("LogConfigs")
        public java.util.List<GetAKSContainerservicesResponseBodyDataContainerServiceLogConfigs> logConfigs;

        @NameInMap("LifecycleState")
        public GetAKSContainerservicesResponseBodyDataContainerServiceLifecycleState lifecycleState;

        @NameInMap("NamespaceScopedEntity")
        public GetAKSContainerservicesResponseBodyDataContainerServiceNamespaceScopedEntity namespaceScopedEntity;

        @NameInMap("PodTemplate")
        public GetAKSContainerservicesResponseBodyDataContainerServicePodTemplate podTemplate;

        public static GetAKSContainerservicesResponseBodyDataContainerService build(java.util.Map<String, ?> map) throws Exception {
            GetAKSContainerservicesResponseBodyDataContainerService self = new GetAKSContainerservicesResponseBodyDataContainerService();
            return TeaModel.build(map, self);
        }

        public GetAKSContainerservicesResponseBodyDataContainerService setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetAKSContainerservicesResponseBodyDataContainerService setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public GetAKSContainerservicesResponseBodyDataContainerService setAppSvcId(String appSvcId) {
            this.appSvcId = appSvcId;
            return this;
        }
        public String getAppSvcId() {
            return this.appSvcId;
        }

        public GetAKSContainerservicesResponseBodyDataContainerService setAppSvcName(String appSvcName) {
            this.appSvcName = appSvcName;
            return this;
        }
        public String getAppSvcName() {
            return this.appSvcName;
        }

        public GetAKSContainerservicesResponseBodyDataContainerService setContainerServiceType(String containerServiceType) {
            this.containerServiceType = containerServiceType;
            return this;
        }
        public String getContainerServiceType() {
            return this.containerServiceType;
        }

        public GetAKSContainerservicesResponseBodyDataContainerService setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetAKSContainerservicesResponseBodyDataContainerService setDraftedRevision(String draftedRevision) {
            this.draftedRevision = draftedRevision;
            return this;
        }
        public String getDraftedRevision() {
            return this.draftedRevision;
        }

        public GetAKSContainerservicesResponseBodyDataContainerService setDraftedTime(String draftedTime) {
            this.draftedTime = draftedTime;
            return this;
        }
        public String getDraftedTime() {
            return this.draftedTime;
        }

        public GetAKSContainerservicesResponseBodyDataContainerService setEnableBizMonitor(Boolean enableBizMonitor) {
            this.enableBizMonitor = enableBizMonitor;
            return this;
        }
        public Boolean getEnableBizMonitor() {
            return this.enableBizMonitor;
        }

        public GetAKSContainerservicesResponseBodyDataContainerService setEnableMesh(Boolean enableMesh) {
            this.enableMesh = enableMesh;
            return this;
        }
        public Boolean getEnableMesh() {
            return this.enableMesh;
        }

        public GetAKSContainerservicesResponseBodyDataContainerService setEnableSofaMesh(Boolean enableSofaMesh) {
            this.enableSofaMesh = enableSofaMesh;
            return this;
        }
        public Boolean getEnableSofaMesh() {
            return this.enableSofaMesh;
        }

        public GetAKSContainerservicesResponseBodyDataContainerService setOperatorId(String operatorId) {
            this.operatorId = operatorId;
            return this;
        }
        public String getOperatorId() {
            return this.operatorId;
        }

        public GetAKSContainerservicesResponseBodyDataContainerService setOperatorName(String operatorName) {
            this.operatorName = operatorName;
            return this;
        }
        public String getOperatorName() {
            return this.operatorName;
        }

        public GetAKSContainerservicesResponseBodyDataContainerService setRuntimeRevision(String runtimeRevision) {
            this.runtimeRevision = runtimeRevision;
            return this;
        }
        public String getRuntimeRevision() {
            return this.runtimeRevision;
        }

        public GetAKSContainerservicesResponseBodyDataContainerService setUseHostNetwork(Boolean useHostNetwork) {
            this.useHostNetwork = useHostNetwork;
            return this;
        }
        public Boolean getUseHostNetwork() {
            return this.useHostNetwork;
        }

        public GetAKSContainerservicesResponseBodyDataContainerService setLogConfigs(java.util.List<GetAKSContainerservicesResponseBodyDataContainerServiceLogConfigs> logConfigs) {
            this.logConfigs = logConfigs;
            return this;
        }
        public java.util.List<GetAKSContainerservicesResponseBodyDataContainerServiceLogConfigs> getLogConfigs() {
            return this.logConfigs;
        }

        public GetAKSContainerservicesResponseBodyDataContainerService setLifecycleState(GetAKSContainerservicesResponseBodyDataContainerServiceLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }
        public GetAKSContainerservicesResponseBodyDataContainerServiceLifecycleState getLifecycleState() {
            return this.lifecycleState;
        }

        public GetAKSContainerservicesResponseBodyDataContainerService setNamespaceScopedEntity(GetAKSContainerservicesResponseBodyDataContainerServiceNamespaceScopedEntity namespaceScopedEntity) {
            this.namespaceScopedEntity = namespaceScopedEntity;
            return this;
        }
        public GetAKSContainerservicesResponseBodyDataContainerServiceNamespaceScopedEntity getNamespaceScopedEntity() {
            return this.namespaceScopedEntity;
        }

        public GetAKSContainerservicesResponseBodyDataContainerService setPodTemplate(GetAKSContainerservicesResponseBodyDataContainerServicePodTemplate podTemplate) {
            this.podTemplate = podTemplate;
            return this;
        }
        public GetAKSContainerservicesResponseBodyDataContainerServicePodTemplate getPodTemplate() {
            return this.podTemplate;
        }

    }

    public static class GetAKSContainerservicesResponseBodyDataImageSourceBaseImage extends TeaModel {
        @NameInMap("Digest")
        public String digest;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("Repository")
        public String repository;

        @NameInMap("Tag")
        public String tag;

        public static GetAKSContainerservicesResponseBodyDataImageSourceBaseImage build(java.util.Map<String, ?> map) throws Exception {
            GetAKSContainerservicesResponseBodyDataImageSourceBaseImage self = new GetAKSContainerservicesResponseBodyDataImageSourceBaseImage();
            return TeaModel.build(map, self);
        }

        public GetAKSContainerservicesResponseBodyDataImageSourceBaseImage setDigest(String digest) {
            this.digest = digest;
            return this;
        }
        public String getDigest() {
            return this.digest;
        }

        public GetAKSContainerservicesResponseBodyDataImageSourceBaseImage setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public GetAKSContainerservicesResponseBodyDataImageSourceBaseImage setRepository(String repository) {
            this.repository = repository;
            return this;
        }
        public String getRepository() {
            return this.repository;
        }

        public GetAKSContainerservicesResponseBodyDataImageSourceBaseImage setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

    }

    public static class GetAKSContainerservicesResponseBodyDataImageSourceBinaryRemotePath extends TeaModel {
        @NameInMap("Endpoint")
        public String endpoint;

        @NameInMap("FileName")
        public String fileName;

        @NameInMap("Path")
        public String path;

        public static GetAKSContainerservicesResponseBodyDataImageSourceBinaryRemotePath build(java.util.Map<String, ?> map) throws Exception {
            GetAKSContainerservicesResponseBodyDataImageSourceBinaryRemotePath self = new GetAKSContainerservicesResponseBodyDataImageSourceBinaryRemotePath();
            return TeaModel.build(map, self);
        }

        public GetAKSContainerservicesResponseBodyDataImageSourceBinaryRemotePath setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public GetAKSContainerservicesResponseBodyDataImageSourceBinaryRemotePath setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public GetAKSContainerservicesResponseBodyDataImageSourceBinaryRemotePath setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

    public static class GetAKSContainerservicesResponseBodyDataImageSourceBuiltImage extends TeaModel {
        @NameInMap("Digest")
        public String digest;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("Repository")
        public String repository;

        @NameInMap("Tag")
        public String tag;

        public static GetAKSContainerservicesResponseBodyDataImageSourceBuiltImage build(java.util.Map<String, ?> map) throws Exception {
            GetAKSContainerservicesResponseBodyDataImageSourceBuiltImage self = new GetAKSContainerservicesResponseBodyDataImageSourceBuiltImage();
            return TeaModel.build(map, self);
        }

        public GetAKSContainerservicesResponseBodyDataImageSourceBuiltImage setDigest(String digest) {
            this.digest = digest;
            return this;
        }
        public String getDigest() {
            return this.digest;
        }

        public GetAKSContainerservicesResponseBodyDataImageSourceBuiltImage setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public GetAKSContainerservicesResponseBodyDataImageSourceBuiltImage setRepository(String repository) {
            this.repository = repository;
            return this;
        }
        public String getRepository() {
            return this.repository;
        }

        public GetAKSContainerservicesResponseBodyDataImageSourceBuiltImage setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

    }

    public static class GetAKSContainerservicesResponseBodyDataImageSourceCurrentImage extends TeaModel {
        @NameInMap("Digest")
        public String digest;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("Repository")
        public String repository;

        @NameInMap("Tag")
        public String tag;

        public static GetAKSContainerservicesResponseBodyDataImageSourceCurrentImage build(java.util.Map<String, ?> map) throws Exception {
            GetAKSContainerservicesResponseBodyDataImageSourceCurrentImage self = new GetAKSContainerservicesResponseBodyDataImageSourceCurrentImage();
            return TeaModel.build(map, self);
        }

        public GetAKSContainerservicesResponseBodyDataImageSourceCurrentImage setDigest(String digest) {
            this.digest = digest;
            return this;
        }
        public String getDigest() {
            return this.digest;
        }

        public GetAKSContainerservicesResponseBodyDataImageSourceCurrentImage setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public GetAKSContainerservicesResponseBodyDataImageSourceCurrentImage setRepository(String repository) {
            this.repository = repository;
            return this;
        }
        public String getRepository() {
            return this.repository;
        }

        public GetAKSContainerservicesResponseBodyDataImageSourceCurrentImage setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

    }

    public static class GetAKSContainerservicesResponseBodyDataImageSource extends TeaModel {
        @NameInMap("AppBuildId")
        public String appBuildId;

        @NameInMap("BinaryLocalPath")
        public String binaryLocalPath;

        @NameInMap("Branch")
        public String branch;

        @NameInMap("BuildNumber")
        public Long buildNumber;

        @NameInMap("PullSecret")
        public String pullSecret;

        @NameInMap("Revision")
        public String revision;

        @NameInMap("SourceType")
        public String sourceType;

        @NameInMap("TechStackName")
        public String techStackName;

        @NameInMap("TechStackVersionImage")
        public String techStackVersionImage;

        @NameInMap("TechStackVersionName")
        public String techStackVersionName;

        @NameInMap("TechStackVersionNumber")
        public String techStackVersionNumber;

        @NameInMap("BaseImage")
        public GetAKSContainerservicesResponseBodyDataImageSourceBaseImage baseImage;

        @NameInMap("BinaryRemotePath")
        public GetAKSContainerservicesResponseBodyDataImageSourceBinaryRemotePath binaryRemotePath;

        @NameInMap("BuiltImage")
        public GetAKSContainerservicesResponseBodyDataImageSourceBuiltImage builtImage;

        @NameInMap("CurrentImage")
        public GetAKSContainerservicesResponseBodyDataImageSourceCurrentImage currentImage;

        public static GetAKSContainerservicesResponseBodyDataImageSource build(java.util.Map<String, ?> map) throws Exception {
            GetAKSContainerservicesResponseBodyDataImageSource self = new GetAKSContainerservicesResponseBodyDataImageSource();
            return TeaModel.build(map, self);
        }

        public GetAKSContainerservicesResponseBodyDataImageSource setAppBuildId(String appBuildId) {
            this.appBuildId = appBuildId;
            return this;
        }
        public String getAppBuildId() {
            return this.appBuildId;
        }

        public GetAKSContainerservicesResponseBodyDataImageSource setBinaryLocalPath(String binaryLocalPath) {
            this.binaryLocalPath = binaryLocalPath;
            return this;
        }
        public String getBinaryLocalPath() {
            return this.binaryLocalPath;
        }

        public GetAKSContainerservicesResponseBodyDataImageSource setBranch(String branch) {
            this.branch = branch;
            return this;
        }
        public String getBranch() {
            return this.branch;
        }

        public GetAKSContainerservicesResponseBodyDataImageSource setBuildNumber(Long buildNumber) {
            this.buildNumber = buildNumber;
            return this;
        }
        public Long getBuildNumber() {
            return this.buildNumber;
        }

        public GetAKSContainerservicesResponseBodyDataImageSource setPullSecret(String pullSecret) {
            this.pullSecret = pullSecret;
            return this;
        }
        public String getPullSecret() {
            return this.pullSecret;
        }

        public GetAKSContainerservicesResponseBodyDataImageSource setRevision(String revision) {
            this.revision = revision;
            return this;
        }
        public String getRevision() {
            return this.revision;
        }

        public GetAKSContainerservicesResponseBodyDataImageSource setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public GetAKSContainerservicesResponseBodyDataImageSource setTechStackName(String techStackName) {
            this.techStackName = techStackName;
            return this;
        }
        public String getTechStackName() {
            return this.techStackName;
        }

        public GetAKSContainerservicesResponseBodyDataImageSource setTechStackVersionImage(String techStackVersionImage) {
            this.techStackVersionImage = techStackVersionImage;
            return this;
        }
        public String getTechStackVersionImage() {
            return this.techStackVersionImage;
        }

        public GetAKSContainerservicesResponseBodyDataImageSource setTechStackVersionName(String techStackVersionName) {
            this.techStackVersionName = techStackVersionName;
            return this;
        }
        public String getTechStackVersionName() {
            return this.techStackVersionName;
        }

        public GetAKSContainerservicesResponseBodyDataImageSource setTechStackVersionNumber(String techStackVersionNumber) {
            this.techStackVersionNumber = techStackVersionNumber;
            return this;
        }
        public String getTechStackVersionNumber() {
            return this.techStackVersionNumber;
        }

        public GetAKSContainerservicesResponseBodyDataImageSource setBaseImage(GetAKSContainerservicesResponseBodyDataImageSourceBaseImage baseImage) {
            this.baseImage = baseImage;
            return this;
        }
        public GetAKSContainerservicesResponseBodyDataImageSourceBaseImage getBaseImage() {
            return this.baseImage;
        }

        public GetAKSContainerservicesResponseBodyDataImageSource setBinaryRemotePath(GetAKSContainerservicesResponseBodyDataImageSourceBinaryRemotePath binaryRemotePath) {
            this.binaryRemotePath = binaryRemotePath;
            return this;
        }
        public GetAKSContainerservicesResponseBodyDataImageSourceBinaryRemotePath getBinaryRemotePath() {
            return this.binaryRemotePath;
        }

        public GetAKSContainerservicesResponseBodyDataImageSource setBuiltImage(GetAKSContainerservicesResponseBodyDataImageSourceBuiltImage builtImage) {
            this.builtImage = builtImage;
            return this;
        }
        public GetAKSContainerservicesResponseBodyDataImageSourceBuiltImage getBuiltImage() {
            return this.builtImage;
        }

        public GetAKSContainerservicesResponseBodyDataImageSource setCurrentImage(GetAKSContainerservicesResponseBodyDataImageSourceCurrentImage currentImage) {
            this.currentImage = currentImage;
            return this;
        }
        public GetAKSContainerservicesResponseBodyDataImageSourceCurrentImage getCurrentImage() {
            return this.currentImage;
        }

    }

    public static class GetAKSContainerservicesResponseBodyData extends TeaModel {
        @NameInMap("DisplayedRevision")
        public String displayedRevision;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("PodCount")
        public Long podCount;

        @NameInMap("ProcessingPodCount")
        public Long processingPodCount;

        @NameInMap("Replicas")
        public Long replicas;

        @NameInMap("RunningPodCount")
        public Long runningPodCount;

        @NameInMap("ContainerService")
        public GetAKSContainerservicesResponseBodyDataContainerService containerService;

        @NameInMap("ImageSource")
        public GetAKSContainerservicesResponseBodyDataImageSource imageSource;

        public static GetAKSContainerservicesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAKSContainerservicesResponseBodyData self = new GetAKSContainerservicesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAKSContainerservicesResponseBodyData setDisplayedRevision(String displayedRevision) {
            this.displayedRevision = displayedRevision;
            return this;
        }
        public String getDisplayedRevision() {
            return this.displayedRevision;
        }

        public GetAKSContainerservicesResponseBodyData setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetAKSContainerservicesResponseBodyData setPodCount(Long podCount) {
            this.podCount = podCount;
            return this;
        }
        public Long getPodCount() {
            return this.podCount;
        }

        public GetAKSContainerservicesResponseBodyData setProcessingPodCount(Long processingPodCount) {
            this.processingPodCount = processingPodCount;
            return this;
        }
        public Long getProcessingPodCount() {
            return this.processingPodCount;
        }

        public GetAKSContainerservicesResponseBodyData setReplicas(Long replicas) {
            this.replicas = replicas;
            return this;
        }
        public Long getReplicas() {
            return this.replicas;
        }

        public GetAKSContainerservicesResponseBodyData setRunningPodCount(Long runningPodCount) {
            this.runningPodCount = runningPodCount;
            return this;
        }
        public Long getRunningPodCount() {
            return this.runningPodCount;
        }

        public GetAKSContainerservicesResponseBodyData setContainerService(GetAKSContainerservicesResponseBodyDataContainerService containerService) {
            this.containerService = containerService;
            return this;
        }
        public GetAKSContainerservicesResponseBodyDataContainerService getContainerService() {
            return this.containerService;
        }

        public GetAKSContainerservicesResponseBodyData setImageSource(GetAKSContainerservicesResponseBodyDataImageSource imageSource) {
            this.imageSource = imageSource;
            return this;
        }
        public GetAKSContainerservicesResponseBodyDataImageSource getImageSource() {
            return this.imageSource;
        }

    }

}
