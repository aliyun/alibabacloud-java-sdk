// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLDCContainerServiceResponseBody extends TeaModel {
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

    @NameInMap("ContainerServiceList")
    public java.util.List<QueryLDCContainerServiceResponseBodyContainerServiceList> containerServiceList;

    public static QueryLDCContainerServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLDCContainerServiceResponseBody self = new QueryLDCContainerServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLDCContainerServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLDCContainerServiceResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLDCContainerServiceResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLDCContainerServiceResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public QueryLDCContainerServiceResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryLDCContainerServiceResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public QueryLDCContainerServiceResponseBody setContainerServiceList(java.util.List<QueryLDCContainerServiceResponseBodyContainerServiceList> containerServiceList) {
        this.containerServiceList = containerServiceList;
        return this;
    }
    public java.util.List<QueryLDCContainerServiceResponseBodyContainerServiceList> getContainerServiceList() {
        return this.containerServiceList;
    }

    public static class QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecEnvsValueFrom extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("ObjectName")
        public String objectName;

        @NameInMap("ObjectType")
        public String objectType;

        public static QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecEnvsValueFrom build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecEnvsValueFrom self = new QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecEnvsValueFrom();
            return TeaModel.build(map, self);
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecEnvsValueFrom setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecEnvsValueFrom setObjectName(String objectName) {
            this.objectName = objectName;
            return this;
        }
        public String getObjectName() {
            return this.objectName;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecEnvsValueFrom setObjectType(String objectType) {
            this.objectType = objectType;
            return this;
        }
        public String getObjectType() {
            return this.objectType;
        }

    }

    public static class QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecEnvs extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public String value;

        @NameInMap("ValueFrom")
        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecEnvsValueFrom valueFrom;

        public static QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecEnvs build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecEnvs self = new QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecEnvs();
            return TeaModel.build(map, self);
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecEnvs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecEnvs setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecEnvs setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecEnvs setValueFrom(QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecEnvsValueFrom valueFrom) {
            this.valueFrom = valueFrom;
            return this;
        }
        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecEnvsValueFrom getValueFrom() {
            return this.valueFrom;
        }

    }

    public static class QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecEnvOverrides extends TeaModel {
        @NameInMap("Cell")
        public String cell;

        @NameInMap("Name")
        public String name;

        @NameInMap("Value")
        public String value;

        public static QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecEnvOverrides build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecEnvOverrides self = new QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecEnvOverrides();
            return TeaModel.build(map, self);
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecEnvOverrides setCell(String cell) {
            this.cell = cell;
            return this;
        }
        public String getCell() {
            return this.cell;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecEnvOverrides setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecEnvOverrides setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecLogConfigs extends TeaModel {
        @NameInMap("ConfigName")
        public String configName;

        @NameInMap("InputType")
        public String inputType;

        @NameInMap("LogstoreName")
        public String logstoreName;

        @NameInMap("LogPath")
        public String logPath;

        public static QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecLogConfigs build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecLogConfigs self = new QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecLogConfigs();
            return TeaModel.build(map, self);
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecLogConfigs setConfigName(String configName) {
            this.configName = configName;
            return this;
        }
        public String getConfigName() {
            return this.configName;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecLogConfigs setInputType(String inputType) {
            this.inputType = inputType;
            return this;
        }
        public String getInputType() {
            return this.inputType;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecLogConfigs setLogstoreName(String logstoreName) {
            this.logstoreName = logstoreName;
            return this;
        }
        public String getLogstoreName() {
            return this.logstoreName;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecLogConfigs setLogPath(String logPath) {
            this.logPath = logPath;
            return this;
        }
        public String getLogPath() {
            return this.logPath;
        }

    }

    public static class QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecVolumeMountsConfigmapSecretVolumeSource extends TeaModel {
        @NameInMap("VolumeRefName")
        public String volumeRefName;

        public static QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecVolumeMountsConfigmapSecretVolumeSource build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecVolumeMountsConfigmapSecretVolumeSource self = new QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecVolumeMountsConfigmapSecretVolumeSource();
            return TeaModel.build(map, self);
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecVolumeMountsConfigmapSecretVolumeSource setVolumeRefName(String volumeRefName) {
            this.volumeRefName = volumeRefName;
            return this;
        }
        public String getVolumeRefName() {
            return this.volumeRefName;
        }

    }

    public static class QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecVolumeMountsEmptyDirVolumeSource extends TeaModel {
        @NameInMap("Medium")
        public String medium;

        @NameInMap("Name")
        public String name;

        @NameInMap("SizeLimit")
        public String sizeLimit;

        public static QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecVolumeMountsEmptyDirVolumeSource build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecVolumeMountsEmptyDirVolumeSource self = new QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecVolumeMountsEmptyDirVolumeSource();
            return TeaModel.build(map, self);
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecVolumeMountsEmptyDirVolumeSource setMedium(String medium) {
            this.medium = medium;
            return this;
        }
        public String getMedium() {
            return this.medium;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecVolumeMountsEmptyDirVolumeSource setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecVolumeMountsEmptyDirVolumeSource setSizeLimit(String sizeLimit) {
            this.sizeLimit = sizeLimit;
            return this;
        }
        public String getSizeLimit() {
            return this.sizeLimit;
        }

    }

    public static class QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecVolumeMountsLocalDiskVolumeSource extends TeaModel {
        @NameInMap("CreateIfNotPresent")
        public Boolean createIfNotPresent;

        @NameInMap("HostDirectoryPath")
        public String hostDirectoryPath;

        public static QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecVolumeMountsLocalDiskVolumeSource build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecVolumeMountsLocalDiskVolumeSource self = new QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecVolumeMountsLocalDiskVolumeSource();
            return TeaModel.build(map, self);
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecVolumeMountsLocalDiskVolumeSource setCreateIfNotPresent(Boolean createIfNotPresent) {
            this.createIfNotPresent = createIfNotPresent;
            return this;
        }
        public Boolean getCreateIfNotPresent() {
            return this.createIfNotPresent;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecVolumeMountsLocalDiskVolumeSource setHostDirectoryPath(String hostDirectoryPath) {
            this.hostDirectoryPath = hostDirectoryPath;
            return this;
        }
        public String getHostDirectoryPath() {
            return this.hostDirectoryPath;
        }

    }

    public static class QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecVolumeMountsPvcSource extends TeaModel {
        @NameInMap("PvcName")
        public String pvcName;

        public static QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecVolumeMountsPvcSource build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecVolumeMountsPvcSource self = new QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecVolumeMountsPvcSource();
            return TeaModel.build(map, self);
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecVolumeMountsPvcSource setPvcName(String pvcName) {
            this.pvcName = pvcName;
            return this;
        }
        public String getPvcName() {
            return this.pvcName;
        }

    }

    public static class QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecVolumeMounts extends TeaModel {
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
        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecVolumeMountsConfigmapSecretVolumeSource configmapSecretVolumeSource;

        @NameInMap("EmptyDirVolumeSource")
        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecVolumeMountsEmptyDirVolumeSource emptyDirVolumeSource;

        @NameInMap("LocalDiskVolumeSource")
        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecVolumeMountsLocalDiskVolumeSource localDiskVolumeSource;

        @NameInMap("PvcSource")
        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecVolumeMountsPvcSource pvcSource;

        public static QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecVolumeMounts build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecVolumeMounts self = new QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecVolumeMounts();
            return TeaModel.build(map, self);
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecVolumeMounts setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecVolumeMounts setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecVolumeMounts setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecVolumeMounts setSubPath(String subPath) {
            this.subPath = subPath;
            return this;
        }
        public String getSubPath() {
            return this.subPath;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecVolumeMounts setVolumeSourceCategoryType(String volumeSourceCategoryType) {
            this.volumeSourceCategoryType = volumeSourceCategoryType;
            return this;
        }
        public String getVolumeSourceCategoryType() {
            return this.volumeSourceCategoryType;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecVolumeMounts setConfigmapSecretVolumeSource(QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecVolumeMountsConfigmapSecretVolumeSource configmapSecretVolumeSource) {
            this.configmapSecretVolumeSource = configmapSecretVolumeSource;
            return this;
        }
        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecVolumeMountsConfigmapSecretVolumeSource getConfigmapSecretVolumeSource() {
            return this.configmapSecretVolumeSource;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecVolumeMounts setEmptyDirVolumeSource(QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecVolumeMountsEmptyDirVolumeSource emptyDirVolumeSource) {
            this.emptyDirVolumeSource = emptyDirVolumeSource;
            return this;
        }
        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecVolumeMountsEmptyDirVolumeSource getEmptyDirVolumeSource() {
            return this.emptyDirVolumeSource;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecVolumeMounts setLocalDiskVolumeSource(QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecVolumeMountsLocalDiskVolumeSource localDiskVolumeSource) {
            this.localDiskVolumeSource = localDiskVolumeSource;
            return this;
        }
        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecVolumeMountsLocalDiskVolumeSource getLocalDiskVolumeSource() {
            return this.localDiskVolumeSource;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecVolumeMounts setPvcSource(QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecVolumeMountsPvcSource pvcSource) {
            this.pvcSource = pvcSource;
            return this;
        }
        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecVolumeMountsPvcSource getPvcSource() {
            return this.pvcSource;
        }

    }

    public static class QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecHealthCheckConfigLivenessProbeExecAction extends TeaModel {
        @NameInMap("Command")
        public String command;

        public static QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecHealthCheckConfigLivenessProbeExecAction build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecHealthCheckConfigLivenessProbeExecAction self = new QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecHealthCheckConfigLivenessProbeExecAction();
            return TeaModel.build(map, self);
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecHealthCheckConfigLivenessProbeExecAction setCommand(String command) {
            this.command = command;
            return this;
        }
        public String getCommand() {
            return this.command;
        }

    }

    public static class QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecHealthCheckConfigLivenessProbeHttpGetAction extends TeaModel {
        @NameInMap("Path")
        public String path;

        @NameInMap("Port")
        public String port;

        @NameInMap("Scheme")
        public String scheme;

        public static QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecHealthCheckConfigLivenessProbeHttpGetAction build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecHealthCheckConfigLivenessProbeHttpGetAction self = new QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecHealthCheckConfigLivenessProbeHttpGetAction();
            return TeaModel.build(map, self);
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecHealthCheckConfigLivenessProbeHttpGetAction setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecHealthCheckConfigLivenessProbeHttpGetAction setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecHealthCheckConfigLivenessProbeHttpGetAction setScheme(String scheme) {
            this.scheme = scheme;
            return this;
        }
        public String getScheme() {
            return this.scheme;
        }

    }

    public static class QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecHealthCheckConfigLivenessProbeTcpSocketAction extends TeaModel {
        @NameInMap("Port")
        public String port;

        public static QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecHealthCheckConfigLivenessProbeTcpSocketAction build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecHealthCheckConfigLivenessProbeTcpSocketAction self = new QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecHealthCheckConfigLivenessProbeTcpSocketAction();
            return TeaModel.build(map, self);
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecHealthCheckConfigLivenessProbeTcpSocketAction setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

    }

    public static class QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecHealthCheckConfigLivenessProbe extends TeaModel {
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
        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecHealthCheckConfigLivenessProbeExecAction execAction;

        @NameInMap("HttpGetAction")
        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecHealthCheckConfigLivenessProbeHttpGetAction httpGetAction;

        @NameInMap("TcpSocketAction")
        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecHealthCheckConfigLivenessProbeTcpSocketAction tcpSocketAction;

        public static QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecHealthCheckConfigLivenessProbe build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecHealthCheckConfigLivenessProbe self = new QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecHealthCheckConfigLivenessProbe();
            return TeaModel.build(map, self);
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecHealthCheckConfigLivenessProbe setFailureThreshold(Long failureThreshold) {
            this.failureThreshold = failureThreshold;
            return this;
        }
        public Long getFailureThreshold() {
            return this.failureThreshold;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecHealthCheckConfigLivenessProbe setInitialDelaySeconds(Long initialDelaySeconds) {
            this.initialDelaySeconds = initialDelaySeconds;
            return this;
        }
        public Long getInitialDelaySeconds() {
            return this.initialDelaySeconds;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecHealthCheckConfigLivenessProbe setPeriodSeconds(Long periodSeconds) {
            this.periodSeconds = periodSeconds;
            return this;
        }
        public Long getPeriodSeconds() {
            return this.periodSeconds;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecHealthCheckConfigLivenessProbe setSuccessThreshold(Long successThreshold) {
            this.successThreshold = successThreshold;
            return this;
        }
        public Long getSuccessThreshold() {
            return this.successThreshold;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecHealthCheckConfigLivenessProbe setTimeOutSeconds(Long timeOutSeconds) {
            this.timeOutSeconds = timeOutSeconds;
            return this;
        }
        public Long getTimeOutSeconds() {
            return this.timeOutSeconds;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecHealthCheckConfigLivenessProbe setExecAction(QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecHealthCheckConfigLivenessProbeExecAction execAction) {
            this.execAction = execAction;
            return this;
        }
        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecHealthCheckConfigLivenessProbeExecAction getExecAction() {
            return this.execAction;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecHealthCheckConfigLivenessProbe setHttpGetAction(QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecHealthCheckConfigLivenessProbeHttpGetAction httpGetAction) {
            this.httpGetAction = httpGetAction;
            return this;
        }
        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecHealthCheckConfigLivenessProbeHttpGetAction getHttpGetAction() {
            return this.httpGetAction;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecHealthCheckConfigLivenessProbe setTcpSocketAction(QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecHealthCheckConfigLivenessProbeTcpSocketAction tcpSocketAction) {
            this.tcpSocketAction = tcpSocketAction;
            return this;
        }
        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecHealthCheckConfigLivenessProbeTcpSocketAction getTcpSocketAction() {
            return this.tcpSocketAction;
        }

    }

    public static class QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecHealthCheckConfigReadinessProbeExecAction extends TeaModel {
        @NameInMap("Command")
        public String command;

        public static QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecHealthCheckConfigReadinessProbeExecAction build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecHealthCheckConfigReadinessProbeExecAction self = new QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecHealthCheckConfigReadinessProbeExecAction();
            return TeaModel.build(map, self);
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecHealthCheckConfigReadinessProbeExecAction setCommand(String command) {
            this.command = command;
            return this;
        }
        public String getCommand() {
            return this.command;
        }

    }

    public static class QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecHealthCheckConfigReadinessProbeHttpGetAction extends TeaModel {
        @NameInMap("Path")
        public String path;

        @NameInMap("Port")
        public String port;

        @NameInMap("Scheme")
        public String scheme;

        public static QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecHealthCheckConfigReadinessProbeHttpGetAction build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecHealthCheckConfigReadinessProbeHttpGetAction self = new QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecHealthCheckConfigReadinessProbeHttpGetAction();
            return TeaModel.build(map, self);
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecHealthCheckConfigReadinessProbeHttpGetAction setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecHealthCheckConfigReadinessProbeHttpGetAction setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecHealthCheckConfigReadinessProbeHttpGetAction setScheme(String scheme) {
            this.scheme = scheme;
            return this;
        }
        public String getScheme() {
            return this.scheme;
        }

    }

    public static class QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecHealthCheckConfigReadinessProbeTcpSocketAction extends TeaModel {
        @NameInMap("Port")
        public String port;

        public static QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecHealthCheckConfigReadinessProbeTcpSocketAction build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecHealthCheckConfigReadinessProbeTcpSocketAction self = new QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecHealthCheckConfigReadinessProbeTcpSocketAction();
            return TeaModel.build(map, self);
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecHealthCheckConfigReadinessProbeTcpSocketAction setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

    }

    public static class QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecHealthCheckConfigReadinessProbe extends TeaModel {
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
        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecHealthCheckConfigReadinessProbeExecAction execAction;

        @NameInMap("HttpGetAction")
        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecHealthCheckConfigReadinessProbeHttpGetAction httpGetAction;

        @NameInMap("TcpSocketAction")
        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecHealthCheckConfigReadinessProbeTcpSocketAction tcpSocketAction;

        public static QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecHealthCheckConfigReadinessProbe build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecHealthCheckConfigReadinessProbe self = new QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecHealthCheckConfigReadinessProbe();
            return TeaModel.build(map, self);
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecHealthCheckConfigReadinessProbe setFailureThreshold(Long failureThreshold) {
            this.failureThreshold = failureThreshold;
            return this;
        }
        public Long getFailureThreshold() {
            return this.failureThreshold;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecHealthCheckConfigReadinessProbe setInitialDelaySeconds(Long initialDelaySeconds) {
            this.initialDelaySeconds = initialDelaySeconds;
            return this;
        }
        public Long getInitialDelaySeconds() {
            return this.initialDelaySeconds;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecHealthCheckConfigReadinessProbe setPeriodSeconds(Long periodSeconds) {
            this.periodSeconds = periodSeconds;
            return this;
        }
        public Long getPeriodSeconds() {
            return this.periodSeconds;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecHealthCheckConfigReadinessProbe setSuccessThreshold(Long successThreshold) {
            this.successThreshold = successThreshold;
            return this;
        }
        public Long getSuccessThreshold() {
            return this.successThreshold;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecHealthCheckConfigReadinessProbe setTimeOutSeconds(Long timeOutSeconds) {
            this.timeOutSeconds = timeOutSeconds;
            return this;
        }
        public Long getTimeOutSeconds() {
            return this.timeOutSeconds;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecHealthCheckConfigReadinessProbe setExecAction(QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecHealthCheckConfigReadinessProbeExecAction execAction) {
            this.execAction = execAction;
            return this;
        }
        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecHealthCheckConfigReadinessProbeExecAction getExecAction() {
            return this.execAction;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecHealthCheckConfigReadinessProbe setHttpGetAction(QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecHealthCheckConfigReadinessProbeHttpGetAction httpGetAction) {
            this.httpGetAction = httpGetAction;
            return this;
        }
        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecHealthCheckConfigReadinessProbeHttpGetAction getHttpGetAction() {
            return this.httpGetAction;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecHealthCheckConfigReadinessProbe setTcpSocketAction(QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecHealthCheckConfigReadinessProbeTcpSocketAction tcpSocketAction) {
            this.tcpSocketAction = tcpSocketAction;
            return this;
        }
        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecHealthCheckConfigReadinessProbeTcpSocketAction getTcpSocketAction() {
            return this.tcpSocketAction;
        }

    }

    public static class QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecHealthCheckConfig extends TeaModel {
        @NameInMap("LivenessProbe")
        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecHealthCheckConfigLivenessProbe livenessProbe;

        @NameInMap("ReadinessProbe")
        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecHealthCheckConfigReadinessProbe readinessProbe;

        public static QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecHealthCheckConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecHealthCheckConfig self = new QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecHealthCheckConfig();
            return TeaModel.build(map, self);
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecHealthCheckConfig setLivenessProbe(QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecHealthCheckConfigLivenessProbe livenessProbe) {
            this.livenessProbe = livenessProbe;
            return this;
        }
        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecHealthCheckConfigLivenessProbe getLivenessProbe() {
            return this.livenessProbe;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecHealthCheckConfig setReadinessProbe(QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecHealthCheckConfigReadinessProbe readinessProbe) {
            this.readinessProbe = readinessProbe;
            return this;
        }
        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecHealthCheckConfigReadinessProbe getReadinessProbe() {
            return this.readinessProbe;
        }

    }

    public static class QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecLifecycleHookPostStartExec extends TeaModel {
        @NameInMap("Command")
        public String command;

        public static QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecLifecycleHookPostStartExec build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecLifecycleHookPostStartExec self = new QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecLifecycleHookPostStartExec();
            return TeaModel.build(map, self);
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecLifecycleHookPostStartExec setCommand(String command) {
            this.command = command;
            return this;
        }
        public String getCommand() {
            return this.command;
        }

    }

    public static class QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecLifecycleHookPostStartHttp extends TeaModel {
        @NameInMap("Path")
        public String path;

        @NameInMap("Port")
        public String port;

        @NameInMap("Scheme")
        public String scheme;

        public static QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecLifecycleHookPostStartHttp build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecLifecycleHookPostStartHttp self = new QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecLifecycleHookPostStartHttp();
            return TeaModel.build(map, self);
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecLifecycleHookPostStartHttp setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecLifecycleHookPostStartHttp setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecLifecycleHookPostStartHttp setScheme(String scheme) {
            this.scheme = scheme;
            return this;
        }
        public String getScheme() {
            return this.scheme;
        }

    }

    public static class QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecLifecycleHookPostStartTcp extends TeaModel {
        @NameInMap("Port")
        public String port;

        public static QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecLifecycleHookPostStartTcp build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecLifecycleHookPostStartTcp self = new QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecLifecycleHookPostStartTcp();
            return TeaModel.build(map, self);
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecLifecycleHookPostStartTcp setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

    }

    public static class QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecLifecycleHookPreStopExec extends TeaModel {
        @NameInMap("Command")
        public String command;

        public static QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecLifecycleHookPreStopExec build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecLifecycleHookPreStopExec self = new QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecLifecycleHookPreStopExec();
            return TeaModel.build(map, self);
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecLifecycleHookPreStopExec setCommand(String command) {
            this.command = command;
            return this;
        }
        public String getCommand() {
            return this.command;
        }

    }

    public static class QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecLifecycleHookPreStopHttp extends TeaModel {
        @NameInMap("Path")
        public String path;

        @NameInMap("Port")
        public String port;

        @NameInMap("Scheme")
        public String scheme;

        public static QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecLifecycleHookPreStopHttp build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecLifecycleHookPreStopHttp self = new QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecLifecycleHookPreStopHttp();
            return TeaModel.build(map, self);
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecLifecycleHookPreStopHttp setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecLifecycleHookPreStopHttp setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecLifecycleHookPreStopHttp setScheme(String scheme) {
            this.scheme = scheme;
            return this;
        }
        public String getScheme() {
            return this.scheme;
        }

    }

    public static class QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecLifecycleHookPreStopTcp extends TeaModel {
        @NameInMap("Port")
        public String port;

        public static QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecLifecycleHookPreStopTcp build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecLifecycleHookPreStopTcp self = new QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecLifecycleHookPreStopTcp();
            return TeaModel.build(map, self);
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecLifecycleHookPreStopTcp setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

    }

    public static class QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecLifecycleHook extends TeaModel {
        @NameInMap("PostStartExec")
        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecLifecycleHookPostStartExec postStartExec;

        @NameInMap("PostStartHttp")
        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecLifecycleHookPostStartHttp postStartHttp;

        @NameInMap("PostStartTcp")
        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecLifecycleHookPostStartTcp postStartTcp;

        @NameInMap("PreStopExec")
        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecLifecycleHookPreStopExec preStopExec;

        @NameInMap("PreStopHttp")
        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecLifecycleHookPreStopHttp preStopHttp;

        @NameInMap("PreStopTcp")
        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecLifecycleHookPreStopTcp preStopTcp;

        public static QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecLifecycleHook build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecLifecycleHook self = new QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecLifecycleHook();
            return TeaModel.build(map, self);
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecLifecycleHook setPostStartExec(QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecLifecycleHookPostStartExec postStartExec) {
            this.postStartExec = postStartExec;
            return this;
        }
        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecLifecycleHookPostStartExec getPostStartExec() {
            return this.postStartExec;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecLifecycleHook setPostStartHttp(QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecLifecycleHookPostStartHttp postStartHttp) {
            this.postStartHttp = postStartHttp;
            return this;
        }
        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecLifecycleHookPostStartHttp getPostStartHttp() {
            return this.postStartHttp;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecLifecycleHook setPostStartTcp(QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecLifecycleHookPostStartTcp postStartTcp) {
            this.postStartTcp = postStartTcp;
            return this;
        }
        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecLifecycleHookPostStartTcp getPostStartTcp() {
            return this.postStartTcp;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecLifecycleHook setPreStopExec(QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecLifecycleHookPreStopExec preStopExec) {
            this.preStopExec = preStopExec;
            return this;
        }
        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecLifecycleHookPreStopExec getPreStopExec() {
            return this.preStopExec;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecLifecycleHook setPreStopHttp(QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecLifecycleHookPreStopHttp preStopHttp) {
            this.preStopHttp = preStopHttp;
            return this;
        }
        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecLifecycleHookPreStopHttp getPreStopHttp() {
            return this.preStopHttp;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecLifecycleHook setPreStopTcp(QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecLifecycleHookPreStopTcp preStopTcp) {
            this.preStopTcp = preStopTcp;
            return this;
        }
        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecLifecycleHookPreStopTcp getPreStopTcp() {
            return this.preStopTcp;
        }

    }

    public static class QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpec extends TeaModel {
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
        public java.util.List<QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecEnvs> envs;

        @NameInMap("EnvOverrides")
        public java.util.List<QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecEnvOverrides> envOverrides;

        @NameInMap("LogConfigs")
        public java.util.List<QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecLogConfigs> logConfigs;

        @NameInMap("VolumeMounts")
        public java.util.List<QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecVolumeMounts> volumeMounts;

        @NameInMap("HealthCheckConfig")
        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecHealthCheckConfig healthCheckConfig;

        @NameInMap("LifecycleHook")
        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecLifecycleHook lifecycleHook;

        public static QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpec build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpec self = new QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpec();
            return TeaModel.build(map, self);
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpec setCpuLimit(String cpuLimit) {
            this.cpuLimit = cpuLimit;
            return this;
        }
        public String getCpuLimit() {
            return this.cpuLimit;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpec setCpuRequest(String cpuRequest) {
            this.cpuRequest = cpuRequest;
            return this;
        }
        public String getCpuRequest() {
            return this.cpuRequest;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpec setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpec setImageBuildName(String imageBuildName) {
            this.imageBuildName = imageBuildName;
            return this;
        }
        public String getImageBuildName() {
            return this.imageBuildName;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpec setImagePullSecret(String imagePullSecret) {
            this.imagePullSecret = imagePullSecret;
            return this;
        }
        public String getImagePullSecret() {
            return this.imagePullSecret;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpec setImageSource(String imageSource) {
            this.imageSource = imageSource;
            return this;
        }
        public String getImageSource() {
            return this.imageSource;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpec setMemoryLimit(String memoryLimit) {
            this.memoryLimit = memoryLimit;
            return this;
        }
        public String getMemoryLimit() {
            return this.memoryLimit;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpec setMemoryRequest(String memoryRequest) {
            this.memoryRequest = memoryRequest;
            return this;
        }
        public String getMemoryRequest() {
            return this.memoryRequest;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpec setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpec setRestartPolicy(String restartPolicy) {
            this.restartPolicy = restartPolicy;
            return this;
        }
        public String getRestartPolicy() {
            return this.restartPolicy;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpec setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpec setVolumesStr(String volumesStr) {
            this.volumesStr = volumesStr;
            return this;
        }
        public String getVolumesStr() {
            return this.volumesStr;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpec setVolumeMountsStr(String volumeMountsStr) {
            this.volumeMountsStr = volumeMountsStr;
            return this;
        }
        public String getVolumeMountsStr() {
            return this.volumeMountsStr;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpec setEntryPoints(java.util.List<String> entryPoints) {
            this.entryPoints = entryPoints;
            return this;
        }
        public java.util.List<String> getEntryPoints() {
            return this.entryPoints;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpec setEnvs(java.util.List<QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecEnvs> envs) {
            this.envs = envs;
            return this;
        }
        public java.util.List<QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecEnvs> getEnvs() {
            return this.envs;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpec setEnvOverrides(java.util.List<QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecEnvOverrides> envOverrides) {
            this.envOverrides = envOverrides;
            return this;
        }
        public java.util.List<QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecEnvOverrides> getEnvOverrides() {
            return this.envOverrides;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpec setLogConfigs(java.util.List<QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecLogConfigs> logConfigs) {
            this.logConfigs = logConfigs;
            return this;
        }
        public java.util.List<QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecLogConfigs> getLogConfigs() {
            return this.logConfigs;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpec setVolumeMounts(java.util.List<QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecVolumeMounts> volumeMounts) {
            this.volumeMounts = volumeMounts;
            return this;
        }
        public java.util.List<QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecVolumeMounts> getVolumeMounts() {
            return this.volumeMounts;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpec setHealthCheckConfig(QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecHealthCheckConfig healthCheckConfig) {
            this.healthCheckConfig = healthCheckConfig;
            return this;
        }
        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecHealthCheckConfig getHealthCheckConfig() {
            return this.healthCheckConfig;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpec setLifecycleHook(QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecLifecycleHook lifecycleHook) {
            this.lifecycleHook = lifecycleHook;
            return this;
        }
        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpecLifecycleHook getLifecycleHook() {
            return this.lifecycleHook;
        }

    }

    public static class QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainers extends TeaModel {
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
        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpec spec;

        public static QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainers build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainers self = new QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainers();
            return TeaModel.build(map, self);
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainers setContainerId(String containerId) {
            this.containerId = containerId;
            return this;
        }
        public String getContainerId() {
            return this.containerId;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainers setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainers setLastStartTime(String lastStartTime) {
            this.lastStartTime = lastStartTime;
            return this;
        }
        public String getLastStartTime() {
            return this.lastStartTime;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainers setRestartCount(Long restartCount) {
            this.restartCount = restartCount;
            return this;
        }
        public Long getRestartCount() {
            return this.restartCount;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainers setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainers setSpec(QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpec spec) {
            this.spec = spec;
            return this;
        }
        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainersSpec getSpec() {
            return this.spec;
        }

    }

    public static class QueryLDCContainerServiceResponseBodyContainerServiceListPodListVolumes extends TeaModel {
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

        public static QueryLDCContainerServiceResponseBodyContainerServiceListPodListVolumes build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCContainerServiceResponseBodyContainerServiceListPodListVolumes self = new QueryLDCContainerServiceResponseBodyContainerServiceListPodListVolumes();
            return TeaModel.build(map, self);
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListVolumes setHostPath(String hostPath) {
            this.hostPath = hostPath;
            return this;
        }
        public String getHostPath() {
            return this.hostPath;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListVolumes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListVolumes setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListVolumes setRefResourceName(String refResourceName) {
            this.refResourceName = refResourceName;
            return this;
        }
        public String getRefResourceName() {
            return this.refResourceName;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListVolumes setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class QueryLDCContainerServiceResponseBodyContainerServiceListPodListStatusContainerStatusesStateRunning extends TeaModel {
        @NameInMap("StartedAt")
        public String startedAt;

        public static QueryLDCContainerServiceResponseBodyContainerServiceListPodListStatusContainerStatusesStateRunning build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCContainerServiceResponseBodyContainerServiceListPodListStatusContainerStatusesStateRunning self = new QueryLDCContainerServiceResponseBodyContainerServiceListPodListStatusContainerStatusesStateRunning();
            return TeaModel.build(map, self);
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListStatusContainerStatusesStateRunning setStartedAt(String startedAt) {
            this.startedAt = startedAt;
            return this;
        }
        public String getStartedAt() {
            return this.startedAt;
        }

    }

    public static class QueryLDCContainerServiceResponseBodyContainerServiceListPodListStatusContainerStatusesStateTerminated extends TeaModel {
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

        public static QueryLDCContainerServiceResponseBodyContainerServiceListPodListStatusContainerStatusesStateTerminated build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCContainerServiceResponseBodyContainerServiceListPodListStatusContainerStatusesStateTerminated self = new QueryLDCContainerServiceResponseBodyContainerServiceListPodListStatusContainerStatusesStateTerminated();
            return TeaModel.build(map, self);
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListStatusContainerStatusesStateTerminated setContainerId(String containerId) {
            this.containerId = containerId;
            return this;
        }
        public String getContainerId() {
            return this.containerId;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListStatusContainerStatusesStateTerminated setExitCode(Long exitCode) {
            this.exitCode = exitCode;
            return this;
        }
        public Long getExitCode() {
            return this.exitCode;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListStatusContainerStatusesStateTerminated setFinishedAt(String finishedAt) {
            this.finishedAt = finishedAt;
            return this;
        }
        public String getFinishedAt() {
            return this.finishedAt;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListStatusContainerStatusesStateTerminated setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListStatusContainerStatusesStateTerminated setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListStatusContainerStatusesStateTerminated setSignal(String signal) {
            this.signal = signal;
            return this;
        }
        public String getSignal() {
            return this.signal;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListStatusContainerStatusesStateTerminated setStartedAt(String startedAt) {
            this.startedAt = startedAt;
            return this;
        }
        public String getStartedAt() {
            return this.startedAt;
        }

    }

    public static class QueryLDCContainerServiceResponseBodyContainerServiceListPodListStatusContainerStatusesStateWaiting extends TeaModel {
        @NameInMap("Message")
        public String message;

        @NameInMap("Reason")
        public String reason;

        public static QueryLDCContainerServiceResponseBodyContainerServiceListPodListStatusContainerStatusesStateWaiting build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCContainerServiceResponseBodyContainerServiceListPodListStatusContainerStatusesStateWaiting self = new QueryLDCContainerServiceResponseBodyContainerServiceListPodListStatusContainerStatusesStateWaiting();
            return TeaModel.build(map, self);
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListStatusContainerStatusesStateWaiting setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListStatusContainerStatusesStateWaiting setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

    }

    public static class QueryLDCContainerServiceResponseBodyContainerServiceListPodListStatusContainerStatusesState extends TeaModel {
        @NameInMap("Running")
        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListStatusContainerStatusesStateRunning running;

        @NameInMap("Terminated")
        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListStatusContainerStatusesStateTerminated terminated;

        @NameInMap("Waiting")
        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListStatusContainerStatusesStateWaiting waiting;

        public static QueryLDCContainerServiceResponseBodyContainerServiceListPodListStatusContainerStatusesState build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCContainerServiceResponseBodyContainerServiceListPodListStatusContainerStatusesState self = new QueryLDCContainerServiceResponseBodyContainerServiceListPodListStatusContainerStatusesState();
            return TeaModel.build(map, self);
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListStatusContainerStatusesState setRunning(QueryLDCContainerServiceResponseBodyContainerServiceListPodListStatusContainerStatusesStateRunning running) {
            this.running = running;
            return this;
        }
        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListStatusContainerStatusesStateRunning getRunning() {
            return this.running;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListStatusContainerStatusesState setTerminated(QueryLDCContainerServiceResponseBodyContainerServiceListPodListStatusContainerStatusesStateTerminated terminated) {
            this.terminated = terminated;
            return this;
        }
        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListStatusContainerStatusesStateTerminated getTerminated() {
            return this.terminated;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListStatusContainerStatusesState setWaiting(QueryLDCContainerServiceResponseBodyContainerServiceListPodListStatusContainerStatusesStateWaiting waiting) {
            this.waiting = waiting;
            return this;
        }
        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListStatusContainerStatusesStateWaiting getWaiting() {
            return this.waiting;
        }

    }

    public static class QueryLDCContainerServiceResponseBodyContainerServiceListPodListStatusContainerStatuses extends TeaModel {
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
        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListStatusContainerStatusesState state;

        public static QueryLDCContainerServiceResponseBodyContainerServiceListPodListStatusContainerStatuses build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCContainerServiceResponseBodyContainerServiceListPodListStatusContainerStatuses self = new QueryLDCContainerServiceResponseBodyContainerServiceListPodListStatusContainerStatuses();
            return TeaModel.build(map, self);
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListStatusContainerStatuses setContainerId(String containerId) {
            this.containerId = containerId;
            return this;
        }
        public String getContainerId() {
            return this.containerId;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListStatusContainerStatuses setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListStatusContainerStatuses setLastStartTime(String lastStartTime) {
            this.lastStartTime = lastStartTime;
            return this;
        }
        public String getLastStartTime() {
            return this.lastStartTime;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListStatusContainerStatuses setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListStatusContainerStatuses setReady(Boolean ready) {
            this.ready = ready;
            return this;
        }
        public Boolean getReady() {
            return this.ready;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListStatusContainerStatuses setRestartCount(Long restartCount) {
            this.restartCount = restartCount;
            return this;
        }
        public Long getRestartCount() {
            return this.restartCount;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListStatusContainerStatuses setState(QueryLDCContainerServiceResponseBodyContainerServiceListPodListStatusContainerStatusesState state) {
            this.state = state;
            return this;
        }
        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListStatusContainerStatusesState getState() {
            return this.state;
        }

    }

    public static class QueryLDCContainerServiceResponseBodyContainerServiceListPodListStatus extends TeaModel {
        @NameInMap("HostIp")
        public String hostIp;

        @NameInMap("Phase")
        public String phase;

        @NameInMap("PodIp")
        public String podIp;

        @NameInMap("ContainerStatuses")
        public java.util.List<QueryLDCContainerServiceResponseBodyContainerServiceListPodListStatusContainerStatuses> containerStatuses;

        public static QueryLDCContainerServiceResponseBodyContainerServiceListPodListStatus build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCContainerServiceResponseBodyContainerServiceListPodListStatus self = new QueryLDCContainerServiceResponseBodyContainerServiceListPodListStatus();
            return TeaModel.build(map, self);
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListStatus setHostIp(String hostIp) {
            this.hostIp = hostIp;
            return this;
        }
        public String getHostIp() {
            return this.hostIp;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListStatus setPhase(String phase) {
            this.phase = phase;
            return this;
        }
        public String getPhase() {
            return this.phase;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListStatus setPodIp(String podIp) {
            this.podIp = podIp;
            return this;
        }
        public String getPodIp() {
            return this.podIp;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListStatus setContainerStatuses(java.util.List<QueryLDCContainerServiceResponseBodyContainerServiceListPodListStatusContainerStatuses> containerStatuses) {
            this.containerStatuses = containerStatuses;
            return this;
        }
        public java.util.List<QueryLDCContainerServiceResponseBodyContainerServiceListPodListStatusContainerStatuses> getContainerStatuses() {
            return this.containerStatuses;
        }

    }

    public static class QueryLDCContainerServiceResponseBodyContainerServiceListPodList extends TeaModel {
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
        public java.util.List<QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainers> containers;

        @NameInMap("Volumes")
        public java.util.List<QueryLDCContainerServiceResponseBodyContainerServiceListPodListVolumes> volumes;

        @NameInMap("Status")
        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListStatus status;

        public static QueryLDCContainerServiceResponseBodyContainerServiceListPodList build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCContainerServiceResponseBodyContainerServiceListPodList self = new QueryLDCContainerServiceResponseBodyContainerServiceListPodList();
            return TeaModel.build(map, self);
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodList setCellDisplayName(String cellDisplayName) {
            this.cellDisplayName = cellDisplayName;
            return this;
        }
        public String getCellDisplayName() {
            return this.cellDisplayName;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodList setCluster(String cluster) {
            this.cluster = cluster;
            return this;
        }
        public String getCluster() {
            return this.cluster;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodList setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodList setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodList setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodList setContainers(java.util.List<QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainers> containers) {
            this.containers = containers;
            return this;
        }
        public java.util.List<QueryLDCContainerServiceResponseBodyContainerServiceListPodListContainers> getContainers() {
            return this.containers;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodList setVolumes(java.util.List<QueryLDCContainerServiceResponseBodyContainerServiceListPodListVolumes> volumes) {
            this.volumes = volumes;
            return this;
        }
        public java.util.List<QueryLDCContainerServiceResponseBodyContainerServiceListPodListVolumes> getVolumes() {
            return this.volumes;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListPodList setStatus(QueryLDCContainerServiceResponseBodyContainerServiceListPodListStatus status) {
            this.status = status;
            return this;
        }
        public QueryLDCContainerServiceResponseBodyContainerServiceListPodListStatus getStatus() {
            return this.status;
        }

    }

    public static class QueryLDCContainerServiceResponseBodyContainerServiceListServiceListCellSlbIaasIdMap extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static QueryLDCContainerServiceResponseBodyContainerServiceListServiceListCellSlbIaasIdMap build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCContainerServiceResponseBodyContainerServiceListServiceListCellSlbIaasIdMap self = new QueryLDCContainerServiceResponseBodyContainerServiceListServiceListCellSlbIaasIdMap();
            return TeaModel.build(map, self);
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListServiceListCellSlbIaasIdMap setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListServiceListCellSlbIaasIdMap setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryLDCContainerServiceResponseBodyContainerServiceListServiceListListeners extends TeaModel {
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

        public static QueryLDCContainerServiceResponseBodyContainerServiceListServiceListListeners build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCContainerServiceResponseBodyContainerServiceListServiceListListeners self = new QueryLDCContainerServiceResponseBodyContainerServiceListServiceListListeners();
            return TeaModel.build(map, self);
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListServiceListListeners setBackendServerPort(Long backendServerPort) {
            this.backendServerPort = backendServerPort;
            return this;
        }
        public Long getBackendServerPort() {
            return this.backendServerPort;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListServiceListListeners setBandWidth(Long bandWidth) {
            this.bandWidth = bandWidth;
            return this;
        }
        public Long getBandWidth() {
            return this.bandWidth;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListServiceListListeners setCaCertificateId(String caCertificateId) {
            this.caCertificateId = caCertificateId;
            return this;
        }
        public String getCaCertificateId() {
            return this.caCertificateId;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListServiceListListeners setCookie(String cookie) {
            this.cookie = cookie;
            return this;
        }
        public String getCookie() {
            return this.cookie;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListServiceListListeners setCookieTimeout(Long cookieTimeout) {
            this.cookieTimeout = cookieTimeout;
            return this;
        }
        public Long getCookieTimeout() {
            return this.cookieTimeout;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListServiceListListeners setEstablishedTimeout(Long establishedTimeout) {
            this.establishedTimeout = establishedTimeout;
            return this;
        }
        public Long getEstablishedTimeout() {
            return this.establishedTimeout;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListServiceListListeners setHealthyThreshold(Long healthyThreshold) {
            this.healthyThreshold = healthyThreshold;
            return this;
        }
        public Long getHealthyThreshold() {
            return this.healthyThreshold;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListServiceListListeners setHealthCheck(String healthCheck) {
            this.healthCheck = healthCheck;
            return this;
        }
        public String getHealthCheck() {
            return this.healthCheck;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListServiceListListeners setHealthCheckConnectPort(Long healthCheckConnectPort) {
            this.healthCheckConnectPort = healthCheckConnectPort;
            return this;
        }
        public Long getHealthCheckConnectPort() {
            return this.healthCheckConnectPort;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListServiceListListeners setHealthCheckConnectTimeout(Long healthCheckConnectTimeout) {
            this.healthCheckConnectTimeout = healthCheckConnectTimeout;
            return this;
        }
        public Long getHealthCheckConnectTimeout() {
            return this.healthCheckConnectTimeout;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListServiceListListeners setHealthCheckDomain(String healthCheckDomain) {
            this.healthCheckDomain = healthCheckDomain;
            return this;
        }
        public String getHealthCheckDomain() {
            return this.healthCheckDomain;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListServiceListListeners setHealthCheckHttpCode(String healthCheckHttpCode) {
            this.healthCheckHttpCode = healthCheckHttpCode;
            return this;
        }
        public String getHealthCheckHttpCode() {
            return this.healthCheckHttpCode;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListServiceListListeners setHealthCheckInterval(Long healthCheckInterval) {
            this.healthCheckInterval = healthCheckInterval;
            return this;
        }
        public Long getHealthCheckInterval() {
            return this.healthCheckInterval;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListServiceListListeners setHealthCheckThreshold(Long healthCheckThreshold) {
            this.healthCheckThreshold = healthCheckThreshold;
            return this;
        }
        public Long getHealthCheckThreshold() {
            return this.healthCheckThreshold;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListServiceListListeners setHealthCheckTimeout(Long healthCheckTimeout) {
            this.healthCheckTimeout = healthCheckTimeout;
            return this;
        }
        public Long getHealthCheckTimeout() {
            return this.healthCheckTimeout;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListServiceListListeners setHealthCheckUri(String healthCheckUri) {
            this.healthCheckUri = healthCheckUri;
            return this;
        }
        public String getHealthCheckUri() {
            return this.healthCheckUri;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListServiceListListeners setListenerPort(Long listenerPort) {
            this.listenerPort = listenerPort;
            return this;
        }
        public Long getListenerPort() {
            return this.listenerPort;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListServiceListListeners setPersistenceTimeout(Long persistenceTimeout) {
            this.persistenceTimeout = persistenceTimeout;
            return this;
        }
        public Long getPersistenceTimeout() {
            return this.persistenceTimeout;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListServiceListListeners setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListServiceListListeners setScheduler(String scheduler) {
            this.scheduler = scheduler;
            return this;
        }
        public String getScheduler() {
            return this.scheduler;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListServiceListListeners setSessionStickyType(Long sessionStickyType) {
            this.sessionStickyType = sessionStickyType;
            return this;
        }
        public Long getSessionStickyType() {
            return this.sessionStickyType;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListServiceListListeners setUnhealthyThreshold(Long unhealthyThreshold) {
            this.unhealthyThreshold = unhealthyThreshold;
            return this;
        }
        public Long getUnhealthyThreshold() {
            return this.unhealthyThreshold;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListServiceListListeners setXforwardFor(Boolean xforwardFor) {
            this.xforwardFor = xforwardFor;
            return this;
        }
        public Boolean getXforwardFor() {
            return this.xforwardFor;
        }

    }

    public static class QueryLDCContainerServiceResponseBodyContainerServiceListServiceList extends TeaModel {
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
        public java.util.List<QueryLDCContainerServiceResponseBodyContainerServiceListServiceListCellSlbIaasIdMap> cellSlbIaasIdMap;

        @NameInMap("Listeners")
        public java.util.List<QueryLDCContainerServiceResponseBodyContainerServiceListServiceListListeners> listeners;

        public static QueryLDCContainerServiceResponseBodyContainerServiceListServiceList build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCContainerServiceResponseBodyContainerServiceListServiceList self = new QueryLDCContainerServiceResponseBodyContainerServiceListServiceList();
            return TeaModel.build(map, self);
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListServiceList setAddressType(String addressType) {
            this.addressType = addressType;
            return this;
        }
        public String getAddressType() {
            return this.addressType;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListServiceList setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListServiceList setLoadBalancerIaasId(String loadBalancerIaasId) {
            this.loadBalancerIaasId = loadBalancerIaasId;
            return this;
        }
        public String getLoadBalancerIaasId() {
            return this.loadBalancerIaasId;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListServiceList setLoadBalancerName(String loadBalancerName) {
            this.loadBalancerName = loadBalancerName;
            return this;
        }
        public String getLoadBalancerName() {
            return this.loadBalancerName;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListServiceList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListServiceList setSpannerClusterId(String spannerClusterId) {
            this.spannerClusterId = spannerClusterId;
            return this;
        }
        public String getSpannerClusterId() {
            return this.spannerClusterId;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListServiceList setCellSlbIaasIdMap(java.util.List<QueryLDCContainerServiceResponseBodyContainerServiceListServiceListCellSlbIaasIdMap> cellSlbIaasIdMap) {
            this.cellSlbIaasIdMap = cellSlbIaasIdMap;
            return this;
        }
        public java.util.List<QueryLDCContainerServiceResponseBodyContainerServiceListServiceListCellSlbIaasIdMap> getCellSlbIaasIdMap() {
            return this.cellSlbIaasIdMap;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceListServiceList setListeners(java.util.List<QueryLDCContainerServiceResponseBodyContainerServiceListServiceListListeners> listeners) {
            this.listeners = listeners;
            return this;
        }
        public java.util.List<QueryLDCContainerServiceResponseBodyContainerServiceListServiceListListeners> getListeners() {
            return this.listeners;
        }

    }

    public static class QueryLDCContainerServiceResponseBodyContainerServiceList extends TeaModel {
        @NameInMap("AppBuild")
        public String appBuild;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("CurrentImage")
        public String currentImage;

        @NameInMap("DeployingRevision")
        public String deployingRevision;

        @NameInMap("DeploymentStatus")
        public String deploymentStatus;

        @NameInMap("Description")
        public String description;

        @NameInMap("DraftedRevision")
        public String draftedRevision;

        @NameInMap("DraftedTime")
        public String draftedTime;

        @NameInMap("LastDeployedRevision")
        public String lastDeployedRevision;

        @NameInMap("LastDeployEndTime")
        public String lastDeployEndTime;

        @NameInMap("LastDeployPlanId")
        public String lastDeployPlanId;

        @NameInMap("LastDeployStartTime")
        public String lastDeployStartTime;

        @NameInMap("MetadataStatus")
        public String metadataStatus;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("Name")
        public String name;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("ProcessingCount")
        public String processingCount;

        @NameInMap("Replicas")
        public String replicas;

        @NameInMap("RunningCount")
        public String runningCount;

        @NameInMap("RuntimeRevision")
        public String runtimeRevision;

        @NameInMap("WorkspaceGroup")
        public String workspaceGroup;

        @NameInMap("PodList")
        public java.util.List<QueryLDCContainerServiceResponseBodyContainerServiceListPodList> podList;

        @NameInMap("ServiceList")
        public java.util.List<QueryLDCContainerServiceResponseBodyContainerServiceListServiceList> serviceList;

        public static QueryLDCContainerServiceResponseBodyContainerServiceList build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCContainerServiceResponseBodyContainerServiceList self = new QueryLDCContainerServiceResponseBodyContainerServiceList();
            return TeaModel.build(map, self);
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceList setAppBuild(String appBuild) {
            this.appBuild = appBuild;
            return this;
        }
        public String getAppBuild() {
            return this.appBuild;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceList setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceList setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceList setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceList setCurrentImage(String currentImage) {
            this.currentImage = currentImage;
            return this;
        }
        public String getCurrentImage() {
            return this.currentImage;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceList setDeployingRevision(String deployingRevision) {
            this.deployingRevision = deployingRevision;
            return this;
        }
        public String getDeployingRevision() {
            return this.deployingRevision;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceList setDeploymentStatus(String deploymentStatus) {
            this.deploymentStatus = deploymentStatus;
            return this;
        }
        public String getDeploymentStatus() {
            return this.deploymentStatus;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceList setDraftedRevision(String draftedRevision) {
            this.draftedRevision = draftedRevision;
            return this;
        }
        public String getDraftedRevision() {
            return this.draftedRevision;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceList setDraftedTime(String draftedTime) {
            this.draftedTime = draftedTime;
            return this;
        }
        public String getDraftedTime() {
            return this.draftedTime;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceList setLastDeployedRevision(String lastDeployedRevision) {
            this.lastDeployedRevision = lastDeployedRevision;
            return this;
        }
        public String getLastDeployedRevision() {
            return this.lastDeployedRevision;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceList setLastDeployEndTime(String lastDeployEndTime) {
            this.lastDeployEndTime = lastDeployEndTime;
            return this;
        }
        public String getLastDeployEndTime() {
            return this.lastDeployEndTime;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceList setLastDeployPlanId(String lastDeployPlanId) {
            this.lastDeployPlanId = lastDeployPlanId;
            return this;
        }
        public String getLastDeployPlanId() {
            return this.lastDeployPlanId;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceList setLastDeployStartTime(String lastDeployStartTime) {
            this.lastDeployStartTime = lastDeployStartTime;
            return this;
        }
        public String getLastDeployStartTime() {
            return this.lastDeployStartTime;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceList setMetadataStatus(String metadataStatus) {
            this.metadataStatus = metadataStatus;
            return this;
        }
        public String getMetadataStatus() {
            return this.metadataStatus;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceList setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceList setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceList setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceList setProcessingCount(String processingCount) {
            this.processingCount = processingCount;
            return this;
        }
        public String getProcessingCount() {
            return this.processingCount;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceList setReplicas(String replicas) {
            this.replicas = replicas;
            return this;
        }
        public String getReplicas() {
            return this.replicas;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceList setRunningCount(String runningCount) {
            this.runningCount = runningCount;
            return this;
        }
        public String getRunningCount() {
            return this.runningCount;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceList setRuntimeRevision(String runtimeRevision) {
            this.runtimeRevision = runtimeRevision;
            return this;
        }
        public String getRuntimeRevision() {
            return this.runtimeRevision;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceList setWorkspaceGroup(String workspaceGroup) {
            this.workspaceGroup = workspaceGroup;
            return this;
        }
        public String getWorkspaceGroup() {
            return this.workspaceGroup;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceList setPodList(java.util.List<QueryLDCContainerServiceResponseBodyContainerServiceListPodList> podList) {
            this.podList = podList;
            return this;
        }
        public java.util.List<QueryLDCContainerServiceResponseBodyContainerServiceListPodList> getPodList() {
            return this.podList;
        }

        public QueryLDCContainerServiceResponseBodyContainerServiceList setServiceList(java.util.List<QueryLDCContainerServiceResponseBodyContainerServiceListServiceList> serviceList) {
            this.serviceList = serviceList;
            return this;
        }
        public java.util.List<QueryLDCContainerServiceResponseBodyContainerServiceListServiceList> getServiceList() {
            return this.serviceList;
        }

    }

}
