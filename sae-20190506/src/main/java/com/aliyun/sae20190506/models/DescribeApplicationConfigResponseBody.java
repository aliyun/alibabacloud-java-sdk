// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeApplicationConfigResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. Valid values:</p>
     * <ul>
     * <li><strong>2xx</strong>: The call was successful.</li>
     * <li><strong>3xx</strong>: The call was redirected.</li>
     * <li><strong>4xx</strong>: The call failed.</li>
     * <li><strong>5xx</strong>: A server error occurred.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
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
     * <ul>
     * <li>If the call is successful, the <strong>ErrorCode</strong> parameter is not returned.</li>
     * <li>If the call fails, the <strong>ErrorCode</strong> parameter is returned. For more information, see the &quot;<strong>Error codes</strong>&quot; section of this topic.</li>
     * </ul>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The returned information.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>01CF26C7-00A3-4AA6-BA76-7E95F2A3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the configurations of an application were obtained. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The configurations were obtained.</li>
     * <li><strong>false</strong>: The configurations failed to be obtained.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The trace ID that is used to query the details of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>ac1a0b2215622246421415014e****</p>
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
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ConfigMapId")
        public Long configMapId;

        /**
         * <p>The name of the ConfigMap.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ConfigMapName")
        public String configMapName;

        /**
         * <p>The key-value pair that is stored in the ConfigMap.</p>
         * 
         * <strong>example:</strong>
         * <p>k1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The path on which the ConfigMap is mounted.</p>
         * 
         * <strong>example:</strong>
         * <p>/tmp</p>
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
         * 
         * <strong>example:</strong>
         * <p>/tmp</p>
         */
        @NameInMap("MountPath")
        public String mountPath;

        /**
         * <p>The directory in the NAS file system.</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
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
         * 
         * <strong>example:</strong>
         * <p>oss-bucket</p>
         */
        @NameInMap("bucketName")
        public String bucketName;

        /**
         * <p>The directory or object that you created in the OSS bucket. If the specified object or directory is invalid, an exception occurs.</p>
         * 
         * <strong>example:</strong>
         * <p>data/user.data</p>
         */
        @NameInMap("bucketPath")
        public String bucketPath;

        /**
         * <p>The directory of your container in SAE. The parameter value that you specified overwrites the original value. If the specified directory does not exist, SAE automatically creates the directory.</p>
         * 
         * <strong>example:</strong>
         * <p>/usr/data/user.data</p>
         */
        @NameInMap("mountPath")
        public String mountPath;

        /**
         * <p>Indicates whether the application can use the container directory to read data from or write data to resources in the directory of the OSS bucket. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The application has read-only permissions.</li>
         * <li><strong>false</strong>: The application has read and write permissions.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
         * 
         * <strong>example:</strong>
         * <p>k1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
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
         * <p>The Alibaba Cloud Resource Name (ARN) of the RAM role that is used to pull images across accounts. For more information, see <a href="https://help.aliyun.com/document_detail/190675.html">Pull images across Alibaba Cloud accounts</a> and <a href="https://help.aliyun.com/document_detail/223585.html">Grant permissions across Alibaba Cloud accounts by using a RAM role</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::123456789012****:role/adminrole</p>
         */
        @NameInMap("AcrAssumeRoleArn")
        public String acrAssumeRoleArn;

        /**
         * <p>The ID of the Container Registry Enterprise Edition instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cri-xxxxxx</p>
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
         * 
         * <strong>example:</strong>
         * <p>7171a6ca-d1cd-4928-8642-7d5cfe69****</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The name of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>demo-app</p>
         */
        @NameInMap("AppName")
        public String appName;

        @NameInMap("AppSource")
        public String appSource;

        /**
         * <p>Indicates whether an elastic IP address (EIP) is associated with the application instance. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The EIP is associated with the application instance.</li>
         * <li><strong>false</strong>: The EIP is not associated with the application instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AssociateEip")
        public Boolean associateEip;

        /**
         * <p>The interval between batches in a phased release. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("BatchWaitTime")
        public Integer batchWaitTime;

        /**
         * <p>The command that is used to start the image. The command must be an existing executable object in the container. Example:</p>
         * <pre><code>
         * command:
         *       - echo
         *       - abc
         *       - &gt;
         *       - file0
         * </code></pre>
         * <p>In this example, the Command parameter is set to <code>Command=&quot;echo&quot;, CommandArgs=[&quot;abc&quot;, &quot;&gt;&quot;, &quot;file0&quot;]</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>echo</p>
         */
        @NameInMap("Command")
        public String command;

        /**
         * <p>The parameters of the image startup command. The CommandArgs parameter contains the parameters that are required for the <strong>Command</strong> parameter. Format:</p>
         * <p><code>[&quot;a&quot;,&quot;b&quot;]</code></p>
         * <p>In the preceding <strong>Command</strong> example, the CommandArgs parameter is set to <code>CommandArgs=[&quot;abc&quot;, &quot;&gt;&quot;, &quot;file0&quot;]</code>. The data type of <code>[&quot;abc&quot;, &quot;&gt;&quot;, &quot;file0&quot;]</code> must be an array of strings in the JSON format. You do not need to configure this parameter if it does not exist in the Command parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;a&quot;,&quot;b&quot;]</p>
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
         * <ul>
         * <li><strong>500</strong></li>
         * <li><strong>1000</strong></li>
         * <li><strong>2000</strong></li>
         * <li><strong>4000</strong></li>
         * <li><strong>8000</strong></li>
         * <li><strong>16000</strong></li>
         * <li><strong>32000</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Cpu")
        public Integer cpu;

        /**
         * <p>The custom mappings between hostnames and IP addresses in the container. Valid values:</p>
         * <ul>
         * <li><strong>hostName</strong>: the domain name or hostname.</li>
         * <li><strong>ip</strong>: the IP address.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;hostName&quot;:&quot;test.host.name&quot;,&quot;ip&quot;:&quot;0.0.0.0&quot;}]</p>
         */
        @NameInMap("CustomHostAlias")
        public String customHostAlias;

        /**
         * <p>The version of the container, such as Ali-Tomcat, in which an application developed based on High-speed Service Framework (HSF) is deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>3.5.3</p>
         */
        @NameInMap("EdasContainerVersion")
        public String edasContainerVersion;

        /**
         * <p>Indicates whether access to Application High Availability Service (AHAS) is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Access to AHAS is enabled.</li>
         * <li><strong>false</strong>: Access to AHAS is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableAhas")
        public String enableAhas;

        /**
         * <p>Indicates whether canary release rules are enabled. Canary release rules apply only to applications in Spring Cloud and Dubbo frameworks. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The canary release rules are enabled.</li>
         * <li><strong>false</strong>: The canary release rules are disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableGreyTagRoute")
        public Boolean enableGreyTagRoute;

        /**
         * <p>The environment variables. Variable description:</p>
         * <ul>
         * <li><strong>name</strong>: the name of the environment variable.</li>
         * <li><strong>value</strong>: the value or reference of the environment variable.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;name&quot;:&quot;TEST_ENV_KEY&quot;,&quot;value&quot;:&quot;TEST_ENV_VAR&quot;}]</p>
         */
        @NameInMap("Envs")
        public String envs;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ImagePullSecrets")
        public String imagePullSecrets;

        /**
         * <p>The URL of the image. This parameter is returned only if the <strong>PackageType</strong> parameter is set to <strong>Image</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>docker.io/library/nginx:1.14.2</p>
         */
        @NameInMap("ImageUrl")
        public String imageUrl;

        /**
         * <p>The arguments in the JAR package. The arguments are used to start the application container. The default startup command is <code>$JAVA_HOME/bin/java $JarStartOptions -jar $CATALINA_OPTS &quot;$package_path&quot; $JarStartArgs</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>start</p>
         */
        @NameInMap("JarStartArgs")
        public String jarStartArgs;

        /**
         * <p>The option settings in the JAR package. The settings are used to start the application container. The default startup command is <code>$JAVA_HOME/bin/java $JarStartOptions -jar $CATALINA_OPTS &quot;$package_path&quot; $JarStartArgs</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>-Dtest=true</p>
         */
        @NameInMap("JarStartOptions")
        public String jarStartOptions;

        /**
         * <p>The version of the Java development kit (JDK) on which the deployment package of the application depends. The following versions are supported:</p>
         * <ul>
         * <li><strong>Open JDK 8</strong></li>
         * <li><strong>Open JDK 7</strong></li>
         * <li><strong>Dragonwell 11</strong></li>
         * <li><strong>Dragonwell 8</strong></li>
         * <li><strong>openjdk-8u191-jdk-alpine3.9</strong></li>
         * <li><strong>openjdk-7u201-jdk-alpine3.9</strong></li>
         * </ul>
         * <p>This parameter is not returned if the <strong>PackageType</strong> parameter is set to <strong>Image</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>Open JDK 8</p>
         */
        @NameInMap("Jdk")
        public String jdk;

        /**
         * <p>The logging configurations of Message Queue for Apache Kafka. The following parameters are involved:</p>
         * <ul>
         * <li><p><strong>KafkaConfigs</strong>: the configurations of Message Queue for Apache Kafka.</p>
         * </li>
         * <li><p><strong>createTime</strong>: the time when the Message Queue for Apache Kafka instance was created.</p>
         * </li>
         * <li><p><strong>kafkaTopic</strong>: the message topic that is used to classify messages.</p>
         * </li>
         * <li><p><strong>logDir</strong>: the path in which logs are stored.</p>
         * </li>
         * <li><p><strong>logType</strong>: the type of collected logs. Valid values:</p>
         * <ul>
         * <li><strong>file_log</strong>: the file log that is stored in the container. The path of the file logs in the container is returned.</li>
         * <li><strong>stdout</strong>: the standard output log of the container. You can specify only one stdout value.</li>
         * </ul>
         * </li>
         * <li><p><strong>kafkaEndpoint</strong>: the endpoint of the Message Queue for Apache Kafka service.</p>
         * </li>
         * <li><p><strong>kafkaInstanceId</strong>: the ID of the Message Queue for Apache Kafka instance.</p>
         * </li>
         * <li><p><strong>region</strong>: the region where the Message Queue for Apache Kafka instance resides.</p>
         * </li>
         * </ul>
         */
        @NameInMap("KafkaConfigs")
        public String kafkaConfigs;

        /**
         * <p>The details of the availability check that was performed on the container. If the container fails this health check multiple times, the system disables and restarts the container. You can use one of the following methods to perform the health check:</p>
         * <ul>
         * <li>Sample code of the <strong>exec</strong> method: <code>{&quot;exec&quot;:{&quot;command&quot;:[&quot;sh&quot;,&quot;-c&quot;,&quot;cat/home/admin/start.sh&quot;]},&quot;initialDelaySeconds&quot;:30,&quot;periodSeconds&quot;:30,&quot;timeoutSeconds&quot;:2}</code></li>
         * <li>Sample code of the <strong>httpGet</strong> method: <code>{&quot;httpGet&quot;:{&quot;path&quot;:&quot;/&quot;,&quot;port&quot;:18091,&quot;scheme&quot;:&quot;HTTP&quot;,&quot;isContainKeyWord&quot;:true,&quot;keyWord&quot;:&quot;SAE&quot;},&quot;initialDelaySeconds&quot;:11,&quot;periodSeconds&quot;:10,&quot;timeoutSeconds&quot;:1}</code></li>
         * <li>Sample code of the <strong>tcpSocket</strong> method: <code>{&quot;tcpSocket&quot;:{&quot;port&quot;:18091},&quot;initialDelaySeconds&quot;:11,&quot;periodSeconds&quot;:10,&quot;timeoutSeconds&quot;:1}</code></li>
         * </ul>
         * <blockquote>
         * <p> You can use only one method to perform the health check.</p>
         * </blockquote>
         * <p>The following parameters are involved:</p>
         * <ul>
         * <li><strong>exec.command</strong>: the health check command.</li>
         * <li><strong>httpGet.path</strong>: the request path.</li>
         * <li><strong>httpGet.scheme</strong>: the protocol that is used to perform the health check. Valid values: <strong>HTTP</strong> and <strong>HTTPS</strong>.</li>
         * <li><strong>httpGet.isContainKeyWord</strong>: indicates whether the response contains keywords. Valid values: <strong>true</strong> and <strong>false</strong>. If this field is not returned, the advanced settings are not used.</li>
         * <li><strong>httpGet.keyWord</strong>: the custom keyword. This parameter is available only if the <strong>isContainKeyWord</strong> field is returned.</li>
         * <li><strong>tcpSocket.port</strong>: the port that is used to check the status of TCP connections.</li>
         * <li><strong>initialDelaySeconds</strong>: the delay of the health check. Default value: 10. Unit: seconds.</li>
         * <li><strong>periodSeconds</strong>: the interval at which health checks are performed. Default value: 30. Unit: seconds.</li>
         * <li><strong>timeoutSeconds</strong>: the timeout period of the health check. Default value: 1. Unit: seconds. If you set this parameter to 0 or leave this parameter empty, the timeout period is automatically set to 1 second.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;exec&quot;:{&quot;command&quot;:[&quot;curl <a href="http://localhost:8080%22%5D%7D,%22initialDelaySeconds%22:20,%22timeoutSeconds%22:3%7D">http://localhost:8080&quot;]},&quot;initialDelaySeconds&quot;:20,&quot;timeoutSeconds&quot;:3}</a></p>
         */
        @NameInMap("Liveness")
        public String liveness;

        /**
         * <p>The size of memory required by each instance. Unit: MB. You cannot set this parameter to 0. The values of this parameter correspond to the values of the Cpu parameter:</p>
         * <ul>
         * <li>This parameter is set to <strong>1024</strong> if the Cpu parameter is set to 500 or 1000.</li>
         * <li>This parameter is set to <strong>2048</strong> if the Cpu parameter is set to 500, 1000, or 1000.</li>
         * <li>This parameter is set to <strong>4096</strong> if the Cpu parameter is set to 1000, 2000, or 4000.</li>
         * <li>This parameter is set to <strong>8192</strong> if the Cpu parameter is set to 2000, 4000, or 8000.</li>
         * <li>This parameter is set to <strong>12288</strong> if the Cpu parameter is set to 12000.</li>
         * <li>This parameter is set to <strong>16384</strong> if the Cpu parameter is set to 4000, 8000, or 16000.</li>
         * <li>This parameter is set to <strong>24567</strong> if the Cpu parameter is set to 12000.</li>
         * <li>This parameter is set to <strong>32768</strong> if the Cpu parameter is set to 16000.</li>
         * <li>This parameter is set to <strong>65536</strong> if the Cpu parameter is set to 8000, 16000, or 32000.</li>
         * <li>This parameter is set to <strong>131072</strong> if the Cpu parameter is set to 32000.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2048</p>
         */
        @NameInMap("Memory")
        public Integer memory;

        /**
         * <strong>example:</strong>
         * <p>&quot;0&quot;</p>
         */
        @NameInMap("MicroRegistration")
        public String microRegistration;

        /**
         * <p>The percentage of the minimum number of available instances. Valid values:</p>
         * <ul>
         * <li><strong>-1</strong>: the default value. This value indicates that the minimum number of available instances is not measured by percentage. If you do not configure this parameter, the default value <strong>-1</strong> is used.</li>
         * <li><strong>0 to 100</strong>: indicates that the minimum number of available instances is calculated by using the following formula: Current number of instances × (Value of MinReadyInstanceRatio × 100%). If the calculated result is not an integer, the result is rounded up to the nearest integer. For example, if the percentage is set to <strong>50</strong>% and five instances are available, the minimum number of available instances is 3.</li>
         * </ul>
         * <blockquote>
         * <p> If the <strong>MinReadyInstance</strong> and <strong>MinReadyInstanceRatio</strong> parameters are returned and the value of the <strong>MinReadyInstanceRatio</strong> parameter is not <strong>-1</strong>, the value of the <strong>MinReadyInstanceRatio</strong> parameter takes effect. If the <strong>MinReadyInstances</strong> parameter is set to <strong>5</strong> and the <strong>MinReadyInstanceRatio</strong> parameter is set to <strong>50</strong>, the value of the <strong>MinReadyInstanceRatio</strong> parameter determines the minimum number of available instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("MinReadyInstanceRatio")
        public Integer minReadyInstanceRatio;

        /**
         * <p>The minimum number of available instances. Valid values:</p>
         * <ul>
         * <li>If you set the value to <strong>0</strong>, business interruptions occur when the application is updated.</li>
         * <li>If you set the value to <strong>-1</strong>, the minimum number of available instances is automatically set to a system-recommended value. The value is the nearest integer to which the calculated result of the following formula is rounded up: Current number of instances × 25%. For example, if five instances are available, the minimum number of available instances is calculated by using the following formula: 5 × 25% = 1.25. In this case, the minimum number of available instances is 2.</li>
         * </ul>
         * <blockquote>
         * <p> Make sure that at least one instance is available during application deployment and rollback to prevent business interruptions.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MinReadyInstances")
        public Integer minReadyInstances;

        /**
         * <p>The details of the mounted NAS file system.</p>
         */
        @NameInMap("MountDesc")
        public java.util.List<DescribeApplicationConfigResponseBodyDataMountDesc> mountDesc;

        /**
         * <p>The mount target of the NAS file system in the VPC where the application is deployed. If you do not need to modify this configuration during the deployment, configure the <strong>MountHost</strong> parameter only in the first request. You do not need to include this parameter in subsequent requests. If you need to remove this configuration, leave the <strong>MountHost</strong> parameter empty in the request.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("MountHost")
        public String mountHost;

        /**
         * <p>The ID of the microservice application.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxxxx@xxxxx</p>
         */
        @NameInMap("MseApplicationId")
        public String mseApplicationId;

        @NameInMap("MseApplicationName")
        public String mseApplicationName;

        /**
         * <p>The ID of the namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing:test</p>
         */
        @NameInMap("NamespaceId")
        public String namespaceId;

        /**
         * <strong>example:</strong>
         * <p>[{&quot;mountPath&quot;:&quot;/test1&quot;,&quot;readOnly&quot;:false,&quot;nasId&quot;:&quot;nasId1&quot;,&quot;mountDomain&quot;:&quot;nasId1.cn-shenzhen.nas.aliyuncs.com&quot;,&quot;nasPath&quot;:&quot;/test1&quot;},{&quot;nasId&quot;:&quot;nasId2&quot;,&quot;mountDomain&quot;:&quot;nasId2.cn-shenzhen.nas.aliyuncs.com&quot;,&quot;readOnly&quot;:false,&quot;nasPath&quot;:&quot;/test2&quot;,&quot;mountPath&quot;:&quot;/test2&quot;}]</p>
         */
        @NameInMap("NasConfigs")
        public String nasConfigs;

        /**
         * <p>The ID of the NAS file system.</p>
         * 
         * <strong>example:</strong>
         * <p>AKSN89**</p>
         */
        @NameInMap("NasId")
        public String nasId;

        /**
         * <p>The AccessKey ID that is used to read data from and write data to Object Storage Service (OSS) buckets.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("OssAkId")
        public String ossAkId;

        /**
         * <p>The AccessKey secret that is used to read data from and write data to OSS buckets.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxxx</p>
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
         * <ul>
         * <li><p>If you deploy the application by using a Java Archive (JAR) package, you can set this parameter to <strong>FatJar</strong>, <strong>War</strong>, or <strong>Image</strong>.</p>
         * </li>
         * <li><p>If you deploy the application by using a PHP package, you can set this parameter to one of the following values:</p>
         * <ul>
         * <li><strong>PhpZip</strong></li>
         * <li><strong>IMAGE_PHP_5_4</strong></li>
         * <li><strong>IMAGE_PHP_5_4_ALPINE</strong></li>
         * <li><strong>IMAGE_PHP_5_5</strong></li>
         * <li><strong>IMAGE_PHP_5_5_ALPINE</strong></li>
         * <li><strong>IMAGE_PHP_5_6</strong></li>
         * <li><strong>IMAGE_PHP_5_6_ALPINE</strong></li>
         * <li><strong>IMAGE_PHP_7_0</strong></li>
         * <li><strong>IMAGE_PHP_7_0_ALPINE</strong></li>
         * <li><strong>IMAGE_PHP_7_1</strong></li>
         * <li><strong>IMAGE_PHP_7_1_ALPINE</strong></li>
         * <li><strong>IMAGE_PHP_7_2</strong></li>
         * <li><strong>IMAGE_PHP_7_2_ALPINE</strong></li>
         * <li><strong>IMAGE_PHP_7_3</strong></li>
         * <li><strong>IMAGE_PHP_7_3_ALPINE</strong></li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>War</p>
         */
        @NameInMap("PackageType")
        public String packageType;

        /**
         * <p>The URL of the deployment package. This parameter is returned only if the <strong>PackageType</strong> parameter is set to <strong>FatJar</strong> or <strong>War</strong>.</p>
         */
        @NameInMap("PackageUrl")
        public String packageUrl;

        /**
         * <p>The version of the deployment package. This parameter is returned only if the <strong>PackageType</strong> parameter is set to <strong>FatJar</strong> or <strong>War</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("PackageVersion")
        public String packageVersion;

        @NameInMap("Php")
        public String php;

        /**
         * <p>The path on which the PHP configuration file for application monitoring is mounted. Make sure that the PHP server loads the configuration file.</p>
         * <p>SAE automatically generates the corresponding configuration file. No manual operations are required.</p>
         * 
         * <strong>example:</strong>
         * <p>/usr/local/etc/php/conf.d/arms.ini</p>
         */
        @NameInMap("PhpArmsConfigLocation")
        public String phpArmsConfigLocation;

        /**
         * <p>The details of the PHP configuration file.</p>
         * 
         * <strong>example:</strong>
         * <p>k1=v1</p>
         */
        @NameInMap("PhpConfig")
        public String phpConfig;

        /**
         * <p>The path on which the PHP configuration file for application startup is mounted. Make sure that the PHP server uses this configuration file during the startup.</p>
         * 
         * <strong>example:</strong>
         * <p>/usr/local/etc/php/php.ini</p>
         */
        @NameInMap("PhpConfigLocation")
        public String phpConfigLocation;

        /**
         * <p>The script that is run immediately after the container is started. Example: <code>{&quot;exec&quot;:{&quot;command&quot;:[&quot;cat&quot;,&quot;/etc/group&quot;]}}</code></p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;exec&quot;:{&quot;command&quot;:[&quot;cat&quot;,&quot;/etc/group&quot;]}}</p>
         */
        @NameInMap("PostStart")
        public String postStart;

        /**
         * <p>The script that is run before the container is stopped. Example: <code>{&quot;exec&quot;:{&quot;command&quot;:[&quot;cat&quot;,&quot;/etc/group&quot;]}}</code></p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;exec&quot;:{&quot;command&quot;:[&quot;cat&quot;,&quot;/etc/group&quot;]}}</p>
         */
        @NameInMap("PreStop")
        public String preStop;

        /**
         * <p>The programming language that is used to create the application. Valid values:</p>
         * <ul>
         * <li><strong>java</strong>: Java</li>
         * <li><strong>php</strong>: PHP</li>
         * <li><strong>other</strong>: Other programming languages, such as Python, C++, Go, .NET, and Node.js.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>java</p>
         */
        @NameInMap("ProgrammingLanguage")
        public String programmingLanguage;

        /**
         * <strong>example:</strong>
         * <p>{&quot;serviceName&quot;:&quot;bwm-poc-sc-gateway-cn-beijing-front&quot;,&quot;namespaceId&quot;:&quot;cn-beijing:front&quot;,&quot;portAndProtocol&quot;:{&quot;18012&quot;:&quot;TCP&quot;},&quot;enable&quot;:true}</p>
         */
        @NameInMap("PvtzDiscovery")
        public String pvtzDiscovery;

        /**
         * <strong>example:</strong>
         * <p>PYTHON 3.9.15</p>
         */
        @NameInMap("Python")
        public String python;

        /**
         * <strong>example:</strong>
         * <p>Flask==2.0</p>
         */
        @NameInMap("PythonModules")
        public String pythonModules;

        /**
         * <p>The details of the health check that was performed on the container. If the container fails this health check multiple times, the system disables and restarts the container. Containers that fail health checks cannot receive traffic from Server Load Balancer (SLB) instances. You can use the <strong>exec</strong>, <strong>httpGet</strong>, or <strong>tcpSocket</strong> method to perform health checks. For more information, see the description of the <strong>Liveness</strong> parameter.</p>
         * <blockquote>
         * <p> You can use only one method to perform the health check.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;exec&quot;:{&quot;command&quot;:[&quot;curl <a href="http://localhost:8080%22%5D%7D,%22initialDelaySeconds%22:20,%22timeoutSeconds%22:5%7D">http://localhost:8080&quot;]},&quot;initialDelaySeconds&quot;:20,&quot;timeoutSeconds&quot;:5}</a></p>
         */
        @NameInMap("Readiness")
        public String readiness;

        /**
         * <p>The ID of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The number of application instances.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Replicas")
        public Integer replicas;

        /**
         * <p>The ID of the security group.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-wz969ngg2e49q5i4****</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        @NameInMap("ServiceTags")
        public java.util.Map<String, String> serviceTags;

        /**
         * <p>The logging configurations of Log Service.</p>
         * <ul>
         * <li>To use Log Service resources that are automatically created by SAE, set this parameter to <code>[{&quot;logDir&quot;:&quot;&quot;,&quot;logType&quot;:&quot;stdout&quot;},{&quot;logDir&quot;:&quot;/tmp/a.log&quot;}]</code>.</li>
         * <li>To use custom Log Service resources, set this parameter to <code>[{&quot;projectName&quot;:&quot;test-sls&quot;,&quot;logType&quot;:&quot;stdout&quot;,&quot;logDir&quot;:&quot;&quot;,&quot;logstoreName&quot;:&quot;sae&quot;,&quot;logtailName&quot;:&quot;&quot;},{&quot;projectName&quot;:&quot;test&quot;,&quot;logDir&quot;:&quot;/tmp/a.log&quot;,&quot;logstoreName&quot;:&quot;sae&quot;,&quot;logtailName&quot;:&quot;&quot;}]</code>.</li>
         * </ul>
         * <p>The following parameters are involved:</p>
         * <ul>
         * <li><strong>projectName</strong>: the name of the Log Service project.</li>
         * <li><strong>logDir</strong>: the path in which logs are stored.</li>
         * <li><strong>logType</strong>: the log type. <strong>stdout</strong>: the standard output log of the container. You can specify only one stdout value for this parameter. If you leave this parameter empty, file logs are collected.</li>
         * <li><strong>logstoreName</strong>: the name of the Logstore in Log Service.</li>
         * <li><strong>logtailName</strong>: the name of the Logtail configuration in Log Service. If you do not configure this parameter, a new Logtail configuration is created.</li>
         * </ul>
         * <p>If you do not need to modify the logging configurations when you deploy the application, configure the <strong>SlsConfigs</strong> parameter only in the first request. You do not need to include this parameter in subsequent requests. If you no longer need to use Log Service, leave the <strong>SlsConfigs</strong> parameter empty in the request.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;logDir&quot;:&quot;&quot;,&quot;logType&quot;:&quot;stdout&quot;},{&quot;logDir&quot;:&quot;/tmp/a.log&quot;}]</p>
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
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TerminationGracePeriodSeconds")
        public Integer terminationGracePeriodSeconds;

        /**
         * <p>The time zone. Default value: <strong>Asia/Shanghai</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>Asia/Shanghai</p>
         */
        @NameInMap("Timezone")
        public String timezone;

        /**
         * <p>The Tomcat configuration. If you want to delete the configuration, set this parameter to {} or leave this parameter empty. The following parameters are involved:</p>
         * <ul>
         * <li><strong>port</strong>: the port number. Valid values: 1024 to 65535. The root permissions are required to perform operations on ports whose number is smaller than 1024. Enter a value that ranges from 1025 to 65535 because the container has only the admin permissions. If you do not configure this parameter, the default port number 8080 is used.</li>
         * <li><strong>contextPath</strong>: the path. Default value: /. This value indicates the root directory.</li>
         * <li><strong>maxThreads</strong>: the maximum number of connections in the connection pool. Default value: 400.</li>
         * <li><strong>uriEncoding</strong>: the URI encoding scheme in the Tomcat container. Valid values: <strong>UTF-8</strong>, <strong>ISO-8859-1</strong>, <strong>GBK</strong>, and <strong>GB2312</strong>. If you do not configure this parameter, the default value <strong>ISO-8859-1</strong> is used.</li>
         * <li><strong>useBodyEncoding</strong>: indicates whether to use the encoding scheme that is specified by <strong>BodyEncoding for URL</strong>. Default value: <strong>true</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;port&quot;:8080,&quot;contextPath&quot;:&quot;/&quot;,&quot;maxThreads&quot;:400,&quot;uriEncoding&quot;:&quot;ISO-8859-1&quot;,&quot;useBodyEncodingForUri&quot;:true}</p>
         */
        @NameInMap("TomcatConfig")
        public String tomcatConfig;

        /**
         * <p>The deployment policy. If the minimum number of available instances is 1, the value of the <strong>UpdateStrategy</strong> parameter is an empty string (&quot;&quot;). If the minimum number of available instances is greater than 1, the following strategies can be configured:</p>
         * <ul>
         * <li>The application is deployed on an instance. The remaining instances are automatically classified into two release batches whose interval is set to 1. In this case, the parameter is set to <code>{&quot;type&quot;:&quot;GrayBatchUpdate&quot;,&quot;batchUpdate&quot;:{&quot;batch&quot;:2,&quot;releaseType&quot;:&quot;auto&quot;,&quot;batchWaitTime&quot;:1},&quot;grayUpdate&quot;:{&quot;gray&quot;:1}}</code>.</li>
         * <li>The application is deployed on an instance. The remaining instances are manually classified into two release batches. In this case, the parameter is set to <code>{&quot;type&quot;:&quot;GrayBatchUpdate&quot;,&quot;batchUpdate&quot;:{&quot;batch&quot;:2,&quot;releaseType&quot;:&quot;manual&quot;},&quot;grayUpdate&quot;:{&quot;gray&quot;:1}}</code>.</li>
         * <li>All instances are automatically classified into two release batches. The application is deployed on the instances of the two batches in parallel. In this case, the parameter is set to <code>{&quot;type&quot;:&quot;BatchUpdate&quot;,&quot;batchUpdate&quot;:{&quot;batch&quot;:2,&quot;releaseType&quot;:&quot;auto&quot;,&quot;batchWaitTime&quot;:0}}</code></li>
         * </ul>
         * <p>The following parameters are involved:</p>
         * <ul>
         * <li><p><strong>type</strong>: the type of the release policy. Valid values: <strong>GrayBatchUpdate</strong> and <strong>BatchUpdate</strong>.</p>
         * </li>
         * <li><p><strong>batchUpdate</strong>: the phased release policy.</p>
         * <ul>
         * <li><strong>batch</strong>: the number of release batches.</li>
         * <li><strong>releaseType</strong>: the processing method for the batches. Valid values: <strong>auto</strong> and <strong>manual</strong>.</li>
         * <li><strong>batchWaitTime</strong>: the interval between release batches. Unit: seconds.</li>
         * </ul>
         * </li>
         * <li><p><strong>grayUpdate</strong>: the number of release batches in the phased release after a canary release. This parameter is returned only if the <strong>type</strong> parameter is set to <strong>GrayBatchUpdate</strong>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;type&quot;:&quot;GrayBatchUpdate&quot;,&quot;batchUpdate&quot;:{&quot;batch&quot;:2,&quot;releaseType&quot;:&quot;auto&quot;,&quot;batchWaitTime&quot;:1},&quot;grayUpdate&quot;:{&quot;gray&quot;:1}}</p>
         */
        @NameInMap("UpdateStrategy")
        public String updateStrategy;

        /**
         * <p>The ID of the vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-2ze559r1z1bpwqxwp****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The ID of the virtual private cloud (VPC).</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-2ze0i263cnn311nvj****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The option settings in the WAR package. The settings are used to start the application container. The default startup command is <code>java $JAVA_OPTS $CATALINA_OPTS -Options org.apache.catalina.startup.Bootstrap &quot;$@&quot; start</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>custom-option</p>
         */
        @NameInMap("WarStartOptions")
        public String warStartOptions;

        /**
         * <p>The version of the Tomcat container on which the deployment package depends. Valid values:</p>
         * <ul>
         * <li><strong>apache-tomcat-7.0.91</strong></li>
         * <li><strong>apache-tomcat-8.5.42</strong></li>
         * </ul>
         * <p>This parameter is not returned if the <strong>PackageType</strong> parameter is set to <strong>Image</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>apache-tomcat-7.0.91</p>
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

        public DescribeApplicationConfigResponseBodyData setServiceTags(java.util.Map<String, String> serviceTags) {
            this.serviceTags = serviceTags;
            return this;
        }
        public java.util.Map<String, String> getServiceTags() {
            return this.serviceTags;
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
