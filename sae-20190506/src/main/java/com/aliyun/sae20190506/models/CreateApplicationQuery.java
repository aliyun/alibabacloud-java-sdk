// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class CreateApplicationQuery extends TeaModel {
    @NameInMap("AppName")
    @Validation(required = true)
    public String appName;

    @NameInMap("NamespaceId")
    public String namespaceId;

    @NameInMap("AppDescription")
    public String appDescription;

    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("VSwitchId")
    public String vSwitchId;

    @NameInMap("PackageType")
    @Validation(required = true)
    public String packageType;

    @NameInMap("PackageVersion")
    public String packageVersion;

    @NameInMap("PackageUrl")
    public String packageUrl;

    @NameInMap("ImageUrl")
    public String imageUrl;

    @NameInMap("Jdk")
    public String jdk;

    @NameInMap("WebContainer")
    public String webContainer;

    @NameInMap("Cpu")
    public Integer cpu;

    @NameInMap("Memory")
    public Integer memory;

    @NameInMap("Replicas")
    @Validation(required = true)
    public Integer replicas;

    @NameInMap("Command")
    public String command;

    @NameInMap("CommandArgs")
    public String commandArgs;

    @NameInMap("Envs")
    public String envs;

    @NameInMap("CustomHostAlias")
    public String customHostAlias;

    @NameInMap("JarStartOptions")
    public String jarStartOptions;

    @NameInMap("JarStartArgs")
    public String jarStartArgs;

    @NameInMap("Liveness")
    public String liveness;

    @NameInMap("Readiness")
    public String readiness;

    @NameInMap("Deploy")
    public Boolean deploy;

    @NameInMap("EdasContainerVersion")
    public String edasContainerVersion;

    @NameInMap("Timezone")
    public String timezone;

    @NameInMap("SlsConfigs")
    public String slsConfigs;

    @NameInMap("NasId")
    public String nasId;

    @NameInMap("MountHost")
    public String mountHost;

    @NameInMap("MountDesc")
    public String mountDesc;

    @NameInMap("PreStop")
    public String preStop;

    @NameInMap("PostStart")
    public String postStart;

    @NameInMap("WarStartOptions")
    public String warStartOptions;

    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    @NameInMap("AutoConfig")
    public Boolean autoConfig;

    @NameInMap("TerminationGracePeriodSeconds")
    public Integer terminationGracePeriodSeconds;

    @NameInMap("PhpArmsConfigLocation")
    public String phpArmsConfigLocation;

    @NameInMap("PhpConfigLocation")
    public String phpConfigLocation;

    @NameInMap("TomcatConfig")
    public String tomcatConfig;

    @NameInMap("AcrAssumeRoleArn")
    public String acrAssumeRoleArn;

    public static CreateApplicationQuery build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicationQuery self = new CreateApplicationQuery();
        return TeaModel.build(map, self);
    }

    public CreateApplicationQuery setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateApplicationQuery setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public CreateApplicationQuery setAppDescription(String appDescription) {
        this.appDescription = appDescription;
        return this;
    }
    public String getAppDescription() {
        return this.appDescription;
    }

    public CreateApplicationQuery setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateApplicationQuery setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateApplicationQuery setPackageType(String packageType) {
        this.packageType = packageType;
        return this;
    }
    public String getPackageType() {
        return this.packageType;
    }

    public CreateApplicationQuery setPackageVersion(String packageVersion) {
        this.packageVersion = packageVersion;
        return this;
    }
    public String getPackageVersion() {
        return this.packageVersion;
    }

    public CreateApplicationQuery setPackageUrl(String packageUrl) {
        this.packageUrl = packageUrl;
        return this;
    }
    public String getPackageUrl() {
        return this.packageUrl;
    }

    public CreateApplicationQuery setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public CreateApplicationQuery setJdk(String jdk) {
        this.jdk = jdk;
        return this;
    }
    public String getJdk() {
        return this.jdk;
    }

    public CreateApplicationQuery setWebContainer(String webContainer) {
        this.webContainer = webContainer;
        return this;
    }
    public String getWebContainer() {
        return this.webContainer;
    }

    public CreateApplicationQuery setCpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }
    public Integer getCpu() {
        return this.cpu;
    }

    public CreateApplicationQuery setMemory(Integer memory) {
        this.memory = memory;
        return this;
    }
    public Integer getMemory() {
        return this.memory;
    }

    public CreateApplicationQuery setReplicas(Integer replicas) {
        this.replicas = replicas;
        return this;
    }
    public Integer getReplicas() {
        return this.replicas;
    }

    public CreateApplicationQuery setCommand(String command) {
        this.command = command;
        return this;
    }
    public String getCommand() {
        return this.command;
    }

    public CreateApplicationQuery setCommandArgs(String commandArgs) {
        this.commandArgs = commandArgs;
        return this;
    }
    public String getCommandArgs() {
        return this.commandArgs;
    }

    public CreateApplicationQuery setEnvs(String envs) {
        this.envs = envs;
        return this;
    }
    public String getEnvs() {
        return this.envs;
    }

    public CreateApplicationQuery setCustomHostAlias(String customHostAlias) {
        this.customHostAlias = customHostAlias;
        return this;
    }
    public String getCustomHostAlias() {
        return this.customHostAlias;
    }

    public CreateApplicationQuery setJarStartOptions(String jarStartOptions) {
        this.jarStartOptions = jarStartOptions;
        return this;
    }
    public String getJarStartOptions() {
        return this.jarStartOptions;
    }

    public CreateApplicationQuery setJarStartArgs(String jarStartArgs) {
        this.jarStartArgs = jarStartArgs;
        return this;
    }
    public String getJarStartArgs() {
        return this.jarStartArgs;
    }

    public CreateApplicationQuery setLiveness(String liveness) {
        this.liveness = liveness;
        return this;
    }
    public String getLiveness() {
        return this.liveness;
    }

    public CreateApplicationQuery setReadiness(String readiness) {
        this.readiness = readiness;
        return this;
    }
    public String getReadiness() {
        return this.readiness;
    }

    public CreateApplicationQuery setDeploy(Boolean deploy) {
        this.deploy = deploy;
        return this;
    }
    public Boolean getDeploy() {
        return this.deploy;
    }

    public CreateApplicationQuery setEdasContainerVersion(String edasContainerVersion) {
        this.edasContainerVersion = edasContainerVersion;
        return this;
    }
    public String getEdasContainerVersion() {
        return this.edasContainerVersion;
    }

    public CreateApplicationQuery setTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }
    public String getTimezone() {
        return this.timezone;
    }

    public CreateApplicationQuery setSlsConfigs(String slsConfigs) {
        this.slsConfigs = slsConfigs;
        return this;
    }
    public String getSlsConfigs() {
        return this.slsConfigs;
    }

    public CreateApplicationQuery setNasId(String nasId) {
        this.nasId = nasId;
        return this;
    }
    public String getNasId() {
        return this.nasId;
    }

    public CreateApplicationQuery setMountHost(String mountHost) {
        this.mountHost = mountHost;
        return this;
    }
    public String getMountHost() {
        return this.mountHost;
    }

    public CreateApplicationQuery setMountDesc(String mountDesc) {
        this.mountDesc = mountDesc;
        return this;
    }
    public String getMountDesc() {
        return this.mountDesc;
    }

    public CreateApplicationQuery setPreStop(String preStop) {
        this.preStop = preStop;
        return this;
    }
    public String getPreStop() {
        return this.preStop;
    }

    public CreateApplicationQuery setPostStart(String postStart) {
        this.postStart = postStart;
        return this;
    }
    public String getPostStart() {
        return this.postStart;
    }

    public CreateApplicationQuery setWarStartOptions(String warStartOptions) {
        this.warStartOptions = warStartOptions;
        return this;
    }
    public String getWarStartOptions() {
        return this.warStartOptions;
    }

    public CreateApplicationQuery setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public CreateApplicationQuery setAutoConfig(Boolean autoConfig) {
        this.autoConfig = autoConfig;
        return this;
    }
    public Boolean getAutoConfig() {
        return this.autoConfig;
    }

    public CreateApplicationQuery setTerminationGracePeriodSeconds(Integer terminationGracePeriodSeconds) {
        this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
        return this;
    }
    public Integer getTerminationGracePeriodSeconds() {
        return this.terminationGracePeriodSeconds;
    }

    public CreateApplicationQuery setPhpArmsConfigLocation(String phpArmsConfigLocation) {
        this.phpArmsConfigLocation = phpArmsConfigLocation;
        return this;
    }
    public String getPhpArmsConfigLocation() {
        return this.phpArmsConfigLocation;
    }

    public CreateApplicationQuery setPhpConfigLocation(String phpConfigLocation) {
        this.phpConfigLocation = phpConfigLocation;
        return this;
    }
    public String getPhpConfigLocation() {
        return this.phpConfigLocation;
    }

    public CreateApplicationQuery setTomcatConfig(String tomcatConfig) {
        this.tomcatConfig = tomcatConfig;
        return this;
    }
    public String getTomcatConfig() {
        return this.tomcatConfig;
    }

    public CreateApplicationQuery setAcrAssumeRoleArn(String acrAssumeRoleArn) {
        this.acrAssumeRoleArn = acrAssumeRoleArn;
        return this;
    }
    public String getAcrAssumeRoleArn() {
        return this.acrAssumeRoleArn;
    }

}
