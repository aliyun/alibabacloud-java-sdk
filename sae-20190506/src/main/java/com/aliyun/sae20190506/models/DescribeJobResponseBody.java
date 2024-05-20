// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeJobResponseBody extends TeaModel {
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
     * <p>The information about the application.</p>
     */
    @NameInMap("Data")
    public DescribeJobResponseBodyData data;

    /**
     * <p>The error code returned. Take note of the following rules:</p>
     * <br>
     * <p>*   If the call is successful, **ErrorCode** is not returned.</p>
     * <p>*   If the call fails, **ErrorCode** is returned. For more information, see the "**Error codes**" section in this topic.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the configurations of an application were obtained. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The trace ID that is used to query the details of the request.</p>
     */
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
        /**
         * <p>The ConfigMap ID.</p>
         */
        @NameInMap("ConfigMapId")
        public Long configMapId;

        /**
         * <p>The ConfigMap name.</p>
         */
        @NameInMap("ConfigMapName")
        public String configMapName;

        /**
         * <p>The key-value pair that is stored in the ConfigMap.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The path on which the NAS file system is mounted.</p>
         */
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
        /**
         * <p>The bucket name.</p>
         */
        @NameInMap("bucketName")
        public String bucketName;

        /**
         * <p>The directory or object in OSS. If the specified directory or object does not exist, an error is returned.</p>
         */
        @NameInMap("bucketPath")
        public String bucketPath;

        /**
         * <p>The path of the container in SAE. The parameter value that you specified overwrites the original value. If the specified path does not exist, SAE automatically creates the path.</p>
         */
        @NameInMap("mountPath")
        public String mountPath;

        /**
         * <p>Indicates whether the application can use the container path to read data from or write data to resources in the directory of the OSS bucket. Valid values:</p>
         * <br>
         * <p>*   **true**: The application has the read-only permission.</p>
         * <p>*   **false**: The application has read and write permissions.</p>
         */
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
        /**
         * <p>The tag key.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         */
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
        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the RAM role that is used to pull images across accounts. For more information, see [Pull images across Alibaba Cloud accounts](https://help.aliyun.com/document_detail/190675.html) and [Grant permissions across Alibaba Cloud accounts by using a RAM role](https://help.aliyun.com/document_detail/223585.html).</p>
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
         * <p>The application ID.</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The application name.</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The number of times that the job was retried.</p>
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
         * <p>The arguments of the image startup command. This parameter contains the arguments that are required for **Command**. Format:</p>
         * <br>
         * <p>`["a","b"]`</p>
         * <br>
         * <p>In the preceding **Command** example, the CommandArgs parameter is set to `CommandArgs=["abc", ">", "file0"]`. The data type of `["abc", ">", "file0"]` must be an array of strings in the JSON format. If this parameter does not exist in the Command parameter, you do not need to configure it.</p>
         */
        @NameInMap("CommandArgs")
        public String commandArgs;

        /**
         * <p>The concurrency policy of the job. Valid values:</p>
         * <br>
         * <p>*   **Forbid**: Concurrent running is prohibited. If the previous job is not completed, no new job is created.</p>
         * <p>*   **Allow**: Concurrent running is allowed.</p>
         * <p>*   **Replace**: If the previous job is not completed when the time to create a new job is reached, the new job replaces the previous job.</p>
         */
        @NameInMap("ConcurrencyPolicy")
        public String concurrencyPolicy;

        /**
         * <p>The details of the ConfigMap.</p>
         */
        @NameInMap("ConfigMapMountDesc")
        public java.util.List<DescribeJobResponseBodyDataConfigMapMountDesc> configMapMountDesc;

        /**
         * <p>The CPU specifications required for each instance. Unit: millicore. This parameter cannot be set to 0. Valid values:</p>
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
         * <p>The custom mapping between the hostname and IP address in the container. Valid values:</p>
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
         * <p>The environment variables. You can configure custom environment variables or reference a ConfigMap. If you want to reference a ConfigMap, you must first create a ConfigMap. For more information, see [CreateConfigMap](https://help.aliyun.com/document_detail/176914.html). Valid values:</p>
         * <br>
         * <p>*   Custom configuration</p>
         * <br>
         * <p>    *   **name**: the name of the environment variable.</p>
         * <p>    *   **value**: the value of the environment variable.</p>
         * <br>
         * <p>*   Reference a ConfigMap</p>
         * <br>
         * <p>    *   **name**: the name of the environment variable. You can reference one or all keys. To reference all keys, specify `sae-sys-configmap-all-<ConfigMap name>`. Example: `sae-sys-configmap-all-test1`.</p>
         * <p>    *   **valueFrom**: the reference of the environment variable. Set the value to `configMapRef`.</p>
         * <p>    *   **configMapId**: the ID of the ConfigMap.</p>
         * <p>    *   **key**: the key. If you want to reference all keys, you do not need to configure this parameter.</p>
         */
        @NameInMap("Envs")
        public String envs;

        /**
         * <p>The ID of the corresponding secret.</p>
         */
        @NameInMap("ImagePullSecrets")
        public String imagePullSecrets;

        /**
         * <p>The URL of the image. This parameter is returned only if **PackageType** is set to **Image**.</p>
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
         * <p>The version of the Java Development Kit (JDK) on which the deployment package of the application depends. The following versions are supported:</p>
         * <br>
         * <p>*   **Open JDK 8**</p>
         * <p>*   **Open JDK 7**</p>
         * <p>*   **Dragonwell 11**</p>
         * <p>*   **Dragonwell 8**</p>
         * <p>*   **openjdk-8u191-jdk-alpine3.9**</p>
         * <p>*   **openjdk-7u201-jdk-alpine3.9**</p>
         * <br>
         * <p>This parameter is not returned if **PackageType** is set to **Image**.</p>
         */
        @NameInMap("Jdk")
        public String jdk;

        /**
         * <p>The size of memory that is required by each instance. Unit: MB. This parameter cannot be set to 0. The values of this parameter correspond to the values of the Cpu parameter:</p>
         * <br>
         * <p>*   This parameter is set to **1024** if the Cpu parameter is set to 500 or 1000.</p>
         * <p>*   This parameter is set to **2048** if the Cpu parameter is set to 500, 1000, or 2000.</p>
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

        /**
         * <p>The details of the mounted NAS file system.</p>
         */
        @NameInMap("MountDesc")
        public java.util.List<DescribeJobResponseBodyDataMountDesc> mountDesc;

        /**
         * <p>The mount target of the NAS file system in the VPC in which the application is deployed. If you do not need to modify this configuration during the deployment, configure **MountHost** only in the first request. If you need to remove this configuration, leave **MountHost** empty in the request.</p>
         */
        @NameInMap("MountHost")
        public String mountHost;

        /**
         * <p>The namespace ID.</p>
         */
        @NameInMap("NamespaceId")
        public String namespaceId;

        /**
         * <p>The configurations for mounting the NAS file system.</p>
         */
        @NameInMap("NasConfigs")
        public String nasConfigs;

        /**
         * <p>The ID of the NAS file system.</p>
         */
        @NameInMap("NasId")
        public String nasId;

        /**
         * <p>The AccessKey ID that is used to read data from and write data to Object Storage Service (OSS).</p>
         */
        @NameInMap("OssAkId")
        public String ossAkId;

        /**
         * <p>The AccessKey secret that is used to read data from and write data to OSS.</p>
         */
        @NameInMap("OssAkSecret")
        public String ossAkSecret;

        /**
         * <p>The description of mounted OSS buckets.</p>
         */
        @NameInMap("OssMountDescs")
        public java.util.List<DescribeJobResponseBodyDataOssMountDescs> ossMountDescs;

        /**
         * <p>The type of the deployment package. Valid values:</p>
         * <br>
         * <p>*   If you deploy the application by using a Java Archive (JAR) package, this parameter is set to **FatJar**, **War**, or **Image**.</p>
         * <br>
         * <p>*   If you deploy the application by using a PHP package, this parameter is set to one of the following values:</p>
         * <br>
         * <p>    *   **PhpZip**</p>
         * <p>    *   **IMAGE_PHP_5_4**</p>
         * <p>    *   **IMAGE_PHP_5_4_ALPINE**</p>
         * <p>    *   **IMAGE_PHP_5_5**</p>
         * <p>    *   **IMAGE_PHP_5_5_ALPINE**</p>
         * <p>    *   **IMAGE_PHP_5_6**</p>
         * <p>    *   **IMAGE_PHP_5_6_ALPINE**</p>
         * <p>    *   **IMAGE_PHP_7_0**</p>
         * <p>    *   **IMAGE_PHP_7_0_ALPINE**</p>
         * <p>    *   **IMAGE_PHP_7_1**</p>
         * <p>    *   **IMAGE_PHP_7_1_ALPINE**</p>
         * <p>    *   **IMAGE_PHP_7_2**</p>
         * <p>    *   **IMAGE_PHP_7_2_ALPINE**</p>
         * <p>    *   **IMAGE_PHP_7_3**</p>
         * <p>    *   **IMAGE_PHP_7_3_ALPINE**</p>
         * <br>
         * <p>*   If you deploy the application by using a Pythhon package, this parameter is set to **PythonZip** or **Image**.</p>
         */
        @NameInMap("PackageType")
        public String packageType;

        /**
         * <p>The URL of the deployment package. This parameter is returned only if **PackageType** is set to **FatJar** or **War**.</p>
         */
        @NameInMap("PackageUrl")
        public String packageUrl;

        /**
         * <p>The version of the deployment package. This parameter is required only if **PackageType** is set to **FatJar** or **War**.</p>
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
         * <p>The script that is run immediately after the container is started. Example: `{"exec":{"command":["cat","/etc/group"\\]}}`</p>
         */
        @NameInMap("PostStart")
        public String postStart;

        /**
         * <p>The script that is run before the container is stopped. Example: `{"exec":{"command":["cat","/etc/group"\\]}}`</p>
         */
        @NameInMap("PreStop")
        public String preStop;

        /**
         * <p>The programming language that is used to create the application. Valid values:</p>
         * <br>
         * <p>*   **java**: Java</p>
         * <p>*   **php**: PHP</p>
         * <p>*   **python**: Python</p>
         * <p>*   **other**: other programming languages, such as C++, Go, .NET, and Node.js.</p>
         */
        @NameInMap("ProgrammingLanguage")
        public String programmingLanguage;

        /**
         * <p>The Internet request URLs of one-time jobs.</p>
         */
        @NameInMap("PublicWebHookUrls")
        public java.util.List<String> publicWebHookUrls;

        /**
         * <p>The Python environment. PYTHON 3.9.15 is supported.</p>
         */
        @NameInMap("Python")
        public String python;

        /**
         * <p>The configurations for installing custom module dependencies. By default, the dependencies defined by the requirements.txt file in the root directory are installed. If no software package is configured, you can specify dependencies based on your business requirements.</p>
         */
        @NameInMap("PythonModules")
        public String pythonModules;

        /**
         * <p>The ID of the job template that you reference.</p>
         */
        @NameInMap("RefAppId")
        public String refAppId;

        /**
         * <p>The IDs of the referenced job templates.</p>
         */
        @NameInMap("RefedAppIds")
        public java.util.List<String> refedAppIds;

        /**
         * <p>The region ID.</p>
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
         * <p>Indicates whether job sharding is enabled.</p>
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
         * <p>Parameter description:</p>
         * <br>
         * <p>*   **projectName**: the name of the Log Service project.</p>
         * <p>*   **logDir**: the path in which logs are stored.</p>
         * <p>*   **logType**: the log type. **stdout**: the standard output (stdout) log of the container. Only one stdout value for this parameter can be specified. If this parameter is not configured, file logs are collected.</p>
         * <p>*   **logstoreName**: the name of the Logstore in Log Service.</p>
         * <p>*   **logtailName**: the name of the Logtail in Log Service. If this parameter is not configured, a new Logtail is created.</p>
         * <br>
         * <p>If you do not need to modify the logging configurations when you deploy the application, configure **SlsConfigs** only in the first request. If you no longer need to use Log Service, leave **SlsConfigs** empty in the request.</p>
         */
        @NameInMap("SlsConfigs")
        public String slsConfigs;

        /**
         * <p>Indicates whether the job template is suspended.</p>
         */
        @NameInMap("Suspend")
        public Boolean suspend;

        /**
         * <p>The tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<DescribeJobResponseBodyDataTags> tags;

        /**
         * <p>The timeout period for a graceful shutdown. Default value: 30. Unit: seconds. Valid values: 1 to 300.</p>
         */
        @NameInMap("TerminationGracePeriodSeconds")
        public Integer terminationGracePeriodSeconds;

        /**
         * <p>The timeout period for the job. Unit: seconds.</p>
         */
        @NameInMap("Timeout")
        public Long timeout;

        /**
         * <p>The time zone. Default value: **Asia/Shanghai**.</p>
         */
        @NameInMap("Timezone")
        public String timezone;

        /**
         * <p>The Tomcat configuration. If you want to delete the configuration, set this parameter to {} or leave this parameter empty. Parameter description:</p>
         * <br>
         * <p>*   **port**: the port number. Valid values: 1024 to 65535. The root permissions are required to perform operations on ports whose number is smaller than 1024. Enter a value that ranges from 1025 to 65535 because the container has only the admin permissions. If this parameter is not configured, the default value 8080 is used.</p>
         * <p>*   **contextPath**: the path. Default value: /. The value indicates the root directory.</p>
         * <p>*   **maxThreads**: the maximum number of connections in the connection pool. Default value: 400.</p>
         * <p>*   **uriEncoding**: the URI encoding scheme in the Tomcat container. Valid values: **UTF-8**, **ISO-8859-1**, **GBK**, and **GB2312**. If this parameter is not configured, the default value **ISO-8859-1** is used.</p>
         * <p>*   **useBodyEncoding**: indicates whether to use the encoding scheme that is specified by **BodyEncoding for URL**. Default value: **true**.</p>
         */
        @NameInMap("TomcatConfig")
        public String tomcatConfig;

        @NameInMap("TriggerConfig")
        public String triggerConfig;

        /**
         * <p>The vSwitch ID.</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The ID of the virtual private cloud (VPC).</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The internal request URLs for one-time jobs.</p>
         */
        @NameInMap("VpcWebHookUrls")
        public java.util.List<String> vpcWebHookUrls;

        /**
         * <p>The option settings in the WAR package. The settings are used to start the application container. The default startup command is `java $JAVA_OPTS $CATALINA_OPTS -Options org.apache.catalina.startup.Bootstrap "$@" start`.</p>
         */
        @NameInMap("WarStartOptions")
        public String warStartOptions;

        /**
         * <p>The version of the Tomcat container on which the deployment package depends. The following versions are supported:</p>
         * <br>
         * <p>*   **apache-tomcat-7.0.91**</p>
         * <p>*   **apache-tomcat-8.5.42**</p>
         * <br>
         * <p>This parameter is not returned if **PackageType** is set to **Image**.</p>
         */
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

        public DescribeJobResponseBodyData setAcrInstanceId(String acrInstanceId) {
            this.acrInstanceId = acrInstanceId;
            return this;
        }
        public String getAcrInstanceId() {
            return this.acrInstanceId;
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

        public DescribeJobResponseBodyData setBackoffLimit(Long backoffLimit) {
            this.backoffLimit = backoffLimit;
            return this;
        }
        public Long getBackoffLimit() {
            return this.backoffLimit;
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

        public DescribeJobResponseBodyData setEnvs(String envs) {
            this.envs = envs;
            return this;
        }
        public String getEnvs() {
            return this.envs;
        }

        public DescribeJobResponseBodyData setImagePullSecrets(String imagePullSecrets) {
            this.imagePullSecrets = imagePullSecrets;
            return this;
        }
        public String getImagePullSecrets() {
            return this.imagePullSecrets;
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

        public DescribeJobResponseBodyData setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
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

        public DescribeJobResponseBodyData setPython(String python) {
            this.python = python;
            return this;
        }
        public String getPython() {
            return this.python;
        }

        public DescribeJobResponseBodyData setPythonModules(String pythonModules) {
            this.pythonModules = pythonModules;
            return this;
        }
        public String getPythonModules() {
            return this.pythonModules;
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
