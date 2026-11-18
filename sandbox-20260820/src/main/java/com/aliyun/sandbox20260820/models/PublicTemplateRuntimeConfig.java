// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class PublicTemplateRuntimeConfig extends TeaModel {
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
    public PublicTemplateLogConfig logConfig;

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
    public PublicTemplateSandboxConfig sandboxConfig;

    /**
     * <p>The collection of inbound source VPCs allowed by the current template configuration. Omitting this field or providing an empty array indicates that no inbound VPC bindings are configured. This configuration is independent of the egress network vpcConfig. Subsequent template updates do not change the inbound VPC bindings of existing sandbox instances.</p>
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
    public PublicTemplateVPCConfig vpcConfig;

    public static PublicTemplateRuntimeConfig build(java.util.Map<String, ?> map) throws Exception {
        PublicTemplateRuntimeConfig self = new PublicTemplateRuntimeConfig();
        return TeaModel.build(map, self);
    }

    public PublicTemplateRuntimeConfig setCpu(Float cpu) {
        this.cpu = cpu;
        return this;
    }
    public Float getCpu() {
        return this.cpu;
    }

    public PublicTemplateRuntimeConfig setDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
        return this;
    }
    public Integer getDiskSize() {
        return this.diskSize;
    }

    public PublicTemplateRuntimeConfig setInternetAccess(Boolean internetAccess) {
        this.internetAccess = internetAccess;
        return this;
    }
    public Boolean getInternetAccess() {
        return this.internetAccess;
    }

    public PublicTemplateRuntimeConfig setLogConfig(PublicTemplateLogConfig logConfig) {
        this.logConfig = logConfig;
        return this;
    }
    public PublicTemplateLogConfig getLogConfig() {
        return this.logConfig;
    }

    public PublicTemplateRuntimeConfig setMemorySize(Integer memorySize) {
        this.memorySize = memorySize;
        return this;
    }
    public Integer getMemorySize() {
        return this.memorySize;
    }

    public PublicTemplateRuntimeConfig setSandboxConfig(PublicTemplateSandboxConfig sandboxConfig) {
        this.sandboxConfig = sandboxConfig;
        return this;
    }
    public PublicTemplateSandboxConfig getSandboxConfig() {
        return this.sandboxConfig;
    }

    public PublicTemplateRuntimeConfig setVpcBindings(java.util.List<String> vpcBindings) {
        this.vpcBindings = vpcBindings;
        return this;
    }
    public java.util.List<String> getVpcBindings() {
        return this.vpcBindings;
    }

    public PublicTemplateRuntimeConfig setVpcConfig(PublicTemplateVPCConfig vpcConfig) {
        this.vpcConfig = vpcConfig;
        return this;
    }
    public PublicTemplateVPCConfig getVpcConfig() {
        return this.vpcConfig;
    }

}
