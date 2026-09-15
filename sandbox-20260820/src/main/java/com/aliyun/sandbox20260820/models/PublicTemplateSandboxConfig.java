// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class PublicTemplateSandboxConfig extends TeaModel {
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
    public PublicTemplateRegistryConfig registryConfig;

    @NameInMap("startCommand")
    public String startCommand;

    public static PublicTemplateSandboxConfig build(java.util.Map<String, ?> map) throws Exception {
        PublicTemplateSandboxConfig self = new PublicTemplateSandboxConfig();
        return TeaModel.build(map, self);
    }

    public PublicTemplateSandboxConfig setAcrInstanceId(String acrInstanceId) {
        this.acrInstanceId = acrInstanceId;
        return this;
    }
    public String getAcrInstanceId() {
        return this.acrInstanceId;
    }

    public PublicTemplateSandboxConfig setGeneration(Integer generation) {
        this.generation = generation;
        return this;
    }
    public Integer getGeneration() {
        return this.generation;
    }

    public PublicTemplateSandboxConfig setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

    public PublicTemplateSandboxConfig setOsType(String osType) {
        this.osType = osType;
        return this;
    }
    public String getOsType() {
        return this.osType;
    }

    public PublicTemplateSandboxConfig setReadyCommand(String readyCommand) {
        this.readyCommand = readyCommand;
        return this;
    }
    public String getReadyCommand() {
        return this.readyCommand;
    }

    public PublicTemplateSandboxConfig setRegistryConfig(PublicTemplateRegistryConfig registryConfig) {
        this.registryConfig = registryConfig;
        return this;
    }
    public PublicTemplateRegistryConfig getRegistryConfig() {
        return this.registryConfig;
    }

    public PublicTemplateSandboxConfig setStartCommand(String startCommand) {
        this.startCommand = startCommand;
        return this;
    }
    public String getStartCommand() {
        return this.startCommand;
    }

}
