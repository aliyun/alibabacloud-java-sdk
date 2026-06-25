// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeApplicationConfigResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. Valid values:</p>
     * <ul>
     * <li><p><strong>2xx</strong>: The request is successful.</p>
     * </li>
     * <li><p><strong>3xx</strong>: The request is redirected.</p>
     * </li>
     * <li><p><strong>4xx</strong>: The request is invalid.</p>
     * </li>
     * <li><p><strong>5xx</strong>: A server error occurs.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The information about the application.</p>
     */
    @NameInMap("Data")
    public DescribeApplicationConfigResponseBodyData data;

    /**
     * <p>The error code.</p>
     * <ul>
     * <li><p>This parameter is not returned if the request is successful.</p>
     * </li>
     * <li><p>If the request fails, this parameter is returned. For more information, see the &quot;Error codes&quot; section in this topic.</p>
     * </li>
     * </ul>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The additional information that is returned.</p>
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
     * <p>Indicates whether the application configuration was retrieved. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The configuration was retrieved.</p>
     * </li>
     * <li><p><strong>false</strong>: The configuration failed to be retrieved.</p>
     * </li>
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
         * <p>The key of the key-value pair.</p>
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
         * <p>The name of the temporary storage.</p>
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
         * <p>The key of the key-value pair.</p>
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
         * <p>The path on which the volume is mounted in the container.</p>
         */
        @NameInMap("MountPath")
        public String mountPath;

        /**
         * <p>The name of the temporary storage.</p>
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
         * <p>The ID of the secret instance.</p>
         */
        @NameInMap("SecretId")
        public Long secretId;

        /**
         * <p>The name of the secret instance.</p>
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
         * <p>The startup command of the image. The command must be an executable object that exists in the container. Example:</p>
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
         * <p>The arguments of the image startup command. The arguments are required by the preceding startup command <strong>Command</strong>. Format:</p>
         * <p><code>[&quot;a&quot;,&quot;b&quot;]</code></p>
         * <p>In the preceding example, <code>CommandArgs=[&quot;abc&quot;, &quot;&gt;&quot;, &quot;file0&quot;]</code>. The value <code>[&quot;abc&quot;, &quot;&gt;&quot;, &quot;file0&quot;]</code> must be converted into a string in the JSON array format. If this parameter is not required, you do not need to specify it.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;a&quot;,&quot;b&quot;]</p>
         */
        @NameInMap("CommandArgs")
        public String commandArgs;

        /**
         * <p>The configurations of the ConfigMap.</p>
         */
        @NameInMap("ConfigMapMountDesc")
        public java.util.List<DescribeApplicationConfigResponseBodyDataInitContainersConfigConfigMapMountDesc> configMapMountDesc;

        /**
         * <p>The shared temporary storage.</p>
         */
        @NameInMap("EmptyDirDesc")
        public java.util.List<DescribeApplicationConfigResponseBodyDataInitContainersConfigEmptyDirDesc> emptyDirDesc;

        /**
         * <p>The environment variables of the container. You can customize environment variables or reference a ConfigMap. To reference a ConfigMap, you must first create a ConfigMap instance. For more information, see <a href="https://help.aliyun.com/document_detail/176914.html">CreateConfigMap</a>. Valid values:</p>
         * <ul>
         * <li><p>Custom configuration</p>
         * <ul>
         * <li><p><strong>name</strong>: The name of the environment variable.</p>
         * </li>
         * <li><p><strong>value</strong>: The value of the environment variable. This parameter takes precedence over valueFrom.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p>Reference a configuration item (valueFrom)</p>
         * <ul>
         * <li><p><strong>name</strong>: The name of the environment variable. You can reference a single key or all keys. To reference all keys, enter <code>sae-sys-configmap-all-&lt;ConfigMap name&gt;</code>, for example, <code>sae-sys-configmap-all-test1</code>.</p>
         * </li>
         * <li><p><strong>valueFrom</strong>: The reference of the environment variable. Set the value to <code>configMapRef</code>.</p>
         * </li>
         * <li><p><strong>configMapId</strong>: The ID of the ConfigMap.</p>
         * </li>
         * <li><p><strong>key</strong>: The key. If you want to reference all keys, do not specify this parameter.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p>Reference a secret (valueFrom)</p>
         * <ul>
         * <li><p><strong>name</strong>: The name of the environment variable. You can reference a single key or all keys. To reference all keys, enter <code>sae-sys-secret-all-&lt;Secret name&gt;</code>, for example, <code>sae-sys-secret-all-test1</code>.</p>
         * </li>
         * <li><p><strong>valueFrom</strong>: The reference of the environment variable. Set the value to <code>secretRef</code>.</p>
         * </li>
         * <li><p><strong>secretId</strong>: The ID of the secret.</p>
         * </li>
         * <li><p><strong>key</strong>: The key. If you want to reference all keys, do not specify this parameter.</p>
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
         * <p>The URL of the image that is used by the init container.</p>
         * 
         * <strong>example:</strong>
         * <p>registry.cn-shenzhen.aliyuncs.com/sae-serverless-demo/sae-demo:microservice-java-provider-v1.0</p>
         */
        @NameInMap("ImageUrl")
        public String imageUrl;

        /**
         * <p>The name of the init container.</p>
         * 
         * <strong>example:</strong>
         * <p>init-container</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The description of the secret that you want to mount.</p>
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
         * <p>The mount path of the container.</p>
         * 
         * <strong>example:</strong>
         * <p>/tmp</p>
         */
        @NameInMap("MountPath")
        public String mountPath;

        /**
         * <p>The path of the NAS file system.</p>
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
         * <p>The directory or object that you created in OSS. An error occurs if the mount directory does not exist.</p>
         * 
         * <strong>example:</strong>
         * <p>data/user.data</p>
         */
        @NameInMap("bucketPath")
        public String bucketPath;

        /**
         * <p>The path of the container in SAE. If the path exists, the path is overwritten. If the path does not exist, a new path is created.</p>
         * 
         * <strong>example:</strong>
         * <p>/usr/data/user.data</p>
         */
        @NameInMap("mountPath")
        public String mountPath;

        /**
         * <p>Specifies whether the container has the read-only permission on the mount directory resources. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: The read-only permission.</p>
         * </li>
         * <li><p><strong>false</strong>: The read and write permissions.</p>
         * </li>
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

    public static class DescribeApplicationConfigResponseBodyDataSecretMountDesc extends TeaModel {
        /**
         * <p>The key of the data value that is encoded in Base64.</p>
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
         * <p>The ID of the queried secret instance.</p>
         * 
         * <strong>example:</strong>
         * <p>520</p>
         */
        @NameInMap("SecretId")
        public Long secretId;

        /**
         * <p>The name of the secret instance.</p>
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
         * <p>The ID of the ConfigMap instance.</p>
         * 
         * <strong>example:</strong>
         * <p>7361</p>
         */
        @NameInMap("ConfigMapId")
        public Long configMapId;

        /**
         * <p>The name of the ConfigMap.</p>
         * 
         * <strong>example:</strong>
         * <p>ConfigMap-test</p>
         */
        @NameInMap("ConfigMapName")
        public String configMapName;

        /**
         * <p>The key of the ConfigMap.</p>
         * 
         * <strong>example:</strong>
         * <p>key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The mount path of the container.</p>
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
         * <p>The path on which the volume is mounted in the container.</p>
         * 
         * <strong>example:</strong>
         * <p>/mnt/cache</p>
         */
        @NameInMap("MountPath")
        public String mountPath;

        /**
         * <p>The name of the temporary storage.</p>
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
         * <p>The key of the data value that is encoded in Base64.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The mount path.</p>
         */
        @NameInMap("MountPath")
        public String mountPath;

        /**
         * <p>The ID of the secret instance.</p>
         */
        @NameInMap("SecretId")
        public Long secretId;

        /**
         * <p>The name of the secret instance.</p>
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
         * <p>The ID of the Container Registry Enterprise Edition instance. This parameter is required if <strong>ImageUrl</strong> is set to an image in Container Registry Enterprise Edition.</p>
         * 
         * <strong>example:</strong>
         * <p>cri-fhzlneorxala66ip</p>
         */
        @NameInMap("AcrInstanceId")
        public String acrInstanceId;

        /**
         * <p>The startup command of the image. The command must be an executable object that exists in the container. Example:</p>
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
         * <p>The arguments of the image startup command. The arguments are required by the preceding startup command <strong>Command</strong>. Format:</p>
         * <p><code>[&quot;a&quot;,&quot;b&quot;]</code></p>
         * <p>In the preceding example, <code>CommandArgs=[&quot;abc&quot;, &quot;&gt;&quot;, &quot;file0&quot;]</code>. The value <code>[&quot;abc&quot;, &quot;&gt;&quot;, &quot;file0&quot;]</code> must be converted into a string in the JSON array format. If this parameter is not required, you do not need to specify it.</p>
         * 
         * <strong>example:</strong>
         * <p>[\&quot;-c\&quot;,\&quot;echo \\\&quot;test\\\&quot; &gt; /home/nas/test.log &amp;&amp; sleep 10000000s\&quot;]</p>
         */
        @NameInMap("CommandArgs")
        public String commandArgs;

        /**
         * <p>The description of the ConfigMap that you want to mount. Use the configuration item that you created on the Namespace Configuration Items page to inject configuration information into the container. The parameters are described as follows:</p>
         * <ul>
         * <li><p><strong>configMapId</strong>: The ID of the ConfigMap instance. You can call the <a href="https://help.aliyun.com/document_detail/176917.html">ListNamespacedConfigMaps</a> operation to obtain the ID.</p>
         * </li>
         * <li><p><strong>key</strong>: The key.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>You can pass the <code>sae-sys-configmap-all</code> parameter to mount all keys.</p>
         * </blockquote>
         * <ul>
         * <li><p><strong>mountPath</strong>: The mount path.</p>
         * </li>
         * <li><p><strong>ConfigMapName</strong>: The name of the ConfigMap.</p>
         * </li>
         * </ul>
         */
        @NameInMap("ConfigMapMountDesc")
        public java.util.List<DescribeApplicationConfigResponseBodyDataSidecarContainersConfigConfigMapMountDesc> configMapMountDesc;

        /**
         * <p>The maximum CPU resources that the sidecar container can use from the main container.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("Cpu")
        public Integer cpu;

        /**
         * <p>The shared temporary storage. Set a temporary storage directory and mount it to the main container and the sidecar container.</p>
         */
        @NameInMap("EmptyDirDesc")
        public java.util.List<DescribeApplicationConfigResponseBodyDataSidecarContainersConfigEmptyDirDesc> emptyDirDesc;

        /**
         * <p>The environment variables of the container. You can customize environment variables or reference a ConfigMap. To reference a ConfigMap, you must first create a ConfigMap instance. For more information, see <a href="https://help.aliyun.com/document_detail/176914.html">CreateConfigMap</a>. Valid values:</p>
         * <ul>
         * <li><p>Custom configuration</p>
         * <ul>
         * <li><p><strong>name</strong>: The name of the environment variable.</p>
         * </li>
         * <li><p><strong>value</strong>: The value of the environment variable. This parameter takes precedence over valueFrom.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p>Reference a configuration item (valueFrom)</p>
         * <ul>
         * <li><p><strong>name</strong>: The name of the environment variable. You can reference a single key or all keys. To reference all keys, enter <code>sae-sys-configmap-all-&lt;ConfigMap name&gt;</code>, for example, <code>sae-sys-configmap-all-test1</code>.</p>
         * </li>
         * <li><p><strong>valueFrom</strong>: The reference of the environment variable. Set the value to <code>configMapRef</code>.</p>
         * <ul>
         * <li><p><strong>configMapId</strong>: The ID of the ConfigMap.</p>
         * </li>
         * <li><p><strong>key</strong>: The key. If you want to reference all keys, do not specify this parameter.</p>
         * </li>
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
         * <p>The health check on the container.</p>
         */
        @NameInMap("Liveness")
        public String liveness;

        /**
         * <p>The maximum memory resources that the sidecar container can use from the main container.</p>
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

        @NameInMap("PostStart")
        public String postStart;

        @NameInMap("PreStop")
        public String preStop;

        /**
         * <p>The check on the application startup status.</p>
         */
        @NameInMap("Readiness")
        public String readiness;

        /**
         * <p>The description of the secret that you want to mount.</p>
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
         * <p>The Alibaba Cloud Resource Name (ARN) of the RAM role that is required to pull images across accounts. For more information, see <a href="https://help.aliyun.com/document_detail/190675.html">Pull images across Alibaba Cloud accounts</a> and <a href="https://help.aliyun.com/document_detail/223585.html">Use a RAM role to grant permissions across Alibaba Cloud accounts</a>.</p>
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
         * <p>The agent version.</p>
         */
        @NameInMap("AgentVersion")
        public String agentVersion;

        /**
         * <p>The configuration of the Application Load Balancer (ALB) gateway readiness gate.</p>
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
         * <p>The type of the SAE application.</p>
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
         * <p>Specifies whether to bind an elastic IP address (EIP). Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Bind an EIP.</p>
         * </li>
         * <li><p><strong>false</strong>: Do not bind an EIP.</p>
         * </li>
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
         * <p>The interval between batches in a phased release. Unit: seconds.</p>
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
         * <p>The Cloud Monitor service ID.</p>
         */
        @NameInMap("CmsServiceId")
        public String cmsServiceId;

        /**
         * <p>The startup command of the image. The command must be an executable object that exists in the container. Example:</p>
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
         * <p>The arguments of the image startup command. The arguments are required by the <strong>Command</strong> parameter. Format:</p>
         * <p><code>[&quot;a&quot;,&quot;b&quot;]</code></p>
         * <p>In the example of the <strong>Command</strong> parameter, <code>CommandArgs=[&quot;abc&quot;, &quot;&gt;&quot;, &quot;file0&quot;]</code>. The value <code>[&quot;abc&quot;, &quot;&gt;&quot;, &quot;file0&quot;]</code> must be converted into a string in the JSON array format. If this parameter is not required, you do not need to specify it.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;a&quot;,&quot;b&quot;]</p>
         */
        @NameInMap("CommandArgs")
        public String commandArgs;

        /**
         * <p>The configurations of the ConfigMap.</p>
         */
        @NameInMap("ConfigMapMountDesc")
        public java.util.List<DescribeApplicationConfigResponseBodyDataConfigMapMountDesc> configMapMountDesc;

        /**
         * <p>The CPU required by each instance. Unit: millicores. The value cannot be 0. The following specifications are supported:</p>
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
         * <p>The custom mapping between a domain name and an IP address in the container. Valid values:</p>
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
         * <p>The type of the custom image. If you do not use a custom image, set this parameter to an empty string. Valid values:</p>
         * <ul>
         * <li><p>internet: a public image</p>
         * </li>
         * <li><p>intranet: a private image</p>
         * </li>
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
         * <p>The disk storage size. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("DiskSize")
        public Integer diskSize;

        /**
         * <p>The version of the .NET framework:</p>
         * <ul>
         * <li><p>.NET 3.1</p>
         * </li>
         * <li><p>.NET 5.0</p>
         * </li>
         * <li><p>.NET 6.0</p>
         * </li>
         * <li><p>.NET 7.0</p>
         * </li>
         * <li><p>.NET 8.0</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>.NET 8.0</p>
         */
        @NameInMap("Dotnet")
        public String dotnet;

        /**
         * <p>The version of the application runtime environment in the High-Speed Service Framework (HSF), such as an Ali-Tomcat container.</p>
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
         * <p>Specifies whether to enable Application High Availability Service (AHAS). Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Enable AHAS.</p>
         * </li>
         * <li><p><strong>false</strong>: Disable AHAS.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableAhas")
        public String enableAhas;

        /**
         * <p>Specifies whether to enable the CPU burst feature:</p>
         * <ul>
         * <li><p>true: Enable</p>
         * </li>
         * <li><p>false: Disable</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableCpuBurst")
        public String enableCpuBurst;

        /**
         * <p>Specifies whether to enable the canary release rule. This rule is applicable only to applications that use the Spring Cloud and Dubbo frameworks. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Enable the canary release rule.</p>
         * </li>
         * <li><p><strong>false</strong>: Disable the canary release rule.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableGreyTagRoute")
        public Boolean enableGreyTagRoute;

        /**
         * <p>Specifies whether to enable the idle mode:</p>
         * <ul>
         * <li><p>true: Enable</p>
         * </li>
         * <li><p>false: Disable</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableIdle")
        public Boolean enableIdle;

        /**
         * <p>Specifies whether to reuse the agent version configuration of the namespace.</p>
         */
        @NameInMap("EnableNamespaceAgentVersion")
        public Boolean enableNamespaceAgentVersion;

        /**
         * <p>Specifies whether to enable the new ARMS feature:</p>
         * <ul>
         * <li><p>true: Enable</p>
         * </li>
         * <li><p>false: Disable</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableNewArms")
        public Boolean enableNewArms;

        /**
         * <p>Specifies whether to enable custom metric collection for Prometheus.</p>
         */
        @NameInMap("EnablePrometheus")
        public Boolean enablePrometheus;

        /**
         * <p>The environment variables for the container. You can customize environment variables or reference a ConfigMap. To reference a ConfigMap, you must first create a ConfigMap. For more information, see <a href="https://help.aliyun.com/document_detail/176914.html">CreateConfigMap</a>. Valid values:</p>
         * <ul>
         * <li><p>Custom configuration</p>
         * <ul>
         * <li><p><strong>name</strong>: The name of the environment variable.</p>
         * </li>
         * <li><p><strong>value</strong>: The value of the environment variable.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p>Reference a configuration item</p>
         * <ul>
         * <li><p><strong>name</strong>: The name of the environment variable. You can reference a single key or all keys. To reference all keys, enter <code>sae-sys-configmap-all-&lt;ConfigMap name&gt;</code>, for example, <code>sae-sys-configmap-all-test1</code>.</p>
         * </li>
         * <li><p><strong>valueFrom</strong>: The reference of the environment variable. Set the value to <code>configMapRef</code>.</p>
         * </li>
         * <li><p><strong>configMapId</strong>: The ID of the ConfigMap.</p>
         * </li>
         * <li><p><strong>key</strong>: The key. If you want to reference all keys, do not specify this parameter.</p>
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
         * <p>The number of GPUs.</p>
         */
        @NameInMap("GpuCount")
        public String gpuCount;

        /**
         * <p>The GPU card type.</p>
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
         * <p>The ID of the secret.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ImagePullSecrets")
        public String imagePullSecrets;

        /**
         * <p>The URL of the image. This parameter is required when <strong>Package Type</strong> is set to <strong>Image</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>docker.io/library/nginx:1.14.2</p>
         */
        @NameInMap("ImageUrl")
        public String imageUrl;

        /**
         * <p>The configurations of the init container.</p>
         */
        @NameInMap("InitContainersConfig")
        public java.util.List<DescribeApplicationConfigResponseBodyDataInitContainersConfig> initContainersConfig;

        /**
         * <p>Specifies whether the application is a stateful application.</p>
         */
        @NameInMap("IsStateful")
        public Boolean isStateful;

        /**
         * <p>The arguments for starting the JAR package. The default startup command is: <code>$JAVA_HOME/bin/java $JarStartOptions -jar $CATALINA_OPTS &quot;$package_path&quot; $JarStartArgs</code></p>
         * 
         * <strong>example:</strong>
         * <p>start</p>
         */
        @NameInMap("JarStartArgs")
        public String jarStartArgs;

        /**
         * <p>The options for starting the JAR package. The default startup command is: <code>$JAVA_HOME/bin/java $JarStartOptions -jar $CATALINA_OPTS &quot;$package_path&quot; $JarStartArgs</code></p>
         * 
         * <strong>example:</strong>
         * <p>-Dtest=true</p>
         */
        @NameInMap("JarStartOptions")
        public String jarStartOptions;

        /**
         * <p>The version of the Java Development Kit (JDK) that the deployment package requires. The following versions are supported:</p>
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
         * <p>This parameter is not supported when <strong>Package Type</strong> is set to <strong>Image</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>Open JDK 8</p>
         */
        @NameInMap("Jdk")
        public String jdk;

        /**
         * <p>The configurations for collecting logs to Kafka. Valid values:</p>
         * <ul>
         * <li><p><strong>kafkaEndpoint</strong>: The endpoint of the Kafka API.</p>
         * </li>
         * <li><p><strong>kafkaInstanceId</strong>: The ID of the Kafka instance.</p>
         * </li>
         * <li><p><strong>kafkaConfigs</strong>: The configurations of one or more logs. For more information about the example and parameters, see the <strong>kafkaConfigs</strong> request parameter in this topic.</p>
         * </li>
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
         * <p>The liveness probe of the container. A container that fails the health check is shut down and restored. The following methods are supported:</p>
         * <ul>
         * <li><p><strong>exec</strong>: example: <code>{&quot;exec&quot;:{&quot;command&quot;:[&quot;sh&quot;,&quot;-c&quot;,&quot;cat/home/admin/start.sh&quot;]},&quot;initialDelaySeconds&quot;:30,&quot;periodSeconds&quot;:30,&quot;timeoutSeconds&quot;:2}</code></p>
         * </li>
         * <li><p><strong>httpGet</strong>: example:<code>{&quot;httpGet&quot;:{&quot;path&quot;:&quot;/&quot;,&quot;port&quot;:18091,&quot;scheme&quot;:&quot;HTTP&quot;,&quot;isContainKeyWord&quot;:true,&quot;keyWord&quot;:&quot;SAE&quot;},&quot;initialDelaySeconds&quot;:11,&quot;periodSeconds&quot;:10,&quot;timeoutSeconds&quot;:1}</code></p>
         * </li>
         * <li><p><strong>tcpSocket</strong>: example:<code>{&quot;tcpSocket&quot;:{&quot;port&quot;:18091},&quot;initialDelaySeconds&quot;:11,&quot;periodSeconds&quot;:10,&quot;timeoutSeconds&quot;:1}</code></p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>You can use only one method for a health check.</p>
         * </blockquote>
         * <p>The parameters are described as follows:</p>
         * <ul>
         * <li><p><strong>exec.command</strong>: The command that is used for the health check.</p>
         * </li>
         * <li><p><strong>httpGet.path</strong>: The request path.</p>
         * </li>
         * <li><p><strong>httpGet.scheme</strong>: <strong>HTTP</strong> or <strong>HTTPS</strong>.</p>
         * </li>
         * <li><p><strong>httpGet.isContainKeyWord</strong>: Specifies whether the response must contain a keyword. A value of <strong>true</strong> indicates that the response must contain the keyword. A value of <strong>false</strong> indicates that the response does not need to contain the keyword. If you do not specify this parameter, this advanced feature is not used.</p>
         * </li>
         * <li><p><strong>httpGet.keyWord</strong>: The custom keyword. This parameter is required if you set the <strong>isContainKeyWord</strong> parameter.</p>
         * </li>
         * <li><p><strong>tcpSocket.port</strong>: The port that is used for the TCP connection check.</p>
         * </li>
         * <li><p><strong>initialDelaySeconds</strong>: The delay for the health check. Default value: 10. Unit: seconds.</p>
         * </li>
         * <li><p><strong>periodSeconds</strong>: The interval for the health check. Default value: 30. Unit: seconds.</p>
         * </li>
         * <li><p><strong>timeoutSeconds</strong>: The timeout period for the health check. Default value: 1. Unit: seconds. If you set this parameter to 0 or do not specify this parameter, the default value is used.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;exec&quot;:{&quot;command&quot;:[&quot;curl <a href="http://localhost:8080%22%5D%7D,%22initialDelaySeconds%22:20,%22timeoutSeconds%22:3%7D">http://localhost:8080&quot;]},&quot;initialDelaySeconds&quot;:20,&quot;timeoutSeconds&quot;:3}</a></p>
         */
        @NameInMap("Liveness")
        public String liveness;

        /**
         * <p>The Loki configurations.</p>
         */
        @NameInMap("LokiConfigs")
        public String lokiConfigs;

        /**
         * <p>The maximum surge instance ratio.</p>
         */
        @NameInMap("MaxSurgeInstanceRatio")
        public Integer maxSurgeInstanceRatio;

        /**
         * <p>The maximum number of surge instances.</p>
         */
        @NameInMap("MaxSurgeInstances")
        public Integer maxSurgeInstances;

        /**
         * <p>The memory required by each instance. Unit: MB. The value cannot be 0. This parameter corresponds to the \<code>Cpu\\</code> parameter. The following specifications are supported:</p>
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
         * <p>The Nacos registry. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: SAE built-in Nacos.</p>
         * </li>
         * <li><p><strong>1</strong>: User-created Nacos.</p>
         * </li>
         * <li><p><strong>2</strong>: MSE Nacos.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>&quot;0&quot;</p>
         */
        @NameInMap("MicroRegistration")
        public String microRegistration;

        /**
         * <p>The configuration of the registry. This parameter takes effect only when the registry is MSE Nacos Enterprise Edition.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;instanceId\&quot;:\&quot;mse-cn-1ls43******\&quot;,\&quot;namespace\&quot;:\&quot;62ee12fb-c279-4da4-be96-21**********\&quot;}</p>
         */
        @NameInMap("MicroRegistrationConfig")
        public String microRegistrationConfig;

        /**
         * <p>The configurations of microservice governance.</p>
         * <ul>
         * <li><p>Specifies whether to enable microservice governance (enable):</p>
         * <ul>
         * <li><p>true: Enable</p>
         * </li>
         * <li><p>false: Disable</p>
         * </li>
         * </ul>
         * </li>
         * <li><p>The configuration of graceful start and shutdown (mseLosslessRule):</p>
         * <ul>
         * <li><p>delayTime: The delay time.</p>
         * </li>
         * <li><p>enable: Specifies whether to enable graceful start. true indicates that graceful start is enabled. false indicates that graceful start is not enabled.</p>
         * </li>
         * <li><p>notice: Specifies whether to enable notifications. true indicates that notifications are enabled. false indicates that notifications are not enabled.</p>
         * </li>
         * <li><p>warmupTime: The warm-up duration for a small amount of traffic. Unit: seconds.</p>
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
         * <p>The percentage of the minimum number of ready instances. Valid values:</p>
         * <ul>
         * <li><p>-1: The default value. This value indicates that the percentage is not used. If you do not specify this parameter, the system uses the default value <strong>-1</strong>.</p>
         * </li>
         * <li><p><strong>0 to 100</strong>: The percentage of the minimum number of ready instances. The value is rounded up. For example, if you set this parameter to <strong>50</strong>%, and you have five instances, the minimum number of ready instances is 3.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>If you specify both \<code>MinReadyInstances\\</code> and <strong>MinReadyInstanceRatio</strong>, and the value of <strong>MinReadyInstanceRatio</strong> is not <strong>-1</strong>, the value of <strong>MinReadyInstanceRatio</strong> takes precedence. For example, if <strong>MinReadyInstances</strong> is set to <strong>5</strong> and <strong>MinReadyInstanceRatio</strong> is set to <strong>50</strong>, the minimum number of ready instances is calculated based on the value of <strong>MinReadyInstanceRatio</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("MinReadyInstanceRatio")
        public Integer minReadyInstanceRatio;

        /**
         * <p>The minimum number of ready instances. Valid values:</p>
         * <ul>
         * <li><p>If you set this parameter to <strong>0</strong>, the application may be interrupted during an upgrade.</p>
         * </li>
         * <li><p>If you set this parameter to -1, the system uses a recommended value, which is 25% of the total number of instances. For example, if you have five instances, the minimum number of ready instances is 2 after the value is rounded up.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>We recommend that you set the minimum number of ready instances to a value of 1 or greater to ensure that the application is not interrupted during a rolling update.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MinReadyInstances")
        public Integer minReadyInstances;

        /**
         * <p>The mount description.</p>
         */
        @NameInMap("MountDesc")
        public java.util.List<DescribeApplicationConfigResponseBodyDataMountDesc> mountDesc;

        /**
         * <p>The mount target of the Apsara File Storage NAS file system in the application VPC. If you do not change the NAS configuration during a deployment, you do not need to specify this parameter. If you want to clear the NAS configuration, set this parameter to an empty string (&quot;&quot;).</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("MountHost")
        public String mountHost;

        /**
         * <p>The ID of the application in Microservices Engine (MSE).</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxxxx@xxxxx</p>
         */
        @NameInMap("MseApplicationId")
        public String mseApplicationId;

        /**
         * <p>The name of the application after the SAE service is registered with MSE.</p>
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
         * <p>The configurations for mounting a NAS file system.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;mountPath&quot;:&quot;/test1&quot;,&quot;readOnly&quot;:false,&quot;nasId&quot;:&quot;nasId1&quot;,&quot;mountDomain&quot;:&quot;nasId1.cn-shenzhen.nas.aliyuncs.com&quot;,&quot;nasPath&quot;:&quot;/test1&quot;},{&quot;nasId&quot;:&quot;nasId2&quot;,&quot;mountDomain&quot;:&quot;nasId2.cn-shenzhen.nas.aliyuncs.com&quot;,&quot;readOnly&quot;:false,&quot;nasPath&quot;:&quot;/test2&quot;,&quot;mountPath&quot;:&quot;/test2&quot;}]</p>
         */
        @NameInMap("NasConfigs")
        public String nasConfigs;

        /**
         * <p>The ID of the NAS file system.</p>
         * 
         * <strong>example:</strong>
         * <p>AKSN****</p>
         */
        @NameInMap("NasId")
        public String nasId;

        /**
         * <p>The application version.</p>
         * <ul>
         * <li><p>lite: Lightweight Edition</p>
         * </li>
         * <li><p>std: Standard Edition</p>
         * </li>
         * <li><p>pro: Professional Edition</p>
         * </li>
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
         * <p>You must create an OpenID Connect (OIDC) identity provider (IdP) and a RAM role for the IdP in the same region beforehand. For more information, see <a href="https://help.aliyun.com/document_detail/2331022.html">Create an OIDC IdP</a> and <a href="https://help.aliyun.com/document_detail/2331016.html">Create a RAM role for a trusted IdP</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>sae-test</p>
         */
        @NameInMap("OidcRoleName")
        public String oidcRoleName;

        /**
         * <p>The AccessKey ID that is used to read data from and write data to Object Storage Service (OSS).</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("OssAkId")
        public String ossAkId;

        /**
         * <p>The AccessKey secret that is used to read data from and write data to OSS.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("OssAkSecret")
        public String ossAkSecret;

        /**
         * <p>The description of the OSS mount.</p>
         */
        @NameInMap("OssMountDescs")
        public java.util.List<DescribeApplicationConfigResponseBodyDataOssMountDescs> ossMountDescs;

        /**
         * <p>The type of the application package. Valid values:</p>
         * <ul>
         * <li><p>If you deploy the application using Java, valid values are <strong>FatJar</strong>, <strong>War</strong>, and <strong>Image</strong>.</p>
         * </li>
         * <li><p>If you deploy the application using PHP, the following values are supported:</p>
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
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>War</p>
         */
        @NameInMap("PackageType")
        public String packageType;

        /**
         * <p>The URL of the deployment package. If you upload the deployment package using SAE, note the following:</p>
         * <ul>
         * <li><p>You cannot download the package from this URL. Call the \<code>GetPackageVersionAccessableUrl\\</code> operation to obtain a download URL that is valid for 10 minutes.</p>
         * </li>
         * <li><p>SAE stores the package for a maximum of 90 days. After 90 days, the URL is not returned and you cannot download the package.</p>
         * </li>
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
         * <p>The PHP version required for the deployment package. This parameter is not supported for images.</p>
         * 
         * <strong>example:</strong>
         * <p>PHP-FPM 7.0</p>
         */
        @NameInMap("Php")
        public String php;

        /**
         * <p>The mount path of the Application Real-Time Monitoring Service (ARMS) configuration file for a PHP application. Make sure that the PHP server loads the configuration file from this path.</p>
         * <p>SAE automatically renders the correct configuration file. You do not need to manage the content of the configuration file.</p>
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
         * <p>The mount path of the PHP application startup configuration file. Make sure that the PHP server uses this configuration file to start.</p>
         * 
         * <strong>example:</strong>
         * <p>/usr/local/etc/php/php.ini</p>
         */
        @NameInMap("PhpConfigLocation")
        public String phpConfigLocation;

        /**
         * <p>The script that runs after the container starts. The script runs immediately after the container is created. Example: <code>{&quot;exec&quot;:{&quot;command&quot;:[&quot;cat&quot;,&quot;/etc/group&quot;]}}</code></p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;exec&quot;:{&quot;command&quot;:[&quot;cat&quot;,&quot;/etc/group&quot;]}}</p>
         */
        @NameInMap("PostStart")
        public String postStart;

        /**
         * <p>The script that runs before the container is stopped. The script runs before the container is deleted. Example: <code>{&quot;exec&quot;:{&quot;command&quot;:[&quot;cat&quot;,&quot;/etc/group&quot;]}}</code></p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;exec&quot;:{&quot;command&quot;:[&quot;cat&quot;,&quot;/etc/group&quot;]}}</p>
         */
        @NameInMap("PreStop")
        public String preStop;

        /**
         * <p>The programming language of the application. Valid values:</p>
         * <ul>
         * <li><p><strong>java</strong>: Java</p>
         * </li>
         * <li><p><strong>php</strong>: PHP</p>
         * </li>
         * <li><p><strong>other</strong>: other languages, such as Python, C++, Go, .NET, and Node.js.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>java</p>
         */
        @NameInMap("ProgrammingLanguage")
        public String programmingLanguage;

        /**
         * <p>Enables service registration and discovery for a Kubernetes Service.</p>
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
         * <p>The dependencies for custom installation modules. By default, the dependencies that are defined in the requirements.txt file in the root directory are installed. If no software package is configured or a custom software package is used, you can specify the dependencies to be installed.</p>
         * 
         * <strong>example:</strong>
         * <p>Flask==2.0</p>
         */
        @NameInMap("PythonModules")
        public String pythonModules;

        /**
         * <p>The readiness probe of the application. A container that fails the health check multiple times is shut down and restarted. A container that fails the health check does not receive traffic from a Server Load Balancer (SLB) instance. You can perform the health check using the <strong>exec</strong>, <strong>httpGet</strong>, or <strong>tcpSocket</strong> method. For more information, see the <strong>Liveness</strong> parameter.</p>
         * <blockquote>
         * <p>You can use only one method for a health check.</p>
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
         * <p>The description of the secret that you want to mount.</p>
         */
        @NameInMap("SecretMountDesc")
        public java.util.List<DescribeApplicationConfigResponseBodyDataSecretMountDesc> secretMountDesc;

        /**
         * <p>The ID of the security group.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-wz969ngg2e49q5i4****</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The canary release tags of the application configuration.</p>
         */
        @NameInMap("ServiceTags")
        public java.util.Map<String, String> serviceTags;

        /**
         * <p>The configurations of the sidecar container.</p>
         */
        @NameInMap("SidecarContainersConfig")
        public java.util.List<DescribeApplicationConfigResponseBodyDataSidecarContainersConfig> sidecarContainersConfig;

        /**
         * <p>The configurations for collecting logs to Simple Log Service (SLS).</p>
         * <ul>
         * <li><p>To use an SLS resource that is automatically created by SAE: <code>[{&quot;logDir&quot;:&quot;&quot;,&quot;logType&quot;:&quot;stdout&quot;},{&quot;logDir&quot;:&quot;/tmp/a.log&quot;}]</code>.</p>
         * </li>
         * <li><p>To use a custom SLS resource: <code>[{&quot;projectName&quot;:&quot;test-sls&quot;,&quot;logType&quot;:&quot;stdout&quot;,&quot;logDir&quot;:&quot;&quot;,&quot;logstoreName&quot;:&quot;sae&quot;,&quot;logtailName&quot;:&quot;&quot;},{&quot;projectName&quot;:&quot;test&quot;,&quot;logDir&quot;:&quot;/tmp/a.log&quot;,&quot;logstoreName&quot;:&quot;sae&quot;,&quot;logtailName&quot;:&quot;&quot;}]</code>.</p>
         * </li>
         * </ul>
         * <p>The parameters are described as follows:</p>
         * <ul>
         * <li><p><strong>projectName</strong>: The name of the SLS project.</p>
         * </li>
         * <li><p><strong>logDir</strong>: The log path.</p>
         * </li>
         * <li><p><strong>logType</strong>: The log type. <strong>stdout</strong> indicates the standard output log of the container. You can specify only one log of this type. If you do not specify this parameter, file logs are collected.</p>
         * </li>
         * <li><p><strong>logstoreName</strong>: The name of the Logstore in SLS.</p>
         * </li>
         * <li><p><strong>logtailName</strong>: The name of the Logtail configuration in SLS. If you do not specify this parameter, a new Logtail configuration is created.</p>
         * </li>
         * </ul>
         * <p>If you do not change the log collection configuration during a deployment, you do not need to specify this parameter. If you no longer need to use the log collection feature, set this parameter to an empty string (&quot;&quot;) in the request.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;logDir&quot;:&quot;&quot;,&quot;logType&quot;:&quot;stdout&quot;},{&quot;logDir&quot;:&quot;/tmp/a.log&quot;}]</p>
         */
        @NameInMap("SlsConfigs")
        public String slsConfigs;

        /**
         * <p>The environment tags for SLS logs.</p>
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
         * <p>The configuration for service registration and discovery based on a Kubernetes Service and for end-to-end canary release.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;enable\&quot;:\&quot;false\&quot;,\&quot;namespaceId\&quot;:\&quot;cn-beijing:test\&quot;,\&quot;portAndProtocol\&quot;:{\&quot;2000:TCP\&quot;:\&quot;18081\&quot;},\&quot;portProtocols\&quot;:[{\&quot;port\&quot;:2000,\&quot;protocol\&quot;:\&quot;TCP\&quot;,\&quot;targetPort\&quot;:18081}],\&quot;pvtzDiscoveryName\&quot;:\&quot;cn-beijing-1421801774382676\&quot;,\&quot;serviceId\&quot;:\&quot;3513\&quot;,\&quot;serviceName\&quot;:\&quot;demo-gray.test\&quot;}</p>
         */
        @NameInMap("SwimlanePvtzDiscovery")
        public String swimlanePvtzDiscovery;

        /**
         * <p>The tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<DescribeApplicationConfigResponseBodyDataTags> tags;

        /**
         * <p>The timeout period for a graceful shutdown. Default value: 30. Unit: seconds. The value can range from 1 to 300.</p>
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
         * <p>The Tomcat configuration. To delete the configuration, set this parameter to &quot;&quot; or &quot;{}&quot;.</p>
         * <ul>
         * <li><p><strong>port</strong>: The port number. The port number can range from 1024 to 65535. A port number smaller than 1024 requires the root permission to be operated. Because the container is configured with the administrator permission, specify a port number that is greater than 1024. If you do not configure this parameter, the default port 8080 is used.</p>
         * </li>
         * <li><p><strong>contextPath</strong>: The access path. The default value is the root directory &quot;/&quot;.</p>
         * </li>
         * <li><p><strong>maxThreads</strong>: The maximum number of connections in the connection pool. Default value: 400.</p>
         * </li>
         * <li><p><strong>uriEncoding</strong>: The URI encoding scheme of Tomcat. Valid values: <strong>UTF-8</strong>, <strong>ISO-8859-1</strong>, <strong>GBK</strong>, and <strong>GB2312</strong>. If you do not set this parameter, the default value <strong>ISO-8859-1</strong> is used.</p>
         * </li>
         * <li><p><strong>useBodyEncoding</strong>: Specifies whether to use <strong>BodyEncoding for URL</strong>. Default value: <strong>true</strong>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;port&quot;:8080,&quot;contextPath&quot;:&quot;/&quot;,&quot;maxThreads&quot;:400,&quot;uriEncoding&quot;:&quot;ISO-8859-1&quot;,&quot;useBodyEncodingForUri&quot;:true}</p>
         */
        @NameInMap("TomcatConfig")
        public String tomcatConfig;

        /**
         * <p>The deployment policy. If the minimum number of ready instances is 1, the value of the <strong>UpdateStrategy</strong> parameter is &quot;&quot;. If the minimum number of ready instances is greater than 1, see the following examples:</p>
         * <ul>
         * <li><p>Canary release of one instance, phased release in two batches, automatic batching, and a 1-minute interval between batches: <code>{&quot;type&quot;:&quot;GrayBatchUpdate&quot;,&quot;batchUpdate&quot;:{&quot;batch&quot;:2,&quot;releaseType&quot;:&quot;auto&quot;,&quot;batchWaitTime&quot;:1},&quot;grayUpdate&quot;:{&quot;gray&quot;:1}}</code></p>
         * </li>
         * <li><p>Canary release of one instance and phased release in two batches with manual batching: <code>{&quot;type&quot;:&quot;GrayBatchUpdate&quot;,&quot;batchUpdate&quot;:{&quot;batch&quot;:2,&quot;releaseType&quot;:&quot;manual&quot;},&quot;grayUpdate&quot;:{&quot;gray&quot;:1}}</code></p>
         * </li>
         * <li><p>Phased release in two batches, automatic batching, and a 0-minute interval between batches: <code>{&quot;type&quot;:&quot;BatchUpdate&quot;,&quot;batchUpdate&quot;:{&quot;batch&quot;:2,&quot;releaseType&quot;:&quot;auto&quot;,&quot;batchWaitTime&quot;:0}}</code></p>
         * </li>
         * </ul>
         * <p>The parameters are described as follows:</p>
         * <ul>
         * <li><p><strong>type</strong>: The type of the release policy. Valid values: <strong>GrayBatchUpdate</strong> (canary release) and <strong>BatchUpdate</strong> (phased release).</p>
         * </li>
         * <li><p><strong>batchUpdate</strong>: The phased release policy.</p>
         * <ul>
         * <li><p><strong>batch</strong>: The number of release batches.</p>
         * </li>
         * <li><p><strong>releaseType</strong>: The processing method for batches. Valid values: <strong>auto</strong> and <strong>manual</strong>.</p>
         * </li>
         * <li><p><strong>batchWaitTime</strong>: The interval between batches. Unit: seconds.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p><strong>grayUpdate</strong>: The number of batches for the remaining instances after the canary release. This parameter is required when <strong>type</strong> is set to <strong>GrayBatchUpdate</strong>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;type&quot;:&quot;GrayBatchUpdate&quot;,&quot;batchUpdate&quot;:{&quot;batch&quot;:2,&quot;releaseType&quot;:&quot;auto&quot;,&quot;batchWaitTime&quot;:1},&quot;grayUpdate&quot;:{&quot;gray&quot;:1}}</p>
         */
        @NameInMap("UpdateStrategy")
        public String updateStrategy;

        /**
         * <p>The vSwitch ID.</p>
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
         * <p>The options for starting the WAR package. The default startup command is: <code>java $JAVA_OPTS $CATALINA_OPTS -Options org.apache.catalina.startup.Bootstrap &quot;$@&quot; start</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>custom-option</p>
         */
        @NameInMap("WarStartOptions")
        public String warStartOptions;

        /**
         * <p>The Tomcat version that the deployment package requires. The following versions are supported:</p>
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
