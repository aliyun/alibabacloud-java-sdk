// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class CreateTemplateRuntimeConfig extends TeaModel {
    /**
     * <p>The CPU specification of the sandboxed container instance, in cores.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("cpu")
    public Float cpu;

    /**
     * <p>The disk specification of the sandboxed container instance, in MB.</p>
     * 
     * <strong>example:</strong>
     * <p>10240</p>
     */
    @NameInMap("diskSize")
    public Integer diskSize;

    /**
     * <p>Specifies whether the sandboxed container instance is allowed to access the Internet.</p>
     */
    @NameInMap("internetAccess")
    public Boolean internetAccess;

    /**
     * <p>The log delivery configuration of the sandboxed container instance.</p>
     */
    @NameInMap("logConfig")
    public CreateTemplateLogConfig logConfig;

    /**
     * <p>The memory specification of the sandboxed container instance, in MB.</p>
     * 
     * <strong>example:</strong>
     * <p>2048</p>
     */
    @NameInMap("memorySize")
    public Integer memorySize;

    /**
     * <p>The image and startup configuration of the sandboxed container instance.</p>
     */
    @NameInMap("sandboxConfig")
    public CreateTemplateSandboxConfig sandboxConfig;

    /**
     * <p>The VPC configuration of the sandboxed container instance.</p>
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

    public CreateTemplateRuntimeConfig setVpcConfig(CreateTemplateVPCConfig vpcConfig) {
        this.vpcConfig = vpcConfig;
        return this;
    }
    public CreateTemplateVPCConfig getVpcConfig() {
        return this.vpcConfig;
    }

}
