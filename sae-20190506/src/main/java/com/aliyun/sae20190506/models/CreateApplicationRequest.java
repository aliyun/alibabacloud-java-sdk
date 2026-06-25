// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class CreateApplicationRequest extends TeaModel {
    /**
     * <p>The ARN of the RAM role required to pull images across Alibaba Cloud accounts. For more information, see <a href="https://help.aliyun.com/document_detail/223585.html">Authorize cross-account access using a RAM role</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::123456789012****:role/adminrole</p>
     */
    @NameInMap("AcrAssumeRoleArn")
    public String acrAssumeRoleArn;

    /**
     * <p>The Container Registry Enterprise Edition (ACR Enterprise Edition) instance ID. This parameter is required when <strong>ImageUrl</strong> is a Container Registry Enterprise Edition image.</p>
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
     * <p>The application description. It cannot exceed 1024 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a test description.</p>
     */
    @NameInMap("AppDescription")
    public String appDescription;

    /**
     * <p>The application name. It can contain digits, letters, and hyphens (-). It must start with a letter and cannot end with a hyphen (-). The name cannot exceed 36 characters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>Select micro_service for a microservice application.</p>
     * 
     * <strong>example:</strong>
     * <p>micro_service</p>
     */
    @NameInMap("AppSource")
    public String appSource;

    /**
     * <p>Whether to bind an Elastic IP address (EIP). Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Bind.</p>
     * </li>
     * <li><p><strong>false</strong>: Do not bind.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AssociateEip")
    public Boolean associateEip;

    /**
     * <p>Whether to automatically configure the network environment. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: SAE automatically configures the network environment when creating an application. The values of <strong>NamespaceId</strong>, <strong>VpcId</strong>, <strong>vSwitchId</strong>, and <strong>SecurityGroupId</strong> are ignored.</p>
     * </li>
     * <li><p><strong>false</strong>: SAE manually configures the network environment when creating an application.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you select <strong>true</strong>, other <strong>NamespaceId</strong> values passed are ignored.</p>
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
     * <p>The image start command. This command must be an executable object that exists in the container. Example:</p>
     * <pre><code>command:
     *       - echo
     *       - abc
     *       - &gt;
     *       - file0
     * </code></pre>
     * <p>Based on the example, Command=&quot;echo&quot; and <code>CommandArgs=[&quot;abc&quot;, &quot;&gt;&quot;, &quot;file0&quot;]</code>.</p>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>This option is required when PackageType is DotnetZip.</p>
     * 
     * <strong>example:</strong>
     * <p>echo</p>
     */
    @NameInMap("Command")
    public String command;

    /**
     * <p>The image start command parameters. These are the parameters required by the <strong>Command</strong> parameter. Format:</p>
     * <p><code>[&quot;a&quot;,&quot;b&quot;]</code></p>
     * <p>In the example, <code>CommandArgs=[&quot;abc&quot;, &quot;&gt;&quot;, &quot;file0&quot;]</code>. Convert <code>[&quot;abc&quot;, &quot;&gt;&quot;, &quot;file0&quot;]</code> to a string type, with the format as a JSON array. If this parameter is not needed, do not specify it.</p>
     * <blockquote>
     * <p>Notice: This option is required when PackageType is DotnetZip.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[&quot;a&quot;,&quot;b&quot;]</p>
     */
    @NameInMap("CommandArgs")
    public String commandArgs;

    /**
     * <p>The <strong>ConfigMap</strong> mount description. Use configuration items created on the namespace configuration item page to inject configuration information into the container. Parameter description:</p>
     * <ul>
     * <li><p><strong>configMapId</strong>: The ConfigMap instance ID. Obtain it by calling the <a href="https://help.aliyun.com/document_detail/176917.html">ListNamespacedConfigMaps</a> API operation.</p>
     * </li>
     * <li><p><strong>key</strong>: The key value.</p>
     * </li>
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
     * <p>The CPU required for each instance, in millicores. It cannot be 0. Currently, only the following defined specifications are supported:</p>
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
     * <p>Custom Host mapping within the container. Valid values:</p>
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
     * <p>The custom image type. If it is not a custom image, set it to an empty string:</p>
     * <ul>
     * <li><p>internet: Public network image.</p>
     * </li>
     * <li><p>intranet: Private network image.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>internet</p>
     */
    @NameInMap("CustomImageNetworkType")
    public String customImageNetworkType;

    /**
     * <p>Whether to deploy immediately. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Default value. Deploy immediately.</p>
     * </li>
     * <li><p><strong>false</strong>: Deploy later.</p>
     * </li>
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
     * <p>.NET 3.1</p>
     */
    @NameInMap("Dotnet")
    public String dotnet;

    /**
     * <p>The application runtime environment version in the HSF framework, such as the Ali-Tomcat container.</p>
     * 
     * <strong>example:</strong>
     * <p>3.5.3</p>
     */
    @NameInMap("EdasContainerVersion")
    public String edasContainerVersion;

    /**
     * <p>Shared temporary storage configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;name\&quot;:\&quot;workdir\&quot;,\&quot;mountPath\&quot;:\&quot;/usr/local/tomcat/webapps\&quot;}]</p>
     */
    @NameInMap("EmptyDirDesc")
    public String emptyDirDesc;

    /**
     * <p>Whether to enable the CPU Burst feature:</p>
     * <ul>
     * <li><p>true: Enable.</p>
     * </li>
     * <li><p>false: Do not enable.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableCpuBurst")
    public Boolean enableCpuBurst;

    /**
     * <p>Enable application monitoring for non-Java applications based on eBPF technology. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Enable.</p>
     * </li>
     * <li><p><strong>false</strong>: Disable. Default value.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableEbpf")
    public String enableEbpf;

    /**
     * <p>Whether to reuse the namespace Agent version configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableNamespaceAgentVersion")
    public Boolean enableNamespaceAgentVersion;

    /**
     * <p>Whether to reuse the namespace SLS log configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableNamespaceSlsConfig")
    public Boolean enableNamespaceSlsConfig;

    /**
     * <p>Whether to enable new ARMS features:</p>
     * <ul>
     * <li><p>true: Enable.</p>
     * </li>
     * <li><p>false: Do not enable.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableNewArms")
    public Boolean enableNewArms;

    /**
     * <p>Whether to enable Prometheus custom metric collection.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnablePrometheus")
    public Boolean enablePrometheus;

    /**
     * <p>Whether to enable Sidecar resource isolation:</p>
     * <ul>
     * <li><p>true: Enable isolation.</p>
     * </li>
     * <li><p>false: Do not enable isolation.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableSidecarResourceIsolated")
    public Boolean enableSidecarResourceIsolated;

    /**
     * <p>Container environment variable parameters. Support custom configurations or referencing configuration items. To reference a configuration item, create a ConfigMap instance first. For more information, see <a href="https://help.aliyun.com/document_detail/176914.html">CreateConfigMap</a>. Valid values:</p>
     * <ul>
     * <li><p>Custom configuration</p>
     * <ul>
     * <li><p><strong>name</strong>: The environment variable name.</p>
     * </li>
     * <li><p><strong>value</strong>: The environment variable value. This has a higher priority than valueFrom.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p>Reference configuration item (valueFrom)</p>
     * <ul>
     * <li><p><strong>name</strong>: The environment variable name. You can reference a single key or all keys. To reference all keys, enter <code>sae-sys-configmap-all-&lt;configuration item name&gt;</code>, for example, <code>sae-sys-configmap-all-test1</code>.</p>
     * </li>
     * <li><p><strong>valueFrom</strong>: The environment variable reference. Set this to <code>configMapRef</code>.</p>
     * <ul>
     * <li><p><strong>configMapId</strong>: The configuration item ID.</p>
     * </li>
     * <li><p><strong>key</strong>: The key. If you reference all key-values, do not set this field.</p>
     * </li>
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
     * <p>K8s Headless Service service discovery.</p>
     * <ul>
     * <li><p>serviceName: The service name.</p>
     * </li>
     * <li><p>namespaceId: The namespace ID.</p>
     * </li>
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
     * <li><p>nginx 1.20</p>
     * </li>
     * <li><p>nginx 1.22</p>
     * </li>
     * <li><p>nginx 1.24</p>
     * </li>
     * <li><p>nginx 1.26</p>
     * </li>
     * <li><p>nginx 1.28</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>nginx 1.28</p>
     */
    @NameInMap("Html")
    public String html;

    /**
     * <p>The ID of the corresponding secret.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("ImagePullSecrets")
    public String imagePullSecrets;

    /**
     * <p>The image address. This parameter is required when <strong>Package Type</strong> is <strong>Image</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>registry.cn-hangzhou.aliyuncs.com/sae_test/ali_sae_test:0.0.1</p>
     */
    @NameInMap("ImageUrl")
    public String imageUrl;

    /**
     * <p>Initialization container configuration.</p>
     */
    @NameInMap("InitContainersConfig")
    public java.util.List<InitContainerConfig> initContainersConfig;

    /**
     * <p>Whether it is a stateful application.</p>
     */
    @NameInMap("IsStateful")
    public Boolean isStateful;

    /**
     * <p>JAR package startup parameters for the application. The application\&quot;s default start command is: <code>$JAVA_HOME/bin/java $JarStartOptions -jar $CATALINA_OPTS &quot;$package_path&quot; $JarStartArgs</code></p>
     * 
     * <strong>example:</strong>
     * <p>custom-args</p>
     */
    @NameInMap("JarStartArgs")
    public String jarStartArgs;

    /**
     * <p>JAR package startup options for the application. The application\&quot;s default start command is: <code>$JAVA_HOME/bin/java $JarStartOptions -jar $CATALINA_OPTS &quot;$package_path&quot; $JarStartArgs</code></p>
     * 
     * <strong>example:</strong>
     * <p>-Xms4G -Xmx4G</p>
     */
    @NameInMap("JarStartOptions")
    public String jarStartOptions;

    /**
     * <p>The JDK version that the deployment package depends on. Supported versions:</p>
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
     * <p>This parameter is not supported when <strong>Package Type</strong> is <strong>Image</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>Open JDK 8</p>
     */
    @NameInMap("Jdk")
    public String jdk;

    /**
     * <p>The summary configuration for collecting logs to Kafka. Valid values:</p>
     * <ul>
     * <li><p><strong>kafkaEndpoint</strong>: The service registration address for the Kafka API.</p>
     * </li>
     * <li><p><strong>kafkaInstanceId</strong>: The Kafka instance ID.</p>
     * </li>
     * <li><p><strong>kafkaConfigs</strong>: The summary configuration for single or multiple logs. For valid values, see the <strong>kafkaConfigs</strong> request parameter in this topic.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;kafkaEndpoint&quot;:&quot;10.0.X.XXX:XXXX,10.0.X.XXX:XXXX,10.0.X.XXX:XXXX&quot;,&quot;kafkaInstanceId&quot;:&quot;alikafka_pre-cn-7pp2l8kr****&quot;,&quot;kafkaConfigs&quot;:[{&quot;logType&quot;:&quot;file_log&quot;,&quot;logDir&quot;:&quot;/tmp/a.log&quot;,&quot;kafkaTopic&quot;:&quot;test2&quot;},{&quot;logType&quot;:&quot;stdout&quot;,&quot;logDir&quot;:&quot;&quot;,&quot;kafkaTopic&quot;:&quot;test&quot;}]}</p>
     */
    @NameInMap("KafkaConfigs")
    public String kafkaConfigs;

    @NameInMap("Labels")
    public java.util.Map<String, String> labels;

    /**
     * <p>Container health check. Containers that fail the health check are shut down and recovered. Supported methods:</p>
     * <ul>
     * <li><p><strong>exec</strong>: For example, <code>{&quot;exec&quot;:{&quot;command&quot;:[&quot;sh&quot;,&quot;-c&quot;,&quot;cat/home/admin/start.sh&quot;]},&quot;initialDelaySeconds&quot;:30,&quot;periodSeconds&quot;:30,&quot;timeoutSeconds&quot;:2}</code></p>
     * </li>
     * <li><p><strong>httpGet</strong>: For example, <code>{&quot;httpGet&quot;:{&quot;path&quot;:&quot;/&quot;,&quot;port&quot;:18091,&quot;scheme&quot;:&quot;HTTP&quot;,&quot;isContainKeyWord&quot;:true,&quot;keyWord&quot;:&quot;SAE&quot;},&quot;initialDelaySeconds&quot;:11,&quot;periodSeconds&quot;:10,&quot;timeoutSeconds&quot;:1}</code></p>
     * </li>
     * <li><p><strong>tcpSocket</strong>: For example, <code>{&quot;tcpSocket&quot;:{&quot;port&quot;:18091},&quot;initialDelaySeconds&quot;:11,&quot;periodSeconds&quot;:10,&quot;timeoutSeconds&quot;:1}</code></p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Select only one method for the health check.</p>
     * </blockquote>
     * <p>Parameter description:</p>
     * <ul>
     * <li><p><strong>exec.command</strong>: Set the health check command.</p>
     * </li>
     * <li><p><strong>httpGet.path</strong>: The access path.</p>
     * </li>
     * <li><p><strong>httpGet.scheme</strong>: <strong>HTTP</strong> or <strong>HTTPS</strong>.</p>
     * </li>
     * <li><p><strong>httpGet.isContainKeyWord</strong>: <strong>true</strong> means the keyword is included, <strong>false</strong> means the keyword is not included. If this field is missing, advanced features are not used.</p>
     * </li>
     * <li><p><strong>httpGet.keyWord</strong>: The custom keyword. Do not omit the <strong>isContainKeyWord</strong> field when using it.</p>
     * </li>
     * <li><p><strong>tcpSocket.port</strong>: The port for TCP connection detection.</p>
     * </li>
     * <li><p><strong>initialDelaySeconds</strong>: Set the health check delay detection time. Default is 10 seconds.</p>
     * </li>
     * <li><p><strong>periodSeconds</strong>: Set the health check period. Default is 30 seconds.</p>
     * </li>
     * <li><p><strong>timeoutSeconds</strong>: Set the health check timeout duration. Default is 1 second. If you set it to 0 or do not set it, the default timeout is 1 second.</p>
     * </li>
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
     * <p>The memory required for each instance, in MB. It cannot be 0. It has a one-to-one correspondence with CPU. Currently, only the following defined specifications are supported:</p>
     * <ul>
     * <li><p><strong>1024</strong>: Corresponds to 500 millicores and 1000 millicores CPU.</p>
     * </li>
     * <li><p><strong>2048</strong>: Corresponds to 500, 1000 millicores, and 2000 millicores CPU.</p>
     * </li>
     * <li><p><strong>4096</strong>: Corresponds to 1000, 2000 millicores, and 4000 millicores CPU.</p>
     * </li>
     * <li><p><strong>8192</strong>: Corresponds to 2000, 4000 millicores, and 8000 millicores CPU.</p>
     * </li>
     * <li><p><strong>12288</strong>: Corresponds to 12000 millicores CPU.</p>
     * </li>
     * <li><p><strong>16384</strong>: Corresponds to 4000, 8000 millicores, and 16000 millicores CPU.</p>
     * </li>
     * <li><p><strong>24576</strong>: Corresponds to 12000 millicores CPU.</p>
     * </li>
     * <li><p><strong>32768</strong>: Corresponds to 16000 millicores CPU.</p>
     * </li>
     * <li><p><strong>65536</strong>: Corresponds to 8000, 16000, and 32000 millicores CPU.</p>
     * </li>
     * <li><p><strong>131072</strong>: Corresponds to 32000 millicores CPU.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("Memory")
    public Integer memory;

    /**
     * <p>Select the Nacos registry. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong>: SAE built-in Nacos.</p>
     * </li>
     * <li><p><strong>1</strong>: User-managed Nacos.</p>
     * </li>
     * <li><p><strong>2</strong>: MSE Professional Edition Nacos.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>&quot;0&quot;</p>
     */
    @NameInMap("MicroRegistration")
    public String microRegistration;

    /**
     * <p>The registry configuration information.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;instanceId\&quot;:\&quot;mse-cn-zvp2bh6h70r\&quot;,\&quot;namespace\&quot;:\&quot;4c0aa74f-57cb-423c-b6af-5d9f2d0e3dbd\&quot;}</p>
     */
    @NameInMap("MicroRegistrationConfig")
    public String microRegistrationConfig;

    /**
     * <p>Configure microservice administration features.</p>
     * <ul>
     * <li><p>Whether to enable microservice administration (enable):</p>
     * <ul>
     * <li><p>true: Enable.</p>
     * </li>
     * <li><p>false: Do not enable.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p>Configure graceful start and graceful shutdown (mseLosslessRule):</p>
     * <ul>
     * <li><p>delayTime: The delay time.</p>
     * </li>
     * <li><p>enable: Whether to enable the graceful start feature. true means enabled, false means not enabled.</p>
     * </li>
     * <li><p>notice: Whether to enable the notification feature. true means enabled, false means enabled.</p>
     * </li>
     * <li><p>warmupTime: The duration of traffic prefetch, in seconds.</p>
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
     * <p>Do not configure this field; configure <strong>NasConfigs</strong> instead. The NAS mount description. If the configuration has not changed during deployment, you do not need to set this parameter (that is, the request does not need to include the <strong>MountDesc</strong> field). To clear the NAS configuration, set the value of this field to an empty string in the request (that is, the value of the <strong>MountDesc</strong> field in the request is &quot;&quot;).</p>
     * 
     * <strong>example:</strong>
     * <p>[{mountPath: &quot;/tmp&quot;, nasPath: &quot;/&quot;}]</p>
     */
    @NameInMap("MountDesc")
    public String mountDesc;

    /**
     * <p>Do not configure this field; configure <strong>NasConfigs</strong> instead. The NAS mount target within the application VPC. If the configuration has not changed during deployment, you do not need to set this parameter (that is, the request does not need to include the <strong>MountHost</strong> field). To clear the NAS configuration, set the value of this field to an empty string in the request (that is, the value of the <strong>MountHost</strong> field in the request is &quot;&quot;).</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("MountHost")
    public String mountHost;

    /**
     * <p>The SAE namespace ID. Only namespaces with names consisting of lowercase letters and hyphens (-) are supported. The name must start with a letter. Obtain the namespace by calling the <a href="https://help.aliyun.com/document_detail/126547.html">DescribeNamespaceList</a> API operation.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing:test</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    /**
     * <p>The configuration for mounting NAS. Valid values:</p>
     * <ul>
     * <li><p><strong>mountPath</strong>: The container mount path.</p>
     * </li>
     * <li><p><strong>readOnly</strong>: If the value is <strong>false</strong>, it indicates read and write permission.</p>
     * </li>
     * <li><p><strong>nasId</strong>: The NAS ID.</p>
     * </li>
     * <li><p><strong>mountDomain</strong>: The container mount target address. For more information, see <a href="https://help.aliyun.com/document_detail/62626.html">DescribeMountTargets</a>.</p>
     * </li>
     * <li><p><strong>nasPath</strong>: The relative file directory of NAS.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;mountPath&quot;:&quot;/test1&quot;,&quot;readOnly&quot;:false,&quot;nasId&quot;:&quot;nasId1&quot;,&quot;mountDomain&quot;:&quot;nasId1.cn-shenzhen.nas.aliyuncs.com&quot;,&quot;nasPath&quot;:&quot;/test1&quot;},{&quot;nasId&quot;:&quot;nasId2&quot;,&quot;mountDomain&quot;:&quot;nasId2.cn-shenzhen.nas.aliyuncs.com&quot;,&quot;readOnly&quot;:false,&quot;nasPath&quot;:&quot;/test2&quot;,&quot;mountPath&quot;:&quot;/test2&quot;}]</p>
     */
    @NameInMap("NasConfigs")
    public String nasConfigs;

    /**
     * <p>Do not configure this field; configure <strong>NasConfigs</strong> instead. The ID of the mounted NAS. It must be in the same region as the cluster. It must have available mount target creation quotas, or its mount target must already be on a vSwitch within the VPC. If you do not specify this parameter and the <strong>mountDescs</strong> field exists, the system automatically purchases a NAS and mounts it to a vSwitch within the VPC by default.</p>
     * <p>If the configuration has not changed during deployment, you do not need to set this parameter (that is, the request does not need to include the <strong>NASId</strong> field). To clear the NAS configuration, set the value of this field to an empty string in the request (that is, the value of the <strong>NASId</strong> field in the request is &quot;&quot;).</p>
     * 
     * <strong>example:</strong>
     * <p>KSAK****</p>
     */
    @NameInMap("NasId")
    public String nasId;

    /**
     * <p>The application version:</p>
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
     * <p>Set the identity authentication service RAM role.</p>
     * <blockquote>
     * <p>Create an OpenID Connect (OIDC) identity provider and an identity provider role in the same region beforehand. For more information, see&lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/ram/developer-reference/api-ims-2019-08-15-createoidcprovider?spm=a2c4g.11186623.help-menu-28625.d_4_1_0_3_2_7.7f0443efmdpxa3">Create an OIDC identity provider</a> and<a href="https://help.aliyun.com/zh/ram/developer-reference/api-ims-2019-08-15-createsamlprovider?spm=a2c4g.11186623.help-menu-28625.d_4_1_0_3_2_2.632244b1s8QbQt">Create a role SSO identity provider</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/ram/developer-reference/api-ims-2019-08-15-createoidcprovider">Create an OIDC identity provider</a> and<a href="https://www.alibabacloud.com/help/zh/ram/developer-reference/api-ims-2019-08-15-createsamlprovider">Create a role SSO identity provider</a>.</p>
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
     * <p>OSS mount description. Parameter description:</p>
     * <ul>
     * <li><p><strong>bucketName</strong>: The Bucket name.</p>
     * </li>
     * <li><p><strong>bucketPath</strong>: The directory or OSS object you created in OSS. If the OSS mount directory does not exist, an exception is triggered.</p>
     * </li>
     * <li><p><strong>mountPath</strong>: The container path in SAE. If the path exists, it is overwritten. If the path does not exist, it is created.</p>
     * </li>
     * <li><p><strong>readOnly</strong>: Whether the container path has read permission for the mounted directory resource. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Read-only permission.</p>
     * </li>
     * <li><p><strong>false</strong>: Read and write permission.</p>
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
     * <p>The application package type. Valid values:</p>
     * <ul>
     * <li><p>If you deploy with Java, supported types are <strong>FatJar</strong>, <strong>War</strong>, and <strong>Image</strong>.</p>
     * </li>
     * <li><p>If you deploy with PHP, supported types are:</p>
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
     * <li><p>If you deploy with Python, supported types are <strong>PythonZip</strong> and <strong>Image</strong>.</p>
     * </li>
     * <li><p>If you deploy with .NET Core, supported types are <strong>DotnetZip</strong> and <strong>Image</strong>.</p>
     * <blockquote>
     * <p>When you select DotnetZip, Dotnet is the version number of the .NET Core environment. Supported versions are .NET 3.1, .NET 5.0, .NET 6.0, .NET 7.0, and .NET 8.0. The Dotnet, Command, and CommandArgs options are required.</p>
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
     * <p>The URL of the deployment package. This parameter is required when <strong>Package Type</strong> is <strong>FatJar</strong>, <strong>War</strong>, or <strong>PythonZip</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://myoss.oss-cn-****.aliyuncs.com/my-buc/2019-06-30/****.jar">http://myoss.oss-cn-****.aliyuncs.com/my-buc/2019-06-30/****.jar</a></p>
     */
    @NameInMap("PackageUrl")
    public String packageUrl;

    /**
     * <p>The version number of the deployment package. This parameter is required when <strong>Package Type</strong> is <strong>FatJar</strong>, <strong>War</strong>, or <strong>PythonZip</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0.0</p>
     */
    @NameInMap("PackageVersion")
    public String packageVersion;

    /**
     * <p>The PHP version that the PHP deployment package depends on. Images do not support this.</p>
     * 
     * <strong>example:</strong>
     * <p>PHP-FPM 7.0</p>
     */
    @NameInMap("Php")
    public String php;

    /**
     * <p>The mount path for PHP application monitoring. Ensure that the PHP server loads the configuration file from this path. You do not need to focus on the configuration content; SAE automatically renders the correct configuration file.</p>
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
     * <p>The mount path for PHP application startup configuration. Ensure that the PHP server uses this configuration file to start.</p>
     * 
     * <strong>example:</strong>
     * <p>/usr/local/etc/php/php.ini</p>
     */
    @NameInMap("PhpConfigLocation")
    public String phpConfigLocation;

    /**
     * <p>The script to execute after the container starts. A script is triggered immediately after the container is created. Format: <code>{&quot;exec&quot;:{&quot;command&quot;:[&quot;cat&quot;,&quot;/etc/group&quot;]}}</code></p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;exec&quot;:{&quot;command&quot;:[&quot;cat&quot;,&quot;/etc/group&quot;]}}</p>
     */
    @NameInMap("PostStart")
    public String postStart;

    /**
     * <p>The script to execute before the container stops. A script is triggered before the container is deleted. Format: <code>{&quot;exec&quot;:{&quot;command&quot;:[&quot;cat&quot;,&quot;/etc/group&quot;]}}</code></p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;exec&quot;:{&quot;command&quot;:[&quot;cat&quot;,&quot;/etc/group&quot;]}}</p>
     */
    @NameInMap("PreStop")
    public String preStop;

    /**
     * <p>The technology stack language for creating the application. Valid values:</p>
     * <ul>
     * <li><p><strong>java</strong>: Java language.</p>
     * </li>
     * <li><p><strong>php</strong>: PHP language.</p>
     * </li>
     * <li><p><strong>python</strong>: Python language.</p>
     * </li>
     * <li><p><strong>dotnet</strong>: .NET Core language.</p>
     * </li>
     * <li><p><strong>other</strong>: Multi-language, such as C++, Go, and Node.js.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>java</p>
     */
    @NameInMap("ProgrammingLanguage")
    public String programmingLanguage;

    /**
     * <p>Enable K8s Service service discovery. Valid values:</p>
     * <ul>
     * <li><p><strong>serviceName</strong>: The service name. Format: <code>custom-namespace ID</code>. The suffix <code>-namespace ID</code> cannot be customized; specify it based on the application\&quot;s namespace. For example, if you select the default namespace in the China (Beijing) region, it is <code>-cn-beijing-default</code>.</p>
     * </li>
     * <li><p><strong>namespaceId</strong>: The namespace ID.</p>
     * </li>
     * <li><p><strong>portProtocols</strong>: The port and protocol. The port range is [1, 65535]. Supported protocols are <strong>TCP</strong> and <strong>UDP</strong>.</p>
     * </li>
     * <li><p>portAndProtocol: The port and protocol. The port range is [1, 65535]. Supported protocols are TCP and <strong>UDP</strong>. <strong>portProtocols</strong> is recommended. If <strong>portProtocols</strong> is set, only <strong>portProtocols</strong> takes effect.</p>
     * </li>
     * <li><p><strong>enable</strong>: Enable K8s Service service discovery.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;serviceName&quot;:&quot;bwm-poc-sc-gateway-cn-beijing-front&quot;,&quot;namespaceId&quot;:&quot;cn-beijing:front&quot;,&quot;portAndProtocol&quot;:{&quot;18012&quot;:&quot;TCP&quot;},&quot;enable&quot;:true,&quot;portProtocols&quot;:[{&quot;port&quot;:18012,&quot;protocol&quot;:&quot;TCP&quot;}]}</p>
     */
    @NameInMap("PvtzDiscoverySvc")
    public String pvtzDiscoverySvc;

    /**
     * <p>The Python environment. Supports <strong>PYTHON 3.9.15</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>PYTHON 3.9.15</p>
     */
    @NameInMap("Python")
    public String python;

    /**
     * <p>Custom installation of module dependencies. By default, the system installs dependencies defined in requirements.txt in the root directory. If you do not configure or customize packages, you can specify the dependencies to install.</p>
     * 
     * <strong>example:</strong>
     * <p>Flask==2.0</p>
     */
    @NameInMap("PythonModules")
    public String pythonModules;

    /**
     * <p>Application startup status check. Containers that fail multiple health checks are shut down and restarted. Containers that do not pass the health check will not receive SLB traffic. Supported methods are <strong>exec</strong>, <strong>httpGet</strong>, and <strong>tcpSocket</strong>. For examples, see the <strong>Liveness</strong> parameter.</p>
     * <blockquote>
     * <p>Select only one method for the health check.</p>
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
     * <p>The resource type. Supports NULL (default), default, and haiguang (Haiguang server) types.</p>
     * 
     * <strong>example:</strong>
     * <p>NULL</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The SAE version. Supported versions:</p>
     * <ul>
     * <li><p><strong>v1</strong></p>
     * </li>
     * <li><p><strong>v2</strong></p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>v1</p>
     */
    @NameInMap("SaeVersion")
    public String saeVersion;

    /**
     * <p>The <strong>Secret</strong> mount description. Use secrets created on the namespace secret page to inject secret information into the container. Parameter description:</p>
     * <ul>
     * <li><p><strong>secretId</strong>: The secret instance ID. Obtain it by calling the ListSecrets API operation.</p>
     * </li>
     * <li><p><strong>key</strong>: The key value.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>You can mount all keys by passing the <code>sae-sys-secret-all</code> parameter.</p>
     * </blockquote>
     * <ul>
     * <li><strong>mountPath</strong>: The mount path.</li>
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
     * <p>The grayscale tags for application configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;alicloud.service.tag\&quot;:\&quot;g1\&quot;}</p>
     */
    @NameInMap("ServiceTags")
    public String serviceTags;

    /**
     * <p>Container configuration information.</p>
     */
    @NameInMap("SidecarContainersConfig")
    public java.util.List<SidecarContainerConfig> sidecarContainersConfig;

    /**
     * <p>The configuration for collecting logs to Simple Log Service (SLS).</p>
     * <ul>
     * <li><p>Use SLS resources automatically created by SAE: <code>[{&quot;logDir&quot;:&quot;&quot;,&quot;logType&quot;:&quot;stdout&quot;},{&quot;logDir&quot;:&quot;/tmp/a.log&quot;}]</code>.</p>
     * </li>
     * <li><p>Use custom SLS resources: <code>[{&quot;projectName&quot;:&quot;test-sls&quot;,&quot;logType&quot;:&quot;stdout&quot;,&quot;logDir&quot;:&quot;&quot;,&quot;logstoreName&quot;:&quot;sae&quot;,&quot;logtailName&quot;:&quot;&quot;},{&quot;projectName&quot;:&quot;test&quot;,&quot;logDir&quot;:&quot;/tmp/a.log&quot;,&quot;logstoreName&quot;:&quot;sae&quot;,&quot;logtailName&quot;:&quot;&quot;}]</code>.</p>
     * </li>
     * </ul>
     * <p>Parameter description:</p>
     * <ul>
     * <li><p><strong>projectName</strong>: The name of the Project on SLS.</p>
     * </li>
     * <li><p><strong>logDir</strong>: The log path.</p>
     * </li>
     * <li><p><strong>logType</strong>: The log type. <strong>stdout</strong> indicates container standard output logs; you can set only one such entry. If you do not set this, the system collects file logs.</p>
     * </li>
     * <li><p><strong>logstoreName</strong>: The name of the Logstore on SLS.</p>
     * </li>
     * <li><p><strong>logtailName</strong>: The name of the Logtail on SLS. If you do not specify this, the system creates a new Logtail.</p>
     * </li>
     * </ul>
     * <p>If the SLS collection configuration has not changed during multiple deployments, you do not need to set this parameter (that is, the request does not need to include the <strong>SlsConfigs</strong> field). If you no longer need the SLS collection feature, set the value of this field to an empty string in the request (that is, the value of the <strong>SlsConfigs</strong> field in the request is &quot;&quot;).</p>
     * <blockquote>
     * <p>Projects automatically created with an application are deleted when the application is deleted. Therefore, when selecting an existing Project, do not select a Project automatically created by SAE.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;logDir&quot;:&quot;&quot;,&quot;logType&quot;:&quot;stdout&quot;},{&quot;logDir&quot;:&quot;/tmp/a.log&quot;}]</p>
     */
    @NameInMap("SlsConfigs")
    public String slsConfigs;

    /**
     * <p>SLS log tags.</p>
     */
    @NameInMap("SlsLogEnvTags")
    public String slsLogEnvTags;

    /**
     * <p>Enable application startup probes.</p>
     * <ul>
     * <li><p>Successful check: Indicates that the application started successfully. If you configured Liveness and Readiness checks, the system performs Liveness and Readiness checks after the application starts successfully.</p>
     * </li>
     * <li><p>Failed check: Indicates that the application failed to start. The system reports an exception and automatically restarts the application.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><p>Supported methods are exec, httpGet, and tcpSocket. For examples, see the Liveness parameter.</p>
     * </li>
     * <li><p>Select only one method for the health check.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;exec&quot;:{&quot;command&quot;:[&quot;sh&quot;,&quot;-c&quot;,&quot;cat /home/admin/start.sh&quot;]},&quot;initialDelaySeconds&quot;:30,&quot;periodSeconds&quot;:30,&quot;timeoutSeconds&quot;:2}</p>
     */
    @NameInMap("StartupProbe")
    public String startupProbe;

    /**
     * <p>The graceful shutdown timeout duration. Default is 30 seconds. Valid values are 1 to 300.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("TerminationGracePeriodSeconds")
    public Integer terminationGracePeriodSeconds;

    /**
     * <p>The time zone. Default is <strong>Asia/Shanghai</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>Asia/Shanghai</p>
     */
    @NameInMap("Timezone")
    public String timezone;

    /**
     * <p>Tomcat file configuration. Set to &quot;&quot; or &quot;{}&quot; to delete the configuration:</p>
     * <ul>
     * <li><p><strong>port</strong>: The port range is 1024 to 65535. Ports less than 1024 require root permissions to operate. Because the container is configured with Admin permissions, specify a port greater than 1024. If you do not configure this, the default is 8080.</p>
     * </li>
     * <li><p><strong>contextPath</strong>: The access path. Default is the root directory &quot;/&quot;.</p>
     * </li>
     * <li><p><strong>maxThreads</strong>: Configure the connection pool size. Default is 400.</p>
     * </li>
     * <li><p>uriEncoding: The encoding format for Tomcat, including <strong>UTF-8</strong>, <strong>ISO-8859-1</strong>, <strong>GBK</strong>, and <strong>GB2312</strong>. If you do not set this, the default is <strong>ISO-8859-1</strong>.</p>
     * </li>
     * <li><p><strong>useBodyEncodingForUri</strong>: Whether to use <strong>BodyEncoding for URL</strong>. Default is <strong>true</strong>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;port&quot;:8080,&quot;contextPath&quot;:&quot;/&quot;,&quot;maxThreads&quot;:400,&quot;uriEncoding&quot;:&quot;ISO-8859-1&quot;,&quot;useBodyEncodingForUri&quot;:true}</p>
     */
    @NameInMap("TomcatConfig")
    public String tomcatConfig;

    /**
     * <p>The virtual switch (vSwitch) where the application instance\&quot;s Elastic Network Interface (ENI) is located. This vSwitch must be within the specified VPC. This vSwitch also has a binding relationship with the SAE namespace. If you do not specify this parameter, the system uses the vSwitch ID bound to the namespace by default.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp12mw1f8k3jgygk9****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The VPC corresponding to the SAE namespace. In SAE, a namespace can only correspond to one VPC, and you cannot change it. The first time you create an SAE application in a namespace, a binding relationship forms. Multiple namespaces can correspond to one VPC. If you do not specify this parameter, the system uses the VPC ID bound to the namespace by default.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1aevy8sofi8mh1q****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>Set the startup command for WAR package deployed applications. The procedure is the same as configuring the startup command for image deployments. For more information, see <a href="https://help.aliyun.com/document_detail/96677.html">Set the startup command</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>CATALINA_OPTS=\&quot;$CATALINA_OPTS $Options\&quot; catalina.sh run</p>
     */
    @NameInMap("WarStartOptions")
    public String warStartOptions;

    /**
     * <p>The Tomcat version that the WebContainer deployment package depends on. Supported versions:</p>
     * <ul>
     * <li><p><strong>apache-tomcat-7.0.91</strong></p>
     * </li>
     * <li><p><strong>apache-tomcat-8.5.42</strong></p>
     * </li>
     * </ul>
     * <p>This parameter is not supported when <strong>Package Type</strong> is <strong>Image</strong>.</p>
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

}
