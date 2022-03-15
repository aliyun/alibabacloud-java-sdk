// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DeployApplicationRequest extends TeaModel {
    @NameInMap("AcrAssumeRoleArn")
    public String acrAssumeRoleArn;

    // ACR 企业版实例 ID
    @NameInMap("AcrInstanceId")
    public String acrInstanceId;

    @NameInMap("AppId")
    public String appId;

    // 是否绑定EIP
    @NameInMap("AssociateEip")
    public Boolean associateEip;

    @NameInMap("AutoEnableApplicationScalingRule")
    public Boolean autoEnableApplicationScalingRule;

    @NameInMap("BatchWaitTime")
    public Integer batchWaitTime;

    @NameInMap("ChangeOrderDesc")
    public String changeOrderDesc;

    @NameInMap("Command")
    public String command;

    @NameInMap("CommandArgs")
    public String commandArgs;

    @NameInMap("ConfigMapMountDesc")
    public String configMapMountDesc;

    @NameInMap("CustomHostAlias")
    public String customHostAlias;

    @NameInMap("EdasContainerVersion")
    public String edasContainerVersion;

    @NameInMap("EnableAhas")
    public String enableAhas;

    // 是否开启发布流量灰度规则
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

    @NameInMap("KafkaEndpoint")
    public String kafkaEndpoint;

    @NameInMap("KafkaInstanceId")
    public String kafkaInstanceId;

    @NameInMap("KafkaLogfileConfig")
    public String kafkaLogfileConfig;

    @NameInMap("Liveness")
    public String liveness;

    @NameInMap("MinReadyInstanceRatio")
    public Integer minReadyInstanceRatio;

    @NameInMap("MinReadyInstances")
    public Integer minReadyInstances;

    @NameInMap("MountDesc")
    public String mountDesc;

    @NameInMap("MountHost")
    public String mountHost;

    @NameInMap("NasId")
    public String nasId;

    @NameInMap("OpenCollectToKafka")
    public Boolean openCollectToKafka;

    // OSS使用的AKID
    @NameInMap("OssAkId")
    public String ossAkId;

    // OSS AKID对应的secret
    @NameInMap("OssAkSecret")
    public String ossAkSecret;

    // OSS挂载描述信息
    @NameInMap("OssMountDescs")
    public String ossMountDescs;

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

    @NameInMap("SlsConfigs")
    public String slsConfigs;

    @NameInMap("TerminationGracePeriodSeconds")
    public Integer terminationGracePeriodSeconds;

    @NameInMap("Timezone")
    public String timezone;

    @NameInMap("TomcatConfig")
    public String tomcatConfig;

    @NameInMap("UpdateStrategy")
    public String updateStrategy;

    @NameInMap("WarStartOptions")
    public String warStartOptions;

    @NameInMap("WebContainer")
    public String webContainer;

    public static DeployApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        DeployApplicationRequest self = new DeployApplicationRequest();
        return TeaModel.build(map, self);
    }

    public DeployApplicationRequest setAcrAssumeRoleArn(String acrAssumeRoleArn) {
        this.acrAssumeRoleArn = acrAssumeRoleArn;
        return this;
    }
    public String getAcrAssumeRoleArn() {
        return this.acrAssumeRoleArn;
    }

    public DeployApplicationRequest setAcrInstanceId(String acrInstanceId) {
        this.acrInstanceId = acrInstanceId;
        return this;
    }
    public String getAcrInstanceId() {
        return this.acrInstanceId;
    }

    public DeployApplicationRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DeployApplicationRequest setAssociateEip(Boolean associateEip) {
        this.associateEip = associateEip;
        return this;
    }
    public Boolean getAssociateEip() {
        return this.associateEip;
    }

    public DeployApplicationRequest setAutoEnableApplicationScalingRule(Boolean autoEnableApplicationScalingRule) {
        this.autoEnableApplicationScalingRule = autoEnableApplicationScalingRule;
        return this;
    }
    public Boolean getAutoEnableApplicationScalingRule() {
        return this.autoEnableApplicationScalingRule;
    }

    public DeployApplicationRequest setBatchWaitTime(Integer batchWaitTime) {
        this.batchWaitTime = batchWaitTime;
        return this;
    }
    public Integer getBatchWaitTime() {
        return this.batchWaitTime;
    }

    public DeployApplicationRequest setChangeOrderDesc(String changeOrderDesc) {
        this.changeOrderDesc = changeOrderDesc;
        return this;
    }
    public String getChangeOrderDesc() {
        return this.changeOrderDesc;
    }

    public DeployApplicationRequest setCommand(String command) {
        this.command = command;
        return this;
    }
    public String getCommand() {
        return this.command;
    }

    public DeployApplicationRequest setCommandArgs(String commandArgs) {
        this.commandArgs = commandArgs;
        return this;
    }
    public String getCommandArgs() {
        return this.commandArgs;
    }

    public DeployApplicationRequest setConfigMapMountDesc(String configMapMountDesc) {
        this.configMapMountDesc = configMapMountDesc;
        return this;
    }
    public String getConfigMapMountDesc() {
        return this.configMapMountDesc;
    }

    public DeployApplicationRequest setCustomHostAlias(String customHostAlias) {
        this.customHostAlias = customHostAlias;
        return this;
    }
    public String getCustomHostAlias() {
        return this.customHostAlias;
    }

    public DeployApplicationRequest setEdasContainerVersion(String edasContainerVersion) {
        this.edasContainerVersion = edasContainerVersion;
        return this;
    }
    public String getEdasContainerVersion() {
        return this.edasContainerVersion;
    }

    public DeployApplicationRequest setEnableAhas(String enableAhas) {
        this.enableAhas = enableAhas;
        return this;
    }
    public String getEnableAhas() {
        return this.enableAhas;
    }

    public DeployApplicationRequest setEnableGreyTagRoute(Boolean enableGreyTagRoute) {
        this.enableGreyTagRoute = enableGreyTagRoute;
        return this;
    }
    public Boolean getEnableGreyTagRoute() {
        return this.enableGreyTagRoute;
    }

    public DeployApplicationRequest setEnvs(String envs) {
        this.envs = envs;
        return this;
    }
    public String getEnvs() {
        return this.envs;
    }

    public DeployApplicationRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public DeployApplicationRequest setJarStartArgs(String jarStartArgs) {
        this.jarStartArgs = jarStartArgs;
        return this;
    }
    public String getJarStartArgs() {
        return this.jarStartArgs;
    }

    public DeployApplicationRequest setJarStartOptions(String jarStartOptions) {
        this.jarStartOptions = jarStartOptions;
        return this;
    }
    public String getJarStartOptions() {
        return this.jarStartOptions;
    }

    public DeployApplicationRequest setJdk(String jdk) {
        this.jdk = jdk;
        return this;
    }
    public String getJdk() {
        return this.jdk;
    }

    public DeployApplicationRequest setKafkaEndpoint(String kafkaEndpoint) {
        this.kafkaEndpoint = kafkaEndpoint;
        return this;
    }
    public String getKafkaEndpoint() {
        return this.kafkaEndpoint;
    }

    public DeployApplicationRequest setKafkaInstanceId(String kafkaInstanceId) {
        this.kafkaInstanceId = kafkaInstanceId;
        return this;
    }
    public String getKafkaInstanceId() {
        return this.kafkaInstanceId;
    }

    public DeployApplicationRequest setKafkaLogfileConfig(String kafkaLogfileConfig) {
        this.kafkaLogfileConfig = kafkaLogfileConfig;
        return this;
    }
    public String getKafkaLogfileConfig() {
        return this.kafkaLogfileConfig;
    }

    public DeployApplicationRequest setLiveness(String liveness) {
        this.liveness = liveness;
        return this;
    }
    public String getLiveness() {
        return this.liveness;
    }

    public DeployApplicationRequest setMinReadyInstanceRatio(Integer minReadyInstanceRatio) {
        this.minReadyInstanceRatio = minReadyInstanceRatio;
        return this;
    }
    public Integer getMinReadyInstanceRatio() {
        return this.minReadyInstanceRatio;
    }

    public DeployApplicationRequest setMinReadyInstances(Integer minReadyInstances) {
        this.minReadyInstances = minReadyInstances;
        return this;
    }
    public Integer getMinReadyInstances() {
        return this.minReadyInstances;
    }

    public DeployApplicationRequest setMountDesc(String mountDesc) {
        this.mountDesc = mountDesc;
        return this;
    }
    public String getMountDesc() {
        return this.mountDesc;
    }

    public DeployApplicationRequest setMountHost(String mountHost) {
        this.mountHost = mountHost;
        return this;
    }
    public String getMountHost() {
        return this.mountHost;
    }

    public DeployApplicationRequest setNasId(String nasId) {
        this.nasId = nasId;
        return this;
    }
    public String getNasId() {
        return this.nasId;
    }

    public DeployApplicationRequest setOpenCollectToKafka(Boolean openCollectToKafka) {
        this.openCollectToKafka = openCollectToKafka;
        return this;
    }
    public Boolean getOpenCollectToKafka() {
        return this.openCollectToKafka;
    }

    public DeployApplicationRequest setOssAkId(String ossAkId) {
        this.ossAkId = ossAkId;
        return this;
    }
    public String getOssAkId() {
        return this.ossAkId;
    }

    public DeployApplicationRequest setOssAkSecret(String ossAkSecret) {
        this.ossAkSecret = ossAkSecret;
        return this;
    }
    public String getOssAkSecret() {
        return this.ossAkSecret;
    }

    public DeployApplicationRequest setOssMountDescs(String ossMountDescs) {
        this.ossMountDescs = ossMountDescs;
        return this;
    }
    public String getOssMountDescs() {
        return this.ossMountDescs;
    }

    public DeployApplicationRequest setPackageUrl(String packageUrl) {
        this.packageUrl = packageUrl;
        return this;
    }
    public String getPackageUrl() {
        return this.packageUrl;
    }

    public DeployApplicationRequest setPackageVersion(String packageVersion) {
        this.packageVersion = packageVersion;
        return this;
    }
    public String getPackageVersion() {
        return this.packageVersion;
    }

    public DeployApplicationRequest setPhpArmsConfigLocation(String phpArmsConfigLocation) {
        this.phpArmsConfigLocation = phpArmsConfigLocation;
        return this;
    }
    public String getPhpArmsConfigLocation() {
        return this.phpArmsConfigLocation;
    }

    public DeployApplicationRequest setPhpConfig(String phpConfig) {
        this.phpConfig = phpConfig;
        return this;
    }
    public String getPhpConfig() {
        return this.phpConfig;
    }

    public DeployApplicationRequest setPhpConfigLocation(String phpConfigLocation) {
        this.phpConfigLocation = phpConfigLocation;
        return this;
    }
    public String getPhpConfigLocation() {
        return this.phpConfigLocation;
    }

    public DeployApplicationRequest setPostStart(String postStart) {
        this.postStart = postStart;
        return this;
    }
    public String getPostStart() {
        return this.postStart;
    }

    public DeployApplicationRequest setPreStop(String preStop) {
        this.preStop = preStop;
        return this;
    }
    public String getPreStop() {
        return this.preStop;
    }

    public DeployApplicationRequest setReadiness(String readiness) {
        this.readiness = readiness;
        return this;
    }
    public String getReadiness() {
        return this.readiness;
    }

    public DeployApplicationRequest setSlsConfigs(String slsConfigs) {
        this.slsConfigs = slsConfigs;
        return this;
    }
    public String getSlsConfigs() {
        return this.slsConfigs;
    }

    public DeployApplicationRequest setTerminationGracePeriodSeconds(Integer terminationGracePeriodSeconds) {
        this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
        return this;
    }
    public Integer getTerminationGracePeriodSeconds() {
        return this.terminationGracePeriodSeconds;
    }

    public DeployApplicationRequest setTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }
    public String getTimezone() {
        return this.timezone;
    }

    public DeployApplicationRequest setTomcatConfig(String tomcatConfig) {
        this.tomcatConfig = tomcatConfig;
        return this;
    }
    public String getTomcatConfig() {
        return this.tomcatConfig;
    }

    public DeployApplicationRequest setUpdateStrategy(String updateStrategy) {
        this.updateStrategy = updateStrategy;
        return this;
    }
    public String getUpdateStrategy() {
        return this.updateStrategy;
    }

    public DeployApplicationRequest setWarStartOptions(String warStartOptions) {
        this.warStartOptions = warStartOptions;
        return this;
    }
    public String getWarStartOptions() {
        return this.warStartOptions;
    }

    public DeployApplicationRequest setWebContainer(String webContainer) {
        this.webContainer = webContainer;
        return this;
    }
    public String getWebContainer() {
        return this.webContainer;
    }

}
