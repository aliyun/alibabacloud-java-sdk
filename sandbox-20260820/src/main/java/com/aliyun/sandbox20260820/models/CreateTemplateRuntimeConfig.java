// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class CreateTemplateRuntimeConfig extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("cpu")
    public Float cpu;

    /**
     * <strong>example:</strong>
     * <p>10240</p>
     */
    @NameInMap("diskSize")
    public Integer diskSize;

    @NameInMap("internetAccess")
    public Boolean internetAccess;

    @NameInMap("logConfig")
    public CreateTemplateLogConfig logConfig;

    /**
     * <strong>example:</strong>
     * <p>2048</p>
     */
    @NameInMap("memorySize")
    public Integer memorySize;

    @NameInMap("sandboxConfig")
    public CreateTemplateSandboxConfig sandboxConfig;

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
