// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DeployApplicationRequest extends TeaModel {
    /**
     * <p>The ARN of the RAM role required for cross-account image pulling. For more information, see <a href="https://help.aliyun.com/document_detail/223585.html">Grant permissions across Alibaba Cloud accounts by using a RAM role</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::123456789012****:role/adminrole</p>
     */
    @NameInMap("AcrAssumeRoleArn")
    public String acrAssumeRoleArn;

    /**
     * <p>The Container Registry Enterprise instance ID. This parameter is required when <strong>ImageUrl</strong> is set to a Container Registry Enterprise instance image.</p>
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
     * <p>The ALB gateway ReadinessGate configuration.</p>
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
     * <p>Specifies whether to automatically enable the application elastic scaling policy. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: enabled.</li>
     * <li><strong>false</strong>: disabled.</li>
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
     * <p>The image startup command. The command must be an executable object in the container. Example:</p>
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
     * <p>The arguments of the image startup command. These are the arguments required by the startup command specified in <strong>Command</strong>. Format:</p>
     * <p><code>[&quot;a&quot;,&quot;b&quot;]</code></p>
     * <p>In the preceding example, <code>CommandArgs=[&quot;abc&quot;, &quot;&gt;&quot;, &quot;file0&quot;]</code>, where <code>[&quot;abc&quot;, &quot;&gt;&quot;, &quot;file0&quot;]</code> must be converted to a String type, and the internal format is a JSON array. If this parameter is not required, leave it empty.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;a&quot;,&quot;b&quot;]</p>
     */
    @NameInMap("CommandArgs")
    public String commandArgs;

    /**
     * <p>The <strong>ConfigMap</strong> mount description. Use a ConfigMap created on the namespace configuration items page to inject configuration information into the container. Settings:</p>
     * <ul>
     * <li><strong>configMapId</strong>: the ConfigMap instance ID. You can obtain it by calling the <a href="https://help.aliyun.com/document_detail/176917.html">ListNamespacedConfigMaps</a> operation.</li>
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
     * <p>The CPU resources required for each instance. Unit: millicores. This parameter cannot be set to 0. Only the following defined specifications are supported:</p>
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
     * <p>This parameter takes effect only for applications in the stopped state. If you call the <strong>DeployApplication</strong> operation for a running application, the application is immediately redeployed.</p>
     * <ul>
     * <li><strong>true</strong>: default value. Deploys immediately, applies the new deployment configuration, and starts instances.</li>
     * <li><strong>false</strong>: applies the new deployment configuration only, without starting application instances.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Deploy")
    public String deploy;

    /**
     * <p>The version of the .NET framework: </p>
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
     * <p>Specifies whether to enable Application High Availability Service (AHAS). Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: enables AHAS.</li>
     * <li><strong>false</strong>: does not enable AHAS.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableAhas")
    public String enableAhas;

    /**
     * <p>Specifies whether to enable the CPU Burst feature:</p>
     * <ul>
     * <li>true: enabled.</li>
     * <li>false: disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableCpuBurst")
    public Boolean enableCpuBurst;

    /**
     * <p>Specifies whether to enable traffic canary release rules. This rule applies only to applications that use the Spring Cloud or Dubbo framework. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: enables canary release rules.</li>
     * <li><strong>false</strong>: disables canary release rules.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableGreyTagRoute")
    public Boolean enableGreyTagRoute;

    /**
     * <p>Specifies whether to reuse the namespace Agent version configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableNamespaceAgentVersion")
    public Boolean enableNamespaceAgentVersion;

    /**
     * <p>Specifies whether to enable the new ARMS feature:</p>
     * <ul>
     * <li>true: enabled.</li>
     * <li>false: disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableNewArms")
    public Boolean enableNewArms;

    /**
     * <p>Specifies whether to enable custom Prometheus metric collection.</p>
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
     * <li>false: does not enable isolation.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableSidecarResourceIsolated")
    public Boolean enableSidecarResourceIsolated;

    /**
     * <p>The container environment variable parameters. You can customize environment variables or reference ConfigMap items. To reference a ConfigMap item, create a ConfigMap instance first. For more information, see <a href="https://help.aliyun.com/document_detail/176914.html">CreateConfigMap</a>. Valid values:</p>
     * <ul>
     * <li>Custom configuration<ul>
     * <li><strong>name</strong>: the name of the environment variable.</li>
     * <li><strong>value</strong>: the value of the environment variable. This takes priority over valueFrom.</li>
     * </ul>
     * </li>
     * <li>Reference a ConfigMap item (valueFrom)<ul>
     * <li><strong>name</strong>: the name of the environment variable. To reference all keys, enter <code>sae-sys-configmap-all-&lt;ConfigMap name&gt;</code>, such as <code>sae-sys-configmap-all-test1</code>.</li>
     * <li><strong>valueFrom</strong>: the environment variable reference. Set the value to <code>configMapRef</code>.</li>
     * <li><strong>configMapId</strong>: the ConfigMap ID.</li>
     * <li><strong>key</strong>: the key. Do not set this field if you want to reference all keys.</li>
     * </ul>
     * </li>
     * <li>Reference a secret (valueFrom)<ul>
     * <li><strong>name</strong>: the name of the environment variable. To reference all keys, enter <code>sae-sys-secret-all-&lt;secret name&gt;</code>, such as <code>sae-sys-secret-all-test1</code>.</li>
     * <li><strong>valueFrom</strong>: the environment variable reference. Set the value to <code>secretRef</code>.</li>
     * <li><strong>secretId</strong>: the secret ID.</li>
     * <li><strong>key</strong>: the key. Do not set this field if you want to reference all keys.</li>
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
     * <p>The image URL. This parameter is required when <strong>Package Type</strong> is set to <strong>Image</strong>.</p>
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
     * <p>The startup arguments for a JAR package-based application. The default startup command is <code>$JAVA_HOME/bin/java $JarStartOptions -jar $CATALINA_OPTS &quot;$package_path&quot; $JarStartArgs</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>-Xms4G -Xmx4G</p>
     */
    @NameInMap("JarStartArgs")
    public String jarStartArgs;

    /**
     * <p>The startup options for a JAR package-based application. The default startup command is <code>$JAVA_HOME/bin/java $JarStartOptions -jar $CATALINA_OPTS &quot;$package_path&quot; $JarStartArgs</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>custom-option</p>
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
     * <li><strong>kafkaEndpoint</strong>: the endpoint of the Kafka API.</li>
     * <li><strong>kafkaInstanceId</strong>: the Kafka instance ID.</li>
     * <li><strong>kafkaConfigs</strong>: the configuration summary for one or more log entries. For example values and parameter descriptions, see the <strong>kafkaConfigs</strong> request parameter in this topic.</li>
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
     * <p>The container health check. Containers that fail the health check are shutdown and recovered. The following methods are supported:</p>
     * <ul>
     * <li><strong>exec</strong>: for example, <code>{&quot;exec&quot;:{&quot;command&quot;:[&quot;sh&quot;,&quot;-c&quot;,&quot;cat/home/admin/start.sh&quot;]},&quot;initialDelaySeconds&quot;:30,&quot;periodSeconds&quot;:30,&quot;timeoutSeconds&quot;:2}</code></li>
     * <li><strong>httpGet</strong>: for example, <code>{&quot;httpGet&quot;:{&quot;path&quot;:&quot;/&quot;,&quot;port&quot;:18091,&quot;scheme&quot;:&quot;HTTP&quot;,&quot;isContainKeyWord&quot;:true,&quot;keyWord&quot;:&quot;SAE&quot;},&quot;initialDelaySeconds&quot;:11,&quot;periodSeconds&quot;:10,&quot;timeoutSeconds&quot;:1}</code></li>
     * <li><strong>tcpSocket</strong>: for example, <code>{&quot;tcpSocket&quot;:{&quot;port&quot;:18091},&quot;initialDelaySeconds&quot;:11,&quot;periodSeconds&quot;:10,&quot;timeoutSeconds&quot;:1}</code></li>
     * </ul>
     * <blockquote>
     * <p>Only one method can be selected for health checks.</p>
     * </blockquote>
     * <p>Settings:</p>
     * <ul>
     * <li><strong>exec.command</strong>: sets the health check command.</li>
     * <li><strong>httpGet.path</strong>: the access path.</li>
     * <li><strong>httpGet.scheme</strong>: <strong>HTTP</strong> or <strong>HTTPS</strong>.</li>
     * <li><strong>httpGet.isContainKeyWord</strong>: <strong>true</strong> indicates that the keyword is included, <strong>false</strong> indicates that the keyword is not included, and the absence of this field indicates that the advanced feature is not used.</li>
     * <li><strong>httpGet.keyWord</strong>: the custom keyword. The <strong>isContainKeyWord</strong> field must be present when this parameter is used.</li>
     * <li><strong>tcpSocket.port</strong>: the port for TCP connection detection.</li>
     * <li><strong>initialDelaySeconds</strong>: sets the initial delay for the health check. Default value: 10. Unit: seconds.</li>
     * <li><strong>periodSeconds</strong>: sets the health check epoch. Default value: 30. Unit: seconds.</li>
     * <li><strong>timeoutSeconds</strong>: sets the health check timeout period. Default value: 1. Unit: seconds. If this parameter is set to 0 or is not set, the default timeout period is 1 second.</li>
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
     * <p>The maximum surge instance percentage. Valid values:</p>
     * <p>If the minimum number of available instances is 100%, the maximum surge cannot be set to 0. If this parameter is set to <strong>-1</strong>, the system-recommended value of 30% is used, which is 30% of the current number of instances. For example, if the current number of instances is 10, the value is 10 × 30% = 3.</p>
     * 
     * <strong>example:</strong>
     * <p>-1</p>
     */
    @NameInMap("MaxSurgeInstanceRatio")
    public Integer maxSurgeInstanceRatio;

    /**
     * <p>The maximum number of surge instances. Valid values:</p>
     * <p>If the minimum number of available instances is 100%, the maximum surge cannot be set to 0.
     * If this parameter is set to <strong>-1</strong>, the system-recommended value of 30% is used, which is 30% of the current number of instances. For example, if the current number of instances is 10, the value is 10 × 30% = 3.</p>
     * 
     * <strong>example:</strong>
     * <p>-1</p>
     */
    @NameInMap("MaxSurgeInstances")
    public Integer maxSurgeInstances;

    /**
     * <p>The memory required for each instance. Unit: MB. This parameter cannot be set to 0. The memory has a one-to-one mapping with CPU. Only the following defined specifications are supported:</p>
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
     * <li><strong>0</strong>: Serverless App Engine built-in Nacos.</li>
     * <li><strong>1</strong>: self-managed Nacos.</li>
     * <li><strong>2</strong>: Microservices Engine (MSE) commercial edition Nacos.</li>
     * </ul>
     * <blockquote>
     * <p>If you select Serverless App Engine built-in Nacos, you cannot obtain the configuration of the built-in Nacos.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>&quot;0&quot;</p>
     */
    @NameInMap("MicroRegistration")
    public String microRegistration;

    /**
     * <p>The registry configuration, which takes effect only when the registry type is MSE Nacos Enterprise Edition.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;instanceId\&quot;:\&quot;mse-cn-zvp2bh6h70r\&quot;,\&quot;namespace\&quot;:\&quot;4c0aa74f-57cb-423c-b6af-5d9f2d0e3dbd\&quot;}</p>
     */
    @NameInMap("MicroRegistrationConfig")
    public String microRegistrationConfig;

    /**
     * <p>Configures microservice governance.</p>
     * <ul>
     * <li><p>Specifies whether to enable microservice governance (enable):</p>
     * <ul>
     * <li><p>true: enabled.</p>
     * </li>
     * <li><p>false: disabled.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p>Configures lossless online/offline (mseLosslessRule):</p>
     * <ul>
     * <li><p>delayTime: the delay time.</p>
     * </li>
     * <li><p>enable: specifies whether to enable the lossless online feature. true indicates enabled, and false indicates disabled.</p>
     * </li>
     * <li><p>notice: specifies whether to enable the notification feature. true indicates enabled, and false indicates disabled.</p>
     * </li>
     * <li><p>warmupTime: the warm-up duration for low-traffic scenarios. Unit: seconds.</p>
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
     * <p>The minimum percentage of available instances. Valid values:</p>
     * <ul>
     * <li><strong>-1</strong>: the initialization value, which indicates that the percentage is not used.</li>
     * <li><strong>0~100</strong>: the unit is percentage, rounded up. For example, if this parameter is set to <strong>50</strong>% and the current number of instances is 5, the minimum number of available instances is 3.</li>
     * </ul>
     * <blockquote>
     * <p>When both <strong>MinReadyInstance</strong> and <strong>MinReadyInstanceRatio</strong> are specified and the value of <strong>MinReadyInstanceRatio</strong> is not <strong>-1</strong>, the <strong>MinReadyInstanceRatio</strong> parameter takes precedence. For example, if <strong>MinReadyInstances</strong> is set to <strong>5</strong> and <strong>MinReadyInstanceRatio</strong> is set to <strong>50</strong>, the value <strong>50</strong> is used to calculate the minimum number of available instances.</p>
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
     * <li>If this parameter is set to <strong>0</strong>, service is interrupted during the upgrade.</li>
     * <li>If this parameter is set to <strong>-1</strong>, the system-recommended value is used, which is 25% of the current number of instances. If the current number of instances is 5, 5 × 25% = 1.25, which is rounded up to 2.</li>
     * </ul>
     * <blockquote>
     * <p>The minimum number of available instances for each rolling deployment should be ≥ 1 to prevent service interruption.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MinReadyInstances")
    public Integer minReadyInstances;

    /**
     * <p>We do not recommend that you configure this field. Configure <strong>NasConfigs</strong> instead. The NAS mount description. If the configuration has not changed during deployment, you do not need to set this parameter (that is, the <strong>MountDesc</strong> field does not need to be included in the request). To clear the NAS configuration, set the value of this field to an empty string (that is, set the value of the <strong>MountDesc</strong> field to &quot;&quot; in the request).</p>
     * 
     * <strong>example:</strong>
     * <p>[{mountPath: &quot;/tmp&quot;, nasPath: &quot;/&quot;}]</p>
     */
    @NameInMap("MountDesc")
    public String mountDesc;

    /**
     * <p>We do not recommend that you configure this field. Configure <strong>NasConfigs</strong> instead. The mount point of the NAS file system in the VPC of the application. If the configuration has not changed during deployment, you do not need to set this parameter (that is, the <strong>MountHost</strong> field does not need to be included in the request). To clear the NAS configuration, set the value of this field to an empty string (that is, set the value of the <strong>MountHost</strong> field to &quot;&quot; in the request).</p>
     * 
     * <strong>example:</strong>
     * <p>10d3b4bc9****.com</p>
     */
    @NameInMap("MountHost")
    public String mountHost;

    /**
     * <p>The NAS mount configuration. Valid values:</p>
     * <ul>
     * <li><strong>mountPath</strong>: the container mount path.</li>
     * <li><strong>readOnly</strong>: set to <strong>false</strong> for read and write permission.</li>
     * <li><strong>nasId</strong>: the NAS ID.</li>
     * <li><strong>mountDomain</strong>: the container mount point address. For more information, see <a href="https://help.aliyun.com/document_detail/62626.html">DescribeMountTargets</a>.</li>
     * <li><strong>nasPath</strong>: the NAS relative file directory.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;mountPath&quot;:&quot;/test1&quot;,&quot;readOnly&quot;:false,&quot;nasId&quot;:&quot;nasId1&quot;,&quot;mountDomain&quot;:&quot;nasId1.cn-shenzhen.nas.aliyuncs.com&quot;,&quot;nasPath&quot;:&quot;/test1&quot;},{&quot;nasId&quot;:&quot;nasId2&quot;,&quot;mountDomain&quot;:&quot;nasId2.cn-shenzhen.nas.aliyuncs.com&quot;,&quot;readOnly&quot;:false,&quot;nasPath&quot;:&quot;/test2&quot;,&quot;mountPath&quot;:&quot;/test2&quot;}]</p>
     */
    @NameInMap("NasConfigs")
    public String nasConfigs;

    /**
     * <p>We do not recommend that you configure this field. Configure <strong>NasConfigs</strong> instead. The ID of the NAS file system. If the configuration has not changed during deployment, you do not need to set this parameter (that is, the <strong>NasId</strong> field does not need to be included in the request). To clear the NAS configuration, set the value of this field to an empty string (that is, set the value of the <strong>NasId</strong> field to &quot;&quot; in the request).</p>
     * 
     * <strong>example:</strong>
     * <p>10d3b4****</p>
     */
    @NameInMap("NasId")
    public String nasId;

    /**
     * <p>The application version:</p>
     * <ul>
     * <li>lite: lite edition.</li>
     * <li>std: standard edition.</li>
     * <li>pro: professional edition.</li>
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
     * <p>The OSS mount description. Parameter settings:</p>
     * <ul>
     * <li><strong>bucketName</strong>: the bucket name.</li>
     * <li><strong>bucketPath</strong>: the folder or object that you created in OSS. If the OSS mount folder does not exist, an exception is triggered.</li>
     * <li><strong>mountPath</strong>: the container path in Serverless App Engine. If the path already exists, it is an overwrite relationship. If the path does not exist, it is created.</li>
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
     * <p>The application package type. Valid values:</p>
     * <ul>
     * <li>When you deploy with Java, the following types are supported: <strong>FatJar</strong>, <strong>War</strong>, and <strong>Image</strong>.</li>
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
     * <li>When you deploy with Python, the following types are supported: <strong>PythonZip</strong> and <strong>Image</strong>.</li>
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
     * <p>The PHP version on which the deployment package depends. Not supported for images.</p>
     * 
     * <strong>example:</strong>
     * <p>PHP-FPM 7.0</p>
     */
    @NameInMap("Php")
    public String php;

    /**
     * <p>The mount path for PHP application monitoring. Ensure that the PHP server loads the configuration file from this path. You do not need to manage the configuration content because Serverless App Engine automatically renders the correct configuration file.</p>
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
     * <p>The mount path for the PHP application startup configuration. Ensure that the PHP server uses this configuration file for startup.</p>
     * 
     * <strong>example:</strong>
     * <p>/usr/local/etc/php/php.ini</p>
     */
    @NameInMap("PhpConfigLocation")
    public String phpConfigLocation;

    /**
     * <p>The script that is run after the container starts. A script is triggered immediately after the container is created. Format: <code>{&quot;exec&quot;:{&quot;command&quot;:[&quot;sh&quot;,&quot;-c&quot;,&quot;echo hello&quot;\\]}}</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;exec&quot;:{&quot;command&quot;:[&quot;sh&quot;,&quot;-c&quot;,&quot;echo hello&quot;]}}</p>
     */
    @NameInMap("PostStart")
    public String postStart;

    /**
     * <p>The script that is run before the container stops. A script is triggered before the container is deleted. Format: <code>{&quot;exec&quot;:{&quot;command&quot;:[&quot;sh&quot;,&quot;-c&quot;,&quot;echo hello&quot;\\]}}</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;exec&quot;:{&quot;command&quot;:[&quot;sh&quot;,&quot;-c&quot;,&quot;echo hello&quot;]}}</p>
     */
    @NameInMap("PreStop")
    public String preStop;

    /**
     * <p>Enables K8s Service-based service registration and discovery. Valid values:</p>
     * <ul>
     * <li><strong>portProtocols</strong>: the port and protocol. Valid port values: [1,65535]. Valid protocol values: <strong>TCP</strong> and <strong>UDP</strong>.</li>
     * <li><strong>portAndProtocol</strong>: the port and protocol. Valid port values: [1,65535]. Valid protocol values: <strong>TCP</strong> and <strong>UDP</strong>. <strong>portProtocols is recommended. If portProtocols is set, only portProtocols takes effect</strong>.</li>
     * <li><strong>enable</strong>: enables K8s Service-based service registration and discovery.</li>
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
     * <p>The custom installation module dependencies. By default, the dependencies defined in the requirements.txt file in the root folder are installed. If no dependencies are configured or custom packages are needed, you can specify the dependencies to install.</p>
     * 
     * <strong>example:</strong>
     * <p>Flask==2.0</p>
     */
    @NameInMap("PythonModules")
    public String pythonModules;

    @NameInMap("RaspConfig")
    public DeployApplicationRequestRaspConfig raspConfig;

    /**
     * <p>The application startup status check. Containers that fail multiple health checks are shut down and restarted. Containers that do not pass the health check do not receive SLB traffic. The <strong>exec</strong>, <strong>httpGet</strong>, and <strong>tcpSocket</strong> methods are supported. For specific examples, see the <strong>Liveness</strong> parameter.</p>
     * <blockquote>
     * <p>Only one method can be selected for health checks.</p>
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
     * <p>The <strong>Secret</strong> mount description. Use a secret created on the namespace secrets page to inject sensitive information into the container. Settings:</p>
     * <ul>
     * <li><strong>secretId</strong>: the secret instance ID. You can obtain it by calling the ListSecrets operation.</li>
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
    public java.util.List<SidecarContainerConfig> sidecarContainersConfig;

    /**
     * <p>The configuration for log collection to Simple Log Service.</p>
     * <ul>
     * <li>Use SLS resources automatically created by Serverless App Engine: <code>[{&quot;logDir&quot;:&quot;&quot;,&quot;logType&quot;:&quot;stdout&quot;},{&quot;logDir&quot;:&quot;/tmp/a.log&quot;}]</code>.</li>
     * <li>Use custom SLS resources: <code>[{&quot;projectName&quot;:&quot;test-sls&quot;,&quot;logType&quot;:&quot;stdout&quot;,&quot;logDir&quot;:&quot;&quot;,&quot;logstoreName&quot;:&quot;sae&quot;,&quot;logtailName&quot;:&quot;&quot;},{&quot;projectName&quot;:&quot;test&quot;,&quot;logDir&quot;:&quot;/tmp/a.log&quot;,&quot;logstoreName&quot;:&quot;sae&quot;,&quot;logtailName&quot;:&quot;&quot;}]</code>.</li>
     * </ul>
     * <p>Settings:</p>
     * <ul>
     * <li><strong>projectName</strong>: the name of the project in Simple Log Service.  </li>
     * <li><strong>logDir</strong>: the log path.</li>
     * <li><strong>logType</strong>: the log type. <strong>stdout</strong> indicates container standard output logs, and only one entry can be set. If this parameter is not set, file logs are collected.</li>
     * <li><strong>logstoreName</strong>: the name of the Logstore in Simple Log Service.</li>
     * <li><strong>logtailName</strong>: the name of the Logtail in Simple Log Service. If this parameter is not specified, a new Logtail is created by automatic creation.</li>
     * </ul>
     * <p>If the SLS collection configuration has not changed during multiple deployments, you do not need to set this parameter (that is, the <strong>SlsConfigs</strong> field does not need to be included in the request). If you no longer need the SLS collection feature, set the value of this field to an empty string (that is, set the value of the <strong>SlsConfigs</strong> field to &quot;&quot; in the request).</p>
     * <blockquote>
     * <p>A project that is automatically created with the application is deleted when the application is deleted. Therefore, do not select a project that is automatically created by Serverless App Engine when selecting an existing project.</p>
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
     * <li>Check failed: indicates that the application failed to start. An exception is reported and the application is automatically restarted.</li>
     * </ul>
     * <blockquote>
     * <p>This is the description content.</p>
     * <ul>
     * <li>The exec, httpGet, and tcpSocket methods are supported. For specific examples, see the Liveness parameter.</li>
     * <li>Only one method can be selected for health checks.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;exec&quot;:{&quot;command&quot;:[&quot;sh&quot;,&quot;-c&quot;,&quot;cat /home/admin/start.sh&quot;]},&quot;initialDelaySeconds&quot;:30,&quot;periodSeconds&quot;:30,&quot;timeoutSeconds&quot;:2}</p>
     */
    @NameInMap("StartupProbe")
    public String startupProbe;

    /**
     * <p>Configures K8s Service-based service registration and discovery with end-to-end canary release:</p>
     * <ul>
     * <li>enable: specifies whether to enable end-to-end canary release based on K8s Service.<ul>
     * <li>true: enabled.</li>
     * <li>false: disabled.</li>
     * </ul>
     * </li>
     * <li>namespaceId: the namespace ID.</li>
     * <li>portAndProtocol: the listening port and protocol. Format: {&quot;port:protocol type&quot;:&quot;container port&quot;}.</li>
     * <li>portProtocols: defines the service port and protocol.<ul>
     * <li>port: the port.</li>
     * <li>protocol: the protocol.</li>
     * <li>targetPort: the container port.</li>
     * </ul>
     * </li>
     * <li>pvtzDiscoveryName: the service discovery name.</li>
     * <li>serviceId: the service ID.</li>
     * <li>serviceName: the service name.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;enable\&quot;:\&quot;false\&quot;,\&quot;namespaceId\&quot;:\&quot;cn-beijing:test\&quot;,\&quot;portAndProtocol\&quot;:{\&quot;2000:TCP\&quot;:\&quot;18081\&quot;},\&quot;portProtocols\&quot;:[{\&quot;port\&quot;:2000,\&quot;protocol\&quot;:\&quot;TCP\&quot;,\&quot;targetPort\&quot;:18081}],\&quot;pvtzDiscoveryName\&quot;:\&quot;cn-beijing-1421801774382676\&quot;,\&quot;serviceId\&quot;:\&quot;3513\&quot;,\&quot;serviceName\&quot;:\&quot;demo-gray.test\&quot;}</p>
     */
    @NameInMap("SwimlanePvtzDiscoverySvc")
    public String swimlanePvtzDiscoverySvc;

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
     * <p>The Tomcat configuration. Set this parameter to &quot;&quot; or &quot;{}&quot; to delete the configuration. Valid values:</p>
     * <ul>
     * <li><strong>port</strong>: the port number. Valid values: 1024 to 65535. Ports smaller than 1024 require root permissions. Because the container is configured with admin permissions, specify a port greater than 1024. Default value: 8080.</li>
     * <li><strong>contextPath</strong>: the access path. Default value: root directory &quot;/&quot;.</li>
     * <li><strong>maxThreads</strong>: the connection pool size. Default value: 400.</li>
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
     * <p>The deployment policy. When the minimum number of available instances is 1, the value of the <strong>UpdateStrategy</strong> field is &quot;&quot;. When the minimum number of available instances is greater than 1, examples are as follows:</p>
     * <ul>
     * <li>Grayscale 1 instance + 2 subsequent batches + automatic batching + 1-minute batch interval: <code>{&quot;type&quot;:&quot;GrayBatchUpdate&quot;,&quot;batchUpdate&quot;:{&quot;batch&quot;:2,&quot;releaseType&quot;:&quot;auto&quot;,&quot;batchWaitTime&quot;:1},&quot;grayUpdate&quot;:{&quot;gray&quot;:1}}</code></li>
     * <li>Grayscale 1 instance + 2 subsequent batches + manual batching: <code>{&quot;type&quot;:&quot;GrayBatchUpdate&quot;,&quot;batchUpdate&quot;:{&quot;batch&quot;:2,&quot;releaseType&quot;:&quot;manual&quot;},&quot;grayUpdate&quot;:{&quot;gray&quot;:1}}</code></li>
     * <li>2 batches + automatic batching + 0-minute batch interval: <code>{&quot;type&quot;:&quot;BatchUpdate&quot;,&quot;batchUpdate&quot;:{&quot;batch&quot;:2,&quot;releaseType&quot;:&quot;auto&quot;,&quot;batchWaitTime&quot;:0}}</code></li>
     * </ul>
     * <p>Settings:</p>
     * <ul>
     * <li><p><strong>type</strong>: the publish policy type. Valid values: <strong>GrayBatchUpdate</strong> (grayscale publish) and <strong>BatchUpdate</strong> (batch publish).</p>
     * </li>
     * <li><p><strong>batchUpdate</strong>: the batch publish policy.</p>
     * <ul>
     * <li><strong>batch</strong>: the number of publish batches.</li>
     * <li><strong>releaseType</strong>: the processing method between batches. Valid values: <strong>auto</strong> (automatic) and <strong>manual</strong> (manual).</li>
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
     * <p>The vSwitch where the network interface controllers (NICs) of the application instance reside. The vSwitch must be in the specified VPC.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp12mw1f8k3jgygk9****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The startup command for deploying a WAR package-based application. The configuration procedure is the same as that for the startup command of an image-based deployment. For more information, see <a href="https://help.aliyun.com/document_detail/96677.html">Configure a startup command</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>CATALINA_OPTS=\&quot;$CATALINA_OPTS $Options\&quot; catalina.sh run</p>
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

    public DeployApplicationRequest setRaspConfig(DeployApplicationRequestRaspConfig raspConfig) {
        this.raspConfig = raspConfig;
        return this;
    }
    public DeployApplicationRequestRaspConfig getRaspConfig() {
        return this.raspConfig;
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

    public static class DeployApplicationRequestRaspConfig extends TeaModel {
        @NameInMap("EnableRasp")
        public Boolean enableRasp;

        @NameInMap("RaspAppKey")
        public String raspAppKey;

        @NameInMap("RaspAppName")
        public String raspAppName;

        public static DeployApplicationRequestRaspConfig build(java.util.Map<String, ?> map) throws Exception {
            DeployApplicationRequestRaspConfig self = new DeployApplicationRequestRaspConfig();
            return TeaModel.build(map, self);
        }

        public DeployApplicationRequestRaspConfig setEnableRasp(Boolean enableRasp) {
            this.enableRasp = enableRasp;
            return this;
        }
        public Boolean getEnableRasp() {
            return this.enableRasp;
        }

        public DeployApplicationRequestRaspConfig setRaspAppKey(String raspAppKey) {
            this.raspAppKey = raspAppKey;
            return this;
        }
        public String getRaspAppKey() {
            return this.raspAppKey;
        }

        public DeployApplicationRequestRaspConfig setRaspAppName(String raspAppName) {
            this.raspAppName = raspAppName;
            return this;
        }
        public String getRaspAppName() {
            return this.raspAppName;
        }

    }

}
