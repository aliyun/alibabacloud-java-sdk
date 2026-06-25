// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DeployApplicationRequest extends TeaModel {
    /**
     * <p>The ARN of the RAM role required to pull images across accounts. For more information, see <a href="https://help.aliyun.com/document_detail/223585.html">Authorize cross-account image pulls using RAM roles</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::123456789012****:role/adminrole</p>
     */
    @NameInMap("AcrAssumeRoleArn")
    public String acrAssumeRoleArn;

    /**
     * <p>The Container Registry Enterprise Edition instance ID. Required when <strong>ImageUrl</strong> is from Container Registry Enterprise Edition.</p>
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
     * <p>The ALB gateway readiness gate configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("AlbIngressReadinessGate")
    public String albIngressReadinessGate;

    /**
     * <p>The ID of the application to deploy.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7171a6ca-d1cd-4928-8642-7d5cfe69****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>Whether to associate an EIP. Values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Associate.</p>
     * </li>
     * <li><p><strong>false</strong>: Do not associate.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AssociateEip")
    public Boolean associateEip;

    /**
     * <p>Whether to automatically enable application Auto Scaling rules. Values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Enable.</p>
     * </li>
     * <li><p><strong>false</strong>: Disable.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoEnableApplicationScalingRule")
    public Boolean autoEnableApplicationScalingRule;

    /**
     * <p>The wait time between batches, in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("BatchWaitTime")
    public Integer batchWaitTime;

    /**
     * <p>The description of the release task.</p>
     * 
     * <strong>example:</strong>
     * <p>Start application</p>
     */
    @NameInMap("ChangeOrderDesc")
    public String changeOrderDesc;

    /**
     * <p>The startup command for your image. This command must be an executable object inside the container. Example:</p>
     * <pre><code>command:
     *       - echo
     *       - abc
     *       - &gt;
     *       - file0
     * </code></pre>
     * <p>In this example, Command=&quot;echo&quot; and <code>CommandArgs=[&quot;abc&quot;, &quot;&gt;&quot;, &quot;file0&quot;]</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>echo</p>
     */
    @NameInMap("Command")
    public String command;

    /**
     * <p>The arguments for the startup command <strong>Command</strong>. Format:</p>
     * <p><code>[&quot;a&quot;,&quot;b&quot;]</code></p>
     * <p>In the earlier example, <code>CommandArgs=[&quot;abc&quot;, &quot;&gt;&quot;, &quot;file0&quot;]</code>. The value <code>[&quot;abc&quot;, &quot;&gt;&quot;, &quot;file0&quot;]</code> must be converted to a string in JSON array format. Leave this field empty if no arguments are needed.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;a&quot;,&quot;b&quot;]</p>
     */
    @NameInMap("CommandArgs")
    public String commandArgs;

    /**
     * <p>The mount description for a <strong>ConfigMap</strong>. Use configuration items created on the namespace configuration page to inject configuration into your container. Parameters:</p>
     * <ul>
     * <li><p><strong>configMapId</strong>: The ID of the ConfigMap instance. Get it by calling the <a href="https://help.aliyun.com/document_detail/176917.html">ListNamespacedConfigMaps</a> API.</p>
     * </li>
     * <li><p><strong>key</strong>: The key.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>You can mount all keys by passing <code>sae-sys-configmap-all</code>.</p>
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
     * <p>The CPU required per instance, in milliCPU. Cannot be zero. Supported fixed specifications:</p>
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
     * <li><p><strong>12000</strong></p>
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
     * <p>Custom host mappings inside your container. Values:</p>
     * <ul>
     * <li><p><strong>hostName</strong>: A domain name or hostname.</p>
     * </li>
     * <li><p><strong>ip</strong>: An IP address.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;hostName&quot;:&quot;samplehost&quot;,&quot;ip&quot;:&quot;127.0.0.1&quot;}]</p>
     */
    @NameInMap("CustomHostAlias")
    public String customHostAlias;

    /**
     * <p>The custom image type. Set to an empty string for non-custom images:</p>
     * <ul>
     * <li><p>internet: Public network image</p>
     * </li>
     * <li><p>intranet: Private network image</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>internet</p>
     */
    @NameInMap("CustomImageNetworkType")
    public String customImageNetworkType;

    /**
     * <p>This parameter applies only to stopped applications. If you call <strong>DeployApplication</strong> on a running application, it deploys immediately.</p>
     * <ul>
     * <li><p><strong>true</strong>: Default. Deploys immediately, applies the new configuration, and starts instances.</p>
     * </li>
     * <li><p><strong>false</strong>: Applies the new configuration only. Does not start application instances.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Deploy")
    public String deploy;

    /**
     * <p>The .NET framework version:</p>
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
     * <p>The version of the application runtime environment for HSF applications, such as Ali-Tomcat containers.</p>
     * 
     * <strong>example:</strong>
     * <p>3.5.3</p>
     */
    @NameInMap("EdasContainerVersion")
    public String edasContainerVersion;

    /**
     * <p>The configuration for shared temporary storage.</p>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;name\&quot;:\&quot;workdir\&quot;,\&quot;mountPath\&quot;:\&quot;/usr/local/tomcat/webapps\&quot;}]</p>
     */
    @NameInMap("EmptyDirDesc")
    public String emptyDirDesc;

    /**
     * <p>Whether to integrate with AHAS. Values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Integrate with AHAS.</p>
     * </li>
     * <li><p><strong>false</strong>: Do not integrate with AHAS.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableAhas")
    public String enableAhas;

    /**
     * <p>Whether to enable CPU Burst:</p>
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
     * <p>Whether to enable traffic canary rules. These rules apply only to Spring Cloud and Dubbo applications. Values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Enable canary rules.</p>
     * </li>
     * <li><p><strong>false</strong>: Disable canary rules.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableGreyTagRoute")
    public Boolean enableGreyTagRoute;

    /**
     * <p>Whether to reuse the namespace Agent version configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableNamespaceAgentVersion")
    public Boolean enableNamespaceAgentVersion;

    /**
     * <p>Whether to enable the new ARMS feature:</p>
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
     * <p>Whether to isolate sidecar resources:</p>
     * <ul>
     * <li><p>true: Isolate.</p>
     * </li>
     * <li><p>false: Do not isolate.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableSidecarResourceIsolated")
    public Boolean enableSidecarResourceIsolated;

    /**
     * <p>The environment variables for your container. You can define custom variables or reference configuration items. To reference a configuration item, first create a ConfigMap instance. For more information, see <a href="https://help.aliyun.com/document_detail/176914.html">CreateConfigMap</a>. Values:</p>
     * <ul>
     * <li><p>Custom configuration</p>
     * <ul>
     * <li><p><strong>name</strong>: The name of the environment variable.</p>
     * </li>
     * <li><p><strong>value</strong>: The value of the environment variable. Takes precedence over valueFrom.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p>Reference a configuration item (valueFrom)</p>
     * <ul>
     * <li><p><strong>name</strong>: The name of the environment variable. You can reference a single key or all keys. To reference all keys, use <code>sae-sys-configmap-all-&lt;configmap-name&gt;</code>, for example <code>sae-sys-configmap-all-test1</code>.</p>
     * </li>
     * <li><p><strong>valueFrom</strong>: The reference type. Set to <code>configMapRef</code>.</p>
     * </li>
     * <li><p><strong>configMapId</strong>: The ID of the ConfigMap instance.</p>
     * </li>
     * <li><p><strong>key</strong>: The key. Omit this field if you reference all keys.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p>Reference a secret (valueFrom)</p>
     * <ul>
     * <li><p><strong>name</strong>: The name of the environment variable. You can reference a single key or all keys. To reference all keys, use <code>sae-sys-secret-all-&lt;secret-name&gt;</code>, for example <code>sae-sys-secret-all-test1</code>.</p>
     * </li>
     * <li><p><strong>valueFrom</strong>: The reference type. Set to <code>secretRef</code>.</p>
     * </li>
     * <li><p><strong>secretId</strong>: The ID of the secret.</p>
     * </li>
     * <li><p><strong>key</strong>: The key. Omit this field if you reference all keys.</p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[ { &quot;name&quot;: &quot;sae-sys-configmap-all-hello&quot;, &quot;valueFrom&quot;: { &quot;configMapRef&quot;: { &quot;configMapId&quot;: 100, &quot;key&quot;: &quot;&quot; } } }, { &quot;name&quot;: &quot;hello&quot;, &quot;valueFrom&quot;: { &quot;configMapRef&quot;: { &quot;configMapId&quot;: 101, &quot;key&quot;: &quot;php-fpm&quot; } } }, { &quot;name&quot;: &quot;sae-sys-secret-all-hello&quot;, &quot;valueFrom&quot;: { “secretRef&quot;: { “secretId&quot;: 100, &quot;key&quot;: &quot;&quot; } } }, { &quot;name&quot;: “password”, &quot;valueFrom&quot;: { “secretRef&quot;: { “secretId&quot;: 101, &quot;key&quot;: “password” } } }, { &quot;name&quot;: &quot;envtmp&quot;, &quot;value&quot;: &quot;newenv&quot; } ]</p>
     */
    @NameInMap("Envs")
    public String envs;

    @NameInMap("GpuConfig")
    public String gpuConfig;

    /**
     * <p>The Nginx version:</p>
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
     * <p>The registry address of your image. Required when <strong>Package Type</strong> is <strong>Image</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>registry.cn-hangzhou.aliyuncs.com/sae_test/ali_sae_test:0.0.1</p>
     */
    @NameInMap("ImageUrl")
    public String imageUrl;

    /**
     * <p>The initialization container configuration.</p>
     */
    @NameInMap("InitContainersConfig")
    public java.util.List<InitContainerConfig> initContainersConfig;

    /**
     * <p>Startup arguments for your JAR package. Default startup command: <code>$JAVA_HOME/bin/java $JarStartOptions -jar $CATALINA_OPTS &quot;$package_path&quot; $JarStartArgs</code></p>
     * 
     * <strong>example:</strong>
     * <p>-Xms4G -Xmx4G</p>
     */
    @NameInMap("JarStartArgs")
    public String jarStartArgs;

    /**
     * <p>Startup options for your JAR package. Default startup command: <code>$JAVA_HOME/bin/java $JarStartOptions -jar $CATALINA_OPTS &quot;$package_path&quot; $JarStartArgs</code></p>
     * 
     * <strong>example:</strong>
     * <p>custom-option</p>
     */
    @NameInMap("JarStartOptions")
    public String jarStartOptions;

    /**
     * <p>The JDK version that your deployment package depends on. Supported versions include the following:</p>
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
     * <p>The configuration for collecting logs to Kafka. Values:</p>
     * <ul>
     * <li><p><strong>kafkaEndpoint</strong>: The endpoint for the Kafka API.</p>
     * </li>
     * <li><p><strong>kafkaInstanceId</strong>: The Kafka instance ID.</p>
     * </li>
     * <li><p><strong>kafkaConfigs</strong>: The configuration for one or more log entries. For examples and details, see the \<em>\<em>kafkaConfigs\</em>\</em> request parameter in this topic.</p>
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
     * <p>Health checks for your container. Containers that fail health checks are terminated and restarted. Supported methods:</p>
     * <ul>
     * <li><p><strong>exec</strong>: For example, <code>{&quot;exec&quot;:{&quot;command&quot;:[&quot;sh&quot;,&quot;-c&quot;,&quot;cat/home/admin/start.sh&quot;]},&quot;initialDelaySeconds&quot;:30,&quot;periodSeconds&quot;:30,&quot;timeoutSeconds&quot;:2}</code></p>
     * </li>
     * <li><p><strong>httpGet</strong>: For example, <code>{&quot;httpGet&quot;:{&quot;path&quot;:&quot;/&quot;,&quot;port&quot;:18091,&quot;scheme&quot;:&quot;HTTP&quot;,&quot;isContainKeyWord&quot;:true,&quot;keyWord&quot;:&quot;SAE&quot;},&quot;initialDelaySeconds&quot;:11,&quot;periodSeconds&quot;:10,&quot;timeoutSeconds&quot;:1}</code></p>
     * </li>
     * <li><p><strong>tcpSocket</strong>: For example, <code>{&quot;tcpSocket&quot;:{&quot;port&quot;:18091},&quot;initialDelaySeconds&quot;:11,&quot;periodSeconds&quot;:10,&quot;timeoutSeconds&quot;:1}</code></p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>You can select only one health check method.</p>
     * </blockquote>
     * <p>Parameters:</p>
     * <ul>
     * <li><p><strong>exec.command</strong>: The health check command.</p>
     * </li>
     * <li><p><strong>httpGet.path</strong>: The path to access.</p>
     * </li>
     * <li><p><strong>httpGet.scheme</strong>: <strong>HTTP</strong> or <strong>HTTPS</strong>.</p>
     * </li>
     * <li><p><strong>httpGet.isContainKeyWord</strong>: <strong>true</strong> means the response contains a keyword. <strong>false</strong> means it does not. If omitted, advanced features are disabled.</p>
     * </li>
     * <li><p><strong>httpGet.keyWord</strong>: Your custom keyword. Include <strong>isContainKeyWord</strong> when using this field.</p>
     * </li>
     * <li><p><strong>tcpSocket.port</strong>: The port for TCP connection checks.</p>
     * </li>
     * <li><p><strong>initialDelaySeconds</strong>: The delay before the first health check, in seconds. Default is 10.</p>
     * </li>
     * <li><p><strong>periodSeconds</strong>: The interval between health checks, in seconds. Default is 30.</p>
     * </li>
     * <li><p><strong>timeoutSeconds</strong>: The timeout for each health check, in seconds. Default is 1. If set to 0 or omitted, the default is 1 second.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;exec&quot;:{&quot;command&quot;:[&quot;sleep&quot;,&quot;5s&quot;]},&quot;initialDelaySeconds&quot;:10,&quot;timeoutSeconds&quot;:11}</p>
     */
    @NameInMap("Liveness")
    public String liveness;

    @NameInMap("LokiConfigs")
    public String lokiConfigs;

    /**
     * <p>The maximum number of surge instances as a percentage of total instances. Values:</p>
     * <p>If the minimum available instances is 100%, the maximum surge cannot be set to 0. If set to -1, the system uses its recommended value: 30% of your current instance count. For example, with 10 instances, 10 × 30% = 3.</p>
     * 
     * <strong>example:</strong>
     * <p>-1</p>
     */
    @NameInMap("MaxSurgeInstanceRatio")
    public Integer maxSurgeInstanceRatio;

    /**
     * <p>The maximum number of surge instances during a rolling update. Values:</p>
     * <p>If the minimum available instances is 100%, the maximum surge cannot be set to 0. If set to -1, the system uses its recommended value: 30% of your current instance count. For example, with 10 instances, 10 × 30% = 3.</p>
     * 
     * <strong>example:</strong>
     * <p>-1</p>
     */
    @NameInMap("MaxSurgeInstances")
    public Integer maxSurgeInstances;

    /**
     * <p>The memory required per instance, in MB. Cannot be zero. Memory and CPU are paired. Supported fixed specifications:</p>
     * <ul>
     * <li><p><strong>1024</strong>: Pairs with 500 and 1000 milliCPU.</p>
     * </li>
     * <li><p><strong>2048</strong>: Pairs with 500, 1000, and 2000 milliCPU.</p>
     * </li>
     * <li><p><strong>4096</strong>: Pairs with 1000, 2000, and 4000 milliCPU.</p>
     * </li>
     * <li><p><strong>8192</strong>: Pairs with 2000, 4000, and 8000 milliCPU.</p>
     * </li>
     * <li><p><strong>12288</strong>: Pairs with 12000 milliCPU.</p>
     * </li>
     * <li><p><strong>16384</strong>: Pairs with 4000, 8000, and 16000 milliCPU.</p>
     * </li>
     * <li><p><strong>24576</strong>: Pairs with 12000 milliCPU.</p>
     * </li>
     * <li><p><strong>32768</strong>: Pairs with 16000 milliCPU.</p>
     * </li>
     * <li><p><strong>65536</strong>: Pairs with 8000, 16000, and 32000 milliCPU.</p>
     * </li>
     * <li><p><strong>131072</strong>: Pairs with 32000 milliCPU.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("Memory")
    public Integer memory;

    /**
     * <p>Select a Nacos registry center. Values:</p>
     * <ul>
     * <li><p><strong>0</strong>: Built-in Nacos in SAE.</p>
     * </li>
     * <li><p><strong>1</strong>: Self-managed Nacos.</p>
     * </li>
     * <li><p><strong>2</strong>: MSE Nacos Commercial Edition.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you select built-in Nacos in SAE, you cannot retrieve its configuration.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>&quot;0&quot;</p>
     */
    @NameInMap("MicroRegistration")
    public String microRegistration;

    /**
     * <p>The registry configuration. Applies only when the registry type is MSE Nacos Enterprise Edition.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;instanceId\&quot;:\&quot;mse-cn-zvp2bh6h70r\&quot;,\&quot;namespace\&quot;:\&quot;4c0aa74f-57cb-423c-b6af-5d9f2d0e3dbd\&quot;}</p>
     */
    @NameInMap("MicroRegistrationConfig")
    public String microRegistrationConfig;

    /**
     * <p>Configure microservice governance features.</p>
     * <ul>
     * <li><p>Enable microservice governance (enable):</p>
     * <ul>
     * <li><p>true: Enable</p>
     * </li>
     * <li><p>false: Disable</p>
     * </li>
     * </ul>
     * </li>
     * <li><p>Configure graceful start and shutdown (mseLosslessRule):</p>
     * <ul>
     * <li><p>delayTime: Delay time</p>
     * </li>
     * <li><p>enable: Whether to enable graceful start. true enables it. false disables it.</p>
     * </li>
     * <li><p>notice: Whether to enable notifications. true enables them. false disables them.</p>
     * </li>
     * <li><p>warmupTime: Warm-up duration for small traffic, in seconds.</p>
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
     * <p>The minimum number of available instances as a percentage of total instances. Values:</p>
     * <ul>
     * <li><p><strong>-1</strong>: Use the default value. No percentage is applied.</p>
     * </li>
     * <li><p><strong>0–100</strong>: Percentage value. Rounded up. For example, if set to <strong>50</strong>% and you have 5 instances, the minimum is 3.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If both <strong>MinReadyInstances</strong> and <strong>MinReadyInstanceRatio</strong> are provided, and <strong>MinReadyInstanceRatio</strong> is not <strong>-1</strong>, then <strong>MinReadyInstanceRatio</strong> takes precedence. For example, if <strong>MinReadyInstances</strong> is <strong>5</strong> and <strong>MinReadyInstanceRatio</strong> is <strong>50</strong>, the system calculates the minimum based on 50%.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>-1</p>
     */
    @NameInMap("MinReadyInstanceRatio")
    public Integer minReadyInstanceRatio;

    /**
     * <p>The minimum number of instances that remain available during a rolling update. Values:</p>
     * <ul>
     * <li><p>If set to <strong>0</strong>, your application experiences downtime during updates.</p>
     * </li>
     * <li><p>If set to -1, the system uses its recommended value: 25% of your current instance count. For example, with 5 instances, 5 × 25% = 1.25, rounded up to 2.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>We recommend setting this value to at least 1 to avoid service interruptions.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MinReadyInstances")
    public Integer minReadyInstances;

    /**
     * <p>We recommend using <strong>NasConfigs</strong> instead of this field. The NAS mount description. If your NAS configuration remains unchanged, omit this parameter. To clear your NAS configuration, set this field to an empty string.</p>
     * 
     * <strong>example:</strong>
     * <p>[{mountPath: &quot;/tmp&quot;, nasPath: &quot;/&quot;}]</p>
     */
    @NameInMap("MountDesc")
    public String mountDesc;

    /**
     * <p>We recommend using <strong>NasConfigs</strong> instead of this field. The mount target of the NAS in your application\&quot;s VPC. If your NAS configuration remains unchanged, omit this parameter. To clear your NAS configuration, set this field to an empty string.</p>
     * 
     * <strong>example:</strong>
     * <p>10d3b4bc9****.com</p>
     */
    @NameInMap("MountHost")
    public String mountHost;

    /**
     * <p>The configuration for mounting NAS. Values:</p>
     * <ul>
     * <li><p><strong>mountPath</strong>: The mount path in the container.</p>
     * </li>
     * <li><p><strong>readOnly</strong>: Set to <strong>false</strong> for read and write permissions.</p>
     * </li>
     * <li><p><strong>nasId</strong>: The NAS ID.</p>
     * </li>
     * <li><p><strong>mountDomain</strong>: The mount target address. For more information, see <a href="https://help.aliyun.com/document_detail/62626.html">DescribeMountTargets</a>.</p>
     * </li>
     * <li><p><strong>nasPath</strong>: The relative directory in NAS.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;mountPath&quot;:&quot;/test1&quot;,&quot;readOnly&quot;:false,&quot;nasId&quot;:&quot;nasId1&quot;,&quot;mountDomain&quot;:&quot;nasId1.cn-shenzhen.nas.aliyuncs.com&quot;,&quot;nasPath&quot;:&quot;/test1&quot;},{&quot;nasId&quot;:&quot;nasId2&quot;,&quot;mountDomain&quot;:&quot;nasId2.cn-shenzhen.nas.aliyuncs.com&quot;,&quot;readOnly&quot;:false,&quot;nasPath&quot;:&quot;/test2&quot;,&quot;mountPath&quot;:&quot;/test2&quot;}]</p>
     */
    @NameInMap("NasConfigs")
    public String nasConfigs;

    /**
     * <p>We recommend using <strong>NasConfigs</strong> instead of this field. The ID of the NAS file system. If your NAS configuration remains unchanged, omit this parameter. To clear your NAS configuration, set this field to an empty string.</p>
     * 
     * <strong>example:</strong>
     * <p>10d3b4****</p>
     */
    @NameInMap("NasId")
    public String nasId;

    /**
     * <p>The application version:</p>
     * <ul>
     * <li><p>lite: Lite Edition</p>
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
     * <p>Create an OIDC identity provider and an associated role in the same region before using this parameter. For more information, see <a href="https://help.aliyun.com/document_detail/2331022.html">Create an OIDC identity provider</a> and <a href="https://help.aliyun.com/document_detail/2331016.html">Create a role for SSO identity providers</a>.</p>
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
     * <p>The AccessKey secret for OSS read and write operations.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxxx</p>
     */
    @NameInMap("OssAkSecret")
    public String ossAkSecret;

    /**
     * <p>The OSS mount description. Parameters:</p>
     * <ul>
     * <li><p><strong>bucketName</strong>: The name of the bucket.</p>
     * </li>
     * <li><p><strong>bucketPath</strong>: The directory or object in OSS. If the directory does not exist, an error occurs.</p>
     * </li>
     * <li><p><strong>mountPath</strong>: The path in your SAE container. If the path exists, it is overwritten. If it does not exist, it is created.</p>
     * </li>
     * <li><p><strong>readOnly</strong>: Whether the container path has read-only access to the mounted resource. Values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Read-only.</p>
     * </li>
     * <li><p><strong>false</strong>: Read and write.</p>
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
     * <p>The type of your application package. Values:</p>
     * <ul>
     * <li><p>For Java applications: <strong>FatJar</strong>, <strong>War</strong>, and <strong>Image</strong>.</p>
     * </li>
     * <li><p>For PHP applications:</p>
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
     * <li><p>For Python applications: <strong>PythonZip</strong> and <strong>Image</strong>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FatJar</p>
     */
    @NameInMap("PackageType")
    public String packageType;

    /**
     * <p>The URL of your deployment package. Required when <strong>Package Type</strong> is <strong>FatJar</strong>, <strong>War</strong>, or <strong>PythonZip</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://myoss.oss-cn-hangzhou.aliyuncs.com/my-buc/2019-06-30/****.jar">http://myoss.oss-cn-hangzhou.aliyuncs.com/my-buc/2019-06-30/****.jar</a></p>
     */
    @NameInMap("PackageUrl")
    public String packageUrl;

    /**
     * <p>The version number of your deployment package. Required when <strong>Package Type</strong> is <strong>FatJar</strong>, <strong>War</strong>, or <strong>PythonZip</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0.1</p>
     */
    @NameInMap("PackageVersion")
    public String packageVersion;

    /**
     * <p>The PHP version that your PHP deployment package depends on. Not supported for images.</p>
     * 
     * <strong>example:</strong>
     * <p>PHP-FPM 7.0</p>
     */
    @NameInMap("Php")
    public String php;

    /**
     * <p>The mount path for PHP application monitoring. Ensure your PHP server loads the configuration file at this path. You do not need to manage the configuration content. SAE renders the correct configuration automatically.</p>
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
     * <p>The mount path for the PHP startup configuration. Ensure your PHP server uses this configuration file to start.</p>
     * 
     * <strong>example:</strong>
     * <p>/usr/local/etc/php/php.ini</p>
     */
    @NameInMap("PhpConfigLocation")
    public String phpConfigLocation;

    /**
     * <p>A script that runs after your container starts. It executes immediately after the container is created. Format: <code>{&quot;exec&quot;:{&quot;command&quot;:[&quot;sh&quot;,&quot;-c&quot;,&quot;echo hello&quot;]}}</code></p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;exec&quot;:{&quot;command&quot;:[&quot;sh&quot;,&quot;-c&quot;,&quot;echo hello&quot;]}}</p>
     */
    @NameInMap("PostStart")
    public String postStart;

    /**
     * <p>A script that runs before your container stops. It executes just before the container is deleted. Format: <code>{&quot;exec&quot;:{&quot;command&quot;:[&quot;sh&quot;,&quot;-c&quot;,&quot;echo hello&quot;]}}</code></p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;exec&quot;:{&quot;command&quot;:[&quot;sh&quot;,&quot;-c&quot;,&quot;echo hello&quot;]}}</p>
     */
    @NameInMap("PreStop")
    public String preStop;

    /**
     * <p>Enable K8s Service registration and discovery. Values:</p>
     * <ul>
     * <li><p><strong>portProtocols</strong>: Port and protocol. Port range is [1,65535]. Protocols supported: <strong>TCP</strong> and <strong>UDP</strong>.</p>
     * </li>
     * <li><p>portAndProtocol: Port and protocol. Port range is [1,65535]. Protocols supported: <strong>TCP</strong> and <strong>UDP</strong>. <strong>portProtocols</strong> takes precedence. If both are set, only <strong>portProtocols</strong> applies.</p>
     * </li>
     * <li><p><strong>enable</strong>: Enable K8s Service registration and discovery.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;portProtocols&quot;:[{&quot;port&quot;:18012,&quot;protocol&quot;:&quot;TCP&quot;}],&quot;portAndProtocol&quot;:{&quot;18012&quot;:&quot;TCP&quot;},&quot;enable&quot;:true}</p>
     */
    @NameInMap("PvtzDiscoverySvc")
    public String pvtzDiscoverySvc;

    /**
     * <p>The Python runtime environment. Supported: <strong>PYTHON 3.9.15</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>PYTHON 3.9.15</p>
     */
    @NameInMap("Python")
    public String python;

    /**
     * <p>Custom module dependencies. By default, dependencies defined in requirements.txt in the root directory are installed. If no configuration or custom packages exist, specify the dependencies to install.</p>
     * 
     * <strong>example:</strong>
     * <p>Flask==2.0</p>
     */
    @NameInMap("PythonModules")
    public String pythonModules;

    /**
     * <p>Startup status checks for your application. Containers that repeatedly fail readiness checks are terminated and restarted. Containers that fail readiness checks receive no SLB traffic. Supports <strong>exec</strong>, <strong>httpGet</strong>, and <strong>tcpSocket</strong>. For examples, see the <strong>Liveness</strong> parameter.</p>
     * <blockquote>
     * <p>You can select only one health check method.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;exec&quot;:{&quot;command&quot;:[&quot;sleep&quot;,&quot;6s&quot;]},&quot;initialDelaySeconds&quot;:15,&quot;timeoutSeconds&quot;:12}</p>
     */
    @NameInMap("Readiness")
    public String readiness;

    /**
     * <p>The number of instances.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Replicas")
    public Integer replicas;

    /**
     * <p>The mount description for a <strong>Secret</strong>. Use secrets created on the namespace secrets page to inject sensitive information into your container. Parameters:</p>
     * <ul>
     * <li><p><strong>secretId</strong>: The ID of the secret instance. Get it by calling the ListSecrets API.</p>
     * </li>
     * <li><p><strong>key</strong>: The key.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>You can mount all keys by passing <code>sae-sys-secret-all</code>.</p>
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
     * <p>The canary tags configured for your application.</p>
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
     * <li><p>Using SAE-managed SLS resources: <code>[{&quot;logDir&quot;:&quot;&quot;,&quot;logType&quot;:&quot;stdout&quot;},{&quot;logDir&quot;:&quot;/tmp/a.log&quot;}]</code>.</p>
     * </li>
     * <li><p>Using custom SLS resources: <code>[{&quot;projectName&quot;:&quot;test-sls&quot;,&quot;logType&quot;:&quot;stdout&quot;,&quot;logDir&quot;:&quot;&quot;,&quot;logstoreName&quot;:&quot;sae&quot;,&quot;logtailName&quot;:&quot;&quot;},{&quot;projectName&quot;:&quot;test&quot;,&quot;logDir&quot;:&quot;/tmp/a.log&quot;,&quot;logstoreName&quot;:&quot;sae&quot;,&quot;logtailName&quot;:&quot;&quot;}]</code>.</p>
     * </li>
     * </ul>
     * <p>Parameters:</p>
     * <ul>
     * <li><p><strong>projectName</strong>: The name of the SLS project.</p>
     * </li>
     * <li><p><strong>logDir</strong>: The log file path.</p>
     * </li>
     * <li><p>logType: The log type. <strong>stdout</strong> means standard output logs from the container. Only one <strong>stdout</strong> entry is allowed. If omitted, file logs are collected.</p>
     * </li>
     * <li><p><strong>logstoreName</strong>: The name of the SLS Logstore.</p>
     * </li>
     * <li><p><strong>logtailName</strong>: The name of the SLS Logtail. If omitted, a new Logtail is created.</p>
     * </li>
     * </ul>
     * <p>If your SLS collection configuration remains unchanged across deployments, omit this parameter. To disable SLS collection, set this field to an empty string.</p>
     * <blockquote>
     * <p>Projects automatically created by SAE are deleted when the application is deleted. Do not select these projects when choosing an existing project.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;logDir&quot;:&quot;&quot;,&quot;logType&quot;:&quot;stdout&quot;},{&quot;logDir&quot;:&quot;/tmp/a.log&quot;}]</p>
     */
    @NameInMap("SlsConfigs")
    public String slsConfigs;

    /**
     * <p>The SLS log tags.</p>
     */
    @NameInMap("SlsLogEnvTags")
    public String slsLogEnvTags;

    /**
     * <p>Enable application startup probing.</p>
     * <ul>
     * <li><p>Success: The application starts successfully. If you configure Liveness and Readiness checks, they run after startup.</p>
     * </li>
     * <li><p>Failure: The application fails to start. SAE reports an error and restarts the container automatically.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Description</p>
     * <ul>
     * <li><p>Supports exec, httpGet, and tcpSocket. For examples, see the Liveness parameter.</p>
     * </li>
     * <li><p>You can select only one health check method.</p>
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
     * <p>Configures service discovery and end-to-end canary release based on a Kubernetes Service:</p>
     * <ul>
     * <li><p>enable: Specifies whether to enable the end-to-end canary release feature.</p>
     * <ul>
     * <li><p>true: Enables the feature.</p>
     * </li>
     * <li><p>false: Disables the feature.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p>namespaceId: The namespace ID.</p>
     * </li>
     * <li><p>portAndProtocol: The listening port and protocol. The format is {&quot;\<port>:\<protocol>&quot;:&quot;\<target_port>&quot;}.</p>
     * </li>
     * <li><p>portProtocols: A list of ports and protocols for the service.</p>
     * <ul>
     * <li><p>port: The port number.</p>
     * </li>
     * <li><p>protocol: The protocol.</p>
     * </li>
     * <li><p>targetPort: The container port.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p>pvtzDiscoveryName: The service discovery name.</p>
     * </li>
     * <li><p>serviceId: The service ID.</p>
     * </li>
     * <li><p>serviceName: The service name.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;enable\&quot;:\&quot;false\&quot;,\&quot;namespaceId\&quot;:\&quot;cn-beijing:test\&quot;,\&quot;portAndProtocol\&quot;:{\&quot;2000:TCP\&quot;:\&quot;18081\&quot;},\&quot;portProtocols\&quot;:[{\&quot;port\&quot;:2000,\&quot;protocol\&quot;:\&quot;TCP\&quot;,\&quot;targetPort\&quot;:18081}],\&quot;pvtzDiscoveryName\&quot;:\&quot;cn-beijing-1421801774382676\&quot;,\&quot;serviceId\&quot;:\&quot;3513\&quot;,\&quot;serviceName\&quot;:\&quot;demo-gray.test\&quot;}</p>
     */
    @NameInMap("SwimlanePvtzDiscoverySvc")
    public String swimlanePvtzDiscoverySvc;

    /**
     * <p>The graceful shutdown timeout, in seconds. Default is 30. Valid values: 1–300.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
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
     * <p>The Tomcat configuration. Set to an empty string or {} to delete the configuration. Values:</p>
     * <ul>
     * <li><p><strong>port</strong>: Port range is 1024–65535. Ports below 1024 require root privileges. Because containers run with admin privileges, use ports above 1024. Default is 8080.</p>
     * </li>
     * <li><p><strong>contextPath</strong>: The access path. Default is the root directory /.</p>
     * </li>
     * <li><p><strong>maxThreads</strong>: The size of the connection pool. Default is 400.</p>
     * </li>
     * <li><p>uriEncoding: The encoding format for Tomcat. Options include <strong>UTF-8</strong>, <strong>ISO-8859-1</strong>, <strong>GBK</strong>, and <strong>GB2312</strong>. Default is <strong>ISO-8859-1</strong>.</p>
     * </li>
     * <li><p><strong>useBodyEncodingForUri</strong>: Whether to use body encoding for URLs. Default is <strong>true</strong>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;port&quot;:8080,&quot;contextPath&quot;:&quot;/&quot;,&quot;maxThreads&quot;:400,&quot;uriEncoding&quot;:&quot;ISO-8859-1&quot;,&quot;useBodyEncodingForUri&quot;:true}</p>
     */
    @NameInMap("TomcatConfig")
    public String tomcatConfig;

    /**
     * <p>The release strategy. When MinReadyInstances equals 1, set UpdateStrategy to an empty string. When <strong>MinReadyInstances</strong> is greater than 1, examples include the following:</p>
     * <ul>
     * <li><p>Canary release with 1 instance, followed by 2 automatic batches with a 1-minute interval: <code>{&quot;type&quot;:&quot;GrayBatchUpdate&quot;,&quot;batchUpdate&quot;:{&quot;batch&quot;:2,&quot;releaseType&quot;:&quot;auto&quot;,&quot;batchWaitTime&quot;:1},&quot;grayUpdate&quot;:{&quot;gray&quot;:1}}</code></p>
     * </li>
     * <li><p>Canary release with 1 instance, followed by 2 manual batches: <code>{&quot;type&quot;:&quot;GrayBatchUpdate&quot;,&quot;batchUpdate&quot;:{&quot;batch&quot;:2,&quot;releaseType&quot;:&quot;manual&quot;},&quot;grayUpdate&quot;:{&quot;gray&quot;:1}}</code></p>
     * </li>
     * <li><p>Two automatic batches with a 0-minute interval: <code>{&quot;type&quot;:&quot;BatchUpdate&quot;,&quot;batchUpdate&quot;:{&quot;batch&quot;:2,&quot;releaseType&quot;:&quot;auto&quot;,&quot;batchWaitTime&quot;:0}}</code></p>
     * </li>
     * </ul>
     * <p>Parameters:</p>
     * <ul>
     * <li><p><strong>type</strong>: The release strategy type. Options are <strong>GrayBatchUpdate</strong> (canary release) or <strong>BatchUpdate</strong> (phased release).</p>
     * </li>
     * <li><p><strong>batchUpdate</strong>: The phased release strategy.</p>
     * <ul>
     * <li><p><strong>batch</strong>: The number of batches.</p>
     * </li>
     * <li><p><strong>releaseType</strong>: How batches are processed. Options are <strong>auto</strong> (automatic) or <strong>manual</strong> (manual).</p>
     * </li>
     * <li><p><strong>batchWaitTime</strong>: The wait time between batches, in minutes.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p><strong>grayUpdate</strong>: The number of canary instances. Required when <strong>type</strong> is <strong>GrayBatchUpdate</strong>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;type&quot;:&quot;GrayBatchUpdate&quot;,&quot;batchUpdate&quot;:{&quot;batch&quot;:2,&quot;releaseType&quot;:&quot;auto&quot;,&quot;batchWaitTime&quot;:1},&quot;grayUpdate&quot;:{&quot;gray&quot;:1}}</p>
     */
    @NameInMap("UpdateStrategy")
    public String updateStrategy;

    /**
     * <p>The virtual switch where your application instance elastic network interfaces reside. This switch must be in the specified VPC.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp12mw1f8k3jgygk9****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The startup command for your WAR package. Configure it the same way as the startup command for images. For more information, see <a href="https://help.aliyun.com/document_detail/96677.html">Set the startup command</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>CATALINA_OPTS=\&quot;$CATALINA_OPTS $Options\&quot; catalina.sh run</p>
     */
    @NameInMap("WarStartOptions")
    public String warStartOptions;

    /**
     * <p>The Tomcat version that your deployment package depends on. Supported versions include the following:</p>
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

    public static DeployApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        DeployApplicationRequest self = new DeployApplicationRequest();
        return TeaModel.build(map, self);
    }

    public DeployApplicationRequest setAcrAssumeRoleArn(String acrAssumeRoleArn) {
        this.acrAssumeRoleArn = acrAssumeRoleArn;
        return this;
    }
    public String getAcrAssumeRoleArn() {
        return this.acrAssumeRoleArn;
    }

    public DeployApplicationRequest setAcrInstanceId(String acrInstanceId) {
        this.acrInstanceId = acrInstanceId;
        return this;
    }
    public String getAcrInstanceId() {
        return this.acrInstanceId;
    }

    public DeployApplicationRequest setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
        return this;
    }
    public String getAgentVersion() {
        return this.agentVersion;
    }

    public DeployApplicationRequest setAlbIngressReadinessGate(String albIngressReadinessGate) {
        this.albIngressReadinessGate = albIngressReadinessGate;
        return this;
    }
    public String getAlbIngressReadinessGate() {
        return this.albIngressReadinessGate;
    }

    public DeployApplicationRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DeployApplicationRequest setAssociateEip(Boolean associateEip) {
        this.associateEip = associateEip;
        return this;
    }
    public Boolean getAssociateEip() {
        return this.associateEip;
    }

    public DeployApplicationRequest setAutoEnableApplicationScalingRule(Boolean autoEnableApplicationScalingRule) {
        this.autoEnableApplicationScalingRule = autoEnableApplicationScalingRule;
        return this;
    }
    public Boolean getAutoEnableApplicationScalingRule() {
        return this.autoEnableApplicationScalingRule;
    }

    public DeployApplicationRequest setBatchWaitTime(Integer batchWaitTime) {
        this.batchWaitTime = batchWaitTime;
        return this;
    }
    public Integer getBatchWaitTime() {
        return this.batchWaitTime;
    }

    public DeployApplicationRequest setChangeOrderDesc(String changeOrderDesc) {
        this.changeOrderDesc = changeOrderDesc;
        return this;
    }
    public String getChangeOrderDesc() {
        return this.changeOrderDesc;
    }

    public DeployApplicationRequest setCommand(String command) {
        this.command = command;
        return this;
    }
    public String getCommand() {
        return this.command;
    }

    public DeployApplicationRequest setCommandArgs(String commandArgs) {
        this.commandArgs = commandArgs;
        return this;
    }
    public String getCommandArgs() {
        return this.commandArgs;
    }

    public DeployApplicationRequest setConfigMapMountDesc(String configMapMountDesc) {
        this.configMapMountDesc = configMapMountDesc;
        return this;
    }
    public String getConfigMapMountDesc() {
        return this.configMapMountDesc;
    }

    public DeployApplicationRequest setCpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }
    public Integer getCpu() {
        return this.cpu;
    }

    public DeployApplicationRequest setCustomHostAlias(String customHostAlias) {
        this.customHostAlias = customHostAlias;
        return this;
    }
    public String getCustomHostAlias() {
        return this.customHostAlias;
    }

    public DeployApplicationRequest setCustomImageNetworkType(String customImageNetworkType) {
        this.customImageNetworkType = customImageNetworkType;
        return this;
    }
    public String getCustomImageNetworkType() {
        return this.customImageNetworkType;
    }

    public DeployApplicationRequest setDeploy(String deploy) {
        this.deploy = deploy;
        return this;
    }
    public String getDeploy() {
        return this.deploy;
    }

    public DeployApplicationRequest setDotnet(String dotnet) {
        this.dotnet = dotnet;
        return this;
    }
    public String getDotnet() {
        return this.dotnet;
    }

    public DeployApplicationRequest setEdasContainerVersion(String edasContainerVersion) {
        this.edasContainerVersion = edasContainerVersion;
        return this;
    }
    public String getEdasContainerVersion() {
        return this.edasContainerVersion;
    }

    public DeployApplicationRequest setEmptyDirDesc(String emptyDirDesc) {
        this.emptyDirDesc = emptyDirDesc;
        return this;
    }
    public String getEmptyDirDesc() {
        return this.emptyDirDesc;
    }

    public DeployApplicationRequest setEnableAhas(String enableAhas) {
        this.enableAhas = enableAhas;
        return this;
    }
    public String getEnableAhas() {
        return this.enableAhas;
    }

    public DeployApplicationRequest setEnableCpuBurst(Boolean enableCpuBurst) {
        this.enableCpuBurst = enableCpuBurst;
        return this;
    }
    public Boolean getEnableCpuBurst() {
        return this.enableCpuBurst;
    }

    public DeployApplicationRequest setEnableGreyTagRoute(Boolean enableGreyTagRoute) {
        this.enableGreyTagRoute = enableGreyTagRoute;
        return this;
    }
    public Boolean getEnableGreyTagRoute() {
        return this.enableGreyTagRoute;
    }

    public DeployApplicationRequest setEnableNamespaceAgentVersion(Boolean enableNamespaceAgentVersion) {
        this.enableNamespaceAgentVersion = enableNamespaceAgentVersion;
        return this;
    }
    public Boolean getEnableNamespaceAgentVersion() {
        return this.enableNamespaceAgentVersion;
    }

    public DeployApplicationRequest setEnableNewArms(Boolean enableNewArms) {
        this.enableNewArms = enableNewArms;
        return this;
    }
    public Boolean getEnableNewArms() {
        return this.enableNewArms;
    }

    public DeployApplicationRequest setEnablePrometheus(Boolean enablePrometheus) {
        this.enablePrometheus = enablePrometheus;
        return this;
    }
    public Boolean getEnablePrometheus() {
        return this.enablePrometheus;
    }

    public DeployApplicationRequest setEnableSidecarResourceIsolated(Boolean enableSidecarResourceIsolated) {
        this.enableSidecarResourceIsolated = enableSidecarResourceIsolated;
        return this;
    }
    public Boolean getEnableSidecarResourceIsolated() {
        return this.enableSidecarResourceIsolated;
    }

    public DeployApplicationRequest setEnvs(String envs) {
        this.envs = envs;
        return this;
    }
    public String getEnvs() {
        return this.envs;
    }

    public DeployApplicationRequest setGpuConfig(String gpuConfig) {
        this.gpuConfig = gpuConfig;
        return this;
    }
    public String getGpuConfig() {
        return this.gpuConfig;
    }

    public DeployApplicationRequest setHtml(String html) {
        this.html = html;
        return this;
    }
    public String getHtml() {
        return this.html;
    }

    public DeployApplicationRequest setImagePullSecrets(String imagePullSecrets) {
        this.imagePullSecrets = imagePullSecrets;
        return this;
    }
    public String getImagePullSecrets() {
        return this.imagePullSecrets;
    }

    public DeployApplicationRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public DeployApplicationRequest setInitContainersConfig(java.util.List<InitContainerConfig> initContainersConfig) {
        this.initContainersConfig = initContainersConfig;
        return this;
    }
    public java.util.List<InitContainerConfig> getInitContainersConfig() {
        return this.initContainersConfig;
    }

    public DeployApplicationRequest setJarStartArgs(String jarStartArgs) {
        this.jarStartArgs = jarStartArgs;
        return this;
    }
    public String getJarStartArgs() {
        return this.jarStartArgs;
    }

    public DeployApplicationRequest setJarStartOptions(String jarStartOptions) {
        this.jarStartOptions = jarStartOptions;
        return this;
    }
    public String getJarStartOptions() {
        return this.jarStartOptions;
    }

    public DeployApplicationRequest setJdk(String jdk) {
        this.jdk = jdk;
        return this;
    }
    public String getJdk() {
        return this.jdk;
    }

    public DeployApplicationRequest setKafkaConfigs(String kafkaConfigs) {
        this.kafkaConfigs = kafkaConfigs;
        return this;
    }
    public String getKafkaConfigs() {
        return this.kafkaConfigs;
    }

    public DeployApplicationRequest setLabels(java.util.Map<String, String> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.Map<String, String> getLabels() {
        return this.labels;
    }

    public DeployApplicationRequest setLiveness(String liveness) {
        this.liveness = liveness;
        return this;
    }
    public String getLiveness() {
        return this.liveness;
    }

    public DeployApplicationRequest setLokiConfigs(String lokiConfigs) {
        this.lokiConfigs = lokiConfigs;
        return this;
    }
    public String getLokiConfigs() {
        return this.lokiConfigs;
    }

    public DeployApplicationRequest setMaxSurgeInstanceRatio(Integer maxSurgeInstanceRatio) {
        this.maxSurgeInstanceRatio = maxSurgeInstanceRatio;
        return this;
    }
    public Integer getMaxSurgeInstanceRatio() {
        return this.maxSurgeInstanceRatio;
    }

    public DeployApplicationRequest setMaxSurgeInstances(Integer maxSurgeInstances) {
        this.maxSurgeInstances = maxSurgeInstances;
        return this;
    }
    public Integer getMaxSurgeInstances() {
        return this.maxSurgeInstances;
    }

    public DeployApplicationRequest setMemory(Integer memory) {
        this.memory = memory;
        return this;
    }
    public Integer getMemory() {
        return this.memory;
    }

    public DeployApplicationRequest setMicroRegistration(String microRegistration) {
        this.microRegistration = microRegistration;
        return this;
    }
    public String getMicroRegistration() {
        return this.microRegistration;
    }

    public DeployApplicationRequest setMicroRegistrationConfig(String microRegistrationConfig) {
        this.microRegistrationConfig = microRegistrationConfig;
        return this;
    }
    public String getMicroRegistrationConfig() {
        return this.microRegistrationConfig;
    }

    public DeployApplicationRequest setMicroserviceEngineConfig(String microserviceEngineConfig) {
        this.microserviceEngineConfig = microserviceEngineConfig;
        return this;
    }
    public String getMicroserviceEngineConfig() {
        return this.microserviceEngineConfig;
    }

    public DeployApplicationRequest setMinReadyInstanceRatio(Integer minReadyInstanceRatio) {
        this.minReadyInstanceRatio = minReadyInstanceRatio;
        return this;
    }
    public Integer getMinReadyInstanceRatio() {
        return this.minReadyInstanceRatio;
    }

    public DeployApplicationRequest setMinReadyInstances(Integer minReadyInstances) {
        this.minReadyInstances = minReadyInstances;
        return this;
    }
    public Integer getMinReadyInstances() {
        return this.minReadyInstances;
    }

    public DeployApplicationRequest setMountDesc(String mountDesc) {
        this.mountDesc = mountDesc;
        return this;
    }
    public String getMountDesc() {
        return this.mountDesc;
    }

    public DeployApplicationRequest setMountHost(String mountHost) {
        this.mountHost = mountHost;
        return this;
    }
    public String getMountHost() {
        return this.mountHost;
    }

    public DeployApplicationRequest setNasConfigs(String nasConfigs) {
        this.nasConfigs = nasConfigs;
        return this;
    }
    public String getNasConfigs() {
        return this.nasConfigs;
    }

    public DeployApplicationRequest setNasId(String nasId) {
        this.nasId = nasId;
        return this;
    }
    public String getNasId() {
        return this.nasId;
    }

    public DeployApplicationRequest setNewSaeVersion(String newSaeVersion) {
        this.newSaeVersion = newSaeVersion;
        return this;
    }
    public String getNewSaeVersion() {
        return this.newSaeVersion;
    }

    public DeployApplicationRequest setOidcRoleName(String oidcRoleName) {
        this.oidcRoleName = oidcRoleName;
        return this;
    }
    public String getOidcRoleName() {
        return this.oidcRoleName;
    }

    public DeployApplicationRequest setOssAkId(String ossAkId) {
        this.ossAkId = ossAkId;
        return this;
    }
    public String getOssAkId() {
        return this.ossAkId;
    }

    public DeployApplicationRequest setOssAkSecret(String ossAkSecret) {
        this.ossAkSecret = ossAkSecret;
        return this;
    }
    public String getOssAkSecret() {
        return this.ossAkSecret;
    }

    public DeployApplicationRequest setOssMountDescs(String ossMountDescs) {
        this.ossMountDescs = ossMountDescs;
        return this;
    }
    public String getOssMountDescs() {
        return this.ossMountDescs;
    }

    public DeployApplicationRequest setPackageType(String packageType) {
        this.packageType = packageType;
        return this;
    }
    public String getPackageType() {
        return this.packageType;
    }

    public DeployApplicationRequest setPackageUrl(String packageUrl) {
        this.packageUrl = packageUrl;
        return this;
    }
    public String getPackageUrl() {
        return this.packageUrl;
    }

    public DeployApplicationRequest setPackageVersion(String packageVersion) {
        this.packageVersion = packageVersion;
        return this;
    }
    public String getPackageVersion() {
        return this.packageVersion;
    }

    public DeployApplicationRequest setPhp(String php) {
        this.php = php;
        return this;
    }
    public String getPhp() {
        return this.php;
    }

    public DeployApplicationRequest setPhpArmsConfigLocation(String phpArmsConfigLocation) {
        this.phpArmsConfigLocation = phpArmsConfigLocation;
        return this;
    }
    public String getPhpArmsConfigLocation() {
        return this.phpArmsConfigLocation;
    }

    public DeployApplicationRequest setPhpConfig(String phpConfig) {
        this.phpConfig = phpConfig;
        return this;
    }
    public String getPhpConfig() {
        return this.phpConfig;
    }

    public DeployApplicationRequest setPhpConfigLocation(String phpConfigLocation) {
        this.phpConfigLocation = phpConfigLocation;
        return this;
    }
    public String getPhpConfigLocation() {
        return this.phpConfigLocation;
    }

    public DeployApplicationRequest setPostStart(String postStart) {
        this.postStart = postStart;
        return this;
    }
    public String getPostStart() {
        return this.postStart;
    }

    public DeployApplicationRequest setPreStop(String preStop) {
        this.preStop = preStop;
        return this;
    }
    public String getPreStop() {
        return this.preStop;
    }

    public DeployApplicationRequest setPvtzDiscoverySvc(String pvtzDiscoverySvc) {
        this.pvtzDiscoverySvc = pvtzDiscoverySvc;
        return this;
    }
    public String getPvtzDiscoverySvc() {
        return this.pvtzDiscoverySvc;
    }

    public DeployApplicationRequest setPython(String python) {
        this.python = python;
        return this;
    }
    public String getPython() {
        return this.python;
    }

    public DeployApplicationRequest setPythonModules(String pythonModules) {
        this.pythonModules = pythonModules;
        return this;
    }
    public String getPythonModules() {
        return this.pythonModules;
    }

    public DeployApplicationRequest setReadiness(String readiness) {
        this.readiness = readiness;
        return this;
    }
    public String getReadiness() {
        return this.readiness;
    }

    public DeployApplicationRequest setReplicas(Integer replicas) {
        this.replicas = replicas;
        return this;
    }
    public Integer getReplicas() {
        return this.replicas;
    }

    public DeployApplicationRequest setSecretMountDesc(String secretMountDesc) {
        this.secretMountDesc = secretMountDesc;
        return this;
    }
    public String getSecretMountDesc() {
        return this.secretMountDesc;
    }

    public DeployApplicationRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public DeployApplicationRequest setServiceTags(String serviceTags) {
        this.serviceTags = serviceTags;
        return this;
    }
    public String getServiceTags() {
        return this.serviceTags;
    }

    public DeployApplicationRequest setSidecarContainersConfig(java.util.List<SidecarContainerConfig> sidecarContainersConfig) {
        this.sidecarContainersConfig = sidecarContainersConfig;
        return this;
    }
    public java.util.List<SidecarContainerConfig> getSidecarContainersConfig() {
        return this.sidecarContainersConfig;
    }

    public DeployApplicationRequest setSlsConfigs(String slsConfigs) {
        this.slsConfigs = slsConfigs;
        return this;
    }
    public String getSlsConfigs() {
        return this.slsConfigs;
    }

    public DeployApplicationRequest setSlsLogEnvTags(String slsLogEnvTags) {
        this.slsLogEnvTags = slsLogEnvTags;
        return this;
    }
    public String getSlsLogEnvTags() {
        return this.slsLogEnvTags;
    }

    public DeployApplicationRequest setStartupProbe(String startupProbe) {
        this.startupProbe = startupProbe;
        return this;
    }
    public String getStartupProbe() {
        return this.startupProbe;
    }

    public DeployApplicationRequest setSwimlanePvtzDiscoverySvc(String swimlanePvtzDiscoverySvc) {
        this.swimlanePvtzDiscoverySvc = swimlanePvtzDiscoverySvc;
        return this;
    }
    public String getSwimlanePvtzDiscoverySvc() {
        return this.swimlanePvtzDiscoverySvc;
    }

    public DeployApplicationRequest setTerminationGracePeriodSeconds(Integer terminationGracePeriodSeconds) {
        this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
        return this;
    }
    public Integer getTerminationGracePeriodSeconds() {
        return this.terminationGracePeriodSeconds;
    }

    public DeployApplicationRequest setTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }
    public String getTimezone() {
        return this.timezone;
    }

    public DeployApplicationRequest setTomcatConfig(String tomcatConfig) {
        this.tomcatConfig = tomcatConfig;
        return this;
    }
    public String getTomcatConfig() {
        return this.tomcatConfig;
    }

    public DeployApplicationRequest setUpdateStrategy(String updateStrategy) {
        this.updateStrategy = updateStrategy;
        return this;
    }
    public String getUpdateStrategy() {
        return this.updateStrategy;
    }

    public DeployApplicationRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public DeployApplicationRequest setWarStartOptions(String warStartOptions) {
        this.warStartOptions = warStartOptions;
        return this;
    }
    public String getWarStartOptions() {
        return this.warStartOptions;
    }

    public DeployApplicationRequest setWebContainer(String webContainer) {
        this.webContainer = webContainer;
        return this;
    }
    public String getWebContainer() {
        return this.webContainer;
    }

}
