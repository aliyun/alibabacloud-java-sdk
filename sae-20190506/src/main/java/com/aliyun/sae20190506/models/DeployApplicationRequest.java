// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DeployApplicationRequest extends TeaModel {
    /**
     * <p>The Alibaba Cloud Resource Name (ARN) required for a RAM role to obtain images across accounts. For more information, see [Grant permissions across Alibaba Cloud accounts by using a RAM role](https://help.aliyun.com/document_detail/223585.html).</p>
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
     * <p>Specifies whether to associate an EIP with the node pool. Take note of the following rules:</p>
     * <br>
     * <p>*   **true**: The EIP is associated with the application instance.</p>
     * <p>*   **false**: The EIP is not associated with the application instance.</p>
     */
    @NameInMap("AssociateEip")
    public Boolean associateEip;

    /**
     * <p>Specifies whether to automatically enable an auto scaling policy for the application. Take note of the following rules:</p>
     * <br>
     * <p>*   **true**: turns on Logon-free Sharing</p>
     * <p>*   **false**: turns off Logon-free Sharing</p>
     */
    @NameInMap("AutoEnableApplicationScalingRule")
    public Boolean autoEnableApplicationScalingRule;

    /**
     * <p>The interval between batches during a batch release. Unit: minutes.</p>
     */
    @NameInMap("BatchWaitTime")
    public Integer batchWaitTime;

    /**
     * <p>The description of the change order.</p>
     */
    @NameInMap("ChangeOrderDesc")
    public String changeOrderDesc;

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
     * <p>The description of the **ConfigMap** instance mounted to the application. Use configurations created on the Configuration Items page to configure containers. The following table describes the parameters that are used in the preceding statements.</p>
     * <br>
     * <p>*   **congfigMapId**: the ID of the ConfigMap instance. You can call the [ListNamespacedConfigMaps](https://help.aliyun.com/document_detail/176917.html) operation to obtain the ID.</p>
     * <p>*   **key**: the key.</p>
     * <br>
     * <p>> You can use `sae-sys-configmap-all` to mount all keys.</p>
     * <br>
     * <p>*   **mountPath**: the mount path in the container.</p>
     */
    @NameInMap("ConfigMapMountDesc")
    public String configMapMountDesc;

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
     * <p>This parameter takes effect only for applications that are in the Stopped state. If you call the **DeployApplication** operation to manage a running application, the application is immediately redeployed.</p>
     * <br>
     * <p>*   **true** (default): specifies that the system immediately deploys the application, enables new configurations, and pulls application instances.</p>
     * <p>*   **false**: specifies that the system only enables the new configurations.</p>
     */
    @NameInMap("Deploy")
    public String deploy;

    /**
     * <p>The version of the container, such as Ali-Tomcat, in which an application developed based on High-speed Service Framework (HSF) is deployed.</p>
     */
    @NameInMap("EdasContainerVersion")
    public String edasContainerVersion;

    /**
     * <p>Indicates whether access to Application High Availability Service (AHAS) is enabled. Take note of the following rules:</p>
     * <br>
     * <p>*   **true**: Access to AHAS is enabled.</p>
     * <p>*   **false**: Access to AHAS is disabled.</p>
     */
    @NameInMap("EnableAhas")
    public String enableAhas;

    /**
     * <p>Indicates whether canary release rules are enabled. Canary release rules apply only to applications in Spring Cloud and Dubbo frameworks. Take note of the following rules:</p>
     * <br>
     * <p>*   **true**: The canary release rules are enabled.</p>
     * <p>*   **false**: The canary release rules are disabled.</p>
     */
    @NameInMap("EnableGreyTagRoute")
    public Boolean enableGreyTagRoute;

    /**
     * <p>The environment variables. You can configure custom environment variables or reference a ConfigMap. If you want to reference a ConfigMap, you must first create a ConfigMap. For more information, see [CreateConfigMap](https://help.aliyun.com/document_detail/176914.html). Take note of the following rules:</p>
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
     * <p>The logging configurations of Message Queue for Apache Kafka. Take note of the following rules:</p>
     * <br>
     * <p>*   **kafkaEndpoint**: the endpoint of the Message Queue for Apache Kafka API.</p>
     * <p>*   **kafkaInstanceId**: the ID of the Message Queue for Apache Kafka instance.</p>
     * <p>*   **kafkaConfigs**: One or more logging configurations of Message Queue for Apache Kafka. For information about sample values and parameters, see the request parameter **KafkaLogfileConfig** in this topic.</p>
     */
    @NameInMap("KafkaConfigs")
    public String kafkaConfigs;

    /**
     * <p>The details of the availability check that was performed on the container. If the container fails this health check multiple times, the system disables and restarts the container. You can use one of the following methods to perform the health check:</p>
     * <br>
     * <p>*   Example of **exec**: `{"exec":{"command":["sh","-c","cat/home/admin/start.sh"]},"initialDelaySeconds":30,"periodSeconds":30,"timeoutSeconds":2}`</p>
     * <p>*   Sample code of the **httpGet** method: `{"httpGet":{"path":"/","port":18091,"scheme":"HTTP","isContainKeyWord":true,"keyWord":"SAE"},"initialDelaySeconds":11,"periodSeconds":10,"timeoutSeconds":1}`</p>
     * <p>*   Sample code of the **tcpSocket** method: `{"tcpSocket":{"port":18091},"initialDelaySeconds":11,"periodSeconds":10,"timeoutSeconds":1}`</p>
     * <br>
     * <p>> You can use only one method to perform the health check.</p>
     * <br>
     * <p>The following table describes the parameters that are used in the preceding statements.</p>
     * <br>
     * <p>*   **exec.command**: the health check command.</p>
     * <p>*   **httpGet.path**: the request path.</p>
     * <p>*   **httpGet.scheme**: the protocol that is used to perform the health check. Valid values: **HTTP** and **HTTPS**.</p>
     * <p>*   **httpGet.isContainKeyWord**: indicates whether the response contains keywords. Valid values: **true** and **false**. If this field is not returned, the advanced settings are not used.</p>
     * <p>*   **httpGet.keyWord**: the custom keyword. This parameter is available only if the **isContainKeyWord** field is returned.</p>
     * <p>*   **tcpSocket.port**: the port that is used to check the status of TCP connections.</p>
     * <p>*   **initialDelaySeconds**: the delay of the health check. Default value: 10. Unit: seconds.</p>
     * <p>*   **periodSeconds**: the interval at which health checks are performed. Default value: 30. Unit: seconds.</p>
     * <p>*   **timeoutSeconds**: the timeout period of the health check. Default value: 1. Unit: seconds. If you set this parameter to 0 or leave this parameter empty, the timeout period is automatically set to 1 second.</p>
     */
    @NameInMap("Liveness")
    public String liveness;

    @NameInMap("Memory")
    public Integer memory;

    /**
     * <p>The Nacos registry. Valid values:</p>
     * <br>
     * <p>*   **0**: SAE built-in Nacos registry</p>
     * <p>*   **1**: self-managed Nacos registry</p>
     * <p>*   **2** : MSE Nacos registry</p>
     */
    @NameInMap("MicroRegistration")
    public String microRegistration;

    /**
     * <p>The percentage of the minimum number of available instances. Take note of the following rules:</p>
     * <br>
     * <p>*   If you set the value to **-1**, the minimum number of available instances is not determined based on this parameter. Default value: -1.</p>
     * <p>*   If you set the value to a number **from 0 to 100**, the minimum number of available instances is calculated by using the following formula: Current number of instances × (Value of MinReadyInstanceRatio × 100%). The value is the nearest integer rounded up from the calculated result. For example, if the percentage is set to **50**% and five instances are available, the minimum number of available instances is 3.</p>
     * <br>
     * <p>> When both **MinReadyInstance** and **MinReadyInstanceRatio** are specified and **MinReadyInstanceRatio** is set to a number from 0 to 100, the value of **MinReadyInstanceRatio**** takes precedence. For example, if **MinReadyInstances** is set to **5, and **MinReadyInstanceRatio** is set to **50**, the minimum number of available instances is set to the nearest integer rounded up from the calculated result of the following formula: Current number of instances × **50%**.</p>
     */
    @NameInMap("MinReadyInstanceRatio")
    public Integer minReadyInstanceRatio;

    /**
     * <p>The minimum number of available instances. Special values:</p>
     * <br>
     * <p>*   If you set the value to **0**, business interruptions occur when the application is updated.</p>
     * <p>*   If you set the value to \\*\\*-1\\*\\*, the minimum number of available instances is automatically set to a system-recommended value. The value is the nearest integer to which the calculated result of the following formula is rounded up: Current number of instances × 25%. For example, if five instances are available, the minimum number of available instances is calculated by using the following formula: 5 × 25% = 1.25. In this case, the minimum number of available instances is 2.</p>
     * <br>
     * <p>> Make sure that at least one instance is available during application deployment and rollback to prevent business interruptions.</p>
     */
    @NameInMap("MinReadyInstances")
    public Integer minReadyInstances;

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
     * <p>The configurations of mounting the NAS file system. Take note of the following rules:</p>
     * <br>
     * <p>*   **mountPath**: the mount path of the container.</p>
     * <p>*   **readOnly**: If you set the value to **false**, the application has the read and write permissions.</p>
     * <p>*   **nasId**: the ID of the NAS file system.</p>
     * <p>*   **mountDomain**: the domain name of the mount target. For more information, see [DescribeMountTargets](https://help.aliyun.com/document_detail/62626.html).</p>
     * <p>*   **nasPath**: the directory in the NAS file system.</p>
     */
    @NameInMap("NasConfigs")
    public String nasConfigs;

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

    @NameInMap("PackageType")
    public String packageType;

    /**
     * <p>The address of the deployment package. This parameter is required when the **PackageType** parameter is set to **FatJar**, **War**, or **PythonZip**.</p>
     */
    @NameInMap("PackageUrl")
    public String packageUrl;

    /**
     * <p>The version of the deployment package. This parameter is required when the **PackageType** parameter is set to **FatJar**, **War**, or **PythonZip**.</p>
     */
    @NameInMap("PackageVersion")
    public String packageVersion;

    @NameInMap("Php")
    public String php;

    /**
     * <p>The path on which the PHP configuration file for application monitoring is mounted. Make sure that the PHP server loads the configuration file. SAE automatically generates the corresponding configuration file. No manual operations are required.</p>
     */
    @NameInMap("PhpArmsConfigLocation")
    public String phpArmsConfigLocation;

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
     * <p>The script that is run immediately after the container is started. Example: `{"exec":{"command":["sh","-c","echo hello"\\]}}`</p>
     */
    @NameInMap("PostStart")
    public String postStart;

    /**
     * <p>The script that is run before the container is stopped. Example: `{"exec":{"command":["sh","-c","echo hello"\\]}}`</p>
     */
    @NameInMap("PreStop")
    public String preStop;

    /**
     * <p>The configurations of Kubernetes Service-based service registration and discovery. Take note of the following rules:</p>
     * <br>
     * <p>*   **serviceName**: the name of the Alibaba Cloud service. Format: `<Custom content>-<Namespace ID>`. `-<Namespace ID>` is automatically specified based on the namespace in which an application resides and cannot be changed. For example, if you select the default namespace in the China (Beijing) region, `-cn-beijing-default` is automatically specified.</p>
     * <p>*   **namespaceId**: the namespace ID.</p>
     * <p>*   **portAndProtocol**: the port number and protocol. Valid values of the port number: 1 to 65535. Valid values of the protocol: **TCP** and **UDP**.</p>
     * <p>*   **enable**: enables the Kubernetes Service-based registration and discovery feature.</p>
     */
    @NameInMap("PvtzDiscoverySvc")
    public String pvtzDiscoverySvc;

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
     * <p>The details of the health check that was performed on the container. If the container fails this health check multiple times, the system disables and restarts the container. Containers that fail health checks cannot receive traffic from Server Load Balancer (SLB) instances. You can use the **exec**, **httpGet**, or **tcpSocket** method to perform health checks. For more information, see the description of the **Liveness** parameter.</p>
     * <br>
     * <p>> You can use only one method to perform the health check.</p>
     */
    @NameInMap("Readiness")
    public String readiness;

    @NameInMap("Replicas")
    public Integer replicas;

    @NameInMap("SecurityGroupId")
    public String securityGroupId;

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

    /**
     * <p>The deployment policy. If the minimum number of available instances is 1, the value of the **UpdateStrategy** parameter is an empty string (""). If the minimum number of available instances is greater than 1, the following strategies can be configured:</p>
     * <br>
     * <p>*   The application is deployed on an instance. The remaining instances are automatically classified into two release batches whose interval is set to 1. In this case, the parameter is set to `{"type":"GrayBatchUpdate","batchUpdate":{"batch":2,"releaseType":"auto","batchWaitTime":1},"grayUpdate":{"gray":1}}`.</p>
     * <p>*   The application is deployed on an instance. The remaining instances are manually classified into two release batches. In this case, the parameter is set to `{"type":"GrayBatchUpdate","batchUpdate":{"batch":2,"releaseType":"manual"},"grayUpdate":{"gray":1}}`.</p>
     * <p>*   All instances are automatically classified into two release batches. The application is deployed on the instances of the two batches in parallel. In this case, the parameter is set to `{"type":"BatchUpdate","batchUpdate":{"batch":2,"releaseType":"auto","batchWaitTime":0}}`</p>
     * <br>
     * <p>The following table describes the parameters that are used in the preceding statements.</p>
     * <br>
     * <p>*   **type**: the type of the release policy. Valid values: **GrayBatchUpdate** and **BatchUpdate**.</p>
     * <br>
     * <p>*   **batchUpdate**: the phased release policy.</p>
     * <br>
     * <p>    *   **batch**: the number of release batches.</p>
     * <p>    *   **releaseType**: the processing method for the batches. Valid values: **auto** and **manual**.</p>
     * <p>    *   **batchWaitTime**: the interval between release batches. Unit: seconds.</p>
     * <br>
     * <p>*   **grayUpdate**: the number of release batches in the phased release after a canary release. This parameter is returned only if the **type** parameter is set to **GrayBatchUpdate**.</p>
     */
    @NameInMap("UpdateStrategy")
    public String updateStrategy;

    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The startup command of the WAR package. For information about how to configure the startup command, see [Configure startup commands](https://help.aliyun.com/document_detail/96677.html).</p>
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

    public DeployApplicationRequest setCpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }
    public Integer getCpu() {
        return this.cpu;
    }

    public DeployApplicationRequest setCustomHostAlias(String customHostAlias) {
        this.customHostAlias = customHostAlias;
        return this;
    }
    public String getCustomHostAlias() {
        return this.customHostAlias;
    }

    public DeployApplicationRequest setDeploy(String deploy) {
        this.deploy = deploy;
        return this;
    }
    public String getDeploy() {
        return this.deploy;
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

    public DeployApplicationRequest setImagePullSecrets(String imagePullSecrets) {
        this.imagePullSecrets = imagePullSecrets;
        return this;
    }
    public String getImagePullSecrets() {
        return this.imagePullSecrets;
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

    public DeployApplicationRequest setKafkaConfigs(String kafkaConfigs) {
        this.kafkaConfigs = kafkaConfigs;
        return this;
    }
    public String getKafkaConfigs() {
        return this.kafkaConfigs;
    }

    public DeployApplicationRequest setLiveness(String liveness) {
        this.liveness = liveness;
        return this;
    }
    public String getLiveness() {
        return this.liveness;
    }

    public DeployApplicationRequest setMemory(Integer memory) {
        this.memory = memory;
        return this;
    }
    public Integer getMemory() {
        return this.memory;
    }

    public DeployApplicationRequest setMicroRegistration(String microRegistration) {
        this.microRegistration = microRegistration;
        return this;
    }
    public String getMicroRegistration() {
        return this.microRegistration;
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

    public DeployApplicationRequest setNasConfigs(String nasConfigs) {
        this.nasConfigs = nasConfigs;
        return this;
    }
    public String getNasConfigs() {
        return this.nasConfigs;
    }

    public DeployApplicationRequest setNasId(String nasId) {
        this.nasId = nasId;
        return this;
    }
    public String getNasId() {
        return this.nasId;
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

    public DeployApplicationRequest setPackageType(String packageType) {
        this.packageType = packageType;
        return this;
    }
    public String getPackageType() {
        return this.packageType;
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

    public DeployApplicationRequest setPhp(String php) {
        this.php = php;
        return this;
    }
    public String getPhp() {
        return this.php;
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

    public DeployApplicationRequest setPvtzDiscoverySvc(String pvtzDiscoverySvc) {
        this.pvtzDiscoverySvc = pvtzDiscoverySvc;
        return this;
    }
    public String getPvtzDiscoverySvc() {
        return this.pvtzDiscoverySvc;
    }

    public DeployApplicationRequest setPython(String python) {
        this.python = python;
        return this;
    }
    public String getPython() {
        return this.python;
    }

    public DeployApplicationRequest setPythonModules(String pythonModules) {
        this.pythonModules = pythonModules;
        return this;
    }
    public String getPythonModules() {
        return this.pythonModules;
    }

    public DeployApplicationRequest setReadiness(String readiness) {
        this.readiness = readiness;
        return this;
    }
    public String getReadiness() {
        return this.readiness;
    }

    public DeployApplicationRequest setReplicas(Integer replicas) {
        this.replicas = replicas;
        return this;
    }
    public Integer getReplicas() {
        return this.replicas;
    }

    public DeployApplicationRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
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

    public DeployApplicationRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
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
