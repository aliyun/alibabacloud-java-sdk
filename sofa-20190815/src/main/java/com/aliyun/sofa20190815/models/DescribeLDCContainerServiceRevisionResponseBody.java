// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DescribeLDCContainerServiceRevisionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Revision")
    public DescribeLDCContainerServiceRevisionResponseBodyRevision revision;

    public static DescribeLDCContainerServiceRevisionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLDCContainerServiceRevisionResponseBody self = new DescribeLDCContainerServiceRevisionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLDCContainerServiceRevisionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLDCContainerServiceRevisionResponseBody setRevision(DescribeLDCContainerServiceRevisionResponseBodyRevision revision) {
        this.revision = revision;
        return this;
    }
    public DescribeLDCContainerServiceRevisionResponseBodyRevision getRevision() {
        return this.revision;
    }

    public static class DescribeLDCContainerServiceRevisionResponseBodyRevisionAppInfo extends TeaModel {
        @NameInMap("Owner")
        public String owner;

        @NameInMap("Description")
        public String description;

        @NameInMap("BuildpackVersion")
        public String buildpackVersion;

        @NameInMap("TechstackIdentity")
        public String techstackIdentity;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public String id;

        @NameInMap("OwnerId")
        public String ownerId;

        public static DescribeLDCContainerServiceRevisionResponseBodyRevisionAppInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeLDCContainerServiceRevisionResponseBodyRevisionAppInfo self = new DescribeLDCContainerServiceRevisionResponseBodyRevisionAppInfo();
            return TeaModel.build(map, self);
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionAppInfo setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionAppInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionAppInfo setBuildpackVersion(String buildpackVersion) {
            this.buildpackVersion = buildpackVersion;
            return this;
        }
        public String getBuildpackVersion() {
            return this.buildpackVersion;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionAppInfo setTechstackIdentity(String techstackIdentity) {
            this.techstackIdentity = techstackIdentity;
            return this;
        }
        public String getTechstackIdentity() {
            return this.techstackIdentity;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionAppInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionAppInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionAppInfo setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

    }

    public static class DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLogConfigs extends TeaModel {
        @NameInMap("ConfigName")
        public String configName;

        @NameInMap("InputType")
        public String inputType;

        @NameInMap("LogPath")
        public String logPath;

        @NameInMap("LogstoreName")
        public String logstoreName;

        public static DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLogConfigs build(java.util.Map<String, ?> map) throws Exception {
            DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLogConfigs self = new DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLogConfigs();
            return TeaModel.build(map, self);
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLogConfigs setConfigName(String configName) {
            this.configName = configName;
            return this;
        }
        public String getConfigName() {
            return this.configName;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLogConfigs setInputType(String inputType) {
            this.inputType = inputType;
            return this;
        }
        public String getInputType() {
            return this.inputType;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLogConfigs setLogPath(String logPath) {
            this.logPath = logPath;
            return this;
        }
        public String getLogPath() {
            return this.logPath;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLogConfigs setLogstoreName(String logstoreName) {
            this.logstoreName = logstoreName;
            return this;
        }
        public String getLogstoreName() {
            return this.logstoreName;
        }

    }

    public static class DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMountsLocalDiskVolumeSource extends TeaModel {
        @NameInMap("HostDirectoryPath")
        public String hostDirectoryPath;

        @NameInMap("CreateIfNotPresent")
        public Boolean createIfNotPresent;

        public static DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMountsLocalDiskVolumeSource build(java.util.Map<String, ?> map) throws Exception {
            DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMountsLocalDiskVolumeSource self = new DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMountsLocalDiskVolumeSource();
            return TeaModel.build(map, self);
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMountsLocalDiskVolumeSource setHostDirectoryPath(String hostDirectoryPath) {
            this.hostDirectoryPath = hostDirectoryPath;
            return this;
        }
        public String getHostDirectoryPath() {
            return this.hostDirectoryPath;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMountsLocalDiskVolumeSource setCreateIfNotPresent(Boolean createIfNotPresent) {
            this.createIfNotPresent = createIfNotPresent;
            return this;
        }
        public Boolean getCreateIfNotPresent() {
            return this.createIfNotPresent;
        }

    }

    public static class DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMountsConfigmapSecretVolumeSource extends TeaModel {
        @NameInMap("VolumeRefName")
        public String volumeRefName;

        public static DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMountsConfigmapSecretVolumeSource build(java.util.Map<String, ?> map) throws Exception {
            DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMountsConfigmapSecretVolumeSource self = new DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMountsConfigmapSecretVolumeSource();
            return TeaModel.build(map, self);
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMountsConfigmapSecretVolumeSource setVolumeRefName(String volumeRefName) {
            this.volumeRefName = volumeRefName;
            return this;
        }
        public String getVolumeRefName() {
            return this.volumeRefName;
        }

    }

    public static class DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMountsPvcSource extends TeaModel {
        @NameInMap("PvcName")
        public String pvcName;

        public static DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMountsPvcSource build(java.util.Map<String, ?> map) throws Exception {
            DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMountsPvcSource self = new DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMountsPvcSource();
            return TeaModel.build(map, self);
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMountsPvcSource setPvcName(String pvcName) {
            this.pvcName = pvcName;
            return this;
        }
        public String getPvcName() {
            return this.pvcName;
        }

    }

    public static class DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMountsEmptyDirVolumeSource extends TeaModel {
        @NameInMap("Medium")
        public String medium;

        @NameInMap("SizeLimit")
        public String sizeLimit;

        @NameInMap("Name")
        public String name;

        public static DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMountsEmptyDirVolumeSource build(java.util.Map<String, ?> map) throws Exception {
            DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMountsEmptyDirVolumeSource self = new DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMountsEmptyDirVolumeSource();
            return TeaModel.build(map, self);
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMountsEmptyDirVolumeSource setMedium(String medium) {
            this.medium = medium;
            return this;
        }
        public String getMedium() {
            return this.medium;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMountsEmptyDirVolumeSource setSizeLimit(String sizeLimit) {
            this.sizeLimit = sizeLimit;
            return this;
        }
        public String getSizeLimit() {
            return this.sizeLimit;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMountsEmptyDirVolumeSource setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMounts extends TeaModel {
        @NameInMap("VolumeSourceCategoryType")
        public String volumeSourceCategoryType;

        @NameInMap("LocalDiskVolumeSource")
        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMountsLocalDiskVolumeSource localDiskVolumeSource;

        @NameInMap("ConfigmapSecretVolumeSource")
        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMountsConfigmapSecretVolumeSource configmapSecretVolumeSource;

        @NameInMap("PvcSource")
        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMountsPvcSource pvcSource;

        @NameInMap("EmptyDirVolumeSource")
        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMountsEmptyDirVolumeSource emptyDirVolumeSource;

        @NameInMap("MountPath")
        public String mountPath;

        @NameInMap("ReadOnly")
        public Boolean readOnly;

        @NameInMap("SubPath")
        public String subPath;

        @NameInMap("Name")
        public String name;

        public static DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMounts build(java.util.Map<String, ?> map) throws Exception {
            DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMounts self = new DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMounts();
            return TeaModel.build(map, self);
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMounts setVolumeSourceCategoryType(String volumeSourceCategoryType) {
            this.volumeSourceCategoryType = volumeSourceCategoryType;
            return this;
        }
        public String getVolumeSourceCategoryType() {
            return this.volumeSourceCategoryType;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMounts setLocalDiskVolumeSource(DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMountsLocalDiskVolumeSource localDiskVolumeSource) {
            this.localDiskVolumeSource = localDiskVolumeSource;
            return this;
        }
        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMountsLocalDiskVolumeSource getLocalDiskVolumeSource() {
            return this.localDiskVolumeSource;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMounts setConfigmapSecretVolumeSource(DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMountsConfigmapSecretVolumeSource configmapSecretVolumeSource) {
            this.configmapSecretVolumeSource = configmapSecretVolumeSource;
            return this;
        }
        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMountsConfigmapSecretVolumeSource getConfigmapSecretVolumeSource() {
            return this.configmapSecretVolumeSource;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMounts setPvcSource(DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMountsPvcSource pvcSource) {
            this.pvcSource = pvcSource;
            return this;
        }
        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMountsPvcSource getPvcSource() {
            return this.pvcSource;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMounts setEmptyDirVolumeSource(DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMountsEmptyDirVolumeSource emptyDirVolumeSource) {
            this.emptyDirVolumeSource = emptyDirVolumeSource;
            return this;
        }
        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMountsEmptyDirVolumeSource getEmptyDirVolumeSource() {
            return this.emptyDirVolumeSource;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMounts setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMounts setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMounts setSubPath(String subPath) {
            this.subPath = subPath;
            return this;
        }
        public String getSubPath() {
            return this.subPath;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMounts setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbeHttpGetAction extends TeaModel {
        @NameInMap("Scheme")
        public String scheme;

        @NameInMap("Path")
        public String path;

        @NameInMap("Port")
        public String port;

        public static DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbeHttpGetAction build(java.util.Map<String, ?> map) throws Exception {
            DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbeHttpGetAction self = new DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbeHttpGetAction();
            return TeaModel.build(map, self);
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbeHttpGetAction setScheme(String scheme) {
            this.scheme = scheme;
            return this;
        }
        public String getScheme() {
            return this.scheme;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbeHttpGetAction setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbeHttpGetAction setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

    }

    public static class DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbeTcpSocketAction extends TeaModel {
        @NameInMap("Port")
        public String port;

        public static DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbeTcpSocketAction build(java.util.Map<String, ?> map) throws Exception {
            DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbeTcpSocketAction self = new DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbeTcpSocketAction();
            return TeaModel.build(map, self);
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbeTcpSocketAction setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

    }

    public static class DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbeExecAction extends TeaModel {
        @NameInMap("Command")
        public String command;

        public static DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbeExecAction build(java.util.Map<String, ?> map) throws Exception {
            DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbeExecAction self = new DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbeExecAction();
            return TeaModel.build(map, self);
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbeExecAction setCommand(String command) {
            this.command = command;
            return this;
        }
        public String getCommand() {
            return this.command;
        }

    }

    public static class DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbe extends TeaModel {
        @NameInMap("SuccessThreshold")
        public Long successThreshold;

        @NameInMap("TimeOutSeconds")
        public Long timeOutSeconds;

        @NameInMap("InitialDelaySeconds")
        public Long initialDelaySeconds;

        @NameInMap("FailureThreshold")
        public Long failureThreshold;

        @NameInMap("HttpGetAction")
        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbeHttpGetAction httpGetAction;

        @NameInMap("TcpSocketAction")
        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbeTcpSocketAction tcpSocketAction;

        @NameInMap("PeriodSeconds")
        public Long periodSeconds;

        @NameInMap("ExecAction")
        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbeExecAction execAction;

        public static DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbe build(java.util.Map<String, ?> map) throws Exception {
            DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbe self = new DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbe();
            return TeaModel.build(map, self);
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbe setSuccessThreshold(Long successThreshold) {
            this.successThreshold = successThreshold;
            return this;
        }
        public Long getSuccessThreshold() {
            return this.successThreshold;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbe setTimeOutSeconds(Long timeOutSeconds) {
            this.timeOutSeconds = timeOutSeconds;
            return this;
        }
        public Long getTimeOutSeconds() {
            return this.timeOutSeconds;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbe setInitialDelaySeconds(Long initialDelaySeconds) {
            this.initialDelaySeconds = initialDelaySeconds;
            return this;
        }
        public Long getInitialDelaySeconds() {
            return this.initialDelaySeconds;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbe setFailureThreshold(Long failureThreshold) {
            this.failureThreshold = failureThreshold;
            return this;
        }
        public Long getFailureThreshold() {
            return this.failureThreshold;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbe setHttpGetAction(DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbeHttpGetAction httpGetAction) {
            this.httpGetAction = httpGetAction;
            return this;
        }
        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbeHttpGetAction getHttpGetAction() {
            return this.httpGetAction;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbe setTcpSocketAction(DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbeTcpSocketAction tcpSocketAction) {
            this.tcpSocketAction = tcpSocketAction;
            return this;
        }
        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbeTcpSocketAction getTcpSocketAction() {
            return this.tcpSocketAction;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbe setPeriodSeconds(Long periodSeconds) {
            this.periodSeconds = periodSeconds;
            return this;
        }
        public Long getPeriodSeconds() {
            return this.periodSeconds;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbe setExecAction(DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbeExecAction execAction) {
            this.execAction = execAction;
            return this;
        }
        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbeExecAction getExecAction() {
            return this.execAction;
        }

    }

    public static class DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbeHttpGetAction extends TeaModel {
        @NameInMap("Scheme")
        public String scheme;

        @NameInMap("Path")
        public String path;

        @NameInMap("Port")
        public String port;

        public static DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbeHttpGetAction build(java.util.Map<String, ?> map) throws Exception {
            DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbeHttpGetAction self = new DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbeHttpGetAction();
            return TeaModel.build(map, self);
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbeHttpGetAction setScheme(String scheme) {
            this.scheme = scheme;
            return this;
        }
        public String getScheme() {
            return this.scheme;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbeHttpGetAction setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbeHttpGetAction setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

    }

    public static class DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbeTcpSocketAction extends TeaModel {
        @NameInMap("Port")
        public String port;

        public static DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbeTcpSocketAction build(java.util.Map<String, ?> map) throws Exception {
            DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbeTcpSocketAction self = new DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbeTcpSocketAction();
            return TeaModel.build(map, self);
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbeTcpSocketAction setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

    }

    public static class DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbeExecAction extends TeaModel {
        @NameInMap("Command")
        public String command;

        public static DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbeExecAction build(java.util.Map<String, ?> map) throws Exception {
            DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbeExecAction self = new DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbeExecAction();
            return TeaModel.build(map, self);
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbeExecAction setCommand(String command) {
            this.command = command;
            return this;
        }
        public String getCommand() {
            return this.command;
        }

    }

    public static class DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbe extends TeaModel {
        @NameInMap("SuccessThreshold")
        public Long successThreshold;

        @NameInMap("TimeOutSeconds")
        public Long timeOutSeconds;

        @NameInMap("InitialDelaySeconds")
        public Long initialDelaySeconds;

        @NameInMap("FailureThreshold")
        public Long failureThreshold;

        @NameInMap("HttpGetAction")
        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbeHttpGetAction httpGetAction;

        @NameInMap("TcpSocketAction")
        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbeTcpSocketAction tcpSocketAction;

        @NameInMap("PeriodSeconds")
        public Long periodSeconds;

        @NameInMap("ExecAction")
        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbeExecAction execAction;

        public static DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbe build(java.util.Map<String, ?> map) throws Exception {
            DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbe self = new DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbe();
            return TeaModel.build(map, self);
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbe setSuccessThreshold(Long successThreshold) {
            this.successThreshold = successThreshold;
            return this;
        }
        public Long getSuccessThreshold() {
            return this.successThreshold;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbe setTimeOutSeconds(Long timeOutSeconds) {
            this.timeOutSeconds = timeOutSeconds;
            return this;
        }
        public Long getTimeOutSeconds() {
            return this.timeOutSeconds;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbe setInitialDelaySeconds(Long initialDelaySeconds) {
            this.initialDelaySeconds = initialDelaySeconds;
            return this;
        }
        public Long getInitialDelaySeconds() {
            return this.initialDelaySeconds;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbe setFailureThreshold(Long failureThreshold) {
            this.failureThreshold = failureThreshold;
            return this;
        }
        public Long getFailureThreshold() {
            return this.failureThreshold;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbe setHttpGetAction(DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbeHttpGetAction httpGetAction) {
            this.httpGetAction = httpGetAction;
            return this;
        }
        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbeHttpGetAction getHttpGetAction() {
            return this.httpGetAction;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbe setTcpSocketAction(DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbeTcpSocketAction tcpSocketAction) {
            this.tcpSocketAction = tcpSocketAction;
            return this;
        }
        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbeTcpSocketAction getTcpSocketAction() {
            return this.tcpSocketAction;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbe setPeriodSeconds(Long periodSeconds) {
            this.periodSeconds = periodSeconds;
            return this;
        }
        public Long getPeriodSeconds() {
            return this.periodSeconds;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbe setExecAction(DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbeExecAction execAction) {
            this.execAction = execAction;
            return this;
        }
        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbeExecAction getExecAction() {
            return this.execAction;
        }

    }

    public static class DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfig extends TeaModel {
        @NameInMap("LivenessProbe")
        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbe livenessProbe;

        @NameInMap("ReadinessProbe")
        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbe readinessProbe;

        public static DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfig self = new DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfig();
            return TeaModel.build(map, self);
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfig setLivenessProbe(DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbe livenessProbe) {
            this.livenessProbe = livenessProbe;
            return this;
        }
        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigLivenessProbe getLivenessProbe() {
            return this.livenessProbe;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfig setReadinessProbe(DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbe readinessProbe) {
            this.readinessProbe = readinessProbe;
            return this;
        }
        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfigReadinessProbe getReadinessProbe() {
            return this.readinessProbe;
        }

    }

    public static class DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPostStartExec extends TeaModel {
        @NameInMap("Command")
        public String command;

        public static DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPostStartExec build(java.util.Map<String, ?> map) throws Exception {
            DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPostStartExec self = new DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPostStartExec();
            return TeaModel.build(map, self);
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPostStartExec setCommand(String command) {
            this.command = command;
            return this;
        }
        public String getCommand() {
            return this.command;
        }

    }

    public static class DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPreStopTcp extends TeaModel {
        @NameInMap("Port")
        public String port;

        public static DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPreStopTcp build(java.util.Map<String, ?> map) throws Exception {
            DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPreStopTcp self = new DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPreStopTcp();
            return TeaModel.build(map, self);
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPreStopTcp setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

    }

    public static class DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPreStopHttp extends TeaModel {
        @NameInMap("Scheme")
        public String scheme;

        @NameInMap("Path")
        public String path;

        @NameInMap("Port")
        public String port;

        public static DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPreStopHttp build(java.util.Map<String, ?> map) throws Exception {
            DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPreStopHttp self = new DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPreStopHttp();
            return TeaModel.build(map, self);
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPreStopHttp setScheme(String scheme) {
            this.scheme = scheme;
            return this;
        }
        public String getScheme() {
            return this.scheme;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPreStopHttp setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPreStopHttp setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

    }

    public static class DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPostStartTcp extends TeaModel {
        @NameInMap("Port")
        public String port;

        public static DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPostStartTcp build(java.util.Map<String, ?> map) throws Exception {
            DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPostStartTcp self = new DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPostStartTcp();
            return TeaModel.build(map, self);
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPostStartTcp setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

    }

    public static class DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPostStartHttp extends TeaModel {
        @NameInMap("Scheme")
        public String scheme;

        @NameInMap("Path")
        public String path;

        @NameInMap("Port")
        public String port;

        public static DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPostStartHttp build(java.util.Map<String, ?> map) throws Exception {
            DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPostStartHttp self = new DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPostStartHttp();
            return TeaModel.build(map, self);
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPostStartHttp setScheme(String scheme) {
            this.scheme = scheme;
            return this;
        }
        public String getScheme() {
            return this.scheme;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPostStartHttp setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPostStartHttp setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

    }

    public static class DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPreStopExec extends TeaModel {
        @NameInMap("Command")
        public String command;

        public static DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPreStopExec build(java.util.Map<String, ?> map) throws Exception {
            DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPreStopExec self = new DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPreStopExec();
            return TeaModel.build(map, self);
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPreStopExec setCommand(String command) {
            this.command = command;
            return this;
        }
        public String getCommand() {
            return this.command;
        }

    }

    public static class DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHook extends TeaModel {
        @NameInMap("PostStartExec")
        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPostStartExec postStartExec;

        @NameInMap("PreStopTcp")
        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPreStopTcp preStopTcp;

        @NameInMap("PreStopHttp")
        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPreStopHttp preStopHttp;

        @NameInMap("PostStartTcp")
        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPostStartTcp postStartTcp;

        @NameInMap("PostStartHttp")
        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPostStartHttp postStartHttp;

        @NameInMap("PreStopExec")
        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPreStopExec preStopExec;

        public static DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHook build(java.util.Map<String, ?> map) throws Exception {
            DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHook self = new DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHook();
            return TeaModel.build(map, self);
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHook setPostStartExec(DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPostStartExec postStartExec) {
            this.postStartExec = postStartExec;
            return this;
        }
        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPostStartExec getPostStartExec() {
            return this.postStartExec;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHook setPreStopTcp(DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPreStopTcp preStopTcp) {
            this.preStopTcp = preStopTcp;
            return this;
        }
        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPreStopTcp getPreStopTcp() {
            return this.preStopTcp;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHook setPreStopHttp(DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPreStopHttp preStopHttp) {
            this.preStopHttp = preStopHttp;
            return this;
        }
        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPreStopHttp getPreStopHttp() {
            return this.preStopHttp;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHook setPostStartTcp(DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPostStartTcp postStartTcp) {
            this.postStartTcp = postStartTcp;
            return this;
        }
        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPostStartTcp getPostStartTcp() {
            return this.postStartTcp;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHook setPostStartHttp(DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPostStartHttp postStartHttp) {
            this.postStartHttp = postStartHttp;
            return this;
        }
        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPostStartHttp getPostStartHttp() {
            return this.postStartHttp;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHook setPreStopExec(DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPreStopExec preStopExec) {
            this.preStopExec = preStopExec;
            return this;
        }
        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHookPreStopExec getPreStopExec() {
            return this.preStopExec;
        }

    }

    public static class DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsEnvsValueFrom extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("ObjectType")
        public String objectType;

        @NameInMap("ObjectName")
        public String objectName;

        public static DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsEnvsValueFrom build(java.util.Map<String, ?> map) throws Exception {
            DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsEnvsValueFrom self = new DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsEnvsValueFrom();
            return TeaModel.build(map, self);
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsEnvsValueFrom setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsEnvsValueFrom setObjectType(String objectType) {
            this.objectType = objectType;
            return this;
        }
        public String getObjectType() {
            return this.objectType;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsEnvsValueFrom setObjectName(String objectName) {
            this.objectName = objectName;
            return this;
        }
        public String getObjectName() {
            return this.objectName;
        }

    }

    public static class DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsEnvs extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public String value;

        @NameInMap("Name")
        public String name;

        @NameInMap("ValueFrom")
        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsEnvsValueFrom valueFrom;

        public static DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsEnvs build(java.util.Map<String, ?> map) throws Exception {
            DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsEnvs self = new DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsEnvs();
            return TeaModel.build(map, self);
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsEnvs setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsEnvs setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsEnvs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsEnvs setValueFrom(DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsEnvsValueFrom valueFrom) {
            this.valueFrom = valueFrom;
            return this;
        }
        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsEnvsValueFrom getValueFrom() {
            return this.valueFrom;
        }

    }

    public static class DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsEnvOverrides extends TeaModel {
        @NameInMap("Value")
        public String value;

        @NameInMap("Name")
        public String name;

        @NameInMap("Cell")
        public String cell;

        public static DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsEnvOverrides build(java.util.Map<String, ?> map) throws Exception {
            DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsEnvOverrides self = new DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsEnvOverrides();
            return TeaModel.build(map, self);
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsEnvOverrides setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsEnvOverrides setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsEnvOverrides setCell(String cell) {
            this.cell = cell;
            return this;
        }
        public String getCell() {
            return this.cell;
        }

    }

    public static class DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecs extends TeaModel {
        @NameInMap("LogConfigs")
        public java.util.List<DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLogConfigs> logConfigs;

        @NameInMap("VolumeMounts")
        public java.util.List<DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMounts> volumeMounts;

        @NameInMap("Type")
        public String type;

        @NameInMap("VolumesStr")
        public String volumesStr;

        @NameInMap("ImageSource")
        public String imageSource;

        @NameInMap("CpuRequest")
        public String cpuRequest;

        @NameInMap("HealthCheckConfig")
        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfig healthCheckConfig;

        @NameInMap("MemoryRequest")
        public String memoryRequest;

        @NameInMap("Image")
        public String image;

        @NameInMap("LifecycleHook")
        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHook lifecycleHook;

        @NameInMap("ImagePullSecret")
        public String imagePullSecret;

        @NameInMap("VolumeMountsStr")
        public String volumeMountsStr;

        @NameInMap("MemoryLimit")
        public String memoryLimit;

        @NameInMap("ImageBuildName")
        public String imageBuildName;

        @NameInMap("EntryPoints")
        public java.util.List<String> entryPoints;

        @NameInMap("Envs")
        public java.util.List<DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsEnvs> envs;

        @NameInMap("RestartPolicy")
        public String restartPolicy;

        @NameInMap("Name")
        public String name;

        @NameInMap("CpuLimit")
        public String cpuLimit;

        @NameInMap("EnvOverrides")
        public java.util.List<DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsEnvOverrides> envOverrides;

        public static DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecs build(java.util.Map<String, ?> map) throws Exception {
            DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecs self = new DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecs();
            return TeaModel.build(map, self);
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecs setLogConfigs(java.util.List<DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLogConfigs> logConfigs) {
            this.logConfigs = logConfigs;
            return this;
        }
        public java.util.List<DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLogConfigs> getLogConfigs() {
            return this.logConfigs;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecs setVolumeMounts(java.util.List<DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMounts> volumeMounts) {
            this.volumeMounts = volumeMounts;
            return this;
        }
        public java.util.List<DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsVolumeMounts> getVolumeMounts() {
            return this.volumeMounts;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecs setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecs setVolumesStr(String volumesStr) {
            this.volumesStr = volumesStr;
            return this;
        }
        public String getVolumesStr() {
            return this.volumesStr;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecs setImageSource(String imageSource) {
            this.imageSource = imageSource;
            return this;
        }
        public String getImageSource() {
            return this.imageSource;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecs setCpuRequest(String cpuRequest) {
            this.cpuRequest = cpuRequest;
            return this;
        }
        public String getCpuRequest() {
            return this.cpuRequest;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecs setHealthCheckConfig(DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfig healthCheckConfig) {
            this.healthCheckConfig = healthCheckConfig;
            return this;
        }
        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsHealthCheckConfig getHealthCheckConfig() {
            return this.healthCheckConfig;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecs setMemoryRequest(String memoryRequest) {
            this.memoryRequest = memoryRequest;
            return this;
        }
        public String getMemoryRequest() {
            return this.memoryRequest;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecs setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecs setLifecycleHook(DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHook lifecycleHook) {
            this.lifecycleHook = lifecycleHook;
            return this;
        }
        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsLifecycleHook getLifecycleHook() {
            return this.lifecycleHook;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecs setImagePullSecret(String imagePullSecret) {
            this.imagePullSecret = imagePullSecret;
            return this;
        }
        public String getImagePullSecret() {
            return this.imagePullSecret;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecs setVolumeMountsStr(String volumeMountsStr) {
            this.volumeMountsStr = volumeMountsStr;
            return this;
        }
        public String getVolumeMountsStr() {
            return this.volumeMountsStr;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecs setMemoryLimit(String memoryLimit) {
            this.memoryLimit = memoryLimit;
            return this;
        }
        public String getMemoryLimit() {
            return this.memoryLimit;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecs setImageBuildName(String imageBuildName) {
            this.imageBuildName = imageBuildName;
            return this;
        }
        public String getImageBuildName() {
            return this.imageBuildName;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecs setEntryPoints(java.util.List<String> entryPoints) {
            this.entryPoints = entryPoints;
            return this;
        }
        public java.util.List<String> getEntryPoints() {
            return this.entryPoints;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecs setEnvs(java.util.List<DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsEnvs> envs) {
            this.envs = envs;
            return this;
        }
        public java.util.List<DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsEnvs> getEnvs() {
            return this.envs;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecs setRestartPolicy(String restartPolicy) {
            this.restartPolicy = restartPolicy;
            return this;
        }
        public String getRestartPolicy() {
            return this.restartPolicy;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecs setCpuLimit(String cpuLimit) {
            this.cpuLimit = cpuLimit;
            return this;
        }
        public String getCpuLimit() {
            return this.cpuLimit;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecs setEnvOverrides(java.util.List<DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsEnvOverrides> envOverrides) {
            this.envOverrides = envOverrides;
            return this;
        }
        public java.util.List<DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecsEnvOverrides> getEnvOverrides() {
            return this.envOverrides;
        }

    }

    public static class DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityNodeAffinityMatchExpressions extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Values")
        public java.util.List<String> values;

        @NameInMap("Operator")
        public String operator;

        public static DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityNodeAffinityMatchExpressions build(java.util.Map<String, ?> map) throws Exception {
            DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityNodeAffinityMatchExpressions self = new DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityNodeAffinityMatchExpressions();
            return TeaModel.build(map, self);
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityNodeAffinityMatchExpressions setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityNodeAffinityMatchExpressions setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityNodeAffinityMatchExpressions setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

    }

    public static class DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityNodeAffinity extends TeaModel {
        @NameInMap("Weight")
        public Long weight;

        @NameInMap("Requested")
        public Boolean requested;

        @NameInMap("MatchExpressions")
        public java.util.List<DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityNodeAffinityMatchExpressions> matchExpressions;

        public static DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityNodeAffinity build(java.util.Map<String, ?> map) throws Exception {
            DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityNodeAffinity self = new DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityNodeAffinity();
            return TeaModel.build(map, self);
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityNodeAffinity setWeight(Long weight) {
            this.weight = weight;
            return this;
        }
        public Long getWeight() {
            return this.weight;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityNodeAffinity setRequested(Boolean requested) {
            this.requested = requested;
            return this;
        }
        public Boolean getRequested() {
            return this.requested;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityNodeAffinity setMatchExpressions(java.util.List<DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityNodeAffinityMatchExpressions> matchExpressions) {
            this.matchExpressions = matchExpressions;
            return this;
        }
        public java.util.List<DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityNodeAffinityMatchExpressions> getMatchExpressions() {
            return this.matchExpressions;
        }

    }

    public static class DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityPodAffinityPodAffinityTermLabelSelector extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityPodAffinityPodAffinityTermLabelSelector build(java.util.Map<String, ?> map) throws Exception {
            DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityPodAffinityPodAffinityTermLabelSelector self = new DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityPodAffinityPodAffinityTermLabelSelector();
            return TeaModel.build(map, self);
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityPodAffinityPodAffinityTermLabelSelector setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityPodAffinityPodAffinityTermLabelSelector setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityPodAffinityPodAffinityTerm extends TeaModel {
        @NameInMap("TopologyKey")
        public String topologyKey;

        @NameInMap("LabelSelector")
        public java.util.List<DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityPodAffinityPodAffinityTermLabelSelector> labelSelector;

        @NameInMap("Namespaces")
        public java.util.List<String> namespaces;

        public static DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityPodAffinityPodAffinityTerm build(java.util.Map<String, ?> map) throws Exception {
            DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityPodAffinityPodAffinityTerm self = new DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityPodAffinityPodAffinityTerm();
            return TeaModel.build(map, self);
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityPodAffinityPodAffinityTerm setTopologyKey(String topologyKey) {
            this.topologyKey = topologyKey;
            return this;
        }
        public String getTopologyKey() {
            return this.topologyKey;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityPodAffinityPodAffinityTerm setLabelSelector(java.util.List<DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityPodAffinityPodAffinityTermLabelSelector> labelSelector) {
            this.labelSelector = labelSelector;
            return this;
        }
        public java.util.List<DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityPodAffinityPodAffinityTermLabelSelector> getLabelSelector() {
            return this.labelSelector;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityPodAffinityPodAffinityTerm setNamespaces(java.util.List<String> namespaces) {
            this.namespaces = namespaces;
            return this;
        }
        public java.util.List<String> getNamespaces() {
            return this.namespaces;
        }

    }

    public static class DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityPodAffinity extends TeaModel {
        @NameInMap("PodAffinityTerm")
        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityPodAffinityPodAffinityTerm podAffinityTerm;

        @NameInMap("Weight")
        public Long weight;

        @NameInMap("Requested")
        public Boolean requested;

        @NameInMap("AntiAffinity")
        public Boolean antiAffinity;

        public static DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityPodAffinity build(java.util.Map<String, ?> map) throws Exception {
            DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityPodAffinity self = new DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityPodAffinity();
            return TeaModel.build(map, self);
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityPodAffinity setPodAffinityTerm(DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityPodAffinityPodAffinityTerm podAffinityTerm) {
            this.podAffinityTerm = podAffinityTerm;
            return this;
        }
        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityPodAffinityPodAffinityTerm getPodAffinityTerm() {
            return this.podAffinityTerm;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityPodAffinity setWeight(Long weight) {
            this.weight = weight;
            return this;
        }
        public Long getWeight() {
            return this.weight;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityPodAffinity setRequested(Boolean requested) {
            this.requested = requested;
            return this;
        }
        public Boolean getRequested() {
            return this.requested;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityPodAffinity setAntiAffinity(Boolean antiAffinity) {
            this.antiAffinity = antiAffinity;
            return this;
        }
        public Boolean getAntiAffinity() {
            return this.antiAffinity;
        }

    }

    public static class DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinity extends TeaModel {
        @NameInMap("NodeAffinity")
        public java.util.List<DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityNodeAffinity> nodeAffinity;

        @NameInMap("PodAffinity")
        public java.util.List<DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityPodAffinity> podAffinity;

        public static DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinity build(java.util.Map<String, ?> map) throws Exception {
            DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinity self = new DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinity();
            return TeaModel.build(map, self);
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinity setNodeAffinity(java.util.List<DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityNodeAffinity> nodeAffinity) {
            this.nodeAffinity = nodeAffinity;
            return this;
        }
        public java.util.List<DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityNodeAffinity> getNodeAffinity() {
            return this.nodeAffinity;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinity setPodAffinity(java.util.List<DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityPodAffinity> podAffinity) {
            this.podAffinity = podAffinity;
            return this;
        }
        public java.util.List<DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinityPodAffinity> getPodAffinity() {
            return this.podAffinity;
        }

    }

    public static class DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfig extends TeaModel {
        @NameInMap("Affinity")
        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinity affinity;

        @NameInMap("MaxGroupCapacity")
        public Long maxGroupCapacity;

        @NameInMap("Labels")
        public String labels;

        @NameInMap("GroupCount")
        public Long groupCount;

        @NameInMap("CustomLabels")
        public String customLabels;

        @NameInMap("Annotations")
        public String annotations;

        @NameInMap("GroupStrategy")
        public String groupStrategy;

        @NameInMap("EnableSofaMesh")
        public Boolean enableSofaMesh;

        @NameInMap("NeedConfirm")
        public Boolean needConfirm;

        @NameInMap("NeedBeta")
        public Boolean needBeta;

        public static DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfig self = new DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfig();
            return TeaModel.build(map, self);
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfig setAffinity(DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinity affinity) {
            this.affinity = affinity;
            return this;
        }
        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfigAffinity getAffinity() {
            return this.affinity;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfig setMaxGroupCapacity(Long maxGroupCapacity) {
            this.maxGroupCapacity = maxGroupCapacity;
            return this;
        }
        public Long getMaxGroupCapacity() {
            return this.maxGroupCapacity;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfig setLabels(String labels) {
            this.labels = labels;
            return this;
        }
        public String getLabels() {
            return this.labels;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfig setGroupCount(Long groupCount) {
            this.groupCount = groupCount;
            return this;
        }
        public Long getGroupCount() {
            return this.groupCount;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfig setCustomLabels(String customLabels) {
            this.customLabels = customLabels;
            return this;
        }
        public String getCustomLabels() {
            return this.customLabels;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfig setAnnotations(String annotations) {
            this.annotations = annotations;
            return this;
        }
        public String getAnnotations() {
            return this.annotations;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfig setGroupStrategy(String groupStrategy) {
            this.groupStrategy = groupStrategy;
            return this;
        }
        public String getGroupStrategy() {
            return this.groupStrategy;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfig setEnableSofaMesh(Boolean enableSofaMesh) {
            this.enableSofaMesh = enableSofaMesh;
            return this;
        }
        public Boolean getEnableSofaMesh() {
            return this.enableSofaMesh;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfig setNeedConfirm(Boolean needConfirm) {
            this.needConfirm = needConfirm;
            return this;
        }
        public Boolean getNeedConfirm() {
            return this.needConfirm;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfig setNeedBeta(Boolean needBeta) {
            this.needBeta = needBeta;
            return this;
        }
        public Boolean getNeedBeta() {
            return this.needBeta;
        }

    }

    public static class DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigSidecarConfigs extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        @NameInMap("SidecarName")
        public String sidecarName;

        @NameInMap("Template")
        public String template;

        @NameInMap("SidecarVersion")
        public String sidecarVersion;

        @NameInMap("WorkspaceGroupId")
        public String workspaceGroupId;

        @NameInMap("Scope")
        public String scope;

        @NameInMap("Id")
        public String id;

        @NameInMap("RegionId")
        public String regionId;

        public static DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigSidecarConfigs build(java.util.Map<String, ?> map) throws Exception {
            DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigSidecarConfigs self = new DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigSidecarConfigs();
            return TeaModel.build(map, self);
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigSidecarConfigs setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigSidecarConfigs setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigSidecarConfigs setSidecarName(String sidecarName) {
            this.sidecarName = sidecarName;
            return this;
        }
        public String getSidecarName() {
            return this.sidecarName;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigSidecarConfigs setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigSidecarConfigs setSidecarVersion(String sidecarVersion) {
            this.sidecarVersion = sidecarVersion;
            return this;
        }
        public String getSidecarVersion() {
            return this.sidecarVersion;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigSidecarConfigs setWorkspaceGroupId(String workspaceGroupId) {
            this.workspaceGroupId = workspaceGroupId;
            return this;
        }
        public String getWorkspaceGroupId() {
            return this.workspaceGroupId;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigSidecarConfigs setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigSidecarConfigs setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigSidecarConfigs setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListenersV2 extends TeaModel {
        @NameInMap("HealthCheckThreshold")
        public Long healthCheckThreshold;

        @NameInMap("Cookie")
        public String cookie;

        @NameInMap("SessionStickyType")
        public Long sessionStickyType;

        @NameInMap("HealthCheckConnectPort")
        public Long healthCheckConnectPort;

        @NameInMap("HealthCheckTimeout")
        public Long healthCheckTimeout;

        @NameInMap("HealthCheckUri")
        public String healthCheckUri;

        @NameInMap("BackendServerPort")
        public Long backendServerPort;

        @NameInMap("CookieTimeout")
        public Long cookieTimeout;

        @NameInMap("HealthCheckDomain")
        public String healthCheckDomain;

        @NameInMap("UnhealthyThreshold")
        public Long unhealthyThreshold;

        @NameInMap("HealthCheckHttpCode")
        public String healthCheckHttpCode;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("PersistenceTimeout")
        public Long persistenceTimeout;

        @NameInMap("ListenerPort")
        public Long listenerPort;

        @NameInMap("HealthCheckInterval")
        public Long healthCheckInterval;

        @NameInMap("BandWidth")
        public Long bandWidth;

        @NameInMap("Scheduler")
        public String scheduler;

        @NameInMap("XforwardFor")
        public Boolean xforwardFor;

        @NameInMap("EstablishedTimeout")
        public Long establishedTimeout;

        @NameInMap("HealthCheckConnectTimeout")
        public Long healthCheckConnectTimeout;

        @NameInMap("Path")
        public String path;

        @NameInMap("CaCertificateId")
        public String caCertificateId;

        @NameInMap("HealthyThreshold")
        public Long healthyThreshold;

        @NameInMap("HealthCheck")
        public String healthCheck;

        public static DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListenersV2 build(java.util.Map<String, ?> map) throws Exception {
            DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListenersV2 self = new DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListenersV2();
            return TeaModel.build(map, self);
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListenersV2 setHealthCheckThreshold(Long healthCheckThreshold) {
            this.healthCheckThreshold = healthCheckThreshold;
            return this;
        }
        public Long getHealthCheckThreshold() {
            return this.healthCheckThreshold;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListenersV2 setCookie(String cookie) {
            this.cookie = cookie;
            return this;
        }
        public String getCookie() {
            return this.cookie;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListenersV2 setSessionStickyType(Long sessionStickyType) {
            this.sessionStickyType = sessionStickyType;
            return this;
        }
        public Long getSessionStickyType() {
            return this.sessionStickyType;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListenersV2 setHealthCheckConnectPort(Long healthCheckConnectPort) {
            this.healthCheckConnectPort = healthCheckConnectPort;
            return this;
        }
        public Long getHealthCheckConnectPort() {
            return this.healthCheckConnectPort;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListenersV2 setHealthCheckTimeout(Long healthCheckTimeout) {
            this.healthCheckTimeout = healthCheckTimeout;
            return this;
        }
        public Long getHealthCheckTimeout() {
            return this.healthCheckTimeout;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListenersV2 setHealthCheckUri(String healthCheckUri) {
            this.healthCheckUri = healthCheckUri;
            return this;
        }
        public String getHealthCheckUri() {
            return this.healthCheckUri;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListenersV2 setBackendServerPort(Long backendServerPort) {
            this.backendServerPort = backendServerPort;
            return this;
        }
        public Long getBackendServerPort() {
            return this.backendServerPort;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListenersV2 setCookieTimeout(Long cookieTimeout) {
            this.cookieTimeout = cookieTimeout;
            return this;
        }
        public Long getCookieTimeout() {
            return this.cookieTimeout;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListenersV2 setHealthCheckDomain(String healthCheckDomain) {
            this.healthCheckDomain = healthCheckDomain;
            return this;
        }
        public String getHealthCheckDomain() {
            return this.healthCheckDomain;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListenersV2 setUnhealthyThreshold(Long unhealthyThreshold) {
            this.unhealthyThreshold = unhealthyThreshold;
            return this;
        }
        public Long getUnhealthyThreshold() {
            return this.unhealthyThreshold;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListenersV2 setHealthCheckHttpCode(String healthCheckHttpCode) {
            this.healthCheckHttpCode = healthCheckHttpCode;
            return this;
        }
        public String getHealthCheckHttpCode() {
            return this.healthCheckHttpCode;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListenersV2 setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListenersV2 setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListenersV2 setPersistenceTimeout(Long persistenceTimeout) {
            this.persistenceTimeout = persistenceTimeout;
            return this;
        }
        public Long getPersistenceTimeout() {
            return this.persistenceTimeout;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListenersV2 setListenerPort(Long listenerPort) {
            this.listenerPort = listenerPort;
            return this;
        }
        public Long getListenerPort() {
            return this.listenerPort;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListenersV2 setHealthCheckInterval(Long healthCheckInterval) {
            this.healthCheckInterval = healthCheckInterval;
            return this;
        }
        public Long getHealthCheckInterval() {
            return this.healthCheckInterval;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListenersV2 setBandWidth(Long bandWidth) {
            this.bandWidth = bandWidth;
            return this;
        }
        public Long getBandWidth() {
            return this.bandWidth;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListenersV2 setScheduler(String scheduler) {
            this.scheduler = scheduler;
            return this;
        }
        public String getScheduler() {
            return this.scheduler;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListenersV2 setXforwardFor(Boolean xforwardFor) {
            this.xforwardFor = xforwardFor;
            return this;
        }
        public Boolean getXforwardFor() {
            return this.xforwardFor;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListenersV2 setEstablishedTimeout(Long establishedTimeout) {
            this.establishedTimeout = establishedTimeout;
            return this;
        }
        public Long getEstablishedTimeout() {
            return this.establishedTimeout;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListenersV2 setHealthCheckConnectTimeout(Long healthCheckConnectTimeout) {
            this.healthCheckConnectTimeout = healthCheckConnectTimeout;
            return this;
        }
        public Long getHealthCheckConnectTimeout() {
            return this.healthCheckConnectTimeout;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListenersV2 setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListenersV2 setCaCertificateId(String caCertificateId) {
            this.caCertificateId = caCertificateId;
            return this;
        }
        public String getCaCertificateId() {
            return this.caCertificateId;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListenersV2 setHealthyThreshold(Long healthyThreshold) {
            this.healthyThreshold = healthyThreshold;
            return this;
        }
        public Long getHealthyThreshold() {
            return this.healthyThreshold;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListenersV2 setHealthCheck(String healthCheck) {
            this.healthCheck = healthCheck;
            return this;
        }
        public String getHealthCheck() {
            return this.healthCheck;
        }

    }

    public static class DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListeners extends TeaModel {
        @NameInMap("HealthCheckThreshold")
        public Long healthCheckThreshold;

        @NameInMap("Cookie")
        public String cookie;

        @NameInMap("SessionStickyType")
        public Long sessionStickyType;

        @NameInMap("HealthCheckConnectPort")
        public Long healthCheckConnectPort;

        @NameInMap("HealthCheckTimeout")
        public Long healthCheckTimeout;

        @NameInMap("HealthCheckUri")
        public String healthCheckUri;

        @NameInMap("BackendServerPort")
        public Long backendServerPort;

        @NameInMap("CookieTimeout")
        public Long cookieTimeout;

        @NameInMap("HealthCheckDomain")
        public String healthCheckDomain;

        @NameInMap("UnhealthyThreshold")
        public Long unhealthyThreshold;

        @NameInMap("HealthCheckHttpCode")
        public String healthCheckHttpCode;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("PersistenceTimeout")
        public Long persistenceTimeout;

        @NameInMap("ListenerPort")
        public Long listenerPort;

        @NameInMap("HealthCheckInterval")
        public Long healthCheckInterval;

        @NameInMap("BandWidth")
        public Long bandWidth;

        @NameInMap("Scheduler")
        public String scheduler;

        @NameInMap("XforwardFor")
        public Boolean xforwardFor;

        @NameInMap("EstablishedTimeout")
        public Long establishedTimeout;

        @NameInMap("HealthCheckConnectTimeout")
        public Long healthCheckConnectTimeout;

        @NameInMap("Path")
        public String path;

        @NameInMap("CaCertificateId")
        public String caCertificateId;

        @NameInMap("HealthyThreshold")
        public Long healthyThreshold;

        @NameInMap("HealthCheck")
        public String healthCheck;

        public static DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListeners build(java.util.Map<String, ?> map) throws Exception {
            DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListeners self = new DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListeners();
            return TeaModel.build(map, self);
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListeners setHealthCheckThreshold(Long healthCheckThreshold) {
            this.healthCheckThreshold = healthCheckThreshold;
            return this;
        }
        public Long getHealthCheckThreshold() {
            return this.healthCheckThreshold;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListeners setCookie(String cookie) {
            this.cookie = cookie;
            return this;
        }
        public String getCookie() {
            return this.cookie;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListeners setSessionStickyType(Long sessionStickyType) {
            this.sessionStickyType = sessionStickyType;
            return this;
        }
        public Long getSessionStickyType() {
            return this.sessionStickyType;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListeners setHealthCheckConnectPort(Long healthCheckConnectPort) {
            this.healthCheckConnectPort = healthCheckConnectPort;
            return this;
        }
        public Long getHealthCheckConnectPort() {
            return this.healthCheckConnectPort;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListeners setHealthCheckTimeout(Long healthCheckTimeout) {
            this.healthCheckTimeout = healthCheckTimeout;
            return this;
        }
        public Long getHealthCheckTimeout() {
            return this.healthCheckTimeout;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListeners setHealthCheckUri(String healthCheckUri) {
            this.healthCheckUri = healthCheckUri;
            return this;
        }
        public String getHealthCheckUri() {
            return this.healthCheckUri;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListeners setBackendServerPort(Long backendServerPort) {
            this.backendServerPort = backendServerPort;
            return this;
        }
        public Long getBackendServerPort() {
            return this.backendServerPort;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListeners setCookieTimeout(Long cookieTimeout) {
            this.cookieTimeout = cookieTimeout;
            return this;
        }
        public Long getCookieTimeout() {
            return this.cookieTimeout;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListeners setHealthCheckDomain(String healthCheckDomain) {
            this.healthCheckDomain = healthCheckDomain;
            return this;
        }
        public String getHealthCheckDomain() {
            return this.healthCheckDomain;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListeners setUnhealthyThreshold(Long unhealthyThreshold) {
            this.unhealthyThreshold = unhealthyThreshold;
            return this;
        }
        public Long getUnhealthyThreshold() {
            return this.unhealthyThreshold;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListeners setHealthCheckHttpCode(String healthCheckHttpCode) {
            this.healthCheckHttpCode = healthCheckHttpCode;
            return this;
        }
        public String getHealthCheckHttpCode() {
            return this.healthCheckHttpCode;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListeners setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListeners setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListeners setPersistenceTimeout(Long persistenceTimeout) {
            this.persistenceTimeout = persistenceTimeout;
            return this;
        }
        public Long getPersistenceTimeout() {
            return this.persistenceTimeout;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListeners setListenerPort(Long listenerPort) {
            this.listenerPort = listenerPort;
            return this;
        }
        public Long getListenerPort() {
            return this.listenerPort;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListeners setHealthCheckInterval(Long healthCheckInterval) {
            this.healthCheckInterval = healthCheckInterval;
            return this;
        }
        public Long getHealthCheckInterval() {
            return this.healthCheckInterval;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListeners setBandWidth(Long bandWidth) {
            this.bandWidth = bandWidth;
            return this;
        }
        public Long getBandWidth() {
            return this.bandWidth;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListeners setScheduler(String scheduler) {
            this.scheduler = scheduler;
            return this;
        }
        public String getScheduler() {
            return this.scheduler;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListeners setXforwardFor(Boolean xforwardFor) {
            this.xforwardFor = xforwardFor;
            return this;
        }
        public Boolean getXforwardFor() {
            return this.xforwardFor;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListeners setEstablishedTimeout(Long establishedTimeout) {
            this.establishedTimeout = establishedTimeout;
            return this;
        }
        public Long getEstablishedTimeout() {
            return this.establishedTimeout;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListeners setHealthCheckConnectTimeout(Long healthCheckConnectTimeout) {
            this.healthCheckConnectTimeout = healthCheckConnectTimeout;
            return this;
        }
        public Long getHealthCheckConnectTimeout() {
            return this.healthCheckConnectTimeout;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListeners setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListeners setCaCertificateId(String caCertificateId) {
            this.caCertificateId = caCertificateId;
            return this;
        }
        public String getCaCertificateId() {
            return this.caCertificateId;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListeners setHealthyThreshold(Long healthyThreshold) {
            this.healthyThreshold = healthyThreshold;
            return this;
        }
        public Long getHealthyThreshold() {
            return this.healthyThreshold;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListeners setHealthCheck(String healthCheck) {
            this.healthCheck = healthCheck;
            return this;
        }
        public String getHealthCheck() {
            return this.healthCheck;
        }

    }

    public static class DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngresses extends TeaModel {
        @NameInMap("ListenersV2")
        public java.util.List<DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListenersV2> listenersV2;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("LoadBalancerName")
        public String loadBalancerName;

        @NameInMap("LoadBalancerType")
        public String loadBalancerType;

        @NameInMap("UnifiedAccessRouteRule")
        public String unifiedAccessRouteRule;

        @NameInMap("LoadBalancerIaasId")
        public String loadBalancerIaasId;

        @NameInMap("Listeners")
        public java.util.List<DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListeners> listeners;

        @NameInMap("UnifiedAccessEntries")
        public java.util.List<String> unifiedAccessEntries;

        @NameInMap("UnifiedAccessInstanceName")
        public String unifiedAccessInstanceName;

        public static DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngresses build(java.util.Map<String, ?> map) throws Exception {
            DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngresses self = new DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngresses();
            return TeaModel.build(map, self);
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngresses setListenersV2(java.util.List<DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListenersV2> listenersV2) {
            this.listenersV2 = listenersV2;
            return this;
        }
        public java.util.List<DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListenersV2> getListenersV2() {
            return this.listenersV2;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngresses setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngresses setLoadBalancerName(String loadBalancerName) {
            this.loadBalancerName = loadBalancerName;
            return this;
        }
        public String getLoadBalancerName() {
            return this.loadBalancerName;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngresses setLoadBalancerType(String loadBalancerType) {
            this.loadBalancerType = loadBalancerType;
            return this;
        }
        public String getLoadBalancerType() {
            return this.loadBalancerType;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngresses setUnifiedAccessRouteRule(String unifiedAccessRouteRule) {
            this.unifiedAccessRouteRule = unifiedAccessRouteRule;
            return this;
        }
        public String getUnifiedAccessRouteRule() {
            return this.unifiedAccessRouteRule;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngresses setLoadBalancerIaasId(String loadBalancerIaasId) {
            this.loadBalancerIaasId = loadBalancerIaasId;
            return this;
        }
        public String getLoadBalancerIaasId() {
            return this.loadBalancerIaasId;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngresses setListeners(java.util.List<DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListeners> listeners) {
            this.listeners = listeners;
            return this;
        }
        public java.util.List<DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngressesListeners> getListeners() {
            return this.listeners;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngresses setUnifiedAccessEntries(java.util.List<String> unifiedAccessEntries) {
            this.unifiedAccessEntries = unifiedAccessEntries;
            return this;
        }
        public java.util.List<String> getUnifiedAccessEntries() {
            return this.unifiedAccessEntries;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngresses setUnifiedAccessInstanceName(String unifiedAccessInstanceName) {
            this.unifiedAccessInstanceName = unifiedAccessInstanceName;
            return this;
        }
        public String getUnifiedAccessInstanceName() {
            return this.unifiedAccessInstanceName;
        }

    }

    public static class DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfig extends TeaModel {
        @NameInMap("EnableLogConfig")
        public Boolean enableLogConfig;

        @NameInMap("ContainerSpecs")
        public java.util.List<DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecs> containerSpecs;

        @NameInMap("EnableBizMonitor")
        public Boolean enableBizMonitor;

        @NameInMap("BizMonitorPaths")
        public java.util.List<String> bizMonitorPaths;

        @NameInMap("DeployConfig")
        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfig deployConfig;

        @NameInMap("EnableSofaMesh")
        public Boolean enableSofaMesh;

        @NameInMap("SidecarConfigs")
        public java.util.List<DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigSidecarConfigs> sidecarConfigs;

        @NameInMap("Ingresses")
        public java.util.List<DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngresses> ingresses;

        public static DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfig self = new DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfig();
            return TeaModel.build(map, self);
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfig setEnableLogConfig(Boolean enableLogConfig) {
            this.enableLogConfig = enableLogConfig;
            return this;
        }
        public Boolean getEnableLogConfig() {
            return this.enableLogConfig;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfig setContainerSpecs(java.util.List<DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecs> containerSpecs) {
            this.containerSpecs = containerSpecs;
            return this;
        }
        public java.util.List<DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigContainerSpecs> getContainerSpecs() {
            return this.containerSpecs;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfig setEnableBizMonitor(Boolean enableBizMonitor) {
            this.enableBizMonitor = enableBizMonitor;
            return this;
        }
        public Boolean getEnableBizMonitor() {
            return this.enableBizMonitor;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfig setBizMonitorPaths(java.util.List<String> bizMonitorPaths) {
            this.bizMonitorPaths = bizMonitorPaths;
            return this;
        }
        public java.util.List<String> getBizMonitorPaths() {
            return this.bizMonitorPaths;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfig setDeployConfig(DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfig deployConfig) {
            this.deployConfig = deployConfig;
            return this;
        }
        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigDeployConfig getDeployConfig() {
            return this.deployConfig;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfig setEnableSofaMesh(Boolean enableSofaMesh) {
            this.enableSofaMesh = enableSofaMesh;
            return this;
        }
        public Boolean getEnableSofaMesh() {
            return this.enableSofaMesh;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfig setSidecarConfigs(java.util.List<DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigSidecarConfigs> sidecarConfigs) {
            this.sidecarConfigs = sidecarConfigs;
            return this;
        }
        public java.util.List<DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigSidecarConfigs> getSidecarConfigs() {
            return this.sidecarConfigs;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfig setIngresses(java.util.List<DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngresses> ingresses) {
            this.ingresses = ingresses;
            return this;
        }
        public java.util.List<DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfigIngresses> getIngresses() {
            return this.ingresses;
        }

    }

    public static class DescribeLDCContainerServiceRevisionResponseBodyRevision extends TeaModel {
        @NameInMap("AppInfo")
        public DescribeLDCContainerServiceRevisionResponseBodyRevisionAppInfo appInfo;

        @NameInMap("DeployStatus")
        public String deployStatus;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("MetaStatus")
        public String metaStatus;

        @NameInMap("ContainerServiceName")
        public String containerServiceName;

        @NameInMap("ContainerServiceConfig")
        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfig containerServiceConfig;

        public static DescribeLDCContainerServiceRevisionResponseBodyRevision build(java.util.Map<String, ?> map) throws Exception {
            DescribeLDCContainerServiceRevisionResponseBodyRevision self = new DescribeLDCContainerServiceRevisionResponseBodyRevision();
            return TeaModel.build(map, self);
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevision setAppInfo(DescribeLDCContainerServiceRevisionResponseBodyRevisionAppInfo appInfo) {
            this.appInfo = appInfo;
            return this;
        }
        public DescribeLDCContainerServiceRevisionResponseBodyRevisionAppInfo getAppInfo() {
            return this.appInfo;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevision setDeployStatus(String deployStatus) {
            this.deployStatus = deployStatus;
            return this;
        }
        public String getDeployStatus() {
            return this.deployStatus;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevision setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevision setMetaStatus(String metaStatus) {
            this.metaStatus = metaStatus;
            return this;
        }
        public String getMetaStatus() {
            return this.metaStatus;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevision setContainerServiceName(String containerServiceName) {
            this.containerServiceName = containerServiceName;
            return this;
        }
        public String getContainerServiceName() {
            return this.containerServiceName;
        }

        public DescribeLDCContainerServiceRevisionResponseBodyRevision setContainerServiceConfig(DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfig containerServiceConfig) {
            this.containerServiceConfig = containerServiceConfig;
            return this;
        }
        public DescribeLDCContainerServiceRevisionResponseBodyRevisionContainerServiceConfig getContainerServiceConfig() {
            return this.containerServiceConfig;
        }

    }

}
