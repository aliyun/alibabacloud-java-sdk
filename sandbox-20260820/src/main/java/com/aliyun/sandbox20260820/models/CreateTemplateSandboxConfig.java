// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class CreateTemplateSandboxConfig extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cri-****</p>
     */
    @NameInMap("acrInstanceId")
    public String acrInstanceId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("generation")
    public Integer generation;

    /**
     * <strong>example:</strong>
     * <p>registry-vpc.cn-hangzhou.aliyuncs.com/sandbox-demo/python:3.12</p>
     */
    @NameInMap("image")
    public String image;

    /**
     * <strong>example:</strong>
     * <p>linux-amd64</p>
     */
    @NameInMap("osType")
    public String osType;

    /**
     * <strong>example:</strong>
     * <p>curl -sf <a href="http://127.0.0.1:49983/health">http://127.0.0.1:49983/health</a></p>
     */
    @NameInMap("readyCommand")
    public String readyCommand;

    @NameInMap("registryConfig")
    public CreateTemplateRegistryConfig registryConfig;

    /**
     * <strong>example:</strong>
     * <p>acree</p>
     */
    @NameInMap("registryType")
    public String registryType;

    /**
     * <strong>example:</strong>
     * <p>/usr/local/bin/start.sh</p>
     */
    @NameInMap("startCommand")
    public String startCommand;

    @NameInMap("steps")
    public java.util.List<CreateTemplateStep> steps;

    public static CreateTemplateSandboxConfig build(java.util.Map<String, ?> map) throws Exception {
        CreateTemplateSandboxConfig self = new CreateTemplateSandboxConfig();
        return TeaModel.build(map, self);
    }

    public CreateTemplateSandboxConfig setAcrInstanceId(String acrInstanceId) {
        this.acrInstanceId = acrInstanceId;
        return this;
    }
    public String getAcrInstanceId() {
        return this.acrInstanceId;
    }

    public CreateTemplateSandboxConfig setGeneration(Integer generation) {
        this.generation = generation;
        return this;
    }
    public Integer getGeneration() {
        return this.generation;
    }

    public CreateTemplateSandboxConfig setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

    public CreateTemplateSandboxConfig setOsType(String osType) {
        this.osType = osType;
        return this;
    }
    public String getOsType() {
        return this.osType;
    }

    public CreateTemplateSandboxConfig setReadyCommand(String readyCommand) {
        this.readyCommand = readyCommand;
        return this;
    }
    public String getReadyCommand() {
        return this.readyCommand;
    }

    public CreateTemplateSandboxConfig setRegistryConfig(CreateTemplateRegistryConfig registryConfig) {
        this.registryConfig = registryConfig;
        return this;
    }
    public CreateTemplateRegistryConfig getRegistryConfig() {
        return this.registryConfig;
    }

    public CreateTemplateSandboxConfig setRegistryType(String registryType) {
        this.registryType = registryType;
        return this;
    }
    public String getRegistryType() {
        return this.registryType;
    }

    public CreateTemplateSandboxConfig setStartCommand(String startCommand) {
        this.startCommand = startCommand;
        return this;
    }
    public String getStartCommand() {
        return this.startCommand;
    }

    public CreateTemplateSandboxConfig setSteps(java.util.List<CreateTemplateStep> steps) {
        this.steps = steps;
        return this;
    }
    public java.util.List<CreateTemplateStep> getSteps() {
        return this.steps;
    }

}
