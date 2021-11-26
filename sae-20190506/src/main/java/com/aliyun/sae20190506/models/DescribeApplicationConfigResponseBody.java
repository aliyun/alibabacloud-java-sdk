// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeApplicationConfigResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeApplicationConfigResponseBodyData data;

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

    public static DescribeApplicationConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationConfigResponseBody self = new DescribeApplicationConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeApplicationConfigResponseBody setData(DescribeApplicationConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeApplicationConfigResponseBodyData getData() {
        return this.data;
    }

    public DescribeApplicationConfigResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeApplicationConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeApplicationConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApplicationConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeApplicationConfigResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class DescribeApplicationConfigResponseBodyDataConfigMapMountDesc extends TeaModel {
        @NameInMap("ConfigMapId")
        public Long configMapId;

        @NameInMap("ConfigMapName")
        public String configMapName;

        @NameInMap("Key")
        public String key;

        @NameInMap("MountPath")
        public String mountPath;

        public static DescribeApplicationConfigResponseBodyDataConfigMapMountDesc build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationConfigResponseBodyDataConfigMapMountDesc self = new DescribeApplicationConfigResponseBodyDataConfigMapMountDesc();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationConfigResponseBodyDataConfigMapMountDesc setConfigMapId(Long configMapId) {
            this.configMapId = configMapId;
            return this;
        }
        public Long getConfigMapId() {
            return this.configMapId;
        }

        public DescribeApplicationConfigResponseBodyDataConfigMapMountDesc setConfigMapName(String configMapName) {
            this.configMapName = configMapName;
            return this;
        }
        public String getConfigMapName() {
            return this.configMapName;
        }

        public DescribeApplicationConfigResponseBodyDataConfigMapMountDesc setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeApplicationConfigResponseBodyDataConfigMapMountDesc setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

    }

    public static class DescribeApplicationConfigResponseBodyDataMountDesc extends TeaModel {
        @NameInMap("MountPath")
        public String mountPath;

        @NameInMap("NasPath")
        public String nasPath;

        public static DescribeApplicationConfigResponseBodyDataMountDesc build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationConfigResponseBodyDataMountDesc self = new DescribeApplicationConfigResponseBodyDataMountDesc();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationConfigResponseBodyDataMountDesc setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

        public DescribeApplicationConfigResponseBodyDataMountDesc setNasPath(String nasPath) {
            this.nasPath = nasPath;
            return this;
        }
        public String getNasPath() {
            return this.nasPath;
        }

    }

    public static class DescribeApplicationConfigResponseBodyDataOssMountDescs extends TeaModel {
        // Bucket名称
        @NameInMap("bucketName")
        public String bucketName;

        // Bucket中Oss Key名称
        @NameInMap("bucketPath")
        public String bucketPath;

        // 挂载到容器的路径
        @NameInMap("mountPath")
        public String mountPath;

        // 是否只读
        @NameInMap("readOnly")
        public Boolean readOnly;

        public static DescribeApplicationConfigResponseBodyDataOssMountDescs build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationConfigResponseBodyDataOssMountDescs self = new DescribeApplicationConfigResponseBodyDataOssMountDescs();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationConfigResponseBodyDataOssMountDescs setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public DescribeApplicationConfigResponseBodyDataOssMountDescs setBucketPath(String bucketPath) {
            this.bucketPath = bucketPath;
            return this;
        }
        public String getBucketPath() {
            return this.bucketPath;
        }

        public DescribeApplicationConfigResponseBodyDataOssMountDescs setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

        public DescribeApplicationConfigResponseBodyDataOssMountDescs setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

    }

    public static class DescribeApplicationConfigResponseBodyDataTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeApplicationConfigResponseBodyDataTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationConfigResponseBodyDataTags self = new DescribeApplicationConfigResponseBodyDataTags();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationConfigResponseBodyDataTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeApplicationConfigResponseBodyDataTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeApplicationConfigResponseBodyData extends TeaModel {
        @NameInMap("AcrAssumeRoleArn")
        public String acrAssumeRoleArn;

        @NameInMap("AppDescription")
        public String appDescription;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("AppName")
        public String appName;

        // 是否绑定EIP
        @NameInMap("AssociateEip")
        public Boolean associateEip;

        @NameInMap("BatchWaitTime")
        public Integer batchWaitTime;

        @NameInMap("Command")
        public String command;

        @NameInMap("CommandArgs")
        public String commandArgs;

        @NameInMap("ConfigMapMountDesc")
        public java.util.List<DescribeApplicationConfigResponseBodyDataConfigMapMountDesc> configMapMountDesc;

        @NameInMap("Cpu")
        public Integer cpu;

        @NameInMap("CustomHostAlias")
        public String customHostAlias;

        @NameInMap("EdasContainerVersion")
        public String edasContainerVersion;

        @NameInMap("EnableAhas")
        public String enableAhas;

        // 开启流量灰度
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
        public java.util.List<DescribeApplicationConfigResponseBodyDataMountDesc> mountDesc;

        @NameInMap("MountHost")
        public String mountHost;

        // 对应MSE产品侧应用ID
        @NameInMap("MseApplicationId")
        public String mseApplicationId;

        @NameInMap("NamespaceId")
        public String namespaceId;

        @NameInMap("NasId")
        public String nasId;

        // OSS读写的AK
        @NameInMap("OssAkId")
        public String ossAkId;

        // OSS读写的secret
        @NameInMap("OssAkSecret")
        public String ossAkSecret;

        // OSS挂载描述信息
        @NameInMap("OssMountDescs")
        public java.util.List<DescribeApplicationConfigResponseBodyDataOssMountDescs> ossMountDescs;

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

        @NameInMap("Readiness")
        public String readiness;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Replicas")
        public Integer replicas;

        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        @NameInMap("SlsConfigs")
        public String slsConfigs;

        @NameInMap("Tags")
        public java.util.List<DescribeApplicationConfigResponseBodyDataTags> tags;

        @NameInMap("TerminationGracePeriodSeconds")
        public Integer terminationGracePeriodSeconds;

        @NameInMap("Timezone")
        public String timezone;

        @NameInMap("TomcatConfig")
        public String tomcatConfig;

        @NameInMap("UpdateStrategy")
        public String updateStrategy;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("WarStartOptions")
        public String warStartOptions;

        @NameInMap("WebContainer")
        public String webContainer;

        public static DescribeApplicationConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationConfigResponseBodyData self = new DescribeApplicationConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationConfigResponseBodyData setAcrAssumeRoleArn(String acrAssumeRoleArn) {
            this.acrAssumeRoleArn = acrAssumeRoleArn;
            return this;
        }
        public String getAcrAssumeRoleArn() {
            return this.acrAssumeRoleArn;
        }

        public DescribeApplicationConfigResponseBodyData setAppDescription(String appDescription) {
            this.appDescription = appDescription;
            return this;
        }
        public String getAppDescription() {
            return this.appDescription;
        }

        public DescribeApplicationConfigResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public DescribeApplicationConfigResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeApplicationConfigResponseBodyData setAssociateEip(Boolean associateEip) {
            this.associateEip = associateEip;
            return this;
        }
        public Boolean getAssociateEip() {
            return this.associateEip;
        }

        public DescribeApplicationConfigResponseBodyData setBatchWaitTime(Integer batchWaitTime) {
            this.batchWaitTime = batchWaitTime;
            return this;
        }
        public Integer getBatchWaitTime() {
            return this.batchWaitTime;
        }

        public DescribeApplicationConfigResponseBodyData setCommand(String command) {
            this.command = command;
            return this;
        }
        public String getCommand() {
            return this.command;
        }

        public DescribeApplicationConfigResponseBodyData setCommandArgs(String commandArgs) {
            this.commandArgs = commandArgs;
            return this;
        }
        public String getCommandArgs() {
            return this.commandArgs;
        }

        public DescribeApplicationConfigResponseBodyData setConfigMapMountDesc(java.util.List<DescribeApplicationConfigResponseBodyDataConfigMapMountDesc> configMapMountDesc) {
            this.configMapMountDesc = configMapMountDesc;
            return this;
        }
        public java.util.List<DescribeApplicationConfigResponseBodyDataConfigMapMountDesc> getConfigMapMountDesc() {
            return this.configMapMountDesc;
        }

        public DescribeApplicationConfigResponseBodyData setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public DescribeApplicationConfigResponseBodyData setCustomHostAlias(String customHostAlias) {
            this.customHostAlias = customHostAlias;
            return this;
        }
        public String getCustomHostAlias() {
            return this.customHostAlias;
        }

        public DescribeApplicationConfigResponseBodyData setEdasContainerVersion(String edasContainerVersion) {
            this.edasContainerVersion = edasContainerVersion;
            return this;
        }
        public String getEdasContainerVersion() {
            return this.edasContainerVersion;
        }

        public DescribeApplicationConfigResponseBodyData setEnableAhas(String enableAhas) {
            this.enableAhas = enableAhas;
            return this;
        }
        public String getEnableAhas() {
            return this.enableAhas;
        }

        public DescribeApplicationConfigResponseBodyData setEnableGreyTagRoute(Boolean enableGreyTagRoute) {
            this.enableGreyTagRoute = enableGreyTagRoute;
            return this;
        }
        public Boolean getEnableGreyTagRoute() {
            return this.enableGreyTagRoute;
        }

        public DescribeApplicationConfigResponseBodyData setEnvs(String envs) {
            this.envs = envs;
            return this;
        }
        public String getEnvs() {
            return this.envs;
        }

        public DescribeApplicationConfigResponseBodyData setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

        public DescribeApplicationConfigResponseBodyData setJarStartArgs(String jarStartArgs) {
            this.jarStartArgs = jarStartArgs;
            return this;
        }
        public String getJarStartArgs() {
            return this.jarStartArgs;
        }

        public DescribeApplicationConfigResponseBodyData setJarStartOptions(String jarStartOptions) {
            this.jarStartOptions = jarStartOptions;
            return this;
        }
        public String getJarStartOptions() {
            return this.jarStartOptions;
        }

        public DescribeApplicationConfigResponseBodyData setJdk(String jdk) {
            this.jdk = jdk;
            return this;
        }
        public String getJdk() {
            return this.jdk;
        }

        public DescribeApplicationConfigResponseBodyData setLiveness(String liveness) {
            this.liveness = liveness;
            return this;
        }
        public String getLiveness() {
            return this.liveness;
        }

        public DescribeApplicationConfigResponseBodyData setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
        }

        public DescribeApplicationConfigResponseBodyData setMinReadyInstances(Integer minReadyInstances) {
            this.minReadyInstances = minReadyInstances;
            return this;
        }
        public Integer getMinReadyInstances() {
            return this.minReadyInstances;
        }

        public DescribeApplicationConfigResponseBodyData setMountDesc(java.util.List<DescribeApplicationConfigResponseBodyDataMountDesc> mountDesc) {
            this.mountDesc = mountDesc;
            return this;
        }
        public java.util.List<DescribeApplicationConfigResponseBodyDataMountDesc> getMountDesc() {
            return this.mountDesc;
        }

        public DescribeApplicationConfigResponseBodyData setMountHost(String mountHost) {
            this.mountHost = mountHost;
            return this;
        }
        public String getMountHost() {
            return this.mountHost;
        }

        public DescribeApplicationConfigResponseBodyData setMseApplicationId(String mseApplicationId) {
            this.mseApplicationId = mseApplicationId;
            return this;
        }
        public String getMseApplicationId() {
            return this.mseApplicationId;
        }

        public DescribeApplicationConfigResponseBodyData setNamespaceId(String namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }
        public String getNamespaceId() {
            return this.namespaceId;
        }

        public DescribeApplicationConfigResponseBodyData setNasId(String nasId) {
            this.nasId = nasId;
            return this;
        }
        public String getNasId() {
            return this.nasId;
        }

        public DescribeApplicationConfigResponseBodyData setOssAkId(String ossAkId) {
            this.ossAkId = ossAkId;
            return this;
        }
        public String getOssAkId() {
            return this.ossAkId;
        }

        public DescribeApplicationConfigResponseBodyData setOssAkSecret(String ossAkSecret) {
            this.ossAkSecret = ossAkSecret;
            return this;
        }
        public String getOssAkSecret() {
            return this.ossAkSecret;
        }

        public DescribeApplicationConfigResponseBodyData setOssMountDescs(java.util.List<DescribeApplicationConfigResponseBodyDataOssMountDescs> ossMountDescs) {
            this.ossMountDescs = ossMountDescs;
            return this;
        }
        public java.util.List<DescribeApplicationConfigResponseBodyDataOssMountDescs> getOssMountDescs() {
            return this.ossMountDescs;
        }

        public DescribeApplicationConfigResponseBodyData setPackageType(String packageType) {
            this.packageType = packageType;
            return this;
        }
        public String getPackageType() {
            return this.packageType;
        }

        public DescribeApplicationConfigResponseBodyData setPackageUrl(String packageUrl) {
            this.packageUrl = packageUrl;
            return this;
        }
        public String getPackageUrl() {
            return this.packageUrl;
        }

        public DescribeApplicationConfigResponseBodyData setPackageVersion(String packageVersion) {
            this.packageVersion = packageVersion;
            return this;
        }
        public String getPackageVersion() {
            return this.packageVersion;
        }

        public DescribeApplicationConfigResponseBodyData setPhpArmsConfigLocation(String phpArmsConfigLocation) {
            this.phpArmsConfigLocation = phpArmsConfigLocation;
            return this;
        }
        public String getPhpArmsConfigLocation() {
            return this.phpArmsConfigLocation;
        }

        public DescribeApplicationConfigResponseBodyData setPhpConfig(String phpConfig) {
            this.phpConfig = phpConfig;
            return this;
        }
        public String getPhpConfig() {
            return this.phpConfig;
        }

        public DescribeApplicationConfigResponseBodyData setPhpConfigLocation(String phpConfigLocation) {
            this.phpConfigLocation = phpConfigLocation;
            return this;
        }
        public String getPhpConfigLocation() {
            return this.phpConfigLocation;
        }

        public DescribeApplicationConfigResponseBodyData setPostStart(String postStart) {
            this.postStart = postStart;
            return this;
        }
        public String getPostStart() {
            return this.postStart;
        }

        public DescribeApplicationConfigResponseBodyData setPreStop(String preStop) {
            this.preStop = preStop;
            return this;
        }
        public String getPreStop() {
            return this.preStop;
        }

        public DescribeApplicationConfigResponseBodyData setReadiness(String readiness) {
            this.readiness = readiness;
            return this;
        }
        public String getReadiness() {
            return this.readiness;
        }

        public DescribeApplicationConfigResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeApplicationConfigResponseBodyData setReplicas(Integer replicas) {
            this.replicas = replicas;
            return this;
        }
        public Integer getReplicas() {
            return this.replicas;
        }

        public DescribeApplicationConfigResponseBodyData setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public DescribeApplicationConfigResponseBodyData setSlsConfigs(String slsConfigs) {
            this.slsConfigs = slsConfigs;
            return this;
        }
        public String getSlsConfigs() {
            return this.slsConfigs;
        }

        public DescribeApplicationConfigResponseBodyData setTags(java.util.List<DescribeApplicationConfigResponseBodyDataTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeApplicationConfigResponseBodyDataTags> getTags() {
            return this.tags;
        }

        public DescribeApplicationConfigResponseBodyData setTerminationGracePeriodSeconds(Integer terminationGracePeriodSeconds) {
            this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
            return this;
        }
        public Integer getTerminationGracePeriodSeconds() {
            return this.terminationGracePeriodSeconds;
        }

        public DescribeApplicationConfigResponseBodyData setTimezone(String timezone) {
            this.timezone = timezone;
            return this;
        }
        public String getTimezone() {
            return this.timezone;
        }

        public DescribeApplicationConfigResponseBodyData setTomcatConfig(String tomcatConfig) {
            this.tomcatConfig = tomcatConfig;
            return this;
        }
        public String getTomcatConfig() {
            return this.tomcatConfig;
        }

        public DescribeApplicationConfigResponseBodyData setUpdateStrategy(String updateStrategy) {
            this.updateStrategy = updateStrategy;
            return this;
        }
        public String getUpdateStrategy() {
            return this.updateStrategy;
        }

        public DescribeApplicationConfigResponseBodyData setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeApplicationConfigResponseBodyData setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeApplicationConfigResponseBodyData setWarStartOptions(String warStartOptions) {
            this.warStartOptions = warStartOptions;
            return this;
        }
        public String getWarStartOptions() {
            return this.warStartOptions;
        }

        public DescribeApplicationConfigResponseBodyData setWebContainer(String webContainer) {
            this.webContainer = webContainer;
            return this;
        }
        public String getWebContainer() {
            return this.webContainer;
        }

    }

}
