// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeJobResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeJobResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TraceId")
    public String traceId;

    public static DescribeJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeJobResponseBody self = new DescribeJobResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeJobResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeJobResponseBody setData(DescribeJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeJobResponseBodyData getData() {
        return this.data;
    }

    public DescribeJobResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeJobResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeJobResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class DescribeJobResponseBodyDataConfigMapMountDesc extends TeaModel {
        @NameInMap("ConfigMapId")
        public Long configMapId;

        @NameInMap("ConfigMapName")
        public String configMapName;

        @NameInMap("Key")
        public String key;

        @NameInMap("MountPath")
        public String mountPath;

        public static DescribeJobResponseBodyDataConfigMapMountDesc build(java.util.Map<String, ?> map) throws Exception {
            DescribeJobResponseBodyDataConfigMapMountDesc self = new DescribeJobResponseBodyDataConfigMapMountDesc();
            return TeaModel.build(map, self);
        }

        public DescribeJobResponseBodyDataConfigMapMountDesc setConfigMapId(Long configMapId) {
            this.configMapId = configMapId;
            return this;
        }
        public Long getConfigMapId() {
            return this.configMapId;
        }

        public DescribeJobResponseBodyDataConfigMapMountDesc setConfigMapName(String configMapName) {
            this.configMapName = configMapName;
            return this;
        }
        public String getConfigMapName() {
            return this.configMapName;
        }

        public DescribeJobResponseBodyDataConfigMapMountDesc setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeJobResponseBodyDataConfigMapMountDesc setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

    }

    public static class DescribeJobResponseBodyDataMountDesc extends TeaModel {
        @NameInMap("MountPath")
        public String mountPath;

        @NameInMap("NasPath")
        public String nasPath;

        public static DescribeJobResponseBodyDataMountDesc build(java.util.Map<String, ?> map) throws Exception {
            DescribeJobResponseBodyDataMountDesc self = new DescribeJobResponseBodyDataMountDesc();
            return TeaModel.build(map, self);
        }

        public DescribeJobResponseBodyDataMountDesc setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

        public DescribeJobResponseBodyDataMountDesc setNasPath(String nasPath) {
            this.nasPath = nasPath;
            return this;
        }
        public String getNasPath() {
            return this.nasPath;
        }

    }

    public static class DescribeJobResponseBodyDataOssMountDescs extends TeaModel {
        @NameInMap("bucketName")
        public String bucketName;

        @NameInMap("bucketPath")
        public String bucketPath;

        @NameInMap("mountPath")
        public String mountPath;

        @NameInMap("readOnly")
        public Boolean readOnly;

        public static DescribeJobResponseBodyDataOssMountDescs build(java.util.Map<String, ?> map) throws Exception {
            DescribeJobResponseBodyDataOssMountDescs self = new DescribeJobResponseBodyDataOssMountDescs();
            return TeaModel.build(map, self);
        }

        public DescribeJobResponseBodyDataOssMountDescs setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public DescribeJobResponseBodyDataOssMountDescs setBucketPath(String bucketPath) {
            this.bucketPath = bucketPath;
            return this;
        }
        public String getBucketPath() {
            return this.bucketPath;
        }

        public DescribeJobResponseBodyDataOssMountDescs setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

        public DescribeJobResponseBodyDataOssMountDescs setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

    }

    public static class DescribeJobResponseBodyDataTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeJobResponseBodyDataTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeJobResponseBodyDataTags self = new DescribeJobResponseBodyDataTags();
            return TeaModel.build(map, self);
        }

        public DescribeJobResponseBodyDataTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeJobResponseBodyDataTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeJobResponseBodyData extends TeaModel {
        @NameInMap("AcrAssumeRoleArn")
        public String acrAssumeRoleArn;

        @NameInMap("AppDescription")
        public String appDescription;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("AssociateEip")
        public Boolean associateEip;

        @NameInMap("BackoffLimit")
        public Long backoffLimit;

        @NameInMap("BatchWaitTime")
        public Integer batchWaitTime;

        @NameInMap("Command")
        public String command;

        @NameInMap("CommandArgs")
        public String commandArgs;

        @NameInMap("ConcurrencyPolicy")
        public String concurrencyPolicy;

        @NameInMap("ConfigMapMountDesc")
        public java.util.List<DescribeJobResponseBodyDataConfigMapMountDesc> configMapMountDesc;

        @NameInMap("Cpu")
        public Integer cpu;

        @NameInMap("CustomHostAlias")
        public String customHostAlias;

        @NameInMap("EdasContainerVersion")
        public String edasContainerVersion;

        @NameInMap("EnableAhas")
        public String enableAhas;

        @NameInMap("EnableGreyTagRoute")
        public Boolean enableGreyTagRoute;

        @NameInMap("Envs")
        public String envs;

        @NameInMap("ImageUrl")
        public String imageUrl;

        @NameInMap("JarStartArgs")
        public String jarStartArgs;

        @NameInMap("JarStartOptions")
        public String jarStartOptions;

        @NameInMap("Jdk")
        public String jdk;

        @NameInMap("Liveness")
        public String liveness;

        @NameInMap("Memory")
        public Integer memory;

        @NameInMap("MinReadyInstances")
        public Integer minReadyInstances;

        @NameInMap("MountDesc")
        public java.util.List<DescribeJobResponseBodyDataMountDesc> mountDesc;

        @NameInMap("MountHost")
        public String mountHost;

        @NameInMap("MseApplicationId")
        public String mseApplicationId;

        @NameInMap("NamespaceId")
        public String namespaceId;

        @NameInMap("NasConfigs")
        public String nasConfigs;

        @NameInMap("NasId")
        public String nasId;

        @NameInMap("OssAkId")
        public String ossAkId;

        @NameInMap("OssAkSecret")
        public String ossAkSecret;

        @NameInMap("OssMountDescs")
        public java.util.List<DescribeJobResponseBodyDataOssMountDescs> ossMountDescs;

        @NameInMap("PackageType")
        public String packageType;

        @NameInMap("PackageUrl")
        public String packageUrl;

        @NameInMap("PackageVersion")
        public String packageVersion;

        @NameInMap("PhpArmsConfigLocation")
        public String phpArmsConfigLocation;

        @NameInMap("PhpConfig")
        public String phpConfig;

        @NameInMap("PhpConfigLocation")
        public String phpConfigLocation;

        @NameInMap("PostStart")
        public String postStart;

        @NameInMap("PreStop")
        public String preStop;

        @NameInMap("ProgrammingLanguage")
        public String programmingLanguage;

        @NameInMap("PublicWebHookUrls")
        public java.util.List<String> publicWebHookUrls;

        @NameInMap("Readiness")
        public String readiness;

        @NameInMap("RefAppId")
        public String refAppId;

        @NameInMap("RefedAppIds")
        public java.util.List<String> refedAppIds;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Replicas")
        public Integer replicas;

        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        @NameInMap("Slice")
        public Boolean slice;

        @NameInMap("SliceEnvs")
        public String sliceEnvs;

        @NameInMap("SlsConfigs")
        public String slsConfigs;

        @NameInMap("Suspend")
        public Boolean suspend;

        @NameInMap("Tags")
        public java.util.List<DescribeJobResponseBodyDataTags> tags;

        @NameInMap("TerminationGracePeriodSeconds")
        public Integer terminationGracePeriodSeconds;

        @NameInMap("Timeout")
        public Long timeout;

        @NameInMap("Timezone")
        public String timezone;

        @NameInMap("TomcatConfig")
        public String tomcatConfig;

        @NameInMap("TriggerConfig")
        public String triggerConfig;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("VpcWebHookUrls")
        public java.util.List<String> vpcWebHookUrls;

        @NameInMap("WarStartOptions")
        public String warStartOptions;

        @NameInMap("WebContainer")
        public String webContainer;

        public static DescribeJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeJobResponseBodyData self = new DescribeJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeJobResponseBodyData setAcrAssumeRoleArn(String acrAssumeRoleArn) {
            this.acrAssumeRoleArn = acrAssumeRoleArn;
            return this;
        }
        public String getAcrAssumeRoleArn() {
            return this.acrAssumeRoleArn;
        }

        public DescribeJobResponseBodyData setAppDescription(String appDescription) {
            this.appDescription = appDescription;
            return this;
        }
        public String getAppDescription() {
            return this.appDescription;
        }

        public DescribeJobResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public DescribeJobResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeJobResponseBodyData setAssociateEip(Boolean associateEip) {
            this.associateEip = associateEip;
            return this;
        }
        public Boolean getAssociateEip() {
            return this.associateEip;
        }

        public DescribeJobResponseBodyData setBackoffLimit(Long backoffLimit) {
            this.backoffLimit = backoffLimit;
            return this;
        }
        public Long getBackoffLimit() {
            return this.backoffLimit;
        }

        public DescribeJobResponseBodyData setBatchWaitTime(Integer batchWaitTime) {
            this.batchWaitTime = batchWaitTime;
            return this;
        }
        public Integer getBatchWaitTime() {
            return this.batchWaitTime;
        }

        public DescribeJobResponseBodyData setCommand(String command) {
            this.command = command;
            return this;
        }
        public String getCommand() {
            return this.command;
        }

        public DescribeJobResponseBodyData setCommandArgs(String commandArgs) {
            this.commandArgs = commandArgs;
            return this;
        }
        public String getCommandArgs() {
            return this.commandArgs;
        }

        public DescribeJobResponseBodyData setConcurrencyPolicy(String concurrencyPolicy) {
            this.concurrencyPolicy = concurrencyPolicy;
            return this;
        }
        public String getConcurrencyPolicy() {
            return this.concurrencyPolicy;
        }

        public DescribeJobResponseBodyData setConfigMapMountDesc(java.util.List<DescribeJobResponseBodyDataConfigMapMountDesc> configMapMountDesc) {
            this.configMapMountDesc = configMapMountDesc;
            return this;
        }
        public java.util.List<DescribeJobResponseBodyDataConfigMapMountDesc> getConfigMapMountDesc() {
            return this.configMapMountDesc;
        }

        public DescribeJobResponseBodyData setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public DescribeJobResponseBodyData setCustomHostAlias(String customHostAlias) {
            this.customHostAlias = customHostAlias;
            return this;
        }
        public String getCustomHostAlias() {
            return this.customHostAlias;
        }

        public DescribeJobResponseBodyData setEdasContainerVersion(String edasContainerVersion) {
            this.edasContainerVersion = edasContainerVersion;
            return this;
        }
        public String getEdasContainerVersion() {
            return this.edasContainerVersion;
        }

        public DescribeJobResponseBodyData setEnableAhas(String enableAhas) {
            this.enableAhas = enableAhas;
            return this;
        }
        public String getEnableAhas() {
            return this.enableAhas;
        }

        public DescribeJobResponseBodyData setEnableGreyTagRoute(Boolean enableGreyTagRoute) {
            this.enableGreyTagRoute = enableGreyTagRoute;
            return this;
        }
        public Boolean getEnableGreyTagRoute() {
            return this.enableGreyTagRoute;
        }

        public DescribeJobResponseBodyData setEnvs(String envs) {
            this.envs = envs;
            return this;
        }
        public String getEnvs() {
            return this.envs;
        }

        public DescribeJobResponseBodyData setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

        public DescribeJobResponseBodyData setJarStartArgs(String jarStartArgs) {
            this.jarStartArgs = jarStartArgs;
            return this;
        }
        public String getJarStartArgs() {
            return this.jarStartArgs;
        }

        public DescribeJobResponseBodyData setJarStartOptions(String jarStartOptions) {
            this.jarStartOptions = jarStartOptions;
            return this;
        }
        public String getJarStartOptions() {
            return this.jarStartOptions;
        }

        public DescribeJobResponseBodyData setJdk(String jdk) {
            this.jdk = jdk;
            return this;
        }
        public String getJdk() {
            return this.jdk;
        }

        public DescribeJobResponseBodyData setLiveness(String liveness) {
            this.liveness = liveness;
            return this;
        }
        public String getLiveness() {
            return this.liveness;
        }

        public DescribeJobResponseBodyData setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
        }

        public DescribeJobResponseBodyData setMinReadyInstances(Integer minReadyInstances) {
            this.minReadyInstances = minReadyInstances;
            return this;
        }
        public Integer getMinReadyInstances() {
            return this.minReadyInstances;
        }

        public DescribeJobResponseBodyData setMountDesc(java.util.List<DescribeJobResponseBodyDataMountDesc> mountDesc) {
            this.mountDesc = mountDesc;
            return this;
        }
        public java.util.List<DescribeJobResponseBodyDataMountDesc> getMountDesc() {
            return this.mountDesc;
        }

        public DescribeJobResponseBodyData setMountHost(String mountHost) {
            this.mountHost = mountHost;
            return this;
        }
        public String getMountHost() {
            return this.mountHost;
        }

        public DescribeJobResponseBodyData setMseApplicationId(String mseApplicationId) {
            this.mseApplicationId = mseApplicationId;
            return this;
        }
        public String getMseApplicationId() {
            return this.mseApplicationId;
        }

        public DescribeJobResponseBodyData setNamespaceId(String namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }
        public String getNamespaceId() {
            return this.namespaceId;
        }

        public DescribeJobResponseBodyData setNasConfigs(String nasConfigs) {
            this.nasConfigs = nasConfigs;
            return this;
        }
        public String getNasConfigs() {
            return this.nasConfigs;
        }

        public DescribeJobResponseBodyData setNasId(String nasId) {
            this.nasId = nasId;
            return this;
        }
        public String getNasId() {
            return this.nasId;
        }

        public DescribeJobResponseBodyData setOssAkId(String ossAkId) {
            this.ossAkId = ossAkId;
            return this;
        }
        public String getOssAkId() {
            return this.ossAkId;
        }

        public DescribeJobResponseBodyData setOssAkSecret(String ossAkSecret) {
            this.ossAkSecret = ossAkSecret;
            return this;
        }
        public String getOssAkSecret() {
            return this.ossAkSecret;
        }

        public DescribeJobResponseBodyData setOssMountDescs(java.util.List<DescribeJobResponseBodyDataOssMountDescs> ossMountDescs) {
            this.ossMountDescs = ossMountDescs;
            return this;
        }
        public java.util.List<DescribeJobResponseBodyDataOssMountDescs> getOssMountDescs() {
            return this.ossMountDescs;
        }

        public DescribeJobResponseBodyData setPackageType(String packageType) {
            this.packageType = packageType;
            return this;
        }
        public String getPackageType() {
            return this.packageType;
        }

        public DescribeJobResponseBodyData setPackageUrl(String packageUrl) {
            this.packageUrl = packageUrl;
            return this;
        }
        public String getPackageUrl() {
            return this.packageUrl;
        }

        public DescribeJobResponseBodyData setPackageVersion(String packageVersion) {
            this.packageVersion = packageVersion;
            return this;
        }
        public String getPackageVersion() {
            return this.packageVersion;
        }

        public DescribeJobResponseBodyData setPhpArmsConfigLocation(String phpArmsConfigLocation) {
            this.phpArmsConfigLocation = phpArmsConfigLocation;
            return this;
        }
        public String getPhpArmsConfigLocation() {
            return this.phpArmsConfigLocation;
        }

        public DescribeJobResponseBodyData setPhpConfig(String phpConfig) {
            this.phpConfig = phpConfig;
            return this;
        }
        public String getPhpConfig() {
            return this.phpConfig;
        }

        public DescribeJobResponseBodyData setPhpConfigLocation(String phpConfigLocation) {
            this.phpConfigLocation = phpConfigLocation;
            return this;
        }
        public String getPhpConfigLocation() {
            return this.phpConfigLocation;
        }

        public DescribeJobResponseBodyData setPostStart(String postStart) {
            this.postStart = postStart;
            return this;
        }
        public String getPostStart() {
            return this.postStart;
        }

        public DescribeJobResponseBodyData setPreStop(String preStop) {
            this.preStop = preStop;
            return this;
        }
        public String getPreStop() {
            return this.preStop;
        }

        public DescribeJobResponseBodyData setProgrammingLanguage(String programmingLanguage) {
            this.programmingLanguage = programmingLanguage;
            return this;
        }
        public String getProgrammingLanguage() {
            return this.programmingLanguage;
        }

        public DescribeJobResponseBodyData setPublicWebHookUrls(java.util.List<String> publicWebHookUrls) {
            this.publicWebHookUrls = publicWebHookUrls;
            return this;
        }
        public java.util.List<String> getPublicWebHookUrls() {
            return this.publicWebHookUrls;
        }

        public DescribeJobResponseBodyData setReadiness(String readiness) {
            this.readiness = readiness;
            return this;
        }
        public String getReadiness() {
            return this.readiness;
        }

        public DescribeJobResponseBodyData setRefAppId(String refAppId) {
            this.refAppId = refAppId;
            return this;
        }
        public String getRefAppId() {
            return this.refAppId;
        }

        public DescribeJobResponseBodyData setRefedAppIds(java.util.List<String> refedAppIds) {
            this.refedAppIds = refedAppIds;
            return this;
        }
        public java.util.List<String> getRefedAppIds() {
            return this.refedAppIds;
        }

        public DescribeJobResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeJobResponseBodyData setReplicas(Integer replicas) {
            this.replicas = replicas;
            return this;
        }
        public Integer getReplicas() {
            return this.replicas;
        }

        public DescribeJobResponseBodyData setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public DescribeJobResponseBodyData setSlice(Boolean slice) {
            this.slice = slice;
            return this;
        }
        public Boolean getSlice() {
            return this.slice;
        }

        public DescribeJobResponseBodyData setSliceEnvs(String sliceEnvs) {
            this.sliceEnvs = sliceEnvs;
            return this;
        }
        public String getSliceEnvs() {
            return this.sliceEnvs;
        }

        public DescribeJobResponseBodyData setSlsConfigs(String slsConfigs) {
            this.slsConfigs = slsConfigs;
            return this;
        }
        public String getSlsConfigs() {
            return this.slsConfigs;
        }

        public DescribeJobResponseBodyData setSuspend(Boolean suspend) {
            this.suspend = suspend;
            return this;
        }
        public Boolean getSuspend() {
            return this.suspend;
        }

        public DescribeJobResponseBodyData setTags(java.util.List<DescribeJobResponseBodyDataTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeJobResponseBodyDataTags> getTags() {
            return this.tags;
        }

        public DescribeJobResponseBodyData setTerminationGracePeriodSeconds(Integer terminationGracePeriodSeconds) {
            this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
            return this;
        }
        public Integer getTerminationGracePeriodSeconds() {
            return this.terminationGracePeriodSeconds;
        }

        public DescribeJobResponseBodyData setTimeout(Long timeout) {
            this.timeout = timeout;
            return this;
        }
        public Long getTimeout() {
            return this.timeout;
        }

        public DescribeJobResponseBodyData setTimezone(String timezone) {
            this.timezone = timezone;
            return this;
        }
        public String getTimezone() {
            return this.timezone;
        }

        public DescribeJobResponseBodyData setTomcatConfig(String tomcatConfig) {
            this.tomcatConfig = tomcatConfig;
            return this;
        }
        public String getTomcatConfig() {
            return this.tomcatConfig;
        }

        public DescribeJobResponseBodyData setTriggerConfig(String triggerConfig) {
            this.triggerConfig = triggerConfig;
            return this;
        }
        public String getTriggerConfig() {
            return this.triggerConfig;
        }

        public DescribeJobResponseBodyData setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeJobResponseBodyData setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeJobResponseBodyData setVpcWebHookUrls(java.util.List<String> vpcWebHookUrls) {
            this.vpcWebHookUrls = vpcWebHookUrls;
            return this;
        }
        public java.util.List<String> getVpcWebHookUrls() {
            return this.vpcWebHookUrls;
        }

        public DescribeJobResponseBodyData setWarStartOptions(String warStartOptions) {
            this.warStartOptions = warStartOptions;
            return this;
        }
        public String getWarStartOptions() {
            return this.warStartOptions;
        }

        public DescribeJobResponseBodyData setWebContainer(String webContainer) {
            this.webContainer = webContainer;
            return this;
        }
        public String getWebContainer() {
            return this.webContainer;
        }

    }

}
