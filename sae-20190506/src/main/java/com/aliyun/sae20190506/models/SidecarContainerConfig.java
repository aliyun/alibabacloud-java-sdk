// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class SidecarContainerConfig extends TeaModel {
    /**
     * <p>The ID of the Container Registry ACR Enterprise instance. This parameter is required when ImageUrl is a Container Registry Enterprise instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cri-xxxxxx</p>
     */
    @NameInMap("AcrInstanceId")
    public String acrInstanceId;

    /**
     * <p>The image startup command.</p>
     * 
     * <strong>example:</strong>
     * <p>python</p>
     */
    @NameInMap("Command")
    public String command;

    /**
     * <p>The image startup command arguments.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;a&quot;,&quot;b&quot;]</p>
     */
    @NameInMap("CommandArgs")
    public String commandArgs;

    /**
     * <p>The ConfigMap mount description.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;configMapId&quot;:16,&quot;key&quot;:&quot;test&quot;,&quot;mountPath&quot;:&quot;/tmp&quot;}]</p>
     */
    @NameInMap("ConfigMapMountDesc")
    public String configMapMountDesc;

    /**
     * <p>Cpu</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("Cpu")
    public Integer cpu;

    /**
     * <p>The EmptyDir description.</p>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;name\&quot;:\&quot;workdir\&quot;,\&quot;mountPath\&quot;:\&quot;/usr/local/tomcat/webapps\&quot;}]</p>
     */
    @NameInMap("EmptyDirDesc")
    public String emptyDirDesc;

    /**
     * <p>The container environment variable parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;name&quot;:&quot;TEST_ENV_KEY&quot;,&quot;value&quot;:&quot;TEST_ENV_VAR&quot;}]</p>
     */
    @NameInMap("Envs")
    public String envs;

    /**
     * <p>The image URL.</p>
     * 
     * <strong>example:</strong>
     * <p>registry-vpc.cn-hangzhou.aliyuncs.com/demo/nginx:latest</p>
     */
    @NameInMap("ImageUrl")
    public String imageUrl;

    /**
     * <p>The liveness probe configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;exec&quot;:{&quot;command&quot;:[&quot;sh&quot;,&quot;-c&quot;,&quot;cat /home/admin/start.sh&quot;]},&quot;initialDelaySeconds&quot;:30,&quot;periodSeconds&quot;:30,&quot;timeoutSeconds&quot;:2}</p>
     */
    @NameInMap("Liveness")
    public String liveness;

    /**
     * <p>Memory</p>
     * 
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("Memory")
    public Integer memory;

    /**
     * <p>The container name.</p>
     * 
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The PostStart configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;exec&quot;:{&quot;command&quot;:[&quot;sh&quot;,&quot;-c&quot;,&quot;echo hello&quot;]}}</p>
     */
    @NameInMap("PostStart")
    public String postStart;

    /**
     * <p>The PreStop configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;exec&quot;:{&quot;command&quot;:[&quot;sh&quot;,&quot;-c&quot;,&quot;echo hello&quot;]}}</p>
     */
    @NameInMap("PreStop")
    public String preStop;

    /**
     * <p>The readiness probe configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;exec&quot;:{&quot;command&quot;:[&quot;sh&quot;,&quot;-c&quot;,&quot;cat /home/admin/start.sh&quot;]},&quot;initialDelaySeconds&quot;:30,&quot;periodSeconds&quot;:30,&quot;timeoutSeconds&quot;:2}</p>
     */
    @NameInMap("Readiness")
    public String readiness;

    /**
     * <p>The Secret mount description.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;secretId&quot;:10,&quot;key&quot;:&quot;test&quot;,&quot;mountPath&quot;:&quot;/tmp&quot;}]</p>
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
