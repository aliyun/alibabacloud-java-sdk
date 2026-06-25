// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeJobResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code or POP error code. Valid values:</p>
     * <ul>
     * <li><p><strong>2xx</strong>: The request was successful.</p>
     * </li>
     * <li><p><strong>3xx</strong>: The request was redirected.</p>
     * </li>
     * <li><p><strong>4xx</strong>: A request error occurred.</p>
     * </li>
     * <li><p><strong>5xx</strong>: A server error occurred.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The job template information.</p>
     */
    @NameInMap("Data")
    public DescribeJobResponseBodyData data;

    /**
     * <p>The error code.</p>
     * <ul>
     * <li><p>The <strong>ErrorCode</strong> parameter is returned only if the request fails.</p>
     * </li>
     * <li><p>For a list of possible <strong>ErrorCode</strong> values, see the <strong>Error codes</strong> section in this topic.</p>
     * </li>
     * </ul>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>Additional information about the call result.</p>
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
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The request was successful.</p>
     * </li>
     * <li><p><strong>false</strong>: The request failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The trace ID used to query the details of a request.</p>
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
         * <p>The key of the key-value pair in the ConfigMap.</p>
         * 
         * <strong>example:</strong>
         * <p>k1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The container mount path.</p>
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
         * <p>The container mount path.</p>
         * 
         * <strong>example:</strong>
         * <p>/tmp</p>
         */
        @NameInMap("MountPath")
        public String mountPath;

        /**
         * <p>The directory in the Apsara File Storage NAS file system.</p>
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
         * <p>The directory or object that you created in the OSS bucket. An exception is returned if the specified mount directory does not exist.</p>
         * 
         * <strong>example:</strong>
         * <p>data/user.data</p>
         */
        @NameInMap("bucketPath")
        public String bucketPath;

        /**
         * <p>The path in your SAE container. If the path exists, it is overwritten. If the path does not exist, a new path is created.</p>
         * 
         * <strong>example:</strong>
         * <p>/usr/data/user.data</p>
         */
        @NameInMap("mountPath")
        public String mountPath;

        /**
         * <p>Specifies whether the container has read-only access to the mounted resources. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: The path has read-only permissions.</p>
         * </li>
         * <li><p><strong>false</strong>: The path has read and write permissions.</p>
         * </li>
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
         * <p>The ARN of the RAM role that is required to pull images across accounts. For more information, see <a href="https://help.aliyun.com/document_detail/190675.html">Pull images across Alibaba Cloud accounts</a> and <a href="https://help.aliyun.com/document_detail/223585.html">Grant permissions across Alibaba Cloud accounts by using a RAM role</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::123456789012****:role/adminrole</p>
         */
        @NameInMap("AcrAssumeRoleArn")
        public String acrAssumeRoleArn;

        /**
         * <p>The ID of the Container Registry (ACR) Enterprise Edition instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cri-xxxxxx</p>
         */
        @NameInMap("AcrInstanceId")
        public String acrInstanceId;

        /**
         * <p>The description of the job template.</p>
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
         * <p>The name of the job template.</p>
         * 
         * <strong>example:</strong>
         * <p>demo-app</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The maximum number of retries for a failed job.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("BackoffLimit")
        public Long backoffLimit;

        /**
         * <p>The Best-Effort policy.</p>
         */
        @NameInMap("BestEffortType")
        public String bestEffortType;

        /**
         * <p>The image startup command. The command must be an executable that exists in the container. Example:</p>
         * <pre><code>command:
         *       - echo
         *       - abc
         *       - &gt;
         *       - file0
         * </code></pre>
         * <p>In this example, <code>Command=&quot;echo&quot;, CommandArgs=[&quot;abc&quot;, &quot;&gt;&quot;, &quot;file0&quot;]</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>echo</p>
         */
        @NameInMap("Command")
        public String command;

        /**
         * <p>The arguments of the image startup command. The arguments are passed to the <strong>Command</strong> parameter. Format:</p>
         * <p><code>[&quot;a&quot;,&quot;b&quot;]</code></p>
         * <p>In the example of the <strong>Command</strong> parameter, <code>CommandArgs=[&quot;abc&quot;, &quot;&gt;&quot;, &quot;file0&quot;]</code>. In this case, <code>[&quot;abc&quot;, &quot;&gt;&quot;, &quot;file0&quot;]</code> must be converted to a string in the format of a JSON array. If this parameter is not specified, you do not need to configure it.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;a&quot;,&quot;b&quot;]</p>
         */
        @NameInMap("CommandArgs")
        public String commandArgs;

        /**
         * <p>The concurrency policy for the job. Valid values:</p>
         * <ul>
         * <li><p><strong>Forbid</strong>: Forbids concurrent runs. A new job is not created if the previous one has not completed.</p>
         * </li>
         * <li><p><strong>Allow</strong>: Allows concurrent runs.</p>
         * </li>
         * <li><p><strong>Replace</strong>: If the previous job has not completed, the new job replaces it.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Allow</p>
         */
        @NameInMap("ConcurrencyPolicy")
        public String concurrencyPolicy;

        /**
         * <p>The information about the mounted ConfigMap.</p>
         */
        @NameInMap("ConfigMapMountDesc")
        public java.util.List<DescribeJobResponseBodyDataConfigMapMountDesc> configMapMountDesc;

        /**
         * <p>The number of CPU cores that are required by each instance. Unit: millicores. This parameter cannot be set to 0. Only the following fixed specifications are supported:</p>
         * <ul>
         * <li><p><strong>500</strong></p>
         * </li>
         * <li><p><strong>1000</strong></p>
         * </li>
         * <li><p><strong>2000</strong></p>
         * </li>
         * <li><p><strong>4000</strong></p>
         * </li>
         * <li><p><strong>8000</strong></p>
         * </li>
         * <li><p><strong>16000</strong></p>
         * </li>
         * <li><p><strong>32000</strong></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Cpu")
        public Integer cpu;

        /**
         * <p>The custom host mapping in the container. The parameters are described as follows:</p>
         * <ul>
         * <li><p><strong>hostName</strong>: The domain name or hostname.</p>
         * </li>
         * <li><p><strong>ip</strong>: The IP address.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;hostName&quot;:&quot;test.host.name&quot;,&quot;ip&quot;:&quot;0.0.0.0&quot;}]</p>
         */
        @NameInMap("CustomHostAlias")
        public String customHostAlias;

        /**
         * <p>The version of the runtime environment in the HSF framework, such as an Ali-Tomcat container.</p>
         * 
         * <strong>example:</strong>
         * <p>3.5.3</p>
         */
        @NameInMap("EdasContainerVersion")
        public String edasContainerVersion;

        /**
         * <p>The container environment variables. You can define custom variables or reference a ConfigMap. To reference a ConfigMap, you must first create a ConfigMap. For more information, see <a href="https://help.aliyun.com/document_detail/176914.html">CreateConfigMap</a>. The following formats are supported:</p>
         * <ul>
         * <li><p>Define custom variables</p>
         * <ul>
         * <li><p><strong>name</strong>: The name of the environment variable.</p>
         * </li>
         * <li><p><strong>value</strong>: The value of the environment variable.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p>Reference a ConfigMap</p>
         * <ul>
         * <li><p><strong>name</strong>: The name of the environment variable. You can reference a single key or all keys. To reference all keys, enter <code>sae-sys-configmap-all-&lt;ConfigMap name&gt;</code>, for example, <code>sae-sys-configmap-all-test1</code>.</p>
         * </li>
         * <li><p><strong>valueFrom</strong>: The source of the environment variable. Set the value to <code>configMapRef</code>.</p>
         * </li>
         * <li><p><strong>configMapId</strong>: The ID of the ConfigMap.</p>
         * </li>
         * <li><p><strong>key</strong>: The key of the key-value pair. If you reference all keys in the ConfigMap, you do not need to specify this parameter.</p>
         * </li>
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
         * <p>The ID of the Secret.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ImagePullSecrets")
        public String imagePullSecrets;

        /**
         * <p>The image URL. This parameter is required if <strong>Package Type</strong> is set to <strong>Image</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>docker.io/library/nginx:1.14.2</p>
         */
        @NameInMap("ImageUrl")
        public String imageUrl;

        /**
         * <p>The arguments for the startup of a JAR package. The default startup command is <code>$JAVA_HOME/bin/java $JarStartOptions -jar $CATALINA_OPTS &quot;$package_path&quot; $JarStartArgs</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>start</p>
         */
        @NameInMap("JarStartArgs")
        public String jarStartArgs;

        /**
         * <p>The options for the startup of a JAR package. The default startup command is <code>$JAVA_HOME/bin/java $JarStartOptions -jar $CATALINA_OPTS &quot;$package_path&quot; $JarStartArgs</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>-Dtest=true</p>
         */
        @NameInMap("JarStartOptions")
        public String jarStartOptions;

        /**
         * <p>The JDK version that the deployment package requires. The following versions are supported:</p>
         * <ul>
         * <li><p><strong>Open JDK 8</strong></p>
         * </li>
         * <li><p><strong>Open JDK 7</strong></p>
         * </li>
         * <li><p><strong>Dragonwell 11</strong></p>
         * </li>
         * <li><p><strong>Dragonwell 8</strong></p>
         * </li>
         * <li><p><strong>openjdk-8u191-jdk-alpine3.9</strong></p>
         * </li>
         * <li><p><strong>openjdk-7u201-jdk-alpine3.9</strong></p>
         * </li>
         * </ul>
         * <p>This parameter is not applicable if <strong>Package Type</strong> is set to <strong>Image</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>Open JDK 8</p>
         */
        @NameInMap("Jdk")
        public String jdk;

        /**
         * <p>The memory required by each instance, in MB. This value cannot be 0. CPU and memory resources are allocated in fixed ratios. The following combinations are supported:</p>
         * <ul>
         * <li><p><strong>1024</strong>: corresponds to 500 millicores and 1,000 millicores.</p>
         * </li>
         * <li><p><strong>2048</strong>: corresponds to 500, 1,000, and 2,000 millicores.</p>
         * </li>
         * <li><p><strong>4096</strong>: corresponds to 1,000, 2,000, and 4,000 millicores.</p>
         * </li>
         * <li><p><strong>8192</strong>: corresponds to 2,000, 4,000, and 8,000 millicores.</p>
         * </li>
         * <li><p><strong>12288</strong>: corresponds to 12,000 millicores.</p>
         * </li>
         * <li><p><strong>16384</strong>: corresponds to 4,000, 8,000, and 16,000 millicores.</p>
         * </li>
         * <li><p><strong>24576</strong>: corresponds to 12,000 millicores.</p>
         * </li>
         * <li><p><strong>32768</strong>: corresponds to 16,000 millicores.</p>
         * </li>
         * <li><p><strong>65536</strong>: corresponds to 8,000, 16,000, and 32,000 millicores.</p>
         * </li>
         * <li><p><strong>131072</strong>: corresponds to 32,000 millicores.</p>
         * </li>
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
         * <p>The mount target of the Apsara File Storage NAS file system in the job template\&quot;s VPC. You can omit this parameter if the NAS configuration is unchanged during redeployment. To clear the NAS configuration, set this parameter to an empty string (<code>&quot;&quot;</code>).</p>
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
         * <p>The configuration for mounting an Apsara File Storage NAS file system.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;mountPath&quot;:&quot;/test1&quot;,&quot;readOnly&quot;:false,&quot;nasId&quot;:&quot;nasId1&quot;,&quot;mountDomain&quot;:&quot;nasId1.cn-shenzhen.nas.aliyuncs.com&quot;,&quot;nasPath&quot;:&quot;/test1&quot;},{&quot;nasId&quot;:&quot;nasId2&quot;,&quot;mountDomain&quot;:&quot;nasId2.cn-shenzhen.nas.aliyuncs.com&quot;,&quot;readOnly&quot;:false,&quot;nasPath&quot;:&quot;/test2&quot;,&quot;mountPath&quot;:&quot;/test2&quot;}]</p>
         */
        @NameInMap("NasConfigs")
        public String nasConfigs;

        /**
         * <p>The ID of the Apsara File Storage NAS file system.</p>
         * 
         * <strong>example:</strong>
         * <p>AKSN89**</p>
         */
        @NameInMap("NasId")
        public String nasId;

        /**
         * <p>The AccessKey ID for accessing Object Storage Service (OSS) buckets.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("OssAkId")
        public String ossAkId;

        /**
         * <p>The AccessKey secret for accessing OSS buckets.</p>
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
        public java.util.List<DescribeJobResponseBodyDataOssMountDescs> ossMountDescs;

        /**
         * <p>The type of the job package. Valid values:</p>
         * <ul>
         * <li><p>For Java deployments, <strong>FatJar</strong>, <strong>War</strong>, and <strong>Image</strong> are supported.</p>
         * </li>
         * <li><p>For PHP deployments, the following package types are supported:</p>
         * <ul>
         * <li><p><strong>PhpZip</strong></p>
         * </li>
         * <li><p><strong>IMAGE_PHP_5_4</strong></p>
         * </li>
         * <li><p><strong>IMAGE_PHP_5_4_ALPINE</strong></p>
         * </li>
         * <li><p><strong>IMAGE_PHP_5_5</strong></p>
         * </li>
         * <li><p><strong>IMAGE_PHP_5_5_ALPINE</strong></p>
         * </li>
         * <li><p><strong>IMAGE_PHP_5_6</strong></p>
         * </li>
         * <li><p><strong>IMAGE_PHP_5_6_ALPINE</strong></p>
         * </li>
         * <li><p><strong>IMAGE_PHP_7_0</strong></p>
         * </li>
         * <li><p><strong>IMAGE_PHP_7_0_ALPINE</strong></p>
         * </li>
         * <li><p><strong>IMAGE_PHP_7_1</strong></p>
         * </li>
         * <li><p><strong>IMAGE_PHP_7_1_ALPINE</strong></p>
         * </li>
         * <li><p><strong>IMAGE_PHP_7_2</strong></p>
         * </li>
         * <li><p><strong>IMAGE_PHP_7_2_ALPINE</strong></p>
         * </li>
         * <li><p><strong>IMAGE_PHP_7_3</strong></p>
         * </li>
         * <li><p><strong>IMAGE_PHP_7_3_ALPINE</strong></p>
         * </li>
         * </ul>
         * </li>
         * <li><p>For Python deployments, <strong>PythonZip</strong> and <strong>Image</strong> are supported.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>War</p>
         */
        @NameInMap("PackageType")
        public String packageType;

        /**
         * <p>The URL of the package. This parameter is required if <strong>Package Type</strong> is set to <strong>FatJar</strong> or <strong>War</strong>.</p>
         */
        @NameInMap("PackageUrl")
        public String packageUrl;

        /**
         * <p>The version of the package. This parameter is required if <strong>Package Type</strong> is set to <strong>FatJar</strong> or <strong>War</strong>.</p>
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
         * <p>The mount path of the PHP job startup configuration. Make sure that the PHP server uses this configuration to start.</p>
         * 
         * <strong>example:</strong>
         * <p>/usr/local/etc/php/php.ini</p>
         */
        @NameInMap("PhpConfigLocation")
        public String phpConfigLocation;

        /**
         * <p>The script to execute after the container starts. This script runs immediately after the system creates the container. Example: <code>{&quot;exec&quot;:{&quot;command&quot;:[&quot;cat&quot;,&quot;/etc/group&quot;]}}</code></p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;exec&quot;:{&quot;command&quot;:[&quot;cat&quot;,&quot;/etc/group&quot;]}}</p>
         */
        @NameInMap("PostStart")
        public String postStart;

        /**
         * <p>The script to execute before the container stops. This script runs before the system deletes the container. Example: <code>{&quot;exec&quot;:{&quot;command&quot;:[&quot;cat&quot;,&quot;/etc/group&quot;]}}</code></p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;exec&quot;:{&quot;command&quot;:[&quot;cat&quot;,&quot;/etc/group&quot;]}}</p>
         */
        @NameInMap("PreStop")
        public String preStop;

        /**
         * <p>The programming language that is used for the job template. Valid values:</p>
         * <ul>
         * <li><p><strong>java</strong>: Java</p>
         * </li>
         * <li><p><strong>php</strong>: PHP</p>
         * </li>
         * <li><p><strong>python</strong>: Python</p>
         * </li>
         * <li><p><strong>other</strong>: Other languages, such as C++, Go, .NET, and Node.js.</p>
         * </li>
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
         * <p>The Python environment. PYTHON 3.9.15 is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>PYTHON 3.9.15</p>
         */
        @NameInMap("Python")
        public String python;

        /**
         * <p>The Python module dependencies to install. By default, SAE installs dependencies from a <code>requirements.txt</code> file in the package\&quot;s root directory. Use this parameter to specify dependencies if a <code>requirements.txt</code> file is not present or to add extra modules.</p>
         * 
         * <strong>example:</strong>
         * <p>Flask==2.0</p>
         */
        @NameInMap("PythonModules")
        public String pythonModules;

        /**
         * <p>The ID of the referenced job template.</p>
         * 
         * <strong>example:</strong>
         * <p>7171a6ca-d1cd-4928-8642-7d5cfe69****</p>
         */
        @NameInMap("RefAppId")
        public String refAppId;

        /**
         * <p>The IDs of job templates that reference this template.</p>
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
         * <p>The number of job instances.</p>
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
         * <p>Specifies whether to enable job sharding.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Slice")
        public Boolean slice;

        /**
         * <p>The parameters for job sharding.</p>
         * 
         * <strong>example:</strong>
         * <p>SliceEnvs</p>
         */
        @NameInMap("SliceEnvs")
        public String sliceEnvs;

        /**
         * <p>The configuration for collecting logs to Log Service (SLS).</p>
         * <ul>
         * <li><p>Use an SLS resource that SAE automatically creates: <code>[{&quot;logDir&quot;:&quot;&quot;,&quot;logType&quot;:&quot;stdout&quot;},{&quot;logDir&quot;:&quot;/tmp/a.log&quot;}]</code>.</p>
         * </li>
         * <li><p>Use a custom SLS resource: <code>[{&quot;projectName&quot;:&quot;test-sls&quot;,&quot;logType&quot;:&quot;stdout&quot;,&quot;logDir&quot;:&quot;&quot;,&quot;logstoreName&quot;:&quot;sae&quot;,&quot;logtailName&quot;:&quot;&quot;},{&quot;projectName&quot;:&quot;test&quot;,&quot;logDir&quot;:&quot;/tmp/a.log&quot;,&quot;logstoreName&quot;:&quot;sae&quot;,&quot;logtailName&quot;:&quot;&quot;}]</code>.</p>
         * </li>
         * </ul>
         * <p>The parameters are described as follows:</p>
         * <ul>
         * <li><p><strong>projectName</strong>: The name of the SLS project.</p>
         * </li>
         * <li><p><strong>logDir</strong>: The log path.</p>
         * </li>
         * <li><p><strong>logType</strong>: The log type. <strong>stdout</strong> specifies the container\&quot;s standard output logs. You can specify only one log of the stdout type. If this parameter is omitted, file logs are collected.</p>
         * </li>
         * <li><p><strong>logstoreName</strong>: The name of the Logstore in SLS.</p>
         * </li>
         * <li><p><strong>logtailName</strong>: The name of the Logtail configuration in SLS. If you do not specify this parameter, a new Logtail configuration is created.</p>
         * </li>
         * </ul>
         * <p>You can omit this parameter if the Log Service configuration is unchanged during redeployment. To disable log collection, set this parameter to an empty string (<code>&quot;&quot;</code>).</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;logDir&quot;:&quot;&quot;,&quot;logType&quot;:&quot;stdout&quot;},{&quot;logDir&quot;:&quot;/tmp/a.log&quot;}]</p>
         */
        @NameInMap("SlsConfigs")
        public String slsConfigs;

        /**
         * <p>Specifies whether to suspend the job template.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Suspend")
        public Boolean suspend;

        /**
         * <p>The tags of the job template.</p>
         */
        @NameInMap("Tags")
        public java.util.List<DescribeJobResponseBodyDataTags> tags;

        /**
         * <p>The timeout for a graceful stop, in seconds. Default: 30. Valid values: 1 to 300.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TerminationGracePeriodSeconds")
        public Integer terminationGracePeriodSeconds;

        /**
         * <p>The timeout period for the job. Unit: seconds.</p>
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
         * <p>The Tomcat file configuration. To delete the configuration, set this parameter to &quot;&quot; or &quot;{}&quot;.</p>
         * <ul>
         * <li><p><strong>port</strong>: The port number. Valid values: 1024 to 65535. Ports below 1024 are reserved. If you do not specify a port, the default value is 8080.</p>
         * </li>
         * <li><p><strong>contextPath</strong>: The access path. Default value: /.</p>
         * </li>
         * <li><p><strong>maxThreads</strong>: The maximum number of connections in the connection pool. Default value: 400.</p>
         * </li>
         * <li><p><strong>uriEncoding</strong>: The URI encoding scheme for Tomcat. Valid values: <strong>UTF-8</strong>, <strong>ISO-8859-1</strong>, <strong>GBK</strong>, and <strong>GB2312</strong>. If you do not specify this parameter, the default value <strong>ISO-8859-1</strong> is used.</p>
         * </li>
         * <li><p><strong>useBodyEncodingForUri</strong>: Specifies whether to use the character encoding from the request body for the URI. Default value: <strong>true</strong>.</p>
         * </li>
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
         * <p>The list of private request URLs for the one-time task.</p>
         */
        @NameInMap("VpcWebHookUrls")
        public java.util.List<String> vpcWebHookUrls;

        /**
         * <p>The options for the startup of a WAR package. The default startup command is <code>java $JAVA_OPTS $CATALINA_OPTS -Options org.apache.catalina.startup.Bootstrap &quot;$@&quot; start</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>custom-option</p>
         */
        @NameInMap("WarStartOptions")
        public String warStartOptions;

        /**
         * <p>The version of the Tomcat container on which the package depends. The following versions are supported:</p>
         * <ul>
         * <li><p><strong>apache-tomcat-7.0.91</strong></p>
         * </li>
         * <li><p><strong>apache-tomcat-8.5.42</strong></p>
         * </li>
         * </ul>
         * <p>This parameter is not supported when <strong>Package Type</strong> is set to <strong>Image</strong>.</p>
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
