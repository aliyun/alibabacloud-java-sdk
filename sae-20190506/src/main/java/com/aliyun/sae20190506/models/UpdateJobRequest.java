// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpdateJobRequest extends TeaModel {
    /**
     * <p>The ARN of the RAM role required to pull images across accounts. For more information, see <a href="https://help.aliyun.com/document_detail/223585.html">Implement cross-account authorization by using RAM roles</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::123456789012****:role/adminrole</p>
     */
    @NameInMap("AcrAssumeRoleArn")
    public String acrAssumeRoleArn;

    /**
     * <p>The ACR Enterprise instance ID. This parameter is required when <strong>ImageUrl</strong> is a Container Registry Enterprise instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cri-xxxxxx</p>
     */
    @NameInMap("AcrInstanceId")
    public String acrInstanceId;

    /**
     * <p>The ID of the job template to update.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7171a6ca-d1cd-4928-8642-7d5cfe69****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The number of retries for the job.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("BackoffLimit")
    public Long backoffLimit;

    /**
     * <p>The BestEffort policy.</p>
     * 
     * <strong>example:</strong>
     * <p>besteffort</p>
     */
    @NameInMap("BestEffortType")
    public String bestEffortType;

    /**
     * <p>The startup command of the image. The command must be an executable object that exists in the container. Example:</p>
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
     * <p>The arguments for the image startup command. These are the arguments required by the <strong>Command</strong> parameter. Format:</p>
     * <p><code>[&quot;a&quot;,&quot;b&quot;]</code></p>
     * <p>In the preceding example, <code>CommandArgs=[&quot;abc&quot;, &quot;&gt;&quot;, &quot;file0&quot;]</code>. The <code>[&quot;abc&quot;, &quot;&gt;&quot;, &quot;file0&quot;]</code> part must be converted to a string in JSON array format. If this parameter is not required, leave it empty.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;a&quot;,&quot;b&quot;]</p>
     */
    @NameInMap("CommandArgs")
    public String commandArgs;

    /**
     * <p>The concurrency policy of the job. Valid values:</p>
     * <ul>
     * <li><strong>Forbid</strong>: Forbids concurrent execution. A new job is not created if the previous job is not completed.</li>
     * <li><strong>Allow</strong>: Allows concurrent execution of jobs.</li>
     * <li><strong>Replace</strong>: Replaces the previous job with a new job if the previous job is not completed when the new job is scheduled to be created.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Allow</p>
     */
    @NameInMap("ConcurrencyPolicy")
    public String concurrencyPolicy;

    /**
     * <p>The mount description of the <strong>ConfigMap</strong>. Use the ConfigMaps created on the namespace configuration item page to inject configuration information into the container. Parameter descriptions:</p>
     * <ul>
     * <li><strong>congfigMapId</strong>: The instance ID of the ConfigMap instance. You can invoke the <a href="https://help.aliyun.com/document_detail/176917.html">ListNamespacedConfigMaps</a> operation to obtain the instance ID.</li>
     * <li><strong>key</strong>: The key value.</li>
     * </ul>
     * <blockquote>
     * <p>You can mount all keys by passing the <code>sae-sys-configmap-all</code> parameter.</p>
     * </blockquote>
     * <ul>
     * <li><strong>mountPath</strong>: The mount path.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;configMapId&quot;:16,&quot;key&quot;:&quot;test&quot;,&quot;mountPath&quot;:&quot;/tmp&quot;}]</p>
     */
    @NameInMap("ConfigMapMountDesc")
    public String configMapMountDesc;

    /**
     * <p>The custom host mappings in the container. Valid values:</p>
     * <ul>
     * <li><strong>hostName</strong>: The domain name or hostname.</li>
     * <li><strong>ip</strong>: The IP address.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;hostName&quot;:&quot;samplehost&quot;,&quot;ip&quot;:&quot;127.0.0.1&quot;}]</p>
     */
    @NameInMap("CustomHostAlias")
    public String customHostAlias;

    /**
     * <p>The runtime environment version for the job in the HSF framework, such as the Ali-Tomcat container.</p>
     * 
     * <strong>example:</strong>
     * <p>3.5.3</p>
     */
    @NameInMap("EdasContainerVersion")
    public String edasContainerVersion;

    /**
     * <p>Specifies whether to enable image acceleration.</p>
     */
    @NameInMap("EnableImageAccl")
    public Boolean enableImageAccl;

    /**
     * <p>The environment variables for the container. You can specify custom environment variables or reference ConfigMaps. To reference a ConfigMap, you must create a ConfigMap instance first. For more information, see <a href="https://help.aliyun.com/document_detail/176914.html">CreateConfigMap</a>. Valid values:</p>
     * <ul>
     * <li>Custom configuration<ul>
     * <li><strong>name</strong>: The name of the environment variable.</li>
     * <li><strong>value</strong>: The value of the environment variable.</li>
     * </ul>
     * </li>
     * <li>Reference a ConfigMap<ul>
     * <li><strong>name</strong>: The name of the environment variable. You can reference a single key or all keys. To reference all keys, enter <code>sae-sys-configmap-all-&lt;ConfigMap name&gt;</code>, for example, <code>sae-sys-configmap-all-test1</code>.</li>
     * <li><strong>valueFrom</strong>: The reference of the environment variable. Set the value to <code>configMapRef</code>.</li>
     * <li><strong>configMapId</strong>: The ID of the ConfigMap.</li>
     * <li><strong>key</strong>: The key. If you reference all key-value pairs, do not set this field.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;name&quot;:&quot;envtmp&quot;,&quot;value&quot;:&quot;0&quot;}]</p>
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
     * <p>The URL of the image. This parameter is required when <strong>Package Type</strong> is set to <strong>Image</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>registry.cn-hangzhou.aliyuncs.com/sae_test/ali_sae_test:0.0.1</p>
     */
    @NameInMap("ImageUrl")
    public String imageUrl;

    /**
     * <p>The startup arguments for the JAR package job. Default job startup command: <code>$JAVA_HOME/bin/java $JarStartOptions -jar $CATALINA_OPTS &quot;$package_path&quot; $JarStartArgs</code></p>
     * 
     * <strong>example:</strong>
     * <p>-Xms4G -Xmx4G</p>
     */
    @NameInMap("JarStartArgs")
    public String jarStartArgs;

    /**
     * <p>The startup options for the JAR package job. Default job startup command: <code>$JAVA_HOME/bin/java $JarStartOptions -jar $CATALINA_OPTS &quot;$package_path&quot; $JarStartArgs</code></p>
     * 
     * <strong>example:</strong>
     * <p>custom-option</p>
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
     * <p>This parameter is not supported when <strong>Package Type</strong> is set to <strong>Image</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>Open JDK 8</p>
     */
    @NameInMap("Jdk")
    public String jdk;

    /**
     * <p>The description of the NAS mount. If the configuration remains unchanged during deployment, you do not need to set this parameter. That is, you do not need to include the <strong>MountDesc</strong> field in the request. To clear the NAS configuration, you must set this field to an empty string in the request. That is, set the value of <strong>MountDesc</strong> to &quot;&quot;.</p>
     * 
     * <strong>example:</strong>
     * <p>[{mountPath: &quot;/tmp&quot;, nasPath: &quot;/&quot;}]</p>
     */
    @NameInMap("MountDesc")
    public String mountDesc;

    /**
     * <p>The mount target of the NAS file system in the VPC of the job template. If the configuration remains unchanged during deployment, you do not need to set this parameter. That is, you do not need to include the <strong>MountHost</strong> field in the request. To clear the NAS configuration, you must set this field to an empty string in the request. That is, set the value of <strong>MountHost</strong> to &quot;&quot;.</p>
     * 
     * <strong>example:</strong>
     * <p>10d3b4bc9****.com</p>
     */
    @NameInMap("MountHost")
    public String mountHost;

    /**
     * <p>The configuration for mounting the NAS file system.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;mountPath&quot;:&quot;/test1&quot;,&quot;readOnly&quot;:false,&quot;nasId&quot;:&quot;nasId1&quot;,&quot;mountDomain&quot;:&quot;nasId1.cn-shenzhen.nas.aliyuncs.com&quot;,&quot;nasPath&quot;:&quot;/test1&quot;},{&quot;nasId&quot;:&quot;nasId2&quot;,&quot;mountDomain&quot;:&quot;nasId2.cn-shenzhen.nas.aliyuncs.com&quot;,&quot;readOnly&quot;:false,&quot;nasPath&quot;:&quot;/test2&quot;,&quot;mountPath&quot;:&quot;/test2&quot;}]</p>
     */
    @NameInMap("NasConfigs")
    public String nasConfigs;

    /**
     * <p>The ID of the Apsara File Storage NAS file system. If the configuration remains unchanged during deployment, you do not need to set this parameter. That is, you do not need to include the <strong>NasId</strong> field in the request. To clear the NAS configuration, you must set this field to an empty string in the request. That is, set the value of <strong>NasId</strong> to &quot;&quot;.</p>
     * 
     * <strong>example:</strong>
     * <p>10d3b4****</p>
     */
    @NameInMap("NasId")
    public String nasId;

    /**
     * <p>The AccessKey ID used to read and write OSS data.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxxx</p>
     */
    @NameInMap("OssAkId")
    public String ossAkId;

    /**
     * <p>The AccessKey Secret used to read and write OSS data.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxxx</p>
     */
    @NameInMap("OssAkSecret")
    public String ossAkSecret;

    /**
     * <p>The OSS mount description. Parameter descriptions:</p>
     * <ul>
     * <li><strong>bucketName</strong>: The name of the bucket.</li>
     * <li><strong>bucketPath</strong>: The folder or object that you created in OSS. If the OSS mount folder does not exist, an exception is triggered.</li>
     * <li><strong>mountPath</strong>: The container path in SAE. If the path already exists, it overwrites the existing content. If the path does not exist, it is created.</li>
     * <li><strong>readOnly</strong>: Specifies whether the container path has read permissions on the mount folder resources. Valid values:<ul>
     * <li><strong>true</strong>: Read-only permissions.</li>
     * <li><strong>false</strong>: Read and write permissions.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;bucketName&quot;: &quot;oss-bucket&quot;, &quot;bucketPath&quot;: &quot;data/user.data&quot;, &quot;mountPath&quot;: &quot;/usr/data/user.data&quot;, &quot;readOnly&quot;: true}]</p>
     */
    @NameInMap("OssMountDescs")
    public String ossMountDescs;

    /**
     * <p>The URL of the deployment package. This parameter is required when <strong>Package Type</strong> is set to <strong>FatJar</strong>, <strong>War</strong>, or <strong>PythonZip</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://myoss.oss-cn-hangzhou.aliyuncs.com/my-buc/2019-06-30/****.jar">http://myoss.oss-cn-hangzhou.aliyuncs.com/my-buc/2019-06-30/****.jar</a></p>
     */
    @NameInMap("PackageUrl")
    public String packageUrl;

    /**
     * <p>The version number of the deployment package. This parameter is required when <strong>Package Type</strong> is set to <strong>FatJar</strong>, <strong>War</strong>, or <strong>PythonZip</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0.1</p>
     */
    @NameInMap("PackageVersion")
    public String packageVersion;

    /**
     * <p>The ACR Enterprise instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cri-xxxxxx</p>
     */
    @NameInMap("Php")
    public String php;

    /**
     * <p>The content of the PHP configuration file.</p>
     * 
     * <strong>example:</strong>
     * <p>k1=v1</p>
     */
    @NameInMap("PhpConfig")
    public String phpConfig;

    /**
     * <p>The mount path for the PHP job startup configuration. You must ensure that the PHP server uses this configuration file to start.</p>
     * 
     * <strong>example:</strong>
     * <p>/usr/local/etc/php/php.ini</p>
     */
    @NameInMap("PhpConfigLocation")
    public String phpConfigLocation;

    /**
     * <p>The script to execute after the container starts. A script is executed immediately after the container is created. Format: <code>{&quot;exec&quot;:{&quot;command&quot;:[&quot;sh&quot;,&quot;-c&quot;,&quot;echo hello&quot;]}}</code></p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;exec&quot;:{&quot;command&quot;:[&quot;sh&quot;,&quot;-c&quot;,&quot;echo hello&quot;]}}</p>
     */
    @NameInMap("PostStart")
    public String postStart;

    /**
     * <p>The script to execute before the container stops. A script is executed before the container is deleted. Format: <code>{&quot;exec&quot;:{&quot;command&quot;:[&quot;sh&quot;,&quot;-c&quot;,&quot;echo hello&quot;]}}</code></p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;exec&quot;:{&quot;command&quot;:[&quot;sh&quot;,&quot;-c&quot;,&quot;echo hello&quot;]}}</p>
     */
    @NameInMap("PreStop")
    public String preStop;

    /**
     * <p>The programming language. Valid values: <strong>java</strong>, <strong>php</strong>, <strong>python</strong>, and <strong>shell</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>java</p>
     */
    @NameInMap("ProgrammingLanguage")
    public String programmingLanguage;

    /**
     * <p>The Python environment. Supported version: <strong>PYTHON 3.9.15</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>PYTHON 3.9.15</p>
     */
    @NameInMap("Python")
    public String python;

    /**
     * <p>The custom installation module dependencies. By default, the dependencies defined in the requirements.txt file in the root folder are installed. If the file is not configured or you use a custom software package, you can specify the dependencies to install.</p>
     * 
     * <strong>example:</strong>
     * <p>Flask==2.0</p>
     */
    @NameInMap("PythonModules")
    public String pythonModules;

    /**
     * <p>The ID of the referenced job.</p>
     * 
     * <strong>example:</strong>
     * <p>7171a6ca-d1cd-4928-8642-7d5cfe69****</p>
     */
    @NameInMap("RefAppId")
    public String refAppId;

    /**
     * <p>The number of concurrent instances for the job.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("Replicas")
    public String replicas;

    /**
     * <p>Specifies whether to enable job slicing.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Slice")
    public Boolean slice;

    /**
     * <p>The job slicing parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>[0,1,2]</p>
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
     * <li><strong>projectName</strong>: The name of the SLS project.  </li>
     * <li><strong>logDir</strong>: The log path.</li>
     * <li><strong>logType</strong>: The log type. <strong>stdout</strong> indicates container standard output logs. Only one entry is allowed. If no entry is specified, file logs are collected.</li>
     * <li><strong>logstoreName</strong>: The name of the SLS Logstore.</li>
     * <li><strong>logtailName</strong>: The name of the SLS Logtail. If this parameter is not specified, a new Logtail is created.</li>
     * </ul>
     * <p>If the SLS collection configuration remains unchanged during multiple deployments, you do not need to configure this parameter. That is, you do not need to include the <strong>SlsConfigs</strong> field in the request. If you no longer need the SLS collection feature, you must set the value of this field to an empty string in the request. That is, set the value of <strong>SlsConfigs</strong> to &quot;&quot;.</p>
     * <blockquote>
     * <p>The project automatically created with the job template is deleted when the job template is deleted. Therefore, when selecting an existing project, you cannot select a project automatically created by SAE.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;logDir&quot;:&quot;&quot;,&quot;logType&quot;:&quot;stdout&quot;},{&quot;logDir&quot;:&quot;/tmp/a.log&quot;}]</p>
     */
    @NameInMap("SlsConfigs")
    public String slsConfigs;

    /**
     * <p>The timeout period for graceful shutdown. Unit: seconds. Default value: 30. Valid values: 1 to 300.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TerminationGracePeriodSeconds")
    public Integer terminationGracePeriodSeconds;

    /**
     * <p>The timeout period of the job. Unit: seconds.</p>
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
     * <p>The Tomcat file configuration. Set the value to &quot;&quot; or &quot;{}&quot; to delete the configuration. Valid values:</p>
     * <ul>
     * <li><strong>port</strong>: The port number. Valid values: 1024 to 65535. Ports smaller than 1024 require root permissions. Because the container is configured with admin permissions, specify a port greater than 1024. Default value: 8080.</li>
     * <li><strong>contextPath</strong>: The access path. Default value: the root directory &quot;/&quot;.</li>
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

    @NameInMap("TriggerConfig")
    public String triggerConfig;

    /**
     * <p>The startup command for the WAR package deployment job. The procedure is the same as configuring the startup command for image deployment. For more information, see <a href="https://help.aliyun.com/document_detail/96677.html">Configure a startup command</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>CATALINA_OPTS=\&quot;$CATALINA_OPTS $Options\&quot; catalina.sh run</p>
     */
    @NameInMap("WarStartOptions")
    public String warStartOptions;

    /**
     * <p>The Tomcat version required by the deployment package. Valid values:</p>
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

    public UpdateJobRequest setBestEffortType(String bestEffortType) {
        this.bestEffortType = bestEffortType;
        return this;
    }
    public String getBestEffortType() {
        return this.bestEffortType;
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

    public UpdateJobRequest setNasConfigs(String nasConfigs) {
        this.nasConfigs = nasConfigs;
        return this;
    }
    public String getNasConfigs() {
        return this.nasConfigs;
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
