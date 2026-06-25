// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class CreateJobRequest extends TeaModel {
    /**
     * <p>The Alibaba Cloud Resource Name (ARN) of the RAM role that is required to pull images across accounts. For more information, see <a href="https://help.aliyun.com/document_detail/223585.html">Grant permissions to pull images across Alibaba Cloud accounts by using a RAM role</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::123456789012****:role/adminrole</p>
     */
    @NameInMap("AcrAssumeRoleArn")
    public String acrAssumeRoleArn;

    /**
     * <p>The ID of the Container Registry (ACR) Enterprise Edition instance. This parameter is required when <strong>ImageUrl</strong> points to an image in an ACR Enterprise Edition instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cri-xxxxxx</p>
     */
    @NameInMap("AcrInstanceId")
    public String acrInstanceId;

    /**
     * <p>The description of the job template. It cannot exceed 1,024 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a test description.</p>
     */
    @NameInMap("AppDescription")
    public String appDescription;

    /**
     * <p>The name of the job template. The name can contain letters, digits, and hyphens (-). It must start with a letter and be no longer than 36 characters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>Specifies whether to automatically configure the network environment. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: SAE automatically configures the network environment when you create the job template. The values of <strong>NamespaceId</strong>, <strong>VpcId</strong>, <strong>vSwitchId</strong>, and <strong>SecurityGroupId</strong> are ignored.</p>
     * </li>
     * <li><p><strong>false</strong>: You must manually configure the network environment.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoConfig")
    public Boolean autoConfig;

    /**
     * <p>The maximum number of retries for a task before it is marked as failed.</p>
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
     * <p>The entrypoint command for the container. The command must be an executable inside the container. Example:</p>
     * <pre><code>command:
     *       - echo
     *       - abc
     *       - &gt;
     *       - file0
     * </code></pre>
     * <p>For the preceding example, <code>Command=&quot;echo&quot;, CommandArgs=[&quot;abc&quot;, &quot;&gt;&quot;, &quot;file0&quot;]</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>echo</p>
     */
    @NameInMap("Command")
    public String command;

    /**
     * <p>Arguments for the entrypoint command (<strong>Command</strong>). The format is as follows:</p>
     * <p><code>[&quot;a&quot;,&quot;b&quot;]</code></p>
     * <p>In the example for the <code>Command</code> parameter, the value for <code>CommandArgs</code> is <code>[&quot;abc&quot;, &quot;&gt;&quot;, &quot;file0&quot;]</code>. This value must be a string that contains a JSON array. If the command takes no arguments, you can omit this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;a&quot;,&quot;b&quot;]</p>
     */
    @NameInMap("CommandArgs")
    public String commandArgs;

    /**
     * <p>The concurrency policy for the task. Valid values:</p>
     * <ul>
     * <li><p><strong>Forbid</strong>: Prohibits concurrent runs. A new task is not created if the previous one is not complete.</p>
     * </li>
     * <li><p><strong>Allow</strong>: Allows concurrent running.</p>
     * </li>
     * <li><p><strong>Replace</strong>: If a previous task is still running when the next one is scheduled, the new task replaces the old one.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Allow</p>
     */
    @NameInMap("ConcurrencyPolicy")
    public String concurrencyPolicy;

    /**
     * <p>The <strong>ConfigMap</strong> mount description. Use a ConfigMap created in the namespace to inject configurations into the container. The parameters are described as follows:</p>
     * <ul>
     * <li><p><strong>configMapId</strong>: The ID of the ConfigMap. You can call the <a href="https://help.aliyun.com/document_detail/176917.html">ListNamespacedConfigMaps</a> operation to obtain this ID.</p>
     * </li>
     * <li><p><strong>key</strong>: The key.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>You can pass the <code>sae-sys-configmap-all</code> parameter to mount all keys.</p>
     * </blockquote>
     * <ul>
     * <li><strong>mountPath</strong>: The mount path in the container.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;configMapId&quot;:16,&quot;key&quot;:&quot;test&quot;,&quot;mountPath&quot;:&quot;/tmp&quot;}]</p>
     */
    @NameInMap("ConfigMapMountDesc")
    public String configMapMountDesc;

    /**
     * <p>The CPU required for each instance, in millicores. This value cannot be 0. Only the following fixed specifications are currently supported:</p>
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
     * <p>The host alias that maps a hostname to an IP address in the container. The parameters are described as follows:</p>
     * <ul>
     * <li><p><strong>hostName</strong>: The domain name or hostname.</p>
     * </li>
     * <li><p><strong>ip</strong>: The IP address.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;hostName&quot;:&quot;samplehost&quot;,&quot;ip&quot;:&quot;127.0.0.1&quot;}]</p>
     */
    @NameInMap("CustomHostAlias")
    public String customHostAlias;

    /**
     * <p>The version of the HSF runtime environment for the task, such as an Ali-Tomcat container.</p>
     * 
     * <strong>example:</strong>
     * <p>3.5.3</p>
     */
    @NameInMap("EdasContainerVersion")
    public String edasContainerVersion;

    /**
     * <p>Specifies whether to enable image acceleration. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Enables image acceleration.</p>
     * </li>
     * <li><p><strong>false</strong>: Disables image acceleration.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableImageAccl")
    public Boolean enableImageAccl;

    /**
     * <p>Environment variables to set in the container. To reference variables, the ConfigMap must already exist. For more information, see <a href="https://help.aliyun.com/document_detail/176914.html">CreateConfigMap</a>. The value can be configured in one of the following ways:</p>
     * <ul>
     * <li><p>Specify custom variables</p>
     * <ul>
     * <li><p><strong>name</strong>: The name of the environment variable.</p>
     * </li>
     * <li><p><strong>value</strong>: The value of the environment variable.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p>Reference a ConfigMap</p>
     * <ul>
     * <li><p><strong>name</strong>: The name of the environment variable. You can reference a single key or all keys. To reference all keys, enter a value in the <code>sae-sys-configmap-all-&lt;ConfigMap name&gt;</code> format. Example: <code>sae-sys-configmap-all-test1</code>.</p>
     * </li>
     * <li><p><strong>valueFrom</strong>: The source of the environment variable. Set the value to <code>configMapRef</code>.</p>
     * </li>
     * <li><p><strong>configMapId</strong>: The ID of the ConfigMap.</p>
     * </li>
     * <li><p><strong>key</strong>: The key to reference. If you want to reference all key-value pairs, do not specify this parameter.</p>
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
     * <p>The ID of the secret used to pull the image.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("ImagePullSecrets")
    public String imagePullSecrets;

    /**
     * <p>The URL of the image. This parameter is required when <strong>PackageType</strong> is set to <strong>Image</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>registry.cn-hangzhou.aliyuncs.com/sae_test/ali_sae_test:0.0.1</p>
     */
    @NameInMap("ImageUrl")
    public String imageUrl;

    /**
     * <p>The startup arguments for the JAR package. The default startup command is: <code>$JAVA_HOME/bin/java $JarStartOptions -jar $CATALINA_OPTS &quot;$package_path&quot; $JarStartArgs</code></p>
     * 
     * <strong>example:</strong>
     * <p>-Xms4G -Xmx4G</p>
     */
    @NameInMap("JarStartArgs")
    public String jarStartArgs;

    /**
     * <p>The startup options for the JAR package. The default startup command is: <code>$JAVA_HOME/bin/java $JarStartOptions -jar $CATALINA_OPTS &quot;$package_path&quot; $JarStartArgs</code></p>
     * 
     * <strong>example:</strong>
     * <p>custom-option</p>
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
     * <p>This parameter is not supported when <strong>PackageType</strong> is set to <strong>Image</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>Open JDK 8</p>
     */
    @NameInMap("Jdk")
    public String jdk;

    /**
     * <p>The memory required for each instance, in MB. This value cannot be 0. CPU and memory specifications are coupled. The following specifications are currently supported:</p>
     * <ul>
     * <li><p><strong>1024</strong>: corresponds to 500 or 1,000 millicores of CPU.</p>
     * </li>
     * <li><p><strong>2048</strong>: corresponds to 500, 1,000, or 2,000 millicores of CPU.</p>
     * </li>
     * <li><p><strong>4096</strong>: corresponds to 1,000, 2,000, or 4,000 millicores of CPU.</p>
     * </li>
     * <li><p><strong>8192</strong>: corresponds to 2,000, 4,000, or 8,000 millicores of CPU.</p>
     * </li>
     * <li><p><strong>12288</strong>: corresponds to 12,000 millicores of CPU.</p>
     * </li>
     * <li><p><strong>16384</strong>: corresponds to 4,000, 8,000, or 16,000 millicores of CPU.</p>
     * </li>
     * <li><p><strong>24576</strong>: corresponds to 12,000 millicores of CPU.</p>
     * </li>
     * <li><p><strong>32768</strong>: corresponds to 16,000 millicores of CPU.</p>
     * </li>
     * <li><p><strong>65536</strong>: corresponds to 8,000, 16,000, or 32,000 millicores of CPU.</p>
     * </li>
     * <li><p><strong>131072</strong>: corresponds to 32,000 millicores of CPU.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("Memory")
    public Integer memory;

    /**
     * <p>The NAS mount description. If this configuration does not change in subsequent deployments, you can omit this parameter. To clear the NAS configuration, set this parameter to an empty string (&quot;&quot;).</p>
     * 
     * <strong>example:</strong>
     * <p>[{mountPath: &quot;/tmp&quot;, nasPath: &quot;/&quot;}]</p>
     */
    @NameInMap("MountDesc")
    public String mountDesc;

    /**
     * <p>The NAS mount target in the VPC of the job template. If this configuration does not change in subsequent deployments, you can omit this parameter. To clear the NAS configuration, set this parameter to an empty string (&quot;&quot;).</p>
     * 
     * <strong>example:</strong>
     * <p>10d3b4bc9****.com</p>
     */
    @NameInMap("MountHost")
    public String mountHost;

    /**
     * <p>The ID of the SAE namespace. The namespace name can contain only lowercase letters and hyphens (-), and must start with a letter.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing:test</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    /**
     * <p>The configurations for mounting a NAS file system.</p>
     */
    @NameInMap("NasConfigs")
    public String nasConfigs;

    /**
     * <p>The ID of the NAS file system. If this configuration does not change in subsequent deployments, you can omit this parameter. To clear the NAS configuration, set this parameter to an empty string (&quot;&quot;).</p>
     * 
     * <strong>example:</strong>
     * <p>10d3b4****</p>
     */
    @NameInMap("NasId")
    public String nasId;

    /**
     * <p>The AccessKey ID for reading from and writing to OSS.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxxx</p>
     */
    @NameInMap("OssAkId")
    public String ossAkId;

    /**
     * <p>The AccessKey secret for reading from and writing to OSS.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxxx</p>
     */
    @NameInMap("OssAkSecret")
    public String ossAkSecret;

    /**
     * <p>The description of the Object Storage Service (OSS) mount. The parameters are described as follows:</p>
     * <ul>
     * <li><p><strong>bucketName</strong>: The name of the bucket.</p>
     * </li>
     * <li><p><strong>bucketPath</strong>: The directory or object in OSS. If the specified directory or object does not exist, an exception is thrown.</p>
     * </li>
     * <li><p><strong>mountPath</strong>: The path in the SAE container. If the path exists, it is overwritten. If the path does not exist, it is created.</p>
     * </li>
     * <li><p><strong>readOnly</strong>: Specifies whether the container has read-only access to the resources in the mount directory. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: read-only permission.</p>
     * </li>
     * <li><p><strong>false</strong>: read and write permissions.</p>
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
     * <p>The type of the deployment package. Valid values:</p>
     * <ul>
     * <li><p>For Java applications, valid values are <strong>FatJar</strong>, <strong>War</strong>, and <strong>Image</strong>.</p>
     * </li>
     * <li><p>For PHP applications, the valid values are:</p>
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
     * <li><p>For <strong>Python</strong> applications, valid values are <strong>PythonZip</strong> and <strong>Image</strong>.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>FatJar</p>
     */
    @NameInMap("PackageType")
    public String packageType;

    /**
     * <p>The URL of the deployment package. This parameter is required when <strong>PackageType</strong> is set to <strong>FatJar</strong>, <strong>War</strong>, or <strong>PythonZip</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://myoss.oss-cn-hangzhou.aliyuncs.com/my-buc/2019-06-30/****.jar">http://myoss.oss-cn-hangzhou.aliyuncs.com/my-buc/2019-06-30/****.jar</a></p>
     */
    @NameInMap("PackageUrl")
    public String packageUrl;

    /**
     * <p>The version of the deployment package. This parameter is required when <strong>PackageType</strong> is set to <strong>FatJar</strong>, <strong>War</strong>, or <strong>PythonZip</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0.1</p>
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
     * <p>The mount path of the startup configuration file for a PHP task. You must make sure that the PHP server uses this configuration file on startup.</p>
     * 
     * <strong>example:</strong>
     * <p>/usr/local/etc/php/php.ini</p>
     */
    @NameInMap("PhpConfigLocation")
    public String phpConfigLocation;

    /**
     * <p>A PostStart hook. This script runs immediately after the container is created. The value must be a JSON string, for example: <code>{&quot;exec&quot;:{&quot;command&quot;:[&quot;sh&quot;,&quot;-c&quot;,&quot;echo hello&quot;]}}</code></p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;exec&quot;:{&quot;command&quot;:[&quot;sh&quot;,&quot;-c&quot;,&quot;echo hello&quot;]}}</p>
     */
    @NameInMap("PostStart")
    public String postStart;

    /**
     * <p>A PreStop hook. This script runs immediately before the container is stopped. The value must be a JSON string, for example: <code>{&quot;exec&quot;:{&quot;command&quot;:[&quot;sh&quot;,&quot;-c&quot;,&quot;echo hello&quot;]}}</code></p>
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
     * <p>The Python environment. <strong>PYTHON 3.9.15</strong> is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>PYTHON 3.9.15</p>
     */
    @NameInMap("Python")
    public String python;

    /**
     * <p>Python dependencies to install by using pip. If you do not set this parameter, SAE installs dependencies from the \&quot;requirements.txt\&quot; file in the root directory of your project.</p>
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
     * <p>The number of concurrent task instances.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
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
     * <p>Specifies whether to enable task sharding.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Slice")
    public Boolean slice;

    /**
     * <p>The parameters for task sharding.</p>
     * 
     * <strong>example:</strong>
     * <p>[0,1,2]</p>
     */
    @NameInMap("SliceEnvs")
    public String sliceEnvs;

    /**
     * <p>The configuration for collecting logs to Simple Log Service (SLS).</p>
     * <ul>
     * <li><p>To use SLS resources that are automatically created by SAE: <code>[{&quot;logDir&quot;:&quot;&quot;,&quot;logType&quot;:&quot;stdout&quot;},{&quot;logDir&quot;:&quot;/tmp/a.log&quot;}]</code>.</p>
     * </li>
     * <li><p>To use your own SLS resources: <code>[{&quot;projectName&quot;:&quot;test-sls&quot;,&quot;logType&quot;:&quot;stdout&quot;,&quot;logDir&quot;:&quot;&quot;,&quot;logstoreName&quot;:&quot;sae&quot;,&quot;logtailName&quot;:&quot;&quot;},{&quot;projectName&quot;:&quot;test&quot;,&quot;logDir&quot;:&quot;/tmp/a.log&quot;,&quot;logstoreName&quot;:&quot;sae&quot;,&quot;logtailName&quot;:&quot;&quot;}]</code>.</p>
     * </li>
     * </ul>
     * <p>The parameters are described as follows:</p>
     * <ul>
     * <li><p><strong>projectName</strong>: The name of the SLS Project.</p>
     * </li>
     * <li><p><strong>logDir</strong>: The path of the log file.</p>
     * </li>
     * <li><p><strong>logType</strong>: The log type. <strong>stdout</strong> indicates the standard output of the container. You can specify only one standard output. If you do not set this parameter, file logs are collected.</p>
     * </li>
     * <li><p><strong>logstoreName</strong>: The name of the Logstore in SLS.</p>
     * </li>
     * <li><p><strong>logtailName</strong>: The name of the Logtail in SLS. If you do not specify this parameter, a new Logtail is created.</p>
     * </li>
     * </ul>
     * <p>If the log collection configuration does not change during subsequent deployments, you do not need to set this parameter (the request does not need to include the <strong>SlsConfigs</strong> field). If you no longer need to use the log collection feature, set the value of this parameter to an empty string (&quot;&quot;) in your request.</p>
     * <blockquote>
     * <p>SAE deletes a project that it automatically created when you delete the corresponding job template. Therefore, if you specify an existing project, do not use one that was automatically created by SAE.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;logDir&quot;:&quot;&quot;,&quot;logType&quot;:&quot;stdout&quot;},{&quot;logDir&quot;:&quot;/tmp/a.log&quot;}]</p>
     */
    @NameInMap("SlsConfigs")
    public String slsConfigs;

    /**
     * <p>The graceful shutdown timeout, in seconds. The value must be an integer from 1 to 300. Default: 30.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TerminationGracePeriodSeconds")
    public Integer terminationGracePeriodSeconds;

    /**
     * <p>The task timeout, in seconds.</p>
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
     * <p>The Tomcat configuration. To delete the configuration, set this parameter to <code>&quot;&quot;</code> or <code>{}</code>. The parameters are described as follows:</p>
     * <ul>
     * <li><p><strong>port</strong>: The port number. The valid range is 1024 to 65535. Ports below 1024 require root permissions. Because the container is configured with administrator permissions, specify a port number greater than 1024. If this parameter is not configured, the default port 8080 is used.</p>
     * </li>
     * <li><p><strong>contextPath</strong>: The context path. Default value: /.</p>
     * </li>
     * <li><p><strong>maxThreads</strong>: The maximum number of threads in the connection pool. Default value: 400.</p>
     * </li>
     * <li><p><strong>uriEncoding</strong>: The URI encoding scheme for Tomcat. Valid values: <strong>UTF-8</strong>, <strong>ISO-8859-1</strong>, <strong>GBK</strong>, and <strong>GB2312</strong>. If this parameter is not set, the default value <strong>ISO-8859-1</strong> is used.</p>
     * </li>
     * <li><p><strong>useBodyEncodingForUri</strong>: Specifies whether to use the encoding specified in <code>request.getCharacterEncoding()</code> to decode the request URI. Default value: <strong>true</strong>.</p>
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
     * <p>The ID of the vSwitch for the elastic network interface of the task instance. The vSwitch must be located in the specified VPC. The vSwitch is also bound to the SAE namespace. If you do not specify this parameter, the ID of the vSwitch that is bound to the namespace is used by default.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp12mw1f8k3jgygk9****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the VPC for the SAE namespace. In SAE, a namespace can be bound to only one VPC, and this binding cannot be changed. The binding is established when you create the first SAE job template in the namespace. A single VPC can be associated with multiple namespaces. If you do not specify this parameter, the ID of the VPC that is bound to the namespace is used by default.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1aevy8sofi8mh1q****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The startup command for a WAR package deployment. The configuration steps are the same as for an image-based deployment. For more information, see <a href="https://help.aliyun.com/document_detail/96677.html">Set a startup command</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>CATALINA_OPTS=\&quot;$CATALINA_OPTS $Options\&quot; catalina.sh run</p>
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
     * <p>This parameter is not supported when <strong>PackageType</strong> is set to <strong>Image</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>apache-tomcat-7.0.91</p>
     */
    @NameInMap("WebContainer")
    public String webContainer;

    /**
     * <p>The workload. Set the value to <code>job</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>job</p>
     */
    @NameInMap("Workload")
    public String workload;

    public static CreateJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateJobRequest self = new CreateJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateJobRequest setAcrAssumeRoleArn(String acrAssumeRoleArn) {
        this.acrAssumeRoleArn = acrAssumeRoleArn;
        return this;
    }
    public String getAcrAssumeRoleArn() {
        return this.acrAssumeRoleArn;
    }

    public CreateJobRequest setAcrInstanceId(String acrInstanceId) {
        this.acrInstanceId = acrInstanceId;
        return this;
    }
    public String getAcrInstanceId() {
        return this.acrInstanceId;
    }

    public CreateJobRequest setAppDescription(String appDescription) {
        this.appDescription = appDescription;
        return this;
    }
    public String getAppDescription() {
        return this.appDescription;
    }

    public CreateJobRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateJobRequest setAutoConfig(Boolean autoConfig) {
        this.autoConfig = autoConfig;
        return this;
    }
    public Boolean getAutoConfig() {
        return this.autoConfig;
    }

    public CreateJobRequest setBackoffLimit(Long backoffLimit) {
        this.backoffLimit = backoffLimit;
        return this;
    }
    public Long getBackoffLimit() {
        return this.backoffLimit;
    }

    public CreateJobRequest setBestEffortType(String bestEffortType) {
        this.bestEffortType = bestEffortType;
        return this;
    }
    public String getBestEffortType() {
        return this.bestEffortType;
    }

    public CreateJobRequest setCommand(String command) {
        this.command = command;
        return this;
    }
    public String getCommand() {
        return this.command;
    }

    public CreateJobRequest setCommandArgs(String commandArgs) {
        this.commandArgs = commandArgs;
        return this;
    }
    public String getCommandArgs() {
        return this.commandArgs;
    }

    public CreateJobRequest setConcurrencyPolicy(String concurrencyPolicy) {
        this.concurrencyPolicy = concurrencyPolicy;
        return this;
    }
    public String getConcurrencyPolicy() {
        return this.concurrencyPolicy;
    }

    public CreateJobRequest setConfigMapMountDesc(String configMapMountDesc) {
        this.configMapMountDesc = configMapMountDesc;
        return this;
    }
    public String getConfigMapMountDesc() {
        return this.configMapMountDesc;
    }

    public CreateJobRequest setCpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }
    public Integer getCpu() {
        return this.cpu;
    }

    public CreateJobRequest setCustomHostAlias(String customHostAlias) {
        this.customHostAlias = customHostAlias;
        return this;
    }
    public String getCustomHostAlias() {
        return this.customHostAlias;
    }

    public CreateJobRequest setEdasContainerVersion(String edasContainerVersion) {
        this.edasContainerVersion = edasContainerVersion;
        return this;
    }
    public String getEdasContainerVersion() {
        return this.edasContainerVersion;
    }

    public CreateJobRequest setEnableImageAccl(Boolean enableImageAccl) {
        this.enableImageAccl = enableImageAccl;
        return this;
    }
    public Boolean getEnableImageAccl() {
        return this.enableImageAccl;
    }

    public CreateJobRequest setEnvs(String envs) {
        this.envs = envs;
        return this;
    }
    public String getEnvs() {
        return this.envs;
    }

    public CreateJobRequest setImagePullSecrets(String imagePullSecrets) {
        this.imagePullSecrets = imagePullSecrets;
        return this;
    }
    public String getImagePullSecrets() {
        return this.imagePullSecrets;
    }

    public CreateJobRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public CreateJobRequest setJarStartArgs(String jarStartArgs) {
        this.jarStartArgs = jarStartArgs;
        return this;
    }
    public String getJarStartArgs() {
        return this.jarStartArgs;
    }

    public CreateJobRequest setJarStartOptions(String jarStartOptions) {
        this.jarStartOptions = jarStartOptions;
        return this;
    }
    public String getJarStartOptions() {
        return this.jarStartOptions;
    }

    public CreateJobRequest setJdk(String jdk) {
        this.jdk = jdk;
        return this;
    }
    public String getJdk() {
        return this.jdk;
    }

    public CreateJobRequest setMemory(Integer memory) {
        this.memory = memory;
        return this;
    }
    public Integer getMemory() {
        return this.memory;
    }

    public CreateJobRequest setMountDesc(String mountDesc) {
        this.mountDesc = mountDesc;
        return this;
    }
    public String getMountDesc() {
        return this.mountDesc;
    }

    public CreateJobRequest setMountHost(String mountHost) {
        this.mountHost = mountHost;
        return this;
    }
    public String getMountHost() {
        return this.mountHost;
    }

    public CreateJobRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public CreateJobRequest setNasConfigs(String nasConfigs) {
        this.nasConfigs = nasConfigs;
        return this;
    }
    public String getNasConfigs() {
        return this.nasConfigs;
    }

    public CreateJobRequest setNasId(String nasId) {
        this.nasId = nasId;
        return this;
    }
    public String getNasId() {
        return this.nasId;
    }

    public CreateJobRequest setOssAkId(String ossAkId) {
        this.ossAkId = ossAkId;
        return this;
    }
    public String getOssAkId() {
        return this.ossAkId;
    }

    public CreateJobRequest setOssAkSecret(String ossAkSecret) {
        this.ossAkSecret = ossAkSecret;
        return this;
    }
    public String getOssAkSecret() {
        return this.ossAkSecret;
    }

    public CreateJobRequest setOssMountDescs(String ossMountDescs) {
        this.ossMountDescs = ossMountDescs;
        return this;
    }
    public String getOssMountDescs() {
        return this.ossMountDescs;
    }

    public CreateJobRequest setPackageType(String packageType) {
        this.packageType = packageType;
        return this;
    }
    public String getPackageType() {
        return this.packageType;
    }

    public CreateJobRequest setPackageUrl(String packageUrl) {
        this.packageUrl = packageUrl;
        return this;
    }
    public String getPackageUrl() {
        return this.packageUrl;
    }

    public CreateJobRequest setPackageVersion(String packageVersion) {
        this.packageVersion = packageVersion;
        return this;
    }
    public String getPackageVersion() {
        return this.packageVersion;
    }

    public CreateJobRequest setPhpConfig(String phpConfig) {
        this.phpConfig = phpConfig;
        return this;
    }
    public String getPhpConfig() {
        return this.phpConfig;
    }

    public CreateJobRequest setPhpConfigLocation(String phpConfigLocation) {
        this.phpConfigLocation = phpConfigLocation;
        return this;
    }
    public String getPhpConfigLocation() {
        return this.phpConfigLocation;
    }

    public CreateJobRequest setPostStart(String postStart) {
        this.postStart = postStart;
        return this;
    }
    public String getPostStart() {
        return this.postStart;
    }

    public CreateJobRequest setPreStop(String preStop) {
        this.preStop = preStop;
        return this;
    }
    public String getPreStop() {
        return this.preStop;
    }

    public CreateJobRequest setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
        return this;
    }
    public String getProgrammingLanguage() {
        return this.programmingLanguage;
    }

    public CreateJobRequest setPython(String python) {
        this.python = python;
        return this;
    }
    public String getPython() {
        return this.python;
    }

    public CreateJobRequest setPythonModules(String pythonModules) {
        this.pythonModules = pythonModules;
        return this;
    }
    public String getPythonModules() {
        return this.pythonModules;
    }

    public CreateJobRequest setRefAppId(String refAppId) {
        this.refAppId = refAppId;
        return this;
    }
    public String getRefAppId() {
        return this.refAppId;
    }

    public CreateJobRequest setReplicas(Integer replicas) {
        this.replicas = replicas;
        return this;
    }
    public Integer getReplicas() {
        return this.replicas;
    }

    public CreateJobRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public CreateJobRequest setSlice(Boolean slice) {
        this.slice = slice;
        return this;
    }
    public Boolean getSlice() {
        return this.slice;
    }

    public CreateJobRequest setSliceEnvs(String sliceEnvs) {
        this.sliceEnvs = sliceEnvs;
        return this;
    }
    public String getSliceEnvs() {
        return this.sliceEnvs;
    }

    public CreateJobRequest setSlsConfigs(String slsConfigs) {
        this.slsConfigs = slsConfigs;
        return this;
    }
    public String getSlsConfigs() {
        return this.slsConfigs;
    }

    public CreateJobRequest setTerminationGracePeriodSeconds(Integer terminationGracePeriodSeconds) {
        this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
        return this;
    }
    public Integer getTerminationGracePeriodSeconds() {
        return this.terminationGracePeriodSeconds;
    }

    public CreateJobRequest setTimeout(Long timeout) {
        this.timeout = timeout;
        return this;
    }
    public Long getTimeout() {
        return this.timeout;
    }

    public CreateJobRequest setTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }
    public String getTimezone() {
        return this.timezone;
    }

    public CreateJobRequest setTomcatConfig(String tomcatConfig) {
        this.tomcatConfig = tomcatConfig;
        return this;
    }
    public String getTomcatConfig() {
        return this.tomcatConfig;
    }

    public CreateJobRequest setTriggerConfig(String triggerConfig) {
        this.triggerConfig = triggerConfig;
        return this;
    }
    public String getTriggerConfig() {
        return this.triggerConfig;
    }

    public CreateJobRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateJobRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateJobRequest setWarStartOptions(String warStartOptions) {
        this.warStartOptions = warStartOptions;
        return this;
    }
    public String getWarStartOptions() {
        return this.warStartOptions;
    }

    public CreateJobRequest setWebContainer(String webContainer) {
        this.webContainer = webContainer;
        return this;
    }
    public String getWebContainer() {
        return this.webContainer;
    }

    public CreateJobRequest setWorkload(String workload) {
        this.workload = workload;
        return this;
    }
    public String getWorkload() {
        return this.workload;
    }

}
