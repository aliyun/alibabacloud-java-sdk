// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeApplicationConfigResponseBody extends TeaModel {
    /**
     * <p>The API status or POP error code. Valid values:</p>
     * <ul>
     * <li><strong>2xx</strong>: success.</li>
     * <li><strong>3xx</strong>: redirection.</li>
     * <li><strong>4xx</strong>: request error.</li>
     * <li><strong>5xx</strong>: server error.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The application information.</p>
     */
    @NameInMap("Data")
    public DescribeApplicationConfigResponseBodyData data;

    /**
     * <p>The error code. Valid values:</p>
     * <ul>
     * <li>If the request is successful, the <strong>ErrorCode</strong> field is not returned.</li>
     * <li>If the request fails, the <strong>ErrorCode</strong> field is returned. For more information, see the <strong>Error codes</strong> section in this topic.</li>
     * </ul>
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
     * <p>Indicates whether the application configuration information is retrieved. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Retrieved.</li>
     * <li><strong>false</strong>: Failed to retrieve.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The trace ID, which is used to query the details of a call.</p>
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
         * <p>ConfigMap ID。</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ConfigMapId")
        public Long configMapId;

        /**
         * <p>The ConfigMap name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ConfigMapName")
        public String configMapName;

        /**
         * <p>The ConfigMap key-value pair.</p>
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

    public static class DescribeApplicationConfigResponseBodyDataEmptyDirDesc extends TeaModel {
        /**
         * <p>The mount path.</p>
         */
        @NameInMap("MountPath")
        public String mountPath;

        /**
         * <p>The temporary storage name.</p>
         */
        @NameInMap("Name")
        public String name;

        public static DescribeApplicationConfigResponseBodyDataEmptyDirDesc build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationConfigResponseBodyDataEmptyDirDesc self = new DescribeApplicationConfigResponseBodyDataEmptyDirDesc();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationConfigResponseBodyDataEmptyDirDesc setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

        public DescribeApplicationConfigResponseBodyDataEmptyDirDesc setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeApplicationConfigResponseBodyDataInitContainersConfigConfigMapMountDesc extends TeaModel {
        /**
         * <p>ConfigMap ID。</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ConfigMapId")
        public Long configMapId;

        /**
         * <p>The ConfigMap name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ConfigMapName")
        public String configMapName;

        /**
         * <p>The ConfigMap key-value pair.</p>
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

        public static DescribeApplicationConfigResponseBodyDataInitContainersConfigConfigMapMountDesc build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationConfigResponseBodyDataInitContainersConfigConfigMapMountDesc self = new DescribeApplicationConfigResponseBodyDataInitContainersConfigConfigMapMountDesc();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationConfigResponseBodyDataInitContainersConfigConfigMapMountDesc setConfigMapId(Long configMapId) {
            this.configMapId = configMapId;
            return this;
        }
        public Long getConfigMapId() {
            return this.configMapId;
        }

        public DescribeApplicationConfigResponseBodyDataInitContainersConfigConfigMapMountDesc setConfigMapName(String configMapName) {
            this.configMapName = configMapName;
            return this;
        }
        public String getConfigMapName() {
            return this.configMapName;
        }

        public DescribeApplicationConfigResponseBodyDataInitContainersConfigConfigMapMountDesc setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeApplicationConfigResponseBodyDataInitContainersConfigConfigMapMountDesc setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

    }

    public static class DescribeApplicationConfigResponseBodyDataInitContainersConfigEmptyDirDesc extends TeaModel {
        /**
         * <p>The mount path of the data volume in the container.</p>
         */
        @NameInMap("MountPath")
        public String mountPath;

        /**
         * <p>The temporary storage name.</p>
         */
        @NameInMap("Name")
        public String name;

        public static DescribeApplicationConfigResponseBodyDataInitContainersConfigEmptyDirDesc build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationConfigResponseBodyDataInitContainersConfigEmptyDirDesc self = new DescribeApplicationConfigResponseBodyDataInitContainersConfigEmptyDirDesc();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationConfigResponseBodyDataInitContainersConfigEmptyDirDesc setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

        public DescribeApplicationConfigResponseBodyDataInitContainersConfigEmptyDirDesc setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeApplicationConfigResponseBodyDataInitContainersConfigSecretMountDesc extends TeaModel {
        /**
         * <p>The key.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The mount path.</p>
         */
        @NameInMap("MountPath")
        public String mountPath;

        /**
         * <p>The Secret instance ID.</p>
         */
        @NameInMap("SecretId")
        public Long secretId;

        /**
         * <p>The Secret instance name.</p>
         */
        @NameInMap("SecretName")
        public String secretName;

        public static DescribeApplicationConfigResponseBodyDataInitContainersConfigSecretMountDesc build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationConfigResponseBodyDataInitContainersConfigSecretMountDesc self = new DescribeApplicationConfigResponseBodyDataInitContainersConfigSecretMountDesc();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationConfigResponseBodyDataInitContainersConfigSecretMountDesc setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeApplicationConfigResponseBodyDataInitContainersConfigSecretMountDesc setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

        public DescribeApplicationConfigResponseBodyDataInitContainersConfigSecretMountDesc setSecretId(Long secretId) {
            this.secretId = secretId;
            return this;
        }
        public Long getSecretId() {
            return this.secretId;
        }

        public DescribeApplicationConfigResponseBodyDataInitContainersConfigSecretMountDesc setSecretName(String secretName) {
            this.secretName = secretName;
            return this;
        }
        public String getSecretName() {
            return this.secretName;
        }

    }

    public static class DescribeApplicationConfigResponseBodyDataInitContainersConfig extends TeaModel {
        /**
         * <p>The image startup command. This command must be an executable object that exists in the container. Example:</p>
         * <pre><code>command:
         *       - echo
         *       - abc
         *       - &gt;
         *       - file0
         * </code></pre>
         * <p>Based on the preceding example, <code>Command=&quot;echo&quot;, CommandArgs=[&quot;abc&quot;, &quot;&gt;&quot;, &quot;file0&quot;]</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>/bin/sh</p>
         */
        @NameInMap("Command")
        public String command;

        /**
         * <p>The arguments for the image startup command. These are the arguments required by the startup command <strong>Command</strong>. Format:</p>
         * <p><code>[&quot;a&quot;,&quot;b&quot;]</code></p>
         * <p>In the preceding example, <code>CommandArgs=[&quot;abc&quot;, &quot;&gt;&quot;, &quot;file0&quot;]</code>, where <code>[&quot;abc&quot;, &quot;&gt;&quot;, &quot;file0&quot;]</code> must be converted to the String type and the internal format is a JSON array. If this parameter is not required, leave it empty.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;a&quot;,&quot;b&quot;]</p>
         */
        @NameInMap("CommandArgs")
        public String commandArgs;

        /**
         * <p>The ConfigMap information.</p>
         */
        @NameInMap("ConfigMapMountDesc")
        public java.util.List<DescribeApplicationConfigResponseBodyDataInitContainersConfigConfigMapMountDesc> configMapMountDesc;

        /**
         * <p>The shared temporary storage.</p>
         */
        @NameInMap("EmptyDirDesc")
        public java.util.List<DescribeApplicationConfigResponseBodyDataInitContainersConfigEmptyDirDesc> emptyDirDesc;

        /**
         * <p>The container environment variable parameters. You can customize environment variables or reference ConfigMap instances. To reference a ConfigMap instance, create a ConfigMap instance first. For more information, see <a href="https://help.aliyun.com/document_detail/176914.html">CreateConfigMap</a>. Valid values:</p>
         * <ul>
         * <li>Custom configuration<ul>
         * <li><strong>name</strong>: the name of the environment variable.</li>
         * <li><strong>value</strong>: the value of the environment variable. This takes priority over valueFrom.</li>
         * </ul>
         * </li>
         * <li>Reference a ConfigMap instance (valueFrom)<ul>
         * <li><strong>name</strong>: the name of the environment variable. You can reference a single key or all keys. To reference all keys, enter <code>sae-sys-configmap-all-&lt;ConfigMap name&gt;</code>, such as <code>sae-sys-configmap-all-test1</code>.</li>
         * <li><strong>valueFrom</strong>: the reference of the environment variable. Set the value to <code>configMapRef</code>.</li>
         * <li><strong>configMapId</strong>: the ID of the ConfigMap instance.</li>
         * <li><strong>key</strong>: the key. Do not set this field if you want to reference all keys.</li>
         * </ul>
         * </li>
         * <li>Reference a secret (valueFrom)<ul>
         * <li><strong>name</strong>: the name of the environment variable. You can reference a single key or all keys. To reference all keys, enter <code>sae-sys-secret-all-&lt;secret name&gt;</code>, such as <code>sae-sys-secret-all-test1</code>.</li>
         * <li><strong>valueFrom</strong>: the reference of the environment variable. Set the value to <code>secretRef</code>.</li>
         * <li><strong>secretId</strong>: the ID of the secret.</li>
         * <li><strong>key</strong>: the key. Do not set this field if you want to reference all keys.</li>
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
         * <p>The image URL used by the init container.
         * [_single.resp.200.props.Data.InitContainersConfig.items.Env</p>
         * 
         * <strong>example:</strong>
         * <p>registry.cn-shenzhen.aliyuncs.com/sae-serverless-demo/sae-demo:microservice-java-provider-v1.0</p>
         */
        @NameInMap("ImageUrl")
        public String imageUrl;

        /**
         * <p>The init container name.</p>
         * 
         * <strong>example:</strong>
         * <p>init-container</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The Secret mount description.</p>
         */
        @NameInMap("SecretMountDesc")
        public java.util.List<DescribeApplicationConfigResponseBodyDataInitContainersConfigSecretMountDesc> secretMountDesc;

        public static DescribeApplicationConfigResponseBodyDataInitContainersConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationConfigResponseBodyDataInitContainersConfig self = new DescribeApplicationConfigResponseBodyDataInitContainersConfig();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationConfigResponseBodyDataInitContainersConfig setCommand(String command) {
            this.command = command;
            return this;
        }
        public String getCommand() {
            return this.command;
        }

        public DescribeApplicationConfigResponseBodyDataInitContainersConfig setCommandArgs(String commandArgs) {
            this.commandArgs = commandArgs;
            return this;
        }
        public String getCommandArgs() {
            return this.commandArgs;
        }

        public DescribeApplicationConfigResponseBodyDataInitContainersConfig setConfigMapMountDesc(java.util.List<DescribeApplicationConfigResponseBodyDataInitContainersConfigConfigMapMountDesc> configMapMountDesc) {
            this.configMapMountDesc = configMapMountDesc;
            return this;
        }
        public java.util.List<DescribeApplicationConfigResponseBodyDataInitContainersConfigConfigMapMountDesc> getConfigMapMountDesc() {
            return this.configMapMountDesc;
        }

        public DescribeApplicationConfigResponseBodyDataInitContainersConfig setEmptyDirDesc(java.util.List<DescribeApplicationConfigResponseBodyDataInitContainersConfigEmptyDirDesc> emptyDirDesc) {
            this.emptyDirDesc = emptyDirDesc;
            return this;
        }
        public java.util.List<DescribeApplicationConfigResponseBodyDataInitContainersConfigEmptyDirDesc> getEmptyDirDesc() {
            return this.emptyDirDesc;
        }

        public DescribeApplicationConfigResponseBodyDataInitContainersConfig setEnvs(String envs) {
            this.envs = envs;
            return this;
        }
        public String getEnvs() {
            return this.envs;
        }

        public DescribeApplicationConfigResponseBodyDataInitContainersConfig setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

        public DescribeApplicationConfigResponseBodyDataInitContainersConfig setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeApplicationConfigResponseBodyDataInitContainersConfig setSecretMountDesc(java.util.List<DescribeApplicationConfigResponseBodyDataInitContainersConfigSecretMountDesc> secretMountDesc) {
            this.secretMountDesc = secretMountDesc;
            return this;
        }
        public java.util.List<DescribeApplicationConfigResponseBodyDataInitContainersConfigSecretMountDesc> getSecretMountDesc() {
            return this.secretMountDesc;
        }

    }

    public static class DescribeApplicationConfigResponseBodyDataMountDesc extends TeaModel {
        /**
         * <p>The container mount path.</p>
         * 
         * <strong>example:</strong>
         * <p>/tmp</p>
         */
        @NameInMap("MountPath")
        public String mountPath;

        /**
         * <p>The NAS relative file directory.</p>
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
         * <p>The container path in SAE. If the path already exists, it is overwritten. If the path does not exist, it is created.</p>
         * 
         * <strong>example:</strong>
         * <p>/usr/data/user.data</p>
         */
        @NameInMap("mountPath")
        public String mountPath;

        /**
         * <p>Indicates whether the container path has read-only permission to the mounted directory resources. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Read-only permission.</li>
         * <li><strong>false</strong>: Read and write permission.</li>
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

    public static class DescribeApplicationConfigResponseBodyDataRaspConfig extends TeaModel {
        @NameInMap("EnableRasp")
        public Boolean enableRasp;

        @NameInMap("RaspAppKey")
        public String raspAppKey;

        @NameInMap("RaspAppName")
        public String raspAppName;

        public static DescribeApplicationConfigResponseBodyDataRaspConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationConfigResponseBodyDataRaspConfig self = new DescribeApplicationConfigResponseBodyDataRaspConfig();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationConfigResponseBodyDataRaspConfig setEnableRasp(Boolean enableRasp) {
            this.enableRasp = enableRasp;
            return this;
        }
        public Boolean getEnableRasp() {
            return this.enableRasp;
        }

        public DescribeApplicationConfigResponseBodyDataRaspConfig setRaspAppKey(String raspAppKey) {
            this.raspAppKey = raspAppKey;
            return this;
        }
        public String getRaspAppKey() {
            return this.raspAppKey;
        }

        public DescribeApplicationConfigResponseBodyDataRaspConfig setRaspAppName(String raspAppName) {
            this.raspAppName = raspAppName;
            return this;
        }
        public String getRaspAppName() {
            return this.raspAppName;
        }

    }

    public static class DescribeApplicationConfigResponseBodyDataSecretMountDesc extends TeaModel {
        /**
         * <p>The key with Base64-encoded data value.</p>
         * 
         * <strong>example:</strong>
         * <p>task-center</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The mount path.</p>
         * 
         * <strong>example:</strong>
         * <p>/opt/www/runtime/logs</p>
         */
        @NameInMap("MountPath")
        public String mountPath;

        /**
         * <p>The queried Secret instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>520</p>
         */
        @NameInMap("SecretId")
        public Long secretId;

        /**
         * <p>The Secret instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>dummy-name-opaque-894</p>
         */
        @NameInMap("SecretName")
        public String secretName;

        public static DescribeApplicationConfigResponseBodyDataSecretMountDesc build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationConfigResponseBodyDataSecretMountDesc self = new DescribeApplicationConfigResponseBodyDataSecretMountDesc();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationConfigResponseBodyDataSecretMountDesc setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeApplicationConfigResponseBodyDataSecretMountDesc setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

        public DescribeApplicationConfigResponseBodyDataSecretMountDesc setSecretId(Long secretId) {
            this.secretId = secretId;
            return this;
        }
        public Long getSecretId() {
            return this.secretId;
        }

        public DescribeApplicationConfigResponseBodyDataSecretMountDesc setSecretName(String secretName) {
            this.secretName = secretName;
            return this;
        }
        public String getSecretName() {
            return this.secretName;
        }

    }

    public static class DescribeApplicationConfigResponseBodyDataSidecarContainersConfigConfigMapMountDesc extends TeaModel {
        /**
         * <p>The ConfigMap instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7361</p>
         */
        @NameInMap("ConfigMapId")
        public Long configMapId;

        /**
         * <p>The ConfigMap name.</p>
         * 
         * <strong>example:</strong>
         * <p>ConfigMap-test</p>
         */
        @NameInMap("ConfigMapName")
        public String configMapName;

        /**
         * <p>The ConfigMap key.</p>
         * 
         * <strong>example:</strong>
         * <p>key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The container mount path.</p>
         * 
         * <strong>example:</strong>
         * <p>/mnt/test</p>
         */
        @NameInMap("MountPath")
        public String mountPath;

        public static DescribeApplicationConfigResponseBodyDataSidecarContainersConfigConfigMapMountDesc build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationConfigResponseBodyDataSidecarContainersConfigConfigMapMountDesc self = new DescribeApplicationConfigResponseBodyDataSidecarContainersConfigConfigMapMountDesc();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationConfigResponseBodyDataSidecarContainersConfigConfigMapMountDesc setConfigMapId(Long configMapId) {
            this.configMapId = configMapId;
            return this;
        }
        public Long getConfigMapId() {
            return this.configMapId;
        }

        public DescribeApplicationConfigResponseBodyDataSidecarContainersConfigConfigMapMountDesc setConfigMapName(String configMapName) {
            this.configMapName = configMapName;
            return this;
        }
        public String getConfigMapName() {
            return this.configMapName;
        }

        public DescribeApplicationConfigResponseBodyDataSidecarContainersConfigConfigMapMountDesc setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeApplicationConfigResponseBodyDataSidecarContainersConfigConfigMapMountDesc setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

    }

    public static class DescribeApplicationConfigResponseBodyDataSidecarContainersConfigEmptyDirDesc extends TeaModel {
        /**
         * <p>The mount path of the data volume in the container.</p>
         * 
         * <strong>example:</strong>
         * <p>/mnt/cache</p>
         */
        @NameInMap("MountPath")
        public String mountPath;

        /**
         * <p>The temporary storage name.</p>
         * 
         * <strong>example:</strong>
         * <p>sidecar-container</p>
         */
        @NameInMap("Name")
        public String name;

        public static DescribeApplicationConfigResponseBodyDataSidecarContainersConfigEmptyDirDesc build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationConfigResponseBodyDataSidecarContainersConfigEmptyDirDesc self = new DescribeApplicationConfigResponseBodyDataSidecarContainersConfigEmptyDirDesc();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationConfigResponseBodyDataSidecarContainersConfigEmptyDirDesc setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

        public DescribeApplicationConfigResponseBodyDataSidecarContainersConfigEmptyDirDesc setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeApplicationConfigResponseBodyDataSidecarContainersConfigSecretMountDesc extends TeaModel {
        /**
         * <p>The key with Base64-encoded data value.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The mount path.</p>
         */
        @NameInMap("MountPath")
        public String mountPath;

        /**
         * <p>The Secret instance ID.</p>
         */
        @NameInMap("SecretId")
        public Long secretId;

        /**
         * <p>The Secret instance name.</p>
         */
        @NameInMap("SecretName")
        public String secretName;

        public static DescribeApplicationConfigResponseBodyDataSidecarContainersConfigSecretMountDesc build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationConfigResponseBodyDataSidecarContainersConfigSecretMountDesc self = new DescribeApplicationConfigResponseBodyDataSidecarContainersConfigSecretMountDesc();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationConfigResponseBodyDataSidecarContainersConfigSecretMountDesc setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeApplicationConfigResponseBodyDataSidecarContainersConfigSecretMountDesc setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

        public DescribeApplicationConfigResponseBodyDataSidecarContainersConfigSecretMountDesc setSecretId(Long secretId) {
            this.secretId = secretId;
            return this;
        }
        public Long getSecretId() {
            return this.secretId;
        }

        public DescribeApplicationConfigResponseBodyDataSidecarContainersConfigSecretMountDesc setSecretName(String secretName) {
            this.secretName = secretName;
            return this;
        }
        public String getSecretName() {
            return this.secretName;
        }

    }

    public static class DescribeApplicationConfigResponseBodyDataSidecarContainersConfig extends TeaModel {
        /**
         * <p>The ACR Enterprise instance ID. This parameter is required when <strong>ImageUrl</strong> is from ACR Enterprise Edition.</p>
         * 
         * <strong>example:</strong>
         * <p>cri-fhzlneorxala66ip</p>
         */
        @NameInMap("AcrInstanceId")
        public String acrInstanceId;

        /**
         * <p>The image startup command. This command must be an executable object that exists in the container. Example:</p>
         * <pre><code>command:
         *       - echo
         *       - abc
         *       - &gt;
         *       - file0
         * </code></pre>
         * <p>Based on the preceding example, <code>Command=&quot;echo&quot;, CommandArgs=[&quot;abc&quot;, &quot;&gt;&quot;, &quot;file0&quot;]</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>/bin/sh</p>
         */
        @NameInMap("Command")
        public String command;

        /**
         * <p>The arguments for the image startup command. These are the arguments required by the startup command <strong>Command</strong>. Format:</p>
         * <p><code>[&quot;a&quot;,&quot;b&quot;]</code></p>
         * <p>In the preceding example, <code>CommandArgs=[&quot;abc&quot;, &quot;&gt;&quot;, &quot;file0&quot;]</code>, where <code>[&quot;abc&quot;, &quot;&gt;&quot;, &quot;file0&quot;]</code> must be converted to the String type and the internal format is a JSON array. If this parameter is not required, leave it empty.</p>
         * 
         * <strong>example:</strong>
         * <p>[\&quot;-c\&quot;,\&quot;echo \\\&quot;test\\\&quot; &gt; /home/nas/test.log &amp;&amp; sleep 10000000s\&quot;]</p>
         */
        @NameInMap("CommandArgs")
        public String commandArgs;

        /**
         * <p>The ConfigMap mount description. Use the configuration items created on the namespace configuration page to inject configuration information into the container. Parameter descriptions:</p>
         * <ul>
         * <li><strong>configMapId</strong>: The ConfigMap instance ID. You can obtain this ID by calling the <a href="https://help.aliyun.com/document_detail/176917.html">ListNamespacedConfigMaps</a> operation.</li>
         * <li><strong>key</strong>: The key-value pair.<blockquote>
         * <p>You can mount all keys by passing the <code>sae-sys-configmap-all</code> parameter.</p>
         * </blockquote>
         * </li>
         * <li><strong>mountPath</strong>: The mount path.</li>
         * <li><strong>ConfigMapName</strong>: The ConfigMap name.</li>
         * </ul>
         */
        @NameInMap("ConfigMapMountDesc")
        public java.util.List<DescribeApplicationConfigResponseBodyDataSidecarContainersConfigConfigMapMountDesc> configMapMountDesc;

        /**
         * <p>The maximum CPU resources of the primary container that the sidecar container can use.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("Cpu")
        public Integer cpu;

        /**
         * <p>The shared temporary storage. Sets a temporary storage directory and mounts it to the primary container and sidecar container.</p>
         */
        @NameInMap("EmptyDirDesc")
        public java.util.List<DescribeApplicationConfigResponseBodyDataSidecarContainersConfigEmptyDirDesc> emptyDirDesc;

        /**
         * <p>The container environment variable parameters. Custom values or references to configuration items are supported. To reference a configuration item, create a ConfigMap instance first. For more information, see <a href="https://help.aliyun.com/document_detail/176914.html">CreateConfigMap</a>. Valid values:</p>
         * <ul>
         * <li>Custom configuration<ul>
         * <li><strong>name</strong>: The environment variable name.</li>
         * <li><strong>value</strong>: The environment variable value. This value takes precedence over valueFrom.</li>
         * </ul>
         * </li>
         * <li>Reference to a configuration item (valueFrom)<ul>
         * <li><strong>name</strong>: The environment variable name. You can reference a single key or all keys. To reference all keys, enter <code>sae-sys-configmap-all-&lt;ConfigMap name&gt;</code>, such as <code>sae-sys-configmap-all-test1</code>.</li>
         * <li><strong>valueFrom</strong>: The environment variable reference. Set the value to <code>configMapRef</code>.<ul>
         * <li><strong>configMapId</strong>: The ConfigMap ID.</li>
         * <li><strong>key</strong>: The key. If all keys are referenced, do not set this field.</li>
         * </ul>
         * </li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;name\&quot;:\&quot;k1\&quot;,\&quot;value\&quot;:\&quot;c8e3a815-e5d3-4adf-abb3-98b106a607c4\&quot;}]</p>
         */
        @NameInMap("Envs")
        public String envs;

        /**
         * <p>The image URL.</p>
         * 
         * <strong>example:</strong>
         * <p>registry.cn-beijing.aliyuncs.com/sae-dev-test/nginx:stable</p>
         */
        @NameInMap("ImageUrl")
        public String imageUrl;

        /**
         * <p>The container health check.</p>
         */
        @NameInMap("Liveness")
        public String liveness;

        /**
         * <p>The maximum memory resources of the primary container that the sidecar container can use.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("Memory")
        public Integer memory;

        /**
         * <p>The container name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The script that is run after the container starts.</p>
         */
        @NameInMap("PostStart")
        public String postStart;

        /**
         * <p>The script that is run before the container stops.</p>
         */
        @NameInMap("PreStop")
        public String preStop;

        /**
         * <p>The application startup status check.</p>
         */
        @NameInMap("Readiness")
        public String readiness;

        /**
         * <p>The Secret mount description.</p>
         */
        @NameInMap("SecretMountDesc")
        public java.util.List<DescribeApplicationConfigResponseBodyDataSidecarContainersConfigSecretMountDesc> secretMountDesc;

        public static DescribeApplicationConfigResponseBodyDataSidecarContainersConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationConfigResponseBodyDataSidecarContainersConfig self = new DescribeApplicationConfigResponseBodyDataSidecarContainersConfig();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationConfigResponseBodyDataSidecarContainersConfig setAcrInstanceId(String acrInstanceId) {
            this.acrInstanceId = acrInstanceId;
            return this;
        }
        public String getAcrInstanceId() {
            return this.acrInstanceId;
        }

        public DescribeApplicationConfigResponseBodyDataSidecarContainersConfig setCommand(String command) {
            this.command = command;
            return this;
        }
        public String getCommand() {
            return this.command;
        }

        public DescribeApplicationConfigResponseBodyDataSidecarContainersConfig setCommandArgs(String commandArgs) {
            this.commandArgs = commandArgs;
            return this;
        }
        public String getCommandArgs() {
            return this.commandArgs;
        }

        public DescribeApplicationConfigResponseBodyDataSidecarContainersConfig setConfigMapMountDesc(java.util.List<DescribeApplicationConfigResponseBodyDataSidecarContainersConfigConfigMapMountDesc> configMapMountDesc) {
            this.configMapMountDesc = configMapMountDesc;
            return this;
        }
        public java.util.List<DescribeApplicationConfigResponseBodyDataSidecarContainersConfigConfigMapMountDesc> getConfigMapMountDesc() {
            return this.configMapMountDesc;
        }

        public DescribeApplicationConfigResponseBodyDataSidecarContainersConfig setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public DescribeApplicationConfigResponseBodyDataSidecarContainersConfig setEmptyDirDesc(java.util.List<DescribeApplicationConfigResponseBodyDataSidecarContainersConfigEmptyDirDesc> emptyDirDesc) {
            this.emptyDirDesc = emptyDirDesc;
            return this;
        }
        public java.util.List<DescribeApplicationConfigResponseBodyDataSidecarContainersConfigEmptyDirDesc> getEmptyDirDesc() {
            return this.emptyDirDesc;
        }

        public DescribeApplicationConfigResponseBodyDataSidecarContainersConfig setEnvs(String envs) {
            this.envs = envs;
            return this;
        }
        public String getEnvs() {
            return this.envs;
        }

        public DescribeApplicationConfigResponseBodyDataSidecarContainersConfig setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

        public DescribeApplicationConfigResponseBodyDataSidecarContainersConfig setLiveness(String liveness) {
            this.liveness = liveness;
            return this;
        }
        public String getLiveness() {
            return this.liveness;
        }

        public DescribeApplicationConfigResponseBodyDataSidecarContainersConfig setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
        }

        public DescribeApplicationConfigResponseBodyDataSidecarContainersConfig setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeApplicationConfigResponseBodyDataSidecarContainersConfig setPostStart(String postStart) {
            this.postStart = postStart;
            return this;
        }
        public String getPostStart() {
            return this.postStart;
        }

        public DescribeApplicationConfigResponseBodyDataSidecarContainersConfig setPreStop(String preStop) {
            this.preStop = preStop;
            return this;
        }
        public String getPreStop() {
            return this.preStop;
        }

        public DescribeApplicationConfigResponseBodyDataSidecarContainersConfig setReadiness(String readiness) {
            this.readiness = readiness;
            return this;
        }
        public String getReadiness() {
            return this.readiness;
        }

        public DescribeApplicationConfigResponseBodyDataSidecarContainersConfig setSecretMountDesc(java.util.List<DescribeApplicationConfigResponseBodyDataSidecarContainersConfigSecretMountDesc> secretMountDesc) {
            this.secretMountDesc = secretMountDesc;
            return this;
        }
        public java.util.List<DescribeApplicationConfigResponseBodyDataSidecarContainersConfigSecretMountDesc> getSecretMountDesc() {
            return this.secretMountDesc;
        }

    }

    public static class DescribeApplicationConfigResponseBodyDataTags extends TeaModel {
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
         * <p>The ARN of the RAM role required for pulling images across accounts. For more information, see <a href="https://help.aliyun.com/document_detail/190675.html">Pull Alibaba Cloud images across accounts</a> and <a href="https://help.aliyun.com/document_detail/223585.html">Grant cross-account permissions by using RAM roles</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::123456789012****:role/adminrole</p>
         */
        @NameInMap("AcrAssumeRoleArn")
        public String acrAssumeRoleArn;

        /**
         * <p>The ACR Enterprise instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cri-xxxxxx</p>
         */
        @NameInMap("AcrInstanceId")
        public String acrInstanceId;

        /**
         * <p>The agent version.</p>
         */
        @NameInMap("AgentVersion")
        public String agentVersion;

        /**
         * <p>The ALB gateway ReadinessGate configuration.</p>
         */
        @NameInMap("AlbIngressReadinessGate")
        public String albIngressReadinessGate;

        /**
         * <p>The application description.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample application</p>
         */
        @NameInMap("AppDescription")
        public String appDescription;

        /**
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7171a6ca-d1cd-4928-8642-7d5cfe69****</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The application name.</p>
         * 
         * <strong>example:</strong>
         * <p>demo-app</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The SAE application type.</p>
         * <ul>
         * <li><p>micro_service</p>
         * </li>
         * <li><p>web</p>
         * </li>
         * <li><p>job</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>micro_service</p>
         */
        @NameInMap("AppSource")
        public String appSource;

        /**
         * <p>Specifies whether to associate an EIP. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Associated.</li>
         * <li><strong>false</strong>: Not associated.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AssociateEip")
        public Boolean associateEip;

        /**
         * <p>The ID of the baseline application.</p>
         * 
         * <strong>example:</strong>
         * <p>8c573618-8d72-4407-baf4-f7b64b******</p>
         */
        @NameInMap("BaseAppId")
        public String baseAppId;

        /**
         * <p>The wait time between batches during a phased release, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("BatchWaitTime")
        public Integer batchWaitTime;

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>495fc79c-ae61-4600-866d-a09d68******</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The CloudMonitor service ID.</p>
         */
        @NameInMap("CmsServiceId")
        public String cmsServiceId;

        /**
         * <p>The image startup command. This command must be an executable object that exists in the container. Example:</p>
         * <pre><code>command:
         *       - echo
         *       - abc
         *       - &gt;
         *       - file0
         * </code></pre>
         * <p>Based on the preceding example, <code>Command=&quot;echo&quot;, CommandArgs=[&quot;abc&quot;, &quot;&gt;&quot;, &quot;file0&quot;]</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>echo</p>
         */
        @NameInMap("Command")
        public String command;

        /**
         * <p>The arguments for the image startup command. These are the arguments required by the startup command <strong>Command</strong>. Format:</p>
         * <p><code>[&quot;a&quot;,&quot;b&quot;]</code></p>
         * <p>In the example for the <strong>Command</strong> parameter, <code>CommandArgs=[&quot;abc&quot;, &quot;&gt;&quot;, &quot;file0&quot;]</code>, where <code>[&quot;abc&quot;, &quot;&gt;&quot;, &quot;file0&quot;]</code> must be converted to the String type and the internal format is a JSON array. If this parameter is not required, leave it empty.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;a&quot;,&quot;b&quot;]</p>
         */
        @NameInMap("CommandArgs")
        public String commandArgs;

        /**
         * <p>The ConfigMap information.</p>
         */
        @NameInMap("ConfigMapMountDesc")
        public java.util.List<DescribeApplicationConfigResponseBodyDataConfigMapMountDesc> configMapMountDesc;

        /**
         * <p>The CPU required by each instance, in millicores. This value cannot be 0. Only the following defined specifications are supported:</p>
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
         * <li><strong>hostName</strong>: The domain name or hostname.</li>
         * <li><strong>ip</strong>: The IP address.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;hostName&quot;:&quot;test.host.name&quot;,&quot;ip&quot;:&quot;0.0.0.0&quot;}]</p>
         */
        @NameInMap("CustomHostAlias")
        public String customHostAlias;

        /**
         * <p>The type of the custom image. If the image is not a custom image, set this parameter to an empty string. Valid values:</p>
         * <ul>
         * <li>internet: public image</li>
         * <li>intranet: internal image</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>internet</p>
         */
        @NameInMap("CustomImageNetworkType")
        public String customImageNetworkType;

        /**
         * <p>The instance name of the application in the ASI cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>demo-b0cdce9b-3d1f-4168-b206-b59f348f1a8a</p>
         */
        @NameInMap("DeploymentName")
        public String deploymentName;

        /**
         * <p>The disk storage size, in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("DiskSize")
        public Integer diskSize;

        /**
         * <p>The .NET framework version:</p>
         * <ul>
         * <li>.NET 3.1</li>
         * <li>.NET 5.0</li>
         * <li>.NET 6.0</li>
         * <li>.NET 7.0</li>
         * <li>.NET 8.0</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>.NET 8.0</p>
         */
        @NameInMap("Dotnet")
        public String dotnet;

        /**
         * <p>The version of the application runtime environment in the HSF framework, such as the Ali-Tomcat container.</p>
         * 
         * <strong>example:</strong>
         * <p>3.5.3</p>
         */
        @NameInMap("EdasContainerVersion")
        public String edasContainerVersion;

        /**
         * <p>The shared temporary storage.</p>
         */
        @NameInMap("EmptyDirDesc")
        public java.util.List<DescribeApplicationConfigResponseBodyDataEmptyDirDesc> emptyDirDesc;

        /**
         * <p>Specifies whether to connect to Application High Availability Service (AHAS). Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Connected to AHAS.</li>
         * <li><strong>false</strong>: Not connected to AHAS.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableAhas")
        public String enableAhas;

        /**
         * <p>Specifies whether to enable the CPU Burst feature. Valid values:</p>
         * <ul>
         * <li>true: Enabled.</li>
         * <li>false: Not enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableCpuBurst")
        public String enableCpuBurst;

        /**
         * <p>Specifies whether to enable the traffic canary release rule. This rule applies only to applications that use the Spring Cloud and Dubbo frameworks. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Enabled.</li>
         * <li><strong>false</strong>: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableGreyTagRoute")
        public Boolean enableGreyTagRoute;

        /**
         * <p>Specifies whether to enable idle mode. Valid values:</p>
         * <ul>
         * <li>true: Enabled.</li>
         * <li>false: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableIdle")
        public Boolean enableIdle;

        /**
         * <p>Indicates whether the namespace agent version configuration is reused.</p>
         */
        @NameInMap("EnableNamespaceAgentVersion")
        public Boolean enableNamespaceAgentVersion;

        /**
         * <p>Specifies whether to enable the new ARMS feature. Valid values:</p>
         * <ul>
         * <li>true: Enabled.</li>
         * <li>false: Not enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableNewArms")
        public Boolean enableNewArms;

        /**
         * <p>Indicates whether Prometheus custom metric collection is enabled.</p>
         */
        @NameInMap("EnablePrometheus")
        public Boolean enablePrometheus;

        /**
         * <p>The container environment variable parameters. Custom values or references to configuration items are supported. To reference a configuration item, create a ConfigMap instance first. For more information, see <a href="https://help.aliyun.com/document_detail/176914.html">CreateConfigMap</a>. Valid values:</p>
         * <ul>
         * <li>Custom configuration<ul>
         * <li><strong>name</strong>: The environment variable name.</li>
         * <li><strong>value</strong>: The environment variable value.</li>
         * </ul>
         * </li>
         * <li>Reference to a configuration item<ul>
         * <li><strong>name</strong>: The environment variable name. You can reference a single key or all keys. To reference all keys, enter <code>sae-sys-configmap-all-&lt;ConfigMap name&gt;</code>, such as <code>sae-sys-configmap-all-test1</code>.</li>
         * <li><strong>valueFrom</strong>: The environment variable reference. Set the value to <code>configMapRef</code>.</li>
         * <li><strong>configMapId</strong>: The ConfigMap ID.</li>
         * <li><strong>key</strong>: The key. If all keys are referenced, do not set this field.</li>
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
         * <p>The number of GPUs.</p>
         */
        @NameInMap("GpuCount")
        public String gpuCount;

        /**
         * <p>The GPU type.</p>
         */
        @NameInMap("GpuType")
        public String gpuType;

        @NameInMap("HeadlessPvtzDiscovery")
        public String headlessPvtzDiscovery;

        @NameInMap("Html")
        public String html;

        @NameInMap("IdleHour")
        public String idleHour;

        /**
         * <p>The corresponding secret ID.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ImagePullSecrets")
        public String imagePullSecrets;

        /**
         * <p>The image URL. This parameter is required when <strong>Package Type</strong> is set to <strong>Image</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>docker.io/library/nginx:1.14.2</p>
         */
        @NameInMap("ImageUrl")
        public String imageUrl;

        /**
         * <p>The init container configuration.</p>
         */
        @NameInMap("InitContainersConfig")
        public java.util.List<DescribeApplicationConfigResponseBodyDataInitContainersConfig> initContainersConfig;

        /**
         * <p>Indicates whether the application is stateful.</p>
         */
        @NameInMap("IsStateful")
        public Boolean isStateful;

        /**
         * <p>The arguments for starting the JAR package application. The default startup command for the application: <code>$JAVA_HOME/bin/java $JarStartOptions -jar $CATALINA_OPTS &quot;$package_path&quot; $JarStartArgs</code></p>
         * 
         * <strong>example:</strong>
         * <p>start</p>
         */
        @NameInMap("JarStartArgs")
        public String jarStartArgs;

        /**
         * <p>The options for starting the JAR package application. The default startup command for the application: <code>$JAVA_HOME/bin/java $JarStartOptions -jar $CATALINA_OPTS &quot;$package_path&quot; $JarStartArgs</code></p>
         * 
         * <strong>example:</strong>
         * <p>-Dtest=true</p>
         */
        @NameInMap("JarStartOptions")
        public String jarStartOptions;

        /**
         * <p>The JDK version on which the deployment package depends. Valid values:</p>
         * <ul>
         * <li><strong>Open JDK 8</strong></li>
         * <li><strong>Open JDK 7</strong></li>
         * <li><strong>Dragonwell 11</strong></li>
         * <li><strong>Dragonwell 8</strong></li>
         * <li><strong>openjdk-8u191-jdk-alpine3.9</strong></li>
         * <li><strong>openjdk-7u201-jdk-alpine3.9</strong></li>
         * </ul>
         * <p>This parameter is not supported when <strong>Package Type</strong> is set to <strong>Image</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>Open JDK 8</p>
         */
        @NameInMap("Jdk")
        public String jdk;

        /**
         * <p>The summary of log collection configurations for Kafka. Valid values:</p>
         * <ul>
         * <li><strong>kafkaEndpoint</strong>: The endpoint of the Kafka API.</li>
         * <li><strong>kafkaInstanceId</strong>: The Kafka instance ID.</li>
         * <li><strong>kafkaConfigs</strong>: The configuration summary for one or more log entries. For example values and parameter descriptions, see the <strong>kafkaConfigs</strong> request parameter in this topic.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;kafkaEndpoint&quot;:&quot;10.0.X.XXX:XXXX,10.0.X.XXX:XXXX,10.0.X.XXX:XXXX&quot;,&quot;kafkaInstanceId&quot;:&quot;alikafka_pre-cn-7pp2l8kr****&quot;,&quot;kafkaConfigs&quot;:[{&quot;logType&quot;:&quot;file_log&quot;,&quot;logDir&quot;:&quot;/tmp/a.log&quot;,&quot;kafkaTopic&quot;:&quot;test2&quot;},{&quot;logType&quot;:&quot;stdout&quot;,&quot;logDir&quot;:&quot;&quot;,&quot;kafkaTopic&quot;:&quot;test&quot;}]}</p>
         */
        @NameInMap("KafkaConfigs")
        public String kafkaConfigs;

        /**
         * <p>The labels.</p>
         */
        @NameInMap("Labels")
        public java.util.Map<String, String> labels;

        /**
         * <p>The container health check settings. Containers that fail the health check are shut down and recovered. The following methods are supported:</p>
         * <ul>
         * <li><strong>exec</strong>: For example, <code>{&quot;exec&quot;:{&quot;command&quot;:[&quot;sh&quot;,&quot;-c&quot;,&quot;cat/home/admin/start.sh&quot;]},&quot;initialDelaySeconds&quot;:30,&quot;periodSeconds&quot;:30,&quot;timeoutSeconds&quot;:2}</code></li>
         * <li><strong>httpGet</strong>: For example, <code>{&quot;httpGet&quot;:{&quot;path&quot;:&quot;/&quot;,&quot;port&quot;:18091,&quot;scheme&quot;:&quot;HTTP&quot;,&quot;isContainKeyWord&quot;:true,&quot;keyWord&quot;:&quot;SAE&quot;},&quot;initialDelaySeconds&quot;:11,&quot;periodSeconds&quot;:10,&quot;timeoutSeconds&quot;:1}</code></li>
         * <li><strong>tcpSocket</strong>: For example, <code>{&quot;tcpSocket&quot;:{&quot;port&quot;:18091},&quot;initialDelaySeconds&quot;:11,&quot;periodSeconds&quot;:10,&quot;timeoutSeconds&quot;:1}</code></li>
         * </ul>
         * <blockquote>
         * <p>You can select only one method for health checks.</p>
         * </blockquote>
         * <p>Parameter descriptions:</p>
         * <ul>
         * <li><strong>exec.command</strong>: The health check command.</li>
         * <li><strong>httpGet.path</strong>: The access path.</li>
         * <li><strong>httpGet.scheme</strong>: <strong>HTTP</strong> or <strong>HTTPS</strong>.</li>
         * <li><strong>httpGet.isContainKeyWord</strong>: <strong>true</strong> indicates that the keyword is included. <strong>false</strong> indicates that the keyword is not included. If this field is missing, the advanced feature is not used.</li>
         * <li><strong>httpGet.keyWord</strong>: The custom keyword. The <strong>isContainKeyWord</strong> field must be present when this parameter is used.</li>
         * <li><strong>tcpSocket.port</strong>: The port for TCP connection detection.</li>
         * <li><strong>initialDelaySeconds</strong>: The initial delay for the health check. Default value: 10. Unit: seconds.</li>
         * <li><strong>periodSeconds</strong>: The health check period. Default value: 30. Unit: seconds.</li>
         * <li><strong>timeoutSeconds</strong>: The health check timeout period. Default value: 1. Unit: seconds. If this parameter is set to 0 or is not set, the default timeout period is 1 second.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;exec&quot;:{&quot;command&quot;:[&quot;curl <a href="http://localhost:8080%22%5D%7D,%22initialDelaySeconds%22:20,%22timeoutSeconds%22:3%7D">http://localhost:8080&quot;]},&quot;initialDelaySeconds&quot;:20,&quot;timeoutSeconds&quot;:3}</a></p>
         */
        @NameInMap("Liveness")
        public String liveness;

        /**
         * <p>LokiConfigs</p>
         */
        @NameInMap("LokiConfigs")
        public String lokiConfigs;

        /**
         * <p>The Peak Volume instance ratio.</p>
         */
        @NameInMap("MaxSurgeInstanceRatio")
        public Integer maxSurgeInstanceRatio;

        /**
         * <p>The Peak Volume of instances.</p>
         */
        @NameInMap("MaxSurgeInstances")
        public Integer maxSurgeInstances;

        /**
         * <p>The memory size required by each instance, in MB. This value cannot be 0. The memory size has a one-to-one mapping with CPU. Only the following defined specifications are supported:</p>
         * <ul>
         * <li><strong>1024</strong>: Corresponds to 500 millicores and 1000 millicores of CPU.</li>
         * <li><strong>2048</strong>: Corresponds to 500, 1000, and 2000 millicores of CPU.</li>
         * <li><strong>4096</strong>: Corresponds to 1000, 2000, and 4000 millicores of CPU.</li>
         * <li><strong>8192</strong>: Corresponds to 2000, 4000, and 8000 millicores of CPU.</li>
         * <li><strong>12288</strong>: Corresponds to 12000 millicores of CPU.</li>
         * <li><strong>16384</strong>: Corresponds to 4000, 8000, and 16000 millicores of CPU.</li>
         * <li><strong>24576</strong>: Corresponds to 12000 millicores of CPU.</li>
         * <li><strong>32768</strong>: Corresponds to 16000 millicores of CPU.</li>
         * <li><strong>65536</strong>: Corresponds to 8000, 16000, and 32000 millicores of CPU.</li>
         * <li><strong>131072</strong>: Corresponds to 32000 millicores of CPU.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2048</p>
         */
        @NameInMap("Memory")
        public Integer memory;

        /**
         * <p>The Nacos registry. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: SAE built-in Nacos.</li>
         * <li><strong>1</strong>: Self-managed Nacos.</li>
         * <li><strong>2</strong>: MSE commercial edition Nacos.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>&quot;0&quot;</p>
         */
        @NameInMap("MicroRegistration")
        public String microRegistration;

        /**
         * <p>The registry configuration. This parameter takes effect only when the registry type is MSE Nacos Enterprise Edition.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;instanceId\&quot;:\&quot;mse-cn-1ls43******\&quot;,\&quot;namespace\&quot;:\&quot;62ee12fb-c279-4da4-be96-21**********\&quot;}</p>
         */
        @NameInMap("MicroRegistrationConfig")
        public String microRegistrationConfig;

        /**
         * <p>The microservice governance configuration.</p>
         * <ul>
         * <li><p>Specifies whether to enable microservice governance (enable):</p>
         * <ul>
         * <li><p>true: enabled</p>
         * </li>
         * <li><p>false: disabled</p>
         * </li>
         * </ul>
         * </li>
         * <li><p>Lossless rolling update configuration (mseLosslessRule):</p>
         * <ul>
         * <li><p>delayTime: the delay time.</p>
         * </li>
         * <li><p>enable: specifies whether to enable the lossless online feature. true indicates enabled. false indicates disabled.</p>
         * </li>
         * <li><p>notice: specifies whether to enable the notification feature. true indicates enabled. false indicates disabled.</p>
         * </li>
         * <li><p>warmupTime: the warm-up duration for traffic ramping, in seconds.</p>
         * </li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;Enable\&quot;:true,\&quot;MseLosslessRule\&quot;:{\&quot;enable\&quot;:true,\&quot;notice\&quot;:true,\&quot;delayTime\&quot;:10,\&quot;warmupTime\&quot;:120,\&quot;funcType\&quot;:2,\&quot;aligned\&quot;:false,\&quot;related\&quot;:false,\&quot;lossLessDetail\&quot;:false}}</p>
         */
        @NameInMap("MicroserviceEngineConfig")
        public String microserviceEngineConfig;

        /**
         * <p>The minimum percentage of available instances. Valid values:</p>
         * <ul>
         * <li><strong>-1</strong>: The default value, which indicates that the percentage is not used. If this parameter is not specified, the system uses <strong>-1</strong> by default.</li>
         * <li><strong>0~100</strong>: The unit is percentage, rounded up. For example, if set to <strong>50</strong>%, and the current number of instances is 5, the minimum number of available instances is 3.</li>
         * </ul>
         * <blockquote>
         * <p>When both <strong>MinReadyInstance</strong> and <strong>MinReadyInstanceRatio</strong> are specified and the value of <strong>MinReadyInstanceRatio</strong> is not <strong>-1</strong>, the <strong>MinReadyInstanceRatio</strong> parameter takes precedence. For example, if <strong>MinReadyInstances</strong> is set to <strong>5</strong> and <strong>MinReadyInstanceRatio</strong> is set to <strong>50</strong>, the system uses <strong>MinReadyInstanceRatio</strong> to calculate the minimum number of available instances.</p>
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
         * <li>If set to <strong>0</strong>, the application interrupts services during the upgrade process.</li>
         * <li>If set to <strong>-1</strong>, the system-recommended value is used, which is 25% of the current number of instances. If the current number of instances is 5, 5 × 25% = 1.25, which is rounded up to 2.</li>
         * </ul>
         * <blockquote>
         * <p>Set the minimum number of available instances to ≥ 1 for each rolling deployment to avoid service interruptions.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MinReadyInstances")
        public Integer minReadyInstances;

        /**
         * <p>The mount description information.</p>
         */
        @NameInMap("MountDesc")
        public java.util.List<DescribeApplicationConfigResponseBodyDataMountDesc> mountDesc;

        /**
         * <p>The mount point of NAS within the application VPC. If the configuration has not changed during deployment, you do not need to set this parameter (that is, the <strong>MountHost</strong> field does not need to be included in the request). To clear the NAS configuration, set the value of this field to an empty string in the request (that is, set the value of the <strong>MountHost</strong> field to &quot;&quot;).</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("MountHost")
        public String mountHost;

        /**
         * <p>The application ID on the Microservices Engine (MSE) side.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxxxx@xxxxx</p>
         */
        @NameInMap("MseApplicationId")
        public String mseApplicationId;

        /**
         * <p>The application name after the SAE service is registered with MSE.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shenzhen-alb-demo-5c****</p>
         */
        @NameInMap("MseApplicationName")
        public String mseApplicationName;

        /**
         * <p>The namespace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing:test</p>
         */
        @NameInMap("NamespaceId")
        public String namespaceId;

        /**
         * <p>The NAS mount configurations.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;mountPath&quot;:&quot;/test1&quot;,&quot;readOnly&quot;:false,&quot;nasId&quot;:&quot;nasId1&quot;,&quot;mountDomain&quot;:&quot;nasId1.cn-shenzhen.nas.aliyuncs.com&quot;,&quot;nasPath&quot;:&quot;/test1&quot;},{&quot;nasId&quot;:&quot;nasId2&quot;,&quot;mountDomain&quot;:&quot;nasId2.cn-shenzhen.nas.aliyuncs.com&quot;,&quot;readOnly&quot;:false,&quot;nasPath&quot;:&quot;/test2&quot;,&quot;mountPath&quot;:&quot;/test2&quot;}]</p>
         */
        @NameInMap("NasConfigs")
        public String nasConfigs;

        /**
         * <p>NAS ID。</p>
         * 
         * <strong>example:</strong>
         * <p>AKSN****</p>
         */
        @NameInMap("NasId")
        public String nasId;

        /**
         * <p>The application version. Valid values:</p>
         * <ul>
         * <li>lite: Lite Edition</li>
         * <li>std: Standard Edition</li>
         * <li>pro: Professional Edition</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>pro</p>
         */
        @NameInMap("NewSaeVersion")
        public String newSaeVersion;

        /**
         * <p>The RAM role for identity authentication.</p>
         * <blockquote>
         * <p>Create an OIDC identity provider and an identity provider role in the same region in advance. For more information, see <a href="https://help.aliyun.com/document_detail/2331022.html">Create an OIDC identity provider</a> and <a href="https://help.aliyun.com/document_detail/2331016.html">Create a role for SSO identity provider</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>sae-test</p>
         */
        @NameInMap("OidcRoleName")
        public String oidcRoleName;

        /**
         * <p>The AccessKey ID for OSS read/write operations.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("OssAkId")
        public String ossAkId;

        /**
         * <p>The AccessKey Secret for OSS read/write operations.</p>
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
        public java.util.List<DescribeApplicationConfigResponseBodyDataOssMountDescs> ossMountDescs;

        /**
         * <p>The application package type. Valid values:</p>
         * <ul>
         * <li>When you deploy with Java, <strong>FatJar</strong>, <strong>War</strong>, and <strong>Image</strong> are supported.</li>
         * <li>When you deploy with PHP, the following types are supported:<ul>
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
         * <p>The deployment package URL. If your deployment package is uploaded through SAE, note the following:</p>
         * <ul>
         * <li>This URL cannot be used for direct download. Use the GetPackageVersionAccessableUrl operation to obtain a downloadable URL (valid for 10 minutes).</li>
         * <li>SAE retains the package for a maximum of 90 days. After 90 days, the URL is no longer returned and the package is no longer available for download.</li>
         * </ul>
         */
        @NameInMap("PackageUrl")
        public String packageUrl;

        /**
         * <p>The version of the deployment package. This parameter is required when <strong>Package Type</strong> is set to <strong>FatJar</strong> or <strong>War</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("PackageVersion")
        public String packageVersion;

        /**
         * <p>The PHP version on which the PHP deployment package depends. Images are not supported.</p>
         * 
         * <strong>example:</strong>
         * <p>PHP-FPM 7.0</p>
         */
        @NameInMap("Php")
        public String php;

        /**
         * <p>The mount path for PHP application monitoring. Make sure that the PHP server loads the configuration file from this path.</p>
         * <p>You do not need to manage the configuration content. SAE automatically renders the correct configuration file.</p>
         * 
         * <strong>example:</strong>
         * <p>/usr/local/etc/php/conf.d/arms.ini</p>
         */
        @NameInMap("PhpArmsConfigLocation")
        public String phpArmsConfigLocation;

        /**
         * <p>The content of the PHP configuration file.</p>
         * 
         * <strong>example:</strong>
         * <p>k1=v1</p>
         */
        @NameInMap("PhpConfig")
        public String phpConfig;

        /**
         * <p>The mount path of the PHP application startup configuration. Make sure that the PHP server uses this configuration file for startup.</p>
         * 
         * <strong>example:</strong>
         * <p>/usr/local/etc/php/php.ini</p>
         */
        @NameInMap("PhpConfigLocation")
        public String phpConfigLocation;

        /**
         * <p>The script that is run after the container starts. A script is triggered immediately after the container is created. Format: <code>{&quot;exec&quot;:{&quot;command&quot;:[&quot;cat&quot;,&quot;/etc/group&quot;\\]}}</code></p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;exec&quot;:{&quot;command&quot;:[&quot;cat&quot;,&quot;/etc/group&quot;]}}</p>
         */
        @NameInMap("PostStart")
        public String postStart;

        /**
         * <p>The script that is run before the container stops. A script is triggered before the container is deleted. Format: <code>{&quot;exec&quot;:{&quot;command&quot;:[&quot;cat&quot;,&quot;/etc/group&quot;\\]}}</code></p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;exec&quot;:{&quot;command&quot;:[&quot;cat&quot;,&quot;/etc/group&quot;]}}</p>
         */
        @NameInMap("PreStop")
        public String preStop;

        /**
         * <p>The programming language of the technology stack used to create the application. Valid values:</p>
         * <ul>
         * <li><strong>java</strong>: Java.</li>
         * <li><strong>php</strong>: PHP.</li>
         * <li><strong>other</strong>: Other languages, such as Python, C++, Go, .NET, and Node.js.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>java</p>
         */
        @NameInMap("ProgrammingLanguage")
        public String programmingLanguage;

        /**
         * <p>Enables K8s Service-based service registration and discovery.</p>
         * 
         * <strong>example:</strong>
         * <p>{     &quot;serviceName&quot;: &quot;bwm-poc-sc-gateway-cn-beijing-front&quot;,     &quot;namespaceId&quot;: &quot;cn-beijing:front&quot;,     &quot;portAndProtocol&quot;: {         &quot;18012&quot;: &quot;TCP&quot;     },     &quot;portProtocols&quot;: [         {             &quot;port&quot;: &quot;18012&quot;,             &quot;protocol&quot;: &quot;TCP&quot;         }     ],     &quot;enable&quot;: true }</p>
         */
        @NameInMap("PvtzDiscovery")
        public String pvtzDiscovery;

        /**
         * <p>The Python environment. PYTHON 3.9.15 is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>PYTHON 3.9.15</p>
         */
        @NameInMap("Python")
        public String python;

        /**
         * <p>The custom installation module dependencies. By default, the dependencies defined in the requirements.txt file in the root directory are installed. If no dependencies are configured or custom packages are needed, you can specify the dependencies to install.</p>
         * 
         * <strong>example:</strong>
         * <p>Flask==2.0</p>
         */
        @NameInMap("PythonModules")
        public String pythonModules;

        @NameInMap("RaspConfig")
        public java.util.List<DescribeApplicationConfigResponseBodyDataRaspConfig> raspConfig;

        /**
         * <p>The application startup status check. Containers that fail multiple health checks are shut down and restarted. Containers that do not pass the health check do not receive SLB traffic. The <strong>exec</strong>, <strong>httpGet</strong>, and <strong>tcpSocket</strong> methods are supported. For specific examples, see the <strong>Liveness</strong> parameter.</p>
         * <blockquote>
         * <p>You can select only one method for health checks.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;exec&quot;:{&quot;command&quot;:[&quot;curl <a href="http://localhost:8080%22%5D%7D,%22initialDelaySeconds%22:20,%22timeoutSeconds%22:5%7D">http://localhost:8080&quot;]},&quot;initialDelaySeconds&quot;:20,&quot;timeoutSeconds&quot;:5}</a></p>
         */
        @NameInMap("Readiness")
        public String readiness;

        /**
         * <p>The region ID.</p>
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
         * <p>The resource type. Only <code>application</code> is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>application</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The Secret mount description.</p>
         */
        @NameInMap("SecretMountDesc")
        public java.util.List<DescribeApplicationConfigResponseBodyDataSecretMountDesc> secretMountDesc;

        /**
         * <p>The security group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-wz969ngg2e49q5i4****</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The canary release tags configured for the application.</p>
         */
        @NameInMap("ServiceTags")
        public java.util.Map<String, String> serviceTags;

        /**
         * <p>The sidecar container configuration.</p>
         */
        @NameInMap("SidecarContainersConfig")
        public java.util.List<DescribeApplicationConfigResponseBodyDataSidecarContainersConfig> sidecarContainersConfig;

        /**
         * <p>The settings for log collection to Simple Log Service (SLS).</p>
         * <ul>
         * <li>To use SLS resources that are automatically created by Serverless App Engine (SAE): <code>[{&quot;logDir&quot;:&quot;&quot;,&quot;logType&quot;:&quot;stdout&quot;},{&quot;logDir&quot;:&quot;/tmp/a.log&quot;}]</code>.</li>
         * <li>To use custom SLS resources: <code>[{&quot;projectName&quot;:&quot;test-sls&quot;,&quot;logType&quot;:&quot;stdout&quot;,&quot;logDir&quot;:&quot;&quot;,&quot;logstoreName&quot;:&quot;sae&quot;,&quot;logtailName&quot;:&quot;&quot;},{&quot;projectName&quot;:&quot;test&quot;,&quot;logDir&quot;:&quot;/tmp/a.log&quot;,&quot;logstoreName&quot;:&quot;sae&quot;,&quot;logtailName&quot;:&quot;&quot;}]</code>.</li>
         * </ul>
         * <p>Parameter descriptions:</p>
         * <ul>
         * <li><strong>projectName</strong>: The name of the project in SLS.  </li>
         * <li><strong>logDir</strong>: The log path.</li>
         * <li><strong>logType</strong>: The log type. <strong>stdout</strong> indicates container standard output logs. You can set only one stdout entry. If this parameter is not set, file logs are collected.</li>
         * <li><strong>logstoreName</strong>: The name of the Logstore in SLS.</li>
         * <li><strong>logtailName</strong>: The name of the Logtail in SLS. If this parameter is not specified, a new Logtail is created through automatic creation.</li>
         * </ul>
         * <p>If the SLS collection configuration has not changed during multiple deployments, you do not need to set this parameter (that is, the <strong>SlsConfigs</strong> field does not need to be included in the request). If you no longer need the SLS collection feature, set the value of this field to an empty string in the request (that is, set the value of the <strong>SlsConfigs</strong> field to &quot;&quot;).</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;logDir&quot;:&quot;&quot;,&quot;logType&quot;:&quot;stdout&quot;},{&quot;logDir&quot;:&quot;/tmp/a.log&quot;}]</p>
         */
        @NameInMap("SlsConfigs")
        public String slsConfigs;

        /**
         * <p>sls log env tags</p>
         */
        @NameInMap("SlsLogEnvTags")
        public String slsLogEnvTags;

        /**
         * <p>The startup probe of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;exec\&quot;:{\&quot;command\&quot;:[\&quot;/bin/sh\&quot;,\&quot;-c\&quot;,\&quot;#!Note: If microservice config is enabled, the application will be automatically injected with the prestop configuration for lossless offline. If you delete this prestop configuration, lossless offline will not be effective.\\n echo stop &gt; /tmp/prestop; /home/admin/.tools/curl <a href="http://127.0.0.1:54199/offline">http://127.0.0.1:54199/offline</a>; sleep 30\&quot;]}}</p>
         */
        @NameInMap("StartupProbe")
        public String startupProbe;

        /**
         * <p>Configures K8s Service-based service registration and discovery with end-to-end canary release.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;enable\&quot;:\&quot;false\&quot;,\&quot;namespaceId\&quot;:\&quot;cn-beijing:test\&quot;,\&quot;portAndProtocol\&quot;:{\&quot;2000:TCP\&quot;:\&quot;18081\&quot;},\&quot;portProtocols\&quot;:[{\&quot;port\&quot;:2000,\&quot;protocol\&quot;:\&quot;TCP\&quot;,\&quot;targetPort\&quot;:18081}],\&quot;pvtzDiscoveryName\&quot;:\&quot;cn-beijing-1421801774382676\&quot;,\&quot;serviceId\&quot;:\&quot;3513\&quot;,\&quot;serviceName\&quot;:\&quot;demo-gray.test\&quot;}</p>
         */
        @NameInMap("SwimlanePvtzDiscovery")
        public String swimlanePvtzDiscovery;

        /**
         * <p>The tag information.</p>
         */
        @NameInMap("Tags")
        public java.util.List<DescribeApplicationConfigResponseBodyDataTags> tags;

        /**
         * <p>The graceful shutdown timeout period. Default value: 30. Unit: seconds. Valid values: 1 to 300.</p>
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
         * <p>The Tomcat configuration. Set this parameter to &quot;&quot; or &quot;{}&quot; to delete the configuration:</p>
         * <ul>
         * <li><strong>port</strong>: The port number. Valid values: 1024 to 65535. Ports smaller than 1024 require root permissions. Because the container is configured with admin permissions, specify a port greater than 1024. Default value: 8080.</li>
         * <li><strong>contextPath</strong>: The access path. Default value: root directory &quot;/&quot;.</li>
         * <li><strong>maxThreads</strong>: The maximum number of connections in the connection pool. Default value: 400.</li>
         * <li><strong>uriEncoding</strong>: The encoding format of Tomcat. Valid values: <strong>UTF-8</strong>, <strong>ISO-8859-1</strong>, <strong>GBK</strong>, and <strong>GB2312</strong>. Default value: <strong>ISO-8859-1</strong>.</li>
         * <li><strong>useBodyEncoding</strong>: Specifies whether to use <strong>BodyEncoding for URL</strong>. Default value: <strong>true</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;port&quot;:8080,&quot;contextPath&quot;:&quot;/&quot;,&quot;maxThreads&quot;:400,&quot;uriEncoding&quot;:&quot;ISO-8859-1&quot;,&quot;useBodyEncodingForUri&quot;:true}</p>
         */
        @NameInMap("TomcatConfig")
        public String tomcatConfig;

        /**
         * <p>The deployment policy. When the minimum number of available instances is 1, the value of the <strong>UpdateStrategy</strong> field is &quot;&quot;. When the minimum number of available instances is greater than 1, examples are as follows:</p>
         * <ul>
         * <li><p>Canary release of 1 instance + 2 subsequent batches + automatic batching + 1-minute batch interval: <code>{&quot;type&quot;:&quot;GrayBatchUpdate&quot;,&quot;batchUpdate&quot;:{&quot;batch&quot;:2,&quot;releaseType&quot;:&quot;auto&quot;,&quot;batchWaitTime&quot;:1},&quot;grayUpdate&quot;:{&quot;gray&quot;:1}}</code></p>
         * </li>
         * <li><p>Canary release of 1 instance + 2 subsequent batches + manual batching: <code>{&quot;type&quot;:&quot;GrayBatchUpdate&quot;,&quot;batchUpdate&quot;:{&quot;batch&quot;:2,&quot;releaseType&quot;:&quot;manual&quot;},&quot;grayUpdate&quot;:{&quot;gray&quot;:1}}</code></p>
         * </li>
         * <li><p>2 batches + automatic batching + 0-minute batch interval: <code>{&quot;type&quot;:&quot;BatchUpdate&quot;,&quot;batchUpdate&quot;:{&quot;batch&quot;:2,&quot;releaseType&quot;:&quot;auto&quot;,&quot;batchWaitTime&quot;:0}}</code></p>
         * </li>
         * </ul>
         * <p>Parameter descriptions:</p>
         * <ul>
         * <li><strong>type</strong>: The release policy type. Valid values: <strong>GrayBatchUpdate</strong> (grayscale batch release) and <strong>BatchUpdate</strong> (batch release).</li>
         * <li><strong>batchUpdate</strong>: The batch release policy.<ul>
         * <li><strong>batch</strong>: The number of release batches.</li>
         * <li><strong>releaseType</strong>: The processing method between batches. Valid values: <strong>auto</strong> (automatic) and <strong>manual</strong> (manual).</li>
         * <li><strong>batchWaitTime</strong>: The interval between deployments within a batch, in seconds.</li>
         * </ul>
         * </li>
         * <li><strong>grayUpdate</strong>: The remaining batches after grayscale release. This parameter is required when <strong>type</strong> is set to <strong>GrayBatchUpdate</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;type&quot;:&quot;GrayBatchUpdate&quot;,&quot;batchUpdate&quot;:{&quot;batch&quot;:2,&quot;releaseType&quot;:&quot;auto&quot;,&quot;batchWaitTime&quot;:1},&quot;grayUpdate&quot;:{&quot;gray&quot;:1}}</p>
         */
        @NameInMap("UpdateStrategy")
        public String updateStrategy;

        /**
         * <p>vSwitch ID。</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-2ze559r1z1bpwqxwp****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>VPC ID。</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-2ze0i263cnn311nvj****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The startup options for the WAR package application. The default startup command for the application: <code>java $JAVA_OPTS $CATALINA_OPTS -Options org.apache.catalina.startup.Bootstrap &quot;$@&quot; start</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>custom-option</p>
         */
        @NameInMap("WarStartOptions")
        public String warStartOptions;

        /**
         * <p>The Tomcat version on which the deployment package depends. Valid values:</p>
         * <ul>
         * <li><strong>apache-tomcat-7.0.91</strong></li>
         * <li><strong>apache-tomcat-8.5.42</strong></li>
         * </ul>
         * <p>This parameter is not supported when <strong>Package Type</strong> is set to <strong>Image</strong>.</p>
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

        public DescribeApplicationConfigResponseBodyData setAgentVersion(String agentVersion) {
            this.agentVersion = agentVersion;
            return this;
        }
        public String getAgentVersion() {
            return this.agentVersion;
        }

        public DescribeApplicationConfigResponseBodyData setAlbIngressReadinessGate(String albIngressReadinessGate) {
            this.albIngressReadinessGate = albIngressReadinessGate;
            return this;
        }
        public String getAlbIngressReadinessGate() {
            return this.albIngressReadinessGate;
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

        public DescribeApplicationConfigResponseBodyData setBaseAppId(String baseAppId) {
            this.baseAppId = baseAppId;
            return this;
        }
        public String getBaseAppId() {
            return this.baseAppId;
        }

        public DescribeApplicationConfigResponseBodyData setBatchWaitTime(Integer batchWaitTime) {
            this.batchWaitTime = batchWaitTime;
            return this;
        }
        public Integer getBatchWaitTime() {
            return this.batchWaitTime;
        }

        public DescribeApplicationConfigResponseBodyData setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribeApplicationConfigResponseBodyData setCmsServiceId(String cmsServiceId) {
            this.cmsServiceId = cmsServiceId;
            return this;
        }
        public String getCmsServiceId() {
            return this.cmsServiceId;
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

        public DescribeApplicationConfigResponseBodyData setCustomImageNetworkType(String customImageNetworkType) {
            this.customImageNetworkType = customImageNetworkType;
            return this;
        }
        public String getCustomImageNetworkType() {
            return this.customImageNetworkType;
        }

        public DescribeApplicationConfigResponseBodyData setDeploymentName(String deploymentName) {
            this.deploymentName = deploymentName;
            return this;
        }
        public String getDeploymentName() {
            return this.deploymentName;
        }

        public DescribeApplicationConfigResponseBodyData setDiskSize(Integer diskSize) {
            this.diskSize = diskSize;
            return this;
        }
        public Integer getDiskSize() {
            return this.diskSize;
        }

        public DescribeApplicationConfigResponseBodyData setDotnet(String dotnet) {
            this.dotnet = dotnet;
            return this;
        }
        public String getDotnet() {
            return this.dotnet;
        }

        public DescribeApplicationConfigResponseBodyData setEdasContainerVersion(String edasContainerVersion) {
            this.edasContainerVersion = edasContainerVersion;
            return this;
        }
        public String getEdasContainerVersion() {
            return this.edasContainerVersion;
        }

        public DescribeApplicationConfigResponseBodyData setEmptyDirDesc(java.util.List<DescribeApplicationConfigResponseBodyDataEmptyDirDesc> emptyDirDesc) {
            this.emptyDirDesc = emptyDirDesc;
            return this;
        }
        public java.util.List<DescribeApplicationConfigResponseBodyDataEmptyDirDesc> getEmptyDirDesc() {
            return this.emptyDirDesc;
        }

        public DescribeApplicationConfigResponseBodyData setEnableAhas(String enableAhas) {
            this.enableAhas = enableAhas;
            return this;
        }
        public String getEnableAhas() {
            return this.enableAhas;
        }

        public DescribeApplicationConfigResponseBodyData setEnableCpuBurst(String enableCpuBurst) {
            this.enableCpuBurst = enableCpuBurst;
            return this;
        }
        public String getEnableCpuBurst() {
            return this.enableCpuBurst;
        }

        public DescribeApplicationConfigResponseBodyData setEnableGreyTagRoute(Boolean enableGreyTagRoute) {
            this.enableGreyTagRoute = enableGreyTagRoute;
            return this;
        }
        public Boolean getEnableGreyTagRoute() {
            return this.enableGreyTagRoute;
        }

        public DescribeApplicationConfigResponseBodyData setEnableIdle(Boolean enableIdle) {
            this.enableIdle = enableIdle;
            return this;
        }
        public Boolean getEnableIdle() {
            return this.enableIdle;
        }

        public DescribeApplicationConfigResponseBodyData setEnableNamespaceAgentVersion(Boolean enableNamespaceAgentVersion) {
            this.enableNamespaceAgentVersion = enableNamespaceAgentVersion;
            return this;
        }
        public Boolean getEnableNamespaceAgentVersion() {
            return this.enableNamespaceAgentVersion;
        }

        public DescribeApplicationConfigResponseBodyData setEnableNewArms(Boolean enableNewArms) {
            this.enableNewArms = enableNewArms;
            return this;
        }
        public Boolean getEnableNewArms() {
            return this.enableNewArms;
        }

        public DescribeApplicationConfigResponseBodyData setEnablePrometheus(Boolean enablePrometheus) {
            this.enablePrometheus = enablePrometheus;
            return this;
        }
        public Boolean getEnablePrometheus() {
            return this.enablePrometheus;
        }

        public DescribeApplicationConfigResponseBodyData setEnvs(String envs) {
            this.envs = envs;
            return this;
        }
        public String getEnvs() {
            return this.envs;
        }

        public DescribeApplicationConfigResponseBodyData setGpuCount(String gpuCount) {
            this.gpuCount = gpuCount;
            return this;
        }
        public String getGpuCount() {
            return this.gpuCount;
        }

        public DescribeApplicationConfigResponseBodyData setGpuType(String gpuType) {
            this.gpuType = gpuType;
            return this;
        }
        public String getGpuType() {
            return this.gpuType;
        }

        public DescribeApplicationConfigResponseBodyData setHeadlessPvtzDiscovery(String headlessPvtzDiscovery) {
            this.headlessPvtzDiscovery = headlessPvtzDiscovery;
            return this;
        }
        public String getHeadlessPvtzDiscovery() {
            return this.headlessPvtzDiscovery;
        }

        public DescribeApplicationConfigResponseBodyData setHtml(String html) {
            this.html = html;
            return this;
        }
        public String getHtml() {
            return this.html;
        }

        public DescribeApplicationConfigResponseBodyData setIdleHour(String idleHour) {
            this.idleHour = idleHour;
            return this;
        }
        public String getIdleHour() {
            return this.idleHour;
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

        public DescribeApplicationConfigResponseBodyData setInitContainersConfig(java.util.List<DescribeApplicationConfigResponseBodyDataInitContainersConfig> initContainersConfig) {
            this.initContainersConfig = initContainersConfig;
            return this;
        }
        public java.util.List<DescribeApplicationConfigResponseBodyDataInitContainersConfig> getInitContainersConfig() {
            return this.initContainersConfig;
        }

        public DescribeApplicationConfigResponseBodyData setIsStateful(Boolean isStateful) {
            this.isStateful = isStateful;
            return this;
        }
        public Boolean getIsStateful() {
            return this.isStateful;
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

        public DescribeApplicationConfigResponseBodyData setLabels(java.util.Map<String, String> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.Map<String, String> getLabels() {
            return this.labels;
        }

        public DescribeApplicationConfigResponseBodyData setLiveness(String liveness) {
            this.liveness = liveness;
            return this;
        }
        public String getLiveness() {
            return this.liveness;
        }

        public DescribeApplicationConfigResponseBodyData setLokiConfigs(String lokiConfigs) {
            this.lokiConfigs = lokiConfigs;
            return this;
        }
        public String getLokiConfigs() {
            return this.lokiConfigs;
        }

        public DescribeApplicationConfigResponseBodyData setMaxSurgeInstanceRatio(Integer maxSurgeInstanceRatio) {
            this.maxSurgeInstanceRatio = maxSurgeInstanceRatio;
            return this;
        }
        public Integer getMaxSurgeInstanceRatio() {
            return this.maxSurgeInstanceRatio;
        }

        public DescribeApplicationConfigResponseBodyData setMaxSurgeInstances(Integer maxSurgeInstances) {
            this.maxSurgeInstances = maxSurgeInstances;
            return this;
        }
        public Integer getMaxSurgeInstances() {
            return this.maxSurgeInstances;
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

        public DescribeApplicationConfigResponseBodyData setMicroRegistrationConfig(String microRegistrationConfig) {
            this.microRegistrationConfig = microRegistrationConfig;
            return this;
        }
        public String getMicroRegistrationConfig() {
            return this.microRegistrationConfig;
        }

        public DescribeApplicationConfigResponseBodyData setMicroserviceEngineConfig(String microserviceEngineConfig) {
            this.microserviceEngineConfig = microserviceEngineConfig;
            return this;
        }
        public String getMicroserviceEngineConfig() {
            return this.microserviceEngineConfig;
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

        public DescribeApplicationConfigResponseBodyData setNewSaeVersion(String newSaeVersion) {
            this.newSaeVersion = newSaeVersion;
            return this;
        }
        public String getNewSaeVersion() {
            return this.newSaeVersion;
        }

        public DescribeApplicationConfigResponseBodyData setOidcRoleName(String oidcRoleName) {
            this.oidcRoleName = oidcRoleName;
            return this;
        }
        public String getOidcRoleName() {
            return this.oidcRoleName;
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

        public DescribeApplicationConfigResponseBodyData setRaspConfig(java.util.List<DescribeApplicationConfigResponseBodyDataRaspConfig> raspConfig) {
            this.raspConfig = raspConfig;
            return this;
        }
        public java.util.List<DescribeApplicationConfigResponseBodyDataRaspConfig> getRaspConfig() {
            return this.raspConfig;
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

        public DescribeApplicationConfigResponseBodyData setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public DescribeApplicationConfigResponseBodyData setSecretMountDesc(java.util.List<DescribeApplicationConfigResponseBodyDataSecretMountDesc> secretMountDesc) {
            this.secretMountDesc = secretMountDesc;
            return this;
        }
        public java.util.List<DescribeApplicationConfigResponseBodyDataSecretMountDesc> getSecretMountDesc() {
            return this.secretMountDesc;
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

        public DescribeApplicationConfigResponseBodyData setSidecarContainersConfig(java.util.List<DescribeApplicationConfigResponseBodyDataSidecarContainersConfig> sidecarContainersConfig) {
            this.sidecarContainersConfig = sidecarContainersConfig;
            return this;
        }
        public java.util.List<DescribeApplicationConfigResponseBodyDataSidecarContainersConfig> getSidecarContainersConfig() {
            return this.sidecarContainersConfig;
        }

        public DescribeApplicationConfigResponseBodyData setSlsConfigs(String slsConfigs) {
            this.slsConfigs = slsConfigs;
            return this;
        }
        public String getSlsConfigs() {
            return this.slsConfigs;
        }

        public DescribeApplicationConfigResponseBodyData setSlsLogEnvTags(String slsLogEnvTags) {
            this.slsLogEnvTags = slsLogEnvTags;
            return this;
        }
        public String getSlsLogEnvTags() {
            return this.slsLogEnvTags;
        }

        public DescribeApplicationConfigResponseBodyData setStartupProbe(String startupProbe) {
            this.startupProbe = startupProbe;
            return this;
        }
        public String getStartupProbe() {
            return this.startupProbe;
        }

        public DescribeApplicationConfigResponseBodyData setSwimlanePvtzDiscovery(String swimlanePvtzDiscovery) {
            this.swimlanePvtzDiscovery = swimlanePvtzDiscovery;
            return this;
        }
        public String getSwimlanePvtzDiscovery() {
            return this.swimlanePvtzDiscovery;
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
