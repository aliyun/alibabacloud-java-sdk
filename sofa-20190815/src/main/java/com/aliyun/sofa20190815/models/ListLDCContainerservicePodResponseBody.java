// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLDCContainerservicePodResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("PodList")
    public java.util.List<ListLDCContainerservicePodResponseBodyPodList> podList;

    public static ListLDCContainerservicePodResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLDCContainerservicePodResponseBody self = new ListLDCContainerservicePodResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLDCContainerservicePodResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLDCContainerservicePodResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListLDCContainerservicePodResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListLDCContainerservicePodResponseBody setPodList(java.util.List<ListLDCContainerservicePodResponseBodyPodList> podList) {
        this.podList = podList;
        return this;
    }
    public java.util.List<ListLDCContainerservicePodResponseBodyPodList> getPodList() {
        return this.podList;
    }

    public static class ListLDCContainerservicePodResponseBodyPodListContainersSpecEnvsValueFrom extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("ObjectName")
        public String objectName;

        @NameInMap("ObjectType")
        public String objectType;

        public static ListLDCContainerservicePodResponseBodyPodListContainersSpecEnvsValueFrom build(java.util.Map<String, ?> map) throws Exception {
            ListLDCContainerservicePodResponseBodyPodListContainersSpecEnvsValueFrom self = new ListLDCContainerservicePodResponseBodyPodListContainersSpecEnvsValueFrom();
            return TeaModel.build(map, self);
        }

        public ListLDCContainerservicePodResponseBodyPodListContainersSpecEnvsValueFrom setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListLDCContainerservicePodResponseBodyPodListContainersSpecEnvsValueFrom setObjectName(String objectName) {
            this.objectName = objectName;
            return this;
        }
        public String getObjectName() {
            return this.objectName;
        }

        public ListLDCContainerservicePodResponseBodyPodListContainersSpecEnvsValueFrom setObjectType(String objectType) {
            this.objectType = objectType;
            return this;
        }
        public String getObjectType() {
            return this.objectType;
        }

    }

    public static class ListLDCContainerservicePodResponseBodyPodListContainersSpecEnvs extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public String value;

        @NameInMap("ValueFrom")
        public ListLDCContainerservicePodResponseBodyPodListContainersSpecEnvsValueFrom valueFrom;

        public static ListLDCContainerservicePodResponseBodyPodListContainersSpecEnvs build(java.util.Map<String, ?> map) throws Exception {
            ListLDCContainerservicePodResponseBodyPodListContainersSpecEnvs self = new ListLDCContainerservicePodResponseBodyPodListContainersSpecEnvs();
            return TeaModel.build(map, self);
        }

        public ListLDCContainerservicePodResponseBodyPodListContainersSpecEnvs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListLDCContainerservicePodResponseBodyPodListContainersSpecEnvs setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListLDCContainerservicePodResponseBodyPodListContainersSpecEnvs setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public ListLDCContainerservicePodResponseBodyPodListContainersSpecEnvs setValueFrom(ListLDCContainerservicePodResponseBodyPodListContainersSpecEnvsValueFrom valueFrom) {
            this.valueFrom = valueFrom;
            return this;
        }
        public ListLDCContainerservicePodResponseBodyPodListContainersSpecEnvsValueFrom getValueFrom() {
            return this.valueFrom;
        }

    }

    public static class ListLDCContainerservicePodResponseBodyPodListContainersSpecEnvOverrides extends TeaModel {
        @NameInMap("Cell")
        public String cell;

        @NameInMap("Name")
        public String name;

        @NameInMap("Value")
        public String value;

        public static ListLDCContainerservicePodResponseBodyPodListContainersSpecEnvOverrides build(java.util.Map<String, ?> map) throws Exception {
            ListLDCContainerservicePodResponseBodyPodListContainersSpecEnvOverrides self = new ListLDCContainerservicePodResponseBodyPodListContainersSpecEnvOverrides();
            return TeaModel.build(map, self);
        }

        public ListLDCContainerservicePodResponseBodyPodListContainersSpecEnvOverrides setCell(String cell) {
            this.cell = cell;
            return this;
        }
        public String getCell() {
            return this.cell;
        }

        public ListLDCContainerservicePodResponseBodyPodListContainersSpecEnvOverrides setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListLDCContainerservicePodResponseBodyPodListContainersSpecEnvOverrides setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListLDCContainerservicePodResponseBodyPodListContainersSpecLogConfigs extends TeaModel {
        @NameInMap("ConfigName")
        public String configName;

        @NameInMap("InputType")
        public String inputType;

        @NameInMap("LogstoreName")
        public String logstoreName;

        @NameInMap("LogPath")
        public String logPath;

        public static ListLDCContainerservicePodResponseBodyPodListContainersSpecLogConfigs build(java.util.Map<String, ?> map) throws Exception {
            ListLDCContainerservicePodResponseBodyPodListContainersSpecLogConfigs self = new ListLDCContainerservicePodResponseBodyPodListContainersSpecLogConfigs();
            return TeaModel.build(map, self);
        }

        public ListLDCContainerservicePodResponseBodyPodListContainersSpecLogConfigs setConfigName(String configName) {
            this.configName = configName;
            return this;
        }
        public String getConfigName() {
            return this.configName;
        }

        public ListLDCContainerservicePodResponseBodyPodListContainersSpecLogConfigs setInputType(String inputType) {
            this.inputType = inputType;
            return this;
        }
        public String getInputType() {
            return this.inputType;
        }

        public ListLDCContainerservicePodResponseBodyPodListContainersSpecLogConfigs setLogstoreName(String logstoreName) {
            this.logstoreName = logstoreName;
            return this;
        }
        public String getLogstoreName() {
            return this.logstoreName;
        }

        public ListLDCContainerservicePodResponseBodyPodListContainersSpecLogConfigs setLogPath(String logPath) {
            this.logPath = logPath;
            return this;
        }
        public String getLogPath() {
            return this.logPath;
        }

    }

    public static class ListLDCContainerservicePodResponseBodyPodListContainersSpecVolumeMountsConfigmapSecretVolumeSource extends TeaModel {
        @NameInMap("VolumeRefName")
        public String volumeRefName;

        public static ListLDCContainerservicePodResponseBodyPodListContainersSpecVolumeMountsConfigmapSecretVolumeSource build(java.util.Map<String, ?> map) throws Exception {
            ListLDCContainerservicePodResponseBodyPodListContainersSpecVolumeMountsConfigmapSecretVolumeSource self = new ListLDCContainerservicePodResponseBodyPodListContainersSpecVolumeMountsConfigmapSecretVolumeSource();
            return TeaModel.build(map, self);
        }

        public ListLDCContainerservicePodResponseBodyPodListContainersSpecVolumeMountsConfigmapSecretVolumeSource setVolumeRefName(String volumeRefName) {
            this.volumeRefName = volumeRefName;
            return this;
        }
        public String getVolumeRefName() {
            return this.volumeRefName;
        }

    }

    public static class ListLDCContainerservicePodResponseBodyPodListContainersSpecVolumeMountsEmptyDirVolumeSource extends TeaModel {
        @NameInMap("Medium")
        public String medium;

        @NameInMap("Name")
        public String name;

        @NameInMap("SizeLimit")
        public String sizeLimit;

        public static ListLDCContainerservicePodResponseBodyPodListContainersSpecVolumeMountsEmptyDirVolumeSource build(java.util.Map<String, ?> map) throws Exception {
            ListLDCContainerservicePodResponseBodyPodListContainersSpecVolumeMountsEmptyDirVolumeSource self = new ListLDCContainerservicePodResponseBodyPodListContainersSpecVolumeMountsEmptyDirVolumeSource();
            return TeaModel.build(map, self);
        }

        public ListLDCContainerservicePodResponseBodyPodListContainersSpecVolumeMountsEmptyDirVolumeSource setMedium(String medium) {
            this.medium = medium;
            return this;
        }
        public String getMedium() {
            return this.medium;
        }

        public ListLDCContainerservicePodResponseBodyPodListContainersSpecVolumeMountsEmptyDirVolumeSource setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListLDCContainerservicePodResponseBodyPodListContainersSpecVolumeMountsEmptyDirVolumeSource setSizeLimit(String sizeLimit) {
            this.sizeLimit = sizeLimit;
            return this;
        }
        public String getSizeLimit() {
            return this.sizeLimit;
        }

    }

    public static class ListLDCContainerservicePodResponseBodyPodListContainersSpecVolumeMountsLocalDiskVolumeSource extends TeaModel {
        @NameInMap("CreateIfNotPresent")
        public Boolean createIfNotPresent;

        @NameInMap("HostDirectoryPath")
        public String hostDirectoryPath;

        public static ListLDCContainerservicePodResponseBodyPodListContainersSpecVolumeMountsLocalDiskVolumeSource build(java.util.Map<String, ?> map) throws Exception {
            ListLDCContainerservicePodResponseBodyPodListContainersSpecVolumeMountsLocalDiskVolumeSource self = new ListLDCContainerservicePodResponseBodyPodListContainersSpecVolumeMountsLocalDiskVolumeSource();
            return TeaModel.build(map, self);
        }

        public ListLDCContainerservicePodResponseBodyPodListContainersSpecVolumeMountsLocalDiskVolumeSource setCreateIfNotPresent(Boolean createIfNotPresent) {
            this.createIfNotPresent = createIfNotPresent;
            return this;
        }
        public Boolean getCreateIfNotPresent() {
            return this.createIfNotPresent;
        }

        public ListLDCContainerservicePodResponseBodyPodListContainersSpecVolumeMountsLocalDiskVolumeSource setHostDirectoryPath(String hostDirectoryPath) {
            this.hostDirectoryPath = hostDirectoryPath;
            return this;
        }
        public String getHostDirectoryPath() {
            return this.hostDirectoryPath;
        }

    }

    public static class ListLDCContainerservicePodResponseBodyPodListContainersSpecVolumeMountsPvcSource extends TeaModel {
        @NameInMap("PvcName")
        public String pvcName;

        public static ListLDCContainerservicePodResponseBodyPodListContainersSpecVolumeMountsPvcSource build(java.util.Map<String, ?> map) throws Exception {
            ListLDCContainerservicePodResponseBodyPodListContainersSpecVolumeMountsPvcSource self = new ListLDCContainerservicePodResponseBodyPodListContainersSpecVolumeMountsPvcSource();
            return TeaModel.build(map, self);
        }

        public ListLDCContainerservicePodResponseBodyPodListContainersSpecVolumeMountsPvcSource setPvcName(String pvcName) {
            this.pvcName = pvcName;
            return this;
        }
        public String getPvcName() {
            return this.pvcName;
        }

    }

    public static class ListLDCContainerservicePodResponseBodyPodListContainersSpecVolumeMounts extends TeaModel {
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
        public ListLDCContainerservicePodResponseBodyPodListContainersSpecVolumeMountsConfigmapSecretVolumeSource configmapSecretVolumeSource;

        @NameInMap("EmptyDirVolumeSource")
        public ListLDCContainerservicePodResponseBodyPodListContainersSpecVolumeMountsEmptyDirVolumeSource emptyDirVolumeSource;

        @NameInMap("LocalDiskVolumeSource")
        public ListLDCContainerservicePodResponseBodyPodListContainersSpecVolumeMountsLocalDiskVolumeSource localDiskVolumeSource;

        @NameInMap("PvcSource")
        public ListLDCContainerservicePodResponseBodyPodListContainersSpecVolumeMountsPvcSource pvcSource;

        public static ListLDCContainerservicePodResponseBodyPodListContainersSpecVolumeMounts build(java.util.Map<String, ?> map) throws Exception {
            ListLDCContainerservicePodResponseBodyPodListContainersSpecVolumeMounts self = new ListLDCContainerservicePodResponseBodyPodListContainersSpecVolumeMounts();
            return TeaModel.build(map, self);
        }

        public ListLDCContainerservicePodResponseBodyPodListContainersSpecVolumeMounts setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

        public ListLDCContainerservicePodResponseBodyPodListContainersSpecVolumeMounts setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListLDCContainerservicePodResponseBodyPodListContainersSpecVolumeMounts setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

        public ListLDCContainerservicePodResponseBodyPodListContainersSpecVolumeMounts setSubPath(String subPath) {
            this.subPath = subPath;
            return this;
        }
        public String getSubPath() {
            return this.subPath;
        }

        public ListLDCContainerservicePodResponseBodyPodListContainersSpecVolumeMounts setVolumeSourceCategoryType(String volumeSourceCategoryType) {
            this.volumeSourceCategoryType = volumeSourceCategoryType;
            return this;
        }
        public String getVolumeSourceCategoryType() {
            return this.volumeSourceCategoryType;
        }

        public ListLDCContainerservicePodResponseBodyPodListContainersSpecVolumeMounts setConfigmapSecretVolumeSource(ListLDCContainerservicePodResponseBodyPodListContainersSpecVolumeMountsConfigmapSecretVolumeSource configmapSecretVolumeSource) {
            this.configmapSecretVolumeSource = configmapSecretVolumeSource;
            return this;
        }
        public ListLDCContainerservicePodResponseBodyPodListContainersSpecVolumeMountsConfigmapSecretVolumeSource getConfigmapSecretVolumeSource() {
            return this.configmapSecretVolumeSource;
        }

        public ListLDCContainerservicePodResponseBodyPodListContainersSpecVolumeMounts setEmptyDirVolumeSource(ListLDCContainerservicePodResponseBodyPodListContainersSpecVolumeMountsEmptyDirVolumeSource emptyDirVolumeSource) {
            this.emptyDirVolumeSource = emptyDirVolumeSource;
            return this;
        }
        public ListLDCContainerservicePodResponseBodyPodListContainersSpecVolumeMountsEmptyDirVolumeSource getEmptyDirVolumeSource() {
            return this.emptyDirVolumeSource;
        }

        public ListLDCContainerservicePodResponseBodyPodListContainersSpecVolumeMounts setLocalDiskVolumeSource(ListLDCContainerservicePodResponseBodyPodListContainersSpecVolumeMountsLocalDiskVolumeSource localDiskVolumeSource) {
            this.localDiskVolumeSource = localDiskVolumeSource;
            return this;
        }
        public ListLDCContainerservicePodResponseBodyPodListContainersSpecVolumeMountsLocalDiskVolumeSource getLocalDiskVolumeSource() {
            return this.localDiskVolumeSource;
        }

        public ListLDCContainerservicePodResponseBodyPodListContainersSpecVolumeMounts setPvcSource(ListLDCContainerservicePodResponseBodyPodListContainersSpecVolumeMountsPvcSource pvcSource) {
            this.pvcSource = pvcSource;
            return this;
        }
        public ListLDCContainerservicePodResponseBodyPodListContainersSpecVolumeMountsPvcSource getPvcSource() {
            return this.pvcSource;
        }

    }

    public static class ListLDCContainerservicePodResponseBodyPodListContainersSpecHealthCheckConfigLivenessProbeExecAction extends TeaModel {
        @NameInMap("Command")
        public String command;

        public static ListLDCContainerservicePodResponseBodyPodListContainersSpecHealthCheckConfigLivenessProbeExecAction build(java.util.Map<String, ?> map) throws Exception {
            ListLDCContainerservicePodResponseBodyPodListContainersSpecHealthCheckConfigLivenessProbeExecAction self = new ListLDCContainerservicePodResponseBodyPodListContainersSpecHealthCheckConfigLivenessProbeExecAction();
            return TeaModel.build(map, self);
        }

        public ListLDCContainerservicePodResponseBodyPodListContainersSpecHealthCheckConfigLivenessProbeExecAction setCommand(String command) {
            this.command = command;
            return this;
        }
        public String getCommand() {
            return this.command;
        }

    }

    public static class ListLDCContainerservicePodResponseBodyPodListContainersSpecHealthCheckConfigLivenessProbeHttpGetAction extends TeaModel {
        @NameInMap("Path")
        public String path;

        @NameInMap("Port")
        public String port;

        @NameInMap("Scheme")
        public String scheme;

        public static ListLDCContainerservicePodResponseBodyPodListContainersSpecHealthCheckConfigLivenessProbeHttpGetAction build(java.util.Map<String, ?> map) throws Exception {
            ListLDCContainerservicePodResponseBodyPodListContainersSpecHealthCheckConfigLivenessProbeHttpGetAction self = new ListLDCContainerservicePodResponseBodyPodListContainersSpecHealthCheckConfigLivenessProbeHttpGetAction();
            return TeaModel.build(map, self);
        }

        public ListLDCContainerservicePodResponseBodyPodListContainersSpecHealthCheckConfigLivenessProbeHttpGetAction setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ListLDCContainerservicePodResponseBodyPodListContainersSpecHealthCheckConfigLivenessProbeHttpGetAction setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public ListLDCContainerservicePodResponseBodyPodListContainersSpecHealthCheckConfigLivenessProbeHttpGetAction setScheme(String scheme) {
            this.scheme = scheme;
            return this;
        }
        public String getScheme() {
            return this.scheme;
        }

    }

    public static class ListLDCContainerservicePodResponseBodyPodListContainersSpecHealthCheckConfigLivenessProbeTcpSocketAction extends TeaModel {
        @NameInMap("Port")
        public String port;

        public static ListLDCContainerservicePodResponseBodyPodListContainersSpecHealthCheckConfigLivenessProbeTcpSocketAction build(java.util.Map<String, ?> map) throws Exception {
            ListLDCContainerservicePodResponseBodyPodListContainersSpecHealthCheckConfigLivenessProbeTcpSocketAction self = new ListLDCContainerservicePodResponseBodyPodListContainersSpecHealthCheckConfigLivenessProbeTcpSocketAction();
            return TeaModel.build(map, self);
        }

        public ListLDCContainerservicePodResponseBodyPodListContainersSpecHealthCheckConfigLivenessProbeTcpSocketAction setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

    }

    public static class ListLDCContainerservicePodResponseBodyPodListContainersSpecHealthCheckConfigLivenessProbe extends TeaModel {
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
        public ListLDCContainerservicePodResponseBodyPodListContainersSpecHealthCheckConfigLivenessProbeExecAction execAction;

        @NameInMap("HttpGetAction")
        public ListLDCContainerservicePodResponseBodyPodListContainersSpecHealthCheckConfigLivenessProbeHttpGetAction httpGetAction;

        @NameInMap("TcpSocketAction")
        public ListLDCContainerservicePodResponseBodyPodListContainersSpecHealthCheckConfigLivenessProbeTcpSocketAction tcpSocketAction;

        public static ListLDCContainerservicePodResponseBodyPodListContainersSpecHealthCheckConfigLivenessProbe build(java.util.Map<String, ?> map) throws Exception {
            ListLDCContainerservicePodResponseBodyPodListContainersSpecHealthCheckConfigLivenessProbe self = new ListLDCContainerservicePodResponseBodyPodListContainersSpecHealthCheckConfigLivenessProbe();
            return TeaModel.build(map, self);
        }

        public ListLDCContainerservicePodResponseBodyPodListContainersSpecHealthCheckConfigLivenessProbe setFailureThreshold(Long failureThreshold) {
            this.failureThreshold = failureThreshold;
            return this;
        }
        public Long getFailureThreshold() {
            return this.failureThreshold;
        }

        public ListLDCContainerservicePodResponseBodyPodListContainersSpecHealthCheckConfigLivenessProbe setInitialDelaySeconds(Long initialDelaySeconds) {
            this.initialDelaySeconds = initialDelaySeconds;
            return this;
        }
        public Long getInitialDelaySeconds() {
            return this.initialDelaySeconds;
        }

        public ListLDCContainerservicePodResponseBodyPodListContainersSpecHealthCheckConfigLivenessProbe setPeriodSeconds(Long periodSeconds) {
            this.periodSeconds = periodSeconds;
            return this;
        }
        public Long getPeriodSeconds() {
            return this.periodSeconds;
        }

        public ListLDCContainerservicePodResponseBodyPodListContainersSpecHealthCheckConfigLivenessProbe setSuccessThreshold(Long successThreshold) {
            this.successThreshold = successThreshold;
            return this;
        }
        public Long getSuccessThreshold() {
            return this.successThreshold;
        }

        public ListLDCContainerservicePodResponseBodyPodListContainersSpecHealthCheckConfigLivenessProbe setTimeOutSeconds(Long timeOutSeconds) {
            this.timeOutSeconds = timeOutSeconds;
            return this;
        }
        public Long getTimeOutSeconds() {
            return this.timeOutSeconds;
        }

        public ListLDCContainerservicePodResponseBodyPodListContainersSpecHealthCheckConfigLivenessProbe setExecAction(ListLDCContainerservicePodResponseBodyPodListContainersSpecHealthCheckConfigLivenessProbeExecAction execAction) {
            this.execAction = execAction;
            return this;
        }
        public ListLDCContainerservicePodResponseBodyPodListContainersSpecHealthCheckConfigLivenessProbeExecAction getExecAction() {
            return this.execAction;
        }

        public ListLDCContainerservicePodResponseBodyPodListContainersSpecHealthCheckConfigLivenessProbe setHttpGetAction(ListLDCContainerservicePodResponseBodyPodListContainersSpecHealthCheckConfigLivenessProbeHttpGetAction httpGetAction) {
            this.httpGetAction = httpGetAction;
            return this;
        }
        public ListLDCContainerservicePodResponseBodyPodListContainersSpecHealthCheckConfigLivenessProbeHttpGetAction getHttpGetAction() {
            return this.httpGetAction;
        }

        public ListLDCContainerservicePodResponseBodyPodListContainersSpecHealthCheckConfigLivenessProbe setTcpSocketAction(ListLDCContainerservicePodResponseBodyPodListContainersSpecHealthCheckConfigLivenessProbeTcpSocketAction tcpSocketAction) {
            this.tcpSocketAction = tcpSocketAction;
            return this;
        }
        public ListLDCContainerservicePodResponseBodyPodListContainersSpecHealthCheckConfigLivenessProbeTcpSocketAction getTcpSocketAction() {
            return this.tcpSocketAction;
        }

    }

    public static class ListLDCContainerservicePodResponseBodyPodListContainersSpecHealthCheckConfigReadinessProbeExecAction extends TeaModel {
        @NameInMap("Command")
        public String command;

        public static ListLDCContainerservicePodResponseBodyPodListContainersSpecHealthCheckConfigReadinessProbeExecAction build(java.util.Map<String, ?> map) throws Exception {
            ListLDCContainerservicePodResponseBodyPodListContainersSpecHealthCheckConfigReadinessProbeExecAction self = new ListLDCContainerservicePodResponseBodyPodListContainersSpecHealthCheckConfigReadinessProbeExecAction();
            return TeaModel.build(map, self);
        }

        public ListLDCContainerservicePodResponseBodyPodListContainersSpecHealthCheckConfigReadinessProbeExecAction setCommand(String command) {
            this.command = command;
            return this;
        }
        public String getCommand() {
            return this.command;
        }

    }

    public static class ListLDCContainerservicePodResponseBodyPodListContainersSpecHealthCheckConfigReadinessProbeHttpGetAction extends TeaModel {
        @NameInMap("Path")
        public String path;

        @NameInMap("Port")
        public String port;

        @NameInMap("Scheme")
        public String scheme;

        public static ListLDCContainerservicePodResponseBodyPodListContainersSpecHealthCheckConfigReadinessProbeHttpGetAction build(java.util.Map<String, ?> map) throws Exception {
            ListLDCContainerservicePodResponseBodyPodListContainersSpecHealthCheckConfigReadinessProbeHttpGetAction self = new ListLDCContainerservicePodResponseBodyPodListContainersSpecHealthCheckConfigReadinessProbeHttpGetAction();
            return TeaModel.build(map, self);
        }

        public ListLDCContainerservicePodResponseBodyPodListContainersSpecHealthCheckConfigReadinessProbeHttpGetAction setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ListLDCContainerservicePodResponseBodyPodListContainersSpecHealthCheckConfigReadinessProbeHttpGetAction setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public ListLDCContainerservicePodResponseBodyPodListContainersSpecHealthCheckConfigReadinessProbeHttpGetAction setScheme(String scheme) {
            this.scheme = scheme;
            return this;
        }
        public String getScheme() {
            return this.scheme;
        }

    }

    public static class ListLDCContainerservicePodResponseBodyPodListContainersSpecHealthCheckConfigReadinessProbeTcpSocketAction extends TeaModel {
        @NameInMap("Port")
        public String port;

        public static ListLDCContainerservicePodResponseBodyPodListContainersSpecHealthCheckConfigReadinessProbeTcpSocketAction build(java.util.Map<String, ?> map) throws Exception {
            ListLDCContainerservicePodResponseBodyPodListContainersSpecHealthCheckConfigReadinessProbeTcpSocketAction self = new ListLDCContainerservicePodResponseBodyPodListContainersSpecHealthCheckConfigReadinessProbeTcpSocketAction();
            return TeaModel.build(map, self);
        }

        public ListLDCContainerservicePodResponseBodyPodListContainersSpecHealthCheckConfigReadinessProbeTcpSocketAction setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

    }

    public static class ListLDCContainerservicePodResponseBodyPodListContainersSpecHealthCheckConfigReadinessProbe extends TeaModel {
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
        public ListLDCContainerservicePodResponseBodyPodListContainersSpecHealthCheckConfigReadinessProbeExecAction execAction;

        @NameInMap("HttpGetAction")
        public ListLDCContainerservicePodResponseBodyPodListContainersSpecHealthCheckConfigReadinessProbeHttpGetAction httpGetAction;

        @NameInMap("TcpSocketAction")
        public ListLDCContainerservicePodResponseBodyPodListContainersSpecHealthCheckConfigReadinessProbeTcpSocketAction tcpSocketAction;

        public static ListLDCContainerservicePodResponseBodyPodListContainersSpecHealthCheckConfigReadinessProbe build(java.util.Map<String, ?> map) throws Exception {
            ListLDCContainerservicePodResponseBodyPodListContainersSpecHealthCheckConfigReadinessProbe self = new ListLDCContainerservicePodResponseBodyPodListContainersSpecHealthCheckConfigReadinessProbe();
            return TeaModel.build(map, self);
        }

        public ListLDCContainerservicePodResponseBodyPodListContainersSpecHealthCheckConfigReadinessProbe setFailureThreshold(Long failureThreshold) {
            this.failureThreshold = failureThreshold;
            return this;
        }
        public Long getFailureThreshold() {
            return this.failureThreshold;
        }

        public ListLDCContainerservicePodResponseBodyPodListContainersSpecHealthCheckConfigReadinessProbe setInitialDelaySeconds(Long initialDelaySeconds) {
            this.initialDelaySeconds = initialDelaySeconds;
            return this;
        }
        public Long getInitialDelaySeconds() {
            return this.initialDelaySeconds;
        }

        public ListLDCContainerservicePodResponseBodyPodListContainersSpecHealthCheckConfigReadinessProbe setPeriodSeconds(Long periodSeconds) {
            this.periodSeconds = periodSeconds;
            return this;
        }
        public Long getPeriodSeconds() {
            return this.periodSeconds;
        }

        public ListLDCContainerservicePodResponseBodyPodListContainersSpecHealthCheckConfigReadinessProbe setSuccessThreshold(Long successThreshold) {
            this.successThreshold = successThreshold;
            return this;
        }
        public Long getSuccessThreshold() {
            return this.successThreshold;
        }

        public ListLDCContainerservicePodResponseBodyPodListContainersSpecHealthCheckConfigReadinessProbe setTimeOutSeconds(Long timeOutSeconds) {
            this.timeOutSeconds = timeOutSeconds;
            return this;
        }
        public Long getTimeOutSeconds() {
            return this.timeOutSeconds;
        }

        public ListLDCContainerservicePodResponseBodyPodListContainersSpecHealthCheckConfigReadinessProbe setExecAction(ListLDCContainerservicePodResponseBodyPodListContainersSpecHealthCheckConfigReadinessProbeExecAction execAction) {
            this.execAction = execAction;
            return this;
        }
        public ListLDCContainerservicePodResponseBodyPodListContainersSpecHealthCheckConfigReadinessProbeExecAction getExecAction() {
            return this.execAction;
        }

        public ListLDCContainerservicePodResponseBodyPodListContainersSpecHealthCheckConfigReadinessProbe setHttpGetAction(ListLDCContainerservicePodResponseBodyPodListContainersSpecHealthCheckConfigReadinessProbeHttpGetAction httpGetAction) {
            this.httpGetAction = httpGetAction;
            return this;
        }
        public ListLDCContainerservicePodResponseBodyPodListContainersSpecHealthCheckConfigReadinessProbeHttpGetAction getHttpGetAction() {
            return this.httpGetAction;
        }

        public ListLDCContainerservicePodResponseBodyPodListContainersSpecHealthCheckConfigReadinessProbe setTcpSocketAction(ListLDCContainerservicePodResponseBodyPodListContainersSpecHealthCheckConfigReadinessProbeTcpSocketAction tcpSocketAction) {
            this.tcpSocketAction = tcpSocketAction;
            return this;
        }
        public ListLDCContainerservicePodResponseBodyPodListContainersSpecHealthCheckConfigReadinessProbeTcpSocketAction getTcpSocketAction() {
            return this.tcpSocketAction;
        }

    }

    public static class ListLDCContainerservicePodResponseBodyPodListContainersSpecHealthCheckConfig extends TeaModel {
        @NameInMap("LivenessProbe")
        public ListLDCContainerservicePodResponseBodyPodListContainersSpecHealthCheckConfigLivenessProbe livenessProbe;

        @NameInMap("ReadinessProbe")
        public ListLDCContainerservicePodResponseBodyPodListContainersSpecHealthCheckConfigReadinessProbe readinessProbe;

        public static ListLDCContainerservicePodResponseBodyPodListContainersSpecHealthCheckConfig build(java.util.Map<String, ?> map) throws Exception {
            ListLDCContainerservicePodResponseBodyPodListContainersSpecHealthCheckConfig self = new ListLDCContainerservicePodResponseBodyPodListContainersSpecHealthCheckConfig();
            return TeaModel.build(map, self);
        }

        public ListLDCContainerservicePodResponseBodyPodListContainersSpecHealthCheckConfig setLivenessProbe(ListLDCContainerservicePodResponseBodyPodListContainersSpecHealthCheckConfigLivenessProbe livenessProbe) {
            this.livenessProbe = livenessProbe;
            return this;
        }
        public ListLDCContainerservicePodResponseBodyPodListContainersSpecHealthCheckConfigLivenessProbe getLivenessProbe() {
            return this.livenessProbe;
        }

        public ListLDCContainerservicePodResponseBodyPodListContainersSpecHealthCheckConfig setReadinessProbe(ListLDCContainerservicePodResponseBodyPodListContainersSpecHealthCheckConfigReadinessProbe readinessProbe) {
            this.readinessProbe = readinessProbe;
            return this;
        }
        public ListLDCContainerservicePodResponseBodyPodListContainersSpecHealthCheckConfigReadinessProbe getReadinessProbe() {
            return this.readinessProbe;
        }

    }

    public static class ListLDCContainerservicePodResponseBodyPodListContainersSpecLifecycleHookPostStartExec extends TeaModel {
        @NameInMap("Command")
        public String command;

        public static ListLDCContainerservicePodResponseBodyPodListContainersSpecLifecycleHookPostStartExec build(java.util.Map<String, ?> map) throws Exception {
            ListLDCContainerservicePodResponseBodyPodListContainersSpecLifecycleHookPostStartExec self = new ListLDCContainerservicePodResponseBodyPodListContainersSpecLifecycleHookPostStartExec();
            return TeaModel.build(map, self);
        }

        public ListLDCContainerservicePodResponseBodyPodListContainersSpecLifecycleHookPostStartExec setCommand(String command) {
            this.command = command;
            return this;
        }
        public String getCommand() {
            return this.command;
        }

    }

    public static class ListLDCContainerservicePodResponseBodyPodListContainersSpecLifecycleHookPostStartHttp extends TeaModel {
        @NameInMap("Path")
        public String path;

        @NameInMap("Port")
        public String port;

        @NameInMap("Scheme")
        public String scheme;

        public static ListLDCContainerservicePodResponseBodyPodListContainersSpecLifecycleHookPostStartHttp build(java.util.Map<String, ?> map) throws Exception {
            ListLDCContainerservicePodResponseBodyPodListContainersSpecLifecycleHookPostStartHttp self = new ListLDCContainerservicePodResponseBodyPodListContainersSpecLifecycleHookPostStartHttp();
            return TeaModel.build(map, self);
        }

        public ListLDCContainerservicePodResponseBodyPodListContainersSpecLifecycleHookPostStartHttp setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ListLDCContainerservicePodResponseBodyPodListContainersSpecLifecycleHookPostStartHttp setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public ListLDCContainerservicePodResponseBodyPodListContainersSpecLifecycleHookPostStartHttp setScheme(String scheme) {
            this.scheme = scheme;
            return this;
        }
        public String getScheme() {
            return this.scheme;
        }

    }

    public static class ListLDCContainerservicePodResponseBodyPodListContainersSpecLifecycleHookPostStartTcp extends TeaModel {
        @NameInMap("Port")
        public String port;

        public static ListLDCContainerservicePodResponseBodyPodListContainersSpecLifecycleHookPostStartTcp build(java.util.Map<String, ?> map) throws Exception {
            ListLDCContainerservicePodResponseBodyPodListContainersSpecLifecycleHookPostStartTcp self = new ListLDCContainerservicePodResponseBodyPodListContainersSpecLifecycleHookPostStartTcp();
            return TeaModel.build(map, self);
        }

        public ListLDCContainerservicePodResponseBodyPodListContainersSpecLifecycleHookPostStartTcp setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

    }

    public static class ListLDCContainerservicePodResponseBodyPodListContainersSpecLifecycleHookPreStopExec extends TeaModel {
        @NameInMap("Command")
        public String command;

        public static ListLDCContainerservicePodResponseBodyPodListContainersSpecLifecycleHookPreStopExec build(java.util.Map<String, ?> map) throws Exception {
            ListLDCContainerservicePodResponseBodyPodListContainersSpecLifecycleHookPreStopExec self = new ListLDCContainerservicePodResponseBodyPodListContainersSpecLifecycleHookPreStopExec();
            return TeaModel.build(map, self);
        }

        public ListLDCContainerservicePodResponseBodyPodListContainersSpecLifecycleHookPreStopExec setCommand(String command) {
            this.command = command;
            return this;
        }
        public String getCommand() {
            return this.command;
        }

    }

    public static class ListLDCContainerservicePodResponseBodyPodListContainersSpecLifecycleHookPreStopHttp extends TeaModel {
        @NameInMap("Path")
        public String path;

        @NameInMap("Port")
        public String port;

        @NameInMap("Scheme")
        public String scheme;

        public static ListLDCContainerservicePodResponseBodyPodListContainersSpecLifecycleHookPreStopHttp build(java.util.Map<String, ?> map) throws Exception {
            ListLDCContainerservicePodResponseBodyPodListContainersSpecLifecycleHookPreStopHttp self = new ListLDCContainerservicePodResponseBodyPodListContainersSpecLifecycleHookPreStopHttp();
            return TeaModel.build(map, self);
        }

        public ListLDCContainerservicePodResponseBodyPodListContainersSpecLifecycleHookPreStopHttp setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ListLDCContainerservicePodResponseBodyPodListContainersSpecLifecycleHookPreStopHttp setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public ListLDCContainerservicePodResponseBodyPodListContainersSpecLifecycleHookPreStopHttp setScheme(String scheme) {
            this.scheme = scheme;
            return this;
        }
        public String getScheme() {
            return this.scheme;
        }

    }

    public static class ListLDCContainerservicePodResponseBodyPodListContainersSpecLifecycleHookPreStopTcp extends TeaModel {
        @NameInMap("Port")
        public String port;

        public static ListLDCContainerservicePodResponseBodyPodListContainersSpecLifecycleHookPreStopTcp build(java.util.Map<String, ?> map) throws Exception {
            ListLDCContainerservicePodResponseBodyPodListContainersSpecLifecycleHookPreStopTcp self = new ListLDCContainerservicePodResponseBodyPodListContainersSpecLifecycleHookPreStopTcp();
            return TeaModel.build(map, self);
        }

        public ListLDCContainerservicePodResponseBodyPodListContainersSpecLifecycleHookPreStopTcp setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

    }

    public static class ListLDCContainerservicePodResponseBodyPodListContainersSpecLifecycleHook extends TeaModel {
        @NameInMap("PostStartExec")
        public ListLDCContainerservicePodResponseBodyPodListContainersSpecLifecycleHookPostStartExec postStartExec;

        @NameInMap("PostStartHttp")
        public ListLDCContainerservicePodResponseBodyPodListContainersSpecLifecycleHookPostStartHttp postStartHttp;

        @NameInMap("PostStartTcp")
        public ListLDCContainerservicePodResponseBodyPodListContainersSpecLifecycleHookPostStartTcp postStartTcp;

        @NameInMap("PreStopExec")
        public ListLDCContainerservicePodResponseBodyPodListContainersSpecLifecycleHookPreStopExec preStopExec;

        @NameInMap("PreStopHttp")
        public ListLDCContainerservicePodResponseBodyPodListContainersSpecLifecycleHookPreStopHttp preStopHttp;

        @NameInMap("PreStopTcp")
        public ListLDCContainerservicePodResponseBodyPodListContainersSpecLifecycleHookPreStopTcp preStopTcp;

        public static ListLDCContainerservicePodResponseBodyPodListContainersSpecLifecycleHook build(java.util.Map<String, ?> map) throws Exception {
            ListLDCContainerservicePodResponseBodyPodListContainersSpecLifecycleHook self = new ListLDCContainerservicePodResponseBodyPodListContainersSpecLifecycleHook();
            return TeaModel.build(map, self);
        }

        public ListLDCContainerservicePodResponseBodyPodListContainersSpecLifecycleHook setPostStartExec(ListLDCContainerservicePodResponseBodyPodListContainersSpecLifecycleHookPostStartExec postStartExec) {
            this.postStartExec = postStartExec;
            return this;
        }
        public ListLDCContainerservicePodResponseBodyPodListContainersSpecLifecycleHookPostStartExec getPostStartExec() {
            return this.postStartExec;
        }

        public ListLDCContainerservicePodResponseBodyPodListContainersSpecLifecycleHook setPostStartHttp(ListLDCContainerservicePodResponseBodyPodListContainersSpecLifecycleHookPostStartHttp postStartHttp) {
            this.postStartHttp = postStartHttp;
            return this;
        }
        public ListLDCContainerservicePodResponseBodyPodListContainersSpecLifecycleHookPostStartHttp getPostStartHttp() {
            return this.postStartHttp;
        }

        public ListLDCContainerservicePodResponseBodyPodListContainersSpecLifecycleHook setPostStartTcp(ListLDCContainerservicePodResponseBodyPodListContainersSpecLifecycleHookPostStartTcp postStartTcp) {
            this.postStartTcp = postStartTcp;
            return this;
        }
        public ListLDCContainerservicePodResponseBodyPodListContainersSpecLifecycleHookPostStartTcp getPostStartTcp() {
            return this.postStartTcp;
        }

        public ListLDCContainerservicePodResponseBodyPodListContainersSpecLifecycleHook setPreStopExec(ListLDCContainerservicePodResponseBodyPodListContainersSpecLifecycleHookPreStopExec preStopExec) {
            this.preStopExec = preStopExec;
            return this;
        }
        public ListLDCContainerservicePodResponseBodyPodListContainersSpecLifecycleHookPreStopExec getPreStopExec() {
            return this.preStopExec;
        }

        public ListLDCContainerservicePodResponseBodyPodListContainersSpecLifecycleHook setPreStopHttp(ListLDCContainerservicePodResponseBodyPodListContainersSpecLifecycleHookPreStopHttp preStopHttp) {
            this.preStopHttp = preStopHttp;
            return this;
        }
        public ListLDCContainerservicePodResponseBodyPodListContainersSpecLifecycleHookPreStopHttp getPreStopHttp() {
            return this.preStopHttp;
        }

        public ListLDCContainerservicePodResponseBodyPodListContainersSpecLifecycleHook setPreStopTcp(ListLDCContainerservicePodResponseBodyPodListContainersSpecLifecycleHookPreStopTcp preStopTcp) {
            this.preStopTcp = preStopTcp;
            return this;
        }
        public ListLDCContainerservicePodResponseBodyPodListContainersSpecLifecycleHookPreStopTcp getPreStopTcp() {
            return this.preStopTcp;
        }

    }

    public static class ListLDCContainerservicePodResponseBodyPodListContainersSpec extends TeaModel {
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
        public java.util.List<ListLDCContainerservicePodResponseBodyPodListContainersSpecEnvs> envs;

        @NameInMap("EnvOverrides")
        public java.util.List<ListLDCContainerservicePodResponseBodyPodListContainersSpecEnvOverrides> envOverrides;

        @NameInMap("LogConfigs")
        public java.util.List<ListLDCContainerservicePodResponseBodyPodListContainersSpecLogConfigs> logConfigs;

        @NameInMap("VolumeMounts")
        public java.util.List<ListLDCContainerservicePodResponseBodyPodListContainersSpecVolumeMounts> volumeMounts;

        @NameInMap("HealthCheckConfig")
        public ListLDCContainerservicePodResponseBodyPodListContainersSpecHealthCheckConfig healthCheckConfig;

        @NameInMap("LifecycleHook")
        public ListLDCContainerservicePodResponseBodyPodListContainersSpecLifecycleHook lifecycleHook;

        public static ListLDCContainerservicePodResponseBodyPodListContainersSpec build(java.util.Map<String, ?> map) throws Exception {
            ListLDCContainerservicePodResponseBodyPodListContainersSpec self = new ListLDCContainerservicePodResponseBodyPodListContainersSpec();
            return TeaModel.build(map, self);
        }

        public ListLDCContainerservicePodResponseBodyPodListContainersSpec setCpuLimit(String cpuLimit) {
            this.cpuLimit = cpuLimit;
            return this;
        }
        public String getCpuLimit() {
            return this.cpuLimit;
        }

        public ListLDCContainerservicePodResponseBodyPodListContainersSpec setCpuRequest(String cpuRequest) {
            this.cpuRequest = cpuRequest;
            return this;
        }
        public String getCpuRequest() {
            return this.cpuRequest;
        }

        public ListLDCContainerservicePodResponseBodyPodListContainersSpec setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public ListLDCContainerservicePodResponseBodyPodListContainersSpec setImageBuildName(String imageBuildName) {
            this.imageBuildName = imageBuildName;
            return this;
        }
        public String getImageBuildName() {
            return this.imageBuildName;
        }

        public ListLDCContainerservicePodResponseBodyPodListContainersSpec setImagePullSecret(String imagePullSecret) {
            this.imagePullSecret = imagePullSecret;
            return this;
        }
        public String getImagePullSecret() {
            return this.imagePullSecret;
        }

        public ListLDCContainerservicePodResponseBodyPodListContainersSpec setImageSource(String imageSource) {
            this.imageSource = imageSource;
            return this;
        }
        public String getImageSource() {
            return this.imageSource;
        }

        public ListLDCContainerservicePodResponseBodyPodListContainersSpec setMemoryLimit(String memoryLimit) {
            this.memoryLimit = memoryLimit;
            return this;
        }
        public String getMemoryLimit() {
            return this.memoryLimit;
        }

        public ListLDCContainerservicePodResponseBodyPodListContainersSpec setMemoryRequest(String memoryRequest) {
            this.memoryRequest = memoryRequest;
            return this;
        }
        public String getMemoryRequest() {
            return this.memoryRequest;
        }

        public ListLDCContainerservicePodResponseBodyPodListContainersSpec setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListLDCContainerservicePodResponseBodyPodListContainersSpec setRestartPolicy(String restartPolicy) {
            this.restartPolicy = restartPolicy;
            return this;
        }
        public String getRestartPolicy() {
            return this.restartPolicy;
        }

        public ListLDCContainerservicePodResponseBodyPodListContainersSpec setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListLDCContainerservicePodResponseBodyPodListContainersSpec setVolumesStr(String volumesStr) {
            this.volumesStr = volumesStr;
            return this;
        }
        public String getVolumesStr() {
            return this.volumesStr;
        }

        public ListLDCContainerservicePodResponseBodyPodListContainersSpec setVolumeMountsStr(String volumeMountsStr) {
            this.volumeMountsStr = volumeMountsStr;
            return this;
        }
        public String getVolumeMountsStr() {
            return this.volumeMountsStr;
        }

        public ListLDCContainerservicePodResponseBodyPodListContainersSpec setEntryPoints(java.util.List<String> entryPoints) {
            this.entryPoints = entryPoints;
            return this;
        }
        public java.util.List<String> getEntryPoints() {
            return this.entryPoints;
        }

        public ListLDCContainerservicePodResponseBodyPodListContainersSpec setEnvs(java.util.List<ListLDCContainerservicePodResponseBodyPodListContainersSpecEnvs> envs) {
            this.envs = envs;
            return this;
        }
        public java.util.List<ListLDCContainerservicePodResponseBodyPodListContainersSpecEnvs> getEnvs() {
            return this.envs;
        }

        public ListLDCContainerservicePodResponseBodyPodListContainersSpec setEnvOverrides(java.util.List<ListLDCContainerservicePodResponseBodyPodListContainersSpecEnvOverrides> envOverrides) {
            this.envOverrides = envOverrides;
            return this;
        }
        public java.util.List<ListLDCContainerservicePodResponseBodyPodListContainersSpecEnvOverrides> getEnvOverrides() {
            return this.envOverrides;
        }

        public ListLDCContainerservicePodResponseBodyPodListContainersSpec setLogConfigs(java.util.List<ListLDCContainerservicePodResponseBodyPodListContainersSpecLogConfigs> logConfigs) {
            this.logConfigs = logConfigs;
            return this;
        }
        public java.util.List<ListLDCContainerservicePodResponseBodyPodListContainersSpecLogConfigs> getLogConfigs() {
            return this.logConfigs;
        }

        public ListLDCContainerservicePodResponseBodyPodListContainersSpec setVolumeMounts(java.util.List<ListLDCContainerservicePodResponseBodyPodListContainersSpecVolumeMounts> volumeMounts) {
            this.volumeMounts = volumeMounts;
            return this;
        }
        public java.util.List<ListLDCContainerservicePodResponseBodyPodListContainersSpecVolumeMounts> getVolumeMounts() {
            return this.volumeMounts;
        }

        public ListLDCContainerservicePodResponseBodyPodListContainersSpec setHealthCheckConfig(ListLDCContainerservicePodResponseBodyPodListContainersSpecHealthCheckConfig healthCheckConfig) {
            this.healthCheckConfig = healthCheckConfig;
            return this;
        }
        public ListLDCContainerservicePodResponseBodyPodListContainersSpecHealthCheckConfig getHealthCheckConfig() {
            return this.healthCheckConfig;
        }

        public ListLDCContainerservicePodResponseBodyPodListContainersSpec setLifecycleHook(ListLDCContainerservicePodResponseBodyPodListContainersSpecLifecycleHook lifecycleHook) {
            this.lifecycleHook = lifecycleHook;
            return this;
        }
        public ListLDCContainerservicePodResponseBodyPodListContainersSpecLifecycleHook getLifecycleHook() {
            return this.lifecycleHook;
        }

    }

    public static class ListLDCContainerservicePodResponseBodyPodListContainers extends TeaModel {
        @NameInMap("ContainerId")
        public String containerId;

        @NameInMap("Image")
        public String image;

        @NameInMap("LastStartTime")
        public String lastStartTime;

        @NameInMap("Name")
        public String name;

        @NameInMap("RestartCount")
        public Long restartCount;

        @NameInMap("State")
        public String state;

        @NameInMap("Spec")
        public ListLDCContainerservicePodResponseBodyPodListContainersSpec spec;

        public static ListLDCContainerservicePodResponseBodyPodListContainers build(java.util.Map<String, ?> map) throws Exception {
            ListLDCContainerservicePodResponseBodyPodListContainers self = new ListLDCContainerservicePodResponseBodyPodListContainers();
            return TeaModel.build(map, self);
        }

        public ListLDCContainerservicePodResponseBodyPodListContainers setContainerId(String containerId) {
            this.containerId = containerId;
            return this;
        }
        public String getContainerId() {
            return this.containerId;
        }

        public ListLDCContainerservicePodResponseBodyPodListContainers setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public ListLDCContainerservicePodResponseBodyPodListContainers setLastStartTime(String lastStartTime) {
            this.lastStartTime = lastStartTime;
            return this;
        }
        public String getLastStartTime() {
            return this.lastStartTime;
        }

        public ListLDCContainerservicePodResponseBodyPodListContainers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListLDCContainerservicePodResponseBodyPodListContainers setRestartCount(Long restartCount) {
            this.restartCount = restartCount;
            return this;
        }
        public Long getRestartCount() {
            return this.restartCount;
        }

        public ListLDCContainerservicePodResponseBodyPodListContainers setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListLDCContainerservicePodResponseBodyPodListContainers setSpec(ListLDCContainerservicePodResponseBodyPodListContainersSpec spec) {
            this.spec = spec;
            return this;
        }
        public ListLDCContainerservicePodResponseBodyPodListContainersSpec getSpec() {
            return this.spec;
        }

    }

    public static class ListLDCContainerservicePodResponseBodyPodListVolumes extends TeaModel {
        @NameInMap("HostPath")
        public String hostPath;

        @NameInMap("Name")
        public String name;

        @NameInMap("ReadOnly")
        public Boolean readOnly;

        @NameInMap("RefResourceName")
        public String refResourceName;

        @NameInMap("Type")
        public String type;

        public static ListLDCContainerservicePodResponseBodyPodListVolumes build(java.util.Map<String, ?> map) throws Exception {
            ListLDCContainerservicePodResponseBodyPodListVolumes self = new ListLDCContainerservicePodResponseBodyPodListVolumes();
            return TeaModel.build(map, self);
        }

        public ListLDCContainerservicePodResponseBodyPodListVolumes setHostPath(String hostPath) {
            this.hostPath = hostPath;
            return this;
        }
        public String getHostPath() {
            return this.hostPath;
        }

        public ListLDCContainerservicePodResponseBodyPodListVolumes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListLDCContainerservicePodResponseBodyPodListVolumes setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

        public ListLDCContainerservicePodResponseBodyPodListVolumes setRefResourceName(String refResourceName) {
            this.refResourceName = refResourceName;
            return this;
        }
        public String getRefResourceName() {
            return this.refResourceName;
        }

        public ListLDCContainerservicePodResponseBodyPodListVolumes setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListLDCContainerservicePodResponseBodyPodListStatusContainerStatusesStateRunning extends TeaModel {
        @NameInMap("StartedAt")
        public String startedAt;

        public static ListLDCContainerservicePodResponseBodyPodListStatusContainerStatusesStateRunning build(java.util.Map<String, ?> map) throws Exception {
            ListLDCContainerservicePodResponseBodyPodListStatusContainerStatusesStateRunning self = new ListLDCContainerservicePodResponseBodyPodListStatusContainerStatusesStateRunning();
            return TeaModel.build(map, self);
        }

        public ListLDCContainerservicePodResponseBodyPodListStatusContainerStatusesStateRunning setStartedAt(String startedAt) {
            this.startedAt = startedAt;
            return this;
        }
        public String getStartedAt() {
            return this.startedAt;
        }

    }

    public static class ListLDCContainerservicePodResponseBodyPodListStatusContainerStatusesStateTerminated extends TeaModel {
        @NameInMap("ContainerId")
        public String containerId;

        @NameInMap("ExitCode")
        public Long exitCode;

        @NameInMap("FinishedAt")
        public String finishedAt;

        @NameInMap("Message")
        public String message;

        @NameInMap("Reason")
        public String reason;

        @NameInMap("Signal")
        public String signal;

        @NameInMap("StartedAt")
        public String startedAt;

        public static ListLDCContainerservicePodResponseBodyPodListStatusContainerStatusesStateTerminated build(java.util.Map<String, ?> map) throws Exception {
            ListLDCContainerservicePodResponseBodyPodListStatusContainerStatusesStateTerminated self = new ListLDCContainerservicePodResponseBodyPodListStatusContainerStatusesStateTerminated();
            return TeaModel.build(map, self);
        }

        public ListLDCContainerservicePodResponseBodyPodListStatusContainerStatusesStateTerminated setContainerId(String containerId) {
            this.containerId = containerId;
            return this;
        }
        public String getContainerId() {
            return this.containerId;
        }

        public ListLDCContainerservicePodResponseBodyPodListStatusContainerStatusesStateTerminated setExitCode(Long exitCode) {
            this.exitCode = exitCode;
            return this;
        }
        public Long getExitCode() {
            return this.exitCode;
        }

        public ListLDCContainerservicePodResponseBodyPodListStatusContainerStatusesStateTerminated setFinishedAt(String finishedAt) {
            this.finishedAt = finishedAt;
            return this;
        }
        public String getFinishedAt() {
            return this.finishedAt;
        }

        public ListLDCContainerservicePodResponseBodyPodListStatusContainerStatusesStateTerminated setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListLDCContainerservicePodResponseBodyPodListStatusContainerStatusesStateTerminated setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public ListLDCContainerservicePodResponseBodyPodListStatusContainerStatusesStateTerminated setSignal(String signal) {
            this.signal = signal;
            return this;
        }
        public String getSignal() {
            return this.signal;
        }

        public ListLDCContainerservicePodResponseBodyPodListStatusContainerStatusesStateTerminated setStartedAt(String startedAt) {
            this.startedAt = startedAt;
            return this;
        }
        public String getStartedAt() {
            return this.startedAt;
        }

    }

    public static class ListLDCContainerservicePodResponseBodyPodListStatusContainerStatusesStateWaiting extends TeaModel {
        @NameInMap("Message")
        public String message;

        @NameInMap("Reason")
        public String reason;

        public static ListLDCContainerservicePodResponseBodyPodListStatusContainerStatusesStateWaiting build(java.util.Map<String, ?> map) throws Exception {
            ListLDCContainerservicePodResponseBodyPodListStatusContainerStatusesStateWaiting self = new ListLDCContainerservicePodResponseBodyPodListStatusContainerStatusesStateWaiting();
            return TeaModel.build(map, self);
        }

        public ListLDCContainerservicePodResponseBodyPodListStatusContainerStatusesStateWaiting setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListLDCContainerservicePodResponseBodyPodListStatusContainerStatusesStateWaiting setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

    }

    public static class ListLDCContainerservicePodResponseBodyPodListStatusContainerStatusesState extends TeaModel {
        @NameInMap("Running")
        public ListLDCContainerservicePodResponseBodyPodListStatusContainerStatusesStateRunning running;

        @NameInMap("Terminated")
        public ListLDCContainerservicePodResponseBodyPodListStatusContainerStatusesStateTerminated terminated;

        @NameInMap("Waiting")
        public ListLDCContainerservicePodResponseBodyPodListStatusContainerStatusesStateWaiting waiting;

        public static ListLDCContainerservicePodResponseBodyPodListStatusContainerStatusesState build(java.util.Map<String, ?> map) throws Exception {
            ListLDCContainerservicePodResponseBodyPodListStatusContainerStatusesState self = new ListLDCContainerservicePodResponseBodyPodListStatusContainerStatusesState();
            return TeaModel.build(map, self);
        }

        public ListLDCContainerservicePodResponseBodyPodListStatusContainerStatusesState setRunning(ListLDCContainerservicePodResponseBodyPodListStatusContainerStatusesStateRunning running) {
            this.running = running;
            return this;
        }
        public ListLDCContainerservicePodResponseBodyPodListStatusContainerStatusesStateRunning getRunning() {
            return this.running;
        }

        public ListLDCContainerservicePodResponseBodyPodListStatusContainerStatusesState setTerminated(ListLDCContainerservicePodResponseBodyPodListStatusContainerStatusesStateTerminated terminated) {
            this.terminated = terminated;
            return this;
        }
        public ListLDCContainerservicePodResponseBodyPodListStatusContainerStatusesStateTerminated getTerminated() {
            return this.terminated;
        }

        public ListLDCContainerservicePodResponseBodyPodListStatusContainerStatusesState setWaiting(ListLDCContainerservicePodResponseBodyPodListStatusContainerStatusesStateWaiting waiting) {
            this.waiting = waiting;
            return this;
        }
        public ListLDCContainerservicePodResponseBodyPodListStatusContainerStatusesStateWaiting getWaiting() {
            return this.waiting;
        }

    }

    public static class ListLDCContainerservicePodResponseBodyPodListStatusContainerStatuses extends TeaModel {
        @NameInMap("ContainerId")
        public String containerId;

        @NameInMap("Image")
        public String image;

        @NameInMap("LastStartTime")
        public String lastStartTime;

        @NameInMap("Name")
        public String name;

        @NameInMap("Ready")
        public Boolean ready;

        @NameInMap("RestartCount")
        public Long restartCount;

        @NameInMap("State")
        public ListLDCContainerservicePodResponseBodyPodListStatusContainerStatusesState state;

        public static ListLDCContainerservicePodResponseBodyPodListStatusContainerStatuses build(java.util.Map<String, ?> map) throws Exception {
            ListLDCContainerservicePodResponseBodyPodListStatusContainerStatuses self = new ListLDCContainerservicePodResponseBodyPodListStatusContainerStatuses();
            return TeaModel.build(map, self);
        }

        public ListLDCContainerservicePodResponseBodyPodListStatusContainerStatuses setContainerId(String containerId) {
            this.containerId = containerId;
            return this;
        }
        public String getContainerId() {
            return this.containerId;
        }

        public ListLDCContainerservicePodResponseBodyPodListStatusContainerStatuses setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public ListLDCContainerservicePodResponseBodyPodListStatusContainerStatuses setLastStartTime(String lastStartTime) {
            this.lastStartTime = lastStartTime;
            return this;
        }
        public String getLastStartTime() {
            return this.lastStartTime;
        }

        public ListLDCContainerservicePodResponseBodyPodListStatusContainerStatuses setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListLDCContainerservicePodResponseBodyPodListStatusContainerStatuses setReady(Boolean ready) {
            this.ready = ready;
            return this;
        }
        public Boolean getReady() {
            return this.ready;
        }

        public ListLDCContainerservicePodResponseBodyPodListStatusContainerStatuses setRestartCount(Long restartCount) {
            this.restartCount = restartCount;
            return this;
        }
        public Long getRestartCount() {
            return this.restartCount;
        }

        public ListLDCContainerservicePodResponseBodyPodListStatusContainerStatuses setState(ListLDCContainerservicePodResponseBodyPodListStatusContainerStatusesState state) {
            this.state = state;
            return this;
        }
        public ListLDCContainerservicePodResponseBodyPodListStatusContainerStatusesState getState() {
            return this.state;
        }

    }

    public static class ListLDCContainerservicePodResponseBodyPodListStatus extends TeaModel {
        @NameInMap("HostIp")
        public String hostIp;

        @NameInMap("Phase")
        public String phase;

        @NameInMap("PodIp")
        public String podIp;

        @NameInMap("ContainerStatuses")
        public java.util.List<ListLDCContainerservicePodResponseBodyPodListStatusContainerStatuses> containerStatuses;

        public static ListLDCContainerservicePodResponseBodyPodListStatus build(java.util.Map<String, ?> map) throws Exception {
            ListLDCContainerservicePodResponseBodyPodListStatus self = new ListLDCContainerservicePodResponseBodyPodListStatus();
            return TeaModel.build(map, self);
        }

        public ListLDCContainerservicePodResponseBodyPodListStatus setHostIp(String hostIp) {
            this.hostIp = hostIp;
            return this;
        }
        public String getHostIp() {
            return this.hostIp;
        }

        public ListLDCContainerservicePodResponseBodyPodListStatus setPhase(String phase) {
            this.phase = phase;
            return this;
        }
        public String getPhase() {
            return this.phase;
        }

        public ListLDCContainerservicePodResponseBodyPodListStatus setPodIp(String podIp) {
            this.podIp = podIp;
            return this;
        }
        public String getPodIp() {
            return this.podIp;
        }

        public ListLDCContainerservicePodResponseBodyPodListStatus setContainerStatuses(java.util.List<ListLDCContainerservicePodResponseBodyPodListStatusContainerStatuses> containerStatuses) {
            this.containerStatuses = containerStatuses;
            return this;
        }
        public java.util.List<ListLDCContainerservicePodResponseBodyPodListStatusContainerStatuses> getContainerStatuses() {
            return this.containerStatuses;
        }

    }

    public static class ListLDCContainerservicePodResponseBodyPodList extends TeaModel {
        @NameInMap("CellDisplayName")
        public String cellDisplayName;

        @NameInMap("Cluster")
        public String cluster;

        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("Name")
        public String name;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("Uid")
        public String uid;

        @NameInMap("Containers")
        public java.util.List<ListLDCContainerservicePodResponseBodyPodListContainers> containers;

        @NameInMap("Volumes")
        public java.util.List<ListLDCContainerservicePodResponseBodyPodListVolumes> volumes;

        @NameInMap("Status")
        public ListLDCContainerservicePodResponseBodyPodListStatus status;

        public static ListLDCContainerservicePodResponseBodyPodList build(java.util.Map<String, ?> map) throws Exception {
            ListLDCContainerservicePodResponseBodyPodList self = new ListLDCContainerservicePodResponseBodyPodList();
            return TeaModel.build(map, self);
        }

        public ListLDCContainerservicePodResponseBodyPodList setCellDisplayName(String cellDisplayName) {
            this.cellDisplayName = cellDisplayName;
            return this;
        }
        public String getCellDisplayName() {
            return this.cellDisplayName;
        }

        public ListLDCContainerservicePodResponseBodyPodList setCluster(String cluster) {
            this.cluster = cluster;
            return this;
        }
        public String getCluster() {
            return this.cluster;
        }

        public ListLDCContainerservicePodResponseBodyPodList setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public ListLDCContainerservicePodResponseBodyPodList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListLDCContainerservicePodResponseBodyPodList setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ListLDCContainerservicePodResponseBodyPodList setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public ListLDCContainerservicePodResponseBodyPodList setContainers(java.util.List<ListLDCContainerservicePodResponseBodyPodListContainers> containers) {
            this.containers = containers;
            return this;
        }
        public java.util.List<ListLDCContainerservicePodResponseBodyPodListContainers> getContainers() {
            return this.containers;
        }

        public ListLDCContainerservicePodResponseBodyPodList setVolumes(java.util.List<ListLDCContainerservicePodResponseBodyPodListVolumes> volumes) {
            this.volumes = volumes;
            return this;
        }
        public java.util.List<ListLDCContainerservicePodResponseBodyPodListVolumes> getVolumes() {
            return this.volumes;
        }

        public ListLDCContainerservicePodResponseBodyPodList setStatus(ListLDCContainerservicePodResponseBodyPodListStatus status) {
            this.status = status;
            return this;
        }
        public ListLDCContainerservicePodResponseBodyPodListStatus getStatus() {
            return this.status;
        }

    }

}
