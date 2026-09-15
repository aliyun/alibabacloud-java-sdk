// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class PublicUpdateTemplateSandboxConfig extends TeaModel {
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
    public PublicUpdateTemplateRegistryConfig registryConfig;

    @NameInMap("registryType")
    public String registryType;

    @NameInMap("startCommand")
    public String startCommand;

    public static PublicUpdateTemplateSandboxConfig build(java.util.Map<String, ?> map) throws Exception {
        PublicUpdateTemplateSandboxConfig self = new PublicUpdateTemplateSandboxConfig();
        return TeaModel.build(map, self);
    }

    public PublicUpdateTemplateSandboxConfig setAcrInstanceId(String acrInstanceId) {
        this.acrInstanceId = acrInstanceId;
        return this;
    }
    public String getAcrInstanceId() {
        return this.acrInstanceId;
    }

    public PublicUpdateTemplateSandboxConfig setGeneration(Integer generation) {
        this.generation = generation;
        return this;
    }
    public Integer getGeneration() {
        return this.generation;
    }

    public PublicUpdateTemplateSandboxConfig setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

    public PublicUpdateTemplateSandboxConfig setOsType(String osType) {
        this.osType = osType;
        return this;
    }
    public String getOsType() {
        return this.osType;
    }

    public PublicUpdateTemplateSandboxConfig setReadyCommand(String readyCommand) {
        this.readyCommand = readyCommand;
        return this;
    }
    public String getReadyCommand() {
        return this.readyCommand;
    }

    public PublicUpdateTemplateSandboxConfig setRegistryConfig(PublicUpdateTemplateRegistryConfig registryConfig) {
        this.registryConfig = registryConfig;
        return this;
    }
    public PublicUpdateTemplateRegistryConfig getRegistryConfig() {
        return this.registryConfig;
    }

    public PublicUpdateTemplateSandboxConfig setRegistryType(String registryType) {
        this.registryType = registryType;
        return this;
    }
    public String getRegistryType() {
        return this.registryType;
    }

    public PublicUpdateTemplateSandboxConfig setStartCommand(String startCommand) {
        this.startCommand = startCommand;
        return this;
    }
    public String getStartCommand() {
        return this.startCommand;
    }

}
