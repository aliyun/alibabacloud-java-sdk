// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLDCContainerServiceRevisionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Revision")
    public GetLDCContainerServiceRevisionResponseBodyRevision revision;

    public static GetLDCContainerServiceRevisionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLDCContainerServiceRevisionResponseBody self = new GetLDCContainerServiceRevisionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLDCContainerServiceRevisionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLDCContainerServiceRevisionResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLDCContainerServiceRevisionResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLDCContainerServiceRevisionResponseBody setRevision(GetLDCContainerServiceRevisionResponseBodyRevision revision) {
        this.revision = revision;
        return this;
    }
    public GetLDCContainerServiceRevisionResponseBodyRevision getRevision() {
        return this.revision;
    }

    public static class GetLDCContainerServiceRevisionResponseBodyRevisionAppInfo extends TeaModel {
        @NameInMap("BuildpackVersion")
        public String buildpackVersion;

        @NameInMap("Description")
        public String description;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("OwnerId")
        public String ownerId;

        @NameInMap("TechstackIdentity")
        public String techstackIdentity;

        public static GetLDCContainerServiceRevisionResponseBodyRevisionAppInfo build(java.util.Map<String, ?> map) throws Exception {
            GetLDCContainerServiceRevisionResponseBodyRevisionAppInfo self = new GetLDCContainerServiceRevisionResponseBodyRevisionAppInfo();
            return TeaModel.build(map, self);
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionAppInfo setBuildpackVersion(String buildpackVersion) {
            this.buildpackVersion = buildpackVersion;
            return this;
        }
        public String getBuildpackVersion() {
            return this.buildpackVersion;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionAppInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionAppInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionAppInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionAppInfo setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionAppInfo setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionAppInfo setTechstackIdentity(String techstackIdentity) {
            this.techstackIdentity = techstackIdentity;
            return this;
        }
        public String getTechstackIdentity() {
            return this.techstackIdentity;
        }

    }

    public static class GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigClusterIpServicesPorts extends TeaModel {
        @NameInMap("Port")
        public Long port;

        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("TargetPort")
        public Long targetPort;

        public static GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigClusterIpServicesPorts build(java.util.Map<String, ?> map) throws Exception {
            GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigClusterIpServicesPorts self = new GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigClusterIpServicesPorts();
            return TeaModel.build(map, self);
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigClusterIpServicesPorts setPort(Long port) {
            this.port = port;
            return this;
        }
        public Long getPort() {
            return this.port;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigClusterIpServicesPorts setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigClusterIpServicesPorts setTargetPort(Long targetPort) {
            this.targetPort = targetPort;
            return this;
        }
        public Long getTargetPort() {
            return this.targetPort;
        }

    }

    public static class GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigClusterIpServices extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Ports")
        public java.util.List<GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigClusterIpServicesPorts> ports;

        public static GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigClusterIpServices build(java.util.Map<String, ?> map) throws Exception {
            GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigClusterIpServices self = new GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigClusterIpServices();
            return TeaModel.build(map, self);
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigClusterIpServices setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigClusterIpServices setPorts(java.util.List<GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigClusterIpServicesPorts> ports) {
            this.ports = ports;
            return this;
        }
        public java.util.List<GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigClusterIpServicesPorts> getPorts() {
            return this.ports;
        }

    }

    public static class GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsEnvsValueFrom extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("ObjectName")
        public String objectName;

        @NameInMap("ObjectType")
        public String objectType;

        public static GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsEnvsValueFrom build(java.util.Map<String, ?> map) throws Exception {
            GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsEnvsValueFrom self = new GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsEnvsValueFrom();
            return TeaModel.build(map, self);
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsEnvsValueFrom setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsEnvsValueFrom setObjectName(String objectName) {
            this.objectName = objectName;
            return this;
        }
        public String getObjectName() {
            return this.objectName;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsEnvsValueFrom setObjectType(String objectType) {
            this.objectType = objectType;
            return this;
        }
        public String getObjectType() {
            return this.objectType;
        }

    }

    public static class GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsEnvs extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public String value;

        @NameInMap("ValueFrom")
        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsEnvsValueFrom valueFrom;

        public static GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsEnvs build(java.util.Map<String, ?> map) throws Exception {
            GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsEnvs self = new GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsEnvs();
            return TeaModel.build(map, self);
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsEnvs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsEnvs setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsEnvs setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsEnvs setValueFrom(GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsEnvsValueFrom valueFrom) {
            this.valueFrom = valueFrom;
            return this;
        }
        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsEnvsValueFrom getValueFrom() {
            return this.valueFrom;
        }

    }

    public static class GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsEnvOverrides extends TeaModel {
        @NameInMap("Cell")
        public String cell;

        @NameInMap("Name")
        public String name;

        @NameInMap("Value")
        public String value;

        public static GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsEnvOverrides build(java.util.Map<String, ?> map) throws Exception {
            GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsEnvOverrides self = new GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsEnvOverrides();
            return TeaModel.build(map, self);
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsEnvOverrides setCell(String cell) {
            this.cell = cell;
            return this;
        }
        public String getCell() {
            return this.cell;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsEnvOverrides setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsEnvOverrides setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLogConfigs extends TeaModel {
        @NameInMap("ConfigName")
        public String configName;

        @NameInMap("InputType")
        public String inputType;

        @NameInMap("LogstoreName")
        public String logstoreName;

        @NameInMap("LogPath")
        public String logPath;

        public static GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLogConfigs build(java.util.Map<String, ?> map) throws Exception {
            GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLogConfigs self = new GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLogConfigs();
            return TeaModel.build(map, self);
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLogConfigs setConfigName(String configName) {
            this.configName = configName;
            return this;
        }
        public String getConfigName() {
            return this.configName;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLogConfigs setInputType(String inputType) {
            this.inputType = inputType;
            return this;
        }
        public String getInputType() {
            return this.inputType;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLogConfigs setLogstoreName(String logstoreName) {
            this.logstoreName = logstoreName;
            return this;
        }
        public String getLogstoreName() {
            return this.logstoreName;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLogConfigs setLogPath(String logPath) {
            this.logPath = logPath;
            return this;
        }
        public String getLogPath() {
            return this.logPath;
        }

    }

    public static class GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMountsConfigmapSecretVolumeSource extends TeaModel {
        @NameInMap("VolumeRefName")
        public String volumeRefName;

        public static GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMountsConfigmapSecretVolumeSource build(java.util.Map<String, ?> map) throws Exception {
            GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMountsConfigmapSecretVolumeSource self = new GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMountsConfigmapSecretVolumeSource();
            return TeaModel.build(map, self);
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMountsConfigmapSecretVolumeSource setVolumeRefName(String volumeRefName) {
            this.volumeRefName = volumeRefName;
            return this;
        }
        public String getVolumeRefName() {
            return this.volumeRefName;
        }

    }

    public static class GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMountsEmptyDirVolumeSource extends TeaModel {
        @NameInMap("Medium")
        public String medium;

        @NameInMap("Name")
        public String name;

        @NameInMap("SizeLimit")
        public String sizeLimit;

        public static GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMountsEmptyDirVolumeSource build(java.util.Map<String, ?> map) throws Exception {
            GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMountsEmptyDirVolumeSource self = new GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMountsEmptyDirVolumeSource();
            return TeaModel.build(map, self);
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMountsEmptyDirVolumeSource setMedium(String medium) {
            this.medium = medium;
            return this;
        }
        public String getMedium() {
            return this.medium;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMountsEmptyDirVolumeSource setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMountsEmptyDirVolumeSource setSizeLimit(String sizeLimit) {
            this.sizeLimit = sizeLimit;
            return this;
        }
        public String getSizeLimit() {
            return this.sizeLimit;
        }

    }

    public static class GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMountsLocalDiskVolumeSource extends TeaModel {
        @NameInMap("CreateIfNotPresent")
        public Boolean createIfNotPresent;

        @NameInMap("HostDirectoryPath")
        public String hostDirectoryPath;

        public static GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMountsLocalDiskVolumeSource build(java.util.Map<String, ?> map) throws Exception {
            GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMountsLocalDiskVolumeSource self = new GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMountsLocalDiskVolumeSource();
            return TeaModel.build(map, self);
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMountsLocalDiskVolumeSource setCreateIfNotPresent(Boolean createIfNotPresent) {
            this.createIfNotPresent = createIfNotPresent;
            return this;
        }
        public Boolean getCreateIfNotPresent() {
            return this.createIfNotPresent;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMountsLocalDiskVolumeSource setHostDirectoryPath(String hostDirectoryPath) {
            this.hostDirectoryPath = hostDirectoryPath;
            return this;
        }
        public String getHostDirectoryPath() {
            return this.hostDirectoryPath;
        }

    }

    public static class GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMountsPvcSource extends TeaModel {
        @NameInMap("PvcName")
        public String pvcName;

        public static GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMountsPvcSource build(java.util.Map<String, ?> map) throws Exception {
            GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMountsPvcSource self = new GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMountsPvcSource();
            return TeaModel.build(map, self);
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMountsPvcSource setPvcName(String pvcName) {
            this.pvcName = pvcName;
            return this;
        }
        public String getPvcName() {
            return this.pvcName;
        }

    }

    public static class GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMounts extends TeaModel {
        @NameInMap("MountPath")
        public String mountPath;

        @NameInMap("Name")
        public String name;

        @NameInMap("ReadOnly")
        public Boolean readOnly;

        @NameInMap("SubPath")
        public String subPath;

        @NameInMap("VolumeSourceCategoryType")
        public String volumeSourceCategoryType;

        @NameInMap("ConfigmapSecretVolumeSource")
        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMountsConfigmapSecretVolumeSource configmapSecretVolumeSource;

        @NameInMap("EmptyDirVolumeSource")
        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMountsEmptyDirVolumeSource emptyDirVolumeSource;

        @NameInMap("LocalDiskVolumeSource")
        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMountsLocalDiskVolumeSource localDiskVolumeSource;

        @NameInMap("PvcSource")
        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMountsPvcSource pvcSource;

        public static GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMounts build(java.util.Map<String, ?> map) throws Exception {
            GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMounts self = new GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMounts();
            return TeaModel.build(map, self);
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMounts setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMounts setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMounts setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMounts setSubPath(String subPath) {
            this.subPath = subPath;
            return this;
        }
        public String getSubPath() {
            return this.subPath;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMounts setVolumeSourceCategoryType(String volumeSourceCategoryType) {
            this.volumeSourceCategoryType = volumeSourceCategoryType;
            return this;
        }
        public String getVolumeSourceCategoryType() {
            return this.volumeSourceCategoryType;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMounts setConfigmapSecretVolumeSource(GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMountsConfigmapSecretVolumeSource configmapSecretVolumeSource) {
            this.configmapSecretVolumeSource = configmapSecretVolumeSource;
            return this;
        }
        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMountsConfigmapSecretVolumeSource getConfigmapSecretVolumeSource() {
            return this.configmapSecretVolumeSource;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMounts setEmptyDirVolumeSource(GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMountsEmptyDirVolumeSource emptyDirVolumeSource) {
            this.emptyDirVolumeSource = emptyDirVolumeSource;
            return this;
        }
        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMountsEmptyDirVolumeSource getEmptyDirVolumeSource() {
            return this.emptyDirVolumeSource;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMounts setLocalDiskVolumeSource(GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMountsLocalDiskVolumeSource localDiskVolumeSource) {
            this.localDiskVolumeSource = localDiskVolumeSource;
            return this;
        }
        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMountsLocalDiskVolumeSource getLocalDiskVolumeSource() {
            return this.localDiskVolumeSource;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMounts setPvcSource(GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMountsPvcSource pvcSource) {
            this.pvcSource = pvcSource;
            return this;
        }
        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMountsPvcSource getPvcSource() {
            return this.pvcSource;
        }

    }

    public static class GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbeExecAction extends TeaModel {
        @NameInMap("Command")
        public String command;

        public static GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbeExecAction build(java.util.Map<String, ?> map) throws Exception {
            GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbeExecAction self = new GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbeExecAction();
            return TeaModel.build(map, self);
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbeExecAction setCommand(String command) {
            this.command = command;
            return this;
        }
        public String getCommand() {
            return this.command;
        }

    }

    public static class GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbeHttpGetAction extends TeaModel {
        @NameInMap("Path")
        public String path;

        @NameInMap("Port")
        public String port;

        @NameInMap("Scheme")
        public String scheme;

        public static GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbeHttpGetAction build(java.util.Map<String, ?> map) throws Exception {
            GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbeHttpGetAction self = new GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbeHttpGetAction();
            return TeaModel.build(map, self);
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbeHttpGetAction setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbeHttpGetAction setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbeHttpGetAction setScheme(String scheme) {
            this.scheme = scheme;
            return this;
        }
        public String getScheme() {
            return this.scheme;
        }

    }

    public static class GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbeTcpSocketAction extends TeaModel {
        @NameInMap("Port")
        public String port;

        public static GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbeTcpSocketAction build(java.util.Map<String, ?> map) throws Exception {
            GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbeTcpSocketAction self = new GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbeTcpSocketAction();
            return TeaModel.build(map, self);
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbeTcpSocketAction setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

    }

    public static class GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbe extends TeaModel {
        @NameInMap("FailureThreshold")
        public Long failureThreshold;

        @NameInMap("InitialDelaySeconds")
        public Long initialDelaySeconds;

        @NameInMap("PeriodSeconds")
        public Long periodSeconds;

        @NameInMap("SuccessThreshold")
        public Long successThreshold;

        @NameInMap("TimeOutSeconds")
        public Long timeOutSeconds;

        @NameInMap("ExecAction")
        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbeExecAction execAction;

        @NameInMap("HttpGetAction")
        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbeHttpGetAction httpGetAction;

        @NameInMap("TcpSocketAction")
        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbeTcpSocketAction tcpSocketAction;

        public static GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbe build(java.util.Map<String, ?> map) throws Exception {
            GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbe self = new GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbe();
            return TeaModel.build(map, self);
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbe setFailureThreshold(Long failureThreshold) {
            this.failureThreshold = failureThreshold;
            return this;
        }
        public Long getFailureThreshold() {
            return this.failureThreshold;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbe setInitialDelaySeconds(Long initialDelaySeconds) {
            this.initialDelaySeconds = initialDelaySeconds;
            return this;
        }
        public Long getInitialDelaySeconds() {
            return this.initialDelaySeconds;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbe setPeriodSeconds(Long periodSeconds) {
            this.periodSeconds = periodSeconds;
            return this;
        }
        public Long getPeriodSeconds() {
            return this.periodSeconds;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbe setSuccessThreshold(Long successThreshold) {
            this.successThreshold = successThreshold;
            return this;
        }
        public Long getSuccessThreshold() {
            return this.successThreshold;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbe setTimeOutSeconds(Long timeOutSeconds) {
            this.timeOutSeconds = timeOutSeconds;
            return this;
        }
        public Long getTimeOutSeconds() {
            return this.timeOutSeconds;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbe setExecAction(GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbeExecAction execAction) {
            this.execAction = execAction;
            return this;
        }
        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbeExecAction getExecAction() {
            return this.execAction;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbe setHttpGetAction(GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbeHttpGetAction httpGetAction) {
            this.httpGetAction = httpGetAction;
            return this;
        }
        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbeHttpGetAction getHttpGetAction() {
            return this.httpGetAction;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbe setTcpSocketAction(GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbeTcpSocketAction tcpSocketAction) {
            this.tcpSocketAction = tcpSocketAction;
            return this;
        }
        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbeTcpSocketAction getTcpSocketAction() {
            return this.tcpSocketAction;
        }

    }

    public static class GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbeExecAction extends TeaModel {
        @NameInMap("Command")
        public String command;

        public static GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbeExecAction build(java.util.Map<String, ?> map) throws Exception {
            GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbeExecAction self = new GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbeExecAction();
            return TeaModel.build(map, self);
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbeExecAction setCommand(String command) {
            this.command = command;
            return this;
        }
        public String getCommand() {
            return this.command;
        }

    }

    public static class GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbeHttpGetAction extends TeaModel {
        @NameInMap("Path")
        public String path;

        @NameInMap("Port")
        public String port;

        @NameInMap("Scheme")
        public String scheme;

        public static GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbeHttpGetAction build(java.util.Map<String, ?> map) throws Exception {
            GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbeHttpGetAction self = new GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbeHttpGetAction();
            return TeaModel.build(map, self);
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbeHttpGetAction setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbeHttpGetAction setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbeHttpGetAction setScheme(String scheme) {
            this.scheme = scheme;
            return this;
        }
        public String getScheme() {
            return this.scheme;
        }

    }

    public static class GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbeTcpSocketAction extends TeaModel {
        @NameInMap("Port")
        public String port;

        public static GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbeTcpSocketAction build(java.util.Map<String, ?> map) throws Exception {
            GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbeTcpSocketAction self = new GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbeTcpSocketAction();
            return TeaModel.build(map, self);
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbeTcpSocketAction setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

    }

    public static class GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbe extends TeaModel {
        @NameInMap("FailureThreshold")
        public Long failureThreshold;

        @NameInMap("InitialDelaySeconds")
        public Long initialDelaySeconds;

        @NameInMap("PeriodSeconds")
        public Long periodSeconds;

        @NameInMap("SuccessThreshold")
        public Long successThreshold;

        @NameInMap("TimeOutSeconds")
        public Long timeOutSeconds;

        @NameInMap("ExecAction")
        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbeExecAction execAction;

        @NameInMap("HttpGetAction")
        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbeHttpGetAction httpGetAction;

        @NameInMap("TcpSocketAction")
        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbeTcpSocketAction tcpSocketAction;

        public static GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbe build(java.util.Map<String, ?> map) throws Exception {
            GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbe self = new GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbe();
            return TeaModel.build(map, self);
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbe setFailureThreshold(Long failureThreshold) {
            this.failureThreshold = failureThreshold;
            return this;
        }
        public Long getFailureThreshold() {
            return this.failureThreshold;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbe setInitialDelaySeconds(Long initialDelaySeconds) {
            this.initialDelaySeconds = initialDelaySeconds;
            return this;
        }
        public Long getInitialDelaySeconds() {
            return this.initialDelaySeconds;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbe setPeriodSeconds(Long periodSeconds) {
            this.periodSeconds = periodSeconds;
            return this;
        }
        public Long getPeriodSeconds() {
            return this.periodSeconds;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbe setSuccessThreshold(Long successThreshold) {
            this.successThreshold = successThreshold;
            return this;
        }
        public Long getSuccessThreshold() {
            return this.successThreshold;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbe setTimeOutSeconds(Long timeOutSeconds) {
            this.timeOutSeconds = timeOutSeconds;
            return this;
        }
        public Long getTimeOutSeconds() {
            return this.timeOutSeconds;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbe setExecAction(GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbeExecAction execAction) {
            this.execAction = execAction;
            return this;
        }
        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbeExecAction getExecAction() {
            return this.execAction;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbe setHttpGetAction(GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbeHttpGetAction httpGetAction) {
            this.httpGetAction = httpGetAction;
            return this;
        }
        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbeHttpGetAction getHttpGetAction() {
            return this.httpGetAction;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbe setTcpSocketAction(GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbeTcpSocketAction tcpSocketAction) {
            this.tcpSocketAction = tcpSocketAction;
            return this;
        }
        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbeTcpSocketAction getTcpSocketAction() {
            return this.tcpSocketAction;
        }

    }

    public static class GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfig extends TeaModel {
        @NameInMap("LivenessProbe")
        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbe livenessProbe;

        @NameInMap("ReadinessProbe")
        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbe readinessProbe;

        public static GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfig build(java.util.Map<String, ?> map) throws Exception {
            GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfig self = new GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfig();
            return TeaModel.build(map, self);
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfig setLivenessProbe(GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbe livenessProbe) {
            this.livenessProbe = livenessProbe;
            return this;
        }
        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbe getLivenessProbe() {
            return this.livenessProbe;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfig setReadinessProbe(GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbe readinessProbe) {
            this.readinessProbe = readinessProbe;
            return this;
        }
        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbe getReadinessProbe() {
            return this.readinessProbe;
        }

    }

    public static class GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPostStartExec extends TeaModel {
        @NameInMap("Command")
        public String command;

        public static GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPostStartExec build(java.util.Map<String, ?> map) throws Exception {
            GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPostStartExec self = new GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPostStartExec();
            return TeaModel.build(map, self);
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPostStartExec setCommand(String command) {
            this.command = command;
            return this;
        }
        public String getCommand() {
            return this.command;
        }

    }

    public static class GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPostStartHttp extends TeaModel {
        @NameInMap("Path")
        public String path;

        @NameInMap("Port")
        public String port;

        @NameInMap("Scheme")
        public String scheme;

        public static GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPostStartHttp build(java.util.Map<String, ?> map) throws Exception {
            GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPostStartHttp self = new GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPostStartHttp();
            return TeaModel.build(map, self);
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPostStartHttp setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPostStartHttp setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPostStartHttp setScheme(String scheme) {
            this.scheme = scheme;
            return this;
        }
        public String getScheme() {
            return this.scheme;
        }

    }

    public static class GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPostStartTcp extends TeaModel {
        @NameInMap("Port")
        public String port;

        public static GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPostStartTcp build(java.util.Map<String, ?> map) throws Exception {
            GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPostStartTcp self = new GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPostStartTcp();
            return TeaModel.build(map, self);
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPostStartTcp setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

    }

    public static class GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPreStopExec extends TeaModel {
        @NameInMap("Command")
        public String command;

        public static GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPreStopExec build(java.util.Map<String, ?> map) throws Exception {
            GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPreStopExec self = new GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPreStopExec();
            return TeaModel.build(map, self);
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPreStopExec setCommand(String command) {
            this.command = command;
            return this;
        }
        public String getCommand() {
            return this.command;
        }

    }

    public static class GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPreStopHttp extends TeaModel {
        @NameInMap("Path")
        public String path;

        @NameInMap("Port")
        public String port;

        @NameInMap("Scheme")
        public String scheme;

        public static GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPreStopHttp build(java.util.Map<String, ?> map) throws Exception {
            GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPreStopHttp self = new GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPreStopHttp();
            return TeaModel.build(map, self);
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPreStopHttp setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPreStopHttp setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPreStopHttp setScheme(String scheme) {
            this.scheme = scheme;
            return this;
        }
        public String getScheme() {
            return this.scheme;
        }

    }

    public static class GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPreStopTcp extends TeaModel {
        @NameInMap("Port")
        public String port;

        public static GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPreStopTcp build(java.util.Map<String, ?> map) throws Exception {
            GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPreStopTcp self = new GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPreStopTcp();
            return TeaModel.build(map, self);
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPreStopTcp setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

    }

    public static class GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHook extends TeaModel {
        @NameInMap("PostStartExec")
        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPostStartExec postStartExec;

        @NameInMap("PostStartHttp")
        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPostStartHttp postStartHttp;

        @NameInMap("PostStartTcp")
        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPostStartTcp postStartTcp;

        @NameInMap("PreStopExec")
        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPreStopExec preStopExec;

        @NameInMap("PreStopHttp")
        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPreStopHttp preStopHttp;

        @NameInMap("PreStopTcp")
        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPreStopTcp preStopTcp;

        public static GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHook build(java.util.Map<String, ?> map) throws Exception {
            GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHook self = new GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHook();
            return TeaModel.build(map, self);
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHook setPostStartExec(GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPostStartExec postStartExec) {
            this.postStartExec = postStartExec;
            return this;
        }
        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPostStartExec getPostStartExec() {
            return this.postStartExec;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHook setPostStartHttp(GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPostStartHttp postStartHttp) {
            this.postStartHttp = postStartHttp;
            return this;
        }
        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPostStartHttp getPostStartHttp() {
            return this.postStartHttp;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHook setPostStartTcp(GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPostStartTcp postStartTcp) {
            this.postStartTcp = postStartTcp;
            return this;
        }
        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPostStartTcp getPostStartTcp() {
            return this.postStartTcp;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHook setPreStopExec(GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPreStopExec preStopExec) {
            this.preStopExec = preStopExec;
            return this;
        }
        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPreStopExec getPreStopExec() {
            return this.preStopExec;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHook setPreStopHttp(GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPreStopHttp preStopHttp) {
            this.preStopHttp = preStopHttp;
            return this;
        }
        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPreStopHttp getPreStopHttp() {
            return this.preStopHttp;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHook setPreStopTcp(GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPreStopTcp preStopTcp) {
            this.preStopTcp = preStopTcp;
            return this;
        }
        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPreStopTcp getPreStopTcp() {
            return this.preStopTcp;
        }

    }

    public static class GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecs extends TeaModel {
        @NameInMap("CpuLimit")
        public String cpuLimit;

        @NameInMap("CpuRequest")
        public String cpuRequest;

        @NameInMap("Image")
        public String image;

        @NameInMap("ImageBuildName")
        public String imageBuildName;

        @NameInMap("ImagePullSecret")
        public String imagePullSecret;

        @NameInMap("ImageSource")
        public String imageSource;

        @NameInMap("MemoryLimit")
        public String memoryLimit;

        @NameInMap("MemoryRequest")
        public String memoryRequest;

        @NameInMap("Name")
        public String name;

        @NameInMap("RestartPolicy")
        public String restartPolicy;

        @NameInMap("Type")
        public String type;

        @NameInMap("VolumesStr")
        public String volumesStr;

        @NameInMap("VolumeMountsStr")
        public String volumeMountsStr;

        @NameInMap("EntryPoints")
        public java.util.List<String> entryPoints;

        @NameInMap("Envs")
        public java.util.List<GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsEnvs> envs;

        @NameInMap("EnvOverrides")
        public java.util.List<GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsEnvOverrides> envOverrides;

        @NameInMap("LogConfigs")
        public java.util.List<GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLogConfigs> logConfigs;

        @NameInMap("VolumeMounts")
        public java.util.List<GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMounts> volumeMounts;

        @NameInMap("HealthCheckConfig")
        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfig healthCheckConfig;

        @NameInMap("LifecycleHook")
        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHook lifecycleHook;

        public static GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecs build(java.util.Map<String, ?> map) throws Exception {
            GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecs self = new GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecs();
            return TeaModel.build(map, self);
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecs setCpuLimit(String cpuLimit) {
            this.cpuLimit = cpuLimit;
            return this;
        }
        public String getCpuLimit() {
            return this.cpuLimit;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecs setCpuRequest(String cpuRequest) {
            this.cpuRequest = cpuRequest;
            return this;
        }
        public String getCpuRequest() {
            return this.cpuRequest;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecs setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecs setImageBuildName(String imageBuildName) {
            this.imageBuildName = imageBuildName;
            return this;
        }
        public String getImageBuildName() {
            return this.imageBuildName;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecs setImagePullSecret(String imagePullSecret) {
            this.imagePullSecret = imagePullSecret;
            return this;
        }
        public String getImagePullSecret() {
            return this.imagePullSecret;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecs setImageSource(String imageSource) {
            this.imageSource = imageSource;
            return this;
        }
        public String getImageSource() {
            return this.imageSource;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecs setMemoryLimit(String memoryLimit) {
            this.memoryLimit = memoryLimit;
            return this;
        }
        public String getMemoryLimit() {
            return this.memoryLimit;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecs setMemoryRequest(String memoryRequest) {
            this.memoryRequest = memoryRequest;
            return this;
        }
        public String getMemoryRequest() {
            return this.memoryRequest;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecs setRestartPolicy(String restartPolicy) {
            this.restartPolicy = restartPolicy;
            return this;
        }
        public String getRestartPolicy() {
            return this.restartPolicy;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecs setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecs setVolumesStr(String volumesStr) {
            this.volumesStr = volumesStr;
            return this;
        }
        public String getVolumesStr() {
            return this.volumesStr;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecs setVolumeMountsStr(String volumeMountsStr) {
            this.volumeMountsStr = volumeMountsStr;
            return this;
        }
        public String getVolumeMountsStr() {
            return this.volumeMountsStr;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecs setEntryPoints(java.util.List<String> entryPoints) {
            this.entryPoints = entryPoints;
            return this;
        }
        public java.util.List<String> getEntryPoints() {
            return this.entryPoints;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecs setEnvs(java.util.List<GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsEnvs> envs) {
            this.envs = envs;
            return this;
        }
        public java.util.List<GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsEnvs> getEnvs() {
            return this.envs;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecs setEnvOverrides(java.util.List<GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsEnvOverrides> envOverrides) {
            this.envOverrides = envOverrides;
            return this;
        }
        public java.util.List<GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsEnvOverrides> getEnvOverrides() {
            return this.envOverrides;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecs setLogConfigs(java.util.List<GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLogConfigs> logConfigs) {
            this.logConfigs = logConfigs;
            return this;
        }
        public java.util.List<GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLogConfigs> getLogConfigs() {
            return this.logConfigs;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecs setVolumeMounts(java.util.List<GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMounts> volumeMounts) {
            this.volumeMounts = volumeMounts;
            return this;
        }
        public java.util.List<GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMounts> getVolumeMounts() {
            return this.volumeMounts;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecs setHealthCheckConfig(GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfig healthCheckConfig) {
            this.healthCheckConfig = healthCheckConfig;
            return this;
        }
        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfig getHealthCheckConfig() {
            return this.healthCheckConfig;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecs setLifecycleHook(GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHook lifecycleHook) {
            this.lifecycleHook = lifecycleHook;
            return this;
        }
        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHook getLifecycleHook() {
            return this.lifecycleHook;
        }

    }

    public static class GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListeners extends TeaModel {
        @NameInMap("BackendServerPort")
        public Long backendServerPort;

        @NameInMap("BandWidth")
        public Long bandWidth;

        @NameInMap("CaCertificateId")
        public String caCertificateId;

        @NameInMap("Cookie")
        public String cookie;

        @NameInMap("CookieTimeout")
        public Long cookieTimeout;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("EstablishedTimeout")
        public Long establishedTimeout;

        @NameInMap("HealthyThreshold")
        public Long healthyThreshold;

        @NameInMap("HealthCheck")
        public String healthCheck;

        @NameInMap("HealthCheckConnectPort")
        public Long healthCheckConnectPort;

        @NameInMap("HealthCheckConnectTimeout")
        public Long healthCheckConnectTimeout;

        @NameInMap("HealthCheckDomain")
        public String healthCheckDomain;

        @NameInMap("HealthCheckHttpCode")
        public String healthCheckHttpCode;

        @NameInMap("HealthCheckInterval")
        public Long healthCheckInterval;

        @NameInMap("HealthCheckThreshold")
        public Long healthCheckThreshold;

        @NameInMap("HealthCheckTimeout")
        public Long healthCheckTimeout;

        @NameInMap("HealthCheckUri")
        public String healthCheckUri;

        @NameInMap("ListenerPort")
        public Long listenerPort;

        @NameInMap("Path")
        public String path;

        @NameInMap("PersistenceTimeout")
        public Long persistenceTimeout;

        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("Scheduler")
        public String scheduler;

        @NameInMap("SessionStickyType")
        public Long sessionStickyType;

        @NameInMap("UnhealthyThreshold")
        public Long unhealthyThreshold;

        @NameInMap("XforwardFor")
        public Boolean xforwardFor;

        public static GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListeners build(java.util.Map<String, ?> map) throws Exception {
            GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListeners self = new GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListeners();
            return TeaModel.build(map, self);
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListeners setBackendServerPort(Long backendServerPort) {
            this.backendServerPort = backendServerPort;
            return this;
        }
        public Long getBackendServerPort() {
            return this.backendServerPort;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListeners setBandWidth(Long bandWidth) {
            this.bandWidth = bandWidth;
            return this;
        }
        public Long getBandWidth() {
            return this.bandWidth;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListeners setCaCertificateId(String caCertificateId) {
            this.caCertificateId = caCertificateId;
            return this;
        }
        public String getCaCertificateId() {
            return this.caCertificateId;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListeners setCookie(String cookie) {
            this.cookie = cookie;
            return this;
        }
        public String getCookie() {
            return this.cookie;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListeners setCookieTimeout(Long cookieTimeout) {
            this.cookieTimeout = cookieTimeout;
            return this;
        }
        public Long getCookieTimeout() {
            return this.cookieTimeout;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListeners setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListeners setEstablishedTimeout(Long establishedTimeout) {
            this.establishedTimeout = establishedTimeout;
            return this;
        }
        public Long getEstablishedTimeout() {
            return this.establishedTimeout;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListeners setHealthyThreshold(Long healthyThreshold) {
            this.healthyThreshold = healthyThreshold;
            return this;
        }
        public Long getHealthyThreshold() {
            return this.healthyThreshold;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListeners setHealthCheck(String healthCheck) {
            this.healthCheck = healthCheck;
            return this;
        }
        public String getHealthCheck() {
            return this.healthCheck;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListeners setHealthCheckConnectPort(Long healthCheckConnectPort) {
            this.healthCheckConnectPort = healthCheckConnectPort;
            return this;
        }
        public Long getHealthCheckConnectPort() {
            return this.healthCheckConnectPort;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListeners setHealthCheckConnectTimeout(Long healthCheckConnectTimeout) {
            this.healthCheckConnectTimeout = healthCheckConnectTimeout;
            return this;
        }
        public Long getHealthCheckConnectTimeout() {
            return this.healthCheckConnectTimeout;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListeners setHealthCheckDomain(String healthCheckDomain) {
            this.healthCheckDomain = healthCheckDomain;
            return this;
        }
        public String getHealthCheckDomain() {
            return this.healthCheckDomain;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListeners setHealthCheckHttpCode(String healthCheckHttpCode) {
            this.healthCheckHttpCode = healthCheckHttpCode;
            return this;
        }
        public String getHealthCheckHttpCode() {
            return this.healthCheckHttpCode;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListeners setHealthCheckInterval(Long healthCheckInterval) {
            this.healthCheckInterval = healthCheckInterval;
            return this;
        }
        public Long getHealthCheckInterval() {
            return this.healthCheckInterval;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListeners setHealthCheckThreshold(Long healthCheckThreshold) {
            this.healthCheckThreshold = healthCheckThreshold;
            return this;
        }
        public Long getHealthCheckThreshold() {
            return this.healthCheckThreshold;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListeners setHealthCheckTimeout(Long healthCheckTimeout) {
            this.healthCheckTimeout = healthCheckTimeout;
            return this;
        }
        public Long getHealthCheckTimeout() {
            return this.healthCheckTimeout;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListeners setHealthCheckUri(String healthCheckUri) {
            this.healthCheckUri = healthCheckUri;
            return this;
        }
        public String getHealthCheckUri() {
            return this.healthCheckUri;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListeners setListenerPort(Long listenerPort) {
            this.listenerPort = listenerPort;
            return this;
        }
        public Long getListenerPort() {
            return this.listenerPort;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListeners setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListeners setPersistenceTimeout(Long persistenceTimeout) {
            this.persistenceTimeout = persistenceTimeout;
            return this;
        }
        public Long getPersistenceTimeout() {
            return this.persistenceTimeout;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListeners setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListeners setScheduler(String scheduler) {
            this.scheduler = scheduler;
            return this;
        }
        public String getScheduler() {
            return this.scheduler;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListeners setSessionStickyType(Long sessionStickyType) {
            this.sessionStickyType = sessionStickyType;
            return this;
        }
        public Long getSessionStickyType() {
            return this.sessionStickyType;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListeners setUnhealthyThreshold(Long unhealthyThreshold) {
            this.unhealthyThreshold = unhealthyThreshold;
            return this;
        }
        public Long getUnhealthyThreshold() {
            return this.unhealthyThreshold;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListeners setXforwardFor(Boolean xforwardFor) {
            this.xforwardFor = xforwardFor;
            return this;
        }
        public Boolean getXforwardFor() {
            return this.xforwardFor;
        }

    }

    public static class GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListenersV2 extends TeaModel {
        @NameInMap("BackendServerPort")
        public Long backendServerPort;

        @NameInMap("BandWidth")
        public Long bandWidth;

        @NameInMap("CaCertificateId")
        public String caCertificateId;

        @NameInMap("Cookie")
        public String cookie;

        @NameInMap("CookieTimeout")
        public Long cookieTimeout;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("EstablishedTimeout")
        public Long establishedTimeout;

        @NameInMap("HealthyThreshold")
        public Long healthyThreshold;

        @NameInMap("HealthCheck")
        public String healthCheck;

        @NameInMap("HealthCheckConnectPort")
        public Long healthCheckConnectPort;

        @NameInMap("HealthCheckConnectTimeout")
        public Long healthCheckConnectTimeout;

        @NameInMap("HealthCheckDomain")
        public String healthCheckDomain;

        @NameInMap("HealthCheckHttpCode")
        public String healthCheckHttpCode;

        @NameInMap("HealthCheckInterval")
        public Long healthCheckInterval;

        @NameInMap("HealthCheckThreshold")
        public Long healthCheckThreshold;

        @NameInMap("HealthCheckTimeout")
        public Long healthCheckTimeout;

        @NameInMap("HealthCheckUri")
        public String healthCheckUri;

        @NameInMap("ListenerPort")
        public Long listenerPort;

        @NameInMap("Path")
        public String path;

        @NameInMap("PersistenceTimeout")
        public Long persistenceTimeout;

        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("Scheduler")
        public String scheduler;

        @NameInMap("SessionStickyType")
        public Long sessionStickyType;

        @NameInMap("UnhealthyThreshold")
        public Long unhealthyThreshold;

        @NameInMap("XforwardFor")
        public Boolean xforwardFor;

        public static GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListenersV2 build(java.util.Map<String, ?> map) throws Exception {
            GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListenersV2 self = new GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListenersV2();
            return TeaModel.build(map, self);
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListenersV2 setBackendServerPort(Long backendServerPort) {
            this.backendServerPort = backendServerPort;
            return this;
        }
        public Long getBackendServerPort() {
            return this.backendServerPort;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListenersV2 setBandWidth(Long bandWidth) {
            this.bandWidth = bandWidth;
            return this;
        }
        public Long getBandWidth() {
            return this.bandWidth;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListenersV2 setCaCertificateId(String caCertificateId) {
            this.caCertificateId = caCertificateId;
            return this;
        }
        public String getCaCertificateId() {
            return this.caCertificateId;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListenersV2 setCookie(String cookie) {
            this.cookie = cookie;
            return this;
        }
        public String getCookie() {
            return this.cookie;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListenersV2 setCookieTimeout(Long cookieTimeout) {
            this.cookieTimeout = cookieTimeout;
            return this;
        }
        public Long getCookieTimeout() {
            return this.cookieTimeout;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListenersV2 setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListenersV2 setEstablishedTimeout(Long establishedTimeout) {
            this.establishedTimeout = establishedTimeout;
            return this;
        }
        public Long getEstablishedTimeout() {
            return this.establishedTimeout;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListenersV2 setHealthyThreshold(Long healthyThreshold) {
            this.healthyThreshold = healthyThreshold;
            return this;
        }
        public Long getHealthyThreshold() {
            return this.healthyThreshold;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListenersV2 setHealthCheck(String healthCheck) {
            this.healthCheck = healthCheck;
            return this;
        }
        public String getHealthCheck() {
            return this.healthCheck;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListenersV2 setHealthCheckConnectPort(Long healthCheckConnectPort) {
            this.healthCheckConnectPort = healthCheckConnectPort;
            return this;
        }
        public Long getHealthCheckConnectPort() {
            return this.healthCheckConnectPort;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListenersV2 setHealthCheckConnectTimeout(Long healthCheckConnectTimeout) {
            this.healthCheckConnectTimeout = healthCheckConnectTimeout;
            return this;
        }
        public Long getHealthCheckConnectTimeout() {
            return this.healthCheckConnectTimeout;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListenersV2 setHealthCheckDomain(String healthCheckDomain) {
            this.healthCheckDomain = healthCheckDomain;
            return this;
        }
        public String getHealthCheckDomain() {
            return this.healthCheckDomain;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListenersV2 setHealthCheckHttpCode(String healthCheckHttpCode) {
            this.healthCheckHttpCode = healthCheckHttpCode;
            return this;
        }
        public String getHealthCheckHttpCode() {
            return this.healthCheckHttpCode;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListenersV2 setHealthCheckInterval(Long healthCheckInterval) {
            this.healthCheckInterval = healthCheckInterval;
            return this;
        }
        public Long getHealthCheckInterval() {
            return this.healthCheckInterval;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListenersV2 setHealthCheckThreshold(Long healthCheckThreshold) {
            this.healthCheckThreshold = healthCheckThreshold;
            return this;
        }
        public Long getHealthCheckThreshold() {
            return this.healthCheckThreshold;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListenersV2 setHealthCheckTimeout(Long healthCheckTimeout) {
            this.healthCheckTimeout = healthCheckTimeout;
            return this;
        }
        public Long getHealthCheckTimeout() {
            return this.healthCheckTimeout;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListenersV2 setHealthCheckUri(String healthCheckUri) {
            this.healthCheckUri = healthCheckUri;
            return this;
        }
        public String getHealthCheckUri() {
            return this.healthCheckUri;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListenersV2 setListenerPort(Long listenerPort) {
            this.listenerPort = listenerPort;
            return this;
        }
        public Long getListenerPort() {
            return this.listenerPort;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListenersV2 setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListenersV2 setPersistenceTimeout(Long persistenceTimeout) {
            this.persistenceTimeout = persistenceTimeout;
            return this;
        }
        public Long getPersistenceTimeout() {
            return this.persistenceTimeout;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListenersV2 setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListenersV2 setScheduler(String scheduler) {
            this.scheduler = scheduler;
            return this;
        }
        public String getScheduler() {
            return this.scheduler;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListenersV2 setSessionStickyType(Long sessionStickyType) {
            this.sessionStickyType = sessionStickyType;
            return this;
        }
        public Long getSessionStickyType() {
            return this.sessionStickyType;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListenersV2 setUnhealthyThreshold(Long unhealthyThreshold) {
            this.unhealthyThreshold = unhealthyThreshold;
            return this;
        }
        public Long getUnhealthyThreshold() {
            return this.unhealthyThreshold;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListenersV2 setXforwardFor(Boolean xforwardFor) {
            this.xforwardFor = xforwardFor;
            return this;
        }
        public Boolean getXforwardFor() {
            return this.xforwardFor;
        }

    }

    public static class GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngresses extends TeaModel {
        @NameInMap("Domain")
        public String domain;

        @NameInMap("LoadBalancerIaasId")
        public String loadBalancerIaasId;

        @NameInMap("LoadBalancerName")
        public String loadBalancerName;

        @NameInMap("LoadBalancerType")
        public String loadBalancerType;

        @NameInMap("Name")
        public String name;

        @NameInMap("SpannerClusterId")
        public String spannerClusterId;

        @NameInMap("UnifiedAccessInstanceName")
        public String unifiedAccessInstanceName;

        @NameInMap("UnifiedAccessRouteRule")
        public String unifiedAccessRouteRule;

        @NameInMap("UnifiedAccessEntries")
        public java.util.List<String> unifiedAccessEntries;

        @NameInMap("Listeners")
        public java.util.List<GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListeners> listeners;

        @NameInMap("ListenersV2")
        public java.util.List<GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListenersV2> listenersV2;

        public static GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngresses build(java.util.Map<String, ?> map) throws Exception {
            GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngresses self = new GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngresses();
            return TeaModel.build(map, self);
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngresses setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngresses setLoadBalancerIaasId(String loadBalancerIaasId) {
            this.loadBalancerIaasId = loadBalancerIaasId;
            return this;
        }
        public String getLoadBalancerIaasId() {
            return this.loadBalancerIaasId;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngresses setLoadBalancerName(String loadBalancerName) {
            this.loadBalancerName = loadBalancerName;
            return this;
        }
        public String getLoadBalancerName() {
            return this.loadBalancerName;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngresses setLoadBalancerType(String loadBalancerType) {
            this.loadBalancerType = loadBalancerType;
            return this;
        }
        public String getLoadBalancerType() {
            return this.loadBalancerType;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngresses setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngresses setSpannerClusterId(String spannerClusterId) {
            this.spannerClusterId = spannerClusterId;
            return this;
        }
        public String getSpannerClusterId() {
            return this.spannerClusterId;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngresses setUnifiedAccessInstanceName(String unifiedAccessInstanceName) {
            this.unifiedAccessInstanceName = unifiedAccessInstanceName;
            return this;
        }
        public String getUnifiedAccessInstanceName() {
            return this.unifiedAccessInstanceName;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngresses setUnifiedAccessRouteRule(String unifiedAccessRouteRule) {
            this.unifiedAccessRouteRule = unifiedAccessRouteRule;
            return this;
        }
        public String getUnifiedAccessRouteRule() {
            return this.unifiedAccessRouteRule;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngresses setUnifiedAccessEntries(java.util.List<String> unifiedAccessEntries) {
            this.unifiedAccessEntries = unifiedAccessEntries;
            return this;
        }
        public java.util.List<String> getUnifiedAccessEntries() {
            return this.unifiedAccessEntries;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngresses setListeners(java.util.List<GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListeners> listeners) {
            this.listeners = listeners;
            return this;
        }
        public java.util.List<GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListeners> getListeners() {
            return this.listeners;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngresses setListenersV2(java.util.List<GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListenersV2> listenersV2) {
            this.listenersV2 = listenersV2;
            return this;
        }
        public java.util.List<GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListenersV2> getListenersV2() {
            return this.listenersV2;
        }

    }

    public static class GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigInnerLoadBalancerServicesCellSlbIaasIdMap extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigInnerLoadBalancerServicesCellSlbIaasIdMap build(java.util.Map<String, ?> map) throws Exception {
            GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigInnerLoadBalancerServicesCellSlbIaasIdMap self = new GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigInnerLoadBalancerServicesCellSlbIaasIdMap();
            return TeaModel.build(map, self);
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigInnerLoadBalancerServicesCellSlbIaasIdMap setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigInnerLoadBalancerServicesCellSlbIaasIdMap setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigInnerLoadBalancerServicesListeners extends TeaModel {
        @NameInMap("BackendServerPort")
        public Long backendServerPort;

        @NameInMap("BandWidth")
        public Long bandWidth;

        @NameInMap("CaCertificateId")
        public String caCertificateId;

        @NameInMap("Cookie")
        public String cookie;

        @NameInMap("CookieTimeout")
        public Long cookieTimeout;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("EstablishedTimeout")
        public Long establishedTimeout;

        @NameInMap("HealthyThreshold")
        public Long healthyThreshold;

        @NameInMap("HealthCheck")
        public String healthCheck;

        @NameInMap("HealthCheckConnectPort")
        public Long healthCheckConnectPort;

        @NameInMap("HealthCheckConnectTimeout")
        public Long healthCheckConnectTimeout;

        @NameInMap("HealthCheckDomain")
        public String healthCheckDomain;

        @NameInMap("HealthCheckHttpCode")
        public String healthCheckHttpCode;

        @NameInMap("HealthCheckInterval")
        public Long healthCheckInterval;

        @NameInMap("HealthCheckThreshold")
        public Long healthCheckThreshold;

        @NameInMap("HealthCheckTimeout")
        public Long healthCheckTimeout;

        @NameInMap("HealthCheckUri")
        public String healthCheckUri;

        @NameInMap("ListenerPort")
        public Long listenerPort;

        @NameInMap("Path")
        public String path;

        @NameInMap("PersistenceTimeout")
        public Long persistenceTimeout;

        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("Scheduler")
        public String scheduler;

        @NameInMap("SessionStickyType")
        public Long sessionStickyType;

        @NameInMap("UnhealthyThreshold")
        public Long unhealthyThreshold;

        @NameInMap("XforwardFor")
        public Boolean xforwardFor;

        public static GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigInnerLoadBalancerServicesListeners build(java.util.Map<String, ?> map) throws Exception {
            GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigInnerLoadBalancerServicesListeners self = new GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigInnerLoadBalancerServicesListeners();
            return TeaModel.build(map, self);
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigInnerLoadBalancerServicesListeners setBackendServerPort(Long backendServerPort) {
            this.backendServerPort = backendServerPort;
            return this;
        }
        public Long getBackendServerPort() {
            return this.backendServerPort;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigInnerLoadBalancerServicesListeners setBandWidth(Long bandWidth) {
            this.bandWidth = bandWidth;
            return this;
        }
        public Long getBandWidth() {
            return this.bandWidth;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigInnerLoadBalancerServicesListeners setCaCertificateId(String caCertificateId) {
            this.caCertificateId = caCertificateId;
            return this;
        }
        public String getCaCertificateId() {
            return this.caCertificateId;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigInnerLoadBalancerServicesListeners setCookie(String cookie) {
            this.cookie = cookie;
            return this;
        }
        public String getCookie() {
            return this.cookie;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigInnerLoadBalancerServicesListeners setCookieTimeout(Long cookieTimeout) {
            this.cookieTimeout = cookieTimeout;
            return this;
        }
        public Long getCookieTimeout() {
            return this.cookieTimeout;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigInnerLoadBalancerServicesListeners setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigInnerLoadBalancerServicesListeners setEstablishedTimeout(Long establishedTimeout) {
            this.establishedTimeout = establishedTimeout;
            return this;
        }
        public Long getEstablishedTimeout() {
            return this.establishedTimeout;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigInnerLoadBalancerServicesListeners setHealthyThreshold(Long healthyThreshold) {
            this.healthyThreshold = healthyThreshold;
            return this;
        }
        public Long getHealthyThreshold() {
            return this.healthyThreshold;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigInnerLoadBalancerServicesListeners setHealthCheck(String healthCheck) {
            this.healthCheck = healthCheck;
            return this;
        }
        public String getHealthCheck() {
            return this.healthCheck;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigInnerLoadBalancerServicesListeners setHealthCheckConnectPort(Long healthCheckConnectPort) {
            this.healthCheckConnectPort = healthCheckConnectPort;
            return this;
        }
        public Long getHealthCheckConnectPort() {
            return this.healthCheckConnectPort;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigInnerLoadBalancerServicesListeners setHealthCheckConnectTimeout(Long healthCheckConnectTimeout) {
            this.healthCheckConnectTimeout = healthCheckConnectTimeout;
            return this;
        }
        public Long getHealthCheckConnectTimeout() {
            return this.healthCheckConnectTimeout;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigInnerLoadBalancerServicesListeners setHealthCheckDomain(String healthCheckDomain) {
            this.healthCheckDomain = healthCheckDomain;
            return this;
        }
        public String getHealthCheckDomain() {
            return this.healthCheckDomain;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigInnerLoadBalancerServicesListeners setHealthCheckHttpCode(String healthCheckHttpCode) {
            this.healthCheckHttpCode = healthCheckHttpCode;
            return this;
        }
        public String getHealthCheckHttpCode() {
            return this.healthCheckHttpCode;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigInnerLoadBalancerServicesListeners setHealthCheckInterval(Long healthCheckInterval) {
            this.healthCheckInterval = healthCheckInterval;
            return this;
        }
        public Long getHealthCheckInterval() {
            return this.healthCheckInterval;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigInnerLoadBalancerServicesListeners setHealthCheckThreshold(Long healthCheckThreshold) {
            this.healthCheckThreshold = healthCheckThreshold;
            return this;
        }
        public Long getHealthCheckThreshold() {
            return this.healthCheckThreshold;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigInnerLoadBalancerServicesListeners setHealthCheckTimeout(Long healthCheckTimeout) {
            this.healthCheckTimeout = healthCheckTimeout;
            return this;
        }
        public Long getHealthCheckTimeout() {
            return this.healthCheckTimeout;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigInnerLoadBalancerServicesListeners setHealthCheckUri(String healthCheckUri) {
            this.healthCheckUri = healthCheckUri;
            return this;
        }
        public String getHealthCheckUri() {
            return this.healthCheckUri;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigInnerLoadBalancerServicesListeners setListenerPort(Long listenerPort) {
            this.listenerPort = listenerPort;
            return this;
        }
        public Long getListenerPort() {
            return this.listenerPort;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigInnerLoadBalancerServicesListeners setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigInnerLoadBalancerServicesListeners setPersistenceTimeout(Long persistenceTimeout) {
            this.persistenceTimeout = persistenceTimeout;
            return this;
        }
        public Long getPersistenceTimeout() {
            return this.persistenceTimeout;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigInnerLoadBalancerServicesListeners setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigInnerLoadBalancerServicesListeners setScheduler(String scheduler) {
            this.scheduler = scheduler;
            return this;
        }
        public String getScheduler() {
            return this.scheduler;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigInnerLoadBalancerServicesListeners setSessionStickyType(Long sessionStickyType) {
            this.sessionStickyType = sessionStickyType;
            return this;
        }
        public Long getSessionStickyType() {
            return this.sessionStickyType;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigInnerLoadBalancerServicesListeners setUnhealthyThreshold(Long unhealthyThreshold) {
            this.unhealthyThreshold = unhealthyThreshold;
            return this;
        }
        public Long getUnhealthyThreshold() {
            return this.unhealthyThreshold;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigInnerLoadBalancerServicesListeners setXforwardFor(Boolean xforwardFor) {
            this.xforwardFor = xforwardFor;
            return this;
        }
        public Boolean getXforwardFor() {
            return this.xforwardFor;
        }

    }

    public static class GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigInnerLoadBalancerServices extends TeaModel {
        @NameInMap("AddressType")
        public String addressType;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("LoadBalancerIaasId")
        public String loadBalancerIaasId;

        @NameInMap("LoadBalancerName")
        public String loadBalancerName;

        @NameInMap("Name")
        public String name;

        @NameInMap("SpannerClusterId")
        public String spannerClusterId;

        @NameInMap("CellSlbIaasIdMap")
        public java.util.List<GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigInnerLoadBalancerServicesCellSlbIaasIdMap> cellSlbIaasIdMap;

        @NameInMap("Listeners")
        public java.util.List<GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigInnerLoadBalancerServicesListeners> listeners;

        public static GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigInnerLoadBalancerServices build(java.util.Map<String, ?> map) throws Exception {
            GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigInnerLoadBalancerServices self = new GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigInnerLoadBalancerServices();
            return TeaModel.build(map, self);
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigInnerLoadBalancerServices setAddressType(String addressType) {
            this.addressType = addressType;
            return this;
        }
        public String getAddressType() {
            return this.addressType;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigInnerLoadBalancerServices setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigInnerLoadBalancerServices setLoadBalancerIaasId(String loadBalancerIaasId) {
            this.loadBalancerIaasId = loadBalancerIaasId;
            return this;
        }
        public String getLoadBalancerIaasId() {
            return this.loadBalancerIaasId;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigInnerLoadBalancerServices setLoadBalancerName(String loadBalancerName) {
            this.loadBalancerName = loadBalancerName;
            return this;
        }
        public String getLoadBalancerName() {
            return this.loadBalancerName;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigInnerLoadBalancerServices setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigInnerLoadBalancerServices setSpannerClusterId(String spannerClusterId) {
            this.spannerClusterId = spannerClusterId;
            return this;
        }
        public String getSpannerClusterId() {
            return this.spannerClusterId;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigInnerLoadBalancerServices setCellSlbIaasIdMap(java.util.List<GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigInnerLoadBalancerServicesCellSlbIaasIdMap> cellSlbIaasIdMap) {
            this.cellSlbIaasIdMap = cellSlbIaasIdMap;
            return this;
        }
        public java.util.List<GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigInnerLoadBalancerServicesCellSlbIaasIdMap> getCellSlbIaasIdMap() {
            return this.cellSlbIaasIdMap;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigInnerLoadBalancerServices setListeners(java.util.List<GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigInnerLoadBalancerServicesListeners> listeners) {
            this.listeners = listeners;
            return this;
        }
        public java.util.List<GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigInnerLoadBalancerServicesListeners> getListeners() {
            return this.listeners;
        }

    }

    public static class GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigLoadBalancerServicesCellSlbIaasIdMap extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigLoadBalancerServicesCellSlbIaasIdMap build(java.util.Map<String, ?> map) throws Exception {
            GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigLoadBalancerServicesCellSlbIaasIdMap self = new GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigLoadBalancerServicesCellSlbIaasIdMap();
            return TeaModel.build(map, self);
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigLoadBalancerServicesCellSlbIaasIdMap setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigLoadBalancerServicesCellSlbIaasIdMap setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigLoadBalancerServicesListeners extends TeaModel {
        @NameInMap("BackendServerPort")
        public Long backendServerPort;

        @NameInMap("BandWidth")
        public Long bandWidth;

        @NameInMap("CaCertificateId")
        public String caCertificateId;

        @NameInMap("Cookie")
        public String cookie;

        @NameInMap("CookieTimeout")
        public Long cookieTimeout;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("EstablishedTimeout")
        public Long establishedTimeout;

        @NameInMap("HealthyThreshold")
        public Long healthyThreshold;

        @NameInMap("HealthCheck")
        public String healthCheck;

        @NameInMap("HealthCheckConnectPort")
        public Long healthCheckConnectPort;

        @NameInMap("HealthCheckConnectTimeout")
        public Long healthCheckConnectTimeout;

        @NameInMap("HealthCheckDomain")
        public String healthCheckDomain;

        @NameInMap("HealthCheckHttpCode")
        public String healthCheckHttpCode;

        @NameInMap("HealthCheckInterval")
        public Long healthCheckInterval;

        @NameInMap("HealthCheckThreshold")
        public Long healthCheckThreshold;

        @NameInMap("HealthCheckTimeout")
        public Long healthCheckTimeout;

        @NameInMap("HealthCheckUri")
        public String healthCheckUri;

        @NameInMap("ListenerPort")
        public Long listenerPort;

        @NameInMap("Path")
        public String path;

        @NameInMap("PersistenceTimeout")
        public Long persistenceTimeout;

        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("Scheduler")
        public String scheduler;

        @NameInMap("SessionStickyType")
        public Long sessionStickyType;

        @NameInMap("UnhealthyThreshold")
        public Long unhealthyThreshold;

        @NameInMap("XforwardFor")
        public Boolean xforwardFor;

        public static GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigLoadBalancerServicesListeners build(java.util.Map<String, ?> map) throws Exception {
            GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigLoadBalancerServicesListeners self = new GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigLoadBalancerServicesListeners();
            return TeaModel.build(map, self);
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigLoadBalancerServicesListeners setBackendServerPort(Long backendServerPort) {
            this.backendServerPort = backendServerPort;
            return this;
        }
        public Long getBackendServerPort() {
            return this.backendServerPort;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigLoadBalancerServicesListeners setBandWidth(Long bandWidth) {
            this.bandWidth = bandWidth;
            return this;
        }
        public Long getBandWidth() {
            return this.bandWidth;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigLoadBalancerServicesListeners setCaCertificateId(String caCertificateId) {
            this.caCertificateId = caCertificateId;
            return this;
        }
        public String getCaCertificateId() {
            return this.caCertificateId;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigLoadBalancerServicesListeners setCookie(String cookie) {
            this.cookie = cookie;
            return this;
        }
        public String getCookie() {
            return this.cookie;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigLoadBalancerServicesListeners setCookieTimeout(Long cookieTimeout) {
            this.cookieTimeout = cookieTimeout;
            return this;
        }
        public Long getCookieTimeout() {
            return this.cookieTimeout;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigLoadBalancerServicesListeners setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigLoadBalancerServicesListeners setEstablishedTimeout(Long establishedTimeout) {
            this.establishedTimeout = establishedTimeout;
            return this;
        }
        public Long getEstablishedTimeout() {
            return this.establishedTimeout;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigLoadBalancerServicesListeners setHealthyThreshold(Long healthyThreshold) {
            this.healthyThreshold = healthyThreshold;
            return this;
        }
        public Long getHealthyThreshold() {
            return this.healthyThreshold;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigLoadBalancerServicesListeners setHealthCheck(String healthCheck) {
            this.healthCheck = healthCheck;
            return this;
        }
        public String getHealthCheck() {
            return this.healthCheck;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigLoadBalancerServicesListeners setHealthCheckConnectPort(Long healthCheckConnectPort) {
            this.healthCheckConnectPort = healthCheckConnectPort;
            return this;
        }
        public Long getHealthCheckConnectPort() {
            return this.healthCheckConnectPort;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigLoadBalancerServicesListeners setHealthCheckConnectTimeout(Long healthCheckConnectTimeout) {
            this.healthCheckConnectTimeout = healthCheckConnectTimeout;
            return this;
        }
        public Long getHealthCheckConnectTimeout() {
            return this.healthCheckConnectTimeout;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigLoadBalancerServicesListeners setHealthCheckDomain(String healthCheckDomain) {
            this.healthCheckDomain = healthCheckDomain;
            return this;
        }
        public String getHealthCheckDomain() {
            return this.healthCheckDomain;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigLoadBalancerServicesListeners setHealthCheckHttpCode(String healthCheckHttpCode) {
            this.healthCheckHttpCode = healthCheckHttpCode;
            return this;
        }
        public String getHealthCheckHttpCode() {
            return this.healthCheckHttpCode;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigLoadBalancerServicesListeners setHealthCheckInterval(Long healthCheckInterval) {
            this.healthCheckInterval = healthCheckInterval;
            return this;
        }
        public Long getHealthCheckInterval() {
            return this.healthCheckInterval;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigLoadBalancerServicesListeners setHealthCheckThreshold(Long healthCheckThreshold) {
            this.healthCheckThreshold = healthCheckThreshold;
            return this;
        }
        public Long getHealthCheckThreshold() {
            return this.healthCheckThreshold;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigLoadBalancerServicesListeners setHealthCheckTimeout(Long healthCheckTimeout) {
            this.healthCheckTimeout = healthCheckTimeout;
            return this;
        }
        public Long getHealthCheckTimeout() {
            return this.healthCheckTimeout;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigLoadBalancerServicesListeners setHealthCheckUri(String healthCheckUri) {
            this.healthCheckUri = healthCheckUri;
            return this;
        }
        public String getHealthCheckUri() {
            return this.healthCheckUri;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigLoadBalancerServicesListeners setListenerPort(Long listenerPort) {
            this.listenerPort = listenerPort;
            return this;
        }
        public Long getListenerPort() {
            return this.listenerPort;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigLoadBalancerServicesListeners setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigLoadBalancerServicesListeners setPersistenceTimeout(Long persistenceTimeout) {
            this.persistenceTimeout = persistenceTimeout;
            return this;
        }
        public Long getPersistenceTimeout() {
            return this.persistenceTimeout;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigLoadBalancerServicesListeners setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigLoadBalancerServicesListeners setScheduler(String scheduler) {
            this.scheduler = scheduler;
            return this;
        }
        public String getScheduler() {
            return this.scheduler;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigLoadBalancerServicesListeners setSessionStickyType(Long sessionStickyType) {
            this.sessionStickyType = sessionStickyType;
            return this;
        }
        public Long getSessionStickyType() {
            return this.sessionStickyType;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigLoadBalancerServicesListeners setUnhealthyThreshold(Long unhealthyThreshold) {
            this.unhealthyThreshold = unhealthyThreshold;
            return this;
        }
        public Long getUnhealthyThreshold() {
            return this.unhealthyThreshold;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigLoadBalancerServicesListeners setXforwardFor(Boolean xforwardFor) {
            this.xforwardFor = xforwardFor;
            return this;
        }
        public Boolean getXforwardFor() {
            return this.xforwardFor;
        }

    }

    public static class GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigLoadBalancerServices extends TeaModel {
        @NameInMap("AddressType")
        public String addressType;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("LoadBalancerIaasId")
        public String loadBalancerIaasId;

        @NameInMap("LoadBalancerName")
        public String loadBalancerName;

        @NameInMap("Name")
        public String name;

        @NameInMap("SpannerClusterId")
        public String spannerClusterId;

        @NameInMap("CellSlbIaasIdMap")
        public java.util.List<GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigLoadBalancerServicesCellSlbIaasIdMap> cellSlbIaasIdMap;

        @NameInMap("Listeners")
        public java.util.List<GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigLoadBalancerServicesListeners> listeners;

        public static GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigLoadBalancerServices build(java.util.Map<String, ?> map) throws Exception {
            GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigLoadBalancerServices self = new GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigLoadBalancerServices();
            return TeaModel.build(map, self);
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigLoadBalancerServices setAddressType(String addressType) {
            this.addressType = addressType;
            return this;
        }
        public String getAddressType() {
            return this.addressType;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigLoadBalancerServices setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigLoadBalancerServices setLoadBalancerIaasId(String loadBalancerIaasId) {
            this.loadBalancerIaasId = loadBalancerIaasId;
            return this;
        }
        public String getLoadBalancerIaasId() {
            return this.loadBalancerIaasId;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigLoadBalancerServices setLoadBalancerName(String loadBalancerName) {
            this.loadBalancerName = loadBalancerName;
            return this;
        }
        public String getLoadBalancerName() {
            return this.loadBalancerName;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigLoadBalancerServices setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigLoadBalancerServices setSpannerClusterId(String spannerClusterId) {
            this.spannerClusterId = spannerClusterId;
            return this;
        }
        public String getSpannerClusterId() {
            return this.spannerClusterId;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigLoadBalancerServices setCellSlbIaasIdMap(java.util.List<GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigLoadBalancerServicesCellSlbIaasIdMap> cellSlbIaasIdMap) {
            this.cellSlbIaasIdMap = cellSlbIaasIdMap;
            return this;
        }
        public java.util.List<GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigLoadBalancerServicesCellSlbIaasIdMap> getCellSlbIaasIdMap() {
            return this.cellSlbIaasIdMap;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigLoadBalancerServices setListeners(java.util.List<GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigLoadBalancerServicesListeners> listeners) {
            this.listeners = listeners;
            return this;
        }
        public java.util.List<GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigLoadBalancerServicesListeners> getListeners() {
            return this.listeners;
        }

    }

    public static class GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigPublicLoadBalancerServicesCellSlbIaasIdMap extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigPublicLoadBalancerServicesCellSlbIaasIdMap build(java.util.Map<String, ?> map) throws Exception {
            GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigPublicLoadBalancerServicesCellSlbIaasIdMap self = new GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigPublicLoadBalancerServicesCellSlbIaasIdMap();
            return TeaModel.build(map, self);
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigPublicLoadBalancerServicesCellSlbIaasIdMap setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigPublicLoadBalancerServicesCellSlbIaasIdMap setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigPublicLoadBalancerServicesListeners extends TeaModel {
        @NameInMap("BackendServerPort")
        public Long backendServerPort;

        @NameInMap("BandWidth")
        public Long bandWidth;

        @NameInMap("CaCertificateId")
        public String caCertificateId;

        @NameInMap("Cookie")
        public String cookie;

        @NameInMap("CookieTimeout")
        public Long cookieTimeout;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("EstablishedTimeout")
        public Long establishedTimeout;

        @NameInMap("HealthyThreshold")
        public Long healthyThreshold;

        @NameInMap("HealthCheck")
        public String healthCheck;

        @NameInMap("HealthCheckConnectPort")
        public Long healthCheckConnectPort;

        @NameInMap("HealthCheckConnectTimeout")
        public Long healthCheckConnectTimeout;

        @NameInMap("HealthCheckDomain")
        public String healthCheckDomain;

        @NameInMap("HealthCheckHttpCode")
        public String healthCheckHttpCode;

        @NameInMap("HealthCheckInterval")
        public Long healthCheckInterval;

        @NameInMap("HealthCheckThreshold")
        public Long healthCheckThreshold;

        @NameInMap("HealthCheckTimeout")
        public Long healthCheckTimeout;

        @NameInMap("HealthCheckUri")
        public String healthCheckUri;

        @NameInMap("ListenerPort")
        public Long listenerPort;

        @NameInMap("Path")
        public String path;

        @NameInMap("PersistenceTimeout")
        public Long persistenceTimeout;

        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("Scheduler")
        public String scheduler;

        @NameInMap("SessionStickyType")
        public Long sessionStickyType;

        @NameInMap("UnhealthyThreshold")
        public Long unhealthyThreshold;

        @NameInMap("XforwardFor")
        public Boolean xforwardFor;

        public static GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigPublicLoadBalancerServicesListeners build(java.util.Map<String, ?> map) throws Exception {
            GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigPublicLoadBalancerServicesListeners self = new GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigPublicLoadBalancerServicesListeners();
            return TeaModel.build(map, self);
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigPublicLoadBalancerServicesListeners setBackendServerPort(Long backendServerPort) {
            this.backendServerPort = backendServerPort;
            return this;
        }
        public Long getBackendServerPort() {
            return this.backendServerPort;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigPublicLoadBalancerServicesListeners setBandWidth(Long bandWidth) {
            this.bandWidth = bandWidth;
            return this;
        }
        public Long getBandWidth() {
            return this.bandWidth;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigPublicLoadBalancerServicesListeners setCaCertificateId(String caCertificateId) {
            this.caCertificateId = caCertificateId;
            return this;
        }
        public String getCaCertificateId() {
            return this.caCertificateId;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigPublicLoadBalancerServicesListeners setCookie(String cookie) {
            this.cookie = cookie;
            return this;
        }
        public String getCookie() {
            return this.cookie;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigPublicLoadBalancerServicesListeners setCookieTimeout(Long cookieTimeout) {
            this.cookieTimeout = cookieTimeout;
            return this;
        }
        public Long getCookieTimeout() {
            return this.cookieTimeout;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigPublicLoadBalancerServicesListeners setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigPublicLoadBalancerServicesListeners setEstablishedTimeout(Long establishedTimeout) {
            this.establishedTimeout = establishedTimeout;
            return this;
        }
        public Long getEstablishedTimeout() {
            return this.establishedTimeout;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigPublicLoadBalancerServicesListeners setHealthyThreshold(Long healthyThreshold) {
            this.healthyThreshold = healthyThreshold;
            return this;
        }
        public Long getHealthyThreshold() {
            return this.healthyThreshold;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigPublicLoadBalancerServicesListeners setHealthCheck(String healthCheck) {
            this.healthCheck = healthCheck;
            return this;
        }
        public String getHealthCheck() {
            return this.healthCheck;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigPublicLoadBalancerServicesListeners setHealthCheckConnectPort(Long healthCheckConnectPort) {
            this.healthCheckConnectPort = healthCheckConnectPort;
            return this;
        }
        public Long getHealthCheckConnectPort() {
            return this.healthCheckConnectPort;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigPublicLoadBalancerServicesListeners setHealthCheckConnectTimeout(Long healthCheckConnectTimeout) {
            this.healthCheckConnectTimeout = healthCheckConnectTimeout;
            return this;
        }
        public Long getHealthCheckConnectTimeout() {
            return this.healthCheckConnectTimeout;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigPublicLoadBalancerServicesListeners setHealthCheckDomain(String healthCheckDomain) {
            this.healthCheckDomain = healthCheckDomain;
            return this;
        }
        public String getHealthCheckDomain() {
            return this.healthCheckDomain;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigPublicLoadBalancerServicesListeners setHealthCheckHttpCode(String healthCheckHttpCode) {
            this.healthCheckHttpCode = healthCheckHttpCode;
            return this;
        }
        public String getHealthCheckHttpCode() {
            return this.healthCheckHttpCode;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigPublicLoadBalancerServicesListeners setHealthCheckInterval(Long healthCheckInterval) {
            this.healthCheckInterval = healthCheckInterval;
            return this;
        }
        public Long getHealthCheckInterval() {
            return this.healthCheckInterval;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigPublicLoadBalancerServicesListeners setHealthCheckThreshold(Long healthCheckThreshold) {
            this.healthCheckThreshold = healthCheckThreshold;
            return this;
        }
        public Long getHealthCheckThreshold() {
            return this.healthCheckThreshold;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigPublicLoadBalancerServicesListeners setHealthCheckTimeout(Long healthCheckTimeout) {
            this.healthCheckTimeout = healthCheckTimeout;
            return this;
        }
        public Long getHealthCheckTimeout() {
            return this.healthCheckTimeout;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigPublicLoadBalancerServicesListeners setHealthCheckUri(String healthCheckUri) {
            this.healthCheckUri = healthCheckUri;
            return this;
        }
        public String getHealthCheckUri() {
            return this.healthCheckUri;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigPublicLoadBalancerServicesListeners setListenerPort(Long listenerPort) {
            this.listenerPort = listenerPort;
            return this;
        }
        public Long getListenerPort() {
            return this.listenerPort;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigPublicLoadBalancerServicesListeners setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigPublicLoadBalancerServicesListeners setPersistenceTimeout(Long persistenceTimeout) {
            this.persistenceTimeout = persistenceTimeout;
            return this;
        }
        public Long getPersistenceTimeout() {
            return this.persistenceTimeout;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigPublicLoadBalancerServicesListeners setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigPublicLoadBalancerServicesListeners setScheduler(String scheduler) {
            this.scheduler = scheduler;
            return this;
        }
        public String getScheduler() {
            return this.scheduler;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigPublicLoadBalancerServicesListeners setSessionStickyType(Long sessionStickyType) {
            this.sessionStickyType = sessionStickyType;
            return this;
        }
        public Long getSessionStickyType() {
            return this.sessionStickyType;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigPublicLoadBalancerServicesListeners setUnhealthyThreshold(Long unhealthyThreshold) {
            this.unhealthyThreshold = unhealthyThreshold;
            return this;
        }
        public Long getUnhealthyThreshold() {
            return this.unhealthyThreshold;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigPublicLoadBalancerServicesListeners setXforwardFor(Boolean xforwardFor) {
            this.xforwardFor = xforwardFor;
            return this;
        }
        public Boolean getXforwardFor() {
            return this.xforwardFor;
        }

    }

    public static class GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigPublicLoadBalancerServices extends TeaModel {
        @NameInMap("AddressType")
        public String addressType;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("LoadBalancerIaasId")
        public String loadBalancerIaasId;

        @NameInMap("LoadBalancerName")
        public String loadBalancerName;

        @NameInMap("Name")
        public String name;

        @NameInMap("SpannerClusterId")
        public String spannerClusterId;

        @NameInMap("CellSlbIaasIdMap")
        public java.util.List<GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigPublicLoadBalancerServicesCellSlbIaasIdMap> cellSlbIaasIdMap;

        @NameInMap("Listeners")
        public java.util.List<GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigPublicLoadBalancerServicesListeners> listeners;

        public static GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigPublicLoadBalancerServices build(java.util.Map<String, ?> map) throws Exception {
            GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigPublicLoadBalancerServices self = new GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigPublicLoadBalancerServices();
            return TeaModel.build(map, self);
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigPublicLoadBalancerServices setAddressType(String addressType) {
            this.addressType = addressType;
            return this;
        }
        public String getAddressType() {
            return this.addressType;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigPublicLoadBalancerServices setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigPublicLoadBalancerServices setLoadBalancerIaasId(String loadBalancerIaasId) {
            this.loadBalancerIaasId = loadBalancerIaasId;
            return this;
        }
        public String getLoadBalancerIaasId() {
            return this.loadBalancerIaasId;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigPublicLoadBalancerServices setLoadBalancerName(String loadBalancerName) {
            this.loadBalancerName = loadBalancerName;
            return this;
        }
        public String getLoadBalancerName() {
            return this.loadBalancerName;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigPublicLoadBalancerServices setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigPublicLoadBalancerServices setSpannerClusterId(String spannerClusterId) {
            this.spannerClusterId = spannerClusterId;
            return this;
        }
        public String getSpannerClusterId() {
            return this.spannerClusterId;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigPublicLoadBalancerServices setCellSlbIaasIdMap(java.util.List<GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigPublicLoadBalancerServicesCellSlbIaasIdMap> cellSlbIaasIdMap) {
            this.cellSlbIaasIdMap = cellSlbIaasIdMap;
            return this;
        }
        public java.util.List<GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigPublicLoadBalancerServicesCellSlbIaasIdMap> getCellSlbIaasIdMap() {
            return this.cellSlbIaasIdMap;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigPublicLoadBalancerServices setListeners(java.util.List<GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigPublicLoadBalancerServicesListeners> listeners) {
            this.listeners = listeners;
            return this;
        }
        public java.util.List<GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigPublicLoadBalancerServicesListeners> getListeners() {
            return this.listeners;
        }

    }

    public static class GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigSidecarConfigs extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Scope")
        public String scope;

        @NameInMap("SidecarName")
        public String sidecarName;

        @NameInMap("SidecarVersion")
        public String sidecarVersion;

        @NameInMap("Template")
        public String template;

        @NameInMap("Type")
        public String type;

        @NameInMap("WorkspaceGroupId")
        public String workspaceGroupId;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        public static GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigSidecarConfigs build(java.util.Map<String, ?> map) throws Exception {
            GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigSidecarConfigs self = new GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigSidecarConfigs();
            return TeaModel.build(map, self);
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigSidecarConfigs setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigSidecarConfigs setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigSidecarConfigs setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigSidecarConfigs setSidecarName(String sidecarName) {
            this.sidecarName = sidecarName;
            return this;
        }
        public String getSidecarName() {
            return this.sidecarName;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigSidecarConfigs setSidecarVersion(String sidecarVersion) {
            this.sidecarVersion = sidecarVersion;
            return this;
        }
        public String getSidecarVersion() {
            return this.sidecarVersion;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigSidecarConfigs setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigSidecarConfigs setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigSidecarConfigs setWorkspaceGroupId(String workspaceGroupId) {
            this.workspaceGroupId = workspaceGroupId;
            return this;
        }
        public String getWorkspaceGroupId() {
            return this.workspaceGroupId;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigSidecarConfigs setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

    public static class GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityNodeAffinityMatchExpressions extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("Values")
        public java.util.List<String> values;

        public static GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityNodeAffinityMatchExpressions build(java.util.Map<String, ?> map) throws Exception {
            GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityNodeAffinityMatchExpressions self = new GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityNodeAffinityMatchExpressions();
            return TeaModel.build(map, self);
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityNodeAffinityMatchExpressions setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityNodeAffinityMatchExpressions setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityNodeAffinityMatchExpressions setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityNodeAffinity extends TeaModel {
        @NameInMap("Requested")
        public Boolean requested;

        @NameInMap("Weight")
        public Long weight;

        @NameInMap("MatchExpressions")
        public java.util.List<GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityNodeAffinityMatchExpressions> matchExpressions;

        public static GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityNodeAffinity build(java.util.Map<String, ?> map) throws Exception {
            GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityNodeAffinity self = new GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityNodeAffinity();
            return TeaModel.build(map, self);
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityNodeAffinity setRequested(Boolean requested) {
            this.requested = requested;
            return this;
        }
        public Boolean getRequested() {
            return this.requested;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityNodeAffinity setWeight(Long weight) {
            this.weight = weight;
            return this;
        }
        public Long getWeight() {
            return this.weight;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityNodeAffinity setMatchExpressions(java.util.List<GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityNodeAffinityMatchExpressions> matchExpressions) {
            this.matchExpressions = matchExpressions;
            return this;
        }
        public java.util.List<GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityNodeAffinityMatchExpressions> getMatchExpressions() {
            return this.matchExpressions;
        }

    }

    public static class GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityPodAffinityPodAffinityTermLabelSelector extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityPodAffinityPodAffinityTermLabelSelector build(java.util.Map<String, ?> map) throws Exception {
            GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityPodAffinityPodAffinityTermLabelSelector self = new GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityPodAffinityPodAffinityTermLabelSelector();
            return TeaModel.build(map, self);
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityPodAffinityPodAffinityTermLabelSelector setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityPodAffinityPodAffinityTermLabelSelector setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityPodAffinityPodAffinityTerm extends TeaModel {
        @NameInMap("TopologyKey")
        public String topologyKey;

        @NameInMap("Namespaces")
        public java.util.List<String> namespaces;

        @NameInMap("LabelSelector")
        public java.util.List<GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityPodAffinityPodAffinityTermLabelSelector> labelSelector;

        public static GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityPodAffinityPodAffinityTerm build(java.util.Map<String, ?> map) throws Exception {
            GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityPodAffinityPodAffinityTerm self = new GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityPodAffinityPodAffinityTerm();
            return TeaModel.build(map, self);
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityPodAffinityPodAffinityTerm setTopologyKey(String topologyKey) {
            this.topologyKey = topologyKey;
            return this;
        }
        public String getTopologyKey() {
            return this.topologyKey;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityPodAffinityPodAffinityTerm setNamespaces(java.util.List<String> namespaces) {
            this.namespaces = namespaces;
            return this;
        }
        public java.util.List<String> getNamespaces() {
            return this.namespaces;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityPodAffinityPodAffinityTerm setLabelSelector(java.util.List<GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityPodAffinityPodAffinityTermLabelSelector> labelSelector) {
            this.labelSelector = labelSelector;
            return this;
        }
        public java.util.List<GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityPodAffinityPodAffinityTermLabelSelector> getLabelSelector() {
            return this.labelSelector;
        }

    }

    public static class GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityPodAffinity extends TeaModel {
        @NameInMap("AntiAffinity")
        public Boolean antiAffinity;

        @NameInMap("Requested")
        public Boolean requested;

        @NameInMap("Weight")
        public Long weight;

        @NameInMap("PodAffinityTerm")
        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityPodAffinityPodAffinityTerm podAffinityTerm;

        public static GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityPodAffinity build(java.util.Map<String, ?> map) throws Exception {
            GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityPodAffinity self = new GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityPodAffinity();
            return TeaModel.build(map, self);
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityPodAffinity setAntiAffinity(Boolean antiAffinity) {
            this.antiAffinity = antiAffinity;
            return this;
        }
        public Boolean getAntiAffinity() {
            return this.antiAffinity;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityPodAffinity setRequested(Boolean requested) {
            this.requested = requested;
            return this;
        }
        public Boolean getRequested() {
            return this.requested;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityPodAffinity setWeight(Long weight) {
            this.weight = weight;
            return this;
        }
        public Long getWeight() {
            return this.weight;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityPodAffinity setPodAffinityTerm(GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityPodAffinityPodAffinityTerm podAffinityTerm) {
            this.podAffinityTerm = podAffinityTerm;
            return this;
        }
        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityPodAffinityPodAffinityTerm getPodAffinityTerm() {
            return this.podAffinityTerm;
        }

    }

    public static class GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinity extends TeaModel {
        @NameInMap("NodeAffinity")
        public java.util.List<GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityNodeAffinity> nodeAffinity;

        @NameInMap("PodAffinity")
        public java.util.List<GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityPodAffinity> podAffinity;

        public static GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinity build(java.util.Map<String, ?> map) throws Exception {
            GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinity self = new GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinity();
            return TeaModel.build(map, self);
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinity setNodeAffinity(java.util.List<GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityNodeAffinity> nodeAffinity) {
            this.nodeAffinity = nodeAffinity;
            return this;
        }
        public java.util.List<GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityNodeAffinity> getNodeAffinity() {
            return this.nodeAffinity;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinity setPodAffinity(java.util.List<GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityPodAffinity> podAffinity) {
            this.podAffinity = podAffinity;
            return this;
        }
        public java.util.List<GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityPodAffinity> getPodAffinity() {
            return this.podAffinity;
        }

    }

    public static class GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfig extends TeaModel {
        @NameInMap("Annotations")
        public String annotations;

        @NameInMap("CustomLabels")
        public String customLabels;

        @NameInMap("EnableSofaMesh")
        public Boolean enableSofaMesh;

        @NameInMap("GroupCount")
        public Long groupCount;

        @NameInMap("GroupStrategy")
        public String groupStrategy;

        @NameInMap("Labels")
        public String labels;

        @NameInMap("MaxGroupCapacity")
        public Long maxGroupCapacity;

        @NameInMap("NeedBeta")
        public Boolean needBeta;

        @NameInMap("NeedConfirm")
        public Boolean needConfirm;

        @NameInMap("Affinity")
        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinity affinity;

        public static GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfig build(java.util.Map<String, ?> map) throws Exception {
            GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfig self = new GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfig();
            return TeaModel.build(map, self);
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfig setAnnotations(String annotations) {
            this.annotations = annotations;
            return this;
        }
        public String getAnnotations() {
            return this.annotations;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfig setCustomLabels(String customLabels) {
            this.customLabels = customLabels;
            return this;
        }
        public String getCustomLabels() {
            return this.customLabels;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfig setEnableSofaMesh(Boolean enableSofaMesh) {
            this.enableSofaMesh = enableSofaMesh;
            return this;
        }
        public Boolean getEnableSofaMesh() {
            return this.enableSofaMesh;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfig setGroupCount(Long groupCount) {
            this.groupCount = groupCount;
            return this;
        }
        public Long getGroupCount() {
            return this.groupCount;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfig setGroupStrategy(String groupStrategy) {
            this.groupStrategy = groupStrategy;
            return this;
        }
        public String getGroupStrategy() {
            return this.groupStrategy;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfig setLabels(String labels) {
            this.labels = labels;
            return this;
        }
        public String getLabels() {
            return this.labels;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfig setMaxGroupCapacity(Long maxGroupCapacity) {
            this.maxGroupCapacity = maxGroupCapacity;
            return this;
        }
        public Long getMaxGroupCapacity() {
            return this.maxGroupCapacity;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfig setNeedBeta(Boolean needBeta) {
            this.needBeta = needBeta;
            return this;
        }
        public Boolean getNeedBeta() {
            return this.needBeta;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfig setNeedConfirm(Boolean needConfirm) {
            this.needConfirm = needConfirm;
            return this;
        }
        public Boolean getNeedConfirm() {
            return this.needConfirm;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfig setAffinity(GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinity affinity) {
            this.affinity = affinity;
            return this;
        }
        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinity getAffinity() {
            return this.affinity;
        }

    }

    public static class GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigElasticConfigFixedReplicaReplicas extends TeaModel {
        @NameInMap("Count")
        public Long count;

        @NameInMap("Name")
        public String name;

        @NameInMap("Type")
        public String type;

        public static GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigElasticConfigFixedReplicaReplicas build(java.util.Map<String, ?> map) throws Exception {
            GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigElasticConfigFixedReplicaReplicas self = new GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigElasticConfigFixedReplicaReplicas();
            return TeaModel.build(map, self);
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigElasticConfigFixedReplicaReplicas setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigElasticConfigFixedReplicaReplicas setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigElasticConfigFixedReplicaReplicas setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigElasticConfigFixedReplica extends TeaModel {
        @NameInMap("Replicas")
        public java.util.List<GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigElasticConfigFixedReplicaReplicas> replicas;

        public static GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigElasticConfigFixedReplica build(java.util.Map<String, ?> map) throws Exception {
            GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigElasticConfigFixedReplica self = new GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigElasticConfigFixedReplica();
            return TeaModel.build(map, self);
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigElasticConfigFixedReplica setReplicas(java.util.List<GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigElasticConfigFixedReplicaReplicas> replicas) {
            this.replicas = replicas;
            return this;
        }
        public java.util.List<GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigElasticConfigFixedReplicaReplicas> getReplicas() {
            return this.replicas;
        }

    }

    public static class GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigElasticConfig extends TeaModel {
        @NameInMap("FixedReplica")
        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigElasticConfigFixedReplica fixedReplica;

        public static GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigElasticConfig build(java.util.Map<String, ?> map) throws Exception {
            GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigElasticConfig self = new GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigElasticConfig();
            return TeaModel.build(map, self);
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigElasticConfig setFixedReplica(GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigElasticConfigFixedReplica fixedReplica) {
            this.fixedReplica = fixedReplica;
            return this;
        }
        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigElasticConfigFixedReplica getFixedReplica() {
            return this.fixedReplica;
        }

    }

    public static class GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfig extends TeaModel {
        @NameInMap("EnableBizMonitor")
        public Boolean enableBizMonitor;

        @NameInMap("EnableLogConfig")
        public Boolean enableLogConfig;

        @NameInMap("EnableSofaMesh")
        public Boolean enableSofaMesh;

        @NameInMap("UseHostNetwork")
        public Boolean useHostNetwork;

        @NameInMap("BizMonitorPaths")
        public java.util.List<String> bizMonitorPaths;

        @NameInMap("ClusterIpServices")
        public java.util.List<GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigClusterIpServices> clusterIpServices;

        @NameInMap("ContainerSpecs")
        public java.util.List<GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecs> containerSpecs;

        @NameInMap("Ingresses")
        public java.util.List<GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngresses> ingresses;

        @NameInMap("InnerLoadBalancerServices")
        public java.util.List<GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigInnerLoadBalancerServices> innerLoadBalancerServices;

        @NameInMap("LoadBalancerServices")
        public java.util.List<GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigLoadBalancerServices> loadBalancerServices;

        @NameInMap("PublicLoadBalancerServices")
        public java.util.List<GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigPublicLoadBalancerServices> publicLoadBalancerServices;

        @NameInMap("SidecarConfigs")
        public java.util.List<GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigSidecarConfigs> sidecarConfigs;

        @NameInMap("DeployConfig")
        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfig deployConfig;

        @NameInMap("ElasticConfig")
        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigElasticConfig elasticConfig;

        public static GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfig build(java.util.Map<String, ?> map) throws Exception {
            GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfig self = new GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfig();
            return TeaModel.build(map, self);
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfig setEnableBizMonitor(Boolean enableBizMonitor) {
            this.enableBizMonitor = enableBizMonitor;
            return this;
        }
        public Boolean getEnableBizMonitor() {
            return this.enableBizMonitor;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfig setEnableLogConfig(Boolean enableLogConfig) {
            this.enableLogConfig = enableLogConfig;
            return this;
        }
        public Boolean getEnableLogConfig() {
            return this.enableLogConfig;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfig setEnableSofaMesh(Boolean enableSofaMesh) {
            this.enableSofaMesh = enableSofaMesh;
            return this;
        }
        public Boolean getEnableSofaMesh() {
            return this.enableSofaMesh;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfig setUseHostNetwork(Boolean useHostNetwork) {
            this.useHostNetwork = useHostNetwork;
            return this;
        }
        public Boolean getUseHostNetwork() {
            return this.useHostNetwork;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfig setBizMonitorPaths(java.util.List<String> bizMonitorPaths) {
            this.bizMonitorPaths = bizMonitorPaths;
            return this;
        }
        public java.util.List<String> getBizMonitorPaths() {
            return this.bizMonitorPaths;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfig setClusterIpServices(java.util.List<GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigClusterIpServices> clusterIpServices) {
            this.clusterIpServices = clusterIpServices;
            return this;
        }
        public java.util.List<GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigClusterIpServices> getClusterIpServices() {
            return this.clusterIpServices;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfig setContainerSpecs(java.util.List<GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecs> containerSpecs) {
            this.containerSpecs = containerSpecs;
            return this;
        }
        public java.util.List<GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecs> getContainerSpecs() {
            return this.containerSpecs;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfig setIngresses(java.util.List<GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngresses> ingresses) {
            this.ingresses = ingresses;
            return this;
        }
        public java.util.List<GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngresses> getIngresses() {
            return this.ingresses;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfig setInnerLoadBalancerServices(java.util.List<GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigInnerLoadBalancerServices> innerLoadBalancerServices) {
            this.innerLoadBalancerServices = innerLoadBalancerServices;
            return this;
        }
        public java.util.List<GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigInnerLoadBalancerServices> getInnerLoadBalancerServices() {
            return this.innerLoadBalancerServices;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfig setLoadBalancerServices(java.util.List<GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigLoadBalancerServices> loadBalancerServices) {
            this.loadBalancerServices = loadBalancerServices;
            return this;
        }
        public java.util.List<GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigLoadBalancerServices> getLoadBalancerServices() {
            return this.loadBalancerServices;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfig setPublicLoadBalancerServices(java.util.List<GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigPublicLoadBalancerServices> publicLoadBalancerServices) {
            this.publicLoadBalancerServices = publicLoadBalancerServices;
            return this;
        }
        public java.util.List<GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigPublicLoadBalancerServices> getPublicLoadBalancerServices() {
            return this.publicLoadBalancerServices;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfig setSidecarConfigs(java.util.List<GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigSidecarConfigs> sidecarConfigs) {
            this.sidecarConfigs = sidecarConfigs;
            return this;
        }
        public java.util.List<GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigSidecarConfigs> getSidecarConfigs() {
            return this.sidecarConfigs;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfig setDeployConfig(GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfig deployConfig) {
            this.deployConfig = deployConfig;
            return this;
        }
        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfig getDeployConfig() {
            return this.deployConfig;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfig setElasticConfig(GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigElasticConfig elasticConfig) {
            this.elasticConfig = elasticConfig;
            return this;
        }
        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigElasticConfig getElasticConfig() {
            return this.elasticConfig;
        }

    }

    public static class GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceReleaseInfo extends TeaModel {
        @NameInMap("CreatedPlanId")
        public String createdPlanId;

        @NameInMap("LatestDeploymentEndTime")
        public String latestDeploymentEndTime;

        @NameInMap("LatestDeploymentStartTime")
        public String latestDeploymentStartTime;

        public static GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceReleaseInfo build(java.util.Map<String, ?> map) throws Exception {
            GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceReleaseInfo self = new GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceReleaseInfo();
            return TeaModel.build(map, self);
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceReleaseInfo setCreatedPlanId(String createdPlanId) {
            this.createdPlanId = createdPlanId;
            return this;
        }
        public String getCreatedPlanId() {
            return this.createdPlanId;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceReleaseInfo setLatestDeploymentEndTime(String latestDeploymentEndTime) {
            this.latestDeploymentEndTime = latestDeploymentEndTime;
            return this;
        }
        public String getLatestDeploymentEndTime() {
            return this.latestDeploymentEndTime;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceReleaseInfo setLatestDeploymentStartTime(String latestDeploymentStartTime) {
            this.latestDeploymentStartTime = latestDeploymentStartTime;
            return this;
        }
        public String getLatestDeploymentStartTime() {
            return this.latestDeploymentStartTime;
        }

    }

    public static class GetLDCContainerServiceRevisionResponseBodyRevision extends TeaModel {
        @NameInMap("ContainerServiceName")
        public String containerServiceName;

        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("DeployStatus")
        public String deployStatus;

        @NameInMap("Description")
        public String description;

        @NameInMap("LastPlanId")
        public String lastPlanId;

        @NameInMap("MetaStatus")
        public String metaStatus;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("Remarks")
        public String remarks;

        @NameInMap("Revision")
        public String revision;

        @NameInMap("AppInfo")
        public GetLDCContainerServiceRevisionResponseBodyRevisionAppInfo appInfo;

        @NameInMap("ContainerServiceConfig")
        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfig containerServiceConfig;

        @NameInMap("ContainerServiceReleaseInfo")
        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceReleaseInfo containerServiceReleaseInfo;

        public static GetLDCContainerServiceRevisionResponseBodyRevision build(java.util.Map<String, ?> map) throws Exception {
            GetLDCContainerServiceRevisionResponseBodyRevision self = new GetLDCContainerServiceRevisionResponseBodyRevision();
            return TeaModel.build(map, self);
        }

        public GetLDCContainerServiceRevisionResponseBodyRevision setContainerServiceName(String containerServiceName) {
            this.containerServiceName = containerServiceName;
            return this;
        }
        public String getContainerServiceName() {
            return this.containerServiceName;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevision setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevision setDeployStatus(String deployStatus) {
            this.deployStatus = deployStatus;
            return this;
        }
        public String getDeployStatus() {
            return this.deployStatus;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevision setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevision setLastPlanId(String lastPlanId) {
            this.lastPlanId = lastPlanId;
            return this;
        }
        public String getLastPlanId() {
            return this.lastPlanId;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevision setMetaStatus(String metaStatus) {
            this.metaStatus = metaStatus;
            return this;
        }
        public String getMetaStatus() {
            return this.metaStatus;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevision setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevision setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevision setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevision setRemarks(String remarks) {
            this.remarks = remarks;
            return this;
        }
        public String getRemarks() {
            return this.remarks;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevision setRevision(String revision) {
            this.revision = revision;
            return this;
        }
        public String getRevision() {
            return this.revision;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevision setAppInfo(GetLDCContainerServiceRevisionResponseBodyRevisionAppInfo appInfo) {
            this.appInfo = appInfo;
            return this;
        }
        public GetLDCContainerServiceRevisionResponseBodyRevisionAppInfo getAppInfo() {
            return this.appInfo;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevision setContainerServiceConfig(GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfig containerServiceConfig) {
            this.containerServiceConfig = containerServiceConfig;
            return this;
        }
        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfig getContainerServiceConfig() {
            return this.containerServiceConfig;
        }

        public GetLDCContainerServiceRevisionResponseBodyRevision setContainerServiceReleaseInfo(GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceReleaseInfo containerServiceReleaseInfo) {
            this.containerServiceReleaseInfo = containerServiceReleaseInfo;
            return this;
        }
        public GetLDCContainerServiceRevisionResponseBodyRevisionContainerServiceReleaseInfo getContainerServiceReleaseInfo() {
            return this.containerServiceReleaseInfo;
        }

    }

}
