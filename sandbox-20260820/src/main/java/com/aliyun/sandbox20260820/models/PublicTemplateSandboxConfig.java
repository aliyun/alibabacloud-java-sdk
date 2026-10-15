// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class PublicTemplateSandboxConfig extends TeaModel {
    /**
     * <p>The ID of the Container Registry Enterprise instance. This parameter is required when registryType is set to acree.</p>
     * 
     * <strong>example:</strong>
     * <p>cri-****</p>
     */
    @NameInMap("acrInstanceId")
    public String acrInstanceId;

    /**
     * <p>The sandbox generation. Valid values: 1 (first generation) and 2 (second generation). Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("generation")
    public Integer generation;

    /**
     * <p>The address of the sandbox base image.</p>
     * 
     * <strong>example:</strong>
     * <p>registry-vpc.cn-hangzhou.aliyuncs.com/sandbox-demo/python:3.12</p>
     */
    @NameInMap("image")
    public String image;

    /**
     * <p>The operating system type of the second-generation sandbox. Valid values: linux-amd64, android-36-osworld, and windows-osworld.</p>
     * 
     * <strong>example:</strong>
     * <p>linux-amd64</p>
     */
    @NameInMap("osType")
    public String osType;

    /**
     * <p>The readiness probe command for the sandbox. A successful execution indicates that the sandbox is ready to receive requests. This parameter is supported only by first-generation sandboxes.</p>
     * 
     * <strong>example:</strong>
     * <p>curl -sf <a href="http://127.0.0.1:49983/health">http://127.0.0.1:49983/health</a></p>
     */
    @NameInMap("readyCommand")
    public String readyCommand;

    /**
     * <p>The configuration used to access the image repository. For security reasons, only the network configuration is returned in query responses, and logon credentials are not returned.</p>
     */
    @NameInMap("registryConfig")
    public PublicTemplateRegistryConfig registryConfig;

    /**
     * <p>The startup command for the sandbox container. This parameter is supported only by first-generation sandboxes.</p>
     * 
     * <strong>example:</strong>
     * <p>/usr/local/bin/start.sh</p>
     */
    @NameInMap("startCommand")
    public String startCommand;

    /**
     * <p>The list of custom build steps.</p>
     */
    @NameInMap("steps")
    public java.util.List<PublicTemplateStep> steps;

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

    public PublicTemplateSandboxConfig setSteps(java.util.List<PublicTemplateStep> steps) {
        this.steps = steps;
        return this;
    }
    public java.util.List<PublicTemplateStep> getSteps() {
        return this.steps;
    }

}
