// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class CreateTemplateSandboxConfig extends TeaModel {
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
     * <p>The sandbox readiness probe command. A successful execution indicates that the sandbox is ready to accept requests. This parameter is supported only for first-generation sandboxes.</p>
     * 
     * <strong>example:</strong>
     * <p>curl -sf <a href="http://127.0.0.1:49983/health">http://127.0.0.1:49983/health</a></p>
     */
    @NameInMap("readyCommand")
    public String readyCommand;

    /**
     * <p>The credential, TLS, and network configuration required to access the source image repository.</p>
     */
    @NameInMap("registryConfig")
    public CreateTemplateRegistryConfig registryConfig;

    /**
     * <p>The image repository type. Valid values: oci (standard OCI repository), acr (Container Registry Personal Edition), and acree (Container Registry Enterprise Edition). If not specified, the type is inferred from the image address.</p>
     * 
     * <strong>example:</strong>
     * <p>acree</p>
     */
    @NameInMap("registryType")
    public String registryType;

    /**
     * <p>The startup command for the sandbox container. This parameter is supported only for first-generation sandboxes.</p>
     * 
     * <strong>example:</strong>
     * <p>/usr/local/bin/start.sh</p>
     */
    @NameInMap("startCommand")
    public String startCommand;

    /**
     * <p>The list of custom build instructions. This is not supported in the current version. Passing a non-empty list returns an error.</p>
     */
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
