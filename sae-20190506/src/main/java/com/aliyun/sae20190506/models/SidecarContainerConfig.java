// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class SidecarContainerConfig extends TeaModel {
    /**
     * <p>The instance ID of the ACR Enterprise Edition. This parameter is required if the <code>ImageUrl</code> is from an ACR Enterprise Edition repository.</p>
     * 
     * <strong>example:</strong>
     * <p>cri-xxxxxx</p>
     */
    @NameInMap("AcrInstanceId")
    public String acrInstanceId;

    /**
     * <p>The startup command for the image. This command overrides the <code>ENTRYPOINT</code> defined in the image.</p>
     * 
     * <strong>example:</strong>
     * <p>python</p>
     */
    @NameInMap("Command")
    public String command;

    /**
     * <p>The arguments for the startup command. This parameter corresponds to <code>CMD</code> in the Dockerfile.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;a&quot;,&quot;b&quot;]</p>
     */
    @NameInMap("CommandArgs")
    public String commandArgs;

    /**
     * <p>The settings for mounting a ConfigMap. Use this to inject configuration data into the container as files.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;configMapId&quot;:16,&quot;key&quot;:&quot;test&quot;,&quot;mountPath&quot;:&quot;/tmp&quot;}]</p>
     */
    @NameInMap("ConfigMapMountDesc")
    public String configMapMountDesc;

    /**
     * <p>The CPU resources allocated to the container, measured in millicores. For example, a value of 1000 represents 1 vCPU.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("Cpu")
    public Integer cpu;

    /**
     * <p>The configuration for an <code>emptyDir</code> volume. This creates a temporary directory that persists for the life of the application instance.</p>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;name\&quot;:\&quot;workdir\&quot;,\&quot;mountPath\&quot;:\&quot;/usr/local/tomcat/webapps\&quot;}]</p>
     */
    @NameInMap("EmptyDirDesc")
    public String emptyDirDesc;

    /**
     * <p>The environment variables to set in the container. Specify the variables as a JSON array of key-value pairs.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;name&quot;:&quot;TEST_ENV_KEY&quot;,&quot;value&quot;:&quot;TEST_ENV_VAR&quot;}]</p>
     */
    @NameInMap("Envs")
    public String envs;

    /**
     * <p>The container image URL.</p>
     * 
     * <strong>example:</strong>
     * <p>registry-vpc.cn-hangzhou.aliyuncs.com/demo/nginx:latest</p>
     */
    @NameInMap("ImageUrl")
    public String imageUrl;

    /**
     * <p>The configuration for the liveness probe. The liveness probe checks if the container is running. If the probe fails, the system restarts the container.</p>
     */
    @NameInMap("Liveness")
    public String liveness;

    /**
     * <p>The amount of memory allocated to the container, measured in MB.</p>
     * 
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("Memory")
    public Integer memory;

    /**
     * <p>The name of the container.</p>
     * 
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The configuration for the postStart hook. This hook runs immediately after the container starts to perform initialization tasks.</p>
     */
    @NameInMap("PostStart")
    public String postStart;

    /**
     * <p>The configuration for the preStop hook. This hook runs immediately before the container is terminated to ensure a graceful shutdown.</p>
     */
    @NameInMap("PreStop")
    public String preStop;

    /**
     * <p>The configuration for the readiness probe. The readiness probe checks if the container is ready to handle requests. The system will not direct traffic to a container until its readiness probe succeeds.</p>
     */
    @NameInMap("Readiness")
    public String readiness;

    /**
     * <p>Specifies how to mount a Secret. This lets you securely use sensitive data, such as credentials or keys, in your application.</p>
     */
    @NameInMap("SecretMountDesc")
    public String secretMountDesc;

    public static SidecarContainerConfig build(java.util.Map<String, ?> map) throws Exception {
        SidecarContainerConfig self = new SidecarContainerConfig();
        return TeaModel.build(map, self);
    }

    public SidecarContainerConfig setAcrInstanceId(String acrInstanceId) {
        this.acrInstanceId = acrInstanceId;
        return this;
    }
    public String getAcrInstanceId() {
        return this.acrInstanceId;
    }

    public SidecarContainerConfig setCommand(String command) {
        this.command = command;
        return this;
    }
    public String getCommand() {
        return this.command;
    }

    public SidecarContainerConfig setCommandArgs(String commandArgs) {
        this.commandArgs = commandArgs;
        return this;
    }
    public String getCommandArgs() {
        return this.commandArgs;
    }

    public SidecarContainerConfig setConfigMapMountDesc(String configMapMountDesc) {
        this.configMapMountDesc = configMapMountDesc;
        return this;
    }
    public String getConfigMapMountDesc() {
        return this.configMapMountDesc;
    }

    public SidecarContainerConfig setCpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }
    public Integer getCpu() {
        return this.cpu;
    }

    public SidecarContainerConfig setEmptyDirDesc(String emptyDirDesc) {
        this.emptyDirDesc = emptyDirDesc;
        return this;
    }
    public String getEmptyDirDesc() {
        return this.emptyDirDesc;
    }

    public SidecarContainerConfig setEnvs(String envs) {
        this.envs = envs;
        return this;
    }
    public String getEnvs() {
        return this.envs;
    }

    public SidecarContainerConfig setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public SidecarContainerConfig setLiveness(String liveness) {
        this.liveness = liveness;
        return this;
    }
    public String getLiveness() {
        return this.liveness;
    }

    public SidecarContainerConfig setMemory(Integer memory) {
        this.memory = memory;
        return this;
    }
    public Integer getMemory() {
        return this.memory;
    }

    public SidecarContainerConfig setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SidecarContainerConfig setPostStart(String postStart) {
        this.postStart = postStart;
        return this;
    }
    public String getPostStart() {
        return this.postStart;
    }

    public SidecarContainerConfig setPreStop(String preStop) {
        this.preStop = preStop;
        return this;
    }
    public String getPreStop() {
        return this.preStop;
    }

    public SidecarContainerConfig setReadiness(String readiness) {
        this.readiness = readiness;
        return this;
    }
    public String getReadiness() {
        return this.readiness;
    }

    public SidecarContainerConfig setSecretMountDesc(String secretMountDesc) {
        this.secretMountDesc = secretMountDesc;
        return this;
    }
    public String getSecretMountDesc() {
        return this.secretMountDesc;
    }

}
