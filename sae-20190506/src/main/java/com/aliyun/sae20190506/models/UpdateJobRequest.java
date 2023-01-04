// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpdateJobRequest extends TeaModel {
    @NameInMap("AcrAssumeRoleArn")
    public String acrAssumeRoleArn;

    @NameInMap("AcrInstanceId")
    public String acrInstanceId;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("BackoffLimit")
    public Long backoffLimit;

    @NameInMap("Command")
    public String command;

    @NameInMap("CommandArgs")
    public String commandArgs;

    @NameInMap("ConcurrencyPolicy")
    public String concurrencyPolicy;

    @NameInMap("ConfigMapMountDesc")
    public String configMapMountDesc;

    @NameInMap("CustomHostAlias")
    public String customHostAlias;

    @NameInMap("EdasContainerVersion")
    public String edasContainerVersion;

    @NameInMap("EnableImageAccl")
    public Boolean enableImageAccl;

    @NameInMap("Envs")
    public String envs;

    @NameInMap("ImagePullSecrets")
    public String imagePullSecrets;

    @NameInMap("ImageUrl")
    public String imageUrl;

    @NameInMap("JarStartArgs")
    public String jarStartArgs;

    @NameInMap("JarStartOptions")
    public String jarStartOptions;

    @NameInMap("Jdk")
    public String jdk;

    @NameInMap("MountDesc")
    public String mountDesc;

    @NameInMap("MountHost")
    public String mountHost;

    @NameInMap("NasId")
    public String nasId;

    @NameInMap("OssAkId")
    public String ossAkId;

    @NameInMap("OssAkSecret")
    public String ossAkSecret;

    @NameInMap("OssMountDescs")
    public String ossMountDescs;

    @NameInMap("PackageUrl")
    public String packageUrl;

    @NameInMap("PackageVersion")
    public String packageVersion;

    @NameInMap("Php")
    public String php;

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

    @NameInMap("Python")
    public String python;

    @NameInMap("PythonModules")
    public String pythonModules;

    @NameInMap("RefAppId")
    public String refAppId;

    @NameInMap("Replicas")
    public String replicas;

    @NameInMap("Slice")
    public Boolean slice;

    @NameInMap("SliceEnvs")
    public String sliceEnvs;

    @NameInMap("SlsConfigs")
    public String slsConfigs;

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

    @NameInMap("WarStartOptions")
    public String warStartOptions;

    @NameInMap("WebContainer")
    public String webContainer;

    public static UpdateJobRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateJobRequest self = new UpdateJobRequest();
        return TeaModel.build(map, self);
    }

    public UpdateJobRequest setAcrAssumeRoleArn(String acrAssumeRoleArn) {
        this.acrAssumeRoleArn = acrAssumeRoleArn;
        return this;
    }
    public String getAcrAssumeRoleArn() {
        return this.acrAssumeRoleArn;
    }

    public UpdateJobRequest setAcrInstanceId(String acrInstanceId) {
        this.acrInstanceId = acrInstanceId;
        return this;
    }
    public String getAcrInstanceId() {
        return this.acrInstanceId;
    }

    public UpdateJobRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateJobRequest setBackoffLimit(Long backoffLimit) {
        this.backoffLimit = backoffLimit;
        return this;
    }
    public Long getBackoffLimit() {
        return this.backoffLimit;
    }

    public UpdateJobRequest setCommand(String command) {
        this.command = command;
        return this;
    }
    public String getCommand() {
        return this.command;
    }

    public UpdateJobRequest setCommandArgs(String commandArgs) {
        this.commandArgs = commandArgs;
        return this;
    }
    public String getCommandArgs() {
        return this.commandArgs;
    }

    public UpdateJobRequest setConcurrencyPolicy(String concurrencyPolicy) {
        this.concurrencyPolicy = concurrencyPolicy;
        return this;
    }
    public String getConcurrencyPolicy() {
        return this.concurrencyPolicy;
    }

    public UpdateJobRequest setConfigMapMountDesc(String configMapMountDesc) {
        this.configMapMountDesc = configMapMountDesc;
        return this;
    }
    public String getConfigMapMountDesc() {
        return this.configMapMountDesc;
    }

    public UpdateJobRequest setCustomHostAlias(String customHostAlias) {
        this.customHostAlias = customHostAlias;
        return this;
    }
    public String getCustomHostAlias() {
        return this.customHostAlias;
    }

    public UpdateJobRequest setEdasContainerVersion(String edasContainerVersion) {
        this.edasContainerVersion = edasContainerVersion;
        return this;
    }
    public String getEdasContainerVersion() {
        return this.edasContainerVersion;
    }

    public UpdateJobRequest setEnableImageAccl(Boolean enableImageAccl) {
        this.enableImageAccl = enableImageAccl;
        return this;
    }
    public Boolean getEnableImageAccl() {
        return this.enableImageAccl;
    }

    public UpdateJobRequest setEnvs(String envs) {
        this.envs = envs;
        return this;
    }
    public String getEnvs() {
        return this.envs;
    }

    public UpdateJobRequest setImagePullSecrets(String imagePullSecrets) {
        this.imagePullSecrets = imagePullSecrets;
        return this;
    }
    public String getImagePullSecrets() {
        return this.imagePullSecrets;
    }

    public UpdateJobRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public UpdateJobRequest setJarStartArgs(String jarStartArgs) {
        this.jarStartArgs = jarStartArgs;
        return this;
    }
    public String getJarStartArgs() {
        return this.jarStartArgs;
    }

    public UpdateJobRequest setJarStartOptions(String jarStartOptions) {
        this.jarStartOptions = jarStartOptions;
        return this;
    }
    public String getJarStartOptions() {
        return this.jarStartOptions;
    }

    public UpdateJobRequest setJdk(String jdk) {
        this.jdk = jdk;
        return this;
    }
    public String getJdk() {
        return this.jdk;
    }

    public UpdateJobRequest setMountDesc(String mountDesc) {
        this.mountDesc = mountDesc;
        return this;
    }
    public String getMountDesc() {
        return this.mountDesc;
    }

    public UpdateJobRequest setMountHost(String mountHost) {
        this.mountHost = mountHost;
        return this;
    }
    public String getMountHost() {
        return this.mountHost;
    }

    public UpdateJobRequest setNasId(String nasId) {
        this.nasId = nasId;
        return this;
    }
    public String getNasId() {
        return this.nasId;
    }

    public UpdateJobRequest setOssAkId(String ossAkId) {
        this.ossAkId = ossAkId;
        return this;
    }
    public String getOssAkId() {
        return this.ossAkId;
    }

    public UpdateJobRequest setOssAkSecret(String ossAkSecret) {
        this.ossAkSecret = ossAkSecret;
        return this;
    }
    public String getOssAkSecret() {
        return this.ossAkSecret;
    }

    public UpdateJobRequest setOssMountDescs(String ossMountDescs) {
        this.ossMountDescs = ossMountDescs;
        return this;
    }
    public String getOssMountDescs() {
        return this.ossMountDescs;
    }

    public UpdateJobRequest setPackageUrl(String packageUrl) {
        this.packageUrl = packageUrl;
        return this;
    }
    public String getPackageUrl() {
        return this.packageUrl;
    }

    public UpdateJobRequest setPackageVersion(String packageVersion) {
        this.packageVersion = packageVersion;
        return this;
    }
    public String getPackageVersion() {
        return this.packageVersion;
    }

    public UpdateJobRequest setPhp(String php) {
        this.php = php;
        return this;
    }
    public String getPhp() {
        return this.php;
    }

    public UpdateJobRequest setPhpConfig(String phpConfig) {
        this.phpConfig = phpConfig;
        return this;
    }
    public String getPhpConfig() {
        return this.phpConfig;
    }

    public UpdateJobRequest setPhpConfigLocation(String phpConfigLocation) {
        this.phpConfigLocation = phpConfigLocation;
        return this;
    }
    public String getPhpConfigLocation() {
        return this.phpConfigLocation;
    }

    public UpdateJobRequest setPostStart(String postStart) {
        this.postStart = postStart;
        return this;
    }
    public String getPostStart() {
        return this.postStart;
    }

    public UpdateJobRequest setPreStop(String preStop) {
        this.preStop = preStop;
        return this;
    }
    public String getPreStop() {
        return this.preStop;
    }

    public UpdateJobRequest setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
        return this;
    }
    public String getProgrammingLanguage() {
        return this.programmingLanguage;
    }

    public UpdateJobRequest setPython(String python) {
        this.python = python;
        return this;
    }
    public String getPython() {
        return this.python;
    }

    public UpdateJobRequest setPythonModules(String pythonModules) {
        this.pythonModules = pythonModules;
        return this;
    }
    public String getPythonModules() {
        return this.pythonModules;
    }

    public UpdateJobRequest setRefAppId(String refAppId) {
        this.refAppId = refAppId;
        return this;
    }
    public String getRefAppId() {
        return this.refAppId;
    }

    public UpdateJobRequest setReplicas(String replicas) {
        this.replicas = replicas;
        return this;
    }
    public String getReplicas() {
        return this.replicas;
    }

    public UpdateJobRequest setSlice(Boolean slice) {
        this.slice = slice;
        return this;
    }
    public Boolean getSlice() {
        return this.slice;
    }

    public UpdateJobRequest setSliceEnvs(String sliceEnvs) {
        this.sliceEnvs = sliceEnvs;
        return this;
    }
    public String getSliceEnvs() {
        return this.sliceEnvs;
    }

    public UpdateJobRequest setSlsConfigs(String slsConfigs) {
        this.slsConfigs = slsConfigs;
        return this;
    }
    public String getSlsConfigs() {
        return this.slsConfigs;
    }

    public UpdateJobRequest setTerminationGracePeriodSeconds(Integer terminationGracePeriodSeconds) {
        this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
        return this;
    }
    public Integer getTerminationGracePeriodSeconds() {
        return this.terminationGracePeriodSeconds;
    }

    public UpdateJobRequest setTimeout(Long timeout) {
        this.timeout = timeout;
        return this;
    }
    public Long getTimeout() {
        return this.timeout;
    }

    public UpdateJobRequest setTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }
    public String getTimezone() {
        return this.timezone;
    }

    public UpdateJobRequest setTomcatConfig(String tomcatConfig) {
        this.tomcatConfig = tomcatConfig;
        return this;
    }
    public String getTomcatConfig() {
        return this.tomcatConfig;
    }

    public UpdateJobRequest setTriggerConfig(String triggerConfig) {
        this.triggerConfig = triggerConfig;
        return this;
    }
    public String getTriggerConfig() {
        return this.triggerConfig;
    }

    public UpdateJobRequest setWarStartOptions(String warStartOptions) {
        this.warStartOptions = warStartOptions;
        return this;
    }
    public String getWarStartOptions() {
        return this.warStartOptions;
    }

    public UpdateJobRequest setWebContainer(String webContainer) {
        this.webContainer = webContainer;
        return this;
    }
    public String getWebContainer() {
        return this.webContainer;
    }

}
