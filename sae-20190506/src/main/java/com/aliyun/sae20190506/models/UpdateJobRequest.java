// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpdateJobRequest extends TeaModel {
    /**
     * <p>The Alibaba Cloud Resource Name (ARN) of the RAM role that is required to pull images across accounts. For more information, see <a href="https://help.aliyun.com/document_detail/223585.html">Grant permissions across Alibaba Cloud accounts by using a RAM role</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::123456789012****:role/adminrole</p>
     */
    @NameInMap("AcrAssumeRoleArn")
    public String acrAssumeRoleArn;

    /**
     * <p>The ID of the Container Registry Enterprise Edition instance. This parameter is required if <strong>ImageUrl</strong> is set to an image in a Container Registry Enterprise Edition instance.</p>
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
     * <p>In this example, <code>Command=&quot;echo&quot; and CommandArgs=[&quot;abc&quot;, &quot;&gt;&quot;, &quot;file0&quot;]</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>echo</p>
     */
    @NameInMap("Command")
    public String command;

    /**
     * <p>The arguments of the image startup <strong>Command</strong>. The value must be a JSON array that is converted to a string. Format:</p>
     * <p><code>[&quot;a&quot;,&quot;b&quot;]</code></p>
     * <p>In the preceding example, <code>CommandArgs=[&quot;abc&quot;, &quot;&gt;&quot;, &quot;file0&quot;]</code>. The <code>[&quot;abc&quot;, &quot;&gt;&quot;, &quot;file0&quot;]</code> array is converted to a string. This parameter is optional.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;a&quot;,&quot;b&quot;]</p>
     */
    @NameInMap("CommandArgs")
    public String commandArgs;

    /**
     * <p>The policy of running concurrent jobs. Valid values:</p>
     * <ul>
     * <li><p><strong>Forbid</strong>: A new job is not created if the previous job is not completed.</p>
     * </li>
     * <li><p><strong>Allow</strong>: Concurrent jobs are allowed.</p>
     * </li>
     * <li><p><strong>Replace</strong>: When the time to create a new job is reached, the new job replaces the previous job if the previous job is not completed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Allow</p>
     */
    @NameInMap("ConcurrencyPolicy")
    public String concurrencyPolicy;

    /**
     * <p>The description of the <strong>ConfigMap</strong> instance that is mounted to the container. You can use the ConfigMap instance created on the Namespace Configurations page to inject configurations into the container. The value is a JSON string. The following fields are supported:</p>
     * <ul>
     * <li><p><strong>configMapId</strong>: The ID of the ConfigMap instance. You can call the <a href="https://help.aliyun.com/document_detail/176917.html">ListNamespacedConfigMaps</a> operation to obtain the ID.</p>
     * </li>
     * <li><p><strong>key</strong>: The key of the key-value pair.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>You can pass the <code>sae-sys-configmap-all</code> parameter to mount all key-value pairs.</p>
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
     * <p>The custom mapping between a hostname and an IP address in the container. The value is a JSON string. The following fields are supported:</p>
     * <ul>
     * <li><p><strong>hostName</strong>: the domain name or hostname.</p>
     * </li>
     * <li><p><strong>ip</strong>: the IP address.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;hostName&quot;:&quot;samplehost&quot;,&quot;ip&quot;:&quot;127.0.0.1&quot;}]</p>
     */
    @NameInMap("CustomHostAlias")
    public String customHostAlias;

    /**
     * <p>The version of the application runtime environment in High-speed Service Framework (HSF), such as an Ali-Tomcat container.</p>
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
     * <p>The environment variables of the container. You can customize environment variables or reference variables from a ConfigMap. To reference a ConfigMap, you must create a ConfigMap instance first. For more information, see <a href="https://help.aliyun.com/document_detail/176914.html">CreateConfigMap</a>. The value is a JSON string. The following fields are supported:</p>
     * <ul>
     * <li><p>Custom variables</p>
     * <ul>
     * <li><p><strong>name</strong>: the name of the environment variable.</p>
     * </li>
     * <li><p><strong>value</strong>: the value of the environment variable.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p>Reference variables from a ConfigMap</p>
     * <ul>
     * <li><p><strong>name</strong>: The name of the environment variable. You can reference a single key-value pair or all key-value pairs. To reference all key-value pairs, set the value to <code>sae-sys-configmap-all-&lt;ConfigMap name&gt;</code>. Example: <code>sae-sys-configmap-all-test1</code>.</p>
     * </li>
     * <li><p><strong>valueFrom</strong>: the reference of the environment variable. Set the value to <code>configMapRef</code>.</p>
     * </li>
     * <li><p><strong>configMapId</strong>: the ID of the ConfigMap.</p>
     * </li>
     * <li><p><strong>key</strong>: The key of the key-value pair. If you want to reference all key-value pairs, do not configure this field.</p>
     * </li>
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
     * <p>The ID of the secret.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("ImagePullSecrets")
    public String imagePullSecrets;

    /**
     * <p>The URL of the image. This parameter is required if <strong>Package Type</strong> is set to <strong>Image</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>registry.cn-hangzhou.aliyuncs.com/sae_test/ali_sae_test:0.0.1</p>
     */
    @NameInMap("ImageUrl")
    public String imageUrl;

    /**
     * <p>The arguments of the JAR package to start the application. The default startup command of the application is: <code>$JAVA_HOME/bin/java $JarStartOptions -jar $CATALINA_OPTS &quot;$package_path&quot; $JarStartArgs</code></p>
     * 
     * <strong>example:</strong>
     * <p>-Xms4G -Xmx4G</p>
     */
    @NameInMap("JarStartArgs")
    public String jarStartArgs;

    /**
     * <p>The options of the JAR package to start the application. The default startup command of the application is: <code>$JAVA_HOME/bin/java $JarStartOptions -jar $CATALINA_OPTS &quot;$package_path&quot; $JarStartArgs</code></p>
     * 
     * <strong>example:</strong>
     * <p>custom-option</p>
     */
    @NameInMap("JarStartOptions")
    public String jarStartOptions;

    /**
     * <p>The Java Development Kit (JDK) version that the deployment package depends on. The following versions are supported:</p>
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
     * <p>The description of the NAS mount. If the configurations are not changed during a deployment, you do not need to configure this parameter. To clear the NAS configurations, set the value of this parameter to an empty string (<code>&quot;&quot;</code>) in the request.</p>
     * 
     * <strong>example:</strong>
     * <p>[{mountPath: &quot;/tmp&quot;, nasPath: &quot;/&quot;}]</p>
     */
    @NameInMap("MountDesc")
    public String mountDesc;

    /**
     * <p>The mount target of the NAS file system in the virtual private cloud (VPC) where the job template is located. If the configurations are not changed during a deployment, you do not need to configure this parameter. To clear the NAS configurations, set the value of this parameter to an empty string (<code>&quot;&quot;</code>).</p>
     * 
     * <strong>example:</strong>
     * <p>10d3b4bc9****.com</p>
     */
    @NameInMap("MountHost")
    public String mountHost;

    /**
     * <p>The configurations of mounting a NAS file system.</p>
     */
    @NameInMap("NasConfigs")
    public String nasConfigs;

    /**
     * <p>The ID of the Apsara File Storage NAS file system. If the configurations are not changed during a deployment, you do not need to configure this parameter. To clear the NAS configurations, set the value of this parameter to an empty string (<code>&quot;&quot;</code>).</p>
     * 
     * <strong>example:</strong>
     * <p>10d3b4****</p>
     */
    @NameInMap("NasId")
    public String nasId;

    /**
     * <p>The AccessKey ID that is used to read data from and write data to OSS.</p>
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
     * <p>The description of the OSS mount. The value is a JSON string. The following parameters are supported:</p>
     * <ul>
     * <li><p><strong>bucketName</strong>: the name of the bucket.</p>
     * </li>
     * <li><p><strong>bucketPath</strong>: the directory or object that you created in OSS. An exception occurs if the specified OSS mount directory does not exist.</p>
     * </li>
     * <li><p><strong>mountPath</strong>: The path in the SAE container. If the path exists, the new path overwrites the existing one. If the path does not exist, a new path is created.</p>
     * </li>
     * <li><p><strong>readOnly</strong>: specifies whether a container has the read-only permission on the resources in the mount directory.</p>
     * <ul>
     * <li><p><strong>true</strong>: The container has the read-only permission.</p>
     * </li>
     * <li><p><strong>false</strong>: The container has the read and write permissions.</p>
     * </li>
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
     * <p>The URL of the deployment package. This parameter is required if <strong>Package Type</strong> is set to <strong>FatJar</strong>, <strong>War</strong>, or <strong>PythonZip</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://myoss.oss-cn-hangzhou.aliyuncs.com/my-buc/2019-06-30/****.jar">http://myoss.oss-cn-hangzhou.aliyuncs.com/my-buc/2019-06-30/****.jar</a></p>
     */
    @NameInMap("PackageUrl")
    public String packageUrl;

    /**
     * <p>The version of the deployment package. This parameter is required if <strong>Package Type</strong> is set to <strong>FatJar</strong>, <strong>War</strong>, or <strong>PythonZip</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0.1</p>
     */
    @NameInMap("PackageVersion")
    public String packageVersion;

    /**
     * <p>The ID of the Container Registry Enterprise Edition instance.</p>
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
     * <p>The path on which the PHP application startup configuration file is mounted. Make sure that the PHP server uses this configuration file to start the application.</p>
     * 
     * <strong>example:</strong>
     * <p>/usr/local/etc/php/php.ini</p>
     */
    @NameInMap("PhpConfigLocation")
    public String phpConfigLocation;

    /**
     * <p>The script that is executed after the container is started. Example: <code>{&quot;exec&quot;:{&quot;command&quot;:[&quot;sh&quot;,&quot;-c&quot;,&quot;echo hello&quot;]}}</code></p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;exec&quot;:{&quot;command&quot;:[&quot;sh&quot;,&quot;-c&quot;,&quot;echo hello&quot;]}}</p>
     */
    @NameInMap("PostStart")
    public String postStart;

    /**
     * <p>The script that is executed before the container is stopped. Example: <code>{&quot;exec&quot;:{&quot;command&quot;:[&quot;sh&quot;,&quot;-c&quot;,&quot;echo hello&quot;]}}</code></p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;exec&quot;:{&quot;command&quot;:[&quot;sh&quot;,&quot;-c&quot;,&quot;echo hello&quot;]}}</p>
     */
    @NameInMap("PreStop")
    public String preStop;

    /**
     * <p>The programming language. Supported values: <strong>java</strong>, <strong>php</strong>, <strong>python</strong>, and <strong>shell</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>java</p>
     */
    @NameInMap("ProgrammingLanguage")
    public String programmingLanguage;

    /**
     * <p>The Python environment. <strong>PYTHON 3.9.15</strong> is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>PYTHON 3.9.15</p>
     */
    @NameInMap("Python")
    public String python;

    /**
     * <p>The custom module dependencies. By default, the dependencies that are defined in the requirements.txt file in the root directory of the package are installed. If you do not configure this parameter or the package does not have a requirements.txt file, you can specify the dependencies that you want to install.</p>
     * 
     * <strong>example:</strong>
     * <p>Flask==2.0</p>
     */
    @NameInMap("PythonModules")
    public String pythonModules;

    /**
     * <p>The ID of the referenced application.</p>
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
     * <p>Enables job sharding.</p>
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
     * <p>[0,1,2]</p>
     */
    @NameInMap("SliceEnvs")
    public String sliceEnvs;

    /**
     * <p>The configurations of collecting logs to Log Service.</p>
     * <ul>
     * <li><p>Use the Log Service resources that are automatically created by SAE: <code>[{&quot;logDir&quot;:&quot;&quot;,&quot;logType&quot;:&quot;stdout&quot;},{&quot;logDir&quot;:&quot;/tmp/a.log&quot;}]</code>.</p>
     * </li>
     * <li><p>Use a custom Log Service resource: <code>[{&quot;projectName&quot;:&quot;test-sls&quot;,&quot;logType&quot;:&quot;stdout&quot;,&quot;logDir&quot;:&quot;&quot;,&quot;logstoreName&quot;:&quot;sae&quot;,&quot;logtailName&quot;:&quot;&quot;},{&quot;projectName&quot;:&quot;test&quot;,&quot;logDir&quot;:&quot;/tmp/a.log&quot;,&quot;logstoreName&quot;:&quot;sae&quot;,&quot;logtailName&quot;:&quot;&quot;}]</code>.</p>
     * </li>
     * </ul>
     * <p>The following fields are supported:</p>
     * <ul>
     * <li><p><strong>projectName</strong>: The name of the Log Service project.</p>
     * </li>
     * <li><p><strong>logDir</strong>: The log path.</p>
     * </li>
     * <li><p><strong>logType</strong>: The log type. <strong>stdout</strong> indicates the standard output log of the container. You can specify only one standard output. If you do not configure this field, file logs are collected.</p>
     * </li>
     * <li><p><strong>logstoreName</strong>: The name of the Logstore in Log Service.</p>
     * </li>
     * <li><p><strong>logtailName</strong>: The name of the Logtail. If you do not specify this parameter, a new Logtail is created.</p>
     * </li>
     * </ul>
     * <p>If the SLS configuration is not changed during a deployment, you do not need to configure this parameter. To stop using the log collection feature, set the value of this parameter to an empty string (<code>&quot;&quot;</code>).</p>
     * <blockquote>
     * <p>Projects that are automatically created with a job template are deleted when the job template is deleted. Therefore, when you select an existing project, do not select a project that is automatically created by SAE.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;logDir&quot;:&quot;&quot;,&quot;logType&quot;:&quot;stdout&quot;},{&quot;logDir&quot;:&quot;/tmp/a.log&quot;}]</p>
     */
    @NameInMap("SlsConfigs")
    public String slsConfigs;

    /**
     * <p>The graceful timeout period. Default value: 30. Unit: seconds. Valid values: 1 to 300.</p>
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
     * <p>The configurations of the Tomcat file. If you set this parameter to &quot;&quot; or &quot;{}&quot;, the configurations are deleted. The value is a JSON string. The following fields are supported:</p>
     * <ul>
     * <li><p><strong>port</strong>: The port number. Valid values: 1024 to 65535. The root permission is required to perform operations on ports whose number is smaller than 1024. The container is configured with the administrator permission. Therefore, specify a port whose number is greater than 1024. If you do not configure this field, the default port 8080 is used.</p>
     * </li>
     * <li><p><strong>contextPath</strong>: The context path. Default value: /.</p>
     * </li>
     * <li><p><strong>maxThreads</strong>: The maximum number of connections in the connection pool. Default value: 400.</p>
     * </li>
     * <li><p><strong>uriEncoding</strong>: The URI encoding scheme in Tomcat. Supported values: <strong>UTF-8</strong>, <strong>ISO-8859-1</strong>, <strong>GBK</strong>, and <strong>GB2312</strong>. If you do not set this parameter, the default value <strong>ISO-8859-1</strong> is used.</p>
     * </li>
     * <li><p><strong>useBodyEncodingForUri</strong>: Specifies whether to use <strong>BodyEncoding for URL</strong>. Default value: <strong>true</strong>.</p>
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
     * <p>The startup command for the application that is deployed in a WAR package. The procedure is the same as that for configuring the startup command for an image. For more information, see <a href="https://help.aliyun.com/document_detail/96677.html">Set a startup command</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>CATALINA_OPTS=\&quot;$CATALINA_OPTS $Options\&quot; catalina.sh run</p>
     */
    @NameInMap("WarStartOptions")
    public String warStartOptions;

    /**
     * <p>The Tomcat version that the deployment package depends on. The following versions are supported:</p>
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
