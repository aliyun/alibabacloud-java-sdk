// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class CreateApplicationShrinkRequest extends TeaModel {
    /**
     * <p>The ARN of the RAM role required for cross-account image pulling. For more information, see <a href="https://help.aliyun.com/document_detail/223585.html">Grant permissions across Alibaba Cloud accounts by using a RAM role</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::123456789012****:role/adminrole</p>
     */
    @NameInMap("AcrAssumeRoleArn")
    public String acrAssumeRoleArn;

    /**
     * <p>The instance ID of the Container Registry Enterprise instance. This parameter is required when <strong>ImageUrl</strong> is set to a Container Registry Enterprise Edition image.</p>
     * 
     * <strong>example:</strong>
     * <p>cri-xxxxxx</p>
     */
    @NameInMap("AcrInstanceId")
    public String acrInstanceId;

    /**
     * <p>The AliyunAgent version.</p>
     * 
     * <strong>example:</strong>
     * <p>4.4.2</p>
     */
    @NameInMap("AgentVersion")
    public String agentVersion;

    /**
     * <p>The application description. The description can be up to 1024 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a test description.</p>
     */
    @NameInMap("AppDescription")
    public String appDescription;

    /**
     * <p>The application name. The name can contain digits, letters, and hyphens (-). The name must start with a letter and cannot end with a hyphen (-). The name can be up to 36 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>Set this parameter to micro_service to create a microservice application.</p>
     * 
     * <strong>example:</strong>
     * <p>micro_service</p>
     */
    @NameInMap("AppSource")
    public String appSource;

    /**
     * <p>Specifies whether to associate an EIP. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: associate an EIP.</li>
     * <li><strong>false</strong>: do not associate an EIP.</li>
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
     * <p>If this parameter is set to <strong>true</strong>, any other <strong>NamespaceId</strong> value that is passed is ignored.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoConfig")
    public Boolean autoConfig;

    /**
     * <p>The base application ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ee99cce6-1c8e-4bfa-96c3-3e2fa9de8a41</p>
     */
    @NameInMap("BaseAppId")
    public String baseAppId;

    /**
     * <p>The command that is used to start the image. The command must be an executable object in the container. Example:</p>
     * <pre><code>command:
     *       - echo
     *       - abc
     *       - &gt;
     *       - file0
     * </code></pre>
     * <p>In the preceding example, <code>Command=&quot;echo&quot;, CommandArgs=[&quot;abc&quot;, &quot;&gt;&quot;, &quot;file0&quot;]</code>.</p>
     * <blockquote>
     * <p>Notice: This parameter is required when PackageType is set to DotnetZip.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>echo</p>
     */
    @NameInMap("Command")
    public String command;

    /**
     * <p>The arguments of the image startup command. These are the arguments required by the startup command specified in <strong>Command</strong>. Format:</p>
     * <p><code>[&quot;a&quot;,&quot;b&quot;]</code></p>
     * <p>In the preceding example, <code>CommandArgs=[&quot;abc&quot;, &quot;&gt;&quot;, &quot;file0&quot;]</code>, where <code>[&quot;abc&quot;, &quot;&gt;&quot;, &quot;file0&quot;]</code> must be converted to the String type. The internal format is a JSON array. If this parameter is not required, leave it empty.</p>
     * <blockquote>
     * <p>Notice: This parameter is required when PackageType is set to DotnetZip.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[&quot;a&quot;,&quot;b&quot;]</p>
     */
    @NameInMap("CommandArgs")
    public String commandArgs;

    /**
     * <p>The <strong>ConfigMap</strong> mount description. Use a ConfigMap created on the namespace configuration items page to inject configuration information into the container. Parameter description:</p>
     * <ul>
     * <li><strong>configMapId</strong>: the ConfigMap instance ID. You can obtain the ID by invoking the <a href="https://help.aliyun.com/document_detail/176917.html">ListNamespacedConfigMaps</a> operation.</li>
     * <li><strong>key</strong>: the key.</li>
     * </ul>
     * <blockquote>
     * <p>You can mount all keys by passing the <code>sae-sys-configmap-all</code> parameter.</p>
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
     * <p>The CPU specifications required for each instance, in millicores. This parameter cannot be set to 0. Only the following defined specifications are supported:</p>
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
     * <p>The custom image type. Set this parameter to an empty string if the image is not a custom image:</p>
     * <ul>
     * <li>internet: public image</li>
     * <li>intranet: private image</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>internet</p>
     */
    @NameInMap("CustomImageNetworkType")
    public String customImageNetworkType;

    /**
     * <p>Specifies whether to immediately deploy the application. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: default value. The application is deployed immediately.</li>
     * <li><strong>false</strong>: the application is deployed later.</li>
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
     * <p>The version of the .NET framework:</p>
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
     * <p>The version of the application runtime environment in the HSF framework, such as the Ali-Tomcat container.</p>
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
     * <li>true: Enabled.</li>
     * <li>false: Disabled.</li>
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
     * <li><strong>true</strong>: enabled.</li>
     * <li><strong>false</strong>: disabled. This is the default value.</li>
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
     * <p>Specifies whether to reuse the namespace SLS log configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableNamespaceSlsConfig")
    public Boolean enableNamespaceSlsConfig;

    /**
     * <p>Specifies whether to enable the new ARMS feature:</p>
     * <ul>
     * <li>true: Enabled.</li>
     * <li>false: Disabled.</li>
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
     * <li>true: Isolated.</li>
     * <li>false: Not isolated.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableSidecarResourceIsolated")
    public Boolean enableSidecarResourceIsolated;

    /**
     * <p>The container environment variable parameters. You can customize environment variables or reference a ConfigMap. To reference a ConfigMap, create a ConfigMap instance first. For more information, see <a href="https://help.aliyun.com/document_detail/176914.html">CreateConfigMap</a>. Valid values:</p>
     * <ul>
     * <li>Custom configuration<ul>
     * <li><strong>name</strong>: the name of the environment variable.</li>
     * <li><strong>value</strong>: the value of the environment variable. This takes priority over valueFrom.</li>
     * </ul>
     * </li>
     * <li>Reference a ConfigMap (valueFrom)<ul>
     * <li><strong>name</strong>: the name of the environment variable. You can reference a single key or all keys. To reference all keys, enter <code>sae-sys-configmap-all-&lt;ConfigMap name&gt;</code>, such as <code>sae-sys-configmap-all-test1</code>.</li>
     * <li><strong>valueFrom</strong>: the environment variable reference. Set the value to <code>configMapRef</code>.<ul>
     * <li><strong>configMapId</strong>: the ConfigMap ID.</li>
     * <li><strong>key</strong>: the key. If you reference all keys, do not set this field.</li>
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

    @NameInMap("GpuConfig")
    public String gpuConfig;

    /**
     * <p>The K8s Headless Service-based service registration and discovery.</p>
     * <ul>
     * <li>serviceName: the service name.</li>
     * <li>namespaceId: the namespace ID.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;serviceName\&quot;:\&quot;leaf-test-headless\&quot;,\&quot;namespaceId\&quot;:\&quot;cn-zhangjiakou:prod\&quot;}</p>
     */
    @NameInMap("HeadlessPvtzDiscoverySvc")
    public String headlessPvtzDiscoverySvc;

    /**
     * <p>The Nginx version.</p>
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
     * <p>The corresponding secret ID.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("ImagePullSecrets")
    public String imagePullSecrets;

    /**
     * <p>The image address. This parameter is required when <strong>Package Type</strong> is set to <strong>Image</strong>.</p>
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
    public String initContainersConfigShrink;

    /**
     * <p>Specifies whether the application is stateful.</p>
     */
    @NameInMap("IsStateful")
    public Boolean isStateful;

    /**
     * <p>The arguments for starting the JAR package application. The default startup command for the application: <code>$JAVA_HOME/bin/java $JarStartOptions -jar $CATALINA_OPTS &quot;$package_path&quot; $JarStartArgs</code></p>
     * 
     * <strong>example:</strong>
     * <p>custom-args</p>
     */
    @NameInMap("JarStartArgs")
    public String jarStartArgs;

    /**
     * <p>The options for starting the JAR package application. The default startup command for the application: <code>$JAVA_HOME/bin/java $JarStartOptions -jar $CATALINA_OPTS &quot;$package_path&quot; $JarStartArgs</code></p>
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
     * <p>This parameter is not supported when <strong>Package Type</strong> is set to <strong>Image</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>Open JDK 8</p>
     */
    @NameInMap("Jdk")
    public String jdk;

    /**
     * <p>The summary of configurations for log collection to Kafka. Valid values:</p>
     * <ul>
     * <li><strong>kafkaEndpoint</strong>: the service registration address of the Kafka API.</li>
     * <li><strong>kafkaInstanceId</strong>: the Kafka instance ID.</li>
     * <li><strong>kafkaConfigs</strong>: the summary of configurations for one or more log entries. For more information about the valid values, see the <strong>kafkaConfigs</strong> request parameter in this topic.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;kafkaEndpoint&quot;:&quot;10.0.X.XXX:XXXX,10.0.X.XXX:XXXX,10.0.X.XXX:XXXX&quot;,&quot;kafkaInstanceId&quot;:&quot;alikafka_pre-cn-7pp2l8kr****&quot;,&quot;kafkaConfigs&quot;:[{&quot;logType&quot;:&quot;file_log&quot;,&quot;logDir&quot;:&quot;/tmp/a.log&quot;,&quot;kafkaTopic&quot;:&quot;test2&quot;},{&quot;logType&quot;:&quot;stdout&quot;,&quot;logDir&quot;:&quot;&quot;,&quot;kafkaTopic&quot;:&quot;test&quot;}]}</p>
     */
    @NameInMap("KafkaConfigs")
    public String kafkaConfigs;

    @NameInMap("Labels")
    public String labelsShrink;

    /**
     * <p>The container health check. Containers that fail the health check are shutdown and recovered. The following methods are supported:</p>
     * <ul>
     * <li><strong>exec</strong>: for example, <code>{&quot;exec&quot;:{&quot;command&quot;:[&quot;sh&quot;,&quot;-c&quot;,&quot;cat/home/admin/start.sh&quot;]},&quot;initialDelaySeconds&quot;:30,&quot;periodSeconds&quot;:30,&quot;timeoutSeconds&quot;:2}</code></li>
     * <li><strong>httpGet</strong>: for example, <code>{&quot;httpGet&quot;:{&quot;path&quot;:&quot;/&quot;,&quot;port&quot;:18091,&quot;scheme&quot;:&quot;HTTP&quot;,&quot;isContainKeyWord&quot;:true,&quot;keyWord&quot;:&quot;SAE&quot;},&quot;initialDelaySeconds&quot;:11,&quot;periodSeconds&quot;:10,&quot;timeoutSeconds&quot;:1}</code></li>
     * <li><strong>tcpSocket</strong>: for example, <code>{&quot;tcpSocket&quot;:{&quot;port&quot;:18091},&quot;initialDelaySeconds&quot;:11,&quot;periodSeconds&quot;:10,&quot;timeoutSeconds&quot;:1}</code></li>
     * </ul>
     * <blockquote>
     * <p>You can use only one method for health checks.</p>
     * </blockquote>
     * <p>Parameter description:</p>
     * <ul>
     * <li><strong>exec.command</strong>: the health check command.</li>
     * <li><strong>httpGet.path</strong>: the access path.</li>
     * <li><strong>httpGet.scheme</strong>: <strong>HTTP</strong> or <strong>HTTPS</strong>.</li>
     * <li><strong>httpGet.isContainKeyWord</strong>: <strong>true</strong> indicates that the keyword is included. <strong>false</strong> indicates that the keyword is not included. If this field is missing, the advanced feature is not used.</li>
     * <li><strong>httpGet.keyWord</strong>: the custom keyword. The <strong>isContainKeyWord</strong> field must be present when this field is used.</li>
     * <li><strong>tcpSocket.port</strong>: the port for TCP connection detection.</li>
     * <li><strong>initialDelaySeconds</strong>: the health check delay detection time. Default value: 10. Unit: seconds.</li>
     * <li><strong>periodSeconds</strong>: the health check period. Default value: 30. Unit: seconds.</li>
     * <li><strong>timeoutSeconds</strong>: the health check timeout period. Default value: 1. Unit: seconds. If this parameter is set to 0 or is not set, the default timeout period is 1 second.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;exec&quot;:{&quot;command&quot;:[&quot;sh&quot;,&quot;-c&quot;,&quot;cat /home/admin/start.sh&quot;]},&quot;initialDelaySeconds&quot;:30,&quot;periodSeconds&quot;:30,&quot;timeoutSeconds&quot;:2}</p>
     */
    @NameInMap("Liveness")
    public String liveness;

    @NameInMap("LokiConfigs")
    public String lokiConfigs;

    /**
     * <p>The memory required for each instance, in MB. This parameter cannot be set to 0. The memory has a one-to-one mapping with CPU. Only the following defined specifications are supported:</p>
     * <ul>
     * <li><strong>1024</strong>: corresponds to 500 and 1000 millicores of CPU.</li>
     * <li><strong>2048</strong>: corresponds to 500, 1000, and 2000 millicores of CPU.</li>
     * <li><strong>4096</strong>: corresponds to 1000, 2000, and 4000 millicores of CPU.</li>
     * <li><strong>8192</strong>: corresponds to 2000, 4000, and 8000 millicores of CPU.</li>
     * <li><strong>12288</strong>: corresponds to 12000 millicores of CPU.</li>
     * <li><strong>16384</strong>: corresponds to 4000, 8000, and 16000 millicores of CPU.</li>
     * <li><strong>24576</strong>: corresponds to 12000 millicores of CPU.</li>
     * <li><strong>32768</strong>: corresponds to 16000 millicores of CPU.</li>
     * <li><strong>65536</strong>: corresponds to 8000, 16000, and 32000 millicores of CPU.</li>
     * <li><strong>131072</strong>: corresponds to 32000 millicores of CPU.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("Memory")
    public Integer memory;

    /**
     * <p>Specifies the Nacos registry. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: SAE built-in Nacos.</li>
     * <li><strong>1</strong>: self-managed Nacos.</li>
     * <li><strong>2</strong>: MSE commercial edition Nacos.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>&quot;0&quot;</p>
     */
    @NameInMap("MicroRegistration")
    public String microRegistration;

    /**
     * <p>The registry configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;instanceId\&quot;:\&quot;mse-cn-zvp2bh6h70r\&quot;,\&quot;namespace\&quot;:\&quot;4c0aa74f-57cb-423c-b6af-5d9f2d0e3dbd\&quot;}</p>
     */
    @NameInMap("MicroRegistrationConfig")
    public String microRegistrationConfig;

    /**
     * <p>Configures the microservice governance feature.</p>
     * <ul>
     * <li><p>Specifies whether to enable microservice governance (enable):</p>
     * <ul>
     * <li><p>true: Enabled.</p>
     * </li>
     * <li><p>false: Disabled.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p>Configures lossless online/offline (mseLosslessRule):</p>
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
     * <p>{&quot;enable&quot;: true,&quot;mseLosslessRule&quot;: {&quot;delayTime&quot;: 0,&quot;enable&quot;: false,&quot;notice&quot;: false,&quot;warmupTime&quot;: 120}}</p>
     */
    @NameInMap("MicroserviceEngineConfig")
    public String microserviceEngineConfig;

    /**
     * <p>We recommend that you do not set this parameter. Set <strong>NasConfigs</strong> instead. The NAS mount description. If the configuration does not change during deployment, you do not need to set this parameter (that is, the <strong>MountDesc</strong> field does not need to be included in the request). To clear the NAS configuration, set the value of this field to an empty string (that is, set the value of the <strong>MountDesc</strong> field to &quot;&quot; in the request).</p>
     * 
     * <strong>example:</strong>
     * <p>[{mountPath: &quot;/tmp&quot;, nasPath: &quot;/&quot;}]</p>
     */
    @NameInMap("MountDesc")
    public String mountDesc;

    /**
     * <p>We recommend that you do not set this parameter. Set <strong>NasConfigs</strong> instead. The mount target of the NAS file system in the VPC of the application. If the configuration does not change during deployment, you do not need to set this parameter (that is, the <strong>MountHost</strong> field does not need to be included in the request). To clear the NAS configuration, set the value of this field to an empty string (that is, set the value of the <strong>MountHost</strong> field to &quot;&quot; in the request).</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("MountHost")
    public String mountHost;

    /**
     * <p>The SAE namespace ID. Only namespaces whose names contain lowercase letters and hyphens (-) are supported. The name must start with a letter.
     * You can obtain namespaces by calling the <a href="https://help.aliyun.com/document_detail/126547.html">DescribeNamespaceList</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing:test</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    /**
     * <p>The NAS mount configuration. Valid values:</p>
     * <ul>
     * <li><strong>mountPath</strong>: the container mount path.</li>
     * <li><strong>readOnly</strong>: set to <strong>false</strong> to grant read and write permission.</li>
     * <li><strong>nasId</strong>: the NAS ID.</li>
     * <li><strong>mountDomain</strong>: the container mount target address. For more information, see <a href="https://help.aliyun.com/document_detail/62626.html">DescribeMountTargets</a>.</li>
     * <li><strong>nasPath</strong>: the NAS relative file directory.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;mountPath&quot;:&quot;/test1&quot;,&quot;readOnly&quot;:false,&quot;nasId&quot;:&quot;nasId1&quot;,&quot;mountDomain&quot;:&quot;nasId1.cn-shenzhen.nas.aliyuncs.com&quot;,&quot;nasPath&quot;:&quot;/test1&quot;},{&quot;nasId&quot;:&quot;nasId2&quot;,&quot;mountDomain&quot;:&quot;nasId2.cn-shenzhen.nas.aliyuncs.com&quot;,&quot;readOnly&quot;:false,&quot;nasPath&quot;:&quot;/test2&quot;,&quot;mountPath&quot;:&quot;/test2&quot;}]</p>
     */
    @NameInMap("NasConfigs")
    public String nasConfigs;

    /**
     * <p>We recommend that you do not set this parameter. Set <strong>NasConfigs</strong> instead. The ID of the mounted NAS file system. The NAS file system must be in the same region as the cluster. The NAS file system must have available mount target creation quota, or its mount target must already be on a vSwitch in the VPC. If this parameter is left empty and the <strong>mountDescs</strong> field exists, a NAS file system is automatically purchased and mounted to a vSwitch in the VPC.</p>
     * <p>If the configuration does not change during deployment, you do not need to set this parameter (that is, the <strong>NASId</strong> field does not need to be included in the request). To clear the NAS configuration, set the value of this field to an empty string (that is, set the value of the <strong>NASId</strong> field to &quot;&quot; in the request).</p>
     * 
     * <strong>example:</strong>
     * <p>KSAK****</p>
     */
    @NameInMap("NasId")
    public String nasId;

    /**
     * <p>The application version:</p>
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
     * <p>Specifies the RAM role for identity authentication.</p>
     * <blockquote>
     * <p>Create an OIDC identity provider and an identity provider role in the same region in advance. For more information, see &lt;props=&quot;china&quot;&gt;<a href="https://www.alibabacloud.com/help/en/ram/developer-reference/api-ims-2019-08-15-createoidcprovider">CreateOIDCProvider</a> and <a href="https://www.alibabacloud.com/help/en/ram/developer-reference/api-ims-2019-08-15-createsamlprovider">CreateSAMLProvider</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/ram/developer-reference/api-ims-2019-08-15-createoidcprovider">CreateOIDCProvider</a> and <a href="https://www.alibabacloud.com/help/zh/ram/developer-reference/api-ims-2019-08-15-createsamlprovider">CreateSAMLProvider</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>sae-test</p>
     */
    @NameInMap("OidcRoleName")
    public String oidcRoleName;

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
     * <p>The OSS mount description. Parameter description:</p>
     * <ul>
     * <li><strong>bucketName</strong>: the bucket name.</li>
     * <li><strong>bucketPath</strong>: the folder or object that you created in OSS. If the OSS mount folder does not exist, an exception is triggered.</li>
     * <li><strong>mountPath</strong>: the container path in SAE. If the path already exists, it is an overwrite relationship. If the path does not exist, it is created.</li>
     * <li><strong>readOnly</strong>: specifies whether the container path has read-only permission on the mounted folder resources. Valid values:<ul>
     * <li><strong>true</strong>: read-only permission.</li>
     * <li><strong>false</strong>: read and write permission.</li>
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
     * <p>The type of the application deployment package. Valid values:</p>
     * <ul>
     * <li><p>If you use Java for deployment, <strong>FatJar</strong>, <strong>War</strong>, and <strong>Image</strong> are supported.</p>
     * </li>
     * <li><p>If you use PHP for deployment, the following types are supported:</p>
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
     * <li><p>If you use Python for deployment, <strong>PythonZip</strong> and <strong>Image</strong> are supported.</p>
     * </li>
     * <li><p>If you use .NET Core for deployment, <strong>DotnetZip</strong> and <strong>Image</strong> are supported.</p>
     * <blockquote>
     * <p>When DotnetZip is selected, Dotnet specifies the version of the .NET Core runtime. .NET 3.1, .NET 5.0, .NET 6.0, .NET 7.0, and .NET 8.0 are supported. The Dotnet, Command, and CommandArgs parameters are required.</p>
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
     * <p>The address of the deployment package. This parameter is required when <strong>Package Type</strong> is set to <strong>FatJar</strong>, <strong>War</strong>, or <strong>PythonZip</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://myoss.oss-cn-****.aliyuncs.com/my-buc/2019-06-30/****.jar">http://myoss.oss-cn-****.aliyuncs.com/my-buc/2019-06-30/****.jar</a></p>
     */
    @NameInMap("PackageUrl")
    public String packageUrl;

    /**
     * <p>The version of the deployment package. This parameter is required when <strong>Package Type</strong> is set to <strong>FatJar</strong>, <strong>War</strong>, or <strong>PythonZip</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0.0</p>
     */
    @NameInMap("PackageVersion")
    public String packageVersion;

    /**
     * <p>The PHP version on which the deployment package depends. Not supported for images.</p>
     * 
     * <strong>example:</strong>
     * <p>PHP-FPM 7.0</p>
     */
    @NameInMap("Php")
    public String php;

    /**
     * <p>The mount path for PHP application monitoring. Make sure that the PHP server loads the configuration file from this path.
     * You do not need to manage the configuration content. SAE automatically renders the correct configuration file.</p>
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
     * <p>The mount path for the PHP application startup configuration. Make sure that the PHP server uses this configuration file to start.</p>
     * 
     * <strong>example:</strong>
     * <p>/usr/local/etc/php/php.ini</p>
     */
    @NameInMap("PhpConfigLocation")
    public String phpConfigLocation;

    /**
     * <p>The script that is run after the container is started. A script is triggered and run immediately after the container is created. Format: <code>{&quot;exec&quot;:{&quot;command&quot;:[&quot;cat&quot;,&quot;/etc/group&quot;]}}</code></p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;exec&quot;:{&quot;command&quot;:[&quot;cat&quot;,&quot;/etc/group&quot;]}}</p>
     */
    @NameInMap("PostStart")
    public String postStart;

    /**
     * <p>The script that is run before the container is stopped. A script is triggered and run before the container is deleted. Format: <code>{&quot;exec&quot;:{&quot;command&quot;:[&quot;cat&quot;,&quot;/etc/group&quot;]}}</code></p>
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
     * <p>Enables K8s Service-based service registration and discovery. Valid values:</p>
     * <ul>
     * <li><strong>serviceName</strong>: the service name. Format: <code>custom name-namespace ID</code>. The suffix <code>-namespace ID</code> cannot be customized and must be set based on the namespace of the application. For example, if you select the default namespace in the China (Beijing) region, the suffix is <code>-cn-beijing-default</code>.</li>
     * <li><strong>namespaceId</strong>: the namespace ID.</li>
     * <li><strong>portProtocols</strong>: the port and protocol. Valid port values: [1,65535]. Valid protocol values: <strong>TCP</strong> and <strong>UDP</strong>.</li>
     * <li><strong>portAndProtocol</strong>: the port and protocol. Valid port values: [1,65535]. Valid protocol values: <strong>TCP</strong> and <strong>UDP</strong>. <strong>portProtocols is recommended. If portProtocols is set, only portProtocols takes effect</strong>.</li>
     * <li><strong>enable</strong>: enables K8s Service-based service registration and discovery.</li>
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
     * <p>The custom installation module dependencies. By default, the dependencies defined in the requirements.txt file in the root folder are installed. If the file is not configured or you need custom packages, specify the dependencies to install.</p>
     * 
     * <strong>example:</strong>
     * <p>Flask==2.0</p>
     */
    @NameInMap("PythonModules")
    public String pythonModules;

    @NameInMap("RaspConfig")
    public String raspConfigShrink;

    /**
     * <p>The application startup status check. Containers that fail multiple health checks are shut down and restarted. Containers that do not pass the health check do not receive SLB traffic. The <strong>exec</strong>, <strong>httpGet</strong>, and <strong>tcpSocket</strong> methods are supported. For specific examples, see the <strong>Liveness</strong> parameter.</p>
     * <blockquote>
     * <p>You can use only one method for health checks.</p>
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
     * <p>The resource type. Valid values: NULL (default), default, and haiguang (Hygon server).</p>
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
     * <p>The <strong>Secret</strong> mount description. Use a secret created on the namespace secrets page to inject sensitive information into the container. Parameter description:</p>
     * <ul>
     * <li><strong>secretId</strong>: the secret instance ID. You can obtain the ID by calling the ListSecrets operation.</li>
     * <li><strong>key</strong>: the key.</li>
     * </ul>
     * <blockquote>
     * <p>You can mount all keys by passing the <code>sae-sys-secret-all</code> parameter.</p>
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
     * <p>The security group ID.</p>
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
     * <p>The sidecar container configuration.</p>
     */
    @NameInMap("SidecarContainersConfig")
    public String sidecarContainersConfigShrink;

    /**
     * <p>The configurations for log collection to Simple Log Service.</p>
     * <ul>
     * <li>Use SLS resources that are automatically created by SAE: <code>[{&quot;logDir&quot;:&quot;&quot;,&quot;logType&quot;:&quot;stdout&quot;},{&quot;logDir&quot;:&quot;/tmp/a.log&quot;}]</code>.</li>
     * <li>Use custom SLS resources: <code>[{&quot;projectName&quot;:&quot;test-sls&quot;,&quot;logType&quot;:&quot;stdout&quot;,&quot;logDir&quot;:&quot;&quot;,&quot;logstoreName&quot;:&quot;sae&quot;,&quot;logtailName&quot;:&quot;&quot;},{&quot;projectName&quot;:&quot;test&quot;,&quot;logDir&quot;:&quot;/tmp/a.log&quot;,&quot;logstoreName&quot;:&quot;sae&quot;,&quot;logtailName&quot;:&quot;&quot;}]</code>.</li>
     * </ul>
     * <p>Parameter description:</p>
     * <ul>
     * <li><strong>projectName</strong>: the Project name in Simple Log Service.  </li>
     * <li><strong>logDir</strong>: the log path.</li>
     * <li><strong>logType</strong>: the log type. <strong>stdout</strong> indicates container standard output logs. You can configure only one entry for this type. If this parameter is not set, file logs are collected.</li>
     * <li><strong>logstoreName</strong>: the Logstore name in Simple Log Service.</li>
     * <li><strong>logtailName</strong>: the Logtail name in Simple Log Service. If this parameter is not specified, a new Logtail is created.</li>
     * </ul>
     * <p>If the SLS collection configuration does not change during multiple deployments, you do not need to set this parameter (that is, the <strong>SlsConfigs</strong> field does not need to be included in the request). If you no longer need the SLS collection feature, set the value of this field to an empty string (that is, set the value of the <strong>SlsConfigs</strong> field to &quot;&quot; in the request).</p>
     * <blockquote>
     * <p>Projects that are automatically created with the application are deleted when the application is deleted. Therefore, do not select a project that is automatically created by SAE when you select an existing project.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;logDir&quot;:&quot;&quot;,&quot;logType&quot;:&quot;stdout&quot;},{&quot;logDir&quot;:&quot;/tmp/a.log&quot;}]</p>
     */
    @NameInMap("SlsConfigs")
    public String slsConfigs;

    /**
     * <p>sls log tags</p>
     */
    @NameInMap("SlsLogEnvTags")
    public String slsLogEnvTags;

    /**
     * <p>Enables the application startup probe.</p>
     * <ul>
     * <li>Check succeeded: indicates that the application started successfully. If you configured Liveness and Readiness checks, they are performed after the application starts successfully.</li>
     * <li>Check failed: indicates that the application failed to start. An exception is reported and the application is automatically restarted.<blockquote>
     * <ul>
     * <li>The exec, httpGet, and tcpSocket methods are supported. For specific examples, see the Liveness parameter.</li>
     * <li>You can use only one method for health checks.</li>
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
     * <p>The Tomcat configuration. Set this parameter to &quot;&quot; or &quot;{}&quot; to delete the configuration:</p>
     * <ul>
     * <li><strong>port</strong>: the port number. Valid values: 1024 to 65535. Ports less than 1024 require root permissions. Because the container is configured with admin permissions, specify a port greater than 1024. Default value: 8080.</li>
     * <li><strong>contextPath</strong>: the access path. Default value: root directory &quot;/&quot;.</li>
     * <li><strong>maxThreads</strong>: the maximum number of connections in the connection pool. Default value: 400.</li>
     * <li><strong>uriEncoding</strong>: the encoding format of Tomcat. Valid values: <strong>UTF-8</strong>, <strong>ISO-8859-1</strong>, <strong>GBK</strong>, and <strong>GB2312</strong>. Default value: <strong>ISO-8859-1</strong>.</li>
     * <li><strong>useBodyEncodingForUri</strong>: specifies whether to use <strong>BodyEncoding for URL</strong>. Default value: <strong>true</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;port&quot;:8080,&quot;contextPath&quot;:&quot;/&quot;,&quot;maxThreads&quot;:400,&quot;uriEncoding&quot;:&quot;ISO-8859-1&quot;,&quot;useBodyEncodingForUri&quot;:true}</p>
     */
    @NameInMap("TomcatConfig")
    public String tomcatConfig;

    /**
     * <p>The vSwitch where the elastic network interface controller (NIC) of the application instance resides. The vSwitch must be in the specified VPC. The vSwitch also has a binding relationship with the SAE namespace. If you leave this parameter empty, the vSwitch attached to the namespace is used by default.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp12mw1f8k3jgygk9****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The VPC that corresponds to the SAE namespace. In SAE, a namespace can correspond to only one VPC, and the mapping cannot be modified. The binding relationship is established when the first SAE application is created in the namespace. Multiple namespaces can correspond to the same VPC. If you leave this parameter empty, the VPC bound to the namespace is used by default.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1aevy8sofi8mh1q****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The startup command for deploying a WAR package application. The configuration procedure is the same as that for the startup command of an image deployment. For more information, see <a href="https://help.aliyun.com/document_detail/96677.html">Configure a startup command</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>CATALINA_OPTS=\&quot;$CATALINA_OPTS $Options\&quot; catalina.sh run</p>
     */
    @NameInMap("WarStartOptions")
    public String warStartOptions;

    /**
     * <p>The version of Tomcat on which the WebContainer deployment package depends. Valid values:</p>
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

    public static CreateApplicationShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicationShrinkRequest self = new CreateApplicationShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateApplicationShrinkRequest setAcrAssumeRoleArn(String acrAssumeRoleArn) {
        this.acrAssumeRoleArn = acrAssumeRoleArn;
        return this;
    }
    public String getAcrAssumeRoleArn() {
        return this.acrAssumeRoleArn;
    }

    public CreateApplicationShrinkRequest setAcrInstanceId(String acrInstanceId) {
        this.acrInstanceId = acrInstanceId;
        return this;
    }
    public String getAcrInstanceId() {
        return this.acrInstanceId;
    }

    public CreateApplicationShrinkRequest setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
        return this;
    }
    public String getAgentVersion() {
        return this.agentVersion;
    }

    public CreateApplicationShrinkRequest setAppDescription(String appDescription) {
        this.appDescription = appDescription;
        return this;
    }
    public String getAppDescription() {
        return this.appDescription;
    }

    public CreateApplicationShrinkRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateApplicationShrinkRequest setAppSource(String appSource) {
        this.appSource = appSource;
        return this;
    }
    public String getAppSource() {
        return this.appSource;
    }

    public CreateApplicationShrinkRequest setAssociateEip(Boolean associateEip) {
        this.associateEip = associateEip;
        return this;
    }
    public Boolean getAssociateEip() {
        return this.associateEip;
    }

    public CreateApplicationShrinkRequest setAutoConfig(Boolean autoConfig) {
        this.autoConfig = autoConfig;
        return this;
    }
    public Boolean getAutoConfig() {
        return this.autoConfig;
    }

    public CreateApplicationShrinkRequest setBaseAppId(String baseAppId) {
        this.baseAppId = baseAppId;
        return this;
    }
    public String getBaseAppId() {
        return this.baseAppId;
    }

    public CreateApplicationShrinkRequest setCommand(String command) {
        this.command = command;
        return this;
    }
    public String getCommand() {
        return this.command;
    }

    public CreateApplicationShrinkRequest setCommandArgs(String commandArgs) {
        this.commandArgs = commandArgs;
        return this;
    }
    public String getCommandArgs() {
        return this.commandArgs;
    }

    public CreateApplicationShrinkRequest setConfigMapMountDesc(String configMapMountDesc) {
        this.configMapMountDesc = configMapMountDesc;
        return this;
    }
    public String getConfigMapMountDesc() {
        return this.configMapMountDesc;
    }

    public CreateApplicationShrinkRequest setCpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }
    public Integer getCpu() {
        return this.cpu;
    }

    public CreateApplicationShrinkRequest setCustomHostAlias(String customHostAlias) {
        this.customHostAlias = customHostAlias;
        return this;
    }
    public String getCustomHostAlias() {
        return this.customHostAlias;
    }

    public CreateApplicationShrinkRequest setCustomImageNetworkType(String customImageNetworkType) {
        this.customImageNetworkType = customImageNetworkType;
        return this;
    }
    public String getCustomImageNetworkType() {
        return this.customImageNetworkType;
    }

    public CreateApplicationShrinkRequest setDeploy(Boolean deploy) {
        this.deploy = deploy;
        return this;
    }
    public Boolean getDeploy() {
        return this.deploy;
    }

    public CreateApplicationShrinkRequest setDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
        return this;
    }
    public Integer getDiskSize() {
        return this.diskSize;
    }

    public CreateApplicationShrinkRequest setDotnet(String dotnet) {
        this.dotnet = dotnet;
        return this;
    }
    public String getDotnet() {
        return this.dotnet;
    }

    public CreateApplicationShrinkRequest setEdasContainerVersion(String edasContainerVersion) {
        this.edasContainerVersion = edasContainerVersion;
        return this;
    }
    public String getEdasContainerVersion() {
        return this.edasContainerVersion;
    }

    public CreateApplicationShrinkRequest setEmptyDirDesc(String emptyDirDesc) {
        this.emptyDirDesc = emptyDirDesc;
        return this;
    }
    public String getEmptyDirDesc() {
        return this.emptyDirDesc;
    }

    public CreateApplicationShrinkRequest setEnableCpuBurst(Boolean enableCpuBurst) {
        this.enableCpuBurst = enableCpuBurst;
        return this;
    }
    public Boolean getEnableCpuBurst() {
        return this.enableCpuBurst;
    }

    public CreateApplicationShrinkRequest setEnableEbpf(String enableEbpf) {
        this.enableEbpf = enableEbpf;
        return this;
    }
    public String getEnableEbpf() {
        return this.enableEbpf;
    }

    public CreateApplicationShrinkRequest setEnableNamespaceAgentVersion(Boolean enableNamespaceAgentVersion) {
        this.enableNamespaceAgentVersion = enableNamespaceAgentVersion;
        return this;
    }
    public Boolean getEnableNamespaceAgentVersion() {
        return this.enableNamespaceAgentVersion;
    }

    public CreateApplicationShrinkRequest setEnableNamespaceSlsConfig(Boolean enableNamespaceSlsConfig) {
        this.enableNamespaceSlsConfig = enableNamespaceSlsConfig;
        return this;
    }
    public Boolean getEnableNamespaceSlsConfig() {
        return this.enableNamespaceSlsConfig;
    }

    public CreateApplicationShrinkRequest setEnableNewArms(Boolean enableNewArms) {
        this.enableNewArms = enableNewArms;
        return this;
    }
    public Boolean getEnableNewArms() {
        return this.enableNewArms;
    }

    public CreateApplicationShrinkRequest setEnablePrometheus(Boolean enablePrometheus) {
        this.enablePrometheus = enablePrometheus;
        return this;
    }
    public Boolean getEnablePrometheus() {
        return this.enablePrometheus;
    }

    public CreateApplicationShrinkRequest setEnableSidecarResourceIsolated(Boolean enableSidecarResourceIsolated) {
        this.enableSidecarResourceIsolated = enableSidecarResourceIsolated;
        return this;
    }
    public Boolean getEnableSidecarResourceIsolated() {
        return this.enableSidecarResourceIsolated;
    }

    public CreateApplicationShrinkRequest setEnvs(String envs) {
        this.envs = envs;
        return this;
    }
    public String getEnvs() {
        return this.envs;
    }

    public CreateApplicationShrinkRequest setGpuConfig(String gpuConfig) {
        this.gpuConfig = gpuConfig;
        return this;
    }
    public String getGpuConfig() {
        return this.gpuConfig;
    }

    public CreateApplicationShrinkRequest setHeadlessPvtzDiscoverySvc(String headlessPvtzDiscoverySvc) {
        this.headlessPvtzDiscoverySvc = headlessPvtzDiscoverySvc;
        return this;
    }
    public String getHeadlessPvtzDiscoverySvc() {
        return this.headlessPvtzDiscoverySvc;
    }

    public CreateApplicationShrinkRequest setHtml(String html) {
        this.html = html;
        return this;
    }
    public String getHtml() {
        return this.html;
    }

    public CreateApplicationShrinkRequest setImagePullSecrets(String imagePullSecrets) {
        this.imagePullSecrets = imagePullSecrets;
        return this;
    }
    public String getImagePullSecrets() {
        return this.imagePullSecrets;
    }

    public CreateApplicationShrinkRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public CreateApplicationShrinkRequest setInitContainersConfigShrink(String initContainersConfigShrink) {
        this.initContainersConfigShrink = initContainersConfigShrink;
        return this;
    }
    public String getInitContainersConfigShrink() {
        return this.initContainersConfigShrink;
    }

    public CreateApplicationShrinkRequest setIsStateful(Boolean isStateful) {
        this.isStateful = isStateful;
        return this;
    }
    public Boolean getIsStateful() {
        return this.isStateful;
    }

    public CreateApplicationShrinkRequest setJarStartArgs(String jarStartArgs) {
        this.jarStartArgs = jarStartArgs;
        return this;
    }
    public String getJarStartArgs() {
        return this.jarStartArgs;
    }

    public CreateApplicationShrinkRequest setJarStartOptions(String jarStartOptions) {
        this.jarStartOptions = jarStartOptions;
        return this;
    }
    public String getJarStartOptions() {
        return this.jarStartOptions;
    }

    public CreateApplicationShrinkRequest setJdk(String jdk) {
        this.jdk = jdk;
        return this;
    }
    public String getJdk() {
        return this.jdk;
    }

    public CreateApplicationShrinkRequest setKafkaConfigs(String kafkaConfigs) {
        this.kafkaConfigs = kafkaConfigs;
        return this;
    }
    public String getKafkaConfigs() {
        return this.kafkaConfigs;
    }

    public CreateApplicationShrinkRequest setLabelsShrink(String labelsShrink) {
        this.labelsShrink = labelsShrink;
        return this;
    }
    public String getLabelsShrink() {
        return this.labelsShrink;
    }

    public CreateApplicationShrinkRequest setLiveness(String liveness) {
        this.liveness = liveness;
        return this;
    }
    public String getLiveness() {
        return this.liveness;
    }

    public CreateApplicationShrinkRequest setLokiConfigs(String lokiConfigs) {
        this.lokiConfigs = lokiConfigs;
        return this;
    }
    public String getLokiConfigs() {
        return this.lokiConfigs;
    }

    public CreateApplicationShrinkRequest setMemory(Integer memory) {
        this.memory = memory;
        return this;
    }
    public Integer getMemory() {
        return this.memory;
    }

    public CreateApplicationShrinkRequest setMicroRegistration(String microRegistration) {
        this.microRegistration = microRegistration;
        return this;
    }
    public String getMicroRegistration() {
        return this.microRegistration;
    }

    public CreateApplicationShrinkRequest setMicroRegistrationConfig(String microRegistrationConfig) {
        this.microRegistrationConfig = microRegistrationConfig;
        return this;
    }
    public String getMicroRegistrationConfig() {
        return this.microRegistrationConfig;
    }

    public CreateApplicationShrinkRequest setMicroserviceEngineConfig(String microserviceEngineConfig) {
        this.microserviceEngineConfig = microserviceEngineConfig;
        return this;
    }
    public String getMicroserviceEngineConfig() {
        return this.microserviceEngineConfig;
    }

    public CreateApplicationShrinkRequest setMountDesc(String mountDesc) {
        this.mountDesc = mountDesc;
        return this;
    }
    public String getMountDesc() {
        return this.mountDesc;
    }

    public CreateApplicationShrinkRequest setMountHost(String mountHost) {
        this.mountHost = mountHost;
        return this;
    }
    public String getMountHost() {
        return this.mountHost;
    }

    public CreateApplicationShrinkRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public CreateApplicationShrinkRequest setNasConfigs(String nasConfigs) {
        this.nasConfigs = nasConfigs;
        return this;
    }
    public String getNasConfigs() {
        return this.nasConfigs;
    }

    public CreateApplicationShrinkRequest setNasId(String nasId) {
        this.nasId = nasId;
        return this;
    }
    public String getNasId() {
        return this.nasId;
    }

    public CreateApplicationShrinkRequest setNewSaeVersion(String newSaeVersion) {
        this.newSaeVersion = newSaeVersion;
        return this;
    }
    public String getNewSaeVersion() {
        return this.newSaeVersion;
    }

    public CreateApplicationShrinkRequest setOidcRoleName(String oidcRoleName) {
        this.oidcRoleName = oidcRoleName;
        return this;
    }
    public String getOidcRoleName() {
        return this.oidcRoleName;
    }

    public CreateApplicationShrinkRequest setOssAkId(String ossAkId) {
        this.ossAkId = ossAkId;
        return this;
    }
    public String getOssAkId() {
        return this.ossAkId;
    }

    public CreateApplicationShrinkRequest setOssAkSecret(String ossAkSecret) {
        this.ossAkSecret = ossAkSecret;
        return this;
    }
    public String getOssAkSecret() {
        return this.ossAkSecret;
    }

    public CreateApplicationShrinkRequest setOssMountDescs(String ossMountDescs) {
        this.ossMountDescs = ossMountDescs;
        return this;
    }
    public String getOssMountDescs() {
        return this.ossMountDescs;
    }

    public CreateApplicationShrinkRequest setPackageType(String packageType) {
        this.packageType = packageType;
        return this;
    }
    public String getPackageType() {
        return this.packageType;
    }

    public CreateApplicationShrinkRequest setPackageUrl(String packageUrl) {
        this.packageUrl = packageUrl;
        return this;
    }
    public String getPackageUrl() {
        return this.packageUrl;
    }

    public CreateApplicationShrinkRequest setPackageVersion(String packageVersion) {
        this.packageVersion = packageVersion;
        return this;
    }
    public String getPackageVersion() {
        return this.packageVersion;
    }

    public CreateApplicationShrinkRequest setPhp(String php) {
        this.php = php;
        return this;
    }
    public String getPhp() {
        return this.php;
    }

    public CreateApplicationShrinkRequest setPhpArmsConfigLocation(String phpArmsConfigLocation) {
        this.phpArmsConfigLocation = phpArmsConfigLocation;
        return this;
    }
    public String getPhpArmsConfigLocation() {
        return this.phpArmsConfigLocation;
    }

    public CreateApplicationShrinkRequest setPhpConfig(String phpConfig) {
        this.phpConfig = phpConfig;
        return this;
    }
    public String getPhpConfig() {
        return this.phpConfig;
    }

    public CreateApplicationShrinkRequest setPhpConfigLocation(String phpConfigLocation) {
        this.phpConfigLocation = phpConfigLocation;
        return this;
    }
    public String getPhpConfigLocation() {
        return this.phpConfigLocation;
    }

    public CreateApplicationShrinkRequest setPostStart(String postStart) {
        this.postStart = postStart;
        return this;
    }
    public String getPostStart() {
        return this.postStart;
    }

    public CreateApplicationShrinkRequest setPreStop(String preStop) {
        this.preStop = preStop;
        return this;
    }
    public String getPreStop() {
        return this.preStop;
    }

    public CreateApplicationShrinkRequest setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
        return this;
    }
    public String getProgrammingLanguage() {
        return this.programmingLanguage;
    }

    public CreateApplicationShrinkRequest setPvtzDiscoverySvc(String pvtzDiscoverySvc) {
        this.pvtzDiscoverySvc = pvtzDiscoverySvc;
        return this;
    }
    public String getPvtzDiscoverySvc() {
        return this.pvtzDiscoverySvc;
    }

    public CreateApplicationShrinkRequest setPython(String python) {
        this.python = python;
        return this;
    }
    public String getPython() {
        return this.python;
    }

    public CreateApplicationShrinkRequest setPythonModules(String pythonModules) {
        this.pythonModules = pythonModules;
        return this;
    }
    public String getPythonModules() {
        return this.pythonModules;
    }

    public CreateApplicationShrinkRequest setRaspConfigShrink(String raspConfigShrink) {
        this.raspConfigShrink = raspConfigShrink;
        return this;
    }
    public String getRaspConfigShrink() {
        return this.raspConfigShrink;
    }

    public CreateApplicationShrinkRequest setReadiness(String readiness) {
        this.readiness = readiness;
        return this;
    }
    public String getReadiness() {
        return this.readiness;
    }

    public CreateApplicationShrinkRequest setReplicas(Integer replicas) {
        this.replicas = replicas;
        return this;
    }
    public Integer getReplicas() {
        return this.replicas;
    }

    public CreateApplicationShrinkRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public CreateApplicationShrinkRequest setSaeVersion(String saeVersion) {
        this.saeVersion = saeVersion;
        return this;
    }
    public String getSaeVersion() {
        return this.saeVersion;
    }

    public CreateApplicationShrinkRequest setSecretMountDesc(String secretMountDesc) {
        this.secretMountDesc = secretMountDesc;
        return this;
    }
    public String getSecretMountDesc() {
        return this.secretMountDesc;
    }

    public CreateApplicationShrinkRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public CreateApplicationShrinkRequest setServiceTags(String serviceTags) {
        this.serviceTags = serviceTags;
        return this;
    }
    public String getServiceTags() {
        return this.serviceTags;
    }

    public CreateApplicationShrinkRequest setSidecarContainersConfigShrink(String sidecarContainersConfigShrink) {
        this.sidecarContainersConfigShrink = sidecarContainersConfigShrink;
        return this;
    }
    public String getSidecarContainersConfigShrink() {
        return this.sidecarContainersConfigShrink;
    }

    public CreateApplicationShrinkRequest setSlsConfigs(String slsConfigs) {
        this.slsConfigs = slsConfigs;
        return this;
    }
    public String getSlsConfigs() {
        return this.slsConfigs;
    }

    public CreateApplicationShrinkRequest setSlsLogEnvTags(String slsLogEnvTags) {
        this.slsLogEnvTags = slsLogEnvTags;
        return this;
    }
    public String getSlsLogEnvTags() {
        return this.slsLogEnvTags;
    }

    public CreateApplicationShrinkRequest setStartupProbe(String startupProbe) {
        this.startupProbe = startupProbe;
        return this;
    }
    public String getStartupProbe() {
        return this.startupProbe;
    }

    public CreateApplicationShrinkRequest setTerminationGracePeriodSeconds(Integer terminationGracePeriodSeconds) {
        this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
        return this;
    }
    public Integer getTerminationGracePeriodSeconds() {
        return this.terminationGracePeriodSeconds;
    }

    public CreateApplicationShrinkRequest setTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }
    public String getTimezone() {
        return this.timezone;
    }

    public CreateApplicationShrinkRequest setTomcatConfig(String tomcatConfig) {
        this.tomcatConfig = tomcatConfig;
        return this;
    }
    public String getTomcatConfig() {
        return this.tomcatConfig;
    }

    public CreateApplicationShrinkRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateApplicationShrinkRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateApplicationShrinkRequest setWarStartOptions(String warStartOptions) {
        this.warStartOptions = warStartOptions;
        return this;
    }
    public String getWarStartOptions() {
        return this.warStartOptions;
    }

    public CreateApplicationShrinkRequest setWebContainer(String webContainer) {
        this.webContainer = webContainer;
        return this;
    }
    public String getWebContainer() {
        return this.webContainer;
    }

}
