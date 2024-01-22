// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeApplicationConfigResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. Valid values:</p>
     * <br>
     * <p>*   **2xx**: The call was successful.</p>
     * <p>*   **3xx**: The call was redirected.</p>
     * <p>*   **4xx**: The call failed.</p>
     * <p>*   **5xx**: A server error occurred.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The details of the application.</p>
     */
    @NameInMap("Data")
    public DescribeApplicationConfigResponseBodyData data;

    /**
     * <p>The returned error code. Valid values:</p>
     * <br>
     * <p>*   If the call is successful, the **ErrorCode** parameter is not returned.</p>
     * <p>*   If the call fails, the **ErrorCode** parameter is returned. For more information, see the "**Error codes**" section of this topic.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The returned information.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the configurations of an application were obtained. Valid values:</p>
     * <br>
     * <p>*   **true**: The configurations were obtained.</p>
     * <p>*   **false**: The configurations failed to be obtained.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The trace ID that is used to query the details of the request.</p>
     */
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
        /**
         * <p>The ID of the ConfigMap.</p>
         */
        @NameInMap("ConfigMapId")
        public Long configMapId;

        /**
         * <p>The name of the ConfigMap.</p>
         */
        @NameInMap("ConfigMapName")
        public String configMapName;

        /**
         * <p>The key-value pair that is stored in the ConfigMap.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The path on which the ConfigMap is mounted.</p>
         */
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
        /**
         * <p>The path on which the NAS file system is mounted.</p>
         */
        @NameInMap("MountPath")
        public String mountPath;

        /**
         * <p>The directory in the NAS file system.</p>
         */
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
        /**
         * <p>The name of the bucket.</p>
         */
        @NameInMap("bucketName")
        public String bucketName;

        /**
         * <p>The directory or object that you created in the OSS bucket. If the specified object or directory is invalid, an exception occurs.</p>
         */
        @NameInMap("bucketPath")
        public String bucketPath;

        /**
         * <p>The directory of your container in SAE. The parameter value that you specified overwrites the original value. If the specified directory does not exist, SAE automatically creates the directory.</p>
         */
        @NameInMap("mountPath")
        public String mountPath;

        /**
         * <p>Indicates whether the application can use the container directory to read data from or write data to resources in the directory of the OSS bucket. Valid values:</p>
         * <br>
         * <p>*   **true**: The application has read-only permissions.</p>
         * <p>*   **false**: The application has read and write permissions.</p>
         */
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
        /**
         * <p>The key of the tag.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         */
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
        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the RAM role that is used to pull images across accounts. For more information, see [Pull images across Alibaba Cloud accounts](~~190675~~) and [Grant permissions across Alibaba Cloud accounts by using a RAM role](~~223585~~).</p>
         */
        @NameInMap("AcrAssumeRoleArn")
        public String acrAssumeRoleArn;

        /**
         * <p>The ID of the Container Registry Enterprise Edition instance.</p>
         */
        @NameInMap("AcrInstanceId")
        public String acrInstanceId;

        /**
         * <p>The description of the application.</p>
         */
        @NameInMap("AppDescription")
        public String appDescription;

        /**
         * <p>The ID of the application.</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The name of the application.</p>
         */
        @NameInMap("AppName")
        public String appName;

        @NameInMap("AppSource")
        public String appSource;

        /**
         * <p>Indicates whether an elastic IP address (EIP) is associated with the application instance. Valid values:</p>
         * <br>
         * <p>*   **true**: The EIP is associated with the application instance.</p>
         * <p>*   **false**: The EIP is not associated with the application instance.</p>
         */
        @NameInMap("AssociateEip")
        public Boolean associateEip;

        /**
         * <p>The interval between batches in a phased release. Unit: seconds.</p>
         */
        @NameInMap("BatchWaitTime")
        public Integer batchWaitTime;

        /**
         * <p>The command that is used to start the image. The command must be an existing executable object in the container. Example:</p>
         * <br>
         * <p>```</p>
         * <br>
         * <p>command:</p>
         * <p>      - echo</p>
         * <p>      - abc</p>
         * <p>      - ></p>
         * <p>      - file0</p>
         * <p>```</p>
         * <br>
         * <p>In this example, the Command parameter is set to `Command="echo", CommandArgs=["abc", ">", "file0"]`.</p>
         */
        @NameInMap("Command")
        public String command;

        /**
         * <p>The parameters of the image startup command. The CommandArgs parameter contains the parameters that are required for the **Command** parameter. Format:</p>
         * <br>
         * <p>`["a","b"]`</p>
         * <br>
         * <p>In the preceding **Command** example, the CommandArgs parameter is set to `CommandArgs=["abc", ">", "file0"]`. The data type of `["abc", ">", "file0"]` must be an array of strings in the JSON format. You do not need to configure this parameter if it does not exist in the Command parameter.</p>
         */
        @NameInMap("CommandArgs")
        public String commandArgs;

        /**
         * <p>The details of the ConfigMap.</p>
         */
        @NameInMap("ConfigMapMountDesc")
        public java.util.List<DescribeApplicationConfigResponseBodyDataConfigMapMountDesc> configMapMountDesc;

        /**
         * <p>The CPU specifications that are required for each instance. Unit: millicores. You cannot set this parameter to 0. Valid values:</p>
         * <br>
         * <p>*   **500**</p>
         * <p>*   **1000**</p>
         * <p>*   **2000**</p>
         * <p>*   **4000**</p>
         * <p>*   **8000**</p>
         * <p>*   **16000**</p>
         * <p>*   **32000**</p>
         */
        @NameInMap("Cpu")
        public Integer cpu;

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

        /**
         * <p>Indicates whether access to Application High Availability Service (AHAS) is enabled. Valid values:</p>
         * <br>
         * <p>*   **true**: Access to AHAS is enabled.</p>
         * <p>*   **false**: Access to AHAS is disabled.</p>
         */
        @NameInMap("EnableAhas")
        public String enableAhas;

        /**
         * <p>Indicates whether canary release rules are enabled. Canary release rules apply only to applications in Spring Cloud and Dubbo frameworks. Valid values:</p>
         * <br>
         * <p>*   **true**: The canary release rules are enabled.</p>
         * <p>*   **false**: The canary release rules are disabled.</p>
         */
        @NameInMap("EnableGreyTagRoute")
        public Boolean enableGreyTagRoute;

        /**
         * <p>The environment variables. Variable description:</p>
         * <br>
         * <p>*   **name**: the name of the environment variable.</p>
         * <p>*   **value**: the value or reference of the environment variable.</p>
         */
        @NameInMap("Envs")
        public String envs;

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
         * <p>The option settings in the JAR package. The settings are used to start the application container. The default startup command is `$JAVA_HOME/bin/java $JarStartOptions -jar $CATALINA_OPTS "$package_path" $JarStartArgs`.</p>
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
         * <p>The logging configurations of Message Queue for Apache Kafka. The following parameters are involved:</p>
         * <br>
         * <p>*   **KafkaConfigs**: the configurations of Message Queue for Apache Kafka.</p>
         * <br>
         * <p>*   **createTime**: the time when the Message Queue for Apache Kafka instance was created.</p>
         * <br>
         * <p>*   **kafkaTopic**: the message topic that is used to classify messages.</p>
         * <br>
         * <p>*   **logDir**: the path in which logs are stored.</p>
         * <br>
         * <p>*   **logType**: the type of collected logs. Valid values:</p>
         * <br>
         * <p>    *   **file_log**: the file log that is stored in the container. The path of the file logs in the container is returned.</p>
         * <p>    *   **stdout**: the standard output log of the container. You can specify only one stdout value.</p>
         * <br>
         * <p>*   **kafkaEndpoint**: the endpoint of the Message Queue for Apache Kafka service.</p>
         * <br>
         * <p>*   **kafkaInstanceId**: the ID of the Message Queue for Apache Kafka instance.</p>
         * <br>
         * <p>*   **region**: the region where the Message Queue for Apache Kafka instance resides.</p>
         */
        @NameInMap("KafkaConfigs")
        public String kafkaConfigs;

        /**
         * <p>The details of the availability check that was performed on the container. If the container fails this health check multiple times, the system disables and restarts the container. You can use one of the following methods to perform the health check:</p>
         * <br>
         * <p>*   Sample code of the **exec** method: `{"exec":{"command":["sh","-c","cat/home/admin/start.sh"]},"initialDelaySeconds":30,"periodSeconds":30,"timeoutSeconds":2}`</p>
         * <p>*   Sample code of the **httpGet** method: `{"httpGet":{"path":"/","port":18091,"scheme":"HTTP","isContainKeyWord":true,"keyWord":"SAE"},"initialDelaySeconds":11,"periodSeconds":10,"timeoutSeconds":1}`</p>
         * <p>*   Sample code of the **tcpSocket** method: `{"tcpSocket":{"port":18091},"initialDelaySeconds":11,"periodSeconds":10,"timeoutSeconds":1}`</p>
         * <br>
         * <p>>  You can use only one method to perform the health check.</p>
         * <br>
         * <p>The following parameters are involved:</p>
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

        /**
         * <p>The size of memory required by each instance. Unit: MB. You cannot set this parameter to 0. The values of this parameter correspond to the values of the Cpu parameter:</p>
         * <br>
         * <p>*   This parameter is set to **1024** if the Cpu parameter is set to 500 or 1000.</p>
         * <p>*   This parameter is set to **2048** if the Cpu parameter is set to 500, 1000, or 1000.</p>
         * <p>*   This parameter is set to **4096** if the Cpu parameter is set to 1000, 2000, or 4000.</p>
         * <p>*   This parameter is set to **8192** if the Cpu parameter is set to 2000, 4000, or 8000.</p>
         * <p>*   This parameter is set to **12288** if the Cpu parameter is set to 12000.</p>
         * <p>*   This parameter is set to **16384** if the Cpu parameter is set to 4000, 8000, or 16000.</p>
         * <p>*   This parameter is set to **24567** if the Cpu parameter is set to 12000.</p>
         * <p>*   This parameter is set to **32768** if the Cpu parameter is set to 16000.</p>
         * <p>*   This parameter is set to **65536** if the Cpu parameter is set to 8000, 16000, or 32000.</p>
         * <p>*   This parameter is set to **131072** if the Cpu parameter is set to 32000.</p>
         */
        @NameInMap("Memory")
        public Integer memory;

        @NameInMap("MicroRegistration")
        public String microRegistration;

        /**
         * <p>The percentage of the minimum number of available instances. Valid values:</p>
         * <br>
         * <p>*   **-1**: the default value. This value indicates that the minimum number of available instances is not measured by percentage. If you do not configure this parameter, the default value **-1** is used.</p>
         * <p>*   **0 to 100**: indicates that the minimum number of available instances is calculated by using the following formula: Current number of instances × (Value of MinReadyInstanceRatio × 100%). If the calculated result is not an integer, the result is rounded up to the nearest integer. For example, if the percentage is set to **50**% and five instances are available, the minimum number of available instances is 3.</p>
         * <br>
         * <p>>  If the **MinReadyInstance** and **MinReadyInstanceRatio** parameters are returned and the value of the **MinReadyInstanceRatio** parameter is not **-1**, the value of the **MinReadyInstanceRatio** parameter takes effect. If the **MinReadyInstances** parameter is set to **5** and the **MinReadyInstanceRatio** parameter is set to **50**, the value of the **MinReadyInstanceRatio** parameter determines the minimum number of available instances.</p>
         */
        @NameInMap("MinReadyInstanceRatio")
        public Integer minReadyInstanceRatio;

        /**
         * <p>The minimum number of available instances. Valid values:</p>
         * <br>
         * <p>*   If you set the value to **0**, business interruptions occur when the application is updated.</p>
         * <p>*   If you set the value to **-1**, the minimum number of available instances is automatically set to a system-recommended value. The value is the nearest integer to which the calculated result of the following formula is rounded up: Current number of instances × 25%. For example, if five instances are available, the minimum number of available instances is calculated by using the following formula: 5 × 25% = 1.25. In this case, the minimum number of available instances is 2.</p>
         * <br>
         * <p>>  Make sure that at least one instance is available during application deployment and rollback to prevent business interruptions.</p>
         */
        @NameInMap("MinReadyInstances")
        public Integer minReadyInstances;

        /**
         * <p>The details of the mounted NAS file system.</p>
         */
        @NameInMap("MountDesc")
        public java.util.List<DescribeApplicationConfigResponseBodyDataMountDesc> mountDesc;

        /**
         * <p>The mount target of the NAS file system in the VPC where the application is deployed. If you do not need to modify this configuration during the deployment, configure the **MountHost** parameter only in the first request. You do not need to include this parameter in subsequent requests. If you need to remove this configuration, leave the **MountHost** parameter empty in the request.</p>
         */
        @NameInMap("MountHost")
        public String mountHost;

        /**
         * <p>The ID of the microservice application.</p>
         */
        @NameInMap("MseApplicationId")
        public String mseApplicationId;

        @NameInMap("MseApplicationName")
        public String mseApplicationName;

        /**
         * <p>The ID of the namespace.</p>
         */
        @NameInMap("NamespaceId")
        public String namespaceId;

        @NameInMap("NasConfigs")
        public String nasConfigs;

        /**
         * <p>The ID of the NAS file system.</p>
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
         * <p>The description of the mounted OSS bucket.</p>
         */
        @NameInMap("OssMountDescs")
        public java.util.List<DescribeApplicationConfigResponseBodyDataOssMountDescs> ossMountDescs;

        /**
         * <p>The type of the deployment package. Valid values:</p>
         * <br>
         * <p>*   If you deploy the application by using a Java Archive (JAR) package, you can set this parameter to **FatJar**, **War**, or **Image**.</p>
         * <br>
         * <p>*   If you deploy the application by using a PHP package, you can set this parameter to one of the following values:</p>
         * <br>
         * <p>    *   **PhpZip**</p>
         * <p>    *   **IMAGE_PHP\_5\_4**</p>
         * <p>    *   **IMAGE_PHP\_5\_4\_ALPINE**</p>
         * <p>    *   **IMAGE_PHP\_5\_5**</p>
         * <p>    *   **IMAGE_PHP\_5\_5\_ALPINE**</p>
         * <p>    *   **IMAGE_PHP\_5\_6**</p>
         * <p>    *   **IMAGE_PHP\_5\_6\_ALPINE**</p>
         * <p>    *   **IMAGE_PHP\_7\_0**</p>
         * <p>    *   **IMAGE_PHP\_7\_0\_ALPINE**</p>
         * <p>    *   **IMAGE_PHP\_7\_1**</p>
         * <p>    *   **IMAGE_PHP\_7\_1\_ALPINE**</p>
         * <p>    *   **IMAGE_PHP\_7\_2**</p>
         * <p>    *   **IMAGE_PHP\_7\_2\_ALPINE**</p>
         * <p>    *   **IMAGE_PHP\_7\_3**</p>
         * <p>    *   **IMAGE_PHP\_7\_3\_ALPINE**</p>
         */
        @NameInMap("PackageType")
        public String packageType;

        /**
         * <p>The URL of the deployment package. This parameter is returned only if the **PackageType** parameter is set to **FatJar** or **War**.</p>
         */
        @NameInMap("PackageUrl")
        public String packageUrl;

        /**
         * <p>The version of the deployment package. This parameter is returned only if the **PackageType** parameter is set to **FatJar** or **War**.</p>
         */
        @NameInMap("PackageVersion")
        public String packageVersion;

        @NameInMap("Php")
        public String php;

        /**
         * <p>The path on which the PHP configuration file for application monitoring is mounted. Make sure that the PHP server loads the configuration file.</p>
         * <br>
         * <p>SAE automatically generates the corresponding configuration file. No manual operations are required.</p>
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
         * <p>The script that is run immediately after the container is started. Example: `{"exec":{"command":["cat","/etc/group"]}}`</p>
         */
        @NameInMap("PostStart")
        public String postStart;

        /**
         * <p>The script that is run before the container is stopped. Example: `{"exec":{"command":["cat","/etc/group"]}}`</p>
         */
        @NameInMap("PreStop")
        public String preStop;

        /**
         * <p>The programming language that is used to create the application. Valid values:</p>
         * <br>
         * <p>*   **java**: Java</p>
         * <p>*   **php**: PHP</p>
         * <p>*   **other**: Other programming languages, such as Python, C++, Go, .NET, and Node.js.</p>
         */
        @NameInMap("ProgrammingLanguage")
        public String programmingLanguage;

        @NameInMap("PvtzDiscovery")
        public String pvtzDiscovery;

        @NameInMap("Python")
        public String python;

        @NameInMap("PythonModules")
        public String pythonModules;

        /**
         * <p>The details of the health check that was performed on the container. If the container fails this health check multiple times, the system disables and restarts the container. Containers that fail health checks cannot receive traffic from Server Load Balancer (SLB) instances. You can use the **exec**, **httpGet**, or **tcpSocket** method to perform health checks. For more information, see the description of the **Liveness** parameter.</p>
         * <br>
         * <p>>  You can use only one method to perform the health check.</p>
         */
        @NameInMap("Readiness")
        public String readiness;

        /**
         * <p>The ID of the region.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The number of application instances.</p>
         */
        @NameInMap("Replicas")
        public Integer replicas;

        /**
         * <p>The ID of the security group.</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The logging configurations of Log Service.</p>
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
         */
        @NameInMap("SlsConfigs")
        public String slsConfigs;

        /**
         * <p>The details of the tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<DescribeApplicationConfigResponseBodyDataTags> tags;

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
         * <p>The Tomcat configuration. If you want to delete the configuration, set this parameter to {} or leave this parameter empty. The following parameters are involved:</p>
         * <br>
         * <p>*   **port**: the port number. Valid values: 1024 to 65535. The root permissions are required to perform operations on ports whose number is smaller than 1024. Enter a value that ranges from 1025 to 65535 because the container has only the admin permissions. If you do not configure this parameter, the default port number 8080 is used.</p>
         * <p>*   **contextPath**: the path. Default value: /. This value indicates the root directory.</p>
         * <p>*   **maxThreads**: the maximum number of connections in the connection pool. Default value: 400.</p>
         * <p>*   **uriEncoding**: the URI encoding scheme in the Tomcat container. Valid values: **UTF-8**, **ISO-8859-1**, **GBK**, and **GB2312**. If you do not configure this parameter, the default value **ISO-8859-1** is used.</p>
         * <p>*   **useBodyEncoding**: indicates whether to use the encoding scheme that is specified by **BodyEncoding for URL**. Default value: **true**.</p>
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
         * <p>The following parameters are involved:</p>
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

        /**
         * <p>The ID of the vSwitch.</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The ID of the virtual private cloud (VPC).</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The option settings in the WAR package. The settings are used to start the application container. The default startup command is `java $JAVA_OPTS $CATALINA_OPTS -Options org.apache.catalina.startup.Bootstrap "$@" start`.</p>
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

        public DescribeApplicationConfigResponseBodyData setAcrInstanceId(String acrInstanceId) {
            this.acrInstanceId = acrInstanceId;
            return this;
        }
        public String getAcrInstanceId() {
            return this.acrInstanceId;
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

        public DescribeApplicationConfigResponseBodyData setAppSource(String appSource) {
            this.appSource = appSource;
            return this;
        }
        public String getAppSource() {
            return this.appSource;
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

        public DescribeApplicationConfigResponseBodyData setImagePullSecrets(String imagePullSecrets) {
            this.imagePullSecrets = imagePullSecrets;
            return this;
        }
        public String getImagePullSecrets() {
            return this.imagePullSecrets;
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

        public DescribeApplicationConfigResponseBodyData setKafkaConfigs(String kafkaConfigs) {
            this.kafkaConfigs = kafkaConfigs;
            return this;
        }
        public String getKafkaConfigs() {
            return this.kafkaConfigs;
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

        public DescribeApplicationConfigResponseBodyData setMicroRegistration(String microRegistration) {
            this.microRegistration = microRegistration;
            return this;
        }
        public String getMicroRegistration() {
            return this.microRegistration;
        }

        public DescribeApplicationConfigResponseBodyData setMinReadyInstanceRatio(Integer minReadyInstanceRatio) {
            this.minReadyInstanceRatio = minReadyInstanceRatio;
            return this;
        }
        public Integer getMinReadyInstanceRatio() {
            return this.minReadyInstanceRatio;
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

        public DescribeApplicationConfigResponseBodyData setMseApplicationName(String mseApplicationName) {
            this.mseApplicationName = mseApplicationName;
            return this;
        }
        public String getMseApplicationName() {
            return this.mseApplicationName;
        }

        public DescribeApplicationConfigResponseBodyData setNamespaceId(String namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }
        public String getNamespaceId() {
            return this.namespaceId;
        }

        public DescribeApplicationConfigResponseBodyData setNasConfigs(String nasConfigs) {
            this.nasConfigs = nasConfigs;
            return this;
        }
        public String getNasConfigs() {
            return this.nasConfigs;
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

        public DescribeApplicationConfigResponseBodyData setPhp(String php) {
            this.php = php;
            return this;
        }
        public String getPhp() {
            return this.php;
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

        public DescribeApplicationConfigResponseBodyData setProgrammingLanguage(String programmingLanguage) {
            this.programmingLanguage = programmingLanguage;
            return this;
        }
        public String getProgrammingLanguage() {
            return this.programmingLanguage;
        }

        public DescribeApplicationConfigResponseBodyData setPvtzDiscovery(String pvtzDiscovery) {
            this.pvtzDiscovery = pvtzDiscovery;
            return this;
        }
        public String getPvtzDiscovery() {
            return this.pvtzDiscovery;
        }

        public DescribeApplicationConfigResponseBodyData setPython(String python) {
            this.python = python;
            return this;
        }
        public String getPython() {
            return this.python;
        }

        public DescribeApplicationConfigResponseBodyData setPythonModules(String pythonModules) {
            this.pythonModules = pythonModules;
            return this;
        }
        public String getPythonModules() {
            return this.pythonModules;
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
