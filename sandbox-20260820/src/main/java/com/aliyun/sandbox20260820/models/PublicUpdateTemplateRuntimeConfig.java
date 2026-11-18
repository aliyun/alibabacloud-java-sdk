// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class PublicUpdateTemplateRuntimeConfig extends TeaModel {
    /**
     * <p>The number of vCPU cores.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("cpu")
    public Float cpu;

    /**
     * <p>The system cloud disk size in MB.</p>
     * 
     * <strong>example:</strong>
     * <p>512</p>
     */
    @NameInMap("diskSize")
    public Integer diskSize;

    /**
     * <p>Specifies whether the sandbox is allowed to access the Internet.</p>
     */
    @NameInMap("internetAccess")
    public Boolean internetAccess;

    /**
     * <p>The log configuration.</p>
     */
    @NameInMap("logConfig")
    public PublicUpdateTemplateLogConfig logConfig;

    /**
     * <p>The memory size in MB.</p>
     * 
     * <strong>example:</strong>
     * <p>2048</p>
     */
    @NameInMap("memorySize")
    public Integer memorySize;

    /**
     * <p>The sandbox configuration.</p>
     */
    @NameInMap("sandboxConfig")
    public PublicUpdateTemplateSandboxConfig sandboxConfig;

    /**
     * <p>If omitted or set to null, the original list is retained. A non-empty array replaces the entire allowed set. An explicit empty array [] clears the inbound VPC restrictions for the new version. This field is independent of vpcConfig. An empty request body {}, an empty runtimeConfig, or a runtimeConfig that contains only vpcBindings: null returns a 400 error and does not clear the bindings. The actual JSON received by the server prevails. An empty array omitted by the SDK cannot clear the list.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;vpc-examplea&quot;,&quot;vpc-exampleb&quot;]</p>
     */
    @NameInMap("vpcBindings")
    public java.util.List<String> vpcBindings;

    /**
     * <p>The VPC network configuration.</p>
     */
    @NameInMap("vpcConfig")
    public PublicUpdateTemplateVPCConfig vpcConfig;

    public static PublicUpdateTemplateRuntimeConfig build(java.util.Map<String, ?> map) throws Exception {
        PublicUpdateTemplateRuntimeConfig self = new PublicUpdateTemplateRuntimeConfig();
        return TeaModel.build(map, self);
    }

    public PublicUpdateTemplateRuntimeConfig setCpu(Float cpu) {
        this.cpu = cpu;
        return this;
    }
    public Float getCpu() {
        return this.cpu;
    }

    public PublicUpdateTemplateRuntimeConfig setDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
        return this;
    }
    public Integer getDiskSize() {
        return this.diskSize;
    }

    public PublicUpdateTemplateRuntimeConfig setInternetAccess(Boolean internetAccess) {
        this.internetAccess = internetAccess;
        return this;
    }
    public Boolean getInternetAccess() {
        return this.internetAccess;
    }

    public PublicUpdateTemplateRuntimeConfig setLogConfig(PublicUpdateTemplateLogConfig logConfig) {
        this.logConfig = logConfig;
        return this;
    }
    public PublicUpdateTemplateLogConfig getLogConfig() {
        return this.logConfig;
    }

    public PublicUpdateTemplateRuntimeConfig setMemorySize(Integer memorySize) {
        this.memorySize = memorySize;
        return this;
    }
    public Integer getMemorySize() {
        return this.memorySize;
    }

    public PublicUpdateTemplateRuntimeConfig setSandboxConfig(PublicUpdateTemplateSandboxConfig sandboxConfig) {
        this.sandboxConfig = sandboxConfig;
        return this;
    }
    public PublicUpdateTemplateSandboxConfig getSandboxConfig() {
        return this.sandboxConfig;
    }

    public PublicUpdateTemplateRuntimeConfig setVpcBindings(java.util.List<String> vpcBindings) {
        this.vpcBindings = vpcBindings;
        return this;
    }
    public java.util.List<String> getVpcBindings() {
        return this.vpcBindings;
    }

    public PublicUpdateTemplateRuntimeConfig setVpcConfig(PublicUpdateTemplateVPCConfig vpcConfig) {
        this.vpcConfig = vpcConfig;
        return this;
    }
    public PublicUpdateTemplateVPCConfig getVpcConfig() {
        return this.vpcConfig;
    }

}
