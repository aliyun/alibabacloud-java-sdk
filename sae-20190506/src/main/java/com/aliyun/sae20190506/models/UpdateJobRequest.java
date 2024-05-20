// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpdateJobRequest extends TeaModel {
    /**
     * <p>The Alibaba Cloud Resource Name (ARN) of the RAM role that is used to pull images across accounts. For more information, see [Grant permissions across Alibaba Cloud accounts by using a RAM role](https://help.aliyun.com/document_detail/223585.html).</p>
     */
    @NameInMap("AcrAssumeRoleArn")
    public String acrAssumeRoleArn;

    /**
     * <p>The ID of Container Registry Enterprise Edition instance N. This parameter is required when the **ImageUrl** parameter is set to the URL of an image in an ACR Enterprise Edition instance.</p>
     */
    @NameInMap("AcrInstanceId")
    public String acrInstanceId;

    /**
     * <p>The ID of the application.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The number of times the job is retried.</p>
     */
    @NameInMap("BackoffLimit")
    public Long backoffLimit;

    /**
     * <p>The command that is used to start the image. The command must be an existing executable object in the container. Example:</p>
     * <br>
     * <p>    command:</p>
     * <p>          - echo</p>
     * <p>          - abc</p>
     * <p>          - ></p>
     * <p>          - file0</p>
     * <br>
     * <p>In this example, the Command parameter is set to `Command="echo", CommandArgs=["abc", ">", "file0"]`.</p>
     */
    @NameInMap("Command")
    public String command;

    /**
     * <p>The parameters of the image startup command. The CommandArgs parameter specifies the parameters that are required for the **Command** parameter. The name must meet the following format requirements:</p>
     * <br>
     * <p>`["a","b"]`</p>
     * <br>
     * <p>In the preceding example, the CommandArgs parameter is set to `CommandArgs=["abc", ">", "file0"]`. The data type of `["abc", ">", "file0"]` must be an array of strings in the JSON format. This parameter is optional.</p>
     */
    @NameInMap("CommandArgs")
    public String commandArgs;

    /**
     * <p>The concurrency policy of the job. Valid values:</p>
     * <br>
     * <p>*   **Forbid**: Prohibits concurrent running. If the previous job is not completed, no new job is created.</p>
     * <p>*   **Allow**: Allows concurrent running.</p>
     * <p>*   **Replace**: If the previous job is not completed when the time to create a new job is reached, the new job replaces the previous job.</p>
     */
    @NameInMap("ConcurrencyPolicy")
    public String concurrencyPolicy;

    /**
     * <p>The description of the **ConfigMap** instance mounted to the application. Use configurations created on the Configuration Items page to configure containers. The following parameters are involved:</p>
     * <br>
     * <p>*   **congfigMapId**: the ID of the ConfigMap instance. You can call the [ListNamespacedConfigMaps](https://help.aliyun.com/document_detail/176917.html) operation to obtain the ID.</p>
     * <p>*   **key**: the key.</p>
     * <br>
     * <p>> You can use the `sae-sys-configmap-all` key to mount all keys.</p>
     * <br>
     * <p>*   **mountPath**: the mount path.</p>
     */
    @NameInMap("ConfigMapMountDesc")
    public String configMapMountDesc;

    /**
     * <p>The custom mappings between hostnames and IP addresses in the container. Valid values:</p>
     * <br>
     * <p>*   **hostName**: the domain name or hostname.</p>
     * <p>*   **ip**: the IP address.</p>
     */
    @NameInMap("CustomHostAlias")
    public String customHostAlias;

    /**
     * <p>The version of the container, such as Ali-Tomcat, in which an application developed based on High-speed Service Framework (HSF) is deployed.</p>
     */
    @NameInMap("EdasContainerVersion")
    public String edasContainerVersion;

    @NameInMap("EnableImageAccl")
    public Boolean enableImageAccl;

    /**
     * <p>The environment variables. You can configure custom environment variables or reference a ConfigMap. If you want to reference a ConfigMap, you must first create a ConfigMap. For more information, see [CreateConfigMap](https://help.aliyun.com/document_detail/176914.html). Valid values:</p>
     * <br>
     * <p>*   Configure custom environment variables</p>
     * <br>
     * <p>    *   **name**: the name of the environment variable.</p>
     * <p>    *   **value**: the value of the environment variable.</p>
     * <br>
     * <p>*   Reference ConfigMap</p>
     * <br>
     * <p>    *   **name**: the name of the environment variable. You can reference one or all keys. If you want to reference all keys, specify `sae-sys-configmap-all-<ConfigMap name>`. Example: `sae-sys-configmap-all-test1`.</p>
     * <p>    *   **valueFrom**: the reference of the environment variable. Set the value to `configMapRef`.</p>
     * <p>    *   **configMapId**: the ConfigMap ID.</p>
     * <p>    *   **key**: the key. If you want to reference all keys, do not configure this parameter.</p>
     */
    @NameInMap("Envs")
    public String envs;

    /**
     * <p>The ID of the corresponding Secret.</p>
     */
    @NameInMap("ImagePullSecrets")
    public String imagePullSecrets;

    /**
     * <p>The URL of the image. This parameter is returned only if the **PackageType** parameter is set to **Image**.</p>
     */
    @NameInMap("ImageUrl")
    public String imageUrl;

    /**
     * <p>The arguments in the JAR package. The arguments are used to start the application container. The default startup command is `$JAVA_HOME/bin/java $JarStartOptions -jar $CATALINA_OPTS "$package_path" $JarStartArgs`.</p>
     */
    @NameInMap("JarStartArgs")
    public String jarStartArgs;

    /**
     * <p>The option settings in the JAR package. The settings are used to start the application container. The default startup command for application deployment is `$JAVA_HOME/bin/java $JarStartOptions -jar $CATALINA_OPTS "$package_path" $JarStartArgs`.</p>
     */
    @NameInMap("JarStartOptions")
    public String jarStartOptions;

    /**
     * <p>The version of the Java development kit (JDK) on which the deployment package of the application depends. The following versions are supported:</p>
     * <br>
     * <p>*   **Open JDK 8**</p>
     * <p>*   **Open JDK 7**</p>
     * <p>*   **Dragonwell 11**</p>
     * <p>*   **Dragonwell 8**</p>
     * <p>*   **openjdk-8u191-jdk-alpine3.9**</p>
     * <p>*   **openjdk-7u201-jdk-alpine3.9**</p>
     * <br>
     * <p>This parameter is not returned if the **PackageType** parameter is set to **Image**.</p>
     */
    @NameInMap("Jdk")
    public String jdk;

    /**
     * <p>The configurations for mounting the NAS file system. If you do not need to modify the NAS configurations when you deploy the application, configure **MountDesc** only in the first request. If you no longer need to use NAS, leave **MountDesc** empty in the request.</p>
     */
    @NameInMap("MountDesc")
    public String mountDesc;

    /**
     * <p>The mount target of the NAS file system in the VPC where the application is deployed. If you do not need to modify this configuration during the deployment, configure the **MountHost** parameter only in the first request. You do not need to include this parameter in subsequent requests. If you need to remove this configuration, leave the **MountHost** parameter empty in the request.</p>
     */
    @NameInMap("MountHost")
    public String mountHost;

    /**
     * <p>The ID of the Apsara File Storage NAS file system. If you do not need to modify the NAS configurations when you deploy the application, configure **NasId** only in the first request. If you no longer need to use NAS, leave **NasId** empty in the request.</p>
     */
    @NameInMap("NasId")
    public String nasId;

    /**
     * <p>The AccessKey ID that is used to read data from and write data to OSS.</p>
     */
    @NameInMap("OssAkId")
    public String ossAkId;

    /**
     * <p>The AccessKey secret that is used to read data from and write data to OSS.</p>
     */
    @NameInMap("OssAkSecret")
    public String ossAkSecret;

    /**
     * <p>The information about the mounted Object Storage Service (OSS) bucket. The following parameters are involved:</p>
     * <br>
     * <p>*   **bucketName**: the name of the OSS bucket.</p>
     * <br>
     * <p>*   **bucketPath**: the directory or object in OSS. If the specified directory or object does not exist, an error is returned.</p>
     * <br>
     * <p>*   **mountPath**: the directory of the container in SAE. If the path already exists, the newly specified path overwrites the previous one. If the path does not exist, it is created.</p>
     * <br>
     * <p>*   **readOnly**: specifies whether to only allow the container path to read data from the OSS directory. Valid values:</p>
     * <br>
     * <p>    *   **true**: The container path only has read permission on the OSS directory.</p>
     * <p>    *   **false**: The application has read and write permissions.</p>
     */
    @NameInMap("OssMountDescs")
    public String ossMountDescs;

    /**
     * <p>The address of the deployment package. This parameter is required if you set **PackageType** to **FatJar**, **War**, or **PythonZip**.</p>
     */
    @NameInMap("PackageUrl")
    public String packageUrl;

    /**
     * <p>The version of the deployment package. This parameter is required if you set **PackageType** to **FatJar**, **War**, or **PythonZip**.</p>
     */
    @NameInMap("PackageVersion")
    public String packageVersion;

    /**
     * <p>The ID of Container Registry Enterprise Edition instance N.</p>
     */
    @NameInMap("Php")
    public String php;

    /**
     * <p>The details of the PHP configuration file.</p>
     */
    @NameInMap("PhpConfig")
    public String phpConfig;

    /**
     * <p>The path on which the PHP configuration file for application startup is mounted. Make sure that the PHP server uses this configuration file during the startup.</p>
     */
    @NameInMap("PhpConfigLocation")
    public String phpConfigLocation;

    /**
     * <p>The script to be run after the container is started. Example: `{"exec":{"command":["sh","-c","echo hello"\\]}}`</p>
     */
    @NameInMap("PostStart")
    public String postStart;

    /**
     * <p>The script that is run before the container is stopped. Example: `{"exec":{"command":["sh","-c","echo hello"\\]}}`</p>
     */
    @NameInMap("PreStop")
    public String preStop;

    /**
     * <p>The programming language. Valid values: **java**, **php**, **python**, and **shell**.</p>
     */
    @NameInMap("ProgrammingLanguage")
    public String programmingLanguage;

    /**
     * <p>The Python environment. Set the value to **PYTHON 3.9.15**.</p>
     */
    @NameInMap("Python")
    public String python;

    /**
     * <p>The configurations for installing custom module dependencies. By default, the dependencies defined by the requirements.txt file in the root directory are installed. If the package does not contain this file and you do not configure custom dependencies in the package, specify the dependencies that you want to install in the text box.</p>
     */
    @NameInMap("PythonModules")
    public String pythonModules;

    /**
     * <p>The ID of the job that you reference.</p>
     */
    @NameInMap("RefAppId")
    public String refAppId;

    /**
     * <p>The number of concurrent instances.</p>
     */
    @NameInMap("Replicas")
    public String replicas;

    /**
     * <p>Specifies whether to enable job sharding.</p>
     */
    @NameInMap("Slice")
    public Boolean slice;

    /**
     * <p>The parameters of job sharding.</p>
     */
    @NameInMap("SliceEnvs")
    public String sliceEnvs;

    /**
     * <p>The configurations of Log Service.</p>
     * <br>
     * <p>*   To use Log Service resources that are automatically created by SAE, set this parameter to `[{"logDir":"","logType":"stdout"},{"logDir":"/tmp/a.log"}]`.</p>
     * <p>*   To use custom Log Service resources, set this parameter to `[{"projectName":"test-sls","logType":"stdout","logDir":"","logstoreName":"sae","logtailName":""},{"projectName":"test","logDir":"/tmp/a.log","logstoreName":"sae","logtailName":""}]`.</p>
     * <br>
     * <p>The following parameters are involved:</p>
     * <br>
     * <p>*   **projectName**: the name of the Log Service project.</p>
     * <p>*   **logDir**: the path in which logs are stored.</p>
     * <p>*   **logType**: the log type. **stdout**: the standard output log of the container. You can specify only one stdout value for this parameter. If you leave this parameter empty, file logs are collected.</p>
     * <p>*   **logstoreName**: the name of the Logstore in Log Service.</p>
     * <p>*   **logtailName**: the name of the Logtail configuration in Log Service. If you do not configure this parameter, a new Logtail configuration is created.</p>
     * <br>
     * <p>If you do not need to modify the logging configurations when you deploy the application, configure the **SlsConfigs** parameter only in the first request. You do not need to include this parameter in subsequent requests. If you no longer need to use Log Service, leave the **SlsConfigs** parameter empty in the request.</p>
     * <br>
     * <p>> A Log Service project that is automatically created by SAE when you create an application is deleted when the application is deleted. Therefore, when you create an application, you cannot select a Log Service project that is automatically created by SAE for log collection.</p>
     */
    @NameInMap("SlsConfigs")
    public String slsConfigs;

    /**
     * <p>The timeout period for a graceful shutdown. Default value: 30. Unit: seconds. Valid values: 1 to 300.</p>
     */
    @NameInMap("TerminationGracePeriodSeconds")
    public Integer terminationGracePeriodSeconds;

    /**
     * <p>The timeout period. Unit: seconds.</p>
     */
    @NameInMap("Timeout")
    public Long timeout;

    /**
     * <p>The time zone. Default value: **Asia/Shanghai**.</p>
     */
    @NameInMap("Timezone")
    public String timezone;

    /**
     * <p>The Tomcat configuration. If you want to delete the configuration, set this parameter to {} or leave this parameter empty. Valid values:</p>
     * <br>
     * <p>*   **port**: the port number. The port number ranges from 1024 to 65535. Though the admin permissions are configured for the container, the root permissions are required to perform operations on ports whose number is smaller than 1024. Enter a value that ranges from 1025 to 65535 because the container has only the admin permissions. If you do not specify this parameter, the default port number 8080 is used.</p>
     * <p>*   **contextPath**: the path. Default value: /. This value indicates the root directory.</p>
     * <p>*   **maxThreads**: the maximum number of connections in the connection pool. Default value: 400.</p>
     * <p>*   **uriEncoding**: the URI encoding scheme in the Tomcat container. Valid values: **UTF-8**, **ISO-8859-1**, **GBK**, and GB2312. If you do not specify this parameter, the default value **ISO-8859-1** is used.</p>
     * <p>*   **useBodyEncoding**: specifies whether to use the encoding scheme that is specified by **BodyEncoding for URL**. Default value: **true**.</p>
     */
    @NameInMap("TomcatConfig")
    public String tomcatConfig;

    @NameInMap("TriggerConfig")
    public String triggerConfig;

    /**
     * <p>The startup command of the WAR package. For information about how to configure the startup command, see [Configure startup commands](https://help.aliyun.com/document_detail/96677.html).</p>
     */
    @NameInMap("WarStartOptions")
    public String warStartOptions;

    /**
     * <p>The version of the Tomcat container on which the deployment package depends. The following versions are supported:</p>
     * <br>
     * <p>*   **apache-tomcat-7.0.91**</p>
     * <p>*   **apache-tomcat-8.5.42**</p>
     * <br>
     * <p>This parameter is not returned if the **PackageType** parameter is set to **Image**.</p>
     */
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
