// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class InnerCreateSandboxInput extends TeaModel {
    /**
     * <p>Specifies whether the sandbox is allowed to access external networks.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("allowInternetAccess")
    public Boolean allowInternetAccess;

    /**
     * <p>Specifies whether to automatically pause after timeout.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("autoPause")
    public Boolean autoPause;

    /**
     * <p>Specifies whether to automatically resume.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("autoResume")
    public Boolean autoResume;

    /**
     * <p>The environment variable configuration.</p>
     */
    @NameInMap("envVars")
    public java.util.Map<String, String> envVars;

    /**
     * <p>The metadata configuration.</p>
     */
    @NameInMap("metadata")
    public java.util.Map<String, String> metadata;

    /**
     * <p>The network configuration.</p>
     */
    @NameInMap("network")
    public E2BNetwork network;

    /**
     * <p>The runtime configuration.</p>
     */
    @NameInMap("runtime")
    public InnerSandboxRuntimeConfig runtime;

    /**
     * <p>Specifies whether authentication is required to access the sandbox envd.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("secure")
    public Boolean secure;

    /**
     * <p>The unique identifier of the team.</p>
     * 
     * <strong>example:</strong>
     * <p>76eeecaa-****</p>
     */
    @NameInMap("teamID")
    public String teamID;

    /**
     * <p>The unique identifier of the template.</p>
     * 
     * <strong>example:</strong>
     * <p>v9vjyzw64bsu83vw0dgs</p>
     */
    @NameInMap("templateID")
    public String templateID;

    /**
     * <p>The timeout period. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>180</p>
     */
    @NameInMap("timeout")
    public Integer timeout;

    /**
     * <p>The volume mount configuration.</p>
     */
    @NameInMap("volumeMounts")
    public InnerCreateSandboxVolumeMounts volumeMounts;

    public static InnerCreateSandboxInput build(java.util.Map<String, ?> map) throws Exception {
        InnerCreateSandboxInput self = new InnerCreateSandboxInput();
        return TeaModel.build(map, self);
    }

    public InnerCreateSandboxInput setAllowInternetAccess(Boolean allowInternetAccess) {
        this.allowInternetAccess = allowInternetAccess;
        return this;
    }
    public Boolean getAllowInternetAccess() {
        return this.allowInternetAccess;
    }

    public InnerCreateSandboxInput setAutoPause(Boolean autoPause) {
        this.autoPause = autoPause;
        return this;
    }
    public Boolean getAutoPause() {
        return this.autoPause;
    }

    public InnerCreateSandboxInput setAutoResume(Boolean autoResume) {
        this.autoResume = autoResume;
        return this;
    }
    public Boolean getAutoResume() {
        return this.autoResume;
    }

    public InnerCreateSandboxInput setEnvVars(java.util.Map<String, String> envVars) {
        this.envVars = envVars;
        return this;
    }
    public java.util.Map<String, String> getEnvVars() {
        return this.envVars;
    }

    public InnerCreateSandboxInput setMetadata(java.util.Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }
    public java.util.Map<String, String> getMetadata() {
        return this.metadata;
    }

    public InnerCreateSandboxInput setNetwork(E2BNetwork network) {
        this.network = network;
        return this;
    }
    public E2BNetwork getNetwork() {
        return this.network;
    }

    public InnerCreateSandboxInput setRuntime(InnerSandboxRuntimeConfig runtime) {
        this.runtime = runtime;
        return this;
    }
    public InnerSandboxRuntimeConfig getRuntime() {
        return this.runtime;
    }

    public InnerCreateSandboxInput setSecure(Boolean secure) {
        this.secure = secure;
        return this;
    }
    public Boolean getSecure() {
        return this.secure;
    }

    public InnerCreateSandboxInput setTeamID(String teamID) {
        this.teamID = teamID;
        return this;
    }
    public String getTeamID() {
        return this.teamID;
    }

    public InnerCreateSandboxInput setTemplateID(String templateID) {
        this.templateID = templateID;
        return this;
    }
    public String getTemplateID() {
        return this.templateID;
    }

    public InnerCreateSandboxInput setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

    public InnerCreateSandboxInput setVolumeMounts(InnerCreateSandboxVolumeMounts volumeMounts) {
        this.volumeMounts = volumeMounts;
        return this;
    }
    public InnerCreateSandboxVolumeMounts getVolumeMounts() {
        return this.volumeMounts;
    }

}
