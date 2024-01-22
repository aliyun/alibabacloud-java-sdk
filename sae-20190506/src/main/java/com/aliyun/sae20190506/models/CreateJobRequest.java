// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class CreateJobRequest extends TeaModel {
    /**
     * <p>The Alibaba Cloud Resource Name (ARN) required for a RAM role to obtain images across accounts. For more information, see [Grant permissions across Alibaba Cloud accounts by using a RAM role](~~223585~~).</p>
     */
    @NameInMap("AcrAssumeRoleArn")
    public String acrAssumeRoleArn;

    /**
     * <p>The ID of Container Registry Enterprise Edition instance N. This parameter is required when the **ImageUrl** parameter is set to the URL of an image in an ACR Enterprise Edition instance.</p>
     */
    @NameInMap("AcrInstanceId")
    public String acrInstanceId;

    /**
     * <p>The description of the template. The description cannot exceed 1,024 characters in length.</p>
     */
    @NameInMap("AppDescription")
    public String appDescription;

    /**
     * <p>The name of the job template. The name can contain digits, letters, and hyphens (-). The name must start with a letter and cannot exceed 36 characters in length.</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>Specifies whether to automatically configure the network environment. Take note of the following rules:</p>
     * <br>
     * <p>*   **true**: The network environment is automatically configured by SAE when the application is created. In this case, the values of the **NamespaceId**, **VpcId**, **vSwitchId**, and **SecurityGroupId** parameters are ignored.</p>
     * <p>*   **false**: The network environment is manually configured based on your settings when the application is created.</p>
     */
    @NameInMap("AutoConfig")
    public Boolean autoConfig;

    /**
     * <p>The number of times the job is retried.</p>
     */
    @NameInMap("BackoffLimit")
    public Long backoffLimit;

    /**
     * <p>The command that is used to start the image. The command must be an existing executable object in the container. Sample statements:</p>
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
     * <p>The parameters of the image startup command. The CommandArgs parameter specifies the parameters that are required for the **Command** parameter. You can specify the name in one of the following formats:</p>
     * <br>
     * <p>`["a","b"]`</p>
     * <br>
     * <p>In the preceding example, the CommandArgs parameter is set to `CommandArgs=["abc", ">", "file0"]`. The data type of `["abc", ">", "file0"]` must be an array of strings in the JSON format. This parameter is optional.</p>
     */
    @NameInMap("CommandArgs")
    public String commandArgs;

    /**
     * <p>The concurrency policy of the job. Take note of the following rules:</p>
     * <br>
     * <p>*   **Forbid**: Prohibits concurrent running. If the previous job is not completed, no new job is created.</p>
     * <p>*   **Allow**: Allows concurrent running.</p>
     * <p>*   **Replace**: If the previous job is not completed when the time to create a new job is reached, the new job replaces the previous job.</p>
     */
    @NameInMap("ConcurrencyPolicy")
    public String concurrencyPolicy;

    /**
     * <p>The description of the **ConfigMap** instance mounted to the application. Use configurations created on the Configuration Items page to configure containers. The following table describes the parameters that are used in the preceding statements.</p>
     * <br>
     * <p>*   **congfigMapId**: the ID of the ConfigMap instance. You can call the [ListNamespacedConfigMaps](~~176917~~) operation to obtain the ID.</p>
     * <p>*   **key**: the key.</p>
     * <br>
     * <p>> You can use the `sae-sys-configmap-all` key to mount all keys.</p>
     * <br>
     * <p>*   **mountPath**: the mount path in the container.</p>
     */
    @NameInMap("ConfigMapMountDesc")
    public String configMapMountDesc;

    /**
     * <p>The CPU specifications that are required for each instance. Unit: millicores. You cannot set this parameter to 0. Valid values:</p>
     * <br>
     * <p>*   500</p>
     * <p>*   1000</p>
     * <p>*   2000</p>
     * <p>*   4000</p>
     * <p>*   8000</p>
     * <p>*   16000</p>
     * <p>*   32000</p>
     */
    @NameInMap("Cpu")
    public Integer cpu;

    /**
     * <p>The custom mappings between hostnames and IP addresses in the container. Take note of the following rules:</p>
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
     * <p>The environment variables. You can configure custom environment variables or reference a ConfigMap. If you want to reference a ConfigMap, you must first create a ConfigMap. For more information, see [CreateConfigMap](~~176914~~). Take note of the following rules:</p>
     * <br>
     * <p>*   Customize</p>
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
     * <p>The size of memory required by each instance. Unit: MB. You cannot set this parameter to 0. The values of this parameter correspond to the values of the Cpu parameter:</p>
     * <br>
     * <p>*   Set the value to 1024 when Cpu is set to 500 or 1000.</p>
     * <p>*   Set the value to 2048 when Cpu is set to 500, 1000 or 2000.</p>
     * <p>*   Set the value to 4096 when Cpu is set to 1000, 2000, or 4000.</p>
     * <p>*   Set the value to 8192 when Cpu is set to 2000, 4000, or 8000.</p>
     * <p>*   Set the value to 12288 when Cpu is set to 12000.</p>
     * <p>*   Set the value to 16384 when Cpu is set to 4000, 8000, or 16000.</p>
     * <p>*   Set the value to 24576 when Cpu is set to 12000.</p>
     * <p>*   Set the value to 32768 when Cpu is set to 16000.</p>
     * <p>*   Set the value to 65536 when Cpu is set to 8000, 16000, or 32000.</p>
     * <p>*   Set the value to 131072 when Cpu is set to 32000.</p>
     */
    @NameInMap("Memory")
    public Integer memory;

    /**
     * <p>The configurations for mounting the NAS file system. After the application is created, you may want to call other operations to manage the application. If you do not want to change the NAS configurations in these subsequent operations, you can omit the **MountDesc** parameter in the requests. If you want to unmount the NAS file system, you must set the **MountDesc** values in the subsequent requests to an empty string ("").</p>
     */
    @NameInMap("MountDesc")
    public String mountDesc;

    /**
     * <p>The mount target of the NAS file system in the VPC where the application is deployed. If you do not need to modify this configuration during the deployment, configure the **MountHost** parameter only in the first request. You do not need to include this parameter in subsequent requests. If you need to remove this configuration, leave the **MountHost** parameter empty in the request.</p>
     */
    @NameInMap("MountHost")
    public String mountHost;

    /**
     * <p>The ID of the Serverless App Engine (SAE) namespace. The ID can contain only lowercase letters and hyphens (-). It must start with a lowercase letter.</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    /**
     * <p>The ID of the Apsara File Storage NAS file system. After the application is created, you may want to call other operations to manage the application. If you do not want to change the NAS configurations in these subsequent operations, you can omit the **NasId** parameter in the requests. If you want to unmount the NAS file system, you must set the **NasId** values in the subsequent requests to an empty string ("").</p>
     */
    @NameInMap("NasId")
    public String nasId;

    /**
     * <p>The AccessKey ID that is used to read data from and write data to Object Storage Service (OSS) buckets.</p>
     */
    @NameInMap("OssAkId")
    public String ossAkId;

    /**
     * <p>The AccessKey secret that is used to read data from and write data to OSS buckets.</p>
     */
    @NameInMap("OssAkSecret")
    public String ossAkSecret;

    /**
     * <p>Information of the Object Storage Service (OSS) bucket mounted to the application. The following table describes the parameters that are used in the preceding statements.</p>
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
     * <p>The type of the deployment package. Take note of the following rules:</p>
     * <br>
     * <p>*   If you deploy the application by using a Java Archive (JAR) package, you can set this parameter to **FatJar**, **War**, or **Image**.</p>
     * <p>*   If you deploy the application by using a PHP package, you can set this parameter to one of the following values:</p>
     * <br>
     * <p>**PhpZip** **IMAGE_PHP\_5\_4** **IMAGE_PHP\_5\_4\_ALPINE** **IMAGE_PHP\_5\_5** **IMAGE_PHP\_5\_5\_ALPINE** **IMAGE_PHP\_5\_6** **IMAGE_PHP\_5\_6\_ALPINE** **IMAGE_PHP\_7\_0** **IMAGE_PHP\_7\_0\_ALPINE** **IMAGE_PHP\_7\_1** **IMAGE_PHP\_7\_1\_ALPINE** **IMAGE_PHP\_7\_2** **IMAGE_PHP\_7\_2\_ALPINE** **IMAGE_PHP\_7\_3** **IMAGE_PHP\_7\_3\_ALPINE**</p>
     * <br>
     * <p>*   If you deploy the application by using a **Python** package, you can set this parameter to **PythonZip** or **Image**:</p>
     */
    @NameInMap("PackageType")
    public String packageType;

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
     * <p>The script that is run immediately after the container is started. Example: `{"exec":{"command":\["sh","-c","echo hello"\]}}`</p>
     */
    @NameInMap("PostStart")
    public String postStart;

    /**
     * <p>The script that is run before the container is stopped. Example: `{"exec":{"command":\["sh","-c","echo hello"\]}}`</p>
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
    public Integer replicas;

    /**
     * <p>The ID of the security group.</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

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
     * <p>The logging configurations of Log Service.</p>
     * <br>
     * <p>*   To use Log Service resources that are automatically created by SAE, set this parameter to `[{"logDir":"","logType":"stdout"},{"logDir":"/tmp/a.log"}]`.</p>
     * <p>*   To use custom Log Service resources, set this parameter to `[{"projectName":"test-sls","logType":"stdout","logDir":"","logstoreName":"sae","logtailName":""},{"projectName":"test","logDir":"/tmp/a.log","logstoreName":"sae","logtailName":""}]`.</p>
     * <br>
     * <p>The following table describes the parameters that are used in the preceding statements.</p>
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
     * <p>The Tomcat configuration. If you want to cancel this configuration, set this parameter to "" or "{}". The following variables are included in the configuration: Take note of the following rules:</p>
     * <br>
     * <p>*   **port**: the port number. The port number ranges from 1024 to 65535. Though the admin permissions are configured for the container, the root permissions are required to perform operations on ports whose number is smaller than 1024. Enter a value that ranges from 1025 to 65535 because the container has only the admin permissions. If you do not specify this parameter, the default port number 8080 is used.</p>
     * <p>*   **contextPath**: the path. Default value: /. This value indicates the root directory.</p>
     * <p>*   **maxThreads**: the maximum number of connections in the connection pool. Default value: 400.</p>
     * <p>*   **uriEncoding**: the URI encoding scheme in the Tomcat container. Valid values: UTF-8, ISO-8859-1, GBK, and GB2312.************ If you do not specify this parameter, the default value **ISO-8859-1** is used.</p>
     * <p>*   **useBodyEncoding**: specifies whether to use the encoding scheme specified in the request body for URI query parameters. Default value: true.</p>
     */
    @NameInMap("TomcatConfig")
    public String tomcatConfig;

    @NameInMap("TriggerConfig")
    public String triggerConfig;

    /**
     * <p>The vSwitch to which the elastic network interface (ENI) of the application instance is connected. The vSwitch must be located in the VPC specified by the VpcId parameter. The SAE namespace is bound with this vSwitch. The default value is the ID of the vSwitch that is bound to the namespace.</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the virtual private cloud (VPC) that corresponds to the SAE namespace. In SAE, once correspondence is configured between a namespace and a VPC, the namespace cannot correspond to other VPCs. When the SAE application is created within the namespace, the application is bound with the VPC. Multiple namespaces can correspond to the same VPC. The default value is the ID of the VPC that is bound to the namespace.</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The startup command of the WAR package. For information about how to configure the startup command, see [Configure startup commands](~~96677~~).</p>
     */
    @NameInMap("WarStartOptions")
    public String warStartOptions;

    /**
     * <p>The version of the Tomcat container on which the deployment package depends. Valid values:</p>
     * <br>
     * <p>*   **apache-tomcat-7.0.91**</p>
     * <p>*   **apache-tomcat-8.5.42**</p>
     * <br>
     * <p>This parameter is not returned if the **PackageType** parameter is set to **Image**.</p>
     */
    @NameInMap("WebContainer")
    public String webContainer;

    /**
     * <p>Set the value to `job`.</p>
     */
    @NameInMap("Workload")
    public String workload;

    public static CreateJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateJobRequest self = new CreateJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateJobRequest setAcrAssumeRoleArn(String acrAssumeRoleArn) {
        this.acrAssumeRoleArn = acrAssumeRoleArn;
        return this;
    }
    public String getAcrAssumeRoleArn() {
        return this.acrAssumeRoleArn;
    }

    public CreateJobRequest setAcrInstanceId(String acrInstanceId) {
        this.acrInstanceId = acrInstanceId;
        return this;
    }
    public String getAcrInstanceId() {
        return this.acrInstanceId;
    }

    public CreateJobRequest setAppDescription(String appDescription) {
        this.appDescription = appDescription;
        return this;
    }
    public String getAppDescription() {
        return this.appDescription;
    }

    public CreateJobRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateJobRequest setAutoConfig(Boolean autoConfig) {
        this.autoConfig = autoConfig;
        return this;
    }
    public Boolean getAutoConfig() {
        return this.autoConfig;
    }

    public CreateJobRequest setBackoffLimit(Long backoffLimit) {
        this.backoffLimit = backoffLimit;
        return this;
    }
    public Long getBackoffLimit() {
        return this.backoffLimit;
    }

    public CreateJobRequest setCommand(String command) {
        this.command = command;
        return this;
    }
    public String getCommand() {
        return this.command;
    }

    public CreateJobRequest setCommandArgs(String commandArgs) {
        this.commandArgs = commandArgs;
        return this;
    }
    public String getCommandArgs() {
        return this.commandArgs;
    }

    public CreateJobRequest setConcurrencyPolicy(String concurrencyPolicy) {
        this.concurrencyPolicy = concurrencyPolicy;
        return this;
    }
    public String getConcurrencyPolicy() {
        return this.concurrencyPolicy;
    }

    public CreateJobRequest setConfigMapMountDesc(String configMapMountDesc) {
        this.configMapMountDesc = configMapMountDesc;
        return this;
    }
    public String getConfigMapMountDesc() {
        return this.configMapMountDesc;
    }

    public CreateJobRequest setCpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }
    public Integer getCpu() {
        return this.cpu;
    }

    public CreateJobRequest setCustomHostAlias(String customHostAlias) {
        this.customHostAlias = customHostAlias;
        return this;
    }
    public String getCustomHostAlias() {
        return this.customHostAlias;
    }

    public CreateJobRequest setEdasContainerVersion(String edasContainerVersion) {
        this.edasContainerVersion = edasContainerVersion;
        return this;
    }
    public String getEdasContainerVersion() {
        return this.edasContainerVersion;
    }

    public CreateJobRequest setEnableImageAccl(Boolean enableImageAccl) {
        this.enableImageAccl = enableImageAccl;
        return this;
    }
    public Boolean getEnableImageAccl() {
        return this.enableImageAccl;
    }

    public CreateJobRequest setEnvs(String envs) {
        this.envs = envs;
        return this;
    }
    public String getEnvs() {
        return this.envs;
    }

    public CreateJobRequest setImagePullSecrets(String imagePullSecrets) {
        this.imagePullSecrets = imagePullSecrets;
        return this;
    }
    public String getImagePullSecrets() {
        return this.imagePullSecrets;
    }

    public CreateJobRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public CreateJobRequest setJarStartArgs(String jarStartArgs) {
        this.jarStartArgs = jarStartArgs;
        return this;
    }
    public String getJarStartArgs() {
        return this.jarStartArgs;
    }

    public CreateJobRequest setJarStartOptions(String jarStartOptions) {
        this.jarStartOptions = jarStartOptions;
        return this;
    }
    public String getJarStartOptions() {
        return this.jarStartOptions;
    }

    public CreateJobRequest setJdk(String jdk) {
        this.jdk = jdk;
        return this;
    }
    public String getJdk() {
        return this.jdk;
    }

    public CreateJobRequest setMemory(Integer memory) {
        this.memory = memory;
        return this;
    }
    public Integer getMemory() {
        return this.memory;
    }

    public CreateJobRequest setMountDesc(String mountDesc) {
        this.mountDesc = mountDesc;
        return this;
    }
    public String getMountDesc() {
        return this.mountDesc;
    }

    public CreateJobRequest setMountHost(String mountHost) {
        this.mountHost = mountHost;
        return this;
    }
    public String getMountHost() {
        return this.mountHost;
    }

    public CreateJobRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public CreateJobRequest setNasId(String nasId) {
        this.nasId = nasId;
        return this;
    }
    public String getNasId() {
        return this.nasId;
    }

    public CreateJobRequest setOssAkId(String ossAkId) {
        this.ossAkId = ossAkId;
        return this;
    }
    public String getOssAkId() {
        return this.ossAkId;
    }

    public CreateJobRequest setOssAkSecret(String ossAkSecret) {
        this.ossAkSecret = ossAkSecret;
        return this;
    }
    public String getOssAkSecret() {
        return this.ossAkSecret;
    }

    public CreateJobRequest setOssMountDescs(String ossMountDescs) {
        this.ossMountDescs = ossMountDescs;
        return this;
    }
    public String getOssMountDescs() {
        return this.ossMountDescs;
    }

    public CreateJobRequest setPackageType(String packageType) {
        this.packageType = packageType;
        return this;
    }
    public String getPackageType() {
        return this.packageType;
    }

    public CreateJobRequest setPackageUrl(String packageUrl) {
        this.packageUrl = packageUrl;
        return this;
    }
    public String getPackageUrl() {
        return this.packageUrl;
    }

    public CreateJobRequest setPackageVersion(String packageVersion) {
        this.packageVersion = packageVersion;
        return this;
    }
    public String getPackageVersion() {
        return this.packageVersion;
    }

    public CreateJobRequest setPhpConfig(String phpConfig) {
        this.phpConfig = phpConfig;
        return this;
    }
    public String getPhpConfig() {
        return this.phpConfig;
    }

    public CreateJobRequest setPhpConfigLocation(String phpConfigLocation) {
        this.phpConfigLocation = phpConfigLocation;
        return this;
    }
    public String getPhpConfigLocation() {
        return this.phpConfigLocation;
    }

    public CreateJobRequest setPostStart(String postStart) {
        this.postStart = postStart;
        return this;
    }
    public String getPostStart() {
        return this.postStart;
    }

    public CreateJobRequest setPreStop(String preStop) {
        this.preStop = preStop;
        return this;
    }
    public String getPreStop() {
        return this.preStop;
    }

    public CreateJobRequest setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
        return this;
    }
    public String getProgrammingLanguage() {
        return this.programmingLanguage;
    }

    public CreateJobRequest setPython(String python) {
        this.python = python;
        return this;
    }
    public String getPython() {
        return this.python;
    }

    public CreateJobRequest setPythonModules(String pythonModules) {
        this.pythonModules = pythonModules;
        return this;
    }
    public String getPythonModules() {
        return this.pythonModules;
    }

    public CreateJobRequest setRefAppId(String refAppId) {
        this.refAppId = refAppId;
        return this;
    }
    public String getRefAppId() {
        return this.refAppId;
    }

    public CreateJobRequest setReplicas(Integer replicas) {
        this.replicas = replicas;
        return this;
    }
    public Integer getReplicas() {
        return this.replicas;
    }

    public CreateJobRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public CreateJobRequest setSlice(Boolean slice) {
        this.slice = slice;
        return this;
    }
    public Boolean getSlice() {
        return this.slice;
    }

    public CreateJobRequest setSliceEnvs(String sliceEnvs) {
        this.sliceEnvs = sliceEnvs;
        return this;
    }
    public String getSliceEnvs() {
        return this.sliceEnvs;
    }

    public CreateJobRequest setSlsConfigs(String slsConfigs) {
        this.slsConfigs = slsConfigs;
        return this;
    }
    public String getSlsConfigs() {
        return this.slsConfigs;
    }

    public CreateJobRequest setTerminationGracePeriodSeconds(Integer terminationGracePeriodSeconds) {
        this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
        return this;
    }
    public Integer getTerminationGracePeriodSeconds() {
        return this.terminationGracePeriodSeconds;
    }

    public CreateJobRequest setTimeout(Long timeout) {
        this.timeout = timeout;
        return this;
    }
    public Long getTimeout() {
        return this.timeout;
    }

    public CreateJobRequest setTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }
    public String getTimezone() {
        return this.timezone;
    }

    public CreateJobRequest setTomcatConfig(String tomcatConfig) {
        this.tomcatConfig = tomcatConfig;
        return this;
    }
    public String getTomcatConfig() {
        return this.tomcatConfig;
    }

    public CreateJobRequest setTriggerConfig(String triggerConfig) {
        this.triggerConfig = triggerConfig;
        return this;
    }
    public String getTriggerConfig() {
        return this.triggerConfig;
    }

    public CreateJobRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateJobRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateJobRequest setWarStartOptions(String warStartOptions) {
        this.warStartOptions = warStartOptions;
        return this;
    }
    public String getWarStartOptions() {
        return this.warStartOptions;
    }

    public CreateJobRequest setWebContainer(String webContainer) {
        this.webContainer = webContainer;
        return this;
    }
    public String getWebContainer() {
        return this.webContainer;
    }

    public CreateJobRequest setWorkload(String workload) {
        this.workload = workload;
        return this;
    }
    public String getWorkload() {
        return this.workload;
    }

}
