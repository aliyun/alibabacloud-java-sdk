// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class PublicUpdateTemplateRuntimeConfig extends TeaModel {
    @NameInMap("cpu")
    public Float cpu;

    @NameInMap("diskSize")
    public Integer diskSize;

    @NameInMap("internetAccess")
    public Boolean internetAccess;

    @NameInMap("logConfig")
    public PublicUpdateTemplateLogConfig logConfig;

    @NameInMap("memorySize")
    public Integer memorySize;

    @NameInMap("sandboxConfig")
    public PublicUpdateTemplateSandboxConfig sandboxConfig;

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

    public PublicUpdateTemplateRuntimeConfig setVpcConfig(PublicUpdateTemplateVPCConfig vpcConfig) {
        this.vpcConfig = vpcConfig;
        return this;
    }
    public PublicUpdateTemplateVPCConfig getVpcConfig() {
        return this.vpcConfig;
    }

}
