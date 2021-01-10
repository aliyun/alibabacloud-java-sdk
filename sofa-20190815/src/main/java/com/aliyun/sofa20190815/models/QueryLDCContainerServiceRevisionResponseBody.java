// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLDCContainerServiceRevisionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("RevisionList")
    public java.util.List<QueryLDCContainerServiceRevisionResponseBodyRevisionList> revisionList;

    public static QueryLDCContainerServiceRevisionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLDCContainerServiceRevisionResponseBody self = new QueryLDCContainerServiceRevisionResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLDCContainerServiceRevisionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLDCContainerServiceRevisionResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLDCContainerServiceRevisionResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLDCContainerServiceRevisionResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public QueryLDCContainerServiceRevisionResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryLDCContainerServiceRevisionResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public QueryLDCContainerServiceRevisionResponseBody setRevisionList(java.util.List<QueryLDCContainerServiceRevisionResponseBodyRevisionList> revisionList) {
        this.revisionList = revisionList;
        return this;
    }
    public java.util.List<QueryLDCContainerServiceRevisionResponseBodyRevisionList> getRevisionList() {
        return this.revisionList;
    }

    public static class QueryLDCContainerServiceRevisionResponseBodyRevisionListAppInfo extends TeaModel {
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

        public static QueryLDCContainerServiceRevisionResponseBodyRevisionListAppInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCContainerServiceRevisionResponseBodyRevisionListAppInfo self = new QueryLDCContainerServiceRevisionResponseBodyRevisionListAppInfo();
            return TeaModel.build(map, self);
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListAppInfo setBuildpackVersion(String buildpackVersion) {
            this.buildpackVersion = buildpackVersion;
            return this;
        }
        public String getBuildpackVersion() {
            return this.buildpackVersion;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListAppInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListAppInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListAppInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListAppInfo setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListAppInfo setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListAppInfo setTechstackIdentity(String techstackIdentity) {
            this.techstackIdentity = techstackIdentity;
            return this;
        }
        public String getTechstackIdentity() {
            return this.techstackIdentity;
        }

    }

    public static class QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigClusterIpServicesPorts extends TeaModel {
        @NameInMap("Port")
        public Long port;

        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("TargetPort")
        public Long targetPort;

        public static QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigClusterIpServicesPorts build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigClusterIpServicesPorts self = new QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigClusterIpServicesPorts();
            return TeaModel.build(map, self);
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigClusterIpServicesPorts setPort(Long port) {
            this.port = port;
            return this;
        }
        public Long getPort() {
            return this.port;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigClusterIpServicesPorts setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigClusterIpServicesPorts setTargetPort(Long targetPort) {
            this.targetPort = targetPort;
            return this;
        }
        public Long getTargetPort() {
            return this.targetPort;
        }

    }

    public static class QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigClusterIpServices extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Ports")
        public java.util.List<QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigClusterIpServicesPorts> ports;

        public static QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigClusterIpServices build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigClusterIpServices self = new QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigClusterIpServices();
            return TeaModel.build(map, self);
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigClusterIpServices setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigClusterIpServices setPorts(java.util.List<QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigClusterIpServicesPorts> ports) {
            this.ports = ports;
            return this;
        }
        public java.util.List<QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigClusterIpServicesPorts> getPorts() {
            return this.ports;
        }

    }

    public static class QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsEnvsValueFrom extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("ObjectName")
        public String objectName;

        @NameInMap("ObjectType")
        public String objectType;

        public static QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsEnvsValueFrom build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsEnvsValueFrom self = new QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsEnvsValueFrom();
            return TeaModel.build(map, self);
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsEnvsValueFrom setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsEnvsValueFrom setObjectName(String objectName) {
            this.objectName = objectName;
            return this;
        }
        public String getObjectName() {
            return this.objectName;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsEnvsValueFrom setObjectType(String objectType) {
            this.objectType = objectType;
            return this;
        }
        public String getObjectType() {
            return this.objectType;
        }

    }

    public static class QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsEnvs extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public String value;

        @NameInMap("ValueFrom")
        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsEnvsValueFrom valueFrom;

        public static QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsEnvs build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsEnvs self = new QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsEnvs();
            return TeaModel.build(map, self);
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsEnvs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsEnvs setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsEnvs setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsEnvs setValueFrom(QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsEnvsValueFrom valueFrom) {
            this.valueFrom = valueFrom;
            return this;
        }
        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsEnvsValueFrom getValueFrom() {
            return this.valueFrom;
        }

    }

    public static class QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsEnvOverrides extends TeaModel {
        @NameInMap("Cell")
        public String cell;

        @NameInMap("Name")
        public String name;

        @NameInMap("Value")
        public String value;

        public static QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsEnvOverrides build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsEnvOverrides self = new QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsEnvOverrides();
            return TeaModel.build(map, self);
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsEnvOverrides setCell(String cell) {
            this.cell = cell;
            return this;
        }
        public String getCell() {
            return this.cell;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsEnvOverrides setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsEnvOverrides setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsLogConfigs extends TeaModel {
        @NameInMap("ConfigName")
        public String configName;

        @NameInMap("InputType")
        public String inputType;

        @NameInMap("LogstoreName")
        public String logstoreName;

        @NameInMap("LogPath")
        public String logPath;

        public static QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsLogConfigs build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsLogConfigs self = new QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsLogConfigs();
            return TeaModel.build(map, self);
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsLogConfigs setConfigName(String configName) {
            this.configName = configName;
            return this;
        }
        public String getConfigName() {
            return this.configName;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsLogConfigs setInputType(String inputType) {
            this.inputType = inputType;
            return this;
        }
        public String getInputType() {
            return this.inputType;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsLogConfigs setLogstoreName(String logstoreName) {
            this.logstoreName = logstoreName;
            return this;
        }
        public String getLogstoreName() {
            return this.logstoreName;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsLogConfigs setLogPath(String logPath) {
            this.logPath = logPath;
            return this;
        }
        public String getLogPath() {
            return this.logPath;
        }

    }

    public static class QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsVolumeMountsConfigmapSecretVolumeSource extends TeaModel {
        @NameInMap("VolumeRefName")
        public String volumeRefName;

        public static QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsVolumeMountsConfigmapSecretVolumeSource build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsVolumeMountsConfigmapSecretVolumeSource self = new QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsVolumeMountsConfigmapSecretVolumeSource();
            return TeaModel.build(map, self);
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsVolumeMountsConfigmapSecretVolumeSource setVolumeRefName(String volumeRefName) {
            this.volumeRefName = volumeRefName;
            return this;
        }
        public String getVolumeRefName() {
            return this.volumeRefName;
        }

    }

    public static class QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsVolumeMountsEmptyDirVolumeSource extends TeaModel {
        @NameInMap("Medium")
        public String medium;

        @NameInMap("Name")
        public String name;

        @NameInMap("SizeLimit")
        public String sizeLimit;

        public static QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsVolumeMountsEmptyDirVolumeSource build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsVolumeMountsEmptyDirVolumeSource self = new QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsVolumeMountsEmptyDirVolumeSource();
            return TeaModel.build(map, self);
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsVolumeMountsEmptyDirVolumeSource setMedium(String medium) {
            this.medium = medium;
            return this;
        }
        public String getMedium() {
            return this.medium;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsVolumeMountsEmptyDirVolumeSource setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsVolumeMountsEmptyDirVolumeSource setSizeLimit(String sizeLimit) {
            this.sizeLimit = sizeLimit;
            return this;
        }
        public String getSizeLimit() {
            return this.sizeLimit;
        }

    }

    public static class QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsVolumeMountsLocalDiskVolumeSource extends TeaModel {
        @NameInMap("CreateIfNotPresent")
        public Boolean createIfNotPresent;

        @NameInMap("HostDirectoryPath")
        public String hostDirectoryPath;

        public static QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsVolumeMountsLocalDiskVolumeSource build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsVolumeMountsLocalDiskVolumeSource self = new QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsVolumeMountsLocalDiskVolumeSource();
            return TeaModel.build(map, self);
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsVolumeMountsLocalDiskVolumeSource setCreateIfNotPresent(Boolean createIfNotPresent) {
            this.createIfNotPresent = createIfNotPresent;
            return this;
        }
        public Boolean getCreateIfNotPresent() {
            return this.createIfNotPresent;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsVolumeMountsLocalDiskVolumeSource setHostDirectoryPath(String hostDirectoryPath) {
            this.hostDirectoryPath = hostDirectoryPath;
            return this;
        }
        public String getHostDirectoryPath() {
            return this.hostDirectoryPath;
        }

    }

    public static class QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsVolumeMountsPvcSource extends TeaModel {
        @NameInMap("PvcName")
        public String pvcName;

        public static QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsVolumeMountsPvcSource build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsVolumeMountsPvcSource self = new QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsVolumeMountsPvcSource();
            return TeaModel.build(map, self);
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsVolumeMountsPvcSource setPvcName(String pvcName) {
            this.pvcName = pvcName;
            return this;
        }
        public String getPvcName() {
            return this.pvcName;
        }

    }

    public static class QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsVolumeMounts extends TeaModel {
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
        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsVolumeMountsConfigmapSecretVolumeSource configmapSecretVolumeSource;

        @NameInMap("EmptyDirVolumeSource")
        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsVolumeMountsEmptyDirVolumeSource emptyDirVolumeSource;

        @NameInMap("LocalDiskVolumeSource")
        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsVolumeMountsLocalDiskVolumeSource localDiskVolumeSource;

        @NameInMap("PvcSource")
        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsVolumeMountsPvcSource pvcSource;

        public static QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsVolumeMounts build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsVolumeMounts self = new QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsVolumeMounts();
            return TeaModel.build(map, self);
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsVolumeMounts setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsVolumeMounts setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsVolumeMounts setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsVolumeMounts setSubPath(String subPath) {
            this.subPath = subPath;
            return this;
        }
        public String getSubPath() {
            return this.subPath;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsVolumeMounts setVolumeSourceCategoryType(String volumeSourceCategoryType) {
            this.volumeSourceCategoryType = volumeSourceCategoryType;
            return this;
        }
        public String getVolumeSourceCategoryType() {
            return this.volumeSourceCategoryType;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsVolumeMounts setConfigmapSecretVolumeSource(QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsVolumeMountsConfigmapSecretVolumeSource configmapSecretVolumeSource) {
            this.configmapSecretVolumeSource = configmapSecretVolumeSource;
            return this;
        }
        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsVolumeMountsConfigmapSecretVolumeSource getConfigmapSecretVolumeSource() {
            return this.configmapSecretVolumeSource;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsVolumeMounts setEmptyDirVolumeSource(QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsVolumeMountsEmptyDirVolumeSource emptyDirVolumeSource) {
            this.emptyDirVolumeSource = emptyDirVolumeSource;
            return this;
        }
        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsVolumeMountsEmptyDirVolumeSource getEmptyDirVolumeSource() {
            return this.emptyDirVolumeSource;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsVolumeMounts setLocalDiskVolumeSource(QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsVolumeMountsLocalDiskVolumeSource localDiskVolumeSource) {
            this.localDiskVolumeSource = localDiskVolumeSource;
            return this;
        }
        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsVolumeMountsLocalDiskVolumeSource getLocalDiskVolumeSource() {
            return this.localDiskVolumeSource;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsVolumeMounts setPvcSource(QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsVolumeMountsPvcSource pvcSource) {
            this.pvcSource = pvcSource;
            return this;
        }
        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsVolumeMountsPvcSource getPvcSource() {
            return this.pvcSource;
        }

    }

    public static class QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbeExecAction extends TeaModel {
        @NameInMap("Command")
        public String command;

        public static QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbeExecAction build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbeExecAction self = new QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbeExecAction();
            return TeaModel.build(map, self);
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbeExecAction setCommand(String command) {
            this.command = command;
            return this;
        }
        public String getCommand() {
            return this.command;
        }

    }

    public static class QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbeHttpGetAction extends TeaModel {
        @NameInMap("Path")
        public String path;

        @NameInMap("Port")
        public String port;

        @NameInMap("Scheme")
        public String scheme;

        public static QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbeHttpGetAction build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbeHttpGetAction self = new QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbeHttpGetAction();
            return TeaModel.build(map, self);
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbeHttpGetAction setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbeHttpGetAction setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbeHttpGetAction setScheme(String scheme) {
            this.scheme = scheme;
            return this;
        }
        public String getScheme() {
            return this.scheme;
        }

    }

    public static class QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbeTcpSocketAction extends TeaModel {
        @NameInMap("Port")
        public String port;

        public static QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbeTcpSocketAction build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbeTcpSocketAction self = new QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbeTcpSocketAction();
            return TeaModel.build(map, self);
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbeTcpSocketAction setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

    }

    public static class QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbe extends TeaModel {
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
        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbeExecAction execAction;

        @NameInMap("HttpGetAction")
        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbeHttpGetAction httpGetAction;

        @NameInMap("TcpSocketAction")
        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbeTcpSocketAction tcpSocketAction;

        public static QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbe build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbe self = new QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbe();
            return TeaModel.build(map, self);
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbe setFailureThreshold(Long failureThreshold) {
            this.failureThreshold = failureThreshold;
            return this;
        }
        public Long getFailureThreshold() {
            return this.failureThreshold;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbe setInitialDelaySeconds(Long initialDelaySeconds) {
            this.initialDelaySeconds = initialDelaySeconds;
            return this;
        }
        public Long getInitialDelaySeconds() {
            return this.initialDelaySeconds;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbe setPeriodSeconds(Long periodSeconds) {
            this.periodSeconds = periodSeconds;
            return this;
        }
        public Long getPeriodSeconds() {
            return this.periodSeconds;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbe setSuccessThreshold(Long successThreshold) {
            this.successThreshold = successThreshold;
            return this;
        }
        public Long getSuccessThreshold() {
            return this.successThreshold;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbe setTimeOutSeconds(Long timeOutSeconds) {
            this.timeOutSeconds = timeOutSeconds;
            return this;
        }
        public Long getTimeOutSeconds() {
            return this.timeOutSeconds;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbe setExecAction(QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbeExecAction execAction) {
            this.execAction = execAction;
            return this;
        }
        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbeExecAction getExecAction() {
            return this.execAction;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbe setHttpGetAction(QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbeHttpGetAction httpGetAction) {
            this.httpGetAction = httpGetAction;
            return this;
        }
        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbeHttpGetAction getHttpGetAction() {
            return this.httpGetAction;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbe setTcpSocketAction(QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbeTcpSocketAction tcpSocketAction) {
            this.tcpSocketAction = tcpSocketAction;
            return this;
        }
        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbeTcpSocketAction getTcpSocketAction() {
            return this.tcpSocketAction;
        }

    }

    public static class QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbeExecAction extends TeaModel {
        @NameInMap("Command")
        public String command;

        public static QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbeExecAction build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbeExecAction self = new QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbeExecAction();
            return TeaModel.build(map, self);
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbeExecAction setCommand(String command) {
            this.command = command;
            return this;
        }
        public String getCommand() {
            return this.command;
        }

    }

    public static class QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbeHttpGetAction extends TeaModel {
        @NameInMap("Path")
        public String path;

        @NameInMap("Port")
        public String port;

        @NameInMap("Scheme")
        public String scheme;

        public static QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbeHttpGetAction build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbeHttpGetAction self = new QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbeHttpGetAction();
            return TeaModel.build(map, self);
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbeHttpGetAction setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbeHttpGetAction setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbeHttpGetAction setScheme(String scheme) {
            this.scheme = scheme;
            return this;
        }
        public String getScheme() {
            return this.scheme;
        }

    }

    public static class QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbeTcpSocketAction extends TeaModel {
        @NameInMap("Port")
        public String port;

        public static QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbeTcpSocketAction build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbeTcpSocketAction self = new QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbeTcpSocketAction();
            return TeaModel.build(map, self);
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbeTcpSocketAction setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

    }

    public static class QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbe extends TeaModel {
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
        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbeExecAction execAction;

        @NameInMap("HttpGetAction")
        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbeHttpGetAction httpGetAction;

        @NameInMap("TcpSocketAction")
        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbeTcpSocketAction tcpSocketAction;

        public static QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbe build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbe self = new QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbe();
            return TeaModel.build(map, self);
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbe setFailureThreshold(Long failureThreshold) {
            this.failureThreshold = failureThreshold;
            return this;
        }
        public Long getFailureThreshold() {
            return this.failureThreshold;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbe setInitialDelaySeconds(Long initialDelaySeconds) {
            this.initialDelaySeconds = initialDelaySeconds;
            return this;
        }
        public Long getInitialDelaySeconds() {
            return this.initialDelaySeconds;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbe setPeriodSeconds(Long periodSeconds) {
            this.periodSeconds = periodSeconds;
            return this;
        }
        public Long getPeriodSeconds() {
            return this.periodSeconds;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbe setSuccessThreshold(Long successThreshold) {
            this.successThreshold = successThreshold;
            return this;
        }
        public Long getSuccessThreshold() {
            return this.successThreshold;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbe setTimeOutSeconds(Long timeOutSeconds) {
            this.timeOutSeconds = timeOutSeconds;
            return this;
        }
        public Long getTimeOutSeconds() {
            return this.timeOutSeconds;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbe setExecAction(QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbeExecAction execAction) {
            this.execAction = execAction;
            return this;
        }
        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbeExecAction getExecAction() {
            return this.execAction;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbe setHttpGetAction(QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbeHttpGetAction httpGetAction) {
            this.httpGetAction = httpGetAction;
            return this;
        }
        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbeHttpGetAction getHttpGetAction() {
            return this.httpGetAction;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbe setTcpSocketAction(QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbeTcpSocketAction tcpSocketAction) {
            this.tcpSocketAction = tcpSocketAction;
            return this;
        }
        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbeTcpSocketAction getTcpSocketAction() {
            return this.tcpSocketAction;
        }

    }

    public static class QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsHealthCheckConfig extends TeaModel {
        @NameInMap("LivenessProbe")
        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbe livenessProbe;

        @NameInMap("ReadinessProbe")
        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbe readinessProbe;

        public static QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsHealthCheckConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsHealthCheckConfig self = new QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsHealthCheckConfig();
            return TeaModel.build(map, self);
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsHealthCheckConfig setLivenessProbe(QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbe livenessProbe) {
            this.livenessProbe = livenessProbe;
            return this;
        }
        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbe getLivenessProbe() {
            return this.livenessProbe;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsHealthCheckConfig setReadinessProbe(QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbe readinessProbe) {
            this.readinessProbe = readinessProbe;
            return this;
        }
        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbe getReadinessProbe() {
            return this.readinessProbe;
        }

    }

    public static class QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsLifecycleHookPostStartExec extends TeaModel {
        @NameInMap("Command")
        public String command;

        public static QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsLifecycleHookPostStartExec build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsLifecycleHookPostStartExec self = new QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsLifecycleHookPostStartExec();
            return TeaModel.build(map, self);
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsLifecycleHookPostStartExec setCommand(String command) {
            this.command = command;
            return this;
        }
        public String getCommand() {
            return this.command;
        }

    }

    public static class QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsLifecycleHookPostStartHttp extends TeaModel {
        @NameInMap("Path")
        public String path;

        @NameInMap("Port")
        public String port;

        @NameInMap("Scheme")
        public String scheme;

        public static QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsLifecycleHookPostStartHttp build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsLifecycleHookPostStartHttp self = new QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsLifecycleHookPostStartHttp();
            return TeaModel.build(map, self);
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsLifecycleHookPostStartHttp setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsLifecycleHookPostStartHttp setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsLifecycleHookPostStartHttp setScheme(String scheme) {
            this.scheme = scheme;
            return this;
        }
        public String getScheme() {
            return this.scheme;
        }

    }

    public static class QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsLifecycleHookPostStartTcp extends TeaModel {
        @NameInMap("Port")
        public String port;

        public static QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsLifecycleHookPostStartTcp build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsLifecycleHookPostStartTcp self = new QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsLifecycleHookPostStartTcp();
            return TeaModel.build(map, self);
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsLifecycleHookPostStartTcp setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

    }

    public static class QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsLifecycleHookPreStopExec extends TeaModel {
        @NameInMap("Command")
        public String command;

        public static QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsLifecycleHookPreStopExec build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsLifecycleHookPreStopExec self = new QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsLifecycleHookPreStopExec();
            return TeaModel.build(map, self);
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsLifecycleHookPreStopExec setCommand(String command) {
            this.command = command;
            return this;
        }
        public String getCommand() {
            return this.command;
        }

    }

    public static class QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsLifecycleHookPreStopHttp extends TeaModel {
        @NameInMap("Path")
        public String path;

        @NameInMap("Port")
        public String port;

        @NameInMap("Scheme")
        public String scheme;

        public static QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsLifecycleHookPreStopHttp build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsLifecycleHookPreStopHttp self = new QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsLifecycleHookPreStopHttp();
            return TeaModel.build(map, self);
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsLifecycleHookPreStopHttp setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsLifecycleHookPreStopHttp setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsLifecycleHookPreStopHttp setScheme(String scheme) {
            this.scheme = scheme;
            return this;
        }
        public String getScheme() {
            return this.scheme;
        }

    }

    public static class QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsLifecycleHookPreStopTcp extends TeaModel {
        @NameInMap("Port")
        public String port;

        public static QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsLifecycleHookPreStopTcp build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsLifecycleHookPreStopTcp self = new QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsLifecycleHookPreStopTcp();
            return TeaModel.build(map, self);
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsLifecycleHookPreStopTcp setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

    }

    public static class QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsLifecycleHook extends TeaModel {
        @NameInMap("PostStartExec")
        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsLifecycleHookPostStartExec postStartExec;

        @NameInMap("PostStartHttp")
        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsLifecycleHookPostStartHttp postStartHttp;

        @NameInMap("PostStartTcp")
        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsLifecycleHookPostStartTcp postStartTcp;

        @NameInMap("PreStopExec")
        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsLifecycleHookPreStopExec preStopExec;

        @NameInMap("PreStopHttp")
        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsLifecycleHookPreStopHttp preStopHttp;

        @NameInMap("PreStopTcp")
        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsLifecycleHookPreStopTcp preStopTcp;

        public static QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsLifecycleHook build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsLifecycleHook self = new QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsLifecycleHook();
            return TeaModel.build(map, self);
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsLifecycleHook setPostStartExec(QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsLifecycleHookPostStartExec postStartExec) {
            this.postStartExec = postStartExec;
            return this;
        }
        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsLifecycleHookPostStartExec getPostStartExec() {
            return this.postStartExec;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsLifecycleHook setPostStartHttp(QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsLifecycleHookPostStartHttp postStartHttp) {
            this.postStartHttp = postStartHttp;
            return this;
        }
        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsLifecycleHookPostStartHttp getPostStartHttp() {
            return this.postStartHttp;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsLifecycleHook setPostStartTcp(QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsLifecycleHookPostStartTcp postStartTcp) {
            this.postStartTcp = postStartTcp;
            return this;
        }
        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsLifecycleHookPostStartTcp getPostStartTcp() {
            return this.postStartTcp;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsLifecycleHook setPreStopExec(QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsLifecycleHookPreStopExec preStopExec) {
            this.preStopExec = preStopExec;
            return this;
        }
        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsLifecycleHookPreStopExec getPreStopExec() {
            return this.preStopExec;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsLifecycleHook setPreStopHttp(QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsLifecycleHookPreStopHttp preStopHttp) {
            this.preStopHttp = preStopHttp;
            return this;
        }
        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsLifecycleHookPreStopHttp getPreStopHttp() {
            return this.preStopHttp;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsLifecycleHook setPreStopTcp(QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsLifecycleHookPreStopTcp preStopTcp) {
            this.preStopTcp = preStopTcp;
            return this;
        }
        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsLifecycleHookPreStopTcp getPreStopTcp() {
            return this.preStopTcp;
        }

    }

    public static class QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecs extends TeaModel {
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
        public java.util.List<QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsEnvs> envs;

        @NameInMap("EnvOverrides")
        public java.util.List<QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsEnvOverrides> envOverrides;

        @NameInMap("LogConfigs")
        public java.util.List<QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsLogConfigs> logConfigs;

        @NameInMap("VolumeMounts")
        public java.util.List<QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsVolumeMounts> volumeMounts;

        @NameInMap("HealthCheckConfig")
        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsHealthCheckConfig healthCheckConfig;

        @NameInMap("LifecycleHook")
        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsLifecycleHook lifecycleHook;

        public static QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecs build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecs self = new QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecs();
            return TeaModel.build(map, self);
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecs setCpuLimit(String cpuLimit) {
            this.cpuLimit = cpuLimit;
            return this;
        }
        public String getCpuLimit() {
            return this.cpuLimit;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecs setCpuRequest(String cpuRequest) {
            this.cpuRequest = cpuRequest;
            return this;
        }
        public String getCpuRequest() {
            return this.cpuRequest;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecs setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecs setImageBuildName(String imageBuildName) {
            this.imageBuildName = imageBuildName;
            return this;
        }
        public String getImageBuildName() {
            return this.imageBuildName;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecs setImagePullSecret(String imagePullSecret) {
            this.imagePullSecret = imagePullSecret;
            return this;
        }
        public String getImagePullSecret() {
            return this.imagePullSecret;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecs setImageSource(String imageSource) {
            this.imageSource = imageSource;
            return this;
        }
        public String getImageSource() {
            return this.imageSource;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecs setMemoryLimit(String memoryLimit) {
            this.memoryLimit = memoryLimit;
            return this;
        }
        public String getMemoryLimit() {
            return this.memoryLimit;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecs setMemoryRequest(String memoryRequest) {
            this.memoryRequest = memoryRequest;
            return this;
        }
        public String getMemoryRequest() {
            return this.memoryRequest;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecs setRestartPolicy(String restartPolicy) {
            this.restartPolicy = restartPolicy;
            return this;
        }
        public String getRestartPolicy() {
            return this.restartPolicy;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecs setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecs setVolumesStr(String volumesStr) {
            this.volumesStr = volumesStr;
            return this;
        }
        public String getVolumesStr() {
            return this.volumesStr;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecs setVolumeMountsStr(String volumeMountsStr) {
            this.volumeMountsStr = volumeMountsStr;
            return this;
        }
        public String getVolumeMountsStr() {
            return this.volumeMountsStr;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecs setEntryPoints(java.util.List<String> entryPoints) {
            this.entryPoints = entryPoints;
            return this;
        }
        public java.util.List<String> getEntryPoints() {
            return this.entryPoints;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecs setEnvs(java.util.List<QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsEnvs> envs) {
            this.envs = envs;
            return this;
        }
        public java.util.List<QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsEnvs> getEnvs() {
            return this.envs;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecs setEnvOverrides(java.util.List<QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsEnvOverrides> envOverrides) {
            this.envOverrides = envOverrides;
            return this;
        }
        public java.util.List<QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsEnvOverrides> getEnvOverrides() {
            return this.envOverrides;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecs setLogConfigs(java.util.List<QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsLogConfigs> logConfigs) {
            this.logConfigs = logConfigs;
            return this;
        }
        public java.util.List<QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsLogConfigs> getLogConfigs() {
            return this.logConfigs;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecs setVolumeMounts(java.util.List<QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsVolumeMounts> volumeMounts) {
            this.volumeMounts = volumeMounts;
            return this;
        }
        public java.util.List<QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsVolumeMounts> getVolumeMounts() {
            return this.volumeMounts;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecs setHealthCheckConfig(QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsHealthCheckConfig healthCheckConfig) {
            this.healthCheckConfig = healthCheckConfig;
            return this;
        }
        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsHealthCheckConfig getHealthCheckConfig() {
            return this.healthCheckConfig;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecs setLifecycleHook(QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsLifecycleHook lifecycleHook) {
            this.lifecycleHook = lifecycleHook;
            return this;
        }
        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecsLifecycleHook getLifecycleHook() {
            return this.lifecycleHook;
        }

    }

    public static class QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigIngressesListeners extends TeaModel {
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

        public static QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigIngressesListeners build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigIngressesListeners self = new QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigIngressesListeners();
            return TeaModel.build(map, self);
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigIngressesListeners setBackendServerPort(Long backendServerPort) {
            this.backendServerPort = backendServerPort;
            return this;
        }
        public Long getBackendServerPort() {
            return this.backendServerPort;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigIngressesListeners setBandWidth(Long bandWidth) {
            this.bandWidth = bandWidth;
            return this;
        }
        public Long getBandWidth() {
            return this.bandWidth;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigIngressesListeners setCaCertificateId(String caCertificateId) {
            this.caCertificateId = caCertificateId;
            return this;
        }
        public String getCaCertificateId() {
            return this.caCertificateId;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigIngressesListeners setCookie(String cookie) {
            this.cookie = cookie;
            return this;
        }
        public String getCookie() {
            return this.cookie;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigIngressesListeners setCookieTimeout(Long cookieTimeout) {
            this.cookieTimeout = cookieTimeout;
            return this;
        }
        public Long getCookieTimeout() {
            return this.cookieTimeout;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigIngressesListeners setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigIngressesListeners setEstablishedTimeout(Long establishedTimeout) {
            this.establishedTimeout = establishedTimeout;
            return this;
        }
        public Long getEstablishedTimeout() {
            return this.establishedTimeout;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigIngressesListeners setHealthyThreshold(Long healthyThreshold) {
            this.healthyThreshold = healthyThreshold;
            return this;
        }
        public Long getHealthyThreshold() {
            return this.healthyThreshold;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigIngressesListeners setHealthCheck(String healthCheck) {
            this.healthCheck = healthCheck;
            return this;
        }
        public String getHealthCheck() {
            return this.healthCheck;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigIngressesListeners setHealthCheckConnectPort(Long healthCheckConnectPort) {
            this.healthCheckConnectPort = healthCheckConnectPort;
            return this;
        }
        public Long getHealthCheckConnectPort() {
            return this.healthCheckConnectPort;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigIngressesListeners setHealthCheckConnectTimeout(Long healthCheckConnectTimeout) {
            this.healthCheckConnectTimeout = healthCheckConnectTimeout;
            return this;
        }
        public Long getHealthCheckConnectTimeout() {
            return this.healthCheckConnectTimeout;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigIngressesListeners setHealthCheckDomain(String healthCheckDomain) {
            this.healthCheckDomain = healthCheckDomain;
            return this;
        }
        public String getHealthCheckDomain() {
            return this.healthCheckDomain;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigIngressesListeners setHealthCheckHttpCode(String healthCheckHttpCode) {
            this.healthCheckHttpCode = healthCheckHttpCode;
            return this;
        }
        public String getHealthCheckHttpCode() {
            return this.healthCheckHttpCode;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigIngressesListeners setHealthCheckInterval(Long healthCheckInterval) {
            this.healthCheckInterval = healthCheckInterval;
            return this;
        }
        public Long getHealthCheckInterval() {
            return this.healthCheckInterval;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigIngressesListeners setHealthCheckThreshold(Long healthCheckThreshold) {
            this.healthCheckThreshold = healthCheckThreshold;
            return this;
        }
        public Long getHealthCheckThreshold() {
            return this.healthCheckThreshold;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigIngressesListeners setHealthCheckTimeout(Long healthCheckTimeout) {
            this.healthCheckTimeout = healthCheckTimeout;
            return this;
        }
        public Long getHealthCheckTimeout() {
            return this.healthCheckTimeout;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigIngressesListeners setHealthCheckUri(String healthCheckUri) {
            this.healthCheckUri = healthCheckUri;
            return this;
        }
        public String getHealthCheckUri() {
            return this.healthCheckUri;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigIngressesListeners setListenerPort(Long listenerPort) {
            this.listenerPort = listenerPort;
            return this;
        }
        public Long getListenerPort() {
            return this.listenerPort;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigIngressesListeners setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigIngressesListeners setPersistenceTimeout(Long persistenceTimeout) {
            this.persistenceTimeout = persistenceTimeout;
            return this;
        }
        public Long getPersistenceTimeout() {
            return this.persistenceTimeout;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigIngressesListeners setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigIngressesListeners setScheduler(String scheduler) {
            this.scheduler = scheduler;
            return this;
        }
        public String getScheduler() {
            return this.scheduler;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigIngressesListeners setSessionStickyType(Long sessionStickyType) {
            this.sessionStickyType = sessionStickyType;
            return this;
        }
        public Long getSessionStickyType() {
            return this.sessionStickyType;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigIngressesListeners setUnhealthyThreshold(Long unhealthyThreshold) {
            this.unhealthyThreshold = unhealthyThreshold;
            return this;
        }
        public Long getUnhealthyThreshold() {
            return this.unhealthyThreshold;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigIngressesListeners setXforwardFor(Boolean xforwardFor) {
            this.xforwardFor = xforwardFor;
            return this;
        }
        public Boolean getXforwardFor() {
            return this.xforwardFor;
        }

    }

    public static class QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigIngressesListenersV2 extends TeaModel {
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

        public static QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigIngressesListenersV2 build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigIngressesListenersV2 self = new QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigIngressesListenersV2();
            return TeaModel.build(map, self);
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigIngressesListenersV2 setBackendServerPort(Long backendServerPort) {
            this.backendServerPort = backendServerPort;
            return this;
        }
        public Long getBackendServerPort() {
            return this.backendServerPort;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigIngressesListenersV2 setBandWidth(Long bandWidth) {
            this.bandWidth = bandWidth;
            return this;
        }
        public Long getBandWidth() {
            return this.bandWidth;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigIngressesListenersV2 setCaCertificateId(String caCertificateId) {
            this.caCertificateId = caCertificateId;
            return this;
        }
        public String getCaCertificateId() {
            return this.caCertificateId;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigIngressesListenersV2 setCookie(String cookie) {
            this.cookie = cookie;
            return this;
        }
        public String getCookie() {
            return this.cookie;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigIngressesListenersV2 setCookieTimeout(Long cookieTimeout) {
            this.cookieTimeout = cookieTimeout;
            return this;
        }
        public Long getCookieTimeout() {
            return this.cookieTimeout;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigIngressesListenersV2 setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigIngressesListenersV2 setEstablishedTimeout(Long establishedTimeout) {
            this.establishedTimeout = establishedTimeout;
            return this;
        }
        public Long getEstablishedTimeout() {
            return this.establishedTimeout;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigIngressesListenersV2 setHealthyThreshold(Long healthyThreshold) {
            this.healthyThreshold = healthyThreshold;
            return this;
        }
        public Long getHealthyThreshold() {
            return this.healthyThreshold;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigIngressesListenersV2 setHealthCheck(String healthCheck) {
            this.healthCheck = healthCheck;
            return this;
        }
        public String getHealthCheck() {
            return this.healthCheck;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigIngressesListenersV2 setHealthCheckConnectPort(Long healthCheckConnectPort) {
            this.healthCheckConnectPort = healthCheckConnectPort;
            return this;
        }
        public Long getHealthCheckConnectPort() {
            return this.healthCheckConnectPort;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigIngressesListenersV2 setHealthCheckConnectTimeout(Long healthCheckConnectTimeout) {
            this.healthCheckConnectTimeout = healthCheckConnectTimeout;
            return this;
        }
        public Long getHealthCheckConnectTimeout() {
            return this.healthCheckConnectTimeout;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigIngressesListenersV2 setHealthCheckDomain(String healthCheckDomain) {
            this.healthCheckDomain = healthCheckDomain;
            return this;
        }
        public String getHealthCheckDomain() {
            return this.healthCheckDomain;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigIngressesListenersV2 setHealthCheckHttpCode(String healthCheckHttpCode) {
            this.healthCheckHttpCode = healthCheckHttpCode;
            return this;
        }
        public String getHealthCheckHttpCode() {
            return this.healthCheckHttpCode;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigIngressesListenersV2 setHealthCheckInterval(Long healthCheckInterval) {
            this.healthCheckInterval = healthCheckInterval;
            return this;
        }
        public Long getHealthCheckInterval() {
            return this.healthCheckInterval;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigIngressesListenersV2 setHealthCheckThreshold(Long healthCheckThreshold) {
            this.healthCheckThreshold = healthCheckThreshold;
            return this;
        }
        public Long getHealthCheckThreshold() {
            return this.healthCheckThreshold;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigIngressesListenersV2 setHealthCheckTimeout(Long healthCheckTimeout) {
            this.healthCheckTimeout = healthCheckTimeout;
            return this;
        }
        public Long getHealthCheckTimeout() {
            return this.healthCheckTimeout;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigIngressesListenersV2 setHealthCheckUri(String healthCheckUri) {
            this.healthCheckUri = healthCheckUri;
            return this;
        }
        public String getHealthCheckUri() {
            return this.healthCheckUri;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigIngressesListenersV2 setListenerPort(Long listenerPort) {
            this.listenerPort = listenerPort;
            return this;
        }
        public Long getListenerPort() {
            return this.listenerPort;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigIngressesListenersV2 setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigIngressesListenersV2 setPersistenceTimeout(Long persistenceTimeout) {
            this.persistenceTimeout = persistenceTimeout;
            return this;
        }
        public Long getPersistenceTimeout() {
            return this.persistenceTimeout;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigIngressesListenersV2 setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigIngressesListenersV2 setScheduler(String scheduler) {
            this.scheduler = scheduler;
            return this;
        }
        public String getScheduler() {
            return this.scheduler;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigIngressesListenersV2 setSessionStickyType(Long sessionStickyType) {
            this.sessionStickyType = sessionStickyType;
            return this;
        }
        public Long getSessionStickyType() {
            return this.sessionStickyType;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigIngressesListenersV2 setUnhealthyThreshold(Long unhealthyThreshold) {
            this.unhealthyThreshold = unhealthyThreshold;
            return this;
        }
        public Long getUnhealthyThreshold() {
            return this.unhealthyThreshold;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigIngressesListenersV2 setXforwardFor(Boolean xforwardFor) {
            this.xforwardFor = xforwardFor;
            return this;
        }
        public Boolean getXforwardFor() {
            return this.xforwardFor;
        }

    }

    public static class QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigIngresses extends TeaModel {
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
        public java.util.List<QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigIngressesListeners> listeners;

        @NameInMap("ListenersV2")
        public java.util.List<QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigIngressesListenersV2> listenersV2;

        public static QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigIngresses build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigIngresses self = new QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigIngresses();
            return TeaModel.build(map, self);
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigIngresses setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigIngresses setLoadBalancerIaasId(String loadBalancerIaasId) {
            this.loadBalancerIaasId = loadBalancerIaasId;
            return this;
        }
        public String getLoadBalancerIaasId() {
            return this.loadBalancerIaasId;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigIngresses setLoadBalancerName(String loadBalancerName) {
            this.loadBalancerName = loadBalancerName;
            return this;
        }
        public String getLoadBalancerName() {
            return this.loadBalancerName;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigIngresses setLoadBalancerType(String loadBalancerType) {
            this.loadBalancerType = loadBalancerType;
            return this;
        }
        public String getLoadBalancerType() {
            return this.loadBalancerType;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigIngresses setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigIngresses setSpannerClusterId(String spannerClusterId) {
            this.spannerClusterId = spannerClusterId;
            return this;
        }
        public String getSpannerClusterId() {
            return this.spannerClusterId;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigIngresses setUnifiedAccessInstanceName(String unifiedAccessInstanceName) {
            this.unifiedAccessInstanceName = unifiedAccessInstanceName;
            return this;
        }
        public String getUnifiedAccessInstanceName() {
            return this.unifiedAccessInstanceName;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigIngresses setUnifiedAccessRouteRule(String unifiedAccessRouteRule) {
            this.unifiedAccessRouteRule = unifiedAccessRouteRule;
            return this;
        }
        public String getUnifiedAccessRouteRule() {
            return this.unifiedAccessRouteRule;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigIngresses setUnifiedAccessEntries(java.util.List<String> unifiedAccessEntries) {
            this.unifiedAccessEntries = unifiedAccessEntries;
            return this;
        }
        public java.util.List<String> getUnifiedAccessEntries() {
            return this.unifiedAccessEntries;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigIngresses setListeners(java.util.List<QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigIngressesListeners> listeners) {
            this.listeners = listeners;
            return this;
        }
        public java.util.List<QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigIngressesListeners> getListeners() {
            return this.listeners;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigIngresses setListenersV2(java.util.List<QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigIngressesListenersV2> listenersV2) {
            this.listenersV2 = listenersV2;
            return this;
        }
        public java.util.List<QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigIngressesListenersV2> getListenersV2() {
            return this.listenersV2;
        }

    }

    public static class QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigInnerLoadBalancerServicesCellSlbIaasIdMap extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigInnerLoadBalancerServicesCellSlbIaasIdMap build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigInnerLoadBalancerServicesCellSlbIaasIdMap self = new QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigInnerLoadBalancerServicesCellSlbIaasIdMap();
            return TeaModel.build(map, self);
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigInnerLoadBalancerServicesCellSlbIaasIdMap setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigInnerLoadBalancerServicesCellSlbIaasIdMap setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigInnerLoadBalancerServicesListeners extends TeaModel {
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

        public static QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigInnerLoadBalancerServicesListeners build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigInnerLoadBalancerServicesListeners self = new QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigInnerLoadBalancerServicesListeners();
            return TeaModel.build(map, self);
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigInnerLoadBalancerServicesListeners setBackendServerPort(Long backendServerPort) {
            this.backendServerPort = backendServerPort;
            return this;
        }
        public Long getBackendServerPort() {
            return this.backendServerPort;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigInnerLoadBalancerServicesListeners setBandWidth(Long bandWidth) {
            this.bandWidth = bandWidth;
            return this;
        }
        public Long getBandWidth() {
            return this.bandWidth;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigInnerLoadBalancerServicesListeners setCaCertificateId(String caCertificateId) {
            this.caCertificateId = caCertificateId;
            return this;
        }
        public String getCaCertificateId() {
            return this.caCertificateId;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigInnerLoadBalancerServicesListeners setCookie(String cookie) {
            this.cookie = cookie;
            return this;
        }
        public String getCookie() {
            return this.cookie;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigInnerLoadBalancerServicesListeners setCookieTimeout(Long cookieTimeout) {
            this.cookieTimeout = cookieTimeout;
            return this;
        }
        public Long getCookieTimeout() {
            return this.cookieTimeout;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigInnerLoadBalancerServicesListeners setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigInnerLoadBalancerServicesListeners setEstablishedTimeout(Long establishedTimeout) {
            this.establishedTimeout = establishedTimeout;
            return this;
        }
        public Long getEstablishedTimeout() {
            return this.establishedTimeout;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigInnerLoadBalancerServicesListeners setHealthyThreshold(Long healthyThreshold) {
            this.healthyThreshold = healthyThreshold;
            return this;
        }
        public Long getHealthyThreshold() {
            return this.healthyThreshold;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigInnerLoadBalancerServicesListeners setHealthCheck(String healthCheck) {
            this.healthCheck = healthCheck;
            return this;
        }
        public String getHealthCheck() {
            return this.healthCheck;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigInnerLoadBalancerServicesListeners setHealthCheckConnectPort(Long healthCheckConnectPort) {
            this.healthCheckConnectPort = healthCheckConnectPort;
            return this;
        }
        public Long getHealthCheckConnectPort() {
            return this.healthCheckConnectPort;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigInnerLoadBalancerServicesListeners setHealthCheckConnectTimeout(Long healthCheckConnectTimeout) {
            this.healthCheckConnectTimeout = healthCheckConnectTimeout;
            return this;
        }
        public Long getHealthCheckConnectTimeout() {
            return this.healthCheckConnectTimeout;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigInnerLoadBalancerServicesListeners setHealthCheckDomain(String healthCheckDomain) {
            this.healthCheckDomain = healthCheckDomain;
            return this;
        }
        public String getHealthCheckDomain() {
            return this.healthCheckDomain;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigInnerLoadBalancerServicesListeners setHealthCheckHttpCode(String healthCheckHttpCode) {
            this.healthCheckHttpCode = healthCheckHttpCode;
            return this;
        }
        public String getHealthCheckHttpCode() {
            return this.healthCheckHttpCode;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigInnerLoadBalancerServicesListeners setHealthCheckInterval(Long healthCheckInterval) {
            this.healthCheckInterval = healthCheckInterval;
            return this;
        }
        public Long getHealthCheckInterval() {
            return this.healthCheckInterval;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigInnerLoadBalancerServicesListeners setHealthCheckThreshold(Long healthCheckThreshold) {
            this.healthCheckThreshold = healthCheckThreshold;
            return this;
        }
        public Long getHealthCheckThreshold() {
            return this.healthCheckThreshold;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigInnerLoadBalancerServicesListeners setHealthCheckTimeout(Long healthCheckTimeout) {
            this.healthCheckTimeout = healthCheckTimeout;
            return this;
        }
        public Long getHealthCheckTimeout() {
            return this.healthCheckTimeout;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigInnerLoadBalancerServicesListeners setHealthCheckUri(String healthCheckUri) {
            this.healthCheckUri = healthCheckUri;
            return this;
        }
        public String getHealthCheckUri() {
            return this.healthCheckUri;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigInnerLoadBalancerServicesListeners setListenerPort(Long listenerPort) {
            this.listenerPort = listenerPort;
            return this;
        }
        public Long getListenerPort() {
            return this.listenerPort;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigInnerLoadBalancerServicesListeners setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigInnerLoadBalancerServicesListeners setPersistenceTimeout(Long persistenceTimeout) {
            this.persistenceTimeout = persistenceTimeout;
            return this;
        }
        public Long getPersistenceTimeout() {
            return this.persistenceTimeout;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigInnerLoadBalancerServicesListeners setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigInnerLoadBalancerServicesListeners setScheduler(String scheduler) {
            this.scheduler = scheduler;
            return this;
        }
        public String getScheduler() {
            return this.scheduler;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigInnerLoadBalancerServicesListeners setSessionStickyType(Long sessionStickyType) {
            this.sessionStickyType = sessionStickyType;
            return this;
        }
        public Long getSessionStickyType() {
            return this.sessionStickyType;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigInnerLoadBalancerServicesListeners setUnhealthyThreshold(Long unhealthyThreshold) {
            this.unhealthyThreshold = unhealthyThreshold;
            return this;
        }
        public Long getUnhealthyThreshold() {
            return this.unhealthyThreshold;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigInnerLoadBalancerServicesListeners setXforwardFor(Boolean xforwardFor) {
            this.xforwardFor = xforwardFor;
            return this;
        }
        public Boolean getXforwardFor() {
            return this.xforwardFor;
        }

    }

    public static class QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigInnerLoadBalancerServices extends TeaModel {
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
        public java.util.List<QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigInnerLoadBalancerServicesCellSlbIaasIdMap> cellSlbIaasIdMap;

        @NameInMap("Listeners")
        public java.util.List<QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigInnerLoadBalancerServicesListeners> listeners;

        public static QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigInnerLoadBalancerServices build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigInnerLoadBalancerServices self = new QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigInnerLoadBalancerServices();
            return TeaModel.build(map, self);
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigInnerLoadBalancerServices setAddressType(String addressType) {
            this.addressType = addressType;
            return this;
        }
        public String getAddressType() {
            return this.addressType;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigInnerLoadBalancerServices setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigInnerLoadBalancerServices setLoadBalancerIaasId(String loadBalancerIaasId) {
            this.loadBalancerIaasId = loadBalancerIaasId;
            return this;
        }
        public String getLoadBalancerIaasId() {
            return this.loadBalancerIaasId;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigInnerLoadBalancerServices setLoadBalancerName(String loadBalancerName) {
            this.loadBalancerName = loadBalancerName;
            return this;
        }
        public String getLoadBalancerName() {
            return this.loadBalancerName;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigInnerLoadBalancerServices setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigInnerLoadBalancerServices setSpannerClusterId(String spannerClusterId) {
            this.spannerClusterId = spannerClusterId;
            return this;
        }
        public String getSpannerClusterId() {
            return this.spannerClusterId;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigInnerLoadBalancerServices setCellSlbIaasIdMap(java.util.List<QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigInnerLoadBalancerServicesCellSlbIaasIdMap> cellSlbIaasIdMap) {
            this.cellSlbIaasIdMap = cellSlbIaasIdMap;
            return this;
        }
        public java.util.List<QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigInnerLoadBalancerServicesCellSlbIaasIdMap> getCellSlbIaasIdMap() {
            return this.cellSlbIaasIdMap;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigInnerLoadBalancerServices setListeners(java.util.List<QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigInnerLoadBalancerServicesListeners> listeners) {
            this.listeners = listeners;
            return this;
        }
        public java.util.List<QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigInnerLoadBalancerServicesListeners> getListeners() {
            return this.listeners;
        }

    }

    public static class QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigLoadBalancerServicesCellSlbIaasIdMap extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigLoadBalancerServicesCellSlbIaasIdMap build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigLoadBalancerServicesCellSlbIaasIdMap self = new QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigLoadBalancerServicesCellSlbIaasIdMap();
            return TeaModel.build(map, self);
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigLoadBalancerServicesCellSlbIaasIdMap setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigLoadBalancerServicesCellSlbIaasIdMap setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigLoadBalancerServicesListeners extends TeaModel {
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

        public static QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigLoadBalancerServicesListeners build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigLoadBalancerServicesListeners self = new QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigLoadBalancerServicesListeners();
            return TeaModel.build(map, self);
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigLoadBalancerServicesListeners setBackendServerPort(Long backendServerPort) {
            this.backendServerPort = backendServerPort;
            return this;
        }
        public Long getBackendServerPort() {
            return this.backendServerPort;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigLoadBalancerServicesListeners setBandWidth(Long bandWidth) {
            this.bandWidth = bandWidth;
            return this;
        }
        public Long getBandWidth() {
            return this.bandWidth;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigLoadBalancerServicesListeners setCaCertificateId(String caCertificateId) {
            this.caCertificateId = caCertificateId;
            return this;
        }
        public String getCaCertificateId() {
            return this.caCertificateId;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigLoadBalancerServicesListeners setCookie(String cookie) {
            this.cookie = cookie;
            return this;
        }
        public String getCookie() {
            return this.cookie;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigLoadBalancerServicesListeners setCookieTimeout(Long cookieTimeout) {
            this.cookieTimeout = cookieTimeout;
            return this;
        }
        public Long getCookieTimeout() {
            return this.cookieTimeout;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigLoadBalancerServicesListeners setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigLoadBalancerServicesListeners setEstablishedTimeout(Long establishedTimeout) {
            this.establishedTimeout = establishedTimeout;
            return this;
        }
        public Long getEstablishedTimeout() {
            return this.establishedTimeout;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigLoadBalancerServicesListeners setHealthyThreshold(Long healthyThreshold) {
            this.healthyThreshold = healthyThreshold;
            return this;
        }
        public Long getHealthyThreshold() {
            return this.healthyThreshold;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigLoadBalancerServicesListeners setHealthCheck(String healthCheck) {
            this.healthCheck = healthCheck;
            return this;
        }
        public String getHealthCheck() {
            return this.healthCheck;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigLoadBalancerServicesListeners setHealthCheckConnectPort(Long healthCheckConnectPort) {
            this.healthCheckConnectPort = healthCheckConnectPort;
            return this;
        }
        public Long getHealthCheckConnectPort() {
            return this.healthCheckConnectPort;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigLoadBalancerServicesListeners setHealthCheckConnectTimeout(Long healthCheckConnectTimeout) {
            this.healthCheckConnectTimeout = healthCheckConnectTimeout;
            return this;
        }
        public Long getHealthCheckConnectTimeout() {
            return this.healthCheckConnectTimeout;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigLoadBalancerServicesListeners setHealthCheckDomain(String healthCheckDomain) {
            this.healthCheckDomain = healthCheckDomain;
            return this;
        }
        public String getHealthCheckDomain() {
            return this.healthCheckDomain;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigLoadBalancerServicesListeners setHealthCheckHttpCode(String healthCheckHttpCode) {
            this.healthCheckHttpCode = healthCheckHttpCode;
            return this;
        }
        public String getHealthCheckHttpCode() {
            return this.healthCheckHttpCode;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigLoadBalancerServicesListeners setHealthCheckInterval(Long healthCheckInterval) {
            this.healthCheckInterval = healthCheckInterval;
            return this;
        }
        public Long getHealthCheckInterval() {
            return this.healthCheckInterval;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigLoadBalancerServicesListeners setHealthCheckThreshold(Long healthCheckThreshold) {
            this.healthCheckThreshold = healthCheckThreshold;
            return this;
        }
        public Long getHealthCheckThreshold() {
            return this.healthCheckThreshold;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigLoadBalancerServicesListeners setHealthCheckTimeout(Long healthCheckTimeout) {
            this.healthCheckTimeout = healthCheckTimeout;
            return this;
        }
        public Long getHealthCheckTimeout() {
            return this.healthCheckTimeout;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigLoadBalancerServicesListeners setHealthCheckUri(String healthCheckUri) {
            this.healthCheckUri = healthCheckUri;
            return this;
        }
        public String getHealthCheckUri() {
            return this.healthCheckUri;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigLoadBalancerServicesListeners setListenerPort(Long listenerPort) {
            this.listenerPort = listenerPort;
            return this;
        }
        public Long getListenerPort() {
            return this.listenerPort;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigLoadBalancerServicesListeners setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigLoadBalancerServicesListeners setPersistenceTimeout(Long persistenceTimeout) {
            this.persistenceTimeout = persistenceTimeout;
            return this;
        }
        public Long getPersistenceTimeout() {
            return this.persistenceTimeout;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigLoadBalancerServicesListeners setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigLoadBalancerServicesListeners setScheduler(String scheduler) {
            this.scheduler = scheduler;
            return this;
        }
        public String getScheduler() {
            return this.scheduler;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigLoadBalancerServicesListeners setSessionStickyType(Long sessionStickyType) {
            this.sessionStickyType = sessionStickyType;
            return this;
        }
        public Long getSessionStickyType() {
            return this.sessionStickyType;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigLoadBalancerServicesListeners setUnhealthyThreshold(Long unhealthyThreshold) {
            this.unhealthyThreshold = unhealthyThreshold;
            return this;
        }
        public Long getUnhealthyThreshold() {
            return this.unhealthyThreshold;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigLoadBalancerServicesListeners setXforwardFor(Boolean xforwardFor) {
            this.xforwardFor = xforwardFor;
            return this;
        }
        public Boolean getXforwardFor() {
            return this.xforwardFor;
        }

    }

    public static class QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigLoadBalancerServices extends TeaModel {
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
        public java.util.List<QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigLoadBalancerServicesCellSlbIaasIdMap> cellSlbIaasIdMap;

        @NameInMap("Listeners")
        public java.util.List<QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigLoadBalancerServicesListeners> listeners;

        public static QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigLoadBalancerServices build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigLoadBalancerServices self = new QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigLoadBalancerServices();
            return TeaModel.build(map, self);
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigLoadBalancerServices setAddressType(String addressType) {
            this.addressType = addressType;
            return this;
        }
        public String getAddressType() {
            return this.addressType;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigLoadBalancerServices setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigLoadBalancerServices setLoadBalancerIaasId(String loadBalancerIaasId) {
            this.loadBalancerIaasId = loadBalancerIaasId;
            return this;
        }
        public String getLoadBalancerIaasId() {
            return this.loadBalancerIaasId;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigLoadBalancerServices setLoadBalancerName(String loadBalancerName) {
            this.loadBalancerName = loadBalancerName;
            return this;
        }
        public String getLoadBalancerName() {
            return this.loadBalancerName;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigLoadBalancerServices setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigLoadBalancerServices setSpannerClusterId(String spannerClusterId) {
            this.spannerClusterId = spannerClusterId;
            return this;
        }
        public String getSpannerClusterId() {
            return this.spannerClusterId;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigLoadBalancerServices setCellSlbIaasIdMap(java.util.List<QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigLoadBalancerServicesCellSlbIaasIdMap> cellSlbIaasIdMap) {
            this.cellSlbIaasIdMap = cellSlbIaasIdMap;
            return this;
        }
        public java.util.List<QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigLoadBalancerServicesCellSlbIaasIdMap> getCellSlbIaasIdMap() {
            return this.cellSlbIaasIdMap;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigLoadBalancerServices setListeners(java.util.List<QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigLoadBalancerServicesListeners> listeners) {
            this.listeners = listeners;
            return this;
        }
        public java.util.List<QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigLoadBalancerServicesListeners> getListeners() {
            return this.listeners;
        }

    }

    public static class QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigPublicLoadBalancerServicesCellSlbIaasIdMap extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigPublicLoadBalancerServicesCellSlbIaasIdMap build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigPublicLoadBalancerServicesCellSlbIaasIdMap self = new QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigPublicLoadBalancerServicesCellSlbIaasIdMap();
            return TeaModel.build(map, self);
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigPublicLoadBalancerServicesCellSlbIaasIdMap setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigPublicLoadBalancerServicesCellSlbIaasIdMap setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigPublicLoadBalancerServicesListeners extends TeaModel {
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

        public static QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigPublicLoadBalancerServicesListeners build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigPublicLoadBalancerServicesListeners self = new QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigPublicLoadBalancerServicesListeners();
            return TeaModel.build(map, self);
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigPublicLoadBalancerServicesListeners setBackendServerPort(Long backendServerPort) {
            this.backendServerPort = backendServerPort;
            return this;
        }
        public Long getBackendServerPort() {
            return this.backendServerPort;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigPublicLoadBalancerServicesListeners setBandWidth(Long bandWidth) {
            this.bandWidth = bandWidth;
            return this;
        }
        public Long getBandWidth() {
            return this.bandWidth;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigPublicLoadBalancerServicesListeners setCaCertificateId(String caCertificateId) {
            this.caCertificateId = caCertificateId;
            return this;
        }
        public String getCaCertificateId() {
            return this.caCertificateId;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigPublicLoadBalancerServicesListeners setCookie(String cookie) {
            this.cookie = cookie;
            return this;
        }
        public String getCookie() {
            return this.cookie;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigPublicLoadBalancerServicesListeners setCookieTimeout(Long cookieTimeout) {
            this.cookieTimeout = cookieTimeout;
            return this;
        }
        public Long getCookieTimeout() {
            return this.cookieTimeout;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigPublicLoadBalancerServicesListeners setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigPublicLoadBalancerServicesListeners setEstablishedTimeout(Long establishedTimeout) {
            this.establishedTimeout = establishedTimeout;
            return this;
        }
        public Long getEstablishedTimeout() {
            return this.establishedTimeout;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigPublicLoadBalancerServicesListeners setHealthyThreshold(Long healthyThreshold) {
            this.healthyThreshold = healthyThreshold;
            return this;
        }
        public Long getHealthyThreshold() {
            return this.healthyThreshold;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigPublicLoadBalancerServicesListeners setHealthCheck(String healthCheck) {
            this.healthCheck = healthCheck;
            return this;
        }
        public String getHealthCheck() {
            return this.healthCheck;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigPublicLoadBalancerServicesListeners setHealthCheckConnectPort(Long healthCheckConnectPort) {
            this.healthCheckConnectPort = healthCheckConnectPort;
            return this;
        }
        public Long getHealthCheckConnectPort() {
            return this.healthCheckConnectPort;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigPublicLoadBalancerServicesListeners setHealthCheckConnectTimeout(Long healthCheckConnectTimeout) {
            this.healthCheckConnectTimeout = healthCheckConnectTimeout;
            return this;
        }
        public Long getHealthCheckConnectTimeout() {
            return this.healthCheckConnectTimeout;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigPublicLoadBalancerServicesListeners setHealthCheckDomain(String healthCheckDomain) {
            this.healthCheckDomain = healthCheckDomain;
            return this;
        }
        public String getHealthCheckDomain() {
            return this.healthCheckDomain;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigPublicLoadBalancerServicesListeners setHealthCheckHttpCode(String healthCheckHttpCode) {
            this.healthCheckHttpCode = healthCheckHttpCode;
            return this;
        }
        public String getHealthCheckHttpCode() {
            return this.healthCheckHttpCode;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigPublicLoadBalancerServicesListeners setHealthCheckInterval(Long healthCheckInterval) {
            this.healthCheckInterval = healthCheckInterval;
            return this;
        }
        public Long getHealthCheckInterval() {
            return this.healthCheckInterval;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigPublicLoadBalancerServicesListeners setHealthCheckThreshold(Long healthCheckThreshold) {
            this.healthCheckThreshold = healthCheckThreshold;
            return this;
        }
        public Long getHealthCheckThreshold() {
            return this.healthCheckThreshold;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigPublicLoadBalancerServicesListeners setHealthCheckTimeout(Long healthCheckTimeout) {
            this.healthCheckTimeout = healthCheckTimeout;
            return this;
        }
        public Long getHealthCheckTimeout() {
            return this.healthCheckTimeout;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigPublicLoadBalancerServicesListeners setHealthCheckUri(String healthCheckUri) {
            this.healthCheckUri = healthCheckUri;
            return this;
        }
        public String getHealthCheckUri() {
            return this.healthCheckUri;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigPublicLoadBalancerServicesListeners setListenerPort(Long listenerPort) {
            this.listenerPort = listenerPort;
            return this;
        }
        public Long getListenerPort() {
            return this.listenerPort;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigPublicLoadBalancerServicesListeners setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigPublicLoadBalancerServicesListeners setPersistenceTimeout(Long persistenceTimeout) {
            this.persistenceTimeout = persistenceTimeout;
            return this;
        }
        public Long getPersistenceTimeout() {
            return this.persistenceTimeout;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigPublicLoadBalancerServicesListeners setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigPublicLoadBalancerServicesListeners setScheduler(String scheduler) {
            this.scheduler = scheduler;
            return this;
        }
        public String getScheduler() {
            return this.scheduler;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigPublicLoadBalancerServicesListeners setSessionStickyType(Long sessionStickyType) {
            this.sessionStickyType = sessionStickyType;
            return this;
        }
        public Long getSessionStickyType() {
            return this.sessionStickyType;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigPublicLoadBalancerServicesListeners setUnhealthyThreshold(Long unhealthyThreshold) {
            this.unhealthyThreshold = unhealthyThreshold;
            return this;
        }
        public Long getUnhealthyThreshold() {
            return this.unhealthyThreshold;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigPublicLoadBalancerServicesListeners setXforwardFor(Boolean xforwardFor) {
            this.xforwardFor = xforwardFor;
            return this;
        }
        public Boolean getXforwardFor() {
            return this.xforwardFor;
        }

    }

    public static class QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigPublicLoadBalancerServices extends TeaModel {
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
        public java.util.List<QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigPublicLoadBalancerServicesCellSlbIaasIdMap> cellSlbIaasIdMap;

        @NameInMap("Listeners")
        public java.util.List<QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigPublicLoadBalancerServicesListeners> listeners;

        public static QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigPublicLoadBalancerServices build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigPublicLoadBalancerServices self = new QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigPublicLoadBalancerServices();
            return TeaModel.build(map, self);
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigPublicLoadBalancerServices setAddressType(String addressType) {
            this.addressType = addressType;
            return this;
        }
        public String getAddressType() {
            return this.addressType;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigPublicLoadBalancerServices setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigPublicLoadBalancerServices setLoadBalancerIaasId(String loadBalancerIaasId) {
            this.loadBalancerIaasId = loadBalancerIaasId;
            return this;
        }
        public String getLoadBalancerIaasId() {
            return this.loadBalancerIaasId;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigPublicLoadBalancerServices setLoadBalancerName(String loadBalancerName) {
            this.loadBalancerName = loadBalancerName;
            return this;
        }
        public String getLoadBalancerName() {
            return this.loadBalancerName;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigPublicLoadBalancerServices setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigPublicLoadBalancerServices setSpannerClusterId(String spannerClusterId) {
            this.spannerClusterId = spannerClusterId;
            return this;
        }
        public String getSpannerClusterId() {
            return this.spannerClusterId;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigPublicLoadBalancerServices setCellSlbIaasIdMap(java.util.List<QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigPublicLoadBalancerServicesCellSlbIaasIdMap> cellSlbIaasIdMap) {
            this.cellSlbIaasIdMap = cellSlbIaasIdMap;
            return this;
        }
        public java.util.List<QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigPublicLoadBalancerServicesCellSlbIaasIdMap> getCellSlbIaasIdMap() {
            return this.cellSlbIaasIdMap;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigPublicLoadBalancerServices setListeners(java.util.List<QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigPublicLoadBalancerServicesListeners> listeners) {
            this.listeners = listeners;
            return this;
        }
        public java.util.List<QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigPublicLoadBalancerServicesListeners> getListeners() {
            return this.listeners;
        }

    }

    public static class QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigSidecarConfigs extends TeaModel {
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

        public static QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigSidecarConfigs build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigSidecarConfigs self = new QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigSidecarConfigs();
            return TeaModel.build(map, self);
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigSidecarConfigs setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigSidecarConfigs setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigSidecarConfigs setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigSidecarConfigs setSidecarName(String sidecarName) {
            this.sidecarName = sidecarName;
            return this;
        }
        public String getSidecarName() {
            return this.sidecarName;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigSidecarConfigs setSidecarVersion(String sidecarVersion) {
            this.sidecarVersion = sidecarVersion;
            return this;
        }
        public String getSidecarVersion() {
            return this.sidecarVersion;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigSidecarConfigs setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigSidecarConfigs setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigSidecarConfigs setWorkspaceGroupId(String workspaceGroupId) {
            this.workspaceGroupId = workspaceGroupId;
            return this;
        }
        public String getWorkspaceGroupId() {
            return this.workspaceGroupId;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigSidecarConfigs setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

    public static class QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigDeployConfigAffinityNodeAffinityMatchExpressions extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("Values")
        public java.util.List<String> values;

        public static QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigDeployConfigAffinityNodeAffinityMatchExpressions build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigDeployConfigAffinityNodeAffinityMatchExpressions self = new QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigDeployConfigAffinityNodeAffinityMatchExpressions();
            return TeaModel.build(map, self);
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigDeployConfigAffinityNodeAffinityMatchExpressions setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigDeployConfigAffinityNodeAffinityMatchExpressions setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigDeployConfigAffinityNodeAffinityMatchExpressions setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigDeployConfigAffinityNodeAffinity extends TeaModel {
        @NameInMap("Requested")
        public Boolean requested;

        @NameInMap("Weight")
        public Long weight;

        @NameInMap("MatchExpressions")
        public java.util.List<QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigDeployConfigAffinityNodeAffinityMatchExpressions> matchExpressions;

        public static QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigDeployConfigAffinityNodeAffinity build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigDeployConfigAffinityNodeAffinity self = new QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigDeployConfigAffinityNodeAffinity();
            return TeaModel.build(map, self);
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigDeployConfigAffinityNodeAffinity setRequested(Boolean requested) {
            this.requested = requested;
            return this;
        }
        public Boolean getRequested() {
            return this.requested;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigDeployConfigAffinityNodeAffinity setWeight(Long weight) {
            this.weight = weight;
            return this;
        }
        public Long getWeight() {
            return this.weight;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigDeployConfigAffinityNodeAffinity setMatchExpressions(java.util.List<QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigDeployConfigAffinityNodeAffinityMatchExpressions> matchExpressions) {
            this.matchExpressions = matchExpressions;
            return this;
        }
        public java.util.List<QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigDeployConfigAffinityNodeAffinityMatchExpressions> getMatchExpressions() {
            return this.matchExpressions;
        }

    }

    public static class QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigDeployConfigAffinityPodAffinityPodAffinityTermLabelSelector extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigDeployConfigAffinityPodAffinityPodAffinityTermLabelSelector build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigDeployConfigAffinityPodAffinityPodAffinityTermLabelSelector self = new QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigDeployConfigAffinityPodAffinityPodAffinityTermLabelSelector();
            return TeaModel.build(map, self);
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigDeployConfigAffinityPodAffinityPodAffinityTermLabelSelector setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigDeployConfigAffinityPodAffinityPodAffinityTermLabelSelector setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigDeployConfigAffinityPodAffinityPodAffinityTerm extends TeaModel {
        @NameInMap("TopologyKey")
        public String topologyKey;

        @NameInMap("Namespaces")
        public java.util.List<String> namespaces;

        @NameInMap("LabelSelector")
        public java.util.List<QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigDeployConfigAffinityPodAffinityPodAffinityTermLabelSelector> labelSelector;

        public static QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigDeployConfigAffinityPodAffinityPodAffinityTerm build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigDeployConfigAffinityPodAffinityPodAffinityTerm self = new QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigDeployConfigAffinityPodAffinityPodAffinityTerm();
            return TeaModel.build(map, self);
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigDeployConfigAffinityPodAffinityPodAffinityTerm setTopologyKey(String topologyKey) {
            this.topologyKey = topologyKey;
            return this;
        }
        public String getTopologyKey() {
            return this.topologyKey;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigDeployConfigAffinityPodAffinityPodAffinityTerm setNamespaces(java.util.List<String> namespaces) {
            this.namespaces = namespaces;
            return this;
        }
        public java.util.List<String> getNamespaces() {
            return this.namespaces;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigDeployConfigAffinityPodAffinityPodAffinityTerm setLabelSelector(java.util.List<QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigDeployConfigAffinityPodAffinityPodAffinityTermLabelSelector> labelSelector) {
            this.labelSelector = labelSelector;
            return this;
        }
        public java.util.List<QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigDeployConfigAffinityPodAffinityPodAffinityTermLabelSelector> getLabelSelector() {
            return this.labelSelector;
        }

    }

    public static class QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigDeployConfigAffinityPodAffinity extends TeaModel {
        @NameInMap("AntiAffinity")
        public Boolean antiAffinity;

        @NameInMap("Requested")
        public Boolean requested;

        @NameInMap("Weight")
        public Long weight;

        @NameInMap("PodAffinityTerm")
        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigDeployConfigAffinityPodAffinityPodAffinityTerm podAffinityTerm;

        public static QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigDeployConfigAffinityPodAffinity build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigDeployConfigAffinityPodAffinity self = new QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigDeployConfigAffinityPodAffinity();
            return TeaModel.build(map, self);
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigDeployConfigAffinityPodAffinity setAntiAffinity(Boolean antiAffinity) {
            this.antiAffinity = antiAffinity;
            return this;
        }
        public Boolean getAntiAffinity() {
            return this.antiAffinity;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigDeployConfigAffinityPodAffinity setRequested(Boolean requested) {
            this.requested = requested;
            return this;
        }
        public Boolean getRequested() {
            return this.requested;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigDeployConfigAffinityPodAffinity setWeight(Long weight) {
            this.weight = weight;
            return this;
        }
        public Long getWeight() {
            return this.weight;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigDeployConfigAffinityPodAffinity setPodAffinityTerm(QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigDeployConfigAffinityPodAffinityPodAffinityTerm podAffinityTerm) {
            this.podAffinityTerm = podAffinityTerm;
            return this;
        }
        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigDeployConfigAffinityPodAffinityPodAffinityTerm getPodAffinityTerm() {
            return this.podAffinityTerm;
        }

    }

    public static class QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigDeployConfigAffinity extends TeaModel {
        @NameInMap("NodeAffinity")
        public java.util.List<QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigDeployConfigAffinityNodeAffinity> nodeAffinity;

        @NameInMap("PodAffinity")
        public java.util.List<QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigDeployConfigAffinityPodAffinity> podAffinity;

        public static QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigDeployConfigAffinity build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigDeployConfigAffinity self = new QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigDeployConfigAffinity();
            return TeaModel.build(map, self);
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigDeployConfigAffinity setNodeAffinity(java.util.List<QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigDeployConfigAffinityNodeAffinity> nodeAffinity) {
            this.nodeAffinity = nodeAffinity;
            return this;
        }
        public java.util.List<QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigDeployConfigAffinityNodeAffinity> getNodeAffinity() {
            return this.nodeAffinity;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigDeployConfigAffinity setPodAffinity(java.util.List<QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigDeployConfigAffinityPodAffinity> podAffinity) {
            this.podAffinity = podAffinity;
            return this;
        }
        public java.util.List<QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigDeployConfigAffinityPodAffinity> getPodAffinity() {
            return this.podAffinity;
        }

    }

    public static class QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigDeployConfig extends TeaModel {
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
        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigDeployConfigAffinity affinity;

        public static QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigDeployConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigDeployConfig self = new QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigDeployConfig();
            return TeaModel.build(map, self);
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigDeployConfig setAnnotations(String annotations) {
            this.annotations = annotations;
            return this;
        }
        public String getAnnotations() {
            return this.annotations;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigDeployConfig setCustomLabels(String customLabels) {
            this.customLabels = customLabels;
            return this;
        }
        public String getCustomLabels() {
            return this.customLabels;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigDeployConfig setEnableSofaMesh(Boolean enableSofaMesh) {
            this.enableSofaMesh = enableSofaMesh;
            return this;
        }
        public Boolean getEnableSofaMesh() {
            return this.enableSofaMesh;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigDeployConfig setGroupCount(Long groupCount) {
            this.groupCount = groupCount;
            return this;
        }
        public Long getGroupCount() {
            return this.groupCount;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigDeployConfig setGroupStrategy(String groupStrategy) {
            this.groupStrategy = groupStrategy;
            return this;
        }
        public String getGroupStrategy() {
            return this.groupStrategy;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigDeployConfig setLabels(String labels) {
            this.labels = labels;
            return this;
        }
        public String getLabels() {
            return this.labels;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigDeployConfig setMaxGroupCapacity(Long maxGroupCapacity) {
            this.maxGroupCapacity = maxGroupCapacity;
            return this;
        }
        public Long getMaxGroupCapacity() {
            return this.maxGroupCapacity;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigDeployConfig setNeedBeta(Boolean needBeta) {
            this.needBeta = needBeta;
            return this;
        }
        public Boolean getNeedBeta() {
            return this.needBeta;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigDeployConfig setNeedConfirm(Boolean needConfirm) {
            this.needConfirm = needConfirm;
            return this;
        }
        public Boolean getNeedConfirm() {
            return this.needConfirm;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigDeployConfig setAffinity(QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigDeployConfigAffinity affinity) {
            this.affinity = affinity;
            return this;
        }
        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigDeployConfigAffinity getAffinity() {
            return this.affinity;
        }

    }

    public static class QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigElasticConfigFixedReplicaReplicas extends TeaModel {
        @NameInMap("Count")
        public Long count;

        @NameInMap("Name")
        public String name;

        @NameInMap("Type")
        public String type;

        public static QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigElasticConfigFixedReplicaReplicas build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigElasticConfigFixedReplicaReplicas self = new QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigElasticConfigFixedReplicaReplicas();
            return TeaModel.build(map, self);
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigElasticConfigFixedReplicaReplicas setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigElasticConfigFixedReplicaReplicas setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigElasticConfigFixedReplicaReplicas setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigElasticConfigFixedReplica extends TeaModel {
        @NameInMap("Replicas")
        public java.util.List<QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigElasticConfigFixedReplicaReplicas> replicas;

        public static QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigElasticConfigFixedReplica build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigElasticConfigFixedReplica self = new QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigElasticConfigFixedReplica();
            return TeaModel.build(map, self);
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigElasticConfigFixedReplica setReplicas(java.util.List<QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigElasticConfigFixedReplicaReplicas> replicas) {
            this.replicas = replicas;
            return this;
        }
        public java.util.List<QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigElasticConfigFixedReplicaReplicas> getReplicas() {
            return this.replicas;
        }

    }

    public static class QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigElasticConfig extends TeaModel {
        @NameInMap("FixedReplica")
        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigElasticConfigFixedReplica fixedReplica;

        public static QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigElasticConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigElasticConfig self = new QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigElasticConfig();
            return TeaModel.build(map, self);
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigElasticConfig setFixedReplica(QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigElasticConfigFixedReplica fixedReplica) {
            this.fixedReplica = fixedReplica;
            return this;
        }
        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigElasticConfigFixedReplica getFixedReplica() {
            return this.fixedReplica;
        }

    }

    public static class QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfig extends TeaModel {
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
        public java.util.List<QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigClusterIpServices> clusterIpServices;

        @NameInMap("ContainerSpecs")
        public java.util.List<QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecs> containerSpecs;

        @NameInMap("Ingresses")
        public java.util.List<QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigIngresses> ingresses;

        @NameInMap("InnerLoadBalancerServices")
        public java.util.List<QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigInnerLoadBalancerServices> innerLoadBalancerServices;

        @NameInMap("LoadBalancerServices")
        public java.util.List<QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigLoadBalancerServices> loadBalancerServices;

        @NameInMap("PublicLoadBalancerServices")
        public java.util.List<QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigPublicLoadBalancerServices> publicLoadBalancerServices;

        @NameInMap("SidecarConfigs")
        public java.util.List<QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigSidecarConfigs> sidecarConfigs;

        @NameInMap("DeployConfig")
        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigDeployConfig deployConfig;

        @NameInMap("ElasticConfig")
        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigElasticConfig elasticConfig;

        public static QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfig self = new QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfig();
            return TeaModel.build(map, self);
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfig setEnableBizMonitor(Boolean enableBizMonitor) {
            this.enableBizMonitor = enableBizMonitor;
            return this;
        }
        public Boolean getEnableBizMonitor() {
            return this.enableBizMonitor;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfig setEnableLogConfig(Boolean enableLogConfig) {
            this.enableLogConfig = enableLogConfig;
            return this;
        }
        public Boolean getEnableLogConfig() {
            return this.enableLogConfig;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfig setEnableSofaMesh(Boolean enableSofaMesh) {
            this.enableSofaMesh = enableSofaMesh;
            return this;
        }
        public Boolean getEnableSofaMesh() {
            return this.enableSofaMesh;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfig setUseHostNetwork(Boolean useHostNetwork) {
            this.useHostNetwork = useHostNetwork;
            return this;
        }
        public Boolean getUseHostNetwork() {
            return this.useHostNetwork;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfig setBizMonitorPaths(java.util.List<String> bizMonitorPaths) {
            this.bizMonitorPaths = bizMonitorPaths;
            return this;
        }
        public java.util.List<String> getBizMonitorPaths() {
            return this.bizMonitorPaths;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfig setClusterIpServices(java.util.List<QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigClusterIpServices> clusterIpServices) {
            this.clusterIpServices = clusterIpServices;
            return this;
        }
        public java.util.List<QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigClusterIpServices> getClusterIpServices() {
            return this.clusterIpServices;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfig setContainerSpecs(java.util.List<QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecs> containerSpecs) {
            this.containerSpecs = containerSpecs;
            return this;
        }
        public java.util.List<QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigContainerSpecs> getContainerSpecs() {
            return this.containerSpecs;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfig setIngresses(java.util.List<QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigIngresses> ingresses) {
            this.ingresses = ingresses;
            return this;
        }
        public java.util.List<QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigIngresses> getIngresses() {
            return this.ingresses;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfig setInnerLoadBalancerServices(java.util.List<QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigInnerLoadBalancerServices> innerLoadBalancerServices) {
            this.innerLoadBalancerServices = innerLoadBalancerServices;
            return this;
        }
        public java.util.List<QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigInnerLoadBalancerServices> getInnerLoadBalancerServices() {
            return this.innerLoadBalancerServices;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfig setLoadBalancerServices(java.util.List<QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigLoadBalancerServices> loadBalancerServices) {
            this.loadBalancerServices = loadBalancerServices;
            return this;
        }
        public java.util.List<QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigLoadBalancerServices> getLoadBalancerServices() {
            return this.loadBalancerServices;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfig setPublicLoadBalancerServices(java.util.List<QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigPublicLoadBalancerServices> publicLoadBalancerServices) {
            this.publicLoadBalancerServices = publicLoadBalancerServices;
            return this;
        }
        public java.util.List<QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigPublicLoadBalancerServices> getPublicLoadBalancerServices() {
            return this.publicLoadBalancerServices;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfig setSidecarConfigs(java.util.List<QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigSidecarConfigs> sidecarConfigs) {
            this.sidecarConfigs = sidecarConfigs;
            return this;
        }
        public java.util.List<QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigSidecarConfigs> getSidecarConfigs() {
            return this.sidecarConfigs;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfig setDeployConfig(QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigDeployConfig deployConfig) {
            this.deployConfig = deployConfig;
            return this;
        }
        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigDeployConfig getDeployConfig() {
            return this.deployConfig;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfig setElasticConfig(QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigElasticConfig elasticConfig) {
            this.elasticConfig = elasticConfig;
            return this;
        }
        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfigElasticConfig getElasticConfig() {
            return this.elasticConfig;
        }

    }

    public static class QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceReleaseInfo extends TeaModel {
        @NameInMap("CreatedPlanId")
        public String createdPlanId;

        @NameInMap("LatestDeploymentEndTime")
        public String latestDeploymentEndTime;

        @NameInMap("LatestDeploymentStartTime")
        public String latestDeploymentStartTime;

        public static QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceReleaseInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceReleaseInfo self = new QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceReleaseInfo();
            return TeaModel.build(map, self);
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceReleaseInfo setCreatedPlanId(String createdPlanId) {
            this.createdPlanId = createdPlanId;
            return this;
        }
        public String getCreatedPlanId() {
            return this.createdPlanId;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceReleaseInfo setLatestDeploymentEndTime(String latestDeploymentEndTime) {
            this.latestDeploymentEndTime = latestDeploymentEndTime;
            return this;
        }
        public String getLatestDeploymentEndTime() {
            return this.latestDeploymentEndTime;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceReleaseInfo setLatestDeploymentStartTime(String latestDeploymentStartTime) {
            this.latestDeploymentStartTime = latestDeploymentStartTime;
            return this;
        }
        public String getLatestDeploymentStartTime() {
            return this.latestDeploymentStartTime;
        }

    }

    public static class QueryLDCContainerServiceRevisionResponseBodyRevisionList extends TeaModel {
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
        public QueryLDCContainerServiceRevisionResponseBodyRevisionListAppInfo appInfo;

        @NameInMap("ContainerServiceConfig")
        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfig containerServiceConfig;

        @NameInMap("ContainerServiceReleaseInfo")
        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceReleaseInfo containerServiceReleaseInfo;

        public static QueryLDCContainerServiceRevisionResponseBodyRevisionList build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCContainerServiceRevisionResponseBodyRevisionList self = new QueryLDCContainerServiceRevisionResponseBodyRevisionList();
            return TeaModel.build(map, self);
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionList setContainerServiceName(String containerServiceName) {
            this.containerServiceName = containerServiceName;
            return this;
        }
        public String getContainerServiceName() {
            return this.containerServiceName;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionList setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionList setDeployStatus(String deployStatus) {
            this.deployStatus = deployStatus;
            return this;
        }
        public String getDeployStatus() {
            return this.deployStatus;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionList setLastPlanId(String lastPlanId) {
            this.lastPlanId = lastPlanId;
            return this;
        }
        public String getLastPlanId() {
            return this.lastPlanId;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionList setMetaStatus(String metaStatus) {
            this.metaStatus = metaStatus;
            return this;
        }
        public String getMetaStatus() {
            return this.metaStatus;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionList setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionList setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionList setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionList setRemarks(String remarks) {
            this.remarks = remarks;
            return this;
        }
        public String getRemarks() {
            return this.remarks;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionList setRevision(String revision) {
            this.revision = revision;
            return this;
        }
        public String getRevision() {
            return this.revision;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionList setAppInfo(QueryLDCContainerServiceRevisionResponseBodyRevisionListAppInfo appInfo) {
            this.appInfo = appInfo;
            return this;
        }
        public QueryLDCContainerServiceRevisionResponseBodyRevisionListAppInfo getAppInfo() {
            return this.appInfo;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionList setContainerServiceConfig(QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfig containerServiceConfig) {
            this.containerServiceConfig = containerServiceConfig;
            return this;
        }
        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceConfig getContainerServiceConfig() {
            return this.containerServiceConfig;
        }

        public QueryLDCContainerServiceRevisionResponseBodyRevisionList setContainerServiceReleaseInfo(QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceReleaseInfo containerServiceReleaseInfo) {
            this.containerServiceReleaseInfo = containerServiceReleaseInfo;
            return this;
        }
        public QueryLDCContainerServiceRevisionResponseBodyRevisionListContainerServiceReleaseInfo getContainerServiceReleaseInfo() {
            return this.containerServiceReleaseInfo;
        }

    }

}
