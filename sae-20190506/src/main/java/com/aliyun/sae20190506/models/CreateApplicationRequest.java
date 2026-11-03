// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class CreateApplicationRequest extends TeaModel {
    /**
     * <p>The ARN of the RAM role required to pull images across accounts. For more information, see <a href="https://help.aliyun.com/document_detail/223585.html">Use RAM roles to authorize access across Alibaba Cloud accounts</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::123456789012****:role/adminrole</p>
     */
    @NameInMap("AcrAssumeRoleArn")
    public String acrAssumeRoleArn;

    /**
     * <p>The Container Registry ACR Enterprise instance ID. This parameter is required when <strong>ImageUrl</strong> is set to a Container Registry Enterprise instance image.</p>
     * 
     * <strong>example:</strong>
     * <p>cri-xxxxxx</p>
     */
    @NameInMap("AcrInstanceId")
    public String acrInstanceId;

    /**
     * <p>The Aliyun Agent version.</p>
     * 
     * <strong>example:</strong>
     * <p>4.4.2</p>
     */
    @NameInMap("AgentVersion")
    public String agentVersion;

    /**
     * <p>The description of the application. The description can be up to 1,024 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a test description.</p>
     */
    @NameInMap("AppDescription")
    public String appDescription;

    /**
     * <p>The name of the application. The name can contain digits, letters, and hyphens (-). It must start with a letter and cannot end with a hyphen (-). The name can be up to 36 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The source of the application. A value of micro_service indicates a microservice application.</p>
     * 
     * <strong>example:</strong>
     * <p>micro_service</p>
     */
    @NameInMap("AppSource")
    public String appSource;

    /**
     * <p>Specifies whether to associate an elastic IP address (EIP). Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: associates an EIP.</li>
     * <li><strong>false</strong>: does not associate an EIP.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AssociateEip")
    public Boolean associateEip;

    /**
     * <p>Specifies whether to automatically configure the network environment. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: SAE automatically configures the network environment when the application is created. The values of <strong>NamespaceId</strong>, <strong>VpcId</strong>, <strong>vSwitchId</strong>, and <strong>SecurityGroupId</strong> are ignored.</li>
     * <li><strong>false</strong>: SAE manually configures the network environment when the application is created.</li>
     * </ul>
     * <blockquote>
     * <p>If you set this parameter to <strong>true</strong>, other <strong>NamespaceId</strong> values passed are ignored.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoConfig")
    public Boolean autoConfig;

    /**
     * <p>The ID of the base application.</p>
     * 
     * <strong>example:</strong>
     * <p>ee99cce6-1c8e-4bfa-96c3-3e2fa9de8a41</p>
     */
    @NameInMap("BaseAppId")
    public String baseAppId;

    /**
     * <p>The startup command of the image. The command must be an executable object that exists in the container. Example:</p>
     * <pre><code>command:
     *       - echo
     *       - abc
     *       - &gt;
     *       - file0
     * </code></pre>
     * <p>Based on the preceding example, Command=&quot;echo&quot;, CommandArgs=[&quot;abc&quot;, &quot;&gt;&quot;, &quot;file0&quot;].</p>
     * <blockquote>
     * <p>Notice: This parameter is required when PackageType is set to DotnetZip.</notice></p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>echo</p>
     */
    @NameInMap("Command")
    public String command;

    /**
     * <p>The arguments for the image startup command, which are required by the startup command <strong>Command</strong>. The format is as follows:</p>
     * <p><code>[&quot;a&quot;,&quot;b&quot;]</code></p>
     * <p>In the preceding example, <code>CommandArgs=[&quot;abc&quot;, &quot;&gt;&quot;, &quot;file0&quot;]</code>, where <code>[&quot;abc&quot;, &quot;&gt;&quot;, &quot;file0&quot;]</code> must be converted to a string in JSON array format. If no arguments are required, leave this parameter empty.
     * <notice>This parameter is required when PackageType is set to DotnetZip.</notice></p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;a&quot;,&quot;b&quot;]</p>
     */
    @NameInMap("CommandArgs")
    public String commandArgs;

    /**
     * <p>The mount description of the <strong>ConfigMap</strong>. Uses the configuration item created on the configuration item page of the namespace to inject configuration information into the container. Parameter description:</p>
     * <ul>
     * <li><strong>configMapId</strong>: instance ID of the ConfigMap instance. You can invoke the <a href="https://help.aliyun.com/document_detail/176917.html">ListNamespacedConfigMaps</a> operation to obtain the instance ID.</li>
     * <li><strong>key</strong>: the key value.</li>
     * </ul>
     * <blockquote>
     * <p>You can mount all keys by passing the sae-sys-configmap-all parameter.</p>
     * </blockquote>
     * <ul>
     * <li><strong>mountPath</strong>: the mount path.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;configMapId&quot;:16,&quot;key&quot;:&quot;test&quot;,&quot;mountPath&quot;:&quot;/tmp&quot;}]</p>
     */
    @NameInMap("ConfigMapMountDesc")
    public String configMapMountDesc;

    /**
     * <p>The number of CPU cores required for each instance. Unit: millicore. The value cannot be 0. Only the following defined specifications are supported:</p>
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
     * <p>[{&quot;hostName&quot;:&quot;samplehost&quot;,&quot;ip&quot;:&quot;127.0.0.1&quot;}]</p>
     */
    @NameInMap("CustomHostAlias")
    public String customHostAlias;

    /**
     * <p>The custom image type. If the image is not a custom image, set this parameter to an empty string:</p>
     * <ul>
     * <li>internet: public network image.</li>
     * <li>intranet: private network image.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>internet</p>
     */
    @NameInMap("CustomImageNetworkType")
    public String customImageNetworkType;

    /**
     * <p>Specifies whether to deploy the application immediately. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: deploys the application immediately. This is the default value.</li>
     * <li><strong>false</strong>: deploys the application later.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Deploy")
    public Boolean deploy;

    /**
     * <p>The disk storage size, in GB.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("DiskSize")
    public Integer diskSize;

    /**
     * <p>The version number of the .NET framework:</p>
     * <ul>
     * <li>.NET 3.1</li>
     * <li>.NET 5.0</li>
     * <li>.NET 6.0</li>
     * <li>.NET 7.0</li>
     * <li>.NET 8.0</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>.NET 3.1</p>
     */
    @NameInMap("Dotnet")
    public String dotnet;

    /**
     * <p>The version of the application runtime environment in the High-Speed Service Framework (HSF), such as the Ali-Tomcat container.</p>
     * 
     * <strong>example:</strong>
     * <p>3.5.3</p>
     */
    @NameInMap("EdasContainerVersion")
    public String edasContainerVersion;

    /**
     * <p>The shared ephemeral storage configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;name\&quot;:\&quot;workdir\&quot;,\&quot;mountPath\&quot;:\&quot;/usr/local/tomcat/webapps\&quot;}]</p>
     */
    @NameInMap("EmptyDirDesc")
    public String emptyDirDesc;

    /**
     * <p>Specifies whether to enable the CPU Burst feature:</p>
     * <ul>
     * <li>true: enables the feature.</li>
     * <li>false: disables the feature.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableCpuBurst")
    public Boolean enableCpuBurst;

    /**
     * <p>Specifies whether to enable application monitoring for non-Java applications based on eBPF technology. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: enables the feature.</li>
     * <li><strong>false</strong>: disables the feature. This is the default value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableEbpf")
    public String enableEbpf;

    /**
     * <p>Specifies whether to reuse the namespace agent version configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableNamespaceAgentVersion")
    public Boolean enableNamespaceAgentVersion;

    /**
     * <p>Specifies whether to reuse the namespace Simple Log Service (SLS) log configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableNamespaceSlsConfig")
    public Boolean enableNamespaceSlsConfig;

    /**
     * <p>Specifies whether to enable the new Application Real-Time Monitoring Service (ARMS) features:</p>
     * <ul>
     * <li>true: enables the features.</li>
     * <li>false: disables the features.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableNewArms")
    public Boolean enableNewArms;

    /**
     * <p>Specifies whether to enable Prometheus custom metric collection.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnablePrometheus")
    public Boolean enablePrometheus;

    /**
     * <p>Specifies whether to enable sidecar resource isolation:</p>
     * <ul>
     * <li>true: enables isolation.</li>
     * <li>false: disables isolation.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableSidecarResourceIsolated")
    public Boolean enableSidecarResourceIsolated;

    /**
     * <p>The environment variables of the container. You can customize environment variables or reference ConfigMaps. To reference a ConfigMap, you must create a ConfigMap instance first. For more information, see <a href="https://help.aliyun.com/document_detail/176914.html">CreateConfigMap</a>. Valid values:</p>
     * <ul>
     * <li>Custom configuration<ul>
     * <li><strong>name</strong>: the name of the environment variable.</li>
     * <li><strong>value</strong>: the value of the environment variable. The priority of this parameter is higher than that of valueFrom.</li>
     * </ul>
     * </li>
     * <li>Reference a ConfigMap (valueFrom)<ul>
     * <li><strong>name</strong>: the name of the environment variable. You can reference a single key or all keys. To reference all keys, enter sae-sys-configmap-all-<ConfigMap name>, for example, sae-sys-configmap-all-test1.</li>
     * <li><strong>valueFrom</strong>: the reference of the environment variable. Set the value to configMapRef.<ul>
     * <li><strong>configMapId</strong>: the ID of the ConfigMap.</li>
     * <li><strong>key</strong>: the key. If you reference all key-value pairs, do not set this field.</li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[
     *     {
     *         &quot;name&quot;: &quot;sae-sys-configmap-all-hello&quot;,
     *         &quot;valueFrom&quot;: {
     *             &quot;configMapRef&quot;: {
     *                 &quot;configMapId&quot;: 100,
     *                 &quot;key&quot;: &quot;&quot;
     *             }
     *         }
     *     },
     *     {
     *         &quot;name&quot;: &quot;hello&quot;,
     *         &quot;valueFrom&quot;: {
     *             &quot;configMapRef&quot;: {
     *                 &quot;configMapId&quot;: 101,
     *                 &quot;key&quot;: &quot;php-fpm&quot;
     *             }
     *         }
     *     },
     *     {
     *         &quot;name&quot;: &quot;envtmp&quot;,
     *         &quot;value&quot;: &quot;newenv&quot;
     *     }
     * ]</p>
     */
    @NameInMap("Envs")
    public String envs;

    /**
     * <p>The GPU configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{\n\&quot;gpuType\&quot;:\&quot;PPU810E\&quot;,\n\&quot;gpuCount\&quot;:\&quot;1\&quot;\n}</p>
     */
    @NameInMap("GpuConfig")
    public String gpuConfig;

    /**
     * <p>The Kubernetes headless service registration and discovery configuration.</p>
     * <ul>
     * <li>serviceName: The service name.</li>
     * <li>namespaceId: The namespace ID.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;serviceName\&quot;:\&quot;leaf-test-headless\&quot;,\&quot;namespaceId\&quot;:\&quot;cn-zhangjiakou:prod\&quot;}</p>
     */
    @NameInMap("HeadlessPvtzDiscoverySvc")
    public String headlessPvtzDiscoverySvc;

    /**
     * <p>The NGINX version. Valid values:</p>
     * <ul>
     * <li>nginx 1.20</li>
     * <li>nginx 1.22</li>
     * <li>nginx 1.24</li>
     * <li>nginx 1.26</li>
     * <li>nginx 1.28</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>nginx 1.28</p>
     */
    @NameInMap("Html")
    public String html;

    /**
     * <p>The ID of the corresponding Secret.</p>
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
     * <p>The init container configuration.</p>
     */
    @NameInMap("InitContainersConfig")
    public java.util.List<InitContainerConfig> initContainersConfig;

    /**
     * <p>Specifies whether the application is stateful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsStateful")
    public Boolean isStateful;

    /**
     * <p>The startup arguments for the JAR package. Default startup command: <code>$JAVA_HOME/bin/java $JarStartOptions -jar $CATALINA_OPTS &quot;$package_path&quot; $JarStartArgs</code></p>
     * 
     * <strong>example:</strong>
     * <p>custom-args</p>
     */
    @NameInMap("JarStartArgs")
    public String jarStartArgs;

    /**
     * <p>The startup options for the JAR package. Default startup command: <code>$JAVA_HOME/bin/java $JarStartOptions -jar $CATALINA_OPTS &quot;$package_path&quot; $JarStartArgs</code></p>
     * 
     * <strong>example:</strong>
     * <p>-Xms4G -Xmx4G</p>
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
     * <p>This parameter is not supported when <strong>PackageType</strong> is set to <strong>Image</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>Open JDK 8</p>
     */
    @NameInMap("Jdk")
    public String jdk;

    /**
     * <p>The summary configuration for collecting logs to Kafka. Valid values:</p>
     * <ul>
     * <li><strong>kafkaEndpoint</strong>: the service registration address of the Kafka API.</li>
     * <li><strong>kafkaInstanceId</strong>: the Kafka instance ID.</li>
     * <li><strong>kafkaConfigs</strong>: the summary configuration for one or more logs. For value description, see the <strong>kafkaConfigs</strong> request parameter in this topic.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;kafkaEndpoint&quot;:&quot;10.0.X.XXX:XXXX,10.0.X.XXX:XXXX,10.0.X.XXX:XXXX&quot;,&quot;kafkaInstanceId&quot;:&quot;alikafka_pre-cn-7pp2l8kr****&quot;,&quot;kafkaConfigs&quot;:[{&quot;logType&quot;:&quot;file_log&quot;,&quot;logDir&quot;:&quot;/tmp/a.log&quot;,&quot;kafkaTopic&quot;:&quot;test2&quot;},{&quot;logType&quot;:&quot;stdout&quot;,&quot;logDir&quot;:&quot;&quot;,&quot;kafkaTopic&quot;:&quot;test&quot;}]}</p>
     */
    @NameInMap("KafkaConfigs")
    public String kafkaConfigs;

    /**
     * <p>The application labels. Both keys and values are strings.</p>
     */
    @NameInMap("Labels")
    public java.util.Map<String, String> labels;

    /**
     * <p>The liveness probe of the container. A container that failed the health check undergoes shutdown and recovers. The following methods are supported:</p>
     * <ul>
     * <li><strong>exec</strong>: for example, {&quot;exec&quot;:{&quot;command&quot;:[&quot;sh&quot;,&quot;-c&quot;,&quot;cat/home/admin/start.sh&quot;]},&quot;initialDelaySeconds&quot;:30,&quot;periodSeconds&quot;:30,&quot;timeoutSeconds&quot;:2}</li>
     * <li><strong>httpGet</strong>: for example, {&quot;httpGet&quot;:{&quot;path&quot;:&quot;/&quot;,&quot;port&quot;:18091,&quot;scheme&quot;:&quot;HTTP&quot;,&quot;isContainKeyWord&quot;:true,&quot;keyWord&quot;:&quot;SAE&quot;},&quot;initialDelaySeconds&quot;:11,&quot;periodSeconds&quot;:10,&quot;timeoutSeconds&quot;:1}</li>
     * <li><strong>tcpSocket</strong>: for example, {&quot;tcpSocket&quot;:{&quot;port&quot;:18091},&quot;initialDelaySeconds&quot;:11,&quot;periodSeconds&quot;:10,&quot;timeoutSeconds&quot;:1}</li>
     * </ul>
     * <blockquote>
     * <p>You can select only one method for the health check.</p>
     * </blockquote>
     * <p>Parameter description:</p>
     * <ul>
     * <li><strong>exec.command</strong>: Settings for the health check command.</li>
     * <li><strong>httpGet.path</strong>: the access path.</li>
     * <li><strong>httpGet.scheme</strong>: <strong>HTTP</strong> or <strong>HTTPS</strong>.</li>
     * <li><strong>httpGet.isContainKeyWord</strong>: <strong>true</strong> indicates that the keyword is included, and <strong>false</strong> indicates that the keyword is not included. If this field is missing, the advanced feature is not used.</li>
     * <li><strong>httpGet.keyWord</strong>: the custom keyword. The <strong>isContainKeyWord</strong> field is required when this field is used.</li>
     * <li><strong>tcpSocket.port</strong>: the port for TCP connection detection.</li>
     * <li><strong>initialDelaySeconds</strong>: Settings for the delay before the health check starts. Default value: 10. Unit: seconds.</li>
     * <li><strong>periodSeconds</strong>: Settings for the health check epoch. Default value: 30. Unit: seconds.</li>
     * <li><strong>timeoutSeconds</strong>: Settings for the timeout period of the health check. Default value: 1. Unit: seconds. If this parameter is set to 0 or not set, the default timeout period is 1 second.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;exec&quot;:{&quot;command&quot;:[&quot;sh&quot;,&quot;-c&quot;,&quot;cat /home/admin/start.sh&quot;]},&quot;initialDelaySeconds&quot;:30,&quot;periodSeconds&quot;:30,&quot;timeoutSeconds&quot;:2}</p>
     */
    @NameInMap("Liveness")
    public String liveness;

    /**
     * <p>LokiConfigs</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("LokiConfigs")
    public String lokiConfigs;

    /**
     * <p>The memory size required for each instance. Unit: MB. The value cannot be 0. The memory size has a one-to-one correspondence with the number of CPU cores. Only the following defined specifications are supported:</p>
     * <ul>
     * <li><strong>1024</strong>: corresponds to 500 and 1,000 millicores.</li>
     * <li><strong>2048</strong>: corresponds to 500, 1,000, and 2,000 millicores.</li>
     * <li><strong>4096</strong>: corresponds to 1,000, 2,000, and 4,000 millicores.</li>
     * <li><strong>8192</strong>: corresponds to 2,000, 4,000, and 8,000 millicores.</li>
     * <li><strong>12288</strong>: corresponds to 12,000 millicores.</li>
     * <li><strong>16384</strong>: corresponds to 4,000, 8,000, and 16,000 millicores.</li>
     * <li><strong>24576</strong>: corresponds to 12,000 millicores.</li>
     * <li><strong>32768</strong>: corresponds to 16,000 millicores.</li>
     * <li><strong>65536</strong>: corresponds to 8,000, 16,000, and 32,000 millicores.</li>
     * <li><strong>131072</strong>: corresponds to 32,000 millicores.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("Memory")
    public Integer memory;

    /**
     * <p>The Nacos registry. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: the built-in Nacos of SAE.</li>
     * <li><strong>1</strong>: a self-managed Nacos.</li>
     * <li><strong>2</strong>: Microservices Engine (MSE) Nacos.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>&quot;0&quot;</p>
     */
    @NameInMap("MicroRegistration")
    public String microRegistration;

    /**
     * <p>The configuration of the registry.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;instanceId\&quot;:\&quot;mse-cn-zvp2bh6h70r\&quot;,\&quot;namespace\&quot;:\&quot;4c0aa74f-57cb-423c-b6af-5d9f2d0e3dbd\&quot;}</p>
     */
    @NameInMap("MicroRegistrationConfig")
    public String microRegistrationConfig;

    /**
     * <p>Configures microservice governance features.</p>
     * <ul>
     * <li>enable: Specifies whether to enable microservice governance. Valid values:<ul>
     * <li>true: Enabled.</li>
     * <li>false: Disabled.</li>
     * </ul>
     * </li>
     * <li>mseLosslessRule: Configures lossless online and offline rules.<ul>
     * <li>delayTime: The delay time.</li>
     * <li>enable: Specifies whether to enable the lossless online feature. Valid values: true (enabled) and false (disabled).</li>
     * <li>notice: Specifies whether to enable the notification feature. Valid values: true (enabled) and false (disabled).</li>
     * <li>warmupTime: The warm-up duration for low traffic, in seconds.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;enable&quot;: true,&quot;mseLosslessRule&quot;: {&quot;delayTime&quot;: 0,&quot;enable&quot;: false,&quot;notice&quot;: false,&quot;warmupTime&quot;: 120}}</p>
     */
    @NameInMap("MicroserviceEngineConfig")
    public String microserviceEngineConfig;

    /**
     * <p>Do not configure this field. Configure <strong>NasConfigs</strong> instead. The mount description of the NAS file system. If the configuration remains unchanged during deployment, you do not need to set this parameter. That is, you do not need to include the <strong>MountDesc</strong> field in the request. If you need to clear the NAS configuration, set the value of this field to an empty string in the request. That is, set the <strong>MountDesc</strong> field to &quot;&quot;.</p>
     * 
     * <strong>example:</strong>
     * <p>[{mountPath: &quot;/tmp&quot;, nasPath: &quot;/&quot;}]</p>
     */
    @NameInMap("MountDesc")
    public String mountDesc;

    /**
     * <p>Do not configure this field. Configure <strong>NasConfigs</strong> instead. The mount target of the NAS file system in the VPC of the application. If the configuration remains unchanged during deployment, you do not need to set this parameter. That is, you do not need to include the <strong>MountHost</strong> field in the request. If you need to clear the NAS configuration, set the value of this field to an empty string in the request. That is, set the <strong>MountHost</strong> field to &quot;&quot;.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("MountHost")
    public String mountHost;

    /**
     * <p>The ID of the Serverless App Engine (SAE) namespace. Only namespaces whose names contain lowercase letters and hyphens (-) are supported. The name must start with a letter.
     * You can obtain the namespace by calling the <a href="https://help.aliyun.com/document_detail/126547.html">DescribeNamespaceList</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing:test</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    /**
     * <p>The configuration for mounting the NAS file system. Valid values:</p>
     * <ul>
     * <li><strong>mountPath</strong>: the mount path of the container.</li>
     * <li><strong>readOnly</strong>: A value of <strong>false</strong> indicates read and write permissions.</li>
     * <li><strong>nasId</strong>: the ID of the NAS file system.</li>
     * <li><strong>mountDomain</strong>: the mount target address of the container. For more information, see <a href="https://help.aliyun.com/document_detail/62626.html">DescribeMountTargets</a>.</li>
     * <li><strong>nasPath</strong>: the relative file directory of the NAS file system.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;mountPath&quot;:&quot;/test1&quot;,&quot;readOnly&quot;:false,&quot;nasId&quot;:&quot;nasId1&quot;,&quot;mountDomain&quot;:&quot;nasId1.cn-shenzhen.nas.aliyuncs.com&quot;,&quot;nasPath&quot;:&quot;/test1&quot;},{&quot;nasId&quot;:&quot;nasId2&quot;,&quot;mountDomain&quot;:&quot;nasId2.cn-shenzhen.nas.aliyuncs.com&quot;,&quot;readOnly&quot;:false,&quot;nasPath&quot;:&quot;/test2&quot;,&quot;mountPath&quot;:&quot;/test2&quot;}]</p>
     */
    @NameInMap("NasConfigs")
    public String nasConfigs;

    /**
     * <p>Do not configure this field. Configure <strong>NasConfigs</strong> instead. The ID of the mounted Apsara File Storage NAS file system. The NAS file system must reside in the same region as the cluster. It must have an available quota for creating mount targets, or its mount targets must already exist on a vSwitch in the VPC. If you do not specify this parameter and the <strong>mountDescs</strong> field exists, a NAS file system is automatically purchased and mounted to a vSwitch in the VPC by default.</p>
     * <p>If the configuration remains unchanged during deployment, you do not need to set this parameter. That is, you do not need to include the <strong>NASId</strong> field in the request. If you need to clear the NAS configuration, set the value of this field to an empty string in the request. That is, set the <strong>NASId</strong> field to &quot;&quot;.</p>
     * 
     * <strong>example:</strong>
     * <p>KSAK****</p>
     */
    @NameInMap("NasId")
    public String nasId;

    /**
     * <p>The application version. Valid values:</p>
     * <ul>
     * <li>lite: Lite Edition.</li>
     * <li>std: Standard Edition.</li>
     * <li>pro: Professional Edition.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>pro</p>
     */
    @NameInMap("NewSaeVersion")
    public String newSaeVersion;

    /**
     * <p>The RAM role for the identity authentication service.</p>
     * <blockquote>
     * <p>You must create an OIDC identity provider and an identity provider role in the same region in advance. For more information, see &lt;props=&quot;china&quot;&gt;<a href="https://www.alibabacloud.com/help/en/ram/developer-reference/api-ims-2019-08-15-createoidcprovider">Create an OIDC identity provider</a> and <a href="https://www.alibabacloud.com/help/en/ram/developer-reference/api-ims-2019-08-15-createsamlprovider">Create a role-based SSO identity provider</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/ram/developer-reference/api-ims-2019-08-15-createoidcprovider">Create an OIDC identity provider</a> and <a href="https://www.alibabacloud.com/help/zh/ram/developer-reference/api-ims-2019-08-15-createsamlprovider">Create a role-based SSO identity provider</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>sae-test</p>
     */
    @NameInMap("OidcRoleName")
    public String oidcRoleName;

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
     * <p>The OSS mount description. Parameter description:</p>
     * <ul>
     * <li><strong>bucketName</strong>: the name of the bucket.</li>
     * <li><strong>bucketPath</strong>: the folder or object that you created in OSS. If the OSS mount folder does not exist, an exception is triggered.</li>
     * <li><strong>mountPath</strong>: the container path in SAE. If the path already exists, it will overwrite the existing content. If the path does not exist, it is created.</li>
     * <li><strong>readOnly</strong>: specifies whether the container path has read permissions on the mounted folder resources. Valid values:<ul>
     * <li><strong>true</strong>: read-only permissions.</li>
     * <li><strong>false</strong>: read and write permissions.</li>
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
     * <p>The type of the application package. Valid values:</p>
     * <ul>
     * <li><p>When you deploy the application by using Java, <strong>FatJar</strong>, <strong>War</strong>, and <strong>Image</strong> are supported.</p>
     * </li>
     * <li><p>When you deploy the application by using PHP, the following types are supported:</p>
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
     * <li><p>When you deploy the application by using Python, <strong>PythonZip</strong> and <strong>Image</strong> are supported.</p>
     * </li>
     * <li><p>When you deploy the application by using .NET Core, <strong>DotnetZip</strong> and <strong>Image</strong> are supported.</p>
     * <blockquote>
     * <p>If you select DotnetZip, Dotnet specifies the version number of the .NET Core environment. .NET 3.1, .NET 5.0, .NET 6.0, .NET 7.0, and .NET 8.0 are supported. In this case, the Dotnet, Command, and CommandArgs parameters are required.</p>
     * </blockquote>
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
     * <p><a href="http://myoss.oss-cn-****.aliyuncs.com/my-buc/2019-06-30/****.jar">http://myoss.oss-cn-****.aliyuncs.com/my-buc/2019-06-30/****.jar</a></p>
     */
    @NameInMap("PackageUrl")
    public String packageUrl;

    /**
     * <p>The version number of the deployment package. This parameter is required when <strong>PackageType</strong> is set to <strong>FatJar</strong>, <strong>War</strong>, or <strong>PythonZip</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0.0</p>
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
     * <p>The mount path for PHP application monitoring. You must ensure that the PHP server loads the configuration file in this path.
     * You do not need to pay attention to the configuration content. SAE automatically renders the correct configuration file.</p>
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
     * <p>The mount path for the PHP application startup configuration. You must ensure that the PHP server uses this configuration file to start.</p>
     * 
     * <strong>example:</strong>
     * <p>/usr/local/etc/php/php.ini</p>
     */
    @NameInMap("PhpConfigLocation")
    public String phpConfigLocation;

    /**
     * <p>The script to execute after the container starts. A script is triggered and executed immediately after the container is created. Format: {&quot;exec&quot;:{&quot;command&quot;:[&quot;cat&quot;,&quot;/etc/group&quot;]}}</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;exec&quot;:{&quot;command&quot;:[&quot;cat&quot;,&quot;/etc/group&quot;]}}</p>
     */
    @NameInMap("PostStart")
    public String postStart;

    /**
     * <p>The script to execute before the container stops. A script is triggered and executed before the container is deleted. Format: {&quot;exec&quot;:{&quot;command&quot;:[&quot;cat&quot;,&quot;/etc/group&quot;]}}</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;exec&quot;:{&quot;command&quot;:[&quot;cat&quot;,&quot;/etc/group&quot;]}}</p>
     */
    @NameInMap("PreStop")
    public String preStop;

    /**
     * <p>The programming language used to create the application. Valid values:</p>
     * <ul>
     * <li><strong>java</strong>: Java.</li>
     * <li><strong>php</strong>: PHP.</li>
     * <li><strong>python</strong>: Python.</li>
     * <li><strong>dotnet</strong>: .NET Core.</li>
     * <li><strong>other</strong>: multiple languages, such as C++, Go, and Node.js.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>java</p>
     */
    @NameInMap("ProgrammingLanguage")
    public String programmingLanguage;

    /**
     * <p>Enables Kubernetes Service registration and discovery. Valid values:</p>
     * <ul>
     * <li><strong>serviceName</strong>: the service name. The format is custom-namespace ID. The suffix -namespace ID cannot be customized and must be filled in based on the namespace where the application resides. For example, if you select the default namespace in the China (Beijing) region, the value is -cn-beijing-default.</li>
     * <li><strong>namespaceId</strong>: the ID of the namespace.</li>
     * <li><strong>portProtocols</strong>: the port and protocol. The port value ranges from 1 to 65535. The protocol supports <strong>TCP</strong> and <strong>UDP</strong>.</li>
     * <li><strong>portAndProtocol</strong>: the port and protocol. The port value ranges from 1 to 65535. The protocol supports <strong>TCP</strong> and <strong>UDP</strong>. <strong>We recommend that you use portProtocols. If portProtocols Settings are configured, only portProtocols takes effect</strong>.</li>
     * <li><strong>enable</strong>: enables Kubernetes Service registration and discovery.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;serviceName&quot;:&quot;bwm-poc-sc-gateway-cn-beijing-front&quot;,&quot;namespaceId&quot;:&quot;cn-beijing:front&quot;,&quot;portAndProtocol&quot;:{&quot;18012&quot;:&quot;TCP&quot;},&quot;enable&quot;:true,&quot;portProtocols&quot;:[{&quot;port&quot;:18012,&quot;protocol&quot;:&quot;TCP&quot;}]}</p>
     */
    @NameInMap("PvtzDiscoverySvc")
    public String pvtzDiscoverySvc;

    /**
     * <p>The Python environment. <strong>PYTHON 3.9.15</strong> is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>PYTHON 3.9.15</p>
     */
    @NameInMap("Python")
    public String python;

    /**
     * <p>The custom installation module dependencies. By default, the dependencies defined in the requirements.txt file in the root folder are installed. If no dependencies are configured or custom software packages are used, you can specify the dependencies to install.</p>
     * 
     * <strong>example:</strong>
     * <p>Flask==2.0</p>
     */
    @NameInMap("PythonModules")
    public String pythonModules;

    /**
     * <p>The application runtime security protection (RASP) configuration.</p>
     */
    @NameInMap("RaspConfig")
    public CreateApplicationRequestRaspConfig raspConfig;

    /**
     * <p>The readiness probe of the application. A container that fails multiple health checks is stopped and restarted. Traffic from Server Load Balancer (SLB) is not routed to containers that fail the health check. The <strong>exec</strong>, <strong>httpGet</strong>, and <strong>tcpSocket</strong> methods are supported. For specific examples, see the <strong>Liveness</strong> parameter.</p>
     * <blockquote>
     * <p>You can select only one method for the health check.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;exec&quot;:{&quot;command&quot;:[&quot;sh&quot;,&quot;-c&quot;,&quot;cat /home/admin/start.sh&quot;]},&quot;initialDelaySeconds&quot;:30,&quot;periodSeconds&quot;:30,&quot;timeoutSeconds&quot;:2}</p>
     */
    @NameInMap("Readiness")
    public String readiness;

    /**
     * <p>The initial number of instances.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Replicas")
    public Integer replicas;

    /**
     * <p>The resource type. Valid values: NULL (default), default (default), and haiguang (Hygon servers).</p>
     * 
     * <strong>example:</strong>
     * <p>NULL</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The SAE version. Valid values:</p>
     * <ul>
     * <li><strong>v1</strong></li>
     * <li><strong>v2</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>v1</p>
     */
    @NameInMap("SaeVersion")
    public String saeVersion;

    /**
     * <p>The mount description of the <strong>Secret</strong>. Uses the Secret created on the Secret page of the namespace to inject confidential information into the container. Parameter description:</p>
     * <ul>
     * <li><strong>secretId</strong>: instance ID of the Secret instance. You can obtain the instance ID by invoking the ListSecrets operation.</li>
     * <li><strong>key</strong>: the key value.</li>
     * </ul>
     * <blockquote>
     * <p>You can mount all keys by passing the sae-sys-secret-all parameter.</p>
     * </blockquote>
     * <ul>
     * <li><strong>mountPath</strong>: the mount path.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[{“secretId&quot;:10,”key&quot;:&quot;test&quot;,&quot;mountPath&quot;:&quot;/tmp&quot;}]</p>
     */
    @NameInMap("SecretMountDesc")
    public String secretMountDesc;

    /**
     * <p>The ID of the security group.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-wz969ngg2e49q5i4****</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>The canary release tags configured for the application.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;alicloud.service.tag\&quot;:\&quot;g1\&quot;}</p>
     */
    @NameInMap("ServiceTags")
    public String serviceTags;

    /**
     * <p>The container configuration.</p>
     */
    @NameInMap("SidecarContainersConfig")
    public java.util.List<SidecarContainerConfig> sidecarContainersConfig;

    /**
     * <p>The configuration for collecting logs to Simple Log Service (SLS).</p>
     * <ul>
     * <li>Use SLS resources from automatic creation by SAE: [{&quot;logDir&quot;:&quot;&quot;,&quot;logType&quot;:&quot;stdout&quot;},{&quot;logDir&quot;:&quot;/tmp/a.log&quot;}].</li>
     * <li>Use custom SLS resources: [{&quot;projectName&quot;:&quot;test-sls&quot;,&quot;logType&quot;:&quot;stdout&quot;,&quot;logDir&quot;:&quot;&quot;,&quot;logstoreName&quot;:&quot;sae&quot;,&quot;logtailName&quot;:&quot;&quot;},{&quot;projectName&quot;:&quot;test&quot;,&quot;logDir&quot;:&quot;/tmp/a.log&quot;,&quot;logstoreName&quot;:&quot;sae&quot;,&quot;logtailName&quot;:&quot;&quot;}].</li>
     * </ul>
     * <p>Parameter description:</p>
     * <ul>
     * <li><strong>projectName</strong>: the name of the SLS project.  </li>
     * <li><strong>logDir</strong>: the log path.</li>
     * <li><strong>logType</strong>: the log type. <strong>stdout</strong> indicates container standard output logs. Only one stdout log Settings can be configured. If Settings are not specified, file logs are collected.</li>
     * <li><strong>logstoreName</strong>: the name of the SLS Logstore.</li>
     * <li><strong>logtailName</strong>: the name of the SLS Logtail. If this parameter is not specified, a new Logtail is created.</li>
     * </ul>
     * <p>If the SLS collection configuration remains unchanged during multiple deployments, you do not need to set this parameter. That is, you do not need to include the <strong>SlsConfigs</strong> field in the request. If you no longer need the SLS collection feature, you must set the value of this field to an empty string in the request. That is, set the <strong>SlsConfigs</strong> field to &quot;&quot;.</p>
     * <blockquote>
     * <p>Projects from automatic creation with the application are deleted when the application is deleted. Therefore, when selecting an existing project, you cannot select a project from automatic creation by SAE.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;logDir&quot;:&quot;&quot;,&quot;logType&quot;:&quot;stdout&quot;},{&quot;logDir&quot;:&quot;/tmp/a.log&quot;}]</p>
     */
    @NameInMap("SlsConfigs")
    public String slsConfigs;

    /**
     * <p>sls log tags</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("SlsLogEnvTags")
    public String slsLogEnvTags;

    /**
     * <p>Enables application startup probes.</p>
     * <ul>
     * <li>Success: Indicates that the application is started. If you configure liveness and readiness probes, the liveness and readiness probes are executed after the application is started.</li>
     * <li>Failure: Indicates that the application fails to start. An exception is reported and the application is automatically restarted.<blockquote>
     * <ul>
     * <li>The exec, httpGet, and tcpSocket methods are supported. For specific examples, refer to the Liveness parameter.</li>
     * <li>You can select only one method for health checks.</li>
     * </ul>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;exec&quot;:{&quot;command&quot;:[&quot;sh&quot;,&quot;-c&quot;,&quot;cat /home/admin/start.sh&quot;]},&quot;initialDelaySeconds&quot;:30,&quot;periodSeconds&quot;:30,&quot;timeoutSeconds&quot;:2}</p>
     */
    @NameInMap("StartupProbe")
    public String startupProbe;

    /**
     * <p>The timeout period for graceful shutdown. Default value: 30. Unit: seconds. Valid values: 1 to 300.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
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
     * <p>The Tomcat file configuration. Set the value to &quot;&quot; or &quot;{}&quot; to delete the configuration:</p>
     * <ul>
     * <li><strong>port</strong>: the port range is 1024 to 65535. Ports smaller than 1024 require root permissions. Because the container is configured with admin permissions, specify a port greater than 1024. If this parameter is not configured, the default value is 8080.</li>
     * <li><strong>contextPath</strong>: the access path. The default value is the root directory &quot;/&quot;.</li>
     * <li><strong>maxThreads</strong>: the maximum number of connections in the connection pool. The default value is 400.</li>
     * <li><strong>uriEncoding</strong>: the encoding format of Tomcat. Valid values: <strong>UTF-8</strong>, <strong>ISO-8859-1</strong>, <strong>GBK</strong>, and <strong>GB2312</strong>. If this parameter is not set, the default value is <strong>ISO-8859-1</strong>.</li>
     * <li><strong>useBodyEncodingForUri</strong>: specifies whether to use <strong>BodyEncoding for URL</strong>. Default value: <strong>true</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;port&quot;:8080,&quot;contextPath&quot;:&quot;/&quot;,&quot;maxThreads&quot;:400,&quot;uriEncoding&quot;:&quot;ISO-8859-1&quot;,&quot;useBodyEncodingForUri&quot;:true}</p>
     */
    @NameInMap("TomcatConfig")
    public String tomcatConfig;

    /**
     * <p>The ID of the vSwitch to which the elastic network interface controllers (NICs) of the application instance belong. The vSwitch must reside in the preceding VPC. The vSwitch is also attached to the SAE namespace. If you do not specify this parameter, the ID of the vSwitch attached to the namespace is used by default.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp12mw1f8k3jgygk9****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the virtual private cloud (VPC) that corresponds to the SAE namespace. In SAE, a namespace can correspond to only one VPC, and the correspondence cannot be modified. The binding relationship is established when you create the first SAE application in the namespace. Multiple namespaces can correspond to one VPC. If you do not specify this parameter, the ID of the VPC bound to the namespace is used by default.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1aevy8sofi8mh1q****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The startup command for the application deployed by using a WAR package. The procedure is the same as that for configuring the startup command for image deployment. For more information, see <a href="https://help.aliyun.com/document_detail/96677.html">Set a startup command</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>CATALINA_OPTS=\&quot;$CATALINA_OPTS $Options\&quot; catalina.sh run</p>
     */
    @NameInMap("WarStartOptions")
    public String warStartOptions;

    /**
     * <p>The Tomcat version on which the WebContainer deployment package depends. Valid values:</p>
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

    public static CreateApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicationRequest self = new CreateApplicationRequest();
        return TeaModel.build(map, self);
    }

    public CreateApplicationRequest setAcrAssumeRoleArn(String acrAssumeRoleArn) {
        this.acrAssumeRoleArn = acrAssumeRoleArn;
        return this;
    }
    public String getAcrAssumeRoleArn() {
        return this.acrAssumeRoleArn;
    }

    public CreateApplicationRequest setAcrInstanceId(String acrInstanceId) {
        this.acrInstanceId = acrInstanceId;
        return this;
    }
    public String getAcrInstanceId() {
        return this.acrInstanceId;
    }

    public CreateApplicationRequest setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
        return this;
    }
    public String getAgentVersion() {
        return this.agentVersion;
    }

    public CreateApplicationRequest setAppDescription(String appDescription) {
        this.appDescription = appDescription;
        return this;
    }
    public String getAppDescription() {
        return this.appDescription;
    }

    public CreateApplicationRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateApplicationRequest setAppSource(String appSource) {
        this.appSource = appSource;
        return this;
    }
    public String getAppSource() {
        return this.appSource;
    }

    public CreateApplicationRequest setAssociateEip(Boolean associateEip) {
        this.associateEip = associateEip;
        return this;
    }
    public Boolean getAssociateEip() {
        return this.associateEip;
    }

    public CreateApplicationRequest setAutoConfig(Boolean autoConfig) {
        this.autoConfig = autoConfig;
        return this;
    }
    public Boolean getAutoConfig() {
        return this.autoConfig;
    }

    public CreateApplicationRequest setBaseAppId(String baseAppId) {
        this.baseAppId = baseAppId;
        return this;
    }
    public String getBaseAppId() {
        return this.baseAppId;
    }

    public CreateApplicationRequest setCommand(String command) {
        this.command = command;
        return this;
    }
    public String getCommand() {
        return this.command;
    }

    public CreateApplicationRequest setCommandArgs(String commandArgs) {
        this.commandArgs = commandArgs;
        return this;
    }
    public String getCommandArgs() {
        return this.commandArgs;
    }

    public CreateApplicationRequest setConfigMapMountDesc(String configMapMountDesc) {
        this.configMapMountDesc = configMapMountDesc;
        return this;
    }
    public String getConfigMapMountDesc() {
        return this.configMapMountDesc;
    }

    public CreateApplicationRequest setCpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }
    public Integer getCpu() {
        return this.cpu;
    }

    public CreateApplicationRequest setCustomHostAlias(String customHostAlias) {
        this.customHostAlias = customHostAlias;
        return this;
    }
    public String getCustomHostAlias() {
        return this.customHostAlias;
    }

    public CreateApplicationRequest setCustomImageNetworkType(String customImageNetworkType) {
        this.customImageNetworkType = customImageNetworkType;
        return this;
    }
    public String getCustomImageNetworkType() {
        return this.customImageNetworkType;
    }

    public CreateApplicationRequest setDeploy(Boolean deploy) {
        this.deploy = deploy;
        return this;
    }
    public Boolean getDeploy() {
        return this.deploy;
    }

    public CreateApplicationRequest setDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
        return this;
    }
    public Integer getDiskSize() {
        return this.diskSize;
    }

    public CreateApplicationRequest setDotnet(String dotnet) {
        this.dotnet = dotnet;
        return this;
    }
    public String getDotnet() {
        return this.dotnet;
    }

    public CreateApplicationRequest setEdasContainerVersion(String edasContainerVersion) {
        this.edasContainerVersion = edasContainerVersion;
        return this;
    }
    public String getEdasContainerVersion() {
        return this.edasContainerVersion;
    }

    public CreateApplicationRequest setEmptyDirDesc(String emptyDirDesc) {
        this.emptyDirDesc = emptyDirDesc;
        return this;
    }
    public String getEmptyDirDesc() {
        return this.emptyDirDesc;
    }

    public CreateApplicationRequest setEnableCpuBurst(Boolean enableCpuBurst) {
        this.enableCpuBurst = enableCpuBurst;
        return this;
    }
    public Boolean getEnableCpuBurst() {
        return this.enableCpuBurst;
    }

    public CreateApplicationRequest setEnableEbpf(String enableEbpf) {
        this.enableEbpf = enableEbpf;
        return this;
    }
    public String getEnableEbpf() {
        return this.enableEbpf;
    }

    public CreateApplicationRequest setEnableNamespaceAgentVersion(Boolean enableNamespaceAgentVersion) {
        this.enableNamespaceAgentVersion = enableNamespaceAgentVersion;
        return this;
    }
    public Boolean getEnableNamespaceAgentVersion() {
        return this.enableNamespaceAgentVersion;
    }

    public CreateApplicationRequest setEnableNamespaceSlsConfig(Boolean enableNamespaceSlsConfig) {
        this.enableNamespaceSlsConfig = enableNamespaceSlsConfig;
        return this;
    }
    public Boolean getEnableNamespaceSlsConfig() {
        return this.enableNamespaceSlsConfig;
    }

    public CreateApplicationRequest setEnableNewArms(Boolean enableNewArms) {
        this.enableNewArms = enableNewArms;
        return this;
    }
    public Boolean getEnableNewArms() {
        return this.enableNewArms;
    }

    public CreateApplicationRequest setEnablePrometheus(Boolean enablePrometheus) {
        this.enablePrometheus = enablePrometheus;
        return this;
    }
    public Boolean getEnablePrometheus() {
        return this.enablePrometheus;
    }

    public CreateApplicationRequest setEnableSidecarResourceIsolated(Boolean enableSidecarResourceIsolated) {
        this.enableSidecarResourceIsolated = enableSidecarResourceIsolated;
        return this;
    }
    public Boolean getEnableSidecarResourceIsolated() {
        return this.enableSidecarResourceIsolated;
    }

    public CreateApplicationRequest setEnvs(String envs) {
        this.envs = envs;
        return this;
    }
    public String getEnvs() {
        return this.envs;
    }

    public CreateApplicationRequest setGpuConfig(String gpuConfig) {
        this.gpuConfig = gpuConfig;
        return this;
    }
    public String getGpuConfig() {
        return this.gpuConfig;
    }

    public CreateApplicationRequest setHeadlessPvtzDiscoverySvc(String headlessPvtzDiscoverySvc) {
        this.headlessPvtzDiscoverySvc = headlessPvtzDiscoverySvc;
        return this;
    }
    public String getHeadlessPvtzDiscoverySvc() {
        return this.headlessPvtzDiscoverySvc;
    }

    public CreateApplicationRequest setHtml(String html) {
        this.html = html;
        return this;
    }
    public String getHtml() {
        return this.html;
    }

    public CreateApplicationRequest setImagePullSecrets(String imagePullSecrets) {
        this.imagePullSecrets = imagePullSecrets;
        return this;
    }
    public String getImagePullSecrets() {
        return this.imagePullSecrets;
    }

    public CreateApplicationRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public CreateApplicationRequest setInitContainersConfig(java.util.List<InitContainerConfig> initContainersConfig) {
        this.initContainersConfig = initContainersConfig;
        return this;
    }
    public java.util.List<InitContainerConfig> getInitContainersConfig() {
        return this.initContainersConfig;
    }

    public CreateApplicationRequest setIsStateful(Boolean isStateful) {
        this.isStateful = isStateful;
        return this;
    }
    public Boolean getIsStateful() {
        return this.isStateful;
    }

    public CreateApplicationRequest setJarStartArgs(String jarStartArgs) {
        this.jarStartArgs = jarStartArgs;
        return this;
    }
    public String getJarStartArgs() {
        return this.jarStartArgs;
    }

    public CreateApplicationRequest setJarStartOptions(String jarStartOptions) {
        this.jarStartOptions = jarStartOptions;
        return this;
    }
    public String getJarStartOptions() {
        return this.jarStartOptions;
    }

    public CreateApplicationRequest setJdk(String jdk) {
        this.jdk = jdk;
        return this;
    }
    public String getJdk() {
        return this.jdk;
    }

    public CreateApplicationRequest setKafkaConfigs(String kafkaConfigs) {
        this.kafkaConfigs = kafkaConfigs;
        return this;
    }
    public String getKafkaConfigs() {
        return this.kafkaConfigs;
    }

    public CreateApplicationRequest setLabels(java.util.Map<String, String> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.Map<String, String> getLabels() {
        return this.labels;
    }

    public CreateApplicationRequest setLiveness(String liveness) {
        this.liveness = liveness;
        return this;
    }
    public String getLiveness() {
        return this.liveness;
    }

    public CreateApplicationRequest setLokiConfigs(String lokiConfigs) {
        this.lokiConfigs = lokiConfigs;
        return this;
    }
    public String getLokiConfigs() {
        return this.lokiConfigs;
    }

    public CreateApplicationRequest setMemory(Integer memory) {
        this.memory = memory;
        return this;
    }
    public Integer getMemory() {
        return this.memory;
    }

    public CreateApplicationRequest setMicroRegistration(String microRegistration) {
        this.microRegistration = microRegistration;
        return this;
    }
    public String getMicroRegistration() {
        return this.microRegistration;
    }

    public CreateApplicationRequest setMicroRegistrationConfig(String microRegistrationConfig) {
        this.microRegistrationConfig = microRegistrationConfig;
        return this;
    }
    public String getMicroRegistrationConfig() {
        return this.microRegistrationConfig;
    }

    public CreateApplicationRequest setMicroserviceEngineConfig(String microserviceEngineConfig) {
        this.microserviceEngineConfig = microserviceEngineConfig;
        return this;
    }
    public String getMicroserviceEngineConfig() {
        return this.microserviceEngineConfig;
    }

    public CreateApplicationRequest setMountDesc(String mountDesc) {
        this.mountDesc = mountDesc;
        return this;
    }
    public String getMountDesc() {
        return this.mountDesc;
    }

    public CreateApplicationRequest setMountHost(String mountHost) {
        this.mountHost = mountHost;
        return this;
    }
    public String getMountHost() {
        return this.mountHost;
    }

    public CreateApplicationRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public CreateApplicationRequest setNasConfigs(String nasConfigs) {
        this.nasConfigs = nasConfigs;
        return this;
    }
    public String getNasConfigs() {
        return this.nasConfigs;
    }

    public CreateApplicationRequest setNasId(String nasId) {
        this.nasId = nasId;
        return this;
    }
    public String getNasId() {
        return this.nasId;
    }

    public CreateApplicationRequest setNewSaeVersion(String newSaeVersion) {
        this.newSaeVersion = newSaeVersion;
        return this;
    }
    public String getNewSaeVersion() {
        return this.newSaeVersion;
    }

    public CreateApplicationRequest setOidcRoleName(String oidcRoleName) {
        this.oidcRoleName = oidcRoleName;
        return this;
    }
    public String getOidcRoleName() {
        return this.oidcRoleName;
    }

    public CreateApplicationRequest setOssAkId(String ossAkId) {
        this.ossAkId = ossAkId;
        return this;
    }
    public String getOssAkId() {
        return this.ossAkId;
    }

    public CreateApplicationRequest setOssAkSecret(String ossAkSecret) {
        this.ossAkSecret = ossAkSecret;
        return this;
    }
    public String getOssAkSecret() {
        return this.ossAkSecret;
    }

    public CreateApplicationRequest setOssMountDescs(String ossMountDescs) {
        this.ossMountDescs = ossMountDescs;
        return this;
    }
    public String getOssMountDescs() {
        return this.ossMountDescs;
    }

    public CreateApplicationRequest setPackageType(String packageType) {
        this.packageType = packageType;
        return this;
    }
    public String getPackageType() {
        return this.packageType;
    }

    public CreateApplicationRequest setPackageUrl(String packageUrl) {
        this.packageUrl = packageUrl;
        return this;
    }
    public String getPackageUrl() {
        return this.packageUrl;
    }

    public CreateApplicationRequest setPackageVersion(String packageVersion) {
        this.packageVersion = packageVersion;
        return this;
    }
    public String getPackageVersion() {
        return this.packageVersion;
    }

    public CreateApplicationRequest setPhp(String php) {
        this.php = php;
        return this;
    }
    public String getPhp() {
        return this.php;
    }

    public CreateApplicationRequest setPhpArmsConfigLocation(String phpArmsConfigLocation) {
        this.phpArmsConfigLocation = phpArmsConfigLocation;
        return this;
    }
    public String getPhpArmsConfigLocation() {
        return this.phpArmsConfigLocation;
    }

    public CreateApplicationRequest setPhpConfig(String phpConfig) {
        this.phpConfig = phpConfig;
        return this;
    }
    public String getPhpConfig() {
        return this.phpConfig;
    }

    public CreateApplicationRequest setPhpConfigLocation(String phpConfigLocation) {
        this.phpConfigLocation = phpConfigLocation;
        return this;
    }
    public String getPhpConfigLocation() {
        return this.phpConfigLocation;
    }

    public CreateApplicationRequest setPostStart(String postStart) {
        this.postStart = postStart;
        return this;
    }
    public String getPostStart() {
        return this.postStart;
    }

    public CreateApplicationRequest setPreStop(String preStop) {
        this.preStop = preStop;
        return this;
    }
    public String getPreStop() {
        return this.preStop;
    }

    public CreateApplicationRequest setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
        return this;
    }
    public String getProgrammingLanguage() {
        return this.programmingLanguage;
    }

    public CreateApplicationRequest setPvtzDiscoverySvc(String pvtzDiscoverySvc) {
        this.pvtzDiscoverySvc = pvtzDiscoverySvc;
        return this;
    }
    public String getPvtzDiscoverySvc() {
        return this.pvtzDiscoverySvc;
    }

    public CreateApplicationRequest setPython(String python) {
        this.python = python;
        return this;
    }
    public String getPython() {
        return this.python;
    }

    public CreateApplicationRequest setPythonModules(String pythonModules) {
        this.pythonModules = pythonModules;
        return this;
    }
    public String getPythonModules() {
        return this.pythonModules;
    }

    public CreateApplicationRequest setRaspConfig(CreateApplicationRequestRaspConfig raspConfig) {
        this.raspConfig = raspConfig;
        return this;
    }
    public CreateApplicationRequestRaspConfig getRaspConfig() {
        return this.raspConfig;
    }

    public CreateApplicationRequest setReadiness(String readiness) {
        this.readiness = readiness;
        return this;
    }
    public String getReadiness() {
        return this.readiness;
    }

    public CreateApplicationRequest setReplicas(Integer replicas) {
        this.replicas = replicas;
        return this;
    }
    public Integer getReplicas() {
        return this.replicas;
    }

    public CreateApplicationRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public CreateApplicationRequest setSaeVersion(String saeVersion) {
        this.saeVersion = saeVersion;
        return this;
    }
    public String getSaeVersion() {
        return this.saeVersion;
    }

    public CreateApplicationRequest setSecretMountDesc(String secretMountDesc) {
        this.secretMountDesc = secretMountDesc;
        return this;
    }
    public String getSecretMountDesc() {
        return this.secretMountDesc;
    }

    public CreateApplicationRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public CreateApplicationRequest setServiceTags(String serviceTags) {
        this.serviceTags = serviceTags;
        return this;
    }
    public String getServiceTags() {
        return this.serviceTags;
    }

    public CreateApplicationRequest setSidecarContainersConfig(java.util.List<SidecarContainerConfig> sidecarContainersConfig) {
        this.sidecarContainersConfig = sidecarContainersConfig;
        return this;
    }
    public java.util.List<SidecarContainerConfig> getSidecarContainersConfig() {
        return this.sidecarContainersConfig;
    }

    public CreateApplicationRequest setSlsConfigs(String slsConfigs) {
        this.slsConfigs = slsConfigs;
        return this;
    }
    public String getSlsConfigs() {
        return this.slsConfigs;
    }

    public CreateApplicationRequest setSlsLogEnvTags(String slsLogEnvTags) {
        this.slsLogEnvTags = slsLogEnvTags;
        return this;
    }
    public String getSlsLogEnvTags() {
        return this.slsLogEnvTags;
    }

    public CreateApplicationRequest setStartupProbe(String startupProbe) {
        this.startupProbe = startupProbe;
        return this;
    }
    public String getStartupProbe() {
        return this.startupProbe;
    }

    public CreateApplicationRequest setTerminationGracePeriodSeconds(Integer terminationGracePeriodSeconds) {
        this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
        return this;
    }
    public Integer getTerminationGracePeriodSeconds() {
        return this.terminationGracePeriodSeconds;
    }

    public CreateApplicationRequest setTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }
    public String getTimezone() {
        return this.timezone;
    }

    public CreateApplicationRequest setTomcatConfig(String tomcatConfig) {
        this.tomcatConfig = tomcatConfig;
        return this;
    }
    public String getTomcatConfig() {
        return this.tomcatConfig;
    }

    public CreateApplicationRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateApplicationRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateApplicationRequest setWarStartOptions(String warStartOptions) {
        this.warStartOptions = warStartOptions;
        return this;
    }
    public String getWarStartOptions() {
        return this.warStartOptions;
    }

    public CreateApplicationRequest setWebContainer(String webContainer) {
        this.webContainer = webContainer;
        return this;
    }
    public String getWebContainer() {
        return this.webContainer;
    }

    public static class CreateApplicationRequestRaspConfig extends TeaModel {
        /**
         * <p>Specifies whether the application runtime security protection (RASP) is enabled.</p>
         */
        @NameInMap("EnableRasp")
        public Boolean enableRasp;

        /**
         * <p>The RASP application key.</p>
         * 
         * <strong>example:</strong>
         * <p>key-1</p>
         */
        @NameInMap("RaspAppKey")
        public String raspAppKey;

        /**
         * <p>The RASP application name.</p>
         * 
         * <strong>example:</strong>
         * <p>sae-test</p>
         */
        @NameInMap("RaspAppName")
        public String raspAppName;

        public static CreateApplicationRequestRaspConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateApplicationRequestRaspConfig self = new CreateApplicationRequestRaspConfig();
            return TeaModel.build(map, self);
        }

        public CreateApplicationRequestRaspConfig setEnableRasp(Boolean enableRasp) {
            this.enableRasp = enableRasp;
            return this;
        }
        public Boolean getEnableRasp() {
            return this.enableRasp;
        }

        public CreateApplicationRequestRaspConfig setRaspAppKey(String raspAppKey) {
            this.raspAppKey = raspAppKey;
            return this;
        }
        public String getRaspAppKey() {
            return this.raspAppKey;
        }

        public CreateApplicationRequestRaspConfig setRaspAppName(String raspAppName) {
            this.raspAppName = raspAppName;
            return this;
        }
        public String getRaspAppName() {
            return this.raspAppName;
        }

    }

}
