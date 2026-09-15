// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class CreateTemplateSandboxConfig extends TeaModel {
    @NameInMap("acrInstanceId")
    public String acrInstanceId;

    @NameInMap("generation")
    public Integer generation;

    @NameInMap("image")
    public String image;

    @NameInMap("osType")
    public String osType;

    @NameInMap("readyCommand")
    public String readyCommand;

    @NameInMap("registryConfig")
    public CreateTemplateRegistryConfig registryConfig;

    @NameInMap("registryType")
    public String registryType;

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
