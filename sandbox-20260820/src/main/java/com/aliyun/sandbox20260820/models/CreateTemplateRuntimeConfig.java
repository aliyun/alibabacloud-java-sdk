// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class CreateTemplateRuntimeConfig extends TeaModel {
    /**
     * <p>The CPU specifications of the sandbox instance, in cores.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("cpu")
    public Float cpu;

    /**
     * <p>The disk specifications of the sandbox instance, in MB.</p>
     * 
     * <strong>example:</strong>
     * <p>10240</p>
     */
    @NameInMap("diskSize")
    public Integer diskSize;

    /**
     * <p>Specifies whether the sandbox instance is allowed to access the Internet.</p>
     */
    @NameInMap("internetAccess")
    public Boolean internetAccess;

    /**
     * <p>The log delivery configuration of the sandbox instance.</p>
     */
    @NameInMap("logConfig")
    public CreateTemplateLogConfig logConfig;

    /**
     * <p>The memory specifications of the sandbox instance, in MB.</p>
     * 
     * <strong>example:</strong>
     * <p>2048</p>
     */
    @NameInMap("memorySize")
    public Integer memorySize;

    /**
     * <p>The image and startup configuration of the sandbox instance.</p>
     */
    @NameInMap("sandboxConfig")
    public CreateTemplateSandboxConfig sandboxConfig;

    /**
     * <p>A non-empty array configures the set of source VPCs that are allowed to access the sandbox data endpoint. Omitting the field, setting it to null, or providing an empty array indicates that no inbound bindings are configured. This configuration is independent of the egress network vpcConfig and does not modify the API key source policy. A null value is treated as omitted to maintain compatibility with SDK requests where the field is not set. You can update or clear the list by calling UpdateTemplate. The changes take effect after a new version is successfully built, and existing sandboxes continue to use the original configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;vpc-examplea&quot;,&quot;vpc-exampleb&quot;]</p>
     */
    @NameInMap("vpcBindings")
    public java.util.List<String> vpcBindings;

    /**
     * <p>The VPC configuration of the sandbox instance.</p>
     */
    @NameInMap("vpcConfig")
    public CreateTemplateVPCConfig vpcConfig;

    public static CreateTemplateRuntimeConfig build(java.util.Map<String, ?> map) throws Exception {
        CreateTemplateRuntimeConfig self = new CreateTemplateRuntimeConfig();
        return TeaModel.build(map, self);
    }

    public CreateTemplateRuntimeConfig setCpu(Float cpu) {
        this.cpu = cpu;
        return this;
    }
    public Float getCpu() {
        return this.cpu;
    }

    public CreateTemplateRuntimeConfig setDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
        return this;
    }
    public Integer getDiskSize() {
        return this.diskSize;
    }

    public CreateTemplateRuntimeConfig setInternetAccess(Boolean internetAccess) {
        this.internetAccess = internetAccess;
        return this;
    }
    public Boolean getInternetAccess() {
        return this.internetAccess;
    }

    public CreateTemplateRuntimeConfig setLogConfig(CreateTemplateLogConfig logConfig) {
        this.logConfig = logConfig;
        return this;
    }
    public CreateTemplateLogConfig getLogConfig() {
        return this.logConfig;
    }

    public CreateTemplateRuntimeConfig setMemorySize(Integer memorySize) {
        this.memorySize = memorySize;
        return this;
    }
    public Integer getMemorySize() {
        return this.memorySize;
    }

    public CreateTemplateRuntimeConfig setSandboxConfig(CreateTemplateSandboxConfig sandboxConfig) {
        this.sandboxConfig = sandboxConfig;
        return this;
    }
    public CreateTemplateSandboxConfig getSandboxConfig() {
        return this.sandboxConfig;
    }

    public CreateTemplateRuntimeConfig setVpcBindings(java.util.List<String> vpcBindings) {
        this.vpcBindings = vpcBindings;
        return this;
    }
    public java.util.List<String> getVpcBindings() {
        return this.vpcBindings;
    }

    public CreateTemplateRuntimeConfig setVpcConfig(CreateTemplateVPCConfig vpcConfig) {
        this.vpcConfig = vpcConfig;
        return this;
    }
    public CreateTemplateVPCConfig getVpcConfig() {
        return this.vpcConfig;
    }

}
