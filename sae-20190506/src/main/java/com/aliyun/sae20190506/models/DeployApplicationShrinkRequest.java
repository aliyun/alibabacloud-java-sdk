// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DeployApplicationShrinkRequest extends TeaModel {
    /**
     * <p>The ARN of the RAM role required to pull images across accounts. For more information, see <a href="https://help.aliyun.com/document_detail/223585.html">Use RAM roles to authorize access across Alibaba Cloud accounts</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::123456789012****:role/adminrole</p>
     */
    @NameInMap("AcrAssumeRoleArn")
    public String acrAssumeRoleArn;

    /**
     * <p>The ACR Enterprise instance ID. This parameter is required when <strong>ImageUrl</strong> is set to an ACR Enterprise instance image.</p>
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
     * <p>The Application Load Balancer (ALB) gateway readiness gate configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("AlbIngressReadinessGate")
    public String albIngressReadinessGate;

    /**
     * <p>The ID of the application to be deployed.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7171a6ca-d1cd-4928-8642-7d5cfe69****</p>
     */
    @NameInMap("AppId")
    public String appId;

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
     * <p>Specifies whether the elastic scaling policy for the application is automatically enabled. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: enables the policy.</li>
     * <li><strong>false</strong>: shutdown.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoEnableApplicationScalingRule")
    public Boolean autoEnableApplicationScalingRule;

    /**
     * <p>The interval between deployment batches. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("BatchWaitTime")
    public Integer batchWaitTime;

    /**
     * <p>The description of the change order.</p>
     * 
     * <strong>example:</strong>
     * <p>Start application</p>
     */
    @NameInMap("ChangeOrderDesc")
    public String changeOrderDesc;

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
     * <p>The arguments for the image startup command. These are the arguments required by the <strong>Command</strong> startup command. Format:</p>
     * <p><code>[&quot;a&quot;,&quot;b&quot;]</code></p>
     * <p>In the preceding example, <code>CommandArgs=[&quot;abc&quot;, &quot;&gt;&quot;, &quot;file0&quot;]</code>. The <code>[&quot;abc&quot;, &quot;&gt;&quot;, &quot;file0&quot;]</code> part must be converted to a string in JSON array format. If this parameter is not required, leave it empty.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;a&quot;,&quot;b&quot;]</p>
     */
    @NameInMap("CommandArgs")
    public String commandArgs;

    /**
     * <p>The mount description of the <strong>ConfigMap</strong>. Uses the configuration item created on the configuration item page of the namespace to inject configuration information into the container. Parameter description:</p>
     * <ul>
     * <li><strong>configMapId</strong>: the instance ID of the ConfigMap instance. You can invoke the <a href="https://help.aliyun.com/document_detail/176917.html">ListNamespacedConfigMaps</a> operation to obtain the instance ID.</li>
     * <li><strong>key</strong>: the key value.</li>
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
     * <p>The CPU required for each instance. Unit: millicores. The value cannot be 0. Only the following defined specifications are supported:</p>
     * <ul>
     * <li><strong>500</strong></li>
     * <li><strong>1000</strong></li>
     * <li><strong>2000</strong></li>
     * <li><strong>4000</strong></li>
     * <li><strong>8000</strong></li>
     * <li><strong>12000</strong></li>
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
     * <p>The custom host mappings in the container. Valid values:</p>
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
     * <p>The custom image network type. If the image is not a custom image, set this parameter to an empty string. Valid values:</p>
     * <ul>
     * <li>internet: public image.</li>
     * <li>intranet: private image.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>internet</p>
     */
    @NameInMap("CustomImageNetworkType")
    public String customImageNetworkType;

    /**
     * <p>This parameter takes effect only for applications in the stopped state. If a running application calls the <strong>DeployApplication</strong> operation, the application is immediately redeployed. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: the default value. Deploys the application immediately, applies the new deployment configurations, and immediately starts the instances.</li>
     * <li><strong>false</strong>: applies only the new deployment configurations without starting the application instances.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Deploy")
    public String deploy;

    /**
     * <p>The version of the .NET framework. Valid values: </p>
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
     * <p>Specifies whether to connect to AHAS. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: connects to AHAS.</li>
     * <li><strong>false</strong>: does not connect to AHAS.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableAhas")
    public String enableAhas;

    /**
     * <p>Specifies whether to enable the CPU Burst feature. Valid values:</p>
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
     * <p>Specifies whether to enable the canary release rules for traffic. This rule applies only to applications that use the Spring Cloud and Dubbo frameworks. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: enables the canary release rules.</li>
     * <li><strong>false</strong>: disables the canary release rules.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableGreyTagRoute")
    public Boolean enableGreyTagRoute;

    /**
     * <p>Specifies whether to reuse the agent version configuration of the namespace.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableNamespaceAgentVersion")
    public Boolean enableNamespaceAgentVersion;

    /**
     * <p>Specifies whether to enable the new ARMS features. Valid values:</p>
     * <ul>
     * <li>true: enables the features.</li>
     * <li>false: disables the features.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
     * <p>Specifies whether to enable sidecar resource isolation. Valid values:</p>
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
     * <p>The environment variables for the container. You can specify custom environment variables or reference ConfigMaps. To reference a ConfigMap, you must create a ConfigMap instance first. For more information, see <a href="https://help.aliyun.com/document_detail/176914.html">CreateConfigMap</a>. Valid values:</p>
     * <ul>
     * <li>Custom environment variables<ul>
     * <li><strong>name</strong>: the name of the environment variable.</li>
     * <li><strong>value</strong>: the value of the environment variable. This parameter has a higher priority than valueFrom.</li>
     * </ul>
     * </li>
     * <li>Reference a ConfigMap (valueFrom)<ul>
     * <li><strong>name</strong>: the name of the environment variable. You can reference a single key or all keys. To reference all keys, enter <code>sae-sys-configmap-all-&lt;ConfigMap name&gt;</code>, such as <code>sae-sys-configmap-all-test1</code>.</li>
     * <li><strong>valueFrom</strong>: the reference of the environment variable. Set the value to <code>configMapRef</code>.</li>
     * <li><strong>configMapId</strong>: the ID of the ConfigMap.</li>
     * <li><strong>key</strong>: the key. If you reference all key-value pairs, do not set this field.</li>
     * </ul>
     * </li>
     * <li>Reference a secret (valueFrom)<ul>
     * <li><strong>name</strong>: the name of the environment variable. You can reference a single key or all keys. To reference all keys, enter <code>sae-sys-secret-all-&lt;secret name&gt;</code>, such as <code>sae-sys-secret-all-test1</code>.</li>
     * <li><strong>valueFrom</strong>: the reference of the environment variable. Set the value to <code>secretRef</code>.</li>
     * <li><strong>secretId</strong>: the ID of the secret.</li>
     * <li><strong>key</strong>: the key. If you reference all key-value pairs, do not set this field.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[ { &quot;name&quot;: &quot;sae-sys-configmap-all-hello&quot;, &quot;valueFrom&quot;: { &quot;configMapRef&quot;: { &quot;configMapId&quot;: 100, &quot;key&quot;: &quot;&quot; } } }, { &quot;name&quot;: &quot;hello&quot;, &quot;valueFrom&quot;: { &quot;configMapRef&quot;: { &quot;configMapId&quot;: 101, &quot;key&quot;: &quot;php-fpm&quot; } } }, { &quot;name&quot;: &quot;sae-sys-secret-all-hello&quot;, &quot;valueFrom&quot;: { “secretRef&quot;: { “secretId&quot;: 100, &quot;key&quot;: &quot;&quot; } } }, { &quot;name&quot;: “password”, &quot;valueFrom&quot;: { “secretRef&quot;: { “secretId&quot;: 101, &quot;key&quot;: “password” } } }, { &quot;name&quot;: &quot;envtmp&quot;, &quot;value&quot;: &quot;newenv&quot; } ]</p>
     */
    @NameInMap("Envs")
    public String envs;

    /**
     * <p>The GPU configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     * &quot;gpuType&quot;:&quot;PPU810E&quot;,
     * &quot;gpuCount&quot;:&quot;1&quot;
     * }</p>
     */
    @NameInMap("GpuConfig")
    public String gpuConfig;

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
     * <p>The init container configuration.</p>
     */
    @NameInMap("InitContainersConfig")
    public String initContainersConfigShrink;

    /**
     * <p>The startup arguments for the JAR package. Default startup command: <code>$JAVA_HOME/bin/java $JarStartOptions -jar $CATALINA_OPTS &quot;$package_path&quot; $JarStartArgs</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>-Xms4G -Xmx4G</p>
     */
    @NameInMap("JarStartArgs")
    public String jarStartArgs;

    /**
     * <p>The startup options for the JAR package. Default startup command: <code>$JAVA_HOME/bin/java $JarStartOptions -jar $CATALINA_OPTS &quot;$package_path&quot; $JarStartArgs</code>.</p>
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
     * <p>The summary of configurations for collecting logs to Kafka. Valid values:</p>
     * <ul>
     * <li><strong>kafkaEndpoint</strong>: the service registration address of the Kafka API.</li>
     * <li><strong>kafkaInstanceId</strong>: the Kafka instance ID.</li>
     * <li><strong>kafkaConfigs</strong>: the summary of configurations for one or more logs. For example values and parameter description, see the <strong>kafkaConfigs</strong> request parameter in this topic.</li>
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
    public String labelsShrink;

    /**
     * <p>The liveness probe for the container. Containers that fail the health check are shutdown and recovered. Valid values:</p>
     * <ul>
     * <li><strong>exec</strong>: Example: <code>{&quot;exec&quot;:{&quot;command&quot;:[&quot;sh&quot;,&quot;-c&quot;,&quot;cat/home/admin/start.sh&quot;]},&quot;initialDelaySeconds&quot;:30,&quot;periodSeconds&quot;:30,&quot;timeoutSeconds&quot;:2}</code>.</li>
     * <li><strong>httpGet</strong>: Example: <code>{&quot;httpGet&quot;:{&quot;path&quot;:&quot;/&quot;,&quot;port&quot;:18091,&quot;scheme&quot;:&quot;HTTP&quot;,&quot;isContainKeyWord&quot;:true,&quot;keyWord&quot;:&quot;SAE&quot;},&quot;initialDelaySeconds&quot;:11,&quot;periodSeconds&quot;:10,&quot;timeoutSeconds&quot;:1}</code>.</li>
     * <li><strong>tcpSocket</strong>: Example: <code>{&quot;tcpSocket&quot;:{&quot;port&quot;:18091},&quot;initialDelaySeconds&quot;:11,&quot;periodSeconds&quot;:10,&quot;timeoutSeconds&quot;:1}</code>.</li>
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
     * <li><strong>initialDelaySeconds</strong>: Settings for the health check delay detection time. Default value: 10. Unit: seconds.</li>
     * <li><strong>periodSeconds</strong>: Settings for the health check epoch. Default value: 30. Unit: seconds.</li>
     * <li><strong>timeoutSeconds</strong>: Settings for the health check timeout waiting time. Default value: 1. Unit: seconds. If this parameter is set to 0 or not set, the default timeout waiting time is 1 second.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;exec&quot;:{&quot;command&quot;:[&quot;sleep&quot;,&quot;5s&quot;]},&quot;initialDelaySeconds&quot;:10,&quot;timeoutSeconds&quot;:11}</p>
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
     * <p>The maximum surge instance ratio. Note the following rules:</p>
     * <p>If the minimum number of available instances is 100%, the Peak Volume Settings cannot be 0. If the Settings are <strong>-1</strong>, the system uses the recommended value of 30%, which is 30% of the current number of instances. For example, if the current number of instances is 10, the maximum number of surge instances is 10 × 30% = 3.</p>
     * 
     * <strong>example:</strong>
     * <p>-1</p>
     */
    @NameInMap("MaxSurgeInstanceRatio")
    public Integer maxSurgeInstanceRatio;

    /**
     * <p>The maximum number of surge instances. Note the following rules:</p>
     * <p>If the minimum number of available instances is 100%, the Peak Volume Settings cannot be 0.
     * If the Settings are <strong>-1</strong>, the maximum number of surge instances uses the recommended Peak Volume ratio of 30%, which is 30% of the current number of instances. For example, if the current number of instances is 10, the maximum number of surge instances is 10 × 30% = 3.</p>
     * 
     * <strong>example:</strong>
     * <p>-1</p>
     */
    @NameInMap("MaxSurgeInstances")
    public Integer maxSurgeInstances;

    /**
     * <p>The memory required for each instance. Unit: MB. The value cannot be 0. The memory has a one-to-one mapping with the CPU. Only the following defined specifications are supported:</p>
     * <ul>
     * <li><strong>1024</strong>: corresponds to 500 and 1000 millicores.</li>
     * <li><strong>2048</strong>: corresponds to 500, 1000, and 2000 millicores.</li>
     * <li><strong>4096</strong>: corresponds to 1000, 2000, and 4000 millicores.</li>
     * <li><strong>8192</strong>: corresponds to 2000, 4000, and 8000 millicores.</li>
     * <li><strong>12288</strong>: corresponds to 12000 millicores.</li>
     * <li><strong>16384</strong>: corresponds to 4000, 8000, and 16000 millicores.</li>
     * <li><strong>24576</strong>: corresponds to 12000 millicores.</li>
     * <li><strong>32768</strong>: corresponds to 16000 millicores.</li>
     * <li><strong>65536</strong>: corresponds to 8000, 16000, and 32000 millicores.</li>
     * <li><strong>131072</strong>: corresponds to 32000 millicores.</li>
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
     * <li><strong>2</strong>: Microservices Engine (MSE) Nacos Commercial Edition.</li>
     * </ul>
     * <blockquote>
     * <p>If you select the built-in Nacos of SAE, you cannot obtain the configurations of the built-in Nacos.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>&quot;0&quot;</p>
     */
    @NameInMap("MicroRegistration")
    public String microRegistration;

    /**
     * <p>The registry configurations. This parameter takes effect only when the registry type is MSE Nacos Enterprise Edition.</p>
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
     * <li>enable: Specifies whether to enable the lossless online feature. Valid values:<ul>
     * <li>true: Enabled.</li>
     * <li>false: Disabled.</li>
     * </ul>
     * </li>
     * <li>notice: Specifies whether to enable the notification feature. Valid values:<ul>
     * <li>true: Enabled.</li>
     * <li>false: Disabled.</li>
     * </ul>
     * </li>
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
     * <p>The percentage of the minimum number of ready instances. Valid values:</p>
     * <ul>
     * <li><strong>-1</strong>: the initial value, which indicates that the percentage is not used.</li>
     * <li><strong>0~100</strong>: the percentage, rounded up. For example, if you set this parameter to <strong>50</strong> and the current number of instances is 5, the minimum number of ready instances is 3.</li>
     * </ul>
     * <blockquote>
     * <p>When both <strong>MinReadyInstance</strong> and <strong>MinReadyInstanceRatio</strong> are passed and the value of <strong>MinReadyInstanceRatio</strong> is not <strong>-1</strong>, the <strong>MinReadyInstanceRatio</strong> parameter prevails. For example, if <strong>MinReadyInstances</strong> is set to <strong>5</strong> and <strong>MinReadyInstanceRatio</strong> is set to <strong>50</strong>, <strong>50</strong> is used to calculate the minimum number of ready instances.</p>
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
     * <li>If you set this parameter to <strong>0</strong>, services are interrupted during the application upgrade.</li>
     * <li>If you set this parameter to <strong>-1</strong>, the system recommended value is used, which is 25% of the current number of instances. For example, if the current number of instances is 5, 5 × 25% = 1.25. After rounding up, the minimum number of ready instances is 2.</li>
     * </ul>
     * <blockquote>
     * <p>Set the minimum number of ready instances to a value greater than or equal to 1 for each rolling deployment to ensure service continuity.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MinReadyInstances")
    public Integer minReadyInstances;

    /**
     * <p>This field is not recommended. Configure <strong>NasConfigs</strong> instead. The description of the NAS mount. If the configurations remain unchanged during deployment, you do not need to set this parameter. That is, you do not need to include the <strong>MountDesc</strong> field in the request. If you need to clear the NAS configurations, you must set the value of this field to an empty string in the request. That is, set the <strong>MountDesc</strong> field to &quot;&quot;.</p>
     * 
     * <strong>example:</strong>
     * <p>[{mountPath: &quot;/tmp&quot;, nasPath: &quot;/&quot;}]</p>
     */
    @NameInMap("MountDesc")
    public String mountDesc;

    /**
     * <p>This field is not recommended. Configure <strong>NasConfigs</strong> instead. The mount target of the NAS file system in the VPC of the application. If the configurations remain unchanged during deployment, you do not need to set this parameter. That is, you do not need to include the <strong>MountHost</strong> field in the request. If you need to clear the NAS configurations, you must set the value of this field to an empty string in the request. That is, set the <strong>MountHost</strong> field to &quot;&quot;.</p>
     * 
     * <strong>example:</strong>
     * <p>10d3b4bc9****.com</p>
     */
    @NameInMap("MountHost")
    public String mountHost;

    /**
     * <p>The configurations for mounting a NAS file system. Valid values:</p>
     * <ul>
     * <li><strong>mountPath</strong>: the mount path in the container.</li>
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
     * <p>This field is not recommended. Configure <strong>NasConfigs</strong> instead. The ID of the NAS file system. If the configurations remain unchanged during deployment, you do not need to set this parameter. That is, you do not need to include the <strong>NasId</strong> field in the request. If you need to clear the NAS configurations, you must set the value of this field to an empty string in the request. That is, set the <strong>NasId</strong> field to &quot;&quot;.</p>
     * 
     * <strong>example:</strong>
     * <p>10d3b4****</p>
     */
    @NameInMap("NasId")
    public String nasId;

    /**
     * <p>The application edition. Valid values:</p>
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
     * <p>You must create an OIDC identity provider and an identity provider role in the same region in advance. For more information, see <a href="https://help.aliyun.com/document_detail/2331022.html">Create an OIDC identity provider</a> and <a href="https://help.aliyun.com/document_detail/2331016.html">Create an IdP for role-based SSO</a>.</p>
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
     * <li><strong>mountPath</strong>: the container path in SAE. If the path already exists, it is an overwrite relationship. If the path does not exist, it is created.</li>
     * <li><strong>readOnly</strong>: specifies whether the container path has read permissions on the mount directory resources. Valid values:<ul>
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
     * <li>If you use Java for deployment, valid values are <strong>FatJar</strong>, <strong>War</strong>, and <strong>Image</strong>.</li>
     * <li>If you use PHP for deployment, valid values are:<ul>
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
     * <li>If you use Python for deployment, valid values are <strong>PythonZip</strong> and <strong>Image</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FatJar</p>
     */
    @NameInMap("PackageType")
    public String packageType;

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
     * <p>The PHP version required by the PHP deployment package. Images are not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>PHP-FPM 7.0</p>
     */
    @NameInMap("Php")
    public String php;

    /**
     * <p>The mount path for PHP application monitoring. You must ensure that the PHP server loads the configuration file in this path. You do not need to pay attention to the configuration content. SAE automatically renders the correct configuration file.</p>
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
     * <p>The script to execute after the container starts. A script is triggered immediately after the container is created. Format: <code>{&quot;exec&quot;:{&quot;command&quot;:[&quot;sh&quot;,&quot;-c&quot;,&quot;echo hello&quot;]}}</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;exec&quot;:{&quot;command&quot;:[&quot;sh&quot;,&quot;-c&quot;,&quot;echo hello&quot;]}}</p>
     */
    @NameInMap("PostStart")
    public String postStart;

    /**
     * <p>The script to execute before the container stops. A script is triggered before the container is deleted. Format: <code>{&quot;exec&quot;:{&quot;command&quot;:[&quot;sh&quot;,&quot;-c&quot;,&quot;echo hello&quot;]}}</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;exec&quot;:{&quot;command&quot;:[&quot;sh&quot;,&quot;-c&quot;,&quot;echo hello&quot;]}}</p>
     */
    @NameInMap("PreStop")
    public String preStop;

    /**
     * <p>Enables service registration and discovery for Kubernetes Services. Valid values:</p>
     * <ul>
     * <li><strong>portProtocols</strong>: the port and protocol. Valid values for the port: 1 to 65535. Valid values for the protocol: <strong>TCP</strong> and <strong>UDP</strong>.</li>
     * <li><strong>portAndProtocol</strong>: the port and protocol. Valid values for the port: 1 to 65535. Valid values for the protocol: <strong>TCP</strong> and <strong>UDP</strong>. <strong>Use portProtocols instead. If portProtocols is set, only portProtocols takes effect</strong>.</li>
     * <li><strong>enable</strong>: enables service registration and discovery for Kubernetes Services.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;portProtocols&quot;:[{&quot;port&quot;:18012,&quot;protocol&quot;:&quot;TCP&quot;}],&quot;portAndProtocol&quot;:{&quot;18012&quot;:&quot;TCP&quot;},&quot;enable&quot;:true}</p>
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
     * <p>The custom installation module dependencies. By default, the dependencies defined in the requirements.txt file in the root folder are installed. If this parameter is not configured or a custom software package is used, you can specify the dependencies to install.</p>
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
    public String raspConfigShrink;

    /**
     * <p>The readiness probe for the application. Containers that fail multiple health checks are stopped and restarted. Traffic from the SLB instance is not routed to containers that fail the health check. The <strong>exec</strong>, <strong>httpGet</strong>, and <strong>tcpSocket</strong> methods are supported. For specific examples, see the <strong>Liveness</strong> parameter.</p>
     * <blockquote>
     * <p>You can select only one method for the health check.</p>
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
     * <p>The mount description of the <strong>Secret</strong>. Uses the secret created on the Secret page of the namespace to inject confidential information into the container. Parameter description:</p>
     * <ul>
     * <li><strong>secretId</strong>: the instance ID of the secret instance. You can obtain the instance ID by calling the ListSecrets operation.</li>
     * <li><strong>key</strong>: the key value.</li>
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
     * <p>The ID of the security group.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-wz969ngg2e49q5i4****</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>The canary tags configured for the application.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;alicloud.service.tag\&quot;:\&quot;g1\&quot;}</p>
     */
    @NameInMap("ServiceTags")
    public String serviceTags;

    /**
     * <p>The container configuration information.</p>
     */
    @NameInMap("SidecarContainersConfig")
    public String sidecarContainersConfigShrink;

    /**
     * <p>The Settings for collecting logs to Simple Log Service (SLS).</p>
     * <ul>
     * <li>Use SLS resources automatically created by SAE: <code>[{&quot;logDir&quot;:&quot;&quot;,&quot;logType&quot;:&quot;stdout&quot;},{&quot;logDir&quot;:&quot;/tmp/a.log&quot;}]</code>.</li>
     * <li>Use custom SLS resources: <code>[{&quot;projectName&quot;:&quot;test-sls&quot;,&quot;logType&quot;:&quot;stdout&quot;,&quot;logDir&quot;:&quot;&quot;,&quot;logstoreName&quot;:&quot;sae&quot;,&quot;logtailName&quot;:&quot;&quot;},{&quot;projectName&quot;:&quot;test&quot;,&quot;logDir&quot;:&quot;/tmp/a.log&quot;,&quot;logstoreName&quot;:&quot;sae&quot;,&quot;logtailName&quot;:&quot;&quot;}]</code>.</li>
     * </ul>
     * <p>Parameter description:</p>
     * <ul>
     * <li><strong>projectName</strong>: the name of the SLS project.  </li>
     * <li><strong>logDir</strong>: the log path.</li>
     * <li><strong>logType</strong>: the log type. <strong>stdout</strong> indicates container standard output logs. You can set only 1 standard output log. If this parameter is not set, file logs are collected.</li>
     * <li><strong>logstoreName</strong>: the name of the SLS Logstore.</li>
     * <li><strong>logtailName</strong>: the name of the SLS Logtail. If this parameter is not specified, a new Logtail is created.</li>
     * </ul>
     * <p>If the SLS collection Settings remain unchanged during multiple deployments, you do not need to set this parameter. That is, you do not need to include the <strong>SlsConfigs</strong> field in the request. If you no longer need the SLS collection feature, you must set the value of this field to an empty string in the request. That is, set the <strong>SlsConfigs</strong> field to &quot;&quot;.</p>
     * <blockquote>
     * <p>Projects that are automatically created with the application are deleted when the application is deleted. Therefore, when you select an existing project, you cannot select a project that is automatically created by SAE.</p>
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
     * <p>Enables application startup probing.</p>
     * <ul>
     * <li>Check succeeded: indicates that the application is started. If you configure liveness and readiness probes, the liveness and readiness probes are executed after the application is started.</li>
     * <li>Check failed: indicates that the application fails to start. An exception is reported and the application is automatically restarted.</li>
     * </ul>
     * <blockquote>
     * <p>Note</p>
     * <ul>
     * <li>The exec, httpGet, and tcpSocket methods are supported. For specific examples, refer to the Liveness parameter.</li>
     * <li>You can select only one method for health checks.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;exec&quot;:{&quot;command&quot;:[&quot;sh&quot;,&quot;-c&quot;,&quot;cat /home/admin/start.sh&quot;]},&quot;initialDelaySeconds&quot;:30,&quot;periodSeconds&quot;:30,&quot;timeoutSeconds&quot;:2}</p>
     */
    @NameInMap("StartupProbe")
    public String startupProbe;

    /**
     * <p>Configures service registration and discovery and end-to-end canary release based on Kubernetes Services:</p>
     * <ul>
     * <li>enable: specifies whether to enable the end-to-end canary release feature based on Kubernetes Services.<ul>
     * <li>true: enables the feature.</li>
     * <li>false: disables the feature.</li>
     * </ul>
     * </li>
     * <li>namespaceId: the ID of the namespace.</li>
     * <li>portAndProtocol: the listening port and protocol. Format: {&quot;port:protocol type&quot;:&quot;container port&quot;}.</li>
     * <li>portProtocols: defines the port and protocol of the service.<ul>
     * <li>port: the port.</li>
     * <li>protocol: the protocol.</li>
     * <li>targetPort: the container port.</li>
     * </ul>
     * </li>
     * <li>pvtzDiscoveryName: service name of the service discovery.</li>
     * <li>serviceId: the ID of the service.</li>
     * <li>serviceName: service name of the service.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;enable\&quot;:\&quot;false\&quot;,\&quot;namespaceId\&quot;:\&quot;cn-beijing:test\&quot;,\&quot;portAndProtocol\&quot;:{\&quot;2000:TCP\&quot;:\&quot;18081\&quot;},\&quot;portProtocols\&quot;:[{\&quot;port\&quot;:2000,\&quot;protocol\&quot;:\&quot;TCP\&quot;,\&quot;targetPort\&quot;:18081}],\&quot;pvtzDiscoveryName\&quot;:\&quot;cn-beijing-1421801774382676\&quot;,\&quot;serviceId\&quot;:\&quot;3513\&quot;,\&quot;serviceName\&quot;:\&quot;demo-gray.test\&quot;}</p>
     */
    @NameInMap("SwimlanePvtzDiscoverySvc")
    public String swimlanePvtzDiscoverySvc;

    /**
     * <p>The timeout period for graceful shutdown. Default value: 30. Unit: seconds. Valid values: 1 to 300.</p>
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
     * <p>The Tomcat file configuration. Set the value to &quot;&quot; or &quot;{}&quot; to delete the configuration. Valid values:</p>
     * <ul>
     * <li><strong>port</strong>: the port range is 1024 to 65535. Ports smaller than 1024 require root permissions. Because the container is configured with admin permissions, specify a port greater than 1024. If this parameter is not configured, the default value is 8080.</li>
     * <li><strong>contextPath</strong>: the access path. Default value: the root directory &quot;/&quot;.</li>
     * <li><strong>maxThreads</strong>: the maximum number of connections in the connection pool. Default value: 400.</li>
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
     * <p>The deployment policy. When the minimum number of ready instances is 1, the value of the <strong>UpdateStrategy</strong> field is &quot;&quot;. When the minimum number of ready instances is greater than 1, examples are as follows:</p>
     * <ul>
     * <li>grayscale 1 instance + 2 subsequent batches + automatic batching + 1-minute interval between batches: <code>{&quot;type&quot;:&quot;GrayBatchUpdate&quot;,&quot;batchUpdate&quot;:{&quot;batch&quot;:2,&quot;releaseType&quot;:&quot;auto&quot;,&quot;batchWaitTime&quot;:1},&quot;grayUpdate&quot;:{&quot;gray&quot;:1}}</code></li>
     * <li>grayscale 1 instance + 2 subsequent batches + manual batching: <code>{&quot;type&quot;:&quot;GrayBatchUpdate&quot;,&quot;batchUpdate&quot;:{&quot;batch&quot;:2,&quot;releaseType&quot;:&quot;manual&quot;},&quot;grayUpdate&quot;:{&quot;gray&quot;:1}}</code></li>
     * <li>2 batches + automatic batching + 0-minute interval between batches: <code>{&quot;type&quot;:&quot;BatchUpdate&quot;,&quot;batchUpdate&quot;:{&quot;batch&quot;:2,&quot;releaseType&quot;:&quot;auto&quot;,&quot;batchWaitTime&quot;:0}}</code></li>
     * </ul>
     * <p>Parameter description:</p>
     * <ul>
     * <li><p><strong>type</strong>: the type of the publish policy. Valid values: <strong>GrayBatchUpdate</strong> for grayscale publish and <strong>BatchUpdate</strong> for batch publish.</p>
     * </li>
     * <li><p><strong>batchUpdate</strong>: the batch publish policy.</p>
     * <ul>
     * <li><strong>batch</strong>: the number of publish batches.</li>
     * <li><strong>releaseType</strong>: the processing method between batches. Valid values: <strong>auto</strong> for automatic and <strong>manual</strong> for manual.</li>
     * <li><strong>batchWaitTime</strong>: the interval between batches. Unit: minutes.</li>
     * </ul>
     * </li>
     * <li><p><strong>grayUpdate</strong>: the number of grayscale instances. This parameter is required when <strong>type</strong> is set to <strong>GrayBatchUpdate</strong>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;type&quot;:&quot;GrayBatchUpdate&quot;,&quot;batchUpdate&quot;:{&quot;batch&quot;:2,&quot;releaseType&quot;:&quot;auto&quot;,&quot;batchWaitTime&quot;:1},&quot;grayUpdate&quot;:{&quot;gray&quot;:1}}</p>
     */
    @NameInMap("UpdateStrategy")
    public String updateStrategy;

    /**
     * <p>The vSwitch where the network interface controller (NIC) of the application instance resides. The vSwitch must be located in the preceding VPC.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp12mw1f8k3jgygk9****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The startup command for the application deployed by using a WAR package. The procedure is the same as that for configuring the startup command for image deployment. For more information, see <a href="https://help.aliyun.com/document_detail/96677.html">Configure a startup command</a>.</p>
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

    public static DeployApplicationShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeployApplicationShrinkRequest self = new DeployApplicationShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeployApplicationShrinkRequest setAcrAssumeRoleArn(String acrAssumeRoleArn) {
        this.acrAssumeRoleArn = acrAssumeRoleArn;
        return this;
    }
    public String getAcrAssumeRoleArn() {
        return this.acrAssumeRoleArn;
    }

    public DeployApplicationShrinkRequest setAcrInstanceId(String acrInstanceId) {
        this.acrInstanceId = acrInstanceId;
        return this;
    }
    public String getAcrInstanceId() {
        return this.acrInstanceId;
    }

    public DeployApplicationShrinkRequest setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
        return this;
    }
    public String getAgentVersion() {
        return this.agentVersion;
    }

    public DeployApplicationShrinkRequest setAlbIngressReadinessGate(String albIngressReadinessGate) {
        this.albIngressReadinessGate = albIngressReadinessGate;
        return this;
    }
    public String getAlbIngressReadinessGate() {
        return this.albIngressReadinessGate;
    }

    public DeployApplicationShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DeployApplicationShrinkRequest setAssociateEip(Boolean associateEip) {
        this.associateEip = associateEip;
        return this;
    }
    public Boolean getAssociateEip() {
        return this.associateEip;
    }

    public DeployApplicationShrinkRequest setAutoEnableApplicationScalingRule(Boolean autoEnableApplicationScalingRule) {
        this.autoEnableApplicationScalingRule = autoEnableApplicationScalingRule;
        return this;
    }
    public Boolean getAutoEnableApplicationScalingRule() {
        return this.autoEnableApplicationScalingRule;
    }

    public DeployApplicationShrinkRequest setBatchWaitTime(Integer batchWaitTime) {
        this.batchWaitTime = batchWaitTime;
        return this;
    }
    public Integer getBatchWaitTime() {
        return this.batchWaitTime;
    }

    public DeployApplicationShrinkRequest setChangeOrderDesc(String changeOrderDesc) {
        this.changeOrderDesc = changeOrderDesc;
        return this;
    }
    public String getChangeOrderDesc() {
        return this.changeOrderDesc;
    }

    public DeployApplicationShrinkRequest setCommand(String command) {
        this.command = command;
        return this;
    }
    public String getCommand() {
        return this.command;
    }

    public DeployApplicationShrinkRequest setCommandArgs(String commandArgs) {
        this.commandArgs = commandArgs;
        return this;
    }
    public String getCommandArgs() {
        return this.commandArgs;
    }

    public DeployApplicationShrinkRequest setConfigMapMountDesc(String configMapMountDesc) {
        this.configMapMountDesc = configMapMountDesc;
        return this;
    }
    public String getConfigMapMountDesc() {
        return this.configMapMountDesc;
    }

    public DeployApplicationShrinkRequest setCpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }
    public Integer getCpu() {
        return this.cpu;
    }

    public DeployApplicationShrinkRequest setCustomHostAlias(String customHostAlias) {
        this.customHostAlias = customHostAlias;
        return this;
    }
    public String getCustomHostAlias() {
        return this.customHostAlias;
    }

    public DeployApplicationShrinkRequest setCustomImageNetworkType(String customImageNetworkType) {
        this.customImageNetworkType = customImageNetworkType;
        return this;
    }
    public String getCustomImageNetworkType() {
        return this.customImageNetworkType;
    }

    public DeployApplicationShrinkRequest setDeploy(String deploy) {
        this.deploy = deploy;
        return this;
    }
    public String getDeploy() {
        return this.deploy;
    }

    public DeployApplicationShrinkRequest setDotnet(String dotnet) {
        this.dotnet = dotnet;
        return this;
    }
    public String getDotnet() {
        return this.dotnet;
    }

    public DeployApplicationShrinkRequest setEdasContainerVersion(String edasContainerVersion) {
        this.edasContainerVersion = edasContainerVersion;
        return this;
    }
    public String getEdasContainerVersion() {
        return this.edasContainerVersion;
    }

    public DeployApplicationShrinkRequest setEmptyDirDesc(String emptyDirDesc) {
        this.emptyDirDesc = emptyDirDesc;
        return this;
    }
    public String getEmptyDirDesc() {
        return this.emptyDirDesc;
    }

    public DeployApplicationShrinkRequest setEnableAhas(String enableAhas) {
        this.enableAhas = enableAhas;
        return this;
    }
    public String getEnableAhas() {
        return this.enableAhas;
    }

    public DeployApplicationShrinkRequest setEnableCpuBurst(Boolean enableCpuBurst) {
        this.enableCpuBurst = enableCpuBurst;
        return this;
    }
    public Boolean getEnableCpuBurst() {
        return this.enableCpuBurst;
    }

    public DeployApplicationShrinkRequest setEnableGreyTagRoute(Boolean enableGreyTagRoute) {
        this.enableGreyTagRoute = enableGreyTagRoute;
        return this;
    }
    public Boolean getEnableGreyTagRoute() {
        return this.enableGreyTagRoute;
    }

    public DeployApplicationShrinkRequest setEnableNamespaceAgentVersion(Boolean enableNamespaceAgentVersion) {
        this.enableNamespaceAgentVersion = enableNamespaceAgentVersion;
        return this;
    }
    public Boolean getEnableNamespaceAgentVersion() {
        return this.enableNamespaceAgentVersion;
    }

    public DeployApplicationShrinkRequest setEnableNewArms(Boolean enableNewArms) {
        this.enableNewArms = enableNewArms;
        return this;
    }
    public Boolean getEnableNewArms() {
        return this.enableNewArms;
    }

    public DeployApplicationShrinkRequest setEnablePrometheus(Boolean enablePrometheus) {
        this.enablePrometheus = enablePrometheus;
        return this;
    }
    public Boolean getEnablePrometheus() {
        return this.enablePrometheus;
    }

    public DeployApplicationShrinkRequest setEnableSidecarResourceIsolated(Boolean enableSidecarResourceIsolated) {
        this.enableSidecarResourceIsolated = enableSidecarResourceIsolated;
        return this;
    }
    public Boolean getEnableSidecarResourceIsolated() {
        return this.enableSidecarResourceIsolated;
    }

    public DeployApplicationShrinkRequest setEnvs(String envs) {
        this.envs = envs;
        return this;
    }
    public String getEnvs() {
        return this.envs;
    }

    public DeployApplicationShrinkRequest setGpuConfig(String gpuConfig) {
        this.gpuConfig = gpuConfig;
        return this;
    }
    public String getGpuConfig() {
        return this.gpuConfig;
    }

    public DeployApplicationShrinkRequest setHtml(String html) {
        this.html = html;
        return this;
    }
    public String getHtml() {
        return this.html;
    }

    public DeployApplicationShrinkRequest setImagePullSecrets(String imagePullSecrets) {
        this.imagePullSecrets = imagePullSecrets;
        return this;
    }
    public String getImagePullSecrets() {
        return this.imagePullSecrets;
    }

    public DeployApplicationShrinkRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public DeployApplicationShrinkRequest setInitContainersConfigShrink(String initContainersConfigShrink) {
        this.initContainersConfigShrink = initContainersConfigShrink;
        return this;
    }
    public String getInitContainersConfigShrink() {
        return this.initContainersConfigShrink;
    }

    public DeployApplicationShrinkRequest setJarStartArgs(String jarStartArgs) {
        this.jarStartArgs = jarStartArgs;
        return this;
    }
    public String getJarStartArgs() {
        return this.jarStartArgs;
    }

    public DeployApplicationShrinkRequest setJarStartOptions(String jarStartOptions) {
        this.jarStartOptions = jarStartOptions;
        return this;
    }
    public String getJarStartOptions() {
        return this.jarStartOptions;
    }

    public DeployApplicationShrinkRequest setJdk(String jdk) {
        this.jdk = jdk;
        return this;
    }
    public String getJdk() {
        return this.jdk;
    }

    public DeployApplicationShrinkRequest setKafkaConfigs(String kafkaConfigs) {
        this.kafkaConfigs = kafkaConfigs;
        return this;
    }
    public String getKafkaConfigs() {
        return this.kafkaConfigs;
    }

    public DeployApplicationShrinkRequest setLabelsShrink(String labelsShrink) {
        this.labelsShrink = labelsShrink;
        return this;
    }
    public String getLabelsShrink() {
        return this.labelsShrink;
    }

    public DeployApplicationShrinkRequest setLiveness(String liveness) {
        this.liveness = liveness;
        return this;
    }
    public String getLiveness() {
        return this.liveness;
    }

    public DeployApplicationShrinkRequest setLokiConfigs(String lokiConfigs) {
        this.lokiConfigs = lokiConfigs;
        return this;
    }
    public String getLokiConfigs() {
        return this.lokiConfigs;
    }

    public DeployApplicationShrinkRequest setMaxSurgeInstanceRatio(Integer maxSurgeInstanceRatio) {
        this.maxSurgeInstanceRatio = maxSurgeInstanceRatio;
        return this;
    }
    public Integer getMaxSurgeInstanceRatio() {
        return this.maxSurgeInstanceRatio;
    }

    public DeployApplicationShrinkRequest setMaxSurgeInstances(Integer maxSurgeInstances) {
        this.maxSurgeInstances = maxSurgeInstances;
        return this;
    }
    public Integer getMaxSurgeInstances() {
        return this.maxSurgeInstances;
    }

    public DeployApplicationShrinkRequest setMemory(Integer memory) {
        this.memory = memory;
        return this;
    }
    public Integer getMemory() {
        return this.memory;
    }

    public DeployApplicationShrinkRequest setMicroRegistration(String microRegistration) {
        this.microRegistration = microRegistration;
        return this;
    }
    public String getMicroRegistration() {
        return this.microRegistration;
    }

    public DeployApplicationShrinkRequest setMicroRegistrationConfig(String microRegistrationConfig) {
        this.microRegistrationConfig = microRegistrationConfig;
        return this;
    }
    public String getMicroRegistrationConfig() {
        return this.microRegistrationConfig;
    }

    public DeployApplicationShrinkRequest setMicroserviceEngineConfig(String microserviceEngineConfig) {
        this.microserviceEngineConfig = microserviceEngineConfig;
        return this;
    }
    public String getMicroserviceEngineConfig() {
        return this.microserviceEngineConfig;
    }

    public DeployApplicationShrinkRequest setMinReadyInstanceRatio(Integer minReadyInstanceRatio) {
        this.minReadyInstanceRatio = minReadyInstanceRatio;
        return this;
    }
    public Integer getMinReadyInstanceRatio() {
        return this.minReadyInstanceRatio;
    }

    public DeployApplicationShrinkRequest setMinReadyInstances(Integer minReadyInstances) {
        this.minReadyInstances = minReadyInstances;
        return this;
    }
    public Integer getMinReadyInstances() {
        return this.minReadyInstances;
    }

    public DeployApplicationShrinkRequest setMountDesc(String mountDesc) {
        this.mountDesc = mountDesc;
        return this;
    }
    public String getMountDesc() {
        return this.mountDesc;
    }

    public DeployApplicationShrinkRequest setMountHost(String mountHost) {
        this.mountHost = mountHost;
        return this;
    }
    public String getMountHost() {
        return this.mountHost;
    }

    public DeployApplicationShrinkRequest setNasConfigs(String nasConfigs) {
        this.nasConfigs = nasConfigs;
        return this;
    }
    public String getNasConfigs() {
        return this.nasConfigs;
    }

    public DeployApplicationShrinkRequest setNasId(String nasId) {
        this.nasId = nasId;
        return this;
    }
    public String getNasId() {
        return this.nasId;
    }

    public DeployApplicationShrinkRequest setNewSaeVersion(String newSaeVersion) {
        this.newSaeVersion = newSaeVersion;
        return this;
    }
    public String getNewSaeVersion() {
        return this.newSaeVersion;
    }

    public DeployApplicationShrinkRequest setOidcRoleName(String oidcRoleName) {
        this.oidcRoleName = oidcRoleName;
        return this;
    }
    public String getOidcRoleName() {
        return this.oidcRoleName;
    }

    public DeployApplicationShrinkRequest setOssAkId(String ossAkId) {
        this.ossAkId = ossAkId;
        return this;
    }
    public String getOssAkId() {
        return this.ossAkId;
    }

    public DeployApplicationShrinkRequest setOssAkSecret(String ossAkSecret) {
        this.ossAkSecret = ossAkSecret;
        return this;
    }
    public String getOssAkSecret() {
        return this.ossAkSecret;
    }

    public DeployApplicationShrinkRequest setOssMountDescs(String ossMountDescs) {
        this.ossMountDescs = ossMountDescs;
        return this;
    }
    public String getOssMountDescs() {
        return this.ossMountDescs;
    }

    public DeployApplicationShrinkRequest setPackageType(String packageType) {
        this.packageType = packageType;
        return this;
    }
    public String getPackageType() {
        return this.packageType;
    }

    public DeployApplicationShrinkRequest setPackageUrl(String packageUrl) {
        this.packageUrl = packageUrl;
        return this;
    }
    public String getPackageUrl() {
        return this.packageUrl;
    }

    public DeployApplicationShrinkRequest setPackageVersion(String packageVersion) {
        this.packageVersion = packageVersion;
        return this;
    }
    public String getPackageVersion() {
        return this.packageVersion;
    }

    public DeployApplicationShrinkRequest setPhp(String php) {
        this.php = php;
        return this;
    }
    public String getPhp() {
        return this.php;
    }

    public DeployApplicationShrinkRequest setPhpArmsConfigLocation(String phpArmsConfigLocation) {
        this.phpArmsConfigLocation = phpArmsConfigLocation;
        return this;
    }
    public String getPhpArmsConfigLocation() {
        return this.phpArmsConfigLocation;
    }

    public DeployApplicationShrinkRequest setPhpConfig(String phpConfig) {
        this.phpConfig = phpConfig;
        return this;
    }
    public String getPhpConfig() {
        return this.phpConfig;
    }

    public DeployApplicationShrinkRequest setPhpConfigLocation(String phpConfigLocation) {
        this.phpConfigLocation = phpConfigLocation;
        return this;
    }
    public String getPhpConfigLocation() {
        return this.phpConfigLocation;
    }

    public DeployApplicationShrinkRequest setPostStart(String postStart) {
        this.postStart = postStart;
        return this;
    }
    public String getPostStart() {
        return this.postStart;
    }

    public DeployApplicationShrinkRequest setPreStop(String preStop) {
        this.preStop = preStop;
        return this;
    }
    public String getPreStop() {
        return this.preStop;
    }

    public DeployApplicationShrinkRequest setPvtzDiscoverySvc(String pvtzDiscoverySvc) {
        this.pvtzDiscoverySvc = pvtzDiscoverySvc;
        return this;
    }
    public String getPvtzDiscoverySvc() {
        return this.pvtzDiscoverySvc;
    }

    public DeployApplicationShrinkRequest setPython(String python) {
        this.python = python;
        return this;
    }
    public String getPython() {
        return this.python;
    }

    public DeployApplicationShrinkRequest setPythonModules(String pythonModules) {
        this.pythonModules = pythonModules;
        return this;
    }
    public String getPythonModules() {
        return this.pythonModules;
    }

    public DeployApplicationShrinkRequest setRaspConfigShrink(String raspConfigShrink) {
        this.raspConfigShrink = raspConfigShrink;
        return this;
    }
    public String getRaspConfigShrink() {
        return this.raspConfigShrink;
    }

    public DeployApplicationShrinkRequest setReadiness(String readiness) {
        this.readiness = readiness;
        return this;
    }
    public String getReadiness() {
        return this.readiness;
    }

    public DeployApplicationShrinkRequest setReplicas(Integer replicas) {
        this.replicas = replicas;
        return this;
    }
    public Integer getReplicas() {
        return this.replicas;
    }

    public DeployApplicationShrinkRequest setSecretMountDesc(String secretMountDesc) {
        this.secretMountDesc = secretMountDesc;
        return this;
    }
    public String getSecretMountDesc() {
        return this.secretMountDesc;
    }

    public DeployApplicationShrinkRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public DeployApplicationShrinkRequest setServiceTags(String serviceTags) {
        this.serviceTags = serviceTags;
        return this;
    }
    public String getServiceTags() {
        return this.serviceTags;
    }

    public DeployApplicationShrinkRequest setSidecarContainersConfigShrink(String sidecarContainersConfigShrink) {
        this.sidecarContainersConfigShrink = sidecarContainersConfigShrink;
        return this;
    }
    public String getSidecarContainersConfigShrink() {
        return this.sidecarContainersConfigShrink;
    }

    public DeployApplicationShrinkRequest setSlsConfigs(String slsConfigs) {
        this.slsConfigs = slsConfigs;
        return this;
    }
    public String getSlsConfigs() {
        return this.slsConfigs;
    }

    public DeployApplicationShrinkRequest setSlsLogEnvTags(String slsLogEnvTags) {
        this.slsLogEnvTags = slsLogEnvTags;
        return this;
    }
    public String getSlsLogEnvTags() {
        return this.slsLogEnvTags;
    }

    public DeployApplicationShrinkRequest setStartupProbe(String startupProbe) {
        this.startupProbe = startupProbe;
        return this;
    }
    public String getStartupProbe() {
        return this.startupProbe;
    }

    public DeployApplicationShrinkRequest setSwimlanePvtzDiscoverySvc(String swimlanePvtzDiscoverySvc) {
        this.swimlanePvtzDiscoverySvc = swimlanePvtzDiscoverySvc;
        return this;
    }
    public String getSwimlanePvtzDiscoverySvc() {
        return this.swimlanePvtzDiscoverySvc;
    }

    public DeployApplicationShrinkRequest setTerminationGracePeriodSeconds(Integer terminationGracePeriodSeconds) {
        this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
        return this;
    }
    public Integer getTerminationGracePeriodSeconds() {
        return this.terminationGracePeriodSeconds;
    }

    public DeployApplicationShrinkRequest setTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }
    public String getTimezone() {
        return this.timezone;
    }

    public DeployApplicationShrinkRequest setTomcatConfig(String tomcatConfig) {
        this.tomcatConfig = tomcatConfig;
        return this;
    }
    public String getTomcatConfig() {
        return this.tomcatConfig;
    }

    public DeployApplicationShrinkRequest setUpdateStrategy(String updateStrategy) {
        this.updateStrategy = updateStrategy;
        return this;
    }
    public String getUpdateStrategy() {
        return this.updateStrategy;
    }

    public DeployApplicationShrinkRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public DeployApplicationShrinkRequest setWarStartOptions(String warStartOptions) {
        this.warStartOptions = warStartOptions;
        return this;
    }
    public String getWarStartOptions() {
        return this.warStartOptions;
    }

    public DeployApplicationShrinkRequest setWebContainer(String webContainer) {
        this.webContainer = webContainer;
        return this;
    }
    public String getWebContainer() {
        return this.webContainer;
    }

}
