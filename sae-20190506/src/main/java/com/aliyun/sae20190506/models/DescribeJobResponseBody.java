// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeJobResponseBody extends TeaModel {
    /**
     * <p>The API status code or POP error code. Valid values:</p>
     * <ul>
     * <li><strong>2xx</strong>: Success.</li>
     * <li><strong>3xx</strong>: Redirection.</li>
     * <li><strong>4xx</strong>: Request error.</li>
     * <li><strong>5xx</strong>: Server error.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The task template information.</p>
     */
    @NameInMap("Data")
    public DescribeJobResponseBodyData data;

    /**
     * <p>The error code. </p>
     * <ul>
     * <li>If the request is successful, the <strong>ErrorCode</strong> parameter is not returned.</li>
     * <li>If the request fails, the <strong>ErrorCode</strong> parameter is returned. For more information, see the <strong>Error codes</strong> section in this topic.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>InvalidAppId.NotFound</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The additional information about the call result.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>01CF26C7-00A3-4AA6-BA76-7E95F2A3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the task template configuration was retrieved successfully. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Retrieved successfully.</li>
     * <li><strong>false</strong>: Failed to retrieve.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The trace ID, which is used to accurately query call information.</p>
     * 
     * <strong>example:</strong>
     * <p>ac1a0b2215622246421415014e****</p>
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
         * <p>The key of the ConfigMap.</p>
         * 
         * <strong>example:</strong>
         * <p>k1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The mount path of the container.</p>
         * 
         * <strong>example:</strong>
         * <p>/tmp</p>
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
         * <p>The mount path of the container.</p>
         * 
         * <strong>example:</strong>
         * <p>/tmp</p>
         */
        @NameInMap("MountPath")
        public String mountPath;

        /**
         * <p>The relative file directory of the NAS file system.</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
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
         * 
         * <strong>example:</strong>
         * <p>oss-bucket</p>
         */
        @NameInMap("bucketName")
        public String bucketName;

        /**
         * <p>The directory or OSS object that you created in OSS. If the OSS mount directory does not exist, an exception is triggered.</p>
         * 
         * <strong>example:</strong>
         * <p>data/user.data</p>
         */
        @NameInMap("bucketPath")
        public String bucketPath;

        /**
         * <p>The container path in SAE. If the path already exists, the existing path is overwritten. If the path does not exist, a new path is created.</p>
         * 
         * <strong>example:</strong>
         * <p>/usr/data/user.data</p>
         */
        @NameInMap("mountPath")
        public String mountPath;

        /**
         * <p>Specifies whether the container path has read permissions on the resources in the mount directory. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: read-only permissions.</li>
         * <li><strong>false</strong>: read and write permissions.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
         * 
         * <strong>example:</strong>
         * <p>k1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
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
         * <p>The ARN of the RAM role required to pull images across accounts. For more information, see <a href="https://help.aliyun.com/document_detail/190675.html">Pull Alibaba Cloud images across accounts</a> and <a href="https://help.aliyun.com/document_detail/223585.html">Implement cross-account authorization by using RAM roles</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::123456789012****:role/adminrole</p>
         */
        @NameInMap("AcrAssumeRoleArn")
        public String acrAssumeRoleArn;

        /**
         * <p>The instance ID of the ACR Enterprise instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cri-xxxxxx</p>
         */
        @NameInMap("AcrInstanceId")
        public String acrInstanceId;

        /**
         * <p>The description of the task template.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample application</p>
         */
        @NameInMap("AppDescription")
        public String appDescription;

        /**
         * <p>The ID of the job template.</p>
         * 
         * <strong>example:</strong>
         * <p>7171a6ca-d1cd-4928-8642-7d5cfe69****</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The name of the task template.</p>
         * 
         * <strong>example:</strong>
         * <p>demo-app</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The number of task retries.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("BackoffLimit")
        public Long backoffLimit;

        /**
         * <p>The best-effort policy.</p>
         * 
         * <strong>example:</strong>
         * <p>besteffort</p>
         */
        @NameInMap("BestEffortType")
        public String bestEffortType;

        /**
         * <p>The image startup command. The command must be an executable object that exists in the container. Example:</p>
         * <pre><code>command:
         *       - echo
         *       - abc
         *       - &gt;
         *       - file0
         * </code></pre>
         * <p>Based on the preceding example, <code>Command=&quot;echo&quot;</code> and <code>CommandArgs=[&quot;abc&quot;, &quot;&gt;&quot;, &quot;file0&quot;]</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>echo</p>
         */
        @NameInMap("Command")
        public String command;

        /**
         * <p>The parameters for the image startup command. These are the parameters required by the <strong>Command</strong> startup command. Format:</p>
         * <p><code>[&quot;a&quot;,&quot;b&quot;]</code></p>
         * <p>In the example of the <strong>Command</strong> parameter, <code>CommandArgs=[&quot;abc&quot;, &quot;&gt;&quot;, &quot;file0&quot;]</code>. The <code>[&quot;abc&quot;, &quot;&gt;&quot;, &quot;file0&quot;]</code> part must be converted to a string in JSON array format. If this parameter is not required, you do not need to specify it.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;a&quot;,&quot;b&quot;]</p>
         */
        @NameInMap("CommandArgs")
        public String commandArgs;

        /**
         * <p>The task concurrency policy. Valid values:</p>
         * <ul>
         * <li><strong>Forbid</strong>: forbids concurrent execution. A new task is not created if the previous task is not completed.</li>
         * <li><strong>Allow</strong>: allows concurrent execution of tasks.</li>
         * <li><strong>Replace</strong>: replaces the previous task with a new task if the previous task is not completed when the creation time of the new task arrives.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Allow</p>
         */
        @NameInMap("ConcurrencyPolicy")
        public String concurrencyPolicy;

        /**
         * <p>The ConfigMap information.</p>
         */
        @NameInMap("ConfigMapMountDesc")
        public java.util.List<DescribeJobResponseBodyDataConfigMapMountDesc> configMapMountDesc;

        /**
         * <p>The CPU required for each instance. Unit: millicores. The value cannot be 0. Only the following defined specifications are supported:</p>
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
         * <p>The custom host mapping in the container. Valid values:</p>
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
         * <p>The runtime environment version of the task in the HSF framework, such as the Ali-Tomcat container.</p>
         * 
         * <strong>example:</strong>
         * <p>3.5.3</p>
         */
        @NameInMap("EdasContainerVersion")
        public String edasContainerVersion;

        /**
         * <p>The container environment variable parameters. You can customize environment variables or reference ConfigMaps. To reference a ConfigMap, create a ConfigMap instance first. For more information, see <a href="https://help.aliyun.com/document_detail/176914.html">CreateConfigMap</a>. Valid values:</p>
         * <ul>
         * <li>Custom configuration:<ul>
         * <li><strong>name</strong>: the name of the environment variable.</li>
         * <li><strong>value</strong>: the value of the environment variable.</li>
         * </ul>
         * </li>
         * <li>Reference ConfigMap:<ul>
         * <li><strong>name</strong>: the name of the environment variable. You can reference a single key or all keys. To reference all keys, enter <code>sae-sys-configmap-all-&lt;ConfigMap name&gt;</code>, for example, <code>sae-sys-configmap-all-test1</code>.</li>
         * <li><strong>valueFrom</strong>: the environment variable reference. Set the value to <code>configMapRef</code>.</li>
         * <li><strong>configMapId</strong>: the ConfigMap ID.</li>
         * <li><strong>key</strong>: the key. If you reference all key-value pairs, do not set this field.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;name&quot;:&quot;TEST_ENV_KEY&quot;,&quot;value&quot;:&quot;TEST_ENV_VAR&quot;}]</p>
         */
        @NameInMap("Envs")
        public String envs;

        /**
         * <p>The ID of the corresponding secret.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ImagePullSecrets")
        public String imagePullSecrets;

        /**
         * <p>The image address. This parameter is required when <strong>PackageType</strong> is set to <strong>Image</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>docker.io/library/nginx:1.14.2</p>
         */
        @NameInMap("ImageUrl")
        public String imageUrl;

        /**
         * <p>The startup parameters for the JAR package task. Default task startup command: <code>$JAVA_HOME/bin/java $JarStartOptions -jar $CATALINA_OPTS &quot;$package_path&quot; $JarStartArgs</code></p>
         * 
         * <strong>example:</strong>
         * <p>start</p>
         */
        @NameInMap("JarStartArgs")
        public String jarStartArgs;

        /**
         * <p>The startup options for the JAR package task. Default task startup command: <code>$JAVA_HOME/bin/java $JarStartOptions -jar $CATALINA_OPTS &quot;$package_path&quot; $JarStartArgs</code></p>
         * 
         * <strong>example:</strong>
         * <p>-Dtest=true</p>
         */
        @NameInMap("JarStartOptions")
        public String jarStartOptions;

        /**
         * <p>The JDK version required by the deployment package. Valid values:</p>
         * <ul>
         * <li><strong>Open JDK 8</strong></li>
         * <li><strong>Open JDK 7</strong></li>
         * <li><strong>Dragonwell 11</strong></li>
         * <li><strong>Dragonwell 8</strong></li>
         * <li><strong>openjdk-8u191-jdk-alpine3.9</strong></li>
         * <li><strong>openjdk-7u201-jdk-alpine3.9</strong></li>
         * </ul>
         * <p>This parameter is not supported when <strong>PackageType</strong> is set to <strong>Image</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>Open JDK 8</p>
         */
        @NameInMap("Jdk")
        public String jdk;

        /**
         * <p>The memory required for each instance. Unit: MB. The value cannot be 0. The memory has a one-to-one mapping with the CPU. Only the following defined specifications are supported:</p>
         * <ul>
         * <li><strong>1024</strong>: corresponds to 500 millicores and 1000 millicores.</li>
         * <li><strong>2048</strong>: corresponds to 500, 1000, and 2000 millicores.</li>
         * <li><strong>4096</strong>: corresponds to 1000, 2000, and 4000 millicores.</li>
         * <li><strong>8192</strong>: corresponds to 2000, 4000, and 8000 millicores.</li>
         * <li><strong>12288</strong>: corresponds to 12000 millicores.</li>
         * <li><strong>16384</strong>: corresponds to 4000, 8000, and 16000 millicores.</li>
         * <li><strong>24576</strong>: corresponds to 12000 millicores.</li>
         * <li><strong>32768</strong>: corresponds to 16000 millicores.</li>
         * <li><strong>65536</strong>: corresponds to 8000, 16000, and 32000 millicores.</li>
         * <li><strong>131072</strong>: corresponds to 32000 millicores.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2048</p>
         */
        @NameInMap("Memory")
        public Integer memory;

        /**
         * <p>The mount description.</p>
         */
        @NameInMap("MountDesc")
        public java.util.List<DescribeJobResponseBodyDataMountDesc> mountDesc;

        /**
         * <p>The mount target of the NAS file system in the VPC of the task template. If the configuration remains unchanged during deployment, you do not need to set this parameter (that is, the <strong>MountHost</strong> field is not required in the request). If you need to clear the NAS configuration, you must set the value of this field to an empty string (that is, set <strong>MountHost</strong> to &quot;&quot;) in the request.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("MountHost")
        public String mountHost;

        /**
         * <p>The namespace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing:test</p>
         */
        @NameInMap("NamespaceId")
        public String namespaceId;

        /**
         * <p>The configuration for mounting NAS.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;mountPath&quot;:&quot;/test1&quot;,&quot;readOnly&quot;:false,&quot;nasId&quot;:&quot;nasId1&quot;,&quot;mountDomain&quot;:&quot;nasId1.cn-shenzhen.nas.aliyuncs.com&quot;,&quot;nasPath&quot;:&quot;/test1&quot;},{&quot;nasId&quot;:&quot;nasId2&quot;,&quot;mountDomain&quot;:&quot;nasId2.cn-shenzhen.nas.aliyuncs.com&quot;,&quot;readOnly&quot;:false,&quot;nasPath&quot;:&quot;/test2&quot;,&quot;mountPath&quot;:&quot;/test2&quot;}]</p>
         */
        @NameInMap("NasConfigs")
        public String nasConfigs;

        /**
         * <p>The NAS ID.</p>
         * 
         * <strong>example:</strong>
         * <p>AKSN89**</p>
         */
        @NameInMap("NasId")
        public String nasId;

        /**
         * <p>The AccessKey ID for OSS read and write operations.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("OssAkId")
        public String ossAkId;

        /**
         * <p>The AccessKey Secret for OSS read and write operations.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("OssAkSecret")
        public String ossAkSecret;

        /**
         * <p>The OSS mount description.</p>
         */
        @NameInMap("OssMountDescs")
        public java.util.List<DescribeJobResponseBodyDataOssMountDescs> ossMountDescs;

        /**
         * <p>The task package type. Valid values:</p>
         * <ul>
         * <li>If you deploy the task by using Java, valid values are <strong>FatJar</strong>, <strong>War</strong>, and <strong>Image</strong>.</li>
         * <li>If you deploy the task by using PHP, valid values are:<ul>
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
         * <li>If you deploy the task by using Python, valid values are <strong>PythonZip</strong> and <strong>Image</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>War</p>
         */
        @NameInMap("PackageType")
        public String packageType;

        /**
         * <p>The deployment package URL. This parameter is required when <strong>PackageType</strong> is set to <strong>FatJar</strong> or <strong>War</strong>.</p>
         */
        @NameInMap("PackageUrl")
        public String packageUrl;

        /**
         * <p>The version number of the deployment package. This parameter is required when <strong>PackageType</strong> is set to <strong>FatJar</strong> or <strong>War</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("PackageVersion")
        public String packageVersion;

        /**
         * <p>The content of the PHP configuration file.</p>
         * 
         * <strong>example:</strong>
         * <p>k1=v1</p>
         */
        @NameInMap("PhpConfig")
        public String phpConfig;

        /**
         * <p>The mount path of the PHP task startup configuration. You must ensure that the PHP server uses this configuration file to start.</p>
         * 
         * <strong>example:</strong>
         * <p>/usr/local/etc/php/php.ini</p>
         */
        @NameInMap("PhpConfigLocation")
        public String phpConfigLocation;

        /**
         * <p>The script to execute after the container starts. A script is triggered and executed immediately after the container is created. Format: <code>{&quot;exec&quot;:{&quot;command&quot;:[&quot;cat&quot;,&quot;/etc/group&quot;]}}</code></p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;exec&quot;:{&quot;command&quot;:[&quot;cat&quot;,&quot;/etc/group&quot;]}}</p>
         */
        @NameInMap("PostStart")
        public String postStart;

        /**
         * <p>The script to execute before the container stops. A script is triggered and executed before the container is deleted. Format: <code>{&quot;exec&quot;:{&quot;command&quot;:[&quot;cat&quot;,&quot;/etc/group&quot;]}}</code></p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;exec&quot;:{&quot;command&quot;:[&quot;cat&quot;,&quot;/etc/group&quot;]}}</p>
         */
        @NameInMap("PreStop")
        public String preStop;

        /**
         * <p>The programming language of the technology stack used to create the task template. Valid values:</p>
         * <ul>
         * <li><strong>java</strong>: Java.</li>
         * <li><strong>php</strong>: PHP.</li>
         * <li><strong>python</strong>: Python.</li>
         * <li><strong>other</strong>: Multiple languages, such as C++, Go, .NET, and Node.js.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>java</p>
         */
        @NameInMap("ProgrammingLanguage")
        public String programmingLanguage;

        /**
         * <p>The list of public request URLs for the one-time task.</p>
         */
        @NameInMap("PublicWebHookUrls")
        public java.util.List<String> publicWebHookUrls;

        /**
         * <p>The Python environment. Python 3.9.15 is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>PYTHON 3.9.15</p>
         */
        @NameInMap("Python")
        public String python;

        /**
         * <p>The module dependencies for custom installation. By default, the dependencies defined in the requirements.txt file in the root folder are installed. If no custom package is configured, you can specify the dependencies to install.</p>
         * 
         * <strong>example:</strong>
         * <p>Flask==2.0</p>
         */
        @NameInMap("PythonModules")
        public String pythonModules;

        /**
         * <p>The ID of the referenced task template.</p>
         * 
         * <strong>example:</strong>
         * <p>7171a6ca-d1cd-4928-8642-7d5cfe69****</p>
         */
        @NameInMap("RefAppId")
        public String refAppId;

        /**
         * <p>The list of IDs of the referenced task targets.</p>
         */
        @NameInMap("RefedAppIds")
        public java.util.List<String> refedAppIds;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The number of task instances.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Replicas")
        public Integer replicas;

        /**
         * <p>The security group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-wz969ngg2e49q5i4****</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>Specifies whether to enable task slicing.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Slice")
        public Boolean slice;

        /**
         * <p>The task slicing parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>SliceEnvs</p>
         */
        @NameInMap("SliceEnvs")
        public String sliceEnvs;

        /**
         * <p>The configuration for collecting logs to Simple Log Service (SLS).</p>
         * <ul>
         * <li>To use SLS resources automatically created by Serverless App Engine (SAE): <code>[{&quot;logDir&quot;:&quot;&quot;,&quot;logType&quot;:&quot;stdout&quot;},{&quot;logDir&quot;:&quot;/tmp/a.log&quot;}]</code>.</li>
         * <li>To use custom SLS resources: <code>[{&quot;projectName&quot;:&quot;test-sls&quot;,&quot;logType&quot;:&quot;stdout&quot;,&quot;logDir&quot;:&quot;&quot;,&quot;logstoreName&quot;:&quot;sae&quot;,&quot;logtailName&quot;:&quot;&quot;},{&quot;projectName&quot;:&quot;test&quot;,&quot;logDir&quot;:&quot;/tmp/a.log&quot;,&quot;logstoreName&quot;:&quot;sae&quot;,&quot;logtailName&quot;:&quot;&quot;}]</code>.</li>
         * </ul>
         * <p>Parameter descriptions:</p>
         * <ul>
         * <li><strong>projectName</strong>: the name of the SLS project.  </li>
         * <li><strong>logDir</strong>: the log path.</li>
         * <li><strong>logType</strong>: the log type. <strong>stdout</strong> indicates container standard output logs. Only one <strong>stdout</strong> log can be set. If this parameter is not set, file logs are collected.</li>
         * <li><strong>logstoreName</strong>: the name of the SLS Logstore.</li>
         * <li><strong>logtailName</strong>: the name of the SLS Logtail. If this parameter is not specified, a new Logtail is created.</li>
         * </ul>
         * <p>If the SLS collection configuration remains unchanged during multiple deployments, you do not need to set this parameter (that is, the <strong>SlsConfigs</strong> field is not required in the request). If you no longer need the SLS collection feature, you must set the value of this field to an empty string (that is, set <strong>SlsConfigs</strong> to &quot;&quot;) in the request.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;logDir&quot;:&quot;&quot;,&quot;logType&quot;:&quot;stdout&quot;},{&quot;logDir&quot;:&quot;/tmp/a.log&quot;}]</p>
         */
        @NameInMap("SlsConfigs")
        public String slsConfigs;

        /**
         * <p>Specifies whether to suspend the task template.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Suspend")
        public Boolean suspend;

        /**
         * <p>The tag information.</p>
         */
        @NameInMap("Tags")
        public java.util.List<DescribeJobResponseBodyDataTags> tags;

        /**
         * <p>The graceful shutdown timeout period. Default value: 30. Unit: seconds. Valid values: 1 to 300.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TerminationGracePeriodSeconds")
        public Integer terminationGracePeriodSeconds;

        /**
         * <p>The task timeout period. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        @NameInMap("Timeout")
        public Long timeout;

        /**
         * <p>The time zone. Default value: <strong>Asia/Shanghai</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>Asia/Shanghai</p>
         */
        @NameInMap("Timezone")
        public String timezone;

        /**
         * <p>The Tomcat file configuration. Set this parameter to &quot;&quot; or &quot;{}&quot; to delete the configuration:</p>
         * <ul>
         * <li><strong>port</strong>: the port range is 1024 to 65535. Ports smaller than 1024 require root permissions. Because the container is configured with admin permissions, specify a port greater than 1024. Default value: 8080.</li>
         * <li><strong>contextPath</strong>: the access path. Default value: the root directory &quot;/&quot;.</li>
         * <li><strong>maxThreads</strong>: the maximum number of connections in the connection pool. Default value: 400.</li>
         * <li><strong>uriEncoding</strong>: the Tomcat encoding format. Valid values: <strong>UTF-8</strong>, <strong>ISO-8859-1</strong>, <strong>GBK</strong>, and <strong>GB2312</strong>. Default value: <strong>ISO-8859-1</strong>.</li>
         * <li><strong>useBodyEncoding</strong>: specifies whether to use <strong>BodyEncoding for URL</strong>. Default value: <strong>true</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;port&quot;:8080,&quot;contextPath&quot;:&quot;/&quot;,&quot;maxThreads&quot;:400,&quot;uriEncoding&quot;:&quot;ISO-8859-1&quot;,&quot;useBodyEncodingForUri&quot;:true}</p>
         */
        @NameInMap("TomcatConfig")
        public String tomcatConfig;

        @NameInMap("TriggerConfig")
        public String triggerConfig;

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-2ze559r1z1bpwqxwp****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The VPC ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-2ze0i263cnn311nvj****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The list of internal request URLs for one-time tasks.</p>
         */
        @NameInMap("VpcWebHookUrls")
        public java.util.List<String> vpcWebHookUrls;

        /**
         * <p>The startup options for the WAR package task. Default task startup command: <code>java $JAVA_OPTS $CATALINA_OPTS -Options org.apache.catalina.startup.Bootstrap &quot;$@&quot; start</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>custom-option</p>
         */
        @NameInMap("WarStartOptions")
        public String warStartOptions;

        /**
         * <p>The Tomcat version required by the deployment package. Valid values:</p>
         * <ul>
         * <li><strong>apache-tomcat-7.0.91</strong></li>
         * <li><strong>apache-tomcat-8.5.42</strong></li>
         * </ul>
         * <p>This parameter is not supported when <strong>PackageType</strong> is set to <strong>Image</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>apache-tomcat-7.0.91</p>
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

        public DescribeJobResponseBodyData setBestEffortType(String bestEffortType) {
            this.bestEffortType = bestEffortType;
            return this;
        }
        public String getBestEffortType() {
            return this.bestEffortType;
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
